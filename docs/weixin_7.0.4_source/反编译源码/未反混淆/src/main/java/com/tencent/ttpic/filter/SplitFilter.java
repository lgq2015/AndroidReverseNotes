package com.tencent.ttpic.filter;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.h;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class SplitFilter extends BaseFilter {
    private float xPos = 0.0f;

    public SplitFilter() {
        super(GLSLRender.bJB);
    }

    public void setxPos(float f) {
        this.xPos = f;
    }

    private void updatePosition() {
        AppMethodBeat.i(82952);
        float f = (this.xPos * 2.0f) - 1.0f;
        float f2 = this.xPos;
        setPositions(new float[]{f, -1.0f, f, 1.0f, 1.0f, 1.0f, 1.0f, -1.0f});
        setTexCords(new float[]{f2, 0.0f, f2, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f});
        AppMethodBeat.o(82952);
    }

    public void RenderProcess(int i, int i2, int i3, int i4, double d, h hVar) {
        AppMethodBeat.i(82953);
        updatePosition();
        super.RenderProcess(i, i2, i3, i4, d, hVar);
        AppMethodBeat.o(82953);
    }
}
