package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import com.tencent.mm.bt.b;

public final class ata extends a {
    public long cSh;
    public b wwO;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(70474);
        int o;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            aVar.ai(1, this.cSh);
            if (this.wwO != null) {
                aVar.c(2, this.wwO);
            }
            AppMethodBeat.o(70474);
            return 0;
        } else if (i == 1) {
            o = e.a.a.b.b.a.o(1, this.cSh) + 0;
            if (this.wwO != null) {
                o += e.a.a.b.b.a.b(2, this.wwO);
            }
            AppMethodBeat.o(70474);
            return o;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (o = a.getNextFieldNumber(aVar2); o > 0; o = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, o)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(70474);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            ata ata = (ata) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    ata.cSh = aVar3.BTU.ve();
                    AppMethodBeat.o(70474);
                    return 0;
                case 2:
                    ata.wwO = aVar3.BTU.emu();
                    AppMethodBeat.o(70474);
                    return 0;
                default:
                    AppMethodBeat.o(70474);
                    return -1;
            }
        } else {
            AppMethodBeat.o(70474);
            return -1;
        }
    }
}
