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

public final class gh extends c {
    private final int height = 96;
    private final int width = 79;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 79;
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
                a.setColor(WebView.NIGHT_MODE_COLOR);
                g = c.a(g, 1.0f, 0.0f, -9.0f, 0.0f, 1.0f, 8.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                a = c.a(a, looper);
                g = c.a(g, 0.70710677f, 0.70710677f, -16.991314f, -0.70710677f, 0.70710677f, 40.313557f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                Path l = c.l(looper);
                l.moveTo(43.16711f, 52.7369f);
                l.cubicTo(54.452175f, 51.26688f, 63.16711f, 41.61657f, 63.16711f, 29.93078f);
                l.cubicTo(63.16711f, 17.228231f, 52.86966f, 6.9307804f, 40.16711f, 6.9307804f);
                l.cubicTo(27.46456f, 6.9307804f, 17.167109f, 17.228231f, 17.167109f, 29.93078f);
                l.cubicTo(17.167109f, 41.61657f, 25.882044f, 51.26688f, 37.16711f, 52.7369f);
                l.lineTo(37.16711f, 73.40037f);
                l.cubicTo(37.16711f, 73.954346f, 37.618084f, 74.403435f, 38.157887f, 74.403435f);
                l.lineTo(42.17633f, 74.403435f);
                l.cubicTo(42.723522f, 74.403435f, 43.16711f, 73.964516f, 43.16711f, 73.40037f);
                l.lineTo(43.16711f, 52.7369f);
                l.lineTo(43.16711f, 52.7369f);
                l.close();
                l.moveTo(40.16711f, 46.930782f);
                l.cubicTo(49.55595f, 46.930782f, 57.16711f, 39.319622f, 57.16711f, 29.93078f);
                l.cubicTo(57.16711f, 20.54194f, 49.55595f, 12.93078f, 40.16711f, 12.93078f);
                l.cubicTo(30.778269f, 12.93078f, 23.167109f, 20.54194f, 23.167109f, 29.93078f);
                l.cubicTo(23.167109f, 39.319622f, 30.778269f, 46.930782f, 40.16711f, 46.930782f);
                l.lineTo(40.16711f, 46.930782f);
                l.lineTo(40.16711f, 46.930782f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
