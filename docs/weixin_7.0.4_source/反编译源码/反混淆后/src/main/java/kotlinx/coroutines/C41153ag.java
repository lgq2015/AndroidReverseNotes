package kotlinx.coroutines;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.TimeUnit;
import p000a.C0220l;
import p000a.p005f.p007b.C25052j;
import p000a.p009h.C0016h;

@C0220l(dWo = {1, 1, 13}, dWp = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u000eH\u0002J\r\u0010\u0018\u001a\u00020\u0016H\u0000¢\u0006\u0002\b\u0019J\u001c\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\b2\n\u0010\u001d\u001a\u00060\u0002j\u0002`\u0003H\u0016J\b\u0010\u001e\u001a\u00020\u0012H\u0014J\b\u0010\u001f\u001a\u00020\u0012H\u0002J\b\u0010 \u001a\u00020\u0016H\u0016J\u000e\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\bJ\b\u0010#\u001a\u00020\u000eH\u0002J\b\u0010$\u001a\u00020\u0016H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0004R\u000e\u0010\u0010\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128TX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00128BX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013¨\u0006%"}, dWq = {"Lkotlinx/coroutines/DefaultExecutor;", "Lkotlinx/coroutines/EventLoopBase;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "()V", "ACTIVE", "", "DEFAULT_KEEP_ALIVE", "", "FRESH", "KEEP_ALIVE_NANOS", "SHUTDOWN_ACK", "SHUTDOWN_REQ", "_thread", "Ljava/lang/Thread;", "_thread$annotations", "debugStatus", "isCompleted", "", "()Z", "isShutdownRequested", "acknowledgeShutdownIfNeeded", "", "createThreadSync", "ensureStarted", "ensureStarted$kotlinx_coroutines_core", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "block", "isCorrectThread", "notifyStartup", "run", "shutdown", "timeout", "thread", "unpark", "kotlinx-coroutines-core"})
/* renamed from: kotlinx.coroutines.ag */
public final class C41153ag extends C16450at implements Runnable {
    private static final long BPT;
    private static volatile Thread BPU;
    private static volatile int BPV;
    public static final C41153ag BPW = new C41153ag();

    static {
        Object obj;
        AppMethodBeat.m2504i(118461);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            obj = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException e) {
            obj = Long.valueOf(1000);
        }
        C25052j.m39375o(obj, "try {\n            java.l…AULT_KEEP_ALIVE\n        }");
        BPT = timeUnit.toNanos(obj.longValue());
        AppMethodBeat.m2505o(118461);
    }

    private C41153ag() {
    }

    private static boolean elb() {
        int i = BPV;
        return i == 2 || i == 3;
    }

    public final void run() {
        AppMethodBeat.m2504i(118455);
        C41158bs.elC();
        try {
            if (elf()) {
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long elo = elo();
                    if (elo == Long.MAX_VALUE) {
                        if (j == Long.MAX_VALUE) {
                            long nanoTime = C41158bs.elC().nanoTime();
                            if (j == Long.MAX_VALUE) {
                                j = BPT + nanoTime;
                            }
                            nanoTime = j - nanoTime;
                            if (nanoTime <= 0) {
                                BPU = null;
                                elg();
                                C41158bs.elC();
                                if (!isEmpty()) {
                                    elc();
                                }
                                AppMethodBeat.m2505o(118455);
                                return;
                            }
                            elo = C0016h.m16aj(elo, nanoTime);
                        } else {
                            elo = C0016h.m16aj(elo, BPT);
                        }
                    }
                    if (elo > 0) {
                        if (C41153ag.elb()) {
                            BPU = null;
                            elg();
                            C41158bs.elC();
                            if (!isEmpty()) {
                                elc();
                            }
                            AppMethodBeat.m2505o(118455);
                            return;
                        }
                        C41158bs.elC().parkNanos(this, elo);
                    }
                }
            }
        } finally {
            BPU = null;
            elg();
            C41158bs.elC();
            if (!isEmpty()) {
                elc();
            }
            AppMethodBeat.m2505o(118455);
        }
    }

    private final Thread elc() {
        AppMethodBeat.m2504i(118456);
        Thread thread = BPU;
        if (thread == null) {
            thread = eld();
        }
        AppMethodBeat.m2505o(118456);
        return thread;
    }

    private final synchronized Thread eld() {
        Thread thread;
        AppMethodBeat.m2504i(118457);
        thread = BPU;
        if (thread == null) {
            Thread thread2 = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            BPU = thread2;
            thread2.setDaemon(true);
            thread2.start();
            thread = thread2;
        }
        AppMethodBeat.m2505o(118457);
        return thread;
    }

    /* Access modifiers changed, original: protected|final */
    public final void ele() {
        AppMethodBeat.m2504i(118458);
        C41158bs.elC().unpark(elc());
        AppMethodBeat.m2505o(118458);
    }

    private final synchronized boolean elf() {
        boolean z;
        AppMethodBeat.m2504i(118459);
        if (C41153ag.elb()) {
            z = false;
            AppMethodBeat.m2505o(118459);
        } else {
            BPV = 1;
            notifyAll();
            AppMethodBeat.m2505o(118459);
            z = true;
        }
        return z;
    }

    private final synchronized void elg() {
        AppMethodBeat.m2504i(118460);
        if (C41153ag.elb()) {
            BPV = 3;
            this.BQj = null;
            this.BQl = null;
            notifyAll();
            AppMethodBeat.m2505o(118460);
        } else {
            AppMethodBeat.m2505o(118460);
        }
    }
}
