package j$.util.function;

import j$.time.g;
import j$.util.Objects;
import j$.util.stream.Collectors;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function, BiConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f6052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function f6053c;

    public /* synthetic */ c(Function function, Function function2, int i) {
        this.f6051a = i;
        this.f6052b = function;
        this.f6053c = function2;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return j$.com.android.tools.r8.a.b(this, biConsumer);
    }

    public /* synthetic */ Function andThen(Function function) {
        switch (this.f6051a) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    public /* synthetic */ Function compose(Function function) {
        switch (this.f6051a) {
        }
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        switch (this.f6051a) {
            case 0:
                return this.f6053c.apply(this.f6052b.apply(obj));
            default:
                return this.f6052b.apply(this.f6053c.apply(obj));
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        Set set = Collectors.f6121a;
        Object objApply = this.f6052b.apply(obj2);
        Object objRequireNonNull = Objects.requireNonNull(this.f6053c.apply(obj2));
        Object objT = j$.util.c.t((Map) obj, objApply, objRequireNonNull);
        if (objT == null) {
            return;
        }
        g.g("Duplicate key %s (attempted merging values %s and %s)", new Object[]{objApply, objT, objRequireNonNull});
    }
}
