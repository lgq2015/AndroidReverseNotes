package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import com.tencent.p177mm.p205bt.C1332b;
import p690e.p691a.p692a.C6092b;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.fb */
public final class C44117fb extends C1331a {
    public C1332b vGZ;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(28313);
        C6092b c6092b;
        int b;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.vGZ == null) {
                c6092b = new C6092b("Not all required fields were included: Cookies");
                AppMethodBeat.m2505o(28313);
                throw c6092b;
            }
            if (this.vGZ != null) {
                c6093a.mo13473c(1, this.vGZ);
            }
            AppMethodBeat.m2505o(28313);
            return 0;
        } else if (i == 1) {
            if (this.vGZ != null) {
                b = C6091a.m9571b(1, this.vGZ) + 0;
            } else {
                b = 0;
            }
            AppMethodBeat.m2505o(28313);
            return b;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (b = C1331a.getNextFieldNumber(c6086a); b > 0; b = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, b)) {
                    c6086a.ems();
                }
            }
            if (this.vGZ == null) {
                c6092b = new C6092b("Not all required fields were included: Cookies");
                AppMethodBeat.m2505o(28313);
                throw c6092b;
            }
            AppMethodBeat.m2505o(28313);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            C44117fb c44117fb = (C44117fb) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    c44117fb.vGZ = c6086a2.BTU.emu();
                    AppMethodBeat.m2505o(28313);
                    return 0;
                default:
                    AppMethodBeat.m2505o(28313);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(28313);
            return -1;
        }
    }
}
