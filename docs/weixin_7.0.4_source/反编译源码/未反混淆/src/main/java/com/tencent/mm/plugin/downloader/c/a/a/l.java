package com.tencent.mm.plugin.downloader.c.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bsr;
import com.tencent.mm.protocal.protobuf.hl;
import e.a.a.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class l extends bsr {
    public String kKE;
    public o kKF;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(35521);
        b bVar;
        int ix;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.kKE == null) {
                bVar = new b("Not all required fields were included: search_key");
                AppMethodBeat.o(35521);
                throw bVar;
            }
            if (this.BaseRequest != null) {
                aVar.iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            if (this.kKE != null) {
                aVar.e(2, this.kKE);
            }
            if (this.kKF != null) {
                aVar.iy(3, this.kKF.computeSize());
                this.kKF.writeFields(aVar);
            }
            AppMethodBeat.o(35521);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.kKE != null) {
                ix += e.a.a.b.b.a.f(2, this.kKE);
            }
            if (this.kKF != null) {
                ix += e.a.a.a.ix(3, this.kKF.computeSize());
            }
            AppMethodBeat.o(35521);
            return ix;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            if (this.kKE == null) {
                bVar = new b("Not all required fields were included: search_key");
                AppMethodBeat.o(35521);
                throw bVar;
            }
            AppMethodBeat.o(35521);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            l lVar = (l) objArr[1];
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
                        hl hlVar = new hl();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = hlVar.populateBuilderWithField(aVar4, hlVar, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        lVar.BaseRequest = hlVar;
                    }
                    AppMethodBeat.o(35521);
                    return 0;
                case 2:
                    lVar.kKE = aVar3.BTU.readString();
                    AppMethodBeat.o(35521);
                    return 0;
                case 3:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        o oVar = new o();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = oVar.populateBuilderWithField(aVar4, oVar, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        lVar.kKF = oVar;
                    }
                    AppMethodBeat.o(35521);
                    return 0;
                default:
                    AppMethodBeat.o(35521);
                    return -1;
            }
        } else {
            AppMethodBeat.o(35521);
            return -1;
        }
    }
}
