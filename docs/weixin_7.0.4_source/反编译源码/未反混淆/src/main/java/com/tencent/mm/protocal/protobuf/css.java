package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.c.a;
import java.util.LinkedList;

public final class css extends bsr {
    public String cvF;
    public int scene;
    public int tZU;
    public double xpX;
    public double xpY;
    public String xpZ;
    public LinkedList<cml> xqa = new LinkedList();

    public css() {
        AppMethodBeat.i(93806);
        AppMethodBeat.o(93806);
    }

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(93807);
        int ix;
        byte[] bArr;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseRequest != null) {
                aVar.iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.f(2, this.xpX);
            aVar.f(3, this.xpY);
            if (this.xpZ != null) {
                aVar.e(4, this.xpZ);
            }
            aVar.iz(5, this.tZU);
            if (this.cvF != null) {
                aVar.e(6, this.cvF);
            }
            aVar.iz(7, this.scene);
            aVar.e(8, 8, this.xqa);
            AppMethodBeat.o(93807);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            ix = (ix + (e.a.a.b.b.a.fv(2) + 8)) + (e.a.a.b.b.a.fv(3) + 8);
            if (this.xpZ != null) {
                ix += e.a.a.b.b.a.f(4, this.xpZ);
            }
            ix += e.a.a.b.b.a.bs(5, this.tZU);
            if (this.cvF != null) {
                ix += e.a.a.b.b.a.f(6, this.cvF);
            }
            int bs = (ix + e.a.a.b.b.a.bs(7, this.scene)) + e.a.a.a.c(8, 8, this.xqa);
            AppMethodBeat.o(93807);
            return bs;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.xqa.clear();
            e.a.a.a.a aVar2 = new e.a.a.a.a(bArr, unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(93807);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            css css = (css) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
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
                        css.BaseRequest = hlVar;
                    }
                    AppMethodBeat.o(93807);
                    return 0;
                case 2:
                    css.xpX = Double.longBitsToDouble(aVar3.BTU.eib());
                    AppMethodBeat.o(93807);
                    return 0;
                case 3:
                    css.xpY = Double.longBitsToDouble(aVar3.BTU.eib());
                    AppMethodBeat.o(93807);
                    return 0;
                case 4:
                    css.xpZ = aVar3.BTU.readString();
                    AppMethodBeat.o(93807);
                    return 0;
                case 5:
                    css.tZU = aVar3.BTU.vd();
                    AppMethodBeat.o(93807);
                    return 0;
                case 6:
                    css.cvF = aVar3.BTU.readString();
                    AppMethodBeat.o(93807);
                    return 0;
                case 7:
                    css.scene = aVar3.BTU.vd();
                    AppMethodBeat.o(93807);
                    return 0;
                case 8:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        cml cml = new cml();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = cml.populateBuilderWithField(aVar4, cml, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        css.xqa.add(cml);
                    }
                    AppMethodBeat.o(93807);
                    return 0;
                default:
                    AppMethodBeat.o(93807);
                    return -1;
            }
        } else {
            AppMethodBeat.o(93807);
            return -1;
        }
    }
}
