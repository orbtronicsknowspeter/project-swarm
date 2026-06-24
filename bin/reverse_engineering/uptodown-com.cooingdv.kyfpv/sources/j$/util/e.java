package j$.util;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Comparator, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6037a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Comparator f6038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6039c;

    public /* synthetic */ e(f fVar, Comparator comparator) {
        this.f6039c = fVar;
        this.f6038b = comparator;
    }

    public /* synthetic */ e(Function function, Comparator comparator) {
        this.f6038b = comparator;
        this.f6039c = function;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f6037a) {
            case 0:
                f fVar = (f) this.f6039c;
                Comparator comparator = this.f6038b;
                int iCompare = fVar.compare(obj, obj2);
                return iCompare != 0 ? iCompare : comparator.compare(obj, obj2);
            default:
                Comparator comparator2 = this.f6038b;
                Function function = (Function) this.f6039c;
                return comparator2.compare(function.apply(obj), function.apply(obj2));
        }
    }
}
