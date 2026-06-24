package c4;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class i8 extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r7.o0 f1725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r7.o0 f1726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r7.o0 f1727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r7.o0 f1728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1729e;
    public boolean f;
    public int g;

    public i8() {
        r7.o0 o0VarB = r7.k0.b(j5.p.f6706a);
        this.f1725a = o0VarB;
        this.f1726b = o0VarB;
        r7.o0 o0VarB2 = r7.k0.b(Boolean.TRUE);
        this.f1727c = o0VarB2;
        this.f1728d = o0VarB2;
    }

    public final void a(Context context) {
        o7.a0 viewModelScope = ViewModelKt.getViewModelScope(this);
        v7.e eVar = o7.m0.f8289a;
        o7.c0.s(viewModelScope, v7.d.f10885a, null, new h8(this, context, null, 1), 2);
    }
}
