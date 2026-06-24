package com.google.android.gms.internal.measurement;

import androidx.core.app.NotificationCompat;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class k4 extends h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2684l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f2685m;

    public k4(f0.i iVar) {
        super("internal.logger");
        this.f2685m = iVar;
        this.f2651b.put("log", new z8(this, false, true));
        this.f2651b.put(NotificationCompat.GROUP_KEY_SILENT, new x5(NotificationCompat.GROUP_KEY_SILENT, 1));
        ((h) this.f2651b.get(NotificationCompat.GROUP_KEY_SILENT)).d("log", new z8(this, true, true));
        this.f2651b.put("unmonitored", new x5("unmonitored", 2));
        ((h) this.f2651b.get("unmonitored")).d("log", new z8(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.h
    public final n a(y2.s sVar, List list) {
        TreeMap treeMap;
        switch (this.f2684l) {
            case 0:
                b2.t1.S(this.f2650a, 3, list);
                String strF = ((t) sVar.f11756l).c(sVar, (n) list.get(0)).f();
                n nVar = (n) list.get(1);
                t tVar = (t) sVar.f11756l;
                long jC0 = (long) b2.t1.c0(tVar.c(sVar, nVar).g().doubleValue());
                n nVarC = tVar.c(sVar, (n) list.get(2));
                HashMap mapE0 = nVarC instanceof k ? b2.t1.e0((k) nVarC) : new HashMap();
                b5.m mVar = (b5.m) this.f2685m;
                mVar.getClass();
                HashMap map = new HashMap();
                for (String str : mapE0.keySet()) {
                    HashMap map2 = ((b) mVar.f1061b).f2510c;
                    map.put(str, b.b(map2.containsKey(str) ? map2.get(str) : null, str, mapE0.get(str)));
                }
                ((ArrayList) mVar.f1063m).add(new b(strF, jC0, map));
                break;
            case 1:
                b2.t1.S("getValue", 2, list);
                n nVarC2 = ((t) sVar.f11756l).c(sVar, (n) list.get(0));
                n nVarC3 = ((t) sVar.f11756l).c(sVar, (n) list.get(1));
                String strF2 = nVarC2.f();
                android.support.v4.media.g gVar = (android.support.v4.media.g) this.f2685m;
                Map map3 = (Map) ((e1.m1) gVar.f248l).f4105m.get((String) gVar.f247b);
                String str2 = (map3 == null || !map3.containsKey(strF2)) ? null : (String) map3.get(strF2);
                if (str2 != null) {
                }
                break;
            case 2:
                break;
            case 3:
                try {
                } catch (Exception unused) {
                    return n.f2717c;
                }
                break;
            default:
                b2.t1.S(this.f2650a, 3, list);
                ((t) sVar.f11756l).c(sVar, (n) list.get(0)).f();
                n nVar2 = (n) list.get(1);
                t tVar2 = (t) sVar.f11756l;
                n nVarC4 = tVar2.c(sVar, nVar2);
                if (nVarC4 instanceof m) {
                    n nVarC5 = tVar2.c(sVar, (n) list.get(2));
                    if (nVarC5 instanceof k) {
                        k kVar = (k) nVarC5;
                        HashMap map4 = kVar.f2678a;
                        if (map4.containsKey(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY)) {
                            String strF3 = kVar.c(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY).f();
                            int iB0 = map4.containsKey("priority") ? b2.t1.b0(kVar.c("priority").g().doubleValue()) : 1000;
                            t tVar3 = (t) this.f2685m;
                            m mVar2 = (m) nVarC4;
                            tVar3.getClass();
                            if ("create".equals(strF3)) {
                                treeMap = (TreeMap) tVar3.f2806b;
                            } else if (!"edit".equals(strF3)) {
                                androidx.privacysandbox.ads.adservices.customaudience.a.i("Unknown callback type: ".concat(String.valueOf(strF3)));
                            } else {
                                treeMap = (TreeMap) tVar3.f2805a;
                            }
                            if (treeMap.containsKey(Integer.valueOf(iB0))) {
                                iB0 = ((Integer) treeMap.lastKey()).intValue() + 1;
                            }
                            treeMap.put(Integer.valueOf(iB0), mVar2);
                        } else {
                            com.google.gson.internal.a.p("Undefined rule type");
                        }
                    } else {
                        com.google.gson.internal.a.p("Invalid callback params");
                    }
                } else {
                    com.google.gson.internal.a.p("Invalid callback type");
                }
                break;
        }
        return n.f2717c;
    }

    public k4(t tVar) {
        super("internal.registerCallback");
        this.f2685m = tVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(x5 x5Var, android.support.v4.media.g gVar) {
        super("getValue");
        this.f2685m = gVar;
    }

    public k4(e1.k1 k1Var) {
        super("internal.appMetadata");
        this.f2685m = k1Var;
    }

    public k4(b5.m mVar) {
        super("internal.eventLogger");
        this.f2685m = mVar;
    }
}
