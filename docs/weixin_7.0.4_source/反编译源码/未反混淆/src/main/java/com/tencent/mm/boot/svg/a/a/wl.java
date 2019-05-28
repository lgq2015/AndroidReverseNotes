package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class wl extends c {
    private final int height = 96;
    private final int width = 96;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 96;
            case 1:
                return 96;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix h = c.h(looper);
                float[] g = c.g(looper);
                Paint k = c.k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = c.k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                c.a(k2, looper).setStrokeWidth(1.0f);
                canvas.save();
                Paint a = c.a(k, looper);
                a.setColor(-1);
                Path l = c.l(looper);
                l.moveTo(48.0f, 88.0f);
                l.cubicTo(70.09139f, 88.0f, 88.0f, 70.09139f, 88.0f, 48.0f);
                l.cubicTo(88.0f, 25.90861f, 70.09139f, 8.0f, 48.0f, 8.0f);
                l.cubicTo(25.90861f, 8.0f, 8.0f, 25.90861f, 8.0f, 48.0f);
                l.cubicTo(8.0f, 70.09139f, 25.90861f, 88.0f, 48.0f, 88.0f);
                l.close();
                l.moveTo(48.0f, 60.0f);
                l.cubicTo(54.62742f, 60.0f, 60.0f, 54.62742f, 60.0f, 48.0f);
                l.cubicTo(60.0f, 41.37258f, 54.62742f, 36.0f, 48.0f, 36.0f);
                l.cubicTo(41.37258f, 36.0f, 36.0f, 41.37258f, 36.0f, 48.0f);
                l.cubicTo(36.0f, 54.62742f, 41.37258f, 60.0f, 48.0f, 60.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                float[] a2 = c.a(g, 1.0f, 0.0f, 10.0f, 0.0f, 1.0f, 10.0f);
                h.reset();
                h.setValues(a2);
                canvas.concat(h);
                canvas.save();
                Paint a3 = c.a(k, looper);
                a3.setColor(-499359);
                float[] a4 = c.a(a2, 1.0f, 0.0f, 24.0f, 0.0f, 1.0f, 0.0f);
                h.reset();
                h.setValues(a4);
                canvas.concat(h);
                canvas.save();
                a3 = c.a(a3, looper);
                l = c.l(looper);
                l.moveTo(0.0f, 2.6236634f);
                l.cubicTo(8.265033f, -0.6444683f, 17.53581f, -0.805361f, 25.990042f, 1.8393117f);
                l.cubicTo(25.980083f, 10.899578f, 25.960169f, 19.94979f, 26.0f, 29.0f);
                l.cubicTo(17.49598f, 20.04029f, 8.623516f, 11.452647f, 0.0f, 2.6236634f);
                l.lineTo(0.0f, 2.6236634f);
                l.lineTo(0.0f, 2.6236634f);
                l.lineTo(0.0f, 2.6236634f);
                l.lineTo(0.0f, 2.6236634f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.restore();
                canvas.save();
                a3 = c.a(k, looper);
                a3.setColor(-9676047);
                a4 = c.a(a4, 1.0f, 0.0f, 53.0f, 0.0f, 1.0f, 3.0f);
                h.reset();
                h.setValues(a4);
                canvas.concat(h);
                canvas.save();
                a3 = c.a(a3, looper);
                l = c.l(looper);
                l.moveTo(0.03728671f, 0.0f);
                l.cubicTo(8.154168f, 3.6518438f, 14.891579f, 10.052603f, 19.0f, 17.968275f);
                l.cubicTo(12.672432f, 24.30884f, 6.344863f, 30.669468f, 0.01729439f, 37.0f);
                l.cubicTo(0.01729439f, 24.670012f, -0.0326864f, 12.340022f, 0.03728671f, 0.0f);
                l.lineTo(0.03728671f, 0.0f);
                l.lineTo(0.03728671f, 0.0f);
                l.lineTo(0.03728671f, 0.0f);
                l.lineTo(0.03728671f, 0.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.restore();
                canvas.save();
                a3 = c.a(k, looper);
                a3.setColor(-16384);
                a4 = c.a(a4, 1.0f, 0.0f, 3.0f, 0.0f, 1.0f, 4.0f);
                h.reset();
                h.setValues(a4);
                canvas.concat(h);
                canvas.save();
                a3 = c.a(a3, looper);
                l = c.l(looper);
                l.moveTo(0.0f, 18.962732f);
                l.cubicTo(3.6939936f, 10.870102f, 10.040855f, 4.0662975f, 17.979437f, 0.0f);
                l.cubicTo(24.326298f, 6.324241f, 30.663149f, 12.648482f, 37.0f, 18.982716f);
                l.cubicTo(24.666666f, 18.982716f, 12.333333f, 19.03267f, 0.0f, 18.962732f);
                l.lineTo(0.0f, 18.962732f);
                l.lineTo(0.0f, 18.962732f);
                l.lineTo(0.0f, 18.962732f);
                l.lineTo(0.0f, 18.962732f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.restore();
                canvas.save();
                a3 = c.a(k, looper);
                a3.setColor(-12799249);
                a4 = c.a(a4, 1.0f, 0.0f, 47.0f, 0.0f, 1.0f, 24.0f);
                h.reset();
                h.setValues(a4);
                canvas.concat(h);
                canvas.save();
                a3 = c.a(a3, looper);
                l = c.l(looper);
                l.moveTo(-7.1054274E-15f, 26.0f);
                l.cubicTo(8.894916f, 17.439388f, 17.54834f, 8.640153f, 26.362759f, 0.0f);
                l.cubicTo(29.622887f, 8.262333f, 29.82413f, 17.538815f, 27.167728f, 26.0f);
                l.cubicTo(18.111818f, 25.990057f, 9.055909f, 25.980114f, -7.1054274E-15f, 26.0f);
                l.lineTo(-7.1054274E-15f, 26.0f);
                l.lineTo(-7.1054274E-15f, 26.0f);
                l.lineTo(-7.1054274E-15f, 26.0f);
                l.lineTo(-7.1054274E-15f, 26.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.restore();
                canvas.save();
                a3 = c.a(k, looper);
                a3.setColor(-1124019);
                a4 = c.a(a4, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 26.0f);
                h.reset();
                h.setValues(a4);
                canvas.concat(h);
                canvas.save();
                a3 = c.a(a3, looper);
                l = c.l(looper);
                l.moveTo(1.8326316f, 0.01995395f);
                l.cubicTo(10.885068f, 0.00997698f, 19.937506f, 0.0399079f, 29.0f, 0.0f);
                l.cubicTo(19.977737f, 8.450499f, 11.448331f, 17.38987f, 2.5970595f, 26.0f);
                l.cubicTo(-0.6014681f, 17.729086f, -0.83280814f, 8.470453f, 1.8326316f, 0.01995395f);
                l.lineTo(1.8326316f, 0.01995395f);
                l.lineTo(1.8326316f, 0.01995395f);
                l.lineTo(1.8326316f, 0.01995395f);
                l.lineTo(1.8326316f, 0.01995395f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.restore();
                canvas.save();
                a3 = c.a(k, looper);
                a3.setColor(-5117108);
                a4 = c.a(a4, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 36.0f);
                h.reset();
                h.setValues(a4);
                canvas.concat(h);
                canvas.save();
                a3 = c.a(a3, looper);
                l = c.l(looper);
                l.moveTo(0.0f, 19.053654f);
                l.cubicTo(6.3366494f, 12.69911f, 12.673299f, 6.354543f, 19.0f, 0.0f);
                l.cubicTo(18.850786f, 12.3300085f, 19.019896f, 24.669992f, 18.910471f, 37.0f);
                l.cubicTo(10.793194f, 33.378807f, 4.088482f, 26.94446f, 0.0f, 19.053654f);
                l.lineTo(0.0f, 19.053654f);
                l.lineTo(0.0f, 19.053654f);
                l.lineTo(0.0f, 19.053654f);
                l.lineTo(0.0f, 19.053654f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.restore();
                canvas.save();
                a3 = c.a(k, looper);
                a3.setColor(-10818218);
                a4 = c.a(a4, 1.0f, 0.0f, 26.0f, 0.0f, 1.0f, 47.0f);
                h.reset();
                h.setValues(a4);
                canvas.concat(h);
                canvas.save();
                a3 = c.a(a3, looper);
                l = c.l(looper);
                l.moveTo(0.0f, 7.1054274E-15f);
                l.cubicTo(8.487356f, 8.976492f, 17.383142f, 17.54085f, 26.0f, 26.386665f);
                l.cubicTo(17.7318f, 29.58322f, 8.457471f, 29.854626f, 0.01992337f, 27.160673f);
                l.cubicTo(0.00996169f, 18.103765f, 0.03984674f, 9.056909f, 0.0f, 7.1054274E-15f);
                l.lineTo(0.0f, 7.1054274E-15f);
                l.lineTo(0.0f, 7.1054274E-15f);
                l.lineTo(0.0f, 7.1054274E-15f);
                l.lineTo(0.0f, 7.1054274E-15f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.restore();
                canvas.save();
                a3 = c.a(k, looper);
                a3.setColor(-11083026);
                a2 = c.a(a4, 1.0f, 0.0f, 36.0f, 0.0f, 1.0f, 53.0f);
                h.reset();
                h.setValues(a2);
                canvas.concat(h);
                canvas.save();
                Paint a5 = c.a(a3, looper);
                l = c.l(looper);
                l.moveTo(-7.1054274E-15f, 0.01226055f);
                l.cubicTo(12.333333f, 0.02224884f, 24.666666f, -0.0376809f, 37.0f, 0.04222542f);
                l.cubicTo(33.306007f, 8.122752f, 26.969156f, 14.944755f, 19.020563f, 19.0f);
                l.cubicTo(12.683712f, 12.667424f, 6.32684f, 6.3548245f, -7.1054274E-15f, 0.01226055f);
                l.lineTo(-7.1054274E-15f, 0.01226055f);
                l.lineTo(-7.1054274E-15f, 0.01226055f);
                l.lineTo(-7.1054274E-15f, 0.01226055f);
                l.lineTo(-7.1054274E-15f, 0.01226055f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a5);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
