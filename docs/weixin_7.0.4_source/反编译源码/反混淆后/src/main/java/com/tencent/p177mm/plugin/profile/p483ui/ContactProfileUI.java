package com.tencent.p177mm.plugin.profile.p483ui;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p612ui.statusbar.DrawStatusBarPreference;

/* renamed from: com.tencent.mm.plugin.profile.ui.ContactProfileUI */
public class ContactProfileUI extends DrawStatusBarPreference {
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        AppMethodBeat.m2503at(this, z);
    }

    public void onCreate(Bundle bundle) {
        AppMethodBeat.m2504i(23426);
        super.onCreate(bundle);
        AppMethodBeat.m2505o(23426);
    }

    /* renamed from: JC */
    public final int mo8452JC() {
        AppMethodBeat.m2504i(23427);
        int JC = super.mo8452JC();
        AppMethodBeat.m2505o(23427);
        return JC;
    }
}
