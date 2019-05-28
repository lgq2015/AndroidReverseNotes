package com.tencent.mm.ui.base;

import android.support.v4.view.p;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public abstract class u extends p {
    public Queue<View> yyJ = new LinkedList();
    public HashMap<Object, Integer> yyK = new HashMap();
    public SparseArray<Object> yyL = new SparseArray();

    public abstract Object c(int i, View view);

    public abstract MultiTouchImageView wx(int i);

    public abstract WxImageView wy(int i);

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        long currentTimeMillis = System.currentTimeMillis();
        View view = null;
        if (this.yyJ.size() > 0) {
            view = (View) this.yyJ.poll();
        }
        Object c = c(i, view);
        ab.i("MicroMsg.MMViewPagerAdapter", "instantiateItem object %s, parent %s position:%s", Integer.valueOf(c.hashCode()), ((View) c).getParent(), Integer.valueOf(i));
        this.yyK.put(c, Integer.valueOf(i));
        this.yyL.put(i, c);
        if (((View) c).getParent() == null) {
            viewGroup.addView((View) c);
        }
        ab.i("MicroMsg.MMViewPagerAdapter", "instantiateItem spent : %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return c;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        ab.d("MicroMsg.MMViewPagerAdapter", "destroyItem position %s", Integer.valueOf(i));
        ab.i("MicroMsg.MMViewPagerAdapter", "destroyItem object %s", Integer.valueOf(obj.hashCode()));
        this.yyJ.add((View) obj);
        this.yyK.remove(obj);
        this.yyL.remove(i);
    }

    public int getItemPosition(Object obj) {
        if (this.yyK.containsKey(obj)) {
            return ((Integer) this.yyK.get(obj)).intValue();
        }
        return -2;
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public final View Fp(int i) {
        Object obj = this.yyL.get(i);
        if (obj != null) {
            return (View) obj;
        }
        return null;
    }

    public final void reset() {
        this.yyJ.clear();
        this.yyK.clear();
        this.yyL.clear();
    }

    public int firstItemPosForDetermine() {
        return -1;
    }

    public int lastItemPosForDetermine() {
        return -1;
    }

    public void detach() {
        reset();
    }
}
