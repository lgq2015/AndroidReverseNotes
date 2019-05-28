package com.tencent.mm.sdk.f;

import android.text.TextUtils;
import android.util.Pair;
import android.webkit.MimeTypeMap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class b {
    private static final Map<String, String> xDv;
    private static final Map<String, String> xDw;

    public static final class a {
        private static final Pattern xDx = Pattern.compile("([a-zA-Z*-.0-9]+/[a-zA-Z*-.0-9]+)");
        public final String charset;
        public final String mimeType;

        private a(String str, String str2) {
            this.mimeType = str;
            this.charset = str2;
        }

        public final String toString() {
            AppMethodBeat.i(65359);
            String str = "ContentType{mimeType='" + this.mimeType + '\'' + ", charset='" + this.charset + '\'' + '}';
            AppMethodBeat.o(65359);
            return str;
        }

        static {
            AppMethodBeat.i(65361);
            AppMethodBeat.o(65361);
        }

        public static a anJ(String str) {
            String str2 = null;
            AppMethodBeat.i(65360);
            if (TextUtils.isEmpty(str)) {
                AppMethodBeat.o(65360);
                return null;
            }
            Matcher matcher = xDx.matcher(str);
            if (matcher.find()) {
                String group = matcher.group(0);
                if (str.contains("charset=")) {
                    str2 = str.substring(str.indexOf("charset=") + 8).trim();
                }
                if (TextUtils.isEmpty(str2)) {
                    str2 = "UTF-8";
                }
                a aVar = new a(group, str2);
                AppMethodBeat.o(65360);
                return aVar;
            }
            AppMethodBeat.o(65360);
            return null;
        }
    }

    static {
        AppMethodBeat.i(65365);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("silk", "audio/silk"));
        arrayList.add(new Pair("jpg", "image/jpg"));
        arrayList.add(new Pair("json", "application/json"));
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            hashMap.put(pair.first, pair.second);
            hashMap2.put(pair.second, pair.first);
        }
        xDv = Collections.unmodifiableMap(hashMap);
        xDw = Collections.unmodifiableMap(hashMap2);
        AppMethodBeat.o(65365);
    }

    public static String anI(String str) {
        AppMethodBeat.i(65362);
        if (TextUtils.isEmpty(str)) {
            AppMethodBeat.o(65362);
            return null;
        }
        String str2 = (String) xDv.get(str.toLowerCase());
        if (TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        }
        if (TextUtils.isEmpty(str2) && "mp3".equals(str)) {
            str2 = "audio/mpeg";
            AppMethodBeat.o(65362);
            return str2;
        }
        AppMethodBeat.o(65362);
        return str2;
    }

    public static String ajn(String str) {
        AppMethodBeat.i(65364);
        if (TextUtils.isEmpty(str)) {
            AppMethodBeat.o(65364);
            return null;
        }
        String str2 = (String) xDw.get(str.toLowerCase());
        if (TextUtils.isEmpty(str2)) {
            str2 = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        }
        if (TextUtils.isEmpty(str2)) {
            if ("audio/mpeg".equals(str)) {
                str2 = "mp3";
                AppMethodBeat.o(65364);
                return str2;
            } else if ("audio/mp3".equals(str)) {
                str2 = "mp3";
                AppMethodBeat.o(65364);
                return str2;
            } else if ("audio/mp4".equals(str)) {
                str2 = "mp4";
                AppMethodBeat.o(65364);
                return str2;
            }
        }
        AppMethodBeat.o(65364);
        return str2;
    }

    public static String ako(String str) {
        String str2 = null;
        AppMethodBeat.i(65363);
        if (!TextUtils.isEmpty(str)) {
            int lastIndexOf = str.lastIndexOf(46);
            if (lastIndexOf >= 0 && lastIndexOf < str.length() - 1) {
                str2 = str.substring(lastIndexOf + 1);
            }
        }
        str2 = anI(str2);
        AppMethodBeat.o(65363);
        return str2;
    }
}
