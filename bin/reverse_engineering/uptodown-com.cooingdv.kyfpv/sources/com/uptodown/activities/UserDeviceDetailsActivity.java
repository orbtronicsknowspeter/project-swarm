package com.uptodown.activities;

import android.app.AlertDialog;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBindings;
import b5.l;
import c4.b;
import c4.dc;
import c4.gc;
import c4.hc;
import c4.ic;
import c4.k0;
import c4.nc;
import c4.w6;
import com.uptodown.R;
import com.uptodown.activities.UserDeviceDetailsActivity;
import e4.c1;
import f0.i;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.y;
import l5.f;
import o7.a0;
import o7.c0;
import o7.m0;
import p6.m;
import r7.o0;
import t4.d1;
import t6.c;
import t7.n;
import v7.d;
import v7.e;
import x4.z2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class UserDeviceDetailsActivity extends k0 {
    public static final /* synthetic */ int T = 0;
    public c1 Q;
    public final m O = new m(new w6(this, 11));
    public final ViewModelLazy P = new ViewModelLazy(y.a(nc.class), new ic(this, 0), new hc(this), new ic(this, 1));
    public final i R = new i(this, 16);
    public final b S = new b(this, 6);

    @Override // c4.k0, g4.h, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        RelativeLayout relativeLayout = y0().f9703a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        getOnBackPressedDispatcher().addCallback(this.S);
        final int i = 1;
        final int i6 = 0;
        int i10 = 2;
        c cVar = null;
        if (getIntent() != null && (extras = getIntent().getExtras()) != null && extras.containsKey("user_device")) {
            o0 o0Var = z0().f1919a;
            Parcelable parcelable = Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras.getParcelable("user_device", z2.class) : extras.getParcelable("user_device");
            parcelable.getClass();
            o0Var.getClass();
            o0Var.g(null, parcelable);
            final z2 z2Var = (z2) z0().f1919a.getValue();
            Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
            if (drawable != null) {
                y0().f9713t.setNavigationIcon(drawable);
                y0().f9713t.setNavigationContentDescription(getString(R.string.back));
            }
            y0().f9713t.setNavigationOnClickListener(new dc(this, i6));
            y0().G.setTypeface(f4.c.f4883w);
            y0().f9713t.setNavigationOnClickListener(new dc(this, i));
            y0().f9716x.setTypeface(f4.c.f4883w);
            y0().C.setTypeface(f4.c.f4884x);
            y0().D.setTypeface(f4.c.f4884x);
            y0().f9714u.setTypeface(f4.c.f4884x);
            y0().v.setTypeface(f4.c.f4884x);
            y0().A.setTypeface(f4.c.f4884x);
            y0().B.setTypeface(f4.c.f4884x);
            y0().f9717y.setTypeface(f4.c.f4884x);
            y0().f9718z.setTypeface(f4.c.f4884x);
            y0().F.setTypeface(f4.c.f4884x);
            y0().E.setTypeface(f4.c.f4883w);
            y0().f9715w.setTypeface(f4.c.f4883w);
            y0().f9709p.setTypeface(f4.c.f4884x);
            y0().f9710q.setTypeface(f4.c.f4884x);
            y0().E.setOnClickListener(new View.OnClickListener(this) { // from class: c4.ec

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ UserDeviceDetailsActivity f1571b;

                {
                    this.f1571b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i11 = i6;
                    x4.z2 z2Var2 = z2Var;
                    UserDeviceDetailsActivity userDeviceDetailsActivity = this.f1571b;
                    switch (i11) {
                        case 0:
                            int i12 = UserDeviceDetailsActivity.T;
                            String string = userDeviceDetailsActivity.getString(R.string.unlink_device_confirmation);
                            string.getClass();
                            userDeviceDetailsActivity.H(string, new androidx.work.impl.utils.c(7, userDeviceDetailsActivity, z2Var2));
                            break;
                        default:
                            int i13 = UserDeviceDetailsActivity.T;
                            if (!userDeviceDetailsActivity.isFinishing()) {
                                AlertDialog alertDialog = userDeviceDetailsActivity.F;
                                if (alertDialog != null) {
                                    alertDialog.dismiss();
                                }
                                AlertDialog.Builder builder = new AlertDialog.Builder(userDeviceDetailsActivity);
                                View viewInflate = userDeviceDetailsActivity.getLayoutInflater().inflate(R.layout.dialog_rename, (ViewGroup) null, false);
                                int i14 = R.id.et_dialog_rename;
                                EditText editText = (EditText) ViewBindings.findChildViewById(viewInflate, R.id.et_dialog_rename);
                                if (editText != null) {
                                    i14 = R.id.tv_cancel;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_cancel);
                                    if (textView != null) {
                                        i14 = R.id.tv_ok;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_ok);
                                        if (textView2 != null) {
                                            i14 = R.id.tv_title_dialog_rename;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_title_dialog_rename);
                                            if (textView3 != null) {
                                                LinearLayout linearLayout = (LinearLayout) viewInflate;
                                                m8.q qVar = new m8.q(linearLayout, editText, textView, textView2, textView3);
                                                textView3.setTypeface(f4.c.f4883w);
                                                textView2.setTypeface(f4.c.f4883w);
                                                textView2.setOnClickListener(new t(userDeviceDetailsActivity, z2Var2, qVar, 8));
                                                textView.setTypeface(f4.c.f4883w);
                                                textView.setOnClickListener(new dc(userDeviceDetailsActivity, 3));
                                                builder.setView(linearLayout);
                                                userDeviceDetailsActivity.F = builder.create();
                                                if (!userDeviceDetailsActivity.isFinishing() && userDeviceDetailsActivity.F != null) {
                                                    userDeviceDetailsActivity.u0();
                                                    editText.postDelayed(new androidx.work.impl.c(z2Var2, qVar, userDeviceDetailsActivity, 2), 100L);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                                com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i14)));
                            }
                            break;
                    }
                }
            });
            y0().f9704b.setOnClickListener(new View.OnClickListener(this) { // from class: c4.ec

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ UserDeviceDetailsActivity f1571b;

                {
                    this.f1571b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i11 = i;
                    x4.z2 z2Var2 = z2Var;
                    UserDeviceDetailsActivity userDeviceDetailsActivity = this.f1571b;
                    switch (i11) {
                        case 0:
                            int i12 = UserDeviceDetailsActivity.T;
                            String string = userDeviceDetailsActivity.getString(R.string.unlink_device_confirmation);
                            string.getClass();
                            userDeviceDetailsActivity.H(string, new androidx.work.impl.utils.c(7, userDeviceDetailsActivity, z2Var2));
                            break;
                        default:
                            int i13 = UserDeviceDetailsActivity.T;
                            if (!userDeviceDetailsActivity.isFinishing()) {
                                AlertDialog alertDialog = userDeviceDetailsActivity.F;
                                if (alertDialog != null) {
                                    alertDialog.dismiss();
                                }
                                AlertDialog.Builder builder = new AlertDialog.Builder(userDeviceDetailsActivity);
                                View viewInflate = userDeviceDetailsActivity.getLayoutInflater().inflate(R.layout.dialog_rename, (ViewGroup) null, false);
                                int i14 = R.id.et_dialog_rename;
                                EditText editText = (EditText) ViewBindings.findChildViewById(viewInflate, R.id.et_dialog_rename);
                                if (editText != null) {
                                    i14 = R.id.tv_cancel;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_cancel);
                                    if (textView != null) {
                                        i14 = R.id.tv_ok;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_ok);
                                        if (textView2 != null) {
                                            i14 = R.id.tv_title_dialog_rename;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_title_dialog_rename);
                                            if (textView3 != null) {
                                                LinearLayout linearLayout = (LinearLayout) viewInflate;
                                                m8.q qVar = new m8.q(linearLayout, editText, textView, textView2, textView3);
                                                textView3.setTypeface(f4.c.f4883w);
                                                textView2.setTypeface(f4.c.f4883w);
                                                textView2.setOnClickListener(new t(userDeviceDetailsActivity, z2Var2, qVar, 8));
                                                textView.setTypeface(f4.c.f4883w);
                                                textView.setOnClickListener(new dc(userDeviceDetailsActivity, 3));
                                                builder.setView(linearLayout);
                                                userDeviceDetailsActivity.F = builder.create();
                                                if (!userDeviceDetailsActivity.isFinishing() && userDeviceDetailsActivity.F != null) {
                                                    userDeviceDetailsActivity.u0();
                                                    editText.postDelayed(new androidx.work.impl.c(z2Var2, qVar, userDeviceDetailsActivity, 2), 100L);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                                com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i14)));
                            }
                            break;
                    }
                }
            });
            y0().f9705l.setOnClickListener(new dc(this, i10));
            y0().f9716x.setText(z2Var.f11484l);
            y0().D.setText(z2Var.f11488p);
            y0().v.setText(z2Var.f11485m);
            y0().B.setText(z2Var.f11486n);
            TextView textView = y0().f9718z;
            long j = z2Var.f11489q;
            textView.setText(j <= 0 ? null : new SimpleDateFormat("dd MMM yyyy HH:mm", Locale.getDefault()).format(new Date(j)));
            y0().f9712s.setLayoutManager(new LinearLayoutManager(this, 1, false));
            y0().f9712s.setItemAnimator(new DefaultItemAnimator());
            int dimension = (int) getResources().getDimension(R.dimen.margin_m);
            y0().f9712s.addItemDecoration(new f(dimension, dimension));
            nc ncVarZ0 = z0();
            ncVarZ0.getClass();
            a0 viewModelScope = ViewModelKt.getViewModelScope(ncVarZ0);
            e eVar = m0.f8289a;
            c0.s(viewModelScope, d.f10885a, null, new l(this, z2Var, ncVarZ0, cVar, 13), 2);
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        p7.c cVar2 = n.f10349a;
        c0.s(lifecycleScope, cVar2, null, new gc(this, cVar, i6), 2);
        c0.s(LifecycleOwnerKt.getLifecycleScope(this), cVar2, null, new gc(this, cVar, i), 2);
        c0.s(LifecycleOwnerKt.getLifecycleScope(this), cVar2, null, new gc(this, cVar, i10), 2);
    }

    public final d1 y0() {
        return (d1) this.O.getValue();
    }

    public final nc z0() {
        return (nc) this.P.getValue();
    }
}
