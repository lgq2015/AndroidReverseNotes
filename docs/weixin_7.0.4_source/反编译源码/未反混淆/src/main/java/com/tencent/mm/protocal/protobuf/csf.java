package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;

public final class csf extends a {
    public String title;
    public String xhW;
    public String xpB;
    public String xpC;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(56994);
        int f;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            if (this.title != null) {
                aVar.e(1, this.title);
            }
            if (this.xpB != null) {
                aVar.e(2, this.xpB);
            }
            if (this.xhW != null) {
                aVar.e(3, this.xhW);
            }
            if (this.xpC != null) {
                aVar.e(4, this.xpC);
            }
            AppMethodBeat.o(56994);
            return 0;
        } else if (i == 1) {
            if (this.title != null) {
                f = e.a.a.b.b.a.f(1, this.title) + 0;
            } else {
                f = 0;
            }
            if (this.xpB != null) {
                f += e.a.a.b.b.a.f(2, this.xpB);
            }
            if (this.xhW != null) {
                f += e.a.a.b.b.a.f(3, this.xhW);
            }
            if (this.xpC != null) {
                f += e.a.a.b.b.a.f(4, this.xpC);
            }
            AppMethodBeat.o(56994);
            return f;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (f = a.getNextFieldNumber(aVar2); f > 0; f = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, f)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(56994);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            csf csf = (csf) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    csf.title = aVar3.BTU.readString();
                    AppMethodBeat.o(56994);
                    return 0;
                case 2:
                    csf.xpB = aVar3.BTU.readString();
                    AppMethodBeat.o(56994);
                    return 0;
                case 3:
                    csf.xhW = aVar3.BTU.readString();
                    AppMethodBeat.o(56994);
                    return 0;
                case 4:
                    csf.xpC = aVar3.BTU.readString();
                    AppMethodBeat.o(56994);
                    return 0;
                default:
                    AppMethodBeat.o(56994);
                    return -1;
            }
        } else {
            AppMethodBeat.o(56994);
            return -1;
        }
    }
}
