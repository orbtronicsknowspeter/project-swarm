package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: loaded from: classes2.dex */
public class v3 extends CountedCompleter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h2 f6397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f6400d;

    public v3(h2 h2Var, Object obj, int i) {
        this.f6399c = i;
        this.f6397a = h2Var;
        this.f6398b = 0;
        this.f6400d = obj;
    }

    public v3(v3 v3Var, h2 h2Var, int i, byte b7) {
        super(v3Var);
        this.f6397a = h2Var;
        this.f6398b = i;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        int i;
        v3 v3VarA = this;
        while (v3VarA.f6397a.o() != 0) {
            v3VarA.setPendingCount(v3VarA.f6397a.o() - 1);
            int i6 = 0;
            int iCount = 0;
            while (true) {
                int iO = v3VarA.f6397a.o() - 1;
                i = v3VarA.f6398b;
                if (i6 < iO) {
                    v3 v3VarA2 = v3VarA.a(i6, i + iCount);
                    iCount = (int) (v3VarA2.f6397a.count() + ((long) iCount));
                    v3VarA2.fork();
                    i6++;
                }
            }
            v3VarA = v3VarA.a(i6, i + iCount);
        }
        switch (v3VarA.f6399c) {
            case 0:
                ((g2) v3VarA.f6397a).f(v3VarA.f6398b, v3VarA.f6400d);
                break;
            default:
                v3VarA.f6397a.k((Object[]) v3VarA.f6400d, v3VarA.f6398b);
                break;
        }
        v3VarA.propagateCompletion();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v3(v3 v3Var, h2 h2Var, int i) {
        this(v3Var, h2Var, i, (byte) 0);
        this.f6399c = 1;
        this.f6400d = (Object[]) v3Var.f6400d;
    }

    public final v3 a(int i, int i6) {
        switch (this.f6399c) {
            case 0:
                return new v3(this, ((g2) this.f6397a).a(i), i6);
            default:
                return new v3(this, this.f6397a.a(i), i6);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v3(v3 v3Var, g2 g2Var, int i) {
        this(v3Var, g2Var, i, (byte) 0);
        this.f6399c = 0;
        this.f6400d = v3Var.f6400d;
    }
}
