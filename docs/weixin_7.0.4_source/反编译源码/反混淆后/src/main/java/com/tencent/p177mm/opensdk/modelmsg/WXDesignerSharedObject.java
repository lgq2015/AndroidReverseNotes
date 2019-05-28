package com.tencent.p177mm.opensdk.modelmsg;

import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.p177mm.opensdk.utils.Log;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXDesignerSharedObject */
public class WXDesignerSharedObject implements IMediaObject {
    private static final String TAG = "MicroMsg.SDK.WXEmojiSharedObject";
    public String designerName;
    public String designerRediretctUrl;
    public int designerUIN;
    public String thumburl;
    public String url;

    public WXDesignerSharedObject(String str, int i, String str2, String str3) {
        this.url = str2;
        this.thumburl = str;
        this.designerUIN = i;
        this.designerName = str3;
    }

    public boolean checkArgs() {
        AppMethodBeat.m2504i(128272);
        if (this.designerUIN == 0 || TextUtils.isEmpty(this.thumburl) || TextUtils.isEmpty(this.url)) {
            Log.m4140e(TAG, "checkArgs fail, packageid or thumburl is invalid");
            AppMethodBeat.m2505o(128272);
            return false;
        }
        AppMethodBeat.m2505o(128272);
        return true;
    }

    public void serialize(Bundle bundle) {
        AppMethodBeat.m2504i(128270);
        bundle.putString("_wxemojisharedobject_thumburl", this.thumburl);
        bundle.putInt("_wxemojisharedobject_designer_uin", this.designerUIN);
        bundle.putString("_wxemojisharedobject_designer_name", this.designerName);
        bundle.putString("_wxemojisharedobject_designer_rediretcturl", this.designerRediretctUrl);
        bundle.putString("_wxemojisharedobject_url", this.url);
        AppMethodBeat.m2505o(128270);
    }

    public int type() {
        return 25;
    }

    public void unserialize(Bundle bundle) {
        AppMethodBeat.m2504i(128271);
        this.thumburl = bundle.getString("_wxwebpageobject_thumburl");
        this.designerUIN = bundle.getInt("_wxemojisharedobject_designer_uin");
        this.designerName = bundle.getString("_wxemojisharedobject_designer_name");
        this.designerRediretctUrl = bundle.getString("_wxemojisharedobject_designer_rediretcturl");
        this.url = bundle.getString("_wxwebpageobject_url");
        AppMethodBeat.m2505o(128271);
    }
}
