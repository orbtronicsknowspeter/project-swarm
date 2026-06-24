package androidx.core.util;

import a4.x;
import androidx.core.content.IntentSanitizer;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Predicate f380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f381c;

    public /* synthetic */ a(Class cls, Predicate predicate) {
        this.f379a = 2;
        this.f381c = cls;
        this.f380b = predicate;
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        int i = this.f379a;
        return x.a(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public final Predicate negate() {
        switch (this.f379a) {
        }
        return new b(this);
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        int i = this.f379a;
        return x.b(this, predicate);
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(Object obj) {
        switch (this.f379a) {
            case 0:
                return this.f380b.test(obj) || ((Predicate) this.f381c).test(obj);
            case 1:
                return this.f380b.test(obj) && ((Predicate) this.f381c).test(obj);
            default:
                return IntentSanitizer.Builder.lambda$allowExtra$13((Class) this.f381c, this.f380b, obj);
        }
    }

    public /* synthetic */ a(Predicate predicate, Predicate predicate2, int i) {
        this.f379a = i;
        this.f380b = predicate;
        this.f381c = predicate2;
    }
}
