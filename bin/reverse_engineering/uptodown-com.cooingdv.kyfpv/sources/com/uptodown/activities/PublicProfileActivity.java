package com.uptodown.activities;

import a4.g0;
import a4.l0;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.core.view.inputmethod.a;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import b4.d;
import c4.j7;
import c4.k0;
import c4.k7;
import c4.l7;
import c4.o7;
import c4.r7;
import c4.s7;
import c4.t7;
import c4.v7;
import c4.w6;
import c4.y7;
import com.google.android.gms.internal.measurement.i5;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.util.views.UsernameTextView;
import j5.c;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.x;
import kotlin.jvm.internal.y;
import o7.a0;
import o7.c0;
import o7.m0;
import p6.m;
import t7.n;
import v7.e;
import x4.u2;
import x4.w2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class PublicProfileActivity extends k0 {
    public static final /* synthetic */ int R = 0;
    public final m O = new m(new w6(this, 2));
    public final ViewModelLazy P = new ViewModelLazy(y.a(y7.class), new t7(this, 0), new s7(this), new t7(this, 1));
    public final ActivityResultLauncher Q;

    public PublicProfileActivity() {
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new a(this, 8));
        activityResultLauncherRegisterForActivityResult.getClass();
        this.Q = activityResultLauncherRegisterForActivityResult;
    }

    public final void A0(int i, String str, String str2) {
        if (T()) {
            Intent intent = new Intent(this, (Class<?>) FollowListActivity.class);
            intent.putExtra(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, i);
            intent.putExtra("username", str);
            intent.putExtra("userID", str2);
            float f = UptodownApp.I;
            startActivity(intent, d.a(this));
        }
    }

    public final void B0(w2 w2Var) {
        int i = UsernameTextView.f3453s;
        i5.g(y0().C, w2Var.d(), w2Var.f11437o);
        y0().C.setText(w2Var.f11435m);
        w2 w2VarH = u2.h(this);
        if (l.a(w2Var.f11432a, w2VarH != null ? w2VarH.f11432a : null)) {
            y0().G.setText(getString(R.string.my_profile));
        } else {
            y0().G.setText(w2Var.f11435m);
        }
        y0().D.setText(w2Var.f11443u);
        String str = w2Var.f11438p;
        if (str != null && str.length() != 0 && y0().f9963b.getDrawable() == null) {
            l0 l0VarE = g0.d().e(w2Var.f11438p);
            l0VarE.f136c = true;
            l0VarE.e(y0().f9963b, null);
        }
        String strA = w2Var.a();
        if (strA != null && strA.length() != 0) {
            l0 l0VarE2 = g0.d().e(u2.e(w2Var.f11434l));
            float f = UptodownApp.I;
            l0VarE2.h(d.y(this));
            l0VarE2.e(y0().f9964l, null);
            y0().f9964l.setBackground(ContextCompat.getDrawable(this, R.drawable.shadow_user_icon));
        }
        if (w2Var.d()) {
            ImageView imageView = y0().f9964l;
            int dimension = (int) imageView.getContext().getResources().getDimension(R.dimen.border_radius_xs);
            imageView.setForeground(ContextCompat.getDrawable(imageView.getContext(), R.drawable.shape_stroke_review_avatar_turbo));
            imageView.setPadding(dimension, dimension, dimension, dimension);
            y0().f9965m.setVisibility(0);
        }
        y0().B.setText(c.c(w2Var.f11442t));
        y0().F.setText(String.valueOf(w2Var.f11439q));
    }

    @Override // c4.k0, g4.h, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        x xVar = new x();
        if (getIntent() != null && (extras = getIntent().getExtras()) != null && extras.containsKey("user")) {
            xVar.f7025a = extras.getParcelable("user");
        }
        Object obj = xVar.f7025a;
        int i = 1;
        int i6 = 0;
        int i10 = 2;
        t6.c cVar = null;
        if (obj != null) {
            w2 w2Var = (w2) obj;
            RelativeLayout relativeLayout = y0().f9962a;
            relativeLayout.getClass();
            setContentView(relativeLayout);
            y0().f9973u.setNavigationIcon(ContextCompat.getDrawable(this, R.drawable.vector_arrow_left_white));
            y0().f9973u.setNavigationContentDescription(getString(R.string.back));
            y0().f9973u.setNavigationOnClickListener(new j7(this, i6));
            y0().f9972t.getViewTreeObserver().addOnScrollChangedListener(new k7(this, i6));
            y0().G.setTypeface(f4.c.f4883w);
            y0().C.setTypeface(f4.c.f4883w);
            y0().D.setTypeface(f4.c.f4884x);
            y0().v.setTypeface(f4.c.f4883w);
            y0().f9975x.setTypeface(f4.c.f4883w);
            y0().A.setTypeface(f4.c.f4884x);
            y0().B.setTypeface(f4.c.f4883w);
            y0().E.setTypeface(f4.c.f4884x);
            y0().F.setTypeface(f4.c.f4883w);
            y0().f9976y.setTypeface(f4.c.f4884x);
            y0().f9977z.setTypeface(f4.c.f4883w);
            ((TextView) y0().f9970r.f4473q).setTypeface(f4.c.f4883w);
            ((TextView) y0().f9970r.f4471o).setTypeface(f4.c.f4883w);
            ((TextView) y0().f9970r.f4472p).setTypeface(f4.c.f4884x);
            ((TextView) y0().H.f4473q).setTypeface(f4.c.f4883w);
            ((TextView) y0().H.f4471o).setTypeface(f4.c.f4883w);
            ((TextView) y0().H.f4472p).setTypeface(f4.c.f4884x);
            ((TextView) y0().f9971s.f4473q).setTypeface(f4.c.f4883w);
            ((TextView) y0().f9971s.f4471o).setTypeface(f4.c.f4883w);
            ((TextView) y0().f9971s.f4472p).setTypeface(f4.c.f4884x);
            B0(w2Var);
            ((RecyclerView) y0().f9970r.f4470n).setLayoutManager(new LinearLayoutManager(this, 0, false));
            ((RecyclerView) y0().f9970r.f4470n).setItemAnimator(null);
            ((RecyclerView) y0().f9971s.f4470n).setLayoutManager(new LinearLayoutManager(this, 0, false));
            y0().f9966n.setOnClickListener(new l7(this, w2Var, i6));
            y0().f9967o.setOnClickListener(new l7(this, w2Var, i));
            y0().f9968p.setOnClickListener(new l7(this, w2Var, i10));
            w2 w2VarH = u2.h(this);
            if (l.a(w2Var.f11432a, w2VarH != null ? w2VarH.f11432a : null)) {
                ((RecyclerView) y0().H.f4470n).setLayoutManager(new LinearLayoutManager(this, 0, false));
                ((RecyclerView) y0().H.f4470n).setItemAnimator(null);
                ((TextView) y0().H.f4473q).setText(getString(R.string.my_wishlist));
                ((TextView) y0().H.f4473q).setText(getString(R.string.my_wishlist));
                ((TextView) y0().f9970r.f4473q).setText(getString(R.string.my_recommended_apps));
                ((TextView) y0().f9971s.f4472p).setText(getString(R.string.my_profile_no_review));
                ((TextView) y0().f9971s.f4473q).setText(getString(R.string.public_profile_my_reviews));
                y0().v.setVisibility(0);
                y0().v.setOnClickListener(new l7(w2VarH, this));
                y0().f9964l.setOnClickListener(new l7(this, w2Var, 4));
                y0().f9974w.setTypeface(f4.c.f4883w);
                y0().f9974w.setVisibility(0);
                y0().f9974w.setOnClickListener(new j7(this, i));
                y0().f9975x.setVisibility(8);
            } else {
                y0().v.setVisibility(8);
                y0().f9975x.setOnClickListener(new l7(this, w2Var, 5));
                ((TextView) y0().f9970r.f4473q).setText(getString(R.string.recommended_apps));
                ((TextView) y0().f9971s.f4473q).setText(getString(R.string.public_profile_activity_reviews_any_user_title));
            }
            y7 y7VarZ0 = z0();
            String strValueOf = String.valueOf(((w2) xVar.f7025a).f11432a);
            w2 w2Var2 = (w2) xVar.f7025a;
            int i11 = w2Var2.f11440r;
            int i12 = w2Var2.f11441s;
            y7VarZ0.getClass();
            a0 viewModelScope = ViewModelKt.getViewModelScope(y7VarZ0);
            e eVar = m0.f8289a;
            c0.s(viewModelScope, v7.d.f10885a, null, new v7(y7VarZ0, i12, this, strValueOf, i11, null), 2);
        }
        w2 w2VarH2 = u2.h(this);
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        p7.c cVar2 = n.f10349a;
        c0.s(lifecycleScope, cVar2, null, new o7(this, xVar, w2VarH2, cVar, 0), 2);
        c0.s(LifecycleOwnerKt.getLifecycleScope(this), cVar2, null, new o7(this, xVar, w2VarH2, cVar, 1), 2);
        c0.s(LifecycleOwnerKt.getLifecycleScope(this), cVar2, null, new r7(this, cVar, i6), 2);
        c0.s(LifecycleOwnerKt.getLifecycleScope(this), cVar2, null, new r7(this, cVar, i), 2);
    }

    public final t4.l0 y0() {
        return (t4.l0) this.O.getValue();
    }

    public final y7 z0() {
        return (y7) this.P.getValue();
    }
}
