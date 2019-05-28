package com.tencent.p177mm.plugin.game.p428f;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.C25738R;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.game.f.b */
public final class C39204b {
    public static HashMap<Long, Long> jZc = new HashMap();
    public static HashMap<Long, String> jZd = new HashMap();
    private static Map<String, List<String>> nnv = new HashMap();
    private static Map<String, List<String>> nnw = new HashMap();

    static {
        AppMethodBeat.m2504i(112292);
        AppMethodBeat.m2505o(112292);
    }

    /* renamed from: h */
    public static String m66794h(Context context, long j) {
        AppMethodBeat.m2504i(112291);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        String str;
        if (j < 3600000) {
            str = "";
            AppMethodBeat.m2505o(112291);
            return str;
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        if (jZc.containsKey(Long.valueOf(j))) {
            if (timeInMillis - ((Long) jZc.get(Long.valueOf(j))).longValue() >= 60000) {
                jZc.remove(Long.valueOf(j));
            } else if (jZd.containsKey(Long.valueOf(j))) {
                str = (String) jZd.get(Long.valueOf(j));
                AppMethodBeat.m2505o(112291);
                return str;
            }
        }
        int i;
        if ((timeInMillis - j) / 3600000 == 0) {
            i = (int) ((timeInMillis - j) / 60000);
            if (i <= 0) {
                i = 1;
            }
            str = context.getResources().getQuantityString(C25738R.plurals.f9599k, i, new Object[]{Integer.valueOf(i)});
            jZd.put(Long.valueOf(j), str);
            jZc.put(Long.valueOf(j), Long.valueOf(timeInMillis));
            AppMethodBeat.m2505o(112291);
            return str;
        }
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
        long timeInMillis2 = j - gregorianCalendar2.getTimeInMillis();
        if (timeInMillis2 <= 0 || timeInMillis2 > 86400000) {
            timeInMillis2 = (j - gregorianCalendar2.getTimeInMillis()) + 86400000;
            if (timeInMillis2 <= 0 || timeInMillis2 > 86400000) {
                i = (int) (((gregorianCalendar2.getTimeInMillis() + 86400000) - j) / 86400000);
                if (i <= 0) {
                    i = 1;
                }
                str = context.getResources().getQuantityString(C25738R.plurals.f9600l, i, new Object[]{Integer.valueOf(i)});
                jZd.put(Long.valueOf(j), str);
                jZc.put(Long.valueOf(j), Long.valueOf(timeInMillis));
                AppMethodBeat.m2505o(112291);
                return str;
            }
            str = context.getString(C25738R.string.byb);
            jZd.put(Long.valueOf(j), str);
            jZc.put(Long.valueOf(j), Long.valueOf(timeInMillis));
            AppMethodBeat.m2505o(112291);
            return str;
        }
        i = (int) ((timeInMillis - j) / 3600000);
        if (i <= 0) {
            i = 1;
        }
        str = context.getResources().getQuantityString(C25738R.plurals.f9598j, i, new Object[]{Integer.valueOf(i)});
        jZd.put(Long.valueOf(j), str);
        jZc.put(Long.valueOf(j), Long.valueOf(timeInMillis));
        AppMethodBeat.m2505o(112291);
        return str;
    }
}
