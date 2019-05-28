package com.tencent.p177mm.plugin.game.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p208bz.C1338a;
import com.tencent.p177mm.plugin.appbrand.jsapi.C33250az;

/* renamed from: com.tencent.mm.plugin.game.widget.TextProgressBar */
public class TextProgressBar extends ProgressBar {
    /* renamed from: EV */
    private int f4382EV;
    private int iaQ;
    private Context mContext;
    private Paint mPaint;
    private String mText;

    public TextProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mContext = context;
    }

    public void setProgress(int i) {
        AppMethodBeat.m2504i(112413);
        setText(i);
        super.setProgress(i);
        AppMethodBeat.m2505o(112413);
    }

    /* Access modifiers changed, original: protected|declared_synchronized */
    @SuppressLint({"DrawAllocation"})
    public synchronized void onDraw(Canvas canvas) {
        AppMethodBeat.m2504i(112414);
        super.onDraw(canvas);
        this.mPaint = new Paint();
        this.mPaint.setAntiAlias(true);
        this.mPaint.setColor(Color.rgb(69, C33250az.CTRL_INDEX, 26));
        this.mPaint.setTextSize((float) this.iaQ);
        Rect rect = new Rect();
        this.mPaint.getTextBounds(this.mText, 0, this.mText.length(), rect);
        float width = (float) ((getWidth() / 2) - rect.centerX());
        float height = (float) ((getHeight() / 2) - rect.centerY());
        canvas.drawText(this.mText, width, height, this.mPaint);
        float width2 = (((float) this.f4382EV) / 100.0f) * ((float) getWidth());
        if (width2 > width) {
            Paint paint = new Paint();
            paint.setColor(-1);
            paint.setAntiAlias(true);
            paint.setTextSize((float) this.iaQ);
            RectF rectF = new RectF(0.0f, 0.0f, width2, (float) getHeight());
            canvas.save();
            canvas.clipRect(rectF);
            canvas.drawText(this.mText, width, height, paint);
            canvas.restore();
        }
        AppMethodBeat.m2505o(112414);
    }

    public void setTextSize(int i) {
        AppMethodBeat.m2504i(112415);
        this.iaQ = C1338a.fromDPToPix(this.mContext, i);
        AppMethodBeat.m2505o(112415);
    }

    private void setText(int i) {
        AppMethodBeat.m2504i(112416);
        this.f4382EV = i;
        this.mText = String.valueOf(i) + "%";
        AppMethodBeat.m2505o(112416);
    }
}
