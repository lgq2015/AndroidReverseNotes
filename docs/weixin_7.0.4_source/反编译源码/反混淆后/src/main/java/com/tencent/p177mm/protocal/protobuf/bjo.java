package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import com.tencent.p177mm.p205bt.C1332b;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.bjo */
public final class bjo extends bsr {
    public int vAM;
    public int vRK;
    public C15319aw vRP;
    public String wMV;
    public String wMW;
    public C1332b wMX;
    public int wMY;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(56903);
        int ix;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.BaseRequest != null) {
                c6093a.mo13479iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(c6093a);
            }
            if (this.wMV != null) {
                c6093a.mo13475e(2, this.wMV);
            }
            if (this.wMW != null) {
                c6093a.mo13475e(3, this.wMW);
            }
            if (this.wMX != null) {
                c6093a.mo13473c(4, this.wMX);
            }
            c6093a.mo13480iz(5, this.vRK);
            c6093a.mo13480iz(6, this.vAM);
            c6093a.mo13480iz(7, this.wMY);
            if (this.vRP != null) {
                c6093a.mo13479iy(8, this.vRP.computeSize());
                this.vRP.writeFields(c6093a);
            }
            AppMethodBeat.m2505o(56903);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = C6087a.m9557ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.wMV != null) {
                ix += C6091a.m9575f(2, this.wMV);
            }
            if (this.wMW != null) {
                ix += C6091a.m9575f(3, this.wMW);
            }
            if (this.wMX != null) {
                ix += C6091a.m9571b(4, this.wMX);
            }
            ix = ((ix + C6091a.m9572bs(5, this.vRK)) + C6091a.m9572bs(6, this.vAM)) + C6091a.m9572bs(7, this.wMY);
            if (this.vRP != null) {
                ix += C6087a.m9557ix(8, this.vRP.computeSize());
            }
            AppMethodBeat.m2505o(56903);
            return ix;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(56903);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            bjo bjo = (bjo) objArr[1];
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
                        bjo.BaseRequest = c7267hl;
                    }
                    AppMethodBeat.m2505o(56903);
                    return 0;
                case 2:
                    bjo.wMV = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(56903);
                    return 0;
                case 3:
                    bjo.wMW = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(56903);
                    return 0;
                case 4:
                    bjo.wMX = c6086a2.BTU.emu();
                    AppMethodBeat.m2505o(56903);
                    return 0;
                case 5:
                    bjo.vRK = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(56903);
                    return 0;
                case 6:
                    bjo.vAM = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(56903);
                    return 0;
                case 7:
                    bjo.wMY = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(56903);
                    return 0;
                case 8:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        C15319aw c15319aw = new C15319aw();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = c15319aw.populateBuilderWithField(c6086a3, c15319aw, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        bjo.vRP = c15319aw;
                    }
                    AppMethodBeat.m2505o(56903);
                    return 0;
                default:
                    AppMethodBeat.m2505o(56903);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(56903);
            return -1;
        }
    }
}
