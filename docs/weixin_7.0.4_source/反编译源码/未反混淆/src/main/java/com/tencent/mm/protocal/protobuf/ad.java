package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class ad extends btd {
    public int vAS;
    public String vAT;
    public bzt vAU;
    public bqv vAV;
    public int vBc;
    public tw vBg;
    public boolean vBh;
    public int vBi;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(28296);
        b bVar;
        int ix;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(28296);
                throw bVar;
            }
            if (this.BaseResponse != null) {
                aVar.iy(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.iz(2, this.vAS);
            if (this.vAT != null) {
                aVar.e(3, this.vAT);
            }
            if (this.vAU != null) {
                aVar.iy(4, this.vAU.computeSize());
                this.vAU.writeFields(aVar);
            }
            if (this.vAV != null) {
                aVar.iy(5, this.vAV.computeSize());
                this.vAV.writeFields(aVar);
            }
            aVar.iz(6, this.vBc);
            if (this.vBg != null) {
                aVar.iy(7, this.vBg.computeSize());
                this.vBg.writeFields(aVar);
            }
            aVar.aO(8, this.vBh);
            aVar.iz(9, this.vBi);
            AppMethodBeat.o(28296);
            return 0;
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            ix += e.a.a.b.b.a.bs(2, this.vAS);
            if (this.vAT != null) {
                ix += e.a.a.b.b.a.f(3, this.vAT);
            }
            if (this.vAU != null) {
                ix += e.a.a.a.ix(4, this.vAU.computeSize());
            }
            if (this.vAV != null) {
                ix += e.a.a.a.ix(5, this.vAV.computeSize());
            }
            ix += e.a.a.b.b.a.bs(6, this.vBc);
            if (this.vBg != null) {
                ix += e.a.a.a.ix(7, this.vBg.computeSize());
            }
            int fv = (ix + (e.a.a.b.b.a.fv(8) + 1)) + e.a.a.b.b.a.bs(9, this.vBi);
            AppMethodBeat.o(28296);
            return fv;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(28296);
                throw bVar;
            }
            AppMethodBeat.o(28296);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            ad adVar = (ad) objArr[1];
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
                        adVar.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.o(28296);
                    return 0;
                case 2:
                    adVar.vAS = aVar3.BTU.vd();
                    AppMethodBeat.o(28296);
                    return 0;
                case 3:
                    adVar.vAT = aVar3.BTU.readString();
                    AppMethodBeat.o(28296);
                    return 0;
                case 4:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        bzt bzt = new bzt();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = bzt.populateBuilderWithField(aVar4, bzt, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        adVar.vAU = bzt;
                    }
                    AppMethodBeat.o(28296);
                    return 0;
                case 5:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        bqv bqv = new bqv();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = bqv.populateBuilderWithField(aVar4, bqv, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        adVar.vAV = bqv;
                    }
                    AppMethodBeat.o(28296);
                    return 0;
                case 6:
                    adVar.vBc = aVar3.BTU.vd();
                    AppMethodBeat.o(28296);
                    return 0;
                case 7:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        tw twVar = new tw();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = twVar.populateBuilderWithField(aVar4, twVar, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        adVar.vBg = twVar;
                    }
                    AppMethodBeat.o(28296);
                    return 0;
                case 8:
                    adVar.vBh = aVar3.BTU.ehX();
                    AppMethodBeat.o(28296);
                    return 0;
                case 9:
                    adVar.vBi = aVar3.BTU.vd();
                    AppMethodBeat.o(28296);
                    return 0;
                default:
                    AppMethodBeat.o(28296);
                    return -1;
            }
        } else {
            AppMethodBeat.o(28296);
            return -1;
        }
    }
}
