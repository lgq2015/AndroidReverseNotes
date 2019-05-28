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
import com.tencent.smtt.sdk.TbsListener.ErrorCode;
import com.tencent.smtt.sdk.WebView;

/* renamed from: com.tencent.mm.boot.svg.a.a.bay */
public final class bay extends C5163c {
    private final int height = ErrorCode.STARTDOWNLOAD_3;
    private final int width = ErrorCode.STARTDOWNLOAD_3;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return ErrorCode.STARTDOWNLOAD_3;
            case 1:
                return ErrorCode.STARTDOWNLOAD_3;
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
                float[] a = C5163c.m7878a(g, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 17.0f);
                h.reset();
                h.setValues(a);
                canvas.concat(h);
                Paint a2 = C5163c.m7876a(k, looper);
                a2.setColor(-8929981);
                canvas.save();
                Paint a3 = C5163c.m7876a(a2, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(99.83001f, 0.47431085f);
                l.cubicTo(101.02664f, -0.03665553f, 102.34294f, -0.13684502f, 103.609375f, 0.18376134f);
                l.cubicTo(119.77388f, 3.580185f, 135.94836f, 6.936533f, 152.12283f, 10.312919f);
                l.cubicTo(155.31386f, 10.713676f, 158.11597f, 13.498944f, 157.9963f, 16.835255f);
                l.cubicTo(157.76695f, 19.460218f, 156.72987f, 21.924881f, 155.99194f, 24.429617f);
                l.cubicTo(151.94334f, 37.484306f, 147.88477f, 50.549015f, 143.8561f, 63.603706f);
                l.cubicTo(142.91873f, 66.469124f, 142.41017f, 69.71526f, 140.08672f, 71.849304f);
                l.cubicTo(137.91283f, 73.762924f, 135.25032f, 74.98523f, 132.78725f, 76.46804f);
                l.cubicTo(105.244774f, 92.53843f, 77.67238f, 108.578766f, 50.139866f, 124.6692f);
                l.cubicTo(47.4275f, 126.162025f, 44.69519f, 128.3762f, 41.404453f, 127.9454f);
                l.cubicTo(38.6522f, 127.724976f, 36.348682f, 125.871475f, 35.022415f, 123.52704f);
                l.cubicTo(23.774075f, 105.072136f, 12.445958f, 86.65731f, 1.2275326f, 68.17235f);
                l.cubicTo(-1.3252825f, 64.34511f, 0.2901708f, 58.754536f, 4.3487477f, 56.720688f);
                l.cubicTo(33.865673f, 39.227604f, 63.40254f, 21.774595f, 92.90949f, 4.2815113f);
                l.cubicTo(95.18309f, 2.9590101f, 97.376915f, 1.4561678f, 99.83001f, 0.47431085f);
                l.lineTo(99.83001f, 0.47431085f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.save();
                a3 = C5163c.m7876a(k, looper);
                a3.setColor(-655378);
                a = C5163c.m7878a(a, 1.0f, 0.0f, 28.0f, 0.0f, 1.0f, 30.0f);
                h.reset();
                h.setValues(a);
                canvas.concat(h);
                canvas.save();
                Paint a4 = C5163c.m7876a(a3, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(61.0f, 10.177664f);
                l.cubicTo(66.59033f, 6.831719f, 72.13002f, 3.4158595f, 77.67984f, 0.0f);
                l.cubicTo(78.39889f, 1.2085351f, 79.12806f, 2.4070823f, 79.85724f, 3.6056294f);
                l.cubicTo(75.705f, 6.1725183f, 71.54263f, 8.729419f, 67.360016f, 11.246368f);
                l.cubicTo(68.58543f, 13.223971f, 69.810844f, 15.201573f, 71.03626f, 17.179176f);
                l.cubicTo(74.894806f, 14.802058f, 78.74322f, 12.424939f, 82.62202f, 10.077785f);
                l.cubicTo(83.29043f, 11.196428f, 83.95884f, 12.325061f, 84.637375f, 13.453692f);
                l.cubicTo(80.788956f, 15.790859f, 76.95067f, 18.138014f, 73.092125f, 20.455206f);
                l.cubicTo(74.388435f, 22.61259f, 75.715126f, 24.759989f, 77.06207f, 26.88741f);
                l.cubicTo(81.29533f, 24.32052f, 85.518456f, 21.743645f, 89.741585f, 19.15678f);
                l.cubicTo(90.49101f, 20.325363f, 91.25057f, 21.493946f, 92.0f, 22.66253f);
                l.cubicTo(86.4198f, 26.168282f, 80.74845f, 29.54419f, 75.13786f, 33.0f);
                l.cubicTo(70.39824f, 25.4092f, 65.7295f, 17.77845f, 61.0f, 10.177664f);
                l.lineTo(61.0f, 10.177664f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a4);
                canvas.restore();
                canvas.save();
                a4 = C5163c.m7876a(a3, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(41.0f, 23.220709f);
                l.cubicTo(46.534267f, 19.783833f, 52.09889f, 16.38692f, 57.67363f, 13.0f);
                l.cubicTo(58.39197f, 14.19891f, 59.110313f, 15.387829f, 59.83877f, 16.576748f);
                l.cubicTo(55.710835f, 19.164396f, 51.522194f, 21.672117f, 47.363903f, 24.229792f);
                l.cubicTo(48.58812f, 26.198002f, 49.80222f, 28.166212f, 51.026436f, 30.144415f);
                l.cubicTo(54.89132f, 27.776567f, 58.746082f, 25.378746f, 62.651436f, 23.080835f);
                l.cubicTo(63.298954f, 24.199818f, 63.956593f, 25.30881f, 64.624344f, 26.417803f);
                l.cubicTo(60.759464f, 28.755676f, 56.93505f, 31.133514f, 53.080288f, 33.47139f);
                l.cubicTo(54.385445f, 35.609447f, 55.710835f, 37.7475f, 57.03623f, 39.88556f);
                l.cubicTo(61.275455f, 37.327885f, 65.48434f, 34.70027f, 69.73368f, 32.142597f);
                l.cubicTo(70.482376f, 33.321526f, 71.23107f, 34.500454f, 72.0f, 35.679382f);
                l.cubicTo(66.38479f, 39.116257f, 60.73923f, 42.503178f, 55.16449f, 46.0f);
                l.cubicTo(50.378918f, 38.446865f, 45.80581f, 30.763851f, 41.0f, 23.220709f);
                l.lineTo(41.0f, 23.220709f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a4);
                canvas.restore();
                canvas.save();
                a4 = C5163c.m7876a(a3, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(32.001217f, 28.78541f);
                l.cubicTo(34.872528f, 27.337238f, 38.737755f, 27.86922f, 40.63523f, 30.568535f);
                l.cubicTo(42.86401f, 32.923046f, 42.522663f, 36.32182f, 41.609066f, 39.1492f);
                l.cubicTo(47.020382f, 38.76499f, 48.04442f, 45.23744f, 52.0f, 47.54269f);
                l.cubicTo(50.514145f, 48.350513f, 49.048374f, 49.187893f, 47.5826f, 50.035122f);
                l.cubicTo(45.31366f, 47.503284f, 43.94828f, 43.533127f, 40.303925f, 42.676044f);
                l.cubicTo(37.010952f, 43.50357f, 34.320354f, 45.70046f, 31.449041f, 47.394917f);
                l.cubicTo(33.32644f, 50.41933f, 35.203835f, 53.44375f, 37.111347f, 56.44846f);
                l.cubicTo(35.745968f, 57.29569f, 34.38059f, 58.15277f, 33.005173f, 59.0f);
                l.cubicTo(28.356861f, 51.49315f, 23.69851f, 43.976444f, 19.0f, 36.499146f);
                l.cubicTo(23.357164f, 33.967304f, 27.49346f, 31.051258f, 32.001217f, 28.78541f);
                l.lineTo(32.001217f, 28.78541f);
                l.close();
                l.moveTo(25.0f, 36.890717f);
                l.cubicTo(26.418848f, 39.27691f, 27.877382f, 41.643387f, 29.355762f, 44.0f);
                l.cubicTo(32.183537f, 42.07724f, 35.547096f, 40.736237f, 37.78947f, 38.07395f);
                l.cubicTo(38.642765f, 35.52999f, 36.807194f, 32.187347f, 33.999264f, 32.0f);
                l.cubicTo(30.685312f, 32.95645f, 27.96668f, 35.214462f, 25.0f, 36.890717f);
                l.lineTo(25.0f, 36.890717f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a4);
                canvas.restore();
                canvas.save();
                a3 = C5163c.m7876a(a3, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(0.0f, 48.88484f);
                l.cubicTo(5.224876f, 45.63032f, 10.449752f, 42.365696f, 15.615142f, 39.0f);
                l.cubicTo(16.35872f, 40.212864f, 17.102299f, 41.435833f, 17.845877f, 42.648697f);
                l.cubicTo(13.969356f, 45.084534f, 10.112663f, 47.55069f, 6.2361426f, 49.96631f);
                l.cubicTo(7.435782f, 51.957428f, 8.625507f, 53.958652f, 9.825147f, 55.959877f);
                l.cubicTo(13.205949f, 53.81715f, 16.58675f, 51.674427f, 19.957638f, 49.52159f);
                l.cubicTo(20.631817f, 50.633385f, 21.315908f, 51.755283f, 22.0f, 52.867077f);
                l.cubicTo(18.629112f, 55.030014f, 15.24831f, 57.192955f, 11.837765f, 59.285145f);
                l.cubicTo(13.82064f, 62.681164f, 15.833259f, 66.04686f, 17.87562f, 69.40245f);
                l.cubicTo(16.527264f, 70.26156f, 15.188824f, 71.13078f, 13.850383f, 72.0f);
                l.cubicTo(9.200541f, 64.308426f, 4.6300135f, 56.576416f, 0.0f, 48.88484f);
                l.lineTo(0.0f, 48.88484f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.restore();
                canvas.save();
                k = C5163c.m7876a(k, looper);
                k.setColor(-8929980);
                g = C5163c.m7878a(a, 1.0f, 0.0f, 52.0f, 0.0f, 1.0f, 62.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a5 = C5163c.m7876a(k, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(1.0f, 4.8907146f);
                l.cubicTo(3.9666812f, 3.2144618f, 6.6853123f, 0.9564503f, 9.999264f, -1.4210855E-14f);
                l.cubicTo(12.807193f, 0.18734594f, 14.642765f, 3.5299919f, 13.789472f, 6.073952f);
                l.cubicTo(11.547097f, 8.736237f, 8.183536f, 10.077239f, 5.355763f, 12.0f);
                l.cubicTo(3.8773832f, 9.643385f, 2.4188476f, 7.2769103f, 1.0f, 4.8907146f);
                l.lineTo(1.0f, 4.8907146f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a5);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
