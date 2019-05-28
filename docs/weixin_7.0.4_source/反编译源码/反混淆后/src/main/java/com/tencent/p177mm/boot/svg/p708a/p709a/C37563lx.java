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

/* renamed from: com.tencent.mm.boot.svg.a.a.lx */
public final class C37563lx extends C5163c {
    private final int height = 48;
    private final int width = 66;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 66;
            case 1:
                return 48;
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
                C5163c.m7876a(k2, looper).setStrokeWidth(1.0f);
                k2 = C5163c.m7876a(k, looper);
                k2.setColor(-16139513);
                canvas.save();
                Paint a = C5163c.m7876a(k2, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(1.492238E-12f, 4.753689f);
                l.lineTo(1.4921397E-12f, 1.44f);
                l.lineTo(1.4921397E-12f, 1.44f);
                l.cubicTo(1.4920424E-12f, 0.64470994f, 0.64470994f, 5.0310737E-15f, 1.44f, 4.8849813E-15f);
                l.lineTo(1.44f, 7.1054274E-15f);
                l.lineTo(63.440598f, 7.1054274E-15f);
                l.lineTo(63.440598f, 6.8833828E-15f);
                l.cubicTo(64.235886f, 1.0975447E-14f, 64.8806f, 0.64470994f, 64.8806f, 1.44f);
                l.lineTo(64.8806f, 4.7524633f);
                l.cubicTo(63.212986f, 4.838482f, 61.888626f, 6.1519527f, 61.888626f, 7.759649f);
                l.cubicTo(61.888626f, 9.367345f, 63.212986f, 10.680816f, 64.8806f, 10.766834f);
                l.lineTo(64.8806f, 15.700022f);
                l.cubicTo(63.212986f, 15.78604f, 61.888626f, 17.099512f, 61.888626f, 18.707207f);
                l.cubicTo(61.888626f, 20.314903f, 63.212986f, 21.628374f, 64.8806f, 21.714392f);
                l.lineTo(64.8806f, 26.64758f);
                l.cubicTo(63.212986f, 26.733599f, 61.888626f, 28.04707f, 61.888626f, 29.654766f);
                l.cubicTo(61.888626f, 31.26246f, 63.212986f, 32.57593f, 64.8806f, 32.66195f);
                l.lineTo(64.8806f, 37.59514f);
                l.cubicTo(63.212986f, 37.681156f, 61.888626f, 38.99463f, 61.888626f, 40.602325f);
                l.cubicTo(61.888626f, 42.21002f, 63.212986f, 43.52349f, 64.8806f, 43.60951f);
                l.lineTo(64.8806f, 46.403267f);
                l.cubicTo(64.8806f, 47.198555f, 64.235886f, 47.843266f, 63.440598f, 47.843266f);
                l.lineTo(1.44f, 47.843266f);
                l.lineTo(1.44f, 47.843266f);
                l.cubicTo(0.64470994f, 47.843266f, 1.4974544E-12f, 47.198555f, 1.493472E-12f, 46.403267f);
                l.lineTo(1.4933892E-12f, 43.608284f);
                l.cubicTo(1.6570933f, 43.511753f, 2.969651f, 42.20284f, 2.969651f, 40.602325f);
                l.cubicTo(2.969651f, 39.00181f, 1.6570933f, 37.692894f, 1.5220741E-12f, 37.596363f);
                l.lineTo(1.4930648E-12f, 32.660725f);
                l.cubicTo(1.6570933f, 32.564198f, 2.969651f, 31.255281f, 2.969651f, 29.654766f);
                l.cubicTo(2.969651f, 28.054249f, 1.6570933f, 26.745335f, 1.5188684E-12f, 26.648806f);
                l.lineTo(1.4927404E-12f, 21.713167f);
                l.cubicTo(1.6570933f, 21.616638f, 2.969651f, 20.307724f, 2.969651f, 18.707207f);
                l.cubicTo(2.969651f, 17.10669f, 1.6570933f, 15.797776f, 1.5214496E-12f, 15.701247f);
                l.lineTo(1.4924161E-12f, 10.765609f);
                l.cubicTo(1.6570933f, 10.669079f, 2.969651f, 9.360166f, 2.969651f, 7.759649f);
                l.cubicTo(2.969651f, 6.1591315f, 1.6570933f, 4.8502183f, 1.5211582E-12f, 4.753689f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                k = C5163c.m7876a(k, looper);
                k.setColor(-1);
                float[] a2 = C5163c.m7878a(g, 1.0f, 0.0f, 12.766567f, 0.0f, 1.0f, 11.284898f);
                h.reset();
                h.setValues(a2);
                canvas.concat(h);
                canvas.save();
                Paint a3 = C5163c.m7876a(k, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(27.595623f, 4.3071604f);
                l.cubicTo(27.895103f, 4.257804f, 28.206886f, 4.231837f, 28.530052f, 4.231837f);
                l.cubicTo(31.791265f, 4.231837f, 33.893112f, 6.8762636f, 33.893112f, 9.515511f);
                l.cubicTo(33.893112f, 12.0585985f, 32.952255f, 12.706281f, 31.849623f, 14.214129f);
                l.cubicTo(30.38874f, 16.211538f, 32.642963f, 17.07872f, 33.730682f, 17.629368f);
                l.cubicTo(37.6348f, 19.60661f, 39.404655f, 20.372955f, 39.404655f, 21.401474f);
                l.lineTo(39.404655f, 22.687485f);
                l.cubicTo(39.404655f, 23.16594f, 39.036354f, 23.54473f, 38.45894f, 23.54473f);
                l.lineTo(36.02181f, 23.54473f);
                l.lineTo(36.02181f, 22.387041f);
                l.cubicTo(36.02181f, 21.20894f, 31.7092f, 18.685806f, 27.265581f, 16.338505f);
                l.cubicTo(26.625496f, 16.000385f, 25.99978f, 15.9148f, 25.658697f, 15.706315f);
                l.cubicTo(25.719418f, 15.427879f, 25.690248f, 15.114451f, 25.533134f, 14.759604f);
                l.cubicTo(25.69226f, 14.4091625f, 25.996216f, 13.935938f, 26.486708f, 13.281987f);
                l.cubicTo(28.105675f, 11.123124f, 28.233088f, 9.803711f, 28.233088f, 8.206916f);
                l.cubicTo(28.233088f, 7.4495745f, 28.17138f, 5.8157215f, 27.595623f, 4.3071604f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.save();
                a3 = C5163c.m7876a(k, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(13.871522f, 14.759604f);
                l.cubicTo(13.714407f, 15.114451f, 13.685238f, 15.427879f, 13.745958f, 15.706315f);
                l.cubicTo(13.404876f, 15.9148f, 12.7791605f, 16.000385f, 12.139076f, 16.338505f);
                l.cubicTo(7.695457f, 18.685806f, 3.382846f, 21.20894f, 3.382846f, 22.387041f);
                l.lineTo(3.382846f, 23.54473f);
                l.lineTo(0.9457164f, 23.54473f);
                l.cubicTo(0.36830094f, 23.54473f, -3.5527137E-15f, 23.16594f, -3.5527137E-15f, 22.687485f);
                l.lineTo(-3.5527137E-15f, 21.401474f);
                l.cubicTo(-3.5527137E-15f, 20.372955f, 1.7698545f, 19.60661f, 5.673974f, 17.629368f);
                l.cubicTo(6.761694f, 17.07872f, 9.015916f, 16.211538f, 7.5550323f, 14.214129f);
                l.cubicTo(6.452399f, 12.706281f, 5.5115457f, 12.0585985f, 5.5115457f, 9.515511f);
                l.cubicTo(5.5115457f, 6.8762636f, 7.6133895f, 4.231837f, 10.874603f, 4.231837f);
                l.cubicTo(11.19777f, 4.231837f, 11.509552f, 4.257804f, 11.809032f, 4.3071604f);
                l.cubicTo(11.233276f, 5.8157215f, 11.171569f, 7.4495745f, 11.171569f, 8.206916f);
                l.cubicTo(11.171569f, 9.803711f, 11.298982f, 11.123124f, 12.917948f, 13.281987f);
                l.cubicTo(13.408441f, 13.935938f, 13.712396f, 14.4091625f, 13.871522f, 14.759604f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.save();
                a3 = C5163c.m7876a(k, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(12.660459f, 7.1585255f);
                l.cubicTo(12.660459f, 10.603999f, 13.853084f, 11.481504f, 15.25078f, 13.524396f);
                l.cubicTo(17.102594f, 16.230564f, 14.245145f, 17.405455f, 12.866353f, 18.151493f);
                l.cubicTo(7.9174953f, 20.830338f, 5.67403f, 21.868614f, 5.67403f, 23.262089f);
                l.lineTo(5.67403f, 25.004427f);
                l.cubicTo(5.67403f, 25.652655f, 6.1408877f, 26.165854f, 6.872819f, 26.165854f);
                l.lineTo(32.04451f, 26.165854f);
                l.cubicTo(32.776443f, 26.165854f, 33.2433f, 25.652655f, 33.2433f, 25.004427f);
                l.lineTo(33.2433f, 23.262089f);
                l.cubicTo(33.2433f, 21.868614f, 30.999834f, 20.830338f, 26.050976f, 18.151493f);
                l.cubicTo(24.672184f, 17.405455f, 21.814735f, 16.230564f, 23.66655f, 13.524396f);
                l.cubicTo(25.064245f, 11.481504f, 26.25687f, 10.603999f, 26.25687f, 7.1585255f);
                l.cubicTo(26.25687f, 3.5827715f, 23.592575f, 0.0f, 19.458664f, 0.0f);
                l.cubicTo(15.324754f, 0.0f, 12.660459f, 3.5827715f, 12.660459f, 7.1585255f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
