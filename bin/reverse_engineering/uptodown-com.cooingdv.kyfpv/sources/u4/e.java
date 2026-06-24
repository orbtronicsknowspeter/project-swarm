package u4;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelKt;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AppDetailActivity;
import com.uptodown.activities.CustomWebView;
import com.uptodown.activities.FreeUpSpaceActivity;
import com.uptodown.activities.InformationActivity;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.MoreInfo;
import com.uptodown.activities.OldVersionsActivity;
import com.uptodown.activities.OrganizationActivity;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f10465b;

    public /* synthetic */ e(f0 f0Var, int i) {
        this.f10464a = i;
        this.f10465b = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i = this.f10464a;
        f0 f0Var = this.f10465b;
        switch (i) {
            case 0:
                f0Var.t();
                break;
            case 1:
                Intent intent = new Intent(f0Var.requireActivity(), (Class<?>) FreeUpSpaceActivity.class);
                intent.putExtra("appInfo", f0Var.B());
                float f = UptodownApp.I;
                FragmentActivity fragmentActivityRequireActivity = f0Var.requireActivity();
                fragmentActivityRequireActivity.getClass();
                f0Var.startActivity(intent, b4.d.a(fragmentActivityRequireActivity));
                break;
            case 2:
                if (((Number) f0Var.G().R.getValue()).intValue() >= 0) {
                    Context contextRequireContext = f0Var.requireContext();
                    contextRequireContext.getClass();
                    boolean z9 = ((Number) f0Var.G().R.getValue()).intValue() > 0;
                    SharedPreferences sharedPreferences = contextRequireContext.getSharedPreferences("SettingsPreferences", 0);
                    sharedPreferences.getClass();
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putBoolean("storage_sdcard", z9);
                    editorEdit.apply();
                    FragmentActivity activity = f0Var.getActivity();
                    activity.getClass();
                    AlertDialog alertDialog = ((c4.k0) activity).F;
                    if (alertDialog != null) {
                        alertDialog.dismiss();
                    }
                    f0Var.e0();
                }
                break;
            case 3:
                f0Var.y();
                if (f0Var.getActivity() != null) {
                    FragmentActivity activity2 = f0Var.getActivity();
                    activity2.getClass();
                    AlertDialog alertDialog2 = ((c4.k0) activity2).F;
                    if (alertDialog2 != null) {
                        alertDialog2.dismiss();
                    }
                }
                break;
            case 4:
                f0Var.t();
                break;
            case 5:
                FragmentActivity activity3 = f0Var.getActivity();
                activity3.getClass();
                AlertDialog alertDialog3 = ((c4.k0) activity3).F;
                if (alertDialog3 != null) {
                    alertDialog3.dismiss();
                }
                break;
            case 6:
                float f10 = UptodownApp.I;
                if (b4.d.t()) {
                    FragmentActivity activity4 = f0Var.getActivity();
                    activity4.getClass();
                    if (((c4.k0) activity4).T()) {
                        v0 v0VarG = f0Var.G();
                        Context contextRequireContext2 = f0Var.requireContext();
                        contextRequireContext2.getClass();
                        long j = f0Var.B().f11159a;
                        String str2 = f0Var.B().f11160b;
                        str2.getClass();
                        String strI = f0Var.B().i();
                        t4.b bVar = f0Var.f10474b;
                        bVar.getClass();
                        boolean zIsChecked = bVar.f9604d0.isChecked();
                        v0VarG.getClass();
                        o7.a0 viewModelScope = ViewModelKt.getViewModelScope(v0VarG);
                        v7.e eVar = o7.m0.f8289a;
                        o7.c0.s(viewModelScope, v7.d.f10885a, null, new m0(v0VarG, j, str2, strI, zIsChecked, contextRequireContext2, null), 2);
                    }
                }
                break;
            case 7:
                if (f0Var.getContext() != null) {
                    CustomTabsIntent customTabsIntentBuild = new CustomTabsIntent.Builder().build();
                    customTabsIntentBuild.getClass();
                    Context contextRequireContext3 = f0Var.requireContext();
                    contextRequireContext3.getClass();
                    String strH = d0.b.H(contextRequireContext3);
                    if (l7.m.q0(strH, ".uptodown.com/", false)) {
                        strH = (l7.m.q0(strH, "?", false) ? strH.concat("&") : strH.concat("?")).concat("userAgent=uptodownandroid");
                    }
                    customTabsIntentBuild.intent.setData(Uri.parse(strH));
                    try {
                        ActivityResultLauncher activityResultLauncher = f0Var.f10487y;
                        Intent intent2 = customTabsIntentBuild.intent;
                        float f11 = UptodownApp.I;
                        FragmentActivity fragmentActivityRequireActivity2 = f0Var.requireActivity();
                        fragmentActivityRequireActivity2.getClass();
                        activityResultLauncher.launch(intent2, b4.d.b(fragmentActivityRequireActivity2));
                    } catch (Exception unused) {
                        Intent intent3 = new Intent(f0Var.getActivity(), (Class<?>) CustomWebView.class);
                        intent3.putExtra("url", strH);
                        float f12 = UptodownApp.I;
                        FragmentActivity fragmentActivityRequireActivity3 = f0Var.requireActivity();
                        fragmentActivityRequireActivity3.getClass();
                        f0Var.startActivity(intent3, b4.d.a(fragmentActivityRequireActivity3));
                        return;
                    }
                }
                break;
            case 8:
                x4.j jVar = new x4.j(0, (String) null, 7);
                x4.y1 y1Var = f0Var.B().G0;
                y1Var.getClass();
                if (y1Var.f11470l > -1) {
                    x4.y1 y1Var2 = f0Var.B().G0;
                    y1Var2.getClass();
                    jVar.f11225a = y1Var2.f11470l;
                    x4.y1 y1Var3 = f0Var.B().G0;
                    y1Var3.getClass();
                    jVar.f11230o = y1Var3.f11472n;
                } else {
                    x4.y1 y1Var4 = f0Var.B().G0;
                    y1Var4.getClass();
                    if (y1Var4.f11469b > -1) {
                        x4.y1 y1Var5 = f0Var.B().G0;
                        y1Var5.getClass();
                        jVar.f11225a = y1Var5.f11469b;
                        jVar.f11228m = true;
                    }
                }
                x4.y1 y1Var6 = f0Var.B().G0;
                y1Var6.getClass();
                String str3 = y1Var6.f11471m;
                if (str3 != null && str3.length() != 0) {
                    x4.y1 y1Var7 = f0Var.B().G0;
                    y1Var7.getClass();
                    jVar.f11226b = y1Var7.f11471m;
                }
                f0Var.Q(jVar);
                break;
            case 9:
                if (f0Var.getActivity() != null) {
                    if (f0Var.getActivity() instanceof MainActivity) {
                        FragmentActivity activity5 = f0Var.getActivity();
                        activity5.getClass();
                        ((MainActivity) activity5).h1();
                    } else if (f0Var.getActivity() instanceof AppDetailActivity) {
                        FragmentActivity activity6 = f0Var.getActivity();
                        activity6.getClass();
                        ((AppDetailActivity) activity6).finish();
                    }
                }
                break;
            case 10:
                f0Var.T();
                break;
            case 11:
                if (!f0Var.requireActivity().isFinishing()) {
                    Intent intent4 = new Intent(f0Var.requireActivity(), (Class<?>) MoreInfo.class);
                    intent4.putExtra("appInfo", f0Var.B());
                    float f13 = UptodownApp.I;
                    FragmentActivity fragmentActivityRequireActivity4 = f0Var.requireActivity();
                    fragmentActivityRequireActivity4.getClass();
                    f0Var.startActivity(intent4, b4.d.a(fragmentActivityRequireActivity4));
                }
                break;
            case 12:
                if (!f0Var.requireActivity().isFinishing() && f0Var.B().k()) {
                    FragmentActivity activity7 = f0Var.getActivity();
                    activity7.getClass();
                    if (((c4.k0) activity7).T()) {
                        Intent intent5 = new Intent(f0Var.requireActivity(), (Class<?>) OldVersionsActivity.class);
                        intent5.putExtra("appInfo", f0Var.B());
                        float f14 = UptodownApp.I;
                        FragmentActivity fragmentActivityRequireActivity5 = f0Var.requireActivity();
                        fragmentActivityRequireActivity5.getClass();
                        f0Var.startActivity(intent5, b4.d.a(fragmentActivityRequireActivity5));
                    }
                    break;
                }
                break;
            case 13:
                if (f0Var.getActivity() != null && !f0Var.requireActivity().isFinishing()) {
                    FragmentActivity activity8 = f0Var.getActivity();
                    activity8.getClass();
                    if (((c4.k0) activity8).T()) {
                        String string = f0Var.getString(R.string.dmca_title);
                        string.getClass();
                        String string2 = f0Var.getString(R.string.url_dmca);
                        string2.getClass();
                        FragmentActivity fragmentActivityRequireActivity6 = f0Var.requireActivity();
                        fragmentActivityRequireActivity6.getClass();
                        j5.c.e(fragmentActivityRequireActivity6, string2, string);
                    }
                    break;
                }
                break;
            case 14:
                f0Var.T();
                break;
            case 15:
                f0Var.T();
                break;
            case 16:
                if (!f0Var.requireActivity().isFinishing()) {
                    Intent intent6 = new Intent(f0Var.requireActivity(), (Class<?>) InformationActivity.class);
                    float f15 = UptodownApp.I;
                    FragmentActivity fragmentActivityRequireActivity7 = f0Var.requireActivity();
                    fragmentActivityRequireActivity7.getClass();
                    f0Var.startActivity(intent6, b4.d.a(fragmentActivityRequireActivity7));
                }
                break;
            case 17:
                float f16 = UptodownApp.I;
                if (b4.d.t() && f0Var.G().C.getValue() != null) {
                    Context contextRequireContext4 = f0Var.requireContext();
                    contextRequireContext4.getClass();
                    Object value = f0Var.G().C.getValue();
                    value.getClass();
                    String str4 = ((x4.e) value).f11124l;
                    str4.getClass();
                    Intent intent7 = new Intent("android.intent.action.DELETE", Uri.parse("package:".concat(str4)));
                    intent7.addFlags(268435456);
                    contextRequireContext4.startActivity(intent7);
                    break;
                }
                break;
            case 18:
                float f17 = UptodownApp.I;
                if (b4.d.t()) {
                    FragmentActivity activity9 = f0Var.getActivity();
                    activity9.getClass();
                    if (((c4.k0) activity9).T()) {
                        FragmentActivity activity10 = f0Var.getActivity();
                        activity10.getClass();
                        AlertDialog alertDialog4 = ((c4.k0) activity10).F;
                        if (alertDialog4 != null) {
                            alertDialog4.dismiss();
                        }
                        AlertDialog.Builder builder = new AlertDialog.Builder(f0Var.getContext());
                        View viewInflate = f0Var.getLayoutInflater().inflate(R.layout.dialog_user_list_selector, (ViewGroup) null, false);
                        int i6 = R.id.iv_recommended_icon;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_recommended_icon);
                        if (imageView != null) {
                            i6 = R.id.iv_recommended_option;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_recommended_option);
                            if (imageView2 != null) {
                                i6 = R.id.iv_wishlist_icon;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_wishlist_icon);
                                if (imageView3 != null) {
                                    i6 = R.id.iv_wishlist_option;
                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_wishlist_option);
                                    if (imageView4 != null) {
                                        i6 = R.id.ll_recommended_option;
                                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(viewInflate, R.id.ll_recommended_option);
                                        if (relativeLayout != null) {
                                            i6 = R.id.ll_wishlist_option;
                                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(viewInflate, R.id.ll_wishlist_option);
                                            if (relativeLayout2 != null) {
                                                i6 = R.id.tv_recommended_option;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_recommended_option);
                                                if (textView != null) {
                                                    i6 = R.id.tv_title_dialog_rename;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_title_dialog_rename);
                                                    if (textView2 != null) {
                                                        i6 = R.id.tv_wishlist_option;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_wishlist_option);
                                                        if (textView3 != null) {
                                                            LinearLayout linearLayout = (LinearLayout) viewInflate;
                                                            if (f0Var.getActivity() != null && !f0Var.requireActivity().isFinishing()) {
                                                                textView2.setTypeface(f4.c.f4883w);
                                                                textView3.setTypeface(f4.c.f4883w);
                                                                textView.setTypeface(f4.c.f4883w);
                                                                if (((Number) f0Var.G().E.getValue()).intValue() == 1) {
                                                                    relativeLayout2.setBackground(ContextCompat.getDrawable(f0Var.requireContext(), R.drawable.ripple_blue_primary_button));
                                                                    textView3.setTextColor(ContextCompat.getColor(f0Var.requireContext(), R.color.white));
                                                                    imageView4.setVisibility(0);
                                                                    imageView3.setImageDrawable(ContextCompat.getDrawable(f0Var.requireContext(), R.drawable.vector_heart_white));
                                                                }
                                                                if (((Number) f0Var.G().F.getValue()).intValue() == 1) {
                                                                    relativeLayout.setBackground(ContextCompat.getDrawable(f0Var.requireContext(), R.drawable.ripple_blue_primary_button));
                                                                    textView.setTextColor(ContextCompat.getColor(f0Var.requireContext(), R.color.white));
                                                                    imageView2.setVisibility(0);
                                                                    imageView.setImageDrawable(ContextCompat.getDrawable(f0Var.requireContext(), R.drawable.vector_bookmark_white));
                                                                }
                                                                relativeLayout.setOnClickListener(new p(f0Var, 17));
                                                                relativeLayout2.setOnClickListener(new p(f0Var, 18));
                                                                builder.setView(linearLayout);
                                                                builder.setCancelable(true);
                                                                f0Var.m0(builder);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i6)));
                    }
                }
                break;
            case 19:
                float f18 = UptodownApp.I;
                if (b4.d.t() && !((Boolean) f0Var.G().T.getValue()).booleanValue()) {
                    f0Var.V();
                    break;
                }
                break;
            case 20:
                float f19 = UptodownApp.I;
                if (b4.d.t()) {
                    f0Var.n();
                }
                break;
            case 21:
                float f20 = UptodownApp.I;
                if (b4.d.t()) {
                    f0Var.o();
                }
                break;
            case 22:
                if (!f0Var.requireActivity().isFinishing()) {
                    FragmentActivity activity11 = f0Var.getActivity();
                    activity11.getClass();
                    if (((c4.k0) activity11).T()) {
                        Intent intent8 = new Intent(f0Var.requireActivity(), (Class<?>) OrganizationActivity.class);
                        intent8.putExtra("organizationID", f0Var.B().f11170k0);
                        intent8.putExtra("organizationName", f0Var.B().f11191w);
                        float f21 = UptodownApp.I;
                        FragmentActivity fragmentActivityRequireActivity8 = f0Var.requireActivity();
                        fragmentActivityRequireActivity8.getClass();
                        f0Var.startActivity(intent8, b4.d.a(fragmentActivityRequireActivity8));
                    }
                }
                break;
            case 23:
                String str5 = f0Var.B().f11193x;
                if (str5 != null && str5.length() != 0) {
                    t4.b bVar2 = f0Var.f10474b;
                    bVar2.getClass();
                    int visibility = bVar2.f9605e0.getVisibility();
                    t4.b bVar3 = f0Var.f10474b;
                    if (visibility != 0) {
                        bVar3.getClass();
                        bVar3.f9639z0.setText(R.string.read_more_desc_app_detail);
                        t4.b bVar4 = f0Var.f10474b;
                        bVar4.getClass();
                        bVar4.f9605e0.setVisibility(0);
                        t4.b bVar5 = f0Var.f10474b;
                        bVar5.getClass();
                        bVar5.X.setVisibility(8);
                        t4.b bVar6 = f0Var.f10474b;
                        bVar6.getClass();
                        bVar6.f9610j0.setMaxLines(6);
                        t4.b bVar7 = f0Var.f10474b;
                        bVar7.getClass();
                        bVar7.f9610j0.setEllipsize(TextUtils.TruncateAt.END);
                        t4.b bVar8 = f0Var.f10474b;
                        bVar8.getClass();
                        bVar8.Q.setVisibility(8);
                        t4.b bVar9 = f0Var.f10474b;
                        bVar9.getClass();
                        NestedScrollView nestedScrollView = bVar9.f9606f0;
                        t4.b bVar10 = f0Var.f10474b;
                        bVar10.getClass();
                        nestedScrollView.smoothScrollTo(0, bVar10.T.A.getBottom(), 1000);
                        break;
                    } else {
                        bVar3.getClass();
                        bVar3.f9639z0.setText(R.string.read_less_desc_app_detail);
                        t4.b bVar11 = f0Var.f10474b;
                        bVar11.getClass();
                        bVar11.f9605e0.setVisibility(8);
                        String str6 = f0Var.B().R;
                        if ((str6 != null && str6.length() != 0) || ((str = f0Var.B().Q) != null && str.length() != 0)) {
                            t4.b bVar12 = f0Var.f10474b;
                            bVar12.getClass();
                            bVar12.X.setVisibility(0);
                        }
                        t4.b bVar13 = f0Var.f10474b;
                        bVar13.getClass();
                        bVar13.f9610j0.setMaxLines(Integer.MAX_VALUE);
                        t4.b bVar14 = f0Var.f10474b;
                        bVar14.getClass();
                        bVar14.f9610j0.setEllipsize(null);
                        String str7 = f0Var.B().f11172l0;
                        if (str7 != null && str7.length() != 0) {
                            t4.b bVar15 = f0Var.f10474b;
                            bVar15.getClass();
                            bVar15.Q.setVisibility(0);
                            break;
                        }
                    }
                }
                break;
            case 24:
                String str8 = f0Var.B().f11162c0;
                if (str8 != null && str8.length() != 0) {
                    t4.b bVar16 = f0Var.f10474b;
                    bVar16.getClass();
                    int visibility2 = bVar16.Y.f10130o.getVisibility();
                    t4.b bVar17 = f0Var.f10474b;
                    if (visibility2 != 0) {
                        bVar17.getClass();
                        bVar17.Y.f10127l.setText(R.string.read_more_desc_app_detail);
                        t4.b bVar18 = f0Var.f10474b;
                        bVar18.getClass();
                        bVar18.Y.f10130o.setVisibility(0);
                        t4.b bVar19 = f0Var.f10474b;
                        bVar19.getClass();
                        bVar19.Y.f10129n.setMaxLines(6);
                        t4.b bVar20 = f0Var.f10474b;
                        bVar20.getClass();
                        bVar20.Y.f10129n.setEllipsize(TextUtils.TruncateAt.END);
                        t4.b bVar21 = f0Var.f10474b;
                        bVar21.getClass();
                        NestedScrollView nestedScrollView2 = bVar21.f9606f0;
                        t4.b bVar22 = f0Var.f10474b;
                        bVar22.getClass();
                        nestedScrollView2.smoothScrollTo(0, bVar22.Y.f10128m.getTop(), 1000);
                    } else {
                        bVar17.getClass();
                        bVar17.Y.f10127l.setText(R.string.read_less_desc_app_detail);
                        t4.b bVar23 = f0Var.f10474b;
                        bVar23.getClass();
                        bVar23.Y.f10130o.setVisibility(8);
                        t4.b bVar24 = f0Var.f10474b;
                        bVar24.getClass();
                        bVar24.Y.f10129n.setMaxLines(Integer.MAX_VALUE);
                        t4.b bVar25 = f0Var.f10474b;
                        bVar25.getClass();
                        bVar25.Y.f10129n.setEllipsize(null);
                    }
                    break;
                }
                break;
            case 25:
                f0Var.T();
                break;
            case 26:
                f0Var.t();
                break;
            case 27:
                f0Var.t();
                break;
            case 28:
                Context contextRequireContext5 = f0Var.requireContext();
                contextRequireContext5.getClass();
                FragmentActivity fragmentActivityRequireActivity9 = f0Var.requireActivity();
                fragmentActivityRequireActivity9.getClass();
                d0.b.j(contextRequireContext5, (c4.k0) fragmentActivityRequireActivity9, f0Var.f10485w, f0Var.B(), false);
                break;
            default:
                if (f0Var.getActivity() instanceof c4.k0) {
                    FragmentActivity fragmentActivityRequireActivity10 = f0Var.requireActivity();
                    fragmentActivityRequireActivity10.getClass();
                    b2.t1.u((c4.k0) fragmentActivityRequireActivity10, f0Var.B().f11175n);
                }
                break;
        }
    }
}
