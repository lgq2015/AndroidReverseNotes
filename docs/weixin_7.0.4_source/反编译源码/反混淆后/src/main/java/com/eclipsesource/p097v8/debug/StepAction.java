package com.eclipsesource.p097v8.debug;

import com.tencent.matrix.trace.core.AppMethodBeat;

/* renamed from: com.eclipsesource.v8.debug.StepAction */
public enum StepAction {
    STEP_OUT(0),
    STEP_NEXT(1),
    STEP_IN(2),
    STEP_FRAME(3);
    
    int index;

    static {
        AppMethodBeat.m2505o(74920);
    }

    private StepAction(int i) {
        this.index = i;
    }
}
