package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class adr extends btd {
    public int Timestamp;
    public LinkedList<b> wlP = new LinkedList();
    public int wlQ;
    public LinkedList<Integer> wlR = new LinkedList();

    public adr() {
        AppMethodBeat.i(118198);
        AppMethodBeat.o(118198);
    }

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(118199);
        e.a.a.b bVar;
        int ix;
        byte[] bArr;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseResponse == null) {
                bVar = new e.a.a.b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(118199);
                throw bVar;
            }
            if (this.BaseResponse != null) {
                aVar.iy(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.e(2, 6, this.wlP);
            aVar.iz(3, this.wlQ);
            aVar.iz(4, this.Timestamp);
            aVar.e(5, 2, this.wlR);
            AppMethodBeat.o(118199);
            return 0;
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            int c = (((ix + e.a.a.a.c(2, 6, this.wlP)) + e.a.a.b.b.a.bs(3, this.wlQ)) + e.a.a.b.b.a.bs(4, this.Timestamp)) + e.a.a.a.c(5, 2, this.wlR);
            AppMethodBeat.o(118199);
            return c;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.wlP.clear();
            this.wlR.clear();
            e.a.a.a.a aVar2 = new e.a.a.a.a(bArr, unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            if (this.BaseResponse == null) {
                bVar = new e.a.a.b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(118199);
                throw bVar;
            }
            AppMethodBeat.o(118199);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            adr adr = (adr) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList Vh = aVar3.Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        BaseResponse baseResponse = new BaseResponse();
                        e.a.a.a.a aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = baseResponse.populateBuilderWithField(aVar4, baseResponse, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        adr.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.o(118199);
                    return 0;
                case 2:
                    adr.wlP.add(aVar3.BTU.emu());
                    AppMethodBeat.o(118199);
                    return 0;
                case 3:
                    adr.wlQ = aVar3.BTU.vd();
                    AppMethodBeat.o(118199);
                    return 0;
                case 4:
                    adr.Timestamp = aVar3.BTU.vd();
                    AppMethodBeat.o(118199);
                    return 0;
                case 5:
                    adr.wlR.add(Integer.valueOf(aVar3.BTU.vd()));
                    AppMethodBeat.o(118199);
                    return 0;
                default:
                    AppMethodBeat.o(118199);
                    return -1;
            }
        } else {
            AppMethodBeat.o(118199);
            return -1;
        }
    }
}
