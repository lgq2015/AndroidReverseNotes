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

public final class mu extends c {
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
                a.setColor(-15028967);
                Path l = c.l(looper);
                l.moveTo(31.8912f, 55.674f);
                l.lineTo(26.0892f, 49.959f);
                l.cubicTo(30.0582f, 46.524f, 32.5602f, 41.505f, 32.5602f, 35.919f);
                l.cubicTo(32.5602f, 30.417f, 30.1332f, 25.467f, 26.2692f, 22.035f);
                l.lineTo(32.0712f, 16.323f);
                l.cubicTo(37.4382f, 21.213f, 40.7922f, 28.185f, 40.7922f, 35.919f);
                l.cubicTo(40.7922f, 43.737f, 37.3632f, 50.775f, 31.8912f, 55.674f);
                l.moveTo(19.3032f, 43.278f);
                l.lineTo(12.0012f, 36.087f);
                l.lineTo(19.4952f, 28.707f);
                l.cubicTo(21.6102f, 30.429f, 22.9572f, 33.018f, 22.9572f, 35.919f);
                l.cubicTo(22.9572f, 38.904f, 21.5292f, 41.562f, 19.3032f, 43.278f);
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
