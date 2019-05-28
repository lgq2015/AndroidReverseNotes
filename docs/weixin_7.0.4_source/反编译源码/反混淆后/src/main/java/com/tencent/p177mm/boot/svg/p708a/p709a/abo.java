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

/* renamed from: com.tencent.mm.boot.svg.a.a.abo */
public final class abo extends C5163c {
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
                a.setColor(WebView.NIGHT_MODE_COLOR);
                canvas.save();
                g = C5163c.m7878a(g, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 6.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a2 = C5163c.m7876a(a, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(30.0f, 60.0f);
                l.cubicTo(13.4314575f, 60.0f, 0.0f, 46.568542f, 0.0f, 30.0f);
                l.cubicTo(0.0f, 13.4314575f, 13.4314575f, 0.0f, 30.0f, 0.0f);
                l.cubicTo(46.568542f, 0.0f, 60.0f, 13.4314575f, 60.0f, 30.0f);
                l.cubicTo(60.0f, 46.568542f, 46.568542f, 60.0f, 30.0f, 60.0f);
                l.close();
                l.moveTo(30.0f, 56.4f);
                l.cubicTo(44.58032f, 56.4f, 56.4f, 44.58032f, 56.4f, 30.0f);
                l.cubicTo(56.4f, 15.4196825f, 44.58032f, 3.6f, 30.0f, 3.6f);
                l.cubicTo(15.4196825f, 3.6f, 3.6f, 15.4196825f, 3.6f, 30.0f);
                l.cubicTo(3.6f, 44.58032f, 15.4196825f, 56.4f, 30.0f, 56.4f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 1);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                Paint a3 = C5163c.m7876a(a, looper);
                Path l2 = C5163c.m7884l(looper);
                l2.moveTo(13.5f, 18.0f);
                l2.lineTo(19.5f, 18.0f);
                l2.lineTo(19.5f, 24.0f);
                l2.lineTo(13.5f, 24.0f);
                l2.lineTo(13.5f, 18.0f);
                l2.close();
                l2.moveTo(22.5f, 18.0f);
                l2.lineTo(28.5f, 18.0f);
                l2.lineTo(28.5f, 24.0f);
                l2.lineTo(22.5f, 24.0f);
                l2.lineTo(22.5f, 18.0f);
                l2.close();
                l2.moveTo(31.5f, 18.0f);
                l2.lineTo(37.5f, 18.0f);
                l2.lineTo(37.5f, 24.0f);
                l2.lineTo(31.5f, 24.0f);
                l2.lineTo(31.5f, 18.0f);
                l2.close();
                l2.moveTo(40.5f, 18.0f);
                l2.lineTo(46.5f, 18.0f);
                l2.lineTo(46.5f, 24.0f);
                l2.lineTo(40.5f, 24.0f);
                l2.lineTo(40.5f, 18.0f);
                l2.close();
                l2.moveTo(13.5f, 27.0f);
                l2.lineTo(19.5f, 27.0f);
                l2.lineTo(19.5f, 33.0f);
                l2.lineTo(13.5f, 33.0f);
                l2.lineTo(13.5f, 27.0f);
                l2.close();
                l2.moveTo(22.5f, 27.0f);
                l2.lineTo(28.5f, 27.0f);
                l2.lineTo(28.5f, 33.0f);
                l2.lineTo(22.5f, 33.0f);
                l2.lineTo(22.5f, 27.0f);
                l2.close();
                l2.moveTo(21.0f, 39.0f);
                l2.lineTo(39.0f, 39.0f);
                l2.lineTo(39.0f, 45.0f);
                l2.lineTo(21.0f, 45.0f);
                l2.lineTo(21.0f, 39.0f);
                l2.close();
                l2.moveTo(31.5f, 27.0f);
                l2.lineTo(37.5f, 27.0f);
                l2.lineTo(37.5f, 33.0f);
                l2.lineTo(31.5f, 33.0f);
                l2.lineTo(31.5f, 27.0f);
                l2.close();
                l2.moveTo(40.5f, 27.0f);
                l2.lineTo(46.5f, 27.0f);
                l2.lineTo(46.5f, 33.0f);
                l2.lineTo(40.5f, 33.0f);
                l2.lineTo(40.5f, 27.0f);
                l2.close();
                WeChatSVGRenderC2Java.setFillType(l2, 2);
                canvas.drawPath(l2, a3);
                canvas.restore();
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
