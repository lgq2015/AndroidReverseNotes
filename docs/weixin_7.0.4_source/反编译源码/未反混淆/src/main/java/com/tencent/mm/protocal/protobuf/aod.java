package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class aod extends btd {
    public String kdS;
    public int kdT;
    public String kdU;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(89102);
        b bVar;
        int ix;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(89102);
                throw bVar;
            }
            if (this.BaseResponse != null) {
                aVar.iy(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            if (this.kdS != null) {
                aVar.e(2, this.kdS);
            }
            aVar.iz(3, this.kdT);
            if (this.kdU != null) {
                aVar.e(4, this.kdU);
            }
            AppMethodBeat.o(89102);
            return 0;
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.kdS != null) {
                ix += e.a.a.b.b.a.f(2, this.kdS);
            }
            ix += e.a.a.b.b.a.bs(3, this.kdT);
            if (this.kdU != null) {
                ix += e.a.a.b.b.a.f(4, this.kdU);
            }
            AppMethodBeat.o(89102);
            return ix;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(89102);
                throw bVar;
            }
            AppMethodBeat.o(89102);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            aod aod = (aod) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList Vh = aVar3.Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) Vh.get(intValue);
                        BaseResponse baseResponse = new BaseResponse();
                        e.a.a.a.a aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = baseResponse.populateBuilderWithField(aVar4, baseResponse, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        aod.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.o(89102);
                    return 0;
                case 2:
                    aod.kdS = aVar3.BTU.readString();
                    AppMethodBeat.o(89102);
                    return 0;
                case 3:
                    aod.kdT = aVar3.BTU.vd();
                    AppMethodBeat.o(89102);
                    return 0;
                case 4:
                    aod.kdU = aVar3.BTU.readString();
                    AppMethodBeat.o(89102);
                    return 0;
                default:
                    AppMethodBeat.o(89102);
                    return -1;
            }
        } else {
            AppMethodBeat.o(89102);
            return -1;
        }
    }
}
