package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.rq */
public final class C46583rq extends C1331a {
    public LinkedList<btc> vYX = new LinkedList();

    public C46583rq() {
        AppMethodBeat.m2504i(80034);
        AppMethodBeat.m2505o(80034);
    }

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(80035);
        int c;
        byte[] bArr;
        if (i == 0) {
            ((C6093a) objArr[0]).mo13474e(1, 8, this.vYX);
            AppMethodBeat.m2505o(80035);
            return 0;
        } else if (i == 1) {
            c = C6087a.m9552c(1, 8, this.vYX) + 0;
            AppMethodBeat.m2505o(80035);
            return c;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.vYX.clear();
            C6086a c6086a = new C6086a(bArr, unknownTagHandler);
            for (c = C1331a.getNextFieldNumber(c6086a); c > 0; c = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, c)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(80035);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            C46583rq c46583rq = (C46583rq) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList Vh = c6086a2.mo13445Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        btc btc = new btc();
                        C6086a c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = btc.populateBuilderWithField(c6086a3, btc, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c46583rq.vYX.add(btc);
                    }
                    AppMethodBeat.m2505o(80035);
                    return 0;
                default:
                    AppMethodBeat.m2505o(80035);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(80035);
            return -1;
        }
    }
}
