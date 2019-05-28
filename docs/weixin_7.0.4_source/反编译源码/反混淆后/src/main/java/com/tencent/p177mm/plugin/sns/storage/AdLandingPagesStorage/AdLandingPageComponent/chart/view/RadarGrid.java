package com.tencent.p177mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.text.Layout.Alignment;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.ChartGridView;
import com.tencent.p177mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.p1026a.C39764c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.RadarGrid */
public class RadarGrid extends ChartGridView {
    public static final Point qYx = new Point(0, 0);
    private Rect mRect = new Rect();
    private int qYD = 80;
    private Point qYE = qYx;
    private Spannable[] qYG;
    private List<PointF> qYH;
    private int qYs = 4;
    private int qYt = 4;
    private float qYv = 1.0f;
    private C39764c qYw;
    /* renamed from: vr */
    private Path f2922vr = new Path();

    static {
        AppMethodBeat.m2504i(37012);
        AppMethodBeat.m2505o(37012);
    }

    public RadarGrid(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AppMethodBeat.m2504i(36980);
        cpj();
        AppMethodBeat.m2505o(36980);
    }

    public RadarGrid(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AppMethodBeat.m2504i(36981);
        cpj();
        AppMethodBeat.m2505o(36981);
    }

    public RadarGrid(Context context, int i, int i2, float f, Spannable[] spannableArr, C39764c c39764c) {
        super(context);
        AppMethodBeat.m2504i(36982);
        this.qYv = f;
        this.qYs = i;
        this.qYt = i2;
        this.qYv = f;
        this.qYG = spannableArr;
        this.qYw = c39764c;
        AppMethodBeat.m2505o(36982);
    }

    private void cpj() {
        AppMethodBeat.m2504i(36983);
        setMinimumHeight(160);
        setMinimumWidth(160);
        AppMethodBeat.m2505o(36983);
    }

    public final int cpg() {
        return this.qYD * 2;
    }

    public final int cph() {
        return this.qYD * 2;
    }

