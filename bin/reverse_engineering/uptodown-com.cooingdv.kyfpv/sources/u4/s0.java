package u4;

import android.content.Context;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.lifecycle.ViewModelKt;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;
import x4.b3;
import x4.g2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class s0 extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f10596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f10597b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b3 f10598l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ArrayList f10599m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v0 f10600n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(Context context, long j, b3 b3Var, ArrayList arrayList, v0 v0Var, t6.c cVar) {
        super(2, cVar);
        this.f10596a = context;
        this.f10597b = j;
        this.f10598l = b3Var;
        this.f10599m = arrayList;
        this.f10600n = v0Var;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        return new s0(this.f10596a, this.f10597b, this.f10598l, this.f10599m, this.f10600n, cVar);
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        s0 s0Var = (s0) create((o7.a0) obj, (t6.c) obj2);
        p6.x xVar = p6.x.f8464a;
        s0Var.invokeSuspend(xVar);
        return xVar;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        JSONObject jSONObject;
        p6.a.e(obj);
        Context context = this.f10596a;
        j5.v vVar = new j5.v(context);
        long j = this.f10598l.f11066a;
        ArrayList arrayList = this.f10599m;
        ArrayList arrayList2 = new ArrayList(q6.n.i0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(new Long(((b3) obj2).f11066a));
        }
        HashMap map = new HashMap();
        map.put("deviceID", String.valueOf(j));
        map.put("targetDeviceIDs", arrayList2.toString());
        StringBuilder sb = new StringBuilder("/eapi/app/");
        long j6 = this.f10597b;
        String strL = a4.x.l(sb, j6, "/remote-install");
        g2 g2VarK = vVar.k("https://www.uptodown.app:443".concat(strL), map, ShareTarget.METHOD_POST, false);
        g2VarK.f11207d = vVar.i(g2VarK, strL);
        if (!g2VarK.b() && (jSONObject = g2VarK.f11207d) != null && jSONObject.optInt("success") == 1) {
            v0 v0Var = this.f10600n;
            o7.a0 viewModelScope = ViewModelKt.getViewModelScope(v0Var);
            v7.e eVar = o7.m0.f8289a;
            o7.c0.s(viewModelScope, v7.d.f10885a, null, new q0(v0Var, context, vVar, j6, (t6.c) null), 2);
        }
        return p6.x.f8464a;
    }
}
