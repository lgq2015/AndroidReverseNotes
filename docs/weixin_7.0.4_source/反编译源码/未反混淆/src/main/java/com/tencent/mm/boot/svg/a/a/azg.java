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

public final class azg extends c {
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
                g = c.a(g, 1.0f, 0.0f, 14.0f, 0.0f, 1.0f, 14.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a = c.a(k, looper);
                a.setColor(-499359);
                Path l = c.l(looper);
                l.moveTo(44.308483f, 25.29576f);
                l.cubicTo(44.61065f, 25.603817f, 44.89724f, 25.926746f, 45.171368f, 26.262423f);
                l.lineTo(45.171368f, 1.6528872f);
                l.cubicTo(41.89532f, 0.5863713f, 38.409523f, 0.0f, 34.787697f, 0.0f);
                l.cubicTo(30.288454f, 0.0f, 25.996883f, 0.89867777f, 22.060434f, 2.5111988f);
                l.lineTo(44.320946f, 25.284075f);
                l.lineTo(44.308483f, 25.29576f);
                l.lineTo(44.308483f, 25.29576f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = c.a(k, looper);
                a.setColor(-16384);
                l = c.l(looper);
                l.moveTo(34.457825f, 20.949333f);
                l.cubicTo(34.466087f, 20.949333f, 34.47435f, 20.948307f, 34.482613f, 20.948307f);
                l.cubicTo(34.89886f, 20.948307f, 35.309944f, 20.97296f, 35.716896f, 21.00994f);
                l.lineTo(18.817053f, 4.2019877f);
                l.cubicTo(11.838973f, 7.80127f, 6.268697f, 13.724062f, 3.1514907f, 20.947279f);
                l.lineTo(34.457825f, 20.947279f);
                l.lineTo(34.457825f, 20.949333f);
                l.lineTo(34.457825f, 20.949333f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = c.a(k, looper);
                a.setColor(-9676047);
                l = c.l(looper);
                l.moveTo(48.385487f, 3.1514907f);
                l.lineTo(48.385487f, 34.45783f);
                l.cubicTo(48.385487f, 34.883022f, 48.361874f, 35.30202f, 48.322857f, 35.716896f);
                l.lineTo(65.130806f, 18.82169f);
                l.cubicTo(61.534313f, 11.840071f, 55.611336f, 6.2681923f, 48.385487f, 3.1514907f);
                l.lineTo(48.385487f, 3.1514907f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = c.a(k, looper);
                a.setColor(-5117108);
                l = c.l(looper);
                l.moveTo(4.2019877f, 50.517994f);
                l.cubicTo(7.7949657f, 57.492313f, 13.706954f, 63.06062f, 20.920628f, 66.181305f);
                l.lineTo(20.920628f, 34.9001f);
                l.lineTo(20.947317f, 34.9001f);
                l.cubicTo(20.947317f, 34.89184f, 20.946291f, 34.884617f, 20.946291f, 34.87739f);
                l.cubicTo(20.946291f, 34.451042f, 20.969902f, 34.03089f, 21.00994f, 33.615902f);
                l.lineTo(4.2019877f, 50.517994f);
                l.lineTo(4.2019877f, 50.517994f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = c.a(k, looper);
                a.setColor(-10818218);
                l = c.l(looper);
                l.moveTo(25.049591f, 44.06353f);
                l.cubicTo(24.737955f, 43.747334f, 24.441902f, 43.41628f, 24.161428f, 43.070374f);
                l.lineTo(24.161428f, 67.673294f);
                l.cubicTo(27.447113f, 68.743904f, 30.94263f, 69.332794f, 34.575268f, 69.332794f);
                l.cubicTo(39.062828f, 69.332794f, 43.34367f, 68.44044f, 47.27236f, 66.838234f);
                l.lineTo(25.012196f, 44.10173f);
                l.lineTo(25.049591f, 44.06353f);
                l.lineTo(25.049591f, 44.06353f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = c.a(k, looper);
                a.setColor(-12799249);
                l = c.l(looper);
                l.moveTo(66.8307f, 22.060434f);
                l.lineTo(44.07524f, 44.319214f);
                l.lineTo(44.0519f, 44.29638f);
                l.cubicTo(43.739933f, 44.602573f, 43.410988f, 44.894234f, 43.070374f, 45.171368f);
                l.lineTo(67.674286f, 45.171368f);
                l.cubicTo(68.74494f, 41.889378f, 69.332794f, 38.396687f, 69.332794f, 34.766983f);
                l.cubicTo(69.332794f, 30.27475f, 68.43722f, 25.990103f, 66.8307f, 22.060434f);
                l.lineTo(66.8307f, 22.060434f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = c.a(k, looper);
                a.setColor(-11083026);
                l = c.l(looper);
                l.moveTo(34.900158f, 48.386475f);
                l.cubicTo(34.466915f, 48.386475f, 34.03883f, 48.362873f, 33.615902f, 48.322857f);
                l.lineTo(50.513397f, 65.130806f);
                l.cubicTo(57.490665f, 61.54061f, 63.06093f, 55.627407f, 66.181305f, 48.412125f);
                l.lineTo(34.900158f, 48.412125f);
                l.lineTo(34.900158f, 48.386475f);
                l.lineTo(34.900158f, 48.386475f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = c.a(k, looper);
                a.setColor(-1124019);
                l = c.l(looper);
                l.moveTo(25.284075f, 25.037481f);
                l.cubicTo(25.59532f, 24.730915f, 25.92356f, 24.438898f, 26.262423f, 24.161428f);
                l.lineTo(1.6528872f, 24.161428f);
                l.cubicTo(0.5863713f, 27.440128f, 0.0f, 30.928747f, 0.0f, 34.5535f);
                l.cubicTo(0.0f, 39.05015f, 0.89549094f, 43.338963f, 2.503763f, 47.27236f);
                l.lineTo(25.257519f, 25.011501f);
                l.lineTo(25.284075f, 25.037481f);
                l.lineTo(25.284075f, 25.037481f);
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
