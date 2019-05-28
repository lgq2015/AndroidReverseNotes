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
import com.tencent.wxmm.v2helper;

/* renamed from: com.tencent.mm.boot.svg.a.a.pr */
public final class C37581pr extends C5163c {
    private final int height = 292;
    private final int width = v2helper.EMethodSetIosMicAbCheckOn;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return v2helper.EMethodSetIosMicAbCheckOn;
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
                C5163c.m7876a(k2, looper).setStrokeWidth(1.0f);
                canvas.save();
                Paint a = C5163c.m7876a(k, looper);
                a.setColor(-13158344);
                float[] a2 = C5163c.m7878a(g, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 2.0f);
                h.reset();
                h.setValues(a2);
                canvas.concat(h);
                canvas.save();
                a = C5163c.m7876a(a, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(256.0002f, 279.7305f);
                l.lineTo(256.0002f, 285.0005f);
                l.lineTo(118.0002f, 285.0005f);
                l.lineTo(118.0002f, 279.7305f);
                l.lineTo(171.0002f, 274.7305f);
                l.lineTo(171.0002f, 241.0005f);
                l.lineTo(203.0002f, 241.0005f);
                l.lineTo(203.0002f, 274.7305f);
                l.lineTo(256.0002f, 279.7305f);
                l.close();
                l.moveTo(206.0002f, 240.9995f);
                l.lineTo(318.9852f, 240.9995f);
                l.lineTo(318.9852f, 238.0005f);
                l.lineTo(206.0002f, 238.0005f);
                l.lineTo(168.0002f, 237.9995f);
                l.lineTo(14.0062f, 238.0005f);
                l.cubicTo(7.9382f, 238.0005f, 3.0002f, 233.0625f, 3.0002f, 226.9935f);
                l.lineTo(3.0002f, 15.0065f);
                l.cubicTo(3.0002f, 8.9375f, 7.9382f, 4.0005f, 14.0062f, 4.0005f);
                l.lineTo(359.9932f, 4.0005f);
                l.cubicTo(366.0632f, 4.0005f, 371.0002f, 8.9375f, 371.0002f, 15.0065f);
                l.lineTo(371.0002f, 98.3895f);
                l.lineTo(374.0002f, 98.3895f);
                l.lineTo(374.0002f, 15.0065f);
                l.cubicTo(374.0002f, 7.2655f, 367.7292f, 0.9995f, 359.9932f, 0.9995f);
                l.lineTo(14.0072f, 0.9995f);
                l.cubicTo(6.2762f, 0.9995f, 2.0E-4f, 7.2705f, 2.0E-4f, 15.0065f);
                l.lineTo(2.0E-4f, 226.9935f);
                l.cubicTo(2.0E-4f, 234.7345f, 6.2712f, 240.9995f, 14.0072f, 240.9995f);
                l.lineTo(168.0002f, 240.9995f);
                l.lineTo(168.0002f, 271.9995f);
                l.lineTo(115.0002f, 276.9995f);
                l.lineTo(115.0002f, 287.9995f);
                l.lineTo(259.0002f, 287.9995f);
                l.lineTo(259.0002f, 276.9995f);
                l.lineTo(206.0002f, 271.9995f);
                l.lineTo(206.0002f, 240.9995f);
                l.close();
                l.moveTo(317.9856f, 227.0001f);
                l.lineTo(14.0006f, 227.0001f);
                l.lineTo(14.0006f, 15.0001f);
                l.lineTo(360.0006f, 15.0001f);
                l.lineTo(360.0006f, 96.3901f);
                l.cubicTo(360.0006f, 96.3901f, 360.9996f, 98.02189f, 360.9996f, 96.01725f);
                l.lineTo(360.9996f, 14.0001f);
                l.lineTo(12.9996f, 14.0001f);
                l.lineTo(12.9996f, 228.0001f);
                l.lineTo(317.9856f, 228.0001f);
                l.lineTo(317.9856f, 227.0001f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.restore();
                canvas.save();
                float[] a3 = C5163c.m7878a(a2, 1.0f, 0.0f, 318.0f, 0.0f, 1.0f, 98.0f);
                h.reset();
                h.setValues(a3);
                canvas.concat(h);
                canvas.save();
                Paint a4 = C5163c.m7876a(k, looper);
                a4.setColor(-13092808);
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
                canvas.drawPath(l, a4);
                canvas.restore();
                canvas.save();
                g = C5163c.m7878a(a3, 1.0f, 0.0f, 35.0f, 0.0f, 1.0f, 77.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.restore();
                canvas.save();
                k = C5163c.m7876a(k, looper);
                k.setColor(-13092808);
                g = C5163c.m7878a(g, 1.0f, 0.0f, 7.0f, 0.0f, 1.0f, 10.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a5 = C5163c.m7876a(k, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(37.6973f, 77.1417f);
                l.lineTo(38.0463f, 76.6867f);
                l.cubicTo(39.3783f, 74.9527f, 41.1253f, 73.8087f, 43.2393f, 73.2887f);
                l.lineTo(44.0003f, 73.1007f);
                l.lineTo(44.0003f, 69.4957f);
                l.cubicTo(44.0003f, 68.6717f, 44.6733f, 67.9997f, 45.5003f, 67.9997f);
                l.cubicTo(46.3273f, 67.9997f, 47.0003f, 68.6717f, 47.0003f, 69.4957f);
                l.lineTo(47.0003f, 73.0587f);
                l.lineTo(47.7853f, 73.2317f);
                l.cubicTo(51.3673f, 74.0207f, 55.7253f, 76.9507f, 56.1413f, 86.3337f);
                l.cubicTo(55.9003f, 91.3737f, 56.7243f, 94.8457f, 57.6673f, 97.1117f);
                l.lineTo(37.6973f, 77.1417f);
                l.lineTo(37.6973f, 77.1417f);
                l.close();
                l.moveTo(57.1403f, 86.3817f);
                l.cubicTo(56.6993f, 76.3377f, 51.8463f, 73.1027f, 48.0003f, 72.2557f);
                l.lineTo(48.0003f, 69.4957f);
                l.cubicTo(48.0003f, 68.1157f, 46.8803f, 66.9997f, 45.5003f, 66.9997f);
                l.cubicTo(44.1093f, 66.9997f, 43.0003f, 68.1177f, 43.0003f, 69.4957f);
                l.lineTo(43.0003f, 72.3177f);
                l.cubicTo(41.0833f, 72.7897f, 38.9513f, 73.8667f, 37.2533f, 76.0777f);
                l.lineTo(29.5703f, 68.3957f);
                l.lineTo(28.5533f, 69.4127f);
                l.lineTo(61.2383f, 102.0977f);
                l.lineTo(61.1303f, 102.2057f);
                l.lineTo(61.3463f, 102.2057f);
                l.lineTo(63.5873f, 104.4457f);
                l.lineTo(64.6043f, 103.4287f);
                l.lineTo(59.2253f, 98.0497f);
                l.cubicTo(58.0323f, 95.8927f, 56.8603f, 92.2417f, 57.1403f, 86.3817f);
                l.lineTo(57.1403f, 86.3817f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a5);
                canvas.restore();
                canvas.save();
                a5 = C5163c.m7876a(k, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(35.123f, 86.4254f);
                l.cubicTo(35.186f, 84.9914f, 35.346f, 83.6534f, 35.599f, 82.4274f);
                l.lineTo(54.377f, 101.2054f);
                l.lineTo(30.86f, 101.2054f);
                l.cubicTo(32.193f, 100.0154f, 35.584f, 96.0194f, 35.123f, 86.4254f);
                l.lineTo(35.123f, 86.4254f);
                l.close();
                l.moveTo(35.063f, 80.4774f);
                l.cubicTo(34.56f, 82.1204f, 34.225f, 84.0714f, 34.124f, 86.3814f);
                l.cubicTo(34.663f, 97.6774f, 29.808f, 100.7664f, 29.808f, 100.7664f);
                l.lineTo(29.808f, 102.2054f);
                l.lineTo(56.791f, 102.2054f);
                l.lineTo(35.063f, 80.4774f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a5);
                canvas.restore();
                canvas.save();
                Paint a6 = C5163c.m7876a(k, looper);
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
                canvas.drawPath(l2, a6);
                canvas.restore();
                canvas.save();
                a5 = C5163c.m7876a(k, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(46.0f, 174.0001f);
                l.cubicTo(42.691f, 174.0001f, 40.0f, 171.3091f, 40.0f, 168.0001f);
                l.cubicTo(40.0f, 164.6911f, 42.691f, 162.0001f, 46.0f, 162.0001f);
                l.cubicTo(49.309f, 162.0001f, 52.0f, 164.6911f, 52.0f, 168.0001f);
                l.cubicTo(52.0f, 171.3091f, 49.309f, 174.0001f, 46.0f, 174.0001f);
                l.moveTo(46.0f, 161.0001f);
                l.cubicTo(42.134f, 161.0001f, 39.0f, 164.1341f, 39.0f, 168.0001f);
                l.cubicTo(39.0f, 171.8661f, 42.134f, 175.0001f, 46.0f, 175.0001f);
                l.cubicTo(49.866f, 175.0001f, 53.0f, 171.8661f, 53.0f, 168.0001f);
                l.cubicTo(53.0f, 164.1341f, 49.866f, 161.0001f, 46.0f, 161.0001f);
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a5);
                canvas.restore();
                canvas.save();
                a6 = C5163c.m7876a(k, looper);
                l2 = C5163c.m7884l(looper);
                l2.moveTo(39.0f, 3.0f);
                l2.lineTo(53.0f, 3.0f);
                l2.lineTo(53.0f, 0.0f);
                l2.lineTo(39.0f, 0.0f);
                l2.close();
                WeChatSVGRenderC2Java.setFillType(l2, 1);
                WeChatSVGRenderC2Java.setFillType(l2, 2);
                canvas.drawPath(l2, a6);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
