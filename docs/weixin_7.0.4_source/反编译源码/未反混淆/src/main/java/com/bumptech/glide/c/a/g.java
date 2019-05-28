package com.bumptech.glide.c.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.FilterInputStream;
import java.io.InputStream;

public final class g extends FilterInputStream {
    private static final byte[] azm = new byte[]{(byte) -1, (byte) -31, (byte) 0, (byte) 28, (byte) 69, (byte) 120, (byte) 105, (byte) 102, (byte) 0, (byte) 0, (byte) 77, (byte) 77, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 8, (byte) 0, (byte) 1, (byte) 1, (byte) 18, (byte) 0, (byte) 2, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0};
    private static final int azn = 29;
    private static final int azo = 31;
    private final byte azp;
    private int position;

    public g(InputStream inputStream, int i) {
        super(inputStream);
        AppMethodBeat.i(91710);
        if (i < -1 || i > 8) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Cannot add invalid orientation: ".concat(String.valueOf(i)));
            AppMethodBeat.o(91710);
            throw illegalArgumentException;
        }
        this.azp = (byte) i;
        AppMethodBeat.o(91710);
    }

    public final boolean markSupported() {
        return false;
    }

    public final void mark(int i) {
        AppMethodBeat.i(91711);
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        AppMethodBeat.o(91711);
        throw unsupportedOperationException;
    }

    public final int read() {
        int read;
        AppMethodBeat.i(91712);
        if (this.position < 2 || this.position > azo) {
            read = super.read();
        } else if (this.position == azo) {
            read = this.azp;
        } else {
            read = azm[this.position - 2] & 255;
        }
        if (read != -1) {
            this.position++;
        }
        AppMethodBeat.o(91712);
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read;
        AppMethodBeat.i(91713);
        if (this.position > azo) {
            read = super.read(bArr, i, i2);
        } else if (this.position == azo) {
            bArr[i] = this.azp;
            read = 1;
        } else if (this.position < 2) {
            read = super.read(bArr, i, 2 - this.position);
        } else {
            read = Math.min(azo - this.position, i2);
            System.arraycopy(azm, this.position - 2, bArr, i, read);
        }
        if (read > 0) {
            this.position += read;
        }
        AppMethodBeat.o(91713);
        return read;
    }

    public final long skip(long j) {
        AppMethodBeat.i(91714);
        long skip = super.skip(j);
        if (skip > 0) {
            this.position = (int) (((long) this.position) + skip);
        }
        AppMethodBeat.o(91714);
        return skip;
    }

    public final void reset() {
        AppMethodBeat.i(91715);
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        AppMethodBeat.o(91715);
        throw unsupportedOperationException;
    }
}
