package androidx.window.embedding;

import android.util.Pair;
import j$.util.function.Predicate$CC;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EmbeddingAdapter f528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f529c;

    public /* synthetic */ c(EmbeddingAdapter embeddingAdapter, Set set, int i) {
        this.f527a = i;
        this.f528b = embeddingAdapter;
        this.f529c = set;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        int i = this.f527a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ Predicate negate() {
        switch (this.f527a) {
        }
        return Predicate$CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        int i = this.f527a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f527a) {
            case 0:
                return EmbeddingAdapter.m226translateActivityPairPredicates$lambda1(this.f528b, this.f529c, (Pair) obj);
            default:
                return EmbeddingAdapter.m225translateActivityIntentPredicates$lambda3(this.f528b, this.f529c, (Pair) obj);
        }
    }
}
