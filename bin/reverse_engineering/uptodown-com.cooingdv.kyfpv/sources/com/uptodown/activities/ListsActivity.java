package com.uptodown.activities;

import a4.g0;
import a4.l0;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.view.inputmethod.a;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.room.g;
import c4.a2;
import c4.b2;
import c4.c2;
import c4.f2;
import c4.g2;
import c4.h2;
import c4.k0;
import c4.y1;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import e2.d;
import j5.p;
import java.util.ArrayList;
import kotlin.jvm.internal.y;
import o7.a0;
import o7.c0;
import o7.m0;
import p6.m;
import r7.o0;
import t4.t;
import t6.c;
import t7.n;
import u4.z1;
import v7.e;
import x4.j;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class ListsActivity extends k0 {
    public static final /* synthetic */ int S = 0;
    public final m O = new m(new g(this, 20));
    public final ViewModelLazy P = new ViewModelLazy(y.a(h2.class), new c2(this, 0), new b2(this), new c2(this, 1));
    public boolean Q;
    public final ActivityResultLauncher R;

    public ListsActivity() {
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new a(this, 2));
        activityResultLauncherRegisterForActivityResult.getClass();
        this.R = activityResultLauncherRegisterForActivityResult;
    }

    public static final void y0(ListsActivity listsActivity, d dVar) {
        ((ImageView) dVar.f4468l).setImageResource(R.drawable.vector_uptodown_logo);
        LinearLayout linearLayout = (LinearLayout) dVar.f4469m;
        if (linearLayout.getChildCount() > 1) {
            linearLayout.removeViews(1, linearLayout.getChildCount() - 1);
        }
        ((RelativeLayout) dVar.f4471o).setVisibility(4);
        ((ProgressBar) dVar.f4470n).setVisibility(0);
    }

    public final t A0() {
        return (t) this.O.getValue();
    }

    public final h2 B0() {
        return (h2) this.P.getValue();
    }

    public final String C0(int i) {
        if (i == 1) {
            String string = getString(R.string.apps_count_1);
            string.getClass();
            return string;
        }
        String string2 = getString(R.string.apps_count, String.valueOf(i));
        string2.getClass();
        return string2;
    }

    public final void D0() {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2 = getSharedPreferences("SharedPreferencesUser", 0);
        try {
            sharedPreferences = getSharedPreferences("SettingsPreferences", 0);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        String string = sharedPreferences.contains("UTOKEN") ? sharedPreferences.getString("UTOKEN", null) : null;
        if (string == null && sharedPreferences2.getString("is_turbo", null) == null) {
            return;
        }
        h2 h2VarB0 = B0();
        h2VarB0.getClass();
        h2VarB0.f1664c = false;
        o0 o0Var = h2VarB0.f1662a;
        o0Var.getClass();
        p pVar = p.f6706a;
        o0Var.g(null, pVar);
        h2VarB0.f = false;
        o0 o0Var2 = h2VarB0.f1665d;
        o0Var2.getClass();
        o0Var2.g(null, pVar);
        h2VarB0.i = false;
        o0 o0Var3 = h2VarB0.g;
        o0Var3.getClass();
        o0Var3.g(null, pVar);
        h2VarB0.f1668l = false;
        o0 o0Var4 = h2VarB0.j;
        o0Var4.getClass();
        o0Var4.g(null, pVar);
        c0.s(ViewModelKt.getViewModelScope(h2VarB0), null, null, new f2(this, h2VarB0, null, 0), 3);
        c0.s(ViewModelKt.getViewModelScope(h2VarB0), null, null, new f2(this, h2VarB0, null, 1), 3);
        ArrayList arrayList = new ArrayList();
        a0 viewModelScope = ViewModelKt.getViewModelScope(h2VarB0);
        e eVar = m0.f8289a;
        v7.d dVar = v7.d.f10885a;
        c0.s(viewModelScope, dVar, null, new g2(this, h2VarB0, arrayList, (c) null), 2);
        c0.s(ViewModelKt.getViewModelScope(h2VarB0), dVar, null, new g2(this, new ArrayList(), h2VarB0, (c) null), 2);
    }

    public final void E0(j jVar) {
        jVar.getClass();
        if (T()) {
            z1 z1Var = new z1();
            z1Var.f10684m = jVar;
            FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
            float f = UptodownApp.I;
            fragmentTransactionBeginTransaction.getClass();
            b4.d.C(fragmentTransactionBeginTransaction, this);
            fragmentTransactionBeginTransaction.add(R.id.fl_lists, z1Var, (String) null).addToBackStack(String.valueOf(jVar.f11225a)).commit();
            getSupportFragmentManager().addOnBackStackChangedListener(new androidx.preference.a(this, 1));
        }
    }

    @Override // c4.k0, g4.h, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = A0().f10117a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
        t tVarA0 = A0();
        if (drawable != null) {
            tVarA0.f10123p.setNavigationIcon(drawable);
            tVarA0.f10123p.setNavigationContentDescription(getString(R.string.back));
        }
        Toolbar toolbar = tVarA0.f10123p;
        d dVar = tVarA0.f10119l;
        TextView textView = (TextView) dVar.f4473q;
        d dVar2 = tVarA0.f10120m;
        TextView textView2 = (TextView) dVar2.f4473q;
        d dVar3 = tVarA0.f10121n;
        TextView textView3 = (TextView) dVar3.f4473q;
        int i = 0;
        toolbar.setNavigationOnClickListener(new y1(this, i));
        tVarA0.f10124q.setTypeface(f4.c.f4883w);
        textView3.setTypeface(f4.c.f4883w);
        ((TextView) dVar3.f4472p).setTypeface(f4.c.f4884x);
        textView3.setText(getString(R.string.my_wishlist));
        textView2.setTypeface(f4.c.f4883w);
        ((TextView) dVar2.f4472p).setTypeface(f4.c.f4884x);
        textView2.setText(getString(R.string.my_recommended_apps));
        textView.setTypeface(f4.c.f4883w);
        ((TextView) dVar.f4472p).setTypeface(f4.c.f4884x);
        textView.setText(getString(R.string.my_preregistrations));
        tVarA0.f10122o.setOnClickListener(new c4.e(6));
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        p7.c cVar = n.f10349a;
        c cVar2 = null;
        c0.s(lifecycleScope, cVar, null, new a2(this, cVar2, i), 2);
        c0.s(LifecycleOwnerKt.getLifecycleScope(this), cVar, null, new a2(this, cVar2, 1), 2);
        c0.s(LifecycleOwnerKt.getLifecycleScope(this), cVar, null, new a2(this, cVar2, 2), 2);
        c0.s(LifecycleOwnerKt.getLifecycleScope(this), cVar, null, new a2(this, cVar2, 3), 2);
        D0();
    }

    public final void z0(String str, LinearLayout linearLayout, int i) {
        ImageView imageView = new ImageView(this);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.icon_size_l);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams.setMargins((int) getResources().getDimension(R.dimen.lists_items_iv_margin), 0, 0, 0);
        imageView.setLayoutParams(layoutParams);
        imageView.setContentDescription(null);
        imageView.setElevation(getResources().getDimension(R.dimen.button_elevation));
        imageView.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_logo_google));
        imageView.setElevation(-i);
        l0 l0VarE = g0.d().e(str);
        float f = UptodownApp.I;
        Context context = imageView.getContext();
        context.getClass();
        l0VarE.g(b4.d.f(context));
        l0VarE.h(b4.d.x(this));
        l0VarE.e(imageView, null);
        linearLayout.addView(imageView);
    }
}
