package com.p081b.p082a.p083a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.UnsupportedEncodingException;

/* renamed from: com.b.a.a.h */
public final class C37153h {
    static final int bDi = 5;
    static final int bDj = 7;
    static final byte[] bDk;
    static final int bDl = 4;
    static final int bDm = 6;
    static final byte[] bDn;
    static final byte[] bDo = new byte[]{(byte) -75, (byte) -5, (byte) -12, (byte) 112, (byte) -40, (byte) -44, (byte) -7, (byte) -71};
    static final String bDp = ("/" + C44978y.PROTOCOL + "/c.php");
    static final String bDq = ("/" + C44978y.PROTOCOL + "/d.php");
    static final String bDr = ("_" + C44978y.MODE + "_list.sensewhere-sdk.com");

    static {
        byte[] bytes;
        AppMethodBeat.m2504i(55653);
        try {
            bytes = "$UEC,".getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            bytes = "$UEC,".getBytes();
        }
        bDk = bytes;
        try {
            bytes = "$UP,".getBytes("UTF-8");
        } catch (UnsupportedEncodingException e2) {
            bytes = "$UP,".getBytes();
        }
        bDn = bytes;
        AppMethodBeat.m2505o(55653);
    }
}
