package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class uh extends btd {
    public String vNb;
    public bos vNh;
    public int wbR;
    public acr wbS;
    public kk wbT;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(11742);
        b bVar;
        int ix;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(11742);
                throw bVar;
            } else if (this.vNh == null) {
                bVar = new b("Not all required fields were included: qy_base_resp");
                AppMethodBeat.o(11742);
                throw bVar;
            } else {
                if (this.BaseResponse != null) {
                    aVar.iy(1, this.BaseResponse.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                if (this.vNh != null) {
                    aVar.iy(2, this.vNh.computeSize());
                    this.vNh.writeFields(aVar);
                }
                if (this.vNb != null) {
                    aVar.e(3, this.vNb);
                }
                aVar.iz(4, this.wbR);
                if (this.wbS != null) {
                    aVar.iy(5, this.wbS.computeSize());
                    this.wbS.writeFields(aVar);
                }
                if (this.wbT != null) {
                    aVar.iy(6, this.wbT.computeSize());
                    this.wbT.writeFields(aVar);
                }
                AppMethodBeat.o(11742);
                return 0;
            }
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.vNh != null) {
                ix += e.a.a.a.ix(2, this.vNh.computeSize());
            }
            if (this.vNb != null) {
                ix += e.a.a.b.b.a.f(3, this.vNb);
            }
            ix += e.a.a.b.b.a.bs(4, this.wbR);
            if (this.wbS != null) {
                ix += e.a.a.a.ix(5, this.wbS.computeSize());
            }
            if (this.wbT != null) {
                ix += e.a.a.a.ix(6, this.wbT.computeSize());
            }
            AppMethodBeat.o(11742);
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
                AppMethodBeat.o(11742);
                throw bVar;
            } else if (this.vNh == null) {
                bVar = new b("Not all required fields were included: qy_base_resp");
                AppMethodBeat.o(11742);
                throw bVar;
            } else {
                AppMethodBeat.o(11742);
                return 0;
            }
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            uh uhVar = (uh) objArr[1];
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
                        uhVar.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.o(11742);
                    return 0;
                case 2:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        bos bos = new bos();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = bos.populateBuilderWithField(aVar4, bos, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        uhVar.vNh = bos;
                    }
                    AppMethodBeat.o(11742);
                    return 0;
                case 3:
                    uhVar.vNb = aVar3.BTU.readString();
                    AppMethodBeat.o(11742);
                    return 0;
                case 4:
                    uhVar.wbR = aVar3.BTU.vd();
                    AppMethodBeat.o(11742);
                    return 0;
                case 5:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        acr acr = new acr();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = acr.populateBuilderWithField(aVar4, acr, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        uhVar.wbS = acr;
                    }
                    AppMethodBeat.o(11742);
                    return 0;
                case 6:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        kk kkVar = new kk();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = kkVar.populateBuilderWithField(aVar4, kkVar, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        uhVar.wbT = kkVar;
                    }
                    AppMethodBeat.o(11742);
                    return 0;
                default:
                    AppMethodBeat.o(11742);
                    return -1;
            }
        } else {
            AppMethodBeat.o(11742);
            return -1;
        }
    }
}
