package k7;

import c4.w6;
import java.util.Iterator;
import kotlin.jvm.internal.a0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements Iterable, e7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7003b;

    public /* synthetic */ k(Object obj, int i) {
        this.f7002a = i;
        this.f7003b = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f7002a) {
            case 0:
                return new l7.b((d) this.f7003b);
            case 1:
                return new kotlin.jvm.internal.b((Object[]) this.f7003b);
            default:
                return new kotlin.jvm.internal.b(a0.d((Object[]) ((w6) this.f7003b).f2264b));
        }
    }
}
