package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.bru */
public final class bru extends bsr {
    public int cKB;
    public String nSX;
    public String nXl;
    public String wKQ;
    public String wTV;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(70487);
        int ix;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.BaseRequest != null) {
                c6093a.mo13479iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(c6093a);
            }
            if (this.nSX != null) {
                c6093a.mo13475e(2, this.nSX);
            }
            if (this.wKQ != null) {
                c6093a.mo13475e(3, this.wKQ);
            }
            c6093a.mo13480iz(4, this.cKB);
            if (this.nXl != null) {
                c6093a.mo13475e(5, this.nXl);
            }
            if (this.wTV != null) {
                c6093a.mo13475e(6, this.wTV);
            }
            AppMethodBeat.m2505o(70487);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = C6087a.m9557ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.nSX != null) {
                ix += C6091a.m9575f(2, this.nSX);
            }
            if (this.wKQ != null) {
                ix += C6091a.m9575f(3, this.wKQ);
            }
            ix += C6091a.m9572bs(4, this.cKB);
            if (this.nXl != null) {
                ix += C6091a.m9575f(5, this.nXl);
            }
            if (this.wTV != null) {
                ix += C6091a.m9575f(6, this.wTV);
            }
            AppMethodBeat.m2505o(70487);
            return ix;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(70487);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            bru bru = (bru) objArr[1];
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
                        bru.BaseRequest = c7267hl;
                    }
                    AppMethodBeat.m2505o(70487);
                    return 0;
                case 2:
                    bru.nSX = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(70487);
                    return 0;
                case 3:
                    bru.wKQ = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(70487);
                    return 0;
                case 4:
                    bru.cKB = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(70487);
                    return 0;
                case 5:
                    bru.nXl = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(70487);
                    return 0;
                case 6:
                    bru.wTV = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(70487);
                    return 0;
                default:
                    AppMethodBeat.m2505o(70487);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(70487);
            return -1;
        }
    }
}
