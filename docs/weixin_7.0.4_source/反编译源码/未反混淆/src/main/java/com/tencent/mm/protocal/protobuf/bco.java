package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.c.a;
import java.util.LinkedList;

public final class bco extends bsr {
    public int cME;
    public String csB;
    public String wGP;
    public int wGQ;
    public int wGR;
    public int wGS;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(127727);
        int ix;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseRequest != null) {
                aVar.iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            if (this.csB != null) {
                aVar.e(2, this.csB);
            }
            if (this.wGP != null) {
                aVar.e(3, this.wGP);
            }
            aVar.iz(4, this.wGQ);
            aVar.iz(5, this.wGR);
            aVar.iz(6, this.wGS);
            aVar.iz(7, this.cME);
            AppMethodBeat.o(127727);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.csB != null) {
                ix += e.a.a.b.b.a.f(2, this.csB);
            }
            if (this.wGP != null) {
                ix += e.a.a.b.b.a.f(3, this.wGP);
            }
            int bs = (((ix + e.a.a.b.b.a.bs(4, this.wGQ)) + e.a.a.b.b.a.bs(5, this.wGR)) + e.a.a.b.b.a.bs(6, this.wGS)) + e.a.a.b.b.a.bs(7, this.cME);
            AppMethodBeat.o(127727);
            return bs;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(127727);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            bco bco = (bco) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList Vh = aVar3.Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) Vh.get(intValue);
                        hl hlVar = new hl();
                        e.a.a.a.a aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = hlVar.populateBuilderWithField(aVar4, hlVar, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        bco.BaseRequest = hlVar;
                    }
                    AppMethodBeat.o(127727);
                    return 0;
                case 2:
                    bco.csB = aVar3.BTU.readString();
                    AppMethodBeat.o(127727);
                    return 0;
                case 3:
                    bco.wGP = aVar3.BTU.readString();
                    AppMethodBeat.o(127727);
                    return 0;
                case 4:
                    bco.wGQ = aVar3.BTU.vd();
                    AppMethodBeat.o(127727);
                    return 0;
                case 5:
                    bco.wGR = aVar3.BTU.vd();
                    AppMethodBeat.o(127727);
                    return 0;
                case 6:
                    bco.wGS = aVar3.BTU.vd();
                    AppMethodBeat.o(127727);
                    return 0;
                case 7:
                    bco.cME = aVar3.BTU.vd();
                    AppMethodBeat.o(127727);
                    return 0;
                default:
                    AppMethodBeat.o(127727);
                    return -1;
            }
        } else {
            AppMethodBeat.o(127727);
            return -1;
        }
    }
}
