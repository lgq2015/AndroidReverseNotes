package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;

public final class cwf extends a {
    public int Scene;
    public int vMG;
    public int wDA;
    public String wDB;
    public int wDz;
    public int wzF;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(96320);
        int bs;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            aVar.iz(1, this.wzF);
            aVar.iz(2, this.vMG);
            aVar.iz(3, this.Scene);
            if (this.wDB != null) {
                aVar.e(4, this.wDB);
            }
            aVar.iz(5, this.wDA);
            aVar.iz(6, this.wDz);
            AppMethodBeat.o(96320);
            return 0;
        } else if (i == 1) {
            bs = ((e.a.a.b.b.a.bs(1, this.wzF) + 0) + e.a.a.b.b.a.bs(2, this.vMG)) + e.a.a.b.b.a.bs(3, this.Scene);
            if (this.wDB != null) {
                bs += e.a.a.b.b.a.f(4, this.wDB);
            }
            bs = (bs + e.a.a.b.b.a.bs(5, this.wDA)) + e.a.a.b.b.a.bs(6, this.wDz);
            AppMethodBeat.o(96320);
            return bs;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (bs = a.getNextFieldNumber(aVar2); bs > 0; bs = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, bs)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(96320);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            cwf cwf = (cwf) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    cwf.wzF = aVar3.BTU.vd();
                    AppMethodBeat.o(96320);
                    return 0;
                case 2:
                    cwf.vMG = aVar3.BTU.vd();
                    AppMethodBeat.o(96320);
                    return 0;
                case 3:
                    cwf.Scene = aVar3.BTU.vd();
                    AppMethodBeat.o(96320);
                    return 0;
                case 4:
                    cwf.wDB = aVar3.BTU.readString();
                    AppMethodBeat.o(96320);
                    return 0;
                case 5:
                    cwf.wDA = aVar3.BTU.vd();
                    AppMethodBeat.o(96320);
                    return 0;
                case 6:
                    cwf.wDz = aVar3.BTU.vd();
                    AppMethodBeat.o(96320);
                    return 0;
                default:
                    AppMethodBeat.o(96320);
                    return -1;
            }
        } else {
            AppMethodBeat.o(96320);
            return -1;
        }
    }
}
