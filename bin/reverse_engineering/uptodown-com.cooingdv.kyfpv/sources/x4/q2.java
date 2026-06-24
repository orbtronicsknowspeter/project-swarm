package x4;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class q2 implements Parcelable {
    public static Parcelable.Creator<q2> CREATOR = new i0.l(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f11344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11345b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f11346l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f11347m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11348n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11349o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f11350p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f11351q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11352r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public r f11353s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f11354t;

    public q2(Parcel parcel) {
        this.f11344a = -1L;
        this.f11346l = -1L;
        this.f11344a = parcel.readLong();
        String string = parcel.readString();
        string.getClass();
        this.f11345b = string;
        this.f11346l = parcel.readLong();
        this.f11347m = parcel.readString();
        this.f11348n = parcel.readInt();
        this.f11349o = parcel.readInt();
        this.f11350p = parcel.readInt();
        this.f11351q = parcel.readString();
        this.f11352r = parcel.readInt();
        if (Build.VERSION.SDK_INT >= 34) {
            this.f11353s = (r) parcel.readParcelable(r.class.getClassLoader(), r.class);
        } else {
            this.f11353s = (r) parcel.readParcelable(r.class.getClassLoader());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final x4.r a(android.content.Context r4) {
        /*
            r3 = this;
            r4.getClass()
            e1.c0 r0 = j5.g.D
            j5.g r4 = r0.l(r4)
            r4.b()
            x4.r r0 = r3.f11353s
            if (r0 == 0) goto L25
            r0.getClass()
            int r0 = r0.f11355a
            if (r0 < 0) goto L25
            x4.r r0 = r3.f11353s
            r0.getClass()
            int r0 = r0.f11355a
            x4.r r0 = r4.J(r0)
            r3.f11353s = r0
            goto L2f
        L25:
            java.lang.String r0 = r3.f11345b
            long r1 = r3.f11346l
            x4.r r0 = r4.L(r1, r0)
            r3.f11353s = r0
        L2f:
            r4.c()
            x4.r r4 = r3.f11353s
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.q2.a(android.content.Context):x4.r");
    }

    public final boolean b(q2 q2Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z9 = this.f11346l == q2Var.f11346l;
        r rVar = this.f11353s;
        Integer numValueOf = null;
        Integer numValueOf2 = (rVar == null || (arrayList2 = rVar.F) == null) ? null : Integer.valueOf(arrayList2.size());
        r rVar2 = q2Var.f11353s;
        if (rVar2 != null && (arrayList = rVar2.F) != null) {
            numValueOf = Integer.valueOf(arrayList.size());
        }
        boolean zA = kotlin.jvm.internal.l.a(numValueOf2, numValueOf);
        boolean zM0 = l7.u.m0(this.f11347m, q2Var.f11347m, true);
        if (z9 && zA && zM0) {
            if (this.f11353s != null && q2Var.f11353s != null) {
                ArrayList arrayList3 = new ArrayList();
                r rVar3 = this.f11353s;
                rVar3.getClass();
                arrayList3.addAll(rVar3.F);
                ArrayList arrayList4 = new ArrayList();
                r rVar4 = q2Var.f11353s;
                rVar4.getClass();
                arrayList4.addAll(rVar4.F);
                r rVar5 = this.f11353s;
                rVar5.getClass();
                Iterator it = rVar5.F.iterator();
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    j0 j0Var = (j0) next;
                    r rVar6 = q2Var.f11353s;
                    rVar6.getClass();
                    Iterator it2 = rVar6.F.iterator();
                    it2.getClass();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next2 = it2.next();
                            next2.getClass();
                            j0 j0Var2 = (j0) next2;
                            if (j0Var2.f11236l == j0Var.f11236l) {
                                arrayList3.remove(j0Var);
                                arrayList4.remove(j0Var2);
                                break;
                            }
                        }
                    }
                }
                if (!arrayList3.isEmpty() || !arrayList4.isEmpty()) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean c() {
        int i = this.f11349o;
        return i == 1 || i == 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return hashCode();
    }

    public final String toString() {
        long j = this.f11344a;
        long j6 = this.f11346l;
        String str = this.f11347m;
        int i = this.f11348n;
        int i6 = this.f11349o;
        int i10 = this.f11350p;
        String str2 = this.f11351q;
        int i11 = this.f11352r;
        r rVar = this.f11353s;
        String string = rVar != null ? rVar.toString() : null;
        StringBuilder sb = new StringBuilder("{id=");
        sb.append(j);
        sb.append(", packagename='");
        sb.append(this.f11345b);
        sb.append("', versionCode=");
        sb.append(j6);
        sb.append(", versionName='");
        sb.append(str);
        sb.append("', notified=");
        sb.append(i);
        sb.append(", ignoreVersion=");
        sb.append(i6);
        sb.append(", isPartialUpdate=");
        sb.append(i10);
        sb.append(", newFeatures='");
        sb.append(str2);
        sb.append("', installationAttempts=");
        sb.append(i11);
        sb.append(", download=");
        return a4.x.n(sb, string, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.f11344a);
        parcel.writeString(this.f11345b);
        parcel.writeLong(this.f11346l);
        parcel.writeString(this.f11347m);
        parcel.writeInt(this.f11348n);
        parcel.writeInt(this.f11349o);
        parcel.writeInt(this.f11350p);
        parcel.writeString(this.f11351q);
        parcel.writeInt(this.f11352r);
        parcel.writeParcelable(this.f11353s, i);
    }

    public q2(String str) {
        this.f11344a = -1L;
        this.f11346l = -1L;
        this.f11345b = str;
    }
}
