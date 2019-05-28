package com.tencent.p177mm.plugin.shake.p509d.p510a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.network.C1902e;
import com.tencent.p177mm.network.C1918k;
import com.tencent.p177mm.network.C1929q;
import com.tencent.p177mm.p183ai.C1202f;
import com.tencent.p177mm.p183ai.C1207m;
import com.tencent.p177mm.p183ai.C1207m.C1206b;
import com.tencent.p177mm.p183ai.C7472b;
import com.tencent.p177mm.p183ai.C7472b.C1196a;
import com.tencent.p177mm.protocal.protobuf.aou;
import com.tencent.p177mm.protocal.protobuf.aov;
import com.tencent.p177mm.sdk.platformtools.C4990ab;

/* renamed from: com.tencent.mm.plugin.shake.d.a.b */
public final class C13259b extends C1207m implements C1918k {
    public C7472b ehh;
    private C1202f ehi;
    private String qtG;
    private int scene;

    public C13259b(String str, int i) {
        this.qtG = str;
        this.scene = i;
    }

    /* renamed from: a */
    public final int mo4456a(C1902e c1902e, C1202f c1202f) {
        AppMethodBeat.m2504i(24604);
        this.ehi = c1202f;
        C1196a c1196a = new C1196a();
        c1196a.fsJ = new aou();
        c1196a.fsK = new aov();
        c1196a.uri = "/cgi-bin/micromsg-bin/gettvinfo";
        c1196a.fsI = 552;
        c1196a.fsL = 0;
        c1196a.fsM = 0;
        this.ehh = c1196a.acD();
        aou aou = (aou) this.ehh.fsG.fsP;
        aou.wsX = this.qtG;
        aou.Scene = this.scene;
        int a = mo4457a(c1902e, this.ehh, this);
        AppMethodBeat.m2505o(24604);
        return a;
    }

    /* renamed from: b */
    public final C1206b mo4468b(C1929q c1929q) {
        AppMethodBeat.m2504i(24605);
        aou aou = (aou) ((C7472b) c1929q).fsG.fsP;
        C1206b c1206b;
        if (aou.Scene < 0 || aou.wsX == null || aou.wsX.length() <= 0) {
            C4990ab.m7413e("MicroMsg.scanner.NetSceneGetTVInfo", "ERR: Security Check Failed, Scene = %s", Integer.valueOf(aou.Scene));
            c1206b = C1206b.EFailed;
            AppMethodBeat.m2505o(24605);
            return c1206b;
        }
        c1206b = C1206b.EOk;
        AppMethodBeat.m2505o(24605);
        return c1206b;
    }

    /* renamed from: a */
    public final void mo4498a(int i, int i2, int i3, String str, C1929q c1929q, byte[] bArr) {
        AppMethodBeat.m2504i(24606);
        C4990ab.m7410d("MicroMsg.scanner.NetSceneGetTVInfo", "onGYNetEnd errtype:" + i2 + " errcode:" + i3 + " errMsg:" + str);
        this.ehi.onSceneEnd(i2, i3, str, this);
        AppMethodBeat.m2505o(24606);
    }

    public final int getType() {
        return 552;
    }
}
