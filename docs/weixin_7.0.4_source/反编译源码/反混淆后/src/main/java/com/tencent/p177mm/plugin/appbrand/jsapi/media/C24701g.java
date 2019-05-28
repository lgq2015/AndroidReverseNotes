package com.tencent.p177mm.plugin.appbrand.jsapi.media;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.C25738R;
import com.tencent.p177mm.sdk.p1574f.C40612a;
import com.tencent.p177mm.sdk.platformtools.C4996ah;
import com.tencent.p177mm.sdk.platformtools.C5004al;
import com.tencent.p177mm.sdk.platformtools.C5046bo;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.g */
public final class C24701g extends C19443a {
    public static final int CTRL_INDEX = 217;
    public static final String NAME = "saveImageToPhotosAlbum";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.g$1 */
    class C247021 implements Runnable {
        C247021() {
        }

        public final void run() {
            AppMethodBeat.m2504i(114366);
            Toast.makeText(C4996ah.getContext(), C4996ah.getContext().getString(C25738R.string.b3r, new Object[]{C40612a.dlz()}), 1).show();
            AppMethodBeat.m2505o(114366);
        }
    }

    /* Access modifiers changed, original: final */
    /* renamed from: Bk */
    public final boolean mo34579Bk(String str) {
        AppMethodBeat.m2504i(114367);
        boolean contains = C5046bo.nullAsNil(str).toLowerCase().contains("image");
        AppMethodBeat.m2505o(114367);
        return contains;
    }

    /* Access modifiers changed, original: final */
    /* renamed from: Bl */
    public final String mo34580Bl(String str) {
        AppMethodBeat.m2504i(114368);
        String RL = C40612a.m70042RL(str);
        AppMethodBeat.m2505o(114368);
        return RL;
    }

    /* Access modifiers changed, original: final */
    /* renamed from: Bm */
    public final void mo34581Bm(String str) {
        AppMethodBeat.m2504i(114369);
        C5004al.m7441d(new C247021());
        AppMethodBeat.m2505o(114369);
    }
}
