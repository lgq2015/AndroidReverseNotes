package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class aoz extends btd {
    public String egm;
    public int error_code;
    public String error_msg;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(96229);
        b bVar;
        int ix;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(96229);
                throw bVar;
            }
            if (this.BaseResponse != null) {
                aVar.iy(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            if (this.egm != null) {
                aVar.e(2, this.egm);
            }
            if (this.error_msg != null) {
                aVar.e(3, this.error_msg);
            }
            aVar.iz(4, this.error_code);
            AppMethodBeat.o(96229);
            return 0;
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.egm != null) {
                ix += e.a.a.b.b.a.f(2, this.egm);
            }
            if (this.error_msg != null) {
                ix += e.a.a.b.b.a.f(3, this.error_msg);
            }
            int bs = ix + e.a.a.b.b.a.bs(4, this.error_code);
            AppMethodBeat.o(96229);
            return bs;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(96229);
                throw bVar;
            }
            AppMethodBeat.o(96229);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            aoz aoz = (aoz) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList Vh = aVar3.Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) Vh.get(intValue);
                        BaseResponse baseResponse = new BaseResponse();
                        e.a.a.a.a aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = baseResponse.populateBuilderWithField(aVar4, baseResponse, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        aoz.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.o(96229);
                    return 0;
                case 2:
                    aoz.egm = aVar3.BTU.readString();
                    AppMethodBeat.o(96229);
                    return 0;
                case 3:
                    aoz.error_msg = aVar3.BTU.readString();
                    AppMethodBeat.o(96229);
                    return 0;
                case 4:
                    aoz.error_code = aVar3.BTU.vd();
                    AppMethodBeat.o(96229);
                    return 0;
                default:
                    AppMethodBeat.o(96229);
                    return -1;
            }
        } else {
            AppMethodBeat.o(96229);
            return -1;
        }
    }
}
