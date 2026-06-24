package c4;

import com.uptodown.activities.SearchActivity;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class w9 extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchActivity f2275b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f2276l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w9(int i, SearchActivity searchActivity, String str, t6.c cVar) {
        super(2, cVar);
        this.f2274a = i;
        this.f2275b = searchActivity;
        this.f2276l = str;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f2274a) {
            case 0:
                return new w9(0, this.f2275b, this.f2276l, cVar);
            case 1:
                return new w9(1, this.f2275b, this.f2276l, cVar);
            default:
                return new w9(2, this.f2275b, this.f2276l, cVar);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f2274a) {
            case 0:
                w9 w9Var = (w9) create(a0Var, cVar);
                p6.x xVar = p6.x.f8463a;
                w9Var.invokeSuspend(xVar);
                return xVar;
            case 1:
                w9 w9Var2 = (w9) create(a0Var, cVar);
                p6.x xVar2 = p6.x.f8463a;
                w9Var2.invokeSuspend(xVar2);
                return xVar2;
            default:
                w9 w9Var3 = (w9) create(a0Var, cVar);
                p6.x xVar3 = p6.x.f8463a;
                w9Var3.invokeSuspend(xVar3);
                return xVar3;
        }
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i = this.f2274a;
        p6.x xVar = p6.x.f8463a;
        int i6 = 0;
        SearchActivity searchActivity = this.f2275b;
        String str = this.f2276l;
        switch (i) {
            case 0:
                p6.a.e(obj);
                int i10 = SearchActivity.Y;
                ca caVarA0 = searchActivity.A0();
                String strO0 = l7.u.o0(str, "/", "", false);
                e4.l0 l0Var = searchActivity.R;
                l0Var.getClass();
                caVarA0.a(searchActivity, l0Var.getItemCount(), strO0);
                break;
            case 1:
                p6.a.e(obj);
                int i11 = SearchActivity.Y;
                ca caVarA02 = searchActivity.A0();
                String strO02 = l7.u.o0(str, "/", "", false);
                e4.m0 m0Var = searchActivity.S;
                m0Var.getClass();
                caVarA02.a(searchActivity, m0Var.getItemCount(), strO02);
                break;
            default:
                p6.a.e(obj);
                e4.l0 l0Var2 = searchActivity.R;
                if (l0Var2 == null || l0Var2.f4602a.isEmpty() || str == null || str.length() == 0) {
                    e4.l0 l0Var3 = searchActivity.R;
                    if (l0Var3 != null) {
                        l0Var3.notifyDataSetChanged();
                    }
                } else {
                    e4.l0 l0Var4 = searchActivity.R;
                    l0Var4.getClass();
                    ArrayList arrayList = l0Var4.f4602a;
                    int size = arrayList.size();
                    while (true) {
                        if (i6 < size) {
                            obj2 = arrayList.get(i6);
                            i6++;
                            if (kotlin.jvm.internal.l.a(((x4.g) obj2).F, str)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    e4.l0 l0Var5 = searchActivity.R;
                    l0Var5.getClass();
                    int iU0 = q6.l.u0(l0Var5.f4602a, (x4.g) obj2);
                    e4.l0 l0Var6 = searchActivity.R;
                    if (iU0 > -1) {
                        l0Var6.getClass();
                        l0Var6.notifyItemChanged(iU0);
                    } else if (l0Var6 != null) {
                        l0Var6.notifyDataSetChanged();
                    }
                }
                break;
        }
        return xVar;
    }
}
