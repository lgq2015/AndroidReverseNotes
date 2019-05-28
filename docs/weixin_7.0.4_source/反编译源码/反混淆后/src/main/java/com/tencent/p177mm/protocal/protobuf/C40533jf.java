package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.C6092b;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.jf */
public final class C40533jf extends btd {
    public int kdT;
    public String kdU;
    public bks vLc;
    public bhg vLd;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(48781);
        C6092b c6092b;
        int ix;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.BaseResponse == null) {
                c6092b = new C6092b("Not all required fields were included: BaseResponse");
                AppMethodBeat.m2505o(48781);
                throw c6092b;
            }
            if (this.BaseResponse != null) {
                c6093a.mo13479iy(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(c6093a);
            }
            c6093a.mo13480iz(2, this.kdT);
            if (this.kdU != null) {
                c6093a.mo13475e(3, this.kdU);
            }
            if (this.vLc != null) {
                c6093a.mo13479iy(6, this.vLc.computeSize());
                this.vLc.writeFields(c6093a);
            }
            if (this.vLd != null) {
                c6093a.mo13479iy(7, this.vLd.computeSize());
                this.vLd.writeFields(c6093a);
            }
            AppMethodBeat.m2505o(48781);
            return 0;
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = C6087a.m9557ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            ix += C6091a.m9572bs(2, this.kdT);
            if (this.kdU != null) {
                ix += C6091a.m9575f(3, this.kdU);
            }
            if (this.vLc != null) {
                ix += C6087a.m9557ix(6, this.vLc.computeSize());
            }
            if (this.vLd != null) {
                ix += C6087a.m9557ix(7, this.vLd.computeSize());
            }
            AppMethodBeat.m2505o(48781);
            return ix;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            if (this.BaseResponse == null) {
                c6092b = new C6092b("Not all required fields were included: BaseResponse");
                AppMethodBeat.m2505o(48781);
                throw c6092b;
            }
            AppMethodBeat.m2505o(48781);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            C40533jf c40533jf = (C40533jf) objArr[1];
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
                        BaseResponse baseResponse = new BaseResponse();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = baseResponse.populateBuilderWithField(c6086a3, baseResponse, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c40533jf.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.m2505o(48781);
                    return 0;
                case 2:
                    c40533jf.kdT = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(48781);
                    return 0;
                case 3:
                    c40533jf.kdU = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(48781);
                    return 0;
                case 6:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        bks bks = new bks();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = bks.populateBuilderWithField(c6086a3, bks, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c40533jf.vLc = bks;
                    }
                    AppMethodBeat.m2505o(48781);
                    return 0;
                case 7:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        bhg bhg = new bhg();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = bhg.populateBuilderWithField(c6086a3, bhg, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c40533jf.vLd = bhg;
                    }
                    AppMethodBeat.m2505o(48781);
                    return 0;
                default:
                    AppMethodBeat.m2505o(48781);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(48781);
            return -1;
        }
    }
}
