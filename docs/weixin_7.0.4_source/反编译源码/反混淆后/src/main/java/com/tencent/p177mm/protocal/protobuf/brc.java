package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.C6092b;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.brc */
public final class brc extends btd {
    public int wTs;
    public int wTv;
    public int wTw;
    public cob wTx;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(28616);
        C6092b c6092b;
        int ix;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.BaseResponse == null) {
                c6092b = new C6092b("Not all required fields were included: BaseResponse");
                AppMethodBeat.m2505o(28616);
                throw c6092b;
            } else if (this.wTx == null) {
                c6092b = new C6092b("Not all required fields were included: NextPiece");
                AppMethodBeat.m2505o(28616);
                throw c6092b;
            } else {
                if (this.BaseResponse != null) {
                    c6093a.mo13479iy(1, this.BaseResponse.computeSize());
                    this.BaseResponse.writeFields(c6093a);
                }
                c6093a.mo13480iz(2, this.wTv);
                c6093a.mo13480iz(3, this.wTw);
                if (this.wTx != null) {
                    c6093a.mo13479iy(4, this.wTx.computeSize());
                    this.wTx.writeFields(c6093a);
                }
                c6093a.mo13480iz(5, this.wTs);
                AppMethodBeat.m2505o(28616);
                return 0;
            }
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = C6087a.m9557ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            ix = (ix + C6091a.m9572bs(2, this.wTv)) + C6091a.m9572bs(3, this.wTw);
            if (this.wTx != null) {
                ix += C6087a.m9557ix(4, this.wTx.computeSize());
            }
            int bs = ix + C6091a.m9572bs(5, this.wTs);
            AppMethodBeat.m2505o(28616);
            return bs;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            if (this.BaseResponse == null) {
                c6092b = new C6092b("Not all required fields were included: BaseResponse");
                AppMethodBeat.m2505o(28616);
                throw c6092b;
            } else if (this.wTx == null) {
                c6092b = new C6092b("Not all required fields were included: NextPiece");
                AppMethodBeat.m2505o(28616);
                throw c6092b;
            } else {
                AppMethodBeat.m2505o(28616);
                return 0;
            }
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            brc brc = (brc) objArr[1];
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
                        brc.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.m2505o(28616);
                    return 0;
                case 2:
                    brc.wTv = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(28616);
                    return 0;
                case 3:
                    brc.wTw = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(28616);
                    return 0;
                case 4:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        cob cob = new cob();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = cob.populateBuilderWithField(c6086a3, cob, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        brc.wTx = cob;
                    }
                    AppMethodBeat.m2505o(28616);
                    return 0;
                case 5:
                    brc.wTs = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(28616);
                    return 0;
                default:
                    AppMethodBeat.m2505o(28616);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(28616);
            return -1;
        }
    }
}
