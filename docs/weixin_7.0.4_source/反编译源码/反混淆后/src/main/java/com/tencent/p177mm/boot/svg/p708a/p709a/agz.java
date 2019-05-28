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

/* renamed from: com.tencent.mm.boot.svg.a.a.agz */
public final class agz extends C5163c {
    private final int height = 480;
    private final int width = 480;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 480;
            case 1:
                return 480;
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
                canvas.save();
                float[] a = C5163c.m7878a(g, 1.0f, 0.0f, 133.0f, 0.0f, 1.0f, 30.0f);
                h.reset();
                h.setValues(a);
                canvas.concat(h);
                Paint a2 = C5163c.m7876a(k, looper);
                a2.setColor(-10197916);
                canvas.save();
                Paint a3 = C5163c.m7876a(a2, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(46.0f, 3.02f);
                l.cubicTo(71.91f, 0.31f, 98.0f, -0.21f, 124.04f, 0.1f);
                l.cubicTo(144.69f, 0.44f, 165.37f, 1.38f, 185.86f, 4.14f);
                l.cubicTo(195.27f, 5.44f, 204.68f, 7.21f, 213.66f, 10.43f);
                l.cubicTo(216.28f, 11.49f, 218.85f, 13.33f, 219.91f, 16.05f);
                l.cubicTo(221.41f, 19.5f, 220.95f, 23.34f, 221.01f, 26.99f);
                l.cubicTo(220.99f, 88.64f, 221.0f, 150.28f, 221.0f, 211.92f);
                l.cubicTo(216.38f, 210.98f, 211.7f, 210.39f, 207.0f, 210.14f);
                l.lineTo(207.0f, 39.0f);
                l.lineTo(15.0f, 39.0f);
                l.lineTo(15.0f, 349.0f);
                l.lineTo(117.8f, 349.0f);
                l.cubicTo(129.92f, 372.38f, 152.18f, 390.21f, 177.67f, 396.86f);
                l.cubicTo(154.52f, 399.26f, 131.24f, 400.06f, 107.98f, 399.99f);
                l.cubicTo(85.99f, 399.85f, 63.96f, 399.12f, 42.11f, 396.51f);
                l.cubicTo(30.89f, 394.98f, 19.42f, 393.55f, 8.92f, 389.1f);
                l.cubicTo(4.08f, 387.2f, 0.57f, 382.32f, 0.99f, 377.03f);
                l.cubicTo(1.01f, 258.68f, 0.99f, 140.34f, 1.01f, 21.99f);
                l.cubicTo(0.73f, 17.3f, 3.14f, 12.48f, 7.65f, 10.71f);
                l.cubicTo(19.99f, 6.32f, 33.03f, 4.46f, 46.0f, 3.02f);
                l.lineTo(46.0f, 3.02f);
                l.lineTo(46.0f, 3.02f);
                l.close();
                l.moveTo(107.32f, 365.42f);
                l.cubicTo(100.42f, 367.94f, 99.4f, 378.51f, 105.73f, 382.26f);
                l.cubicTo(111.39f, 386.41f, 120.33f, 382.02f, 120.53f, 375.02f);
                l.cubicTo(121.36f, 368.19f, 113.56f, 362.44f, 107.32f, 365.42f);
                l.lineTo(107.32f, 365.42f);
                l.lineTo(107.32f, 365.42f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.save();
                a3 = C5163c.m7876a(k, looper);
                a3.setColor(-11286451);
                a = C5163c.m7878a(a, 1.0f, 0.0f, 107.0f, 0.0f, 1.0f, 210.0f);
                h.reset();
                h.setValues(a);
                canvas.concat(h);
                canvas.save();
                a3 = C5163c.m7876a(a3, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(40.42f, 17.27f);
                l.cubicTo(57.6f, 5.08f, 78.97f, -1.01f, 100.0f, 0.15f);
                l.cubicTo(104.7f, 0.38f, 109.38f, 0.98f, 114.0f, 1.92f);
                l.cubicTo(135.63f, 6.26f, 155.55f, 18.48f, 169.25f, 35.77f);
                l.cubicTo(183.48f, 53.43f, 190.94f, 76.34f, 189.89f, 98.99f);
                l.cubicTo(189.14f, 118.74f, 181.97f, 138.16f, 169.71f, 153.66f);
                l.cubicTo(159.17f, 167.15f, 144.89f, 177.65f, 128.9f, 183.76f);
                l.cubicTo(110.4f, 190.87f, 89.68f, 191.87f, 70.53f, 186.84f);
                l.cubicTo(45.11f, 180.13f, 22.9f, 162.35f, 10.8f, 139.0f);
                l.cubicTo(0.54f, 119.54f, -2.54f, 96.43f, 2.15f, 74.94f);
                l.cubicTo(7.02f, 51.8f, 21.04f, 30.8f, 40.42f, 17.27f);
                l.lineTo(40.42f, 17.27f);
                l.close();
                l.moveTo(135.13f, 63.07f);
                l.cubicTo(116.74f, 81.31f, 98.5f, 99.71f, 80.14f, 117.98f);
                l.cubicTo(72.24f, 110.17f, 64.52f, 102.18f, 56.52f, 94.49f);
                l.cubicTo(54.07f, 92.44f, 51.79f, 95.46f, 50.14f, 97.03f);
                l.cubicTo(48.56f, 98.77f, 45.19f, 101.05f, 47.29f, 103.64f);
                l.cubicTo(57.14f, 113.8f, 67.3f, 123.67f, 77.25f, 133.74f);
                l.cubicTo(78.46f, 135.3f, 80.95f, 136.13f, 82.37f, 134.34f);
                l.cubicTo(102.11f, 114.74f, 121.71f, 95.0f, 141.42f, 75.37f);
                l.cubicTo(142.77f, 73.96f, 144.36f, 72.71f, 145.31f, 70.98f);
                l.cubicTo(145.81f, 68.15f, 142.77f, 66.64f, 141.25f, 64.73f);
                l.cubicTo(139.8f, 63.02f, 137.15f, 60.79f, 135.13f, 63.07f);
                l.lineTo(135.13f, 63.07f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.restore();
                canvas.save();
                k = C5163c.m7876a(k, looper);
                k.setColor(-1);
                g = C5163c.m7878a(a, 1.0f, 0.0f, 153.0f, 0.0f, 1.0f, 272.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a4 = C5163c.m7876a(k, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(89.13f, 1.07f);
                l.cubicTo(91.15f, -1.21f, 93.8f, 1.02f, 95.25f, 2.73f);
                l.cubicTo(96.77f, 4.64f, 99.81f, 6.15f, 99.31f, 8.98f);
                l.cubicTo(98.36f, 10.71f, 96.77f, 11.96f, 95.42f, 13.37f);
                l.cubicTo(75.71f, 33.0f, 56.11f, 52.74f, 36.37f, 72.34f);
                l.cubicTo(34.95f, 74.13f, 32.46f, 73.3f, 31.25f, 71.74f);
                l.cubicTo(21.3f, 61.67f, 11.14f, 51.8f, 1.29f, 41.64f);
                l.cubicTo(-0.81f, 39.05f, 2.56f, 36.77f, 4.14f, 35.03f);
                l.cubicTo(5.79f, 33.46f, 8.07f, 30.44f, 10.52f, 32.49f);
                l.cubicTo(18.52f, 40.18f, 26.24f, 48.17f, 34.14f, 55.98f);
                l.cubicTo(52.5f, 37.71f, 70.74f, 19.31f, 89.13f, 1.07f);
                l.lineTo(89.13f, 1.07f);
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
