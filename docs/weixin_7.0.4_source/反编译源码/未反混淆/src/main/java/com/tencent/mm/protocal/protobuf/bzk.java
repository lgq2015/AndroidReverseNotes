package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;

public final class bzk extends a {
    public String csB;
    public String wYs;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(114987);
        int f;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            if (this.csB != null) {
                aVar.e(1, this.csB);
            }
            if (this.wYs != null) {
                aVar.e(2, this.wYs);
            }
            AppMethodBeat.o(114987);
            return 0;
        } else if (i == 1) {
            if (this.csB != null) {
                f = e.a.a.b.b.a.f(1, this.csB) + 0;
            } else {
                f = 0;
            }
            if (this.wYs != null) {
                f += e.a.a.b.b.a.f(2, this.wYs);
            }
            AppMethodBeat.o(114987);
            return f;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (f = a.getNextFieldNumber(aVar2); f > 0; f = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, f)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(114987);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            bzk bzk = (bzk) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    bzk.csB = aVar3.BTU.readString();
                    AppMethodBeat.o(114987);
                    return 0;
                case 2:
                    bzk.wYs = aVar3.BTU.readString();
                    AppMethodBeat.o(114987);
                    return 0;
                default:
                    AppMethodBeat.o(114987);
                    return -1;
            }
        } else {
            AppMethodBeat.o(114987);
            return -1;
        }
    }
}
