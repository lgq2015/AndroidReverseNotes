package com.tencent.p177mm.p634v;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.api.C32248f;
import com.tencent.p177mm.api.C45152l;
import com.tencent.p177mm.model.C1839cb;
import com.tencent.p177mm.p1088u.C44228b;
import com.tencent.p177mm.p1088u.C44228b.C23525a;
import com.tencent.p177mm.p1088u.C44230d;
import com.tencent.p177mm.p1088u.C44231e;
import com.tencent.p177mm.sdk.platformtools.C4990ab;
import com.tencent.p177mm.storage.C40626ba;
import java.util.LinkedList;
import p000a.C0220l;
import p000a.p005f.p007b.C25052j;

@C0220l(dWo = {1, 1, 13}, dWp = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¨\u0006\u0014"}, dWq = {"Lcom/tencent/mm/executor/OpDelayExecutor;", "Lcom/tencent/mm/executor/IOpExecutor;", "()V", "execute", "", "timer", "Lcom/tencent/mm/engine/FunctionMsgTimer;", "dispatcher", "Lcom/tencent/mm/api/IFunctionMsgDispatcher;", "storage", "Lcom/tencent/mm/storage/FunctionMsgStorage;", "newFunctionMsgItem", "Lcom/tencent/mm/api/FunctionMsgItem;", "oldFunctionMsgItem", "newXmlCreateTime", "", "onTaskExpired", "task", "Lcom/tencent/mm/engine/FunctionMsgTask;", "Companion", "plugin-functionmsg_release"})
/* renamed from: com.tencent.mm.v.c */
public final class C44817c implements C44409b {
    public static final C36366a eAN = new C36366a();

    @C0220l(dWo = {1, 1, 13}, dWp = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, dWq = {"com/tencent/mm/executor/OpDelayExecutor$onTaskExpired$1", "Lcom/tencent/mm/engine/FunctionMsgFetcher$IFunctionMsgFetcherCallback;", "onFailFetch", "", "item", "Lcom/tencent/mm/api/FunctionMsgItem;", "onSuccessFetch", "plugin-functionmsg_release"})
    /* renamed from: com.tencent.mm.v.c$b */
    public static final class C5675b implements C23525a {
        final /* synthetic */ C44231e eAO;
        final /* synthetic */ C44230d eAP;
        final /* synthetic */ C32248f eAQ;
        final /* synthetic */ C45152l eAR;

        C5675b(C44231e c44231e, C44230d c44230d, C32248f c32248f, C45152l c45152l) {
            this.eAO = c44231e;
            this.eAP = c44230d;
            this.eAQ = c32248f;
            this.eAR = c45152l;
        }

        /* renamed from: b */
        public final void mo11555b(C32248f c32248f) {
            AppMethodBeat.m2504i(35476);
            C25052j.m39376p(c32248f, "item");
            C4990ab.m7420w("FunctionMsg.OpDelayExecutor", "[onFailFetch] item:".concat(String.valueOf(c32248f)));
            if (c32248f.getStatus() == -1) {
                this.eAO.mo69874a(-1, c32248f, this.eAP.eAI);
            }
            AppMethodBeat.m2505o(35476);
        }

        /* renamed from: a */
        public final void mo11554a(C32248f c32248f) {
            AppMethodBeat.m2504i(35477);
            C25052j.m39376p(c32248f, "item");
            C4990ab.m7416i("FunctionMsg.OpDelayExecutor", "[onSuccessFetch] item:".concat(String.valueOf(c32248f)));
            if (c32248f.mo52939An() > C1839cb.aaD() / 1000) {
                this.eAO.mo69874a(101, c32248f, this.eAP.eAI);
                AppMethodBeat.m2505o(35477);
                return;
            }
            C4990ab.m7416i("FunctionMsg.OpDelayExecutor", "[onTaskExpired] to show! id" + this.eAQ.mo52934Ai());
            this.eAR.mo39138a(c32248f.mo52934Ai(), c32248f, c32248f.mo52937Al());
            AppMethodBeat.m2505o(35477);
        }
    }

    @C0220l(dWo = {1, 1, 13}, dWp = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, dWq = {"Lcom/tencent/mm/executor/OpDelayExecutor$Companion;", "", "()V", "TAG", "", "plugin-functionmsg_release"})
    /* renamed from: com.tencent.mm.v.c$a */
    public static final class C36366a {
        private C36366a() {
        }

        public /* synthetic */ C36366a(byte b) {
            this();
        }
    }

    static {
        AppMethodBeat.m2504i(35480);
        AppMethodBeat.m2505o(35480);
    }

    /* renamed from: a */
    public final void mo39925a(C44231e c44231e, C45152l c45152l, C40626ba c40626ba, C32248f c32248f, C32248f c32248f2, long j) {
        AppMethodBeat.m2504i(35478);
        C25052j.m39376p(c44231e, "timer");
        C25052j.m39376p(c45152l, "dispatcher");
        C25052j.m39376p(c40626ba, "storage");
        C25052j.m39376p(c32248f, "newFunctionMsgItem");
        if (c32248f2 != null) {
            c32248f.mo52948be(true);
            c32248f2.mo52945aH(c32248f2.getVersion());
            c32248f2.mo52944aG(c32248f.getVersion());
            if (0 < c32248f.mo52939An()) {
                c32248f2.mo52947aJ(c32248f.mo52939An() + c32248f.mo52938Am());
            } else {
                c32248f2.mo52947aJ(c32248f2.mo52939An() + c32248f.mo52938Am());
            }
            c32248f2.mo52951cF(c32248f.mo52936Ak());
            String Ai = c32248f2.mo52934Ai();
            C25052j.m39375o(Ai, "oldFunctionMsgItem!!.functionMsgId");
            C40626ba.m70154a(Ai, c32248f2);
            C4990ab.m7416i("FunctionMsg.OpDelayExecutor", "[OpDelayExecutor], functionMsgId: " + c32248f.mo52934Ai() + ", op delay! update the exist one, new ActionTime:" + c32248f.mo52939An() + " new delay:" + c32248f.mo52938Am() + " reslt:" + c32248f2);
            c44231e.mo69874a(101, c32248f2, this);
            AppMethodBeat.m2505o(35478);
            return;
        }
        C4990ab.m7416i("FunctionMsg.OpDelayExecutor", "[OpDelayExecutor] op delay, oldFunctionMsgItem is null! newFunctionMsgItem: ".concat(String.valueOf(c32248f)));
        AppMethodBeat.m2505o(35478);
    }

    /* renamed from: a */
    public final void mo39926a(C44231e c44231e, C45152l c45152l, C44230d c44230d) {
        AppMethodBeat.m2504i(35479);
        C25052j.m39376p(c44231e, "timer");
        C25052j.m39376p(c45152l, "dispatcher");
        C25052j.m39376p(c44230d, "task");
        C32248f c32248f = c44230d.eAH;
        if (c32248f.getStatus() == -1) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(c32248f);
            new C44228b(linkedList, c45152l, new C5675b(c44231e, c44230d, c32248f, c45152l)).mo69869Pn();
            AppMethodBeat.m2505o(35479);
            return;
        }
        if (c32248f.getStatus() == 2 || c32248f.getStatus() == -2) {
            C4990ab.m7416i("FunctionMsg.OpDelayExecutor", "[onTaskExpired] id" + c32248f.mo52934Ai() + " actionTime:" + c32248f.mo52939An());
            if (c32248f.mo52939An() <= C1839cb.aaD() / 1000) {
                c45152l.mo39138a(c32248f.mo52934Ai(), c32248f, c32248f.mo52937Al());
                AppMethodBeat.m2505o(35479);
                return;
            }
            c44231e.mo69874a(c32248f.mo52933Ah(), c32248f, c44230d.eAI);
        }
        AppMethodBeat.m2505o(35479);
    }
}
