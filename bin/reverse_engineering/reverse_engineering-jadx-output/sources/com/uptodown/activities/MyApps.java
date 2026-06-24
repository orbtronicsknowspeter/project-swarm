package com.uptodown.activities;

import a3.d;
import android.app.NotificationManager;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.core.content.ContextCompat;
import androidx.core.view.inputmethod.a;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.SimpleItemAnimator;
import androidx.room.g;
import c4.c4;
import c4.e4;
import c4.f4;
import c4.h4;
import c4.i4;
import c4.l1;
import c4.l4;
import c4.m4;
import c4.n4;
import c4.w4;
import c4.y4;
import e4.p;
import e4.v0;
import f4.c;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.y;
import l5.f;
import l7.u;
import o7.a0;
import o7.c0;
import o7.m0;
import p6.m;
import t4.x;
import t7.n;
import x4.d0;
import x4.e;
import x4.j0;
import x4.p0;
import x4.q2;
import x4.r;
import x4.u0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class MyApps extends w4 {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final /* synthetic */ int f3328g0 = 0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public p f3330c0;
    public final String Z = "listado_instaladas";
    public final m a0 = new m(new g(this, 24));

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final ViewModelLazy f3329b0 = new ViewModelLazy(y.a(y4.class), new m4(this, 0), new l4(this), new m4(this, 1));

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final e4 f3331d0 = new e4(this, 0);

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final e4 f3332e0 = new e4(this, 1);

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final d f3333f0 = new d(this, 8);

    public static final boolean N0(MyApps myApps, int i) {
        ArrayList arrayList;
        p pVar = myApps.f3330c0;
        if (pVar == null || (arrayList = pVar.f4654d) == null || arrayList.isEmpty()) {
            return false;
        }
        p pVar2 = myApps.f3330c0;
        ArrayList arrayList2 = pVar2 != null ? pVar2.f4654d : null;
        arrayList2.getClass();
        if (arrayList2.size() <= i) {
            return false;
        }
        p pVar3 = myApps.f3330c0;
        ArrayList arrayList3 = pVar3 != null ? pVar3.f4654d : null;
        arrayList3.getClass();
        return arrayList3.get(i) instanceof e;
    }

    public static final boolean O0(MyApps myApps, int i) {
        ArrayList arrayList;
        p pVar = myApps.f3330c0;
        if (pVar == null || (arrayList = pVar.f4654d) == null || arrayList.isEmpty()) {
            return false;
        }
        p pVar2 = myApps.f3330c0;
        ArrayList arrayList2 = pVar2 != null ? pVar2.f4654d : null;
        arrayList2.getClass();
        if (arrayList2.size() <= i) {
            return false;
        }
        p pVar3 = myApps.f3330c0;
        ArrayList arrayList3 = pVar3 != null ? pVar3.f4654d : null;
        arrayList3.getClass();
        return arrayList3.get(i) instanceof v0;
    }

    @Override // c4.w4
    public final String F0() {
        return this.Z;
    }

    @Override // c4.w4
    public final void J0() {
        S0(false);
    }

    @Override // c4.w4
    public final void K0() {
        S0(false);
    }

    public final x P0() {
        return (x) this.a0.getValue();
    }

    public final int Q0(String str) {
        p pVar = this.f3330c0;
        ArrayList arrayList = pVar != null ? pVar.f4654d : null;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        p pVar2 = this.f3330c0;
        ArrayList arrayList2 = pVar2 != null ? pVar2.f4654d : null;
        arrayList2.getClass();
        int i = 0;
        for (Object obj : arrayList2) {
            int i6 = i + 1;
            if (((obj instanceof q2) && u.m0(((q2) obj).f11344b, str, true)) || (((obj instanceof e) && u.m0(((e) obj).f11123l, str, true)) || ((obj instanceof v0) && u.m0(((v0) obj).f4708a.f11123l, str, true)))) {
                return i;
            }
            i = i6;
        }
        return -1;
    }

    public final y4 R0() {
        return (y4) this.f3329b0.getValue();
    }

    public final void S0(boolean z9) {
        y4 y4VarR0 = R0();
        y4VarR0.getClass();
        a0 viewModelScope = ViewModelKt.getViewModelScope(y4VarR0);
        v7.e eVar = m0.f8288a;
        c0.s(viewModelScope, v7.d.f10884a, null, new l1(z9, y4VarR0, this, null, 1), 2);
    }

    @Override // c4.k0
    public final void Y(String str) {
        if (Q0(str) >= 0) {
            S0(false);
        }
    }

    @Override // c4.k0
    public final void Z(String str) {
        ArrayList arrayList;
        int iQ0 = Q0(str);
        if (iQ0 >= 0) {
            p pVar = this.f3330c0;
            if (pVar != null && (arrayList = pVar.f4654d) != null) {
                arrayList.remove(iQ0);
            }
            p pVar2 = this.f3330c0;
            if (pVar2 != null) {
                pVar2.notifyItemRemoved(iQ0);
            }
        }
    }

    @Override // c4.k0
    public final void a0(String str) {
        if (Q0(str) >= 0) {
            S0(false);
        }
    }

    @Override // c4.k0
    public final void b0(d0 d0Var) {
        d0Var.getClass();
        int iC = d0Var.c();
        String strB = d0Var.b();
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        v7.e eVar = m0.f8288a;
        c0.s(lifecycleScope, n.f10348a, null, new n4(iC, null, this, strB, null, 0), 2);
    }

    @Override // c4.k0
    public final void d0(u0 u0Var) {
        Bundle bundle;
        u0Var.getClass();
        int iC = u0Var.c();
        String strB = u0Var.b();
        if (u0Var instanceof p0) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelableArrayList("apps_parcelable", ((p0) u0Var).f11328a);
            bundle = bundle2;
        } else {
            bundle = null;
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        v7.e eVar = m0.f8288a;
        c0.s(lifecycleScope, n.f10348a, null, new n4(iC, bundle, this, strB, null, 0), 2);
    }

    @Override // c4.k0
    public final void e0(String str) {
        p pVar = this.f3330c0;
        if (pVar != null) {
            pVar.f4655e = -1;
        }
    }

    @Override // c4.k0
    public final void f0(String str, String str2) {
        p pVar = this.f3330c0;
        if (pVar != null) {
            pVar.f4655e = -1;
        }
        if (str2 == null || str2.length() == 0) {
            return;
        }
        String string = getString(2131952081, str2);
        string.getClass();
        A(string);
    }

    @Override // c4.k0
    public final void g0() {
        p pVar = this.f3330c0;
        if (pVar != null) {
            pVar.notifyDataSetChanged();
        }
    }

    @Override // c4.k0
    public final void h0(String str) {
        p pVar = this.f3330c0;
        if (pVar != null) {
            pVar.notifyDataSetChanged();
        }
    }

    @Override // c4.k0
    public final void n0() {
        p pVar = this.f3330c0;
        if (pVar != null) {
            pVar.f4655e = -1;
        }
    }

    @Override // c4.k0, g4.h, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        super.onCreate(bundle);
        RelativeLayout relativeLayout = P0().f10219a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        Drawable drawable = ContextCompat.getDrawable(this, 2131230922);
        if (drawable != null) {
            P0().f10225p.setNavigationIcon(drawable);
            P0().f10225p.setNavigationContentDescription(getString(2131951735));
        }
        P0().f10225p.setNavigationOnClickListener(new c4(this, 0));
        P0().f10225p.inflateMenu(2131689478);
        P0().f10227r.setTypeface(c.f4882w);
        P0().f10226q.setTypeface(c.f4883x);
        try {
            sharedPreferences2 = getSharedPreferences("SettingsPreferences", 0);
        } catch (Exception unused) {
        }
        boolean z9 = sharedPreferences2.contains("show_system_apps") ? sharedPreferences2.getBoolean("show_system_apps", false) : false;
        P0().f10225p.getMenu().findItem(2131361894).setChecked(z9);
        try {
            sharedPreferences = getSharedPreferences("SettingsPreferences", 0);
        } catch (Exception unused2) {
        }
        boolean z10 = sharedPreferences.contains("show_system_services") ? sharedPreferences.getBoolean("show_system_services", false) : false;
        P0().f10225p.getMenu().findItem(2131361895).setChecked(z10);
        w4.C0(P0().f10225p, z9);
        P0().f10225p.setOverflowIcon(ContextCompat.getDrawable(this, 2131231365));
        P0().f10225p.setOnMenuItemClickListener(new a(this, 3));
        ((TextView) P0().f10220b.f1062l).setTypeface(c.f4883x);
        ((TextView) P0().f10220b.f1063m).setTypeface(c.f4882w);
        ((TextView) P0().f10220b.f1063m).setText(getString(2131952437));
        HashMap map = new HashMap();
        map.put(0, getString(2131952437));
        int i = 1;
        map.put(1, getString(2131952436));
        map.put(2, getString(2131952439));
        ((LinearLayout) P0().f10220b.f1061b).setOnClickListener(new c.e(9, this, map));
        int dimension = (int) getResources().getDimension(2131166251);
        P0().f10223n.addItemDecoration(new f(dimension, dimension));
        P0().f10223n.setLayoutManager(new LinearLayoutManager(this, 1, false));
        P0().f10223n.setItemAnimator(new DefaultItemAnimator());
        hideKeyboardOnScroll(P0().f10222m);
        SimpleItemAnimator simpleItemAnimator = (SimpleItemAnimator) P0().f10223n.getItemAnimator();
        simpleItemAnimator.getClass();
        simpleItemAnimator.setSupportsChangeAnimations(false);
        P0().f10224o.setOnQueryTextListener(new f4(this));
        EditText editText = (EditText) P0().f10224o.findViewById(R.id.search_src_text);
        editText.setTypeface(c.f4883x);
        editText.setTextColor(ContextCompat.getColor(this, 2131100787));
        editText.setHintTextColor(ContextCompat.getColor(this, 2131099760));
        P0().f10224o.setOnClickListener(new c4(this, i));
        P0().f10221l.setOnClickListener(new c4.e(10));
        c0.s(LifecycleOwnerKt.getLifecycleScope(this), null, null, new i4(this, null), 3);
        c0.s(LifecycleOwnerKt.getLifecycleScope(this), null, null, new h4(this, null, i), 3);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (i != 82) {
            return super.onKeyDown(i, keyEvent);
        }
        P0().f10225p.showOverflowMenu();
        return true;
    }

    @Override // c4.k0, g4.s0, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        S0(true);
        Object systemService = getSystemService("notification");
        systemService.getClass();
        ((NotificationManager) systemService).cancel(258);
    }

    @Override // c4.k0
    public final void p0(File file) {
        p pVar = this.f3330c0;
        if (pVar != null) {
            pVar.f4655e = -1;
        }
        if (pVar != null) {
            pVar.a(this, file);
        }
    }

    @Override // c4.k0
    public final void q0(File file) {
        file.getClass();
        p pVar = this.f3330c0;
        if (pVar != null) {
            pVar.a(this, file);
        }
    }

    @Override // c4.k0
    public final void r0(File file) {
        e eVar;
        String str;
        p pVar = this.f3330c0;
        if (pVar != null) {
            j5.g gVarL = j5.g.D.l(this);
            gVarL.b();
            Iterator it = pVar.f4654d.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int i6 = i + 1;
                Object next = it.next();
                if ((next instanceof e) && (str = (eVar = (e) next).f11123l) != null && str.length() != 0) {
                    String str2 = eVar.f11123l;
                    str2.getClass();
                    q2 q2VarY = gVarL.Y(str2);
                    r rVarA = q2VarY != null ? q2VarY.a(this) : null;
                    if (rVarA != null && rVarA.F.size() == 1 && u.m0(((j0) rVarA.F.get(0)).f11240q, file.getAbsolutePath(), true)) {
                        pVar.f4655e = i;
                        break;
                    }
                }
                i = i6;
            }
            gVarL.c();
            int i10 = pVar.f4655e;
            if (i10 >= 0) {
                pVar.notifyItemChanged(i10);
            }
        }
    }
}
