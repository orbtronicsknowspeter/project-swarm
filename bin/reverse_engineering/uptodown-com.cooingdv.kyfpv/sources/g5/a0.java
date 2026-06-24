package g5;

import android.content.Context;
import c4.j1;
import c4.k1;
import c4.sc;
import com.uptodown.UptodownApp;
import com.uptodown.tv.ui.fragment.TvMyAppsFragment;
import java.util.ArrayList;
import java.util.Iterator;
import x4.q2;
import x4.w1;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5292b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TvMyAppsFragment f5293l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(TvMyAppsFragment tvMyAppsFragment, t6.c cVar, int i) {
        super(2, cVar);
        this.f5291a = i;
        this.f5293l = tvMyAppsFragment;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f5291a) {
            case 0:
                return new a0(this.f5293l, cVar, 0);
            default:
                return new a0(this.f5293l, cVar, 1);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f5291a) {
        }
        return ((a0) create(a0Var, cVar)).invokeSuspend(p6.x.f8464a);
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int applicationEnabledSetting;
        q2 q2Var;
        int applicationEnabledSetting2;
        int i = this.f5291a;
        p6.x xVar = p6.x.f8464a;
        u6.a aVar = u6.a.f10763a;
        TvMyAppsFragment tvMyAppsFragment = this.f5293l;
        int i6 = 1;
        switch (i) {
            case 0:
                int i10 = this.f5292b;
                if (i10 == 0) {
                    p6.a.e(obj);
                    this.f5292b = 1;
                    v7.e eVar = o7.m0.f8289a;
                    Object objC = o7.c0.C(new a0(tvMyAppsFragment, null, i6), v7.d.f10885a, this);
                    if (objC != aVar) {
                        objC = xVar;
                    }
                    if (objC == aVar) {
                    }
                } else if (i10 != 1) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                } else {
                    p6.a.e(obj);
                }
                break;
            default:
                int i11 = this.f5292b;
                if (i11 == 0) {
                    p6.a.e(obj);
                    if (tvMyAppsFragment.getContext() != null) {
                        kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
                        boolean z9 = tvMyAppsFragment.f3435m;
                        x4.d dVar = x4.d.f11088a;
                        if (z9) {
                            Context contextRequireContext = tvMyAppsFragment.requireContext();
                            contextRequireContext.getClass();
                            ArrayList arrayListI = j5.a.i(contextRequireContext);
                            j5.g gVarL = j5.g.D.l(contextRequireContext);
                            gVarL.b();
                            ArrayList arrayList = new ArrayList();
                            Iterator it = arrayListI.iterator();
                            it.getClass();
                            while (it.hasNext()) {
                                Object next = it.next();
                                next.getClass();
                                x4.e eVar2 = (x4.e) next;
                                if (eVar2.b(contextRequireContext)) {
                                    if (eVar2.v == 1) {
                                        eVar2.f11128p = dVar;
                                    } else {
                                        String str = eVar2.f11124l;
                                        str.getClass();
                                        q2 q2VarY = gVarL.Y(str);
                                        if (q2VarY == null) {
                                            long j = eVar2.f11135x;
                                            long j6 = eVar2.A;
                                            long jCurrentTimeMillis = System.currentTimeMillis();
                                            if (j6 != j && jCurrentTimeMillis - j < 604800000) {
                                                eVar2.f11128p = x4.d.f11089b;
                                            }
                                        } else if (q2VarY.f11349o != 1) {
                                            eVar2.f11128p = dVar;
                                            String str2 = eVar2.f11124l;
                                            str2.getClass();
                                            try {
                                                applicationEnabledSetting2 = contextRequireContext.getPackageManager().getApplicationEnabledSetting(str2);
                                            } catch (Error e10) {
                                                e10.printStackTrace();
                                            } catch (Exception e11) {
                                                e11.printStackTrace();
                                            }
                                            if (applicationEnabledSetting2 != 2 && applicationEnabledSetting2 != 3 && applicationEnabledSetting2 != 4) {
                                                if (q2VarY.f11349o == 0) {
                                                    arrayList.add(eVar2);
                                                }
                                            }
                                        }
                                        if (q2VarY != null && q2VarY.f11348n == 0) {
                                            q2VarY.f11348n = 1;
                                            gVarL.p0(q2VarY);
                                        }
                                    }
                                }
                                ArrayList arrayList2 = UptodownApp.f3298k0;
                                if (arrayList2 != null) {
                                    Iterator it2 = arrayList2.iterator();
                                    it2.getClass();
                                    while (it2.hasNext()) {
                                        Object next2 = it2.next();
                                        next2.getClass();
                                        w1 w1Var = (w1) next2;
                                        if (kotlin.jvm.internal.l.a(w1Var.f11430b, eVar2.B)) {
                                            eVar2.D = w1Var;
                                        }
                                    }
                                }
                            }
                            xVar2.f7025a = arrayList;
                        } else {
                            Context contextRequireContext2 = tvMyAppsFragment.requireContext();
                            contextRequireContext2.getClass();
                            xVar2.f7025a = j5.a.i(contextRequireContext2);
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it3 = ((ArrayList) xVar2.f7025a).iterator();
                            it3.getClass();
                            while (it3.hasNext()) {
                                Object next3 = it3.next();
                                next3.getClass();
                                x4.e eVar3 = (x4.e) next3;
                                if (tvMyAppsFragment.getContext() != null) {
                                    if (l7.u.m0(tvMyAppsFragment.requireContext().getPackageName(), eVar3.f11124l, true)) {
                                        arrayList3.add(eVar3);
                                    } else {
                                        Context contextRequireContext3 = tvMyAppsFragment.requireContext();
                                        contextRequireContext3.getClass();
                                        if (eVar3.b(contextRequireContext3)) {
                                            Context contextRequireContext4 = tvMyAppsFragment.requireContext();
                                            contextRequireContext4.getClass();
                                            String str3 = eVar3.f11124l;
                                            str3.getClass();
                                            try {
                                                applicationEnabledSetting = contextRequireContext4.getPackageManager().getApplicationEnabledSetting(str3);
                                            } catch (Error e12) {
                                                e12.printStackTrace();
                                            } catch (Exception e13) {
                                                e13.printStackTrace();
                                            }
                                            if (applicationEnabledSetting != 2 && applicationEnabledSetting != 3 && applicationEnabledSetting != 4) {
                                                arrayList3.add(eVar3);
                                            }
                                        }
                                    }
                                }
                            }
                            xVar2.f7025a = arrayList3;
                        }
                        ArrayList arrayList4 = (ArrayList) xVar2.f7025a;
                        q6.q.j0(arrayList4, new androidx.constraintlayout.core.utils.a(4));
                        if (tvMyAppsFragment.getContext() != null) {
                            e1.c0 c0Var = j5.g.D;
                            Context contextRequireContext5 = tvMyAppsFragment.requireContext();
                            contextRequireContext5.getClass();
                            j5.g gVarL2 = c0Var.l(contextRequireContext5);
                            gVarL2.b();
                            ArrayList arrayListA0 = gVarL2.a0();
                            gVarL2.c();
                            Iterator it4 = arrayListA0.iterator();
                            it4.getClass();
                            while (it4.hasNext()) {
                                Object next4 = it4.next();
                                next4.getClass();
                                q2 q2Var2 = (q2) next4;
                                int size = arrayList4.size();
                                int i12 = 0;
                                while (i12 < size) {
                                    if (l7.u.m0(q2Var2.f11345b, ((x4.e) arrayList4.get(i12)).f11124l, true)) {
                                        q2Var = q2Var2;
                                        if (q2Var2.f11346l > ((x4.e) arrayList4.get(i12)).f11125m) {
                                            x4.e eVar4 = (x4.e) arrayList4.get(i12);
                                            eVar4.getClass();
                                            eVar4.f11128p = dVar;
                                        }
                                    } else {
                                        q2Var = q2Var2;
                                    }
                                    i12++;
                                    q2Var2 = q2Var;
                                }
                            }
                        }
                        q6.q.j0(arrayList4, new k1(new j1(2), 3));
                        if (tvMyAppsFragment.getContext() != null) {
                            String packageName = tvMyAppsFragment.requireContext().getPackageName();
                            int i13 = 0;
                            while (i13 < arrayList4.size() && (!l7.u.m0(packageName, ((x4.e) arrayList4.get(i13)).f11124l, true) || ((x4.e) arrayList4.get(i13)).f11128p != dVar)) {
                                i13++;
                            }
                            if (i13 < arrayList4.size()) {
                                Object objRemove = arrayList4.remove(i13);
                                objRemove.getClass();
                                arrayList4.add(0, (x4.e) objRemove);
                            }
                        }
                        v7.e eVar5 = o7.m0.f8289a;
                        p7.c cVar = t7.n.f10349a;
                        sc scVar = new sc(tvMyAppsFragment, xVar2, null, 13);
                        this.f5292b = 1;
                        if (o7.c0.C(scVar, cVar, this) == aVar) {
                        }
                    }
                } else if (i11 != 1) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                } else {
                    p6.a.e(obj);
                }
                break;
        }
        return aVar;
    }
}
