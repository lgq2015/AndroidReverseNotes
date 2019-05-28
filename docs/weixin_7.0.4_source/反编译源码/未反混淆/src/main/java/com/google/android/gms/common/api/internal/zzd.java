package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;
import com.google.android.gms.common.api.internal.GoogleApiManager.zza;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzd<A extends ApiMethodImpl<? extends Result, AnyClient>> extends zzb {
    private final A zzdv;

    public zzd(int i, A a) {
        super(i);
        this.zzdv = a;
    }

    public final void zza(Status status) {
        AppMethodBeat.i(60902);
        this.zzdv.setFailedResult(status);
        AppMethodBeat.o(60902);
    }

    public final void zza(zza<?> zza) {
        AppMethodBeat.i(60901);
        try {
            this.zzdv.run(zza.zzae());
            AppMethodBeat.o(60901);
        } catch (RuntimeException e) {
            zza(e);
            AppMethodBeat.o(60901);
        }
    }

    public final void zza(zzaa zzaa, boolean z) {
        AppMethodBeat.i(60904);
        zzaa.zza(this.zzdv, z);
        AppMethodBeat.o(60904);
    }

    public final void zza(RuntimeException runtimeException) {
        AppMethodBeat.i(60903);
        String simpleName = runtimeException.getClass().getSimpleName();
        String localizedMessage = runtimeException.getLocalizedMessage();
        this.zzdv.setFailedResult(new Status(10, new StringBuilder((String.valueOf(simpleName).length() + 2) + String.valueOf(localizedMessage).length()).append(simpleName).append(": ").append(localizedMessage).toString()));
        AppMethodBeat.o(60903);
    }
}
