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

public final class azm extends c {
    private final int height = 27;
    private final int width = 42;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 42;
            case 1:
                return 27;
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
                g = c.a(g, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.5f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                k2 = c.a(k, looper);
                k2.setColor(-1);
                Path l = c.l(looper);
                l.moveTo(0.0f, 0.5f);
                l.lineTo(26.0f, 0.5f);
                l.lineTo(26.0f, 24.5f);
                l.lineTo(0.0f, 24.5f);
                l.lineTo(0.0f, 0.5f);
                l.close();
                l.moveTo(2.0f, 2.5f);
                l.lineTo(2.0f, 22.5f);
                l.lineTo(24.0f, 22.5f);
                l.lineTo(24.0f, 2.5f);
                l.lineTo(2.0f, 2.5f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, k2);
                canvas.restore();
                canvas.save();
                g = c.a(g, 1.0f, 0.0f, 27.363636f, 0.0f, 1.0f, 1.090909f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.restore();
                canvas.save();
                Paint a = c.a(k, looper);
                a.setColor(-1);
                Path l2 = c.l(looper);
                l2.moveTo(31.008236f, 11.565939f);
                l2.lineTo(31.002834f, 13.579968f);
                l2.lineTo(39.986187f, 19.714403f);
                l2.lineTo(39.997097f, 5.3252935f);
                l2.lineTo(31.008236f, 11.565939f);
                l2.close();
                l2.moveTo(29.011042f, 10.51777f);
                l2.lineTo(42.0f, 1.5f);
                l2.lineTo(41.983315f, 23.5f);
                l2.lineTo(29.0f, 14.634123f);
                l2.lineTo(29.011042f, 10.51777f);
                l2.close();
                WeChatSVGRenderC2Java.setFillType(l2, 1);
                canvas.drawPath(l2, a);
                canvas.restore();
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
