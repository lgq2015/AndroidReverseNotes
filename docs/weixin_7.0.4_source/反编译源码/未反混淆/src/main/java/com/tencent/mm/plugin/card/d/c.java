package com.tencent.mm.plugin.card.d;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum c {
    CARDCODEREFRESHACTION_UNSHOWN_TIMEOUT(0),
    CARDCODEREFRESHACTION_SHOWING_TIMEOUT(1),
    CARDCODEREFRESHACTION_SNAPSHOT(2),
    CARDCODEREFRESHACTION_DOREFRESH(3),
    CARDCODEREFRESHACTION_ENTERFOREGROUND(4),
    CARDCODEREFRESHACTION_BANCODE(5),
    CARDCODEREFRESHACTION_UPDATECHANGE(6),
    CARDCODEREFRESHACTION_ENTERCHANGE(7);
    
    public int action;

    static {
        AppMethodBeat.o(88825);
    }

    private c(int i) {
        this.action = 0;
        this.action = i;
    }
}
