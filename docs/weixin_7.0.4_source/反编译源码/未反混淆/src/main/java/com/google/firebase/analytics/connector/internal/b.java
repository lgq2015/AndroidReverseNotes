package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.AppMeasurement.UserProperty;
import com.google.firebase.analytics.FirebaseAnalytics.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;
import java.util.List;

public final class b {
    private static final List<String> buO = Arrays.asList(new String[]{"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd", a.APP_OPEN});
    private static final List<String> buP = Arrays.asList(new String[]{"auto", "app", "am"});
    private static final List<String> buQ = Arrays.asList(new String[]{"_r", "_dbg"});
    private static final List<String> buR = Arrays.asList((String[]) ArrayUtils.concat(UserProperty.zzadb, UserProperty.zzadc));
    private static final List<String> buS = Arrays.asList(new String[]{"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"});

    static {
        AppMethodBeat.i(67882);
        AppMethodBeat.o(67882);
    }

    public static boolean a(String str, String str2, Bundle bundle) {
        AppMethodBeat.i(67881);
        if (!"_cmp".equals(str2)) {
            AppMethodBeat.o(67881);
            return true;
        } else if (!aV(str)) {
            AppMethodBeat.o(67881);
            return false;
        } else if (bundle == null) {
            AppMethodBeat.o(67881);
            return false;
        } else {
            for (String containsKey : buQ) {
                if (bundle.containsKey(containsKey)) {
                    AppMethodBeat.o(67881);
                    return false;
                }
            }
            Object obj = -1;
            switch (str.hashCode()) {
                case 101200:
                    if (str.equals(AppMeasurement.FCM_ORIGIN)) {
                        obj = null;
                        break;
                    }
                    break;
                case 101230:
                    if (str.equals("fdl")) {
                        int obj2 = 1;
                        break;
                    }
                    break;
            }
            switch (obj2) {
                case null:
                    bundle.putString("_cis", "fcm_integration");
                    AppMethodBeat.o(67881);
                    return true;
                case 1:
                    bundle.putString("_cis", "fdl_integration");
                    AppMethodBeat.o(67881);
                    return true;
                default:
                    AppMethodBeat.o(67881);
                    return false;
            }
        }
    }

    public static boolean aV(String str) {
        AppMethodBeat.i(67878);
        if (buP.contains(str)) {
            AppMethodBeat.o(67878);
            return false;
        }
        AppMethodBeat.o(67878);
        return true;
    }

    public static boolean aW(String str) {
        AppMethodBeat.i(67880);
        if (buR.contains(str)) {
            AppMethodBeat.o(67880);
            return false;
        }
        for (String matches : buS) {
            if (str.matches(matches)) {
                AppMethodBeat.o(67880);
                return false;
            }
        }
        AppMethodBeat.o(67880);
        return true;
    }

    public static boolean e(String str, Bundle bundle) {
        AppMethodBeat.i(67879);
        if (buO.contains(str)) {
            AppMethodBeat.o(67879);
            return false;
        }
        if (bundle != null) {
            for (String containsKey : buQ) {
                if (bundle.containsKey(containsKey)) {
                    AppMethodBeat.o(67879);
                    return false;
                }
            }
        }
        AppMethodBeat.o(67879);
        return true;
    }
}
