package c4;

import com.uptodown.R;
import com.uptodown.activities.UserAvatarActivity;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class qb implements r7.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UserAvatarActivity f2026b;

    public /* synthetic */ qb(UserAvatarActivity userAvatarActivity, int i) {
        this.f2025a = i;
        this.f2026b = userAvatarActivity;
    }

    @Override // r7.i
    public final Object emit(Object obj, t6.c cVar) {
        ArrayList arrayList;
        int i = this.f2025a;
        p6.x xVar = p6.x.f8464a;
        UserAvatarActivity userAvatarActivity = this.f2026b;
        switch (i) {
            case 0:
                j5.s sVar = (j5.s) obj;
                int i6 = 0;
                if (sVar instanceof j5.p) {
                    int i10 = UserAvatarActivity.V;
                    userAvatarActivity.y0().f9591m.setVisibility(0);
                    return xVar;
                }
                if (!(sVar instanceof j5.r)) {
                    if (sVar instanceof j5.q) {
                        return xVar;
                    }
                    com.google.gson.internal.a.b();
                    return null;
                }
                int i11 = UserAvatarActivity.V;
                userAvatarActivity.y0().f9591m.setVisibility(8);
                userAvatarActivity.y0().f9597s.setVisibility(0);
                tb tbVar = (tb) ((j5.r) sVar).f6708a;
                ArrayList arrayList2 = tbVar.f2137a;
                ArrayList arrayList3 = tbVar.f2138b;
                if (userAvatarActivity.Q == null) {
                    userAvatarActivity.Q = new e4.a1(arrayList2, userAvatarActivity.U, 0, userAvatarActivity.S, false, 16);
                    userAvatarActivity.y0().f9592n.setAdapter(userAvatarActivity.Q);
                    userAvatarActivity.y0().f9595q.setVisibility(0);
                }
                userAvatarActivity.y0().f9590l.setVisibility(8);
                if (arrayList3.isEmpty()) {
                    arrayList = arrayList3;
                    userAvatarActivity.y0().f9590l.setVisibility(8);
                    userAvatarActivity.y0().f9593o.setVisibility(8);
                } else {
                    userAvatarActivity.y0().f9590l.setVisibility(0);
                    x4.w2 w2VarH = x4.u2.h(userAvatarActivity);
                    boolean zD = w2VarH != null ? w2VarH.d() : false;
                    if (userAvatarActivity.R == null) {
                        arrayList = arrayList3;
                        userAvatarActivity.R = new e4.a1(arrayList, userAvatarActivity.U, 1, 0, zD, 8);
                        userAvatarActivity.y0().f9593o.setAdapter(userAvatarActivity.R);
                        userAvatarActivity.y0().f9593o.setVisibility(0);
                    } else {
                        arrayList = arrayList3;
                    }
                }
                int size = arrayList2.size();
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (i13 < size) {
                        Object obj2 = arrayList2.get(i13);
                        i13++;
                        if (((x4.i) obj2).f11216b != 1) {
                            i12++;
                        }
                    } else {
                        i12 = -1;
                    }
                }
                int size2 = arrayList.size();
                int i14 = 0;
                while (true) {
                    if (i14 < size2) {
                        Object obj3 = arrayList.get(i14);
                        i14++;
                        if (((x4.i) obj3).f11216b != 1) {
                            i6++;
                        }
                    } else {
                        i6 = -1;
                    }
                }
                if (i12 > -1) {
                    e4.a1 a1Var = userAvatarActivity.Q;
                    if (a1Var != null) {
                        a1Var.f = i12;
                    }
                    if (a1Var == null) {
                        return xVar;
                    }
                    a1Var.notifyItemChanged(i12);
                    return xVar;
                }
                if (i6 <= -1) {
                    return xVar;
                }
                e4.a1 a1Var2 = userAvatarActivity.R;
                if (a1Var2 != null) {
                    a1Var2.f = i6;
                }
                if (a1Var2 == null) {
                    return xVar;
                }
                a1Var2.notifyItemChanged(i6);
                return xVar;
            default:
                if (((Boolean) obj).booleanValue()) {
                    String string = userAvatarActivity.getString(R.string.avatar_activity_changed_success);
                    string.getClass();
                    userAvatarActivity.A(string);
                    userAvatarActivity.setResult(10);
                    userAvatarActivity.finish();
                }
                return xVar;
        }
    }
}
