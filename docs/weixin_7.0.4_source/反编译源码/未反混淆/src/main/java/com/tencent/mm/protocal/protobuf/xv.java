package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class xv extends bsr {
    public String luQ;
    public int vIJ;
    public String vIj;
    public String vLJ;
    public String vLe;
    public SKBuiltinBuffer_t vLz;
    public int wdA;
    public String wdy;
    public String wdz;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(73701);
        b bVar;
        int ix;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.vLz == null) {
                bVar = new b("Not all required fields were included: RandomEncryKey");
                AppMethodBeat.o(73701);
                throw bVar;
            }
            if (this.BaseRequest != null) {
                aVar.iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            if (this.vLz != null) {
                aVar.iy(2, this.vLz.computeSize());
                this.vLz.writeFields(aVar);
            }
            aVar.iz(3, this.vIJ);
            if (this.vLe != null) {
                aVar.e(4, this.vLe);
            }
            if (this.luQ != null) {
                aVar.e(5, this.luQ);
            }
            if (this.vLJ != null) {
                aVar.e(6, this.vLJ);
            }
            if (this.wdy != null) {
                aVar.e(7, this.wdy);
            }
            if (this.vIj != null) {
                aVar.e(8, this.vIj);
            }
            if (this.wdz != null) {
                aVar.e(9, this.wdz);
            }
            aVar.iz(10, this.wdA);
            AppMethodBeat.o(73701);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.vLz != null) {
                ix += e.a.a.a.ix(2, this.vLz.computeSize());
            }
            ix += e.a.a.b.b.a.bs(3, this.vIJ);
            if (this.vLe != null) {
                ix += e.a.a.b.b.a.f(4, this.vLe);
            }
            if (this.luQ != null) {
                ix += e.a.a.b.b.a.f(5, this.luQ);
            }
            if (this.vLJ != null) {
                ix += e.a.a.b.b.a.f(6, this.vLJ);
            }
            if (this.wdy != null) {
                ix += e.a.a.b.b.a.f(7, this.wdy);
            }
            if (this.vIj != null) {
                ix += e.a.a.b.b.a.f(8, this.vIj);
            }
            if (this.wdz != null) {
                ix += e.a.a.b.b.a.f(9, this.wdz);
            }
            int bs = ix + e.a.a.b.b.a.bs(10, this.wdA);
            AppMethodBeat.o(73701);
            return bs;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            if (this.vLz == null) {
                bVar = new b("Not all required fields were included: RandomEncryKey");
                AppMethodBeat.o(73701);
                throw bVar;
            }
            AppMethodBeat.o(73701);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            xv xvVar = (xv) objArr[1];
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
                        xvVar.BaseRequest = hlVar;
                    }
                    AppMethodBeat.o(73701);
                    return 0;
                case 2:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        SKBuiltinBuffer_t sKBuiltinBuffer_t = new SKBuiltinBuffer_t();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = sKBuiltinBuffer_t.populateBuilderWithField(aVar4, sKBuiltinBuffer_t, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        xvVar.vLz = sKBuiltinBuffer_t;
                    }
                    AppMethodBeat.o(73701);
                    return 0;
                case 3:
                    xvVar.vIJ = aVar3.BTU.vd();
                    AppMethodBeat.o(73701);
                    return 0;
                case 4:
                    xvVar.vLe = aVar3.BTU.readString();
                    AppMethodBeat.o(73701);
                    return 0;
                case 5:
                    xvVar.luQ = aVar3.BTU.readString();
                    AppMethodBeat.o(73701);
                    return 0;
                case 6:
                    xvVar.vLJ = aVar3.BTU.readString();
                    AppMethodBeat.o(73701);
                    return 0;
                case 7:
                    xvVar.wdy = aVar3.BTU.readString();
                    AppMethodBeat.o(73701);
                    return 0;
                case 8:
                    xvVar.vIj = aVar3.BTU.readString();
                    AppMethodBeat.o(73701);
                    return 0;
                case 9:
                    xvVar.wdz = aVar3.BTU.readString();
                    AppMethodBeat.o(73701);
                    return 0;
                case 10:
                    xvVar.wdA = aVar3.BTU.vd();
                    AppMethodBeat.o(73701);
                    return 0;
                default:
                    AppMethodBeat.o(73701);
                    return -1;
            }
        } else {
            AppMethodBeat.o(73701);
            return -1;
        }
    }
}
