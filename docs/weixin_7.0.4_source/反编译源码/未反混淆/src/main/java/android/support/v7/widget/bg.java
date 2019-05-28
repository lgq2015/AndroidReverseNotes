package android.support.v7.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.R;

final class bg {
    private final View WL;
    private final LayoutParams auN = new LayoutParams();
    private final Rect auO = new Rect();
    private final int[] auP = new int[2];
    private final int[] auQ = new int[2];
    private final Context mContext;
    private final TextView ma;

    bg(Context context) {
        this.mContext = context;
        this.WL = LayoutInflater.from(this.mContext).inflate(R.layout.a8, null);
        this.ma = (TextView) this.WL.findViewById(R.id.kf);
        this.auN.setTitle(getClass().getSimpleName());
        this.auN.packageName = this.mContext.getPackageName();
        this.auN.type = 1002;
        this.auN.width = -2;
        this.auN.height = -2;
        this.auN.format = -3;
        this.auN.windowAnimations = R.style.d_;
        this.auN.flags = 24;
    }

    /* Access modifiers changed, original: final */
    public final void a(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (isShowing()) {
            hide();
        }
        this.ma.setText(charSequence);
        a(view, i, i2, z, this.auN);
        ((WindowManager) this.mContext.getSystemService("window")).addView(this.WL, this.auN);
    }

    /* Access modifiers changed, original: final */
    public final void hide() {
        if (isShowing()) {
            ((WindowManager) this.mContext.getSystemService("window")).removeView(this.WL);
        }
    }

    private boolean isShowing() {
        return this.WL.getParent() != null;
    }

    private void a(View view, int i, int i2, boolean z, LayoutParams layoutParams) {
        int dimensionPixelOffset;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset2 = this.mContext.getResources().getDimensionPixelOffset(R.dimen.a_o);
        if (view.getWidth() < dimensionPixelOffset2) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset2) {
            dimensionPixelOffset = this.mContext.getResources().getDimensionPixelOffset(R.dimen.a_n);
            dimensionPixelOffset2 = i2 + dimensionPixelOffset;
            dimensionPixelOffset = i2 - dimensionPixelOffset;
        } else {
            dimensionPixelOffset2 = view.getHeight();
            dimensionPixelOffset = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.mContext.getResources().getDimensionPixelOffset(z ? R.dimen.a_r : R.dimen.a_q);
        View bU = bU(view);
        if (bU != null) {
            bU.getWindowVisibleDisplayFrame(this.auO);
            if (this.auO.left < 0 && this.auO.top < 0) {
                Resources resources = this.mContext.getResources();
                int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    identifier = resources.getDimensionPixelSize(identifier);
                } else {
                    identifier = 0;
                }
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                this.auO.set(0, identifier, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            bU.getLocationOnScreen(this.auQ);
            view.getLocationOnScreen(this.auP);
            int[] iArr = this.auP;
            iArr[0] = iArr[0] - this.auQ[0];
            iArr = this.auP;
            iArr[1] = iArr[1] - this.auQ[1];
            layoutParams.x = (this.auP[0] + i) - (bU.getWidth() / 2);
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
            this.WL.measure(makeMeasureSpec, makeMeasureSpec);
            makeMeasureSpec = this.WL.getMeasuredHeight();
            dimensionPixelOffset = ((dimensionPixelOffset + this.auP[1]) - dimensionPixelOffset3) - makeMeasureSpec;
            dimensionPixelOffset2 = (dimensionPixelOffset2 + this.auP[1]) + dimensionPixelOffset3;
            if (z) {
                if (dimensionPixelOffset < 0) {
                    layoutParams.y = dimensionPixelOffset2;
                    return;
                }
            } else if (makeMeasureSpec + dimensionPixelOffset2 <= this.auO.height()) {
                layoutParams.y = dimensionPixelOffset2;
                return;
            }
            layoutParams.y = dimensionPixelOffset;
        }
    }

    private static View bU(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof LayoutParams) && ((LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }
}
