package com.uptodown.activities;

import a3.d;
import android.app.NotificationManager;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.SimpleItemAnimator;
import b5.l;
import c4.e1;
import c4.g1;
import c4.h1;
import c4.k0;
import c4.l1;
import c4.m1;
import com.google.android.gms.internal.measurement.i5;
import com.uptodown.R;
import e4.e;
import f4.c;
import h4.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.y;
import l5.f;
import l7.u;
import o7.a0;
import o7.c0;
import o7.m0;
import p6.m;
import p6.x;
import t7.n;
import v6.i;
import x4.g;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class FreeUpSpaceActivity extends k0 {
    public static final /* synthetic */ int T = 0;
    public e Q;
    public g R;
    public final m O = new m(new androidx.room.g(this, 15));
    public final ViewModelLazy P = new ViewModelLazy(y.a(m1.class), new h1(this, 0), new g1(this), new h1(this, 1));
    public final d S = new d(this, 6);

    public static final int y0(FreeUpSpaceActivity freeUpSpaceActivity, String str) {
        e eVar = freeUpSpaceActivity.Q;
        ArrayList arrayListA = eVar != null ? eVar.a() : null;
        if (arrayListA == null || arrayListA.isEmpty()) {
            return -1;
        }
        e eVar2 = freeUpSpaceActivity.Q;
        ArrayList arrayListA2 = eVar2 != null ? eVar2.a() : null;
        arrayListA2.getClass();
        Iterator it = arrayListA2.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i6 = i + 1;
            if (u.m0(((x4.e) it.next()).f11124l, str, true)) {
                return i;
            }
            i = i6;
        }
        return -1;
    }

    public final t4.m A0() {
        return (t4.m) this.O.getValue();
    }

    public final void B0() {
        long j;
        File externalFilesDir;
        String str;
        g gVar = this.R;
        if (gVar == null || (str = gVar.f11178p) == null) {
            j = 0;
        } else {
            try {
                str.getClass();
                j = Long.parseLong(str);
            } catch (Exception unused) {
                j = 0;
            }
        }
        a aVar = new a(this);
        if (aVar.d()) {
            File[] externalFilesDirs = getExternalFilesDirs(null);
            if (externalFilesDirs.length > 1) {
                externalFilesDir = externalFilesDirs[1];
            } else {
                File externalFilesDir2 = getExternalFilesDir(null);
                aVar.g();
                aVar.f();
                externalFilesDir = externalFilesDir2;
            }
        } else {
            externalFilesDir = getExternalFilesDir(null);
        }
        File file = new File(externalFilesDir, "Apps");
        if (!file.exists()) {
            file.mkdirs();
        }
        long jF = a.a.F(this, file);
        long totalSpace = file.getTotalSpace();
        long j6 = (long) (j * 2.25d);
        long j10 = totalSpace - jF;
        long j11 = (((long) 100) * j10) / totalSpace;
        long j12 = totalSpace - ((9 * totalSpace) / 10);
        if (j6 > jF) {
            String strH = i5.H(this, j6 - jF);
            ((ProgressBar) A0().f9995b.f5280o).setProgress((int) j11);
            ((ProgressBar) A0().f9995b.f5281p).setVisibility(8);
            ((ProgressBar) A0().f9995b.f5280o).setVisibility(0);
            ((TextView) A0().f9995b.f5277l).setText(getString(R.string.error_not_enough_space));
            ((TextView) A0().f9995b.f5278m).setText(getString(R.string.no_storage_text, strH));
            return;
        }
        if (jF < j12) {
            ((ProgressBar) A0().f9995b.f5280o).setProgress((int) j11);
            ((ProgressBar) A0().f9995b.f5281p).setVisibility(8);
            ((ProgressBar) A0().f9995b.f5280o).setVisibility(0);
            ((TextView) A0().f9995b.f5277l).setText(getString(R.string.error_not_enough_space));
            ((TextView) A0().f9995b.f5278m).setText(getString(R.string.enough_storage_text, i5.H(this, j10), i5.H(this, totalSpace)));
            return;
        }
        ((ProgressBar) A0().f9995b.f5281p).setProgress((int) j11);
        ((ProgressBar) A0().f9995b.f5280o).setVisibility(8);
        ((ProgressBar) A0().f9995b.f5281p).setVisibility(0);
        ((TextView) A0().f9995b.f5277l).setText(getString(R.string.enough_storage_title));
        ((TextView) A0().f9995b.f5278m).setText(getString(R.string.enough_storage_text, i5.H(this, j10), i5.H(this, totalSpace)));
    }

    @Override // c4.k0, g4.h, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        Intent intent = getIntent();
        int i = 1;
        if (intent != null && (extras = intent.getExtras()) != null && extras.containsKey("appInfo")) {
            Intent intent2 = getIntent();
            intent2.getClass();
            Bundle extras2 = intent2.getExtras();
            extras2.getClass();
            this.R = (g) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras2.getParcelable("appInfo", g.class) : extras2.getParcelable("appInfo"));
        }
        RelativeLayout relativeLayout = A0().f9994a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
        if (drawable != null) {
            A0().f9998n.setNavigationIcon(drawable);
            A0().f9998n.setNavigationContentDescription(getString(R.string.back));
        }
        A0().f9998n.setNavigationOnClickListener(new c4.d(this, 4));
        A0().f9999o.setTypeface(c.f4883w);
        ((TextView) A0().f9995b.f5277l).setTypeface(c.f4884x);
        ((TextView) A0().f9995b.f5278m).setTypeface(c.f4884x);
        ((TextView) A0().f9995b.f5276b).setTypeface(c.f4883w);
        ((TextView) A0().f9995b.f5276b).setVisibility(8);
        B0();
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        A0().f9997m.addItemDecoration(new f(dimension, dimension));
        A0().f9997m.setLayoutManager(new LinearLayoutManager(this, 1, false));
        A0().f9997m.setItemAnimator(new DefaultItemAnimator());
        SimpleItemAnimator simpleItemAnimator = (SimpleItemAnimator) A0().f9997m.getItemAnimator();
        simpleItemAnimator.getClass();
        simpleItemAnimator.setSupportsChangeAnimations(false);
        A0().f9996l.setOnClickListener(new c4.e(4));
        c0.s(LifecycleOwnerKt.getLifecycleScope(this), null, null, new e1(this, null, i), 3);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (i != 82) {
            return super.onKeyDown(i, keyEvent);
        }
        A0().f9998n.showOverflowMenu();
        return true;
    }

    @Override // c4.k0, g4.s0, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        m1 m1Var = (m1) this.P.getValue();
        m1Var.getClass();
        a0 viewModelScope = ViewModelKt.getViewModelScope(m1Var);
        v7.e eVar = m0.f8289a;
        c0.s(viewModelScope, v7.d.f10885a, null, new l1(true, m1Var, this, null, 0), 2);
        Object systemService = getSystemService("notification");
        systemService.getClass();
        ((NotificationManager) systemService).cancel(258);
    }

    public final Object z0(String str, String str2, i iVar) throws Throwable {
        v7.e eVar = m0.f8289a;
        Object objC = c0.C(new l(this, str2, str, (t6.c) null, 4), n.f10349a, iVar);
        return objC == u6.a.f10763a ? objC : x.f8464a;
    }
}
