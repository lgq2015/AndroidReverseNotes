package com.google.android.gms.common.server.response;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.BufferedReader;

final class zzc implements zza<Float> {
    zzc() {
    }

    public final /* synthetic */ Object zzh(FastParser fastParser, BufferedReader bufferedReader) {
        AppMethodBeat.m2504i(61628);
        Float valueOf = Float.valueOf(FastParser.zzc(fastParser, bufferedReader));
        AppMethodBeat.m2505o(61628);
        return valueOf;
    }
}
