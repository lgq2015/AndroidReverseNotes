package com.tencent.mm.plugin.qqmail.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.bsr;
import com.tencent.mm.protocal.protobuf.hl;
import e.a.a.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class ag extends bsr {
    public String ptv;
    public int ptw;
    public int ptx;
    public int pty;
    public SKBuiltinBuffer_t ptz;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(68073);
        b bVar;
        int ix;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.ptz == null) {
                bVar = new b("Not all required fields were included: Data");
                AppMethodBeat.o(68073);
                throw bVar;
            }
            if (this.BaseRequest != null) {
                aVar.iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            if (this.ptv != null) {
                aVar.e(2, this.ptv);
            }
            aVar.iz(3, this.ptw);
            aVar.iz(4, this.ptx);
            aVar.iz(5, this.pty);
            if (this.ptz != null) {
                aVar.iy(6, this.ptz.computeSize());
                this.ptz.writeFields(aVar);
            }
            AppMethodBeat.o(68073);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.ptv != null) {
                ix += e.a.a.b.b.a.f(2, this.ptv);
            }
            ix = ((ix + e.a.a.b.b.a.bs(3, this.ptw)) + e.a.a.b.b.a.bs(4, this.ptx)) + e.a.a.b.b.a.bs(5, this.pty);
            if (this.ptz != null) {
                ix += e.a.a.a.ix(6, this.ptz.computeSize());
            }
            AppMethodBeat.o(68073);
            return ix;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            if (this.ptz == null) {
                bVar = new b("Not all required fields were included: Data");
                AppMethodBeat.o(68073);
                throw bVar;
            }
            AppMethodBeat.o(68073);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            ag agVar = (ag) objArr[1];
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
                        agVar.BaseRequest = hlVar;
                    }
                    AppMethodBeat.o(68073);
                    return 0;
                case 2:
                    agVar.ptv = aVar3.BTU.readString();
                    AppMethodBeat.o(68073);
                    return 0;
                case 3:
                    agVar.ptw = aVar3.BTU.vd();
                    AppMethodBeat.o(68073);
                    return 0;
                case 4:
                    agVar.ptx = aVar3.BTU.vd();
                    AppMethodBeat.o(68073);
                    return 0;
                case 5:
                    agVar.pty = aVar3.BTU.vd();
                    AppMethodBeat.o(68073);
                    return 0;
                case 6:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        SKBuiltinBuffer_t sKBuiltinBuffer_t = new SKBuiltinBuffer_t();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = sKBuiltinBuffer_t.populateBuilderWithField(aVar4, sKBuiltinBuffer_t, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        agVar.ptz = sKBuiltinBuffer_t;
                    }
                    AppMethodBeat.o(68073);
                    return 0;
                default:
                    AppMethodBeat.o(68073);
                    return -1;
            }
        } else {
            AppMethodBeat.o(68073);
            return -1;
        }
    }
}
