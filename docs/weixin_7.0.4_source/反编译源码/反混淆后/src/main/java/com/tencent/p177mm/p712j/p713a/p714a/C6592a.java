package com.tencent.p177mm.p712j.p713a.p714a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.j.a.a.a */
public final class C6592a extends C1331a {
    public int bJt;
    public int cGj;
    public int ehD;
    public LinkedList<C6593b> eow = new LinkedList();
    public String eox;
    public int eoy;
    public int status;
    public int type;

    public C6592a() {
        AppMethodBeat.m2504i(59614);
        AppMethodBeat.m2505o(59614);
    }

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(59615);
        int c;
        byte[] bArr;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            c6093a.mo13474e(1, 8, this.eow);
            c6093a.mo13480iz(2, this.bJt);
            c6093a.mo13480iz(3, this.type);
            c6093a.mo13480iz(4, this.status);
            c6093a.mo13480iz(5, this.ehD);
            if (this.eox != null) {
                c6093a.mo13475e(6, this.eox);
            }
            c6093a.mo13480iz(7, this.cGj);
            c6093a.mo13480iz(8, this.eoy);
            AppMethodBeat.m2505o(59615);
            return 0;
        } else if (i == 1) {
            c = ((((C6087a.m9552c(1, 8, this.eow) + 0) + C6091a.m9572bs(2, this.bJt)) + C6091a.m9572bs(3, this.type)) + C6091a.m9572bs(4, this.status)) + C6091a.m9572bs(5, this.ehD);
            if (this.eox != null) {
                c += C6091a.m9575f(6, this.eox);
            }
            c = (c + C6091a.m9572bs(7, this.cGj)) + C6091a.m9572bs(8, this.eoy);
            AppMethodBeat.m2505o(59615);
            return c;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.eow.clear();
            C6086a c6086a = new C6086a(bArr, unknownTagHandler);
            for (c = C1331a.getNextFieldNumber(c6086a); c > 0; c = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, c)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(59615);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            C6592a c6592a = (C6592a) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList Vh = c6086a2.mo13445Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        C6593b c6593b = new C6593b();
                        C6086a c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = c6593b.populateBuilderWithField(c6086a3, c6593b, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c6592a.eow.add(c6593b);
                    }
                    AppMethodBeat.m2505o(59615);
                    return 0;
                case 2:
                    c6592a.bJt = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(59615);
                    return 0;
                case 3:
                    c6592a.type = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(59615);
                    return 0;
                case 4:
                    c6592a.status = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(59615);
                    return 0;
                case 5:
                    c6592a.ehD = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(59615);
                    return 0;
                case 6:
                    c6592a.eox = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(59615);
                    return 0;
                case 7:
                    c6592a.cGj = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(59615);
                    return 0;
                case 8:
                    c6592a.eoy = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(59615);
                    return 0;
                default:
                    AppMethodBeat.m2505o(59615);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(59615);
            return -1;
        }
    }
}
