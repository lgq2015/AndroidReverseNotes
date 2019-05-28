package com.tencent.d.d.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public final class a {
    private static final byte[] Atf = new byte[]{Byte.MAX_VALUE, (byte) 69, (byte) 76, (byte) 70};

    public static boolean atP(String str) {
        Throwable th;
        AppMethodBeat.i(114515);
        byte[] bArr = new byte[Atf.length];
        Closeable fileInputStream;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                if (fileInputStream.read(bArr, 0, Atf.length) != bArr.length) {
                    IOException iOException = new IOException("Read bytes less than " + bArr.length);
                    AppMethodBeat.o(114515);
                    throw iOException;
                }
                for (int i = 0; i < Atf.length; i++) {
                    if (Atf[i] != bArr[i]) {
                        b.closeQuietly(fileInputStream);
                        AppMethodBeat.o(114515);
                        return false;
                    }
                }
                b.closeQuietly(fileInputStream);
                AppMethodBeat.o(114515);
                return true;
            } catch (Throwable th2) {
                th = th2;
                b.closeQuietly(fileInputStream);
                AppMethodBeat.o(114515);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            b.closeQuietly(fileInputStream);
            AppMethodBeat.o(114515);
            throw th;
        }
    }

    public static byte[] atR(String str) {
        Throwable th;
        AppMethodBeat.i(114516);
        Closeable fileInputStream;
        Closeable byteArrayOutputStream;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream(fileInputStream.available());
                try {
                    b.copyLarge(fileInputStream, byteArrayOutputStream);
                    byte[] toByteArray = byteArrayOutputStream.toByteArray();
                    if (toByteArray == null) {
                        toByteArray = "".getBytes();
                    }
                    b.closeQuietly(fileInputStream);
                    b.closeQuietly(byteArrayOutputStream);
                    AppMethodBeat.o(114516);
                    return toByteArray;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream = null;
                b.closeQuietly(fileInputStream);
                b.closeQuietly(byteArrayOutputStream);
                AppMethodBeat.o(114516);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
            fileInputStream = null;
            b.closeQuietly(fileInputStream);
            b.closeQuietly(byteArrayOutputStream);
            AppMethodBeat.o(114516);
            throw th;
        }
    }

    public static byte[] eO(String str, int i) {
        Closeable closeable;
        Throwable th;
        int i2 = 0;
        AppMethodBeat.i(114517);
        File file = new File(str);
        if (file.exists()) {
            Closeable fileInputStream;
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    int read;
                    byte[] bArr = new byte[i];
                    do {
                        read = fileInputStream.read(bArr, i2, i - i2);
                        if (read == -1) {
                            break;
                        }
                        i2 += read;
                    } while (i2 < i);
                    read = i2;
                    if (read == 0) {
                        b.closeQuietly(fileInputStream);
                        AppMethodBeat.o(114517);
                        return null;
                    }
                    byte[] bArr2;
                    if (read < i) {
                        bArr2 = new byte[read];
                        System.arraycopy(bArr, 0, bArr2, 0, read);
                    } else {
                        bArr2 = bArr;
                    }
                    b.closeQuietly(fileInputStream);
                    AppMethodBeat.o(114517);
                    return bArr2;
                } catch (Throwable th2) {
                    th = th2;
                    b.closeQuietly(fileInputStream);
                    AppMethodBeat.o(114517);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
                b.closeQuietly(fileInputStream);
                AppMethodBeat.o(114517);
                throw th;
            }
        }
        AppMethodBeat.o(114517);
        return null;
    }
}
