package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;

public final class zl extends a {
    public int weH;
    public String weI;
    public String weJ;
    public String weK;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(28396);
        int bs;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            aVar.iz(1, this.weH);
            if (this.weI != null) {
                aVar.e(2, this.weI);
            }
            if (this.weK != null) {
                aVar.e(3, this.weK);
            }
            if (this.weJ != null) {
                aVar.e(4, this.weJ);
            }
            AppMethodBeat.o(28396);
            return 0;
        } else if (i == 1) {
            bs = e.a.a.b.b.a.bs(1, this.weH) + 0;
            if (this.weI != null) {
                bs += e.a.a.b.b.a.f(2, this.weI);
            }
            if (this.weK != null) {
                bs += e.a.a.b.b.a.f(3, this.weK);
            }
            if (this.weJ != null) {
                bs += e.a.a.b.b.a.f(4, this.weJ);
            }
            AppMethodBeat.o(28396);
            return bs;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (bs = a.getNextFieldNumber(aVar2); bs > 0; bs = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, bs)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(28396);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            zl zlVar = (zl) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    zlVar.weH = aVar3.BTU.vd();
                    AppMethodBeat.o(28396);
                    return 0;
                case 2:
                    zlVar.weI = aVar3.BTU.readString();
                    AppMethodBeat.o(28396);
                    return 0;
                case 3:
                    zlVar.weK = aVar3.BTU.readString();
                    AppMethodBeat.o(28396);
                    return 0;
                case 4:
                    zlVar.weJ = aVar3.BTU.readString();
                    AppMethodBeat.o(28396);
                    return 0;
                default:
                    AppMethodBeat.o(28396);
                    return -1;
            }
        } else {
            AppMethodBeat.o(28396);
            return -1;
        }
    }
}
