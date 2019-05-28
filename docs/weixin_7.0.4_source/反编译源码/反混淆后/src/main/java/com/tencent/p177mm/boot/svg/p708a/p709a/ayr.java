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

/* renamed from: com.tencent.mm.boot.svg.a.a.ayr */
public final class ayr extends C5163c {
    private final int height = 131;
    private final int width = 131;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 131;
            case 1:
                return 131;
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
                Paint a = C5163c.m7876a(k2, looper);
                a.setStrokeWidth(1.0f);
                canvas.saveLayerAlpha(null, 128, 4);
                canvas.save();
                g = C5163c.m7878a(g, 1.0f, 0.0f, 28.0f, 0.0f, 1.0f, 28.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                float[] a2 = C5163c.m7878a(g, 1.0f, 0.0f, 2.777778f, 0.0f, 1.0f, 0.0f);
                h.reset();
                h.setValues(a2);
                canvas.concat(h);
                canvas.save();
                Paint a3 = C5163c.m7876a(a, looper);
                a3.setColor(-1);
                a3.setStrokeWidth(4.1666665f);
                Path l = C5163c.m7884l(looper);
                l.moveTo(22.242647f, 9.672728f);
                l.lineTo(6.25f, 9.672728f);
                l.cubicTo(2.7982204f, 9.672728f, -4.2272108E-16f, 12.470947f, 0.0f, 15.922728f);
                l.lineTo(0.0f, 21.607521f);
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.save();
                a3 = C5163c.m7876a(k, looper);
                a3.setColor(-1);
                g = C5163c.m7878a(a2, -0.70710677f, -0.70710677f, 33.52646f, 0.70710677f, -0.70710677f, 5.469288f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                l = C5163c.m7884l(looper);
                l.moveTo(13.547169f, 7.605474f);
                l.lineTo(13.547169f, 15.896383f);
                l.lineTo(9.380502f, 15.896383f);
                l.lineTo(9.380502f, 7.605474f);
                l.lineTo(9.380502f, 3.4600194f);
                l.lineTo(21.880503f, 3.4600194f);
                l.lineTo(21.880503f, 7.605474f);
                l.lineTo(13.547169f, 7.605474f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.restore();
                canvas.save();
                Paint a4 = C5163c.m7876a(a, looper);
                a4.setColor(-1);
                a4.setStrokeWidth(5.0f);
                l = C5163c.m7884l(looper);
                l.moveTo(3.127724f, 28.754545f);
                l.cubicTo(2.7848487f, 28.754545f, 2.5f, 29.040102f, 2.5f, 29.385191f);
                l.lineTo(2.5f, 72.869354f);
                l.cubicTo(2.5f, 73.223274f, 2.775803f, 73.5f, 3.127724f, 73.5f);
                l.lineTo(46.872276f, 73.5f);
                l.cubicTo(47.215153f, 73.5f, 47.5f, 73.21445f, 47.5f, 72.869354f);
                l.lineTo(47.5f, 29.385191f);
                l.cubicTo(47.5f, 29.03127f, 47.224197f, 28.754545f, 46.872276f, 28.754545f);
                l.lineTo(3.127724f, 28.754545f);
                l.close();
                canvas.drawPath(l, a4);
                canvas.restore();
                canvas.save();
                a4 = C5163c.m7876a(k, looper);
                a4.setColor(-1);
                l = C5163c.m7884l(looper);
                l.moveTo(50.0f, 42.836365f);
                l.lineTo(50.0f, 37.861816f);
                l.lineTo(70.0f, 37.861816f);
                l.lineTo(70.0f, 6.356364f);
                l.lineTo(38.333332f, 6.356364f);
                l.lineTo(38.333332f, 26.254545f);
                l.lineTo(33.333332f, 26.254545f);
                l.lineTo(33.333332f, 4.497647f);
                l.cubicTo(33.333332f, 2.761085f, 34.735474f, 1.3818182f, 36.465107f, 1.3818182f);
                l.lineTo(71.868225f, 1.3818182f);
                l.cubicTo(73.61368f, 1.3818182f, 75.0f, 2.776822f, 75.0f, 4.497647f);
                l.lineTo(75.0f, 39.720535f);
                l.cubicTo(75.0f, 41.457096f, 73.597855f, 42.836365f, 71.868225f, 42.836365f);
                l.lineTo(50.0f, 42.836365f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 1);
                canvas.drawPath(l, a4);
                canvas.restore();
                canvas.save();
                a4 = C5163c.m7876a(k, looper);
                a4.setColor(-1);
                l = C5163c.m7884l(looper);
                l.moveTo(29.208591f, 45.839653f);
                l.lineTo(21.85212f, 45.839653f);
                l.cubicTo(22.811659f, 48.09166f, 24.115648f, 50.098885f, 25.76409f, 51.836845f);
                l.cubicTo(27.2157f, 50.172318f, 28.37207f, 48.18957f, 29.208591f, 45.839653f);
                l.close();
                l.moveTo(36.95872f, 45.839653f);
                l.lineTo(33.24358f, 45.839653f);
                l.cubicTo(32.08721f, 49.168705f, 30.51258f, 51.934757f, 28.495087f, 54.211243f);
                l.cubicTo(30.955446f, 55.973682f, 33.93248f, 57.271034f, 37.5f, 58.05434f);
                l.cubicTo(36.68808f, 58.837646f, 35.630127f, 60.40426f, 35.08885f, 61.383392f);
                l.cubicTo(31.299896f, 60.40426f, 28.224447f, 58.886604f, 25.690279f, 56.854904f);
                l.cubicTo(23.008488f, 58.960037f, 19.760815f, 60.502174f, 15.873447f, 61.57922f);
                l.cubicTo(15.479791f, 60.72248f, 14.397233f, 59.057953f, 13.708332f, 58.22569f);
                l.cubicTo(17.472681f, 57.393425f, 20.54813f, 56.120552f, 23.03309f, 54.309155f);
                l.cubicTo(20.990993f, 51.959236f, 19.416365f, 49.14423f, 18.136978f, 45.839653f);
                l.lineTo(14.249611f, 45.839653f);
                l.lineTo(14.249611f, 42.36373f);
                l.lineTo(24.386288f, 42.36373f);
                l.cubicTo(24.140253f, 41.384598f, 23.697388f, 40.136204f, 23.22992f, 39.15707f);
                l.lineTo(27.068079f, 38.031067f);
                l.cubicTo(27.683168f, 39.181545f, 28.37207f, 40.723682f, 28.618105f, 41.75177f);
                l.lineTo(26.625216f, 42.36373f);
                l.lineTo(36.95872f, 42.36373f);
                l.lineTo(36.95872f, 45.839653f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a4);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
