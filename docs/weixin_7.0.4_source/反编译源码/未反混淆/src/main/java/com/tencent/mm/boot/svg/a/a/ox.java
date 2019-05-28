package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class ox extends c {
    private final int height = 80;
    private final int width = 120;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 120;
            case 1:
                return 80;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                c.h(looper);
                c.g(looper);
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
                k = c.a(k, looper);
                k.setColor(-12206054);
                canvas.save();
                Paint a = c.a(k, looper);
                Path l = c.l(looper);
                l.moveTo(46.16f, 67.69f);
                l.cubicTo(68.72f, 45.13f, 91.28f, 22.57f, 113.84f, 0.01f);
                l.cubicTo(115.9f, 2.05f, 117.95f, 4.1f, 119.99f, 6.16f);
                l.cubicTo(95.39f, 30.78f, 70.77f, 55.38f, 46.16f, 79.99f);
                l.cubicTo(30.77f, 64.62f, 15.38f, 49.24f, 0.01f, 33.85f);
                l.cubicTo(2.05f, 31.79f, 4.1f, 29.74f, 6.16f, 27.71f);
                l.cubicTo(19.5f, 41.02f, 32.81f, 54.37f, 46.16f, 67.69f);
                l.lineTo(46.16f, 67.69f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
