package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.Status;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzo extends zzd {
    private final /* synthetic */ zzn zzez;

    zzo(zzn zzn) {
        this.zzez = zzn;
    }

    public final void zzh(Status status) {
        AppMethodBeat.i(50450);
        this.zzez.setResult(status);
        AppMethodBeat.o(50450);
    }
}
