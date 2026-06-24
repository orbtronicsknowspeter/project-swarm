package a3;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f60b;

    public c(Set set, d dVar) {
        this.f59a = b(set);
        this.f60b = dVar;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb.append(aVar.f56a);
            sb.append('/');
            sb.append(aVar.f57b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set setUnmodifiableSet;
        d dVar = this.f60b;
        synchronized (((HashSet) dVar.f63b)) {
            setUnmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) dVar.f63b);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.f59a;
        if (zIsEmpty) {
            return str;
        }
        return str + ' ' + b(dVar.C());
    }
}
