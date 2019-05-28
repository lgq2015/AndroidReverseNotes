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

/* renamed from: com.tencent.mm.boot.svg.a.a.akh */
public final class akh extends C5163c {
    private final int height = 72;
    private final int width = 72;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 72;
            case 1:
                return 72;
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
                k = C5163c.m7876a(k2, looper);
                k.setStrokeWidth(1.0f);
                canvas.save();
                Paint a = C5163c.m7876a(k, looper);
                a.setColor(-372399);
                a.setStrokeWidth(3.7565217f);
                g = C5163c.m7878a(g, 1.0f, 0.0f, 13.0f, 0.0f, 1.0f, 8.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a2 = C5163c.m7876a(a, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(33.423096f, 23.393011f);
                l.cubicTo(33.423096f, 28.885603f, 28.958527f, 33.335987f, 23.453514f, 33.335987f);
                l.cubicTo(17.946226f, 33.335987f, 13.483933f, 28.885603f, 13.483933f, 23.393011f);
                l.cubicTo(13.483933f, 17.90042f, 17.946226f, 13.450035f, 23.453514f, 13.450035f);
                l.cubicTo(28.958527f, 13.450035f, 33.423096f, 17.90042f, 33.423096f, 23.393011f);
                l.close();
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                Paint a3 = C5163c.m7876a(a, looper);
                a3.setStrokeJoin(Join.MITER);
                Path l2 = C5163c.m7884l(looper);
                l2.moveTo(36.644825f, 43.30803f);
                l2.lineTo(23.453743f, 56.466183f);
                l2.lineTo(14.822849f, 47.85832f);
                WeChatSVGRenderC2Java.setFillType(l2, 1);
                canvas.drawPath(l2, a3);
                canvas.restore();
                canvas.save();
                a2 = C5163c.m7876a(a, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(40.033207f, 39.928688f);
                l.cubicTo(49.190014f, 30.796316f, 49.190014f, 15.989706f, 40.033207f, 6.857335f);
                l.cubicTo(30.876402f, -2.275036f, 16.030172f, -2.275036f, 6.873366f, 6.857335f);
                l.cubicTo(-2.2834404f, 15.989706f, -2.2834404f, 30.796316f, 6.873366f, 39.928688f);
                l.lineTo(11.679438f, 44.721935f);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
