package c4;

import androidx.core.content.ContextCompat;
import com.uptodown.R;
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
        p6.x xVar = p6.x.f8464a;
        j5.p pVar = j5.p.f6706a;
        PublicProfileActivity publicProfileActivity = this.f2019b;
        switch (i) {
            case 0:
                j5.s sVar = (j5.s) obj;
                if (!kotlin.jvm.internal.l.a(sVar, pVar)) {
                    if (sVar instanceof j5.r) {
                        x4.j2 j2Var = (x4.j2) ((j5.r) sVar).f6708a;
                        if (j2Var.f11246b == 1) {
                            int i6 = PublicProfileActivity.R;
                        } else if (j2Var.f11247c != 401) {
                            String string = publicProfileActivity.getString(R.string.error_generico);
                            string.getClass();
                            publicProfileActivity.A(string);
                        } else {
                            String string2 = publicProfileActivity.getString(R.string.login_required_like_title);
                            string2.getClass();
                            String string3 = publicProfileActivity.getString(R.string.login_required_like_msg);
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
                        x4.v2 v2Var = (x4.v2) ((j5.r) sVar2).f6708a;
                        if (v2Var.f11424b != 1) {
                            int i10 = v2Var.f11425c;
                            if (i10 == 401) {
                                String string4 = publicProfileActivity.getString(R.string.login_required_follow_title);
                                string4.getClass();
                                String string5 = publicProfileActivity.getString(R.string.login_required_follow_msg);
                                string5.getClass();
                                b2.t1.v(publicProfileActivity, string4, string5);
                            } else if (i10 != 409) {
                                String string6 = publicProfileActivity.getString(R.string.error_generico);
                                string6.getClass();
                                publicProfileActivity.A(string6);
                            } else {
                                String string7 = publicProfileActivity.getString(R.string.already_following);
                                string7.getClass();
                                publicProfileActivity.A(string7);
                            }
                        } else {
                            if (v2Var.f11426d == 1) {
                                int i11 = PublicProfileActivity.R;
                                publicProfileActivity.y0().f9975x.setText(publicProfileActivity.getString(R.string.unfollow));
                                publicProfileActivity.y0().f9975x.setBackground(ContextCompat.getDrawable(publicProfileActivity, R.drawable.ripple_stroke_blue_primary));
                                publicProfileActivity.y0().f9975x.setTextColor(ContextCompat.getColor(publicProfileActivity, R.color.blue_primary));
                                publicProfileActivity.y0().f9977z.setText(j5.c.c(publicProfileActivity.z0().i));
                            } else {
                                int i12 = PublicProfileActivity.R;
                                publicProfileActivity.y0().f9975x.setText(publicProfileActivity.getString(R.string.follow));
                                publicProfileActivity.y0().f9975x.setBackground(ContextCompat.getDrawable(publicProfileActivity, R.drawable.ripple_blue_primary_button));
                                publicProfileActivity.y0().f9975x.setTextColor(ContextCompat.getColor(publicProfileActivity, R.color.white));
                                publicProfileActivity.y0().f9977z.setText(j5.c.c(publicProfileActivity.z0().i));
                            }
                            String str = v2Var.f11423a;
                            x4.w2 w2VarH = x4.u2.h(publicProfileActivity);
                            if (!kotlin.jvm.internal.l.a(str, w2VarH != null ? w2VarH.f11432a : null)) {
                                publicProfileActivity.y0().f9975x.setVisibility(0);
                            } else {
                                publicProfileActivity.y0().f9975x.setVisibility(8);
                            }
                        }
                        break;
                    } else if (!kotlin.jvm.internal.l.a(sVar2, j5.q.f6707a)) {
                        com.google.gson.internal.a.b();
                        break;
                    }
                }
                break;
        }
        return null;
    }
}
