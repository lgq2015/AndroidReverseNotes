package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.ato */
public final class ato extends C1331a {
    public int jBv;
    public LinkedList<atn> jBw = new LinkedList();

    public ato() {
        AppMethodBeat.m2504i(58909);
        AppMethodBeat.m2505o(58909);
    }

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(58910);
        int bs;
        byte[] bArr;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            c6093a.mo13480iz(1, this.jBv);
            c6093a.mo13474e(2, 8, this.jBw);
            AppMethodBeat.m2505o(58910);
            return 0;
        } else if (i == 1) {
            bs = (C6091a.m9572bs(1, this.jBv) + 0) + C6087a.m9552c(2, 8, this.jBw);
            AppMethodBeat.m2505o(58910);
            return bs;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.jBw.clear();
            C6086a c6086a = new C6086a(bArr, unknownTagHandler);
            for (bs = C1331a.getNextFieldNumber(c6086a); bs > 0; bs = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, bs)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(58910);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            ato ato = (ato) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    ato.jBv = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(58910);
                    return 0;
                case 2:
                    LinkedList Vh = c6086a2.mo13445Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        atn atn = new atn();
                        C6086a c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = atn.populateBuilderWithField(c6086a3, atn, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        ato.jBw.add(atn);
                    }
                    AppMethodBeat.m2505o(58910);
                    return 0;
                default:
                    AppMethodBeat.m2505o(58910);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(58910);
            return -1;
        }
    }
}
