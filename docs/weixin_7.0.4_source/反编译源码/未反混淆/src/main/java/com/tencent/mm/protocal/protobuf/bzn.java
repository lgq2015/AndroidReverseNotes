package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.c.a;
import java.util.LinkedList;

public final class bzn extends bsr {
    public String csB;
    public LinkedList<Integer> wXf = new LinkedList();
    public int wYz;

    public bzn() {
        AppMethodBeat.i(96290);
        AppMethodBeat.o(96290);
    }

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(96291);
        int ix;
        byte[] bArr;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseRequest != null) {
                aVar.iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            if (this.csB != null) {
                aVar.e(2, this.csB);
            }
            aVar.e(3, 2, this.wXf);
            aVar.iz(4, this.wYz);
            AppMethodBeat.o(96291);
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
            int c = (ix + e.a.a.a.c(3, 2, this.wXf)) + e.a.a.b.b.a.bs(4, this.wYz);
            AppMethodBeat.o(96291);
            return c;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.wXf.clear();
            e.a.a.a.a aVar2 = new e.a.a.a.a(bArr, unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(96291);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            bzn bzn = (bzn) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList Vh = aVar3.Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        hl hlVar = new hl();
                        e.a.a.a.a aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = hlVar.populateBuilderWithField(aVar4, hlVar, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        bzn.BaseRequest = hlVar;
                    }
                    AppMethodBeat.o(96291);
                    return 0;
                case 2:
                    bzn.csB = aVar3.BTU.readString();
                    AppMethodBeat.o(96291);
                    return 0;
                case 3:
                    bzn.wXf.add(Integer.valueOf(aVar3.BTU.vd()));
                    AppMethodBeat.o(96291);
                    return 0;
                case 4:
                    bzn.wYz = aVar3.BTU.vd();
                    AppMethodBeat.o(96291);
                    return 0;
                default:
                    AppMethodBeat.o(96291);
                    return -1;
            }
        } else {
            AppMethodBeat.o(96291);
            return -1;
        }
    }
}
