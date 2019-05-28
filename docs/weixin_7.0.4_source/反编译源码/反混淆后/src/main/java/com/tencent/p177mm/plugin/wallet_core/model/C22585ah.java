package com.tencent.p177mm.plugin.wallet_core.model;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.sdk.platformtools.C4990ab;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.tencent.mm.plugin.wallet_core.model.ah */
public final class C22585ah {
    public ArrayList<Bankcard> tCN = new ArrayList();
    public String tCO;

    public C22585ah() {
        AppMethodBeat.m2504i(46944);
        AppMethodBeat.m2505o(46944);
    }

    public final Bankcard acB(String str) {
        Bankcard bankcard;
        AppMethodBeat.m2504i(46945);
        if (this.tCN.size() > 0) {
            Iterator it = this.tCN.iterator();
            while (it.hasNext()) {
                bankcard = (Bankcard) it.next();
                if (bankcard.field_bindSerial.equals(str)) {
                    break;
                }
            }
            bankcard = null;
            if (bankcard == null) {
                C4990ab.m7412e("MicroMsg.WalletRepaymentBankcardMgr", "getBankcardBySerialNo return null");
            } else {
                C4990ab.m7416i("MicroMsg.WalletRepaymentBankcardMgr", "getBankcardBySerialNo succ");
            }
        } else {
            C4990ab.m7412e("MicroMsg.WalletRepaymentBankcardMgr", "repayment bankcard list size is 0");
            bankcard = null;
        }
        AppMethodBeat.m2505o(46945);
        return bankcard;
    }

    public final boolean cPU() {
        AppMethodBeat.m2504i(46946);
        if (this.tCN.size() > 0) {
            AppMethodBeat.m2505o(46946);
            return true;
        }
        AppMethodBeat.m2505o(46946);
        return false;
    }

    public final Bankcard cPV() {
        AppMethodBeat.m2504i(46947);
        Bankcard bankcard;
        if (!cPU()) {
            C4990ab.m7412e("MicroMsg.WalletRepaymentBankcardMgr", "Repayment card list is null");
            AppMethodBeat.m2505o(46947);
            return null;
        } else if (TextUtils.isEmpty(this.tCO)) {
            C4990ab.m7416i("MicroMsg.WalletRepaymentBankcardMgr", "last_use_card_serialno is empty,return the first one");
            bankcard = (Bankcard) this.tCN.get(0);
            AppMethodBeat.m2505o(46947);
            return bankcard;
        } else {
            bankcard = acB(this.tCO);
            AppMethodBeat.m2505o(46947);
            return bankcard;
        }
    }
}
