package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class cqe extends btd {
    public long xod;
    public int xoh;
    public int xoi;
    public LinkedList<ccy> xoj = new LinkedList();

    public cqe() {
        AppMethodBeat.i(5272);
        AppMethodBeat.o(5272);
    }

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(5273);
        b bVar;
        int ix;
        byte[] bArr;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(5273);
                throw bVar;
            }
            if (this.BaseResponse != null) {
                aVar.iy(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.iz(2, this.xoh);
            aVar.ai(3, this.xod);
            aVar.iz(4, this.xoi);
            aVar.e(5, 8, this.xoj);
            AppMethodBeat.o(5273);
            return 0;
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            int bs = (((ix + e.a.a.b.b.a.bs(2, this.xoh)) + e.a.a.b.b.a.o(3, this.xod)) + e.a.a.b.b.a.bs(4, this.xoi)) + e.a.a.a.c(5, 8, this.xoj);
            AppMethodBeat.o(5273);
            return bs;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.xoj.clear();
            e.a.a.a.a aVar2 = new e.a.a.a.a(bArr, unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(5273);
                throw bVar;
            }
            AppMethodBeat.o(5273);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            cqe cqe = (cqe) objArr[1];
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
                        cqe.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.o(5273);
                    return 0;
                case 2:
                    cqe.xoh = aVar3.BTU.vd();
                    AppMethodBeat.o(5273);
                    return 0;
                case 3:
                    cqe.xod = aVar3.BTU.ve();
                    AppMethodBeat.o(5273);
                    return 0;
                case 4:
                    cqe.xoi = aVar3.BTU.vd();
                    AppMethodBeat.o(5273);
                    return 0;
                case 5:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        ccy ccy = new ccy();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = ccy.populateBuilderWithField(aVar4, ccy, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        cqe.xoj.add(ccy);
                    }
                    AppMethodBeat.o(5273);
                    return 0;
                default:
                    AppMethodBeat.o(5273);
                    return -1;
            }
        } else {
            AppMethodBeat.o(5273);
            return -1;
        }
    }
}
