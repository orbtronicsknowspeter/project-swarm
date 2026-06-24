package t3;

import a4.x;
import androidx.lifecycle.l;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f9559b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9560c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9561d = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r3.b f9558a = f();

    public final void a(String str) {
        this.f9559b = str;
        this.f9560c = false;
        this.f9561d = false;
    }

    public abstract void b(String str, r3.b bVar);

    public final String c() {
        String str = this.f9559b;
        if (str == null || str.isEmpty() || this.f9560c) {
            this.f9559b = d(this.f9558a);
            this.f9560c = false;
            this.f9561d = true;
        }
        return this.f9559b;
    }

    public abstract String d(r3.b bVar);

    public final Object e(String str) {
        boolean z9 = this.f9561d;
        r3.b bVar = this.f9558a;
        if (!z9) {
            b(this.f9559b, bVar);
            this.f9560c = false;
            this.f9561d = true;
        }
        if (bVar.a(str)) {
            return bVar.get(str).getValue();
        }
        throw new q3.b(l.w("Invalid field: '", str, "'"));
    }

    public abstract r3.b f();

    public final void g(String str, Object obj) {
        boolean z9 = this.f9561d;
        r3.b bVar = this.f9558a;
        if (!z9) {
            b(this.f9559b, bVar);
            this.f9560c = false;
            this.f9561d = true;
        }
        if (!bVar.a(str)) {
            throw new q3.b(x.C(str, " not found"));
        }
        bVar.get(str).setValue(obj);
        this.f9560c = true;
    }
}
