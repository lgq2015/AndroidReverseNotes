package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import com.tencent.p177mm.p205bt.C1332b;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.C6092b;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.aio */
public final class aio extends btd {
    public C1332b woA;
    public C1332b woy;
    public int woz;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(80072);
        C6092b c6092b;
        int ix;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.BaseResponse == null) {
                c6092b = new C6092b("Not all required fields were included: BaseResponse");
                AppMethodBeat.m2505o(80072);
                throw c6092b;
            }
            if (this.BaseResponse != null) {
                c6093a.mo13479iy(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(c6093a);
            }
            c6093a.mo13480iz(3, this.woz);
            if (this.woA != null) {
                c6093a.mo13473c(4, this.woA);
            }
            if (this.woy != null) {
                c6093a.mo13473c(5, this.woy);
            }
            AppMethodBeat.m2505o(80072);
            return 0;
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = C6087a.m9557ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            ix += C6091a.m9572bs(3, this.woz);
            if (this.woA != null) {
                ix += C6091a.m9571b(4, this.woA);
            }
            if (this.woy != null) {
                ix += C6091a.m9571b(5, this.woy);
            }
            AppMethodBeat.m2505o(80072);
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
                AppMethodBeat.m2505o(80072);
                throw c6092b;
            }
            AppMethodBeat.m2505o(80072);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            aio aio = (aio) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList Vh = c6086a2.mo13445Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) Vh.get(intValue);
                        BaseResponse baseResponse = new BaseResponse();
                        C6086a c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = baseResponse.populateBuilderWithField(c6086a3, baseResponse, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        aio.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.m2505o(80072);
                    return 0;
                case 3:
                    aio.woz = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(80072);
                    return 0;
                case 4:
                    aio.woA = c6086a2.BTU.emu();
                    AppMethodBeat.m2505o(80072);
                    return 0;
                case 5:
                    aio.woy = c6086a2.BTU.emu();
                    AppMethodBeat.m2505o(80072);
                    return 0;
                default:
                    AppMethodBeat.m2505o(80072);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(80072);
            return -1;
        }
    }
}
