package com.tencent.p177mm.boot.svg.p708a.p709a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.p177mm.svg.C5163c;
import com.tencent.p177mm.svg.WeChatSVGRenderC2Java;
import com.tencent.smtt.sdk.WebView;

/* renamed from: com.tencent.mm.boot.svg.a.a.yv */
public final class C9172yv extends C5163c {
    private final int height = 24;
    private final int width = 24;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 24;
            case 1:
                return 24;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix h = C5163c.m7881h(looper);
                float[] g = C5163c.m7880g(looper);
                Paint k = C5163c.m7883k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = C5163c.m7883k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                Paint a = C5163c.m7876a(k2, looper);
                a.setStrokeWidth(1.0f);
                canvas.save();
                g = C5163c.m7878a(g, 1.0f, 0.0f, 3.0f, 0.0f, 1.0f, 3.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                float[] a2 = C5163c.m7878a(g, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.5625f);
                h.reset();
                h.setValues(a2);
                canvas.concat(h);
                canvas.save();
                Paint a3 = C5163c.m7876a(k, looper);
                a3.setColor(-1);
                Path l = C5163c.m7884l(looper);
                l.moveTo(4.5099163f, 4.5332026f);
                l.lineTo(9.341856f, 1.1454085f);
                l.cubicTo(9.818216f, 0.8114202f, 10.475134f, 0.92683566f, 10.809122f, 1.4031961f);
                l.cubicTo(10.933353f, 1.5803846f, 11.0f, 1.7915347f, 11.0f, 2.0079353f);
                l.lineTo(11.0f, 11.023287f);
                l.lineTo(4.5099163f, 4.5332026f);
                l.close();
                l.moveTo(11.0f, 13.851713f);
                l.lineTo(11.0f, 14.870968f);
                l.cubicTo(11.0f, 15.452748f, 10.528375f, 15.924374f, 9.946595f, 15.924374f);
                l.cubicTo(9.766121f, 15.924374f, 9.588673f, 15.878006f, 9.431269f, 15.789718f);
                l.lineTo(4.0f, 12.743319f);
                l.lineTo(1.053405f, 12.743319f);
                l.cubicTo(0.47162548f, 12.743319f, -2.9904773E-14f, 12.271693f, -2.997602E-14f, 11.689914f);
                l.lineTo(-3.0198066E-14f, 5.944123f);
                l.cubicTo(-3.0269315E-14f, 5.3623433f, 0.47162548f, 4.8907175f, 1.053405f, 4.8907175f);
                l.lineTo(2.039004f, 4.8907175f);
                l.lineTo(11.0f, 13.851713f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.save();
                a = C5163c.m7876a(a, looper);
                a.setColor(-1);
                a.setStrokeWidth(1.87272f);
                a.setStrokeCap(Cap.ROUND);
                l = C5163c.m7884l(looper);
                l.moveTo(14.029777f, 12.4375f);
                l.cubicTo(15.813192f, 12.025054f, 17.145054f, 10.392283f, 17.145054f, 8.440882f);
                l.cubicTo(17.145054f, 6.478635f, 15.798347f, 4.83857f, 14.0f, 4.4375f);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                canvas.save();
                k = C5163c.m7876a(k, looper);
                k.setColor(-1);
                g = C5163c.m7878a(a2, 0.70710677f, 0.70710677f, -4.8786793f, -0.70710677f, 0.70710677f, 11.778175f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                l = C5163c.m7884l(looper);
                l.moveTo(10.778174f, 2.7781746f);
                l.cubicTo(10.778174f, 2.22589f, 11.225889f, 1.7781746f, 11.778174f, 1.7781746f);
                l.lineTo(11.778174f, 1.7781746f);
                l.cubicTo(12.33046f, 1.7781746f, 12.778174f, 2.22589f, 12.778174f, 2.7781746f);
                l.lineTo(12.778174f, 20.778175f);
                l.cubicTo(12.778174f, 21.33046f, 12.33046f, 21.778175f, 11.778174f, 21.778175f);
                l.lineTo(11.778174f, 21.778175f);
                l.cubicTo(11.225889f, 21.778175f, 10.778174f, 21.33046f, 10.778174f, 20.778175f);
                l.lineTo(10.778174f, 2.7781746f);
                l.close();
                canvas.drawPath(l, k);
                canvas.restore();
                l = C5163c.m7884l(looper);
                l.moveTo(0.0f, 0.0f);
                l.lineTo(24.0f, 0.0f);
                l.lineTo(24.0f, 24.0f);
                l.lineTo(0.0f, 24.0f);
                l.lineTo(0.0f, 0.0f);
                l.close();
                l = C5163c.m7884l(looper);
                l.moveTo(0.0f, 0.0f);
                l.lineTo(24.0f, 0.0f);
                l.lineTo(24.0f, 24.0f);
                l.lineTo(0.0f, 24.0f);
                l.lineTo(0.0f, 0.0f);
                l.close();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
