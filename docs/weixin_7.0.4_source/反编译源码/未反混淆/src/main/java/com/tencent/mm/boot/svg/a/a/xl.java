package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class xl extends c {
    private final int height = 14;
    private final int width = 57;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 57;
            case 1:
                return 14;
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
                a.setColor(-3684404);
                g = c.a(g, 1.0f, 0.0f, -799.0f, 0.0f, 1.0f, -836.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                g = c.a(g, 1.0f, 0.0f, 203.0f, 0.0f, 1.0f, 793.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                g = c.a(g, 1.0f, 0.0f, 596.4823f, 0.0f, 1.0f, 43.304348f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a2 = c.a(a, looper);
                Path l = c.l(looper);
                l.moveTo(6.4615383f, 0.0f);
                l.cubicTo(10.030148f, 0.0f, 12.923077f, 2.9101489f, 12.923077f, 6.5f);
                l.cubicTo(12.923077f, 10.089851f, 10.030148f, 13.0f, 6.4615383f, 13.0f);
                l.cubicTo(2.892929f, 13.0f, 0.0f, 10.089851f, 0.0f, 6.5f);
                l.cubicTo(0.0f, 2.9101489f, 2.892929f, 0.0f, 6.4615383f, 0.0f);
                l.close();
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(a, looper);
                l = c.l(looper);
                l.moveTo(28.0f, 0.0f);
                l.cubicTo(31.56861f, 0.0f, 34.46154f, 2.9101489f, 34.46154f, 6.5f);
                l.cubicTo(34.46154f, 10.089851f, 31.56861f, 13.0f, 28.0f, 13.0f);
                l.cubicTo(24.43139f, 13.0f, 21.538462f, 10.089851f, 21.538462f, 6.5f);
                l.cubicTo(21.538462f, 2.9101489f, 24.43139f, 0.0f, 28.0f, 0.0f);
                l.close();
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(a, looper);
                l = c.l(looper);
                l.moveTo(49.53846f, 0.0f);
                l.cubicTo(53.10707f, 0.0f, 56.0f, 2.9101489f, 56.0f, 6.5f);
                l.cubicTo(56.0f, 10.089851f, 53.10707f, 13.0f, 49.53846f, 13.0f);
                l.cubicTo(45.96985f, 13.0f, 43.07692f, 10.089851f, 43.07692f, 6.5f);
                l.cubicTo(43.07692f, 2.9101489f, 45.96985f, 0.0f, 49.53846f, 0.0f);
                l.close();
                canvas.drawPath(l, a2);
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
