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
    public long f11343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11344b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f11345l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f11346m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11347n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11348o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f11349p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f11350q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11351r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public r f11352s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f11353t;

    public q2(Parcel parcel) {
        this.f11343a = -1L;
        this.f11345l = -1L;
        this.f11343a = parcel.readLong();
        String string = parcel.readString();
        string.getClass();
        this.f11344b = string;
        this.f11345l = parcel.readLong();
        this.f11346m = parcel.readString();
        this.f11347n = parcel.readInt();
        this.f11348o = parcel.readInt();
        this.f11349p = parcel.readInt();
        this.f11350q = parcel.readString();
        this.f11351r = parcel.readInt();
        if (Build.VERSION.SDK_INT >= 34) {
            this.f11352s = (r) parcel.readParcelable(r.class.getClassLoader(), r.class);
        } else {
            this.f11352s = (r) parcel.readParcelable(r.class.getClassLoader());
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
            x4.r r0 = r3.f11352s
            if (r0 == 0) goto L25
            r0.getClass()
            int r0 = r0.f11354a
            if (r0 < 0) goto L25
            x4.r r0 = r3.f11352s
            r0.getClass()
            int r0 = r0.f11354a
            x4.r r0 = r4.J(r0)
            r3.f11352s = r0
            goto L2f
        L25:
            java.lang.String r0 = r3.f11344b
            long r1 = r3.f11345l
            x4.r r0 = r4.L(r1, r0)
            r3.f11352s = r0
        L2f:
            r4.c()
            x4.r r4 = r3.f11352s
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.q2.a(android.content.Context):x4.r");
    }

    public final boolean b(q2 q2Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z9 = this.f11345l == q2Var.f11345l;
        r rVar = this.f11352s;
        Integer numValueOf = null;
        Integer numValueOf2 = (rVar == null || (arrayList2 = rVar.F) == null) ? null : Integer.valueOf(arrayList2.size());
        r rVar2 = q2Var.f11352s;
        if (rVar2 != null && (arrayList = rVar2.F) != null) {
            numValueOf = Integer.valueOf(arrayList.size());
        }
        boolean zA = kotlin.jvm.internal.l.a(numValueOf2, numValueOf);
        boolean zM0 = l7.u.m0(this.f11346m, q2Var.f11346m, true);
        if (z9 && zA && zM0) {
            if (this.f11352s != null && q2Var.f11352s != null) {
                ArrayList arrayList3 = new ArrayList();
                r rVar3 = this.f11352s;
                rVar3.getClass();
                arrayList3.addAll(rVar3.F);
                ArrayList arrayList4 = new ArrayList();
                r rVar4 = q2Var.f11352s;
                rVar4.getClass();
                arrayList4.addAll(rVar4.F);
                r rVar5 = this.f11352s;
                rVar5.getClass();
                Iterator it = rVar5.F.iterator();
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    j0 j0Var = (j0) next;
                    r rVar6 = q2Var.f11352s;
                    rVar6.getClass();
                    Iterator it2 = rVar6.F.iterator();
                    it2.getClass();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next2 = it2.next();
                            next2.getClass();
                            j0 j0Var2 = (j0) next2;
                            if (j0Var2.f11235l == j0Var.f11235l) {
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
        int i = this.f11348o;
        return i == 1 || i == 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return hashCode();
    }

    public final String toString() {
        long j = this.f11343a;
        long j6 = this.f11345l;
        String str = this.f11346m;
        int i = this.f11347n;
        int i6 = this.f11348o;
        int i10 = this.f11349p;
        String str2 = this.f11350q;
        int i11 = this.f11351r;
        r rVar = this.f11352s;
        String string = rVar != null ? rVar.toString() : null;
        StringBuilder sb = new StringBuilder("{id=");
        sb.append(j);
        sb.append(", packagename='");
        sb.append(this.f11344b);
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
        parcel.writeLong(this.f11343a);
        parcel.writeString(this.f11344b);
        parcel.writeLong(this.f11345l);
        parcel.writeString(this.f11346m);
        parcel.writeInt(this.f11347n);
        parcel.writeInt(this.f11348o);
        parcel.writeInt(this.f11349p);
        parcel.writeString(this.f11350q);
        parcel.writeInt(this.f11351r);
        parcel.writeParcelable(this.f11352s, i);
    }

    public q2(String str) {
        this.f11343a = -1L;
        this.f11345l = -1L;
        this.f11344b = str;
    }
}
