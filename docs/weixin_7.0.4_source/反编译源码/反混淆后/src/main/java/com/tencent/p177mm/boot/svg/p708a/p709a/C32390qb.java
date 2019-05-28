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

/* renamed from: com.tencent.mm.boot.svg.a.a.qb */
public final class C32390qb extends C5163c {
    private final int height = 96;
    private final int width = 96;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 96;
            case 1:
                return 96;
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
                Paint a = C5163c.m7876a(k, looper);
                a.setColor(-9473160);
                canvas.save();
                float[] a2 = C5163c.m7878a(g, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 17.0f);
                h.reset();
                h.setValues(a2);
                canvas.concat(h);
                canvas.save();
                Paint a3 = C5163c.m7876a(a, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(45.0513f, 58.846f);
                l.lineTo(48.5133f, 60.0f);
                l.lineTo(32.4863f, 60.0f);
                l.lineTo(35.9483f, 58.846f);
                l.lineTo(38.0003f, 58.162f);
                l.lineTo(38.0003f, 56.0f);
                l.lineTo(38.0003f, 52.0f);
                l.lineTo(43.0003f, 52.0f);
                l.lineTo(43.0003f, 56.0f);
                l.lineTo(43.0003f, 58.162f);
                l.lineTo(45.0513f, 58.846f);
                l.close();
                l.moveTo(35.0003f, 49.0f);
                l.lineTo(3.0003f, 49.0f);
                l.lineTo(3.0003f, 3.0f);
                l.lineTo(77.0003f, 3.0f);
                l.lineTo(77.0003f, 29.0f);
                l.lineTo(80.0003f, 29.0f);
                l.lineTo(80.0003f, 2.87f);
                l.cubicTo(80.0003f, 1.285f, 78.7143f, 0.0f, 77.1293f, 0.0f);
                l.lineTo(2.8713f, 0.0f);
                l.cubicTo(1.2893f, 0.0f, 3.0E-4f, 1.285f, 3.0E-4f, 2.87f);
                l.lineTo(3.0E-4f, 49.13f);
                l.cubicTo(3.0E-4f, 50.715f, 1.2853f, 52.0f, 2.8713f, 52.0f);
                l.lineTo(35.0003f, 52.0f);
                l.lineTo(35.0003f, 56.0f);
                l.lineTo(23.0003f, 60.0f);
                l.lineTo(23.0003f, 63.0f);
                l.lineTo(58.0003f, 63.0f);
                l.lineTo(58.0003f, 60.0f);
                l.lineTo(46.0003f, 56.0f);
                l.lineTo(46.0003f, 52.0f);
                l.lineTo(59.0003f, 52.0f);
                l.lineTo(59.0003f, 49.0f);
                l.lineTo(46.0003f, 49.0f);
                l.lineTo(35.0003f, 49.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.save();
                g = C5163c.m7878a(a2, 1.0f, 0.0f, 60.0f, 0.0f, 1.0f, 30.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a4 = C5163c.m7876a(a, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(25.5f, 28.6132f);
                l.cubicTo(25.5f, 29.3782f, 24.881f, 30.0002f, 24.132f, 30.0002f);
                l.lineTo(4.868f, 30.0002f);
                l.cubicTo(4.11f, 30.0002f, 3.5f, 29.3872f, 3.5f, 28.6132f);
                l.lineTo(3.5f, 14.3872f);
                l.cubicTo(3.5f, 13.6222f, 4.119f, 13.0002f, 4.868f, 13.0002f);
                l.lineTo(24.132f, 13.0002f);
                l.cubicTo(24.89f, 13.0002f, 25.5f, 13.6122f, 25.5f, 14.3872f);
                l.lineTo(25.5f, 28.6132f);
                l.close();
                l.moveTo(9.0f, 5.4992f);
                l.cubicTo(9.0f, 4.3952f, 9.9f, 3.5002f, 10.992f, 3.5002f);
                l.lineTo(18.008f, 3.5002f);
                l.cubicTo(19.108f, 3.5002f, 20.0f, 4.3872f, 20.0f, 5.4992f);
                l.lineTo(20.0f, 10.0002f);
                l.lineTo(9.0f, 10.0002f);
                l.lineTo(9.0f, 5.4992f);
                l.close();
                l.moveTo(24.132f, 10.0002f);
                l.lineTo(23.0f, 10.0002f);
                l.lineTo(23.0f, 6.2542f);
                l.cubicTo(23.0f, 3.0742f, 20.423f, 0.5002f, 17.245f, 0.5002f);
                l.lineTo(11.755f, 0.5002f);
                l.cubicTo(8.582f, 0.5002f, 6.0f, 3.0762f, 6.0f, 6.2542f);
                l.lineTo(6.0f, 10.0002f);
                l.lineTo(4.868f, 10.0002f);
                l.cubicTo(2.459f, 10.0002f, 0.5f, 11.9682f, 0.5f, 14.3872f);
                l.lineTo(0.5f, 28.6132f);
                l.cubicTo(0.5f, 31.0422f, 2.45f, 33.0002f, 4.868f, 33.0002f);
                l.lineTo(24.132f, 33.0002f);
                l.cubicTo(26.541f, 33.0002f, 28.5f, 31.0322f, 28.5f, 28.6132f);
                l.lineTo(28.5f, 14.3872f);
                l.cubicTo(28.5f, 11.9582f, 26.55f, 10.0002f, 24.132f, 10.0002f);
                l.lineTo(24.132f, 10.0002f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a4);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
