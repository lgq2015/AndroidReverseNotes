package a.k;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo = {1, 1, 13}, dWp = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, dWq = {"Lkotlin/text/SystemProperties;", "", "()V", "LINE_SEPARATOR", "", "kotlin-stdlib"})
final class y {
    public static final y BPp = new y();
    public static final String LINE_SEPARATOR;

    static {
        AppMethodBeat.i(56363);
        String property = System.getProperty("line.separator");
        if (property == null) {
            j.dWJ();
        }
        LINE_SEPARATOR = property;
        AppMethodBeat.o(56363);
    }

    private y() {
    }
}
