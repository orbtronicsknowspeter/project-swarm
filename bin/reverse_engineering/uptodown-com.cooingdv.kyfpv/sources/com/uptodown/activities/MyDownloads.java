package com.uptodown.activities;

import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.inputmethod.a;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.LinearLayoutManager;
import b.s;
import c4.d0;
import c4.g5;
import c4.h5;
import c4.i5;
import c4.j5;
import c4.k0;
import c4.k5;
import c4.m5;
import c4.o5;
import c4.z4;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.MyDownloads;
import e4.b;
import f0.i;
import g4.v;
import j5.g;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import l5.f;
import l7.u;
import o7.a0;
import o7.c0;
import o7.m0;
import p6.m;
import t6.c;
import t7.n;
import v7.d;
import v7.e;
import x4.r;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class MyDownloads extends k0 {
    public static final /* synthetic */ int V = 0;
    public b Q;
    public boolean S;
    public final m O = new m(new z4(this, 0));
    public final ViewModelLazy P = new ViewModelLazy(y.a(o5.class), new k5(this, 0), new j5(this), new k5(this, 1));
    public m5 R = m5.f1864b;
    public final c4.b T = new c4.b(this, 4);
    public final i U = new i(this, 8);

    public final t4.y A0() {
        return (t4.y) this.O.getValue();
    }

    public final o5 B0() {
        return (o5) this.P.getValue();
    }

    public final void C0(boolean z9) {
        o5 o5VarB0 = B0();
        m5 m5Var = this.R;
        o5VarB0.getClass();
        m5Var.getClass();
        a0 viewModelScope = ViewModelKt.getViewModelScope(o5VarB0);
        e eVar = m0.f8289a;
        c0.s(viewModelScope, d.f10885a, null, new d0(z9, o5VarB0, this, m5Var, null), 2);
    }

    public final void D0() {
        int i;
        b bVar = this.Q;
        if (bVar != null) {
            boolean[] zArr = bVar.f4488d;
            if (zArr != null) {
                i = 0;
                for (boolean z9 : zArr) {
                    if (z9) {
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            TextView textView = (TextView) A0().f10240l.f5276b;
            this.Q.getClass();
            textView.setEnabled(!r3.f4486b.isEmpty());
        } else {
            i = 0;
        }
        if (i > 0) {
            ((TextView) A0().f10240l.f5277l).setEnabled(true);
            ((TextView) A0().f10240l.f5277l).setBackground(ContextCompat.getDrawable(this, R.drawable.ripple_blue_primary_button));
        } else {
            ((TextView) A0().f10240l.f5277l).setEnabled(false);
            ((TextView) A0().f10240l.f5277l).setBackground(ContextCompat.getDrawable(this, R.drawable.ripple_light_grey));
        }
        ((TextView) A0().f10240l.f5278m).setText(getString(R.string.core_x_items_selected, String.valueOf(i)));
    }

    public final void E0() {
        ((RelativeLayout) A0().f10240l.f5279n).setVisibility(0);
        ((RelativeLayout) A0().f10240l.f5281p).setVisibility(0);
        ((LinearLayout) ((b5.m) A0().f10240l.f5280o).f1061b).setVisibility(4);
        D0();
    }

    public final void F0() {
        b bVar = this.Q;
        if (bVar != null) {
            bVar.c(false);
        }
        ((RelativeLayout) A0().f10240l.f5279n).setVisibility(0);
        ((LinearLayout) ((b5.m) A0().f10240l.f5280o).f1061b).setVisibility(0);
        ((RelativeLayout) A0().f10240l.f5281p).setVisibility(4);
    }

    @Override // c4.k0
    public final void b0(x4.d0 d0Var) {
        d0Var.getClass();
        int iC = d0Var.c();
        r rVarA = d0Var.a();
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        e eVar = m0.f8289a;
        c0.s(lifecycleScope, n.f10349a, null, new b.n(this, iC, rVarA, (c) null), 2);
    }

    @Override // c4.k0
    public final void e0(String str) {
        b bVar;
        b bVar2 = this.Q;
        Integer numValueOf = bVar2 != null ? Integer.valueOf(bVar2.f4489e) : null;
        if (numValueOf != null && numValueOf.intValue() >= 0 && (bVar = this.Q) != null) {
            bVar.notifyItemChanged(numValueOf.intValue());
        }
        b bVar3 = this.Q;
        if (bVar3 != null) {
            bVar3.f4489e = -1;
        }
    }

    @Override // c4.k0
    public final void f0(String str, String str2) {
        b bVar;
        if (str == null || (bVar = this.Q) == null || bVar.f4486b.isEmpty()) {
            return;
        }
        b bVar2 = this.Q;
        bVar2.getClass();
        Iterator it = bVar2.f4486b.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            int i6 = i + 1;
            if (u.m0(((r) it.next()).f11356b, str, true)) {
                break;
            } else {
                i = i6;
            }
        }
        if (i >= 0) {
            b bVar3 = this.Q;
            bVar3.getClass();
            bVar3.notifyItemChanged(i);
            b bVar4 = this.Q;
            bVar4.getClass();
            String string = getString(R.string.install_compatibility_error, ((r) bVar4.f4486b.get(i)).f11367w);
            string.getClass();
            A(string);
        }
        b bVar5 = this.Q;
        bVar5.getClass();
        bVar5.f4489e = -1;
    }

    @Override // c4.k0
    public final void n0() {
        b bVar = this.Q;
        if (bVar != null) {
            bVar.f4489e = -1;
        }
    }

    @Override // c4.k0, g4.h, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        final int i = 1;
        c cVar = null;
        if (extras != null && extras.containsKey("remoteInstallPath")) {
            Bundle extras2 = getIntent().getExtras();
            String string = extras2 != null ? extras2.getString("remoteInstallPath") : null;
            string.getClass();
            File file = new File(string);
            if (file.exists()) {
                W(file, null);
            }
            Object systemService = getSystemService("notification");
            systemService.getClass();
            ((NotificationManager) systemService).cancel(8);
        }
        RelativeLayout relativeLayout = A0().f10238a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
        if (drawable != null) {
            A0().f10244p.setNavigationIcon(drawable);
            A0().f10244p.setNavigationContentDescription(getString(R.string.back));
        }
        ((TextView) findViewById(R.id.tv_toolbar_title_downloads)).setTypeface(f4.c.f4883w);
        final int i6 = 0;
        A0().f10244p.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: c4.e5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MyDownloads f1554b;

            {
                this.f1554b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = i6;
                MyDownloads myDownloads = this.f1554b;
                switch (i10) {
                    case 0:
                        int i11 = MyDownloads.V;
                        myDownloads.getOnBackPressedDispatcher().onBackPressed();
                        break;
                    case 1:
                        int i12 = MyDownloads.V;
                        myDownloads.A0().f10243o.setIconified(false);
                        break;
                    case 2:
                        int i13 = MyDownloads.V;
                        String string2 = myDownloads.getString(R.string.dialog_delete_all_download_msg);
                        string2.getClass();
                        myDownloads.H(String.format(string2, Arrays.copyOf(new Object[0], 0)), new z4(myDownloads, 4));
                        break;
                    default:
                        int i14 = MyDownloads.V;
                        String string3 = myDownloads.getString(R.string.dialog_delete_selected_download_msg);
                        string3.getClass();
                        myDownloads.H(String.format(string3, Arrays.copyOf(new Object[0], 0)), new z4(myDownloads, 1));
                        break;
                }
            }
        });
        A0().f10244p.inflateMenu(R.menu.toolbar_menu_my_downloads);
        A0().f10244p.setOnMenuItemClickListener(new a(this, 4));
        A0().f10243o.setOnQueryTextListener(new h5(this));
        A0().f10243o.setOnClickListener(new View.OnClickListener(this) { // from class: c4.e5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MyDownloads f1554b;

            {
                this.f1554b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = i;
                MyDownloads myDownloads = this.f1554b;
                switch (i10) {
                    case 0:
                        int i11 = MyDownloads.V;
                        myDownloads.getOnBackPressedDispatcher().onBackPressed();
                        break;
                    case 1:
                        int i12 = MyDownloads.V;
                        myDownloads.A0().f10243o.setIconified(false);
                        break;
                    case 2:
                        int i13 = MyDownloads.V;
                        String string2 = myDownloads.getString(R.string.dialog_delete_all_download_msg);
                        string2.getClass();
                        myDownloads.H(String.format(string2, Arrays.copyOf(new Object[0], 0)), new z4(myDownloads, 4));
                        break;
                    default:
                        int i14 = MyDownloads.V;
                        String string3 = myDownloads.getString(R.string.dialog_delete_selected_download_msg);
                        string3.getClass();
                        myDownloads.H(String.format(string3, Arrays.copyOf(new Object[0], 0)), new z4(myDownloads, 1));
                        break;
                }
            }
        });
        ((ImageView) A0().f10243o.findViewById(androidx.appcompat.R.id.search_close_btn)).setBackgroundResource(R.drawable.core_shape_transparent);
        EditText editText = (EditText) A0().f10243o.findViewById(androidx.appcompat.R.id.search_src_text);
        editText.setTypeface(f4.c.f4884x);
        editText.setTextColor(ContextCompat.getColor(this, R.color.text_primary));
        editText.setHintTextColor(ContextCompat.getColor(this, R.color.core_search_view_color));
        ((TextView) ((b5.m) A0().f10240l.f5280o).f1062l).setTypeface(f4.c.f4884x);
        ((TextView) ((b5.m) A0().f10240l.f5280o).f1063m).setTypeface(f4.c.f4883w);
        ((TextView) ((b5.m) A0().f10240l.f5280o).f1063m).setText(getString(R.string.order_by_date));
        HashMap map = new HashMap();
        map.put(0, getString(R.string.order_by_name));
        map.put(1, getString(R.string.order_by_date));
        final int i10 = 2;
        map.put(2, getString(R.string.order_by_size));
        ((LinearLayout) ((b5.m) A0().f10240l.f5280o).f1061b).setOnClickListener(new c.e(11, this, map));
        A0().f10242n.setLayoutManager(new LinearLayoutManager(this, 1, false));
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        A0().f10242n.addItemDecoration(new f(dimension, dimension));
        A0().f10242n.setItemAnimator(null);
        A0().f10242n.addOnItemTouchListener(new i5(this));
        A0().f10245q.setTypeface(f4.c.f4884x);
        v vVar = A0().f10240l;
        ((TextView) A0().f10240l.f5278m).setTypeface(f4.c.f4884x);
        ((TextView) A0().f10240l.f5276b).setTypeface(f4.c.f4883w);
        ((TextView) A0().f10240l.f5276b).setOnClickListener(new View.OnClickListener(this) { // from class: c4.e5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MyDownloads f1554b;

            {
                this.f1554b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i102 = i10;
                MyDownloads myDownloads = this.f1554b;
                switch (i102) {
                    case 0:
                        int i11 = MyDownloads.V;
                        myDownloads.getOnBackPressedDispatcher().onBackPressed();
                        break;
                    case 1:
                        int i12 = MyDownloads.V;
                        myDownloads.A0().f10243o.setIconified(false);
                        break;
                    case 2:
                        int i13 = MyDownloads.V;
                        String string2 = myDownloads.getString(R.string.dialog_delete_all_download_msg);
                        string2.getClass();
                        myDownloads.H(String.format(string2, Arrays.copyOf(new Object[0], 0)), new z4(myDownloads, 4));
                        break;
                    default:
                        int i14 = MyDownloads.V;
                        String string3 = myDownloads.getString(R.string.dialog_delete_selected_download_msg);
                        string3.getClass();
                        myDownloads.H(String.format(string3, Arrays.copyOf(new Object[0], 0)), new z4(myDownloads, 1));
                        break;
                }
            }
        });
        ((TextView) A0().f10240l.f5277l).setTypeface(f4.c.f4883w);
        final int i11 = 3;
        ((TextView) A0().f10240l.f5277l).setOnClickListener(new View.OnClickListener(this) { // from class: c4.e5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MyDownloads f1554b;

            {
                this.f1554b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i102 = i11;
                MyDownloads myDownloads = this.f1554b;
                switch (i102) {
                    case 0:
                        int i112 = MyDownloads.V;
                        myDownloads.getOnBackPressedDispatcher().onBackPressed();
                        break;
                    case 1:
                        int i12 = MyDownloads.V;
                        myDownloads.A0().f10243o.setIconified(false);
                        break;
                    case 2:
                        int i13 = MyDownloads.V;
                        String string2 = myDownloads.getString(R.string.dialog_delete_all_download_msg);
                        string2.getClass();
                        myDownloads.H(String.format(string2, Arrays.copyOf(new Object[0], 0)), new z4(myDownloads, 4));
                        break;
                    default:
                        int i14 = MyDownloads.V;
                        String string3 = myDownloads.getString(R.string.dialog_delete_selected_download_msg);
                        string3.getClass();
                        myDownloads.H(String.format(string3, Arrays.copyOf(new Object[0], 0)), new z4(myDownloads, 1));
                        break;
                }
            }
        });
        A0().f10239b.setOnClickListener(new c4.e(12));
        F0();
        hideKeyboardOnScroll(A0().f10241m);
        z();
        getOnBackPressedDispatcher().addCallback(this, this.T);
        c0.s(LifecycleOwnerKt.getLifecycleScope(this), n.f10349a, null, new s(this, cVar, 7), 2);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        try {
            g gVarL = g.D.l(this);
            gVarL.b();
            ContentValues contentValues = new ContentValues();
            contentValues.put("checked", (Integer) 1);
            SQLiteDatabase sQLiteDatabase = gVarL.f6674a;
            sQLiteDatabase.getClass();
            sQLiteDatabase.update("downloads", contentValues, null, null);
            gVarL.c();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        super.onPause();
    }

    @Override // c4.k0, g4.s0, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        Object systemService = getSystemService("notification");
        systemService.getClass();
        ((NotificationManager) systemService).cancel(258);
        C0(true);
    }

    @Override // c4.k0
    public final void p0(File file) {
        b bVar = this.Q;
        if (bVar != null) {
            bVar.f4489e = -1;
        }
        if (bVar != null) {
            bVar.a(file);
        }
    }

    @Override // c4.k0
    public final void q0(File file) {
        file.getClass();
        b bVar = this.Q;
        if (bVar != null) {
            bVar.a(file);
        }
    }

    @Override // c4.k0
    public final void r0(File file) {
        b bVar = this.Q;
        if (bVar != null) {
            Iterator it = bVar.f4486b.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int i6 = i + 1;
                if (l.a(((r) it.next()).f(), file)) {
                    bVar.f4489e = i;
                    break;
                }
                i = i6;
            }
            int i10 = bVar.f4489e;
            if (i10 >= 0) {
                bVar.notifyItemChanged(i10);
            }
        }
    }

    @Override // c4.k0
    public final void x0(x4.g gVar) {
        gVar.getClass();
        if (isFinishing() || !T()) {
            return;
        }
        Intent intent = new Intent(this, (Class<?>) AppDetailActivity.class);
        intent.putExtra("appInfo", gVar);
        float f = UptodownApp.I;
        startActivity(intent, b4.d.a(this));
    }

    public final void y0(boolean z9) {
        c0.s(LifecycleOwnerKt.getLifecycleScope(this), null, null, new g5(this, z9, null), 3);
    }

    public final void z0(int i) {
        b bVar = this.Q;
        if (bVar == null || bVar.f4486b.isEmpty()) {
            return;
        }
        b bVar2 = this.Q;
        bVar2.getClass();
        if (i < bVar2.f4486b.size()) {
            c0.s(LifecycleOwnerKt.getLifecycleScope(this), null, null, new c4.m(this, i, null), 3);
        }
    }

    @Override // c4.k0
    public final void g0() {
    }

    @Override // c4.k0
    public final void Y(String str) {
    }

    @Override // c4.k0
    public final void Z(String str) {
    }

    @Override // c4.k0
    public final void a0(String str) {
    }

    @Override // c4.k0
    public final void h0(String str) {
    }
}
