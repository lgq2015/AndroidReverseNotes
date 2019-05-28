package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.support.p057v4.content.WakefulBroadcastReceiver;
import android.support.p057v4.p065f.C0417m;
import android.util.Log;
import com.google.android.gms.common.util.CrashUtils.ErrorDialogData;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.firebase.iid.o */
public final class C25587o {
    private static C25587o bvV;
    @GuardedBy("serviceClassNames")
    private final C0417m<String, String> bvW = new C0417m();
    private Boolean bvX = null;
    final Queue<Intent> bvY = new ArrayDeque();
    public final Queue<Intent> bvZ = new ArrayDeque();

    private C25587o() {
        AppMethodBeat.m2504i(108745);
        AppMethodBeat.m2505o(108745);
    }

    /* renamed from: a */
    public static PendingIntent m40587a(Context context, int i, Intent intent) {
        AppMethodBeat.m2504i(108746);
        Intent intent2 = new Intent(context, FirebaseInstanceIdReceiver.class);
        intent2.setAction("com.google.firebase.MESSAGING_EVENT");
        intent2.putExtra("wrapped_intent", intent);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, i, intent2, ErrorDialogData.SUPPRESSED);
        AppMethodBeat.m2505o(108746);
        return broadcast;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b A:{Catch:{ SecurityException -> 0x010b, IllegalStateException -> 0x0113 }} */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ff A:{SYNTHETIC, Splitter:B:54:0x00ff} */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043 A:{Catch:{ SecurityException -> 0x010b, IllegalStateException -> 0x0113 }} */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: c */
    private final int m40588c(Context context, Intent intent) {
        Object obj;
        String str;
        String str2;
        AppMethodBeat.m2504i(108748);
        synchronized (this.bvW) {
            try {
                obj = (String) this.bvW.get(intent.getAction());
            } finally {
                while (true) {
                }
                AppMethodBeat.m2505o(108748);
            }
        }
        if (obj == null) {
            ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            if (!(resolveService == null || resolveService.serviceInfo == null)) {
                ServiceInfo serviceInfo = resolveService.serviceInfo;
                if (!context.getPackageName().equals(serviceInfo.packageName) || serviceInfo.name == null) {
                    str = serviceInfo.packageName;
                    str2 = serviceInfo.name;
                    new StringBuilder((String.valueOf(str).length() + 94) + String.valueOf(str2).length()).append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ").append(str).append("/").append(str2);
                } else {
                    obj = serviceInfo.name;
                    if (obj.startsWith(".")) {
                        str = String.valueOf(context.getPackageName());
                        str2 = String.valueOf(obj);
                        obj = str2.length() != 0 ? str.concat(str2) : new String(str);
                    }
                    synchronized (this.bvW) {
                        try {
                            this.bvW.put(intent.getAction(), obj);
                        } catch (Throwable th) {
                            while (true) {
                                AppMethodBeat.m2505o(108748);
                            }
                        }
                    }
                }
            }
            if (this.bvX == null) {
                this.bvX = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
            }
            if ((this.bvX.booleanValue() ? WakefulBroadcastReceiver.startWakefulService(context, intent) : context.startService(intent)) != null) {
                return 404;
            }
            AppMethodBeat.m2505o(108748);
            return -1;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            str = "Restricting intent to a specific service: ";
            String valueOf = String.valueOf(obj);
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        intent.setClassName(context.getPackageName(), obj);
        try {
            if (this.bvX == null) {
            }
            if (this.bvX.booleanValue()) {
            }
            if ((this.bvX.booleanValue() ? WakefulBroadcastReceiver.startWakefulService(context, intent) : context.startService(intent)) != null) {
            }
        } catch (SecurityException e) {
            AppMethodBeat.m2505o(108748);
            return 401;
        } catch (IllegalStateException e2) {
            str2 = String.valueOf(e2);
            new StringBuilder(String.valueOf(str2).length() + 45).append("Failed to start service while in background: ").append(str2);
            AppMethodBeat.m2505o(108748);
            return 402;
        }
    }

    /* renamed from: uS */
    public static synchronized C25587o m40589uS() {
        C25587o c25587o;
        synchronized (C25587o.class) {
            AppMethodBeat.m2504i(108744);
            if (bvV == null) {
                bvV = new C25587o();
            }
            c25587o = bvV;
            AppMethodBeat.m2505o(108744);
        }
        return c25587o;
    }

    /* renamed from: a */
    public final int mo43247a(Context context, String str, Intent intent) {
        AppMethodBeat.m2504i(108747);
        Object obj = -1;
        switch (str.hashCode()) {
            case -842411455:
                if (str.equals("com.google.firebase.INSTANCE_ID_EVENT")) {
                    obj = null;
                    break;
                }
                break;
            case 41532704:
                if (str.equals("com.google.firebase.MESSAGING_EVENT")) {
                    obj = 1;
                    break;
                }
                break;
        }
        switch (obj) {
            case null:
                this.bvY.offer(intent);
                break;
            case 1:
                this.bvZ.offer(intent);
                break;
            default:
                String str2 = "Unknown service action: ";
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
                AppMethodBeat.m2505o(108747);
                return 500;
        }
        Intent intent2 = new Intent(str);
        intent2.setPackage(context.getPackageName());
        int c = m40588c(context, intent2);
        AppMethodBeat.m2505o(108747);
        return c;
    }
}
