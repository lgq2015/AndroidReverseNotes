package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.C6092b;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.yl */
public final class C30246yl extends C1331a {
    public SKBuiltinBuffer_t vLz;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(80052);
        C6092b c6092b;
        int ix;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.vLz == null) {
                c6092b = new C6092b("Not all required fields were included: RandomEncryKey");
                AppMethodBeat.m2505o(80052);
                throw c6092b;
            }
            if (this.vLz != null) {
                c6093a.mo13479iy(1, this.vLz.computeSize());
                this.vLz.writeFields(c6093a);
            }
            AppMethodBeat.m2505o(80052);
            return 0;
        } else if (i == 1) {
            if (this.vLz != null) {
                ix = C6087a.m9557ix(1, this.vLz.computeSize()) + 0;
            } else {
                ix = 0;
            }
            AppMethodBeat.m2505o(80052);
            return ix;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            if (this.vLz == null) {
                c6092b = new C6092b("Not all required fields were included: RandomEncryKey");
                AppMethodBeat.m2505o(80052);
                throw c6092b;
            }
            AppMethodBeat.m2505o(80052);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            C30246yl c30246yl = (C30246yl) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList Vh = c6086a2.mo13445Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) Vh.get(intValue);
                        SKBuiltinBuffer_t sKBuiltinBuffer_t = new SKBuiltinBuffer_t();
                        C6086a c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = sKBuiltinBuffer_t.populateBuilderWithField(c6086a3, sKBuiltinBuffer_t, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c30246yl.vLz = sKBuiltinBuffer_t;
                    }
                    AppMethodBeat.m2505o(80052);
                    return 0;
                default:
                    AppMethodBeat.m2505o(80052);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(80052);
            return -1;
        }
    }
}
