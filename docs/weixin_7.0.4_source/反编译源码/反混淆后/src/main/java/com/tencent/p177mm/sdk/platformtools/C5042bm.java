package com.tencent.p177mm.sdk.platformtools;

import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.sdk.platformtools.bm */
public final class C5042bm {
    private boolean itL = false;
    private String mTag;
    private String xBR;
    ArrayList<Long> xBS;
    ArrayList<String> xBT;

    public C5042bm(String str, String str2) {
        AppMethodBeat.m2504i(52283);
        this.mTag = str;
        this.xBR = str2;
        if (!this.itL) {
            if (this.xBS == null) {
                this.xBS = new ArrayList();
                this.xBT = new ArrayList();
            } else {
                this.xBS.clear();
                this.xBT.clear();
            }
            addSplit(null);
        }
        AppMethodBeat.m2505o(52283);
    }

    public final void addSplit(String str) {
        AppMethodBeat.m2504i(52284);
        if (this.itL) {
            AppMethodBeat.m2505o(52284);
            return;
        }
        this.xBS.add(Long.valueOf(SystemClock.elapsedRealtime()));
        this.xBT.add(str);
        AppMethodBeat.m2505o(52284);
    }

    public final void dumpToLog() {
        AppMethodBeat.m2504i(52285);
        if (this.itL) {
            AppMethodBeat.m2505o(52285);
            return;
        }
        C4990ab.m7410d(this.mTag, this.xBR + ": begin");
        long longValue = ((Long) this.xBS.get(0)).longValue();
        long j = longValue;
        for (int i = 1; i < this.xBS.size(); i++) {
            j = ((Long) this.xBS.get(i)).longValue();
            C4990ab.m7410d(this.mTag, this.xBR + ":      " + (j - ((Long) this.xBS.get(i - 1)).longValue()) + " ms, " + ((String) this.xBT.get(i)));
        }
        C4990ab.m7410d(this.mTag, this.xBR + ": end, " + (j - longValue) + " ms");
        AppMethodBeat.m2505o(52285);
    }
}
