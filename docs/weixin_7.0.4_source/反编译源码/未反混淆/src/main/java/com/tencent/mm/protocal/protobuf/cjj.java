package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class cjj extends btd {
    public int xic;
    public fv xid;
    public ar xie;
    public bdv xif;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(58938);
        b bVar;
        int ix;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(58938);
                throw bVar;
            }
            if (this.BaseResponse != null) {
                aVar.iy(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.iz(2, this.xic);
            if (this.xid != null) {
                aVar.iy(3, this.xid.computeSize());
                this.xid.writeFields(aVar);
            }
            if (this.xie != null) {
                aVar.iy(4, this.xie.computeSize());
                this.xie.writeFields(aVar);
            }
            if (this.xif != null) {
                aVar.iy(5, this.xif.computeSize());
                this.xif.writeFields(aVar);
            }
            AppMethodBeat.o(58938);
            return 0;
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            ix += e.a.a.b.b.a.bs(2, this.xic);
            if (this.xid != null) {
                ix += e.a.a.a.ix(3, this.xid.computeSize());
            }
            if (this.xie != null) {
                ix += e.a.a.a.ix(4, this.xie.computeSize());
            }
            if (this.xif != null) {
                ix += e.a.a.a.ix(5, this.xif.computeSize());
            }
            AppMethodBeat.o(58938);
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
                AppMethodBeat.o(58938);
                throw bVar;
            }
            AppMethodBeat.o(58938);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            cjj cjj = (cjj) objArr[1];
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
                        cjj.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.o(58938);
                    return 0;
                case 2:
                    cjj.xic = aVar3.BTU.vd();
                    AppMethodBeat.o(58938);
                    return 0;
                case 3:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        fv fvVar = new fv();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = fvVar.populateBuilderWithField(aVar4, fvVar, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        cjj.xid = fvVar;
                    }
                    AppMethodBeat.o(58938);
                    return 0;
                case 4:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        ar arVar = new ar();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = arVar.populateBuilderWithField(aVar4, arVar, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        cjj.xie = arVar;
                    }
                    AppMethodBeat.o(58938);
                    return 0;
                case 5:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        bdv bdv = new bdv();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = bdv.populateBuilderWithField(aVar4, bdv, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        cjj.xif = bdv;
                    }
                    AppMethodBeat.o(58938);
                    return 0;
                default:
                    AppMethodBeat.o(58938);
                    return -1;
            }
        } else {
            AppMethodBeat.o(58938);
            return -1;
        }
    }
}
