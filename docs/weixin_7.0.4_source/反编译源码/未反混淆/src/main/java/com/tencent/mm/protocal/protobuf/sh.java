package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.c.a;
import java.util.LinkedList;

public final class sh extends bsr {
    public LinkedList<ss> vZD = new LinkedList();

    public sh() {
        AppMethodBeat.i(63684);
        AppMethodBeat.o(63684);
    }

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(63685);
        int ix;
        byte[] bArr;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseRequest != null) {
                aVar.iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.e(2, 8, this.vZD);
            AppMethodBeat.o(63685);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            int c = ix + e.a.a.a.c(2, 8, this.vZD);
            AppMethodBeat.o(63685);
            return c;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.vZD.clear();
            e.a.a.a.a aVar2 = new e.a.a.a.a(bArr, unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(63685);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            sh shVar = (sh) objArr[1];
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
                        hl hlVar = new hl();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = hlVar.populateBuilderWithField(aVar4, hlVar, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        shVar.BaseRequest = hlVar;
                    }
                    AppMethodBeat.o(63685);
                    return 0;
                case 2:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        ss ssVar = new ss();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = ssVar.populateBuilderWithField(aVar4, ssVar, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        shVar.vZD.add(ssVar);
                    }
                    AppMethodBeat.o(63685);
                    return 0;
                default:
                    AppMethodBeat.o(63685);
                    return -1;
            }
        } else {
            AppMethodBeat.o(63685);
            return -1;
        }
    }
}
