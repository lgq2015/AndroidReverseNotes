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

public final class vc extends c {
    private final int height = 108;
    private final int width = 108;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 108;
            case 1:
                return 108;
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
                g = c.a(g, 1.0f, 0.0f, 21.0f, 0.0f, 1.0f, 21.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a = c.a(k, looper);
                a.setColor(-499359);
                Path l = c.l(looper);
                l.moveTo(42.462597f, 24.958805f);
                l.cubicTo(42.750237f, 25.252054f, 43.02305f, 25.55946f, 43.284f, 25.879f);
                l.lineTo(43.284f, 2.4524336f);
                l.cubicTo(40.165432f, 1.4371847f, 36.847195f, 0.879f, 33.399467f, 0.879f);
                l.cubicTo(29.116503f, 0.879f, 25.031225f, 1.7344787f, 21.284f, 3.2694867f);
                l.lineTo(42.474457f, 24.947681f);
                l.lineTo(42.462597f, 24.958805f);
                l.lineTo(42.462597f, 24.958805f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = c.a(k, looper);
                a.setColor(-16384);
                l = c.l(looper);
                l.moveTo(33.085453f, 20.821308f);
                l.cubicTo(33.09332f, 20.821308f, 33.101185f, 20.820332f, 33.10905f, 20.820332f);
                l.cubicTo(33.505287f, 20.820332f, 33.89661f, 20.843798f, 34.284f, 20.879f);
                l.lineTo(18.196526f, 4.879f);
                l.cubicTo(11.553879f, 8.305266f, 6.2513633f, 13.943353f, 3.284f, 20.819353f);
                l.lineTo(33.085453f, 20.819353f);
                l.lineTo(33.085453f, 20.821308f);
                l.lineTo(33.085453f, 20.821308f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = c.a(k, looper);
                a.setColor(-9676047);
                l = c.l(looper);
                l.moveTo(46.343616f, 3.879f);
                l.lineTo(46.343616f, 33.680458f);
                l.cubicTo(46.343616f, 34.085213f, 46.32114f, 34.48407f, 46.284f, 34.879f);
                l.lineTo(62.284f, 18.795938f);
                l.cubicTo(58.860386f, 12.149923f, 53.222122f, 6.8458834f, 46.343616f, 3.879f);
                l.lineTo(46.343616f, 3.879f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = c.a(k, looper);
                a.setColor(-5117108);
                l = c.l(looper);
                l.moveTo(4.284f, 48.968616f);
                l.cubicTo(7.704265f, 55.60768f, 13.332067f, 60.90832f, 20.198982f, 63.879f);
                l.lineTo(20.198982f, 34.101467f);
                l.lineTo(20.22439f, 34.101467f);
                l.cubicTo(20.22439f, 34.09361f, 20.223412f, 34.086727f, 20.223412f, 34.07985f);
                l.cubicTo(20.223412f, 33.673996f, 20.245888f, 33.274044f, 20.284f, 32.879f);
                l.lineTo(4.284f, 48.968616f);
                l.lineTo(4.284f, 48.968616f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = c.a(k, looper);
                a.setColor(-10818218);
                l = c.l(looper);
                l.moveTo(24.129469f, 42.824417f);
                l.cubicTo(23.832813f, 42.52342f, 23.550991f, 42.20828f, 23.284f, 41.879f);
                l.lineTo(23.284f, 65.29926f);
                l.cubicTo(26.411741f, 66.31842f, 29.739231f, 66.879f, 33.19725f, 66.879f);
                l.cubicTo(37.469097f, 66.879f, 41.54416f, 66.02954f, 45.284f, 64.50435f);
                l.lineTo(24.09387f, 42.86078f);
                l.lineTo(24.129469f, 42.824417f);
                l.lineTo(24.129469f, 42.824417f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = c.a(k, looper);
                a.setColor(-12799249);
                l = c.l(looper);
                l.moveTo(63.902184f, 21.879f);
                l.lineTo(42.240566f, 43.067806f);
                l.lineTo(42.21834f, 43.04607f);
                l.cubicTo(41.921375f, 43.337547f, 41.608242f, 43.61519f, 41.284f, 43.879f);
                l.lineTo(64.705215f, 43.879f);
                l.cubicTo(65.7244f, 40.754776f, 66.284f, 37.429974f, 66.284f, 33.97475f);
                l.cubicTo(66.284f, 29.698456f, 65.43147f, 25.61977f, 63.902184f, 21.879f);
                l.lineTo(63.902184f, 21.879f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = c.a(k, looper);
                a.setColor(-11083026);
                l = c.l(looper);
                l.moveTo(33.506523f, 46.939556f);
                l.cubicTo(33.094105f, 46.939556f, 32.686596f, 46.91709f, 32.284f, 46.879f);
                l.lineTo(48.36924f, 62.879f);
                l.cubicTo(55.011116f, 59.461384f, 60.313618f, 53.83242f, 63.284f, 46.963978f);
                l.lineTo(33.506523f, 46.963978f);
                l.lineTo(33.506523f, 46.939556f);
                l.lineTo(33.506523f, 46.939556f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = c.a(k, looper);
                a.setColor(-1124019);
                l = c.l(looper);
                l.moveTo(24.35268f, 24.71294f);
                l.cubicTo(24.648964f, 24.42111f, 24.961426f, 24.143131f, 25.284f, 23.879f);
                l.lineTo(1.8574337f, 23.879f);
                l.cubicTo(0.84218466f, 27.000093f, 0.284f, 30.321016f, 0.284f, 33.77153f);
                l.cubicTo(0.284f, 38.05203f, 1.136445f, 42.134678f, 2.6674082f, 45.879f);
                l.lineTo(24.3274f, 24.68821f);
                l.lineTo(24.35268f, 24.71294f);
                l.lineTo(24.35268f, 24.71294f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
