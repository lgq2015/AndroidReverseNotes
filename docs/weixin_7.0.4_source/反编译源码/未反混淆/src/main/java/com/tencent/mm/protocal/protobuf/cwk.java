package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class cwk extends btd {
    public String cDL;
    public String cvZ;
    public String url;
    public int version;
    public int wPu;
    public int xsc;
    public int xsd;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(96323);
        b bVar;
        int ix;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(96323);
                throw bVar;
            }
            if (this.BaseResponse != null) {
                aVar.iy(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            if (this.url != null) {
                aVar.e(2, this.url);
            }
            if (this.cvZ != null) {
                aVar.e(3, this.cvZ);
            }
            aVar.iz(4, this.version);
            aVar.iz(5, this.xsc);
            aVar.iz(6, this.wPu);
            aVar.iz(7, this.xsd);
            if (this.cDL != null) {
                aVar.e(8, this.cDL);
            }
            AppMethodBeat.o(96323);
            return 0;
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.url != null) {
                ix += e.a.a.b.b.a.f(2, this.url);
            }
            if (this.cvZ != null) {
                ix += e.a.a.b.b.a.f(3, this.cvZ);
            }
            ix = (((ix + e.a.a.b.b.a.bs(4, this.version)) + e.a.a.b.b.a.bs(5, this.xsc)) + e.a.a.b.b.a.bs(6, this.wPu)) + e.a.a.b.b.a.bs(7, this.xsd);
            if (this.cDL != null) {
                ix += e.a.a.b.b.a.f(8, this.cDL);
            }
            AppMethodBeat.o(96323);
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
                AppMethodBeat.o(96323);
                throw bVar;
            }
            AppMethodBeat.o(96323);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            cwk cwk = (cwk) objArr[1];
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
                        cwk.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.o(96323);
                    return 0;
                case 2:
                    cwk.url = aVar3.BTU.readString();
                    AppMethodBeat.o(96323);
                    return 0;
                case 3:
                    cwk.cvZ = aVar3.BTU.readString();
                    AppMethodBeat.o(96323);
                    return 0;
                case 4:
                    cwk.version = aVar3.BTU.vd();
                    AppMethodBeat.o(96323);
                    return 0;
                case 5:
                    cwk.xsc = aVar3.BTU.vd();
                    AppMethodBeat.o(96323);
                    return 0;
                case 6:
                    cwk.wPu = aVar3.BTU.vd();
                    AppMethodBeat.o(96323);
                    return 0;
                case 7:
                    cwk.xsd = aVar3.BTU.vd();
                    AppMethodBeat.o(96323);
                    return 0;
                case 8:
                    cwk.cDL = aVar3.BTU.readString();
                    AppMethodBeat.o(96323);
                    return 0;
                default:
                    AppMethodBeat.o(96323);
                    return -1;
            }
        } else {
            AppMethodBeat.o(96323);
            return -1;
        }
    }
}
