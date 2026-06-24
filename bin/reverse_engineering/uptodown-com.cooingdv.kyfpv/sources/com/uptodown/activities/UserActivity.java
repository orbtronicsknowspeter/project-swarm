package com.uptodown.activities;

import a4.g0;
import a4.l0;
import a4.x;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import b4.d;
import c4.fb;
import c4.gb;
import c4.k0;
import c4.lb;
import c4.mb;
import c4.nb;
import c4.w6;
import c4.xc;
import c4.yc;
import c4.zc;
import com.google.android.gms.internal.measurement.i5;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.util.views.UsernameTextView;
import f4.c;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import o7.a0;
import o7.c0;
import o7.m0;
import p6.m;
import t4.z0;
import t7.n;
import v7.e;
import x4.u2;
import x4.w2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class UserActivity extends k0 {
    public static final /* synthetic */ int W = 0;
    public final m O = new m(new w6(this, 8));
    public final ViewModelLazy P = new ViewModelLazy(y.a(zc.class), new nb(this, 0), new mb(this), new nb(this, 1));
    public String Q;
    public final ActivityResultLauncher R;
    public final ActivityResultLauncher S;
    public final ActivityResultLauncher T;
    public final ActivityResultLauncher U;
    public final ActivityResultLauncher V;

    public UserActivity() {
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new gb(this, 1));
        activityResultLauncherRegisterForActivityResult.getClass();
        this.R = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new gb(this, 2));
        activityResultLauncherRegisterForActivityResult2.getClass();
        this.S = activityResultLauncherRegisterForActivityResult2;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult3 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new gb(this, 3));
        activityResultLauncherRegisterForActivityResult3.getClass();
        this.T = activityResultLauncherRegisterForActivityResult3;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult4 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new gb(this, 4));
        activityResultLauncherRegisterForActivityResult4.getClass();
        this.U = activityResultLauncherRegisterForActivityResult4;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult5 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new gb(this, 5));
        activityResultLauncherRegisterForActivityResult5.getClass();
        this.V = activityResultLauncherRegisterForActivityResult5;
    }

    public final zc A0() {
        return (zc) this.P.getValue();
    }

    public final void B0() {
        if (T()) {
            Intent intent = new Intent(this, (Class<?>) LoginActivity.class);
            float f = UptodownApp.I;
            this.R.launch(intent, d.b(this));
        }
    }

    @Override // c4.k0, g4.h, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = z0().f10274a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
        if (drawable != null) {
            z0().A.setNavigationIcon(drawable);
            z0().A.setNavigationContentDescription(getString(R.string.back));
        }
        int i = 0;
        z0().A.setNavigationOnClickListener(new fb(this, i));
        z0().A.inflateMenu(R.menu.toolbar_menu_user);
        z0().A.setOverflowIcon(ContextCompat.getDrawable(this, R.drawable.vector_menu_dots_color_adaptable));
        z0().A.setOnMenuItemClickListener(new gb(this, i));
        z0().P.setTypeface(c.f4883w);
        z0().T.setTypeface(c.f4883w);
        z0().M.setTypeface(c.f4883w);
        z0().F.setTypeface(c.f4883w);
        z0().S.setTypeface(c.f4883w);
        z0().J.setTypeface(c.f4883w);
        z0().B.setTypeface(c.f4883w);
        z0().I.setTypeface(c.f4883w);
        z0().K.setTypeface(c.f4883w);
        z0().C.setTypeface(c.f4883w);
        z0().O.setTypeface(c.f4883w);
        z0().D.setTypeface(c.f4883w);
        z0().L.setTypeface(c.f4883w);
        z0().R.setTypeface(c.f4883w);
        z0().v.setVisibility(8);
        z0().Q.setTypeface(c.f4884x);
        z0().G.setTypeface(c.f4884x);
        z0().N.setTypeface(c.f4884x);
        z0().H.setTypeface(c.f4884x);
        z0().U.setTypeface(c.f4884x);
        z0().E.setTypeface(c.f4884x);
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        e eVar = m0.f8289a;
        p7.c cVar = n.f10349a;
        t6.c cVar2 = null;
        int i6 = 2;
        c0.s(lifecycleScope, cVar, null, new lb(this, cVar2, i), 2);
        int i10 = 1;
        c0.s(LifecycleOwnerKt.getLifecycleScope(this), cVar, null, new lb(this, cVar2, i10), 2);
        c0.s(LifecycleOwnerKt.getLifecycleScope(this), cVar, null, new lb(this, cVar2, i6), 2);
        zc zcVarA0 = A0();
        zcVarA0.getClass();
        c0.s(ViewModelKt.getViewModelScope(zcVarA0), v7.d.f10885a, null, new yc(this, zcVarA0, cVar2, i), 2);
        z0().f10276l.setOnClickListener(new fb(this, i10));
        z0().f10289z.setOnClickListener(new fb(this, i6));
        z0().M.setOnClickListener(new fb(this, 3));
        z0().f10288y.setOnClickListener(new fb(this, 4));
        z0().f10279o.setOnClickListener(new fb(this, 5));
        z0().f10287x.setOnClickListener(new fb(this, 6));
        z0().f10283s.setOnClickListener(new fb(this, 7));
        z0().f10282r.setOnClickListener(new fb(this, 8));
        z0().f10277m.setOnClickListener(new fb(this, 9));
        z0().f10278n.setOnClickListener(new fb(this, 10));
        z0().f10285u.setOnClickListener(new fb(this, 11));
        z0().f10286w.setOnClickListener(new fb(this, 12));
        z0().f10280p.setOnClickListener(new fb(this, 13));
        z0().f10281q.setOnClickListener(new fb(this, 14));
        z0().f10284t.setOnClickListener(new fb(this, 15));
        z0().U.setOnClickListener(new fb(this, 16));
        z0().E.setOnClickListener(new fb(this, 17));
    }

    @Override // c4.k0, g4.s0, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        zc zcVarA0 = A0();
        zcVarA0.getClass();
        a0 viewModelScope = ViewModelKt.getViewModelScope(zcVarA0);
        e eVar = m0.f8289a;
        v7.d dVar = v7.d.f10885a;
        t6.c cVar = null;
        c0.s(viewModelScope, dVar, null, new yc(this, zcVarA0, cVar, 0), 2);
        Menu menu = z0().A.getMenu();
        MenuItem menuItemFindItem = menu != null ? menu.findItem(R.id.action_dark_mode) : null;
        if ((getResources().getConfiguration().uiMode & 48) == 16) {
            if (menuItemFindItem != null) {
                menuItemFindItem.setIcon(ContextCompat.getDrawable(this, R.drawable.vector_moon));
            }
        } else if (menuItemFindItem != null) {
            menuItemFindItem.setIcon(ContextCompat.getDrawable(this, R.drawable.vector_sun));
        }
        w2 w2VarH = u2.h(this);
        if ((w2VarH != null ? w2VarH.f11432a : null) == null || !u2.g(this)) {
            y0(this);
            return;
        }
        if (w2VarH.a() != null) {
            g0 g0VarD = g0.d();
            String str = w2VarH.f11434l;
            l0 l0VarE = g0VarD.e(str != null ? x.k(str, UptodownApp.K, ":webp") : null);
            float f = UptodownApp.I;
            l0VarE.h(d.x(this));
            l0VarE.e(z0().f10276l, null);
            z0().f10276l.setBackground(ContextCompat.getDrawable(this, R.drawable.shadow_user_icon));
        } else {
            z0().f10276l.setImageResource(R.drawable.vector_user_profile);
        }
        z0().f10276l.setPadding(0, 0, 0, 0);
        z0().T.setText(w2VarH.f11435m);
        if (!w2VarH.d() || l.a(w2VarH.f11437o, "type0")) {
            int i = UsernameTextView.f3453s;
            i5.F(z0().T);
        } else {
            int i6 = UsernameTextView.f3453s;
            i5.g(z0().T, w2VarH.d(), w2VarH.f11437o);
        }
        if (w2VarH.d()) {
            z0().f10275b.setVisibility(0);
            ImageView imageView = z0().f10276l;
            int dimension = (int) imageView.getContext().getResources().getDimension(R.dimen.border_radius_xs);
            imageView.setForeground(ContextCompat.getDrawable(imageView.getContext(), R.drawable.shape_stroke_review_avatar_turbo));
            imageView.setPadding(dimension, dimension, dimension, dimension);
            z0().R.setText(getString(R.string.turbo_welcome_popup_manage_subscription));
        } else {
            z0().R.setText(getString(R.string.subscribe_to_uptodown_turbo));
        }
        z0().E.setVisibility(0);
        if (!w2VarH.d()) {
            z0().v.setVisibility(8);
        } else if (this.Q == null) {
            zc zcVarA02 = A0();
            zcVarA02.getClass();
            c0.s(ViewModelKt.getViewModelScope(zcVarA02), dVar, null, new yc(this, zcVarA02, cVar, 1), 2);
        } else {
            z0().v.setVisibility(0);
        }
        z0().M.setVisibility(0);
        float f10 = UptodownApp.I;
        d.A(this);
        d.z(this);
    }

    public final void y0(Context context) {
        zc zcVarA0 = A0();
        zcVarA0.getClass();
        context.getClass();
        a0 viewModelScope = ViewModelKt.getViewModelScope(zcVarA0);
        e eVar = m0.f8289a;
        c0.s(viewModelScope, v7.d.f10885a, null, new xc(context, null, 0), 2);
        z0().f10276l.setImageResource(R.drawable.vector_user_login);
        ImageView imageView = z0().f10276l;
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        imageView.setPadding(dimension, dimension, dimension, dimension);
        z0().f10276l.setForeground(null);
        z0().f10276l.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_user_avatar_bg));
        z0().T.setText(getString(R.string.sign_in_sign_up));
        int i = UsernameTextView.f3453s;
        i5.F(z0().T);
        z0().T.setTextColor(ContextCompat.getColor(this, R.color.text_terciary));
        z0().R.setText(getString(R.string.subscribe_to_uptodown_turbo));
        z0().M.setVisibility(8);
        z0().E.setVisibility(8);
        z0().v.setVisibility(8);
        this.Q = null;
        z0().f10275b.setVisibility(8);
    }

    public final z0 z0() {
        return (z0) this.O.getValue();
    }
}
