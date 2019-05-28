package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.ttpic.baseutils.IOUtils;
import java.util.Arrays;

public final class f extends a {
    private int cTF = 0;
    private long cTG = 0;
    private long cTH = 0;
    private long cTI = 0;
    private long cTJ = 0;
    private long cTK = 0;
    private long cTL = 0;
    private long cTM = 0;
    private long cTN = 0;
    private String cTO = "";
    private long cTP = 0;
    private String cTQ = "";
    private long cTR = 0;
    private long cTS = 0;
    private long cTT = 0;
    private long cTU = 0;
    private long cTV = 0;
    private long cTW = 0;
    private long cTX = 0;
    private long cTY = 0;
    private long cTZ = 0;
    private int cUA = 0;
    private String cUB = "";
    private long cUC = 0;
    private String cUD = "";
    private long cUE = 0;
    private String cUF = "";
    private long cUG = 0;
    private String cUH = "";
    private long cUI = 0;
    private long cUJ = 0;
    private long cUK = 0;
    private long cUL = 0;
    private long cUa = 0;
    private long cUb = 0;
    private long cUc = 0;
    private long cUd = 0;
    private String cUe = "";
    private long cUf = 0;
    private long cUg = 0;
    private long cUh = 0;
    private long cUi = 0;
    private long cUj = 0;
    private long cUk = 0;
    private long cUl = 0;
    private long cUm = 0;
    private long cUn = 0;
    private long cUo = 0;
    private long cUp = 0;
    private long cUq = 0;
    private long cUr = 0;
    private long cUs = 0;
    private long cUt = 0;
    private long cUu = 0;
    private long cUv = 0;
    private long cUw = 0;
    private long cUx = 0;
    private long cUy = 0;
    private long cUz = 0;

    public f(String str) {
        AppMethodBeat.i(77579);
        if (str != null) {
            String[] split = str.split(",");
            if (split != null) {
                String[] strArr;
                if (split.length < 59) {
                    strArr = new String[59];
                    Arrays.fill(strArr, 0, 59, "");
                    System.arraycopy(split, 0, strArr, 0, split.length);
                } else {
                    strArr = split;
                }
                this.cTF = bo.getInt(strArr[0], 0);
                this.cTG = bo.getLong(strArr[1], 0);
                this.cTH = bo.getLong(strArr[2], 0);
                this.cTI = bo.getLong(strArr[3], 0);
                this.cTJ = bo.getLong(strArr[4], 0);
                this.cTK = bo.getLong(strArr[5], 0);
                this.cTL = bo.getLong(strArr[6], 0);
                this.cTM = bo.getLong(strArr[7], 0);
                this.cTN = bo.getLong(strArr[8], 0);
                this.cTO = t("SvrIP", strArr[9], true);
                this.cTP = bo.getLong(strArr[10], 0);
                this.cTQ = t("FileKey", strArr[11], true);
                this.cTR = bo.getLong(strArr[12], 0);
                this.cTS = bo.getLong(strArr[13], 0);
                this.cTT = bo.getLong(strArr[14], 0);
                this.cTU = bo.getLong(strArr[15], 0);
                this.cTV = bo.getLong(strArr[16], 0);
                this.cTW = bo.getLong(strArr[17], 0);
                this.cTX = bo.getLong(strArr[18], 0);
                this.cTY = bo.getLong(strArr[19], 0);
                this.cTZ = bo.getLong(strArr[20], 0);
                this.cUa = bo.getLong(strArr[21], 0);
                this.cUb = bo.getLong(strArr[22], 0);
                this.cUc = bo.getLong(strArr[23], 0);
                this.cUd = bo.getLong(strArr[24], 0);
                this.cUe = t("UUID", strArr[25], true);
                this.cUf = bo.getLong(strArr[26], 0);
                this.cUg = bo.getLong(strArr[27], 0);
                this.cUh = bo.getLong(strArr[28], 0);
                this.cUi = bo.getLong(strArr[29], 0);
                this.cUj = bo.getLong(strArr[30], 0);
                this.cUk = bo.getLong(strArr[31], 0);
                this.cUl = bo.getLong(strArr[32], 0);
                this.cUm = bo.getLong(strArr[33], 0);
                this.cUn = bo.getLong(strArr[34], 0);
                this.cUo = bo.getLong(strArr[35], 0);
                this.cUp = bo.getLong(strArr[36], 0);
                this.cUq = bo.getLong(strArr[37], 0);
                this.cUr = bo.getLong(strArr[38], 0);
                this.cUs = bo.getLong(strArr[39], 0);
                this.cUt = bo.getLong(strArr[40], 0);
                this.cUu = bo.getLong(strArr[41], 0);
                this.cUv = bo.getLong(strArr[42], 0);
                this.cUw = bo.getLong(strArr[43], 0);
                this.cUx = bo.getLong(strArr[44], 0);
                this.cUy = bo.getLong(strArr[45], 0);
                this.cUz = bo.getLong(strArr[46], 0);
                this.cUA = bo.getInt(strArr[47], 0);
                this.cUB = t("UsedIp1", strArr[48], true);
                this.cUC = bo.getLong(strArr[49], 0);
                this.cUD = t("UsedIp2", strArr[50], true);
                this.cUE = bo.getLong(strArr[51], 0);
                this.cUF = t("UsedIp3", strArr[52], true);
                this.cUG = bo.getLong(strArr[53], 0);
                this.cUH = t("UsedIp4", strArr[54], true);
                this.cUI = bo.getLong(strArr[55], 0);
                this.cUJ = bo.getLong(strArr[56], 0);
                this.cUK = bo.getLong(strArr[57], 0);
                this.cUL = bo.getLong(strArr[58], 0);
            }
        }
        AppMethodBeat.o(77579);
    }

