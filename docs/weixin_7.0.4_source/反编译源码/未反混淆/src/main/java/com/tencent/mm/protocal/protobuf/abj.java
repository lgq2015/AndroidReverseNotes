package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import java.util.LinkedList;

public final class abj extends a {
    public int nbk;
    public String wdK;
    public abd wiA;
    public LinkedList<abd> wiz = new LinkedList();

    public abj() {
        AppMethodBeat.i(51409);
        AppMethodBeat.o(51409);
    }

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(51410);
        int bs;
        byte[] bArr;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            aVar.iz(1, this.nbk);
            if (this.wdK != null) {
                aVar.e(2, this.wdK);
            }
            aVar.e(3, 8, this.wiz);
            if (this.wiA != null) {
                aVar.iy(4, this.wiA.computeSize());
                this.wiA.writeFields(aVar);
            }
            AppMethodBeat.o(51410);
            return 0;
        } else if (i == 1) {
            bs = e.a.a.b.b.a.bs(1, this.nbk) + 0;
            if (this.wdK != null) {
                bs += e.a.a.b.b.a.f(2, this.wdK);
            }
            bs += e.a.a.a.c(3, 8, this.wiz);
            if (this.wiA != null) {
                bs += e.a.a.a.ix(4, this.wiA.computeSize());
            }
            AppMethodBeat.o(51410);
            return bs;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.wiz.clear();
            e.a.a.a.a aVar2 = new e.a.a.a.a(bArr, unknownTagHandler);
            for (bs = a.getNextFieldNumber(aVar2); bs > 0; bs = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, bs)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(51410);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            abj abj = (abj) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            abd abd;
            e.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    abj.nbk = aVar3.BTU.vd();
                    AppMethodBeat.o(51410);
                    return 0;
                case 2:
                    abj.wdK = aVar3.BTU.readString();
                    AppMethodBeat.o(51410);
                    return 0;
                case 3:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        abd = new abd();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = abd.populateBuilderWithField(aVar4, abd, a.getNextFieldNumber(aVar4))) {
                        }
                        abj.wiz.add(abd);
                    }
                    AppMethodBeat.o(51410);
                    return 0;
                case 4:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        abd = new abd();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = abd.populateBuilderWithField(aVar4, abd, a.getNextFieldNumber(aVar4))) {
                        }
                        abj.wiA = abd;
                    }
                    AppMethodBeat.o(51410);
                    return 0;
                default:
                    AppMethodBeat.o(51410);
                    return -1;
            }
        } else {
            AppMethodBeat.o(51410);
            return -1;
        }
    }
}
