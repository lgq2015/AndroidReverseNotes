package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class mz extends btd {
    public String ndF;
    public String ndG;
    public int pcX;
    public long ptF;
    public String vRA;
    public String vRl;
    public String vRw;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(80032);
        b bVar;
        int ix;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(80032);
                throw bVar;
            }
            if (this.BaseResponse != null) {
                aVar.iy(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            if (this.vRl != null) {
                aVar.e(3, this.vRl);
            }
            if (this.ndG != null) {
                aVar.e(4, this.ndG);
            }
            if (this.ndF != null) {
                aVar.e(5, this.ndF);
            }
            aVar.iz(9, this.pcX);
            aVar.ai(10, this.ptF);
            if (this.vRw != null) {
                aVar.e(11, this.vRw);
            }
            if (this.vRA != null) {
                aVar.e(12, this.vRA);
            }
            AppMethodBeat.o(80032);
            return 0;
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.vRl != null) {
                ix += e.a.a.b.b.a.f(3, this.vRl);
            }
            if (this.ndG != null) {
                ix += e.a.a.b.b.a.f(4, this.ndG);
            }
            if (this.ndF != null) {
                ix += e.a.a.b.b.a.f(5, this.ndF);
            }
            ix = (ix + e.a.a.b.b.a.bs(9, this.pcX)) + e.a.a.b.b.a.o(10, this.ptF);
            if (this.vRw != null) {
                ix += e.a.a.b.b.a.f(11, this.vRw);
            }
            if (this.vRA != null) {
                ix += e.a.a.b.b.a.f(12, this.vRA);
            }
            AppMethodBeat.o(80032);
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
                AppMethodBeat.o(80032);
                throw bVar;
            }
            AppMethodBeat.o(80032);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            mz mzVar = (mz) objArr[1];
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
                        mzVar.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.o(80032);
                    return 0;
                case 3:
                    mzVar.vRl = aVar3.BTU.readString();
                    AppMethodBeat.o(80032);
                    return 0;
                case 4:
                    mzVar.ndG = aVar3.BTU.readString();
                    AppMethodBeat.o(80032);
                    return 0;
                case 5:
                    mzVar.ndF = aVar3.BTU.readString();
                    AppMethodBeat.o(80032);
                    return 0;
                case 9:
                    mzVar.pcX = aVar3.BTU.vd();
                    AppMethodBeat.o(80032);
                    return 0;
                case 10:
                    mzVar.ptF = aVar3.BTU.ve();
                    AppMethodBeat.o(80032);
                    return 0;
                case 11:
                    mzVar.vRw = aVar3.BTU.readString();
                    AppMethodBeat.o(80032);
                    return 0;
                case 12:
                    mzVar.vRA = aVar3.BTU.readString();
                    AppMethodBeat.o(80032);
                    return 0;
                default:
                    AppMethodBeat.o(80032);
                    return -1;
            }
        } else {
            AppMethodBeat.o(80032);
            return -1;
        }
    }
}
