package com.tencent.mm.ipcinvoker;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.os.Process;
import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.h.b;
import java.io.FileInputStream;
import java.util.List;
import junit.framework.Assert;

public final class e {
    private static String eFZ;
    public static Context sContext;

    public static Context getContext() {
        AppMethodBeat.i(114021);
        Assert.assertNotNull("IPCInvoker not initialize.", sContext);
        Context context = sContext;
        AppMethodBeat.o(114021);
        return context;
    }

    public static boolean lg(String str) {
        AppMethodBeat.i(114022);
        if (str == null || !str.equals(PN())) {
            AppMethodBeat.o(114022);
            return false;
        }
        AppMethodBeat.o(114022);
        return true;
    }

    public static String PN() {
        AppMethodBeat.i(114023);
        if (eFZ == null || eFZ.length() == 0) {
            eFZ = z(sContext, Process.myPid());
        }
        String str = eFZ;
        AppMethodBeat.o(114023);
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ab A:{SYNTHETIC, Splitter:B:47:0x00ab} */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a1 A:{SYNTHETIC, Splitter:B:41:0x00a1} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static String z(Context context, int i) {
        Throwable e;
        AppMethodBeat.i(114024);
        if (context == null) {
            AppMethodBeat.o(114024);
            return null;
        }
        String str;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null) {
            List<RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (!(runningAppProcesses == null || runningAppProcesses.isEmpty())) {
                for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == i) {
                        str = runningAppProcessInfo.processName;
                        AppMethodBeat.o(114024);
                        return str;
                    }
                }
            }
        }
        byte[] bArr = new byte[128];
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream("/proc/" + i + "/cmdline");
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    int i2 = 0;
                    while (i2 < read) {
                        if (bArr[i2] > Byte.MIN_VALUE || bArr[i2] <= (byte) 0) {
                            read = i2;
                            break;
                        }
                        i2++;
                    }
                    str = new String(bArr, 0, read);
                    try {
                        fileInputStream.close();
                    } catch (Exception e2) {
                    }
                    AppMethodBeat.o(114024);
                    return str;
                }
                try {
                    fileInputStream.close();
                } catch (Exception e3) {
                }
                AppMethodBeat.o(114024);
                return null;
            } catch (Exception e4) {
                e = e4;
                try {
                    b.e("IPC.IPCInvokeLogic", "get running process error : %s", Log.getStackTraceString(e));
                    if (fileInputStream != null) {
                    }
                    AppMethodBeat.o(114024);
                    return null;
                } catch (Throwable th) {
                    e = th;
                    if (fileInputStream != null) {
                    }
                    AppMethodBeat.o(114024);
                    throw e;
                }
            }
        } catch (Exception e5) {
            e = e5;
            fileInputStream = null;
            b.e("IPC.IPCInvokeLogic", "get running process error : %s", Log.getStackTraceString(e));
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (Exception e6) {
                }
            }
            AppMethodBeat.o(114024);
            return null;
        } catch (Throwable th2) {
            e = th2;
            fileInputStream = null;
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (Exception e7) {
                }
            }
            AppMethodBeat.o(114024);
            throw e;
        }
    }
}
