package com.tencent.p177mm.storage.emotion;

import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.storage.emotion.t */
public final class C15438t {
    public long eRt;
    public String key;
    public int position;
    public int ybg;

    public final JSONObject toJson() {
        AppMethodBeat.m2504i(62891);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key", this.key);
            jSONObject.put("position", this.position);
            jSONObject.put("use_count", this.ybg);
            jSONObject.put("last_time", this.eRt);
            AppMethodBeat.m2505o(62891);
            return jSONObject;
        } catch (JSONException e) {
            AppMethodBeat.m2505o(62891);
            return null;
        }
    }
}
