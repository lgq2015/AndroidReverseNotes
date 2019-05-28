package com.tencent.tmassistantsdk.openSDK.param.jce;

import com.p123qq.taf.jce.JceInputStream;
import com.p123qq.taf.jce.JceOutputStream;
import com.p123qq.taf.jce.JceStruct;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class IPCQueryDownloadInfo extends JceStruct {
    public long allTaskTotalLength = 0;
    public long allTaskTotalProgress = 0;
    public long receivedLen = 0;
    public String savePath = "";
    public int state = 0;
    public long totalLen = 0;
    public String url = "";

    public IPCQueryDownloadInfo(String str, String str2, int i, long j, long j2, long j3, long j4) {
        this.url = str;
        this.savePath = str2;
        this.state = i;
        this.receivedLen = j;
        this.totalLen = j2;
        this.allTaskTotalProgress = j3;
        this.allTaskTotalLength = j4;
    }

    public final void writeTo(JceOutputStream jceOutputStream) {
        AppMethodBeat.m2504i(75996);
        jceOutputStream.write(this.url, 0);
        if (this.savePath != null) {
            jceOutputStream.write(this.savePath, 1);
        }
        jceOutputStream.write(this.state, 2);
        jceOutputStream.write(this.receivedLen, 3);
        jceOutputStream.write(this.totalLen, 4);
        jceOutputStream.write(this.allTaskTotalProgress, 5);
        jceOutputStream.write(this.allTaskTotalLength, 6);
        AppMethodBeat.m2505o(75996);
    }

    public final void readFrom(JceInputStream jceInputStream) {
        AppMethodBeat.m2504i(75997);
        this.url = jceInputStream.readString(0, true);
        this.savePath = jceInputStream.readString(1, false);
        this.state = jceInputStream.read(this.state, 2, false);
        this.receivedLen = jceInputStream.read(this.receivedLen, 3, false);
        this.totalLen = jceInputStream.read(this.totalLen, 4, false);
        this.allTaskTotalProgress = jceInputStream.read(this.allTaskTotalProgress, 5, false);
        this.allTaskTotalLength = jceInputStream.read(this.allTaskTotalLength, 6, false);
        AppMethodBeat.m2505o(75997);
    }
}
