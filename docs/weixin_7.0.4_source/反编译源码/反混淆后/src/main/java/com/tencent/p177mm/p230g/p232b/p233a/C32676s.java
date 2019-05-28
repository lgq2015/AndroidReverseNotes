package com.tencent.p177mm.p230g.p232b.p233a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.plugin.report.C46180a;
import com.tencent.p177mm.sdk.platformtools.C5046bo;
import com.tencent.ttpic.baseutils.IOUtils;
import java.util.Arrays;

/* renamed from: com.tencent.mm.g.b.a.s */
public final class C32676s extends C46180a {
    private String cUM = "";
    private long cUN = 0;
    private long cVG = 0;
    private long cVH = 0;
    private String cVM = "";
    private long cVO = 0;
    private long cVP = 0;
    private String cVz = "";
    private long cXA = 0;
    private long cXB = 0;
    private long cXC = 0;
    private int cXD = 0;
    private int cXE = 0;
    private long cXF = 0;
    private int cXG = 0;
    private long cXH = 0;
    private long cXI = 0;
    private long cXJ = 0;
    private int cXK = 0;
    private String cXL = "";
    private int cXM = 0;
    private long cXN = 0;
    private String cXe = "";
    private long cXf = 0;
    private long cXg = 0;
    private long cXh = 0;
    private long cXi = 0;
    private long cXj = 0;
    private long cXk = 0;
    private long cXl = 0;
    private long cXm = 0;
    private long cXn = 0;
    private long cXo = 0;
    private long cXp = 0;
    private int cXq = 0;
    private long cXr = 0;
    private long cXs = 0;
    private long cXt = 0;
    private long cXu = 0;
    private int cXv = 0;
    private long cXw = 0;
    private long cXx = 0;
    private long cXy = 0;
    private long cXz = 0;

    public C32676s(String str) {
        AppMethodBeat.m2504i(50534);
        if (str != null) {
            String[] split = str.split(",");
            if (split != null) {
                String[] strArr;
                if (split.length < 44) {
                    strArr = new String[44];
                    Arrays.fill(strArr, 0, 44, "");
                    System.arraycopy(split, 0, strArr, 0, split.length);
                } else {
                    strArr = split;
                }
                this.cVz = mo74169t("FileId", strArr[0], true);
                this.cXe = mo74169t("FileAesKey", strArr[1], true);
                this.cXf = C5046bo.getLong(strArr[2], 0);
                this.cVG = C5046bo.getLong(strArr[3], 0);
                this.cXg = C5046bo.getLong(strArr[4], 0);
                this.cXh = C5046bo.getLong(strArr[5], 0);
                this.cXi = C5046bo.getLong(strArr[6], 0);
                this.cXj = C5046bo.getLong(strArr[7], 0);
                this.cXk = C5046bo.getLong(strArr[8], 0);
                this.cXl = C5046bo.getLong(strArr[9], 0);
                this.cXm = C5046bo.getLong(strArr[10], 0);
                this.cXn = C5046bo.getLong(strArr[11], 0);
                this.cXo = C5046bo.getLong(strArr[12], 0);
                this.cXp = C5046bo.getLong(strArr[13], 0);
                this.cUM = mo74169t("ChatName", strArr[14], true);
                this.cUN = C5046bo.getLong(strArr[15], 0);
                this.cXq = C5046bo.getInt(strArr[16], 0);
                this.cXr = C5046bo.getLong(strArr[17], 0);
                this.cXs = C5046bo.getLong(strArr[18], 0);
                this.cXt = C5046bo.getLong(strArr[19], 0);
                this.cXu = C5046bo.getLong(strArr[20], 0);
                this.cXv = C5046bo.getInt(strArr[21], 0);
                this.cXw = C5046bo.getLong(strArr[22], 0);
                this.cXx = C5046bo.getLong(strArr[23], 0);
                this.cXy = C5046bo.getLong(strArr[24], 0);
                this.cXz = C5046bo.getLong(strArr[25], 0);
                this.cXA = C5046bo.getLong(strArr[26], 0);
                this.cXB = C5046bo.getLong(strArr[27], 0);
                this.cXC = C5046bo.getLong(strArr[28], 0);
                this.cXD = C5046bo.getInt(strArr[29], 0);
                this.cXE = C5046bo.getInt(strArr[30], 0);
                this.cXF = C5046bo.getLong(strArr[31], 0);
                this.cXG = C5046bo.getInt(strArr[32], 0);
                this.cVH = C5046bo.getLong(strArr[33], 0);
                this.cVM = mo74169t("CDNIp", strArr[34], true);
                this.cXH = C5046bo.getLong(strArr[35], 0);
                this.cXI = C5046bo.getLong(strArr[36], 0);
                this.cXJ = C5046bo.getLong(strArr[37], 0);
                this.cXK = C5046bo.getInt(strArr[38], 0);
                this.cXL = mo74169t("XClientIp", strArr[39], true);
                this.cXM = C5046bo.getInt(strArr[40], 0);
                this.cXN = C5046bo.getLong(strArr[41], 0);
                this.cVO = C5046bo.getLong(strArr[42], 0);
                this.cVP = C5046bo.getLong(strArr[43], 0);
            }
        }
        AppMethodBeat.m2505o(50534);
    }

    public final int getId() {
        return 13570;
    }

