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

/* renamed from: com.tencent.mm.boot.svg.a.a.aem */
public final class aem extends C5163c {
    private final int height = 48;
    private final int width = 48;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 48;
            case 1:
                return 48;
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
                a.setColor(-5592406);
                g = C5163c.m7878a(g, 1.0f, 0.0f, -70.0f, 0.0f, 1.0f, -268.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                g = C5163c.m7878a(g, 1.0f, 0.0f, 69.0f, 0.0f, 1.0f, 98.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a2 = C5163c.m7876a(a, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(25.0f, 179.67346f);
                l.cubicTo(17.16f, 179.67346f, 11.0f, 185.83347f, 11.0f, 193.67346f);
                l.cubicTo(11.0f, 201.51347f, 17.16f, 207.67346f, 25.0f, 207.67346f);
                l.cubicTo(32.84f, 207.67346f, 39.0f, 201.51347f, 39.0f, 193.67346f);
                l.cubicTo(39.0f, 185.83347f, 32.84f, 179.67346f, 25.0f, 179.67346f);
                l.lineTo(25.0f, 179.67346f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
