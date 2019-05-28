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

/* renamed from: com.tencent.mm.boot.svg.a.a.akm */
public final class akm extends C5163c {
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
                Paint a = C5163c.m7876a(k, looper);
                a.setColor(-6710887);
                canvas.save();
                g = C5163c.m7878a(g, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 11.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a2 = C5163c.m7876a(a, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(29.155f, 0.129f);
                l.cubicTo(31.969f, -0.266f, 34.897f, 0.268f, 37.409f, 1.59f);
                l.cubicTo(40.496f, 3.189f, 42.952f, 5.857f, 44.559f, 8.916f);
                l.cubicTo(46.526f, 12.626f, 47.287f, 16.928f, 46.903f, 21.097f);
                l.cubicTo(46.46f, 25.973f, 44.359f, 30.784f, 40.706f, 34.105f);
                l.cubicTo(40.143f, 34.615f, 39.542f, 35.124f, 39.19f, 35.812f);
                l.cubicTo(38.932f, 36.302f, 39.012f, 36.871f, 39.0f, 37.403f);
                l.cubicTo(39.009f, 37.78f, 38.939f, 38.199f, 39.174f, 38.526f);
                l.cubicTo(39.647f, 39.23f, 40.41f, 39.656f, 41.124f, 40.078f);
                l.cubicTo(46.028f, 43.142f, 50.932f, 46.208f, 55.836f, 49.273f);
                l.cubicTo(56.166f, 49.474f, 56.483f, 49.7f, 56.837f, 49.86f);
                l.cubicTo(58.464f, 50.624f, 59.851f, 51.889f, 60.758f, 53.44f);
                l.cubicTo(61.552f, 54.782f, 61.984f, 56.335f, 61.998f, 57.894f);
                l.cubicTo(62.003f, 59.263f, 61.998f, 60.631f, 62.0f, 62.0f);
                l.lineTo(0.0f, 62.0f);
                l.cubicTo(0.001f, 60.633f, -0.001f, 59.266f, 0.001f, 57.899f);
                l.cubicTo(0.018f, 56.145f, 0.561f, 54.401f, 1.551f, 52.952f);
                l.cubicTo(2.462f, 51.601f, 3.751f, 50.509f, 5.23f, 49.829f);
                l.cubicTo(5.452f, 49.725f, 5.658f, 49.592f, 5.864f, 49.461f);
                l.cubicTo(10.951f, 46.28f, 16.039f, 43.102f, 21.126f, 39.921f);
                l.cubicTo(21.645f, 39.59f, 22.148f, 39.225f, 22.576f, 38.78f);
                l.cubicTo(22.799f, 38.539f, 23.026f, 38.249f, 23.0f, 37.901f);
                l.cubicTo(22.997f, 37.432f, 23.01f, 36.963f, 22.992f, 36.495f);
                l.cubicTo(22.973f, 36.076f, 22.778f, 35.688f, 22.529f, 35.36f);
                l.cubicTo(22.019f, 34.679f, 21.325f, 34.175f, 20.734f, 33.573f);
                l.cubicTo(18.121f, 30.972f, 16.375f, 27.569f, 15.558f, 23.989f);
                l.cubicTo(14.664f, 20.05f, 14.842f, 15.866f, 16.112f, 12.03f);
                l.cubicTo(17.173f, 8.838f, 19.014f, 5.874f, 21.561f, 3.659f);
                l.cubicTo(23.693f, 1.801f, 26.34f, 0.5f, 29.155f, 0.129f);
                l.lineTo(29.155f, 0.129f);
                l.close();
                l.moveTo(25.537f, 5.644f);
                l.cubicTo(23.203f, 7.138f, 21.471f, 9.445f, 20.395f, 11.976f);
                l.cubicTo(18.925f, 15.46f, 18.627f, 19.408f, 19.454f, 23.091f);
                l.cubicTo(20.234f, 26.587f, 22.128f, 29.917f, 25.059f, 32.042f);
                l.cubicTo(26.24f, 32.863f, 26.985f, 34.261f, 27.004f, 35.7f);
                l.cubicTo(26.995f, 36.801f, 27.004f, 37.902f, 26.999f, 39.003f);
                l.cubicTo(26.997f, 39.498f, 26.916f, 39.995f, 26.732f, 40.457f);
                l.cubicTo(26.297f, 41.59f, 25.329f, 42.401f, 24.328f, 43.029f);
                l.cubicTo(18.816f, 46.524f, 13.315f, 50.038f, 7.767f, 53.476f);
                l.cubicTo(7.065f, 53.929f, 6.3f, 54.302f, 5.693f, 54.888f);
                l.cubicTo(4.837f, 55.676f, 4.258f, 56.817f, 4.326f, 58.0f);
                l.cubicTo(22.109f, 58.0f, 39.892f, 58.001f, 57.674f, 57.999f);
                l.cubicTo(57.693f, 56.974f, 57.242f, 55.989f, 56.572f, 55.232f);
                l.cubicTo(55.782f, 54.306f, 54.668f, 53.772f, 53.662f, 53.125f);
                l.cubicTo(48.332f, 49.807f, 43.038f, 46.434f, 37.737f, 43.071f);
                l.cubicTo(36.995f, 42.599f, 36.267f, 42.066f, 35.753f, 41.342f);
                l.cubicTo(35.279f, 40.695f, 35.013f, 39.901f, 35.004f, 39.099f);
                l.cubicTo(34.992f, 37.999f, 35.008f, 36.899f, 34.995f, 35.798f);
                l.cubicTo(34.991f, 34.475f, 35.583f, 33.154f, 36.606f, 32.307f);
                l.cubicTo(37.047f, 31.948f, 37.514f, 31.621f, 37.937f, 31.238f);
                l.cubicTo(39.451f, 29.895f, 40.627f, 28.197f, 41.46f, 26.357f);
                l.cubicTo(43.112f, 22.665f, 43.424f, 18.412f, 42.447f, 14.496f);
                l.cubicTo(41.692f, 11.477f, 40.113f, 8.607f, 37.725f, 6.577f);
                l.cubicTo(36.017f, 5.119f, 33.859f, 4.151f, 31.605f, 4.022f);
                l.cubicTo(29.475f, 3.878f, 27.324f, 4.488f, 25.537f, 5.644f);
                l.lineTo(25.537f, 5.644f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                Paint a3 = C5163c.m7876a(a, looper);
                Path l2 = C5163c.m7884l(looper);
                l2.moveTo(56.0f, 17.0f);
                l2.lineTo(72.0f, 17.0f);
                l2.lineTo(72.0f, 21.0f);
                l2.lineTo(56.0f, 21.0f);
                l2.lineTo(56.0f, 17.0f);
                l2.lineTo(56.0f, 17.0f);
                l2.close();
                WeChatSVGRenderC2Java.setFillType(l2, 2);
                canvas.drawPath(l2, a3);
                canvas.restore();
                canvas.save();
                a3 = C5163c.m7876a(a, looper);
                l2 = C5163c.m7884l(looper);
                l2.moveTo(52.0f, 29.0f);
                l2.lineTo(72.0f, 29.0f);
                l2.lineTo(72.0f, 33.0f);
                l2.lineTo(52.0f, 33.0f);
                l2.lineTo(52.0f, 29.0f);
                l2.lineTo(52.0f, 29.0f);
                l2.close();
                WeChatSVGRenderC2Java.setFillType(l2, 2);
                canvas.drawPath(l2, a3);
                canvas.restore();
                canvas.save();
                a3 = C5163c.m7876a(a, looper);
                l2 = C5163c.m7884l(looper);
                l2.moveTo(56.0f, 41.0f);
                l2.lineTo(72.0f, 41.0f);
                l2.lineTo(72.0f, 45.0f);
                l2.lineTo(56.0f, 45.0f);
                l2.lineTo(56.0f, 41.0f);
                l2.lineTo(56.0f, 41.0f);
                l2.close();
                WeChatSVGRenderC2Java.setFillType(l2, 2);
                canvas.drawPath(l2, a3);
                canvas.restore();
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
