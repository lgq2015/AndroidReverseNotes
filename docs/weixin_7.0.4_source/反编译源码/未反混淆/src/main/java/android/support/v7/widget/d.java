package android.support.v7.widget;

import android.graphics.Outline;

final class d extends c {
    public d(ActionBarContainer actionBarContainer) {
        super(actionBarContainer);
    }

    public final void getOutline(Outline outline) {
        if (this.acD.acK) {
            if (this.acD.acJ != null) {
                this.acD.acJ.getOutline(outline);
            }
        } else if (this.acD.abb != null) {
            this.acD.abb.getOutline(outline);
        }
    }
}
