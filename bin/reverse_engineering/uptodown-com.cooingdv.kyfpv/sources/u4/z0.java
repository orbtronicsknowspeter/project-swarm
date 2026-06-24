package u4;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import x4.p2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class z0<VB extends ViewBinding> extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x4.j f10670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e4.h f10671b;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p2 f10674n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p2 f10675o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f10676p;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f10672l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f10673m = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x0 f10677q = new x0(this);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x0 f10678r = new x0(this);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y0 f10679s = new y0(this);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y0 f10680t = new y0(this);

    public abstract ViewBinding a();

    public abstract String b();

    public final void c() {
        if (this.f10676p) {
            d().setVisibility(8);
            return;
        }
        this.f10676p = true;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        x4.j jVar = this.f10670a;
        jVar.getClass();
        y2.s sVar = new y2.s(contextRequireContext, this.f10680t, jVar);
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        lifecycleScope.getClass();
        o7.c0.s(lifecycleScope, null, null, new p9.c(sVar, (t6.c) null, 4), 3);
    }

    public abstract View d();

    public abstract TextView g();

    public abstract RecyclerView h();

    public abstract TextView i();

    public abstract void j(x4.j jVar);

    public abstract void k(p2 p2Var);

    public abstract void l(String str);

    public final void m(String str) {
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        v7.e eVar = o7.m0.f8289a;
        o7.c0.s(lifecycleScope, t7.n.f10349a, null, new s4.e0(str, this, null, 5), 2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            x4.j jVar = new x4.j(0, (String) null, 7);
            this.f10670a = jVar;
            jVar.c(arguments);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        g().setTypeface(f4.c.f4884x);
        i().setTypeface(f4.c.f4883w);
        i().setOnClickListener(new m5.u0(this, 8));
        h().setItemAnimator(null);
        h().setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        h().addItemDecoration(new l5.h((int) getResources().getDimension(R.dimen.margin_m)));
        d().setVisibility(0);
        View root = a().getRoot();
        root.getClass();
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        float f = UptodownApp.I;
        v3.e eVar = UptodownApp.a0;
        if (eVar != null) {
            ((z3.g) eVar).e();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        v3.e eVar;
        super.onResume();
        float f = UptodownApp.I;
        v3.e eVar2 = UptodownApp.Z;
        if (eVar2 != null) {
            ((z3.g) eVar2).e();
        }
        if (getContext() != null) {
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            if (b4.d.e(contextRequireContext) && (eVar = UptodownApp.a0) != null) {
                ((z3.g) eVar).f();
            }
        }
        c();
    }
}
