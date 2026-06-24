package c4;

import com.uptodown.R;
import com.uptodown.activities.UserActivity;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class kb implements r7.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UserActivity f1801b;

    public /* synthetic */ kb(UserActivity userActivity, int i) {
        this.f1800a = i;
        this.f1801b = userActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(j5.s r7, t6.c r8) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.kb.a(j5.s, t6.c):java.lang.Object");
    }

    @Override // r7.i
    public final Object emit(Object obj, t6.c cVar) {
        int i = this.f1800a;
        p6.x xVar = p6.x.f8464a;
        j5.q qVar = j5.q.f6707a;
        j5.p pVar = j5.p.f6706a;
        UserActivity userActivity = this.f1801b;
        switch (i) {
            case 0:
                break;
            case 1:
                j5.s sVar = (j5.s) obj;
                if (!kotlin.jvm.internal.l.a(sVar, pVar)) {
                    if (!(sVar instanceof j5.r)) {
                        if (!kotlin.jvm.internal.l.a(sVar, qVar)) {
                            com.google.gson.internal.a.b();
                            break;
                        }
                    } else {
                        j5.c.e(userActivity, (String) ((j5.r) sVar).f6708a, userActivity.getString(R.string.uptodown_turbo));
                        break;
                    }
                }
                break;
            default:
                j5.s sVar2 = (j5.s) obj;
                if (!kotlin.jvm.internal.l.a(sVar2, pVar)) {
                    if (!(sVar2 instanceof j5.r)) {
                        if (!kotlin.jvm.internal.l.a(sVar2, qVar)) {
                            com.google.gson.internal.a.b();
                            break;
                        }
                    } else {
                        userActivity.Q = (String) ((j5.r) sVar2).f6708a;
                        userActivity.z0().v.setVisibility(0);
                        userActivity.z0().v.setOnClickListener(new fb(userActivity, 18));
                        break;
                    }
                }
                break;
        }
        return null;
    }
}
