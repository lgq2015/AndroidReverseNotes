package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.C6092b;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.amy */
public final class amy extends bsr {
    public int fKj;
    public int wrA;
    public int wrB;
    public SKBuiltinBuffer_t wrz;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(105146);
        C6092b c6092b;
        int ix;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.wrz == null) {
                c6092b = new C6092b("Not all required fields were included: Url");
                AppMethodBeat.m2505o(105146);
                throw c6092b;
            }
            if (this.BaseRequest != null) {
                c6093a.mo13479iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(c6093a);
            }
            c6093a.mo13480iz(2, this.fKj);
            if (this.wrz != null) {
                c6093a.mo13479iy(3, this.wrz.computeSize());
                this.wrz.writeFields(c6093a);
            }
            c6093a.mo13480iz(4, this.wrA);
            c6093a.mo13480iz(5, this.wrB);
            AppMethodBeat.m2505o(105146);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = C6087a.m9557ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            ix += C6091a.m9572bs(2, this.fKj);
            if (this.wrz != null) {
                ix += C6087a.m9557ix(3, this.wrz.computeSize());
            }
            int bs = (ix + C6091a.m9572bs(4, this.wrA)) + C6091a.m9572bs(5, this.wrB);
            AppMethodBeat.m2505o(105146);
            return bs;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            if (this.wrz == null) {
                c6092b = new C6092b("Not all required fields were included: Url");
                AppMethodBeat.m2505o(105146);
                throw c6092b;
            }
            AppMethodBeat.m2505o(105146);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            amy amy = (amy) objArr[1];
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
                        amy.BaseRequest = c7267hl;
                    }
                    AppMethodBeat.m2505o(105146);
                    return 0;
                case 2:
                    amy.fKj = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(105146);
                    return 0;
                case 3:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        SKBuiltinBuffer_t sKBuiltinBuffer_t = new SKBuiltinBuffer_t();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = sKBuiltinBuffer_t.populateBuilderWithField(c6086a3, sKBuiltinBuffer_t, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        amy.wrz = sKBuiltinBuffer_t;
                    }
                    AppMethodBeat.m2505o(105146);
                    return 0;
                case 4:
                    amy.wrA = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(105146);
                    return 0;
                case 5:
                    amy.wrB = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(105146);
                    return 0;
                default:
                    AppMethodBeat.m2505o(105146);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(105146);
            return -1;
        }
    }
}
