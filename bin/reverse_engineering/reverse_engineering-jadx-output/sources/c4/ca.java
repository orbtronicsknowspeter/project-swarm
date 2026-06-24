package c4;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class ca extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r7.o0 f1474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r7.o0 f1475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r7.o0 f1476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r7.o0 f1477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1478e;
    public final r7.o0 f;
    public final r7.o0 g;
    public final r7.o0 h;
    public final r7.o0 i;
    public final r7.o0 j;

    public ca() {
        j5.q qVar = j5.q.f6706a;
        r7.o0 o0VarB = r7.k0.b(qVar);
        this.f1474a = o0VarB;
        this.f1475b = o0VarB;
        r7.o0 o0VarB2 = r7.k0.b(qVar);
        this.f1476c = o0VarB2;
        this.f1477d = o0VarB2;
        this.f = r7.k0.b(ba.f1426a);
        Boolean bool = Boolean.TRUE;
        this.g = r7.k0.b(bool);
        this.h = r7.k0.b("");
        this.i = r7.k0.b(bool);
        this.j = r7.k0.b("");
    }

    public final void a(Context context, int i, String str) {
        o7.a0 viewModelScope = ViewModelKt.getViewModelScope(this);
        v7.e eVar = o7.m0.f8288a;
        o7.c0.s(viewModelScope, v7.d.f10884a, null, new b6.g(context, this, str, i, (t6.c) null), 2);
    }
}
