package b0;

import a3.b;
import android.util.SparseArray;
import androidx.lifecycle.l;
import java.util.HashMap;
import o.d;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseArray f709a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f710b;

    static {
        HashMap map = new HashMap();
        f710b = map;
        map.put(d.f8126a, 0);
        map.put(d.f8127b, 1);
        map.put(d.f8128l, 2);
        for (d dVar : map.keySet()) {
            f709a.append(((Integer) f710b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f710b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        b.l(dVar, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    public static d b(int i) {
        d dVar = (d) f709a.get(i);
        if (dVar != null) {
            return dVar;
        }
        com.google.gson.internal.a.p(l.u(i, "Unknown Priority for value "));
        return null;
    }
}
