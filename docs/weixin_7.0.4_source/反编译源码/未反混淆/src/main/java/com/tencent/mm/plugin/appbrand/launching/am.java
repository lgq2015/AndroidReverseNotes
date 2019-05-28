package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.x;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.task.h;
import com.tencent.mm.protocal.protobuf.qv;
import com.tencent.mm.protocal.protobuf.qw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class am {
    private final String appId;
    private final String cvZ;
    private final String hoo;
    private final boolean hop;

    public enum a {
        Ok,
        Fail,
        Timeout,
        CgiFail,
        ResponseInvalid,
        AwaitFail;

        static {
            AppMethodBeat.o(131997);
        }

        public static a pa(int i) {
            AppMethodBeat.i(131996);
            if (i < 0) {
                AppMethodBeat.o(131996);
                return null;
            }
            for (a aVar : values()) {
                if (aVar.ordinal() == i) {
                    AppMethodBeat.o(131996);
                    return aVar;
                }
            }
            AppMethodBeat.o(131996);
            return null;
        }
    }

    public am(String str, String str2, String str3, boolean z) {
        this.appId = str;
        this.cvZ = str2;
        this.hoo = str3;
        this.hop = z;
    }

    private void o(int i, String str, String str2) {
        AppMethodBeat.i(131998);
        if (f.auV().a(this.appId, i, str, str2, 0, 0) && this.hop) {
            h.bt(this.appId, 2);
        }
        AppMethodBeat.o(131998);
    }

    public final int aAa() {
        AppMethodBeat.i(131999);
        String str = this.appId;
        String str2 = this.cvZ;
        String str3 = this.hoo;
        com.tencent.mm.ai.b.a aVar = new com.tencent.mm.ai.b.a();
        qv qvVar = new qv();
        qvVar.csB = str;
        qvVar.vXR = str2;
        qvVar.vXS = str3;
        aVar.fsJ = qvVar;
        aVar.fsK = new qw();
        aVar.uri = "/cgi-bin/mmbiz-bin/wxaapp/checkdemoinfo";
        aVar.fsI = 1124;
        com.tencent.mm.ai.a.a c = x.c(aVar.acD());
        int ordinal;
        if (c.errType == 0 && c.errCode == 0) {
            try {
                qw qwVar = (qw) c.fsy;
                if (qwVar.vXT == null) {
                    ab.e("MicroMsg.AppBrand.PrepareStepOpBanCheckDemoInfo", "CgiCheckDemoInfo, appId %s, null wxaapp resp", this.appId);
                    ordinal = a.ResponseInvalid.ordinal();
                    AppMethodBeat.o(131999);
                    return ordinal;
                }
                ab.i("MicroMsg.AppBrand.PrepareStepOpBanCheckDemoInfo", "CgiCheckDemoInfo, appId %s, wxa.ErrCode %d, has_new_demo %b, url %s, md5 %s", this.appId, Integer.valueOf(qwVar.vXT.luT), Boolean.valueOf(qwVar.vXU), qwVar.vXV, qwVar.vXW);
                if (qwVar.vXT.luT != 0) {
                    ordinal = qwVar.vXT.luT;
                    AppMethodBeat.o(131999);
                    return ordinal;
                }
                if (!(!qwVar.vXU || bo.isNullOrNil(qwVar.vXW) || bo.isNullOrNil(qwVar.vXV))) {
                    o(2, qwVar.vXV, qwVar.vXW);
                }
                if (!(!qwVar.vXX || bo.isNullOrNil(qwVar.vXZ) || bo.isNullOrNil(qwVar.vXY))) {
                    o(10001, qwVar.vXY, qwVar.vXZ);
                }
                if (!bo.isNullOrNil(qwVar.vYa)) {
                    ((l) f.E(l.class)).n(this.appId, 2, qwVar.vYa);
                }
                ordinal = a.Ok.ordinal();
                AppMethodBeat.o(131999);
                return ordinal;
            } catch (Exception e) {
                ab.printErrStackTrace("MicroMsg.AppBrand.PrepareStepOpBanCheckDemoInfo", e, "CgiCheckDemoInfo, appId %s, cast response failed", this.appId);
                ordinal = a.ResponseInvalid.ordinal();
                AppMethodBeat.o(131999);
                return ordinal;
            }
        }
        ab.e("MicroMsg.AppBrand.PrepareStepOpBanCheckDemoInfo", "CgiCheckDemoInfo, appId %s, errType %d, errCode %d, errMsg %s", this.appId, Integer.valueOf(c.errType), Integer.valueOf(c.errCode), c.aIm);
        ordinal = a.CgiFail.ordinal();
        AppMethodBeat.o(131999);
        return ordinal;
    }
}
