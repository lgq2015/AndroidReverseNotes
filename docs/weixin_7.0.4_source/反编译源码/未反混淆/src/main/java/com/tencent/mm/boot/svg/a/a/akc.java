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

public final class akc extends c {
    private final int height = 107;
    private final int width = 107;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 107;
            case 1:
                return 107;
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
                k.setColor(-1);
                canvas.save();
                Paint a = c.a(k, looper);
                Path l = c.l(looper);
                l.moveTo(29.0f, 22.005177f);
                l.cubicTo(29.0f, 20.897749f, 29.90195f, 20.0f, 31.00853f, 20.0f);
                l.lineTo(38.99147f, 20.0f);
                l.cubicTo(40.10075f, 20.0f, 41.0f, 20.89647f, 41.0f, 22.005177f);
                l.lineTo(41.0f, 84.99482f);
                l.cubicTo(41.0f, 86.10225f, 40.09805f, 87.0f, 38.99147f, 87.0f);
                l.lineTo(31.00853f, 87.0f);
                l.cubicTo(29.89925f, 87.0f, 29.0f, 86.10353f, 29.0f, 84.99482f);
                l.lineTo(29.0f, 22.005177f);
                l.close();
                l.moveTo(66.0f, 22.005177f);
                l.cubicTo(66.0f, 20.897749f, 66.90195f, 20.0f, 68.00853f, 20.0f);
                l.lineTo(75.99147f, 20.0f);
                l.cubicTo(77.10075f, 20.0f, 78.0f, 20.89647f, 78.0f, 22.005177f);
                l.lineTo(78.0f, 84.99482f);
                l.cubicTo(78.0f, 86.10225f, 77.09805f, 87.0f, 75.99147f, 87.0f);
                l.lineTo(68.00853f, 87.0f);
                l.cubicTo(66.89925f, 87.0f, 66.0f, 86.10353f, 66.0f, 84.99482f);
                l.lineTo(66.0f, 22.005177f);
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
