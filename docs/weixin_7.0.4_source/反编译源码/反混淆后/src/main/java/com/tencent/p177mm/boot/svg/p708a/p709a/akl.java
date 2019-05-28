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

/* renamed from: com.tencent.mm.boot.svg.a.a.akl */
public final class akl extends C5163c {
    private final int height = 84;
    private final int width = 96;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 96;
            case 1:
                return 84;
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
                g = C5163c.m7878a(g, 1.0f, 0.0f, -426.0f, 0.0f, 1.0f, -155.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                g = C5163c.m7878a(g, 1.0f, 0.0f, 426.0f, 0.0f, 1.0f, 155.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                Path l = C5163c.m7884l(looper);
                l.moveTo(0.0f, 0.0f);
                l.lineTo(96.0f, 0.0f);
                l.lineTo(96.0f, 84.0f);
                l.lineTo(0.0f, 84.0f);
                l.lineTo(0.0f, 0.0f);
                l.close();
                canvas.save();
                Paint a = C5163c.m7876a(k, looper);
                a.setColor(-15028967);
                l = C5163c.m7884l(looper);
                l.moveTo(41.155f, 11.127351f);
                l.cubicTo(43.969f, 10.73235f, 46.897f, 11.266351f, 49.409f, 12.58835f);
                l.cubicTo(52.496f, 14.18735f, 54.952f, 16.85535f, 56.559f, 19.91435f);
                l.cubicTo(58.526f, 23.624352f, 59.287f, 27.926352f, 58.903f, 32.095352f);
                l.cubicTo(58.46f, 36.97135f, 56.359f, 41.782352f, 52.706f, 45.10335f);
                l.cubicTo(52.143f, 45.61335f, 51.542f, 46.122353f, 51.19f, 46.810352f);
                l.cubicTo(50.932f, 47.30035f, 51.012f, 47.86935f, 51.0f, 48.401352f);
                l.cubicTo(51.009f, 48.77835f, 50.939f, 49.19735f, 51.174f, 49.52435f);
                l.cubicTo(51.647f, 50.22835f, 52.41f, 50.65435f, 53.124f, 51.07635f);
                l.cubicTo(58.028f, 54.14035f, 62.932f, 57.206352f, 67.836f, 60.27135f);
                l.cubicTo(68.166f, 60.47235f, 68.483f, 60.69835f, 68.837f, 60.85835f);
                l.cubicTo(70.464f, 61.622353f, 71.851f, 62.887352f, 72.758f, 64.438354f);
                l.cubicTo(73.552f, 65.78035f, 73.984f, 67.33335f, 73.998f, 68.89235f);
                l.cubicTo(74.003f, 70.26135f, 73.998f, 71.62935f, 74.0f, 72.99835f);
                l.lineTo(12.0f, 72.99835f);
                l.cubicTo(12.001f, 71.63135f, 11.999f, 70.26435f, 12.001f, 68.897354f);
                l.cubicTo(12.018f, 67.14335f, 12.561f, 65.39935f, 13.551f, 63.95035f);
                l.cubicTo(14.462f, 62.59935f, 15.751f, 61.50735f, 17.23f, 60.82735f);
                l.cubicTo(17.452f, 60.72335f, 17.658f, 60.59035f, 17.864f, 60.45935f);
                l.cubicTo(22.951f, 57.27835f, 28.039f, 54.10035f, 33.126f, 50.91935f);
                l.cubicTo(33.645f, 50.588352f, 34.148f, 50.22335f, 34.576f, 49.77835f);
                l.cubicTo(34.799f, 49.53735f, 35.026f, 49.247353f, 35.0f, 48.89935f);
                l.cubicTo(34.997f, 48.43035f, 35.01f, 47.96135f, 34.992f, 47.49335f);
                l.cubicTo(34.973f, 47.074352f, 34.778f, 46.68635f, 34.529f, 46.35835f);
                l.cubicTo(34.019f, 45.67735f, 33.325f, 45.17335f, 32.734f, 44.57135f);
                l.cubicTo(30.121f, 41.970352f, 28.375f, 38.567352f, 27.558f, 34.98735f);
                l.cubicTo(26.664f, 31.048351f, 26.842f, 26.864351f, 28.112f, 23.02835f);
                l.cubicTo(29.173f, 19.836351f, 31.014f, 16.87235f, 33.561f, 14.657351f);
                l.cubicTo(35.693f, 12.799351f, 38.34f, 11.498351f, 41.155f, 11.127351f);
                l.lineTo(41.155f, 11.127351f);
                l.close();
                l.moveTo(37.537f, 16.642351f);
                l.cubicTo(35.203f, 18.13635f, 33.471f, 20.44335f, 32.395f, 22.97435f);
                l.cubicTo(30.925f, 26.458351f, 30.627f, 30.406351f, 31.454f, 34.08935f);
                l.cubicTo(32.234f, 37.58535f, 34.128f, 40.91535f, 37.059f, 43.04035f);
                l.cubicTo(38.24f, 43.86135f, 38.985f, 45.25935f, 39.004f, 46.69835f);
                l.cubicTo(38.995f, 47.79935f, 39.004f, 48.900352f, 38.999f, 50.00135f);
                l.cubicTo(38.997f, 50.49635f, 38.916f, 50.99335f, 38.732f, 51.45535f);
                l.cubicTo(38.297f, 52.588352f, 37.329f, 53.39935f, 36.328f, 54.02735f);
                l.cubicTo(30.816f, 57.52235f, 25.315f, 61.03635f, 19.767f, 64.47435f);
                l.cubicTo(19.065f, 64.92735f, 18.3f, 65.300354f, 17.693f, 65.88635f);
                l.cubicTo(16.837f, 66.67435f, 16.258f, 67.81535f, 16.326f, 68.99835f);
                l.cubicTo(34.109f, 68.99835f, 51.892f, 68.99935f, 69.674f, 68.99735f);
                l.cubicTo(69.693f, 67.97235f, 69.242f, 66.98735f, 68.572f, 66.230354f);
                l.cubicTo(67.782f, 65.30435f, 66.668f, 64.77035f, 65.662f, 64.12335f);
                l.cubicTo(60.332f, 60.80535f, 55.038f, 57.43235f, 49.737f, 54.06935f);
                l.cubicTo(48.995f, 53.59735f, 48.267f, 53.06435f, 47.753f, 52.34035f);
                l.cubicTo(47.279f, 51.69335f, 47.013f, 50.89935f, 47.004f, 50.09735f);
                l.cubicTo(46.992f, 48.997353f, 47.008f, 47.89735f, 46.995f, 46.796352f);
                l.cubicTo(46.991f, 45.47335f, 47.583f, 44.15235f, 48.606f, 43.30535f);
                l.cubicTo(49.047f, 42.94635f, 49.514f, 42.61935f, 49.937f, 42.23635f);
                l.cubicTo(51.451f, 40.893353f, 52.627f, 39.19535f, 53.46f, 37.35535f);
                l.cubicTo(55.112f, 33.66335f, 55.424f, 29.41035f, 54.447f, 25.49435f);
                l.cubicTo(53.692f, 22.475351f, 52.113f, 19.60535f, 49.725f, 17.57535f);
                l.cubicTo(48.017f, 16.117352f, 45.859f, 15.149351f, 43.605f, 15.02035f);
                l.cubicTo(41.475f, 14.87635f, 39.324f, 15.486351f, 37.537f, 16.642351f);
                l.close();
                l.moveTo(68.0f, 27.99835f);
                l.lineTo(84.0f, 27.99835f);
                l.lineTo(84.0f, 31.99835f);
                l.lineTo(68.0f, 31.99835f);
                l.lineTo(68.0f, 27.99835f);
                l.close();
                l.moveTo(64.0f, 39.998352f);
                l.lineTo(84.0f, 39.998352f);
                l.lineTo(84.0f, 43.998352f);
                l.lineTo(64.0f, 43.998352f);
                l.lineTo(64.0f, 39.998352f);
                l.close();
                l.moveTo(68.0f, 51.998352f);
                l.lineTo(84.0f, 51.998352f);
                l.lineTo(84.0f, 55.998352f);
                l.lineTo(68.0f, 55.998352f);
                l.lineTo(68.0f, 51.998352f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
