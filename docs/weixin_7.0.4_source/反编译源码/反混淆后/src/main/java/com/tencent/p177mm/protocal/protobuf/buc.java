package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.buc */
public final class buc extends C1331a {
    public String wCK;
    public LinkedList<C7257dh> wVV = new LinkedList();

    public buc() {
        AppMethodBeat.m2504i(28620);
        AppMethodBeat.m2505o(28620);
    }

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(28621);
        int c;
        byte[] bArr;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            c6093a.mo13474e(1, 8, this.wVV);
            if (this.wCK != null) {
                c6093a.mo13475e(2, this.wCK);
            }
            AppMethodBeat.m2505o(28621);
            return 0;
        } else if (i == 1) {
            c = C6087a.m9552c(1, 8, this.wVV) + 0;
            if (this.wCK != null) {
                c += C6091a.m9575f(2, this.wCK);
            }
            AppMethodBeat.m2505o(28621);
            return c;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.wVV.clear();
            C6086a c6086a = new C6086a(bArr, unknownTagHandler);
            for (c = C1331a.getNextFieldNumber(c6086a); c > 0; c = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, c)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(28621);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            buc buc = (buc) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList Vh = c6086a2.mo13445Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        C7257dh c7257dh = new C7257dh();
                        C6086a c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = c7257dh.populateBuilderWithField(c6086a3, c7257dh, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        buc.wVV.add(c7257dh);
                    }
                    AppMethodBeat.m2505o(28621);
                    return 0;
                case 2:
                    buc.wCK = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(28621);
                    return 0;
                default:
                    AppMethodBeat.m2505o(28621);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(28621);
            return -1;
        }
    }
}
