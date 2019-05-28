package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.CapabilityApi.CapabilityListener;
import com.google.android.gms.wearable.CapabilityInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzv implements CapabilityListener {
    private final String zzbc;
    private final CapabilityListener zzbs;

    zzv(CapabilityListener capabilityListener, String str) {
        this.zzbs = capabilityListener;
        this.zzbc = str;
    }

    public final boolean equals(Object obj) {
        AppMethodBeat.i(71474);
        if (this == obj) {
            AppMethodBeat.o(71474);
            return true;
        } else if (obj == null || getClass() != obj.getClass()) {
            AppMethodBeat.o(71474);
            return false;
        } else {
            zzv zzv = (zzv) obj;
            if (this.zzbs.equals(zzv.zzbs)) {
                boolean equals = this.zzbc.equals(zzv.zzbc);
                AppMethodBeat.o(71474);
                return equals;
            }
            AppMethodBeat.o(71474);
            return false;
        }
    }

    public final int hashCode() {
        AppMethodBeat.i(71475);
        int hashCode = (this.zzbs.hashCode() * 31) + this.zzbc.hashCode();
        AppMethodBeat.o(71475);
        return hashCode;
    }

    public final void onCapabilityChanged(CapabilityInfo capabilityInfo) {
        AppMethodBeat.i(71473);
        this.zzbs.onCapabilityChanged(capabilityInfo);
        AppMethodBeat.o(71473);
    }
}
