package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import p690e.p691a.p692a.C6092b;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.cuq */
public final class cuq extends C1331a {
    public int Scene;
    public String vQq;
    public String wdK;
    public String wdO;
    public String wyw;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(28758);
        C6092b c6092b;
        int f;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.wyw == null) {
                c6092b = new C6092b("Not all required fields were included: Talker");
                AppMethodBeat.m2505o(28758);
                throw c6092b;
            } else if (this.wdK == null) {
                c6092b = new C6092b("Not all required fields were included: Text");
                AppMethodBeat.m2505o(28758);
                throw c6092b;
            } else if (this.wdO == null) {
                c6092b = new C6092b("Not all required fields were included: MD5");
                AppMethodBeat.m2505o(28758);
                throw c6092b;
            } else if (this.vQq == null) {
                c6092b = new C6092b("Not all required fields were included: ProductId");
                AppMethodBeat.m2505o(28758);
                throw c6092b;
            } else {
                if (this.wyw != null) {
                    c6093a.mo13475e(1, this.wyw);
                }
                if (this.wdK != null) {
                    c6093a.mo13475e(2, this.wdK);
                }
                if (this.wdO != null) {
                    c6093a.mo13475e(3, this.wdO);
                }
                if (this.vQq != null) {
                    c6093a.mo13475e(4, this.vQq);
                }
                c6093a.mo13480iz(5, this.Scene);
                AppMethodBeat.m2505o(28758);
                return 0;
            }
        } else if (i == 1) {
            if (this.wyw != null) {
                f = C6091a.m9575f(1, this.wyw) + 0;
            } else {
                f = 0;
            }
            if (this.wdK != null) {
                f += C6091a.m9575f(2, this.wdK);
            }
            if (this.wdO != null) {
                f += C6091a.m9575f(3, this.wdO);
            }
            if (this.vQq != null) {
                f += C6091a.m9575f(4, this.vQq);
            }
            int bs = f + C6091a.m9572bs(5, this.Scene);
            AppMethodBeat.m2505o(28758);
            return bs;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (f = C1331a.getNextFieldNumber(c6086a); f > 0; f = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, f)) {
                    c6086a.ems();
                }
            }
            if (this.wyw == null) {
                c6092b = new C6092b("Not all required fields were included: Talker");
                AppMethodBeat.m2505o(28758);
                throw c6092b;
            } else if (this.wdK == null) {
                c6092b = new C6092b("Not all required fields were included: Text");
                AppMethodBeat.m2505o(28758);
                throw c6092b;
            } else if (this.wdO == null) {
                c6092b = new C6092b("Not all required fields were included: MD5");
                AppMethodBeat.m2505o(28758);
                throw c6092b;
            } else if (this.vQq == null) {
                c6092b = new C6092b("Not all required fields were included: ProductId");
                AppMethodBeat.m2505o(28758);
                throw c6092b;
            } else {
                AppMethodBeat.m2505o(28758);
                return 0;
            }
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            cuq cuq = (cuq) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    cuq.wyw = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(28758);
                    return 0;
                case 2:
                    cuq.wdK = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(28758);
                    return 0;
                case 3:
                    cuq.wdO = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(28758);
                    return 0;
                case 4:
                    cuq.vQq = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(28758);
                    return 0;
                case 5:
                    cuq.Scene = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(28758);
                    return 0;
                default:
                    AppMethodBeat.m2505o(28758);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(28758);
            return -1;
        }
    }
}
