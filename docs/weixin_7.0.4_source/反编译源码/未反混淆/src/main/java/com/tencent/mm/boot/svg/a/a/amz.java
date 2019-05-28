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

public final class amz extends c {
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
                Paint a = c.a(k, looper);
                a.setColor(-460552);
                g = c.a(g, 1.0f, 0.0f, 20.0f, 0.0f, 1.0f, 20.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a2 = c.a(a, looper);
                Path l = c.l(looper);
                l.moveTo(1.0f, 1.0f);
                l.cubicTo(2.69737f, -0.3197964f, 4.4556556f, 0.20921189f, 6.0f, 0.0f);
                l.cubicTo(21.349184f, 0.07945513f, 36.734184f, 0.029548686f, 52.0f, 0.0f);
                l.cubicTo(53.89745f, -0.29983383f, 55.955444f, 1.007715f, 56.0f, 3.0f);
                l.cubicTo(56.025375f, 19.303417f, 55.925472f, 35.69269f, 56.0f, 52.0f);
                l.cubicTo(56.25515f, 53.838676f, 55.016357f, 56.02458f, 53.0f, 56.0f);
                l.cubicTo(36.684235f, 56.004616f, 20.330177f, 55.914783f, 4.0f, 56.0f);
                l.cubicTo(2.1978571f, 56.27411f, -0.009990259f, 55.1063f, 3.5527137E-15f, 53.0f);
                l.cubicTo(-0.07992207f, 37.090073f, 0.06993182f, 21.050142f, 3.5527137E-15f, 5.0f);
                l.cubicTo(0.029970778f, 3.4531307f, -0.22977597f, 1.4967982f, 1.0f, 1.0f);
                l.lineTo(1.0f, 1.0f);
                l.close();
                l.moveTo(5.0f, 5.0f);
                l.lineTo(5.0f, 29.0f);
                l.lineTo(29.0f, 29.0f);
                l.lineTo(29.0f, 5.0f);
                l.lineTo(5.0f, 5.0f);
                l.lineTo(5.0f, 5.0f);
                l.close();
                l.moveTo(35.0f, 5.0f);
                l.lineTo(35.0f, 21.0f);
                l.lineTo(51.0f, 21.0f);
                l.lineTo(51.0f, 5.0f);
                l.lineTo(35.0f, 5.0f);
                l.lineTo(35.0f, 5.0f);
                l.close();
                l.moveTo(41.0f, 27.0f);
                l.lineTo(41.0f, 32.0f);
                l.lineTo(32.0f, 32.0f);
                l.lineTo(32.0f, 41.0f);
                l.lineTo(41.0f, 41.0f);
                l.lineTo(41.0f, 46.0f);
                l.lineTo(36.0f, 46.0f);
                l.lineTo(36.0f, 51.0f);
                l.lineTo(51.0f, 51.0f);
                l.lineTo(51.0f, 46.0f);
                l.lineTo(46.0f, 46.0f);
                l.lineTo(46.0f, 41.0f);
                l.lineTo(51.0f, 41.0f);
                l.lineTo(51.0f, 27.0f);
                l.lineTo(41.0f, 27.0f);
                l.lineTo(41.0f, 27.0f);
                l.close();
                l.moveTo(10.0f, 34.0f);
                l.lineTo(10.0f, 39.0f);
                l.lineTo(15.0f, 39.0f);
                l.lineTo(15.0f, 34.0f);
                l.lineTo(10.0f, 34.0f);
                l.lineTo(10.0f, 34.0f);
                l.close();
                l.moveTo(20.0f, 34.0f);
                l.lineTo(20.0f, 39.0f);
                l.lineTo(15.0f, 39.0f);
                l.lineTo(15.0f, 44.0f);
                l.lineTo(25.0f, 44.0f);
                l.lineTo(25.0f, 34.0f);
                l.lineTo(20.0f, 34.0f);
                l.lineTo(20.0f, 34.0f);
                l.close();
                l.moveTo(5.0f, 39.0f);
                l.lineTo(5.0f, 51.0f);
                l.lineTo(14.0f, 51.0f);
                l.lineTo(14.0f, 46.0f);
                l.lineTo(10.0f, 46.0f);
                l.lineTo(10.0f, 39.0f);
                l.lineTo(5.0f, 39.0f);
                l.lineTo(5.0f, 39.0f);
                l.close();
                l.moveTo(25.0f, 44.0f);
                l.lineTo(25.0f, 51.0f);
                l.lineTo(32.0f, 51.0f);
                l.lineTo(32.0f, 44.0f);
                l.lineTo(25.0f, 44.0f);
                l.lineTo(25.0f, 44.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                Paint a3 = c.a(a, looper);
                Path l2 = c.l(looper);
                l2.moveTo(9.0f, 9.0f);
                l2.lineTo(25.0f, 9.0f);
                l2.lineTo(25.0f, 25.0f);
                l2.lineTo(9.0f, 25.0f);
                l2.lineTo(9.0f, 9.0f);
                l2.lineTo(9.0f, 9.0f);
                l2.close();
                WeChatSVGRenderC2Java.setFillType(l2, 2);
                canvas.drawPath(l2, a3);
                canvas.restore();
                canvas.save();
                a3 = c.a(a, looper);
                l2 = c.l(looper);
                l2.moveTo(41.0f, 32.0f);
                l2.lineTo(46.0f, 32.0f);
                l2.lineTo(46.0f, 41.0f);
                l2.lineTo(41.0f, 41.0f);
                l2.lineTo(41.0f, 32.0f);
                l2.lineTo(41.0f, 32.0f);
                l2.close();
                WeChatSVGRenderC2Java.setFillType(l2, 2);
                canvas.drawPath(l2, a3);
                canvas.restore();
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
