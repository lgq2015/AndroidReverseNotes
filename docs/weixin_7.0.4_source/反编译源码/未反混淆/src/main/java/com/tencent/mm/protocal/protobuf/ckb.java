package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.c.a;
import java.util.LinkedList;

public final class ckb extends bsr {
    public int Scene;
    public SKBuiltinBuffer_t vLz;
    public String xil;
    public String xim;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(59395);
        int ix;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseRequest != null) {
                aVar.iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            if (this.xil != null) {
                aVar.e(2, this.xil);
            }
            if (this.xim != null) {
                aVar.e(3, this.xim);
            }
            aVar.iz(4, this.Scene);
            if (this.vLz != null) {
                aVar.iy(5, this.vLz.computeSize());
                this.vLz.writeFields(aVar);
            }
            AppMethodBeat.o(59395);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.xil != null) {
                ix += e.a.a.b.b.a.f(2, this.xil);
            }
            if (this.xim != null) {
                ix += e.a.a.b.b.a.f(3, this.xim);
            }
            ix += e.a.a.b.b.a.bs(4, this.Scene);
            if (this.vLz != null) {
                ix += e.a.a.a.ix(5, this.vLz.computeSize());
            }
            AppMethodBeat.o(59395);
            return ix;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(59395);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            ckb ckb = (ckb) objArr[1];
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
                        ckb.BaseRequest = hlVar;
                    }
                    AppMethodBeat.o(59395);
                    return 0;
                case 2:
                    ckb.xil = aVar3.BTU.readString();
                    AppMethodBeat.o(59395);
                    return 0;
                case 3:
                    ckb.xim = aVar3.BTU.readString();
                    AppMethodBeat.o(59395);
                    return 0;
                case 4:
                    ckb.Scene = aVar3.BTU.vd();
                    AppMethodBeat.o(59395);
                    return 0;
                case 5:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        SKBuiltinBuffer_t sKBuiltinBuffer_t = new SKBuiltinBuffer_t();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = sKBuiltinBuffer_t.populateBuilderWithField(aVar4, sKBuiltinBuffer_t, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        ckb.vLz = sKBuiltinBuffer_t;
                    }
                    AppMethodBeat.o(59395);
                    return 0;
                default:
                    AppMethodBeat.o(59395);
                    return -1;
            }
        } else {
            AppMethodBeat.o(59395);
            return -1;
        }
    }
}
