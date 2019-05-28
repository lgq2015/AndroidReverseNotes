package com.tencent.mm.plugin.appbrand.jsapi.coverview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.plugin.appbrand.jsapi.base.g;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.ttpic.util.VideoMaterialUtil;
import org.json.JSONException;
import org.json.JSONObject;

public final class b extends c {
    public static final int CTRL_INDEX = 342;
    public static final String NAME = "animateCoverView";

    public final int r(JSONObject jSONObject) {
        AppMethodBeat.i(126291);
        int i = jSONObject.getInt("viewId");
        AppMethodBeat.o(126291);
        return i;
    }

    public final boolean b(e eVar, int i, View view, JSONObject jSONObject, g gVar) {
        AppMethodBeat.i(126292);
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("finalStyle");
            float a = com.tencent.mm.plugin.appbrand.r.g.a(jSONObject2, "left", com.tencent.mm.plugin.appbrand.r.g.au(view.getX()));
            float a2 = com.tencent.mm.plugin.appbrand.r.g.a(jSONObject2, "top", com.tencent.mm.plugin.appbrand.r.g.au(view.getY()));
            float optDouble = (float) jSONObject2.optDouble("opacity", (double) view.getAlpha());
            float optDouble2 = (float) jSONObject2.optDouble(FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION, (double) view.getRotation());
            float optDouble3 = (float) jSONObject2.optDouble("scaleX", (double) view.getScaleX());
            float optDouble4 = (float) jSONObject2.optDouble("scaleY", (double) view.getScaleY());
            int optInt = jSONObject.optInt(FFmpegMetadataRetriever.METADATA_KEY_DURATION, 300);
            String optString = jSONObject.optString("easing", "linear");
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, VideoMaterialUtil.CRAZYFACE_X, new float[]{view.getX(), a});
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, VideoMaterialUtil.CRAZYFACE_Y, new float[]{view.getY(), a2});
            View view2 = view;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view2, "alpha", new float[]{view.getAlpha(), optDouble});
            view2 = view;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view2, "rotation", new float[]{view.getRotation(), optDouble2});
            view2 = view;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view2, "scaleX", new float[]{view.getScaleX(), optDouble3});
            view2 = view;
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view2, "scaleY", new float[]{view.getScaleY(), optDouble4});
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration((long) optInt);
            TimeInterpolator timeInterpolator = null;
            if (optString != null) {
                if (optString.equals("ease")) {
                    timeInterpolator = new AccelerateDecelerateInterpolator();
                } else if (optString.equals("ease-in")) {
                    timeInterpolator = new AccelerateInterpolator();
                } else if (optString.equals("ease-out")) {
                    timeInterpolator = new DecelerateInterpolator();
                }
            }
            if (timeInterpolator == null) {
                timeInterpolator = new LinearInterpolator();
            }
            animatorSet.setInterpolator(timeInterpolator);
            final g gVar2 = gVar;
            animatorSet.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    AppMethodBeat.i(126290);
                    gVar2.AR(b.this.j("ok", null));
                    AppMethodBeat.o(126290);
                }
            });
            animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6});
            animatorSet.start();
            AppMethodBeat.o(126292);
            return true;
        } catch (JSONException e) {
            ab.w("MicroMsg.JsApiAnimateCoverView", "get finalStyle error : %s", Log.getStackTraceString(e));
            gVar.AR(j("fail:missing finalStyle", null));
            AppMethodBeat.o(126292);
            return false;
        }
    }

    public final boolean aCE() {
        return true;
    }
}
