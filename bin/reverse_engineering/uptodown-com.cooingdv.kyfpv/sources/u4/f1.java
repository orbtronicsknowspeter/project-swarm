package u4;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import c4.w6;
import com.google.android.gms.internal.measurement.z3;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.LoginActivity;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.UserActivity;
import x4.u2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f1 extends Fragment {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e4.c f10490l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f10491m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p6.m f10488a = new p6.m(new w6(this, 25));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p6.f f10489b = FragmentViewModelLazyKt.createViewModelLazy(this, kotlin.jvm.internal.y.a(c4.t0.class), new o9.a(new o9.a(this, 4), 5), null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g5.g f10492n = new g5.g(this, 14);

    public final t4.k a() {
        return (t4.k) this.f10488a.getValue();
    }

    public final c4.t0 b() {
        return (c4.t0) this.f10489b.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        RelativeLayout relativeLayout = a().f9927a;
        relativeLayout.getClass();
        return relativeLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        int i = 0;
        if (!z3.f2928c) {
            if (this.f10490l == null) {
                a().f9930m.setVisibility(8);
                a().f9931n.setVisibility(0);
                a().f9940x.setVisibility(0);
                a().f9940x.setText(getString(R.string.data_loading_error));
                a().f9941y.setVisibility(0);
                return;
            }
            return;
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        if (u2.h(contextRequireContext) == null) {
            a().f9940x.setVisibility(8);
            a().f9932o.setVisibility(8);
            a().f9930m.setVisibility(0);
            return;
        }
        a().f9930m.setVisibility(8);
        if (this.f10491m) {
            return;
        }
        this.f10491m = true;
        c4.t0 t0VarB = b();
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        t0VarB.a(contextRequireContext2);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        o7.c0.s(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new d1(this, null, i), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        a().f9942z.setTypeface(f4.c.f4883w);
        a().f9940x.setTypeface(f4.c.f4884x);
        a().f9938u.setTypeface(f4.c.f4883w);
        a().v.setTypeface(f4.c.f4883w);
        a().f9939w.setTypeface(f4.c.f4884x);
        a().f9941y.setTypeface(f4.c.f4883w);
        final int i = 1;
        final int i6 = 0;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(), 1, false);
        a().f9936s.setLayoutManager(linearLayoutManager);
        a().f9936s.addOnScrollListener(new c1(linearLayoutManager, this));
        a().f9932o.setOnClickListener(new c4.e(29));
        a().f9935r.setOnClickListener(new View.OnClickListener(this) { // from class: u4.b1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f1 f10433b;

            {
                this.f10433b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i10 = i6;
                f1 f1Var = this.f10433b;
                switch (i10) {
                    case 0:
                        if (f1Var.getActivity() instanceof MainActivity) {
                            FragmentActivity activity = f1Var.getActivity();
                            activity.getClass();
                            ((MainActivity) activity).A0();
                        }
                        break;
                    case 1:
                        if (f1Var.getActivity() instanceof MainActivity) {
                            FragmentActivity activity2 = f1Var.getActivity();
                            activity2.getClass();
                            MainActivity mainActivity = (MainActivity) activity2;
                            Intent intent = new Intent(mainActivity, (Class<?>) LoginActivity.class);
                            ActivityResultLauncher activityResultLauncher = mainActivity.C0;
                            float f = UptodownApp.I;
                            activityResultLauncher.launch(intent, b4.d.b(mainActivity));
                        }
                        break;
                    case 2:
                        if (f1Var.getActivity() instanceof MainActivity) {
                            FragmentActivity activity3 = f1Var.getActivity();
                            activity3.getClass();
                            MainActivity mainActivity2 = (MainActivity) activity3;
                            Intent intent2 = new Intent(mainActivity2, (Class<?>) UserActivity.class);
                            ActivityResultLauncher activityResultLauncher2 = mainActivity2.D0;
                            float f10 = UptodownApp.I;
                            activityResultLauncher2.launch(intent2, b4.d.b(mainActivity2));
                        }
                        break;
                    default:
                        FragmentActivity activity4 = f1Var.getActivity();
                        activity4.getClass();
                        if (((c4.k0) activity4).T()) {
                            c4.t0 t0VarB = f1Var.b();
                            Context contextRequireContext = f1Var.requireContext();
                            contextRequireContext.getClass();
                            t0VarB.a(contextRequireContext);
                        }
                        break;
                }
            }
        });
        a().f9934q.setOnClickListener(new View.OnClickListener(this) { // from class: u4.b1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f1 f10433b;

            {
                this.f10433b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i10 = i;
                f1 f1Var = this.f10433b;
                switch (i10) {
                    case 0:
                        if (f1Var.getActivity() instanceof MainActivity) {
                            FragmentActivity activity = f1Var.getActivity();
                            activity.getClass();
                            ((MainActivity) activity).A0();
                        }
                        break;
                    case 1:
                        if (f1Var.getActivity() instanceof MainActivity) {
                            FragmentActivity activity2 = f1Var.getActivity();
                            activity2.getClass();
                            MainActivity mainActivity = (MainActivity) activity2;
                            Intent intent = new Intent(mainActivity, (Class<?>) LoginActivity.class);
                            ActivityResultLauncher activityResultLauncher = mainActivity.C0;
                            float f = UptodownApp.I;
                            activityResultLauncher.launch(intent, b4.d.b(mainActivity));
                        }
                        break;
                    case 2:
                        if (f1Var.getActivity() instanceof MainActivity) {
                            FragmentActivity activity3 = f1Var.getActivity();
                            activity3.getClass();
                            MainActivity mainActivity2 = (MainActivity) activity3;
                            Intent intent2 = new Intent(mainActivity2, (Class<?>) UserActivity.class);
                            ActivityResultLauncher activityResultLauncher2 = mainActivity2.D0;
                            float f10 = UptodownApp.I;
                            activityResultLauncher2.launch(intent2, b4.d.b(mainActivity2));
                        }
                        break;
                    default:
                        FragmentActivity activity4 = f1Var.getActivity();
                        activity4.getClass();
                        if (((c4.k0) activity4).T()) {
                            c4.t0 t0VarB = f1Var.b();
                            Context contextRequireContext = f1Var.requireContext();
                            contextRequireContext.getClass();
                            t0VarB.a(contextRequireContext);
                        }
                        break;
                }
            }
        });
        final int i10 = 2;
        a().f9933p.setOnClickListener(new View.OnClickListener(this) { // from class: u4.b1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f1 f10433b;

            {
                this.f10433b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i102 = i10;
                f1 f1Var = this.f10433b;
                switch (i102) {
                    case 0:
                        if (f1Var.getActivity() instanceof MainActivity) {
                            FragmentActivity activity = f1Var.getActivity();
                            activity.getClass();
                            ((MainActivity) activity).A0();
                        }
                        break;
                    case 1:
                        if (f1Var.getActivity() instanceof MainActivity) {
                            FragmentActivity activity2 = f1Var.getActivity();
                            activity2.getClass();
                            MainActivity mainActivity = (MainActivity) activity2;
                            Intent intent = new Intent(mainActivity, (Class<?>) LoginActivity.class);
                            ActivityResultLauncher activityResultLauncher = mainActivity.C0;
                            float f = UptodownApp.I;
                            activityResultLauncher.launch(intent, b4.d.b(mainActivity));
                        }
                        break;
                    case 2:
                        if (f1Var.getActivity() instanceof MainActivity) {
                            FragmentActivity activity3 = f1Var.getActivity();
                            activity3.getClass();
                            MainActivity mainActivity2 = (MainActivity) activity3;
                            Intent intent2 = new Intent(mainActivity2, (Class<?>) UserActivity.class);
                            ActivityResultLauncher activityResultLauncher2 = mainActivity2.D0;
                            float f10 = UptodownApp.I;
                            activityResultLauncher2.launch(intent2, b4.d.b(mainActivity2));
                        }
                        break;
                    default:
                        FragmentActivity activity4 = f1Var.getActivity();
                        activity4.getClass();
                        if (((c4.k0) activity4).T()) {
                            c4.t0 t0VarB = f1Var.b();
                            Context contextRequireContext = f1Var.requireContext();
                            contextRequireContext.getClass();
                            t0VarB.a(contextRequireContext);
                        }
                        break;
                }
            }
        });
        a().f9937t.setColorSchemeColors(ContextCompat.getColor(requireContext(), R.color.main_blue), ContextCompat.getColor(requireContext(), R.color.main_blue_pressed));
        a().f9937t.setOnRefreshListener(new androidx.core.view.inputmethod.a(this, 27));
        final int i11 = 3;
        a().f9941y.setOnClickListener(new View.OnClickListener(this) { // from class: u4.b1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f1 f10433b;

            {
                this.f10433b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i102 = i11;
                f1 f1Var = this.f10433b;
                switch (i102) {
                    case 0:
                        if (f1Var.getActivity() instanceof MainActivity) {
                            FragmentActivity activity = f1Var.getActivity();
                            activity.getClass();
                            ((MainActivity) activity).A0();
                        }
                        break;
                    case 1:
                        if (f1Var.getActivity() instanceof MainActivity) {
                            FragmentActivity activity2 = f1Var.getActivity();
                            activity2.getClass();
                            MainActivity mainActivity = (MainActivity) activity2;
                            Intent intent = new Intent(mainActivity, (Class<?>) LoginActivity.class);
                            ActivityResultLauncher activityResultLauncher = mainActivity.C0;
                            float f = UptodownApp.I;
                            activityResultLauncher.launch(intent, b4.d.b(mainActivity));
                        }
                        break;
                    case 2:
                        if (f1Var.getActivity() instanceof MainActivity) {
                            FragmentActivity activity3 = f1Var.getActivity();
                            activity3.getClass();
                            MainActivity mainActivity2 = (MainActivity) activity3;
                            Intent intent2 = new Intent(mainActivity2, (Class<?>) UserActivity.class);
                            ActivityResultLauncher activityResultLauncher2 = mainActivity2.D0;
                            float f10 = UptodownApp.I;
                            activityResultLauncher2.launch(intent2, b4.d.b(mainActivity2));
                        }
                        break;
                    default:
                        FragmentActivity activity4 = f1Var.getActivity();
                        activity4.getClass();
                        if (((c4.k0) activity4).T()) {
                            c4.t0 t0VarB = f1Var.b();
                            Context contextRequireContext = f1Var.requireContext();
                            contextRequireContext.getClass();
                            t0VarB.a(contextRequireContext);
                        }
                        break;
                }
            }
        });
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        v7.e eVar = o7.m0.f8289a;
        p7.c cVar = t7.n.f10349a;
        t6.c cVar2 = null;
        o7.c0.s(lifecycleScope, cVar, null, new d1(this, cVar2, i), 2);
        o7.c0.s(LifecycleOwnerKt.getLifecycleScope(this), cVar, null, new d1(this, cVar2, i10), 2);
    }
}
