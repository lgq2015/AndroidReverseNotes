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
import com.tencent.smtt.sdk.TbsListener.ErrorCode;
import com.tencent.smtt.sdk.WebView;

public final class bax extends c {
    private final int height = ErrorCode.STARTDOWNLOAD_3;
    private final int width = ErrorCode.STARTDOWNLOAD_3;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return ErrorCode.STARTDOWNLOAD_3;
            case 1:
                return ErrorCode.STARTDOWNLOAD_3;
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
                Path l = c.l(looper);
                l.moveTo(13.0f, 37.996094f);
                l.cubicTo(13.0f, 35.789112f, 14.782292f, 34.0f, 17.007507f, 34.0f);
                l.lineTo(145.9925f, 34.0f);
                l.cubicTo(148.20578f, 34.0f, 150.0f, 35.795326f, 150.0f, 37.996094f);
                l.lineTo(150.0f, 123.00391f);
                l.cubicTo(150.0f, 125.21089f, 148.21771f, 127.0f, 145.9925f, 127.0f);
                l.lineTo(17.007507f, 127.0f);
                l.cubicTo(14.794222f, 127.0f, 13.0f, 125.20467f, 13.0f, 123.00391f);
                l.lineTo(13.0f, 37.996094f);
                l.close();
                l.moveTo(23.0f, 52.0f);
                l.lineTo(140.0f, 52.0f);
                l.lineTo(140.0f, 69.0f);
                l.lineTo(23.0f, 69.0f);
                l.lineTo(23.0f, 52.0f);
                l.close();
                k2 = c.k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.FILL);
                Paint k3 = c.k(looper);
                k3.setFlags(385);
                k3.setStyle(Style.STROKE);
                k2.setColor(WebView.NIGHT_MODE_COLOR);
                k3.setStrokeWidth(1.0f);
                k3.setStrokeCap(Cap.BUTT);
                k3.setStrokeJoin(Join.MITER);
                k3.setStrokeMiter(4.0f);
                k3.setPathEffect(null);
                float[] a2 = c.a(g, 150.0f, 0.0f, 13.0f, 0.0f, 127.0f, 34.0f);
                h.reset();
                h.setValues(a2);
                WeChatSVGRenderC2Java.setLinearGradient(a, 0.5f, 0.0f, 0.5f, 1.0f, new int[]{-9919532, -10117428}, new float[]{0.0f, 1.0f}, h, 0);
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
