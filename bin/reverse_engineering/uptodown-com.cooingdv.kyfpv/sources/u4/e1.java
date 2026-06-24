package u4;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e1 implements r7.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1 f10469a;

    public e1(f1 f1Var) {
        this.f10469a = f1Var;
    }

    @Override // r7.i
    public final Object emit(Object obj, t6.c cVar) {
        j5.s sVar = (j5.s) obj;
        boolean z9 = sVar instanceof j5.p;
        f1 f1Var = this.f10469a;
        if (z9) {
            if (f1Var.f10490l == null) {
                f1Var.a().f9932o.setVisibility(0);
            }
            if (f1Var.a().f9937t.isRefreshing()) {
                f1Var.f10490l = null;
                f1Var.a().f9937t.setRefreshing(false);
            }
        } else if (sVar instanceof j5.r) {
            f1Var.b().g = false;
            if (f1Var.f10490l == null) {
                f1Var.f10490l = new e4.c((ArrayList) ((j5.r) sVar).f6708a, f1Var.f10492n);
                f1Var.a().f9936s.setAdapter(f1Var.f10490l);
            } else {
                Iterator it = ((ArrayList) ((j5.r) sVar).f6708a).iterator();
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    e4.c cVar2 = f1Var.f10490l;
                    cVar2.getClass();
                    cVar2.f4497a.add((x4.d1) next);
                    cVar2.notifyItemInserted(cVar2.getItemCount());
                }
            }
            e4.c cVar3 = f1Var.f10490l;
            if (cVar3 != null) {
                cVar3.a(false);
            }
            e4.c cVar4 = f1Var.f10490l;
            ArrayList arrayList = cVar4 != null ? cVar4.f4497a : null;
            if (arrayList == null || arrayList.isEmpty()) {
                f1Var.a().f9931n.setVisibility(0);
                f1Var.a().f9940x.setVisibility(0);
            } else {
                f1Var.a().f9936s.setVisibility(0);
                f1Var.a().f9931n.setVisibility(8);
                f1Var.a().f9940x.setVisibility(8);
            }
            f1Var.a().f9930m.setVisibility(8);
            f1Var.a().f9932o.setVisibility(8);
        } else if (!(sVar instanceof j5.q)) {
            com.google.gson.internal.a.b();
            return null;
        }
        return p6.x.f8464a;
    }
}
