package p1121d.p1122a.p1123a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: d.a.a.a */
public final class C44604a extends C1331a {
    public String BTs;
    public String BTt;
    public int BTu;
    public C16442f BTv;
    public String url;
    public String wqf;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(57005);
        int f;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.BTs != null) {
                c6093a.mo13475e(1, this.BTs);
            }
            if (this.BTt != null) {
                c6093a.mo13475e(2, this.BTt);
            }
            c6093a.mo13480iz(3, this.BTu);
            if (this.url != null) {
                c6093a.mo13475e(4, this.url);
            }
            if (this.BTv != null) {
                c6093a.mo13479iy(5, this.BTv.computeSize());
                this.BTv.writeFields(c6093a);
            }
            if (this.wqf != null) {
                c6093a.mo13475e(6, this.wqf);
            }
            AppMethodBeat.m2505o(57005);
            return 0;
        } else if (i == 1) {
            if (this.BTs != null) {
                f = C6091a.m9575f(1, this.BTs) + 0;
            } else {
                f = 0;
            }
            if (this.BTt != null) {
                f += C6091a.m9575f(2, this.BTt);
            }
            f += C6091a.m9572bs(3, this.BTu);
            if (this.url != null) {
                f += C6091a.m9575f(4, this.url);
            }
            if (this.BTv != null) {
                f += C6087a.m9557ix(5, this.BTv.computeSize());
            }
            if (this.wqf != null) {
                f += C6091a.m9575f(6, this.wqf);
            }
            AppMethodBeat.m2505o(57005);
            return f;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (f = C1331a.getNextFieldNumber(c6086a); f > 0; f = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, f)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(57005);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            C44604a c44604a = (C44604a) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    c44604a.BTs = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(57005);
                    return 0;
                case 2:
                    c44604a.BTt = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(57005);
                    return 0;
                case 3:
                    c44604a.BTu = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(57005);
                    return 0;
                case 4:
                    c44604a.url = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(57005);
                    return 0;
                case 5:
                    LinkedList Vh = c6086a2.mo13445Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) Vh.get(intValue);
                        C16442f c16442f = new C16442f();
                        C6086a c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = c16442f.populateBuilderWithField(c6086a3, c16442f, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c44604a.BTv = c16442f;
                    }
                    AppMethodBeat.m2505o(57005);
                    return 0;
                case 6:
                    c44604a.wqf = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(57005);
                    return 0;
                default:
                    AppMethodBeat.m2505o(57005);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(57005);
            return -1;
        }
    }
}
