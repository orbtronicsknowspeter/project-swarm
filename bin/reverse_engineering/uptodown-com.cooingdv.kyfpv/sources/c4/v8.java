package c4;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class v8 extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r7.o0 f2213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r7.o0 f2214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r7.o0 f2215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r7.o0 f2216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r7.o0 f2217e;
    public final r7.o0 f;
    public final r7.o0 g;
    public final r7.o0 h;
    public final r7.o0 i;
    public final r7.o0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final r7.o0 f2218k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r7.o0 f2219l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r7.o0 f2220m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r7.o0 f2221n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final r7.o0 f2222o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r7.o0 f2223p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r7.o0 f2224q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2225r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f2226s;

    public v8() {
        j5.p pVar = j5.p.f6706a;
        r7.o0 o0VarB = r7.k0.b(pVar);
        this.f2213a = o0VarB;
        this.f2214b = o0VarB;
        r7.o0 o0VarB2 = r7.k0.b(pVar);
        this.f2215c = o0VarB2;
        this.f2216d = o0VarB2;
        j5.q qVar = j5.q.f6707a;
        r7.o0 o0VarB3 = r7.k0.b(qVar);
        this.f2217e = o0VarB3;
        this.f = o0VarB3;
        r7.o0 o0VarB4 = r7.k0.b(pVar);
        this.g = o0VarB4;
        this.h = o0VarB4;
        r7.o0 o0VarB5 = r7.k0.b(qVar);
        this.i = o0VarB5;
        this.j = o0VarB5;
        this.f2218k = r7.k0.b("");
        this.f2219l = r7.k0.b("");
        this.f2220m = r7.k0.b(null);
        this.f2221n = r7.k0.b(null);
        this.f2222o = r7.k0.b(null);
        this.f2223p = r7.k0.b(0L);
        this.f2224q = r7.k0.b(null);
        this.f2225r = true;
    }

    public final void a(Context context, int i, String str) {
        if (i == 1) {
            o7.a0 viewModelScope = ViewModelKt.getViewModelScope(this);
            v7.e eVar = o7.m0.f8289a;
            o7.c0.s(viewModelScope, v7.d.f10885a, null, new u8(context, str, this, null, 1), 2);
        } else {
            o7.a0 viewModelScope2 = ViewModelKt.getViewModelScope(this);
            v7.e eVar2 = o7.m0.f8289a;
            o7.c0.s(viewModelScope2, v7.d.f10885a, null, new u8(context, str, this, null, 0), 2);
        }
    }
}
