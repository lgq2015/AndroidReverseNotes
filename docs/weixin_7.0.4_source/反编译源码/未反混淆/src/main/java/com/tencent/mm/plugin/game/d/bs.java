package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import e.a.a.b;
import java.util.LinkedList;

public final class bs extends a {
    public String Title;
    public String ncA;
    public String ncB;
    public LinkedList<bt> ncz = new LinkedList();

    public bs() {
        AppMethodBeat.i(111624);
        AppMethodBeat.o(111624);
    }

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(111625);
        b bVar;
        int f;
        byte[] bArr;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            if (this.Title == null) {
                bVar = new b("Not all required fields were included: Title");
                AppMethodBeat.o(111625);
                throw bVar;
            }
            if (this.Title != null) {
                aVar.e(1, this.Title);
            }
            aVar.e(2, 8, this.ncz);
            if (this.ncA != null) {
                aVar.e(3, this.ncA);
            }
            if (this.ncB != null) {
                aVar.e(4, this.ncB);
            }
            AppMethodBeat.o(111625);
            return 0;
        } else if (i == 1) {
            if (this.Title != null) {
                f = e.a.a.b.b.a.f(1, this.Title) + 0;
            } else {
                f = 0;
            }
            f += e.a.a.a.c(2, 8, this.ncz);
            if (this.ncA != null) {
                f += e.a.a.b.b.a.f(3, this.ncA);
            }
            if (this.ncB != null) {
                f += e.a.a.b.b.a.f(4, this.ncB);
            }
            AppMethodBeat.o(111625);
            return f;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.ncz.clear();
            e.a.a.a.a aVar2 = new e.a.a.a.a(bArr, unknownTagHandler);
            for (f = a.getNextFieldNumber(aVar2); f > 0; f = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, f)) {
                    aVar2.ems();
                }
            }
            if (this.Title == null) {
                bVar = new b("Not all required fields were included: Title");
                AppMethodBeat.o(111625);
                throw bVar;
            }
            AppMethodBeat.o(111625);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            bs bsVar = (bs) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    bsVar.Title = aVar3.BTU.readString();
                    AppMethodBeat.o(111625);
                    return 0;
                case 2:
                    LinkedList Vh = aVar3.Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        bt btVar = new bt();
                        e.a.a.a.a aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = btVar.populateBuilderWithField(aVar4, btVar, a.getNextFieldNumber(aVar4))) {
                        }
                        bsVar.ncz.add(btVar);
                    }
                    AppMethodBeat.o(111625);
                    return 0;
                case 3:
                    bsVar.ncA = aVar3.BTU.readString();
                    AppMethodBeat.o(111625);
                    return 0;
                case 4:
                    bsVar.ncB = aVar3.BTU.readString();
                    AppMethodBeat.o(111625);
                    return 0;
                default:
                    AppMethodBeat.o(111625);
                    return -1;
            }
        } else {
            AppMethodBeat.o(111625);
            return -1;
        }
    }
}
