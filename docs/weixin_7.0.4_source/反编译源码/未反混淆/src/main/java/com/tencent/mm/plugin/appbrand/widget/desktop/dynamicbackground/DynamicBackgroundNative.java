package com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.desktop.b;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo = {1, 1, 13}, dWp = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007\b\u0016¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H J\t\u0010\u0005\u001a\u00020\u0004H J\t\u0010\u0006\u001a\u00020\u0004H J\t\u0010\u0007\u001a\u00020\u0004H JI\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH J\u0019\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H J\u0019\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H ¨\u0006\u0018"}, dWq = {"Lcom/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/DynamicBackgroundNative;", "", "()V", "draw", "", "initView", "nativeInit", "nativeRelease", "setupGlslFiles", "vertexShader", "", "fragmentShader", "vertexFrameBuffer", "fragFrameBuffer", "textureVertexShader", "textureFragmentShader", "bgVertexShader", "bgFragmentShader", "surfaceChanged", "width", "", "height", "surfaceCreated", "Companion", "plugin-appbrand-integration_release"})
public final class DynamicBackgroundNative {
    public static final a iZA = new a();

    @l(dWo = {1, 1, 13}, dWp = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, dWq = {"Lcom/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/DynamicBackgroundNative$Companion;", "", "()V", "TAG", "", "plugin-appbrand-integration_release"})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        AppMethodBeat.i(135252);
        AppMethodBeat.o(135252);
    }

    public final native void draw();

    public final native void initView();

    public final native void nativeInit();

    public final native void nativeRelease();

    public final native void setupGlslFiles(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8);

    public final native void surfaceChanged(int i, int i2);

    public final native void surfaceCreated(int i, int i2);

    public DynamicBackgroundNative() {
        AppMethodBeat.i(135251);
        if (b.aPe()) {
            d.aPO();
        }
        try {
            System.loadLibrary("dynamicBg");
            AppMethodBeat.o(135251);
        } catch (Throwable th) {
            ab.printErrStackTrace("MicroMsg.DynamicBackgroundNative", th, "alvinluo DynamicBackgroundNative exception", new Object[0]);
            d.aPL();
            AppMethodBeat.o(135251);
        }
    }
}
