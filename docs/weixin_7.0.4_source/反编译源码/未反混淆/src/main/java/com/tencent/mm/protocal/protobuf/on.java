package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;

public final class on extends a {
    public int vUU;
    public String vUV;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(134423);
        int bs;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            aVar.iz(1, this.vUU);
            if (this.vUV != null) {
                aVar.e(2, this.vUV);
            }
            AppMethodBeat.o(134423);
            return 0;
        } else if (i == 1) {
            bs = e.a.a.b.b.a.bs(1, this.vUU) + 0;
            if (this.vUV != null) {
                bs += e.a.a.b.b.a.f(2, this.vUV);
            }
            AppMethodBeat.o(134423);
            return bs;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (bs = a.getNextFieldNumber(aVar2); bs > 0; bs = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, bs)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(134423);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            on onVar = (on) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    onVar.vUU = aVar3.BTU.vd();
                    AppMethodBeat.o(134423);
                    return 0;
                case 2:
                    onVar.vUV = aVar3.BTU.readString();
                    AppMethodBeat.o(134423);
                    return 0;
                default:
                    AppMethodBeat.o(134423);
                    return -1;
            }
        } else {
            AppMethodBeat.o(134423);
            return -1;
        }
    }
}
