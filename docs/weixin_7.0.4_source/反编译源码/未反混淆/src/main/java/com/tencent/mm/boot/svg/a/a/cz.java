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
import com.tencent.view.d;

public final class cz extends c {
    private final int height = d.MIC_PTU_TRANS_XINXIAN;
    private final int width = d.MIC_PTU_TRANS_XINXIAN;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return d.MIC_PTU_TRANS_XINXIAN;
            case 1:
                return d.MIC_PTU_TRANS_XINXIAN;
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
                g = c.a(g, 1.0f, 0.0f, -10.0f, 0.0f, 1.0f, -10.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a = c.a(k, looper);
                a.setColor(-16896);
                Path l = c.l(looper);
                l.moveTo(289.5f, 151.72223f);
                l.cubicTo(289.5f, 72.954666f, 227.04533f, 10.5f, 148.27777f, 10.5f);
                l.cubicTo(72.954666f, 10.5f, 10.5f, 72.954666f, 10.5f, 151.72223f);
                l.cubicTo(10.5f, 227.04533f, 72.954666f, 289.5f, 148.27777f, 289.5f);
                l.cubicTo(227.04533f, 289.5f, 289.5f, 227.04533f, 289.5f, 151.72223f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = c.a(k, looper);
                a.setColor(-1);
                l = c.l(looper);
                l.moveTo(141.49457f, 85.5f);
                l.cubicTo(140.39299f, 85.5f, 139.53296f, 86.39243f, 139.57391f, 87.50098f);
                l.lineTo(142.96306f, 179.25606f);
                l.cubicTo(142.98346f, 179.80836f, 143.44995f, 180.2561f, 144.00685f, 180.2561f);
                l.lineTo(155.99315f, 180.2561f);
                l.cubicTo(156.54922f, 180.2561f, 157.01639f, 179.81255f, 157.03694f, 179.25606f);
                l.lineTo(160.42609f, 87.50098f);
                l.cubicTo(160.4669f, 86.39587f, 159.59766f, 85.5f, 158.50543f, 85.5f);
                l.lineTo(141.49457f, 85.5f);
                l.close();
                l.moveTo(150.0f, 214.5f);
                l.cubicTo(155.799f, 214.5f, 160.5f, 209.799f, 160.5f, 204.0f);
                l.cubicTo(160.5f, 198.201f, 155.799f, 193.5f, 150.0f, 193.5f);
                l.cubicTo(144.201f, 193.5f, 139.5f, 198.201f, 139.5f, 204.0f);
                l.cubicTo(139.5f, 209.799f, 144.201f, 214.5f, 150.0f, 214.5f);
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
