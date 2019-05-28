package com.tencent.qqvideo.proxy.common;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqvideo.proxy.api.IPlayManager;
import com.tencent.qqvideo.proxy.api.IUtils;
import com.tencent.qqvideo.proxy.httpproxy.HttpproxyFacade;
import com.tencent.qqvideo.proxy.httpproxy.TVHttpProxyLoadLibrary;

public class PlayManagerImp implements IPlayManager {
    private static String TAG = "TV_Httpproxy";
    private static boolean mbSoLoadSuccess = false;
    private ConfigStorage mConfigStorageInstance;
    private HttpproxyFacade proxy;

    public PlayManagerImp() {
        AppMethodBeat.i(124408);
        this.proxy = null;
        this.mConfigStorageInstance = new ConfigStorage();
        this.proxy = HttpproxyFacade.instance();
        AppMethodBeat.o(124408);
    }

    private static boolean isWifiOn(Context context) {
        AppMethodBeat.i(124409);
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            AppMethodBeat.o(124409);
            return false;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            AppMethodBeat.o(124409);
            return false;
        } else if (activeNetworkInfo.getType() == 1) {
            AppMethodBeat.o(124409);
            return true;
        } else {
            AppMethodBeat.o(124409);
            return false;
        }
    }

    public synchronized int init(Context context, String str) {
        int i = -1;
        synchronized (this) {
            AppMethodBeat.i(124410);
            if (context == null) {
                AppMethodBeat.o(124410);
            } else {
                if (this.proxy != null) {
                    HttpproxyFacade.setContext(context);
                }
                if (!mbSoLoadSuccess) {
                    try {
                        TVHttpProxyLoadLibrary.load("wxhttpproxy", PlayManagerImp.class.getClassLoader(), context);
                        TVHttpProxyLoadLibrary.setupBrokenLibraryHandler();
                        mbSoLoadSuccess = true;
                    } catch (Throwable th) {
                        mbSoLoadSuccess = false;
                        AppMethodBeat.o(124410);
                    }
                }
                try {
                    String downProxyConfig = ConfigStorage.getDownProxyConfig(context);
                    this.mConfigStorageInstance.synGetServerConfig(context);
                    if (str == null) {
                        str = "";
                    }
                    int init = this.proxy.init(str, downProxyConfig);
                    if (!isWifiOn(context)) {
                        this.proxy.setNetWorkState(2);
                    }
                    AppMethodBeat.o(124410);
                    i = init;
                } catch (Throwable th2) {
                    AppMethodBeat.o(124410);
                }
            }
        }
        return i;
    }

    public synchronized void deinit() {
        AppMethodBeat.i(124411);
        try {
            this.mConfigStorageInstance.stopGetServerConfig();
            this.proxy.deinit();
            AppMethodBeat.o(124411);
        } catch (Throwable th) {
            HttpproxyFacade.print(6, TAG, "error ,deinit native not found");
            AppMethodBeat.o(124411);
        }
        return;
    }

    public synchronized String buildPlayURLMp4(int i) {
        String buildPlayURL;
        AppMethodBeat.i(124412);
        try {
            buildPlayURL = this.proxy.buildPlayURL(i);
            AppMethodBeat.o(124412);
        } catch (Throwable th) {
            HttpproxyFacade.print(6, TAG, "error ,buildPlayURL native not found");
            buildPlayURL = "";
            AppMethodBeat.o(124412);
        }
        return buildPlayURL;
    }

    public synchronized void stopPlay(int i) {
        AppMethodBeat.i(124413);
        try {
            this.proxy.stopPlay(i);
            AppMethodBeat.o(124413);
        } catch (Throwable th) {
            HttpproxyFacade.print(6, TAG, "error ,stopPlay native not found");
            AppMethodBeat.o(124413);
        }
        return;
    }

    public synchronized void setUtilsObject(IUtils iUtils) {
        AppMethodBeat.i(124414);
        try {
            this.proxy.setUtils(iUtils);
            AppMethodBeat.o(124414);
        } catch (Throwable th) {
            HttpproxyFacade.print(6, TAG, "error ,setUtilsObject native not found");
            AppMethodBeat.o(124414);
        }
        return;
    }

    public synchronized void setCookie(String str) {
        AppMethodBeat.i(124415);
        try {
            this.proxy.setCookie(str);
            AppMethodBeat.o(124415);
        } catch (Throwable th) {
            HttpproxyFacade.print(6, TAG, "error ,setCookie native not found");
            AppMethodBeat.o(124415);
        }
        return;
    }

    public synchronized void appToFront() {
        AppMethodBeat.i(124416);
        try {
            this.proxy.pushEvent(3);
            AppMethodBeat.o(124416);
        } catch (Throwable th) {
            HttpproxyFacade.print(6, TAG, "error ,appToFront native not found");
            AppMethodBeat.o(124416);
        }
        return;
    }

    public synchronized void appToBack() {
        AppMethodBeat.i(124417);
        try {
            this.proxy.pushEvent(4);
            AppMethodBeat.o(124417);
        } catch (Throwable th) {
            HttpproxyFacade.print(6, TAG, "error ,appToBack native not found");
            AppMethodBeat.o(124417);
        }
        return;
    }

    public synchronized String getProxyVersion() {
        String version;
        AppMethodBeat.i(124418);
        try {
            version = this.proxy.getVersion();
            AppMethodBeat.o(124418);
        } catch (Throwable th) {
            HttpproxyFacade.print(6, TAG, "error ,getProxyVersion native not found");
            version = "TVHttpproxy.1.0.0.0000";
            AppMethodBeat.o(124418);
        }
        return version;
    }

    public synchronized void setNetWorkState(int i) {
        AppMethodBeat.i(124419);
        "setNetWorkState".concat(String.valueOf(i));
        try {
            this.proxy.setNetWorkState(i);
            AppMethodBeat.o(124419);
        } catch (Throwable th) {
            HttpproxyFacade.print(6, TAG, "error ,setNetWorkStatus native not found");
            AppMethodBeat.o(124419);
        }
        return;
    }

    public synchronized void setPlayerState(int i) {
        AppMethodBeat.i(124420);
        "setPlayerState".concat(String.valueOf(i));
        try {
            this.proxy.setPlayerState(i);
            AppMethodBeat.o(124420);
        } catch (Throwable th) {
            HttpproxyFacade.print(6, TAG, "error ,setPlayState native not found");
            AppMethodBeat.o(124420);
        }
        return;
    }

    public synchronized int startPlay(String str, int i, String str2, long j, int i2) {
        int startPlay;
        AppMethodBeat.i(124421);
        try {
            startPlay = this.proxy.startPlay(str, i, str2, j, i2);
            AppMethodBeat.o(124421);
        } catch (Throwable th) {
            HttpproxyFacade.print(6, TAG, "error ,startPlay native not found");
            startPlay = -1;
            AppMethodBeat.o(124421);
        }
        return startPlay;
    }

    public synchronized int preLoad(int i, int i2) {
        int preLoad;
        AppMethodBeat.i(124422);
        try {
            preLoad = this.proxy.preLoad(i, i2);
            AppMethodBeat.o(124422);
        } catch (Throwable th) {
            HttpproxyFacade.print(6, TAG, "error ,preLoad native not found");
            preLoad = -1;
            AppMethodBeat.o(124422);
        }
        return preLoad;
    }

    public synchronized int getCurrentOffset(int i) {
        int currentOffset;
        AppMethodBeat.i(124423);
        try {
            currentOffset = this.proxy.getCurrentOffset(i);
            AppMethodBeat.o(124423);
        } catch (Throwable th) {
            HttpproxyFacade.print(6, TAG, "error ,getCurrentOffset native not found");
            currentOffset = 0;
            AppMethodBeat.o(124423);
        }
        return currentOffset;
    }

    public synchronized int getTotalOffset(int i) {
        int totalOffset;
        AppMethodBeat.i(124424);
        try {
            totalOffset = this.proxy.getTotalOffset(i);
            AppMethodBeat.o(124424);
        } catch (Throwable th) {
            HttpproxyFacade.print(6, TAG, "error ,getTotalOffset native not found");
            totalOffset = 0;
            AppMethodBeat.o(124424);
        }
        return totalOffset;
    }

    public synchronized void setRemainTime(int i, int i2) {
        AppMethodBeat.i(124425);
        try {
            this.proxy.setRemainTime(i, i2);
            AppMethodBeat.o(124425);
        } catch (Throwable th) {
            HttpproxyFacade.print(6, TAG, "error ,getTotalOffset native not found");
            AppMethodBeat.o(124425);
        }
        return;
    }

    public synchronized int getLocalServerPort() {
        int localServerPort;
        AppMethodBeat.i(124426);
        try {
            localServerPort = this.proxy.getLocalServerPort();
            AppMethodBeat.o(124426);
        } catch (Throwable th) {
            HttpproxyFacade.print(6, TAG, "error ,getLocalServerPort native not found");
            localServerPort = -1;
            AppMethodBeat.o(124426);
        }
        return localServerPort;
    }

    public synchronized int setMaxStorageSize(long j) {
        int maxStorageSize;
        AppMethodBeat.i(124427);
        try {
            maxStorageSize = this.proxy.setMaxStorageSize(j);
            AppMethodBeat.o(124427);
        } catch (Throwable th) {
            HttpproxyFacade.print(6, TAG, "error ,setMaxStorageSize native not found");
            maxStorageSize = -1;
            AppMethodBeat.o(124427);
        }
        return maxStorageSize;
    }

    public synchronized int cleanStorage() {
        int cleanStorage;
        AppMethodBeat.i(124428);
        try {
            cleanStorage = this.proxy.cleanStorage();
            AppMethodBeat.o(124428);
        } catch (Throwable th) {
            HttpproxyFacade.print(6, TAG, "error ,cleanStorage native not found");
            cleanStorage = -1;
            AppMethodBeat.o(124428);
        }
        return cleanStorage;
    }
}
