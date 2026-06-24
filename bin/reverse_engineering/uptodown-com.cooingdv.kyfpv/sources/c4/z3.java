package c4;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.browser.trusted.sharing.ShareTarget;
import com.uptodown.R;
import com.uptodown.activities.MoreInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class z3 extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2388a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f2389b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MoreInfo f2390l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(MoreInfo moreInfo, kotlin.jvm.internal.x xVar, t6.c cVar) {
        super(2, cVar);
        this.f2390l = moreInfo;
        this.f2389b = xVar;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f2388a) {
            case 0:
                return new z3(this.f2390l, this.f2389b, cVar);
            default:
                return new z3(this.f2389b, this.f2390l, cVar);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f2388a) {
            case 0:
                z3 z3Var = (z3) create(a0Var, cVar);
                p6.x xVar = p6.x.f8464a;
                z3Var.invokeSuspend(xVar);
                return xVar;
            default:
                z3 z3Var2 = (z3) create(a0Var, cVar);
                p6.x xVar2 = p6.x.f8464a;
                z3Var2.invokeSuspend(xVar2);
                return xVar2;
        }
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        String str;
        JSONArray jSONArrayOptJSONArray;
        String str2;
        int i = this.f2388a;
        p6.x xVar = p6.x.f8464a;
        String string = null;
        kotlin.jvm.internal.x xVar2 = this.f2389b;
        MoreInfo moreInfo = this.f2390l;
        int i6 = 0;
        switch (i) {
            case 0:
                p6.a.e(obj);
                Context applicationContext = moreInfo.getApplicationContext();
                applicationContext.getClass();
                j5.v vVar = new j5.v(applicationContext);
                x4.g gVar = moreInfo.Q;
                gVar.getClass();
                x4.g2 g2VarK = vVar.k(k0.k.g(gVar.f11159a, "https://www.uptodown.app:443/eapi/v2/app/", "/languages"), null, ShareTarget.METHOD_GET, false);
                g2VarK.f11207d = vVar.i(g2VarK, "/eapi/v2/app/appId/languages");
                if (!g2VarK.b() && (str = g2VarK.f11204a) != null && str.length() != 0) {
                    String str3 = g2VarK.f11204a;
                    str3.getClass();
                    JSONObject jSONObject = new JSONObject(str3);
                    if (jSONObject.optInt("success") == 1 && (jSONArrayOptJSONArray = jSONObject.optJSONArray("data")) != null) {
                        xVar2.f7025a = new ArrayList();
                        int length = jSONArrayOptJSONArray.length();
                        while (i6 < length) {
                            ((ArrayList) xVar2.f7025a).add(jSONArrayOptJSONArray.getString(i6));
                            i6++;
                        }
                    }
                }
                break;
            default:
                p6.a.e(obj);
                Collection collection = (Collection) xVar2.f7025a;
                if (collection == null || collection.isEmpty()) {
                    int i10 = MoreInfo.V;
                    moreInfo.B0().B.setVisibility(8);
                } else {
                    int i11 = MoreInfo.V;
                    moreInfo.B0().B.setVisibility(0);
                    moreInfo.B0().f10180i0.setTypeface(f4.c.f4883w);
                    moreInfo.B0().f10181j0.setTypeface(f4.c.f4884x);
                    try {
                        SharedPreferences sharedPreferences = moreInfo.getSharedPreferences("SettingsPreferences", 0);
                        if (sharedPreferences.contains("Language")) {
                            string = sharedPreferences.getString("Language", null);
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    String[] stringArray = moreInfo.getResources().getStringArray(R.array.languageCodes);
                    stringArray.getClass();
                    String[] stringArray2 = moreInfo.getResources().getStringArray(R.array.localizedLang);
                    stringArray2.getClass();
                    int length2 = stringArray.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= length2) {
                            str2 = "";
                        } else if (stringArray[i12].equals(string)) {
                            str2 = stringArray2[i12];
                            str2.getClass();
                        } else {
                            i12++;
                        }
                    }
                    if (str2.length() <= 0 || !((ArrayList) xVar2.f7025a).contains(str2)) {
                        moreInfo.B0().f10181j0.setText(String.valueOf(((ArrayList) xVar2.f7025a).size()));
                    } else {
                        moreInfo.B0().f10181j0.setText(moreInfo.getString(R.string.app_info_languages, str2, String.valueOf(((ArrayList) xVar2.f7025a).size() - 1)));
                    }
                    moreInfo.B0().B.setOnClickListener(new t3(moreInfo, 9));
                    ArrayList arrayList = (ArrayList) xVar2.f7025a;
                    LinearLayout linearLayout = moreInfo.B0().f10192q;
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.setMargins(0, 0, 0, 0);
                    arrayList.getClass();
                    int size = arrayList.size();
                    while (i6 < size) {
                        t4.q qVarA = t4.q.a(LayoutInflater.from(moreInfo.getApplicationContext()));
                        TextView textView = qVarA.f10062l;
                        LinearLayout linearLayout2 = qVarA.f10061b;
                        linearLayout2.setLayoutParams(layoutParams);
                        textView.setTypeface(f4.c.f4884x);
                        Object obj2 = arrayList.get(i6);
                        obj2.getClass();
                        String upperCase = ((String) obj2).toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        textView.setText(upperCase);
                        linearLayout.addView(linearLayout2);
                        i6++;
                    }
                }
                break;
        }
        return xVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(kotlin.jvm.internal.x xVar, MoreInfo moreInfo, t6.c cVar) {
        super(2, cVar);
        this.f2389b = xVar;
        this.f2390l = moreInfo;
    }
}
