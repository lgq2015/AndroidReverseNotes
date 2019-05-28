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

/* renamed from: com.tencent.mm.boot.svg.a.a.aff */
public final class aff extends C5163c {
    private final int height = 210;
    private final int width = 210;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 210;
            case 1:
                return 210;
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
                k2 = C5163c.m7876a(k, looper);
                k2.setColor(-1250068);
                canvas.save();
                Paint a = C5163c.m7876a(k2, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(7.0f, 0.0f);
                l.lineTo(202.99f, 0.0f);
                l.cubicTo(206.78f, 1.909775f, 209.48f, 5.5893416f, 210.0f, 9.828842f);
                l.lineTo(210.0f, 197.96669f);
                l.cubicTo(209.55f, 201.70624f, 207.53f, 205.28583f, 204.24f, 207.21559f);
                l.cubicTo(200.91f, 209.40533f, 196.77f, 208.9354f, 192.99f, 208.99538f);
                l.cubicTo(132.64f, 208.9354f, 72.28f, 209.02538f, 11.92f, 208.94539f);
                l.cubicTo(5.92f, 209.07538f, 0.64f, 204.07596f, 0.0f, 198.18666f);
                l.lineTo(0.0f, 10.0088215f);
                l.cubicTo(0.4f, 5.6793313f, 3.19f, 1.969768f, 7.0f, 0.0f);
                l.lineTo(7.0f, 0.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                k = C5163c.m7876a(k, looper);
                k.setColor(-4210753);
                float[] a2 = C5163c.m7878a(g, 1.0f, 0.0f, 60.0f, 0.0f, 1.0f, 60.0f);
                h.reset();
                h.setValues(a2);
                canvas.concat(h);
                canvas.save();
                Paint a3 = C5163c.m7876a(k, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(62.962128f, 1.9078809f);
                l.cubicTo(65.416214f, 0.16359597f, 68.7718f, 1.1159354f, 70.674965f, 3.2110822f);
                l.cubicTo(75.593155f, 8.002853f, 80.34106f, 12.965043f, 85.269264f, 17.74679f);
                l.cubicTo(87.06225f, 19.581297f, 89.305984f, 21.656395f, 88.965416f, 24.493364f);
                l.cubicTo(88.755066f, 27.189987f, 86.47127f, 28.944298f, 84.76843f, 30.76878f);
                l.cubicTo(79.840225f, 35.500404f, 75.172455f, 40.502693f, 70.2142f, 45.214264f);
                l.cubicTo(68.020546f, 47.570053f, 64.01388f, 47.610153f, 61.800194f, 45.24434f);
                l.cubicTo(56.821907f, 40.552814f, 52.16415f, 35.52045f, 47.21591f, 30.788828f);
                l.cubicTo(45.51308f, 28.944298f, 43.15916f, 27.179964f, 43.018925f, 24.46329f);
                l.cubicTo(42.718426f, 20.834375f, 46.063995f, 18.598883f, 48.237614f, 16.243095f);
                l.cubicTo(53.25597f, 11.571621f, 57.68334f, 6.258569f, 62.962128f, 1.9078809f);
                l.lineTo(62.962128f, 1.9078809f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.save();
                a3 = C5163c.m7876a(k, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(2.4572675f, 6.998506f);
                l.cubicTo(3.9844043f, 5.7403884f, 6.1603246f, 6.159761f, 8.006862f, 6.0f);
                l.cubicTo(16.341236f, 6.149776f, 24.675608f, 5.860209f, 33.009983f, 6.1198206f);
                l.cubicTo(35.325638f, 5.990015f, 37.11229f, 8.1767435f, 36.912663f, 10.413398f);
                l.cubicTo(37.03244f, 19.449879f, 37.022457f, 28.496346f, 36.922646f, 37.532825f);
                l.cubicTo(37.152214f, 39.84936f, 35.285713f, 42.066044f, 32.90019f, 41.916267f);
                l.cubicTo(23.946974f, 42.07603f, 14.973799f, 41.956207f, 6.0205865f, 41.966194f);
                l.cubicTo(3.8147223f, 42.165894f, 1.1696819f, 40.957703f, 1.1696819f, 38.43148f);
                l.cubicTo(0.8103556f, 30.12391f, 1.1896445f, 21.786383f, 1.0f, 13.468826f);
                l.cubicTo(1.1796632f, 11.312053f, 0.55084217f, 8.576146f, 2.4572675f, 6.998506f);
                l.lineTo(2.4572675f, 6.998506f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.save();
                a3 = C5163c.m7876a(k, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(3.3451142f, 52.50501f);
                l.cubicTo(12.136798f, 51.5183f, 21.08815f, 52.405342f, 29.939709f, 52.056503f);
                l.cubicTo(32.743866f, 51.797367f, 36.99501f, 52.31564f, 36.86528f, 56.033237f);
                l.cubicTo(37.044907f, 65.372086f, 37.044907f, 74.74083f, 36.86528f, 84.07968f);
                l.cubicTo(37.01497f, 86.69097f, 34.37048f, 88.24578f, 32.005405f, 87.95675f);
                l.cubicTo(23.014137f, 87.95675f, 14.002911f, 88.08631f, 5.0116425f, 87.89695f);
                l.cubicTo(2.89605f, 88.03648f, 1.0f, 86.1727f, 1.1197505f, 84.04978f);
                l.cubicTo(0.87027025f, 75.717575f, 1.1496881f, 67.38537f, 1.0f, 59.053165f);
                l.cubicTo(1.0598752f, 56.750843f, 0.7305613f, 53.561485f, 3.3451142f, 52.50501f);
                l.lineTo(3.3451142f, 52.50501f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.save();
                a3 = C5163c.m7876a(k, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(49.747242f, 52.32051f);
                l.cubicTo(59.009895f, 51.691734f, 68.33244f, 52.210724f, 77.61506f, 52.051037f);
                l.cubicTo(80.07046f, 51.731655f, 83.014946f, 53.148903f, 82.875206f, 55.983395f);
                l.cubicTo(83.104774f, 64.96594f, 82.945076f, 73.97843f, 82.955055f, 82.96098f);
                l.cubicTo(83.32436f, 85.575905f, 81.37801f, 88.27067f, 78.573265f, 87.93133f);
                l.cubicTo(69.57012f, 88.031136f, 60.557f, 88.01118f, 51.55386f, 87.94131f);
                l.cubicTo(49.158344f, 88.210785f, 46.91255f, 86.29451f, 47.102196f, 83.8293f);
                l.cubicTo(46.91255f, 75.20605f, 47.112175f, 66.5828f, 47.012363f, 57.969536f);
                l.cubicTo(46.92253f, 55.813725f, 47.271877f, 52.979233f, 49.747242f, 52.32051f);
                l.lineTo(49.747242f, 52.32051f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
