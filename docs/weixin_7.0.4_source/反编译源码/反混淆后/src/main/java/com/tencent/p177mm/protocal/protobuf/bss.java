package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import com.tencent.p177mm.p205bt.C1332b;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.bss */
public final class bss extends bsr {
    public int pLQ;
    public String pMd;
    public String pMe;
    public String pbn;
    public String vHu;
    public int vPy;
    public String wKQ;
    public int wUL;
    public String wUM;
    public int wUN;
    public int wUO;
    public C1332b wUP;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(48955);
        int ix;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.BaseRequest != null) {
                c6093a.mo13479iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(c6093a);
            }
            if (this.pMd != null) {
                c6093a.mo13475e(2, this.pMd);
            }
            if (this.pMe != null) {
                c6093a.mo13475e(3, this.pMe);
            }
            if (this.pbn != null) {
                c6093a.mo13475e(4, this.pbn);
            }
            c6093a.mo13480iz(5, this.pLQ);
            c6093a.mo13480iz(6, this.wUL);
            if (this.wUM != null) {
                c6093a.mo13475e(7, this.wUM);
            }
            c6093a.mo13480iz(8, this.wUN);
            c6093a.mo13480iz(9, this.wUO);
            if (this.vHu != null) {
                c6093a.mo13475e(10, this.vHu);
            }
            if (this.wKQ != null) {
                c6093a.mo13475e(11, this.wKQ);
            }
            if (this.wUP != null) {
                c6093a.mo13473c(12, this.wUP);
            }
            c6093a.mo13480iz(13, this.vPy);
            AppMethodBeat.m2505o(48955);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = C6087a.m9557ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.pMd != null) {
                ix += C6091a.m9575f(2, this.pMd);
            }
            if (this.pMe != null) {
                ix += C6091a.m9575f(3, this.pMe);
            }
            if (this.pbn != null) {
                ix += C6091a.m9575f(4, this.pbn);
            }
            ix = (ix + C6091a.m9572bs(5, this.pLQ)) + C6091a.m9572bs(6, this.wUL);
            if (this.wUM != null) {
                ix += C6091a.m9575f(7, this.wUM);
            }
            ix = (ix + C6091a.m9572bs(8, this.wUN)) + C6091a.m9572bs(9, this.wUO);
            if (this.vHu != null) {
                ix += C6091a.m9575f(10, this.vHu);
            }
            if (this.wKQ != null) {
                ix += C6091a.m9575f(11, this.wKQ);
            }
            if (this.wUP != null) {
                ix += C6091a.m9571b(12, this.wUP);
            }
            int bs = ix + C6091a.m9572bs(13, this.vPy);
            AppMethodBeat.m2505o(48955);
            return bs;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(48955);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            bss bss = (bss) objArr[1];
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
                        bss.BaseRequest = c7267hl;
                    }
                    AppMethodBeat.m2505o(48955);
                    return 0;
                case 2:
                    bss.pMd = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(48955);
                    return 0;
                case 3:
                    bss.pMe = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(48955);
                    return 0;
                case 4:
                    bss.pbn = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(48955);
                    return 0;
                case 5:
                    bss.pLQ = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(48955);
                    return 0;
                case 6:
                    bss.wUL = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(48955);
                    return 0;
                case 7:
                    bss.wUM = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(48955);
                    return 0;
                case 8:
                    bss.wUN = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(48955);
                    return 0;
                case 9:
                    bss.wUO = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(48955);
                    return 0;
                case 10:
                    bss.vHu = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(48955);
                    return 0;
                case 11:
                    bss.wKQ = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(48955);
                    return 0;
                case 12:
                    bss.wUP = c6086a2.BTU.emu();
                    AppMethodBeat.m2505o(48955);
                    return 0;
                case 13:
                    bss.vPy = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(48955);
                    return 0;
                default:
                    AppMethodBeat.m2505o(48955);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(48955);
            return -1;
        }
    }
}
