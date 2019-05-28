package com.tencent.qqmusic.mediaplayer;

import android.text.TextUtils;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.util.Arrays;

public enum NativeLibs {
    nlog("NLog", 1),
    audioCommon("audio_common", 1),
    QmNativeDataSource("QmNativeDataSource", 1),
    formatDetector("FormatDetector", 1),
    codecFactory("codec_factory", 3),
    decoderJni("qqmusic_decoder_jni", 3),
    FFmpeg("FFmpeg", 3),
    cppShared("c++_shared", 3),
    stlportShared("stlport_shared", 3),
    xlog("wechatxlog", 3);
    
    private static final SparseArray<String> SUFFIX = null;
    private static final String TAG = "NativeLibs";
    private boolean mHasLoadSoSuccess;
    private final String name;
    private final long supportedAbi;

    static {
        SparseArray sparseArray = new SparseArray();
        SUFFIX = sparseArray;
        sparseArray.put(1, "");
        SUFFIX.put(2, "");
        AppMethodBeat.m2505o(128461);
    }

    private NativeLibs(String str, long j) {
        this.name = str;
        this.supportedAbi = j;
    }

    public static boolean loadAll(NativeLibs... nativeLibsArr) {
        AppMethodBeat.m2504i(128457);
        boolean loadAll = loadAll(Arrays.asList(nativeLibsArr));
        AppMethodBeat.m2505o(128457);
        return loadAll;
    }

    public static boolean loadAll(Iterable<NativeLibs> iterable) {
        AppMethodBeat.m2504i(128458);
        for (NativeLibs load : iterable) {
            if (!load.load()) {
                AppMethodBeat.m2505o(128458);
                return false;
            }
        }
        AppMethodBeat.m2505o(128458);
        return true;
    }

    public final boolean supportAbi(int i) {
        return (this.supportedAbi & ((long) i)) == ((long) i);
    }

    public final String getName() {
        return this.name;
    }

    public final boolean load() {
        AppMethodBeat.m2504i(128459);
        if (this.mHasLoadSoSuccess) {
            AppMethodBeat.m2505o(128459);
            return true;
        }
        this.mHasLoadSoSuccess = loadLibrary(getName());
        boolean z = this.mHasLoadSoSuccess;
        AppMethodBeat.m2505o(128459);
        return z;
    }

    private boolean loadLibrary(String str) {
        boolean z = false;
        AppMethodBeat.m2504i(128460);
        if (TextUtils.isEmpty(str)) {
            AppMethodBeat.m2505o(128460);
        } else {
            try {
                Logger.m71025i(TAG, "[loadLibrary] loading: ".concat(String.valueOf(str)));
                z = AudioPlayerConfigure.getSoLibraryLoader().load(str);
            } catch (Throwable th) {
                Logger.m71022e(TAG, "[loadLibrary] failed: ".concat(String.valueOf(str)), th);
            }
            if (z) {
                Logger.m71025i(TAG, "[loadLibrary] succeed: ".concat(String.valueOf(str)));
            } else {
                Logger.m71021e(TAG, "[loadLibrary] failed: ".concat(String.valueOf(str)));
            }
            AppMethodBeat.m2505o(128460);
        }
        return z;
    }
}
