package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.c.a;
import java.util.LinkedList;

public final class cpn extends bsr {
    public int Timestamp;
    public int wem;
    public long wen;
    public long xlQ;
    public int xmV;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(5247);
        int ix;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseRequest != null) {
                aVar.iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.iz(2, this.wem);
            aVar.ai(3, this.wen);
            aVar.iz(4, this.Timestamp);
            aVar.ai(5, this.xlQ);
            aVar.iz(6, this.xmV);
            AppMethodBeat.o(5247);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            int bs = ((((ix + e.a.a.b.b.a.bs(2, this.wem)) + e.a.a.b.b.a.o(3, this.wen)) + e.a.a.b.b.a.bs(4, this.Timestamp)) + e.a.a.b.b.a.o(5, this.xlQ)) + e.a.a.b.b.a.bs(6, this.xmV);
            AppMethodBeat.o(5247);
            return bs;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(5247);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            cpn cpn = (cpn) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList Vh = aVar3.Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) Vh.get(intValue);
                        hl hlVar = new hl();
                        e.a.a.a.a aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = hlVar.populateBuilderWithField(aVar4, hlVar, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        cpn.BaseRequest = hlVar;
                    }
                    AppMethodBeat.o(5247);
                    return 0;
                case 2:
                    cpn.wem = aVar3.BTU.vd();
                    AppMethodBeat.o(5247);
                    return 0;
                case 3:
                    cpn.wen = aVar3.BTU.ve();
                    AppMethodBeat.o(5247);
                    return 0;
                case 4:
                    cpn.Timestamp = aVar3.BTU.vd();
                    AppMethodBeat.o(5247);
                    return 0;
                case 5:
                    cpn.xlQ = aVar3.BTU.ve();
                    AppMethodBeat.o(5247);
                    return 0;
                case 6:
                    cpn.xmV = aVar3.BTU.vd();
                    AppMethodBeat.o(5247);
                    return 0;
                default:
                    AppMethodBeat.o(5247);
                    return -1;
            }
        } else {
            AppMethodBeat.o(5247);
            return -1;
        }
    }
}
