package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class cpk extends btd {
    public int wIr;
    public int wPb;
    public int wem;
    public long wen;
    public int xmS;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(5243);
        b bVar;
        int ix;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(5243);
                throw bVar;
            }
            if (this.BaseResponse != null) {
                aVar.iy(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.iz(2, this.wem);
            aVar.ai(3, this.wen);
            aVar.iz(4, this.wPb);
            aVar.iz(5, this.wIr);
            aVar.iz(6, this.xmS);
            AppMethodBeat.o(5243);
            return 0;
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            int bs = ((((ix + e.a.a.b.b.a.bs(2, this.wem)) + e.a.a.b.b.a.o(3, this.wen)) + e.a.a.b.b.a.bs(4, this.wPb)) + e.a.a.b.b.a.bs(5, this.wIr)) + e.a.a.b.b.a.bs(6, this.xmS);
            AppMethodBeat.o(5243);
            return bs;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(5243);
                throw bVar;
            }
            AppMethodBeat.o(5243);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            cpk cpk = (cpk) objArr[1];
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
                        cpk.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.o(5243);
                    return 0;
                case 2:
                    cpk.wem = aVar3.BTU.vd();
                    AppMethodBeat.o(5243);
                    return 0;
                case 3:
                    cpk.wen = aVar3.BTU.ve();
                    AppMethodBeat.o(5243);
                    return 0;
                case 4:
                    cpk.wPb = aVar3.BTU.vd();
                    AppMethodBeat.o(5243);
                    return 0;
                case 5:
                    cpk.wIr = aVar3.BTU.vd();
                    AppMethodBeat.o(5243);
                    return 0;
                case 6:
                    cpk.xmS = aVar3.BTU.vd();
                    AppMethodBeat.o(5243);
                    return 0;
                default:
                    AppMethodBeat.o(5243);
                    return -1;
            }
        } else {
            AppMethodBeat.o(5243);
            return -1;
        }
    }
}
