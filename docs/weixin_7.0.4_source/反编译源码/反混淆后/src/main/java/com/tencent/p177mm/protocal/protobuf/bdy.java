package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.bdy */
public final class bdy extends C1331a {
    public String desc;
    public String title;
    public String vTT;
    public int wHD;
    public int wHE;
    public String wdd;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(56863);
        int f;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.title != null) {
                c6093a.mo13475e(1, this.title);
            }
            if (this.desc != null) {
                c6093a.mo13475e(2, this.desc);
            }
            if (this.wdd != null) {
                c6093a.mo13475e(3, this.wdd);
            }
            c6093a.mo13480iz(4, this.wHD);
            c6093a.mo13480iz(5, this.wHE);
            if (this.vTT != null) {
                c6093a.mo13475e(6, this.vTT);
            }
            AppMethodBeat.m2505o(56863);
            return 0;
        } else if (i == 1) {
            if (this.title != null) {
                f = C6091a.m9575f(1, this.title) + 0;
            } else {
                f = 0;
            }
            if (this.desc != null) {
                f += C6091a.m9575f(2, this.desc);
            }
            if (this.wdd != null) {
                f += C6091a.m9575f(3, this.wdd);
            }
            f = (f + C6091a.m9572bs(4, this.wHD)) + C6091a.m9572bs(5, this.wHE);
            if (this.vTT != null) {
                f += C6091a.m9575f(6, this.vTT);
            }
            AppMethodBeat.m2505o(56863);
            return f;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (f = C1331a.getNextFieldNumber(c6086a); f > 0; f = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, f)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(56863);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            bdy bdy = (bdy) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    bdy.title = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(56863);
                    return 0;
                case 2:
                    bdy.desc = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(56863);
                    return 0;
                case 3:
                    bdy.wdd = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(56863);
                    return 0;
                case 4:
                    bdy.wHD = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(56863);
                    return 0;
                case 5:
                    bdy.wHE = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(56863);
                    return 0;
                case 6:
                    bdy.vTT = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(56863);
                    return 0;
                default:
                    AppMethodBeat.m2505o(56863);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(56863);
            return -1;
        }
    }
}
