package b8;

import a4.x;
import java.util.ArrayList;
import java.util.HashSet;
import q6.t;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1099b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f1100c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f1101d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f1102e = new ArrayList();
    public final ArrayList f = new ArrayList();

    public a(String str) {
        this.f1098a = str;
    }

    public static void a(a aVar, String str, e eVar) {
        aVar.getClass();
        eVar.getClass();
        if (!aVar.f1100c.add(str)) {
            StringBuilder sbV = x.v("Element with name '", str, "' is already registered in ");
            sbV.append(aVar.f1098a);
            throw new IllegalArgumentException(sbV.toString().toString());
        }
        aVar.f1099b.add(str);
        aVar.f1101d.add(eVar);
        aVar.f1102e.add(t.f8724a);
        aVar.f.add(false);
    }
}