    /* renamed from: aX */
    private List<PointF> m21580aX(float f) {
        AppMethodBeat.m2504i(36984);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.qYs; i++) {
            PointF pointF = new PointF();
            pointF.set((float) (((double) this.qYE.x) - (((double) (((float) this.qYD) * f)) * Math.sin((((double) (i * 2)) * 3.141592653589793d) / ((double) this.qYs)))), (float) (((double) this.qYE.y) - (((double) (((float) this.qYD) * f)) * Math.cos((((double) (i * 2)) * 3.141592653589793d) / ((double) this.qYs)))));
            arrayList.add(pointF);
        }
        AppMethodBeat.m2505o(36984);
        return arrayList;
    }

    public void onDraw(Canvas canvas) {
        int i;
        PointF pointF;
        AppMethodBeat.m2504i(36985);
        super.onDraw(canvas);
        int height = getHeight();
        int width = getWidth();
        this.qYD = (int) (((double) (((float) Math.min(height, width)) / 2.0f)) * 0.8d);
        this.qYE.set((int) (((float) width) / 2.0f), (int) (((float) height) / 2.0f));
        if (this.qYw.qYi != null) {
            width = (int) (((float) width) / 2.0f);
            height = (int) (((float) height) / 2.0f);
            i = (int) (((float) (this.qYD * 2)) + (this.qYw.qYf * 2.0f));
            int width2 = (this.qYw.qYi.getWidth() * i) / this.qYw.qYi.getHeight();
            if (this.qYw.qYi != null) {
                canvas.drawBitmap(Bitmap.createScaledBitmap(this.qYw.qYi, width2, i, false), (float) (width - (width2 >>> 1)), (float) (height - (i >>> 1)), null);
            }
        }
        if (this.qYw.qXP) {
            switch (this.qYw.qXO) {
                case 0:
                    this.qYH = m21580aX(1.0f);
                    height = 0;
                    while (true) {
                        width = height;
                        if (width >= this.qYs) {
                            this.f2922vr.close();
                            if (this.qYw.backgroundColor != 0 && this.qYw.qYi == null) {
                                canvas.drawPath(this.f2922vr, getPaintGridFill());
                                break;
                            }
                        }
                        pointF = (PointF) this.qYH.get(width);
                        if (width == 0) {
                            this.f2922vr.moveTo(pointF.x, pointF.y);
                        } else {
                            this.f2922vr.lineTo(pointF.x, pointF.y);
                        }
                        height = width + 1;
                    }
                case 1:
                    canvas.drawCircle((float) this.qYE.x, (float) this.qYE.y, (float) this.qYD, getPaintGridFill());
                    break;
            }
        }
        if (this.qYw.qXQ) {
            this.qYH = m21580aX(1.0f);
            height = 0;
            while (true) {
                int i2 = height;
                if (i2 < this.qYs) {
                    pointF = (PointF) this.qYH.get(i2);
                    canvas.drawLine((float) this.qYE.x, (float) this.qYE.y, pointF.x, pointF.y, getPaintGridLongitude());
                    height = i2 + 1;
                }
            }
        }
        if (this.qYw.qXP) {
            switch (this.qYw.qXO) {
                case 0:
                    canvas.drawPath(this.f2922vr, getPaintGridBorder());
                    this.f2922vr.reset();
                    height = 1;
                    while (true) {
                        width = height;
                        if (width >= this.qYt) {
                            break;
                        }
                        this.qYH = m21580aX((((float) width) * 1.0f) / ((float) this.qYt));
                        height = 0;
                        while (true) {
                            i = height;
                            if (i < this.qYs) {
                                pointF = (PointF) this.qYH.get(i);
                                if (i == 0) {
                                    this.f2922vr.moveTo(pointF.x, pointF.y);
                                } else {
                                    this.f2922vr.lineTo(pointF.x, pointF.y);
                                }
                                canvas.drawCircle(pointF.x, pointF.y, (float) getGridDotRadius(), getPaintGridDot());
                                height = i + 1;
                            } else {
                                this.f2922vr.close();
                                canvas.drawPath(this.f2922vr, getPaintGridLatitude());
                                this.f2922vr.reset();
                                height = width + 1;
                            }
                        }
                    }
                case 1:
                    canvas.drawCircle((float) this.qYE.x, (float) this.qYE.y, (float) this.qYD, getPaintGridBorder());
                    for (height = 1; height < this.qYt; height++) {
                        canvas.drawCircle((float) this.qYE.x, (float) this.qYE.y, ((float) this.qYD) * ((((float) height) * 1.0f) / ((float) this.qYt)), getPaintGridLatitude());
                    }
                    break;
            }
        }
        if (this.qYG != null && this.qYw.qXS) {
            if (this.qYG.length != this.qYs) {
                RuntimeException runtimeException = new RuntimeException("Labels array length not matches longitude lines number.");
                AppMethodBeat.m2505o(36985);
                throw runtimeException;
            }
            height = 0;
            while (true) {
                int i3 = height;
                if (i3 < this.qYs) {
                    Object obj = this.qYG[i3];
                    if (!obj.equals(null)) {
                        float f;
                        float f2;
                        if (i3 == 0 || i3 == (this.qYs >>> 1)) {
                            f = 0.5f;
                        } else if (i3 <= 0 || i3 >= (this.qYs >>> 1)) {
                            f = 1.0f;
                        } else {
                            f = 0.0f;
                        }
                        if (i3 == 0) {
                            f2 = this.qYw.qYa;
                        } else if (i3 == (this.qYs >>> 1)) {
                            f2 = -this.qYw.qYa;
                        } else {
                            f2 = 0.0f;
                        }
                        StaticLayout staticLayout = new StaticLayout(obj, getTextPaintGLabelFont(), 1000, Alignment.ALIGN_NORMAL, 0.0f, 0.0f, false);
                        float lineWidth = (float) (((double) (((float) this.qYE.x) - (staticLayout.getLineWidth(0) * f))) - (((double) (((float) this.qYD) + this.qYw.qYa)) * Math.sin(6.283185307179586d - ((((double) (i3 * 2)) * 3.141592653589793d) / ((double) this.qYs)))));
                        float height2 = (float) ((((double) (this.qYE.y - (staticLayout.getHeight() / 2))) - (((double) (((float) this.qYD) + this.qYw.qYa)) * Math.cos(6.283185307179586d - ((((double) (i3 * 2)) * 3.141592653589793d) / ((double) this.qYs))))) - ((double) f2));
                        canvas.save();
                        canvas.translate(lineWidth, height2);
                        staticLayout.draw(canvas);
                        canvas.restore();
                    }
                    height = i3 + 1;
                }
            }
        }
        AppMethodBeat.m2505o(36985);
    }

    private Paint getPaintGridFill() {
        AppMethodBeat.m2504i(36986);
        Paint paint = new Paint();
        paint.setColor(this.qYw.backgroundColor);
        paint.setAntiAlias(true);
        AppMethodBeat.m2505o(36986);
        return paint;
    }

    private Paint getPaintGridBorder() {
        int i;
        float f;
        AppMethodBeat.m2504i(36987);
        Paint paint = new Paint();
        C39764c c39764c = this.qYw;
        if (c39764c.qXT == -1) {
            i = c39764c.qXU;
        } else {
            i = c39764c.qXT;
        }
        paint.setColor(i);
        paint.setStyle(Style.STROKE);
        c39764c = this.qYw;
        if (c39764c.qXX == -1.0f) {
            f = c39764c.qXW;
        } else {
            f = c39764c.qXX;
        }
        paint.setStrokeWidth(f);
        paint.setAntiAlias(true);
        AppMethodBeat.m2505o(36987);
        return paint;
    }

    private Paint getPaintGridLatitude() {
        AppMethodBeat.m2504i(36988);
        Paint paint = new Paint();
        paint.setColor(this.qYw.qXU);
        paint.setStyle(Style.STROKE);
        paint.setStrokeWidth(this.qYw.qXW);
        paint.setAntiAlias(true);
        AppMethodBeat.m2505o(36988);
        return paint;
    }

    private Paint getPaintGridDot() {
        AppMethodBeat.m2504i(36989);
        Paint paint = new Paint();
        paint.setColor(this.qYw.qYg);
        paint.setStyle(Style.FILL);
        paint.setAntiAlias(true);
        AppMethodBeat.m2505o(36989);
        return paint;
    }

    private int getGridDotRadius() {
        return this.qYw.qYh;
    }

    private Paint getPaintGridLongitude() {
        AppMethodBeat.m2504i(36990);
        Paint paint = new Paint();
        paint.setColor(this.qYw.qXV);
        paint.setStrokeWidth(this.qYw.qXW);
        AppMethodBeat.m2505o(36990);
        return paint;
    }

    private Paint getPaintGLabelFont() {
        AppMethodBeat.m2504i(36991);
        Paint paint = new Paint();
        paint.setColor(this.qYw.qXY);
        paint.setTextSize(this.qYw.qXZ);
        AppMethodBeat.m2505o(36991);
        return paint;
    }

    private TextPaint getTextPaintGLabelFont() {
        AppMethodBeat.m2504i(36992);
        TextPaint textPaint = new TextPaint();
        textPaint.setColor(this.qYw.qXY);
        textPaint.setTextSize(this.qYw.qXZ);
        AppMethodBeat.m2505o(36992);
        return textPaint;
    }

    private Paint getPaintGScaleFont() {
        int i;
        AppMethodBeat.m2504i(36993);
        Paint paint = new Paint();
        C39764c c39764c = this.qYw;
        if (c39764c.qYb == -1) {
            i = c39764c.qXY;
        } else {
            i = c39764c.qYb;
        }
        paint.setColor(i);
        paint.setTextSize(this.qYw.qYc);
        AppMethodBeat.m2505o(36993);
        return paint;
    }

    public void setGridChartType(int i) {
        AppMethodBeat.m2504i(36994);
        this.qYw.qXO = i;
        invalidate();
        AppMethodBeat.m2505o(36994);
    }

    public void setLonNum(int i) {
        AppMethodBeat.m2504i(36995);
        this.qYs = i;
        invalidate();
        AppMethodBeat.m2505o(36995);
    }

    public void setLatNum(int i) {
        AppMethodBeat.m2504i(36996);
        this.qYt = i;
        invalidate();
        AppMethodBeat.m2505o(36996);
    }

    public void setMaxValue(float f) {
        AppMethodBeat.m2504i(36997);
        this.qYv = f;
        invalidate();
        AppMethodBeat.m2505o(36997);
    }

    public void setLabelsArray(Spannable[] spannableArr) {
        AppMethodBeat.m2504i(36998);
        this.qYG = spannableArr;
        invalidate();
        AppMethodBeat.m2505o(36998);
    }

    public void setGridStyle(C39764c c39764c) {
        AppMethodBeat.m2504i(36999);
        this.qYw = c39764c;
        invalidate();
        AppMethodBeat.m2505o(36999);
    }

    public C39764c getGridStyle() {
        return this.qYw;
    }

    public void setBackgroundColor(int i) {
        AppMethodBeat.m2504i(37000);
        this.qYw.backgroundColor = i;
        invalidate();
        AppMethodBeat.m2505o(37000);
    }

    public void setGridBorderColor(int i) {
        AppMethodBeat.m2504i(37001);
        this.qYw.qXT = i;
        invalidate();
        AppMethodBeat.m2505o(37001);
    }

    public void setGridLatitudeColor(int i) {
        AppMethodBeat.m2504i(37002);
        this.qYw.qXU = i;
        invalidate();
        AppMethodBeat.m2505o(37002);
    }

    public void setGridLongitudeColor(int i) {
        AppMethodBeat.m2504i(37003);
        this.qYw.qXV = i;
        invalidate();
        AppMethodBeat.m2505o(37003);
    }

    public void setGridStrokeWidth(float f) {
        AppMethodBeat.m2504i(37004);
        this.qYw.qXW = f;
        invalidate();
        AppMethodBeat.m2505o(37004);
    }

    public void setGridBorderStrokeWidth(float f) {
        AppMethodBeat.m2504i(37005);
        this.qYw.qXX = f;
        invalidate();
        AppMethodBeat.m2505o(37005);
    }

    public void setGridLabelColor(int i) {
        AppMethodBeat.m2504i(37006);
        this.qYw.qXY = i;
        invalidate();
        AppMethodBeat.m2505o(37006);
    }

    public void setGridLabelSize(float f) {
        AppMethodBeat.m2504i(37007);
        this.qYw.qXZ = f;
        invalidate();
        AppMethodBeat.m2505o(37007);
    }

    public void setGridLabelPadding(float f) {
        AppMethodBeat.m2504i(37008);
        this.qYw.qYa = f;
        invalidate();
        AppMethodBeat.m2505o(37008);
    }

    public void setGridScaleColor(int i) {
        AppMethodBeat.m2504i(37009);
        this.qYw.qYb = i;
        invalidate();
        AppMethodBeat.m2505o(37009);
    }

    public void setGridScaleSize(float f) {
        AppMethodBeat.m2504i(37010);
        this.qYw.qYc = f;
        invalidate();
        AppMethodBeat.m2505o(37010);
    }

    public void setGridScaleLabelPadding(float f) {
        AppMethodBeat.m2504i(37011);
        this.qYw.qYd = f;
        invalidate();
        AppMethodBeat.m2505o(37011);
    }
}
