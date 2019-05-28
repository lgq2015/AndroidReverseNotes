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

/* renamed from: com.tencent.mm.boot.svg.a.a.ale */
public final class ale extends C5163c {
    private final int height = 48;
    private final int width = 48;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 48;
            case 1:
                return 48;
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
                g = C5163c.m7878a(g, 1.0f, 0.0f, -57.0f, 0.0f, 1.0f, -426.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                g = C5163c.m7878a(g, 1.0f, 0.0f, 57.0f, 0.0f, 1.0f, 426.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                g = C5163c.m7878a(g, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 1.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                Paint a2 = C5163c.m7876a(k, looper);
                a2.setColor(421178649);
                canvas.save();
                Paint a3 = C5163c.m7876a(a2, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(0.0f, 22.0f);
                l.cubicTo(0.008455056f, 16.672909f, 0.0f, 11.917717f, 0.0f, 6.0f);
                l.cubicTo(5.9540505f, 4.1088686f, 12.507443f, 1.9538383f, 22.0f, 0.0f);
                l.cubicTo(30.492556f, 1.9538383f, 37.045948f, 4.1088686f, 43.0f, 6.0f);
                l.cubicTo(43.0f, 11.917717f, 42.991547f, 16.672909f, 43.0f, 22.0f);
                l.cubicTo(42.991547f, 35.808678f, 30.947437f, 43.57803f, 21.0f, 46.0f);
                l.cubicTo(12.052562f, 43.57803f, 0.008455056f, 35.808678f, 0.0f, 22.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.save();
                a3 = C5163c.m7876a(a, looper);
                a3.setColor(-15028967);
                a3.setStrokeWidth(3.0f);
                l = C5163c.m7884l(looper);
                l.moveTo(1.5000008f, 22.00073f);
                l.cubicTo(1.5075872f, 32.99103f, 10.078676f, 41.353813f, 21.020136f, 44.449203f);
                l.cubicTo(32.69469f, 41.47724f, 41.49317f, 33.14895f, 41.5f, 22.00238f);
                l.cubicTo(41.497402f, 20.365496f, 41.496265f, 18.710062f, 41.496243f, 16.854805f);
                l.cubicTo(41.496227f, 15.422399f, 41.49664f, 14.398892f, 41.498123f, 11.593655f);
                l.cubicTo(41.499176f, 9.594675f, 41.499725f, 8.331651f, 41.499916f, 7.096765f);
                l.cubicTo(40.838436f, 6.8861384f, 40.11861f, 6.6568284f, 39.97149f, 6.610029f);
                l.cubicTo(38.935696f, 6.2805448f, 38.116764f, 6.0216136f, 37.30908f, 5.7688565f);
                l.cubicTo(35.25496f, 5.1260386f, 33.440895f, 4.576554f, 31.62486f, 4.051996f);
                l.cubicTo(28.394964f, 3.1190488f, 25.252028f, 2.293892f, 21.982248f, 1.5354043f);
                l.cubicTo(18.317486f, 2.296731f, 14.915536f, 3.1245034f, 11.540995f, 4.056751f);
                l.cubicTo(8.388927f, 4.927538f, 7.122994f, 5.313002f, 1.5000832f, 7.0975056f);
                l.cubicTo(1.5002767f, 8.332155f, 1.500823f, 9.595075f, 1.5018787f, 11.593655f);
                l.cubicTo(1.5033605f, 14.398892f, 1.5037745f, 15.422399f, 1.5037575f, 16.854805f);
                l.cubicTo(1.5037354f, 18.709438f, 1.5025969f, 20.364384f, 1.5000007f, 22.00073f);
                l.close();
                l.moveTo(1.5000007f, 22.00073f);
                l.cubicTo(1.4999999f, 22.001282f, 1.4999989f, 22.001831f, 1.4999981f, 22.00238f);
                l.lineTo(1.4999998f, 21.99908f);
                l.cubicTo(1.5000001f, 21.999632f, 1.5000004f, 22.000181f, 1.5000008f, 22.00073f);
                l.close();
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.save();
                a3 = C5163c.m7876a(k, looper);
                a3.setColor(-15028967);
                l = C5163c.m7884l(looper);
                l.moveTo(13.085647f, 10.3166275f);
                l.lineTo(23.235413f, 10.3166275f);
                l.cubicTo(25.576914f, 10.3166275f, 27.333014f, 10.822622f, 28.503765f, 11.834627f);
                l.cubicTo(29.674515f, 12.846633f, 30.259882f, 14.255481f, 30.259882f, 16.061216f);
                l.cubicTo(30.259882f, 17.073221f, 30.111061f, 17.911585f, 29.813412f, 18.576334f);
                l.cubicTo(29.515762f, 19.241081f, 29.168512f, 19.77684f, 28.771646f, 20.183628f);
                l.cubicTo(28.374783f, 20.590414f, 27.982883f, 20.883097f, 27.595942f, 21.061686f);
                l.cubicTo(27.208998f, 21.240276f, 26.926237f, 21.359333f, 26.747646f, 21.418863f);
                l.lineTo(26.747646f, 21.478392f);
                l.cubicTo(27.065138f, 21.518078f, 27.407429f, 21.617292f, 27.774529f, 21.77604f);
                l.cubicTo(28.14163f, 21.934786f, 28.48392f, 22.187782f, 28.801413f, 22.53504f);
                l.cubicTo(29.118904f, 22.882296f, 29.381823f, 23.333723f, 29.590176f, 23.889334f);
                l.cubicTo(29.79853f, 24.444944f, 29.902706f, 25.139446f, 29.902706f, 25.972862f);
                l.cubicTo(29.902706f, 27.222986f, 29.99696f, 28.358995f, 30.18547f, 29.380922f);
                l.cubicTo(30.373981f, 30.402847f, 30.666664f, 31.132076f, 31.06353f, 31.568628f);
                l.lineTo(27.075058f, 31.568628f);
                l.cubicTo(26.797253f, 31.112232f, 26.633549f, 30.606237f, 26.58394f, 30.050627f);
                l.cubicTo(26.534332f, 29.495016f, 26.50953f, 28.959257f, 26.50953f, 28.443333f);
                l.cubicTo(26.50953f, 27.471014f, 26.45f, 26.63265f, 26.33094f, 25.928215f);
                l.cubicTo(26.211882f, 25.223782f, 25.993608f, 24.638414f, 25.676117f, 24.172098f);
                l.cubicTo(25.358625f, 23.705782f, 24.927042f, 23.363491f, 24.381353f, 23.145216f);
                l.cubicTo(23.835665f, 22.92694f, 23.1362f, 22.817804f, 22.282942f, 22.817804f);
                l.lineTo(16.806234f, 22.817804f);
                l.lineTo(16.806234f, 31.568628f);
                l.lineTo(13.085647f, 31.568628f);
                l.lineTo(13.085647f, 10.3166275f);
                l.close();
                l.moveTo(16.806234f, 19.990156f);
                l.lineTo(22.908f, 19.990156f);
                l.cubicTo(24.098595f, 19.990156f, 25.001448f, 19.707396f, 25.616589f, 19.141863f);
                l.cubicTo(26.23173f, 18.57633f, 26.539293f, 17.728045f, 26.539293f, 16.596981f);
                l.cubicTo(26.539293f, 15.922311f, 26.440079f, 15.371669f, 26.241648f, 14.945039f);
                l.cubicTo(26.043215f, 14.51841f, 25.770374f, 14.18604f, 25.423117f, 13.947922f);
                l.cubicTo(25.075861f, 13.709803f, 24.679003f, 13.551059f, 24.232529f, 13.471686f);
                l.cubicTo(23.786057f, 13.392313f, 23.324709f, 13.352628f, 22.84847f, 13.352628f);
                l.lineTo(16.806234f, 13.352628f);
                l.lineTo(16.806234f, 19.990156f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a3);
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
