package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import com.tencent.p177mm.p205bt.C1332b;
import p690e.p691a.p692a.C6092b;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.cuk */
public final class cuk extends C1331a {
    public int xcZ;
    public String xpw;
    public C1332b xqL;
    public C1332b xqM;
    public String xqN;
    public String xqO;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(28751);
        C6092b c6092b;
        int bs;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.xpw == null) {
                c6092b = new C6092b("Not all required fields were included: Msg");
                AppMethodBeat.m2505o(28751);
                throw c6092b;
            }
            c6093a.mo13480iz(1, this.xcZ);
            if (this.xpw != null) {
                c6093a.mo13475e(2, this.xpw);
            }
            if (this.xqL != null) {
                c6093a.mo13473c(3, this.xqL);
            }
            if (this.xqM != null) {
                c6093a.mo13473c(4, this.xqM);
            }
            if (this.xqN != null) {
                c6093a.mo13475e(5, this.xqN);
            }
            if (this.xqO != null) {
                c6093a.mo13475e(6, this.xqO);
            }
            AppMethodBeat.m2505o(28751);
            return 0;
        } else if (i == 1) {
            bs = C6091a.m9572bs(1, this.xcZ) + 0;
            if (this.xpw != null) {
                bs += C6091a.m9575f(2, this.xpw);
            }
            if (this.xqL != null) {
                bs += C6091a.m9571b(3, this.xqL);
            }
            if (this.xqM != null) {
                bs += C6091a.m9571b(4, this.xqM);
            }
            if (this.xqN != null) {
                bs += C6091a.m9575f(5, this.xqN);
            }
            if (this.xqO != null) {
                bs += C6091a.m9575f(6, this.xqO);
            }
            AppMethodBeat.m2505o(28751);
            return bs;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (bs = C1331a.getNextFieldNumber(c6086a); bs > 0; bs = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, bs)) {
                    c6086a.ems();
                }
            }
            if (this.xpw == null) {
                c6092b = new C6092b("Not all required fields were included: Msg");
                AppMethodBeat.m2505o(28751);
                throw c6092b;
            }
            AppMethodBeat.m2505o(28751);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            cuk cuk = (cuk) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    cuk.xcZ = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(28751);
                    return 0;
                case 2:
                    cuk.xpw = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(28751);
                    return 0;
                case 3:
                    cuk.xqL = c6086a2.BTU.emu();
                    AppMethodBeat.m2505o(28751);
                    return 0;
                case 4:
                    cuk.xqM = c6086a2.BTU.emu();
                    AppMethodBeat.m2505o(28751);
                    return 0;
                case 5:
                    cuk.xqN = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(28751);
                    return 0;
                case 6:
                    cuk.xqO = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(28751);
                    return 0;
                default:
                    AppMethodBeat.m2505o(28751);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(28751);
            return -1;
        }
    }
}
