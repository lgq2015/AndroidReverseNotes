package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.C6092b;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.anz */
public final class anz extends btd {
    public boolean vKO;
    public LinkedList<bxi> vKP = new LinkedList();
    public boolean wsw;
    public LinkedList<bxi> wsx = new LinkedList();

    public anz() {
        AppMethodBeat.m2504i(114968);
        AppMethodBeat.m2505o(114968);
    }

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(114969);
        C6092b c6092b;
        int ix;
        byte[] bArr;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.BaseResponse == null) {
                c6092b = new C6092b("Not all required fields were included: BaseResponse");
                AppMethodBeat.m2505o(114969);
                throw c6092b;
            }
            if (this.BaseResponse != null) {
                c6093a.mo13479iy(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(c6093a);
            }
            c6093a.mo13471aO(2, this.vKO);
            c6093a.mo13474e(3, 8, this.vKP);
            c6093a.mo13471aO(4, this.wsw);
            c6093a.mo13474e(5, 8, this.wsx);
            AppMethodBeat.m2505o(114969);
            return 0;
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = C6087a.m9557ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            int fv = (((ix + (C6091a.m9576fv(2) + 1)) + C6087a.m9552c(3, 8, this.vKP)) + (C6091a.m9576fv(4) + 1)) + C6087a.m9552c(5, 8, this.wsx);
            AppMethodBeat.m2505o(114969);
            return fv;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.vKP.clear();
            this.wsx.clear();
            C6086a c6086a = new C6086a(bArr, unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            if (this.BaseResponse == null) {
                c6092b = new C6092b("Not all required fields were included: BaseResponse");
                AppMethodBeat.m2505o(114969);
                throw c6092b;
            }
            AppMethodBeat.m2505o(114969);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            anz anz = (anz) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            C6086a c6086a3;
            boolean z;
            bxi bxi;
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
                        anz.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.m2505o(114969);
                    return 0;
                case 2:
                    anz.vKO = c6086a2.BTU.ehX();
                    AppMethodBeat.m2505o(114969);
                    return 0;
                case 3:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        bxi = new bxi();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = bxi.populateBuilderWithField(c6086a3, bxi, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        anz.vKP.add(bxi);
                    }
                    AppMethodBeat.m2505o(114969);
                    return 0;
                case 4:
                    anz.wsw = c6086a2.BTU.ehX();
                    AppMethodBeat.m2505o(114969);
                    return 0;
                case 5:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        bxi = new bxi();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = bxi.populateBuilderWithField(c6086a3, bxi, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        anz.wsx.add(bxi);
                    }
                    AppMethodBeat.m2505o(114969);
                    return 0;
                default:
                    AppMethodBeat.m2505o(114969);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(114969);
            return -1;
        }
    }
}
