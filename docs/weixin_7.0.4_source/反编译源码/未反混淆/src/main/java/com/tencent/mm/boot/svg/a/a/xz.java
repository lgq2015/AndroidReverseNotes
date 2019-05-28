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

public final class xz extends c {
    private final int height = 144;
    private final int width = 144;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 144;
            case 1:
                return 144;
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
                Paint a = c.a(k2, looper);
                a.setStrokeWidth(1.0f);
                canvas.save();
                Paint a2 = c.a(a, looper);
                a2.setColor(-16074);
                a2.setStrokeWidth(4.8f);
                Path l = c.l(looper);
                l.moveTo(45.0f, 66.0f);
                l.lineTo(42.600056f, 66.0f);
                l.cubicTo(37.305443f, 66.0f, 33.0f, 61.96341f, 33.0f, 57.0f);
                l.cubicTo(33.0f, 52.03659f, 37.305725f, 48.0f, 42.600056f, 48.0f);
                l.lineTo(45.0f, 48.0f);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(a, looper);
                a2.setColor(-16074);
                a2.setStrokeWidth(4.8f);
                g = c.a(g, -1.0f, 0.0f, 210.0f, 0.0f, 1.0f, 0.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                l = c.l(looper);
                l.moveTo(111.0f, 66.0f);
                l.lineTo(108.60006f, 66.0f);
                l.cubicTo(103.30544f, 66.0f, 99.0f, 61.96341f, 99.0f, 57.0f);
                l.cubicTo(99.0f, 52.03659f, 103.305725f, 48.0f, 108.60006f, 48.0f);
                l.lineTo(111.0f, 48.0f);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(k, looper);
                Paint a3 = c.a(a, looper);
                a2.setColor(-1);
                a3.setColor(-16074);
                a3.setStrokeWidth(4.8f);
                l = c.l(looper);
                l.moveTo(44.400005f, 60.0f);
                l.lineTo(44.400005f, 60.001617f);
                l.cubicTo(44.391766f, 72.23794f, 59.60981f, 84.6f, 72.0f, 84.6f);
                l.cubicTo(84.38695f, 84.6f, 99.6f, 72.239395f, 99.6f, 60.0f);
                l.lineTo(99.6f, 34.652924f);
                l.cubicTo(99.6f, 30.197235f, 95.14448f, 26.40025f, 89.49996f, 26.40025f);
                l.lineTo(84.49989f, 26.40025f);
                l.cubicTo(84.3821f, 26.40025f, 84.30455f, 26.435246f, 84.30783f, 26.43113f);
                l.lineTo(83.460304f, 27.492258f);
                l.cubicTo(80.85149f, 30.827463f, 76.57073f, 32.78677f, 71.99985f, 32.7918f);
                l.cubicTo(67.42408f, 32.786766f, 63.14272f, 30.825882f, 60.54136f, 27.495325f);
                l.lineTo(59.689983f, 26.428133f);
                l.cubicTo(59.695263f, 26.434763f, 59.618225f, 26.4f, 59.500114f, 26.4f);
                l.lineTo(54.500042f, 26.4f);
                l.cubicTo(48.85545f, 26.4f, 44.400005f, 30.197042f, 44.400005f, 34.65267f);
                l.lineTo(44.400005f, 60.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 1);
                canvas.drawPath(l, a2);
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.save();
                k = c.a(k, looper);
                k.setColor(-16074);
                l = c.l(looper);
                l.moveTo(104.91049f, 46.496986f);
                l.lineTo(104.86963f, 47.496094f);
                l.lineTo(99.42517f, 47.966675f);
                l.lineTo(99.42517f, 30.077742f);
                l.lineTo(86.924355f, 25.381779f);
                l.lineTo(81.4769f, 27.004065f);
                l.lineTo(74.95629f, 31.657248f);
                l.lineTo(64.97543f, 30.077742f);
                l.lineTo(56.89037f, 25.381779f);
                l.lineTo(48.26918f, 28.170187f);
                l.lineTo(44.771484f, 33.857666f);
                l.lineTo(46.04379f, 45.45333f);
                l.lineTo(39.263027f, 47.496094f);
                l.lineTo(39.263027f, 46.481754f);
                l.lineTo(37.086315f, 46.673683f);
                l.lineTo(36.085262f, 36.1067f);
                l.cubicTo(35.237816f, 26.960608f, 40.77677f, 18.525093f, 49.621746f, 15.341587f);
                l.cubicTo(54.45513f, 9.480436f, 61.89388f, 6.0f, 69.67259f, 6.0f);
                l.lineTo(74.32918f, 6.0f);
                l.cubicTo(82.10789f, 6.0f, 89.54664f, 9.480436f, 94.37784f, 15.341587f);
                l.cubicTo(103.22527f, 18.525093f, 108.763954f, 26.960608f, 107.91432f, 36.10222f);
                l.lineTo(106.91327f, 46.673683f);
                l.lineTo(104.91049f, 46.496986f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 1);
                canvas.drawPath(l, k);
                canvas.restore();
                canvas.save();
                k2 = c.a(a, looper);
                k2.setColor(-16074);
                k2.setStrokeWidth(4.8f);
                k2.setStrokeCap(Cap.ROUND);
                k2.setStrokeJoin(Join.MITER);
                Path l2 = c.l(looper);
                l2.moveTo(57.0f, 93.0f);
                l2.lineTo(72.0f, 111.0f);
                l2.lineTo(57.0f, 117.0f);
                l2.lineTo(48.0f, 93.0f);
                WeChatSVGRenderC2Java.setFillType(l2, 1);
                canvas.drawPath(l2, k2);
                canvas.restore();
                canvas.save();
                k = c.a(a, looper);
                k.setColor(-16074);
                k.setStrokeWidth(4.8f);
                k.setStrokeCap(Cap.ROUND);
                k.setStrokeJoin(Join.MITER);
                g = c.a(g, -1.0f, 0.0f, 168.0f, 0.0f, 1.0f, 0.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                l = c.l(looper);
                l.moveTo(81.0f, 93.0f);
                l.lineTo(96.0f, 111.0f);
                l.lineTo(81.0f, 117.0f);
                l.lineTo(72.0f, 93.0f);
                WeChatSVGRenderC2Java.setFillType(l, 1);
                canvas.drawPath(l, k);
                canvas.restore();
                canvas.save();
                k = c.a(a, looper);
                k.setColor(-16074);
                k.setStrokeWidth(4.8f);
                k.setStrokeCap(Cap.ROUND);
                k.setStrokeJoin(Join.MITER);
                l = c.l(looper);
                l.moveTo(87.0f, 81.0f);
                l.lineTo(87.0f, 88.99367f);
                l.cubicTo(87.00478f, 90.67581f, 88.42321f, 92.1185f, 90.3001f, 92.344925f);
                l.lineTo(104.25684f, 93.99275f);
                l.cubicTo(114.9447f, 95.26437f, 122.99962f, 103.46318f, 122.99962f, 113.05984f);
                l.lineTo(122.99962f, 135.0f);
                canvas.drawPath(l, k);
                canvas.restore();
                canvas.save();
                k = c.a(a, looper);
                k.setColor(-16074);
                k.setStrokeWidth(4.8f);
                k.setStrokeCap(Cap.ROUND);
                k.setStrokeJoin(Join.MITER);
                float[] a4 = c.a(g, -1.0f, 0.0f, 77.99962f, 0.0f, 1.0f, 0.0f);
                h.reset();
                h.setValues(a4);
                canvas.concat(h);
                l = c.l(looper);
                l.moveTo(21.0f, 81.0f);
                l.lineTo(21.0f, 88.99367f);
                l.cubicTo(21.004782f, 90.67581f, 22.42321f, 92.1185f, 24.300104f, 92.344925f);
                l.lineTo(38.256844f, 93.99275f);
                l.cubicTo(48.944702f, 95.26437f, 56.99962f, 103.46318f, 56.99962f, 113.05984f);
                l.lineTo(56.99962f, 135.0f);
                canvas.drawPath(l, k);
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
