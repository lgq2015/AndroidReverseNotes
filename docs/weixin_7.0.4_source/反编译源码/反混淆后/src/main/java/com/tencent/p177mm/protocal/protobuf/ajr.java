package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.ajr */
public final class ajr extends bsr {
    public biv woh;
    public String wpp;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(48854);
        int ix;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.BaseRequest != null) {
                c6093a.mo13479iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(c6093a);
            }
            if (this.wpp != null) {
                c6093a.mo13475e(2, this.wpp);
            }
            if (this.woh != null) {
                c6093a.mo13479iy(3, this.woh.computeSize());
                this.woh.writeFields(c6093a);
            }
            AppMethodBeat.m2505o(48854);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = C6087a.m9557ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.wpp != null) {
                ix += C6091a.m9575f(2, this.wpp);
            }
            if (this.woh != null) {
                ix += C6087a.m9557ix(3, this.woh.computeSize());
            }
            AppMethodBeat.m2505o(48854);
            return ix;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(48854);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            ajr ajr = (ajr) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            byte[] bArr;
            C6086a c6086a3;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        C7267hl c7267hl = new C7267hl();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = c7267hl.populateBuilderWithField(c6086a3, c7267hl, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        ajr.BaseRequest = c7267hl;
                    }
                    AppMethodBeat.m2505o(48854);
                    return 0;
                case 2:
                    ajr.wpp = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(48854);
                    return 0;
                case 3:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        biv biv = new biv();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = biv.populateBuilderWithField(c6086a3, biv, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        ajr.woh = biv;
                    }
                    AppMethodBeat.m2505o(48854);
                    return 0;
                default:
                    AppMethodBeat.m2505o(48854);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(48854);
            return -1;
        }
    }
}
