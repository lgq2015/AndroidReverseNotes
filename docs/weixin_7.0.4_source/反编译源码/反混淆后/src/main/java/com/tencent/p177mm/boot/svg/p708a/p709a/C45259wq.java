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

/* renamed from: com.tencent.mm.boot.svg.a.a.wq */
public final class C45259wq extends C5163c {
    private final int height = 76;
    private final int width = 76;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 76;
            case 1:
                return 76;
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
                Paint a = C5163c.m7876a(k, looper);
                a.setColor(-11184811);
                g = C5163c.m7878a(g, 1.0f, 0.0f, -529.0f, 0.0f, 1.0f, -427.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                g = C5163c.m7878a(g, 1.0f, 0.0f, 534.0f, 0.0f, 1.0f, 434.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a2 = C5163c.m7876a(a, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(64.0f, 10.0f);
                l.lineTo(64.0f, 10.0f);
                l.cubicTo(64.0f, 9.882686f, 63.991978f, 9.8073f, 63.984455f, 9.774971f);
                l.cubicTo(63.995667f, 9.823138f, 64.027534f, 9.904926f, 64.09329f, 10.0147295f);
                l.cubicTo(64.411995f, 10.546919f, 65.079636f, 11.0f, 66.0f, 11.0f);
                l.lineTo(56.0f, 11.0f);
                l.lineTo(59.0f, 8.0f);
                l.lineTo(59.0f, 58.0f);
                l.cubicTo(59.0f, 58.130436f, 59.051327f, 58.22705f, 59.27441f, 58.38821f);
                l.cubicTo(59.773357f, 58.748653f, 60.693993f, 59.0f, 62.0f, 59.0f);
                l.cubicTo(63.33438f, 59.0f, 64.0f, 58.45092f, 64.0f, 58.0f);
                l.lineTo(64.0f, 10.0f);
                l.close();
                l.moveTo(67.0f, 10.0f);
                l.lineTo(67.0f, 10.0f);
                l.lineTo(67.0f, 58.0f);
                l.cubicTo(67.0f, 60.186752f, 64.95295f, 62.0f, 62.0f, 62.0f);
                l.cubicTo(58.047047f, 62.0f, 56.0f, 60.186752f, 56.0f, 58.0f);
                l.lineTo(56.0f, 8.0f);
                l.lineTo(66.0f, 8.0f);
                l.cubicTo(66.44552f, 8.0f, 67.0f, 8.595759f, 67.0f, 10.0f);
                l.lineTo(67.0f, 10.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                a2 = C5163c.m7876a(a, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(58.110535f, 62.0f);
                l.cubicTo(56.9593f, 60.32874f, 56.270737f, 58.518147f, 55.99838f, 56.32013f);
                l.lineTo(55.97561f, 56.13638f);
                l.lineTo(55.97561f, 55.951218f);
                l.lineTo(55.97561f, 3.0243902f);
                l.lineTo(55.97561f, 2.755022f);
                l.lineTo(56.023594f, 2.4899626f);
                l.cubicTo(56.01672f, 2.5279436f, 56.08146f, 2.764993f, 56.26943f, 2.9529014f);
                l.cubicTo(56.336334f, 3.0197873f, 56.385796f, 3.049719f, 56.39374f, 3.0524664f);
                l.cubicTo(56.30831f, 3.0229237f, 56.15949f, 3.0f, 55.951218f, 3.0f);
                l.lineTo(3.0243902f, 3.0f);
                l.cubicTo(2.8651917f, 3.0f, 3.0f, 2.8653867f, 3.0f, 3.0243902f);
                l.lineTo(3.0f, 55.951218f);
                l.cubicTo(3.0f, 57.929375f, 4.0706234f, 59.0f, 6.0487804f, 59.0f);
                l.lineTo(59.831577f, 59.0f);
                l.cubicTo(60.363014f, 60.123505f, 61.09911f, 61.07564f, 62.0f, 62.0f);
                l.lineTo(58.110535f, 62.0f);
                l.lineTo(58.110535f, 62.0f);
                l.close();
                l.moveTo(58.97561f, 55.951218f);
                l.lineTo(58.97561f, 55.951218f);
                l.cubicTo(59.304348f, 58.60424f, 60.388535f, 60.346558f, 62.0f, 62.0f);
                l.lineTo(6.0487804f, 62.0f);
                l.cubicTo(2.4137692f, 62.0f, 0.0f, 59.58623f, 0.0f, 55.951218f);
                l.lineTo(0.0f, 3.0243902f);
                l.cubicTo(0.0f, 1.2053713f, 1.2115004f, 0.0f, 3.0243902f, 0.0f);
                l.lineTo(55.951218f, 0.0f);
                l.cubicTo(58.094494f, 0.0f, 59.304348f, 1.2085422f, 58.97561f, 3.0243902f);
                l.lineTo(58.97561f, 55.951218f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                a2 = C5163c.m7876a(a, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(9.0f, 26.5f);
                l.cubicTo(9.0f, 25.671574f, 9.895431f, 25.0f, 11.0f, 25.0f);
                l.lineTo(28.0f, 25.0f);
                l.cubicTo(29.10457f, 25.0f, 30.0f, 25.671574f, 30.0f, 26.5f);
                l.lineTo(30.0f, 26.5f);
                l.cubicTo(30.0f, 27.328426f, 29.10457f, 28.0f, 28.0f, 28.0f);
                l.lineTo(11.0f, 28.0f);
                l.cubicTo(9.895431f, 28.0f, 9.0f, 27.328426f, 9.0f, 26.5f);
                l.lineTo(9.0f, 26.5f);
                l.close();
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                a2 = C5163c.m7876a(a, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(9.0f, 18.5f);
                l.cubicTo(9.0f, 17.671574f, 9.895431f, 17.0f, 11.0f, 17.0f);
                l.lineTo(28.0f, 17.0f);
                l.cubicTo(29.10457f, 17.0f, 30.0f, 17.671574f, 30.0f, 18.5f);
                l.lineTo(30.0f, 18.5f);
                l.cubicTo(30.0f, 19.328426f, 29.10457f, 20.0f, 28.0f, 20.0f);
                l.lineTo(11.0f, 20.0f);
                l.cubicTo(9.895431f, 20.0f, 9.0f, 19.328426f, 9.0f, 18.5f);
                l.lineTo(9.0f, 18.5f);
                l.close();
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                a2 = C5163c.m7876a(a, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(10.493433f, 9.0f);
                l.lineTo(28.506567f, 9.0f);
                l.cubicTo(29.331367f, 9.0f, 30.0f, 9.665797f, 30.0f, 10.5f);
                l.cubicTo(30.0f, 11.328427f, 29.325077f, 12.0f, 28.506567f, 12.0f);
                l.lineTo(10.493433f, 12.0f);
                l.cubicTo(9.6686325f, 12.0f, 9.0f, 11.334203f, 9.0f, 10.5f);
                l.cubicTo(9.0f, 9.671573f, 9.674923f, 9.0f, 10.493433f, 9.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
