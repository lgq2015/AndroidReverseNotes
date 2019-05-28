package com.tencent.mm.plugin.nfc.c;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a {
    private static final char[] oTt = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static byte[] b(short s) {
        return new byte[]{(byte) ((s >>> 8) & 255), (byte) (s & 255)};
    }

    public static String byteArrayToHexString(byte[] bArr) {
        AppMethodBeat.i(23050);
        if (bArr == null) {
            AppMethodBeat.o(23050);
            return null;
        }
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            cArr[i * 2] = oTt[i2 >>> 4];
            cArr[(i * 2) + 1] = oTt[i2 & 15];
        }
        String str = new String(cArr);
        AppMethodBeat.o(23050);
        return str;
    }

    public static byte[] hexStringToByteArray(String str) {
        AppMethodBeat.i(23051);
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        AppMethodBeat.o(23051);
        return bArr;
    }
}
