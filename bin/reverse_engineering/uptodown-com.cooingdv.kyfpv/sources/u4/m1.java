package u4;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import c4.w6;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import x4.p2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class m1 extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e4.h f10539b;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p2 f10542n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f10543o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p2 f10544p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f10546r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p6.m f10538a = new p6.m(new w6(this, 27));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f10540l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f10541m = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f10545q = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f10547s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h1 f10548t = new h1(this);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final h1 f10549u = new h1(this);
    public final i1 v = new i1(this);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i1 f10550w = new i1(this);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(u4.m1 r8, v6.c r9) {
        /*
            boolean r0 = r9 instanceof u4.k1
            if (r0 == 0) goto L13
            r0 = r9
            u4.k1 r0 = (u4.k1) r0
            int r1 = r0.f10521m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10521m = r1
            goto L18
        L13:
            u4.k1 r0 = new u4.k1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f10519b
            int r1 = r0.f10521m
            p6.x r2 = p6.x.f8464a
            r3 = 2
            r4 = 0
            r5 = 1
            u6.a r6 = u6.a.f10763a
            if (r1 == 0) goto L39
            if (r1 == r5) goto L33
            if (r1 != r3) goto L2d
            p6.a.e(r9)
            return r2
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r8)
            return r4
        L33:
            java.util.ArrayList r1 = r0.f10518a
            p6.a.e(r9)
            goto L5d
        L39:
            p6.a.e(r9)
            android.content.Context r9 = r8.getContext()
            if (r9 == 0) goto L71
            r8.f10546r = r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            v7.e r9 = o7.m0.f8289a
            v7.d r9 = v7.d.f10885a
            u4.l1 r7 = new u4.l1
            r7.<init>(r8, r1, r4)
            r0.f10518a = r1
            r0.f10521m = r5
            java.lang.Object r9 = o7.c0.C(r7, r9, r0)
            if (r9 != r6) goto L5d
            goto L70
        L5d:
            v7.e r9 = o7.m0.f8289a
            p7.c r9 = t7.n.f10349a
            u4.l1 r5 = new u4.l1
            r5.<init>(r1, r8, r4)
            r0.f10518a = r4
            r0.f10521m = r3
            java.lang.Object r8 = o7.c0.C(r5, r9, r0)
            if (r8 != r6) goto L71
        L70:
            return r6
        L71:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.m1.a(u4.m1, v6.c):java.lang.Object");
    }

    public final t4.p b() {
        return (t4.p) this.f10538a.getValue();
    }

    public final void c() {
        if (getContext() != null) {
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            new s4.s(contextRequireContext, this.f10550w, LifecycleOwnerKt.getLifecycleScope(this));
        }
    }

    public final void d(String str) {
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        v7.e eVar = o7.m0.f8289a;
        o7.c0.s(lifecycleScope, t7.n.f10349a, null, new s4.e0(str, this, null, 6), 2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10545q = true;
        this.f10539b = new e4.h(this.f10548t, this.f10549u, this.v, m1.class.getSimpleName());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        b().f10042n.setTypeface(f4.c.f4884x);
        b().f10043o.setTypeface(f4.c.f4883w);
        b().f10043o.setOnClickListener(new m5.u0(this, 9));
        b().f10041m.setItemAnimator(null);
        b().f10041m.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        b().f10041m.addItemDecoration(new l5.h((int) getResources().getDimension(R.dimen.margin_m)));
        b().f10041m.addOnScrollListener(new j1(this));
        c();
        FrameLayout frameLayout = b().f10038a;
        frameLayout.getClass();
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        float f = UptodownApp.I;
        v3.e eVar = UptodownApp.Z;
        if (eVar != null) {
            ((z3.g) eVar).e();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        v3.e eVar;
        super.onResume();
        float f = UptodownApp.I;
        v3.e eVar2 = UptodownApp.a0;
        if (eVar2 != null) {
            ((z3.g) eVar2).e();
        }
        if (getContext() != null) {
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            if (!b4.d.e(contextRequireContext) || (eVar = UptodownApp.Z) == null) {
                return;
            }
            ((z3.g) eVar).f();
        }
    }
}
