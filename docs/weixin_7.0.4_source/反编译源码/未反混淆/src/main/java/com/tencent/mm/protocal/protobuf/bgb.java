package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import java.util.LinkedList;

public final class bgb extends a {
    public LinkedList<bge> vEN = new LinkedList();
    public int wKf;

    public bgb() {
        AppMethodBeat.i(80127);
        AppMethodBeat.o(80127);
    }

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(80128);
        int c;
        byte[] bArr;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            aVar.e(1, 8, this.vEN);
            aVar.iz(2, this.wKf);
            AppMethodBeat.o(80128);
            return 0;
        } else if (i == 1) {
            c = (e.a.a.a.c(1, 8, this.vEN) + 0) + e.a.a.b.b.a.bs(2, this.wKf);
            AppMethodBeat.o(80128);
            return c;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.vEN.clear();
            e.a.a.a.a aVar2 = new e.a.a.a.a(bArr, unknownTagHandler);
            for (c = a.getNextFieldNumber(aVar2); c > 0; c = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, c)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(80128);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            bgb bgb = (bgb) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList Vh = aVar3.Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        bge bge = new bge();
                        e.a.a.a.a aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = bge.populateBuilderWithField(aVar4, bge, a.getNextFieldNumber(aVar4))) {
                        }
                        bgb.vEN.add(bge);
                    }
                    AppMethodBeat.o(80128);
                    return 0;
                case 2:
                    bgb.wKf = aVar3.BTU.vd();
                    AppMethodBeat.o(80128);
                    return 0;
                default:
                    AppMethodBeat.o(80128);
                    return -1;
            }
        } else {
            AppMethodBeat.o(80128);
            return -1;
        }
    }
}
