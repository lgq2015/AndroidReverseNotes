package com.google.android.gms.auth.api.accounttransfer;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzi extends zzd<byte[]> {
    private final /* synthetic */ zzh zzbb;

    zzi(zzh zzh, zze zze) {
        this.zzbb = zzh;
        super(zze);
    }

    public final void zzd(byte[] bArr) {
        AppMethodBeat.m2504i(76996);
        this.zzbb.setResult(bArr);
        AppMethodBeat.m2505o(76996);
    }
}
