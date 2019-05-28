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

public final class ayx extends c {
    private final int height = 72;
    private final int width = 72;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 72;
            case 1:
                return 72;
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
                canvas.save();
                Paint a = c.a(k, looper);
                a.setColor(WebView.NIGHT_MODE_COLOR);
                Path l = c.l(looper);
                l.moveTo(72.0f, 36.444443f);
                l.cubicTo(72.0f, 55.882668f, 55.882668f, 72.0f, 35.555557f, 72.0f);
                l.cubicTo(16.117332f, 72.0f, 0.0f, 55.882668f, 0.0f, 36.444443f);
                l.cubicTo(0.0f, 16.117332f, 16.117332f, 0.0f, 35.555557f, 0.0f);
                l.cubicTo(55.882668f, 0.0f, 72.0f, 16.117332f, 72.0f, 36.444443f);
                l.close();
                l.moveTo(31.091883f, 45.941124f);
                l.lineTo(21.18198f, 36.031223f);
                l.lineTo(18.0f, 39.213203f);
                l.lineTo(28.970562f, 50.183765f);
                l.cubicTo(30.142136f, 51.35534f, 32.04163f, 51.35534f, 33.213203f, 50.183765f);
                l.lineTo(56.21499f, 27.18198f);
                l.lineTo(53.03301f, 24.0f);
                l.lineTo(31.091883f, 45.941124f);
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
