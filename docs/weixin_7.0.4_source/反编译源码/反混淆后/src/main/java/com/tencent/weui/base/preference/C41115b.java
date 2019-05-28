package com.tencent.weui.base.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.C25738R;
import com.tencent.p177mm.p612ui.C5227ai;
import com.tencent.rtmp.sharp.jni.QLog;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.tencent.weui.base.preference.b */
public final class C41115b extends BaseAdapter implements C36582a {
    final C46826c ALw;
    boolean ALx = false;
    OnPreferenceChangeListener ALy;
    private final Context context;
    private final SharedPreferences ehZ;
    private final LinkedList<String> yCF = new LinkedList();
    private final HashMap<String, Preference> yCG = new HashMap();
    private final HashSet<String> yCH = new HashSet();
    private final LinkedList<String> yCI = new LinkedList();
    private final HashMap<String, Integer> yCJ = new HashMap();
    private final HashMap<String, String> yCK = new HashMap();
    private int[] yCL = new int[0];
    private boolean yCN = false;

    public C41115b(Context context, SharedPreferences sharedPreferences) {
        AppMethodBeat.m2504i(113264);
        this.ALw = new C46826c(context);
        this.context = context;
        this.ehZ = sharedPreferences;
        AppMethodBeat.m2505o(113264);
    }

    /* renamed from: b */
    private static String m71551b(Preference preference) {
        AppMethodBeat.m2504i(113265);
        String str = preference.getClass().getName() + "L" + preference.getLayoutResource() + QLog.TAG_REPORTLEVEL_COLORUSER + preference.getWidgetLayoutResource();
        AppMethodBeat.m2505o(113265);
        return str;
    }

    /* renamed from: c */
    private static String m71552c(Preference preference) {
        AppMethodBeat.m2504i(113266);
        String str;
        if (preference.getKey() == null || preference.getKey().length() <= 0) {
            str = "_anonymous_pref@" + preference.hashCode();
            AppMethodBeat.m2505o(113266);
            return str;
        }
        str = preference.getKey();
        AppMethodBeat.m2505o(113266);
        return str;
    }

    /* renamed from: NU */
    private static boolean m71548NU(int i) {
        return i == 2130970127 || i == 2130970204 || i == 2130970207;
    }

