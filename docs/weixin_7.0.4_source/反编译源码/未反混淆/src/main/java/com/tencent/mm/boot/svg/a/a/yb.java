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

public final class yb extends c {
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
                k2 = c.a(k2, looper);
                k2.setStrokeWidth(1.0f);
                canvas.save();
                Paint a = c.a(k2, looper);
                a.setColor(-3355444);
                float[] a2 = c.a(g, 1.0f, 0.0f, 36.0f, 0.0f, 1.0f, 12.0f);
                h.reset();
                h.setValues(a2);
                canvas.concat(h);
                canvas.save();
                Paint a3 = c.a(k, looper);
                Paint a4 = c.a(a, looper);
                a3.setColor(-3355444);
                a4.setStrokeWidth(4.32f);
                Path l = c.l(looper);
                l.moveTo(65.76809f, 37.893055f);
                l.cubicTo(68.40142f, 25.598955f, 69.14313f, 12.708855f, 66.977585f, 8.937693f);
                l.lineTo(66.5504f, 8.193766f);
                l.lineTo(67.994026f, 2.16f);
                l.cubicTo(67.143425f, 2.16f, 65.93759f, 2.16f, 64.148056f, 2.16f);
                l.cubicTo(56.467045f, 2.16f, 56.467045f, 2.16f, 44.39688f, 2.16f);
                l.cubicTo(44.342266f, 2.16f, 44.227406f, 2.1607683f, 44.05636f, 2.1631331f);
                l.cubicTo(43.7656f, 2.167153f, 43.4267f, 2.1744235f, 43.04373f, 2.185769f);
                l.cubicTo(41.94385f, 2.2183537f, 40.715954f, 2.2771175f, 39.392708f, 2.368589f);
                l.cubicTo(35.618073f, 2.6295168f, 31.8465f, 3.0988064f, 28.345474f, 3.8248494f);
                l.cubicTo(21.099072f, 5.3276086f, 16.074677f, 7.7334867f, 14.30328f, 10.884384f);
                l.lineTo(14.169576f, 11.122212f);
                l.lineTo(12.610786f, 11.977462f);
                l.lineTo(12.492328f, 11.984674f);
                l.cubicTo(12.4792795f, 11.985089f, 12.4792795f, 11.985089f, 12.461704f, 11.98548f);
                l.cubicTo(12.443822f, 11.985765f, 12.443822f, 11.985765f, 12.437808f, 11.985812f);
                l.cubicTo(12.205375f, 11.987832f, 11.85872f, 12.017767f, 11.348712f, 12.122744f);
                l.cubicTo(10.493734f, 12.298726f, 9.642155f, 12.616304f, 8.858459f, 13.104166f);
                l.cubicTo(6.5659223f, 14.531304f, 5.1734557f, 17.155987f, 5.1734557f, 21.62069f);
                l.cubicTo(5.1734557f, 23.364813f, 6.3625455f, 28.936539f, 8.701701f, 37.968338f);
                l.lineTo(65.76809f, 37.893055f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a3);
                canvas.drawPath(l, a4);
                canvas.restore();
                canvas.save();
                k = c.a(k, looper);
                a3 = c.a(a, looper);
                k.setColor(-1);
                a3.setStrokeWidth(4.8f);
                l = c.l(looper);
                l.moveTo(62.4f, 33.234783f);
                l.cubicTo(62.4f, 27.471912f, 58.318142f, 22.8f, 53.283115f, 22.8f);
                l.lineTo(20.462337f, 22.8f);
                l.cubicTo(15.427311f, 22.8f, 11.345454f, 27.471912f, 11.345454f, 33.234783f);
                l.lineTo(11.345454f, 52.01739f);
                l.cubicTo(11.345454f, 57.07226f, 14.000975f, 61.631477f, 18.077816f, 63.576f);
                l.lineTo(29.859337f, 69.19461f);
                l.cubicTo(32.081577f, 70.254524f, 34.465187f, 70.8f, 36.872498f, 70.8f);
                l.cubicTo(39.27981f, 70.8f, 41.663193f, 70.25426f, 43.885433f, 69.19461f);
                l.lineTo(55.667637f, 63.57574f);
                l.cubicTo(59.74448f, 61.63174f, 62.4f, 57.07252f, 62.4f, 52.01739f);
                l.lineTo(62.4f, 33.234783f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 1);
                canvas.drawPath(l, k);
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.save();
                k = c.a(a, looper);
                k.setStrokeWidth(4.8f);
                k.setStrokeCap(Cap.ROUND);
                k.setStrokeJoin(Join.MITER);
                l = c.l(looper);
                l.moveTo(73.70103f, 117.0f);
                l.lineTo(71.32007f, 93.00854f);
                l.cubicTo(70.960785f, 89.952194f, 68.98214f, 87.38674f, 66.23344f, 86.412704f);
                l.lineTo(57.052197f, 83.1594f);
                l.cubicTo(55.453293f, 82.59277f, 53.654526f, 83.19789f, 52.751377f, 84.71057f);
                l.cubicTo(49.41672f, 90.29537f, 43.55603f, 94.005325f, 36.87261f, 94.005325f);
                l.cubicTo(30.189188f, 94.005325f, 24.328497f, 90.29512f, 20.994076f, 84.71057f);
                l.cubicTo(20.090929f, 83.19789f, 18.292162f, 82.59277f, 16.693256f, 83.1594f);
                l.lineTo(7.5120173f, 86.412704f);
                l.cubicTo(4.763077f, 87.38674f, 2.7846675f, 89.952194f, 2.425384f, 93.00854f);
                l.lineTo(0.0f, 117.0f);
                canvas.drawPath(l, k);
                canvas.restore();
                canvas.save();
                k = c.a(a, looper);
                k.setStrokeWidth(4.8f);
                k.setStrokeCap(Cap.ROUND);
                k.setStrokeJoin(Join.MITER);
                l = c.l(looper);
                l.moveTo(25.566744f, 69.0f);
                l.cubicTo(26.352238f, 77.77534f, 25.393625f, 83.77534f, 22.690908f, 87.0f);
                canvas.drawPath(l, k);
                canvas.restore();
                canvas.save();
                k = c.a(a, looper);
                k.setStrokeWidth(4.8f);
                k.setStrokeCap(Cap.ROUND);
                k.setStrokeJoin(Join.MITER);
                g = c.a(a2, -1.0f, 0.0f, 99.57752f, 0.0f, 1.0f, 0.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                l = c.l(looper);
                l.moveTo(51.094017f, 69.0f);
                l.cubicTo(51.87951f, 77.77534f, 50.9209f, 83.77534f, 48.21818f, 87.0f);
                canvas.drawPath(l, k);
                canvas.restore();
                canvas.save();
                Paint a5 = c.a(a, looper);
                a5.setStrokeWidth(4.8f);
                l = c.l(looper);
                l.moveTo(7.090909f, 39.899998f);
                l.cubicTo(9.44063f, 39.899998f, 11.345454f, 41.81398f, 11.345454f, 44.175f);
                l.cubicTo(11.345454f, 46.53602f, 9.44063f, 48.45f, 7.090909f, 48.45f);
                l.cubicTo(4.7411885f, 48.45f, 2.8363638f, 46.53602f, 2.8363638f, 44.175f);
                l.cubicTo(2.8363638f, 41.81398f, 4.7411885f, 39.899998f, 7.090909f, 39.899998f);
                l.close();
                canvas.drawPath(l, a5);
                canvas.restore();
                canvas.save();
                a5 = c.a(a, looper);
                a5.setStrokeWidth(4.8f);
                l = c.l(looper);
                l.moveTo(66.65455f, 39.899998f);
                l.cubicTo(69.00427f, 39.899998f, 70.909096f, 41.81398f, 70.909096f, 44.175f);
                l.cubicTo(70.909096f, 46.53602f, 69.00427f, 48.45f, 66.65455f, 48.45f);
                l.cubicTo(64.304825f, 48.45f, 62.4f, 46.53602f, 62.4f, 44.175f);
                l.cubicTo(62.4f, 41.81398f, 64.304825f, 39.899998f, 66.65455f, 39.899998f);
                l.close();
                canvas.drawPath(l, a5);
                canvas.restore();
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
