package c4;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.uptodown.UptodownApp;
import com.uptodown.activities.ListsActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class z1 implements r7.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ListsActivity f2383b;

    public /* synthetic */ z1(ListsActivity listsActivity, int i) {
        this.f2382a = i;
        this.f2383b = listsActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v6, types: [a4.l0] */
    /* JADX WARN: Type inference failed for: r7v54, types: [a4.i] */
    /* JADX WARN: Type inference failed for: r7v71 */
    /* JADX WARN: Type inference failed for: r7v72 */
    @Override // r7.i
    public final Object emit(Object obj, t6.c cVar) {
        int i = this.f2382a;
        p6.x xVar = p6.x.f8463a;
        ListsActivity listsActivity = this.f2383b;
        int i6 = 1;
        ViewGroup viewGroup = null;
        switch (i) {
            case 0:
                j5.s sVar = (j5.s) obj;
                if (!(sVar instanceof j5.p)) {
                    if (sVar instanceof j5.r) {
                        int i10 = ListsActivity.S;
                        if (!listsActivity.B0().f1664c) {
                            d2 d2Var = (d2) ((j5.r) sVar).f6707a;
                            if (d2Var.f1503a.isEmpty()) {
                                ImageView imageView = (ImageView) listsActivity.A0().f10120n.f4467l;
                                float f = UptodownApp.I;
                                imageView.setImageDrawable(b4.d.f(listsActivity));
                            } else {
                                ListsActivity.y0(listsActivity, listsActivity.A0().f10120n);
                                int i11 = 0;
                                for (x4.a3 a3Var : d2Var.f1503a) {
                                    int i12 = i11 + 1;
                                    if (i11 == 0) {
                                        a4.l0 l0VarE = a4.g0.d().e(a3Var.a());
                                        float f10 = UptodownApp.I;
                                        l0VarE.g(b4.d.f(listsActivity));
                                        l0VarE.h(b4.d.x(listsActivity));
                                        l0VarE.e((ImageView) listsActivity.A0().f10120n.f4467l, null);
                                    } else {
                                        String str = a3Var.f11048c;
                                        if (str != null && str.length() != 0) {
                                            String strA = a3Var.a();
                                            strA.getClass();
                                            listsActivity.z0(strA, (LinearLayout) listsActivity.A0().f10120n.f4468m, i11);
                                        }
                                    }
                                    i11 = i12;
                                }
                            }
                            listsActivity.B0().f1664c = true;
                            ((TextView) listsActivity.A0().f10120n.f4471p).setText(listsActivity.C0(d2Var.f1504b));
                            ((RelativeLayout) listsActivity.A0().f10120n.f4470o).setVisibility(0);
                            ((ProgressBar) listsActivity.A0().f10120n.f4469n).setVisibility(8);
                            listsActivity.A0().f10121o.setVisibility(8);
                            ((LinearLayout) listsActivity.A0().f10120n.f4466b).setOnClickListener(new y1(listsActivity, i6));
                        }
                        break;
                    } else if (!(sVar instanceof j5.q)) {
                        com.google.gson.internal.a.b();
                        break;
                    }
                }
                break;
            case 1:
                j5.s sVar2 = (j5.s) obj;
                if (!(sVar2 instanceof j5.p)) {
                    if (sVar2 instanceof j5.r) {
                        int i13 = ListsActivity.S;
                        if (!listsActivity.B0().f) {
                            d2 d2Var2 = (d2) ((j5.r) sVar2).f6707a;
                            if (d2Var2.f1503a.isEmpty()) {
                                ImageView imageView2 = (ImageView) listsActivity.A0().f10119m.f4467l;
                                float f11 = UptodownApp.I;
                                imageView2.setImageDrawable(b4.d.f(listsActivity));
                            } else {
                                ListsActivity.y0(listsActivity, listsActivity.A0().f10119m);
                                int i14 = 0;
                                for (x4.a3 a3Var2 : d2Var2.f1503a) {
                                    int i15 = i14 + 1;
                                    if (i14 == 0) {
                                        a4.l0 l0VarE2 = a4.g0.d().e(a3Var2.a());
                                        float f12 = UptodownApp.I;
                                        l0VarE2.g(b4.d.f(listsActivity));
                                        l0VarE2.h(b4.d.x(listsActivity));
                                        l0VarE2.e((ImageView) listsActivity.A0().f10119m.f4467l, null);
                                    } else {
                                        String str2 = a3Var2.f11048c;
                                        if (str2 != null && str2.length() != 0) {
                                            String strA2 = a3Var2.a();
                                            strA2.getClass();
                                            listsActivity.z0(strA2, (LinearLayout) listsActivity.A0().f10119m.f4468m, i14);
                                        }
                                    }
                                    i14 = i15;
                                }
                            }
                            listsActivity.B0().f = true;
                            ((TextView) listsActivity.A0().f10119m.f4471p).setText(listsActivity.C0(d2Var2.f1504b));
                            ((RelativeLayout) listsActivity.A0().f10119m.f4470o).setVisibility(0);
                            ((ProgressBar) listsActivity.A0().f10119m.f4469n).setVisibility(8);
                            listsActivity.A0().f10121o.setVisibility(8);
                            ((LinearLayout) listsActivity.A0().f10119m.f4466b).setOnClickListener(new y1(listsActivity, 2));
                        }
                        break;
                    } else if (!(sVar2 instanceof j5.q)) {
                        com.google.gson.internal.a.b();
                        break;
                    }
                }
                break;
            case 2:
                j5.s sVar3 = (j5.s) obj;
                if (!(sVar3 instanceof j5.p)) {
                    if (sVar3 instanceof j5.r) {
                        int i16 = ListsActivity.S;
                        if (!listsActivity.B0().i) {
                            e2 e2Var = (e2) ((j5.r) sVar3).f6707a;
                            if (e2Var.f1545a.isEmpty()) {
                                ImageView imageView3 = (ImageView) listsActivity.A0().f10118l.f4467l;
                                float f13 = UptodownApp.I;
                                imageView3.setImageDrawable(b4.d.f(listsActivity));
                            } else {
                                ListsActivity.y0(listsActivity, listsActivity.A0().f10118l);
                                int i17 = 0;
                                for (x4.x1 x1Var : e2Var.f1545a) {
                                    int i18 = i17 + 1;
                                    if (i17 == 0) {
                                        a4.l0 l0VarE3 = a4.g0.d().e(x1Var.f11450c);
                                        float f14 = UptodownApp.I;
                                        l0VarE3.g(b4.d.f(listsActivity));
                                        l0VarE3.h(b4.d.x(listsActivity));
                                        l0VarE3.e((ImageView) listsActivity.A0().f10118l.f4467l, null);
                                    } else {
                                        String str3 = x1Var.f11450c;
                                        if (str3 != null && str3.length() != 0) {
                                            String str4 = x1Var.f11450c;
                                            str4.getClass();
                                            listsActivity.z0(str4, (LinearLayout) listsActivity.A0().f10118l.f4468m, i17);
                                        }
                                    }
                                    i17 = i18;
                                }
                            }
                            listsActivity.B0().i = true;
                            ((TextView) listsActivity.A0().f10118l.f4471p).setText(listsActivity.C0(e2Var.f1546b));
                            ((RelativeLayout) listsActivity.A0().f10118l.f4470o).setVisibility(0);
                            ((ProgressBar) listsActivity.A0().f10118l.f4469n).setVisibility(8);
                            listsActivity.A0().f10121o.setVisibility(8);
                            ((LinearLayout) listsActivity.A0().f10118l.f4466b).setOnClickListener(new y1(listsActivity, 3));
                        }
                        break;
                    } else if (!(sVar3 instanceof j5.q)) {
                        com.google.gson.internal.a.b();
                        break;
                    }
                }
                break;
            default:
                j5.s sVar4 = (j5.s) obj;
                if (!(sVar4 instanceof j5.p)) {
                    if (sVar4 instanceof j5.r) {
                        int i19 = ListsActivity.S;
                        if (!listsActivity.B0().f1668l) {
                            Object obj2 = ((j5.r) sVar4).f6707a;
                            if (!((Collection) obj2).isEmpty()) {
                                listsActivity.A0().f10117b.removeAllViews();
                                Iterator it = ((ArrayList) obj2).iterator();
                                it.getClass();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    next.getClass();
                                    x4.c1 c1Var = (x4.c1) next;
                                    e2.d dVarC = e2.d.c(listsActivity.getLayoutInflater().inflate(2131558674, viewGroup, false));
                                    LinearLayout linearLayout = (LinearLayout) dVarC.f4466b;
                                    TextView textView = (TextView) dVarC.f4471p;
                                    TextView textView2 = (TextView) dVarC.f4472q;
                                    textView2.setTypeface(f4.c.f4882w);
                                    textView2.setText(c1Var.f11077b);
                                    int i20 = 0;
                                    ?? r72 = viewGroup;
                                    for (String str5 : c1Var.f11078c) {
                                        int i21 = i20 + 1;
                                        if (i20 == 0) {
                                            ?? E = a4.g0.d().e(str5);
                                            float f15 = UptodownApp.I;
                                            E.g(b4.d.f(listsActivity));
                                            E.h(b4.d.x(listsActivity));
                                            E.e((ImageView) dVarC.f4467l, r72);
                                        } else if (str5.length() > 0) {
                                            listsActivity.z0(str5, (LinearLayout) dVarC.f4468m, i20);
                                        }
                                        i20 = i21;
                                        r72 = 0;
                                    }
                                    listsActivity.B0().f1668l = true;
                                    textView.setText(listsActivity.C0(c1Var.f11079d));
                                    textView.setTypeface(f4.c.f4883x);
                                    ((RelativeLayout) dVarC.f4470o).setVisibility(0);
                                    ((ProgressBar) dVarC.f4469n).setVisibility(8);
                                    listsActivity.A0().f10121o.setVisibility(8);
                                    linearLayout.setOnClickListener(new c.e(5, c1Var, listsActivity));
                                    listsActivity.A0().f10117b.addView(linearLayout);
                                    viewGroup = null;
                                }
                            }
                        }
                        break;
                    } else if (!(sVar4 instanceof j5.q)) {
                        com.google.gson.internal.a.b();
                        break;
                    }
                }
                break;
        }
        return null;
    }
}
