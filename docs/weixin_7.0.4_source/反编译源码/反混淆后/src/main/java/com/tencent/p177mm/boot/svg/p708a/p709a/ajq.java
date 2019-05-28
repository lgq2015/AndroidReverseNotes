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

/* renamed from: com.tencent.mm.boot.svg.a.a.ajq */
public final class ajq extends C5163c {
    private final int height = 240;
    private final int width = 180;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 180;
            case 1:
                return 240;
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
                a.setColor(-1);
                canvas.save();
                g = C5163c.m7878a(g, 1.0f, 0.0f, 60.0f, 0.0f, 1.0f, 47.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a2 = C5163c.m7876a(a, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(43.76728f, 70.98263f);
                l.cubicTo(40.498753f, 72.62946f, 36.85723f, 73.66371f, 33.0f, 73.930954f);
                l.lineTo(33.0f, 82.0f);
                l.lineTo(33.0f, 82.0f);
                l.lineTo(47.00086f, 82.0f);
                l.cubicTo(47.55267f, 82.0f, 48.0f, 82.44335f, 48.0f, 83.00937f);
                l.lineTo(48.0f, 84.99063f);
                l.cubicTo(48.0f, 85.54809f, 47.545074f, 86.0f, 47.00086f, 86.0f);
                l.lineTo(14.999142f, 86.0f);
                l.cubicTo(14.447331f, 86.0f, 14.0f, 85.55665f, 14.0f, 84.99063f);
                l.lineTo(14.0f, 83.00937f);
                l.cubicTo(14.0f, 82.45191f, 14.454925f, 82.0f, 14.999142f, 82.0f);
                l.lineTo(29.0f, 82.0f);
                l.lineTo(29.0f, 73.930954f);
                l.lineTo(29.0f, 73.930954f);
                l.cubicTo(14.469449f, 72.92421f, 3.0f, 61.032978f, 3.0f, 46.511883f);
                l.lineTo(3.0f, 41.99816f);
                l.cubicTo(3.0f, 41.45106f, 3.451873f, 41.0f, 4.009287f, 41.0f);
                l.lineTo(5.9903884f, 41.0f);
                l.cubicTo(6.5563583f, 41.0f, 6.9996753f, 41.451767f, 6.9996753f, 42.009052f);
                l.lineTo(6.9996753f, 46.364674f);
                l.cubicTo(6.9996753f, 59.950947f, 18.005663f, 70.0f, 31.0f, 70.0f);
                l.cubicTo(34.46276f, 70.0f, 37.784004f, 69.298294f, 40.793247f, 68.0086f);
                l.lineTo(43.76728f, 70.98263f);
                l.lineTo(43.76728f, 70.98263f);
                l.close();
                l.moveTo(52.101753f, 64.58026f);
                l.cubicTo(56.39767f, 59.748913f, 59.0f, 53.428745f, 59.0f, 46.511883f);
                l.lineTo(59.0f, 41.99816f);
                l.cubicTo(59.0f, 41.44689f, 58.55618f, 41.0f, 57.999897f, 41.0f);
                l.lineTo(55.995884f, 41.0f);
                l.cubicTo(55.443542f, 41.0f, 54.99578f, 41.45739f, 54.99578f, 42.009052f);
                l.lineTo(54.99578f, 46.364674f);
                l.cubicTo(54.99578f, 52.441376f, 52.8483f, 57.762142f, 49.330257f, 61.808765f);
                l.lineTo(52.101753f, 64.58026f);
                l.lineTo(52.101753f, 64.58026f);
                l.close();
                l.moveTo(43.923763f, 56.40227f);
                l.cubicTo(45.858204f, 53.75579f, 47.0f, 50.492767f, 47.0f, 46.962883f);
                l.lineTo(47.0f, 16.976562f);
                l.cubicTo(47.0f, 8.142479f, 39.836555f, 0.9697223f, 31.0f, 0.9697223f);
                l.cubicTo(22.1615f, 0.9697223f, 15.0f, 8.1362295f, 15.0f, 16.976562f);
                l.lineTo(15.0f, 27.478506f);
                l.lineTo(19.0f, 31.478506f);
                l.lineTo(19.0f, 16.970835f);
                l.cubicTo(19.0f, 10.342803f, 24.371126f, 4.9697223f, 31.0f, 4.9697223f);
                l.cubicTo(37.62742f, 4.9697223f, 43.0f, 10.344869f, 43.0f, 16.970835f);
                l.lineTo(43.0f, 46.96861f);
                l.cubicTo(43.0f, 49.389744f, 42.283306f, 51.64342f, 41.050415f, 53.52892f);
                l.lineTo(43.923763f, 56.40227f);
                l.lineTo(43.923763f, 56.40227f);
                l.close();
                l.moveTo(35.197937f, 62.41329f);
                l.cubicTo(33.86017f, 62.776115f, 32.452736f, 62.969723f, 31.0f, 62.969723f);
                l.cubicTo(22.163445f, 62.969723f, 15.0f, 55.796967f, 15.0f, 46.962883f);
                l.lineTo(15.0f, 42.215347f);
                l.lineTo(19.0f, 46.215347f);
                l.lineTo(19.0f, 46.96861f);
                l.cubicTo(19.0f, 53.594574f, 24.372583f, 58.969723f, 31.0f, 58.969723f);
                l.cubicTo(31.245934f, 58.969723f, 31.490135f, 58.962326f, 31.732397f, 58.947746f);
                l.lineTo(35.197937f, 62.41329f);
                l.lineTo(35.197937f, 62.41329f);
                l.close();
                l.moveTo(57.00684f, 79.44923f);
                l.lineTo(0.16473381f, 22.60712f);
                l.lineTo(2.993161f, 19.778692f);
                l.lineTo(59.835266f, 76.6208f);
                l.lineTo(57.00684f, 79.44923f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
