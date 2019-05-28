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

/* renamed from: com.tencent.mm.boot.svg.a.a.azd */
public final class azd extends C5163c {
    private final int height = 96;
    private final int width = 96;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 96;
            case 1:
                return 96;
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
                g = C5163c.m7878a(g, 1.0f, 0.0f, 16.0f, 0.0f, 1.0f, 16.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a = C5163c.m7876a(k, looper);
                a.setColor(-16731650);
                Path l = C5163c.m7884l(looper);
                l.moveTo(34.912872f, 17.558449f);
                l.cubicTo(34.91382f, 17.558449f, 34.915707f, 17.558449f, 34.916653f, 17.559427f);
                l.cubicTo(35.271107f, 17.633741f, 35.624615f, 17.723701f, 35.97434f, 17.826374f);
                l.cubicTo(35.975285f, 17.826374f, 35.975285f, 17.826374f, 35.97623f, 17.82735f);
                l.cubicTo(36.27397f, 17.914377f, 36.566982f, 18.02096f, 36.859997f, 18.1295f);
                l.cubicTo(36.96397f, 18.168612f, 37.06983f, 18.201859f, 37.17286f, 18.242928f);
                l.cubicTo(37.471546f, 18.361244f, 37.76456f, 18.495205f, 38.05663f, 18.634056f);
                l.cubicTo(38.13697f, 18.67317f, 38.21731f, 18.709349f, 38.29671f, 18.74944f);
                l.cubicTo(38.611465f, 18.907846f, 38.9196f, 19.078966f, 39.224903f, 19.26182f);
                l.cubicTo(39.26555f, 19.286264f, 39.30619f, 19.31071f, 39.34589f, 19.336134f);
                l.cubicTo(39.737206f, 19.5757f, 40.11718f, 19.83678f, 40.48959f, 20.118393f);
                l.cubicTo(40.62381f, 20.217154f, 40.758026f, 20.314936f, 40.888466f, 20.421518f);
                l.cubicTo(40.889412f, 20.422497f, 40.8913f, 20.423475f, 40.892246f, 20.424452f);
                l.cubicTo(40.99433f, 20.508545f, 41.09736f, 20.590683f, 41.198494f, 20.67771f);
                l.cubicTo(41.53215f, 20.964212f, 41.857304f, 21.263426f, 42.16922f, 21.586107f);
                l.cubicTo(42.444275f, 21.870655f, 42.69759f, 22.167913f, 42.941456f, 22.47006f);
                l.cubicTo(43.061497f, 22.614779f, 43.179646f, 22.761452f, 43.29307f, 22.910082f);
                l.cubicTo(43.29307f, 22.910082f, 43.294018f, 22.91106f, 43.29496f, 22.912037f);
                l.cubicTo(43.347893f, 22.981462f, 43.394207f, 23.0548f, 43.446194f, 23.125204f);
                l.cubicTo(43.44714f, 23.12618f, 43.448086f, 23.12716f, 43.448086f, 23.128138f);
                l.cubicTo(43.76284f, 23.556423f, 44.050182f, 23.9984f, 44.31295f, 24.45211f);
                l.cubicTo(44.313892f, 24.454067f, 44.31484f, 24.455044f, 44.315784f, 24.457f);
                l.cubicTo(44.44244f, 24.674076f, 44.57477f, 24.88822f, 44.690086f, 25.111164f);
                l.cubicTo(44.690086f, 25.111164f, 44.690086f, 25.112143f, 44.691032f, 25.112143f);
                l.cubicTo(44.74302f, 25.213837f, 44.785553f, 25.318462f, 44.8347f, 25.421135f);
                l.lineTo(44.835648f, 25.422112f);
                l.cubicTo(44.96892f, 25.697859f, 45.094635f, 25.97654f, 45.210896f, 26.258152f);
                l.lineTo(45.21373f, 26.264997f);
                l.cubicTo(45.31959f, 26.52412f, 45.411278f, 26.787155f, 45.502964f, 27.051168f);
                l.cubicTo(45.536045f, 27.150906f, 45.57102f, 27.249666f, 45.603153f, 27.349403f);
                l.cubicTo(45.739265f, 27.771824f, 45.855526f, 28.198156f, 45.95288f, 28.629375f);
                l.cubicTo(45.987854f, 28.774094f, 46.027554f, 28.918812f, 46.05591f, 29.065485f);
                l.cubicTo(46.056854f, 29.07233f, 46.058743f, 29.078197f, 46.060635f, 29.085043f);
                l.cubicTo(46.060635f, 29.08602f, 46.060635f, 29.087976f, 46.06158f, 29.089931f);
                l.lineTo(46.06158f, 29.09091f);
                l.lineTo(60.1943f, 29.09091f);
                l.cubicTo(61.306812f, 29.09091f, 62.360718f, 28.410343f, 62.81347f, 27.280956f);
                l.cubicTo(63.266224f, 26.15157f, 62.985497f, 24.897999f, 62.199085f, 24.084448f);
                l.lineTo(39.748547f, 0.8591668f);
                l.cubicTo(38.962135f, 0.04561703f, 37.751328f, -0.24381895f, 36.659615f, 0.22455887f);
                l.cubicTo(35.5679f, 0.69195884f, 34.908146f, 1.7832108f, 34.909092f, 2.93411f);
                l.lineTo(34.909092f, 17.554539f);
                l.lineTo(34.910038f, 17.554539f);
                l.cubicTo(34.911926f, 17.558449f, 34.912872f, 17.558449f, 34.912872f, 17.558449f);
                l.lineTo(34.912872f, 17.558449f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = C5163c.m7876a(k, looper);
                a.setColor(-499359);
                l = C5163c.m7884l(looper);
                l.moveTo(27.98998f, 46.179195f);
                l.cubicTo(27.8091f, 46.12835f, 27.63213f, 46.067726f, 27.454182f, 46.010036f);
                l.cubicTo(27.223438f, 45.934746f, 26.992693f, 45.855545f, 26.764881f, 45.76852f);
                l.cubicTo(26.593777f, 45.703007f, 26.422674f, 45.637497f, 26.253525f, 45.56514f);
                l.cubicTo(25.971937f, 45.445847f, 25.694262f, 45.314823f, 25.418541f, 45.17793f);
                l.cubicTo(25.314901f, 45.126106f, 25.208328f, 45.081127f, 25.105665f, 45.02637f);
                l.cubicTo(24.739016f, 44.83179f, 24.381165f, 44.616673f, 24.028204f, 44.389824f);
                l.cubicTo(23.90892f, 44.31258f, 23.79257f, 44.229465f, 23.674263f, 44.148308f);
                l.cubicTo(23.413208f, 43.96937f, 23.15802f, 43.781635f, 22.906742f, 43.584118f);
                l.cubicTo(22.798214f, 43.49905f, 22.689686f, 43.41496f, 22.583113f, 43.32598f);
                l.cubicTo(22.23895f, 43.039486f, 21.90261f, 42.741257f, 21.579958f, 42.418583f);
                l.cubicTo(21.257305f, 42.09591f, 20.958118f, 41.758568f, 20.671642f, 41.414383f);
                l.cubicTo(20.583647f, 41.30878f, 20.50054f, 41.201225f, 20.416454f, 41.093666f);
                l.cubicTo(20.216997f, 40.840416f, 20.028294f, 40.58228f, 19.847414f, 40.31925f);
                l.cubicTo(19.768217f, 40.20387f, 19.687065f, 40.089466f, 19.610802f, 39.97311f);
                l.cubicTo(19.38299f, 39.619144f, 19.16691f, 39.259315f, 18.972342f, 38.891663f);
                l.cubicTo(18.919544f, 38.791927f, 18.875546f, 38.688282f, 18.825682f, 38.58757f);
                l.cubicTo(18.685865f, 38.308895f, 18.553871f, 38.02729f, 18.43361f, 37.74177f);
                l.cubicTo(18.363213f, 37.57457f, 18.297705f, 37.406387f, 18.233175f, 37.23723f);
                l.cubicTo(18.145178f, 37.00549f, 18.065004f, 36.772774f, 17.98874f, 36.5381f);
                l.cubicTo(17.932034f, 36.36308f, 17.87239f, 36.18903f, 17.822527f, 36.01107f);
                l.cubicTo(17.719864f, 35.64635f, 17.627958f, 35.278698f, 17.55365f, 34.909092f);
                l.lineTo(2.9335957f, 34.909092f);
                l.cubicTo(1.7837806f, 34.909092f, 0.6926297f, 35.589638f, 0.22429515f, 36.72095f);
                l.cubicTo(-0.24403936f, 37.848354f, 0.046347596f, 39.10189f, 0.85982215f, 39.91542f);
                l.lineTo(24.083935f, 63.141064f);
                l.cubicTo(24.896431f, 63.953617f, 26.149885f, 64.24402f, 27.27917f, 63.775658f);
                l.cubicTo(28.408451f, 63.30827f, 29.09091f, 62.218025f, 29.09091f, 61.066177f);
                l.lineTo(29.09091f, 46.447113f);
                l.cubicTo(29.0782f, 46.445156f, 29.066465f, 46.441246f, 29.054733f, 46.438313f);
                l.cubicTo(28.694927f, 46.365955f, 28.340986f, 46.27893f, 27.98998f, 46.179195f);
                l.lineTo(27.98998f, 46.179195f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = C5163c.m7876a(k, looper);
                a.setColor(-16074232);
                l = C5163c.m7884l(looper);
                l.moveTo(61.062687f, 34.909092f);
                l.lineTo(46.443386f, 34.909092f);
                l.cubicTo(46.431652f, 34.967766f, 46.41405f, 35.024483f, 46.40134f, 35.082176f);
                l.cubicTo(46.33387f, 35.392166f, 46.260536f, 35.702156f, 46.175465f, 36.00921f);
                l.cubicTo(46.175465f, 36.01019f, 46.174488f, 36.011166f, 46.174488f, 36.012142f);
                l.cubicTo(46.086483f, 36.322132f, 45.978924f, 36.62821f, 45.86941f, 36.933308f);
                l.cubicTo(45.83421f, 37.03403f, 45.80194f, 37.134754f, 45.764782f, 37.234497f);
                l.cubicTo(45.763805f, 37.23645f, 45.76283f, 37.238407f, 45.76283f, 37.240364f);
                l.cubicTo(45.699272f, 37.408558f, 45.63376f, 37.5748f, 45.563354f, 37.74104f);
                l.cubicTo(45.563354f, 37.74104f, 45.563354f, 37.74104f, 45.563354f, 37.742016f);
                l.cubicTo(45.443085f, 38.025604f, 45.312057f, 38.3043f, 45.174183f, 38.58104f);
                l.cubicTo(45.174183f, 38.58104f, 45.173206f, 38.58202f, 45.173206f, 38.582996f);
                l.cubicTo(45.12236f, 38.684696f, 45.078358f, 38.788353f, 45.025555f, 38.889072f);
                l.cubicTo(45.025555f, 38.890053f, 45.02458f, 38.890053f, 45.02458f, 38.89103f);
                l.cubicTo(44.90626f, 39.113987f, 44.76839f, 39.328144f, 44.637363f, 39.54523f);
                l.cubicTo(44.363575f, 40.001904f, 44.064365f, 40.44586f, 43.737774f, 40.87711f);
                l.cubicTo(43.683994f, 40.947517f, 43.63608f, 41.01988f, 43.581326f, 41.090286f);
                l.cubicTo(43.580345f, 41.091263f, 43.57937f, 41.092243f, 43.57937f, 41.092243f);
                l.cubicTo(43.219532f, 41.549892f, 42.838184f, 41.994827f, 42.416748f, 42.416294f);
                l.cubicTo(41.129944f, 43.70319f, 39.659313f, 44.68694f, 38.09481f, 45.399815f);
                l.cubicTo(37.97747f, 45.454575f, 37.86111f, 45.51325f, 37.742798f, 45.56312f);
                l.lineTo(37.742798f, 45.56312f);
                l.cubicTo(37.573635f, 45.634506f, 37.403496f, 45.701004f, 37.233356f, 45.76554f);
                l.cubicTo(37.233356f, 45.76554f, 37.232376f, 45.76554f, 37.2314f, 45.76652f);
                l.cubicTo(37.165886f, 45.790966f, 37.099396f, 45.811504f, 37.033882f, 45.834972f);
                l.cubicTo(36.69458f, 45.958187f, 36.3543f, 46.078465f, 36.008156f, 46.176254f);
                l.lineTo(36.008156f, 46.176254f);
                l.cubicTo(35.644405f, 46.27893f, 35.277725f, 46.369873f, 34.909092f, 46.44419f);
                l.lineTo(34.909092f, 61.06549f);
                l.cubicTo(34.909092f, 62.217438f, 35.58965f, 63.307774f, 36.72f, 63.775204f);
                l.cubicTo(37.8484f, 64.24458f, 39.102936f, 63.95318f, 39.9155f, 63.140556f);
                l.lineTo(63.14054f, 39.913895f);
                l.cubicTo(63.954082f, 39.09932f, 64.243515f, 37.84763f, 63.77612f, 36.718174f);
                l.cubicTo(63.304813f, 35.5897f, 62.213573f, 34.908115f, 61.062687f, 34.909092f);
                l.lineTo(61.062687f, 34.909092f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = C5163c.m7876a(k, looper);
                a.setColor(-212971);
                l = C5163c.m7884l(looper);
                l.moveTo(2.9339895f, 29.09091f);
                l.lineTo(17.554485f, 29.09091f);
                l.cubicTo(18.108913f, 26.34041f, 19.44854f, 23.715067f, 21.581184f, 21.581549f);
                l.cubicTo(23.714806f, 19.44803f, 26.339298f, 18.108469f, 29.09091f, 17.554068f);
                l.lineTo(29.09091f, 2.9342813f);
                l.cubicTo(29.09091f, 1.7834328f, 28.41034f, 0.6922289f, 27.280949f, 0.22387168f);
                l.cubicTo(26.152534f, -0.24350779f, 24.89798f, 0.04591548f, 24.084425f, 0.85942954f);
                l.lineTo(0.85903686f, 24.08369f);
                l.cubicTo(0.045483325f, 24.897205f, -0.24297616f, 26.15072f, 0.22344816f, 27.27908f);
                l.cubicTo(0.69182813f, 28.410374f, 1.7830851f, 29.09091f, 2.9339895f, 29.09091f);
                l.lineTo(2.9339895f, 29.09091f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
