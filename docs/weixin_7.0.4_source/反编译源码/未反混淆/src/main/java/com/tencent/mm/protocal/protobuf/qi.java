package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.c.a;
import java.util.LinkedList;

public final class qi extends bsr {
    public String nuL;
    public String pbn;
    public String vXt;
    public String vXu;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(48814);
        int ix;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseRequest != null) {
                aVar.iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            if (this.vXt != null) {
                aVar.e(2, this.vXt);
            }
            if (this.vXu != null) {
                aVar.e(3, this.vXu);
            }
            if (this.nuL != null) {
                aVar.e(4, this.nuL);
            }
            if (this.pbn != null) {
                aVar.e(5, this.pbn);
            }
            AppMethodBeat.o(48814);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.vXt != null) {
                ix += e.a.a.b.b.a.f(2, this.vXt);
            }
            if (this.vXu != null) {
                ix += e.a.a.b.b.a.f(3, this.vXu);
            }
            if (this.nuL != null) {
                ix += e.a.a.b.b.a.f(4, this.nuL);
            }
            if (this.pbn != null) {
                ix += e.a.a.b.b.a.f(5, this.pbn);
            }
            AppMethodBeat.o(48814);
            return ix;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(48814);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            qi qiVar = (qi) objArr[1];
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
                        qiVar.BaseRequest = hlVar;
                    }
                    AppMethodBeat.o(48814);
                    return 0;
                case 2:
                    qiVar.vXt = aVar3.BTU.readString();
                    AppMethodBeat.o(48814);
                    return 0;
                case 3:
                    qiVar.vXu = aVar3.BTU.readString();
                    AppMethodBeat.o(48814);
                    return 0;
                case 4:
                    qiVar.nuL = aVar3.BTU.readString();
                    AppMethodBeat.o(48814);
                    return 0;
                case 5:
                    qiVar.pbn = aVar3.BTU.readString();
                    AppMethodBeat.o(48814);
                    return 0;
                default:
                    AppMethodBeat.o(48814);
                    return -1;
            }
        } else {
            AppMethodBeat.o(48814);
            return -1;
        }
    }
}
