package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import e.a.a.b;

public final class cyl extends a {
    public int score;
    public String title;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(28774);
        b bVar;
        int f;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            if (this.title == null) {
                bVar = new b("Not all required fields were included: title");
                AppMethodBeat.o(28774);
                throw bVar;
            }
            if (this.title != null) {
                aVar.e(1, this.title);
            }
            aVar.iz(2, this.score);
            AppMethodBeat.o(28774);
            return 0;
        } else if (i == 1) {
            if (this.title != null) {
                f = e.a.a.b.b.a.f(1, this.title) + 0;
            } else {
                f = 0;
            }
            int bs = f + e.a.a.b.b.a.bs(2, this.score);
            AppMethodBeat.o(28774);
            return bs;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (f = a.getNextFieldNumber(aVar2); f > 0; f = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, f)) {
                    aVar2.ems();
                }
            }
            if (this.title == null) {
                bVar = new b("Not all required fields were included: title");
                AppMethodBeat.o(28774);
                throw bVar;
            }
            AppMethodBeat.o(28774);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            cyl cyl = (cyl) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    cyl.title = aVar3.BTU.readString();
                    AppMethodBeat.o(28774);
                    return 0;
                case 2:
                    cyl.score = aVar3.BTU.vd();
                    AppMethodBeat.o(28774);
                    return 0;
                default:
                    AppMethodBeat.o(28774);
                    return -1;
            }
        } else {
            AppMethodBeat.o(28774);
            return -1;
        }
    }
}
