package com.tencent.ytcommon.auth;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.opensdk.modelmsg.WXMediaMessage;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUtil {
    private static final String CHARSET_UTF8 = "UTF-8";
    private static final int DEFAULT_TIMEOUT_MILLIS = 10000;

    public interface HttpResponseListener {
        void onFail(int i);

        void onSuccess(String str);
    }

    public static String post(String str, String str2, HttpResponseListener httpResponseListener) {
        AppMethodBeat.m2504i(16);
        HttpURLConnection buildConnection = buildConnection(str, 10000);
        buildConnection.setRequestProperty("Content-Type", "application/json");
        buildConnection.setRequestMethod("POST");
        if (!TextUtils.isEmpty(str2)) {
            OutputStream outputStream = buildConnection.getOutputStream();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, CHARSET_UTF8));
            bufferedWriter.write(str2);
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStream.close();
        }
        String response = getResponse(buildConnection, httpResponseListener);
        AppMethodBeat.m2505o(16);
        return response;
    }

    private static HttpURLConnection buildConnection(String str, int i) {
        AppMethodBeat.m2504i(17);
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(i);
        httpURLConnection.setReadTimeout(i);
        AppMethodBeat.m2505o(17);
        return httpURLConnection;
    }

    private static String getResponse(HttpURLConnection httpURLConnection, HttpResponseListener httpResponseListener) {
        String str = null;
        AppMethodBeat.m2504i(18);
        try {
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                InputStream inputStream = httpURLConnection.getInputStream();
                StringBuilder stringBuilder = new StringBuilder();
                byte[] bArr = new byte[WXMediaMessage.DESCRIPTION_LENGTH_LIMIT];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    stringBuilder.append(new String(bArr, 0, read));
                }
                inputStream.close();
                str = stringBuilder.toString();
                if (httpResponseListener != null) {
                    httpResponseListener.onSuccess(str);
                }
                AppMethodBeat.m2505o(18);
            } else {
                if (httpResponseListener != null) {
                    httpResponseListener.onFail(responseCode);
                }
                AppMethodBeat.m2505o(18);
            }
        } catch (Exception e) {
            AppMethodBeat.m2505o(18);
        }
        return str;
    }
}
