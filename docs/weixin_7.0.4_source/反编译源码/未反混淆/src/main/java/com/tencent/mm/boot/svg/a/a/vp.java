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

public final class vp extends c {
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
                canvas.save();
                float[] a = c.a(g, 1.0f, 0.0f, 15.0f, 0.0f, 1.0f, 0.0f);
                h.reset();
                h.setValues(a);
                canvas.concat(h);
                Paint a2 = c.a(k, looper);
                a2.setColor(-1);
                canvas.save();
                Paint a3 = c.a(a2, looper);
                Path l = c.l(looper);
                l.moveTo(60.0f, 0.0f);
                l.lineTo(90.0f, 30.0f);
                l.lineTo(90.0f, 116.0f);
                l.cubicTo(90.0f, 118.20914f, 88.20914f, 120.0f, 86.0f, 120.0f);
                l.lineTo(4.0f, 120.0f);
                l.cubicTo(1.790861f, 120.0f, 2.705415E-16f, 118.20914f, 0.0f, 116.0f);
                l.lineTo(0.0f, 4.0f);
                l.cubicTo(-2.705415E-16f, 1.790861f, 1.790861f, 4.0581224E-16f, 4.0f, 0.0f);
                l.lineTo(60.0f, 0.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a3);
                canvas.restore();
                a2 = c.a(k, looper);
                a2.setColor(201326592);
                canvas.save();
                a3 = c.a(a2, looper);
                l = c.l(looper);
                l.moveTo(60.0f, 0.0f);
                l.lineTo(90.0f, 30.0f);
                l.lineTo(90.0f, 116.0f);
                l.cubicTo(90.0f, 118.20914f, 88.20914f, 120.0f, 86.0f, 120.0f);
                l.lineTo(4.0f, 120.0f);
                l.cubicTo(1.790861f, 120.0f, 2.705415E-16f, 118.20914f, 0.0f, 116.0f);
                l.lineTo(0.0f, 4.0f);
                l.cubicTo(-2.705415E-16f, 1.790861f, 1.790861f, 4.0581224E-16f, 4.0f, 0.0f);
                l.lineTo(60.0f, 0.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a3);
                canvas.restore();
                a3 = c.a(k, looper);
                a3.setColor(WebView.NIGHT_MODE_COLOR);
                l = c.l(looper);
                l.moveTo(90.0f, 30.0f);
                l.lineTo(64.0f, 30.0f);
                l.cubicTo(61.79086f, 30.0f, 60.0f, 28.209139f, 60.0f, 26.0f);
                l.lineTo(60.0f, 0.0f);
                l.lineTo(90.0f, 30.0f);
                l.close();
                canvas.saveLayerAlpha(null, 25, 4);
                k2 = c.a(a3, looper);
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, k2);
                canvas.restore();
                canvas.save();
                k = c.a(k, looper);
                k.setColor(-10461088);
                g = c.a(a, 1.0f, 0.0f, 21.0f, 0.0f, 1.0f, 58.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.saveLayerAlpha(null, 204, 4);
                canvas.save();
                k2 = c.a(k, looper);
                Path l2 = c.l(looper);
                l2.moveTo(-3.5527137E-15f, 13.20906f);
                l2.lineTo(13.891402f, 3.9411764f);
                l2.lineTo(13.891402f, 7.1200304f);
                l2.lineTo(3.5791855f, 14.0f);
                l2.lineTo(13.891402f, 20.87997f);
                l2.lineTo(13.891402f, 24.058823f);
                l2.lineTo(-1.5543122E-15f, 14.79094f);
                l2.lineTo(0.0f, 13.20906f);
                l2.close();
                WeChatSVGRenderC2Java.setFillType(l2, 2);
                canvas.drawPath(l2, k2);
                canvas.restore();
                canvas.save();
                Paint a4 = c.a(k, looper);
                g = c.a(g, -1.0f, 0.0f, 76.23529f, 0.0f, 1.0f, 0.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                l = c.l(looper);
                l.moveTo(31.235294f, 13.20906f);
                l.lineTo(45.126698f, 3.9411764f);
                l.lineTo(45.126698f, 7.1200304f);
                l.lineTo(34.81448f, 14.0f);
                l.lineTo(45.126698f, 20.87997f);
                l.lineTo(45.126698f, 24.058823f);
                l.lineTo(31.235294f, 14.79094f);
                l.lineTo(31.235294f, 13.20906f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a4);
                canvas.restore();
                canvas.save();
                a2 = c.a(k, looper);
                Path l3 = c.l(looper);
                l3.moveTo(26.200712f, 0.0f);
                l3.lineTo(29.377182f, 0.0f);
                l3.lineTo(19.588236f, 28.0f);
                l3.lineTo(16.411764f, 28.0f);
                l3.close();
                WeChatSVGRenderC2Java.setFillType(l3, 1);
                WeChatSVGRenderC2Java.setFillType(l3, 2);
                canvas.drawPath(l3, a2);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
