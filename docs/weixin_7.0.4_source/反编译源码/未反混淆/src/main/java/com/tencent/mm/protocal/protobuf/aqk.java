package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class aqk extends btd {
    public int wui;
    public LinkedList<crv> wuj = new LinkedList();

    public aqk() {
        AppMethodBeat.i(28499);
        AppMethodBeat.o(28499);
    }

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(28500);
        b bVar;
        int ix;
        byte[] bArr;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(28500);
                throw bVar;
            }
            if (this.BaseResponse != null) {
                aVar.iy(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.iz(2, this.wui);
            aVar.e(3, 8, this.wuj);
            AppMethodBeat.o(28500);
            return 0;
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            int bs = (ix + e.a.a.b.b.a.bs(2, this.wui)) + e.a.a.a.c(3, 8, this.wuj);
            AppMethodBeat.o(28500);
            return bs;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.wuj.clear();
            e.a.a.a.a aVar2 = new e.a.a.a.a(bArr, unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(28500);
                throw bVar;
            }
            AppMethodBeat.o(28500);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            aqk aqk = (aqk) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            e.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        BaseResponse baseResponse = new BaseResponse();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = baseResponse.populateBuilderWithField(aVar4, baseResponse, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        aqk.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.o(28500);
                    return 0;
                case 2:
                    aqk.wui = aVar3.BTU.vd();
                    AppMethodBeat.o(28500);
                    return 0;
                case 3:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        crv crv = new crv();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = crv.populateBuilderWithField(aVar4, crv, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        aqk.wuj.add(crv);
                    }
                    AppMethodBeat.o(28500);
                    return 0;
                default:
                    AppMethodBeat.o(28500);
                    return -1;
            }
        } else {
            AppMethodBeat.o(28500);
            return -1;
        }
    }
}
