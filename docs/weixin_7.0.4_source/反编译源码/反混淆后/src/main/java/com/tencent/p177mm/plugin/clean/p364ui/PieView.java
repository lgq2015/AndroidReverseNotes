package com.tencent.p177mm.plugin.clean.p364ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.wxmm.v2helper;

/* renamed from: com.tencent.mm.plugin.clean.ui.PieView */
public class PieView extends View {
    private int cGC = 0;
    private int hzv = 6;
    private Paint kwU;
    private Paint kwV;
    private Paint kwW;
    private Paint kwX;
    private Paint kwY;
    private Paint kwZ;
    private Paint kxa;
    private int kxb;
    private int kxc;
    private int kxd;
    private int kxe;
    private int kxf;
    private int kxg;
    private int kxh = 0;
    private int kxi = -90;

    public PieView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AppMethodBeat.m2504i(18734);
        initView();
        AppMethodBeat.m2505o(18734);
    }

    public PieView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AppMethodBeat.m2504i(18735);
        initView();
        AppMethodBeat.m2505o(18735);
    }

    public void setStage(int i) {
        this.cGC = i;
    }

    public void setGreenTargetAngle(int i) {
        this.kxf = i;
    }

    public void setDeepGrayTargetAngle(int i) {
        this.kxg = i;
    }

    public void setOtherAccTargetAngle(int i) {
        this.kxh = i;
    }

    private void initView() {
        AppMethodBeat.m2504i(18736);
        this.kwU = PieView.m65842tt(-1);
        this.kwV = PieView.m65842tt(-657931);
        this.kwW = PieView.m65842tt(-2565928);
        this.kwX = PieView.m65842tt(-15223279);
        this.kwY = PieView.m65842tt(-7876878);
        this.kwZ = PieView.m65842tt(-7876878);
        this.kxa = PieView.m65842tt(-1644567);
        AppMethodBeat.m2505o(18736);
    }

    /* renamed from: tt */
    private static Paint m65842tt(int i) {
        AppMethodBeat.m2504i(18737);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Style.FILL);
        paint.setColor(i);
        AppMethodBeat.m2505o(18737);
        return paint;
    }

    public void draw(Canvas canvas) {
        AppMethodBeat.m2504i(18738);
        float measuredWidth = (float) (getMeasuredWidth() / 2);
        float measuredHeight = (float) ((getMeasuredHeight() / 2) + getTop());
        float measuredHeight2 = (float) ((getMeasuredHeight() / 3) + 15);
        float f = measuredHeight2 - 15.0f;
        RectF rectF = new RectF(measuredWidth - measuredHeight2, measuredHeight - measuredHeight2, measuredWidth + measuredHeight2, measuredHeight + measuredHeight2);
        if (this.cGC == 0) {
            canvas.drawCircle(measuredWidth, measuredHeight, measuredHeight2, this.kwV);
            canvas.drawArc(rectF, (float) this.kxi, 45.0f, true, this.kwW);
            canvas.drawCircle(measuredWidth, measuredHeight, f, this.kwU);
            this.kxi += 4;
            this.kxi %= v2helper.VOIP_ENC_HEIGHT_LV1;
        }
        if (this.cGC == 1) {
            float f2 = 10.0f + measuredHeight2;
            RectF rectF2 = new RectF(measuredWidth - f2, measuredHeight - f2, measuredWidth + f2, f2 + measuredHeight);
            this.kxb = PieView.m65841Q(this.kxb, this.kxf, this.hzv);
            canvas.drawArc(rectF2, -90.0f, (float) this.kxb, true, this.kwX);
            if (this.kxh <= 0) {
                if (this.kxb == this.kxf) {
                    this.kxd = PieView.m65841Q(this.kxd, this.kxg, this.hzv);
                    canvas.drawArc(rectF, (float) (this.kxf - 90), (float) this.kxd, true, this.kwY);
                }
                if (this.kxd == this.kxg) {
                    this.kxc = PieView.m65841Q(this.kxc, (360 - this.kxf) - this.kxg, this.hzv);
                    canvas.drawArc(rectF, (float) ((this.kxf - 90) + this.kxg), (float) this.kxc, true, this.kwZ);
                }
            } else {
                if (this.kxb == this.kxf) {
                    this.kxe = PieView.m65841Q(this.kxe, this.kxh, this.hzv);
                    canvas.drawArc(rectF2, (float) (this.kxf - 90), (float) this.kxe, true, this.kxa);
                }
                if (this.kxe == this.kxh) {
                    this.kxd = PieView.m65841Q(this.kxd, this.kxg, this.hzv);
                    canvas.drawArc(rectF, (float) ((this.kxh - 90) + this.kxf), (float) this.kxd, true, this.kwY);
                }
                if (this.kxd == this.kxg) {
                    this.kxc = PieView.m65841Q(this.kxc, ((360 - this.kxf) - this.kxg) - this.kxh, this.hzv);
                    canvas.drawArc(rectF, (float) (((this.kxf - 90) + this.kxg) + this.kxh), (float) this.kxc, true, this.kwZ);
                }
            }
        }
        invalidate();
        AppMethodBeat.m2505o(18738);
    }

    /* renamed from: Q */
    private static int m65841Q(int i, int i2, int i3) {
        if (i2 - i >= i3) {
            return i + i3;
        }
        if (i - i2 > i3) {
            return i - i3;
        }
        return i2;
    }
}
