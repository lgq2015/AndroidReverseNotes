package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;

public final class mc extends a {
    public String Url;
    public int jCt;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(124291);
        int bs;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            aVar.iz(1, this.jCt);
            if (this.Url != null) {
                aVar.e(2, this.Url);
            }
            AppMethodBeat.o(124291);
            return 0;
        } else if (i == 1) {
            bs = e.a.a.b.b.a.bs(1, this.jCt) + 0;
            if (this.Url != null) {
                bs += e.a.a.b.b.a.f(2, this.Url);
            }
            AppMethodBeat.o(124291);
            return bs;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (bs = a.getNextFieldNumber(aVar2); bs > 0; bs = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, bs)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(124291);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            mc mcVar = (mc) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    mcVar.jCt = aVar3.BTU.vd();
                    AppMethodBeat.o(124291);
                    return 0;
                case 2:
                    mcVar.Url = aVar3.BTU.readString();
                    AppMethodBeat.o(124291);
                    return 0;
                default:
                    AppMethodBeat.o(124291);
                    return -1;
            }
        } else {
            AppMethodBeat.o(124291);
            return -1;
        }
    }
}