    /* renamed from: a */
    private static void m71550a(Preference preference, SharedPreferences sharedPreferences) {
        AppMethodBeat.m2504i(113267);
        if (preference instanceof CheckBoxPreference) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) preference;
            if (checkBoxPreference.isPersistent()) {
                checkBoxPreference.uOT = sharedPreferences.getBoolean(preference.getKey(), ((CheckBoxPreference) preference).isChecked());
            }
        }
        AppMethodBeat.m2505o(113267);
    }

    /* renamed from: a */
    public final void mo58388a(Preference preference) {
        AppMethodBeat.m2504i(113268);
        m71549a(preference, -1);
        if (!this.ALx) {
            notifyDataSetChanged();
        }
        AppMethodBeat.m2505o(113268);
    }

    /* renamed from: a */
    private void m71549a(Preference preference, int i) {
        AppMethodBeat.m2504i(113269);
        String c = C41115b.m71552c(preference);
        this.yCG.put(c, preference);
        LinkedList linkedList = this.yCF;
        if (i == -1) {
            i = this.yCF.size();
        }
        linkedList.add(i, c);
        if (!(this.yCJ.containsKey(C41115b.m71551b(preference)) || this.yCN)) {
            this.yCJ.put(C41115b.m71551b(preference), Integer.valueOf(this.yCJ.size()));
        }
        if (preference.getDependency() != null) {
            this.yCK.put(preference.getDependency() + "|" + preference.getKey(), preference.getKey());
        }
        AppMethodBeat.m2505o(113269);
    }

    public final int getCount() {
        AppMethodBeat.m2504i(113271);
        int size = this.yCI.size();
        AppMethodBeat.m2505o(113271);
        return size;
    }

    public final Object getItem(int i) {
        AppMethodBeat.m2504i(113272);
        Object obj = this.yCG.get(this.yCI.get(i));
        AppMethodBeat.m2505o(113272);
        return obj;
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final int getViewTypeCount() {
        AppMethodBeat.m2504i(113273);
        if (!this.yCN) {
            this.yCN = true;
        }
        int max = Math.max(1, this.yCJ.size());
        AppMethodBeat.m2505o(113273);
        return max;
    }

    public final int getItemViewType(int i) {
        AppMethodBeat.m2504i(113274);
        if (i > this.yCI.size()) {
            AppMethodBeat.m2505o(113274);
            return -1;
        }
        Integer num = (Integer) this.yCJ.get(C41115b.m71551b((Preference) this.yCG.get(this.yCI.get(i))));
        if (num == null) {
            AppMethodBeat.m2505o(113274);
            return -1;
        }
        int intValue = num.intValue();
        AppMethodBeat.m2505o(113274);
        return intValue;
    }

    /* JADX WARNING: Missing block: B:22:0x00d7, code skipped:
            if ((getItem(r16.yCI.size() - 1) instanceof com.tencent.weui.base.preference.PreferenceCategory) != false) goto L_0x00d9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        AppMethodBeat.m2504i(113275);
        if (i > this.yCI.size()) {
            AppMethodBeat.m2505o(113275);
        } else {
            Preference preference = (Preference) this.yCG.get(this.yCI.get(i));
            if (preference instanceof CheckBoxPreference) {
                preference.setOnPreferenceChangeListener(this.ALy);
            }
            if (!this.yCJ.containsKey(C41115b.m71551b(preference))) {
                view = null;
            }
            view = preference.getView(view, viewGroup);
            int i2 = this.yCL[i];
            View findViewById = view.findViewById(2131821019);
            if (findViewById == null) {
                C5227ai.m7971d("MicroMsg.WeUIPreferenceAdapter", "find content view error", new Object[0]);
                AppMethodBeat.m2505o(113275);
            } else {
                View findViewById2 = view.findViewById(16908312);
                if ((i2 & 4) == 0) {
                    int i3 = 0;
                    int paddingLeft = findViewById.getPaddingLeft();
                    int paddingRight = findViewById.getPaddingRight();
                    int paddingTop = findViewById.getPaddingTop();
                    int paddingBottom = findViewById.getPaddingBottom();
                    int paddingLeft2 = view.getPaddingLeft();
                    int paddingRight2 = view.getPaddingRight();
                    int paddingTop2 = view.getPaddingTop();
                    int paddingBottom2 = view.getPaddingBottom();
                    if ((i2 & 8) != 0) {
                        int i4;
                        if (i != this.yCI.size() - 1) {
                            if (i == this.yCI.size() - 2) {
                            }
                            if ((i2 & 2) != 0) {
                                i4 = C25738R.drawable.f6900uv;
                            } else {
                                i4 = C25738R.drawable.a_q;
                            }
                            i2 = C25738R.color.a69;
                            i3 = i4;
                        }
                        i4 = C25738R.drawable.f6900uv;
                        i2 = C25738R.color.a69;
                        i3 = i4;
                    } else if ((i2 & 16) != 0 || (i2 & 2) == 0) {
                        i3 = C25738R.drawable.a_q;
                        i2 = C25738R.drawable.f7046zj;
                    } else {
                        i2 = C25738R.drawable.f7046zj;
                    }
                    findViewById.setBackgroundResource(i3);
                    findViewById.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
                    if (findViewById2 != null) {
                        findViewById2.setBackgroundResource(i3);
                    }
                    view.setBackgroundResource(i2);
                    view.setPadding(paddingLeft2, paddingTop2, paddingRight2, paddingBottom2);
                }
                AppMethodBeat.m2505o(113275);
            }
        }
        return view;
    }

    public final void notifyDataSetChanged() {
        int i;
        int i2 = 0;
        AppMethodBeat.m2504i(113270);
        this.yCI.clear();
        Iterator it = this.yCF.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!this.yCH.contains(str)) {
                if (this.yCG.get(str) == null) {
                    C5227ai.m7972e("MicroMsg.WeUIPreferenceAdapter", "not found pref by key ".concat(String.valueOf(str)), new Object[0]);
                } else {
                    this.yCI.add(str);
                }
            }
        }
        if (!this.yCI.isEmpty() && C41115b.m71548NU(((Preference) this.yCG.get(this.yCI.get(0))).getLayoutResource())) {
            m71549a(new PreferenceSmallCategory(this.context), 0);
        }
        HashSet hashSet = new HashSet();
        for (i = 0; i < this.yCI.size(); i++) {
            this.yCG.get(this.yCI.get(i));
            if (i != 0) {
                this.yCG.get(this.yCI.get(i - 1));
            }
        }
        this.yCI.removeAll(hashSet);
        this.yCL = new int[this.yCI.size()];
        Preference preference;
        int[] iArr;
        if (this.yCL.length <= 0) {
            AppMethodBeat.m2505o(113270);
        } else if (this.yCL.length == 1) {
            preference = (Preference) this.yCG.get(this.yCI.get(0));
            if (!C41115b.m71548NU(((Preference) this.yCG.get(this.yCI.get(0))).getLayoutResource())) {
                this.yCL[0] = 4;
            } else if (preference instanceof CheckBoxPreference) {
                iArr = this.yCL;
                iArr[0] = iArr[0] | 8;
            } else {
                this.yCL[0] = 3;
            }
            C41115b.m71550a((Preference) this.yCG.get(this.yCI.get(0)), this.ehZ);
            super.notifyDataSetChanged();
            AppMethodBeat.m2505o(113270);
        } else {
            while (i2 < this.yCI.size()) {
                C41115b.m71550a((Preference) this.yCG.get(this.yCI.get(i2)), this.ehZ);
                preference = (Preference) this.yCG.get(this.yCI.get(i2));
                int layoutResource = preference.getLayoutResource();
                if (C41115b.m71548NU(layoutResource)) {
                    if (preference instanceof CheckBoxPreference) {
                        iArr = this.yCL;
                        iArr[i2] = iArr[i2] | 8;
                    } else if (i2 == 0) {
                        iArr = this.yCL;
                        iArr[i2] = iArr[i2] | 1;
                    } else {
                        if (i2 == this.yCI.size() - 1) {
                            iArr = this.yCL;
                            iArr[i2] = iArr[i2] | 2;
                        }
                        i = ((Preference) this.yCG.get(this.yCI.get(i2 - 1))).getLayoutResource();
                        if (i != 2130970127 || i == 2130970204 || i == 2130970207) {
                            iArr = this.yCL;
                            iArr[i2] = iArr[i2] | 1;
                        }
                    }
                } else if (layoutResource != 2130970184) {
                    iArr = this.yCL;
                    iArr[i2] = iArr[i2] | 4;
                    if (i2 != 0) {
                        i = ((Preference) this.yCG.get(this.yCI.get(i2 - 1))).getLayoutResource();
                        if (C41115b.m71548NU(i) || i == 2130970184) {
                            iArr = this.yCL;
                            layoutResource = i2 - 1;
                            iArr[layoutResource] = iArr[layoutResource] | 2;
                        }
                    }
                } else if (i2 == 0) {
                    iArr = this.yCL;
                    iArr[i2] = iArr[i2] | 4;
                } else {
                    iArr = this.yCL;
                    iArr[i2] = iArr[i2] | 16;
                    i = ((Preference) this.yCG.get(this.yCI.get(i2 - 1))).getLayoutResource();
                    if (i == 2130970127 || i == 2130970204 || i == 2130970207) {
                        iArr = this.yCL;
                        layoutResource = i2 - 1;
                        iArr[layoutResource] = iArr[layoutResource] | 2;
                    }
                }
                i2++;
            }
            super.notifyDataSetChanged();
            AppMethodBeat.m2505o(113270);
        }
    }
}
