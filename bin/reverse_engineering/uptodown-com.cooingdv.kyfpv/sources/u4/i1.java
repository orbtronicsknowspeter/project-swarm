package u4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import c4.c3;
import com.google.android.gms.internal.measurement.z3;
import com.uptodown.R;
import com.uptodown.activities.MainActivity;
import java.util.ArrayList;
import java.util.Iterator;
import x4.p2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class i1 implements w4.i, w4.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m1 f10507a;

    public /* synthetic */ i1(m1 m1Var) {
        this.f10507a = m1Var;
    }

    @Override // w4.i
    public void a(x4.g gVar) {
        gVar.getClass();
        e4.h hVar = this.f10507a.f10539b;
        if (hVar != null) {
            int i = 0;
            for (e4.g gVar2 : hVar.f4545e) {
                int i6 = i + 1;
                if (gVar2 != null && gVar2.f4534b == 0) {
                    ArrayList arrayList = ((e4.f) gVar2.a()).f4525a;
                    if (arrayList == null) {
                        kotlin.jvm.internal.l.i("homeFeatures");
                        throw null;
                    }
                    arrayList.add(gVar);
                    hVar.notifyItemChanged(i);
                    return;
                }
                i = i6;
            }
        }
    }

    @Override // w4.i
    public void b(p2 p2Var) {
        e4.h hVar = this.f10507a.f10539b;
        if (hVar != null) {
            hVar.c(p2Var, hVar.f);
        }
    }

    @Override // w4.l
    public void c(x4.g gVar) {
        m1 m1Var = this.f10507a;
        if (m1Var.getActivity() instanceof MainActivity) {
            long j = gVar.f11159a;
            int i = gVar.f11192w0;
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(m1Var);
            v7.e eVar = o7.m0.f8289a;
            o7.c0.s(lifecycleScope, v7.d.f10885a, null, new c4.j0(m1Var, j, "impress", i, null, 10), 2);
        }
    }

    @Override // w4.i
    public void d(ArrayList arrayList) {
        arrayList.getClass();
        this.f10507a.f10540l = arrayList;
    }

    @Override // w4.i
    public void e(ArrayList arrayList) {
        ArrayList arrayList2;
        arrayList.getClass();
        int size = arrayList.size();
        m1 m1Var = this.f10507a;
        if (size > 3) {
            ArrayList arrayList3 = new ArrayList();
            m1Var.f10543o = arrayList3;
            arrayList3.add(arrayList.get(0));
            ArrayList arrayList4 = m1Var.f10543o;
            arrayList4.getClass();
            arrayList4.add(arrayList.get(1));
            ArrayList arrayList5 = m1Var.f10543o;
            arrayList5.getClass();
            arrayList5.add(arrayList.get(2));
        } else {
            m1Var.f10543o = arrayList;
        }
        e4.h hVar = m1Var.f10539b;
        if (hVar == null || (arrayList2 = m1Var.f10543o) == null || arrayList2.isEmpty()) {
            return;
        }
        Object obj = arrayList2.get(0);
        obj.getClass();
        hVar.c((p2) obj, hVar.f4547l);
        if (arrayList2.size() > 1) {
            Object obj2 = arrayList2.get(1);
            obj2.getClass();
            hVar.c((p2) obj2, hVar.f4548m);
        }
        if (arrayList2.size() > 2) {
            Object obj3 = arrayList2.get(2);
            obj3.getClass();
            hVar.c((p2) obj3, hVar.f4549n);
        }
    }

    @Override // w4.i
    public void f(p2 p2Var) {
        this.f10507a.f10542n = p2Var;
    }

    @Override // w4.i
    public void g() {
        m1 m1Var = this.f10507a;
        int i = 1;
        if (m1Var.f10540l.isEmpty()) {
            m1Var.b().f10041m.setVisibility(8);
            m1Var.b().f10039b.setVisibility(0);
        } else {
            e4.h hVar = m1Var.f10539b;
            if (hVar != null) {
                ArrayList arrayList = m1Var.f10540l;
                p2 p2Var = m1Var.f10542n;
                p2 p2Var2 = m1Var.f10544p;
                String string = m1Var.getString(R.string.trending_today);
                string.getClass();
                arrayList.getClass();
                hVar.f4545e = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                e4.f fVar = new e4.f();
                fVar.f4527c = string;
                fVar.f4525a = arrayList;
                fVar.f4526b = arrayList2;
                e4.g gVar = new e4.g();
                gVar.f4533a = fVar;
                gVar.f4534b = 0;
                hVar.f4545e.add(gVar);
                hVar.b(p2Var);
                hVar.f4545e.add(null);
                hVar.f = hVar.f4545e.size() - 1;
                hVar.b(p2Var2);
                hVar.f4545e.add(null);
                hVar.f4548m = hVar.f4545e.size() - 1;
                hVar.f4545e.add(null);
                hVar.g = hVar.f4545e.size() - 1;
                hVar.f4545e.add(null);
                hVar.f4549n = hVar.f4545e.size() - 1;
                hVar.f4545e.add(null);
                hVar.h = hVar.f4545e.size() - 1;
                hVar.f4545e.add(null);
                hVar.i = hVar.f4545e.size() - 1;
                hVar.f4545e.add(null);
                hVar.j = hVar.f4545e.size() - 1;
                hVar.f4545e.add(null);
                hVar.f4546k = hVar.f4545e.size() - 1;
            }
            m1Var.b().f10041m.setAdapter(m1Var.f10539b);
            m1Var.b().f10041m.setVisibility(0);
            m1Var.b().f10039b.setVisibility(8);
        }
        m1Var.b().f10040l.setVisibility(8);
        if (m1Var.getActivity() == null || !(m1Var.getActivity() instanceof MainActivity)) {
            return;
        }
        if (m1Var.f10545q) {
            m1Var.f10545q = false;
            FragmentActivity activity = m1Var.getActivity();
            activity.getClass();
            ((MainActivity) activity).l1();
        }
        if (z3.f2928c) {
            e4.h hVar2 = m1Var.f10539b;
            ArrayList arrayList3 = hVar2 != null ? hVar2.f4545e : null;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                FragmentActivity activity2 = m1Var.getActivity();
                activity2.getClass();
                MainActivity mainActivity = (MainActivity) activity2;
                RelativeLayout relativeLayout = mainActivity.f3312i0;
                if (relativeLayout == null || relativeLayout.getVisibility() != 0) {
                    return;
                }
                RelativeLayout relativeLayout2 = mainActivity.f3312i0;
                relativeLayout2.getClass();
                relativeLayout2.setVisibility(8);
                return;
            }
        }
        FragmentActivity activity3 = m1Var.getActivity();
        activity3.getClass();
        MainActivity mainActivity2 = (MainActivity) activity3;
        int i6 = 4;
        if (mainActivity2.f3312i0 == null) {
            mainActivity2.f3312i0 = (RelativeLayout) mainActivity2.findViewById(R.id.rl_container_error_no_connection);
            View viewInflate = LayoutInflater.from(mainActivity2).inflate(R.layout.error_no_connection, (ViewGroup) mainActivity2.f3312i0, false);
            RelativeLayout relativeLayout3 = mainActivity2.f3312i0;
            relativeLayout3.getClass();
            relativeLayout3.addView(viewInflate);
            RelativeLayout relativeLayout4 = mainActivity2.f3312i0;
            relativeLayout4.getClass();
            ((TextView) relativeLayout4.findViewById(R.id.tv_msg_enc)).setTypeface(f4.c.f4883w);
            RelativeLayout relativeLayout5 = mainActivity2.f3312i0;
            relativeLayout5.getClass();
            ((TextView) relativeLayout5.findViewById(R.id.tv_my_apps_label_enc)).setTypeface(f4.c.f4883w);
            RelativeLayout relativeLayout6 = mainActivity2.f3312i0;
            relativeLayout6.getClass();
            TextView textView = (TextView) relativeLayout6.findViewById(R.id.tv_updates_available_enc);
            textView.setTypeface(f4.c.f4884x);
            textView.setOnClickListener(new c3(i, mainActivity2));
            RelativeLayout relativeLayout7 = mainActivity2.f3312i0;
            relativeLayout7.getClass();
            TextView textView2 = (TextView) relativeLayout7.findViewById(R.id.tv_installed_enc);
            textView2.setTypeface(f4.c.f4884x);
            textView2.setOnClickListener(new c3(2, mainActivity2));
            RelativeLayout relativeLayout8 = mainActivity2.f3312i0;
            relativeLayout8.getClass();
            TextView textView3 = (TextView) relativeLayout8.findViewById(R.id.tv_downloads_enc);
            textView3.setTypeface(f4.c.f4884x);
            textView3.setOnClickListener(new c3(3, mainActivity2));
            RelativeLayout relativeLayout9 = mainActivity2.f3312i0;
            relativeLayout9.getClass();
            ((TextView) relativeLayout9.findViewById(R.id.tv_settings_enc)).setTypeface(f4.c.f4883w);
            RelativeLayout relativeLayout10 = mainActivity2.f3312i0;
            relativeLayout10.getClass();
            ((LinearLayout) relativeLayout10.findViewById(R.id.ll_container_settings_enc)).setOnClickListener(new c3(i6, mainActivity2));
            RelativeLayout relativeLayout11 = mainActivity2.f3312i0;
            relativeLayout11.getClass();
            TextView textView4 = (TextView) relativeLayout11.findViewById(R.id.tv_refresh_enc);
            textView4.setTypeface(f4.c.f4883w);
            textView4.setOnClickListener(new c3(5, mainActivity2));
            RelativeLayout relativeLayout12 = mainActivity2.f3312i0;
            relativeLayout12.getClass();
            mainActivity2.f3314k0 = (ProgressBar) relativeLayout12.findViewById(R.id.pb_loading_refresh_enc);
            RelativeLayout relativeLayout13 = mainActivity2.f3312i0;
            relativeLayout13.getClass();
            ((RelativeLayout) relativeLayout13.findViewById(R.id.rl_container_progressbar_enc)).setOnClickListener(new c4.e(8));
        }
        RelativeLayout relativeLayout14 = mainActivity2.f3312i0;
        relativeLayout14.getClass();
        relativeLayout14.setVisibility(0);
        ProgressBar progressBar = mainActivity2.f3314k0;
        progressBar.getClass();
        progressBar.setVisibility(4);
    }

    @Override // w4.i
    public void h(p2 p2Var) {
        e4.h hVar = this.f10507a.f10539b;
        if (hVar != null) {
            hVar.c(p2Var, hVar.g);
        }
    }

    @Override // w4.i
    public void i(p2 p2Var) {
        this.f10507a.f10544p = p2Var;
    }

    @Override // w4.i
    public void j(ArrayList arrayList) {
        e4.h hVar;
        arrayList.getClass();
        m1 m1Var = this.f10507a;
        m1Var.f10541m = arrayList;
        if (arrayList.isEmpty() || (hVar = m1Var.f10539b) == null) {
            return;
        }
        ArrayList arrayList2 = m1Var.f10541m;
        arrayList2.getClass();
        Iterator it = arrayList2.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            p2 p2Var = (p2) next;
            int i = p2Var.f11330a.f11225a;
            if (i == 521) {
                hVar.c(p2Var, hVar.i);
            } else if (i == 523) {
                hVar.c(p2Var, hVar.j);
            } else if (i != 524) {
                hVar.b(p2Var);
            } else {
                hVar.c(p2Var, hVar.f4546k);
            }
        }
    }

    @Override // w4.i
    public void k(ArrayList arrayList) {
        arrayList.getClass();
    }

    @Override // w4.i
    public void l(x4.g gVar) {
        gVar.getClass();
        e4.h hVar = this.f10507a.f10539b;
        if (hVar != null) {
            e4.g gVar2 = new e4.g();
            gVar2.f4533a = gVar;
            gVar2.f4534b = 3;
            hVar.f4545e.set(hVar.h, gVar2);
            hVar.notifyItemChanged(hVar.h);
        }
    }
}
