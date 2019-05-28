package com.tencent.p177mm.plugin.scanner.p504ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.C25738R;
import com.tencent.p177mm.compatible.p222g.C1434a;
import com.tencent.p177mm.compatible.util.C1443d;
import com.tencent.p177mm.sdk.platformtools.C4990ab;

/* renamed from: com.tencent.mm.plugin.scanner.ui.ScanMaskView */
public class ScanMaskView extends View {
    private Path lkh = new Path();
    private Paint mPaint;
    private Bitmap qdG = null;
    private Bitmap qdH = null;
    private Bitmap qdI = null;
    private Bitmap qdJ = null;
    int qdK = 0;
    int qdL = 0;
    private boolean qdM = false;
    private Rect qdN = new Rect();
    private Rect qdO = new Rect();
    private Rect qdP = new Rect();
    private Rect qdQ = new Rect();
    private Rect qdR = new Rect();
    private Rect qdS = new Rect();
    private Rect qdT = new Rect();
    private Rect qdU = new Rect();
    private Rect qdV = new Rect();
    private Rect qdW;
    private PorterDuffXfermode qdX;
    private int qdY = C25738R.color.f12276yf;
    private long qdZ = 0;
    private boolean qea = false;
    private Rect qeb;
    private int qec = 300;
    private float qed = 0.0f;
    private float qee = 0.0f;
    private float qef = 0.0f;
    private float qeg = 0.0f;
    private Paint qeh;
    private ValueAnimator qei = null;
    private C34838a qej;

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ScanMaskView$2 */
    class C217012 extends AnimatorListenerAdapter {
        C217012() {
        }

