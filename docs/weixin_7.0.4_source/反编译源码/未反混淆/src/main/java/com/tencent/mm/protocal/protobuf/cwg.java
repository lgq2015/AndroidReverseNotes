package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;

public final class cwg extends a {
    public int luT;
    public String luU;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(96321);
        int bs;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            aVar.iz(1, this.luT);
            if (this.luU != null) {
                aVar.e(2, this.luU);
            }
            AppMethodBeat.o(96321);
            return 0;
        } else if (i == 1) {
            bs = e.a.a.b.b.a.bs(1, this.luT) + 0;
            if (this.luU != null) {
                bs += e.a.a.b.b.a.f(2, this.luU);
            }
            AppMethodBeat.o(96321);
            return bs;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (bs = a.getNextFieldNumber(aVar2); bs > 0; bs = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, bs)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(96321);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            cwg cwg = (cwg) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    cwg.luT = aVar3.BTU.vd();
                    AppMethodBeat.o(96321);
                    return 0;
                case 2:
                    cwg.luU = aVar3.BTU.readString();
                    AppMethodBeat.o(96321);
                    return 0;
                default:
                    AppMethodBeat.o(96321);
                    return -1;
            }
        } else {
            AppMethodBeat.o(96321);
            return -1;
        }
    }
}
