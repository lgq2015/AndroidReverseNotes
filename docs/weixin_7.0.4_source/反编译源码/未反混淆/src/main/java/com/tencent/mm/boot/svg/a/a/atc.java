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

public final class atc extends c {
    private final int height = 120;
    private final int width = 120;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 120;
            case 1:
                return 120;
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
                k2 = c.a(k, looper);
                k2.setColor(-2565928);
                canvas.save();
                Paint a = c.a(k2, looper);
                Path l = c.l(looper);
                l.moveTo(11.0f, 28.995184f);
                l.cubicTo(11.0f, 25.684135f, 13.680192f, 23.0f, 16.998913f, 23.0f);
                l.lineTo(50.001087f, 23.0f);
                l.cubicTo(53.314194f, 23.0f, 56.0f, 25.686537f, 56.0f, 28.995184f);
                l.lineTo(56.0f, 50.004818f);
                l.cubicTo(56.0f, 53.315865f, 53.31981f, 56.0f, 50.001087f, 56.0f);
                l.lineTo(16.998913f, 56.0f);
                l.cubicTo(13.685804f, 56.0f, 11.0f, 53.313465f, 11.0f, 50.004818f);
                l.lineTo(11.0f, 28.995184f);
                l.close();
                l.moveTo(14.0f, 28.992634f);
                l.cubicTo(14.0f, 27.339848f, 15.342468f, 26.0f, 16.995506f, 26.0f);
                l.lineTo(50.004494f, 26.0f);
                l.cubicTo(51.658867f, 26.0f, 53.0f, 27.338934f, 53.0f, 28.992634f);
                l.lineTo(53.0f, 50.007366f);
                l.cubicTo(53.0f, 51.660152f, 51.65753f, 53.0f, 50.004494f, 53.0f);
                l.lineTo(16.995506f, 53.0f);
                l.cubicTo(15.341134f, 53.0f, 14.0f, 51.661064f, 14.0f, 50.007366f);
                l.lineTo(14.0f, 28.992634f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                Paint a2 = c.a(k, looper);
                l = c.l(looper);
                l.moveTo(11.0f, 28.995184f);
                l.cubicTo(11.0f, 25.684135f, 13.680192f, 23.0f, 16.998913f, 23.0f);
                l.lineTo(50.001087f, 23.0f);
                l.cubicTo(53.314194f, 23.0f, 56.0f, 25.686537f, 56.0f, 28.995184f);
                l.lineTo(56.0f, 50.004818f);
                l.cubicTo(56.0f, 53.315865f, 53.31981f, 56.0f, 50.001087f, 56.0f);
                l.lineTo(16.998913f, 56.0f);
                l.cubicTo(13.685804f, 56.0f, 11.0f, 53.313465f, 11.0f, 50.004818f);
                l.lineTo(11.0f, 28.995184f);
                l.close();
                l.moveTo(14.0f, 28.992634f);
                l.cubicTo(14.0f, 27.339848f, 15.342468f, 26.0f, 16.995506f, 26.0f);
                l.lineTo(50.004494f, 26.0f);
                l.cubicTo(51.658867f, 26.0f, 53.0f, 27.338934f, 53.0f, 28.992634f);
                l.lineTo(53.0f, 50.007366f);
                l.cubicTo(53.0f, 51.660152f, 51.65753f, 53.0f, 50.004494f, 53.0f);
                l.lineTo(16.995506f, 53.0f);
                l.cubicTo(15.341134f, 53.0f, 14.0f, 51.661064f, 14.0f, 50.007366f);
                l.lineTo(14.0f, 28.992634f);
                l.close();
                Paint k3 = c.k(looper);
                k3.setFlags(385);
                k3.setStyle(Style.FILL);
                Paint k4 = c.k(looper);
                k4.setFlags(385);
                k4.setStyle(Style.STROKE);
                k3.setColor(WebView.NIGHT_MODE_COLOR);
                k4.setStrokeWidth(1.0f);
                k4.setStrokeCap(Cap.BUTT);
                k4.setStrokeJoin(Join.MITER);
                k4.setStrokeMiter(4.0f);
                k4.setPathEffect(null);
                float[] a3 = c.a(g, 56.0f, 0.0f, 11.0f, 0.0f, 56.0f, 23.0f);
                h.reset();
                h.setValues(a3);
                WeChatSVGRenderC2Java.setLinearGradient(a2, 0.5f, 0.0f, 0.5f, 1.0f, new int[]{-11714, -25333}, new float[]{0.0f, 1.0f}, h, 0);
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a2);
                canvas.restore();
                k2 = c.a(k, looper);
                k2.setColor(-2565928);
                canvas.save();
                a = c.a(k2, looper);
                l = c.l(looper);
                l.moveTo(11.0f, 70.995186f);
                l.cubicTo(11.0f, 67.684135f, 13.680192f, 65.0f, 16.998913f, 65.0f);
                l.lineTo(50.001087f, 65.0f);
                l.cubicTo(53.314194f, 65.0f, 56.0f, 67.68654f, 56.0f, 70.995186f);
                l.lineTo(56.0f, 92.004814f);
                l.cubicTo(56.0f, 95.315865f, 53.31981f, 98.0f, 50.001087f, 98.0f);
                l.lineTo(16.998913f, 98.0f);
                l.cubicTo(13.685804f, 98.0f, 11.0f, 95.31346f, 11.0f, 92.004814f);
                l.lineTo(11.0f, 70.995186f);
                l.close();
                l.moveTo(14.0f, 70.99264f);
                l.cubicTo(14.0f, 69.33985f, 15.342468f, 68.0f, 16.995506f, 68.0f);
                l.lineTo(50.004494f, 68.0f);
                l.cubicTo(51.658867f, 68.0f, 53.0f, 69.338936f, 53.0f, 70.99264f);
                l.lineTo(53.0f, 92.00736f);
                l.cubicTo(53.0f, 93.66015f, 51.65753f, 95.0f, 50.004494f, 95.0f);
                l.lineTo(16.995506f, 95.0f);
                l.cubicTo(15.341134f, 95.0f, 14.0f, 93.661064f, 14.0f, 92.00736f);
                l.lineTo(14.0f, 70.99264f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a2 = c.a(k, looper);
                l = c.l(looper);
                l.moveTo(11.0f, 70.995186f);
                l.cubicTo(11.0f, 67.684135f, 13.680192f, 65.0f, 16.998913f, 65.0f);
                l.lineTo(50.001087f, 65.0f);
                l.cubicTo(53.314194f, 65.0f, 56.0f, 67.68654f, 56.0f, 70.995186f);
                l.lineTo(56.0f, 92.004814f);
                l.cubicTo(56.0f, 95.315865f, 53.31981f, 98.0f, 50.001087f, 98.0f);
                l.lineTo(16.998913f, 98.0f);
                l.cubicTo(13.685804f, 98.0f, 11.0f, 95.31346f, 11.0f, 92.004814f);
                l.lineTo(11.0f, 70.995186f);
                l.close();
                l.moveTo(14.0f, 70.99264f);
                l.cubicTo(14.0f, 69.33985f, 15.342468f, 68.0f, 16.995506f, 68.0f);
                l.lineTo(50.004494f, 68.0f);
                l.cubicTo(51.658867f, 68.0f, 53.0f, 69.338936f, 53.0f, 70.99264f);
                l.lineTo(53.0f, 92.00736f);
                l.cubicTo(53.0f, 93.66015f, 51.65753f, 95.0f, 50.004494f, 95.0f);
                l.lineTo(16.995506f, 95.0f);
                l.cubicTo(15.341134f, 95.0f, 14.0f, 93.661064f, 14.0f, 92.00736f);
                l.lineTo(14.0f, 70.99264f);
                l.close();
                k3 = c.k(looper);
                k3.setFlags(385);
                k3.setStyle(Style.FILL);
                k4 = c.k(looper);
                k4.setFlags(385);
                k4.setStyle(Style.STROKE);
                k3.setColor(WebView.NIGHT_MODE_COLOR);
                k4.setStrokeWidth(1.0f);
                k4.setStrokeCap(Cap.BUTT);
                k4.setStrokeJoin(Join.MITER);
                k4.setStrokeMiter(4.0f);
                k4.setPathEffect(null);
                a3 = c.a(a3, 56.0f, 0.0f, 11.0f, 0.0f, 98.0f, 65.0f);
                h.reset();
                h.setValues(a3);
                WeChatSVGRenderC2Java.setLinearGradient(a2, 0.5f, 0.0f, 0.5f, 1.0f, new int[]{-25552, -45990}, new float[]{0.0f, 1.0f}, h, 0);
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a2);
                canvas.restore();
                k2 = c.a(k, looper);
                k2.setColor(-2565928);
                canvas.save();
                a = c.a(k2, looper);
                l = c.l(looper);
                l.moveTo(64.0f, 70.995186f);
                l.cubicTo(64.0f, 67.684135f, 66.68019f, 65.0f, 69.99891f, 65.0f);
                l.lineTo(103.00109f, 65.0f);
                l.cubicTo(106.31419f, 65.0f, 109.0f, 67.68654f, 109.0f, 70.995186f);
                l.lineTo(109.0f, 92.004814f);
                l.cubicTo(109.0f, 95.315865f, 106.31981f, 98.0f, 103.00109f, 98.0f);
                l.lineTo(69.99891f, 98.0f);
                l.cubicTo(66.68581f, 98.0f, 64.0f, 95.31346f, 64.0f, 92.004814f);
                l.lineTo(64.0f, 70.995186f);
                l.close();
                l.moveTo(67.0f, 70.99264f);
                l.cubicTo(67.0f, 69.33985f, 68.34247f, 68.0f, 69.99551f, 68.0f);
                l.lineTo(103.00449f, 68.0f);
                l.cubicTo(104.65887f, 68.0f, 106.0f, 69.338936f, 106.0f, 70.99264f);
                l.lineTo(106.0f, 92.00736f);
                l.cubicTo(106.0f, 93.66015f, 104.65753f, 95.0f, 103.00449f, 95.0f);
                l.lineTo(69.99551f, 95.0f);
                l.cubicTo(68.34113f, 95.0f, 67.0f, 93.661064f, 67.0f, 92.00736f);
                l.lineTo(67.0f, 70.99264f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a2 = c.a(k, looper);
                l = c.l(looper);
                l.moveTo(64.0f, 70.995186f);
                l.cubicTo(64.0f, 67.684135f, 66.68019f, 65.0f, 69.99891f, 65.0f);
                l.lineTo(103.00109f, 65.0f);
                l.cubicTo(106.31419f, 65.0f, 109.0f, 67.68654f, 109.0f, 70.995186f);
                l.lineTo(109.0f, 92.004814f);
                l.cubicTo(109.0f, 95.315865f, 106.31981f, 98.0f, 103.00109f, 98.0f);
                l.lineTo(69.99891f, 98.0f);
                l.cubicTo(66.68581f, 98.0f, 64.0f, 95.31346f, 64.0f, 92.004814f);
                l.lineTo(64.0f, 70.995186f);
                l.close();
                l.moveTo(67.0f, 70.99264f);
                l.cubicTo(67.0f, 69.33985f, 68.34247f, 68.0f, 69.99551f, 68.0f);
                l.lineTo(103.00449f, 68.0f);
                l.cubicTo(104.65887f, 68.0f, 106.0f, 69.338936f, 106.0f, 70.99264f);
                l.lineTo(106.0f, 92.00736f);
                l.cubicTo(106.0f, 93.66015f, 104.65753f, 95.0f, 103.00449f, 95.0f);
                l.lineTo(69.99551f, 95.0f);
                l.cubicTo(68.34113f, 95.0f, 67.0f, 93.661064f, 67.0f, 92.00736f);
                l.lineTo(67.0f, 70.99264f);
                l.close();
                k3 = c.k(looper);
                k3.setFlags(385);
                k3.setStyle(Style.FILL);
                k4 = c.k(looper);
                k4.setFlags(385);
                k4.setStyle(Style.STROKE);
                k3.setColor(WebView.NIGHT_MODE_COLOR);
                k4.setStrokeWidth(1.0f);
                k4.setStrokeCap(Cap.BUTT);
                k4.setStrokeJoin(Join.MITER);
                k4.setStrokeMiter(4.0f);
                k4.setPathEffect(null);
                a3 = c.a(a3, 109.0f, 0.0f, 64.0f, 0.0f, 98.0f, 65.0f);
                h.reset();
                h.setValues(a3);
                WeChatSVGRenderC2Java.setLinearGradient(a2, 0.5f, 0.0f, 0.5f, 1.0f, new int[]{-16586802, -14299913}, new float[]{0.0f, 1.0f}, h, 0);
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a2);
                canvas.restore();
                k2 = c.a(k, looper);
                k2.setColor(-2565928);
                canvas.save();
                a = c.a(k2, looper);
                l = c.l(looper);
                l.moveTo(64.0f, 29.0f);
                l.cubicTo(64.0f, 25.68629f, 66.686295f, 23.0f, 70.0f, 23.0f);
                l.lineTo(103.0f, 23.0f);
                l.cubicTo(106.313705f, 23.0f, 109.0f, 25.68629f, 109.0f, 29.0f);
                l.lineTo(109.0f, 50.0f);
                l.cubicTo(109.0f, 53.31371f, 106.313705f, 56.0f, 103.0f, 56.0f);
                l.lineTo(70.0f, 56.0f);
                l.cubicTo(66.686295f, 56.0f, 64.0f, 53.31371f, 64.0f, 50.0f);
                l.lineTo(64.0f, 29.0f);
                l.close();
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                k = c.a(k, looper);
                l = c.l(looper);
                l.moveTo(64.0f, 29.0f);
                l.cubicTo(64.0f, 25.68629f, 66.686295f, 23.0f, 70.0f, 23.0f);
                l.lineTo(103.0f, 23.0f);
                l.cubicTo(106.313705f, 23.0f, 109.0f, 25.68629f, 109.0f, 29.0f);
                l.lineTo(109.0f, 50.0f);
                l.cubicTo(109.0f, 53.31371f, 106.313705f, 56.0f, 103.0f, 56.0f);
                l.lineTo(70.0f, 56.0f);
                l.cubicTo(66.686295f, 56.0f, 64.0f, 53.31371f, 64.0f, 50.0f);
                l.lineTo(64.0f, 29.0f);
                l.close();
                k3 = c.k(looper);
                k3.setFlags(385);
                k3.setStyle(Style.FILL);
                k4 = c.k(looper);
                k4.setFlags(385);
                k4.setStyle(Style.STROKE);
                k3.setColor(WebView.NIGHT_MODE_COLOR);
                k4.setStrokeWidth(1.0f);
                k4.setStrokeCap(Cap.BUTT);
                k4.setStrokeJoin(Join.MITER);
                k4.setStrokeMiter(4.0f);
                k4.setPathEffect(null);
                float[] a4 = c.a(a3, 45.0f, 0.0f, 64.0f, 0.0f, 33.0f, 23.0f);
                h.reset();
                h.setValues(a4);
                WeChatSVGRenderC2Java.setLinearGradient(k, 0.5f, 0.0f, 0.5f, 1.0f, new int[]{-5899509, -10428836}, new float[]{0.0f, 1.0f}, h, 0);
                canvas.drawPath(l, k);
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