        public final void onAnimationEnd(Animator animator) {
            AppMethodBeat.m2504i(81148);
            super.onAnimationEnd(animator);
            if (ScanMaskView.this.qej != null) {
                ScanMaskView.this.qej.onAnimationEnd();
            }
            AppMethodBeat.m2505o(81148);
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ScanMaskView$1 */
    class C348371 implements AnimatorUpdateListener {
        C348371() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            AppMethodBeat.m2504i(81147);
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ScanMaskView.this.qdW.left = ScanMaskView.this.qeb.left + ((int) (ScanMaskView.this.qed * floatValue));
            ScanMaskView.this.qdW.right = ScanMaskView.this.qeb.right + ((int) (ScanMaskView.this.qee * floatValue));
            ScanMaskView.this.qdW.top = ScanMaskView.this.qeb.top + ((int) (ScanMaskView.this.qef * floatValue));
            ScanMaskView.this.qdW.bottom = ((int) (floatValue * ScanMaskView.this.qeg)) + ScanMaskView.this.qeb.bottom;
            ScanMaskView.this.invalidate();
            AppMethodBeat.m2505o(81147);
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ScanMaskView$a */
    interface C34838a {
        void onAnimationEnd();
    }

    public ScanMaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AppMethodBeat.m2504i(81149);
        AppMethodBeat.m2505o(81149);
    }

    public ScanMaskView(Context context, Rect rect) {
        super(context);
        AppMethodBeat.m2504i(81150);
        this.qdW = rect;
        getDrawingRect(this.qdN);
        this.mPaint = new Paint();
        this.qdG = C1434a.decodeResource(getResources(), C25738R.drawable.ani);
        this.qdH = C1434a.decodeResource(getResources(), C25738R.drawable.anj);
        this.qdI = C1434a.decodeResource(getResources(), C25738R.drawable.ank);
        this.qdJ = C1434a.decodeResource(getResources(), C25738R.drawable.anl);
        this.qdK = this.qdG.getWidth();
        this.qdL = this.qdG.getHeight();
        this.qeh = new Paint();
        this.qdX = new PorterDuffXfermode(Mode.CLEAR);
        AppMethodBeat.m2505o(81150);
    }

    public final void cht() {
        AppMethodBeat.m2504i(81151);
        this.qdM = true;
        if (this.qdG != null) {
            C4990ab.m7417i("ScanMaskView", "bitmap recycle %s", this.qdG.toString());
            this.qdG.recycle();
            this.qdG = null;
        }
        if (this.qdH != null) {
            C4990ab.m7417i("ScanMaskView", "bitmap recycle %s", this.qdH.toString());
            this.qdH.recycle();
            this.qdH = null;
        }
        if (this.qdI != null) {
            C4990ab.m7417i("ScanMaskView", "bitmap recycle %s", this.qdI.toString());
            this.qdI.recycle();
            this.qdI = null;
        }
        if (this.qdJ != null) {
            C4990ab.m7417i("ScanMaskView", "bitmap recycle %s", this.qdJ.toString());
            this.qdJ.recycle();
            this.qdJ = null;
        }
        AppMethodBeat.m2505o(81151);
    }

    public Rect getMaskRect() {
        return this.qdW;
    }

    public int getMaskAnimDuration() {
        return this.qec;
    }

    public void setMastAnimaDuration(int i) {
        this.qec = i;
    }

    public void setMaskAnimaListener(C34838a c34838a) {
        this.qej = c34838a;
    }

    /* renamed from: k */
    public final void mo55443k(Rect rect) {
        AppMethodBeat.m2504i(81152);
        if (rect.left == this.qdW.left && rect.right == this.qdW.right && rect.top == this.qdW.top && rect.bottom == this.qdW.bottom) {
            AppMethodBeat.m2505o(81152);
            return;
        }
        this.qed = (float) (rect.left - this.qdW.left);
        this.qee = (float) (rect.right - this.qdW.right);
        this.qef = (float) (rect.top - this.qdW.top);
        this.qeg = (float) (rect.bottom - this.qdW.bottom);
        this.qeb = new Rect(this.qdW.left, this.qdW.top, this.qdW.right, this.qdW.bottom);
        this.qea = true;
        this.qei = new ValueAnimator();
        this.qei.setFloatValues(new float[]{0.0f, 1.0f});
        this.qei.setDuration((long) this.qec);
        this.qei.addUpdateListener(new C348371());
        this.qei.start();
        this.qei.addListener(new C217012());
        AppMethodBeat.m2505o(81152);
    }

    public void setMaskColorRsid(int i) {
        this.qdY = i;
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        AppMethodBeat.m2504i(81153);
        if (this.qdW == null || this.qdM) {
            AppMethodBeat.m2505o(81153);
            return;
        }
        System.currentTimeMillis();
        System.currentTimeMillis();
        int save = canvas.save();
        this.mPaint.reset();
        if (C1443d.m3067fP(18)) {
            this.qdS.left = 0;
            this.qdS.top = this.qdW.top;
            this.qdS.right = this.qdW.left;
            this.qdS.bottom = this.qdW.bottom;
            this.qdT.left = this.qdW.left;
            this.qdT.top = 0;
            this.qdT.right = this.qdW.right;
            this.qdT.bottom = this.qdW.top;
            this.qdU.left = this.qdW.right;
            this.qdU.top = this.qdW.top;
            this.qdU.right = getWidth();
            this.qdU.bottom = this.qdW.bottom;
            this.qdV.left = this.qdW.left;
            this.qdV.top = this.qdW.bottom;
            this.qdV.right = this.qdW.right;
            this.qdV.bottom = getHeight();
            this.qdO.left = 0;
            this.qdO.top = 0;
            this.qdO.right = this.qdW.left;
            this.qdO.bottom = this.qdW.top;
            this.qdP.left = this.qdW.right;
            this.qdP.top = 0;
            this.qdP.right = getWidth();
            this.qdP.bottom = this.qdW.top;
            this.qdQ.left = 0;
            this.qdQ.top = this.qdW.bottom;
            this.qdQ.right = this.qdW.left;
            this.qdQ.bottom = getHeight();
            this.qdR.left = this.qdW.right;
            this.qdR.top = this.qdW.bottom;
            this.qdR.right = getWidth();
            this.qdR.bottom = getHeight();
            canvas.save();
            canvas.clipRect(this.qdS, Op.REPLACE);
            canvas.drawColor(getResources().getColor(this.qdY));
            canvas.restore();
            canvas.save();
            canvas.clipRect(this.qdT, Op.REPLACE);
            canvas.drawColor(getResources().getColor(this.qdY));
            canvas.restore();
            canvas.save();
            canvas.clipRect(this.qdU, Op.REPLACE);
            canvas.drawColor(getResources().getColor(this.qdY));
            canvas.restore();
            canvas.save();
            canvas.clipRect(this.qdV, Op.REPLACE);
            canvas.drawColor(getResources().getColor(this.qdY));
            canvas.restore();
            canvas.save();
            canvas.clipRect(this.qdO, Op.REPLACE);
            canvas.drawColor(getResources().getColor(this.qdY));
            canvas.restore();
            canvas.save();
            canvas.clipRect(this.qdP, Op.REPLACE);
            canvas.drawColor(getResources().getColor(this.qdY));
            canvas.restore();
            canvas.save();
            canvas.clipRect(this.qdQ, Op.REPLACE);
            canvas.drawColor(getResources().getColor(this.qdY));
            canvas.restore();
            canvas.save();
            canvas.clipRect(this.qdR, Op.REPLACE);
            canvas.drawColor(getResources().getColor(this.qdY));
            canvas.restore();
        } else {
            canvas.clipRect(this.qdW, Op.DIFFERENCE);
            canvas.drawColor(getResources().getColor(this.qdY));
        }
        System.currentTimeMillis();
        System.currentTimeMillis();
        canvas.restoreToCount(save);
        this.mPaint.reset();
        this.mPaint.setStyle(Style.STROKE);
        this.mPaint.setStrokeWidth(1.0f);
        this.mPaint.setColor(-3355444);
        this.mPaint.setAntiAlias(true);
        canvas.drawRect(this.qdW, this.mPaint);
        System.currentTimeMillis();
        System.currentTimeMillis();
        canvas.drawBitmap(this.qdG, (float) this.qdW.left, (float) this.qdW.top, this.qeh);
        canvas.drawBitmap(this.qdH, (float) (this.qdW.right - this.qdK), (float) this.qdW.top, this.qeh);
        canvas.drawBitmap(this.qdI, (float) this.qdW.left, (float) (this.qdW.bottom - this.qdL), this.qeh);
        canvas.drawBitmap(this.qdJ, (float) (this.qdW.right - this.qdK), (float) (this.qdW.bottom - this.qdL), this.qeh);
        System.currentTimeMillis();
        super.onDraw(canvas);
        System.currentTimeMillis();
        AppMethodBeat.m2505o(81153);
    }
}
