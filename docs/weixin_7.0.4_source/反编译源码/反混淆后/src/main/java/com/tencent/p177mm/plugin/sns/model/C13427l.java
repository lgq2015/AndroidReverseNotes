package com.tencent.p177mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.network.C1902e;
import com.tencent.p177mm.network.C1918k;
import com.tencent.p177mm.network.C1929q;
import com.tencent.p177mm.p183ai.C1202f;
import com.tencent.p177mm.p183ai.C1207m;
import com.tencent.p177mm.p183ai.C7472b;
import com.tencent.p177mm.p183ai.C7472b.C1196a;
import com.tencent.p177mm.protocal.protobuf.C23374bj;
import com.tencent.p177mm.protocal.protobuf.C30170bk;
import com.tencent.p177mm.protocal.protobuf.C44105bp;
import com.tencent.p177mm.sdk.platformtools.C4990ab;
import java.util.LinkedList;

/* renamed from: com.tencent.mm.plugin.sns.model.l */
public final class C13427l extends C1207m implements C1918k {
    private C7472b ehh;
    public C1202f ehi;
    private LinkedList<C44105bp> qIT;

    public C13427l(LinkedList<C44105bp> linkedList) {
        AppMethodBeat.m2504i(36242);
        C1196a c1196a = new C1196a();
        c1196a.fsJ = new C23374bj();
        c1196a.fsK = new C30170bk();
        c1196a.uri = "/cgi-bin/mmoc-bin/ad/addatareport";
        this.ehh = c1196a.acD();
        ((C23374bj) this.ehh.fsG.fsP).vDC = linkedList;
        this.qIT = linkedList;
        C4990ab.m7417i("MicroMsg.NetSceneSnsAdDataReport", "report %d ads", Integer.valueOf(r0.vDC.size()));
        AppMethodBeat.m2505o(36242);
    }

    public final int getType() {
        return 1295;
    }

    /* renamed from: a */
    public final int mo4456a(C1902e c1902e, C1202f c1202f) {
        AppMethodBeat.m2504i(36243);
        this.ehi = c1202f;
        int a = mo4457a(c1902e, this.ehh, this);
        AppMethodBeat.m2505o(36243);
        return a;
    }

    /* renamed from: a */
    public final void mo4498a(int i, int i2, int i3, String str, C1929q c1929q, byte[] bArr) {
        AppMethodBeat.m2504i(36244);
        C4990ab.m7410d("MicroMsg.NetSceneSnsAdDataReport", "netId : " + i + " errType :" + i2 + " errCode: " + i3 + " errMsg :" + str);
        this.ehi.onSceneEnd(i2, i3, str, this);
        AppMethodBeat.m2505o(36244);
    }
}
