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

/* renamed from: com.tencent.mm.boot.svg.a.a.wp */
public final class C6385wp extends C5163c {
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
                Paint a = C5163c.m7876a(k, looper);
                a.setColor(-1118482);
                canvas.save();
                Paint a2 = C5163c.m7876a(a, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(0.0f, 0.0f);
                l.lineTo(210.0f, 0.0f);
                l.lineTo(210.0f, 210.0f);
                l.lineTo(0.0f, 210.0f);
                l.lineTo(0.0f, 0.0f);
                l.lineTo(0.0f, 0.0f);
                l.close();
                l.moveTo(51.375313f, 61.445953f);
                l.cubicTo(49.097633f, 62.294743f, 49.047684f, 64.9909f, 49.037693f, 67.018005f);
                l.cubicTo(49.067665f, 90.34475f, 49.067665f, 113.66151f, 49.047684f, 136.98825f);
                l.cubicTo(49.097633f, 140.20366f, 48.738f, 143.48898f, 49.447277f, 146.65446f);
                l.cubicTo(50.31639f, 148.91124f, 52.993664f, 148.94121f, 55.0216f, 148.96117f);
                l.cubicTo(86.3297f, 148.92123f, 117.637794f, 148.94121f, 148.95589f, 148.95119f);
                l.cubicTo(152.16261f, 148.90126f, 155.44926f, 149.26074f, 158.61604f, 148.56174f);
                l.cubicTo(160.9137f, 147.71295f, 160.94366f, 144.99683f, 160.96365f, 142.95973f);
                l.cubicTo(160.93369f, 119.65296f, 160.93369f, 96.336205f, 160.96365f, 73.029434f);
                l.cubicTo(160.89372f, 69.824005f, 161.26335f, 66.548676f, 160.56406f, 63.393177f);
                l.cubicTo(159.73491f, 61.126408f, 157.04764f, 61.056507f, 155.0297f, 61.046524f);
                l.cubicTo(124.04127f, 61.086468f, 93.05285f, 61.056507f, 62.064423f, 61.056507f);
                l.cubicTo(58.508045f, 61.136395f, 54.88174f, 60.69702f, 51.375313f, 61.445953f);
                l.lineTo(51.375313f, 61.445953f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                a = C5163c.m7876a(a, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(57.635704f, 69.08695f);
                l.cubicTo(88.87957f, 68.97611f, 120.133415f, 68.966034f, 151.3673f, 69.08695f);
                l.cubicTo(152.41542f, 73.55092f, 151.81648f, 78.14588f, 151.93628f, 82.68038f);
                l.cubicTo(151.83646f, 95.47776f, 152.1459f, 108.27513f, 151.77657f, 121.06243f);
                l.cubicTo(146.96521f, 114.80482f, 142.75278f, 107.32793f, 135.29617f, 103.93209f);
                l.cubicTo(129.4966f, 101.31215f, 124.17615f, 106.35049f, 119.654274f, 109.38357f);
                l.cubicTo(121.480995f, 115.4598f, 125.56366f, 120.38729f, 128.33867f, 126.0f);
                l.cubicTo(124.50556f, 123.178535f, 121.85033f, 119.168015f, 118.67603f, 115.68149f);
                l.cubicTo(111.83832f, 108.48674f, 106.98704f, 99.24644f, 98.45237f, 93.81511f);
                l.cubicTo(94.87879f, 91.38663f, 90.14729f, 90.19758f, 86.144485f, 92.34391f);
                l.cubicTo(74.57527f, 97.93647f, 65.3718f, 107.358154f, 57.246403f, 117.17284f);
                l.cubicTo(56.807194f, 103.64994f, 57.22644f, 90.11697f, 57.0268f, 76.59407f);
                l.cubicTo(56.93696f, 74.074905f, 57.056744f, 71.54566f, 57.635704f, 69.08695f);
                l.lineTo(57.635704f, 69.08695f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                k = C5163c.m7876a(k, looper);
                k.setColor(-2763307);
                float[] a3 = C5163c.m7878a(g, 1.0f, 0.0f, 49.0f, 0.0f, 1.0f, 61.0f);
                h.reset();
                h.setValues(a3);
                canvas.concat(h);
                canvas.save();
                Paint a4 = C5163c.m7876a(k, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(2.3753123f, 0.44595358f);
                l.cubicTo(5.8817396f, -0.30297858f, 9.508045f, 0.13639496f, 13.064421f, 0.05650886f);
                l.cubicTo(44.052845f, 0.05650886f, 75.041275f, 0.08646615f, 106.02969f, 0.0465231f);
                l.cubicTo(108.04764f, 0.05650886f, 110.7349f, 0.1264092f, 111.56406f, 2.3931773f);
                l.cubicTo(112.26334f, 5.548678f, 111.89372f, 8.824008f, 111.96365f, 12.029438f);
                l.cubicTo(111.93368f, 35.33621f, 111.93368f, 58.65296f, 111.96365f, 81.95973f);
                l.cubicTo(111.94367f, 83.996826f, 111.913704f, 86.71295f, 109.61604f, 87.561745f);
                l.cubicTo(106.44927f, 88.26075f, 103.16262f, 87.90126f, 99.95589f, 87.95119f);
                l.cubicTo(68.637794f, 87.9412f, 37.329697f, 87.92123f, 6.0215974f, 87.961174f);
                l.cubicTo(3.9936635f, 87.9412f, 1.3163913f, 87.91125f, 0.44727695f, 85.654465f);
                l.cubicTo(-0.26200035f, 82.488976f, 0.09763322f, 79.20366f, 0.047684114f, 75.98824f);
                l.cubicTo(0.06766376f, 52.661503f, 0.06766376f, 29.34475f, 0.037694294f, 6.0180087f);
                l.cubicTo(0.047684114f, 3.990899f, 0.09763322f, 1.2947434f, 2.3753123f, 0.44595358f);
                l.lineTo(2.3753123f, 0.44595358f);
                l.close();
                l.moveTo(8.026798f, 16.460844f);
                l.cubicTo(8.226439f, 29.746494f, 7.807193f, 43.042046f, 8.246404f, 56.327698f);
                l.cubicTo(16.371805f, 46.685204f, 25.653442f, 36.862114f, 37.222656f, 31.367676f);
                l.cubicTo(41.225464f, 29.258999f, 46.28824f, 30.396353f, 49.861816f, 32.782227f);
                l.cubicTo(58.39648f, 38.118267f, 62.838318f, 47.79399f, 69.67603f, 54.862514f);
                l.cubicTo(72.85033f, 58.287876f, 75.50556f, 62.22803f, 79.33867f, 65.0f);
                l.cubicTo(76.56366f, 59.485764f, 72.480995f, 54.644714f, 70.654274f, 48.675083f);
                l.cubicTo(74.348145f, 45.72705f, 80.42649f, 40.03394f, 86.226074f, 42.60791f);
                l.cubicTo(93.68268f, 45.94417f, 97.96521f, 54.001225f, 102.776566f, 60.149055f);
                l.cubicTo(103.1459f, 47.586094f, 102.83646f, 35.013237f, 102.93627f, 22.440376f);
                l.cubicTo(102.81649f, 17.985428f, 103.41541f, 13.471078f, 102.367294f, 9.085427f);
                l.cubicTo(71.133415f, 8.966628f, 39.87957f, 8.976528f, 8.635704f, 9.085427f);
                l.cubicTo(8.056745f, 11.500999f, 7.9369597f, 13.985872f, 8.026798f, 16.460844f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a4);
                canvas.restore();
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
