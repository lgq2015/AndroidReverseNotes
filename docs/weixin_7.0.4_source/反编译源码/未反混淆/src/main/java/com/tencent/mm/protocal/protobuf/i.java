package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class i extends btd {
    public int kCl = 268513600;
    public String kCm = "请求不成功，请稍候再试";
    public String vzL;
    public String vzN;
    public y vzT;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(56677);
        b bVar;
        int ix;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(56677);
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
            if (this.vzL != null) {
                aVar.e(4, this.vzL);
            }
            if (this.vzN != null) {
                aVar.e(6, this.vzN);
            }
            if (this.vzT != null) {
                aVar.iy(7, this.vzT.computeSize());
                this.vzT.writeFields(aVar);
            }
            AppMethodBeat.o(56677);
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
            if (this.vzL != null) {
                ix += e.a.a.b.b.a.f(4, this.vzL);
            }
            if (this.vzN != null) {
                ix += e.a.a.b.b.a.f(6, this.vzN);
            }
            if (this.vzT != null) {
                ix += e.a.a.a.ix(7, this.vzT.computeSize());
            }
            AppMethodBeat.o(56677);
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
                AppMethodBeat.o(56677);
                throw bVar;
            }
            AppMethodBeat.o(56677);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            i iVar = (i) objArr[1];
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
                        iVar.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.o(56677);
                    return 0;
                case 2:
                    iVar.kCl = aVar3.BTU.vd();
                    AppMethodBeat.o(56677);
                    return 0;
                case 3:
                    iVar.kCm = aVar3.BTU.readString();
                    AppMethodBeat.o(56677);
                    return 0;
                case 4:
                    iVar.vzL = aVar3.BTU.readString();
                    AppMethodBeat.o(56677);
                    return 0;
                case 6:
                    iVar.vzN = aVar3.BTU.readString();
                    AppMethodBeat.o(56677);
                    return 0;
                case 7:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        y yVar = new y();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = yVar.populateBuilderWithField(aVar4, yVar, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        iVar.vzT = yVar;
                    }
                    AppMethodBeat.o(56677);
                    return 0;
                default:
                    AppMethodBeat.o(56677);
                    return -1;
            }
        } else {
            AppMethodBeat.o(56677);
            return -1;
        }
    }
}
