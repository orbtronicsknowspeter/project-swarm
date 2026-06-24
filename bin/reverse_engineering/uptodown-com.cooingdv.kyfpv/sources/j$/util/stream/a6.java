package j$.util.stream;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a6 extends i5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Comparator f6136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6137c;

    public a6(m5 m5Var, Comparator comparator) {
        super(m5Var);
        this.f6136b = comparator;
    }

    @Override // j$.util.stream.i5, j$.util.stream.m5
    public final boolean e() {
        this.f6137c = true;
        return false;
    }
}
