package com.tencent.luggage.sdk.launching;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import com.tencent.mm.modelappbrand.LaunchParamsOptional;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.reflect.Method;

public abstract class a implements com.tencent.luggage.sdk.customize.a {
    public abstract boolean b(Context context, LaunchParcel launchParcel);

    public final boolean a(Context context, String str, String str2, String str3, int i, int i2, AppBrandStatObject appBrandStatObject, AppBrandLaunchReferrer appBrandLaunchReferrer, LaunchParamsOptional launchParamsOptional) {
        LaunchParcel launchParcel = new LaunchParcel();
        launchParcel.username = str;
        launchParcel.appId = str2;
        launchParcel.hgC = str3 == null ? null : str3.trim();
        launchParcel.har = i;
        launchParcel.version = i2;
        launchParcel.ijy = appBrandStatObject;
        launchParcel.hgF = appBrandLaunchReferrer;
        launchParcel.ijz = launchParamsOptional;
        return a(context, launchParcel);
    }

    public final boolean a(Context context, LaunchParcel launchParcel) {
        if (bo.isNullOrNil(launchParcel.username) && bo.isNullOrNil(launchParcel.appId)) {
            return false;
        }
        launchParcel.ijA = bo.anU();
        if (context == null) {
            context = ah.getContext();
        } else if (context instanceof Activity) {
            TypedArray typedArray = null;
            try {
                typedArray = context.obtainStyledAttributes(new int[]{16842840});
                if (!typedArray.getBoolean(0, false)) {
                    Activity activity = (Activity) context;
                    try {
                        Method declaredMethod = Activity.class.getDeclaredMethod("convertFromTranslucent", new Class[0]);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(activity, new Object[0]);
                    } catch (Throwable th) {
                        ab.printErrStackTrace("MicroMsg.AppBrand.Precondition.AbstractLaunchEntry", th, "call convertActivityFromTranslucent Fail: %s", th.getMessage());
                    }
                }
                if (typedArray != null) {
                    typedArray.recycle();
                }
            } catch (Exception e) {
                ab.printErrStackTrace("MicroMsg.AppBrand.Precondition.AbstractLaunchEntry", e, "convertActivityFromTranslucent %s", context.getClass().getSimpleName());
                if (typedArray != null) {
                    typedArray.recycle();
                }
            } catch (Throwable th2) {
                if (typedArray != null) {
                    typedArray.recycle();
                }
            }
        }
        return b(context, launchParcel);
    }
}
