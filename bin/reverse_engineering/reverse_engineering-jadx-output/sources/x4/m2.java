package x4;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11288c;

    public m2(Context context) {
        context.getClass();
        String string = null;
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
            if (sharedPreferences.contains("Language")) {
                string = sharedPreferences.getString("Language", null);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f11286a = string;
        this.f11287b = j5.o.a(context);
        this.f11288c = 728;
    }

    public final Object a(Context context, p pVar, v6.c cVar) throws Throwable {
        b5.m mVar = new b5.m(context, pVar, this);
        v7.e eVar = o7.m0.f8288a;
        Object objC = o7.c0.C(new c4.g(mVar, null, 24), v7.d.f10884a, cVar);
        p6.x xVar = p6.x.f8463a;
        u6.a aVar = u6.a.f10762a;
        if (objC != aVar) {
            objC = xVar;
        }
        return objC == aVar ? objC : xVar;
    }
}
