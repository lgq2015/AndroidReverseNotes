package com.tencent.mm.plugin.exdevice.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;

public final class c extends a {
    public String luS;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(19420);
        int f;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            if (this.luS != null) {
                aVar.e(1, this.luS);
            }
            AppMethodBeat.o(19420);
            return 0;
        } else if (i == 1) {
            if (this.luS != null) {
                f = e.a.a.b.b.a.f(1, this.luS) + 0;
            } else {
                f = 0;
            }
            AppMethodBeat.o(19420);
            return f;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (f = a.getNextFieldNumber(aVar2); f > 0; f = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, f)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(19420);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            c cVar = (c) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    cVar.luS = aVar3.BTU.readString();
                    AppMethodBeat.o(19420);
                    return 0;
                default:
                    AppMethodBeat.o(19420);
                    return -1;
            }
        } else {
            AppMethodBeat.o(19420);
            return -1;
        }
    }
}
