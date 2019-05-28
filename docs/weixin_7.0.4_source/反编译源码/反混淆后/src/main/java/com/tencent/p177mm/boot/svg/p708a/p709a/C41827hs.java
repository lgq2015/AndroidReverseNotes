package com.tencent.p177mm.boot.svg.p708a.p709a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.p177mm.plugin.appbrand.jsapi.JsApiOpenAdCanvas;
import com.tencent.p177mm.svg.C5163c;
import com.tencent.p177mm.svg.WeChatSVGRenderC2Java;
import com.tencent.smtt.sdk.WebView;

/* renamed from: com.tencent.mm.boot.svg.a.a.hs */
public final class C41827hs extends C5163c {
    private final int height = 292;
    private final int width = JsApiOpenAdCanvas.CTRL_INDEX;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return JsApiOpenAdCanvas.CTRL_INDEX;
            case 1:
                return 292;
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
                g = C5163c.m7878a(g, 1.0f, 0.0f, 3.0f, 0.0f, 1.0f, 3.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a2 = C5163c.m7876a(k, looper);
                a2.setColor(-13158344);
                float[] a3 = C5163c.m7878a(g, -1.0f, 0.0f, 470.0f, 0.0f, 1.0f, 0.0f);
                h.reset();
                h.setValues(a3);
                canvas.concat(h);
                Path l = C5163c.m7884l(looper);
                l.moveTo(304.0f, 278.731f);
                l.lineTo(304.0f, 284.001f);
                l.lineTo(166.0f, 284.001f);
                l.lineTo(166.0f, 278.731f);
                l.lineTo(219.0f, 273.731f);
                l.lineTo(219.0f, 240.001f);
                l.lineTo(251.0f, 240.001f);
                l.lineTo(251.0f, 273.731f);
                l.lineTo(304.0f, 278.731f);
                l.close();
                l.moveTo(254.0f, 240.0f);
                l.lineTo(366.985f, 240.0f);
                l.lineTo(366.985f, 237.001f);
                l.lineTo(254.0f, 237.001f);
                l.lineTo(216.0f, 237.0f);
                l.lineTo(62.006f, 237.001f);
                l.cubicTo(55.938f, 237.001f, 51.0f, 232.063f, 51.0f, 225.994f);
                l.lineTo(51.0f, 14.007f);
                l.cubicTo(51.0f, 7.938f, 55.938f, 3.001f, 62.006f, 3.001f);
                l.lineTo(407.993f, 3.001f);
                l.cubicTo(414.063f, 3.001f, 419.0f, 7.938f, 419.0f, 14.007f);
                l.lineTo(419.0f, 97.39f);
                l.lineTo(422.0f, 97.39f);
                l.lineTo(422.0f, 14.007f);
                l.cubicTo(422.0f, 6.266f, 415.729f, 0.0f, 407.993f, 0.0f);
                l.lineTo(62.007f, 0.0f);
                l.cubicTo(54.276f, 0.0f, 48.0f, 6.271f, 48.0f, 14.007f);
                l.lineTo(48.0f, 225.994f);
                l.cubicTo(48.0f, 233.735f, 54.271f, 240.0f, 62.007f, 240.0f);
                l.lineTo(216.0f, 240.0f);
                l.lineTo(216.0f, 271.0f);
                l.lineTo(163.0f, 276.0f);
                l.lineTo(163.0f, 287.0f);
                l.lineTo(307.0f, 287.0f);
                l.lineTo(307.0f, 276.0f);
                l.lineTo(254.0f, 271.0f);
                l.lineTo(254.0f, 240.0f);
                l.close();
                l.moveTo(365.9854f, 226.0006f);
                l.lineTo(62.0004f, 226.0006f);
                l.lineTo(62.0004f, 14.0006f);
                l.lineTo(408.0004f, 14.0006f);
                l.lineTo(408.0004f, 95.3906f);
                l.cubicTo(408.0004f, 95.3906f, 408.9994f, 97.02239f, 408.9994f, 95.01775f);
                l.lineTo(408.9994f, 13.0006f);
                l.lineTo(60.9994f, 13.0006f);
                l.lineTo(60.9994f, 227.0006f);
                l.lineTo(365.9854f, 227.0006f);
                l.lineTo(365.9854f, 226.0006f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                a2 = C5163c.m7876a(k, looper);
                a2.setColor(-6579301);
                l = C5163c.m7884l(looper);
                l.moveTo(175.0975f, 101.5f);
                l.cubicTo(173.38675f, 101.5f, 172.0f, 100.4927f, 172.0f, 99.25005f);
                l.cubicTo(172.0f, 98.0073f, 173.38675f, 97.0f, 175.0975f, 97.0f);
                l.lineTo(273.9025f, 97.0f);
                l.cubicTo(275.61325f, 97.0f, 277.0f, 98.0073f, 277.0f, 99.24995f);
                l.cubicTo(277.0f, 100.492584f, 275.61325f, 101.5f, 273.9025f, 101.5f);
                l.lineTo(175.0975f, 101.5f);
                l.close();
                l.moveTo(294.283f, 125.68484f);
                l.lineTo(175.717f, 125.68484f);
                l.cubicTo(173.66411f, 125.68484f, 172.0f, 124.677536f, 172.0f, 123.43489f);
                l.lineTo(172.0f, 123.43478f);
                l.cubicTo(172.0f, 122.19213f, 173.66411f, 121.18484f, 175.717f, 121.18484f);
                l.lineTo(294.283f, 121.18484f);
                l.cubicTo(296.3359f, 121.18484f, 298.0f, 122.19213f, 298.0f, 123.43478f);
                l.lineTo(298.0f, 123.43489f);
                l.cubicTo(298.0f, 124.677536f, 296.3359f, 125.68484f, 294.283f, 125.68484f);
                l.lineTo(294.283f, 125.68484f);
                l.close();
                l.moveTo(235.79611f, 148.77036f);
                l.lineTo(175.70389f, 148.77036f);
                l.cubicTo(173.65823f, 148.77036f, 172.0f, 147.76303f, 172.0f, 146.52036f);
                l.lineTo(172.0f, 146.52036f);
                l.cubicTo(172.0f, 145.27768f, 173.65823f, 144.27036f, 175.70389f, 144.27036f);
                l.lineTo(235.79611f, 144.27036f);
                l.cubicTo(237.84177f, 144.27036f, 239.5f, 145.27768f, 239.5f, 146.52036f);
                l.lineTo(239.5f, 146.52036f);
                l.cubicTo(239.49982f, 147.76303f, 237.84158f, 148.77036f, 235.79611f, 148.77036f);
                l.lineTo(235.79611f, 148.77036f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                float[] a4 = C5163c.m7878a(a3, -1.0f, 0.0f, 106.0f, 0.0f, 1.0f, 96.0f);
                h.reset();
                h.setValues(a4);
                canvas.concat(h);
                canvas.save();
                Paint a5 = C5163c.m7876a(k, looper);
                a5.setColor(-13092808);
                l = C5163c.m7884l(looper);
                l.moveTo(3.0f, 183.006f);
                l.lineTo(3.0f, 7.994f);
                l.cubicTo(3.0f, 5.24f, 5.243f, 3.0f, 8.0f, 3.0f);
                l.lineTo(98.0f, 3.0f);
                l.cubicTo(100.757f, 3.0f, 103.0f, 5.24f, 103.0f, 7.994f);
                l.lineTo(103.0f, 183.006f);
                l.cubicTo(103.0f, 185.76f, 100.757f, 188.0f, 98.0f, 188.0f);
                l.lineTo(8.0f, 188.0f);
                l.cubicTo(5.243f, 188.0f, 3.0f, 185.76f, 3.0f, 183.006f);
                l.lineTo(3.0f, 183.006f);
                l.close();
                l.moveTo(98.0f, 191.0f);
                l.cubicTo(102.418f, 191.0f, 106.0f, 187.418f, 106.0f, 183.006f);
                l.lineTo(106.0f, 7.994f);
                l.cubicTo(106.0f, 3.579f, 102.412f, 0.0f, 98.0f, 0.0f);
                l.lineTo(8.0f, 0.0f);
                l.cubicTo(3.582f, 0.0f, 0.0f, 3.582f, 0.0f, 7.994f);
                l.lineTo(0.0f, 183.006f);
                l.cubicTo(0.0f, 187.421f, 3.588f, 191.0f, 8.0f, 191.0f);
                l.lineTo(98.0f, 191.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a5);
                canvas.restore();
                canvas.save();
                g = C5163c.m7878a(a4, 1.0f, 0.0f, 35.0f, 0.0f, 1.0f, 77.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.restore();
                canvas.save();
                g = C5163c.m7878a(g, 1.0f, 0.0f, 7.0f, 0.0f, 1.0f, 10.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                k2 = C5163c.m7876a(k, looper);
                k2.setColor(-13092808);
                Path l2 = C5163c.m7884l(looper);
                l2.moveTo(1.0f, 157.0f);
                l2.lineTo(91.0f, 157.0f);
                l2.lineTo(91.0f, 11.0f);
                l2.lineTo(1.0f, 11.0f);
                l2.lineTo(1.0f, 157.0f);
                l2.close();
                l2.moveTo(0.0f, 158.0f);
                l2.lineTo(92.0f, 158.0f);
                l2.lineTo(92.0f, 10.0f);
                l2.lineTo(0.0f, 10.0f);
                l2.lineTo(0.0f, 158.0f);
                l2.close();
                WeChatSVGRenderC2Java.setFillType(l2, 2);
                canvas.drawPath(l2, k2);
                canvas.restore();
                canvas.save();
                g = C5163c.m7878a(g, -1.0f, 0.0f, 74.0f, 0.0f, 1.0f, 52.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a6 = C5163c.m7876a(a, looper);
                a6.setColor(-15028967);
                a6.setStrokeWidth(3.0f);
                l = C5163c.m7884l(looper);
                l.moveTo(56.0f, 28.345678f);
                l.cubicTo(56.0f, 12.535704f, 43.464294f, 0.0f, 27.654322f, 0.0f);
                l.cubicTo(12.535704f, 0.0f, 0.0f, 12.535704f, 0.0f, 28.345678f);
                l.cubicTo(0.0f, 43.464294f, 12.535704f, 56.0f, 27.654322f, 56.0f);
                l.cubicTo(43.464294f, 56.0f, 56.0f, 43.464294f, 56.0f, 28.345678f);
                l.close();
                canvas.drawPath(l, a6);
                canvas.restore();
                canvas.save();
                a6 = C5163c.m7876a(k, looper);
                a6.setColor(-15028967);
                l = C5163c.m7884l(looper);
                l.moveTo(14.588646f, 30.351446f);
                l.cubicTo(14.207352f, 29.956825f, 14.165816f, 29.27285f, 14.492403f, 28.82847f);
                l.lineTo(14.924433f, 28.240616f);
                l.cubicTo(15.252574f, 27.79412f, 15.871776f, 27.702866f, 16.31292f, 28.040977f);
                l.lineTo(21.912512f, 32.332745f);
                l.cubicTo(22.788515f, 33.00415f, 24.187197f, 32.974823f, 25.030779f, 32.272053f);
                l.lineTo(41.452072f, 18.591785f);
                l.cubicTo(41.87669f, 18.238045f, 42.53333f, 18.259823f, 42.936333f, 18.657825f);
                l.lineTo(43.125828f, 18.84497f);
                l.cubicTo(43.520943f, 19.235186f, 43.5217f, 19.865993f, 43.12915f, 20.252325f);
                l.lineTo(24.928555f, 38.16443f);
                l.cubicTo(24.138515f, 38.941948f, 22.875587f, 38.92802f, 22.102167f, 38.127567f);
                l.lineTo(14.588646f, 30.351446f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a6);
                canvas.restore();
                canvas.restore();
                canvas.save();
                Paint a7 = C5163c.m7876a(k, looper);
                a7.setColor(-13092808);
                Path l3 = C5163c.m7884l(looper);
                l3.moveTo(39.0f, 3.0f);
                l3.lineTo(53.0f, 3.0f);
                l3.lineTo(53.0f, 0.0f);
                l3.lineTo(39.0f, 0.0f);
                l3.close();
                WeChatSVGRenderC2Java.setFillType(l3, 1);
                WeChatSVGRenderC2Java.setFillType(l3, 2);
                canvas.drawPath(l3, a7);
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
