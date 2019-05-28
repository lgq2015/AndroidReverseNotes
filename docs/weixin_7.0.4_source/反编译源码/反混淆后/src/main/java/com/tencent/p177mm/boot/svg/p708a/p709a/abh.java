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

/* renamed from: com.tencent.mm.boot.svg.a.a.abh */
public final class abh extends C5163c {
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
                k = C5163c.m7876a(k, looper);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                canvas.save();
                Paint a = C5163c.m7876a(k, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(9.6f, 15.6f);
                l.lineTo(9.6f, 53.4f);
                l.lineTo(62.4f, 53.4f);
                l.lineTo(62.4f, 15.6f);
                l.lineTo(9.6f, 15.6f);
                l.close();
                l.moveTo(6.0f, 15.0f);
                l.cubicTo(6.0f, 13.343145f, 7.343146f, 12.0f, 9.0f, 12.0f);
                l.lineTo(63.0f, 12.0f);
                l.cubicTo(64.65685f, 12.0f, 66.0f, 13.343145f, 66.0f, 15.0f);
                l.lineTo(66.0f, 54.0f);
                l.cubicTo(66.0f, 55.656853f, 64.65685f, 57.0f, 63.0f, 57.0f);
                l.lineTo(9.0f, 57.0f);
                l.cubicTo(7.343146f, 57.0f, 6.0f, 55.656853f, 6.0f, 54.0f);
                l.lineTo(6.0f, 15.0f);
                l.close();
                l.moveTo(24.0f, 62.699997f);
                l.cubicTo(24.0f, 61.705887f, 24.798523f, 60.899998f, 25.8039f, 60.899998f);
                l.lineTo(46.1961f, 60.899998f);
                l.cubicTo(47.192368f, 60.899998f, 48.0f, 61.698956f, 48.0f, 62.699997f);
                l.lineTo(48.0f, 64.5f);
                l.lineTo(24.0f, 64.5f);
                l.lineTo(24.0f, 62.699997f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 1);
                canvas.drawPath(l, a);
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
