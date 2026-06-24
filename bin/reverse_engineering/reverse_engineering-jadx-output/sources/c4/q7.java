package c4;

import androidx.core.content.ContextCompat;
import com.uptodown.activities.PublicProfileActivity;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class q7 implements r7.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PublicProfileActivity f2019b;

    public /* synthetic */ q7(PublicProfileActivity publicProfileActivity, int i) {
        this.f2018a = i;
        this.f2019b = publicProfileActivity;
    }

    @Override // r7.i
    public final Object emit(Object obj, t6.c cVar) {
        int i = this.f2018a;
        p6.x xVar = p6.x.f8463a;
        j5.p pVar = j5.p.f6705a;
        PublicProfileActivity publicProfileActivity = this.f2019b;
        switch (i) {
            case 0:
                j5.s sVar = (j5.s) obj;
                if (!kotlin.jvm.internal.l.a(sVar, pVar)) {
                    if (sVar instanceof j5.r) {
                        x4.j2 j2Var = (x4.j2) ((j5.r) sVar).f6707a;
                        if (j2Var.f11245b == 1) {
                            int i6 = PublicProfileActivity.R;
                        } else if (j2Var.f11246c != 401) {
                            String string = publicProfileActivity.getString(2131951998);
                            string.getClass();
                            publicProfileActivity.A(string);
                        } else {
                            String string2 = publicProfileActivity.getString(2131952183);
                            string2.getClass();
                            String string3 = publicProfileActivity.getString(2131952182);
                            string3.getClass();
                            b2.t1.v(publicProfileActivity, string2, string3);
                        }
                        break;
                    } else if (!(sVar instanceof j5.q)) {
                        com.google.gson.internal.a.b();
                        break;
                    }
                }
                break;
            default:
                j5.s sVar2 = (j5.s) obj;
                if (!kotlin.jvm.internal.l.a(sVar2, pVar)) {
                    if (sVar2 instanceof j5.r) {
                        x4.v2 v2Var = (x4.v2) ((j5.r) sVar2).f6707a;
                        if (v2Var.f11423b != 1) {
                            int i10 = v2Var.f11424c;
                            if (i10 == 401) {
                                String string4 = publicProfileActivity.getString(2131952181);
                                string4.getClass();
                                String string5 = publicProfileActivity.getString(2131952180);
                                string5.getClass();
                                b2.t1.v(publicProfileActivity, string4, string5);
                            } else if (i10 != 409) {
                                String string6 = publicProfileActivity.getString(2131951998);
                                string6.getClass();
                                publicProfileActivity.A(string6);
                            } else {
                                String string7 = publicProfileActivity.getString(2131951675);
                                string7.getClass();
                                publicProfileActivity.A(string7);
                            }
                        } else {
                            if (v2Var.f11425d == 1) {
                                int i11 = PublicProfileActivity.R;
                                publicProfileActivity.y0().f9974x.setText(publicProfileActivity.getString(2131952685));
                                publicProfileActivity.y0().f9974x.setBackground(ContextCompat.getDrawable(publicProfileActivity, 2131231158));
                                publicProfileActivity.y0().f9974x.setTextColor(ContextCompat.getColor(publicProfileActivity, 2131099713));
                                publicProfileActivity.y0().f9976z.setText(j5.c.c(publicProfileActivity.z0().i));
                            } else {
                                int i12 = PublicProfileActivity.R;
                                publicProfileActivity.y0().f9974x.setText(publicProfileActivity.getString(2131952031));
                                publicProfileActivity.y0().f9974x.setBackground(ContextCompat.getDrawable(publicProfileActivity, 2131231146));
                                publicProfileActivity.y0().f9974x.setTextColor(ContextCompat.getColor(publicProfileActivity, 2131100824));
                                publicProfileActivity.y0().f9976z.setText(j5.c.c(publicProfileActivity.z0().i));
                            }
                            String str = v2Var.f11422a;
                            x4.w2 w2VarH = x4.u2.h(publicProfileActivity);
                            if (!kotlin.jvm.internal.l.a(str, w2VarH != null ? w2VarH.f11431a : null)) {
                                publicProfileActivity.y0().f9974x.setVisibility(0);
                            } else {
                                publicProfileActivity.y0().f9974x.setVisibility(8);
                            }
                        }
                        break;
                    } else if (!kotlin.jvm.internal.l.a(sVar2, j5.q.f6706a)) {
                        com.google.gson.internal.a.b();
                        break;
                    }
                }
                break;
        }
        return null;
    }
}
