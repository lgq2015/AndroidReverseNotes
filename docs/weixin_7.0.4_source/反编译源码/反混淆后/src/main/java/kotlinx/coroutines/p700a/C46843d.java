package kotlinx.coroutines.p700a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p000a.C0220l;

@C0220l(dWo = {1, 1, 13}, dWp = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u001f\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t¨\u0006\u0015"}, dWq = {"Lkotlinx/coroutines/internal/AtomicOp;", "T", "Lkotlinx/coroutines/internal/OpDescriptor;", "()V", "_consensus", "Lkotlinx/atomicfu/AtomicRef;", "", "isDecided", "", "()Z", "complete", "", "affected", "failure", "(Ljava/lang/Object;Ljava/lang/Object;)V", "decide", "decision", "perform", "prepare", "(Ljava/lang/Object;)Ljava/lang/Object;", "tryDecide", "kotlinx-coroutines-core"})
/* renamed from: kotlinx.coroutines.a.d */
public abstract class C46843d<T> extends C31184k {
    private static final AtomicReferenceFieldUpdater BRj = AtomicReferenceFieldUpdater.newUpdater(C46843d.class, Object.class, "BRi");
    private volatile Object BRi = C16447c.BRh;

    /* renamed from: M */
    public abstract void mo13485M(T t, Object obj);

    /* renamed from: ek */
    public abstract Object mo30354ek(T t);

    /* renamed from: el */
    public final Object mo50949el(Object obj) {
        Object obj2 = this.BRi;
        if (obj2 == C16447c.BRh) {
            obj2 = mo30354ek(obj);
            if ((obj2 != C16447c.BRh ? 1 : null) == null) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!BRj.compareAndSet(this, C16447c.BRh, obj2)) {
                obj2 = this.BRi;
            }
        }
        mo13485M(obj, obj2);
        return obj2;
    }
}
