package e1;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g1 f3875e;

    public d1(g1 g1Var, String str, boolean z9) {
        this.f3875e = g1Var;
        k0.y.d(str);
        this.f3871a = str;
        this.f3872b = z9;
    }

    public final boolean a() {
        if (!this.f3873c) {
            this.f3873c = true;
            this.f3874d = this.f3875e.k().getBoolean(this.f3871a, this.f3872b);
        }
        return this.f3874d;
    }

    public final void b(boolean z9) {
        SharedPreferences.Editor editorEdit = this.f3875e.k().edit();
        editorEdit.putBoolean(this.f3871a, z9);
        editorEdit.apply();
        this.f3874d = z9;
    }
}
