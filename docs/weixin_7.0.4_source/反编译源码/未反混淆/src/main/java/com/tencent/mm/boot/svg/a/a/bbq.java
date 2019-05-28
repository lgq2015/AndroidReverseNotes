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

public final class bbq extends c {
    private final int height = 16;
    private final int width = 16;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 16;
            case 1:
                return 16;
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
                Paint a = c.a(k2, looper);
                a.setStrokeWidth(1.0f);
                canvas.save();
                g = c.a(g, 1.0f, 0.0f, -72.0f, 0.0f, 1.0f, -671.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                g = c.a(g, 1.0f, 0.0f, 66.0f, 0.0f, 1.0f, 602.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                g = c.a(g, 1.0f, 0.0f, 5.0f, 0.0f, 1.0f, 68.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                Path l = c.l(looper);
                l.moveTo(0.0f, 0.0f);
                l.lineTo(18.0f, 0.0f);
                l.lineTo(18.0f, 18.0f);
                l.lineTo(0.0f, 18.0f);
                l.lineTo(0.0f, 0.0f);
                l.close();
                canvas.save();
                Paint a2 = c.a(k, looper);
                k = c.a(a, looper);
                a2.setColor(-5066062);
                k.setColor(-5066062);
                k.setStrokeWidth(0.2f);
                l = c.l(looper);
                l.moveTo(10.942768f, 15.577216f);
                l.cubicTo(11.560647f, 14.929062f, 12.0694685f, 13.967736f, 12.421054f, 12.800017f);
                l.lineTo(14.708638f, 12.800017f);
                l.cubicTo(13.826419f, 14.120741f, 12.498858f, 15.116574f, 10.942768f, 15.577216f);
                l.lineTo(10.942768f, 15.577216f);
                l.close();
                l.moveTo(3.2918792f, 12.800017f);
                l.lineTo(5.5967164f, 12.800017f);
                l.cubicTo(5.949279f, 13.970991f, 6.4597287f, 14.934596f, 7.079886f, 15.583076f);
                l.cubicTo(5.514029f, 15.125363f, 4.177679f, 14.126926f, 3.2918792f, 12.800017f);
                l.lineTo(3.2918792f, 12.800017f);
                l.close();
                l.moveTo(7.079886f, 2.416854f);
                l.cubicTo(6.3604383f, 3.1691816f, 5.7884607f, 4.3443885f, 5.440782f, 5.7770987f);
                l.lineTo(2.9461534f, 5.7770987f);
                l.cubicTo(3.8078632f, 4.1653404f, 5.294288f, 2.9390235f, 7.079886f, 2.416854f);
                l.lineTo(7.079886f, 2.416854f);
                l.close();
                l.moveTo(15.054038f, 5.7770987f);
                l.lineTo(12.576989f, 5.7770987f);
                l.cubicTo(12.229961f, 4.3479695f, 11.659612f, 3.1750414f, 10.942768f, 2.4230392f);
                l.cubicTo(12.718599f, 2.9484642f, 14.1959095f, 4.171851f, 15.054038f, 5.7770987f);
                l.lineTo(15.054038f, 5.7770987f);
                l.close();
                l.moveTo(12.932481f, 9.608077f);
                l.lineTo(15.830781f, 9.608077f);
                l.cubicTo(15.750047f, 10.52285f, 15.488962f, 11.384886f, 15.083337f, 12.161955f);
                l.lineTo(12.591964f, 12.161955f);
                l.cubicTo(12.777848f, 11.377724f, 12.89602f, 10.518944f, 12.932481f, 9.608077f);
                l.lineTo(12.932481f, 9.608077f);
                l.close();
                l.moveTo(9.31929f, 12.161955f);
                l.lineTo(9.31929f, 9.608077f);
                l.lineTo(12.294418f, 9.608077f);
                l.cubicTo(12.254376f, 10.517316f, 12.125136f, 11.381305f, 11.92623f, 12.161955f);
                l.lineTo(9.31929f, 12.161955f);
                l.close();
                l.moveTo(9.31929f, 15.830813f);
                l.lineTo(9.31929f, 12.800017f);
                l.lineTo(11.743601f, 12.800017f);
                l.cubicTo(11.199946f, 14.475256f, 10.315123f, 15.642976f, 9.31929f, 15.830813f);
                l.lineTo(9.31929f, 15.830813f);
                l.close();
                l.moveTo(8.680902f, 12.800017f);
                l.lineTo(8.680902f, 15.82886f);
                l.cubicTo(7.6922307f, 15.630605f, 6.8145695f, 14.46549f, 6.2741694f, 12.800017f);
                l.lineTo(8.680902f, 12.800017f);
                l.close();
                l.moveTo(5.7230268f, 9.608077f);
                l.lineTo(8.680902f, 9.608077f);
                l.lineTo(8.680902f, 12.161955f);
                l.lineTo(6.0915403f, 12.161955f);
                l.cubicTo(5.8923087f, 11.381305f, 5.7633944f, 10.517316f, 5.7230268f, 9.608077f);
                l.lineTo(5.7230268f, 9.608077f);
                l.close();
                l.moveTo(8.680902f, 6.415487f);
                l.lineTo(8.680902f, 8.969364f);
                l.lineTo(5.708703f, 8.969364f);
                l.cubicTo(5.710656f, 8.071844f, 5.800506f, 7.2091584f, 5.959696f, 6.415487f);
                l.lineTo(8.680902f, 6.415487f);
                l.close();
                l.moveTo(8.680902f, 2.1713953f);
                l.lineTo(8.680902f, 5.7770987f);
                l.lineTo(6.105539f, 5.7770987f);
                l.cubicTo(6.619895f, 3.8082206f, 7.5815463f, 2.3914616f, 8.680902f, 2.1713953f);
                l.lineTo(8.680902f, 2.1713953f);
                l.close();
                l.moveTo(9.31929f, 5.7770987f);
                l.lineTo(9.31929f, 2.1694422f);
                l.cubicTo(10.425807f, 2.3781145f, 11.394946f, 3.7981288f, 11.911906f, 5.7770987f);
                l.lineTo(9.31929f, 5.7770987f);
                l.close();
                l.moveTo(12.308743f, 8.969364f);
                l.lineTo(9.31929f, 8.969364f);
                l.lineTo(9.31929f, 6.415487f);
                l.lineTo(12.057749f, 6.415487f);
                l.cubicTo(12.217265f, 7.2091584f, 12.306788f, 8.071844f, 12.308743f, 8.969364f);
                l.lineTo(12.308743f, 8.969364f);
                l.close();
                l.moveTo(15.86008f, 8.969364f);
                l.lineTo(12.947455f, 8.969364f);
                l.cubicTo(12.945502f, 8.066636f, 12.860862f, 7.210135f, 12.713065f, 6.415487f);
                l.lineTo(15.352235f, 6.415487f);
                l.cubicTo(15.674847f, 7.2052517f, 15.8561735f, 8.06631f, 15.86008f, 8.969364f);
                l.lineTo(15.86008f, 8.969364f);
                l.close();
                l.moveTo(2.6479568f, 6.415487f);
                l.lineTo(5.30438f, 6.415487f);
                l.cubicTo(5.156584f, 7.210135f, 5.071943f, 8.066636f, 5.0703154f, 8.969364f);
                l.lineTo(2.1397858f, 8.969364f);
                l.cubicTo(2.144018f, 8.06631f, 2.3253448f, 7.2052517f, 2.6479568f, 6.415487f);
                l.lineTo(2.6479568f, 6.415487f);
                l.close();
                l.moveTo(2.1690845f, 9.608077f);
                l.lineTo(5.0849648f, 9.608077f);
                l.cubicTo(5.121751f, 10.518944f, 5.239597f, 11.377724f, 5.4254813f, 12.161955f);
                l.lineTo(2.9165292f, 12.161955f);
                l.cubicTo(2.5112293f, 11.384886f, 2.249819f, 10.52285f, 2.1690845f, 9.608077f);
                l.lineTo(2.1690845f, 9.608077f);
                l.close();
                l.moveTo(16.482841f, 9.344388f);
                l.cubicTo(16.486097f, 9.325507f, 16.49391f, 9.3085785f, 16.49391f, 9.288721f);
                l.cubicTo(16.49391f, 9.276675f, 16.488377f, 9.26691f, 16.4874f, 9.255515f);
                l.cubicTo(16.49033f, 9.169898f, 16.500095f, 9.086233f, 16.500095f, 8.999965f);
                l.cubicTo(16.500095f, 7.9325128f, 16.272541f, 6.918449f, 15.868545f, 5.998142f);
                l.cubicTo(15.861056f, 5.974703f, 15.850314f, 5.9545193f, 15.837943f, 5.93401f);
                l.cubicTo(14.673479f, 3.3482296f, 12.089978f, 1.5372394f, 9.082946f, 1.5043597f);
                l.cubicTo(9.067646f, 1.5040342f, 9.053322f, 1.5001277f, 9.038021f, 1.5001277f);
                l.cubicTo(9.035417f, 1.5001277f, 9.033138f, 1.5014298f, 9.030209f, 1.5014298f);
                l.cubicTo(9.020117f, 1.5014298f, 9.01035f, 1.5001277f, 9.000258f, 1.5001277f);
                l.cubicTo(8.994399f, 1.5001277f, 8.98919f, 1.5007788f, 8.983656f, 1.5007788f);
                l.cubicTo(8.982028f, 1.5007788f, 8.981051f, 1.5001277f, 8.9794235f, 1.5001277f);
                l.cubicTo(8.971285f, 1.5001277f, 8.963472f, 1.5020809f, 8.955334f, 1.5020809f);
                l.cubicTo(5.9316993f, 1.5203112f, 3.3315952f, 3.3371613f, 2.1625738f, 5.93401f);
                l.cubicTo(2.1498775f, 5.9545193f, 2.1391346f, 5.974703f, 2.1313217f, 5.998142f);
                l.cubicTo(1.7276496f, 6.918449f, 1.5000957f, 7.9325128f, 1.5000957f, 8.999965f);
                l.cubicTo(1.5000957f, 9.077769f, 1.509211f, 9.153621f, 1.5118153f, 9.230774f);
                l.cubicTo(1.5079087f, 9.250307f, 1.5000957f, 9.268211f, 1.5000957f, 9.288721f);
                l.cubicTo(1.5000957f, 9.323228f, 1.5095365f, 9.35448f, 1.5196283f, 9.385733f);
                l.cubicTo(1.578877f, 10.5446615f, 1.8943272f, 11.63653f, 2.4230075f, 12.599157f);
                l.cubicTo(2.4295182f, 12.61576f, 2.4412377f, 12.629107f, 2.4506783f, 12.644408f);
                l.cubicTo(3.7268033f, 14.929387f, 6.1612067f, 16.481247f, 8.955334f, 16.497849f);
                l.cubicTo(8.963472f, 16.497849f, 8.971285f, 16.500128f, 8.9794235f, 16.500128f);
                l.cubicTo(8.981051f, 16.500128f, 8.982028f, 16.499477f, 8.983656f, 16.499477f);
                l.cubicTo(8.98919f, 16.499477f, 8.994399f, 16.500128f, 9.000258f, 16.500128f);
                l.cubicTo(9.01035f, 16.500128f, 9.020117f, 16.498825f, 9.030209f, 16.4985f);
                l.cubicTo(9.033138f, 16.498825f, 9.035417f, 16.500128f, 9.038021f, 16.500128f);
                l.cubicTo(9.053322f, 16.500128f, 9.067646f, 16.496222f, 9.082946f, 16.495895f);
                l.cubicTo(11.860796f, 16.465294f, 14.279248f, 14.91897f, 15.549513f, 12.644408f);
                l.cubicTo(15.558953f, 12.629107f, 15.570348f, 12.61576f, 15.577184f, 12.599157f);
                l.cubicTo(16.112375f, 11.625135f, 16.429127f, 10.518944f, 16.482841f, 9.344388f);
                l.lineTo(16.482841f, 9.344388f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a2);
                canvas.drawPath(l, k);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
