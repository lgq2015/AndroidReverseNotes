package com.tencent.wework.api.model;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.wework.api.model.WWMediaMessage.WWMediaObject;

public class WWMediaConversation extends WWMediaObject {
    public byte[] ALE;
    public WWMediaObject ALF;
    public String mnu;
    public String name;
    public long pXQ;

    public final boolean checkArgs() {
        AppMethodBeat.i(80497);
        if (!super.checkArgs()) {
            AppMethodBeat.o(80497);
            return false;
        } else if (this.ALE != null && this.ALE.length > 10485760) {
            AppMethodBeat.o(80497);
            return false;
        } else if (this.mnu != null && this.mnu.length() > 10240) {
            AppMethodBeat.o(80497);
            return false;
        } else if (this.mnu != null && WWMediaObject.getFileSize(this.mnu) > 10485760) {
            AppMethodBeat.o(80497);
            return false;
        } else if (this.ALF == null || !this.ALF.checkArgs()) {
            AppMethodBeat.o(80497);
            return false;
        } else {
            AppMethodBeat.o(80497);
            return true;
        }
    }

    public final void toBundle(Bundle bundle) {
        AppMethodBeat.i(80498);
        super.toBundle(bundle);
        bundle.putString("_wwconvobject_name", this.name);
        bundle.putLong("_wwconvobject_date", this.pXQ);
        bundle.putByteArray("_wwconvobject_avatarData", this.ALE);
        bundle.putString("_wwconvobject_avatarPath", this.mnu);
        bundle.putBundle("_wwconvobject_message", BaseMessage.b(this.ALF));
        AppMethodBeat.o(80498);
    }
}
