package com.tencent.filter.a;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.m.o;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class q extends BaseFilter {
    private BaseFilter bNF;

    public q() {
        super(GLSLRender.bJB);
    }

    public final void ApplyGLSLFilter(boolean z, float f, float f2) {
        AppMethodBeat.i(86457);
        this.bNF = new ab();
        this.bNF.addParam(new o("inputImageTexture2", "sh/dongjing_lf.png", 33986));
        setNextFilter(this.bNF, null);
        super.ApplyGLSLFilter(z, f, f2);
        AppMethodBeat.o(86457);
    }
}
