package o3;

import a4.x;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.Collection;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Predicate f8150b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f8151c;

    public a(boolean z9) {
        this.f8149a = z9;
    }

    public abstract void a(String str);

    public abstract String b();

    public abstract String c(int i, String str);

    @Override // o3.b
    public Object getValue() {
        return this.f8151c;
    }

    @Override // o3.b
    public void setValue(Object obj) {
        Predicate predicate = this.f8150b;
        if (predicate == null || predicate.test(obj)) {
            this.f8151c = obj;
        } else {
            if (obj instanceof Collection) {
                throw new q3.c(x.n(new StringBuilder("Invalid value '"), (String) Collection.EL.stream((java.util.Collection) obj).map(new m3.a(1)).collect(Collectors.joining(",")), "'"));
            }
            throw new q3.c("Invalid value '" + obj + "'");
        }
    }
}
