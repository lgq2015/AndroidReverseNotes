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

/* renamed from: com.tencent.mm.boot.svg.a.a.c */
public final class C32352c extends C5163c {
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
                Paint a = C5163c.m7876a(k, looper);
                a.setColor(-10197916);
                canvas.save();
                float[] a2 = C5163c.m7878a(g, 1.0f, 0.0f, 129.0f, 0.0f, 1.0f, 40.0f);
                h.reset();
                h.setValues(a2);
                canvas.concat(h);
                canvas.save();
                a = C5163c.m7876a(a, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(52.88f, 2.34f);
                l.cubicTo(83.17f, -0.27f, 113.62f, -0.47f, 143.98f, 0.65f);
                l.cubicTo(164.16f, 1.66f, 184.48f, 2.9f, 204.2f, 7.55f);
                l.cubicTo(208.85f, 9.09f, 214.18f, 9.64f, 217.91f, 13.12f);
                l.cubicTo(220.31f, 15.36f, 220.97f, 18.86f, 221.01f, 22.01f);
                l.cubicTo(221.0f, 85.32f, 220.99f, 148.62f, 221.01f, 211.93f);
                l.cubicTo(216.39f, 210.99f, 211.71f, 210.37f, 207.0f, 210.15f);
                l.lineTo(207.0f, 39.0f);
                l.lineTo(15.0f, 39.0f);
                l.lineTo(15.0f, 349.0f);
                l.cubicTo(49.27f, 349.0f, 83.54f, 348.99f, 117.8f, 349.01f);
                l.cubicTo(129.91f, 372.37f, 152.15f, 390.17f, 177.61f, 396.85f);
                l.cubicTo(150.51f, 399.69f, 123.22f, 400.3f, 95.99f, 399.86f);
                l.cubicTo(76.6f, 399.47f, 57.18f, 398.54f, 37.94f, 395.97f);
                l.cubicTo(27.89f, 394.45f, 17.59f, 393.03f, 8.27f, 388.78f);
                l.cubicTo(3.72f, 386.8f, 0.61f, 382.03f, 0.99f, 377.02f);
                l.cubicTo(1.01f, 258.69f, 0.99f, 140.35f, 1.0f, 22.01f);
                l.cubicTo(0.73f, 17.32f, 3.13f, 12.48f, 7.65f, 10.71f);
                l.cubicTo(22.18f, 5.57f, 37.62f, 3.82f, 52.88f, 2.34f);
                l.lineTo(52.88f, 2.34f);
                l.close();
                l.moveTo(107.37f, 365.4f);
                l.cubicTo(100.42f, 367.88f, 99.38f, 378.51f, 105.75f, 382.26f);
                l.cubicTo(111.42f, 386.43f, 120.38f, 381.97f, 120.53f, 374.95f);
                l.cubicTo(121.31f, 368.17f, 113.58f, 362.48f, 107.37f, 365.4f);
                l.lineTo(107.37f, 365.4f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.restore();
                canvas.save();
                a = C5163c.m7876a(k, looper);
                a.setColor(-11286451);
                a2 = C5163c.m7878a(a2, 1.0f, 0.0f, 236.0f, 0.0f, 1.0f, 250.0f);
                h.reset();
                h.setValues(a2);
                canvas.concat(h);
                canvas.save();
                Paint a3 = C5163c.m7876a(a, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(40.38f, 17.29f);
                l.cubicTo(57.58f, 5.08f, 78.95f, -1.01f, 100.0f, 0.15f);
                l.cubicTo(104.71f, 0.37f, 109.39f, 0.99f, 114.01f, 1.93f);
                l.cubicTo(135.63f, 6.26f, 155.53f, 18.47f, 169.23f, 35.74f);
                l.cubicTo(183.27f, 53.17f, 190.74f, 75.71f, 189.93f, 98.07f);
                l.cubicTo(189.38f, 116.69f, 183.18f, 135.1f, 172.29f, 150.23f);
                l.cubicTo(161.67f, 165.14f, 146.64f, 176.83f, 129.6f, 183.48f);
                l.cubicTo(110.95f, 190.83f, 89.98f, 191.94f, 70.61f, 186.85f);
                l.cubicTo(45.15f, 180.17f, 22.91f, 162.37f, 10.8f, 139.01f);
                l.cubicTo(0.55f, 119.56f, -2.54f, 96.47f, 2.14f, 75.0f);
                l.cubicTo(6.99f, 51.85f, 21.01f, 30.83f, 40.38f, 17.29f);
                l.lineTo(40.38f, 17.29f);
                l.close();
                l.moveTo(69.42f, 54.37f);
                l.cubicTo(64.32f, 63.42f, 66.44f, 74.11f, 66.0f, 84.0f);
                l.cubicTo(61.38f, 84.11f, 56.74f, 83.75f, 52.13f, 84.17f);
                l.cubicTo(50.68f, 84.92f, 51.1f, 86.64f, 50.98f, 87.97f);
                l.cubicTo(51.07f, 104.98f, 50.88f, 121.99f, 51.08f, 139.0f);
                l.cubicTo(50.87f, 140.62f, 52.67f, 141.15f, 53.95f, 140.98f);
                l.cubicTo(80.96f, 141.04f, 107.98f, 140.96f, 135.0f, 141.02f);
                l.cubicTo(136.44f, 140.99f, 139.11f, 141.2f, 138.92f, 139.01f);
                l.cubicTo(139.12f, 122.0f, 138.92f, 104.97f, 139.02f, 87.95f);
                l.cubicTo(138.9f, 86.62f, 139.3f, 84.91f, 137.87f, 84.16f);
                l.cubicTo(133.26f, 83.76f, 128.62f, 84.11f, 124.0f, 84.0f);
                l.cubicTo(123.92f, 77.96f, 124.16f, 71.93f, 123.88f, 65.9f);
                l.cubicTo(123.25f, 54.07f, 114.44f, 43.28f, 103.04f, 40.15f);
                l.cubicTo(90.29f, 36.19f, 75.49f, 42.52f, 69.42f, 54.37f);
                l.lineTo(69.42f, 54.37f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.save();
                a = C5163c.m7876a(a, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(78.3f, 64.93f);
                l.cubicTo(79.7f, 55.97f, 89.18f, 49.4f, 98.07f, 51.29f);
                l.cubicTo(105.53f, 52.53f, 111.64f, 59.33f, 111.92f, 66.92f);
                l.cubicTo(112.13f, 72.6f, 111.93f, 78.3f, 112.0f, 84.0f);
                l.lineTo(78.0f, 84.0f);
                l.cubicTo(78.16f, 77.64f, 77.65f, 71.26f, 78.3f, 64.93f);
                l.lineTo(78.3f, 64.93f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.restore();
                canvas.save();
                k = C5163c.m7876a(k, looper);
                k.setColor(-1);
                g = C5163c.m7878a(a2, 1.0f, 0.0f, 286.0f, 0.0f, 1.0f, 288.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a4 = C5163c.m7876a(k, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(19.42f, 16.37f);
                l.cubicTo(25.49f, 4.52f, 40.29f, -1.81f, 53.04f, 2.15f);
                l.cubicTo(64.44f, 5.28f, 73.25f, 16.07f, 73.88f, 27.9f);
                l.cubicTo(74.16f, 33.93f, 73.92f, 39.96f, 74.0f, 46.0f);
                l.cubicTo(78.62f, 46.11f, 83.26f, 45.76f, 87.87f, 46.16f);
                l.cubicTo(89.3f, 46.91f, 88.9f, 48.62f, 89.02f, 49.95f);
                l.cubicTo(88.92f, 66.97f, 89.12f, 84.0f, 88.92f, 101.01f);
                l.cubicTo(89.11f, 103.2f, 86.44f, 102.99f, 85.0f, 103.02f);
                l.cubicTo(57.98f, 102.96f, 30.96f, 103.04f, 3.95f, 102.98f);
                l.cubicTo(2.67f, 103.15f, 0.87f, 102.62f, 1.08f, 101.0f);
                l.cubicTo(0.88f, 83.99f, 1.07f, 66.98f, 0.98f, 49.97f);
                l.cubicTo(1.1f, 48.64f, 0.68f, 46.92f, 2.13f, 46.17f);
                l.cubicTo(6.74f, 45.75f, 11.38f, 46.11f, 16.0f, 46.0f);
                l.cubicTo(16.44f, 36.11f, 14.32f, 25.42f, 19.42f, 16.37f);
                l.lineTo(19.42f, 16.37f);
                l.close();
                l.moveTo(28.3f, 26.93f);
                l.cubicTo(27.65f, 33.26f, 28.16f, 39.64f, 28.0f, 46.0f);
                l.lineTo(62.0f, 46.0f);
                l.cubicTo(61.93f, 40.3f, 62.13f, 34.6f, 61.92f, 28.92f);
                l.cubicTo(61.64f, 21.33f, 55.53f, 14.53f, 48.07f, 13.29f);
                l.cubicTo(39.18f, 11.4f, 29.7f, 17.97f, 28.3f, 26.93f);
                l.lineTo(28.3f, 26.93f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a4);
                canvas.restore();
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
