package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class gn extends btd {
    public LinkedList<String> vIL = new LinkedList();

    public gn() {
        AppMethodBeat.i(62513);
        AppMethodBeat.o(62513);
    }

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(62514);
        b bVar;
        int ix;
        byte[] bArr;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(62514);
                throw bVar;
            }
            if (this.BaseResponse != null) {
                aVar.iy(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.e(2, 1, this.vIL);
            AppMethodBeat.o(62514);
            return 0;
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            int c = ix + e.a.a.a.c(2, 1, this.vIL);
            AppMethodBeat.o(62514);
            return c;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.vIL.clear();
            e.a.a.a.a aVar2 = new e.a.a.a.a(bArr, unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(62514);
                throw bVar;
            }
            AppMethodBeat.o(62514);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            gn gnVar = (gn) objArr[1];
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
                        gnVar.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.o(62514);
                    return 0;
                case 2:
                    gnVar.vIL.add(aVar3.BTU.readString());
                    AppMethodBeat.o(62514);
                    return 0;
                default:
                    AppMethodBeat.o(62514);
                    return -1;
            }
        } else {
            AppMethodBeat.o(62514);
            return -1;
        }
    }
}
