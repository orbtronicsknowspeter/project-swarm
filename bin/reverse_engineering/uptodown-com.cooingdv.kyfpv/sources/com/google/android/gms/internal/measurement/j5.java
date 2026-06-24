package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class j5 implements d6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j5 f2669b = new j5(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2670a;

    public /* synthetic */ j5(int i) {
        this.f2670a = i;
    }

    public static final b6 c(Object obj, Object obj2) {
        b6 b6VarA = (b6) obj;
        b6 b6Var = (b6) obj2;
        if (!b6Var.isEmpty()) {
            if (!b6VarA.f2517a) {
                b6VarA = b6VarA.a();
            }
            b6VarA.d();
            if (!b6Var.isEmpty()) {
                b6VarA.putAll(b6Var);
            }
        }
        return b6VarA;
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public boolean a(Class cls) {
        switch (this.f2670a) {
            case 0:
                return l5.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public l6 b(Class cls) {
        switch (this.f2670a) {
            case 0:
                if (l5.class.isAssignableFrom(cls)) {
                    try {
                        return (l6) l5.k(cls.asSubclass(l5.class)).n(3);
                    } catch (Exception e10) {
                        androidx.privacysandbox.ads.adservices.customaudience.a.m("Unable to get message info for ".concat(cls.getName()), e10);
                    }
                } else {
                    com.google.gson.internal.a.p("Unsupported message type: ".concat(cls.getName()));
                }
                return null;
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
