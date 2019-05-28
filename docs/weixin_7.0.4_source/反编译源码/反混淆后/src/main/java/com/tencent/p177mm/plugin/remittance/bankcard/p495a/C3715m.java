package com.tencent.p177mm.plugin.remittance.bankcard.p495a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.network.C1902e;
import com.tencent.p177mm.network.C1929q;
import com.tencent.p177mm.p183ai.C1202f;
import com.tencent.p177mm.p183ai.C7472b;
import com.tencent.p177mm.p183ai.C7472b.C1196a;
import com.tencent.p177mm.protocal.protobuf.boe;
import com.tencent.p177mm.protocal.protobuf.bof;
import com.tencent.p177mm.sdk.platformtools.C4990ab;

/* renamed from: com.tencent.mm.plugin.remittance.bankcard.a.m */
public final class C3715m extends C46169b {
    private final String TAG = "MicroMsg.NetSceneBankRemitQueryTransferList";
    private C7472b ehh;
    private C1202f ehi;
    public bof pLE;

    public C3715m() {
        AppMethodBeat.m2504i(44476);
        C1196a c1196a = new C1196a();
        c1196a.fsJ = new boe();
        c1196a.fsK = new bof();
        c1196a.fsI = 1378;
        c1196a.uri = "/cgi-bin/mmpay-bin/tsrecordlist_tsbc";
        c1196a.fsL = 0;
        c1196a.fsM = 0;
        this.ehh = c1196a.acD();
        AppMethodBeat.m2505o(44476);
    }

    public final int getType() {
        return 1378;
    }

    /* renamed from: a */
    public final int mo4456a(C1902e c1902e, C1202f c1202f) {
        AppMethodBeat.m2504i(44477);
        this.ehi = c1202f;
        int a = mo4457a(c1902e, this.ehh, this);
        AppMethodBeat.m2505o(44477);
        return a;
    }

    /* renamed from: b */
    public final void mo6948b(int i, int i2, String str, C1929q c1929q) {
        AppMethodBeat.m2504i(44478);
        C4990ab.m7417i("MicroMsg.NetSceneBankRemitQueryTransferList", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        this.pLE = (bof) ((C7472b) c1929q).fsH.fsP;
        C4990ab.m7417i("MicroMsg.NetSceneBankRemitQueryTransferList", "retcode: %s, retmsg: %s", Integer.valueOf(this.pLE.kCl), this.pLE.kCm);
        if (this.ehi != null) {
            this.ehi.onSceneEnd(i, i2, str, this);
        }
        AppMethodBeat.m2505o(44478);
    }

    /* renamed from: f */
    public final void mo6949f(C1929q c1929q) {
        bof bof = (bof) ((C7472b) c1929q).fsH.fsP;
        this.AfC = bof.kCl;
        this.AfD = bof.kCm;
    }
}
