package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.c.a;
import java.util.LinkedList;

public final class bip extends bsr {
    public String wMa;
    public int wat;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(56878);
        int ix;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseRequest != null) {
                aVar.iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.iz(2, this.wat);
            if (this.wMa != null) {
                aVar.e(3, this.wMa);
            }
            AppMethodBeat.o(56878);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            ix += e.a.a.b.b.a.bs(2, this.wat);
            if (this.wMa != null) {
                ix += e.a.a.b.b.a.f(3, this.wMa);
            }
            AppMethodBeat.o(56878);
            return ix;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(56878);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            bip bip = (bip) objArr[1];
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
                        bip.BaseRequest = hlVar;
                    }
                    AppMethodBeat.o(56878);
                    return 0;
                case 2:
                    bip.wat = aVar3.BTU.vd();
                    AppMethodBeat.o(56878);
                    return 0;
                case 3:
                    bip.wMa = aVar3.BTU.readString();
                    AppMethodBeat.o(56878);
                    return 0;
                default:
                    AppMethodBeat.o(56878);
                    return -1;
            }
        } else {
            AppMethodBeat.o(56878);
            return -1;
        }
    }
}
