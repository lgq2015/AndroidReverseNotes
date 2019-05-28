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

/* renamed from: com.tencent.mm.boot.svg.a.a.tu */
public final class C25941tu extends C5163c {
    private final int height = 414;
    private final int width = 690;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 690;
            case 1:
                return 414;
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
                a.setColor(-1315861);
                g = C5163c.m7878a(g, 1.0f, 0.0f, 225.0f, 0.0f, 1.0f, 114.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a2 = C5163c.m7876a(a, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(228.0f, 119.822876f);
                l.lineTo(228.0f, 12.0f);
                l.lineTo(12.0f, 12.0f);
                l.lineTo(12.0f, 119.51874f);
                l.lineTo(80.73831f, 55.335876f);
                l.lineTo(162.56027f, 130.40851f);
                l.lineTo(150.84477f, 106.321465f);
                l.lineTo(184.2155f, 80.51195f);
                l.lineTo(228.0f, 119.822876f);
                l.lineTo(228.0f, 119.822876f);
                l.close();
                l.moveTo(5.9924946f, 0.0f);
                l.cubicTo(2.6829312f, 0.0f, 0.0f, 2.6830428f, 0.0f, 6.004041f);
                l.lineTo(0.0f, 179.99596f);
                l.cubicTo(0.0f, 183.3119f, 2.6953125f, 186.0f, 5.9924946f, 186.0f);
                l.lineTo(234.0075f, 186.0f);
                l.cubicTo(237.31706f, 186.0f, 240.0f, 183.31696f, 240.0f, 179.99596f);
                l.lineTo(240.0f, 6.004041f);
                l.cubicTo(240.0f, 2.6881008f, 237.30469f, 0.0f, 234.0075f, 0.0f);
                l.lineTo(5.9924946f, 0.0f);
                l.lineTo(5.9924946f, 0.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
