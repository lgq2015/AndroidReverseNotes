package com.tencent.ttpic.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class ByteUtil {
    public static byte[] mBytes = new byte[4];

    public static int readInt() {
        AppMethodBeat.i(83825);
        ByteBuffer wrap = ByteBuffer.wrap(mBytes);
        wrap.order(ByteOrder.nativeOrder());
        int i = wrap.getInt();
        AppMethodBeat.o(83825);
        return i;
    }

    public static byte[] getByteBuffer() {
        return mBytes;
    }

    public static int readInt(byte[] bArr) {
        AppMethodBeat.i(83826);
        if (bArr == null) {
            AppMethodBeat.o(83826);
            return 0;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.nativeOrder());
        int i = wrap.getInt();
        AppMethodBeat.o(83826);
        return i;
    }
}
