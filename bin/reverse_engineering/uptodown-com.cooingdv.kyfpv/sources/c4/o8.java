package c4;

import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.RepliesActivity;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class o8 implements r7.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RepliesActivity f1959b;

    public /* synthetic */ o8(RepliesActivity repliesActivity, int i) {
        this.f1958a = i;
        this.f1959b = repliesActivity;
    }

    @Override // r7.i
    public final Object emit(Object obj, t6.c cVar) {
        int i;
        int i6 = this.f1958a;
        p6.x xVar = p6.x.f8464a;
        j5.p pVar = j5.p.f6706a;
        RepliesActivity repliesActivity = this.f1959b;
        switch (i6) {
            case 0:
                j5.s sVar = (j5.s) obj;
                if (!kotlin.jvm.internal.l.a(sVar, pVar)) {
                    if (sVar instanceof j5.r) {
                        x4.j2 j2Var = (x4.j2) ((j5.r) sVar).f6708a;
                        if (j2Var.f11246b == 1) {
                            repliesActivity.y0().f10031s.f10057x.setText(String.valueOf(j2Var.f11245a.f11268s));
                        } else if (j2Var.f11247c != 401) {
                            String string = repliesActivity.getString(R.string.error_generico);
                            string.getClass();
                            repliesActivity.A(string);
                        } else {
                            String string2 = repliesActivity.getString(R.string.login_required_like_title);
                            string2.getClass();
                            String string3 = repliesActivity.getString(R.string.login_required_like_msg);
                            string3.getClass();
                            b2.t1.v(repliesActivity, string2, string3);
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
                if (!kotlin.jvm.internal.l.a(sVar2, pVar)) {
                    if (sVar2 instanceof j5.r) {
                        x4.c2 c2Var = (x4.c2) ((j5.r) sVar2).f6708a;
                        if (c2Var.f11082b == 1) {
                            e4.h0 h0Var = repliesActivity.Q;
                            if (h0Var != null) {
                                h0Var.b(c2Var.f11081a);
                            }
                        } else if (c2Var.f11083c != 401) {
                            String string4 = repliesActivity.getString(R.string.error_generico);
                            string4.getClass();
                            repliesActivity.A(string4);
                        } else {
                            String string5 = repliesActivity.getString(R.string.login_required_like_title);
                            string5.getClass();
                            String string6 = repliesActivity.getString(R.string.login_required_like_msg);
                            string6.getClass();
                            b2.t1.v(repliesActivity, string5, string6);
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
                if (!kotlin.jvm.internal.l.a(sVar3, pVar)) {
                    if (sVar3 instanceof j5.r) {
                        s8 s8Var = (s8) ((j5.r) sVar3).f6708a;
                        int i10 = s8Var.f2085a;
                        String str = s8Var.f2089e;
                        if (i10 == 1) {
                            x4.w2 w2VarH = x4.u2.h(repliesActivity);
                            if (w2VarH != null && w2VarH.f11434l != null) {
                                float f = UptodownApp.I;
                            }
                            repliesActivity.y0().f10023b.setText("");
                            String string7 = repliesActivity.getString(R.string.review_sended);
                            string7.getClass();
                            repliesActivity.A(string7);
                            break;
                        } else {
                            int i11 = s8Var.f2086b;
                            if (i11 == 401) {
                                int i12 = RepliesActivity.S;
                                x4.u2.b(repliesActivity);
                                repliesActivity.B0();
                                break;
                            } else if (i11 == 403) {
                                String string8 = repliesActivity.getString(R.string.email_validation_msg);
                                string8.getClass();
                                repliesActivity.A(string8);
                                break;
                            } else if (str != null && str.length() != 0) {
                                repliesActivity.A(str);
                                break;
                            }
                        }
                    } else if (!(sVar3 instanceof j5.q)) {
                        com.google.gson.internal.a.b();
                        break;
                    }
                }
                break;
            default:
                j5.s sVar4 = (j5.s) obj;
                if (!kotlin.jvm.internal.l.a(sVar4, pVar)) {
                    if (sVar4 instanceof j5.r) {
                        x4.v2 v2Var = (x4.v2) ((j5.r) sVar4).f6708a;
                        int i13 = v2Var.f11424b;
                        int i14 = v2Var.f11426d;
                        if (i13 != 1) {
                            int i15 = v2Var.f11425c;
                            if (i15 == 401) {
                                String string9 = repliesActivity.getString(R.string.login_required_follow_title);
                                string9.getClass();
                                String string10 = repliesActivity.getString(R.string.login_required_follow_msg);
                                string10.getClass();
                                b2.t1.v(repliesActivity, string9, string10);
                            } else if (i15 != 409) {
                                String string11 = repliesActivity.getString(R.string.error_generico);
                                string11.getClass();
                                repliesActivity.A(string11);
                            } else {
                                String string12 = repliesActivity.getString(R.string.already_following);
                                string12.getClass();
                                repliesActivity.A(string12);
                            }
                        } else {
                            String str2 = v2Var.f11423a;
                            e4.h0 h0Var2 = repliesActivity.Q;
                            if (h0Var2 != null) {
                                Iterator it = h0Var2.f4550a.iterator();
                                i = 0;
                                while (it.hasNext()) {
                                    int i16 = i + 1;
                                    if (!kotlin.jvm.internal.l.a(((x4.d2) it.next()).f11110l, str2)) {
                                        i = i16;
                                    }
                                }
                                i = -1;
                            } else {
                                i = -1;
                            }
                            if (i != -1) {
                                e4.h0 h0Var3 = repliesActivity.Q;
                                x4.d2 d2Var = h0Var3 != null ? (x4.d2) h0Var3.f4550a.get(i) : null;
                                if (d2Var != null) {
                                    d2Var.f11119u = i14;
                                    e4.h0 h0Var4 = repliesActivity.Q;
                                    if (h0Var4 != null) {
                                        h0Var4.b(d2Var);
                                    }
                                }
                            } else if (repliesActivity.z0().f2220m.getValue() != null) {
                                x4.k2 k2Var = (x4.k2) repliesActivity.z0().f2220m.getValue();
                                if (k2Var != null) {
                                    k2Var.f11272x = i14;
                                }
                                Object value = repliesActivity.z0().f2220m.getValue();
                                value.getClass();
                                repliesActivity.D0((x4.k2) value);
                            }
                            if (i14 != 1) {
                                String string13 = repliesActivity.getString(R.string.unfollow_succesfully);
                                string13.getClass();
                                repliesActivity.A(string13);
                            } else {
                                String string14 = repliesActivity.getString(R.string.follow_succesfully);
                                string14.getClass();
                                repliesActivity.A(string14);
                            }
                        }
                        break;
                    } else if (!kotlin.jvm.internal.l.a(sVar4, j5.q.f6707a)) {
                        com.google.gson.internal.a.b();
                        break;
                    }
                }
                break;
        }
        return null;
    }
}
