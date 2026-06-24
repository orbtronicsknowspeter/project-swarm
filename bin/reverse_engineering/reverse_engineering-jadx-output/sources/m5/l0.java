package m5;

import android.animation.ValueAnimator;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import c4.c6;
import com.uptodown.UptodownApp;
import com.uptodown.activities.OldVersionsActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0.i f7454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f7455b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f7456l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f7457m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f7458n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImageView f7459o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ProgressBar f7460p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final RelativeLayout f7461q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f7462r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f7463s;

    public l0(View view, f0.i iVar) {
        super(view);
        this.f7454a = iVar;
        View viewFindViewById = view.findViewById(2131364574);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        this.f7455b = textView;
        View viewFindViewById2 = view.findViewById(2131363750);
        viewFindViewById2.getClass();
        TextView textView2 = (TextView) viewFindViewById2;
        this.f7456l = textView2;
        View viewFindViewById3 = view.findViewById(2131364485);
        viewFindViewById3.getClass();
        TextView textView3 = (TextView) viewFindViewById3;
        this.f7457m = textView3;
        View viewFindViewById4 = view.findViewById(2131363996);
        viewFindViewById4.getClass();
        TextView textView4 = (TextView) viewFindViewById4;
        this.f7458n = textView4;
        View viewFindViewById5 = view.findViewById(2131362345);
        viewFindViewById5.getClass();
        this.f7459o = (ImageView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(2131363017);
        viewFindViewById6.getClass();
        this.f7460p = (ProgressBar) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(2131363169);
        viewFindViewById7.getClass();
        RelativeLayout relativeLayout = (RelativeLayout) viewFindViewById7;
        this.f7461q = relativeLayout;
        View viewFindViewById8 = view.findViewById(2131362549);
        viewFindViewById8.getClass();
        this.f7462r = 1.0f;
        this.f7463s = 0.4f;
        final int i = 0;
        relativeLayout.setOnClickListener(new View.OnClickListener(this) { // from class: m5.i0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l0 f7432b;

            {
                this.f7432b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int bindingAdapterPosition;
                int bindingAdapterPosition2;
                int i6 = i;
                l0 l0Var = this.f7432b;
                switch (i6) {
                    case 0:
                        f0.i iVar2 = l0Var.f7454a;
                        if (iVar2 != null && (bindingAdapterPosition = l0Var.getBindingAdapterPosition()) != -1) {
                            OldVersionsActivity oldVersionsActivity = (OldVersionsActivity) iVar2.f4811b;
                            Object value = oldVersionsActivity.A0().f1681d.getValue();
                            value.getClass();
                            if (((x4.g) value).E0 != null) {
                                Object value2 = oldVersionsActivity.A0().f1681d.getValue();
                                value2.getClass();
                                ArrayList arrayList = ((x4.g) value2).E0;
                                arrayList.getClass();
                                if (bindingAdapterPosition < arrayList.size()) {
                                    Object value3 = oldVersionsActivity.A0().f1681d.getValue();
                                    value3.getClass();
                                    ArrayList arrayList2 = ((x4.g) value3).E0;
                                    arrayList2.getClass();
                                    long j = ((x4.t1) arrayList2.get(bindingAdapterPosition)).f11399m;
                                    boolean z9 = true;
                                    if (oldVersionsActivity.A0().f1680c.getValue() != null) {
                                        Object value4 = oldVersionsActivity.A0().f1680c.getValue();
                                        value4.getClass();
                                        if (j == ((x4.e) value4).f11124m) {
                                            String string = oldVersionsActivity.getString(2131951727);
                                            string.getClass();
                                            Object value5 = oldVersionsActivity.A0().f1681d.getValue();
                                            value5.getClass();
                                            ArrayList arrayList3 = ((x4.g) value5).E0;
                                            arrayList3.getClass();
                                            oldVersionsActivity.A(String.format(string, Arrays.copyOf(new Object[]{((x4.t1) arrayList3.get(bindingAdapterPosition)).f11396a}, 1)));
                                        }
                                    }
                                    e1.c0 c0Var = j5.g.D;
                                    Context applicationContext = oldVersionsActivity.getApplicationContext();
                                    applicationContext.getClass();
                                    j5.g gVarL = c0Var.l(applicationContext);
                                    gVarL.b();
                                    Object value6 = oldVersionsActivity.A0().f1681d.getValue();
                                    value6.getClass();
                                    String str = ((x4.g) value6).F;
                                    str.getClass();
                                    x4.r rVarL = gVarL.L(j, str);
                                    if (rVarL != null) {
                                        long j6 = rVarL.f11361q;
                                        if (a5.b.c(j6) || a5.c.b(j6)) {
                                            long j10 = rVarL.f11361q;
                                            if (a5.b.c(j10) || a5.c.b(j10)) {
                                                a5.b.f();
                                                Object systemService = oldVersionsActivity.getSystemService("notification");
                                                systemService.getClass();
                                                ((NotificationManager) systemService).cancel(261);
                                            } else {
                                                j5.g gVarL2 = c0Var.l(oldVersionsActivity);
                                                gVarL2.b();
                                                if (rVarL.p()) {
                                                    gVarL2.j(rVarL);
                                                } else {
                                                    Iterator it = rVarL.F.iterator();
                                                    it.getClass();
                                                    while (it.hasNext()) {
                                                        Object next = it.next();
                                                        next.getClass();
                                                        x4.j0 j0Var = (x4.j0) next;
                                                        j0Var.f11238o = 0L;
                                                        j0Var.f11241r = 0;
                                                        gVarL2.r0(j0Var);
                                                    }
                                                }
                                                gVarL2.c();
                                            }
                                        } else {
                                            File fileG = rVarL.g();
                                            if (!rVarL.c() || rVarL.F.isEmpty() || fileG == null || !fileG.exists()) {
                                                rVarL.s(oldVersionsActivity);
                                                e4.s sVar = oldVersionsActivity.Q;
                                                if (sVar != null) {
                                                    sVar.notifyItemChanged(bindingAdapterPosition);
                                                }
                                            } else {
                                                oldVersionsActivity.B0(rVarL);
                                            }
                                        }
                                    } else {
                                        x4.r rVar = new x4.r();
                                        Object value7 = oldVersionsActivity.A0().f1681d.getValue();
                                        value7.getClass();
                                        Object value8 = oldVersionsActivity.A0().f1681d.getValue();
                                        value8.getClass();
                                        ArrayList arrayList4 = ((x4.g) value8).E0;
                                        arrayList4.getClass();
                                        Object obj = arrayList4.get(bindingAdapterPosition);
                                        obj.getClass();
                                        rVar.b((x4.g) value7, (x4.t1) obj);
                                        Object value9 = oldVersionsActivity.A0().f1681d.getValue();
                                        value9.getClass();
                                        ArrayList arrayList5 = ((x4.g) value9).E0;
                                        arrayList5.getClass();
                                        Object obj2 = arrayList5.get(bindingAdapterPosition);
                                        obj2.getClass();
                                        x4.t1 t1Var = (x4.t1) obj2;
                                        if (t1Var.f11403q != null) {
                                            new x4.p().g(oldVersionsActivity);
                                            ArrayList arrayList6 = t1Var.f11403q;
                                            arrayList6.getClass();
                                            boolean zIsEmpty = x4.p.c(oldVersionsActivity, arrayList6).isEmpty();
                                            try {
                                                SharedPreferences sharedPreferences = oldVersionsActivity.getSharedPreferences("SettingsPreferences", 0);
                                                if (sharedPreferences.contains("show_warning_download_incompatible")) {
                                                    z9 = sharedPreferences.getBoolean("show_warning_download_incompatible", true);
                                                }
                                                break;
                                            } catch (Exception unused) {
                                            }
                                            if (!z9 || zIsEmpty) {
                                                oldVersionsActivity.C0(rVar);
                                            } else {
                                                Bundle bundleE = k0.k.e(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "required_feature");
                                                bundleE.putString("fileId", t1Var.f11402p);
                                                long j11 = rVar.f11361q;
                                                if (j11 >= 0) {
                                                    bundleE.putString("appId", String.valueOf(j11));
                                                }
                                                bundleE.putString("packagename", rVar.f11355b);
                                                android.support.v4.media.g gVar = oldVersionsActivity.E;
                                                if (gVar != null) {
                                                    gVar.E(bundleE, "warning");
                                                }
                                                String string2 = oldVersionsActivity.getString(2131952291);
                                                string2.getClass();
                                                if (!oldVersionsActivity.isFinishing()) {
                                                    a4.d0 d0VarK = a4.d0.k(oldVersionsActivity.getLayoutInflater());
                                                    TextView textView5 = (TextView) d0VarK.f83m;
                                                    TextView textView6 = (TextView) d0VarK.f85o;
                                                    TextView textView7 = (TextView) d0VarK.f84n;
                                                    CheckBox checkBox = (CheckBox) d0VarK.f82l;
                                                    textView7.setTypeface(f4.c.f4883x);
                                                    textView7.setText(string2);
                                                    checkBox.setVisibility(0);
                                                    checkBox.setTypeface(f4.c.f4883x);
                                                    checkBox.setOnCheckedChangeListener(new c6(oldVersionsActivity, 0));
                                                    textView6.setTypeface(f4.c.f4882w);
                                                    textView6.setOnClickListener(new c.e(12, oldVersionsActivity, rVar));
                                                    textView5.setTypeface(f4.c.f4882w);
                                                    textView5.setOnClickListener(new c.e(13, d0VarK, oldVersionsActivity));
                                                    AlertDialog.Builder builder = new AlertDialog.Builder(oldVersionsActivity);
                                                    builder.setView((LinearLayout) d0VarK.f81b);
                                                    builder.setCancelable(false);
                                                    AlertDialog alertDialog = oldVersionsActivity.F;
                                                    if (alertDialog == null || !alertDialog.isShowing()) {
                                                        oldVersionsActivity.F = builder.create();
                                                        if (!oldVersionsActivity.isFinishing()) {
                                                            AlertDialog alertDialog2 = oldVersionsActivity.F;
                                                            alertDialog2.getClass();
                                                            Window window = alertDialog2.getWindow();
                                                            if (window != null) {
                                                                a4.x.y(window, 0);
                                                            }
                                                            AlertDialog alertDialog3 = oldVersionsActivity.F;
                                                            alertDialog3.getClass();
                                                            alertDialog3.show();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        e4.s sVar2 = oldVersionsActivity.Q;
                                        if (sVar2 != null) {
                                            sVar2.notifyItemChanged(bindingAdapterPosition);
                                        }
                                    }
                                    gVarL.c();
                                }
                            }
                            break;
                        }
                        break;
                    default:
                        f0.i iVar3 = l0Var.f7454a;
                        if (iVar3 != null && (bindingAdapterPosition2 = l0Var.getBindingAdapterPosition()) != -1) {
                            iVar3.getClass();
                            float f = UptodownApp.I;
                            if (b4.d.t()) {
                                OldVersionsActivity oldVersionsActivity2 = (OldVersionsActivity) iVar3.f4811b;
                                Object value10 = oldVersionsActivity2.A0().f1681d.getValue();
                                value10.getClass();
                                if (((x4.g) value10).E0 != null) {
                                    Object value11 = oldVersionsActivity2.A0().f1681d.getValue();
                                    value11.getClass();
                                    ArrayList arrayList7 = ((x4.g) value11).E0;
                                    arrayList7.getClass();
                                    if (bindingAdapterPosition2 < arrayList7.size()) {
                                        Object value12 = oldVersionsActivity2.A0().f1681d.getValue();
                                        value12.getClass();
                                        ArrayList arrayList8 = ((x4.g) value12).E0;
                                        t6.c cVar = null;
                                        x4.t1 t1Var2 = arrayList8 != null ? (x4.t1) arrayList8.get(bindingAdapterPosition2) : null;
                                        t1Var2.getClass();
                                        if (!oldVersionsActivity2.isFinishing() && oldVersionsActivity2.A0().f1681d.getValue() != null) {
                                            Object value13 = oldVersionsActivity2.A0().f1681d.getValue();
                                            value13.getClass();
                                            String str2 = ((x4.g) value13).W;
                                            if (str2 != null && !str2.equals("PreRegister") && !str2.equals("Discontinued") && !str2.equals("ExternalDownload") && !str2.equals("ReadingMode") && !str2.equals("AppNotAvailableInThisCountry")) {
                                                o7.c0.s(LifecycleOwnerKt.getLifecycleScope(oldVersionsActivity2), null, null, new b.n(oldVersionsActivity2, t1Var2, cVar, 23), 3);
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        break;
                }
            }
        });
        final int i6 = 1;
        ((ImageView) viewFindViewById8).setOnClickListener(new View.OnClickListener(this) { // from class: m5.i0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l0 f7432b;

            {
                this.f7432b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int bindingAdapterPosition;
                int bindingAdapterPosition2;
                int i62 = i6;
                l0 l0Var = this.f7432b;
                switch (i62) {
                    case 0:
                        f0.i iVar2 = l0Var.f7454a;
                        if (iVar2 != null && (bindingAdapterPosition = l0Var.getBindingAdapterPosition()) != -1) {
                            OldVersionsActivity oldVersionsActivity = (OldVersionsActivity) iVar2.f4811b;
                            Object value = oldVersionsActivity.A0().f1681d.getValue();
                            value.getClass();
                            if (((x4.g) value).E0 != null) {
                                Object value2 = oldVersionsActivity.A0().f1681d.getValue();
                                value2.getClass();
                                ArrayList arrayList = ((x4.g) value2).E0;
                                arrayList.getClass();
                                if (bindingAdapterPosition < arrayList.size()) {
                                    Object value3 = oldVersionsActivity.A0().f1681d.getValue();
                                    value3.getClass();
                                    ArrayList arrayList2 = ((x4.g) value3).E0;
                                    arrayList2.getClass();
                                    long j = ((x4.t1) arrayList2.get(bindingAdapterPosition)).f11399m;
                                    boolean z9 = true;
                                    if (oldVersionsActivity.A0().f1680c.getValue() != null) {
                                        Object value4 = oldVersionsActivity.A0().f1680c.getValue();
                                        value4.getClass();
                                        if (j == ((x4.e) value4).f11124m) {
                                            String string = oldVersionsActivity.getString(2131951727);
                                            string.getClass();
                                            Object value5 = oldVersionsActivity.A0().f1681d.getValue();
                                            value5.getClass();
                                            ArrayList arrayList3 = ((x4.g) value5).E0;
                                            arrayList3.getClass();
                                            oldVersionsActivity.A(String.format(string, Arrays.copyOf(new Object[]{((x4.t1) arrayList3.get(bindingAdapterPosition)).f11396a}, 1)));
                                        }
                                    }
                                    e1.c0 c0Var = j5.g.D;
                                    Context applicationContext = oldVersionsActivity.getApplicationContext();
                                    applicationContext.getClass();
                                    j5.g gVarL = c0Var.l(applicationContext);
                                    gVarL.b();
                                    Object value6 = oldVersionsActivity.A0().f1681d.getValue();
                                    value6.getClass();
                                    String str = ((x4.g) value6).F;
                                    str.getClass();
                                    x4.r rVarL = gVarL.L(j, str);
                                    if (rVarL != null) {
                                        long j6 = rVarL.f11361q;
                                        if (a5.b.c(j6) || a5.c.b(j6)) {
                                            long j10 = rVarL.f11361q;
                                            if (a5.b.c(j10) || a5.c.b(j10)) {
                                                a5.b.f();
                                                Object systemService = oldVersionsActivity.getSystemService("notification");
                                                systemService.getClass();
                                                ((NotificationManager) systemService).cancel(261);
                                            } else {
                                                j5.g gVarL2 = c0Var.l(oldVersionsActivity);
                                                gVarL2.b();
                                                if (rVarL.p()) {
                                                    gVarL2.j(rVarL);
                                                } else {
                                                    Iterator it = rVarL.F.iterator();
                                                    it.getClass();
                                                    while (it.hasNext()) {
                                                        Object next = it.next();
                                                        next.getClass();
                                                        x4.j0 j0Var = (x4.j0) next;
                                                        j0Var.f11238o = 0L;
                                                        j0Var.f11241r = 0;
                                                        gVarL2.r0(j0Var);
                                                    }
                                                }
                                                gVarL2.c();
                                            }
                                        } else {
                                            File fileG = rVarL.g();
                                            if (!rVarL.c() || rVarL.F.isEmpty() || fileG == null || !fileG.exists()) {
                                                rVarL.s(oldVersionsActivity);
                                                e4.s sVar = oldVersionsActivity.Q;
                                                if (sVar != null) {
                                                    sVar.notifyItemChanged(bindingAdapterPosition);
                                                }
                                            } else {
                                                oldVersionsActivity.B0(rVarL);
                                            }
                                        }
                                    } else {
                                        x4.r rVar = new x4.r();
                                        Object value7 = oldVersionsActivity.A0().f1681d.getValue();
                                        value7.getClass();
                                        Object value8 = oldVersionsActivity.A0().f1681d.getValue();
                                        value8.getClass();
                                        ArrayList arrayList4 = ((x4.g) value8).E0;
                                        arrayList4.getClass();
                                        Object obj = arrayList4.get(bindingAdapterPosition);
                                        obj.getClass();
                                        rVar.b((x4.g) value7, (x4.t1) obj);
                                        Object value9 = oldVersionsActivity.A0().f1681d.getValue();
                                        value9.getClass();
                                        ArrayList arrayList5 = ((x4.g) value9).E0;
                                        arrayList5.getClass();
                                        Object obj2 = arrayList5.get(bindingAdapterPosition);
                                        obj2.getClass();
                                        x4.t1 t1Var = (x4.t1) obj2;
                                        if (t1Var.f11403q != null) {
                                            new x4.p().g(oldVersionsActivity);
                                            ArrayList arrayList6 = t1Var.f11403q;
                                            arrayList6.getClass();
                                            boolean zIsEmpty = x4.p.c(oldVersionsActivity, arrayList6).isEmpty();
                                            try {
                                                SharedPreferences sharedPreferences = oldVersionsActivity.getSharedPreferences("SettingsPreferences", 0);
                                                if (sharedPreferences.contains("show_warning_download_incompatible")) {
                                                    z9 = sharedPreferences.getBoolean("show_warning_download_incompatible", true);
                                                }
                                                break;
                                            } catch (Exception unused) {
                                            }
                                            if (!z9 || zIsEmpty) {
                                                oldVersionsActivity.C0(rVar);
                                            } else {
                                                Bundle bundleE = k0.k.e(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "required_feature");
                                                bundleE.putString("fileId", t1Var.f11402p);
                                                long j11 = rVar.f11361q;
                                                if (j11 >= 0) {
                                                    bundleE.putString("appId", String.valueOf(j11));
                                                }
                                                bundleE.putString("packagename", rVar.f11355b);
                                                android.support.v4.media.g gVar = oldVersionsActivity.E;
                                                if (gVar != null) {
                                                    gVar.E(bundleE, "warning");
                                                }
                                                String string2 = oldVersionsActivity.getString(2131952291);
                                                string2.getClass();
                                                if (!oldVersionsActivity.isFinishing()) {
                                                    a4.d0 d0VarK = a4.d0.k(oldVersionsActivity.getLayoutInflater());
                                                    TextView textView5 = (TextView) d0VarK.f83m;
                                                    TextView textView6 = (TextView) d0VarK.f85o;
                                                    TextView textView7 = (TextView) d0VarK.f84n;
                                                    CheckBox checkBox = (CheckBox) d0VarK.f82l;
                                                    textView7.setTypeface(f4.c.f4883x);
                                                    textView7.setText(string2);
                                                    checkBox.setVisibility(0);
                                                    checkBox.setTypeface(f4.c.f4883x);
                                                    checkBox.setOnCheckedChangeListener(new c6(oldVersionsActivity, 0));
                                                    textView6.setTypeface(f4.c.f4882w);
                                                    textView6.setOnClickListener(new c.e(12, oldVersionsActivity, rVar));
                                                    textView5.setTypeface(f4.c.f4882w);
                                                    textView5.setOnClickListener(new c.e(13, d0VarK, oldVersionsActivity));
                                                    AlertDialog.Builder builder = new AlertDialog.Builder(oldVersionsActivity);
                                                    builder.setView((LinearLayout) d0VarK.f81b);
                                                    builder.setCancelable(false);
                                                    AlertDialog alertDialog = oldVersionsActivity.F;
                                                    if (alertDialog == null || !alertDialog.isShowing()) {
                                                        oldVersionsActivity.F = builder.create();
                                                        if (!oldVersionsActivity.isFinishing()) {
                                                            AlertDialog alertDialog2 = oldVersionsActivity.F;
                                                            alertDialog2.getClass();
                                                            Window window = alertDialog2.getWindow();
                                                            if (window != null) {
                                                                a4.x.y(window, 0);
                                                            }
                                                            AlertDialog alertDialog3 = oldVersionsActivity.F;
                                                            alertDialog3.getClass();
                                                            alertDialog3.show();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        e4.s sVar2 = oldVersionsActivity.Q;
                                        if (sVar2 != null) {
                                            sVar2.notifyItemChanged(bindingAdapterPosition);
                                        }
                                    }
                                    gVarL.c();
                                }
                            }
                            break;
                        }
                        break;
                    default:
                        f0.i iVar3 = l0Var.f7454a;
                        if (iVar3 != null && (bindingAdapterPosition2 = l0Var.getBindingAdapterPosition()) != -1) {
                            iVar3.getClass();
                            float f = UptodownApp.I;
                            if (b4.d.t()) {
                                OldVersionsActivity oldVersionsActivity2 = (OldVersionsActivity) iVar3.f4811b;
                                Object value10 = oldVersionsActivity2.A0().f1681d.getValue();
                                value10.getClass();
                                if (((x4.g) value10).E0 != null) {
                                    Object value11 = oldVersionsActivity2.A0().f1681d.getValue();
                                    value11.getClass();
                                    ArrayList arrayList7 = ((x4.g) value11).E0;
                                    arrayList7.getClass();
                                    if (bindingAdapterPosition2 < arrayList7.size()) {
                                        Object value12 = oldVersionsActivity2.A0().f1681d.getValue();
                                        value12.getClass();
                                        ArrayList arrayList8 = ((x4.g) value12).E0;
                                        t6.c cVar = null;
                                        x4.t1 t1Var2 = arrayList8 != null ? (x4.t1) arrayList8.get(bindingAdapterPosition2) : null;
                                        t1Var2.getClass();
                                        if (!oldVersionsActivity2.isFinishing() && oldVersionsActivity2.A0().f1681d.getValue() != null) {
                                            Object value13 = oldVersionsActivity2.A0().f1681d.getValue();
                                            value13.getClass();
                                            String str2 = ((x4.g) value13).W;
                                            if (str2 != null && !str2.equals("PreRegister") && !str2.equals("Discontinued") && !str2.equals("ExternalDownload") && !str2.equals("ReadingMode") && !str2.equals("AppNotAvailableInThisCountry")) {
                                                o7.c0.s(LifecycleOwnerKt.getLifecycleScope(oldVersionsActivity2), null, null, new b.n(oldVersionsActivity2, t1Var2, cVar, 23), 3);
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        break;
                }
            }
        });
        textView.setTypeface(f4.c.f4882w);
        textView2.setTypeface(f4.c.f4883x);
        textView3.setTypeface(f4.c.f4882w);
        textView4.setTypeface(f4.c.f4883x);
    }

    public final void a() {
        View view = this.itemView;
        ImageView imageView = this.f7459o;
        androidx.lifecycle.l.A(view, 2131230928, imageView);
        this.f7461q.setBackground(ContextCompat.getDrawable(this.itemView.getContext(), 2131230898));
        imageView.setContentDescription(this.itemView.getContext().getString(2131952425));
    }

    public final void b() {
        if (this.f7460p.getVisibility() == 0) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f7463s, this.f7462r);
            valueAnimatorOfFloat.setStartDelay(200L);
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new j0(this, 1));
            valueAnimatorOfFloat.addListener(new k0(this, 0));
            valueAnimatorOfFloat.start();
        }
    }

    public final void c() {
        ProgressBar progressBar = this.f7460p;
        if (progressBar.getVisibility() == 8) {
            progressBar.setVisibility(0);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f7462r, this.f7463s);
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new j0(this, 0));
            valueAnimatorOfFloat.start();
        }
    }
}
