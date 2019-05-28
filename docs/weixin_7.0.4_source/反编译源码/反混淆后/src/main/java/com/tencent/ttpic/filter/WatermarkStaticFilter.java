package com.tencent.ttpic.filter;

import com.tencent.filter.C25624m.C25627n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.model.StickerItem;

public class WatermarkStaticFilter extends StaticStickerFilter {
    public WatermarkStaticFilter(StickerItem stickerItem, String str) {
        super(stickerItem, str);
    }

    /* Access modifiers changed, original: protected */
    public void updateTextureParam(int i, long j) {
        AppMethodBeat.m2504i(83189);
        if (this.item.wmGroup != null) {
            this.item.wmGroup.updateTexture(j);
            addParam(new C25627n("inputImageTexture2", this.item.wmGroup.getTexture(), 33986));
            this.isImageReady = true;
            AppMethodBeat.m2505o(83189);
            return;
        }
        this.isImageReady = false;
        clearTextureParam();
        AppMethodBeat.m2505o(83189);
    }

    public void ApplyGLSLFilter() {
        AppMethodBeat.m2504i(83190);
        super.ApplyGLSLFilter();
        if (this.item.wmGroup != null) {
            this.item.wmGroup.init();
        }
        AppMethodBeat.m2505o(83190);
    }

    public void clearGLSLSelf() {
        AppMethodBeat.m2504i(83191);
        super.clearGLSLSelf();
        if (this.item.wmGroup != null) {
            this.item.wmGroup.clear();
        }
        AppMethodBeat.m2505o(83191);
    }

    public void reset() {
        AppMethodBeat.m2504i(83192);
        this.item.wmGroup.reset();
        super.reset();
        AppMethodBeat.m2505o(83192);
    }
}
