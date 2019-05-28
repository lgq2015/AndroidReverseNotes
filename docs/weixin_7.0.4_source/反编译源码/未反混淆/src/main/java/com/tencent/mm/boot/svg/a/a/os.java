package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class os extends c {
    private final int height = 149;
    private final int width = 782;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 782;
            case 1:
                return 149;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix h = c.h(looper);
                float[] g = c.g(looper);
                Paint k = c.k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = c.k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                c.a(k2, looper).setStrokeWidth(1.0f);
                canvas.save();
                g = c.a(g, 1.0f, 0.0f, -229.0f, 0.0f, 1.0f, -1459.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                g = c.a(g, 1.0f, 0.0f, 229.0f, 0.0f, 1.0f, 1459.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a = c.a(k, looper);
                a.setColor(-15028967);
                Path l = c.l(looper);
                l.moveTo(60.994865f, 93.64396f);
                l.cubicTo(60.236855f, 94.023125f, 59.385136f, 94.24604f, 58.481354f, 94.24604f);
                l.cubicTo(56.38433f, 94.24604f, 54.56011f, 93.08979f, 53.60218f, 91.38563f);
                l.lineTo(53.23775f, 90.58354f);
                l.lineTo(37.969254f, 57.06896f);
                l.cubicTo(37.80474f, 56.704376f, 37.702698f, 56.28979f, 37.702698f, 55.887707f);
                l.cubicTo(37.702698f, 54.346043f, 38.95425f, 53.09396f, 40.497345f, 53.09396f);
                l.cubicTo(41.128323f, 53.09396f, 41.70308f, 53.30229f, 42.169548f, 53.650208f);
                l.lineTo(60.184795f, 66.47938f);
                l.cubicTo(61.498817f, 67.34187f, 63.07523f, 67.84604f, 64.76826f, 67.84604f);
                l.cubicTo(65.774086f, 67.84604f, 66.736176f, 67.66062f, 67.633705f, 67.33354f);
                l.lineTo(152.3539f, 29.612709f);
                l.cubicTo(137.16869f, 11.704375f, 112.15642f, 2.0833334E-4f, 83.85388f, 2.0833334E-4f);
                l.cubicTo(37.540268f, 2.0833334E-4f, 0.0f, 31.300209f, 0.0f, 69.91271f);
                l.cubicTo(0.0f, 90.977295f, 11.291027f, 109.943954f, 28.973082f, 122.76063f);
                l.cubicTo(30.39123f, 123.77104f, 31.317917f, 125.43354f, 31.317917f, 127.31687f);
                l.cubicTo(31.317917f, 127.937706f, 31.188807f, 128.50229f, 31.024292f, 129.09604f);
                l.cubicTo(29.614475f, 134.36688f, 27.35294f, 142.80438f, 27.248817f, 143.20021f);
                l.cubicTo(27.071808f, 143.85854f, 26.794844f, 144.55229f, 26.794844f, 145.24396f);
                l.cubicTo(26.794844f, 146.78563f, 28.046394f, 148.0377f, 29.59365f, 148.0377f);
                l.cubicTo(30.197561f, 148.0377f, 30.693184f, 147.81271f, 31.207548f, 147.51895f);
                l.lineTo(49.5664f, 136.9127f);
                l.cubicTo(50.944977f, 136.11688f, 52.406857f, 135.62312f, 54.016586f, 135.62312f);
                l.cubicTo(54.876637f, 135.62312f, 55.705452f, 135.75438f, 56.482204f, 135.99605f);
                l.cubicTo(65.04731f, 138.45854f, 74.28921f, 139.82729f, 83.85388f, 139.82729f);
                l.cubicTo(130.16959f, 139.82729f, 167.71402f, 108.52729f, 167.71402f, 69.91271f);
                l.cubicTo(167.71402f, 58.221043f, 164.25092f, 47.20646f, 158.16183f, 37.51896f);
                l.lineTo(61.607105f, 93.28771f);
                l.lineTo(60.994865f, 93.64396f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = c.a(k, looper);
                a.setColor(-11711155);
                l = c.l(looper);
                l.moveTo(273.66974f, 73.417915f);
                l.cubicTo(273.13873f, 75.32208f, 272.61603f, 77.17f, 272.10583f, 78.97417f);
                l.cubicTo(270.11917f, 85.99917f, 268.38034f, 92.14917f, 267.0309f, 98.330414f);
                l.cubicTo(265.7023f, 90.91375f, 263.4241f, 82.20333f, 261.00638f, 73.19292f);
                l.lineTo(249.4134f, 29.461666f);
                l.lineTo(243.40346f, 29.461666f);
                l.lineTo(230.6568f, 73.52f);
                l.cubicTo(227.74138f, 83.02625f, 225.20079f, 91.517914f, 223.83888f, 98.39917f);
                l.cubicTo(222.54567f, 92.41167f, 220.70479f, 85.153336f, 218.76604f, 77.50542f);
                l.lineTo(206.39838f, 29.461666f);
                l.lineTo(199.78453f, 29.461666f);
                l.lineTo(220.50696f, 107.96167f);
                l.lineTo(226.39821f, 107.96167f);
                l.lineTo(239.72379f, 62.978333f);
                l.cubicTo(242.90784f, 52.472084f, 244.9653f, 45.228333f, 246.25226f, 38.73875f);
                l.cubicTo(247.37886f, 45.68875f, 249.2239f, 53.03875f, 251.929f, 62.961666f);
                l.lineTo(263.6386f, 107.96167f);
                l.lineTo(269.64438f, 107.96167f);
                l.lineTo(293.16144f, 29.461666f);
                l.lineTo(286.53717f, 29.461666f);
                l.lineTo(273.66974f, 73.417915f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = c.a(k, looper);
                a.setColor(-11711155);
                l = c.l(looper);
                l.moveTo(317.61667f, 56.065624f);
                l.cubicTo(322.18347f, 56.065624f, 325.87357f, 57.46146f, 328.5849f, 60.213543f);
                l.cubicTo(332.99554f, 64.69271f, 333.5828f, 71.35104f, 333.59528f, 74.453125f);
                l.lineTo(299.6368f, 74.453125f);
                l.cubicTo(300.8467f, 65.84896f, 306.22568f, 56.065624f, 317.61667f, 56.065624f);
                l.lineTo(317.61667f, 56.065624f);
                l.close();
                l.moveTo(334.4595f, 100.64896f);
                l.cubicTo(331.24835f, 102.13646f, 327.17508f, 103.45104f, 319.91568f, 103.45104f);
                l.cubicTo(306.97537f, 103.45104f, 299.4952f, 94.82604f, 299.3432f, 79.76979f);
                l.lineTo(339.9634f, 79.76979f);
                l.lineTo(340.0467f, 79.40104f);
                l.cubicTo(340.28827f, 78.313545f, 340.28827f, 77.47813f, 340.28827f, 75.95937f);
                l.cubicTo(340.28827f, 73.876045f, 339.99463f, 66.578125f, 336.2379f, 60.25729f);
                l.cubicTo(332.39786f, 53.796875f, 326.36502f, 50.51979f, 318.30594f, 50.51979f);
                l.cubicTo(303.16656f, 50.51979f, 292.99173f, 62.732292f, 292.99173f, 80.90938f);
                l.cubicTo(292.99173f, 97.77812f, 303.53516f, 109.11146f, 319.22638f, 109.11146f);
                l.cubicTo(329.2242f, 109.11146f, 334.8635f, 106.57396f, 336.82516f, 105.484375f);
                l.lineTo(337.14792f, 105.30521f);
                l.lineTo(334.4595f, 100.64896f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = c.a(k, looper);
                a.setColor(-11711155);
                l = c.l(looper);
                l.moveTo(388.11185f, 103.45021f);
                l.cubicTo(367.88297f, 103.45021f, 355.8027f, 90.679375f, 355.8027f, 69.28771f);
                l.cubicTo(355.8027f, 47.10229f, 368.22656f, 33.856457f, 389.0323f, 33.856457f);
                l.cubicTo(394.80484f, 33.856457f, 400.22754f, 34.94604f, 404.40494f, 36.910625f);
                l.lineTo(407.33075f, 31.837708f);
                l.lineTo(407.0892f, 31.704374f);
                l.cubicTo(405.58984f, 30.881458f, 399.85477f, 28.193958f, 388.91776f, 28.193958f);
                l.cubicTo(365.10706f, 28.193958f, 349.1097f, 44.66271f, 349.1097f, 69.17104f);
                l.cubicTo(349.1097f, 98.65229f, 369.13037f, 109.11063f, 386.27307f, 109.11063f);
                l.cubicTo(396.021f, 109.11063f, 403.58652f, 107.06479f, 407.41614f, 105.148125f);
                l.lineTo(407.70767f, 105.00437f);
                l.lineTo(404.90262f, 100.14396f);
                l.cubicTo(400.41287f, 102.21479f, 394.19467f, 103.45021f, 388.11185f, 103.45021f);
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = c.a(k, looper);
                a.setColor(-11711155);
                l = c.l(looper);
                l.moveTo(442.86542f, 50.519585f);
                l.cubicTo(438.75674f, 50.519585f, 434.80844f, 51.65708f, 431.47443f, 53.802917f);
                l.cubicTo(428.7277f, 55.37375f, 426.2329f, 57.865417f, 424.47534f, 60.759167f);
                l.lineTo(424.47534f, 28.194584f);
                l.lineTo(418.00934f, 28.194584f);
                l.lineTo(418.00934f, 107.96125f);
                l.lineTo(424.47534f, 107.96125f);
                l.lineTo(424.47534f, 73.77375f);
                l.cubicTo(424.47534f, 71.53625f, 424.57736f, 70.0925f, 425.13754f, 68.409164f);
                l.cubicTo(427.67606f, 61.275833f, 434.3503f, 56.294582f, 441.37024f, 56.294582f);
                l.cubicTo(454.17102f, 56.294582f, 456.08063f, 67.894585f, 456.08063f, 74.809166f);
                l.lineTo(456.08063f, 107.96125f);
                l.lineTo(462.54663f, 107.96125f);
                l.lineTo(462.54663f, 74.23417f);
                l.cubicTo(462.54663f, 51.663334f, 446.15152f, 50.519585f, 442.86542f, 50.519585f);
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = c.a(k, looper);
                a.setColor(-11711155);
                l = c.l(looper);
                l.moveTo(545.65875f, 103.12583f);
                l.cubicTo(544.52795f, 103.36542f, 542.9474f, 103.565414f, 540.7754f, 103.565414f);
                l.cubicTo(535.6047f, 103.565414f, 533.1974f, 100.09458f, 533.1974f, 92.644585f);
                l.lineTo(533.1974f, 57.215416f);
                l.lineTo(548.95526f, 57.215416f);
                l.lineTo(548.95526f, 51.78417f);
                l.lineTo(533.1974f, 51.78417f);
                l.lineTo(533.1974f, 39.37792f);
                l.lineTo(526.7314f, 39.37792f);
                l.lineTo(526.7314f, 51.78417f);
                l.lineTo(517.4166f, 51.78417f);
                l.lineTo(517.4166f, 57.215416f);
                l.lineTo(526.7314f, 57.215416f);
                l.lineTo(526.7314f, 91.61125f);
                l.cubicTo(526.7314f, 97.99458f, 527.8976f, 102.42375f, 530.28406f, 105.13417f);
                l.cubicTo(532.37897f, 107.81333f, 535.76715f, 109.22792f, 540.0861f, 109.22792f);
                l.cubicTo(543.16815f, 109.22792f, 545.8253f, 108.74875f, 547.98065f, 107.80708f);
                l.lineTo(548.2847f, 107.67375f);
                l.lineTo(545.65875f, 103.12583f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = c.a(k, looper);
                a.setColor(-11711155);
                l = c.l(looper);
                l.moveTo(612.89307f, 51.68125f);
                l.cubicTo(612.89307f, 63.447918f, 604.9735f, 70.19583f, 591.1648f, 70.19583f);
                l.cubicTo(588.2473f, 70.19583f, 584.5697f, 70.07708f, 581.7438f, 69.175f);
                l.lineTo(581.7438f, 35.264584f);
                l.cubicTo(583.0911f, 34.995834f, 586.5876f, 34.433334f, 592.19977f, 34.433334f);
                l.cubicTo(605.3504f, 34.433334f, 612.89307f, 40.720833f, 612.89307f, 51.68125f);
                l.moveTo(592.4309f, 28.8875f);
                l.cubicTo(586.8583f, 28.8875f, 581.21906f, 29.391666f, 575.6693f, 30.389584f);
                l.lineTo(575.282f, 30.458334f);
                l.lineTo(575.282f, 107.96042f);
                l.lineTo(581.7438f, 107.96042f);
                l.lineTo(581.7438f, 74.96667f);
                l.cubicTo(584.2719f, 75.60625f, 587.0811f, 75.74167f, 590.7046f, 75.74167f);
                l.cubicTo(600.64825f, 75.74167f, 608.86145f, 72.61875f, 613.82806f, 66.958336f);
                l.cubicTo(617.5473f, 62.875f, 619.35486f, 57.689583f, 619.35486f, 51.10625f);
                l.cubicTo(619.35486f, 44.7125f, 617.2349f, 39.339584f, 613.23456f, 35.579166f);
                l.cubicTo(608.73645f, 31.2f, 601.5437f, 28.8875f, 592.4309f, 28.8875f);
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = c.a(k, looper);
                a.setColor(-11711155);
                l = c.l(looper);
                l.moveTo(708.66833f, 51.78396f);
                l.lineTo(695.09906f, 87.87354f);
                l.cubicTo(693.84546f, 91.13396f, 692.7813f, 94.31104f, 691.8401f, 97.11521f);
                l.cubicTo(691.6152f, 97.788124f, 691.39856f, 98.438126f, 691.18616f, 99.05896f);
                l.cubicTo(690.0804f, 95.46521f, 688.7143f, 91.48813f, 687.46277f, 88.211044f);
                l.lineTo(672.971f, 52.079792f);
                l.lineTo(672.8523f, 51.78396f);
                l.lineTo(665.9719f, 51.78396f);
                l.lineTo(686.7048f, 103.63812f);
                l.cubicTo(687.24615f, 104.992294f, 687.3607f, 105.60271f, 687.3607f, 105.87771f);
                l.cubicTo(687.3607f, 106.38396f, 687.1296f, 107.054794f, 686.70685f, 108.11104f);
                l.cubicTo(683.9018f, 114.77771f, 680.2096f, 119.27979f, 677.6128f, 121.87979f);
                l.cubicTo(674.0247f, 125.34021f, 670.1201f, 127.12146f, 668.1127f, 127.87354f);
                l.lineTo(667.7295f, 128.01729f);
                l.lineTo(670.70325f, 133.1673f);
                l.cubicTo(672.1734f, 132.60896f, 675.8552f, 130.9923f, 679.9764f, 127.52146f);
                l.cubicTo(687.15247f, 121.25479f, 691.74426f, 111.59646f, 698.73505f, 93.625626f);
                l.lineTo(715.55914f, 51.78396f);
                l.lineTo(708.66833f, 51.78396f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = c.a(k, looper);
                a.setColor(-11711155);
                l = c.l(looper);
                l.moveTo(505.5504f, 89.76813f);
                l.cubicTo(505.5504f, 90.593124f, 505.4567f, 91.80979f, 504.99857f, 92.953545f);
                l.cubicTo(503.23682f, 98.13896f, 498.13483f, 103.680626f, 489.11157f, 103.680626f);
                l.cubicTo(484.23657f, 103.680626f, 478.54315f, 100.79104f, 478.54315f, 92.64521f);
                l.cubicTo(478.54315f, 89.17021f, 479.69266f, 86.29104f, 481.96045f, 84.08479f);
                l.cubicTo(485.8796f, 80.27646f, 493.10153f, 78.34937f, 503.4513f, 78.34937f);
                l.cubicTo(504.1364f, 78.34937f, 504.8382f, 78.35771f, 505.5504f, 78.37646f);
                l.lineTo(505.5504f, 89.76813f);
                l.close();
                l.moveTo(512.8119f, 107.413956f);
                l.cubicTo(512.1101f, 103.078545f, 512.01434f, 98.58271f, 512.01434f, 94.37021f);
                l.lineTo(512.01434f, 72.73896f);
                l.cubicTo(512.01434f, 58.20354f, 505.24637f, 50.520206f, 492.44974f, 50.520206f);
                l.cubicTo(486.68552f, 50.520206f, 480.52563f, 52.311874f, 475.97342f, 55.313957f);
                l.lineTo(475.94843f, 55.330624f);
                l.lineTo(478.58273f, 59.893124f);
                l.cubicTo(482.20203f, 57.430626f, 486.89584f, 56.06604f, 491.87708f, 56.06604f);
                l.cubicTo(491.9437f, 56.06604f, 492.01035f, 56.063957f, 492.07697f, 56.063957f);
                l.cubicTo(496.16275f, 56.063957f, 499.36554f, 57.18479f, 501.59583f, 59.397293f);
                l.cubicTo(504.25513f, 62.03479f, 505.5504f, 66.09937f, 505.5504f, 71.81812f);
                l.lineTo(505.5504f, 72.83896f);
                l.cubicTo(492.0145f, 72.72854f, 482.41235f, 75.49729f, 476.89386f, 80.961876f);
                l.cubicTo(473.54736f, 84.27854f, 471.85016f, 88.51813f, 471.85016f, 93.56604f);
                l.cubicTo(471.85016f, 101.10771f, 477.07294f, 109.226456f, 488.5389f, 109.226456f);
                l.cubicTo(496.88535f, 109.226456f, 502.97235f, 104.89729f, 506.11267f, 100.58063f);
                l.lineTo(506.86026f, 107.95979f);
                l.lineTo(512.9014f, 107.95979f);
                l.lineTo(512.8119f, 107.413956f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = c.a(k, looper);
                a.setColor(-11711155);
                l = c.l(looper);
                l.moveTo(653.8789f, 89.76813f);
                l.cubicTo(653.8789f, 90.59104f, 653.7852f, 91.80771f, 653.32916f, 92.953545f);
                l.cubicTo(651.56323f, 98.13896f, 646.4633f, 103.680626f, 637.4422f, 103.680626f);
                l.cubicTo(632.56714f, 103.680626f, 626.8717f, 100.79104f, 626.8717f, 92.64521f);
                l.cubicTo(626.8717f, 89.17021f, 628.0212f, 86.29104f, 630.28687f, 84.08479f);
                l.cubicTo(634.20605f, 80.27646f, 641.428f, 78.34937f, 651.7777f, 78.34937f);
                l.cubicTo(652.46497f, 78.34937f, 653.1647f, 78.35771f, 653.8789f, 78.37646f);
                l.lineTo(653.8789f, 89.76813f);
                l.close();
                l.moveTo(661.14044f, 107.413956f);
                l.cubicTo(660.44073f, 103.078545f, 660.34283f, 98.58271f, 660.34283f, 94.37021f);
                l.lineTo(660.34283f, 72.73896f);
                l.cubicTo(660.34283f, 58.20354f, 653.57697f, 50.520206f, 640.7762f, 50.520206f);
                l.cubicTo(635.2764f, 50.520206f, 629.4331f, 52.166042f, 624.95166f, 54.92229f);
                l.lineTo(627.57556f, 59.468124f);
                l.cubicTo(631.09485f, 57.274376f, 635.5201f, 56.06604f, 640.20764f, 56.06604f);
                l.cubicTo(640.2743f, 56.06604f, 640.34094f, 56.063957f, 640.4055f, 56.063957f);
                l.cubicTo(644.49335f, 56.063957f, 647.69403f, 57.18479f, 649.9244f, 59.395206f);
                l.cubicTo(652.58575f, 62.03479f, 653.8789f, 66.09937f, 653.8789f, 71.81812f);
                l.lineTo(653.8789f, 72.83896f);
                l.cubicTo(640.39716f, 72.72854f, 630.74084f, 75.49729f, 625.22235f, 80.961876f);
                l.cubicTo(621.8738f, 84.27854f, 620.17664f, 88.51813f, 620.17664f, 93.56604f);
                l.cubicTo(620.17664f, 101.10771f, 625.3994f, 109.226456f, 636.86743f, 109.226456f);
                l.cubicTo(645.21387f, 109.226456f, 651.29877f, 104.89729f, 654.44116f, 100.58271f);
                l.lineTo(655.1888f, 107.95979f);
                l.lineTo(661.23f, 107.95979f);
                l.lineTo(661.14044f, 107.413956f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                Paint a2 = c.a(k, looper);
                a2.setColor(-11711155);
                Path l2 = c.l(looper);
                l2.moveTo(752.968f, 75.519585f);
                l2.lineTo(745.6711f, 75.519585f);
                l2.lineTo(745.6711f, 68.8675f);
                l2.lineTo(743.23047f, 68.8675f);
                l2.lineTo(743.23047f, 85.15708f);
                l2.lineTo(745.6711f, 85.15708f);
                l2.lineTo(745.6711f, 77.70292f);
                l2.lineTo(752.968f, 77.70292f);
                l2.lineTo(752.968f, 85.15708f);
                l2.lineTo(755.4336f, 85.15708f);
                l2.lineTo(755.4336f, 68.8675f);
                l2.lineTo(752.968f, 68.8675f);
                l2.close();
                WeChatSVGRenderC2Java.setFillType(l2, 1);
                WeChatSVGRenderC2Java.setFillType(l2, 2);
                canvas.drawPath(l2, a2);
                canvas.restore();
                canvas.save();
                a = c.a(k, looper);
                a.setColor(-11711155);
                l = c.l(looper);
                l.moveTo(770.58655f, 68.86667f);
                l.lineTo(767.52325f, 68.86667f);
                l.lineTo(762.6045f, 74.910416f);
                l.cubicTo(762.2401f, 75.38333f, 761.9236f, 75.808334f, 761.6341f, 76.2125f);
                l.lineTo(761.6341f, 68.86667f);
                l.lineTo(759.1914f, 68.86667f);
                l.lineTo(759.1914f, 85.15625f);
                l.lineTo(761.6341f, 85.15625f);
                l.lineTo(761.6341f, 78.97083f);
                l.lineTo(762.9273f, 77.475f);
                l.lineTo(768.0772f, 85.15625f);
                l.lineTo(770.978f, 85.15625f);
                l.lineTo(764.6536f, 75.822914f);
                l.lineTo(770.58655f, 68.86667f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                a = c.a(k, looper);
                a.setColor(-11711155);
                l = c.l(looper);
                l.moveTo(756.81366f, 99.061874f);
                l.cubicTo(744.623f, 99.061874f, 734.7043f, 89.13896f, 734.7043f, 76.94312f);
                l.cubicTo(734.7043f, 64.74729f, 744.623f, 54.824375f, 756.81366f, 54.824375f);
                l.cubicTo(769.0043f, 54.824375f, 778.923f, 64.74729f, 778.923f, 76.94312f);
                l.cubicTo(778.923f, 89.13896f, 769.0043f, 99.061874f, 756.81366f, 99.061874f);
                l.moveTo(756.81366f, 52.482708f);
                l.cubicTo(743.3319f, 52.482708f, 732.36365f, 63.455624f, 732.36365f, 76.94312f);
                l.cubicTo(732.36365f, 90.430626f, 743.3319f, 101.405624f, 756.81366f, 101.405624f);
                l.cubicTo(770.2975f, 101.405624f, 781.26575f, 90.430626f, 781.26575f, 76.94312f);
                l.cubicTo(781.26575f, 63.455624f, 770.2975f, 52.482708f, 756.81366f, 52.482708f);
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