    /* renamed from: Fj */
    public final String mo4982Fj() {
        AppMethodBeat.m2504i(50535);
        String str = ",";
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.cVz);
        stringBuffer.append(str);
        stringBuffer.append(this.cXe);
        stringBuffer.append(str);
        stringBuffer.append(this.cXf);
        stringBuffer.append(str);
        stringBuffer.append(this.cVG);
        stringBuffer.append(str);
        stringBuffer.append(this.cXg);
        stringBuffer.append(str);
        stringBuffer.append(this.cXh);
        stringBuffer.append(str);
        stringBuffer.append(this.cXi);
        stringBuffer.append(str);
        stringBuffer.append(this.cXj);
        stringBuffer.append(str);
        stringBuffer.append(this.cXk);
        stringBuffer.append(str);
        stringBuffer.append(this.cXl);
        stringBuffer.append(str);
        stringBuffer.append(this.cXm);
        stringBuffer.append(str);
        stringBuffer.append(this.cXn);
        stringBuffer.append(str);
        stringBuffer.append(this.cXo);
        stringBuffer.append(str);
        stringBuffer.append(this.cXp);
        stringBuffer.append(str);
        stringBuffer.append(this.cUM);
        stringBuffer.append(str);
        stringBuffer.append(this.cUN);
        stringBuffer.append(str);
        stringBuffer.append(this.cXq);
        stringBuffer.append(str);
        stringBuffer.append(this.cXr);
        stringBuffer.append(str);
        stringBuffer.append(this.cXs);
        stringBuffer.append(str);
        stringBuffer.append(this.cXt);
        stringBuffer.append(str);
        stringBuffer.append(this.cXu);
        stringBuffer.append(str);
        stringBuffer.append(this.cXv);
        stringBuffer.append(str);
        stringBuffer.append(this.cXw);
        stringBuffer.append(str);
        stringBuffer.append(this.cXx);
        stringBuffer.append(str);
        stringBuffer.append(this.cXy);
        stringBuffer.append(str);
        stringBuffer.append(this.cXz);
        stringBuffer.append(str);
        stringBuffer.append(this.cXA);
        stringBuffer.append(str);
        stringBuffer.append(this.cXB);
        stringBuffer.append(str);
        stringBuffer.append(this.cXC);
        stringBuffer.append(str);
        stringBuffer.append(this.cXD);
        stringBuffer.append(str);
        stringBuffer.append(this.cXE);
        stringBuffer.append(str);
        stringBuffer.append(this.cXF);
        stringBuffer.append(str);
        stringBuffer.append(this.cXG);
        stringBuffer.append(str);
        stringBuffer.append(this.cVH);
        stringBuffer.append(str);
        stringBuffer.append(this.cVM);
        stringBuffer.append(str);
        stringBuffer.append(this.cXH);
        stringBuffer.append(str);
        stringBuffer.append(this.cXI);
        stringBuffer.append(str);
        stringBuffer.append(this.cXJ);
        stringBuffer.append(str);
        stringBuffer.append(this.cXK);
        stringBuffer.append(str);
        stringBuffer.append(this.cXL);
        stringBuffer.append(str);
        stringBuffer.append(this.cXM);
        stringBuffer.append(str);
        stringBuffer.append(this.cXN);
        stringBuffer.append(str);
        stringBuffer.append(this.cVO);
        stringBuffer.append(str);
        stringBuffer.append(this.cVP);
        str = stringBuffer.toString();
        mo74164VX(str);
        AppMethodBeat.m2505o(50535);
        return str;
    }

    /* renamed from: Fk */
    public final String mo4983Fk() {
        AppMethodBeat.m2504i(50536);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("FileId:").append(this.cVz);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("FileAesKey:").append(this.cXe);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("FileLength:").append(this.cXf);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("VideoDuration:").append(this.cVG);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("DownloadLength:").append(this.cXg);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("PlayDuration:").append(this.cXh);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("FirstPlayWaitTime:").append(this.cXi);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("MoovWaitTime:").append(this.cXj);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("BlockCount:").append(this.cXk);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("RegainAvgTime:").append(this.cXl);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("NetworkType:").append(this.cXm);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("DownloadType:").append(this.cXn);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("StartDownloadTime:").append(this.cXo);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("EndDownloadTime:").append(this.cXp);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("ChatName:").append(this.cUM);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("MemberCount:").append(this.cUN);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("RetCode:").append(this.cXq);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("EnterQueueTime:").append(this.cXr);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("FirstReqCostTime:").append(this.cXs);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("FirstReqSize:").append(this.cXt);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("FirstReqDownloadSize:").append(this.cXu);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("FirstReqCompleted:").append(this.cXv);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("AvgSpeed:").append(this.cXw);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("AvgConnectCost:").append(this.cXx);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("FirstConnectCostTime:").append(this.cXy);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("NetConnectTimes:").append(this.cXz);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("MoovReqTimes:").append(this.cXA);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("MoovCostTime:").append(this.cXB);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("MoovSize:").append(this.cXC);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("MoovCompleted:").append(this.cXD);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("MoovFailReason:").append(this.cXE);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("UiStayTime:").append(this.cXF);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("PlayErrorCode:").append(this.cXG);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("VideoBitrate:").append(this.cVH);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("CDNIp:").append(this.cVM);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("MessageCreateTime:").append(this.cXH);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("NewMsgId:").append(this.cXI);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("InitialDownloadLength:").append(this.cXJ);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("VideoFormat:").append(this.cXK);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("XClientIp:").append(this.cXL);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("IsCrossNet:").append(this.cXM);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("MoovPosition:").append(this.cXN);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("HadPreloadSize:").append(this.cVO);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("HadPreloadCompletion:").append(this.cVP);
        String stringBuffer2 = stringBuffer.toString();
        AppMethodBeat.m2505o(50536);
        return stringBuffer2;
    }
}
