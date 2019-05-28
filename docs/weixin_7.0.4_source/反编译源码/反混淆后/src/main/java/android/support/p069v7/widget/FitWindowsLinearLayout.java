package android.support.p069v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.p069v7.widget.C0684ad.C0683a;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: android.support.v7.widget.FitWindowsLinearLayout */
public class FitWindowsLinearLayout extends LinearLayout implements C0684ad {
    private C0683a aiK;

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setOnFitSystemWindowsListener(C0683a c0683a) {
        this.aiK = c0683a;
    }

    /* Access modifiers changed, original: protected */
    public boolean fitSystemWindows(Rect rect) {
        if (this.aiK != null) {
            this.aiK.mo1944f(rect);
        }
        return super.fitSystemWindows(rect);
    }
}
