package c4;

import androidx.lifecycle.ViewModel;
import com.uptodown.UptodownApp;
import com.uptodown.activities.FreeUpSpaceActivity;
import com.uptodown.activities.MyApps;
import com.uptodown.activities.RollbackActivity;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class l1 extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1814b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ViewModel f1815l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k0 f1816m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(boolean z9, ViewModel viewModel, k0 k0Var, t6.c cVar, int i) {
        super(2, cVar);
        this.f1813a = i;
        this.f1814b = z9;
        this.f1815l = viewModel;
        this.f1816m = k0Var;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f1813a) {
            case 0:
                return new l1(this.f1814b, (m1) this.f1815l, (FreeUpSpaceActivity) this.f1816m, cVar, 0);
            case 1:
                return new l1(this.f1814b, (y4) this.f1815l, (MyApps) this.f1816m, cVar, 1);
            default:
                return new l1(this.f1814b, (l9) this.f1815l, (RollbackActivity) this.f1816m, cVar, 2);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f1813a) {
            case 0:
                l1 l1Var = (l1) create(a0Var, cVar);
                p6.x xVar = p6.x.f8464a;
                l1Var.invokeSuspend(xVar);
                return xVar;
            case 1:
                l1 l1Var2 = (l1) create(a0Var, cVar);
                p6.x xVar2 = p6.x.f8464a;
                l1Var2.invokeSuspend(xVar2);
                return xVar2;
            default:
                l1 l1Var3 = (l1) create(a0Var, cVar);
                p6.x xVar3 = p6.x.f8464a;
                l1Var3.invokeSuspend(xVar3);
                return xVar3;
        }
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        int applicationEnabledSetting;
        int applicationEnabledSetting2;
        int applicationEnabledSetting3;
        switch (this.f1813a) {
            case 0:
                FreeUpSpaceActivity freeUpSpaceActivity = (FreeUpSpaceActivity) this.f1816m;
                r7.o0 o0Var = ((m1) this.f1815l).f1851a;
                p6.a.e(obj);
                if (this.f1814b) {
                    o0Var.getClass();
                    o0Var.g(null, j5.p.f6706a);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = j5.a.i(freeUpSpaceActivity).iterator();
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    x4.e eVar = (x4.e) next;
                    String str = eVar.f11124l;
                    str.getClass();
                    try {
                        applicationEnabledSetting = freeUpSpaceActivity.getPackageManager().getApplicationEnabledSetting(str);
                    } catch (Error e10) {
                        e10.printStackTrace();
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                    if (applicationEnabledSetting != 2 && applicationEnabledSetting != 3 && applicationEnabledSetting != 4) {
                        if (!eVar.d() && !eVar.c()) {
                            arrayList.add(eVar);
                        }
                    }
                }
                q6.q.j0(arrayList, new k1(new j1(0), 0));
                j5.r rVar = new j5.r(new i1(arrayList));
                o0Var.getClass();
                o0Var.g(null, rVar);
                break;
            case 1:
                y4 y4Var = (y4) this.f1815l;
                r7.o0 o0Var2 = y4Var.f2341a;
                MyApps myApps = (MyApps) this.f1816m;
                p6.a.e(obj);
                if (this.f1814b) {
                    o0Var2.getClass();
                    o0Var2.g(null, j5.p.f6706a);
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayListI = j5.a.i(myApps);
                boolean zP = com.google.android.gms.internal.measurement.z3.p(myApps, "show_system_apps", false);
                boolean zP2 = com.google.android.gms.internal.measurement.z3.p(myApps, "show_system_services", false);
                Iterator it2 = arrayListI.iterator();
                it2.getClass();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    next2.getClass();
                    x4.e eVar2 = (x4.e) next2;
                    String str2 = eVar2.f11124l;
                    str2.getClass();
                    try {
                        applicationEnabledSetting2 = myApps.getPackageManager().getApplicationEnabledSetting(str2);
                    } catch (Error e12) {
                        e12.printStackTrace();
                    } catch (Exception e13) {
                        e13.printStackTrace();
                    }
                    if (applicationEnabledSetting2 == 2 || applicationEnabledSetting2 == 3 || applicationEnabledSetting2 == 4) {
                        arrayList4.add(eVar2);
                    } else if (eVar2.d()) {
                        if (zP2) {
                            arrayList5.add(eVar2);
                        }
                    } else if (!eVar2.c()) {
                        arrayList2.add(eVar2);
                    } else if (zP) {
                        arrayList3.add(eVar2);
                    }
                    ArrayList arrayList7 = UptodownApp.f3298k0;
                    if (arrayList7 != null) {
                        Iterator it3 = arrayList7.iterator();
                        it3.getClass();
                        while (it3.hasNext()) {
                            Object next3 = it3.next();
                            next3.getClass();
                            x4.w1 w1Var = (x4.w1) next3;
                            Iterator it4 = it3;
                            if (kotlin.jvm.internal.l.a(w1Var.f11430b, eVar2.B)) {
                                eVar2.D = w1Var;
                                arrayList6.add(eVar2);
                            }
                            it3 = it4;
                        }
                    }
                    break;
                }
                int iIntValue = ((Number) y4Var.f2345e.getValue()).intValue();
                if (iIntValue == 0) {
                    com.google.android.gms.internal.measurement.i5.J(arrayList2, myApps);
                    com.google.android.gms.internal.measurement.i5.J(arrayList3, myApps);
                    com.google.android.gms.internal.measurement.i5.J(arrayList5, myApps);
                    com.google.android.gms.internal.measurement.i5.J(arrayList4, myApps);
                } else if (iIntValue == 1) {
                    com.google.android.gms.internal.measurement.i5.I(arrayList2, myApps);
                    com.google.android.gms.internal.measurement.i5.I(arrayList3, myApps);
                    com.google.android.gms.internal.measurement.i5.I(arrayList5, myApps);
                    com.google.android.gms.internal.measurement.i5.I(arrayList4, myApps);
                } else if (iIntValue == 2) {
                    com.google.android.gms.internal.measurement.i5.K(arrayList2, myApps);
                    com.google.android.gms.internal.measurement.i5.K(arrayList3, myApps);
                    com.google.android.gms.internal.measurement.i5.K(arrayList5, myApps);
                    com.google.android.gms.internal.measurement.i5.K(arrayList4, myApps);
                }
                String str3 = y4Var.f2344d;
                if (str3 == null || str3.length() == 0) {
                    j5.g gVarL = j5.g.D.l(myApps);
                    gVarL.b();
                    ArrayList arrayList8 = new ArrayList();
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        Object obj2 = arrayList2.get(i);
                        i++;
                        x4.e eVar3 = (x4.e) obj2;
                        if (eVar3.f11128p == x4.d.f11088a) {
                            String str4 = eVar3.f11124l;
                            str4.getClass();
                            x4.q2 q2VarY = gVarL.Y(str4);
                            if (q2VarY != null) {
                                arrayList8.add(new e4.v0(eVar3, q2VarY));
                            }
                        }
                    }
                    gVarL.c();
                    q6.r.m0(arrayList2, new androidx.room.b(arrayList8, 13));
                    j5.r rVar2 = new j5.r(new x4(arrayList8, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6));
                    o0Var2.getClass();
                    o0Var2.g(null, rVar2);
                } else {
                    String str5 = y4Var.f2344d;
                    str5.getClass();
                    ArrayList arrayListS = com.google.android.gms.internal.measurement.i5.s(str5, arrayList2);
                    String str6 = y4Var.f2344d;
                    str6.getClass();
                    ArrayList arrayListS2 = com.google.android.gms.internal.measurement.i5.s(str6, arrayList3);
                    String str7 = y4Var.f2344d;
                    str7.getClass();
                    ArrayList arrayListS3 = com.google.android.gms.internal.measurement.i5.s(str7, arrayList4);
                    String str8 = y4Var.f2344d;
                    str8.getClass();
                    j5.r rVar3 = new j5.r(new x4(new ArrayList(), arrayListS, arrayListS2, arrayListS3, com.google.android.gms.internal.measurement.i5.s(str8, arrayList5), arrayList6));
                    o0Var2.getClass();
                    o0Var2.g(null, rVar3);
                }
                break;
            default:
                r7.o0 o0Var3 = ((l9) this.f1815l).f1834a;
                p6.a.e(obj);
                if (this.f1814b) {
                    o0Var3.getClass();
                    o0Var3.g(null, j5.p.f6706a);
                }
                RollbackActivity rollbackActivity = (RollbackActivity) this.f1816m;
                ArrayList arrayListI2 = j5.a.i(rollbackActivity);
                ArrayList arrayList9 = new ArrayList();
                int size2 = arrayListI2.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    if (!l7.u.m0(rollbackActivity.getPackageName(), ((x4.e) arrayListI2.get(i6)).f11124l, true)) {
                        String str9 = ((x4.e) arrayListI2.get(i6)).f11124l;
                        str9.getClass();
                        try {
                            applicationEnabledSetting3 = rollbackActivity.getPackageManager().getApplicationEnabledSetting(str9);
                        } catch (Error e14) {
                            e14.printStackTrace();
                        } catch (Exception e15) {
                            e15.printStackTrace();
                        }
                        if (applicationEnabledSetting3 != 2 && applicationEnabledSetting3 != 3 && applicationEnabledSetting3 != 4) {
                            if (!((x4.e) arrayListI2.get(i6)).c() && ((x4.e) arrayListI2.get(i6)).G == 1) {
                                arrayList9.add(arrayListI2.get(i6));
                            }
                        }
                    }
                }
                if (arrayList9.size() > 1) {
                    q6.q.j0(arrayList9, new n5(4));
                }
                j5.r rVar4 = new j5.r(new k9(arrayList9));
                o0Var3.getClass();
                o0Var3.g(null, rVar4);
                break;
        }
        return p6.x.f8464a;
    }
}
