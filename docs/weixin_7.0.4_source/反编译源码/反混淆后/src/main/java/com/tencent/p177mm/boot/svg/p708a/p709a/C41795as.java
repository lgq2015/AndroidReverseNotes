package com.tencent.p177mm.boot.svg.p708a.p709a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.p177mm.svg.C5163c;
import com.tencent.p177mm.svg.WeChatSVGRenderC2Java;
import com.tencent.smtt.sdk.WebView;

/* renamed from: com.tencent.mm.boot.svg.a.a.as */
public final class C41795as extends C5163c {
    private final int height = 24;
    private final int width = 24;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 24;
            case 1:
                return 24;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix h = C5163c.m7881h(looper);
                float[] g = C5163c.m7880g(looper);
                Paint k = C5163c.m7883k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = C5163c.m7883k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                C5163c.m7876a(k2, looper).setStrokeWidth(1.0f);
                canvas.save();
                Paint a = C5163c.m7876a(k, looper);
                a.setColor(-5066062);
                g = C5163c.m7878a(g, 1.0f, 0.0f, -54.0f, 0.0f, 1.0f, -710.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                g = C5163c.m7878a(g, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 254.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                g = C5163c.m7878a(g, 1.0f, 0.0f, 30.0f, 0.0f, 1.0f, 432.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a2 = C5163c.m7876a(a, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(34.0f, 34.0f);
                l.lineTo(26.004946f, 34.0f);
                l.cubicTo(24.897026f, 34.0f, 24.0f, 34.89543f, 24.0f, 36.0f);
                l.cubicTo(24.0f, 37.11227f, 24.897646f, 38.0f, 26.004946f, 38.0f);
                l.lineTo(34.0f, 38.0f);
                l.lineTo(34.0f, 45.995052f);
                l.cubicTo(34.0f, 47.102974f, 34.89543f, 48.0f, 36.0f, 48.0f);
                l.cubicTo(37.11227f, 48.0f, 38.0f, 47.102356f, 38.0f, 45.995052f);
                l.lineTo(38.0f, 38.0f);
                l.lineTo(45.995052f, 38.0f);
                l.cubicTo(47.102974f, 38.0f, 48.0f, 37.10457f, 48.0f, 36.0f);
                l.cubicTo(48.0f, 34.88773f, 47.102356f, 34.0f, 45.995052f, 34.0f);
                l.lineTo(38.0f, 34.0f);
                l.lineTo(38.0f, 26.004946f);
                l.cubicTo(38.0f, 24.897026f, 37.10457f, 24.0f, 36.0f, 24.0f);
                l.cubicTo(34.88773f, 24.0f, 34.0f, 24.897646f, 34.0f, 26.004946f);
                l.lineTo(34.0f, 34.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
