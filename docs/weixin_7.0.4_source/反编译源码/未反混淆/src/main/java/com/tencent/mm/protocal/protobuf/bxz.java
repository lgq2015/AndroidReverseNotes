package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.c.a;
import java.util.LinkedList;

public final class bxz extends bsr {
    public int nbk;
    public bre wXC;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(118285);
        int ix;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseRequest != null) {
                aVar.iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.iz(2, this.nbk);
            if (this.wXC != null) {
                aVar.iy(3, this.wXC.computeSize());
                this.wXC.writeFields(aVar);
            }
            AppMethodBeat.o(118285);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            ix += e.a.a.b.b.a.bs(2, this.nbk);
            if (this.wXC != null) {
                ix += e.a.a.a.ix(3, this.wXC.computeSize());
            }
            AppMethodBeat.o(118285);
            return ix;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(118285);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            bxz bxz = (bxz) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            byte[] bArr;
            e.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        hl hlVar = new hl();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = hlVar.populateBuilderWithField(aVar4, hlVar, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        bxz.BaseRequest = hlVar;
                    }
                    AppMethodBeat.o(118285);
                    return 0;
                case 2:
                    bxz.nbk = aVar3.BTU.vd();
                    AppMethodBeat.o(118285);
                    return 0;
                case 3:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        bre bre = new bre();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = bre.populateBuilderWithField(aVar4, bre, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        bxz.wXC = bre;
                    }
                    AppMethodBeat.o(118285);
                    return 0;
                default:
                    AppMethodBeat.o(118285);
                    return -1;
            }
        } else {
            AppMethodBeat.o(118285);
            return -1;
        }
    }
}
