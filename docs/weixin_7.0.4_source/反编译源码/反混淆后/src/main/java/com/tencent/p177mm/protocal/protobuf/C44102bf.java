package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.bf */
public final class C44102bf extends C1331a {
    public LinkedList<cgq> vDi = new LinkedList();
    public C46526bd vDj;

    public C44102bf() {
        AppMethodBeat.m2504i(73645);
        AppMethodBeat.m2505o(73645);
    }

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(73646);
        int c;
        byte[] bArr;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            c6093a.mo13474e(1, 8, this.vDi);
            if (this.vDj != null) {
                c6093a.mo13479iy(2, this.vDj.computeSize());
                this.vDj.writeFields(c6093a);
            }
            AppMethodBeat.m2505o(73646);
            return 0;
        } else if (i == 1) {
            c = C6087a.m9552c(1, 8, this.vDi) + 0;
            if (this.vDj != null) {
                c += C6087a.m9557ix(2, this.vDj.computeSize());
            }
            AppMethodBeat.m2505o(73646);
            return c;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.vDi.clear();
            C6086a c6086a = new C6086a(bArr, unknownTagHandler);
            for (c = C1331a.getNextFieldNumber(c6086a); c > 0; c = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, c)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(73646);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            C44102bf c44102bf = (C44102bf) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            C6086a c6086a3;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        cgq cgq = new cgq();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = cgq.populateBuilderWithField(c6086a3, cgq, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c44102bf.vDi.add(cgq);
                    }
                    AppMethodBeat.m2505o(73646);
                    return 0;
                case 2:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        C46526bd c46526bd = new C46526bd();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = c46526bd.populateBuilderWithField(c6086a3, c46526bd, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c44102bf.vDj = c46526bd;
                    }
                    AppMethodBeat.m2505o(73646);
                    return 0;
                default:
                    AppMethodBeat.m2505o(73646);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(73646);
            return -1;
        }
    }
}
