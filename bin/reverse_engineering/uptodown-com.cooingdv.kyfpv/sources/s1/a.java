package s1;

import com.google.android.gms.internal.measurement.i5;
import j$.util.DesugarCollections;
import j9.u;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f9115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f9116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9118e;
    public final d f;
    public final Set g;

    public a(String str, Set set, Set set2, int i, int i6, d dVar, Set set3) {
        this.f9114a = str;
        this.f9115b = DesugarCollections.unmodifiableSet(set);
        this.f9116c = DesugarCollections.unmodifiableSet(set2);
        this.f9117d = i;
        this.f9118e = i6;
        this.f = dVar;
        this.g = DesugarCollections.unmodifiableSet(set3);
    }

    public static u a(Class cls) {
        return new u(cls, new Class[0]);
    }

    public static u b(r rVar) {
        return new u(rVar, new r[0]);
    }

    public static a c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(cls));
        for (Class cls2 : clsArr) {
            i5.i(cls2, "Null interface");
            hashSet.add(r.a(cls2));
        }
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new androidx.core.view.inputmethod.a(obj, 25), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f9115b.toArray()) + ">{" + this.f9117d + ", type=" + this.f9118e + ", deps=" + Arrays.toString(this.f9116c.toArray()) + "}";
    }
}
