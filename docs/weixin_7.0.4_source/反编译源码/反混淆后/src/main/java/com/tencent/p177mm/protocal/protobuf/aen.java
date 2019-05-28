package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import com.tencent.p177mm.p205bt.C1332b;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.aen */
public final class aen extends bsr {
    public String app_id;
    public String kbU;
    public C1332b keu;
    public int kmq;
    public String kmr;
    public String kms;
    public String kmt;
    public String kmu;
    public int time_stamp;
    public int wmp;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(89067);
        int ix;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.BaseRequest != null) {
                c6093a.mo13479iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(c6093a);
            }
            if (this.app_id != null) {
                c6093a.mo13475e(2, this.app_id);
            }
            c6093a.mo13480iz(3, this.kmq);
            if (this.kmr != null) {
                c6093a.mo13475e(4, this.kmr);
            }
            if (this.kms != null) {
                c6093a.mo13475e(5, this.kms);
            }
            c6093a.mo13480iz(6, this.time_stamp);
            if (this.kmt != null) {
                c6093a.mo13475e(7, this.kmt);
            }
            if (this.kbU != null) {
                c6093a.mo13475e(8, this.kbU);
            }
            if (this.kmu != null) {
                c6093a.mo13475e(9, this.kmu);
            }
            if (this.keu != null) {
                c6093a.mo13473c(10, this.keu);
            }
            c6093a.mo13480iz(11, this.wmp);
            AppMethodBeat.m2505o(89067);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = C6087a.m9557ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.app_id != null) {
                ix += C6091a.m9575f(2, this.app_id);
            }
            ix += C6091a.m9572bs(3, this.kmq);
            if (this.kmr != null) {
                ix += C6091a.m9575f(4, this.kmr);
            }
            if (this.kms != null) {
                ix += C6091a.m9575f(5, this.kms);
            }
            ix += C6091a.m9572bs(6, this.time_stamp);
            if (this.kmt != null) {
                ix += C6091a.m9575f(7, this.kmt);
            }
            if (this.kbU != null) {
                ix += C6091a.m9575f(8, this.kbU);
            }
            if (this.kmu != null) {
                ix += C6091a.m9575f(9, this.kmu);
            }
            if (this.keu != null) {
                ix += C6091a.m9571b(10, this.keu);
            }
            int bs = ix + C6091a.m9572bs(11, this.wmp);
            AppMethodBeat.m2505o(89067);
            return bs;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(89067);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            aen aen = (aen) objArr[1];
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
                        aen.BaseRequest = c7267hl;
                    }
                    AppMethodBeat.m2505o(89067);
                    return 0;
                case 2:
                    aen.app_id = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(89067);
                    return 0;
                case 3:
                    aen.kmq = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(89067);
                    return 0;
                case 4:
                    aen.kmr = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(89067);
                    return 0;
                case 5:
                    aen.kms = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(89067);
                    return 0;
                case 6:
                    aen.time_stamp = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(89067);
                    return 0;
                case 7:
                    aen.kmt = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(89067);
                    return 0;
                case 8:
                    aen.kbU = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(89067);
                    return 0;
                case 9:
                    aen.kmu = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(89067);
                    return 0;
                case 10:
                    aen.keu = c6086a2.BTU.emu();
                    AppMethodBeat.m2505o(89067);
                    return 0;
                case 11:
                    aen.wmp = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(89067);
                    return 0;
                default:
                    AppMethodBeat.m2505o(89067);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(89067);
            return -1;
        }
    }
}
