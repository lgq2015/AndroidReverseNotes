package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;

public final class aru extends a {
    public int Ret;
    public String jBB;
    public String jCH;
    public String vLf;
    public String wlF;
    public String wvL;
    public String wvM;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(73720);
        int f;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            if (this.vLf != null) {
                aVar.e(1, this.vLf);
            }
            if (this.jBB != null) {
                aVar.e(2, this.jBB);
            }
            if (this.wvL != null) {
                aVar.e(3, this.wvL);
            }
            if (this.wvM != null) {
                aVar.e(4, this.wvM);
            }
            aVar.iz(5, this.Ret);
            if (this.jCH != null) {
                aVar.e(6, this.jCH);
            }
            if (this.wlF != null) {
                aVar.e(7, this.wlF);
            }
            AppMethodBeat.o(73720);
            return 0;
        } else if (i == 1) {
            if (this.vLf != null) {
                f = e.a.a.b.b.a.f(1, this.vLf) + 0;
            } else {
                f = 0;
            }
            if (this.jBB != null) {
                f += e.a.a.b.b.a.f(2, this.jBB);
            }
            if (this.wvL != null) {
                f += e.a.a.b.b.a.f(3, this.wvL);
            }
            if (this.wvM != null) {
                f += e.a.a.b.b.a.f(4, this.wvM);
            }
            f += e.a.a.b.b.a.bs(5, this.Ret);
            if (this.jCH != null) {
                f += e.a.a.b.b.a.f(6, this.jCH);
            }
            if (this.wlF != null) {
                f += e.a.a.b.b.a.f(7, this.wlF);
            }
            AppMethodBeat.o(73720);
            return f;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (f = a.getNextFieldNumber(aVar2); f > 0; f = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, f)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(73720);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            aru aru = (aru) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    aru.vLf = aVar3.BTU.readString();
                    AppMethodBeat.o(73720);
                    return 0;
                case 2:
                    aru.jBB = aVar3.BTU.readString();
                    AppMethodBeat.o(73720);
                    return 0;
                case 3:
                    aru.wvL = aVar3.BTU.readString();
                    AppMethodBeat.o(73720);
                    return 0;
                case 4:
                    aru.wvM = aVar3.BTU.readString();
                    AppMethodBeat.o(73720);
                    return 0;
                case 5:
                    aru.Ret = aVar3.BTU.vd();
                    AppMethodBeat.o(73720);
                    return 0;
                case 6:
                    aru.jCH = aVar3.BTU.readString();
                    AppMethodBeat.o(73720);
                    return 0;
                case 7:
                    aru.wlF = aVar3.BTU.readString();
                    AppMethodBeat.o(73720);
                    return 0;
                default:
                    AppMethodBeat.o(73720);
                    return -1;
            }
        } else {
            AppMethodBeat.o(73720);
            return -1;
        }
    }
}
