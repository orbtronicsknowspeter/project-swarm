package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f2705l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f2706m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y2.s f2707n;

    public m(String str, ArrayList arrayList, List list, y2.s sVar) {
        super(str);
        this.f2705l = new ArrayList();
        this.f2707n = sVar;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                this.f2705l.add(((n) obj).f());
            }
        }
        this.f2706m = new ArrayList(list);
    }

    @Override // com.google.android.gms.internal.measurement.h
    public final n a(y2.s sVar, List list) {
        r rVar;
        y2.s sVarL = this.f2707n.L();
        t tVar = (t) sVarL.f11757l;
        int i = 0;
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f2705l;
            int size = arrayList.size();
            rVar = n.f2717c;
            if (i6 >= size) {
                break;
            }
            if (i6 < list.size()) {
                sVarL.O((String) arrayList.get(i6), ((t) sVar.f11757l).c(sVar, (n) list.get(i6)));
            } else {
                sVarL.O((String) arrayList.get(i6), rVar);
            }
            i6++;
        }
        ArrayList arrayList2 = this.f2706m;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj = arrayList2.get(i);
            i++;
            n nVar = (n) obj;
            n nVarC = tVar.c(sVarL, nVar);
            if (nVarC instanceof o) {
                nVarC = tVar.c(sVarL, nVar);
            }
            if (nVarC instanceof f) {
                return ((f) nVarC).f2567a;
            }
        }
        return rVar;
    }

    @Override // com.google.android.gms.internal.measurement.h, com.google.android.gms.internal.measurement.n
    public final n l() {
        return new m(this);
    }

    public m(m mVar) {
        super(mVar.f2650a);
        ArrayList arrayList = new ArrayList(mVar.f2705l.size());
        this.f2705l = arrayList;
        arrayList.addAll(mVar.f2705l);
        ArrayList arrayList2 = new ArrayList(mVar.f2706m.size());
        this.f2706m = arrayList2;
        arrayList2.addAll(mVar.f2706m);
        this.f2707n = mVar.f2707n;
    }
}
