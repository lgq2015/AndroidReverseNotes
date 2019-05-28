package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;

public final class biv extends a {
    public String duc;
    public String dud;
    public double latitude;
    public double longitude;
    public long vCE;
    public String vCF;
    public String vCG;
    public String vCH;
    public String vCI;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(80154);
        int f;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            if (this.duc != null) {
                aVar.e(1, this.duc);
            }
            if (this.dud != null) {
                aVar.e(2, this.dud);
            }
            aVar.f(3, this.latitude);
            aVar.f(4, this.longitude);
            aVar.ai(5, this.vCE);
            if (this.vCF != null) {
                aVar.e(6, this.vCF);
            }
            if (this.vCG != null) {
                aVar.e(7, this.vCG);
            }
            if (this.vCH != null) {
                aVar.e(8, this.vCH);
            }
            if (this.vCI != null) {
                aVar.e(9, this.vCI);
            }
            AppMethodBeat.o(80154);
            return 0;
        } else if (i == 1) {
            if (this.duc != null) {
                f = e.a.a.b.b.a.f(1, this.duc) + 0;
            } else {
                f = 0;
            }
            if (this.dud != null) {
                f += e.a.a.b.b.a.f(2, this.dud);
            }
            f = ((f + (e.a.a.b.b.a.fv(3) + 8)) + (e.a.a.b.b.a.fv(4) + 8)) + e.a.a.b.b.a.o(5, this.vCE);
            if (this.vCF != null) {
                f += e.a.a.b.b.a.f(6, this.vCF);
            }
            if (this.vCG != null) {
                f += e.a.a.b.b.a.f(7, this.vCG);
            }
            if (this.vCH != null) {
                f += e.a.a.b.b.a.f(8, this.vCH);
            }
            if (this.vCI != null) {
                f += e.a.a.b.b.a.f(9, this.vCI);
            }
            AppMethodBeat.o(80154);
            return f;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (f = a.getNextFieldNumber(aVar2); f > 0; f = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, f)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(80154);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            biv biv = (biv) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    biv.duc = aVar3.BTU.readString();
                    AppMethodBeat.o(80154);
                    return 0;
                case 2:
                    biv.dud = aVar3.BTU.readString();
                    AppMethodBeat.o(80154);
                    return 0;
                case 3:
                    biv.latitude = Double.longBitsToDouble(aVar3.BTU.eib());
                    AppMethodBeat.o(80154);
                    return 0;
                case 4:
                    biv.longitude = Double.longBitsToDouble(aVar3.BTU.eib());
                    AppMethodBeat.o(80154);
                    return 0;
                case 5:
                    biv.vCE = aVar3.BTU.ve();
                    AppMethodBeat.o(80154);
                    return 0;
                case 6:
                    biv.vCF = aVar3.BTU.readString();
                    AppMethodBeat.o(80154);
                    return 0;
                case 7:
                    biv.vCG = aVar3.BTU.readString();
                    AppMethodBeat.o(80154);
                    return 0;
                case 8:
                    biv.vCH = aVar3.BTU.readString();
                    AppMethodBeat.o(80154);
                    return 0;
                case 9:
                    biv.vCI = aVar3.BTU.readString();
                    AppMethodBeat.o(80154);
                    return 0;
                default:
                    AppMethodBeat.o(80154);
                    return -1;
            }
        } else {
            AppMethodBeat.o(80154);
            return -1;
        }
    }
}
