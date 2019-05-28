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

public final class kr extends c {
    private final int height = 96;
    private final int width = 96;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 96;
            case 1:
                return 96;
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
                c.a(k2, looper).setStrokeWidth(1.0f);
                canvas.save();
                g = c.a(g, 1.0f, 0.0f, -340.0f, 0.0f, 1.0f, -201.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                float[] a = c.a(g, 1.0f, 0.0f, 349.0f, 0.0f, 1.0f, 210.0f);
                h.reset();
                h.setValues(a);
                canvas.concat(h);
                canvas.save();
                Paint a2 = c.a(k, looper);
                a2.setColor(-13783042);
                Path l = c.l(looper);
                l.moveTo(50.80595f, 0.0f);
                l.cubicTo(58.6365f, 0.0f, 62.5508f, 0.0f, 66.76605f, 1.3325f);
                l.cubicTo(71.36805f, 3.00755f, 74.99245f, 6.63195f, 76.6675f, 11.23395f);
                l.cubicTo(78.0f, 15.44855f, 78.0f, 19.36415f, 78.0f, 27.19405f);
                l.lineTo(78.0f, 50.80595f);
                l.cubicTo(78.0f, 58.6365f, 78.0f, 62.5508f, 76.6675f, 66.76605f);
                l.cubicTo(74.99245f, 71.36805f, 71.36805f, 74.99245f, 66.76605f, 76.66685f);
                l.cubicTo(62.5508f, 78.0f, 58.6365f, 78.0f, 50.80595f, 78.0f);
                l.lineTo(27.19405f, 78.0f);
                l.cubicTo(19.3635f, 78.0f, 15.44855f, 78.0f, 11.23395f, 76.66685f);
                l.cubicTo(6.63195f, 74.99245f, 3.00755f, 71.36805f, 1.3325f, 66.76605f);
                l.cubicTo(0.0f, 62.5508f, 0.0f, 58.6365f, 0.0f, 50.80595f);
                l.lineTo(0.0f, 27.19405f);
                l.cubicTo(0.0f, 19.36415f, 0.0f, 15.44855f, 1.3325f, 11.23395f);
                l.cubicTo(3.00755f, 6.63195f, 6.63195f, 3.00755f, 11.23395f, 1.3325f);
                l.cubicTo(15.44855f, 0.0f, 19.3635f, 0.0f, 27.19405f, 0.0f);
                l.lineTo(50.80595f, 0.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a2);
                canvas.restore();
                a2 = c.a(k, looper);
                a2.setColor(-201326593);
                l = c.l(looper);
                l.moveTo(77.15287f, 65.0f);
                l.cubicTo(77.0148f, 65.59051f, 76.85423f, 66.17532f, 76.6675f, 66.76605f);
                l.cubicTo(74.99245f, 71.36805f, 71.36805f, 74.99245f, 66.76605f, 76.66685f);
                l.cubicTo(62.5508f, 78.0f, 58.6365f, 78.0f, 50.80595f, 78.0f);
                l.lineTo(27.19405f, 78.0f);
                l.cubicTo(19.3635f, 78.0f, 15.44855f, 78.0f, 11.23395f, 76.66685f);
                l.cubicTo(6.63195f, 74.99245f, 3.00755f, 71.36805f, 1.3325f, 66.76605f);
                l.cubicTo(1.1457635f, 66.17532f, 0.9851963f, 65.59051f, 0.84713095f, 65.0f);
                l.lineTo(33.0f, 65.0f);
                l.cubicTo(35.795135f, 64.88961f, 38.52101f, 67.3264f, 39.0f, 70.0f);
                l.cubicTo(39.478985f, 67.3264f, 42.204865f, 64.88961f, 46.0f, 65.0f);
                l.lineTo(77.15287f, 65.0f);
                l.close();
                canvas.saveLayerAlpha(null, 230, 4);
                k2 = c.a(a2, looper);
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, k2);
                canvas.restore();
                canvas.save();
                a2 = c.a(k, looper);
                a2.setColor(-13783042);
                l = c.l(looper);
                l.moveTo(50.80595f, 0.0f);
                l.cubicTo(58.6365f, 0.0f, 62.5508f, 0.0f, 66.76605f, 1.3325f);
                l.cubicTo(71.36805f, 3.00755f, 74.99245f, 6.63195f, 76.6675f, 11.23395f);
                l.cubicTo(78.0f, 15.44855f, 78.0f, 19.36415f, 78.0f, 27.19405f);
                l.lineTo(78.0f, 50.80595f);
                l.cubicTo(78.0f, 58.6365f, 78.0f, 62.5508f, 76.6675f, 66.76605f);
                l.cubicTo(74.99245f, 71.36805f, 71.36805f, 74.99245f, 66.76605f, 76.66685f);
                l.cubicTo(62.5508f, 78.0f, 58.6365f, 78.0f, 50.80595f, 78.0f);
                l.lineTo(27.19405f, 78.0f);
                l.cubicTo(19.3635f, 78.0f, 15.44855f, 78.0f, 11.23395f, 76.66685f);
                l.cubicTo(6.63195f, 74.99245f, 3.00755f, 71.36805f, 1.3325f, 66.76605f);
                l.cubicTo(0.0f, 62.5508f, 0.0f, 58.6365f, 0.0f, 50.80595f);
                l.lineTo(0.0f, 27.19405f);
                l.cubicTo(0.0f, 19.36415f, 0.0f, 15.44855f, 1.3325f, 11.23395f);
                l.cubicTo(3.00755f, 6.63195f, 6.63195f, 3.00755f, 11.23395f, 1.3325f);
                l.cubicTo(15.44855f, 0.0f, 19.3635f, 0.0f, 27.19405f, 0.0f);
                l.lineTo(50.80595f, 0.0f);
                l.close();
                l.moveTo(50.503235f, 1.0f);
                l.cubicTo(58.133f, 1.0f, 61.946934f, 1.0f, 66.0541f, 2.2983334f);
                l.cubicTo(70.5381f, 3.9304333f, 74.069565f, 7.4619f, 75.70167f, 11.9459f);
                l.cubicTo(77.0f, 16.052433f, 77.0f, 19.867634f, 77.0f, 27.496767f);
                l.lineTo(77.0f, 50.503235f);
                l.cubicTo(77.0f, 58.133f, 77.0f, 61.946934f, 75.70167f, 66.0541f);
                l.cubicTo(74.069565f, 70.5381f, 70.5381f, 74.069565f, 66.0541f, 75.701035f);
                l.cubicTo(61.946934f, 77.0f, 58.133f, 77.0f, 50.503235f, 77.0f);
                l.lineTo(27.496767f, 77.0f);
                l.cubicTo(19.867f, 77.0f, 16.052433f, 77.0f, 11.9459f, 75.701035f);
                l.cubicTo(7.4619f, 74.069565f, 3.9304333f, 70.5381f, 2.2983334f, 66.0541f);
                l.cubicTo(1.0f, 61.946934f, 1.0f, 58.133f, 1.0f, 50.503235f);
                l.lineTo(1.0f, 27.496767f);
                l.cubicTo(1.0f, 19.867634f, 1.0f, 16.052433f, 2.2983334f, 11.9459f);
                l.cubicTo(3.9304333f, 7.4619f, 7.4619f, 3.9304333f, 11.9459f, 2.2983334f);
                l.cubicTo(16.052433f, 1.0f, 19.867f, 1.0f, 27.496767f, 1.0f);
                l.lineTo(50.503235f, 1.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                k = c.a(k, looper);
                k.setColor(-1);
                g = c.a(a, -1.0f, 0.0f, 125.0f, 0.0f, 1.0f, 0.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                l = c.l(looper);
                l.moveTo(72.0f, 52.056374f);
                l.cubicTo(72.0f, 47.607002f, 67.74677f, 44.0f, 62.5f, 44.0f);
                l.cubicTo(57.253307f, 44.0f, 53.0f, 47.607002f, 53.0f, 52.056374f);
                l.cubicTo(53.0f, 56.505817f, 57.253307f, 60.11282f, 62.5f, 60.11282f);
                l.cubicTo(63.92956f, 60.11282f, 65.28509f, 59.844482f, 66.501205f, 59.364857f);
                l.cubicTo(67.81153f, 60.11975f, 69.11952f, 60.876648f, 69.286606f, 60.985985f);
                l.cubicTo(69.28684f, 60.984447f, 69.288086f, 60.982292f, 69.28879f, 60.98052f);
                l.cubicTo(69.31669f, 60.992764f, 69.34739f, 61.0f, 69.37989f, 61.0f);
                l.cubicTo(69.503876f, 61.0f, 69.60433f, 60.900673f, 69.60433f, 60.778244f);
                l.cubicTo(69.60433f, 60.755222f, 69.59981f, 60.73343f, 69.593185f, 60.712486f);
                l.cubicTo(69.600044f, 60.70748f, 69.60433f, 60.704327f, 69.60433f, 60.704327f);
                l.lineTo(68.72402f, 58.14304f);
                l.cubicTo(70.730896f, 56.665897f, 72.0f, 54.486835f, 72.0f, 52.056374f);
                l.close();
                l.moveTo(65.499954f, 51.0f);
                l.cubicTo(64.671585f, 51.0f, 64.0f, 50.32839f, 64.0f, 49.499954f);
                l.cubicTo(64.0f, 48.67161f, 64.671585f, 48.0f, 65.499954f, 48.0f);
                l.cubicTo(66.328415f, 48.0f, 67.0f, 48.67161f, 67.0f, 49.499954f);
                l.cubicTo(67.0f, 50.32839f, 66.328415f, 51.0f, 65.499954f, 51.0f);
                l.close();
                l.moveTo(59.500046f, 51.0f);
                l.cubicTo(58.671566f, 51.0f, 58.0f, 50.32839f, 58.0f, 49.499954f);
                l.cubicTo(58.0f, 48.67161f, 58.671566f, 48.0f, 59.500046f, 48.0f);
                l.cubicTo(60.328434f, 48.0f, 61.0f, 48.67161f, 61.0f, 49.499954f);
                l.cubicTo(61.0f, 50.32839f, 60.328434f, 51.0f, 59.500046f, 51.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, k);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
