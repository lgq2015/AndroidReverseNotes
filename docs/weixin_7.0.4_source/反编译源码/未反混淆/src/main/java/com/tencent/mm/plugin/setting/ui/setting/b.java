package com.tencent.mm.plugin.setting.ui.setting;

import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b {
    LinearLayout qqB;
    LinearLayout qqC;
    LinearLayout qqD;
    LinearLayout qqE;
    LinearLayout qqF;

    b() {
    }

    public final void WA(String str) {
        AppMethodBeat.i(127689);
        if (str.equals("downloading")) {
            this.qqB.setVisibility(0);
            this.qqC.setVisibility(8);
            this.qqD.setVisibility(8);
            this.qqE.setVisibility(8);
            this.qqF.setVisibility(8);
            AppMethodBeat.o(127689);
        } else if (str.equals("downloaded")) {
            this.qqB.setVisibility(8);
            this.qqC.setVisibility(0);
            this.qqD.setVisibility(8);
            this.qqE.setVisibility(8);
            this.qqF.setVisibility(8);
            AppMethodBeat.o(127689);
        } else if (str.equals("undownloaded")) {
            this.qqB.setVisibility(8);
            this.qqC.setVisibility(8);
            this.qqD.setVisibility(0);
            this.qqE.setVisibility(8);
            this.qqF.setVisibility(8);
            AppMethodBeat.o(127689);
        } else if (str.equals("using")) {
            this.qqB.setVisibility(8);
            this.qqC.setVisibility(8);
            this.qqD.setVisibility(8);
            this.qqE.setVisibility(0);
            this.qqF.setVisibility(8);
            AppMethodBeat.o(127689);
        } else if (str.equals("canceling")) {
            this.qqB.setVisibility(8);
            this.qqC.setVisibility(8);
            this.qqD.setVisibility(8);
            this.qqE.setVisibility(8);
            this.qqF.setVisibility(0);
            AppMethodBeat.o(127689);
        } else {
            AppMethodBeat.o(127689);
        }
    }
}
