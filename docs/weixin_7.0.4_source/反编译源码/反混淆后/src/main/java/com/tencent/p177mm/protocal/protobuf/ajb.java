package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.C6092b;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.ajb */
public final class ajb extends bsr {
    public String vBa;
    public String woV;
    public String woW;
    public C40545mk woX;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(59563);
        C6092b c6092b;
        int ix;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.woV == null) {
                c6092b = new C6092b("Not all required fields were included: FunctionMsgID");
                AppMethodBeat.m2505o(59563);
                throw c6092b;
            }
            if (this.BaseRequest != null) {
                c6093a.mo13479iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(c6093a);
            }
            if (this.woV != null) {
                c6093a.mo13475e(2, this.woV);
            }
            if (this.woW != null) {
                c6093a.mo13475e(3, this.woW);
            }
            if (this.vBa != null) {
                c6093a.mo13475e(4, this.vBa);
            }
            if (this.woX != null) {
                c6093a.mo13479iy(5, this.woX.computeSize());
                this.woX.writeFields(c6093a);
            }
            AppMethodBeat.m2505o(59563);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = C6087a.m9557ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.woV != null) {
                ix += C6091a.m9575f(2, this.woV);
            }
            if (this.woW != null) {
                ix += C6091a.m9575f(3, this.woW);
            }
            if (this.vBa != null) {
                ix += C6091a.m9575f(4, this.vBa);
            }
            if (this.woX != null) {
                ix += C6087a.m9557ix(5, this.woX.computeSize());
            }
            AppMethodBeat.m2505o(59563);
            return ix;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            if (this.woV == null) {
                c6092b = new C6092b("Not all required fields were included: FunctionMsgID");
                AppMethodBeat.m2505o(59563);
                throw c6092b;
            }
            AppMethodBeat.m2505o(59563);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            ajb ajb = (ajb) objArr[1];
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
                        ajb.BaseRequest = c7267hl;
                    }
                    AppMethodBeat.m2505o(59563);
                    return 0;
                case 2:
                    ajb.woV = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(59563);
                    return 0;
                case 3:
                    ajb.woW = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(59563);
                    return 0;
                case 4:
                    ajb.vBa = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(59563);
                    return 0;
                case 5:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        C40545mk c40545mk = new C40545mk();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = c40545mk.populateBuilderWithField(c6086a3, c40545mk, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        ajb.woX = c40545mk;
                    }
                    AppMethodBeat.m2505o(59563);
                    return 0;
                default:
                    AppMethodBeat.m2505o(59563);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(59563);
            return -1;
        }
    }
}
