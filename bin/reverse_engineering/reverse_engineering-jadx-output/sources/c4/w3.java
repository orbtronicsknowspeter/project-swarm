package c4;

import com.uptodown.activities.MoreInfo;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class w3 extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MoreInfo f2260b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w3(MoreInfo moreInfo, t6.c cVar, int i) {
        super(2, cVar);
        this.f2259a = i;
        this.f2260b = moreInfo;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f2259a) {
            case 0:
                return new w3(this.f2260b, cVar, 0);
            default:
                return new w3(this.f2260b, cVar, 1);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f2259a) {
            case 0:
                w3 w3Var = (w3) create(a0Var, cVar);
                p6.x xVar = p6.x.f8463a;
                w3Var.invokeSuspend(xVar);
                return xVar;
            default:
                w3 w3Var2 = (w3) create(a0Var, cVar);
                p6.x xVar2 = p6.x.f8463a;
                w3Var2.invokeSuspend(xVar2);
                return xVar2;
        }
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f2259a;
        p6.x xVar = p6.x.f8463a;
        MoreInfo moreInfo = this.f2260b;
        switch (i) {
            case 0:
                p6.a.e(obj);
                ArrayList arrayList = moreInfo.R;
                if (arrayList != null && !arrayList.isEmpty()) {
                    moreInfo.B0().f10199u.setVisibility(0);
                    moreInfo.B0().O.setTypeface(f4.c.f4882w);
                    moreInfo.B0().P.setTypeface(f4.c.f4883x);
                    ArrayList arrayList2 = moreInfo.R;
                    arrayList2.getClass();
                    Iterator it = arrayList2.iterator();
                    it.getClass();
                    String strK = null;
                    while (it.hasNext()) {
                        Object next = it.next();
                        next.getClass();
                        String str = (String) next;
                        strK = strK == null ? str : a4.x.k(strK, ", ", str);
                    }
                    moreInfo.B0().P.setText(strK);
                }
                break;
            default:
                p6.a.e(obj);
                int i6 = MoreInfo.V;
                moreInfo.B0().f10197t.setVisibility(0);
                break;
        }
        return xVar;
    }
}
