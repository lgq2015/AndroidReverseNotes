package com.tencent.p177mm.boot.svg.p708a.p709a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.p177mm.plugin.appbrand.jsapi.C33250az;
import com.tencent.p177mm.svg.C5163c;
import com.tencent.p177mm.svg.WeChatSVGRenderC2Java;
import com.tencent.smtt.sdk.WebView;

/* renamed from: com.tencent.mm.boot.svg.a.a.qw */
public final class C41862qw extends C5163c {
    private final int height = C33250az.CTRL_INDEX;
    private final int width = C33250az.CTRL_INDEX;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return C33250az.CTRL_INDEX;
            case 1:
                return C33250az.CTRL_INDEX;
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
                k2 = C5163c.m7876a(k, looper);
                k2.setColor(-12206054);
                Path l = C5163c.m7884l(looper);
                l.moveTo(0.0f, 0.0f);
                l.lineTo(192.0f, 0.0f);
                l.lineTo(192.0f, 192.0f);
                l.lineTo(0.0f, 192.0f);
                l.lineTo(0.0f, 0.0f);
                l.close();
                canvas.drawPath(l, k2);
                canvas.restore();
                canvas.save();
                Paint a = C5163c.m7876a(k, looper);
                a.setColor(-1);
                Path l2 = C5163c.m7884l(looper);
                l2.moveTo(48.727272f, 129.13744f);
                l2.lineTo(48.727272f, 155.09727f);
                l2.cubicTo(48.727272f, 156.19832f, 49.616333f, 157.09091f, 50.73237f, 157.09091f);
                l2.lineTo(142.72218f, 157.09091f);
                l2.cubicTo(143.82956f, 157.09091f, 144.72728f, 156.19485f, 144.72728f, 155.09727f);
                l2.lineTo(144.72728f, 36.90273f);
                l2.cubicTo(144.72728f, 35.801674f, 143.83821f, 34.909092f, 142.72218f, 34.909092f);
                l2.lineTo(50.73237f, 34.909092f);
                l2.cubicTo(49.624985f, 34.909092f, 48.727272f, 35.805138f, 48.727272f, 36.90273f);
                l2.lineTo(48.727272f, 59.685844f);
                l2.lineTo(48.727272f, 59.685844f);
                l2.cubicTo(49.192173f, 59.566185f, 49.679565f, 59.502544f, 50.18182f, 59.502544f);
                l2.cubicTo(53.39511f, 59.502544f, 56.0f, 62.107433f, 56.0f, 65.320724f);
                l2.cubicTo(56.0f, 68.53402f, 53.39511f, 71.13891f, 50.18182f, 71.13891f);
                l2.cubicTo(49.679565f, 71.13891f, 49.192173f, 71.07527f, 48.727272f, 70.95561f);
                l2.lineTo(48.727272f, 117.86766f);
                l2.cubicTo(49.192173f, 117.748f, 49.679565f, 117.684364f, 50.18182f, 117.684364f);
                l2.cubicTo(53.39511f, 117.684364f, 56.0f, 120.28925f, 56.0f, 123.50255f);
                l2.cubicTo(56.0f, 126.715836f, 53.39511f, 129.32072f, 50.18182f, 129.32072f);
                l2.cubicTo(49.679565f, 129.32072f, 49.192173f, 129.25708f, 48.727272f, 129.13744f);
                l2.close();
                WeChatSVGRenderC2Java.setFillType(l2, 2);
                canvas.drawPath(l2, a);
                canvas.restore();
                canvas.save();
                k = C5163c.m7876a(k, looper);
                k.setColor(-12206054);
                l2 = C5163c.m7884l(looper);
                l2.moveTo(114.181816f, 93.09091f);
                l2.lineTo(117.09091f, 93.09091f);
                l2.lineTo(117.09091f, 99.47164f);
                l2.cubicTo(117.09091f, 109.60416f, 108.62502f, 117.818184f, 98.181816f, 117.818184f);
                l2.cubicTo(87.73862f, 117.818184f, 79.27273f, 109.60416f, 79.27273f, 99.47164f);
                l2.lineTo(79.27273f, 93.09091f);
                l2.lineTo(82.181816f, 93.09091f);
                l2.lineTo(82.181816f, 98.911415f);
                l2.cubicTo(82.181816f, 107.74669f, 89.34526f, 114.90909f, 98.181816f, 114.90909f);
                l2.cubicTo(107.01837f, 114.90909f, 114.181816f, 107.74669f, 114.181816f, 98.911415f);
                l2.lineTo(114.181816f, 93.09091f);
                l2.lineTo(114.181816f, 93.09091f);
                l2.close();
                l2.moveTo(96.72727f, 117.818184f);
                l2.lineTo(99.63636f, 117.818184f);
                l2.lineTo(99.63636f, 122.181816f);
                l2.lineTo(96.72727f, 122.181816f);
                l2.lineTo(96.72727f, 117.818184f);
                l2.close();
                l2.moveTo(87.545456f, 122.181816f);
                l2.cubicTo(86.99317f, 122.181816f, 86.545456f, 122.63637f, 86.545456f, 123.18296f);
                l2.lineTo(86.545456f, 124.08977f);
                l2.cubicTo(86.545456f, 124.642685f, 86.98958f, 125.09091f, 87.545456f, 125.09091f);
                l2.lineTo(108.818184f, 125.09091f);
                l2.cubicTo(109.37047f, 125.09091f, 109.818184f, 124.63637f, 109.818184f, 124.08977f);
                l2.lineTo(109.818184f, 123.18296f);
                l2.cubicTo(109.818184f, 122.63004f, 109.37406f, 122.181816f, 108.818184f, 122.181816f);
                l2.lineTo(87.545456f, 122.181816f);
                l2.close();
                l2.moveTo(98.181816f, 66.90909f);
                l2.cubicTo(91.75523f, 66.90909f, 86.545456f, 72.1185f, 86.545456f, 78.54552f);
                l2.lineTo(86.545456f, 98.909035f);
                l2.cubicTo(86.545456f, 105.33565f, 91.75382f, 110.545456f, 98.181816f, 110.545456f);
                l2.cubicTo(104.608406f, 110.545456f, 109.818184f, 105.336044f, 109.818184f, 98.909035f);
                l2.lineTo(109.818184f, 78.54552f);
                l2.cubicTo(109.818184f, 72.1189f, 104.60982f, 66.90909f, 98.181816f, 66.90909f);
                l2.close();
                WeChatSVGRenderC2Java.setFillType(l2, 2);
                canvas.drawPath(l2, k);
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
