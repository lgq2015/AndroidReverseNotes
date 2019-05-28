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

/* renamed from: com.tencent.mm.boot.svg.a.a.sh */
public final class C9152sh extends C5163c {
    private final int height = 168;
    private final int width = 168;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 168;
            case 1:
                return 168;
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
                canvas.save();
                float[] a2 = C5163c.m7878a(g, 1.0f, 0.0f, -2.0f, 0.0f, 1.0f, -2.0f);
                h.reset();
                h.setValues(a2);
                canvas.concat(h);
                canvas.save();
                Paint a3 = C5163c.m7876a(k, looper);
                a3.setColor(WebView.NIGHT_MODE_COLOR);
                Path l = C5163c.m7884l(looper);
                l.moveTo(5.0f, 152.0f);
                l.cubicTo(5.0f, 160.26085f, 11.677815f, 166.96202f, 19.929785f, 166.99983f);
                l.lineTo(19.940516f, 167.01065f);
                l.lineTo(19.940516f, 169.99687f);
                l.lineTo(19.893726f, 169.99687f);
                l.cubicTo(10.011294f, 169.99687f, 2.0f, 161.98558f, 2.0f, 152.10315f);
                l.cubicTo(2.0f, 152.06876f, 2.0000992f, 152.03438f, 2.0002973f, 152.0f);
                l.lineTo(5.0f, 152.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.save();
                a3 = C5163c.m7876a(k, looper);
                a3.setColor(WebView.NIGHT_MODE_COLOR);
                a2 = C5163c.m7878a(a2, -1.0f, 0.0f, 321.94052f, 0.0f, 1.0f, 0.0f);
                h.reset();
                h.setValues(a2);
                canvas.concat(h);
                l = C5163c.m7884l(looper);
                l.moveTo(155.0f, 152.0f);
                l.cubicTo(155.0f, 160.26085f, 161.67781f, 166.96202f, 169.92978f, 166.99983f);
                l.lineTo(169.94052f, 167.01065f);
                l.lineTo(169.94052f, 169.99687f);
                l.lineTo(169.89372f, 169.99687f);
                l.cubicTo(160.01129f, 169.99687f, 152.0f, 161.98558f, 152.0f, 152.10315f);
                l.cubicTo(152.0f, 152.06876f, 152.00009f, 152.03438f, 152.00029f, 152.0f);
                l.lineTo(155.0f, 152.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.save();
                a3 = C5163c.m7876a(k, looper);
                a3.setColor(WebView.NIGHT_MODE_COLOR);
                a2 = C5163c.m7878a(a2, -1.0f, 0.0f, 321.94052f, 0.0f, -1.0f, 21.99687f);
                h.reset();
                h.setValues(a2);
                canvas.concat(h);
                l = C5163c.m7884l(looper);
                l.moveTo(155.0f, 2.0f);
                l.cubicTo(155.0f, 10.260854f, 161.67781f, 16.96202f, 169.92978f, 16.99984f);
                l.lineTo(169.94052f, 17.01065f);
                l.lineTo(169.94052f, 19.99687f);
                l.lineTo(169.89372f, 19.99687f);
                l.cubicTo(160.01129f, 19.99687f, 152.0f, 11.985575f, 152.0f, 2.1031427f);
                l.cubicTo(152.0f, 2.0687616f, 152.00009f, 2.0343807f, 152.00029f, 2.0f);
                l.lineTo(155.0f, 2.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.save();
                a3 = C5163c.m7876a(k, looper);
                a3.setColor(WebView.NIGHT_MODE_COLOR);
                a2 = C5163c.m7878a(a2, 1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 21.99687f);
                h.reset();
                h.setValues(a2);
                canvas.concat(h);
                l = C5163c.m7884l(looper);
                l.moveTo(5.0f, 2.0f);
                l.cubicTo(5.0f, 10.260854f, 11.677815f, 16.96202f, 19.929785f, 16.99984f);
                l.lineTo(19.940516f, 17.01065f);
                l.lineTo(19.940516f, 19.99687f);
                l.lineTo(19.893726f, 19.99687f);
                l.cubicTo(10.011294f, 19.99687f, 2.0f, 11.985575f, 2.0f, 2.1031427f);
                l.cubicTo(2.0f, 2.0687616f, 2.0000992f, 2.0343807f, 2.0002973f, 2.0f);
                l.lineTo(5.0f, 2.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.save();
                Paint a4 = C5163c.m7876a(a, looper);
                a4.setColor(WebView.NIGHT_MODE_COLOR);
                a4.setStrokeWidth(3.0f);
                a4.setStrokeCap(Cap.SQUARE);
                Path l2 = C5163c.m7884l(looper);
                l2.moveTo(33.5f, 3.5f);
                l2.lineTo(48.5f, 3.5f);
                canvas.drawPath(l2, a4);
                canvas.restore();
                canvas.save();
                a4 = C5163c.m7876a(a, looper);
                a4.setColor(WebView.NIGHT_MODE_COLOR);
                a4.setStrokeWidth(3.0f);
                a4.setStrokeCap(Cap.SQUARE);
                l2 = C5163c.m7884l(looper);
                l2.moveTo(33.5f, 168.5f);
                l2.lineTo(48.5f, 168.5f);
                canvas.drawPath(l2, a4);
                canvas.restore();
                canvas.save();
                a4 = C5163c.m7876a(a, looper);
                a4.setColor(WebView.NIGHT_MODE_COLOR);
                a4.setStrokeWidth(3.0f);
                a4.setStrokeCap(Cap.SQUARE);
                l2 = C5163c.m7884l(looper);
                l2.moveTo(63.5f, 168.5f);
                l2.lineTo(78.5f, 168.5f);
                canvas.drawPath(l2, a4);
                canvas.restore();
                canvas.save();
                a4 = C5163c.m7876a(a, looper);
                a4.setColor(WebView.NIGHT_MODE_COLOR);
                a4.setStrokeWidth(3.0f);
                a4.setStrokeCap(Cap.SQUARE);
                l2 = C5163c.m7884l(looper);
                l2.moveTo(93.5f, 3.5f);
                l2.lineTo(108.5f, 3.5f);
                canvas.drawPath(l2, a4);
                canvas.restore();
                canvas.save();
                a4 = C5163c.m7876a(a, looper);
                a4.setColor(WebView.NIGHT_MODE_COLOR);
                a4.setStrokeWidth(3.0f);
                a4.setStrokeCap(Cap.SQUARE);
                l2 = C5163c.m7884l(looper);
                l2.moveTo(123.5f, 3.5f);
                l2.lineTo(138.5f, 3.5f);
                canvas.drawPath(l2, a4);
                canvas.restore();
                canvas.save();
                a4 = C5163c.m7876a(a, looper);
                a4.setColor(WebView.NIGHT_MODE_COLOR);
                a4.setStrokeWidth(3.0f);
                a4.setStrokeCap(Cap.SQUARE);
                l2 = C5163c.m7884l(looper);
                l2.moveTo(123.5f, 168.5f);
                l2.lineTo(138.5f, 168.5f);
                canvas.drawPath(l2, a4);
                canvas.restore();
                canvas.save();
                a4 = C5163c.m7876a(a, looper);
                a4.setColor(WebView.NIGHT_MODE_COLOR);
                a4.setStrokeWidth(3.0f);
                a4.setStrokeCap(Cap.SQUARE);
                l2 = C5163c.m7884l(looper);
                l2.moveTo(168.5f, 33.5f);
                l2.lineTo(168.5f, 48.5f);
                canvas.drawPath(l2, a4);
                canvas.restore();
                canvas.save();
                a4 = C5163c.m7876a(a, looper);
                a4.setColor(WebView.NIGHT_MODE_COLOR);
                a4.setStrokeWidth(3.0f);
                a4.setStrokeCap(Cap.SQUARE);
                l2 = C5163c.m7884l(looper);
                l2.moveTo(3.5f, 63.5f);
                l2.lineTo(3.5f, 78.5f);
                canvas.drawPath(l2, a4);
                canvas.restore();
                canvas.save();
                a4 = C5163c.m7876a(a, looper);
                a4.setColor(WebView.NIGHT_MODE_COLOR);
                a4.setStrokeWidth(3.0f);
                a4.setStrokeCap(Cap.SQUARE);
                l2 = C5163c.m7884l(looper);
                l2.moveTo(3.5f, 33.5f);
                l2.lineTo(3.5f, 48.5f);
                canvas.drawPath(l2, a4);
                canvas.restore();
                canvas.save();
                a4 = C5163c.m7876a(a, looper);
                a4.setColor(WebView.NIGHT_MODE_COLOR);
                a4.setStrokeWidth(3.0f);
                a4.setStrokeCap(Cap.SQUARE);
                l2 = C5163c.m7884l(looper);
                l2.moveTo(93.5f, 168.5f);
                l2.lineTo(108.5f, 168.5f);
                canvas.drawPath(l2, a4);
                canvas.restore();
                canvas.save();
                a4 = C5163c.m7876a(a, looper);
                a4.setColor(WebView.NIGHT_MODE_COLOR);
                a4.setStrokeWidth(3.0f);
                a4.setStrokeCap(Cap.SQUARE);
                l2 = C5163c.m7884l(looper);
                l2.moveTo(168.5f, 78.5f);
                l2.lineTo(168.5f, 63.5f);
                canvas.drawPath(l2, a4);
                canvas.restore();
                canvas.save();
                a4 = C5163c.m7876a(a, looper);
                a4.setColor(WebView.NIGHT_MODE_COLOR);
                a4.setStrokeWidth(3.0f);
                a4.setStrokeCap(Cap.SQUARE);
                l2 = C5163c.m7884l(looper);
                l2.moveTo(3.5f, 108.5f);
                l2.lineTo(3.5f, 93.5f);
                canvas.drawPath(l2, a4);
                canvas.restore();
                canvas.save();
                a4 = C5163c.m7876a(a, looper);
                a4.setColor(WebView.NIGHT_MODE_COLOR);
                a4.setStrokeWidth(3.0f);
                a4.setStrokeCap(Cap.SQUARE);
                l2 = C5163c.m7884l(looper);
                l2.moveTo(168.5f, 108.5f);
                l2.lineTo(168.5f, 93.5f);
                canvas.drawPath(l2, a4);
                canvas.restore();
                canvas.save();
                a4 = C5163c.m7876a(a, looper);
                a4.setColor(WebView.NIGHT_MODE_COLOR);
                a4.setStrokeWidth(3.0f);
                a4.setStrokeCap(Cap.SQUARE);
                l2 = C5163c.m7884l(looper);
                l2.moveTo(3.5f, 138.5f);
                l2.lineTo(3.5f, 123.5f);
                canvas.drawPath(l2, a4);
                canvas.restore();
                canvas.save();
                a4 = C5163c.m7876a(a, looper);
                a4.setColor(WebView.NIGHT_MODE_COLOR);
                a4.setStrokeWidth(3.0f);
                a4.setStrokeCap(Cap.SQUARE);
                l2 = C5163c.m7884l(looper);
                l2.moveTo(63.5f, 3.5f);
                l2.lineTo(78.5f, 3.5f);
                canvas.drawPath(l2, a4);
                canvas.restore();
                canvas.save();
                a4 = C5163c.m7876a(a, looper);
                a4.setColor(WebView.NIGHT_MODE_COLOR);
                a4.setStrokeWidth(3.0f);
                a4.setStrokeCap(Cap.SQUARE);
                l2 = C5163c.m7884l(looper);
                l2.moveTo(168.5f, 138.5f);
                l2.lineTo(168.5f, 123.5f);
                canvas.drawPath(l2, a4);
                canvas.restore();
                canvas.restore();
                canvas.save();
                g = C5163c.m7878a(a2, 1.0f, 0.0f, 46.0f, 0.0f, 1.0f, 52.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                a4 = C5163c.m7876a(k, looper);
                a4.setColor(WebView.NIGHT_MODE_COLOR);
                canvas.save();
                Paint a5 = C5163c.m7876a(a4, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(46.64519f, 7.0666666f);
                l.lineTo(29.354809f, 7.0666666f);
                l.lineTo(22.021475f, 18.066668f);
                l.lineTo(5.733333f, 18.066668f);
                l.lineTo(5.733333f, 56.933334f);
                l.lineTo(70.26667f, 56.933334f);
                l.lineTo(70.26667f, 18.066668f);
                l.lineTo(53.978523f, 18.066668f);
                l.lineTo(46.64519f, 7.0666666f);
                l.close();
                l.moveTo(48.01883f, 2.6666667f);
                l.cubicTo(48.63181f, 2.6666667f, 49.204235f, 2.9730186f, 49.544254f, 3.4830496f);
                l.lineTo(56.333332f, 13.666667f);
                l.lineTo(71.0f, 13.666667f);
                l.cubicTo(73.02505f, 13.666667f, 74.666664f, 15.30829f, 74.666664f, 17.333334f);
                l.lineTo(74.666664f, 57.666668f);
                l.cubicTo(74.666664f, 59.69171f, 73.02505f, 61.333332f, 71.0f, 61.333332f);
                l.lineTo(5.0f, 61.333332f);
                l.cubicTo(2.974956f, 61.333332f, 1.3333334f, 59.69171f, 1.3333334f, 57.666668f);
                l.lineTo(1.3333334f, 17.333334f);
                l.cubicTo(1.3333334f, 15.30829f, 2.974956f, 13.666667f, 5.0f, 13.666667f);
                l.lineTo(19.666666f, 13.666667f);
                l.lineTo(26.455744f, 3.4830496f);
                l.cubicTo(26.795765f, 2.9730186f, 27.368189f, 2.6666667f, 27.98117f, 2.6666667f);
                l.lineTo(48.01883f, 2.6666667f);
                l.close();
                l.moveTo(38.0f, 45.933334f);
                l.cubicTo(43.670124f, 45.933334f, 48.266666f, 41.336792f, 48.266666f, 35.666668f);
                l.cubicTo(48.266666f, 29.996544f, 43.670124f, 25.4f, 38.0f, 25.4f);
                l.cubicTo(32.329876f, 25.4f, 27.733334f, 29.996544f, 27.733334f, 35.666668f);
                l.cubicTo(27.733334f, 41.336792f, 32.329876f, 45.933334f, 38.0f, 45.933334f);
                l.close();
                l.moveTo(38.0f, 50.333332f);
                l.cubicTo(29.899824f, 50.333332f, 23.333334f, 43.76684f, 23.333334f, 35.666668f);
                l.cubicTo(23.333334f, 27.56649f, 29.899824f, 21.0f, 38.0f, 21.0f);
                l.cubicTo(46.100178f, 21.0f, 52.666668f, 27.56649f, 52.666668f, 35.666668f);
                l.cubicTo(52.666668f, 43.76684f, 46.100178f, 50.333332f, 38.0f, 50.333332f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 1);
                canvas.drawPath(l, a5);
                canvas.restore();
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
