package u5;

import android.util.Log;
import com.inmobi.cmp.ChoiceCmp;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.core.model.Vector;
import com.inmobi.cmp.model.ChoiceError;
import j$.time.ZonedDateTime;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class m {
    public final Vector A;
    public final Vector B;
    public Vector C;
    public final Vector D;
    public Vector E;
    public Vector F;
    public h G;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f10739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f10740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ZonedDateTime f10741d;
    public boolean f;
    public boolean g;
    public int j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10747o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10748p;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Vector f10757z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h8.c f10738a = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10742e = true;
    public String h = "AA";
    public int i = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10743k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f10744l = "EN";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f10745m = 10;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f10746n = 2021;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Vector f10749q = new Vector(null, 1, null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Vector f10750r = new Vector(null, 1, null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Vector f10751s = new Vector(null, 1, null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Vector f10752t = new Vector(null, 1, null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Vector f10753u = new Vector(null, 1, null);
    public Vector v = new Vector(null, 1, null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Vector f10754w = new Vector(null, 1, null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Vector f10755x = new Vector(null, 1, null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Vector f10756y = new Vector(null, 1, null);

    public m() {
        new LinkedHashSet();
        this.f10757z = new Vector(null, 1, null);
        this.A = new Vector(null, 1, null);
        this.B = new Vector(null, 1, null);
        this.C = new Vector(null, 1, null);
        this.D = new Vector(null, 1, null);
        this.E = new Vector(null, 1, null);
        this.F = new Vector(null, 1, null);
        this.G = new h(this.f10738a);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    public static boolean b(h8.i iVar) {
        ?? r02 = m9.c.e().f7240n.g;
        Set set = iVar.f5475d;
        if (set != null && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (r02.contains(Integer.valueOf(((Number) it.next()).intValue()))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    public static final boolean c(m mVar, h8.i iVar) {
        ?? r12 = m9.c.e().f7240n.i;
        Set set = iVar.f5476e;
        if (set != null && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (r12.contains(Integer.valueOf(((Number) it.next()).intValue()))) {
                return true;
            }
        }
        return false;
    }

    public final void a(String str) {
        str.getClass();
        String[] iSOCountries = Locale.getISOCountries();
        iSOCountries.getClass();
        Locale locale = Locale.getDefault();
        locale.getClass();
        String upperCase = str.toUpperCase(locale);
        upperCase.getClass();
        if (q6.j.j0(iSOCountries, upperCase) >= 0) {
            Locale locale2 = Locale.getDefault();
            locale2.getClass();
            String upperCase2 = str.toUpperCase(locale2);
            upperCase2.getClass();
            this.h = upperCase2;
            return;
        }
        n nVar = new n("publisherCountryCode", str);
        ChoiceCmpCallback callback = ChoiceCmp.INSTANCE.getCallback();
        if (callback != null) {
            callback.onCmpError(ChoiceError.TC_MODEL_PROPERTY_ERROR);
        }
        String message = nVar.getMessage();
        if (message == null) {
            message = "";
        }
        Object obj = Boolean.TRUE;
        if (obj.equals(obj)) {
            Log.e("f.u", message, nVar);
        }
    }

    public final int d() {
        h8.c cVar = this.f10738a;
        Integer num = cVar == null ? null : cVar.f5462c;
        return num == null ? this.f10743k : num.intValue();
    }

    public final void e() {
        this.B.setAllOwnedItems();
        this.f10757z.forEach(new l(this, 1));
        this.f10750r.setAllOwnedItems();
        this.f10751s.setAllOwnedItems();
        this.f10749q.setAllOwnedItems();
        this.C.forEach(new l(this, 2));
        this.A.forEach(new l(this, 0));
        this.D.setAllOwnedItems();
        this.v.setAllOwnedItems();
        this.f10754w.setAllOwnedItems();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && kotlin.jvm.internal.l.a(this.f10738a, ((m) obj).f10738a);
    }

    public final void f() {
        this.f10757z.forEach(new l(this, 4));
        this.C.forEach(new l(this, 2));
        Vector vector = this.B;
        vector.unset(vector.getKeys());
        this.A.unsetAllOwnedItems();
        this.f10749q.unsetAllOwnedItems();
        this.f10750r.unsetAllOwnedItems();
        this.f10751s.setAllOwnedItems();
        this.C.forEach(new l(this, 3));
        this.v.unsetAllOwnedItems();
        this.f10754w.unsetAllOwnedItems();
    }

    public final int hashCode() {
        h8.c cVar = this.f10738a;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }

    public final String toString() {
        return "TCModel(gvl=" + this.f10738a + ')';
    }
}
