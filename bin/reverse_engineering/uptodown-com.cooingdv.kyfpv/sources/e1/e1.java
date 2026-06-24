package e1;

import android.content.SharedPreferences;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f3902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g1 f3903e;

    public e1(g1 g1Var, String str, long j) {
        Objects.requireNonNull(g1Var);
        this.f3903e = g1Var;
        k0.y.d(str);
        this.f3899a = str;
        this.f3900b = j;
    }

    public final long a() {
        if (!this.f3901c) {
            this.f3901c = true;
            this.f3902d = this.f3903e.k().getLong(this.f3899a, this.f3900b);
        }
        return this.f3902d;
    }

    public final void b(long j) {
        SharedPreferences.Editor editorEdit = this.f3903e.k().edit();
        editorEdit.putLong(this.f3899a, j);
        editorEdit.apply();
        this.f3902d = j;
    }
}
