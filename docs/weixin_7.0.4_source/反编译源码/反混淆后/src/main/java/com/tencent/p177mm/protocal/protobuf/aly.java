package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.aly */
public final class aly extends bsr {
    public String ndT;
    public String wqY;
    public int wqZ;
    public LinkedList<bts> wra = new LinkedList();
    public int wrb;

    public aly() {
        AppMethodBeat.m2504i(56819);
        AppMethodBeat.m2505o(56819);
    }

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(56820);
        int ix;
        byte[] bArr;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.BaseRequest != null) {
                c6093a.mo13479iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(c6093a);
            }
            if (this.wqY != null) {
                c6093a.mo13475e(2, this.wqY);
            }
            c6093a.mo13480iz(3, this.wqZ);
            c6093a.mo13474e(4, 8, this.wra);
            if (this.ndT != null) {
                c6093a.mo13475e(5, this.ndT);
            }
            c6093a.mo13480iz(6, this.wrb);
            AppMethodBeat.m2505o(56820);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = C6087a.m9557ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.wqY != null) {
                ix += C6091a.m9575f(2, this.wqY);
            }
            ix = (ix + C6091a.m9572bs(3, this.wqZ)) + C6087a.m9552c(4, 8, this.wra);
            if (this.ndT != null) {
                ix += C6091a.m9575f(5, this.ndT);
            }
            int bs = ix + C6091a.m9572bs(6, this.wrb);
            AppMethodBeat.m2505o(56820);
            return bs;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.wra.clear();
            C6086a c6086a = new C6086a(bArr, unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(56820);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            aly aly = (aly) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
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
                        aly.BaseRequest = c7267hl;
                    }
                    AppMethodBeat.m2505o(56820);
                    return 0;
                case 2:
                    aly.wqY = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(56820);
                    return 0;
                case 3:
                    aly.wqZ = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(56820);
                    return 0;
                case 4:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        bts bts = new bts();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = bts.populateBuilderWithField(c6086a3, bts, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        aly.wra.add(bts);
                    }
                    AppMethodBeat.m2505o(56820);
                    return 0;
                case 5:
                    aly.ndT = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(56820);
                    return 0;
                case 6:
                    aly.wrb = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(56820);
                    return 0;
                default:
                    AppMethodBeat.m2505o(56820);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(56820);
            return -1;
        }
    }
}
