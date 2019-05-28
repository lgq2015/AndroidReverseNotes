package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class sc extends btd {
    public int luT;
    public String luU;
    public String token;
    public bjk vYW;
    public chz vZv;
    public String vwr;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(56763);
        b bVar;
        int ix;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(56763);
                throw bVar;
            }
            if (this.BaseResponse != null) {
                aVar.iy(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.iz(2, this.luT);
            if (this.luU != null) {
                aVar.e(3, this.luU);
            }
            if (this.token != null) {
                aVar.e(4, this.token);
            }
            if (this.vYW != null) {
                aVar.iy(5, this.vYW.computeSize());
                this.vYW.writeFields(aVar);
            }
            if (this.vwr != null) {
                aVar.e(6, this.vwr);
            }
            if (this.vZv != null) {
                aVar.iy(7, this.vZv.computeSize());
                this.vZv.writeFields(aVar);
            }
            AppMethodBeat.o(56763);
            return 0;
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            ix += e.a.a.b.b.a.bs(2, this.luT);
            if (this.luU != null) {
                ix += e.a.a.b.b.a.f(3, this.luU);
            }
            if (this.token != null) {
                ix += e.a.a.b.b.a.f(4, this.token);
            }
            if (this.vYW != null) {
                ix += e.a.a.a.ix(5, this.vYW.computeSize());
            }
            if (this.vwr != null) {
                ix += e.a.a.b.b.a.f(6, this.vwr);
            }
            if (this.vZv != null) {
                ix += e.a.a.a.ix(7, this.vZv.computeSize());
            }
            AppMethodBeat.o(56763);
            return ix;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(56763);
                throw bVar;
            }
            AppMethodBeat.o(56763);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            sc scVar = (sc) objArr[1];
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
                        BaseResponse baseResponse = new BaseResponse();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = baseResponse.populateBuilderWithField(aVar4, baseResponse, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        scVar.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.o(56763);
                    return 0;
                case 2:
                    scVar.luT = aVar3.BTU.vd();
                    AppMethodBeat.o(56763);
                    return 0;
                case 3:
                    scVar.luU = aVar3.BTU.readString();
                    AppMethodBeat.o(56763);
                    return 0;
                case 4:
                    scVar.token = aVar3.BTU.readString();
                    AppMethodBeat.o(56763);
                    return 0;
                case 5:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        bjk bjk = new bjk();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = bjk.populateBuilderWithField(aVar4, bjk, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        scVar.vYW = bjk;
                    }
                    AppMethodBeat.o(56763);
                    return 0;
                case 6:
                    scVar.vwr = aVar3.BTU.readString();
                    AppMethodBeat.o(56763);
                    return 0;
                case 7:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        chz chz = new chz();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = chz.populateBuilderWithField(aVar4, chz, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        scVar.vZv = chz;
                    }
                    AppMethodBeat.o(56763);
                    return 0;
                default:
                    AppMethodBeat.o(56763);
                    return -1;
            }
        } else {
            AppMethodBeat.o(56763);
            return -1;
        }
    }
}
