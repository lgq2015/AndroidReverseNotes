package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;

public final class axd extends a {
    public int pXC;
    public String pXM;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(60040);
        int bs;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            aVar.iz(1, this.pXC);
            if (this.pXM != null) {
                aVar.e(2, this.pXM);
            }
            AppMethodBeat.o(60040);
            return 0;
        } else if (i == 1) {
            bs = e.a.a.b.b.a.bs(1, this.pXC) + 0;
            if (this.pXM != null) {
                bs += e.a.a.b.b.a.f(2, this.pXM);
            }
            AppMethodBeat.o(60040);
            return bs;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (bs = a.getNextFieldNumber(aVar2); bs > 0; bs = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, bs)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(60040);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            axd axd = (axd) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    axd.pXC = aVar3.BTU.vd();
                    AppMethodBeat.o(60040);
                    return 0;
                case 2:
                    axd.pXM = aVar3.BTU.readString();
                    AppMethodBeat.o(60040);
                    return 0;
                default:
                    AppMethodBeat.o(60040);
                    return -1;
            }
        } else {
            AppMethodBeat.o(60040);
            return -1;
        }
    }
}
