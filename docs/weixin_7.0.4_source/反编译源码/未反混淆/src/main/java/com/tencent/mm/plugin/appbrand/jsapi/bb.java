package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Context;
import android.content.Intent;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.wallet.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import org.json.JSONObject;

public final class bb extends a {
    public static final int CTRL_INDEX = 618;
    public static final String NAME = "openWCPayLQTDepositPlan";

    public final void a(final c cVar, JSONObject jSONObject, final int i) {
        AppMethodBeat.i(130521);
        final Context context = cVar.getContext();
        if (context == null || !(context instanceof MMActivity)) {
            cVar.M(i, j("fail", null));
            ab.e("MicroMsg.JsApiOpenWCPayLQTDepositPlan", "mmActivity is null, invoke fail!");
            AppMethodBeat.o(130521);
            return;
        }
        ((MMActivity) context).ifE = new a() {
            public final void c(int i, int i2, Intent intent) {
                AppMethodBeat.i(130520);
                if (i != (bb.this.hashCode() & CdnLogic.kBizGeneric)) {
                    AppMethodBeat.o(130520);
                    return;
                }
                if (i2 == -1) {
                    new Intent().putExtra("key_mode", 1);
                    d.H(context, "wallet", ".balance.ui.lqt.WalletLqtPlanHomeUI");
                    cVar.M(i, bb.this.j("ok", null));
                } else {
                    cVar.M(i, bb.this.j("fail", null));
                    if (!f.dlH()) {
                        h.pYm.e(14954, f.dlI(), "openWCPayLQTDepositPlan:fail");
                    }
                }
                if (!f.dlH()) {
                    f.dlJ();
                }
                AppMethodBeat.o(130520);
            }
        };
        AppBrandSysConfigWC wJ = com.tencent.mm.plugin.appbrand.a.wJ(cVar.getAppId());
        if (wJ == null) {
            cVar.M(i, j("fail", null));
            ab.e("MicroMsg.JsApiOpenWCPayLQTDepositPlan", "sysConfig is null, invoke fail!");
            AppMethodBeat.o(130521);
            return;
        }
        o wI = com.tencent.mm.plugin.appbrand.a.wI(cVar.getAppId());
        if (wI == null) {
            cVar.M(i, j("fail", null));
            ab.e("MicroMsg.JsApiOpenWCPayLQTDepositPlan", "runtime is null, invoke fail!");
            AppMethodBeat.o(130521);
            return;
        }
        ab.d("MicroMsg.JsApiOpenWCPayLQTDepositPlan", "do openWCPayLQTDepositPlan");
        String currentUrl = wI.asV().getCurrentUrl();
        Intent intent = new Intent();
        intent.putExtra("appId", cVar.getAppId());
        intent.putExtra("timeStamp", jSONObject.optString("timeStamp"));
        intent.putExtra("nonceStr", jSONObject.optString("nonceStr"));
        intent.putExtra("packageExt", jSONObject.optString("package"));
        intent.putExtra("signtype", jSONObject.optString("signType"));
        intent.putExtra("paySignature", jSONObject.optString("paySign"));
        intent.putExtra("pay_channel", jSONObject.optString("pay_channel"));
        intent.putExtra("wxapp_username", wJ.cwz);
        intent.putExtra("jsapi_scene", 21);
        intent.putExtra("command_word", NAME);
        intent.putExtra("wxapp_path", currentUrl);
        intent.putExtra("source_type", 2);
        d.b(context, "wallet", ".ui.WalletJsApiAdapterUI", intent, hashCode() & CdnLogic.kBizGeneric);
        AppMethodBeat.o(130521);
    }
}
