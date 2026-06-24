package x4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d0 {
    public final r a() {
        if (this instanceof y) {
            return ((y) this).f11466a;
        }
        if (this instanceof c0) {
            return ((c0) this).f11076a;
        }
        if (this instanceof b0) {
            return ((b0) this).f11057a;
        }
        if (this instanceof v) {
            return ((v) this).f11420a;
        }
        if (this instanceof u) {
            return ((u) this).f11412a;
        }
        if (this instanceof x) {
            return ((x) this).f11447a;
        }
        if (this instanceof w) {
            return ((w) this).f11427a;
        }
        if (this instanceof t) {
            return ((t) this).f11395a;
        }
        if (equals(a0.f11042a) || equals(z.f11478a) || equals(s.f11383a)) {
            return null;
        }
        com.google.gson.internal.a.b();
        return null;
    }

    public final String b() {
        r rVarA = a();
        if (rVarA != null) {
            return rVarA.f11356b;
        }
        return null;
    }

    public final int c() {
        if (this instanceof y) {
            return 199;
        }
        if (this instanceof c0) {
            return 200;
        }
        if (this instanceof b0) {
            return 201;
        }
        if (this instanceof v) {
            return 205;
        }
        if (this instanceof u) {
            return 206;
        }
        if (this instanceof x) {
            return 202;
        }
        if (this instanceof w) {
            return 203;
        }
        if (this instanceof t) {
            return 207;
        }
        if (equals(a0.f11042a)) {
            return 208;
        }
        if (equals(z.f11478a)) {
            return 209;
        }
        if (equals(s.f11383a)) {
            return 210;
        }
        com.google.gson.internal.a.b();
        return 0;
    }
}
