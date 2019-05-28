package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager.zza;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzf<ResultT> extends zzb {
    private final TaskCompletionSource<ResultT> zzdu;
    private final TaskApiCall<AnyClient, ResultT> zzdy;
    private final StatusExceptionMapper zzdz;

    public zzf(int i, TaskApiCall<AnyClient, ResultT> taskApiCall, TaskCompletionSource<ResultT> taskCompletionSource, StatusExceptionMapper statusExceptionMapper) {
        super(i);
        this.zzdu = taskCompletionSource;
        this.zzdy = taskApiCall;
        this.zzdz = statusExceptionMapper;
    }

    public final Feature[] getRequiredFeatures() {
        AppMethodBeat.m2504i(60912);
        Feature[] zzca = this.zzdy.zzca();
        AppMethodBeat.m2505o(60912);
        return zzca;
    }

    public final boolean shouldAutoResolveMissingFeatures() {
        AppMethodBeat.m2504i(60913);
        boolean shouldAutoResolveMissingFeatures = this.zzdy.shouldAutoResolveMissingFeatures();
        AppMethodBeat.m2505o(60913);
        return shouldAutoResolveMissingFeatures;
    }

    public final void zza(Status status) {
        AppMethodBeat.m2504i(60909);
        this.zzdu.trySetException(this.zzdz.getException(status));
        AppMethodBeat.m2505o(60909);
    }

    public final void zza(zza<?> zza) {
        AppMethodBeat.m2504i(60908);
        try {
            this.zzdy.doExecute(zza.zzae(), this.zzdu);
            AppMethodBeat.m2505o(60908);
        } catch (DeadObjectException e) {
            AppMethodBeat.m2505o(60908);
            throw e;
        } catch (RemoteException e2) {
            zza(zzb.zza(e2));
            AppMethodBeat.m2505o(60908);
        } catch (RuntimeException e3) {
            zza(e3);
            AppMethodBeat.m2505o(60908);
        }
    }

    public final void zza(zzaa zzaa, boolean z) {
        AppMethodBeat.m2504i(60911);
        zzaa.zza(this.zzdu, z);
        AppMethodBeat.m2505o(60911);
    }

    public final void zza(RuntimeException runtimeException) {
        AppMethodBeat.m2504i(60910);
        this.zzdu.trySetException(runtimeException);
        AppMethodBeat.m2505o(60910);
    }
}
