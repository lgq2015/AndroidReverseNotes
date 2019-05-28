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

public final class oh extends c {
    private final int height = 60;
    private final int width = 60;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 60;
            case 1:
                return 60;
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
                Path l = c.l(looper);
                l.moveTo(0.0f, 0.0f);
                l.lineTo(60.0f, 0.0f);
                l.lineTo(60.0f, 60.0f);
                l.lineTo(0.0f, 60.0f);
                l.lineTo(0.0f, 0.0f);
                l.close();
                Paint a = c.a(k, looper);
                a.setColor(-5592406);
                canvas.save();
                g = c.a(g, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 6.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a2 = c.a(a, looper);
                Path l2 = c.l(looper);
                l2.moveTo(0.0f, 5.877551f);
                l2.cubicTo(0.0f, 2.6891508f, 2.6835413f, 0.0f, 5.877551f, 0.0f);
                l2.lineTo(42.122448f, 0.0f);
                l2.cubicTo(45.31085f, 0.0f, 48.0f, 2.6835413f, 48.0f, 5.877551f);
                l2.lineTo(48.0f, 42.122448f);
                l2.cubicTo(48.0f, 45.31085f, 45.31646f, 48.0f, 42.122448f, 48.0f);
                l2.lineTo(5.877551f, 48.0f);
                l2.cubicTo(2.6891508f, 48.0f, 0.0f, 45.31646f, 0.0f, 42.122448f);
                l2.lineTo(0.0f, 5.877551f);
                l2.lineTo(0.0f, 5.877551f);
                l2.close();
                l2.moveTo(4.0f, 5.904762f);
                l2.cubicTo(4.0f, 4.894218f, 4.89154f, 4.0f, 5.904762f, 4.0f);
                l2.lineTo(42.095238f, 4.0f);
                l2.cubicTo(43.10578f, 4.0f, 44.0f, 4.89154f, 44.0f, 5.904762f);
                l2.lineTo(44.0f, 42.095238f);
                l2.cubicTo(44.0f, 43.10578f, 43.10846f, 44.0f, 42.095238f, 44.0f);
                l2.lineTo(5.904762f, 44.0f);
                l2.cubicTo(4.894218f, 44.0f, 4.0f, 43.10846f, 4.0f, 42.095238f);
                l2.lineTo(4.0f, 5.904762f);
                l2.lineTo(4.0f, 5.904762f);
                l2.close();
                WeChatSVGRenderC2Java.setFillType(l2, 2);
                canvas.drawPath(l2, a2);
                canvas.restore();
                canvas.save();
                Paint a3 = c.a(a, looper);
                Path l3 = c.l(looper);
                l3.moveTo(10.2f, 22.538462f);
                l3.lineTo(19.0f, 30.923077f);
                l3.lineTo(37.8f, 13.0f);
                l3.lineTo(42.0f, 17.038462f);
                l3.lineTo(19.0f, 39.0f);
                l3.lineTo(6.0f, 26.576923f);
                l3.close();
                WeChatSVGRenderC2Java.setFillType(l3, 1);
                WeChatSVGRenderC2Java.setFillType(l3, 2);
                canvas.drawPath(l3, a3);
                canvas.restore();
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