    public final int getId() {
        return 10421;
    }

    public final String Fj() {
        AppMethodBeat.i(77580);
        String str = ",";
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.cTF);
        stringBuffer.append(str);
        stringBuffer.append(this.cTG);
        stringBuffer.append(str);
        stringBuffer.append(this.cTH);
        stringBuffer.append(str);
        stringBuffer.append(this.cTI);
        stringBuffer.append(str);
        stringBuffer.append(this.cTJ);
        stringBuffer.append(str);
        stringBuffer.append(this.cTK);
        stringBuffer.append(str);
        stringBuffer.append(this.cTL);
        stringBuffer.append(str);
        stringBuffer.append(this.cTM);
        stringBuffer.append(str);
        stringBuffer.append(this.cTN);
        stringBuffer.append(str);
        stringBuffer.append(this.cTO);
        stringBuffer.append(str);
        stringBuffer.append(this.cTP);
        stringBuffer.append(str);
        stringBuffer.append(this.cTQ);
        stringBuffer.append(str);
        stringBuffer.append(this.cTR);
        stringBuffer.append(str);
        stringBuffer.append(this.cTS);
        stringBuffer.append(str);
        stringBuffer.append(this.cTT);
        stringBuffer.append(str);
        stringBuffer.append(this.cTU);
        stringBuffer.append(str);
        stringBuffer.append(this.cTV);
        stringBuffer.append(str);
        stringBuffer.append(this.cTW);
        stringBuffer.append(str);
        stringBuffer.append(this.cTX);
        stringBuffer.append(str);
        stringBuffer.append(this.cTY);
        stringBuffer.append(str);
        stringBuffer.append(this.cTZ);
        stringBuffer.append(str);
        stringBuffer.append(this.cUa);
        stringBuffer.append(str);
        stringBuffer.append(this.cUb);
        stringBuffer.append(str);
        stringBuffer.append(this.cUc);
        stringBuffer.append(str);
        stringBuffer.append(this.cUd);
        stringBuffer.append(str);
        stringBuffer.append(this.cUe);
        stringBuffer.append(str);
        stringBuffer.append(this.cUf);
        stringBuffer.append(str);
        stringBuffer.append(this.cUg);
        stringBuffer.append(str);
        stringBuffer.append(this.cUh);
        stringBuffer.append(str);
        stringBuffer.append(this.cUi);
        stringBuffer.append(str);
        stringBuffer.append(this.cUj);
        stringBuffer.append(str);
        stringBuffer.append(this.cUk);
        stringBuffer.append(str);
        stringBuffer.append(this.cUl);
        stringBuffer.append(str);
        stringBuffer.append(this.cUm);
        stringBuffer.append(str);
        stringBuffer.append(this.cUn);
        stringBuffer.append(str);
        stringBuffer.append(this.cUo);
        stringBuffer.append(str);
        stringBuffer.append(this.cUp);
        stringBuffer.append(str);
        stringBuffer.append(this.cUq);
        stringBuffer.append(str);
        stringBuffer.append(this.cUr);
        stringBuffer.append(str);
        stringBuffer.append(this.cUs);
        stringBuffer.append(str);
        stringBuffer.append(this.cUt);
        stringBuffer.append(str);
        stringBuffer.append(this.cUu);
        stringBuffer.append(str);
        stringBuffer.append(this.cUv);
        stringBuffer.append(str);
        stringBuffer.append(this.cUw);
        stringBuffer.append(str);
        stringBuffer.append(this.cUx);
        stringBuffer.append(str);
        stringBuffer.append(this.cUy);
        stringBuffer.append(str);
        stringBuffer.append(this.cUz);
        stringBuffer.append(str);
        stringBuffer.append(this.cUA);
        stringBuffer.append(str);
        stringBuffer.append(this.cUB);
        stringBuffer.append(str);
        stringBuffer.append(this.cUC);
        stringBuffer.append(str);
        stringBuffer.append(this.cUD);
        stringBuffer.append(str);
        stringBuffer.append(this.cUE);
        stringBuffer.append(str);
        stringBuffer.append(this.cUF);
        stringBuffer.append(str);
        stringBuffer.append(this.cUG);
        stringBuffer.append(str);
        stringBuffer.append(this.cUH);
        stringBuffer.append(str);
        stringBuffer.append(this.cUI);
        stringBuffer.append(str);
        stringBuffer.append(this.cUJ);
        stringBuffer.append(str);
        stringBuffer.append(this.cUK);
        stringBuffer.append(str);
        stringBuffer.append(this.cUL);
        str = stringBuffer.toString();
        VX(str);
        AppMethodBeat.o(77580);
        return str;
    }

    public final String Fk() {
        AppMethodBeat.i(77581);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("CientErrNo:").append(this.cTF);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("OpType:").append(this.cTG);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("OpStartTs:").append(this.cTH);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("OpEndTs:").append(this.cTI);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("NetType:").append(this.cTJ);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("FileType:").append(this.cTK);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("FileSize:").append(this.cTL);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("CDNErrNo:").append(this.cTM);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("CDNOpType:").append(this.cTN);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("SvrIP:").append(this.cTO);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("IPCount:").append(this.cTP);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("FileKey:").append(this.cTQ);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("SliceCount:").append(this.cTR);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("TransportSize:").append(this.cTS);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("ConnTotalCost:").append(this.cTT);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("ConnTryTimes:").append(this.cTU);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("CDNTransfStartTs:").append(this.cTV);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("CDNTransfEndTs:").append(this.cTW);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("IsHitCache:").append(this.cTX);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("CompressPicLevel:").append(this.cTY);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("SrcFileSize:").append(this.cTZ);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("ImgSource:").append(this.cUa);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("ResolutionX:").append(this.cUb);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("ResolutionY:").append(this.cUc);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("ReportCode:").append(this.cUd);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("UUID:").append(this.cUe);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("ETLTime:").append(this.cUf);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("PTLTime:").append(this.cUg);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("ETLSize:").append(this.cUh);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("PTLSize:").append(this.cUi);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("SkeyFailCount:").append(this.cUj);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("SKeyTimeoutCount:").append(this.cUk);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("ConnectCount:").append(this.cUl);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("ConnectTotalMS:").append(this.cUm);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("ConnectAvgMS:").append(this.cUn);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("ConnectVarianceMS:").append(this.cUo);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("ConnectMinMS:").append(this.cUp);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("ConnectMaxMS:").append(this.cUq);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("TransforCount:").append(this.cUr);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("TransforTotalMS:").append(this.cUs);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("TransforAvgMS:").append(this.cUt);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("TransforVarianceMS:").append(this.cUu);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("TransforMinMS:").append(this.cUv);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("TransforMaxMS:").append(this.cUw);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("IsProgressiveJPEG:").append(this.cUx);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("WaitSec:").append(this.cUy);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("LastPort:").append(this.cUz);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("ConnErrorCode:").append(this.cUA);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("UsedIp1:").append(this.cUB);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("UsedPort1:").append(this.cUC);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("UsedIp2:").append(this.cUD);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("UsedPort2:").append(this.cUE);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("UsedIp3:").append(this.cUF);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("UsedPort3:").append(this.cUG);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("UsedIp4:").append(this.cUH);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("UsedPort4:").append(this.cUI);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("LogCreateTime:").append(this.cUJ);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("LogReportTime:").append(this.cUK);
        stringBuffer.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        stringBuffer.append("LogReportSvrTime:").append(this.cUL);
        String stringBuffer2 = stringBuffer.toString();
        AppMethodBeat.o(77581);
        return stringBuffer2;
    }
}
