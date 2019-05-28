package com.tencent.p177mm.plugin.voip.video;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p208bz.C1338a;
import com.tencent.p177mm.p612ui.base.C23639t;
import com.tencent.p177mm.plugin.report.service.C7060h;
import com.tencent.p177mm.sdk.platformtools.C4990ab;

/* renamed from: com.tencent.mm.plugin.voip.video.MovableVideoView */
public class MovableVideoView extends OpenGlView {
    private float cjG;
    private float cjH;
    private OnClickListener mOnClickListener;
    private int mScreenHeight;
    public int mScreenWidth;
    public int mWidth;
    public int sZX;
    private int taq;
    private int tar;
    private long tas;

    public MovableVideoView(Context context) {
        this(context, null);
    }

    public MovableVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mWidth = 320;
        this.sZX = 240;
        this.taq = 800;
        this.tar = 480;
        this.mScreenWidth = 0;
        this.mScreenHeight = 0;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i = 0;
        AppMethodBeat.m2504i(5065);
        C4990ab.m7410d("MicroMsg.MovableVideoView", "event: " + motionEvent.getAction());
        switch (motionEvent.getAction()) {
            case 0:
                this.cjG = motionEvent.getRawX();
                this.cjH = motionEvent.getRawY();
                this.tas = System.currentTimeMillis();
                break;
            case 1:
                long currentTimeMillis = System.currentTimeMillis();
                if (this.tas != 0 && currentTimeMillis - this.tas < 300 && currentTimeMillis - this.tas >= 0 && this.mOnClickListener != null) {
                    this.mOnClickListener.onClick(this);
                }
                C7060h.pYm.mo8381e(11079, Integer.valueOf(2));
                break;
            case 2:
                float rawX = motionEvent.getRawX() - this.cjG;
                float rawY = motionEvent.getRawY() - this.cjH;
                if (Math.abs(rawX) > 1.0f || Math.abs(rawY) > 1.0f) {
                    LayoutParams layoutParams = (LayoutParams) getLayoutParams();
                    int i2 = (int) (rawX + ((float) layoutParams.leftMargin));
                    int i3 = (int) (rawY + ((float) layoutParams.topMargin));
                    if (i2 < 0) {
                        i2 = 0;
                    } else if (i2 > this.tar) {
                        i2 = this.tar;
                    }
                    layoutParams.leftMargin = i2;
                    if (i3 >= 0) {
                        i = i3 > this.taq ? this.taq : i3;
                    }
                    layoutParams.topMargin = i;
                    setLayoutParams(layoutParams);
                    this.cjG = motionEvent.getRawX();
                    this.cjH = motionEvent.getRawY();
                    break;
                }
        }
        AppMethodBeat.m2505o(5065);
        return true;
    }

    /* renamed from: ga */
    public final void mo26410ga(int i, int i2) {
        AppMethodBeat.m2504i(5066);
        this.mWidth = i;
        this.sZX = i2;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        if (this.mScreenWidth == 0) {
            this.mScreenWidth = windowManager.getDefaultDisplay().getWidth();
            this.mScreenHeight = windowManager.getDefaultDisplay().getHeight();
        }
        LayoutParams layoutParams = new LayoutParams(i, i2);
        layoutParams.topMargin = C1338a.fromDPToPix(getContext(), 12) + C23639t.m36491hF(getContext());
        layoutParams.leftMargin = ((this.mScreenWidth - this.mWidth) - layoutParams.topMargin) + C23639t.m36491hF(getContext());
        setLayoutParams(layoutParams);
        this.taq = this.mScreenHeight - this.sZX;
        this.tar = this.mScreenWidth - this.mWidth;
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        AppMethodBeat.m2505o(5066);
    }

    /* renamed from: gb */
    public final void mo26411gb(int i, int i2) {
        AppMethodBeat.m2504i(139157);
        mo26410ga(i, i2);
        AppMethodBeat.m2505o(139157);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.mOnClickListener = onClickListener;
    }

    /* renamed from: gc */
    public final void mo26412gc(int i, int i2) {
        AppMethodBeat.m2504i(5068);
        LayoutParams layoutParams = (LayoutParams) getLayoutParams();
        LayoutParams layoutParams2 = new LayoutParams(i, i2);
        layoutParams2.leftMargin = layoutParams.leftMargin;
        layoutParams2.topMargin = layoutParams.topMargin;
        this.mWidth = i;
        this.sZX = i2;
        setLayoutParams(layoutParams2);
        AppMethodBeat.m2505o(5068);
    }
}
