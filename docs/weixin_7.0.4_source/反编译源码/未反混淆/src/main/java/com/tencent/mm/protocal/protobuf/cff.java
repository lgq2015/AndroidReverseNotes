package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import java.util.LinkedList;

public final class cff extends a {
    public int xeK;
    public int xeL;
    public LinkedList<bei> xeM = new LinkedList();

    public cff() {
        AppMethodBeat.i(72862);
        AppMethodBeat.o(72862);
    }

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(72863);
        int bs;
        byte[] bArr;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            aVar.iz(1, this.xeK);
            aVar.iz(2, this.xeL);
            aVar.e(3, 8, this.xeM);
            AppMethodBeat.o(72863);
            return 0;
        } else if (i == 1) {
            bs = ((e.a.a.b.b.a.bs(1, this.xeK) + 0) + e.a.a.b.b.a.bs(2, this.xeL)) + e.a.a.a.c(3, 8, this.xeM);
            AppMethodBeat.o(72863);
            return bs;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.xeM.clear();
            e.a.a.a.a aVar2 = new e.a.a.a.a(bArr, unknownTagHandler);
            for (bs = a.getNextFieldNumber(aVar2); bs > 0; bs = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, bs)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(72863);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            cff cff = (cff) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    cff.xeK = aVar3.BTU.vd();
                    AppMethodBeat.o(72863);
                    return 0;
                case 2:
                    cff.xeL = aVar3.BTU.vd();
                    AppMethodBeat.o(72863);
                    return 0;
                case 3:
                    LinkedList Vh = aVar3.Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        bei bei = new bei();
                        e.a.a.a.a aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = bei.populateBuilderWithField(aVar4, bei, a.getNextFieldNumber(aVar4))) {
                        }
                        cff.xeM.add(bei);
                    }
                    AppMethodBeat.o(72863);
                    return 0;
                default:
                    AppMethodBeat.o(72863);
                    return -1;
            }
        } else {
            AppMethodBeat.o(72863);
            return -1;
        }
    }
}
