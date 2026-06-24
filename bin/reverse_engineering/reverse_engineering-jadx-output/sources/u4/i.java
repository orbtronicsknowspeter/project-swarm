package u4;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.view.MenuItem;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AppInstalledDetailsActivity;
import com.uptodown.activities.SearchActivity;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import x4.u2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements ActivityResultCallback, Toolbar.OnMenuItemClickListener, NestedScrollView.OnScrollChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f10503b;

    public /* synthetic */ i(f0 f0Var, int i) {
        this.f10502a = i;
        this.f10503b = f0Var;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void onActivityResult(Object obj) {
        int i = this.f10502a;
        int i6 = 1;
        f0 f0Var = this.f10503b;
        ActivityResult activityResult = (ActivityResult) obj;
        switch (i) {
            case 0:
                q1.a aVar = new q1.a(8);
                LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(f0Var);
                v7.e eVar = o7.m0.f8288a;
                o7.c0.s(lifecycleScope, v7.d.f10884a, null, new d0(f0Var, aVar, null, i6), 2);
                break;
            default:
                if (activityResult.getResultCode() == 1) {
                    Context contextRequireContext = f0Var.requireContext();
                    contextRequireContext.getClass();
                    if (u2.g(contextRequireContext)) {
                        Context contextRequireContext2 = f0Var.requireContext();
                        contextRequireContext2.getClass();
                        u2.i(contextRequireContext2, LifecycleOwnerKt.getLifecycleScope(f0Var));
                        if (((CharSequence) f0Var.G().H.getValue()).length() > 0) {
                            f0Var.Z((String) f0Var.G().H.getValue());
                            FragmentActivity activity = f0Var.getActivity();
                            activity.getClass();
                            AlertDialog alertDialog = ((c4.k0) activity).F;
                            if (alertDialog != null) {
                                alertDialog.dismiss();
                            }
                        }
                        f0Var.q();
                    }
                }
                break;
        }
    }

    @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem menuItem) {
        FragmentActivity activity;
        String str;
        menuItem.getClass();
        float f = UptodownApp.I;
        if (b4.d.t()) {
            int itemId = menuItem.getItemId();
            f0 f0Var = this.f10503b;
            if (itemId == 2131361892) {
                FragmentActivity activity2 = f0Var.getActivity();
                activity2.getClass();
                if (((c4.k0) activity2).T()) {
                    Intent intent = new Intent(f0Var.getContext(), (Class<?>) SearchActivity.class);
                    intent.setFlags(603979776);
                    FragmentActivity fragmentActivityRequireActivity = f0Var.requireActivity();
                    fragmentActivityRequireActivity.getClass();
                    f0Var.startActivity(intent, b4.d.a(fragmentActivityRequireActivity));
                    return true;
                }
            } else {
                t6.c cVar = null;
                if (menuItem.getItemId() == 2131361893) {
                    if (f0Var.getContext() != null) {
                        LifecycleOwner viewLifecycleOwner = f0Var.getViewLifecycleOwner();
                        viewLifecycleOwner.getClass();
                        o7.c0.s(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new w(f0Var, cVar, 22), 3);
                        return true;
                    }
                } else if (menuItem.getItemId() == 2131361887) {
                    if (f0Var.getActivity() != null && !f0Var.requireActivity().isFinishing() && (str = f0Var.B().f11174n) != null && str.length() != 0) {
                        FragmentActivity activity3 = f0Var.getActivity();
                        activity3.getClass();
                        if (((c4.k0) activity3).T()) {
                            FragmentActivity fragmentActivityRequireActivity2 = f0Var.requireActivity();
                            fragmentActivityRequireActivity2.getClass();
                            String str2 = f0Var.B().f11174n;
                            str2.getClass();
                            j5.c.e((c4.k0) fragmentActivityRequireActivity2, str2, f0Var.B().f11159b);
                            return true;
                        }
                    }
                } else {
                    if (menuItem.getItemId() == 2131361855) {
                        f0Var.V();
                        return true;
                    }
                    if (menuItem.getItemId() == 2131361897) {
                        String str3 = f0Var.B().F;
                        if (str3 != null && str3.length() != 0 && (activity = f0Var.getActivity()) != null) {
                            String str4 = f0Var.B().F;
                            str4.getClass();
                            Intent intent2 = new Intent("android.intent.action.DELETE", Uri.parse("package:".concat(str4)));
                            intent2.addFlags(268435456);
                            activity.startActivity(intent2);
                            return true;
                        }
                    } else {
                        if (menuItem.getItemId() == 2131361898) {
                            f0Var.o();
                            return true;
                        }
                        if (menuItem.getItemId() == 2131361890) {
                            f0Var.n();
                            return true;
                        }
                        if (menuItem.getItemId() == 2131361876) {
                            String str5 = f0Var.B().F;
                            if (str5 != null && str5.length() != 0 && f0Var.getContext() != null) {
                                e1.c0 c0Var = j5.g.D;
                                Context contextRequireContext = f0Var.requireContext();
                                contextRequireContext.getClass();
                                j5.g gVarL = c0Var.l(contextRequireContext);
                                gVarL.b();
                                String str6 = f0Var.B().F;
                                str6.getClass();
                                x4.e eVarB = gVarL.B(str6);
                                if (eVarB != null) {
                                    if (eVarB.v == 0) {
                                        eVarB.v = 1;
                                        x4.d dVar = eVarB.f11127p;
                                        x4.d dVar2 = x4.d.f11088b;
                                        if (dVar != dVar2) {
                                            eVarB.f11127p = dVar2;
                                            String str7 = eVarB.f11123l;
                                            str7.getClass();
                                            gVarL.s(str7);
                                            Context contextRequireContext2 = f0Var.requireContext();
                                            contextRequireContext2.getClass();
                                            a.a.r(contextRequireContext2);
                                        }
                                    } else {
                                        eVarB.v = 0;
                                    }
                                    gVarL.n0(eVarB);
                                    r7.o0 o0Var = f0Var.G().C;
                                    o0Var.getClass();
                                    o0Var.g(null, eVarB);
                                    Context contextRequireContext3 = f0Var.requireContext();
                                    contextRequireContext3.getClass();
                                    j5.a.i(contextRequireContext3);
                                }
                                gVarL.c();
                                f0Var.z();
                                return true;
                            }
                        } else if (menuItem.getItemId() == 2131361856) {
                            if (f0Var.getActivity() != null && !f0Var.requireActivity().isFinishing()) {
                                Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                                intent3.setData(Uri.fromParts("package", f0Var.B().F, null));
                                intent3.addFlags(268435456);
                                intent3.addFlags(8388608);
                                try {
                                    f0Var.startActivity(intent3);
                                } catch (ActivityNotFoundException e10) {
                                    e10.printStackTrace();
                                }
                            }
                        } else if (menuItem.getItemId() == 2131361857) {
                            if (f0Var.getContext() != null) {
                                e1.c0 c0Var2 = j5.g.D;
                                FragmentActivity fragmentActivityRequireActivity3 = f0Var.requireActivity();
                                fragmentActivityRequireActivity3.getClass();
                                j5.g gVarL2 = c0Var2.l(fragmentActivityRequireActivity3);
                                gVarL2.b();
                                String str8 = f0Var.B().F;
                                str8.getClass();
                                x4.e eVarB2 = gVarL2.B(str8);
                                gVarL2.c();
                                Intent intent4 = new Intent(f0Var.requireActivity(), (Class<?>) AppInstalledDetailsActivity.class);
                                intent4.putExtra("appInstalled", eVarB2);
                                intent4.putExtra("appInfo", f0Var.B());
                                FragmentActivity fragmentActivityRequireActivity4 = f0Var.requireActivity();
                                fragmentActivityRequireActivity4.getClass();
                                f0Var.startActivity(intent4, b4.d.a(fragmentActivityRequireActivity4));
                                return true;
                            }
                        } else {
                            if (menuItem.getItemId() != 2131361891) {
                                return false;
                            }
                            if (f0Var.G().f10642z.getValue() instanceof j5.r) {
                                Object value = f0Var.G().f10642z.getValue();
                                value.getClass();
                                f0Var.o0((ArrayList) ((j5.r) value).f6707a);
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
    public void onScrollChange(NestedScrollView nestedScrollView, int i, int i6, int i10, int i11) {
        boolean zBooleanValue;
        Rect rect = new Rect();
        f0 f0Var = this.f10503b;
        t4.b bVar = f0Var.f10473b;
        bVar.getClass();
        bVar.f9605f0.getHitRect(rect);
        f0Var.l0(rect);
        t4.b bVar2 = f0Var.f10473b;
        bVar2.getClass();
        if (bVar2.T.A.getLocalVisibleRect(rect)) {
            t4.b bVar3 = f0Var.f10473b;
            bVar3.getClass();
            bVar3.f9613m.setTitle("");
            r7.o0 o0Var = f0Var.G().P;
            Boolean bool = Boolean.TRUE;
            o0Var.getClass();
            o0Var.g(null, bool);
            return;
        }
        boolean zBooleanValue2 = ((Boolean) f0Var.G().P.getValue()).booleanValue();
        r7.o0 o0Var2 = f0Var.G().P;
        Boolean bool2 = Boolean.FALSE;
        o0Var2.getClass();
        o0Var2.g(null, bool2);
        String str = f0Var.B().f11159b;
        if (str == null || str.length() == 0) {
            return;
        }
        ArrayList arrayList = f0Var.B().Y;
        if (arrayList == null || arrayList.isEmpty()) {
            String strE = f0Var.B().e();
            if (strE == null || strE.length() == 0) {
                t4.b bVar4 = f0Var.f10473b;
                bVar4.getClass();
                bVar4.f9613m.setTitleEnabled(false);
                zBooleanValue = true;
            } else {
                zBooleanValue = ((Boolean) f0Var.G().O.getValue()).booleanValue();
            }
        } else {
            zBooleanValue = ((Boolean) f0Var.G().O.getValue()).booleanValue();
        }
        if (zBooleanValue2 && zBooleanValue) {
            if (f0Var.getResources().getConfiguration().getLayoutDirection() == 1) {
                String str2 = f0Var.B().f11159b;
                str2.getClass();
                int length = str2.length() - 1;
                int i12 = 0;
                for (int i13 = 0; i13 < length; i13++) {
                    String str3 = f0Var.B().f11159b;
                    str3.getClass();
                    char cCharAt = str3.charAt(i13);
                    if (cCharAt != ' ') {
                        ConcurrentHashMap concurrentHashMap = j5.t.f6708a;
                        if (1424 > cCharAt || cCharAt >= 1792) {
                            i12++;
                        }
                    }
                }
                if (i12 > 0) {
                    t4.b bVar5 = f0Var.f10473b;
                    bVar5.getClass();
                    bVar5.f9613m.setRtlTextDirectionHeuristicsEnabled(false);
                    t4.b bVar6 = f0Var.f10473b;
                    bVar6.getClass();
                    bVar6.f9613m.setLayoutDirection(0);
                }
            }
            t4.b bVar7 = f0Var.f10473b;
            bVar7.getClass();
            CollapsingToolbarLayout collapsingToolbarLayout = bVar7.f9613m;
            String str4 = f0Var.B().f11159b;
            str4.getClass();
            collapsingToolbarLayout.setTitle(str4);
        }
    }
}
