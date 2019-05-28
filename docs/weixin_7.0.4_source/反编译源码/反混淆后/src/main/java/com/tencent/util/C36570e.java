package com.tencent.util;

import android.annotation.SuppressLint;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.opensdk.modelmsg.WXMediaMessage;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;

@SuppressLint({"NewApi"})
/* renamed from: com.tencent.util.e */
public final class C36570e {
    public static final byte[] AHX = new byte[]{(byte) 69, (byte) 78, (byte) 67, (byte) 82};

    /* renamed from: iF */
    public static void m60597iF(String str, String str2) {
        AppMethodBeat.m2504i(86579);
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            byte[] toByteArray = C5989g.toByteArray(fileInputStream);
            fileInputStream.close();
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(str2)));
                dataOutputStream.write(AHX);
                if (toByteArray.length > WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) {
                    C36570e.m60596d(dataOutputStream, toByteArray.length);
                    byte[] encode = C41105c.encode(Arrays.copyOfRange(toByteArray, 0, WXMediaMessage.DESCRIPTION_LENGTH_LIMIT));
                    C36570e.m60596d(dataOutputStream, encode.length);
                    dataOutputStream.write(encode);
                    dataOutputStream.write(toByteArray, WXMediaMessage.DESCRIPTION_LENGTH_LIMIT, toByteArray.length - 1024);
                } else {
                    C36570e.m60596d(dataOutputStream, toByteArray.length);
                    toByteArray = C41105c.encode(toByteArray);
                    C36570e.m60596d(dataOutputStream, toByteArray.length);
                    dataOutputStream.write(toByteArray);
                }
                dataOutputStream.close();
                AppMethodBeat.m2505o(86579);
            } catch (Exception e) {
                AppMethodBeat.m2505o(86579);
            }
        } catch (Exception e2) {
            AppMethodBeat.m2505o(86579);
        }
    }

    /* renamed from: O */
    public static byte[] m60594O(InputStream inputStream) {
        AppMethodBeat.m2504i(86580);
        try {
            byte[] bArr = new byte[4];
            inputStream.read(bArr);
            ByteArrayOutputStream byteArrayOutputStream;
            if (bArr[0] == AHX[0] && bArr[1] == AHX[1] && bArr[2] == AHX[2] && bArr[3] == AHX[3]) {
                byteArrayOutputStream = new ByteArrayOutputStream(C36570e.m60595P(inputStream));
                int P = C36570e.m60595P(inputStream);
                byte[] bArr2 = new byte[P];
                int read = inputStream.read(bArr2, 0, P);
                while (read < P) {
                    int read2 = inputStream.read(bArr2, read, P - read);
                    if (-1 == read2) {
                        RuntimeException runtimeException = new RuntimeException("decryptFile: inputStream end before all data read");
                        AppMethodBeat.m2505o(86580);
                        throw runtimeException;
                    }
                    read += read2;
                }
                Integer.toString(read);
                SecretKey generateSecret = SecretKeyFactory.getInstance("desede").generateSecret(new DESedeKeySpec(Coffee.dSI().getBytes()));
                Cipher instance = Cipher.getInstance("desede/CBC/PKCS5Padding");
                instance.init(2, generateSecret, new IvParameterSpec("68881999".getBytes()));
                bArr = instance.doFinal(bArr2);
                byteArrayOutputStream.write(bArr, 0, bArr.length);
                C5989g.copy(inputStream, byteArrayOutputStream);
                bArr = byteArrayOutputStream.toByteArray();
                AppMethodBeat.m2505o(86580);
                return bArr;
            }
            byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(bArr);
            C5989g.copy(inputStream, byteArrayOutputStream);
            bArr = byteArrayOutputStream.toByteArray();
            AppMethodBeat.m2505o(86580);
            return bArr;
        } catch (Exception | OutOfMemoryError e) {
            AppMethodBeat.m2505o(86580);
            return null;
        }
    }

    /* renamed from: P */
    private static int m60595P(InputStream inputStream) {
        AppMethodBeat.m2504i(86581);
        int read = inputStream.read();
        int read2 = inputStream.read();
        int read3 = inputStream.read();
        int read4 = inputStream.read();
        if ((((read | read2) | read3) | read4) < 0) {
            EOFException eOFException = new EOFException();
            AppMethodBeat.m2505o(86581);
            throw eOFException;
        }
        read = (((read << 24) + (read2 << 16)) + (read3 << 8)) + (read4 << 0);
        AppMethodBeat.m2505o(86581);
        return read;
    }

    /* renamed from: d */
    private static void m60596d(OutputStream outputStream, int i) {
        AppMethodBeat.m2504i(86582);
        outputStream.write(new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)});
        AppMethodBeat.m2505o(86582);
    }
}
