package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import com.tencent.mm.bt.b;

public final class ctj extends a {
    public b jBi;
    public long xqp;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(28717);
        int o;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            aVar.ai(1, this.xqp);
            if (this.jBi != null) {
                aVar.c(2, this.jBi);
            }
            AppMethodBeat.o(28717);
            return 0;
        } else if (i == 1) {
            o = e.a.a.b.b.a.o(1, this.xqp) + 0;
            if (this.jBi != null) {
                o += e.a.a.b.b.a.b(2, this.jBi);
            }
            AppMethodBeat.o(28717);
            return o;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (o = a.getNextFieldNumber(aVar2); o > 0; o = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, o)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(28717);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            ctj ctj = (ctj) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    ctj.xqp = aVar3.BTU.ve();
                    AppMethodBeat.o(28717);
                    return 0;
                case 2:
                    ctj.jBi = aVar3.BTU.emu();
                    AppMethodBeat.o(28717);
                    return 0;
                default:
                    AppMethodBeat.o(28717);
                    return -1;
            }
        } else {
            AppMethodBeat.o(28717);
            return -1;
        }
    }
}
