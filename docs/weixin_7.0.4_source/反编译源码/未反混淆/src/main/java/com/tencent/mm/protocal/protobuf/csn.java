package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import com.tencent.mm.bt.b;

public final class csn extends a {
    public b xpO;
    public b xpP;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(57004);
        int b;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            if (this.xpO != null) {
                aVar.c(1, this.xpO);
            }
            if (this.xpP != null) {
                aVar.c(2, this.xpP);
            }
            AppMethodBeat.o(57004);
            return 0;
        } else if (i == 1) {
            if (this.xpO != null) {
                b = e.a.a.b.b.a.b(1, this.xpO) + 0;
            } else {
                b = 0;
            }
            if (this.xpP != null) {
                b += e.a.a.b.b.a.b(2, this.xpP);
            }
            AppMethodBeat.o(57004);
            return b;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (b = a.getNextFieldNumber(aVar2); b > 0; b = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, b)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(57004);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            csn csn = (csn) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    csn.xpO = aVar3.BTU.emu();
                    AppMethodBeat.o(57004);
                    return 0;
                case 2:
                    csn.xpP = aVar3.BTU.emu();
                    AppMethodBeat.o(57004);
                    return 0;
                default:
                    AppMethodBeat.o(57004);
                    return -1;
            }
        } else {
            AppMethodBeat.o(57004);
            return -1;
        }
    }
}
