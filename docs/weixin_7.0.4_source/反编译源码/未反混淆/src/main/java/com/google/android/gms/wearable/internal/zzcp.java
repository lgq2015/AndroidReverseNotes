package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil.ResultConverter;
import com.google.android.gms.wearable.DataApi.DeleteDataItemsResult;
import com.tencent.matrix.trace.core.AppMethodBeat;

final /* synthetic */ class zzcp implements ResultConverter {
    static final ResultConverter zzbx = new zzcp();

    static {
        AppMethodBeat.i(71163);
        AppMethodBeat.o(71163);
    }

    private zzcp() {
    }

    public final Object convert(Result result) {
        AppMethodBeat.i(71162);
        Integer valueOf = Integer.valueOf(((DeleteDataItemsResult) result).getNumDeleted());
        AppMethodBeat.o(71162);
        return valueOf;
    }
}
