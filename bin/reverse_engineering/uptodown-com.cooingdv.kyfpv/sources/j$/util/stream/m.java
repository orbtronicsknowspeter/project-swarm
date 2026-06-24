package j$.util.stream;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends i5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f6286c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(a aVar, m5 m5Var, int i) {
        super(m5Var);
        this.f6285b = i;
        this.f6286c = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(m5 m5Var) {
        super(m5Var);
        this.f6285b = 0;
    }

    @Override // j$.util.stream.i5, j$.util.stream.m5
    public void end() {
        switch (this.f6285b) {
            case 0:
                this.f6286c = null;
                this.f6225a.end();
                break;
            default:
                super.end();
                break;
        }
    }

    @Override // j$.util.stream.i5, j$.util.stream.m5
    public void c(long j) {
        switch (this.f6285b) {
            case 0:
                this.f6286c = new HashSet();
                this.f6225a.c(-1L);
                break;
            case 1:
            default:
                super.c(j);
                break;
            case 2:
                this.f6225a.c(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f6285b) {
            case 0:
                if (!((Set) this.f6286c).contains(obj)) {
                    ((Set) this.f6286c).add(obj);
                    this.f6225a.accept(obj);
                }
                break;
            case 1:
                ((Consumer) ((r) this.f6286c).f6337m).accept(obj);
                this.f6225a.accept(obj);
                break;
            case 2:
                if (((Predicate) ((r) this.f6286c).f6337m).test(obj)) {
                    this.f6225a.accept(obj);
                }
                break;
            case 3:
                this.f6225a.accept(((Function) ((r) this.f6286c).f6337m).apply(obj));
                break;
            case 4:
                this.f6225a.accept(((ToIntFunction) ((v0) this.f6286c).f6396m).applyAsInt(obj));
                break;
            case 5:
                this.f6225a.accept(((ToLongFunction) ((g1) this.f6286c).f6202m).applyAsLong(obj));
                break;
            default:
                this.f6225a.accept(((ToDoubleFunction) ((x) this.f6286c).f6421m).applyAsDouble(obj));
                break;
        }
    }
}
