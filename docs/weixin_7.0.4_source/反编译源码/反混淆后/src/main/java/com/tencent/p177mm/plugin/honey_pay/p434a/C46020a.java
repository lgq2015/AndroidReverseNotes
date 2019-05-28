package com.tencent.p177mm.plugin.honey_pay.p434a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.network.C1929q;
import com.tencent.p177mm.p183ai.C7472b;
import com.tencent.p177mm.p183ai.C7472b.C1196a;
import com.tencent.p177mm.protocal.protobuf.C40565rb;
import com.tencent.p177mm.protocal.protobuf.C46580ra;
import com.tencent.p177mm.sdk.platformtools.C4990ab;
import com.tencent.p177mm.wallet_core.p649c.C44428p;

/* renamed from: com.tencent.mm.plugin.honey_pay.a.a */
public final class C46020a extends C44428p {
    private final String TAG = "MicroMsg.NetSceneCheckHoneyPayer";
    public C40565rb nqx;

    public C46020a() {
        AppMethodBeat.m2504i(41717);
        C1196a c1196a = new C1196a();
        c1196a.fsJ = new C46580ra();
        c1196a.fsK = new C40565rb();
        c1196a.fsI = 2618;
        c1196a.uri = "/cgi-bin/mmpay-bin/checkhoneypayer";
        c1196a.fsL = 0;
        c1196a.fsM = 0;
        this.ehh = c1196a.acD();
        AppMethodBeat.m2505o(41717);
    }

    public final int getType() {
        return 2618;
    }

    /* renamed from: b */
    public final void mo6948b(int i, int i2, String str, C1929q c1929q) {
        AppMethodBeat.m2504i(41718);
        C4990ab.m7417i("MicroMsg.NetSceneCheckHoneyPayer", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        this.nqx = (C40565rb) ((C7472b) c1929q).fsH.fsP;
        C4990ab.m7417i("MicroMsg.NetSceneCheckHoneyPayer", "retcode: %s, retmsg: %s", Integer.valueOf(this.nqx.kdT), this.nqx.kdU);
        if (this.ehi != null) {
            this.ehi.onSceneEnd(i, i2, str, this);
        }
        AppMethodBeat.m2505o(41718);
    }

    /* renamed from: f */
    public final void mo6949f(C1929q c1929q) {
        C40565rb c40565rb = (C40565rb) ((C7472b) c1929q).fsH.fsP;
        this.AfC = c40565rb.kdT;
        this.AfD = c40565rb.kdU;
    }
}
