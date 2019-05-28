package com.tencent.p177mm.plugin.card.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.kernel.C1720g;
import com.tencent.p177mm.network.C1902e;
import com.tencent.p177mm.network.C1918k;
import com.tencent.p177mm.network.C1929q;
import com.tencent.p177mm.p183ai.C1202f;
import com.tencent.p177mm.p183ai.C1207m;
import com.tencent.p177mm.p183ai.C7472b;
import com.tencent.p177mm.p183ai.C7472b.C1196a;
import com.tencent.p177mm.protocal.protobuf.agd;
import com.tencent.p177mm.protocal.protobuf.age;
import com.tencent.p177mm.sdk.platformtools.C4990ab;

/* renamed from: com.tencent.mm.plugin.card.model.x */
public final class C45788x extends C1207m implements C1918k {
    private final C7472b ehh;
    private C1202f ehi;
    private String ked = "";

    public C45788x() {
        AppMethodBeat.m2504i(87886);
        C1196a c1196a = new C1196a();
        c1196a.fsJ = new agd();
        c1196a.fsK = new age();
        c1196a.uri = "/cgi-bin/micromsg-bin/getcardconfiginfo";
        c1196a.fsI = 692;
        c1196a.fsL = 0;
        c1196a.fsM = 0;
        this.ehh = c1196a.acD();
        AppMethodBeat.m2505o(87886);
    }

    public final int getType() {
        return 692;
    }

    /* renamed from: a */
    public final int mo4456a(C1902e c1902e, C1202f c1202f) {
        AppMethodBeat.m2504i(87887);
        this.ehi = c1202f;
        int a = mo4457a(c1902e, this.ehh, this);
        AppMethodBeat.m2505o(87887);
        return a;
    }

    /* renamed from: a */
    public final void mo4498a(int i, int i2, int i3, String str, C1929q c1929q, byte[] bArr) {
        AppMethodBeat.m2504i(87888);
        C4990ab.m7416i("MicroMsg.NetSceneGetCardConfigInfo", "onGYNetEnd, errType = " + i2 + " errCode = " + i3);
        if (i2 == 0 && i3 == 0) {
            this.ked = ((age) this.ehh.fsH.fsP).kdS;
            C1720g.m3536RP().mo5239Ry().set(282885, this.ked);
        }
        this.ehi.onSceneEnd(i2, i3, str, this);
        AppMethodBeat.m2505o(87888);
    }
}
