package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class bfy extends btd {
    public int kdT;
    public String kdU;
    public String vLb;
    public bks vLc;
    public bhg vLd;
    public String wJH;
    public String wJO;
    public aur wJP;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(48906);
        b bVar;
        int ix;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(48906);
                throw bVar;
            }
            if (this.BaseResponse != null) {
                aVar.iy(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.iz(2, this.kdT);
            if (this.kdU != null) {
                aVar.e(3, this.kdU);
            }
            if (this.wJH != null) {
                aVar.e(4, this.wJH);
            }
            if (this.vLb != null) {
                aVar.e(5, this.vLb);
            }
            if (this.wJO != null) {
                aVar.e(6, this.wJO);
            }
            if (this.vLc != null) {
                aVar.iy(7, this.vLc.computeSize());
                this.vLc.writeFields(aVar);
            }
            if (this.vLd != null) {
                aVar.iy(8, this.vLd.computeSize());
                this.vLd.writeFields(aVar);
            }
            if (this.wJP != null) {
                aVar.iy(9, this.wJP.computeSize());
                this.wJP.writeFields(aVar);
            }
            AppMethodBeat.o(48906);
            return 0;
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            ix += e.a.a.b.b.a.bs(2, this.kdT);
            if (this.kdU != null) {
                ix += e.a.a.b.b.a.f(3, this.kdU);
            }
            if (this.wJH != null) {
                ix += e.a.a.b.b.a.f(4, this.wJH);
            }
            if (this.vLb != null) {
                ix += e.a.a.b.b.a.f(5, this.vLb);
            }
            if (this.wJO != null) {
                ix += e.a.a.b.b.a.f(6, this.wJO);
            }
            if (this.vLc != null) {
                ix += e.a.a.a.ix(7, this.vLc.computeSize());
            }
            if (this.vLd != null) {
                ix += e.a.a.a.ix(8, this.vLd.computeSize());
            }
            if (this.wJP != null) {
                ix += e.a.a.a.ix(9, this.wJP.computeSize());
            }
            AppMethodBeat.o(48906);
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
                AppMethodBeat.o(48906);
                throw bVar;
            }
            AppMethodBeat.o(48906);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            bfy bfy = (bfy) objArr[1];
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
                        bfy.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.o(48906);
                    return 0;
                case 2:
                    bfy.kdT = aVar3.BTU.vd();
                    AppMethodBeat.o(48906);
                    return 0;
                case 3:
                    bfy.kdU = aVar3.BTU.readString();
                    AppMethodBeat.o(48906);
                    return 0;
                case 4:
                    bfy.wJH = aVar3.BTU.readString();
                    AppMethodBeat.o(48906);
                    return 0;
                case 5:
                    bfy.vLb = aVar3.BTU.readString();
                    AppMethodBeat.o(48906);
                    return 0;
                case 6:
                    bfy.wJO = aVar3.BTU.readString();
                    AppMethodBeat.o(48906);
                    return 0;
                case 7:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        bks bks = new bks();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = bks.populateBuilderWithField(aVar4, bks, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        bfy.vLc = bks;
                    }
                    AppMethodBeat.o(48906);
                    return 0;
                case 8:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        bhg bhg = new bhg();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = bhg.populateBuilderWithField(aVar4, bhg, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        bfy.vLd = bhg;
                    }
                    AppMethodBeat.o(48906);
                    return 0;
                case 9:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        aur aur = new aur();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = aur.populateBuilderWithField(aVar4, aur, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        bfy.wJP = aur;
                    }
                    AppMethodBeat.o(48906);
                    return 0;
                default:
                    AppMethodBeat.o(48906);
                    return -1;
            }
        } else {
            AppMethodBeat.o(48906);
            return -1;
        }
    }
}
