package com.tencent.p177mm.boot.svg.p708a.p709a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.p177mm.plugin.appbrand.jsapi.JsApiOpenAdCanvas;
import com.tencent.p177mm.svg.C5163c;
import com.tencent.p177mm.svg.WeChatSVGRenderC2Java;
import com.tencent.smtt.sdk.WebView;

/* renamed from: com.tencent.mm.boot.svg.a.a.hv */
public final class C18022hv extends C5163c {
    private final int height = 292;
    private final int width = JsApiOpenAdCanvas.CTRL_INDEX;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return JsApiOpenAdCanvas.CTRL_INDEX;
            case 1:
                return 292;
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
                g = C5163c.m7878a(g, -1.0f, 0.0f, 473.0f, 0.0f, 1.0f, 2.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a = C5163c.m7876a(k, looper);
                a.setColor(-13158344);
                float[] a2 = C5163c.m7878a(g, -1.0f, 0.0f, 470.0f, 0.0f, 1.0f, 0.0f);
                h.reset();
                h.setValues(a2);
                canvas.concat(h);
                Path l = C5163c.m7884l(looper);
                l.moveTo(304.0f, 278.731f);
                l.lineTo(304.0f, 284.001f);
                l.lineTo(166.0f, 284.001f);
                l.lineTo(166.0f, 278.731f);
                l.lineTo(219.0f, 273.731f);
                l.lineTo(219.0f, 240.001f);
                l.lineTo(251.0f, 240.001f);
                l.lineTo(251.0f, 273.731f);
                l.lineTo(304.0f, 278.731f);
                l.close();
                l.moveTo(254.0f, 240.0f);
                l.lineTo(366.985f, 240.0f);
                l.lineTo(366.985f, 237.001f);
                l.lineTo(254.0f, 237.001f);
                l.lineTo(216.0f, 237.0f);
                l.lineTo(62.006f, 237.001f);
                l.cubicTo(55.938f, 237.001f, 51.0f, 232.063f, 51.0f, 225.994f);
                l.lineTo(51.0f, 14.007f);
                l.cubicTo(51.0f, 7.938f, 55.938f, 3.001f, 62.006f, 3.001f);
                l.lineTo(407.993f, 3.001f);
                l.cubicTo(414.063f, 3.001f, 419.0f, 7.938f, 419.0f, 14.007f);
                l.lineTo(419.0f, 97.39f);
                l.lineTo(422.0f, 97.39f);
                l.lineTo(422.0f, 14.007f);
                l.cubicTo(422.0f, 6.266f, 415.729f, 0.0f, 407.993f, 0.0f);
                l.lineTo(62.007f, 0.0f);
                l.cubicTo(54.276f, 0.0f, 48.0f, 6.271f, 48.0f, 14.007f);
                l.lineTo(48.0f, 225.994f);
                l.cubicTo(48.0f, 233.735f, 54.271f, 240.0f, 62.007f, 240.0f);
                l.lineTo(216.0f, 240.0f);
                l.lineTo(216.0f, 271.0f);
                l.lineTo(163.0f, 276.0f);
                l.lineTo(163.0f, 287.0f);
                l.lineTo(307.0f, 287.0f);
                l.lineTo(307.0f, 276.0f);
                l.lineTo(254.0f, 271.0f);
                l.lineTo(254.0f, 240.0f);
                l.close();
                l.moveTo(365.9854f, 226.0006f);
                l.lineTo(62.0004f, 226.0006f);
                l.lineTo(62.0004f, 14.0006f);
                l.lineTo(408.0004f, 14.0006f);
                l.lineTo(408.0004f, 95.3906f);
                l.cubicTo(408.0004f, 95.3906f, 408.9994f, 97.02239f, 408.9994f, 95.01775f);
                l.lineTo(408.9994f, 13.0006f);
                l.lineTo(60.9994f, 13.0006f);
                l.lineTo(60.9994f, 227.0006f);
                l.lineTo(365.9854f, 227.0006f);
                l.lineTo(365.9854f, 226.0006f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = C5163c.m7876a(k, looper);
                a.setColor(-15028967);
                l = C5163c.m7884l(looper);
                l.moveTo(185.0f, 117.61729f);
                l.cubicTo(185.0f, 89.385185f, 207.38518f, 67.0f, 235.61728f, 67.0f);
                l.cubicTo(262.6148f, 67.0f, 285.0f, 89.385185f, 285.0f, 117.61729f);
                l.cubicTo(285.0f, 144.61482f, 262.6148f, 167.0f, 235.61728f, 167.0f);
                l.cubicTo(207.38518f, 167.0f, 185.0f, 144.61482f, 185.0f, 117.61729f);
                l.close();
                l.moveTo(188.0f, 117.580246f);
                l.cubicTo(188.0f, 91.042076f, 209.04207f, 70.0f, 235.58025f, 70.0f);
                l.cubicTo(260.95792f, 70.0f, 282.0f, 91.042076f, 282.0f, 117.580246f);
                l.cubicTo(282.0f, 142.95793f, 260.95792f, 164.0f, 235.58025f, 164.0f);
                l.cubicTo(209.04207f, 164.0f, 188.0f, 142.95793f, 188.0f, 117.580246f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = C5163c.m7876a(k, looper);
                a.setColor(-15028967);
                a2 = C5163c.m7878a(a2, -1.0f, 0.0f, 468.67923f, 0.0f, 1.0f, 0.0f);
                h.reset();
                h.setValues(a2);
                canvas.concat(h);
                l = C5163c.m7884l(looper);
                l.moveTo(208.31874f, 119.193306f);
                l.cubicTo(207.93587f, 118.79706f, 207.89252f, 118.1125f, 208.21802f, 117.66961f);
                l.lineTo(209.92644f, 115.34499f);
                l.cubicTo(210.25368f, 114.89973f, 210.8712f, 114.808754f, 211.3054f, 115.14154f);
                l.lineTo(223.18962f, 124.250114f);
                l.cubicTo(224.06194f, 124.918686f, 225.45206f, 124.8917f, 226.3035f, 124.18238f);
                l.lineTo(257.44058f, 98.24268f);
                l.cubicTo(257.86093f, 97.8925f, 258.5224f, 97.92535f, 258.91693f, 98.31499f);
                l.lineTo(260.37988f, 99.75982f);
                l.cubicTo(260.7749f, 100.14993f, 260.7811f, 100.77525f, 260.38577f, 101.1643f);
                l.lineTo(226.19208f, 134.816f);
                l.cubicTo(225.4056f, 135.59003f, 224.14778f, 135.57558f, 223.3797f, 134.78064f);
                l.lineTo(208.31874f, 119.193306f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                float[] a3 = C5163c.m7878a(a2, -1.0f, 0.0f, 106.0f, 0.0f, 1.0f, 96.0f);
                h.reset();
                h.setValues(a3);
                canvas.concat(h);
                canvas.save();
                Paint a4 = C5163c.m7876a(k, looper);
                a4.setColor(-13092808);
                l = C5163c.m7884l(looper);
                l.moveTo(3.0f, 183.006f);
                l.lineTo(3.0f, 7.994f);
                l.cubicTo(3.0f, 5.24f, 5.243f, 3.0f, 8.0f, 3.0f);
                l.lineTo(98.0f, 3.0f);
                l.cubicTo(100.757f, 3.0f, 103.0f, 5.24f, 103.0f, 7.994f);
                l.lineTo(103.0f, 183.006f);
                l.cubicTo(103.0f, 185.76f, 100.757f, 188.0f, 98.0f, 188.0f);
                l.lineTo(8.0f, 188.0f);
                l.cubicTo(5.243f, 188.0f, 3.0f, 185.76f, 3.0f, 183.006f);
                l.lineTo(3.0f, 183.006f);
                l.close();
                l.moveTo(98.0f, 191.0f);
                l.cubicTo(102.418f, 191.0f, 106.0f, 187.418f, 106.0f, 183.006f);
                l.lineTo(106.0f, 7.994f);
                l.cubicTo(106.0f, 3.579f, 102.412f, 0.0f, 98.0f, 0.0f);
                l.lineTo(8.0f, 0.0f);
                l.cubicTo(3.582f, 0.0f, 0.0f, 3.582f, 0.0f, 7.994f);
                l.lineTo(0.0f, 183.006f);
                l.cubicTo(0.0f, 187.421f, 3.588f, 191.0f, 8.0f, 191.0f);
                l.lineTo(98.0f, 191.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a4);
                canvas.restore();
                canvas.save();
                g = C5163c.m7878a(a3, 1.0f, 0.0f, 35.0f, 0.0f, 1.0f, 77.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.restore();
                canvas.save();
                g = C5163c.m7878a(g, 1.0f, 0.0f, 7.0f, 0.0f, 1.0f, 10.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a5 = C5163c.m7876a(k, looper);
                a5.setColor(-13092808);
                Path l2 = C5163c.m7884l(looper);
                l2.moveTo(1.0f, 157.0f);
                l2.lineTo(91.0f, 157.0f);
                l2.lineTo(91.0f, 11.0f);
                l2.lineTo(1.0f, 11.0f);
                l2.lineTo(1.0f, 157.0f);
                l2.close();
                l2.moveTo(0.0f, 158.0f);
                l2.lineTo(92.0f, 158.0f);
                l2.lineTo(92.0f, 10.0f);
                l2.lineTo(0.0f, 10.0f);
                l2.lineTo(0.0f, 158.0f);
                l2.close();
                WeChatSVGRenderC2Java.setFillType(l2, 2);
                canvas.drawPath(l2, a5);
                canvas.restore();
                canvas.save();
                Paint a6 = C5163c.m7876a(k, looper);
                a6.setColor(-6776677);
                l = C5163c.m7884l(looper);
                l.moveTo(13.652f, 53.817215f);
                l.cubicTo(12.7396f, 53.817215f, 12.0f, 53.186596f, 12.0f, 52.40864f);
                l.cubicTo(12.0f, 51.63062f, 12.7396f, 51.0f, 13.652f, 51.0f);
                l.lineTo(66.348f, 51.0f);
                l.cubicTo(67.2604f, 51.0f, 68.0f, 51.63062f, 68.0f, 52.408573f);
                l.cubicTo(68.0f, 53.186527f, 67.2604f, 53.817215f, 66.348f, 53.817215f);
                l.lineTo(13.652f, 53.817215f);
                l.close();
                l.moveTo(77.994f, 69.387474f);
                l.lineTo(14.0060005f, 69.387474f);
                l.cubicTo(12.898087f, 69.387474f, 12.0f, 68.75686f, 12.0f, 67.978905f);
                l.lineTo(12.0f, 67.978836f);
                l.cubicTo(12.0f, 67.20088f, 12.898087f, 66.57026f, 14.0060005f, 66.57026f);
                l.lineTo(77.994f, 66.57026f);
                l.cubicTo(79.10191f, 66.57026f, 80.0f, 67.20088f, 80.0f, 67.978836f);
                l.lineTo(80.0f, 67.978905f);
                l.cubicTo(80.0f, 68.75686f, 79.10191f, 69.387474f, 77.994f, 69.387474f);
                l.lineTo(77.994f, 69.387474f);
                l.close();
                l.moveTo(46.024593f, 84.25f);
                l.lineTo(13.975407f, 84.25f);
                l.cubicTo(12.884389f, 84.25f, 12.0f, 83.61937f, 12.0f, 82.84139f);
                l.lineTo(12.0f, 82.84139f);
                l.cubicTo(12.0f, 82.063416f, 12.884389f, 81.432785f, 13.975407f, 81.432785f);
                l.lineTo(46.024593f, 81.432785f);
                l.cubicTo(47.115612f, 81.432785f, 48.0f, 82.063416f, 48.0f, 82.84139f);
                l.lineTo(48.0f, 82.84139f);
                l.cubicTo(47.9999f, 83.61937f, 47.115513f, 84.25f, 46.024593f, 84.25f);
                l.lineTo(46.024593f, 84.25f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a6);
                canvas.restore();
                canvas.save();
                a5 = C5163c.m7876a(k, looper);
                a5.setColor(-13092808);
                l2 = C5163c.m7884l(looper);
                l2.moveTo(39.0f, 3.0f);
                l2.lineTo(53.0f, 3.0f);
                l2.lineTo(53.0f, 0.0f);
                l2.lineTo(39.0f, 0.0f);
                l2.close();
                WeChatSVGRenderC2Java.setFillType(l2, 1);
                WeChatSVGRenderC2Java.setFillType(l2, 2);
                canvas.drawPath(l2, a5);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
