package com.tencent.p177mm.plugin.product.p737c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.plugin.product.c.f */
public final class C46132f extends C1331a {
    public C7017j phQ;
    public String phR;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(56629);
        int ix;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.phQ != null) {
                c6093a.mo13479iy(1, this.phQ.computeSize());
                this.phQ.writeFields(c6093a);
            }
            if (this.phR != null) {
                c6093a.mo13475e(2, this.phR);
            }
            AppMethodBeat.m2505o(56629);
            return 0;
        } else if (i == 1) {
            if (this.phQ != null) {
                ix = C6087a.m9557ix(1, this.phQ.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.phR != null) {
                ix += C6091a.m9575f(2, this.phR);
            }
            AppMethodBeat.m2505o(56629);
            return ix;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(56629);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            C46132f c46132f = (C46132f) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList Vh = c6086a2.mo13445Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) Vh.get(intValue);
                        C7017j c7017j = new C7017j();
                        C6086a c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = c7017j.populateBuilderWithField(c6086a3, c7017j, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c46132f.phQ = c7017j;
                    }
                    AppMethodBeat.m2505o(56629);
                    return 0;
                case 2:
                    c46132f.phR = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(56629);
                    return 0;
                default:
                    AppMethodBeat.m2505o(56629);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(56629);
            return -1;
        }
    }
}
