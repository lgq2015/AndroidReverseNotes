package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import e.a.a.b;
import java.util.LinkedList;

public final class vv extends a {
    public int jBv;
    public bts wcB;
    public LinkedList<Integer> wcH = new LinkedList();

    public vv() {
        AppMethodBeat.i(60032);
        AppMethodBeat.o(60032);
    }

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(60033);
        b bVar;
        int ix;
        byte[] bArr;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            if (this.wcB == null) {
                bVar = new b("Not all required fields were included: UserName");
                AppMethodBeat.o(60033);
                throw bVar;
            }
            if (this.wcB != null) {
                aVar.iy(1, this.wcB.computeSize());
                this.wcB.writeFields(aVar);
            }
            aVar.iz(2, this.jBv);
            aVar.f(3, 2, this.wcH);
            AppMethodBeat.o(60033);
            return 0;
        } else if (i == 1) {
            if (this.wcB != null) {
                ix = e.a.a.a.ix(1, this.wcB.computeSize()) + 0;
            } else {
                ix = 0;
            }
            int bs = (ix + e.a.a.b.b.a.bs(2, this.jBv)) + e.a.a.a.d(3, 2, this.wcH);
            AppMethodBeat.o(60033);
            return bs;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.wcH.clear();
            e.a.a.a.a aVar2 = new e.a.a.a.a(bArr, unknownTagHandler);
            for (ix = a.getNextFieldNumber(aVar2); ix > 0; ix = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            if (this.wcB == null) {
                bVar = new b("Not all required fields were included: UserName");
                AppMethodBeat.o(60033);
                throw bVar;
            }
            AppMethodBeat.o(60033);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            vv vvVar = (vv) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList Vh = aVar3.Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        bts bts = new bts();
                        e.a.a.a.a aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = bts.populateBuilderWithField(aVar4, bts, a.getNextFieldNumber(aVar4))) {
                        }
                        vvVar.wcB = bts;
                    }
                    AppMethodBeat.o(60033);
                    return 0;
                case 2:
                    vvVar.jBv = aVar3.BTU.vd();
                    AppMethodBeat.o(60033);
                    return 0;
                case 3:
                    vvVar.wcH = new e.a.a.a.a(aVar3.BTU.emu().wR, unknownTagHandler).BTU.emt();
                    AppMethodBeat.o(60033);
                    return 0;
                default:
                    AppMethodBeat.o(60033);
                    return -1;
            }
        } else {
            AppMethodBeat.o(60033);
            return -1;
        }
    }
}
