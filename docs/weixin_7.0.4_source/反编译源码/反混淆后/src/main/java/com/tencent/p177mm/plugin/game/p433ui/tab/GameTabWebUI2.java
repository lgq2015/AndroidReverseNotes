package com.tencent.p177mm.plugin.game.p433ui.tab;

import com.tencent.matrix.trace.core.AppMethodBeat;

/* renamed from: com.tencent.mm.plugin.game.ui.tab.GameTabWebUI2 */
public class GameTabWebUI2 extends GameTabWebUI {
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        AppMethodBeat.m2503at(this, z);
    }
}
