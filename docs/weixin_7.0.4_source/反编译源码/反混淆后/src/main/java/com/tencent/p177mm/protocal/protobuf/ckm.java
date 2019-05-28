package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.ckm */
public final class ckm extends bsr {
    public int boZ;
    public int scene;
    public String session_id;
    public String username;
    public int vOO;
    public int xiq;
    public int xir;
    public int xis;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(96304);
        int ix;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.BaseRequest != null) {
                c6093a.mo13479iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(c6093a);
            }
            c6093a.mo13480iz(2, this.scene);
            c6093a.mo13480iz(3, this.xiq);
            c6093a.mo13480iz(4, this.vOO);
            c6093a.mo13480iz(5, this.xir);
            c6093a.mo13480iz(6, this.xis);
            if (this.username != null) {
                c6093a.mo13475e(7, this.username);
            }
            c6093a.mo13480iz(8, this.boZ);
            if (this.session_id != null) {
                c6093a.mo13475e(9, this.session_id);
            }
            AppMethodBeat.m2505o(96304);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = C6087a.m9557ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            ix = ((((ix + C6091a.m9572bs(2, this.scene)) + C6091a.m9572bs(3, this.xiq)) + C6091a.m9572bs(4, this.vOO)) + C6091a.m9572bs(5, this.xir)) + C6091a.m9572bs(6, this.xis);
            if (this.username != null) {
                ix += C6091a.m9575f(7, this.username);
            }
            ix += C6091a.m9572bs(8, this.boZ);
            if (this.session_id != null) {
                ix += C6091a.m9575f(9, this.session_id);
            }
            AppMethodBeat.m2505o(96304);
            return ix;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(96304);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            ckm ckm = (ckm) objArr[1];
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
                        ckm.BaseRequest = c7267hl;
                    }
                    AppMethodBeat.m2505o(96304);
                    return 0;
                case 2:
                    ckm.scene = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(96304);
                    return 0;
                case 3:
                    ckm.xiq = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(96304);
                    return 0;
                case 4:
                    ckm.vOO = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(96304);
                    return 0;
                case 5:
                    ckm.xir = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(96304);
                    return 0;
                case 6:
                    ckm.xis = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(96304);
                    return 0;
                case 7:
                    ckm.username = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(96304);
                    return 0;
                case 8:
                    ckm.boZ = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(96304);
                    return 0;
                case 9:
                    ckm.session_id = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(96304);
                    return 0;
                default:
                    AppMethodBeat.m2505o(96304);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(96304);
            return -1;
        }
    }
}
