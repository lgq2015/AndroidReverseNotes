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

/* renamed from: com.tencent.mm.boot.svg.a.a.ahx */
public final class ahx extends C5163c {
    private final int height = 72;
    private final int width = 72;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 72;
            case 1:
                return 72;
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
                k2 = C5163c.m7876a(k, looper);
                k2.setColor(-14513167);
                canvas.save();
                Paint a = C5163c.m7876a(k2, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(37.8f, 62.89739f);
                l.lineTo(58.59719f, 50.765697f);
                l.cubicTo(58.920998f, 50.57681f, 59.4f, 49.743988f, 59.4f, 49.37328f);
                l.lineTo(59.4f, 23.856966f);
                l.cubicTo(59.4f, 23.493624f, 58.91633f, 22.650715f, 58.59719f, 22.464552f);
                l.lineTo(36.774937f, 9.734903f);
                l.cubicTo(36.466652f, 9.555071f, 35.53348f, 9.554993f, 35.225063f, 9.734903f);
                l.lineTo(13.402809f, 22.464552f);
                l.cubicTo(13.079003f, 22.653439f, 12.6f, 23.48626f, 12.6f, 23.856966f);
                l.lineTo(12.6f, 49.37328f);
                l.cubicTo(12.6f, 49.73662f, 13.083672f, 50.579533f, 13.402809f, 50.765697f);
                l.lineTo(34.2f, 62.89739f);
                l.lineTo(34.2f, 36.615124f);
                l.lineTo(34.5f, 36.315125f);
                l.lineTo(37.5f, 36.315125f);
                l.lineTo(37.8f, 36.615124f);
                l.lineTo(37.8f, 62.89739f);
                l.close();
                l.moveTo(33.411125f, 6.6252995f);
                l.cubicTo(34.840923f, 5.791252f, 37.160156f, 5.791881f, 38.588875f, 6.6252995f);
                l.lineTo(60.411125f, 19.354948f);
                l.cubicTo(61.840923f, 20.188995f, 63.0f, 22.21864f, 63.0f, 23.856966f);
                l.lineTo(63.0f, 49.37328f);
                l.cubicTo(63.0f, 51.02563f, 61.839844f, 53.04188f, 60.411125f, 53.8753f);
                l.lineTo(38.588875f, 66.60495f);
                l.cubicTo(37.159077f, 67.438995f, 34.839844f, 67.43836f, 33.411125f, 66.60495f);
                l.lineTo(11.588874f, 53.8753f);
                l.cubicTo(10.159078f, 53.041252f, 9.0f, 51.01161f, 9.0f, 49.37328f);
                l.lineTo(9.0f, 23.856966f);
                l.cubicTo(9.0f, 22.204617f, 10.160156f, 20.188366f, 11.588874f, 19.354948f);
                l.lineTo(33.411125f, 6.6252995f);
                l.close();
                l.moveTo(37.009808f, 35.466084f);
                l.lineTo(35.509808f, 38.064163f);
                l.lineTo(35.1f, 38.17397f);
                l.lineTo(10.418276f, 23.92397f);
                l.lineTo(10.308469f, 23.514162f);
                l.lineTo(11.808469f, 20.916086f);
                l.lineTo(12.218276f, 20.806278f);
                l.lineTo(36.9f, 35.05628f);
                l.lineTo(37.009808f, 35.466084f);
                l.close();
                l.moveTo(36.490192f, 38.064163f);
                l.lineTo(34.990192f, 35.466084f);
                l.lineTo(35.1f, 35.05628f);
                l.lineTo(59.781723f, 20.806278f);
                l.lineTo(60.191532f, 20.916086f);
                l.lineTo(61.691532f, 23.514162f);
                l.lineTo(61.581722f, 23.92397f);
                l.lineTo(36.9f, 38.17397f);
                l.lineTo(36.490192f, 38.064163f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 1);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                k2 = C5163c.m7876a(k, looper);
                k2.setColor(-568490);
                Path l2 = C5163c.m7884l(looper);
                l2.moveTo(63.0f, 18.918291f);
                l2.lineTo(63.0f, 69.882225f);
                l2.lineTo(34.2f, 69.882225f);
                l2.lineTo(36.00463f, 36.316406f);
                l2.lineTo(36.00463f, 34.52065f);
                l2.close();
                WeChatSVGRenderC2Java.setFillType(l2, 1);
                WeChatSVGRenderC2Java.setFillType(l2, 2);
                canvas.drawPath(l2, k2);
                canvas.restore();
                canvas.save();
                k2 = C5163c.m7876a(k, looper);
                k2.setColor(-81363);
                l2 = C5163c.m7884l(looper);
                l2.moveTo(9.0f, 23.12807f);
                l2.lineTo(34.217228f, 37.674953f);
                l2.lineTo(36.008614f, 36.302216f);
                l2.lineTo(37.8f, 37.674953f);
                l2.lineTo(37.8f, 69.882225f);
                l2.lineTo(9.0f, 69.882225f);
                l2.close();
                WeChatSVGRenderC2Java.setFillType(l2, 1);
                WeChatSVGRenderC2Java.setFillType(l2, 2);
                canvas.drawPath(l2, k2);
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
