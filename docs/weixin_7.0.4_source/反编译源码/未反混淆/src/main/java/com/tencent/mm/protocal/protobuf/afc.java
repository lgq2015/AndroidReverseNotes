package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class afc extends btd {
    public int kCl;
    public String kCm;
    public LinkedList<hd> wmB = new LinkedList();
    public LinkedList<hd> wmC = new LinkedList();

    public afc() {
        AppMethodBeat.i(48850);
        AppMethodBeat.o(48850);
    }

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(48851);
        b bVar;
        int ix;
        byte[] bArr;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(48851);
                throw bVar;
            }
            if (this.BaseResponse != null) {
                aVar.iy(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.iz(2, this.kCl);
            if (this.kCm != null) {
                aVar.e(3, this.kCm);
            }
            aVar.e(4, 8, this.wmB);
            aVar.e(5, 8, this.wmC);
            AppMethodBeat.o(48851);
            return 0;
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            ix += e.a.a.b.b.a.bs(2, this.kCl);
            if (this.kCm != null) {
                ix += e.a.a.b.b.a.f(3, this.kCm);
            }
            int c = (ix + e.a.a.a.c(4, 8, this.wmB)) + e.a.a.a.c(5, 8, this.wmC);
            AppMethodBeat.o(48851);
            return c;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.wmB.clear();
            this.wmC.clear();
            e.a.a.a.a aVar2 = new e.a.a.a.a(bArr, unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(48851);
                throw bVar;
            }
            AppMethodBeat.o(48851);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            afc afc = (afc) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            e.a.a.a.a aVar4;
            boolean z;
            hd hdVar;
            switch (intValue) {
                case 1:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        BaseResponse baseResponse = new BaseResponse();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = baseResponse.populateBuilderWithField(aVar4, baseResponse, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        afc.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.o(48851);
                    return 0;
                case 2:
                    afc.kCl = aVar3.BTU.vd();
                    AppMethodBeat.o(48851);
                    return 0;
                case 3:
                    afc.kCm = aVar3.BTU.readString();
                    AppMethodBeat.o(48851);
                    return 0;
                case 4:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        hdVar = new hd();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = hdVar.populateBuilderWithField(aVar4, hdVar, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        afc.wmB.add(hdVar);
                    }
                    AppMethodBeat.o(48851);
                    return 0;
                case 5:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        hdVar = new hd();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = hdVar.populateBuilderWithField(aVar4, hdVar, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        afc.wmC.add(hdVar);
                    }
                    AppMethodBeat.o(48851);
                    return 0;
                default:
                    AppMethodBeat.o(48851);
                    return -1;
            }
        } else {
            AppMethodBeat.o(48851);
            return -1;
        }
    }
}
