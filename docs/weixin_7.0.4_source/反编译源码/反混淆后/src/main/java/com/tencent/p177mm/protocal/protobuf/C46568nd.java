package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.C6092b;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.nd */
public final class C46568nd extends bsr {
    public String vHD;
    public int vRK;
    public int vRL;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(56735);
        C6092b c6092b;
        int ix;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.vHD == null) {
                c6092b = new C6092b("Not all required fields were included: ReqKey");
                AppMethodBeat.m2505o(56735);
                throw c6092b;
            }
            if (this.BaseRequest != null) {
                c6093a.mo13479iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(c6093a);
            }
            c6093a.mo13480iz(2, this.vRK);
            c6093a.mo13480iz(3, this.vRL);
            if (this.vHD != null) {
                c6093a.mo13475e(4, this.vHD);
            }
            AppMethodBeat.m2505o(56735);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = C6087a.m9557ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            ix = (ix + C6091a.m9572bs(2, this.vRK)) + C6091a.m9572bs(3, this.vRL);
            if (this.vHD != null) {
                ix += C6091a.m9575f(4, this.vHD);
            }
            AppMethodBeat.m2505o(56735);
            return ix;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            if (this.vHD == null) {
                c6092b = new C6092b("Not all required fields were included: ReqKey");
                AppMethodBeat.m2505o(56735);
                throw c6092b;
            }
            AppMethodBeat.m2505o(56735);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            C46568nd c46568nd = (C46568nd) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList Vh = c6086a2.mo13445Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) Vh.get(intValue);
                        C7267hl c7267hl = new C7267hl();
                        C6086a c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = c7267hl.populateBuilderWithField(c6086a3, c7267hl, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c46568nd.BaseRequest = c7267hl;
                    }
                    AppMethodBeat.m2505o(56735);
                    return 0;
                case 2:
                    c46568nd.vRK = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(56735);
                    return 0;
                case 3:
                    c46568nd.vRL = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(56735);
                    return 0;
                case 4:
                    c46568nd.vHD = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(56735);
                    return 0;
                default:
                    AppMethodBeat.m2505o(56735);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(56735);
            return -1;
        }
    }
}
