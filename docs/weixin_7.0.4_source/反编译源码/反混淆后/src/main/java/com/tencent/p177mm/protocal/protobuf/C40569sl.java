package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.sl */
public final class C40569sl extends C1331a implements bzw {
    public int Ret;
    public int vZM;
    public int vZN;
    public int vZO;
    public LinkedList<cff> vZP = new LinkedList();
    public LinkedList<cff> vZQ = new LinkedList();
    public LinkedList<cff> vZR = new LinkedList();
    public int vZS;
    public int vZT;
    public int vZU;
    public ate vZV;

    public C40569sl() {
        AppMethodBeat.m2504i(72845);
        AppMethodBeat.m2505o(72845);
    }

    public final int getRet() {
        return this.Ret;
    }

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(72846);
        int bs;
        byte[] bArr;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            c6093a.mo13480iz(1, this.Ret);
            c6093a.mo13480iz(2, this.vZM);
            c6093a.mo13480iz(3, this.vZN);
            c6093a.mo13480iz(4, this.vZO);
            c6093a.mo13474e(5, 8, this.vZP);
            c6093a.mo13474e(6, 8, this.vZQ);
            c6093a.mo13474e(7, 8, this.vZR);
            c6093a.mo13480iz(8, this.vZS);
            c6093a.mo13480iz(9, this.vZT);
            c6093a.mo13480iz(10, this.vZU);
            if (this.vZV != null) {
                c6093a.mo13479iy(11, this.vZV.computeSize());
                this.vZV.writeFields(c6093a);
            }
            AppMethodBeat.m2505o(72846);
            return 0;
        } else if (i == 1) {
            bs = (((((((((C6091a.m9572bs(1, this.Ret) + 0) + C6091a.m9572bs(2, this.vZM)) + C6091a.m9572bs(3, this.vZN)) + C6091a.m9572bs(4, this.vZO)) + C6087a.m9552c(5, 8, this.vZP)) + C6087a.m9552c(6, 8, this.vZQ)) + C6087a.m9552c(7, 8, this.vZR)) + C6091a.m9572bs(8, this.vZS)) + C6091a.m9572bs(9, this.vZT)) + C6091a.m9572bs(10, this.vZU);
            if (this.vZV != null) {
                bs += C6087a.m9557ix(11, this.vZV.computeSize());
            }
            AppMethodBeat.m2505o(72846);
            return bs;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.vZP.clear();
            this.vZQ.clear();
            this.vZR.clear();
            C6086a c6086a = new C6086a(bArr, unknownTagHandler);
            for (bs = C1331a.getNextFieldNumber(c6086a); bs > 0; bs = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, bs)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(72846);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            C40569sl c40569sl = (C40569sl) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            cff cff;
            C6086a c6086a3;
            boolean z;
            switch (intValue) {
                case 1:
                    c40569sl.Ret = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(72846);
                    return 0;
                case 2:
                    c40569sl.vZM = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(72846);
                    return 0;
                case 3:
                    c40569sl.vZN = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(72846);
                    return 0;
                case 4:
                    c40569sl.vZO = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(72846);
                    return 0;
                case 5:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        cff = new cff();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = cff.populateBuilderWithField(c6086a3, cff, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c40569sl.vZP.add(cff);
                    }
                    AppMethodBeat.m2505o(72846);
                    return 0;
                case 6:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        cff = new cff();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = cff.populateBuilderWithField(c6086a3, cff, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c40569sl.vZQ.add(cff);
                    }
                    AppMethodBeat.m2505o(72846);
                    return 0;
                case 7:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        cff = new cff();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = cff.populateBuilderWithField(c6086a3, cff, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c40569sl.vZR.add(cff);
                    }
                    AppMethodBeat.m2505o(72846);
                    return 0;
                case 8:
                    c40569sl.vZS = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(72846);
                    return 0;
                case 9:
                    c40569sl.vZT = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(72846);
                    return 0;
                case 10:
                    c40569sl.vZU = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(72846);
                    return 0;
                case 11:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        ate ate = new ate();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = ate.populateBuilderWithField(c6086a3, ate, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c40569sl.vZV = ate;
                    }
                    AppMethodBeat.m2505o(72846);
                    return 0;
                default:
                    AppMethodBeat.m2505o(72846);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(72846);
            return -1;
        }
    }
}
