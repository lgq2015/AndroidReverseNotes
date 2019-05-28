package com.tencent.ttpic.model;

import com.tencent.filter.BaseFilter;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class TotalScoreActItem extends SingleScoreActItem {
    public TotalScoreActItem(CaptureActItem captureActItem, BaseFilter baseFilter) {
        super(captureActItem, baseFilter);
    }

    /* Access modifiers changed, original: protected */
    public int getScore(CanvasItem canvasItem) {
        AppMethodBeat.i(83551);
        int totalScore = this.captureActItem.getTotalScore();
        AppMethodBeat.o(83551);
        return totalScore;
    }

    /* Access modifiers changed, original: protected */
    public int[] getScoreTexture(CanvasItem canvasItem) {
        AppMethodBeat.i(83552);
        int[] totalScoreTexture = this.captureActItem.getTotalScoreTexture();
        AppMethodBeat.o(83552);
        return totalScoreTexture;
    }
}
