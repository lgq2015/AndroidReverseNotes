package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;

public final class bzp extends a {
    public String kCs;
    public String nZb;
    public String nZc;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(56973);
        int f;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            if (this.nZb != null) {
                aVar.e(1, this.nZb);
            }
            if (this.nZc != null) {
                aVar.e(2, this.nZc);
            }
            if (this.kCs != null) {
                aVar.e(3, this.kCs);
            }
            AppMethodBeat.o(56973);
            return 0;
        } else if (i == 1) {
            if (this.nZb != null) {
                f = e.a.a.b.b.a.f(1, this.nZb) + 0;
            } else {
                f = 0;
            }
            if (this.nZc != null) {
                f += e.a.a.b.b.a.f(2, this.nZc);
            }
            if (this.kCs != null) {
                f += e.a.a.b.b.a.f(3, this.kCs);
            }
            AppMethodBeat.o(56973);
            return f;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (f = a.getNextFieldNumber(aVar2); f > 0; f = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, f)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(56973);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            bzp bzp = (bzp) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    bzp.nZb = aVar3.BTU.readString();
                    AppMethodBeat.o(56973);
                    return 0;
                case 2:
                    bzp.nZc = aVar3.BTU.readString();
                    AppMethodBeat.o(56973);
                    return 0;
                case 3:
                    bzp.kCs = aVar3.BTU.readString();
                    AppMethodBeat.o(56973);
                    return 0;
                default:
                    AppMethodBeat.o(56973);
                    return -1;
            }
        } else {
            AppMethodBeat.o(56973);
            return -1;
        }
    }
}
