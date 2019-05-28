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
import com.tencent.view.C31128d;

/* renamed from: com.tencent.mm.boot.svg.a.a.sl */
public final class C37593sl extends C5163c {
    private final int height = 60;
    private final int width = 60;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 60;
            case 1:
                return 60;
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
                k2.setColor(-12040120);
                canvas.saveLayerAlpha(null, C31128d.MIC_PTU_SHIGUANG, 4);
                canvas.save();
                Paint a = C5163c.m7876a(k2, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(27.26f, 0.0f);
                l.lineTo(32.6f, 0.0f);
                l.cubicTo(46.68f, 1.16f, 58.73f, 13.18f, 60.0f, 27.24f);
                l.lineTo(60.0f, 32.6f);
                l.cubicTo(58.84f, 46.68f, 46.82f, 58.72f, 32.76f, 60.0f);
                l.lineTo(27.37f, 60.0f);
                l.cubicTo(13.3f, 58.82f, 1.27f, 46.81f, 0.0f, 32.76f);
                l.lineTo(0.0f, 27.38f);
                l.cubicTo(1.17f, 13.3f, 13.2f, 1.26f, 27.26f, 0.0f);
                l.lineTo(27.26f, 0.0f);
                l.close();
                l.moveTo(26.24f, 2.26f);
                l.cubicTo(12.44f, 3.91f, 1.18f, 17.11f, 2.04f, 31.04f);
                l.cubicTo(2.23f, 45.91f, 16.12f, 58.89f, 30.99f, 57.97f);
                l.cubicTo(45.9f, 57.8f, 58.9f, 43.88f, 57.96f, 28.98f);
                l.cubicTo(57.82f, 13.07f, 41.98f, -0.35f, 26.24f, 2.26f);
                l.lineTo(26.24f, 2.26f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.restore();
                canvas.save();
                a = C5163c.m7876a(k, looper);
                a.setColor(-1);
                g = C5163c.m7878a(g, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                a = C5163c.m7876a(a, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(25.24f, 1.26f);
                l.cubicTo(40.98f, -1.35f, 56.82f, 12.07f, 56.96f, 27.98f);
                l.cubicTo(57.9f, 42.88f, 44.9f, 56.8f, 29.99f, 56.97f);
                l.cubicTo(15.12f, 57.89f, 1.23f, 44.91f, 1.04f, 30.04f);
                l.cubicTo(0.18f, 16.11f, 11.44f, 2.91f, 25.24f, 1.26f);
                l.lineTo(25.24f, 1.26f);
                l.close();
                l.moveTo(15.83f, 19.89f);
                l.cubicTo(18.61f, 23.11f, 21.82f, 25.92f, 24.75f, 29.0f);
                l.cubicTo(21.81f, 32.09f, 18.58f, 34.91f, 15.8f, 38.15f);
                l.cubicTo(14.21f, 40.6f, 17.43f, 43.8f, 19.87f, 42.19f);
                l.cubicTo(23.1f, 39.4f, 25.92f, 36.19f, 29.0f, 33.25f);
                l.cubicTo(32.11f, 36.2f, 34.94f, 39.45f, 38.2f, 42.24f);
                l.cubicTo(40.67f, 43.73f, 43.8f, 40.53f, 42.17f, 38.11f);
                l.cubicTo(39.39f, 34.89f, 36.18f, 32.08f, 33.25f, 29.0f);
                l.cubicTo(36.19f, 25.91f, 39.41f, 23.09f, 42.19f, 19.87f);
                l.cubicTo(43.79f, 17.42f, 40.6f, 14.22f, 38.14f, 15.8f);
                l.cubicTo(34.91f, 18.58f, 32.09f, 21.81f, 29.0f, 24.75f);
                l.cubicTo(25.92f, 21.82f, 23.11f, 18.61f, 19.89f, 15.83f);
                l.cubicTo(17.44f, 14.17f, 14.15f, 17.44f, 15.83f, 19.89f);
                l.lineTo(15.83f, 19.89f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.restore();
                canvas.save();
                k = C5163c.m7876a(k, looper);
                k.setColor(-11711155);
                float[] a2 = C5163c.m7878a(g, 1.0f, 0.0f, 16.0f, 0.0f, 1.0f, 16.0f);
                h.reset();
                h.setValues(a2);
                canvas.concat(h);
                canvas.save();
                Paint a3 = C5163c.m7876a(k, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(0.83f, 4.89f);
                l.cubicTo(-0.85f, 2.44f, 2.44f, -0.83f, 4.89f, 0.83f);
                l.cubicTo(8.11f, 3.61f, 10.92f, 6.82f, 14.0f, 9.75f);
                l.cubicTo(17.09f, 6.81f, 19.91f, 3.58f, 23.14f, 0.8f);
                l.cubicTo(25.6f, -0.78f, 28.79f, 2.42f, 27.19f, 4.87f);
                l.cubicTo(24.41f, 8.09f, 21.19f, 10.91f, 18.25f, 14.0f);
                l.cubicTo(21.18f, 17.08f, 24.39f, 19.89f, 27.17f, 23.11f);
                l.cubicTo(28.8f, 25.53f, 25.67f, 28.73f, 23.2f, 27.24f);
                l.cubicTo(19.94f, 24.45f, 17.11f, 21.2f, 14.0f, 18.25f);
                l.cubicTo(10.92f, 21.19f, 8.1f, 24.4f, 4.87f, 27.19f);
                l.cubicTo(2.43f, 28.8f, -0.79f, 25.6f, 0.8f, 23.15f);
                l.cubicTo(3.58f, 19.91f, 6.81f, 17.09f, 9.75f, 14.0f);
                l.cubicTo(6.82f, 10.92f, 3.61f, 8.11f, 0.83f, 4.89f);
                l.lineTo(0.83f, 4.89f);
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
