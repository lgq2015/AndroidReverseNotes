package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.C6092b;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.aoq */
public final class aoq extends bsr {
    public String jCH;
    public String luQ;
    public String vIj;
    public SKBuiltinBuffer_t vLz;
    public String wsI;
    public String wsJ;
    public String wsK;
    public String wsL;
    public String wsM;
    public int wsN;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(73716);
        C6092b c6092b;
        int ix;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.vLz == null) {
                c6092b = new C6092b("Not all required fields were included: RandomEncryKey");
                AppMethodBeat.m2505o(73716);
                throw c6092b;
            }
            if (this.BaseRequest != null) {
                c6093a.mo13479iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(c6093a);
            }
            if (this.vLz != null) {
                c6093a.mo13479iy(2, this.vLz.computeSize());
                this.vLz.writeFields(c6093a);
            }
            if (this.wsI != null) {
                c6093a.mo13475e(3, this.wsI);
            }
            if (this.wsJ != null) {
                c6093a.mo13475e(4, this.wsJ);
            }
            if (this.jCH != null) {
                c6093a.mo13475e(5, this.jCH);
            }
            if (this.wsK != null) {
                c6093a.mo13475e(6, this.wsK);
            }
            if (this.wsL != null) {
                c6093a.mo13475e(7, this.wsL);
            }
            if (this.wsM != null) {
                c6093a.mo13475e(8, this.wsM);
            }
            c6093a.mo13480iz(9, this.wsN);
            if (this.luQ != null) {
                c6093a.mo13475e(10, this.luQ);
            }
            if (this.vIj != null) {
                c6093a.mo13475e(11, this.vIj);
            }
            AppMethodBeat.m2505o(73716);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = C6087a.m9557ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.vLz != null) {
                ix += C6087a.m9557ix(2, this.vLz.computeSize());
            }
            if (this.wsI != null) {
                ix += C6091a.m9575f(3, this.wsI);
            }
            if (this.wsJ != null) {
                ix += C6091a.m9575f(4, this.wsJ);
            }
            if (this.jCH != null) {
                ix += C6091a.m9575f(5, this.jCH);
            }
            if (this.wsK != null) {
                ix += C6091a.m9575f(6, this.wsK);
            }
            if (this.wsL != null) {
                ix += C6091a.m9575f(7, this.wsL);
            }
            if (this.wsM != null) {
                ix += C6091a.m9575f(8, this.wsM);
            }
            ix += C6091a.m9572bs(9, this.wsN);
            if (this.luQ != null) {
                ix += C6091a.m9575f(10, this.luQ);
            }
            if (this.vIj != null) {
                ix += C6091a.m9575f(11, this.vIj);
            }
            AppMethodBeat.m2505o(73716);
            return ix;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            if (this.vLz == null) {
                c6092b = new C6092b("Not all required fields were included: RandomEncryKey");
                AppMethodBeat.m2505o(73716);
                throw c6092b;
            }
            AppMethodBeat.m2505o(73716);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            aoq aoq = (aoq) objArr[1];
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
                        aoq.BaseRequest = c7267hl;
                    }
                    AppMethodBeat.m2505o(73716);
                    return 0;
                case 2:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        SKBuiltinBuffer_t sKBuiltinBuffer_t = new SKBuiltinBuffer_t();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = sKBuiltinBuffer_t.populateBuilderWithField(c6086a3, sKBuiltinBuffer_t, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        aoq.vLz = sKBuiltinBuffer_t;
                    }
                    AppMethodBeat.m2505o(73716);
                    return 0;
                case 3:
                    aoq.wsI = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(73716);
                    return 0;
                case 4:
                    aoq.wsJ = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(73716);
                    return 0;
                case 5:
                    aoq.jCH = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(73716);
                    return 0;
                case 6:
                    aoq.wsK = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(73716);
                    return 0;
                case 7:
                    aoq.wsL = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(73716);
                    return 0;
                case 8:
                    aoq.wsM = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(73716);
                    return 0;
                case 9:
                    aoq.wsN = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(73716);
                    return 0;
                case 10:
                    aoq.luQ = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(73716);
                    return 0;
                case 11:
                    aoq.vIj = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(73716);
                    return 0;
                default:
                    AppMethodBeat.m2505o(73716);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(73716);
            return -1;
        }
    }
}
