package com.tencent.p177mm.boot.svg.p708a.p709a;

import android.graphics.Canvas;
import android.graphics.Matrix;
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

/* renamed from: com.tencent.mm.boot.svg.a.a.qq */
public final class C18060qq extends C5163c {
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
                k2 = C5163c.m7876a(k2, looper);
                k2.setStrokeWidth(1.0f);
                canvas.save();
                k2 = C5163c.m7876a(k2, looper);
                k2.setColor(-789517);
                k2.setStrokeWidth(3.0f);
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
                g = C5163c.m7878a(g, 1.0f, 0.0f, 30.0f, 0.0f, 1.0f, 30.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a = C5163c.m7876a(k, looper);
                a.setColor(-10196752);
                Path l2 = C5163c.m7884l(looper);
                l2.moveTo(90.933334f, 6.12549f);
                l2.lineTo(90.933334f, 68.24313f);
                l2.lineTo(124.23529f, 35.631374f);
                l2.cubicTo(117.14076f, 22.570004f, 105.62276f, 12.023832f, 90.933334f, 6.12549f);
                l2.close();
                WeChatSVGRenderC2Java.setFillType(l2, 2);
                canvas.drawPath(l2, a);
                canvas.restore();
                canvas.save();
                a = C5163c.m7876a(k, looper);
                a.setColor(-11369488);
                l2 = C5163c.m7884l(looper);
                l2.moveTo(132.0f, 66.776474f);
                l2.cubicTo(132.0f, 58.296143f, 130.25346f, 49.748177f, 127.325f, 41.929413f);
                l2.lineTo(82.13333f, 85.25f);
                l2.lineTo(128.88333f, 85.25f);
                l2.cubicTo(130.97574f, 80.72902f, 132.0f, 74.10986f, 132.0f, 66.776474f);
                l2.close();
                WeChatSVGRenderC2Java.setFillType(l2, 2);
                canvas.drawPath(l2, a);
                canvas.restore();
                canvas.save();
                a = C5163c.m7876a(k, looper);
                a.setColor(-16731650);
                l2 = C5163c.m7884l(looper);
                l2.moveTo(127.34118f, 90.75f);
                l2.lineTo(65.223526f, 90.75f);
                l2.lineTo(97.8353f, 124.23529f);
                l2.cubicTo(110.91912f, 117.14476f, 121.452675f, 105.641365f, 127.34118f, 90.75f);
                l2.close();
                WeChatSVGRenderC2Java.setFillType(l2, 2);
                canvas.drawPath(l2, a);
                canvas.restore();
                canvas.save();
                a = C5163c.m7876a(k, looper);
                a.setColor(-10039264);
                l2 = C5163c.m7884l(looper);
                l2.moveTo(66.776474f, 132.0f);
                l2.cubicTo(75.23545f, 132.0f, 83.795555f, 130.25705f, 91.62353f, 127.34118f);
                l2.lineTo(46.933334f, 82.305885f);
                l2.lineTo(46.933334f, 128.89412f);
                l2.cubicTo(52.81347f, 130.98483f, 59.42076f, 132.0f, 66.776474f, 132.0f);
                l2.close();
                WeChatSVGRenderC2Java.setFillType(l2, 2);
                canvas.drawPath(l2, a);
                canvas.restore();
                canvas.save();
                a = C5163c.m7876a(k, looper);
                a.setColor(-6631134);
                l2 = C5163c.m7884l(looper);
                l2.moveTo(41.066666f, 127.34118f);
                l2.lineTo(41.066666f, 65.223526f);
                l2.lineTo(7.7647057f, 97.8353f);
                l2.cubicTo(14.859824f, 110.91978f, 26.373886f, 121.456535f, 41.066666f, 127.34118f);
                l2.close();
                WeChatSVGRenderC2Java.setFillType(l2, 2);
                canvas.drawPath(l2, a);
                canvas.restore();
                canvas.save();
                a = C5163c.m7876a(k, looper);
                a.setColor(-14313);
                l2 = C5163c.m7884l(looper);
                l2.moveTo(0.0f, 66.776474f);
                l2.cubicTo(0.0f, 75.245605f, 1.7406676f, 83.800446f, 4.675f, 91.62353f);
                l2.lineTo(49.866665f, 46.933334f);
                l2.lineTo(3.1166666f, 46.933334f);
                l2.cubicTo(1.0170174f, 52.81788f, 0.0f, 59.43059f, 0.0f, 66.776474f);
                l2.close();
                WeChatSVGRenderC2Java.setFillType(l2, 2);
                canvas.drawPath(l2, a);
                canvas.restore();
                canvas.save();
                a = C5163c.m7876a(k, looper);
                a.setColor(-371630);
                l2 = C5163c.m7884l(looper);
                l2.moveTo(65.30981f, 0.0f);
                l2.cubicTo(72.633575f, 0.0f, 79.2581f, 1.019078f, 85.066666f, 3.1058824f);
                l2.lineTo(85.066666f, 49.69412f);
                l2.lineTo(40.462746f, 4.6588235f);
                l2.cubicTo(48.276417f, 1.7322924f, 56.819073f, 0.0f, 65.30981f, 0.0f);
                l2.close();
                WeChatSVGRenderC2Java.setFillType(l2, 2);
                canvas.drawPath(l2, a);
                canvas.restore();
                canvas.save();
                a = C5163c.m7876a(k, looper);
                a.setColor(-35310);
                l2 = C5163c.m7884l(looper);
                l2.moveTo(4.6588235f, 41.066666f);
                l2.lineTo(66.776474f, 41.066666f);
                l2.lineTo(34.164707f, 7.7647057f);
                l2.cubicTo(21.102251f, 14.861723f, 10.553196f, 26.387012f, 4.6588235f, 41.066666f);
                l2.close();
                WeChatSVGRenderC2Java.setFillType(l2, 2);
                canvas.drawPath(l2, a);
                canvas.restore();
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
