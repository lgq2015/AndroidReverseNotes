package com.tencent.p177mm.boot.svg.p708a.p709a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.p177mm.svg.C5163c;
import com.tencent.p177mm.svg.WeChatSVGRenderC2Java;
import com.tencent.smtt.sdk.WebView;

/* renamed from: com.tencent.mm.boot.svg.a.a.aqq */
public final class aqq extends C5163c {
    private final int height = 39;
    private final int width = 81;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 81;
            case 1:
                return 39;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                C5163c.m7881h(looper);
                C5163c.m7880g(looper);
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
                a.setColor(-1);
                Path l = C5163c.m7884l(looper);
                l.moveTo(0.0f, 19.353983f);
                l.cubicTo(0.0f, 8.665072f, 8.665072f, 0.0f, 19.353983f, 0.0f);
                l.lineTo(61.64602f, 0.0f);
                l.cubicTo(72.33493f, 0.0f, 81.0f, 8.665072f, 81.0f, 19.353983f);
                l.lineTo(81.0f, 19.646017f);
                l.cubicTo(81.0f, 30.334927f, 72.33493f, 39.0f, 61.64602f, 39.0f);
                l.lineTo(19.353983f, 39.0f);
                l.cubicTo(8.665072f, 39.0f, 0.0f, 30.334927f, 0.0f, 19.646017f);
                l.lineTo(0.0f, 19.353983f);
                l.close();
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                k = C5163c.m7876a(k, looper);
                k.setColor(-564640);
                l = C5163c.m7884l(looper);
                l.moveTo(31.066368f, 28.874792f);
                l.lineTo(27.080488f, 28.874792f);
                l.lineTo(19.06778f, 15.470228f);
                l.lineTo(18.985878f, 15.483878f);
                l.lineTo(18.985878f, 28.874792f);
                l.lineTo(15.0f, 28.874792f);
                l.lineTo(15.0f, 9.0f);
                l.lineTo(18.985878f, 9.0f);
                l.lineTo(26.998587f, 22.390915f);
                l.lineTo(27.080488f, 22.377264f);
                l.lineTo(27.080488f, 9.0f);
                l.lineTo(31.066368f, 9.0f);
                l.lineTo(31.066368f, 28.874792f);
                l.close();
                l.moveTo(39.966133f, 29.161448f);
                l.cubicTo(37.763878f, 29.161448f, 36.04396f, 28.485767f, 34.80633f, 27.134382f);
                l.cubicTo(33.5687f, 25.782999f, 32.949894f, 24.042608f, 32.949894f, 21.913155f);
                l.lineTo(32.949894f, 21.367144f);
                l.cubicTo(32.949894f, 19.15579f, 33.5505f, 17.344872f, 34.75173f, 15.934337f);
                l.cubicTo(35.95296f, 14.523802f, 37.604626f, 13.823095f, 39.70678f, 13.832195f);
                l.cubicTo(41.690628f, 13.832195f, 43.212616f, 14.439627f, 44.272793f, 15.654507f);
                l.cubicTo(45.33297f, 16.869387f, 45.86305f, 18.505127f, 45.86305f, 20.561779f);
                l.lineTo(45.86305f, 22.622969f);
                l.lineTo(37.058624f, 22.622969f);
                l.lineTo(37.017673f, 22.70487f);
                l.cubicTo(37.081375f, 23.714996f, 37.388504f, 24.534004f, 37.939068f, 25.161919f);
                l.cubicTo(38.48963f, 25.789835f, 39.306366f, 26.103788f, 40.38929f, 26.103788f);
                l.cubicTo(41.281113f, 26.103788f, 42.038696f, 26.012787f, 42.66206f, 25.830782f);
                l.cubicTo(43.285427f, 25.648779f, 43.929256f, 25.371225f, 44.593575f, 24.998116f);
                l.lineTo(45.671947f, 27.455164f);
                l.cubicTo(45.080433f, 27.937477f, 44.279625f, 28.34243f, 43.269497f, 28.670038f);
                l.cubicTo(42.259373f, 28.997646f, 41.158264f, 29.161448f, 39.966133f, 29.161448f);
                l.close();
                l.moveTo(39.70678f, 16.903505f);
                l.cubicTo(38.90596f, 16.903505f, 38.28943f, 17.178783f, 37.857166f, 17.729347f);
                l.cubicTo(37.424908f, 18.279911f, 37.163277f, 19.010193f, 37.072277f, 19.920216f);
                l.lineTo(37.099575f, 19.988466f);
                l.lineTo(41.959072f, 19.988466f);
                l.lineTo(41.959072f, 19.688162f);
                l.cubicTo(41.959072f, 18.823639f, 41.78162f, 18.143408f, 41.426712f, 17.647446f);
                l.cubicTo(41.071804f, 17.151484f, 40.498497f, 16.903505f, 39.70678f, 16.903505f);
                l.close();
                l.moveTo(60.168324f, 23.387384f);
                l.lineTo(60.250225f, 23.387384f);
                l.lineTo(62.03841f, 14.105201f);
                l.lineTo(65.915085f, 14.105201f);
                l.lineTo(62.161263f, 28.874792f);
                l.lineTo(58.830597f, 28.874792f);
                l.lineTo(56.08689f, 20.357025f);
                l.lineTo(56.00499f, 20.357025f);
                l.lineTo(53.261284f, 28.874792f);
                l.lineTo(49.94427f, 28.874792f);
                l.lineTo(46.190445f, 14.105201f);
                l.lineTo(50.067123f, 14.105201f);
                l.lineTo(51.882607f, 23.346434f);
                l.lineTo(51.96451f, 23.346434f);
                l.lineTo(54.721863f, 14.105201f);
                l.lineTo(57.383667f, 14.105201f);
                l.lineTo(60.168324f, 23.387384f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, k);
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
