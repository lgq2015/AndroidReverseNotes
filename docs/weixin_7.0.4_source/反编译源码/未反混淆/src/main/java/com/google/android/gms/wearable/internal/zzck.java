package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil.ResultConverter;
import com.google.android.gms.wearable.DataApi.DataItemResult;
import com.google.android.gms.wearable.DataItem;
import com.tencent.matrix.trace.core.AppMethodBeat;

final /* synthetic */ class zzck implements ResultConverter {
    static final ResultConverter zzbx = new zzck();

    static {
        AppMethodBeat.i(71156);
        AppMethodBeat.o(71156);
    }

    private zzck() {
    }

    public final Object convert(Result result) {
        AppMethodBeat.i(71155);
        DataItem dataItem = ((DataItemResult) result).getDataItem();
        AppMethodBeat.o(71155);
        return dataItem;
    }
}
