package com.tencent.mm.plugin.wallet;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.at;
import com.tencent.mm.plugin.wallet.a.s;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.pluginsdk.b.c;
import com.tencent.mm.pluginsdk.o;

public class Plugin implements c {
    public o createApplication() {
        return null;
    }

    public b getContactWidgetFactory() {
        return null;
    }

    public at createSubCore() {
        AppMethodBeat.i(45195);
        s sVar = new s();
        AppMethodBeat.o(45195);
        return sVar;
    }
}
