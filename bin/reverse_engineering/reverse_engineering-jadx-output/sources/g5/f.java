package g5;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewbinding.ViewBinding;
import b2.t1;
import com.inmobi.cmp.ChoiceCmp;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.core.model.portalconfig.GBCConsentValue;
import com.inmobi.cmp.data.model.ChoiceColor;
import com.inmobi.cmp.model.ChoiceError;
import com.inmobi.cmp.model.Regulations;
import com.uptodown.tv.ui.fragment.TvAppDetailFragment;
import j$.util.Objects;
import java.io.IOException;
import java.io.StringWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.MissingFormatArgumentException;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements a4.i, g8.h, j1.f, t.b, ViewBinding, w1.a, j1.h, j1.d, SearchView.OnQueryTextListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5309b;

    public f(int i) {
        this.f5308a = i;
        switch (i) {
            case 5:
                break;
            case 9:
                this.f5309b = new ArrayList(20);
                break;
            case 12:
                this.f5309b = new LinkedHashSet();
                break;
            default:
                this.f5309b = new j1.p();
                break;
        }
    }

    public static l8.k A(JSONObject jSONObject) {
        l8.k kVar = jSONObject == null ? null : new l8.k(jSONObject.optString("mspaJurisdiction"), jSONObject.optBoolean("isCoveredTransaction", false), jSONObject.optString("mspaSignalMode"), jSONObject.optBoolean("mspaAutoPopUp", false), d0.b.e(jSONObject, "mspaOptOutPurposeIds"), d0.b.e(jSONObject, "mspaSensitiveDataPurposeIds"));
        return kVar == null ? new l8.k() : kVar;
    }

    public static l8.p B(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("themeMode");
        strOptString.getClass();
        ChoiceColor choiceColorG = g(jSONObject.optJSONObject("lightModeColors"));
        ChoiceColor choiceColorG2 = g(jSONObject.optJSONObject("darkModeColors"));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("fonts");
        return new l8.p(strOptString, choiceColorG, choiceColorG2, jSONObjectOptJSONObject != null ? new l8.e(u(jSONObjectOptJSONObject.optJSONObject("title")), u(jSONObjectOptJSONObject.optJSONObject("subtitle")), u(jSONObjectOptJSONObject.optJSONObject("body")), u(jSONObjectOptJSONObject.optJSONObject("button"))) : null);
    }

    public static l8.r N(JSONObject jSONObject) {
        l8.r rVar;
        if (jSONObject == null) {
            rVar = null;
        } else {
            String strOptString = jSONObject.optString("uspDnsTitle", "");
            ArrayList arrayListQ = d0.b.q(jSONObject, "uspDnsText");
            boolean zOptBoolean = jSONObject.optBoolean("suppressCcpaLinks", false);
            String strOptString2 = jSONObject.optString("uspDeleteDataLinkText", "");
            String strOptString3 = jSONObject.optString("uspAccessDataLinkText", "");
            String strOptString4 = jSONObject.optString("uspPrivacyPolicyLinkText", "");
            String strOptString5 = jSONObject.optString("uspDeleteDataLink");
            String strOptString6 = jSONObject.optString("uspAccessDataLink");
            String strOptString7 = jSONObject.optString("uspPrivacyPolicyLink");
            strOptString4.getClass();
            strOptString2.getClass();
            strOptString3.getClass();
            strOptString.getClass();
            strOptString5.getClass();
            strOptString6.getClass();
            strOptString7.getClass();
            rVar = new l8.r(zOptBoolean, strOptString4, strOptString2, strOptString3, strOptString, arrayListQ, strOptString5, strOptString6, strOptString7, 1);
        }
        return rVar == null ? new l8.r(false, null, null, null, null, null, null, null, null, 1023) : rVar;
    }

    public static boolean O(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String R(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public static ChoiceColor g(JSONObject jSONObject) {
        Object jVar;
        Integer num;
        Object jVar2;
        Integer num2;
        Object jVar3;
        Integer num3;
        Object jVar4;
        Integer num4;
        Object jVar5;
        Integer num5;
        Object jVar6;
        Integer num6;
        Object jVar7;
        Integer num7;
        Object jVar8;
        Integer num8;
        Object jVar9;
        Integer num9;
        Object jVar10;
        Integer num10;
        Object jVar11;
        Integer num11;
        Object jVar12;
        Integer num12;
        Object jVar13;
        Integer num13;
        Object jVar14;
        Integer num14;
        Object jVar15;
        Integer num15;
        Object jVar16;
        Integer num16;
        if (jSONObject == null) {
            return null;
        }
        try {
            ChoiceColor choiceColor = new ChoiceColor();
            String strOptString = jSONObject.optString("dividerColor");
            strOptString.getClass();
            if (l7.m.z0(strOptString)) {
                strOptString = null;
            }
            if (strOptString == null) {
                num = null;
            } else {
                try {
                    jVar = Integer.valueOf(Color.parseColor(strOptString));
                } catch (Throwable th) {
                    jVar = new p6.j(th);
                }
                if (jVar instanceof p6.j) {
                    jVar = null;
                }
                num = (Integer) jVar;
            }
            choiceColor.setDividerColor(num);
            String strOptString2 = jSONObject.optString("tabBackgroundColor");
            strOptString2.getClass();
            if (l7.m.z0(strOptString2)) {
                strOptString2 = null;
            }
            if (strOptString2 == null) {
                num2 = null;
            } else {
                try {
                    jVar2 = Integer.valueOf(Color.parseColor(strOptString2));
                } catch (Throwable th2) {
                    jVar2 = new p6.j(th2);
                }
                if (jVar2 instanceof p6.j) {
                    jVar2 = null;
                }
                num2 = (Integer) jVar2;
            }
            choiceColor.setTabBackgroundColor(num2);
            String strOptString3 = jSONObject.optString("searchBarBackgroundColor");
            strOptString3.getClass();
            if (l7.m.z0(strOptString3)) {
                strOptString3 = null;
            }
            if (strOptString3 == null) {
                num3 = null;
            } else {
                try {
                    jVar3 = Integer.valueOf(Color.parseColor(strOptString3));
                } catch (Throwable th3) {
                    jVar3 = new p6.j(th3);
                }
                if (jVar3 instanceof p6.j) {
                    jVar3 = null;
                }
                num3 = (Integer) jVar3;
            }
            choiceColor.setSearchBarBackgroundColor(num3);
            String strOptString4 = jSONObject.optString("searchBarForegroundColor");
            strOptString4.getClass();
            if (l7.m.z0(strOptString4)) {
                strOptString4 = null;
            }
            if (strOptString4 == null) {
                num4 = null;
            } else {
                try {
                    jVar4 = Integer.valueOf(Color.parseColor(strOptString4));
                } catch (Throwable th4) {
                    jVar4 = new p6.j(th4);
                }
                if (jVar4 instanceof p6.j) {
                    jVar4 = null;
                }
                num4 = (Integer) jVar4;
            }
            choiceColor.setSearchBarForegroundColor(num4);
            String strOptString5 = jSONObject.optString("toggleActiveColor");
            strOptString5.getClass();
            if (l7.m.z0(strOptString5)) {
                strOptString5 = null;
            }
            if (strOptString5 == null) {
                num5 = null;
            } else {
                try {
                    jVar5 = Integer.valueOf(Color.parseColor(strOptString5));
                } catch (Throwable th5) {
                    jVar5 = new p6.j(th5);
                }
                if (jVar5 instanceof p6.j) {
                    jVar5 = null;
                }
                num5 = (Integer) jVar5;
            }
            choiceColor.setToggleActiveColor(num5);
            String strOptString6 = jSONObject.optString("toggleActiveColor");
            strOptString6.getClass();
            if (l7.m.z0(strOptString6)) {
                strOptString6 = null;
            }
            if (strOptString6 == null) {
                num6 = null;
            } else {
                try {
                    jVar6 = Integer.valueOf(Color.parseColor(strOptString6));
                } catch (Throwable th6) {
                    jVar6 = new p6.j(th6);
                }
                if (jVar6 instanceof p6.j) {
                    jVar6 = null;
                }
                num6 = (Integer) jVar6;
            }
            choiceColor.setToggleInactiveColor(num6);
            String strOptString7 = jSONObject.optString("globalBackgroundColor");
            strOptString7.getClass();
            if (l7.m.z0(strOptString7)) {
                strOptString7 = null;
            }
            if (strOptString7 == null) {
                num7 = null;
            } else {
                try {
                    jVar7 = Integer.valueOf(Color.parseColor(strOptString7));
                } catch (Throwable th7) {
                    jVar7 = new p6.j(th7);
                }
                if (jVar7 instanceof p6.j) {
                    jVar7 = null;
                }
                num7 = (Integer) jVar7;
            }
            choiceColor.setGlobalBackgroundColor(num7);
            String strOptString8 = jSONObject.optString("titleTextColor");
            strOptString8.getClass();
            if (l7.m.z0(strOptString8)) {
                strOptString8 = null;
            }
            if (strOptString8 == null) {
                num8 = null;
            } else {
                try {
                    jVar8 = Integer.valueOf(Color.parseColor(strOptString8));
                } catch (Throwable th8) {
                    jVar8 = new p6.j(th8);
                }
                if (jVar8 instanceof p6.j) {
                    jVar8 = null;
                }
                num8 = (Integer) jVar8;
            }
            choiceColor.setTitleTextColor(num8);
            String strOptString9 = jSONObject.optString("bodyTextColor");
            strOptString9.getClass();
            if (l7.m.z0(strOptString9)) {
                strOptString9 = null;
            }
            if (strOptString9 == null) {
                num9 = null;
            } else {
                try {
                    jVar9 = Integer.valueOf(Color.parseColor(strOptString9));
                } catch (Throwable th9) {
                    jVar9 = new p6.j(th9);
                }
                if (jVar9 instanceof p6.j) {
                    jVar9 = null;
                }
                num9 = (Integer) jVar9;
            }
            choiceColor.setBodyTextColor(num9);
            String strOptString10 = jSONObject.optString("tabTextColor");
            strOptString10.getClass();
            if (l7.m.z0(strOptString10)) {
                strOptString10 = null;
            }
            if (strOptString10 == null) {
                num10 = null;
            } else {
                try {
                    jVar10 = Integer.valueOf(Color.parseColor(strOptString10));
                } catch (Throwable th10) {
                    jVar10 = new p6.j(th10);
                }
                if (jVar10 instanceof p6.j) {
                    jVar10 = null;
                }
                num10 = (Integer) jVar10;
            }
            choiceColor.setTabTextColor(num10);
            String strOptString11 = jSONObject.optString("menuTextColor");
            strOptString11.getClass();
            if (l7.m.z0(strOptString11)) {
                strOptString11 = null;
            }
            if (strOptString11 == null) {
                num11 = null;
            } else {
                try {
                    jVar11 = Integer.valueOf(Color.parseColor(strOptString11));
                } catch (Throwable th11) {
                    jVar11 = new p6.j(th11);
                }
                if (jVar11 instanceof p6.j) {
                    jVar11 = null;
                }
                num11 = (Integer) jVar11;
            }
            choiceColor.setMenuTextColor(num11);
            String strOptString12 = jSONObject.optString("linkTextColor");
            strOptString12.getClass();
            if (l7.m.z0(strOptString12)) {
                strOptString12 = null;
            }
            if (strOptString12 == null) {
                num12 = null;
            } else {
                try {
                    jVar12 = Integer.valueOf(Color.parseColor(strOptString12));
                } catch (Throwable th12) {
                    jVar12 = new p6.j(th12);
                }
                if (jVar12 instanceof p6.j) {
                    jVar12 = null;
                }
                num12 = (Integer) jVar12;
            }
            choiceColor.setLinkTextColor(num12);
            String strOptString13 = jSONObject.optString("buttonTextColor");
            strOptString13.getClass();
            if (l7.m.z0(strOptString13)) {
                strOptString13 = null;
            }
            if (strOptString13 == null) {
                num13 = null;
            } else {
                try {
                    jVar13 = Integer.valueOf(Color.parseColor(strOptString13));
                } catch (Throwable th13) {
                    jVar13 = new p6.j(th13);
                }
                if (jVar13 instanceof p6.j) {
                    jVar13 = null;
                }
                num13 = (Integer) jVar13;
            }
            choiceColor.setButtonTextColor(num13);
            String strOptString14 = jSONObject.optString("buttonDisabledTextColor");
            strOptString14.getClass();
            if (l7.m.z0(strOptString14)) {
                strOptString14 = null;
            }
            if (strOptString14 == null) {
                num14 = null;
            } else {
                try {
                    jVar14 = Integer.valueOf(Color.parseColor(strOptString14));
                } catch (Throwable th14) {
                    jVar14 = new p6.j(th14);
                }
                if (jVar14 instanceof p6.j) {
                    jVar14 = null;
                }
                num14 = (Integer) jVar14;
            }
            choiceColor.setButtonDisabledTextColor(num14);
            String strOptString15 = jSONObject.optString("buttonBackgroundColor");
            strOptString15.getClass();
            if (l7.m.z0(strOptString15)) {
                strOptString15 = null;
            }
            if (strOptString15 == null) {
                num15 = null;
            } else {
                try {
                    jVar15 = Integer.valueOf(Color.parseColor(strOptString15));
                } catch (Throwable th15) {
                    jVar15 = new p6.j(th15);
                }
                if (jVar15 instanceof p6.j) {
                    jVar15 = null;
                }
                num15 = (Integer) jVar15;
            }
            choiceColor.setButtonBackgroundColor(num15);
            String strOptString16 = jSONObject.optString("buttonDisabledBackgroundColor");
            strOptString16.getClass();
            if (l7.m.z0(strOptString16)) {
                strOptString16 = null;
            }
            if (strOptString16 == null) {
                num16 = null;
            } else {
                try {
                    jVar16 = Integer.valueOf(Color.parseColor(strOptString16));
                } catch (Throwable th16) {
                    jVar16 = new p6.j(th16);
                }
                if (jVar16 instanceof p6.j) {
                    jVar16 = null;
                }
                num16 = (Integer) jVar16;
            }
            choiceColor.setButtonDisabledBackgroundColor(num16);
            return choiceColor;
        } catch (Exception e10) {
            a.a.h("Choice", kotlin.jvm.internal.l.g(e10.getMessage(), "Error parsing ChoiceColor: "), null, 4);
            return null;
        }
    }

    public static LinkedHashMap m(JSONObject jSONObject, int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        itKeys.getClass();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
            if (jSONObjectOptJSONObject != null) {
                next.getClass();
                int iOptInt = jSONObjectOptJSONObject.optInt("id");
                String strOptString = jSONObjectOptJSONObject.optString("name");
                strOptString.getClass();
                String strOptString2 = jSONObjectOptJSONObject.optString("description");
                strOptString2.getClass();
                linkedHashMap.put(next, new h8.b(strOptString, strOptString2, p(jSONObjectOptJSONObject, i), iOptInt));
            }
        }
        return linkedHashMap;
    }

    public static String p(JSONObject jSONObject, int i) {
        String string;
        if (i <= 2) {
            String strOptString = jSONObject.optString("descriptionLegal");
            strOptString.getClass();
            return strOptString;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("illustrations");
        if (jSONArrayOptJSONArray == null) {
            string = null;
        } else {
            StringBuilder sb = new StringBuilder();
            int length = jSONArrayOptJSONArray.length();
            for (int i6 = 0; i6 < length; i6++) {
                sb.append(String.format("* %s", Arrays.copyOf(new Object[]{jSONArrayOptJSONArray.getString(i6)}, 1)));
                sb.append('\n');
            }
            string = sb.toString();
        }
        return string == null ? "" : string;
    }

    public static l8.d r(JSONObject jSONObject) {
        if (jSONObject != null) {
            return new l8.d(Boolean.valueOf(jSONObject.optBoolean("visitEvents", false)), Boolean.valueOf(jSONObject.optBoolean("advancedCustomizations", false)), Boolean.valueOf(jSONObject.optBoolean("consentOrPay", false)), Boolean.valueOf(jSONObject.optBoolean("themeCustomizations", false)));
        }
        Boolean bool = Boolean.FALSE;
        return new l8.d(bool, bool, bool, bool);
    }

    public static LinkedHashMap t(JSONObject jSONObject, int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        itKeys.getClass();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
            if (jSONObjectOptJSONObject != null) {
                next.getClass();
                int iOptInt = jSONObjectOptJSONObject.optInt("id");
                String strOptString = jSONObjectOptJSONObject.optString("name");
                strOptString.getClass();
                String strOptString2 = jSONObjectOptJSONObject.optString("description");
                strOptString2.getClass();
                linkedHashMap.put(next, new h8.f(strOptString, strOptString2, p(jSONObjectOptJSONObject, i), iOptInt));
            }
        }
        return linkedHashMap;
    }

    public static l8.f u(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new l8.f(Integer.valueOf(jSONObject.optInt("fontSize")), jSONObject.optString("fontUrl", ""), jSONObject.optString("fontName", ""));
    }

    public static void v(String str, String str2) {
        if (str == null) {
            com.google.gson.internal.a.i("name == null");
            return;
        }
        if (str.isEmpty()) {
            com.google.gson.internal.a.p("name is empty");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= ' ' || cCharAt >= 127) {
                Object[] objArr = {Integer.valueOf(cCharAt), Integer.valueOf(i), str};
                byte[] bArr = n8.c.f8114a;
                com.google.gson.internal.a.p(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", objArr));
                return;
            }
        }
        if (str2 == null) {
            com.google.gson.internal.a.i(androidx.lifecycle.l.w("value for name ", str, " == null"));
            return;
        }
        int length2 = str2.length();
        for (int i6 = 0; i6 < length2; i6++) {
            char cCharAt2 = str2.charAt(i6);
            if ((cCharAt2 <= 31 && cCharAt2 != '\t') || cCharAt2 >= 127) {
                Object[] objArr2 = {Integer.valueOf(cCharAt2), Integer.valueOf(i6), str, str2};
                byte[] bArr2 = n8.c.f8114a;
                com.google.gson.internal.a.p(String.format(Locale.US, "Unexpected char %#04x at %d in %s value: %s", objArr2));
                return;
            }
        }
    }

    public static l8.h x(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return new l8.h();
        }
        int i = 0;
        boolean zOptBoolean = jSONObject.optBoolean("applicable", false);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("applicablePurposes");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            while (i < length) {
                int i6 = i + 1;
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                int iOptInt = jSONObject2.optInt("id");
                String strOptString = jSONObject2.optString("defaultValue");
                strOptString.getClass();
                arrayList.add(new l8.g(iOptInt, GBCConsentValue.valueOf(strOptString)));
                i = i6;
            }
        }
        return new l8.h(arrayList, zOptBoolean);
    }

    public static l8.i y(JSONObject jSONObject) throws JSONException {
        boolean z9;
        String str;
        ArrayList arrayList;
        int i;
        ArrayList arrayList2;
        int i6;
        l8.j jVar;
        l8.j jVar2;
        l8.m mVar;
        boolean z10;
        boolean zOptBoolean;
        l8.m mVar2;
        boolean zOptBoolean2;
        l8.c cVar;
        if (jSONObject == null) {
            return new l8.i();
        }
        String strOptString = jSONObject.optString("gdprEncodingMode");
        boolean zOptBoolean3 = jSONObject.optBoolean("googleEnabled");
        String strOptString2 = jSONObject.optString("publisherLogo");
        strOptString2.getClass();
        int iOptInt = jSONObject.optInt("gvlVersion", 2);
        ArrayList arrayListE = d0.b.e(jSONObject, "stacks");
        int iOptInt2 = jSONObject.optInt("vendorListUpdateFreq");
        ArrayList arrayListE2 = d0.b.e(jSONObject, "vendorPurposeIds");
        ArrayList arrayListE3 = d0.b.e(jSONObject, "vendorFeaturesIds");
        ArrayList arrayListE4 = d0.b.e(jSONObject, "vendorPurposeLegitimateInterestIds");
        ArrayList arrayListE5 = d0.b.e(jSONObject, "vendorSpecialFeaturesIds");
        ArrayList arrayListE6 = d0.b.e(jSONObject, "vendorSpecialPurposesIds");
        ArrayList arrayListE7 = d0.b.e(jSONObject, "publisherPurposeIds");
        ArrayList arrayListE8 = d0.b.e(jSONObject, "publisherPurposeLegitimateInterestIds");
        ArrayList arrayListE9 = d0.b.e(jSONObject, "publisherSpecialPurposesIds");
        ArrayList arrayListE10 = d0.b.e(jSONObject, "publisherFeaturesIds");
        ArrayList arrayListE11 = d0.b.e(jSONObject, "publisherSpecialFeaturesIds");
        ArrayList arrayListE12 = d0.b.e(jSONObject, "publisherConsentRestrictionIds");
        ArrayList arrayListE13 = d0.b.e(jSONObject, "publisherLIRestrictionIds");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("gdprUiLabels");
        if (jSONObjectOptJSONObject == null) {
            z9 = zOptBoolean3;
            str = strOptString2;
            i = iOptInt;
            arrayList2 = arrayListE;
            i6 = iOptInt2;
            jVar = null;
        } else {
            boolean zOptBoolean4 = jSONObjectOptJSONObject.optBoolean("initScreenRejectButtonShowing");
            z9 = zOptBoolean3;
            String strOptString3 = jSONObjectOptJSONObject.optString("initScreenRejectButton");
            strOptString3.getClass();
            str = strOptString2;
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("initScreenCustomLinks");
            if (jSONArrayOptJSONArray == null) {
                i = iOptInt;
                arrayList2 = arrayListE;
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                i = iOptInt;
                int length = jSONArrayOptJSONArray.length();
                arrayList2 = arrayListE;
                int i10 = 0;
                while (i10 < length) {
                    int i11 = i10 + 1;
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i10);
                    int i12 = length;
                    String strOptString4 = jSONObjectOptJSONObject2.optString("label");
                    strOptString4.getClass();
                    String strOptString5 = jSONObjectOptJSONObject2.optString("link");
                    strOptString5.getClass();
                    arrayList.add(new h9.q(strOptString4, strOptString5));
                    i10 = i11;
                    jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                    length = i12;
                    iOptInt2 = iOptInt2;
                }
            }
            i6 = iOptInt2;
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            jVar = new l8.j(strOptString3, arrayList, zOptBoolean4);
        }
        if (jVar == null) {
            jVar = new l8.j();
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("nonIabVendorsInfo");
        if (jSONObjectOptJSONObject3 == null) {
            mVar = new l8.m();
            jVar2 = jVar;
        } else {
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject3.optJSONArray("nonIabVendorList");
            ArrayList arrayList3 = new ArrayList();
            if (jSONArrayOptJSONArray2 != null) {
                int length2 = jSONArrayOptJSONArray2.length();
                int i13 = 0;
                while (i13 < length2) {
                    int i14 = i13 + 1;
                    JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i13);
                    int iOptInt3 = jSONObject2.optInt("vendorId");
                    String strOptString6 = jSONObject2.optString("pCode");
                    strOptString6.getClass();
                    String strOptString7 = jSONObject2.optString("name");
                    strOptString7.getClass();
                    String strOptString8 = jSONObject2.optString("description", "");
                    strOptString8.getClass();
                    String strOptString9 = jSONObject2.optString("privacyPolicyUrl", "");
                    strOptString9.getClass();
                    ArrayList arrayListE14 = d0.b.e(jSONObject2, "nonIabPurposeConsentIds");
                    ArrayList arrayListE15 = d0.b.e(jSONObject2, "nonIabPurposeLegitimateInterestIds");
                    String strOptString10 = jSONObject2.optString("legitimateInterestClaimUrl", "");
                    strOptString10.getClass();
                    arrayList3.add(new l8.l(iOptInt3, strOptString6, strOptString7, strOptString8, strOptString9, arrayListE14, arrayListE15, strOptString10));
                    i13 = i14;
                    jVar = jVar;
                    jSONArrayOptJSONArray2 = jSONArrayOptJSONArray2;
                }
            }
            jVar2 = jVar;
            String strOptString11 = jSONObjectOptJSONObject3.optString("updateAt");
            strOptString11.getClass();
            String strOptString12 = jSONObjectOptJSONObject3.optString("nonIabVendorsHash");
            strOptString12.getClass();
            mVar = new l8.m(strOptString11, strOptString12, arrayList3);
        }
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("premiumProperties");
        l8.o oVar = jSONObjectOptJSONObject4 != null ? new l8.o(d0.b.e(jSONObjectOptJSONObject4, "vendorBlacklist"), d0.b.e(jSONObjectOptJSONObject4, "vendorWhitelist"), d0.b.e(jSONObjectOptJSONObject4, "googleWhitelist")) : null;
        if (oVar == null) {
            oVar = new l8.o();
        }
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("consentOrPay");
        if (jSONObjectOptJSONObject5 == null) {
            cVar = new l8.c();
            mVar2 = mVar;
        } else {
            JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject5.optJSONObject("actionButtonSettings");
            ArrayList arrayListQ = d0.b.q(jSONObjectOptJSONObject5, "countries");
            if (jSONObjectOptJSONObject6 == null) {
                zOptBoolean = false;
                z10 = false;
            } else {
                z10 = false;
                zOptBoolean = jSONObjectOptJSONObject6.optBoolean("action1Enabled", false);
            }
            if (jSONObjectOptJSONObject6 == null) {
                mVar2 = mVar;
                zOptBoolean2 = z10;
            } else {
                mVar2 = mVar;
                zOptBoolean2 = jSONObjectOptJSONObject6.optBoolean("action2Enabled", z10);
            }
            cVar = new l8.c(arrayListQ, new l8.a(zOptBoolean, zOptBoolean2));
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("translationUrls");
        jSONObject3.getClass();
        return new l8.i(strOptString, z9, str, i, arrayList2, i6, arrayListE2, arrayListE3, arrayListE4, arrayListE5, arrayListE6, arrayListE7, arrayListE8, arrayListE9, arrayListE10, arrayListE11, arrayListE12, arrayListE13, jVar2, mVar2, oVar, cVar, new l8.q(jSONObject3.optString("common"), jSONObject3.optString("theme"), jSONObject3.optString("all")));
    }

    public String C(String str) {
        ArrayList arrayList = (ArrayList) this.f5309b;
        for (int size = arrayList.size() - 2; size >= 0; size -= 2) {
            if (str.equalsIgnoreCase((String) arrayList.get(size))) {
                return (String) arrayList.get(size + 1);
            }
        }
        return null;
    }

    public boolean D(String str) {
        String strL = L(str);
        return "1".equals(strL) || Boolean.parseBoolean(strL);
    }

    public Integer E(String str) {
        String strL = L(str);
        if (TextUtils.isEmpty(strL)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strL));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + R(str) + "(" + strL + ") into an int");
            return null;
        }
    }

    public JSONArray F(String str) {
        String strL = L(str);
        if (TextUtils.isEmpty(strL)) {
            return null;
        }
        try {
            return new JSONArray(strL);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + R(str) + ": " + strL + ", falling back to default");
            return null;
        }
    }

    public int[] G() {
        JSONArray jSONArrayF = F("gcm.n.light_settings");
        if (jSONArrayF == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayF.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            int color = Color.parseColor(jSONArrayF.optString(0));
            if (color == -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = color;
            iArr[1] = jSONArrayF.optInt(1);
            iArr[2] = jSONArrayF.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e10) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayF + ". " + e10.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayF + ". Skipping setting LightSettings");
            return null;
        }
    }

    public Object[] H(String str) {
        JSONArray jSONArrayF = F(str.concat("_loc_args"));
        if (jSONArrayF == null) {
            return null;
        }
        int length = jSONArrayF.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArrayF.optString(i);
        }
        return strArr;
    }

    public String I(String str) {
        return L(str.concat("_loc_key"));
    }

    public Long J() {
        String strL = L("gcm.n.event_time");
        if (TextUtils.isEmpty(strL)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(strL));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + R("gcm.n.event_time") + "(" + strL + ") into a long");
            return null;
        }
    }

    public String K(Resources resources, String str, String str2) {
        String strL = L(str2);
        if (!TextUtils.isEmpty(strL)) {
            return strL;
        }
        String strI = I(str2);
        if (TextUtils.isEmpty(strI)) {
            return null;
        }
        int identifier = resources.getIdentifier(strI, TypedValues.Custom.S_STRING, str);
        if (identifier == 0) {
            Log.w("NotificationParams", R(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] objArrH = H(str2);
        if (objArrH == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, objArrH);
        } catch (MissingFormatArgumentException e10) {
            Log.w("NotificationParams", "Missing format argument for " + R(str2) + ": " + Arrays.toString(objArrH) + " Default value will be used.", e10);
            return null;
        }
    }

    public String L(String str) {
        Bundle bundle = (Bundle) this.f5309b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public long[] M() {
        JSONArray jSONArrayF = F("gcm.n.vibrate_timings");
        if (jSONArrayF == null) {
            return null;
        }
        try {
            if (jSONArrayF.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayF.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = jSONArrayF.optLong(i);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArrayF + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    public Bundle P() {
        Bundle bundle = (Bundle) this.f5309b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals(TypedValues.TransitionType.S_FROM)) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public void Q(String str) {
        ArrayList arrayList = (ArrayList) this.f5309b;
        int i = 0;
        while (i < arrayList.size()) {
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    @Override // g8.h
    public void a(j7.c cVar, j7.c cVar2, z7.b bVar) {
        ((g8.g) this.f5309b).j(cVar, cVar2, bVar, true);
    }

    @Override // g8.h
    public void b(j7.c cVar, d7.l lVar) {
        cVar.getClass();
        ((g8.g) this.f5309b).k(cVar, new g8.b(lVar), true);
    }

    @Override // j1.f
    public void c(Object obj) {
        ((j1.i) ((g) this.f5309b).f5315b).f6539a.n();
    }

    @Override // g8.h
    public void d(j7.c cVar, z7.b bVar) {
        bVar.getClass();
        ((g8.g) this.f5309b).k(cVar, new g8.a(bVar), true);
    }

    @Override // g8.h
    public void e(j7.c cVar, d7.l lVar) {
        ((g8.g) this.f5309b).h(cVar, lVar, true);
    }

    @Override // g8.h
    public void f(j7.c cVar, d7.l lVar) {
        ((g8.g) this.f5309b).i(cVar, lVar, true);
    }

    @Override // m6.a
    public Object get() {
        return this.f5309b;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return (RelativeLayout) this.f5309b;
    }

    @Override // a4.i
    public void h(Exception exc) {
        int i = this.f5308a;
        exc.getClass();
    }

    @Override // w1.a
    public void i(Bundle bundle) {
        ((p1.b) ((p1.a) this.f5309b)).a("clx", "_ae", bundle);
    }

    public h8.c j(JSONObject jSONObject) throws JSONException, ParseException {
        JSONObject jSONObject2;
        int i;
        String str;
        LinkedHashMap linkedHashMap;
        String str2;
        LinkedHashMap linkedHashMap2;
        String str3;
        g2.c cVar;
        h8.c cVar2 = new h8.c();
        cVar2.f5459a = jSONObject.optInt("gvlSpecificationVersion");
        cVar2.f5460b = Integer.valueOf(jSONObject.optInt("vendorListVersion"));
        cVar2.f5461c = Integer.valueOf(jSONObject.optInt("tcfPolicyVersion"));
        String strOptString = jSONObject.optString("lastUpdated");
        strOptString.getClass();
        Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", (Locale) this.f5309b).parse(strOptString);
        if (date != null) {
            date.getTime();
        }
        String str4 = "purposes";
        JSONObject jSONObject3 = jSONObject.getJSONObject("purposes");
        jSONObject3.getClass();
        cVar2.f5462d = t(jSONObject3, cVar2.f5459a);
        String str5 = "specialPurposes";
        JSONObject jSONObject4 = jSONObject.getJSONObject("specialPurposes");
        jSONObject4.getClass();
        cVar2.f5463e = t(jSONObject4, cVar2.f5459a);
        String str6 = "features";
        JSONObject jSONObject5 = jSONObject.getJSONObject("features");
        jSONObject5.getClass();
        cVar2.f = m(jSONObject5, cVar2.f5459a);
        JSONObject jSONObject6 = jSONObject.getJSONObject("specialFeatures");
        jSONObject6.getClass();
        cVar2.g = m(jSONObject6, cVar2.f5459a);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        JSONObject jSONObject7 = jSONObject.getJSONObject("stacks");
        Iterator<String> itKeys = jSONObject7.keys();
        itKeys.getClass();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObject8 = jSONObject7.getJSONObject(next);
            next.getClass();
            int iOptInt = jSONObject8.optInt("id");
            String strOptString2 = jSONObject8.optString("name");
            strOptString2.getClass();
            String strOptString3 = jSONObject8.optString("description");
            strOptString3.getClass();
            linkedHashMap3.put(next, new h8.g(iOptInt, strOptString2, strOptString3, new ArrayList(d0.b.e(jSONObject8, "purposes")), new ArrayList(d0.b.e(jSONObject8, "specialFeatures"))));
        }
        cVar2.i = linkedHashMap3;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("dataCategories");
        if (jSONObjectOptJSONObject != null) {
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
            itKeys2.getClass();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                JSONObject jSONObject9 = jSONObjectOptJSONObject.getJSONObject(next2);
                next2.getClass();
                int iOptInt2 = jSONObject9.optInt("id");
                JSONObject jSONObject10 = jSONObjectOptJSONObject;
                String strOptString4 = jSONObject9.optString("name");
                strOptString4.getClass();
                jSONObject9.optString("description").getClass();
                linkedHashMap4.put(next2, new h8.a(iOptInt2, strOptString4));
                jSONObjectOptJSONObject = jSONObject10;
            }
            cVar2.j = linkedHashMap4;
        }
        int i6 = cVar2.f5459a;
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("vendors");
        if (jSONObjectOptJSONObject2 != null) {
            Iterator<String> itKeys3 = jSONObjectOptJSONObject2.keys();
            itKeys3.getClass();
            while (itKeys3.hasNext()) {
                String next3 = itKeys3.next();
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject(next3);
                if (jSONObjectOptJSONObject3 != null) {
                    next3.getClass();
                    int iOptInt3 = jSONObjectOptJSONObject3.optInt("id");
                    String strOptString5 = jSONObjectOptJSONObject3.optString("name");
                    Set setI0 = q6.l.I0(d0.b.e(jSONObjectOptJSONObject3, str4));
                    Set setI02 = q6.l.I0(d0.b.e(jSONObjectOptJSONObject3, "legIntPurposes"));
                    Set setI03 = q6.l.I0(d0.b.e(jSONObjectOptJSONObject3, "flexiblePurposes"));
                    Set setI04 = q6.l.I0(d0.b.e(jSONObjectOptJSONObject3, str5));
                    Set setI05 = q6.l.I0(d0.b.e(jSONObjectOptJSONObject3, str6));
                    Set setI06 = q6.l.I0(d0.b.e(jSONObjectOptJSONObject3, "specialFeatures"));
                    String strOptString6 = jSONObjectOptJSONObject3.optString("policyUrl", "");
                    String strOptString7 = jSONObjectOptJSONObject3.optString("deletedDate", "");
                    strOptString7.getClass();
                    LinkedHashSet linkedHashSet = null;
                    String str7 = strOptString7.length() == 0 ? null : strOptString7;
                    if (i6 > 2) {
                        jSONObjectOptJSONObject3.optInt("overflow");
                    } else {
                        JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("overflow");
                        if (jSONObjectOptJSONObject4 != null) {
                            jSONObjectOptJSONObject4.optInt("httpGetLimit");
                        }
                    }
                    int iOptInt4 = jSONObjectOptJSONObject3.optInt("cookieMaxAgeSeconds");
                    jSONObjectOptJSONObject3.optBoolean("useCookies", false);
                    jSONObjectOptJSONObject3.optBoolean("cookieRefresh", false);
                    boolean zOptBoolean = jSONObjectOptJSONObject3.optBoolean("usesNonCookieAccess", false);
                    JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject3.optJSONObject("dataRetention");
                    if (jSONObjectOptJSONObject5 == null) {
                        jSONObject2 = jSONObjectOptJSONObject2;
                        str = str4;
                        i = i6;
                        str3 = str5;
                        str2 = str6;
                        cVar = null;
                    } else {
                        jSONObject2 = jSONObjectOptJSONObject2;
                        int iOptInt5 = jSONObjectOptJSONObject5.optInt("stdRetention");
                        i = i6;
                        JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject5.optJSONObject(str4);
                        if (jSONObjectOptJSONObject6 == null) {
                            str = str4;
                            linkedHashMap = null;
                        } else {
                            str = str4;
                            linkedHashMap = new LinkedHashMap();
                            Iterator<String> itKeys4 = jSONObjectOptJSONObject6.keys();
                            itKeys4.getClass();
                            while (itKeys4.hasNext()) {
                                String str8 = str6;
                                String next4 = itKeys4.next();
                                next4.getClass();
                                linkedHashMap.put(next4, Integer.valueOf(jSONObjectOptJSONObject6.optInt(next4)));
                                jSONObjectOptJSONObject6 = jSONObjectOptJSONObject6;
                                str6 = str8;
                            }
                        }
                        str2 = str6;
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        JSONObject jSONObjectOptJSONObject7 = jSONObjectOptJSONObject5.optJSONObject(str5);
                        if (jSONObjectOptJSONObject7 == null) {
                            linkedHashMap2 = null;
                        } else {
                            linkedHashMap2 = new LinkedHashMap();
                            Iterator<String> itKeys5 = jSONObjectOptJSONObject7.keys();
                            itKeys5.getClass();
                            while (itKeys5.hasNext()) {
                                String str9 = str5;
                                String next5 = itKeys5.next();
                                next5.getClass();
                                linkedHashMap2.put(next5, Integer.valueOf(jSONObjectOptJSONObject7.optInt(next5)));
                                jSONObjectOptJSONObject7 = jSONObjectOptJSONObject7;
                                str5 = str9;
                            }
                        }
                        str3 = str5;
                        if (linkedHashMap2 == null) {
                            linkedHashMap2 = new LinkedHashMap();
                        }
                        cVar = new g2.c(iOptInt5, linkedHashMap, linkedHashMap2);
                    }
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject3.optJSONArray("urls");
                    if (jSONArrayOptJSONArray != null) {
                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                        int length = jSONArrayOptJSONArray.length();
                        for (int i10 = 0; i10 < length; i10++) {
                            JSONObject jSONObject11 = jSONArrayOptJSONArray.getJSONObject(i10);
                            JSONArray jSONArray = jSONArrayOptJSONArray;
                            String strOptString8 = jSONObject11.optString("langId");
                            strOptString8.getClass();
                            int i11 = length;
                            String strOptString9 = jSONObject11.optString("privacy");
                            strOptString9.getClass();
                            String strOptString10 = jSONObject11.optString("legIntClaim");
                            strOptString10.getClass();
                            linkedHashSet2.add(new h8.h(strOptString8, strOptString9, strOptString10));
                            jSONArrayOptJSONArray = jSONArray;
                            length = i11;
                        }
                        linkedHashSet = linkedHashSet2;
                    }
                    if (linkedHashSet == null) {
                        linkedHashSet = new LinkedHashSet();
                    }
                    Set setI07 = q6.l.I0(d0.b.e(jSONObjectOptJSONObject3, "dataDeclaration"));
                    String strOptString11 = jSONObjectOptJSONObject3.optString("deviceStorageDisclosureUrl");
                    strOptString5.getClass();
                    strOptString6.getClass();
                    Boolean boolValueOf = Boolean.valueOf(zOptBoolean);
                    strOptString11.getClass();
                    linkedHashMap5.put(next3, new h8.i(iOptInt3, strOptString5, null, setI0, setI02, setI03, setI04, setI05, setI06, strOptString6, str7, iOptInt4, boolValueOf, setI07, cVar, linkedHashSet, strOptString11, 4));
                    jSONObjectOptJSONObject2 = jSONObject2;
                    i6 = i;
                    str4 = str;
                    str6 = str2;
                    str5 = str3;
                }
            }
        }
        cVar2.h = linkedHashMap5;
        return cVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5, types: [q6.t] */
    /* JADX WARN: Type inference failed for: r6v6 */
    public Object k(String str) {
        ?? arrayList;
        Regulations regulations;
        n6.a aVar;
        l8.b bVar;
        switch (this.f5308a) {
            case 5:
                str.getClass();
                try {
                    this.f5309b = new JSONArray(str);
                    LinkedHashMap linkedHashMapL = l();
                    u5.d dVar = new u5.d();
                    dVar.f10710a = linkedHashMapL;
                    return dVar;
                } catch (JSONException unused) {
                    ChoiceCmpCallback callback = ChoiceCmp.INSTANCE.getCallback();
                    if (callback != null) {
                        callback.onCmpError(ChoiceError.INVALID_JSON_FORMAT);
                    }
                    return new u5.d();
                }
            case 6:
                str.getClass();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("applicableRegulations");
                    if (jSONArrayOptJSONArray == null) {
                        arrayList = 0;
                    } else {
                        arrayList = new ArrayList();
                        int length = jSONArrayOptJSONArray.length();
                        int i = 0;
                        while (i < length) {
                            int i6 = i + 1;
                            String string = jSONArrayOptJSONArray.getString(i);
                            string.getClass();
                            Regulations[] regulationsArrValues = Regulations.values();
                            int length2 = regulationsArrValues.length;
                            int i10 = 0;
                            while (true) {
                                if (i10 < length2) {
                                    regulations = regulationsArrValues[i10];
                                    i10++;
                                    if (l7.u.m0(regulations.name(), string, true)) {
                                    }
                                } else {
                                    regulations = null;
                                }
                            }
                            if (regulations == null) {
                                regulations = Regulations.NA;
                            }
                            arrayList.add(regulations);
                            i = i6;
                        }
                    }
                    if (arrayList == 0) {
                        arrayList = q6.t.f8724a;
                    }
                    String strOptString = jSONObject.optString("inmobiAccountId");
                    String strOptString2 = jSONObject.optString("hashCode");
                    String strOptString3 = jSONObject.optString("publisherCountryCode");
                    String strOptString4 = jSONObject.optString("publisherName");
                    String strOptString5 = jSONObject.optString("lang_");
                    String strOptString6 = jSONObject.optString("siteUuid");
                    String strOptString7 = jSONObject.optString("themeUuid");
                    String strOptString8 = jSONObject.optString("cmpVersion");
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("geoIP");
                    if (jSONObjectOptJSONObject == null) {
                        aVar = null;
                    } else {
                        String strOptString9 = jSONObjectOptJSONObject.optString("country");
                        strOptString9.getClass();
                        String strOptString10 = jSONObjectOptJSONObject.optString("region");
                        strOptString10.getClass();
                        aVar = new n6.a(4, strOptString9, strOptString10);
                    }
                    if (aVar == null) {
                        aVar = new n6.a(7, null, null);
                    }
                    n6.a aVar2 = aVar;
                    l8.i iVarY = y(jSONObject.optJSONObject("gdprConfig"));
                    l8.k kVarA = A(jSONObject.optJSONObject("mspaConfig"));
                    JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("ccpaConfig");
                    if (jSONObjectOptJSONObject2 == null) {
                        bVar = null;
                    } else {
                        String strOptString11 = jSONObjectOptJSONObject2.optString("uspLspact");
                        strOptString11.getClass();
                        bVar = new l8.b(strOptString11);
                    }
                    if (bVar == null) {
                        bVar = new l8.b("");
                    }
                    l8.b bVar2 = bVar;
                    l8.h hVarX = x(jSONObject.optJSONObject("gbcConfig"));
                    l8.r rVarN = N(jSONObject.optJSONObject("uspPortalLabels"));
                    l8.d dVarR = r(jSONObject.optJSONObject("features"));
                    l8.p pVarB = B(jSONObject.optJSONObject("theme"));
                    String strOptString12 = jSONObject.optString("noRegulationMessage");
                    ArrayList arrayListQ = d0.b.q(jSONObject, "supportedLanguages");
                    String strOptString13 = jSONObject.optString("inmobiBrandingLogoUrl");
                    boolean zOptBoolean = jSONObject.optBoolean("optOutFromAllEnabled", false);
                    strOptString.getClass();
                    strOptString2.getClass();
                    strOptString3.getClass();
                    strOptString4.getClass();
                    strOptString5.getClass();
                    strOptString12.getClass();
                    strOptString13.getClass();
                    return new l8.n(arrayList, strOptString, strOptString2, strOptString3, strOptString4, strOptString5, strOptString6, strOptString7, strOptString8, aVar2, dVarR, pVarB, iVarY, kVarA, bVar2, hVarX, rVarN, strOptString12, arrayListQ, zOptBoolean, strOptString13, 4096);
                } catch (JSONException e10) {
                    a.a.h("Choice", kotlin.jvm.internal.l.g(e10.getMessage(), "Error parsing portal config: "), null, 4);
                    ChoiceCmpCallback choiceCmpCallback = (ChoiceCmpCallback) this.f5309b;
                    if (choiceCmpCallback != null) {
                        choiceCmpCallback.onCmpError(ChoiceError.UNKNOWN_CONFIG);
                    }
                    return new l8.n(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 4194303);
                }
            default:
                str.getClass();
                try {
                    return j(new JSONObject(str));
                } catch (JSONException unused2) {
                    ChoiceCmpCallback callback2 = ChoiceCmp.INSTANCE.getCallback();
                    if (callback2 != null) {
                        callback2.onCmpError(ChoiceError.INVALID_JSON_FORMAT);
                    }
                    return new h8.c();
                }
        }
    }

    public LinkedHashMap l() throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray jSONArray = (JSONArray) this.f5309b;
        if (jSONArray == null) {
            kotlin.jvm.internal.l.i("googleVendorsJson");
            throw null;
        }
        int length = jSONArray.length();
        int i = 0;
        while (i < length) {
            int i6 = i + 1;
            JSONArray jSONArray2 = (JSONArray) this.f5309b;
            if (jSONArray2 == null) {
                kotlin.jvm.internal.l.i("googleVendorsJson");
                throw null;
            }
            String string = jSONArray2.getString(i);
            if (string == null) {
                string = "0";
            }
            JSONArray jSONArray3 = (JSONArray) this.f5309b;
            if (jSONArray3 == null) {
                kotlin.jvm.internal.l.i("googleVendorsJson");
                throw null;
            }
            JSONObject jSONObject = jSONArray3.getJSONObject(i);
            String string2 = jSONObject.getString("provider_id");
            string2.getClass();
            int i10 = Integer.parseInt(string2);
            String string3 = jSONObject.getString("provider_name");
            string3.getClass();
            String string4 = jSONObject.getString("policy_url");
            string4.getClass();
            String string5 = jSONObject.getString("domains");
            string5.getClass();
            linkedHashMap.put(string, new u5.e(string3, string4, string5, i10));
            i = i6;
        }
        return linkedHashMap;
    }

    public void n(String str) {
        int iIndexOf = str.indexOf(":", 1);
        if (iIndexOf != -1) {
            o(str.substring(0, iIndexOf), str.substring(iIndexOf + 1));
        } else if (str.startsWith(":")) {
            o("", str.substring(1));
        } else {
            o("", str);
        }
    }

    public void o(String str, String str2) {
        ArrayList arrayList = (ArrayList) this.f5309b;
        arrayList.add(str);
        arrayList.add(str2.trim());
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public boolean onQueryTextChange(String str) {
        str.getClass();
        z5.c cVar = (z5.c) this.f5309b;
        c.h hVar = cVar.C;
        if (hVar == null) {
            kotlin.jvm.internal.l.i("switchAdapter");
            throw null;
        }
        z5.d dVar = cVar.B;
        if (dVar == null) {
            kotlin.jvm.internal.l.i("viewModel");
            throw null;
        }
        ArrayList arrayListC = dVar.c(str);
        boolean z9 = str.length() > 0;
        hVar.f1155a = arrayListC;
        if (!z9) {
            hVar.a();
        }
        hVar.notifyDataSetChanged();
        return true;
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public boolean onQueryTextSubmit(String str) {
        return true;
    }

    @Override // a4.i
    public void onSuccess() {
        switch (this.f5308a) {
            case 0:
                TvAppDetailFragment tvAppDetailFragment = (TvAppDetailFragment) this.f5309b;
                o7.c0.s(LifecycleOwnerKt.getLifecycleScope(tvAppDetailFragment), null, null, new e(tvAppDetailFragment, null, 2), 3);
                break;
            default:
                ((n5.d) this.f5309b).f8080q = true;
                break;
        }
    }

    @Override // j1.h
    public j1.p q(Object obj) {
        g2.d dVar = (g2.d) obj;
        y1.l lVar = ((y1.j) this.f5309b).f11631e;
        if (dVar != null) {
            return t1.Q(Arrays.asList(y1.l.a(lVar), lVar.f11643m.o(null, lVar.f11640e.f11908a)));
        }
        Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
        return t1.x(null);
    }

    @Override // j1.d
    public void s(j1.p pVar) {
        Exception excF = pVar.f();
        if (excF != null) {
            ((o7.l) this.f5309b).resumeWith(new p6.j(excF));
            return;
        }
        boolean z9 = pVar.f6563d;
        o7.l lVar = (o7.l) this.f5309b;
        if (z9) {
            lVar.o(null);
        } else {
            lVar.resumeWith(pVar.g());
        }
    }

    public synchronized void w(m8.f0 f0Var) {
        ((LinkedHashSet) this.f5309b).remove(f0Var);
    }

    public String z(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            n2.d dVar = (n2.d) this.f5309b;
            n2.e eVar = new n2.e(stringWriter, dVar.f7927a, dVar.f7928b, dVar.f7929c, dVar.f7930d);
            eVar.h(obj);
            eVar.j();
            eVar.f7932b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public /* synthetic */ f(Object obj, int i) {
        this.f5308a = i;
        this.f5309b = obj;
    }

    public f(f fVar, g gVar) {
        this.f5308a = 3;
        this.f5309b = gVar;
        Objects.requireNonNull(fVar);
    }

    public f(RelativeLayout relativeLayout, ImageView imageView, RelativeLayout relativeLayout2, TextView textView, TextView textView2) {
        this.f5308a = 14;
        this.f5309b = relativeLayout;
    }

    public f(Bundle bundle) {
        this.f5308a = 18;
        if (bundle != null) {
            this.f5309b = new Bundle(bundle);
        } else {
            com.google.gson.internal.a.i("data");
            throw null;
        }
    }

    public f(y1.j jVar, String str) {
        this.f5308a = 17;
        this.f5309b = jVar;
    }
}
