package p1121d.p1122a.p1123a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: d.a.a.f */
public final class C16442f extends C1331a {
    public String wMk;
    public String wMl;
    public int wMm;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(57011);
        int f;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.wMk != null) {
                c6093a.mo13475e(1, this.wMk);
            }
            if (this.wMl != null) {
                c6093a.mo13475e(2, this.wMl);
            }
            c6093a.mo13480iz(3, this.wMm);
            AppMethodBeat.m2505o(57011);
            return 0;
        } else if (i == 1) {
            if (this.wMk != null) {
                f = C6091a.m9575f(1, this.wMk) + 0;
            } else {
                f = 0;
            }
            if (this.wMl != null) {
                f += C6091a.m9575f(2, this.wMl);
            }
            int bs = f + C6091a.m9572bs(3, this.wMm);
            AppMethodBeat.m2505o(57011);
            return bs;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (f = C1331a.getNextFieldNumber(c6086a); f > 0; f = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, f)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(57011);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            C16442f c16442f = (C16442f) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    c16442f.wMk = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(57011);
                    return 0;
                case 2:
                    c16442f.wMl = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(57011);
                    return 0;
                case 3:
                    c16442f.wMm = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(57011);
                    return 0;
                default:
                    AppMethodBeat.m2505o(57011);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(57011);
            return -1;
        }
    }
}
