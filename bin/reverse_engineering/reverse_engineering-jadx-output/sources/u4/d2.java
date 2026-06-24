package u4;

import android.content.Context;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import java.util.HashMap;
import x4.g2;
import x4.p2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d2 extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r7.o0 f10458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r7.o0 f10459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r7.o0 f10460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r7.o0 f10461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10462e;
    public boolean f;
    public boolean g;
    public int h;

    public d2() {
        j5.p pVar = j5.p.f6705a;
        r7.o0 o0VarB = r7.k0.b(pVar);
        this.f10458a = o0VarB;
        this.f10459b = o0VarB;
        r7.o0 o0VarB2 = r7.k0.b(pVar);
        this.f10460c = o0VarB2;
        this.f10461d = o0VarB2;
    }

    public static final p2 a(d2 d2Var, Context context, x4.j jVar) {
        j5.v vVar = new j5.v(context);
        p2 p2Var = new p2(null, null, 7);
        jVar.getClass();
        p2Var.f11329a = jVar;
        int i = jVar.f11224a;
        if (i > 0) {
            if (jVar.f11227m) {
                int i6 = d2Var.h;
                HashMap map = new HashMap();
                map.put("page[limit]", String.valueOf(40));
                map.put("page[offset]", String.valueOf(i6));
                map.putAll(j5.v.g());
                String strG = a4.x.g(i, "/eapi/v2/floating-category/", "/data-and-apps-list");
                g2 g2VarK = vVar.k("https://www.uptodown.app:443".concat(strG), map, ShareTarget.METHOD_GET, false);
                g2VarK.f11206d = vVar.i(g2VarK, strG);
                p2Var = a.a.J(g2VarK, jVar);
            } else {
                int i10 = jVar.f11229o;
                if ((i10 == 0 || i10 == 831) && !jVar.f11228n) {
                    p2Var.f11330b = j5.v.E(vVar.t(i, 40, d2Var.h));
                } else {
                    p2Var = a.a.J(vVar.v(i, 40, d2Var.h), jVar);
                }
            }
        } else if (i == -1) {
            p2Var.f11330b = j5.v.E(vVar.s(40, d2Var.h));
        } else if (i == -2) {
            int i11 = jVar.f11229o;
            int i12 = d2Var.h;
            p2Var.f11330b = j5.v.E(i11 > 0 ? vVar.p(i11, 40, i12) : vVar.m(40, i12));
        } else if (i == -3) {
            int i13 = d2Var.h;
            HashMap map2 = new HashMap();
            map2.put("page[limit]", String.valueOf(40));
            map2.put("page[offset]", String.valueOf(i13));
            map2.putAll(j5.v.g());
            g2 g2VarK2 = vVar.k("https://www.uptodown.app:443".concat("/eapi/apps/latest-updates"), map2, ShareTarget.METHOD_GET, false);
            g2VarK2.f11206d = vVar.i(g2VarK2, "/eapi/apps/latest-updates");
            p2Var.f11330b = j5.v.E(g2VarK2);
        }
        d2Var.h = p2Var.f11330b.size() + d2Var.h;
        return p2Var;
    }

    public final String b() {
        r7.o0 o0Var = this.f10458a;
        if (!(o0Var.getValue() instanceof j5.r)) {
            return null;
        }
        Object value = o0Var.getValue();
        value.getClass();
        return ((a2) ((j5.r) value).f6707a).f10423a.f11329a.f11227m ? "floatingCategory" : "leafCategory";
    }

    public final void c(Context context, int i) {
        o7.a0 viewModelScope = ViewModelKt.getViewModelScope(this);
        v7.e eVar = o7.m0.f8288a;
        o7.c0.s(viewModelScope, v7.d.f10884a, null, new b2(context, this, i, null), 2);
    }

    public final void d(Context context, x4.g gVar, String str) {
        gVar.getClass();
        if (gVar.m()) {
            o7.a0 viewModelScope = ViewModelKt.getViewModelScope(this);
            v7.e eVar = o7.m0.f8288a;
            o7.c0.s(viewModelScope, v7.d.f10884a, null, new c4.w(this, context, gVar, str, (t6.c) null), 2);
        }
    }
}
