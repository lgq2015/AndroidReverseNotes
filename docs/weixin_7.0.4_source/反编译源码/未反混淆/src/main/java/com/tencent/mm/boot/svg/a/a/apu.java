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

public final class apu extends c {
    private final int height = 291;
    private final int width = 291;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 291;
            case 1:
                return 291;
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
                float[] a = c.a(g, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.462312f);
                h.reset();
                h.setValues(a);
                canvas.concat(h);
                canvas.save();
                Paint a2 = c.a(k, looper);
                Path l = c.l(looper);
                l.moveTo(145.5f, 290.5377f);
                l.cubicTo(225.85744f, 290.5377f, 291.0f, 225.72247f, 291.0f, 145.76884f);
                l.cubicTo(291.0f, 65.815216f, 225.85744f, 1.0f, 145.5f, 1.0f);
                l.cubicTo(65.14257f, 1.0f, 0.0f, 65.815216f, 0.0f, 145.76884f);
                l.cubicTo(0.0f, 225.72247f, 65.14257f, 290.5377f, 145.5f, 290.5377f);
                l.lineTo(145.5f, 290.5377f);
                l.close();
                l.moveTo(145.5f, 286.3819f);
                l.cubicTo(223.55066f, 286.3819f, 286.82324f, 223.42729f, 286.82324f, 145.76884f);
                l.cubicTo(286.82324f, 68.11039f, 223.55066f, 5.155779f, 145.5f, 5.155779f);
                l.cubicTo(67.44933f, 5.155779f, 4.176768f, 68.11039f, 4.176768f, 145.76884f);
                l.cubicTo(4.176768f, 223.42729f, 67.44933f, 286.3819f, 145.5f, 286.3819f);
                l.lineTo(145.5f, 286.3819f);
                l.close();
                k2 = c.k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.FILL);
                Paint k3 = c.k(looper);
                k3.setFlags(385);
                k3.setStyle(Style.STROKE);
                k2.setColor(WebView.NIGHT_MODE_COLOR);
                k3.setStrokeWidth(1.0f);
                k3.setStrokeCap(Cap.BUTT);
                k3.setStrokeJoin(Join.MITER);
                k3.setStrokeMiter(4.0f);
                k3.setPathEffect(null);
                float[] a3 = c.a(a, 291.0f, 0.0f, 0.0f, 0.0f, 290.5377f, 1.0f);
                h.reset();
                h.setValues(a3);
                WeChatSVGRenderC2Java.setLinearGradient(a2, 0.5f, 0.0f, 0.5f, 1.0f, new int[]{-1, -1}, new float[]{0.0f, 1.0f}, h, 0);
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
