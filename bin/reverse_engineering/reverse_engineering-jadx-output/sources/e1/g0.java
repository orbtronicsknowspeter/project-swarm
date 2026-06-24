package e1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends com.google.android.gms.internal.measurement.x implements i0 {
    public g0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 0);
    }

    @Override // e1.i0
    public final void A(x4 x4Var, c5 c5Var) {
        Parcel parcelG = G();
        com.google.android.gms.internal.measurement.z.b(parcelG, x4Var);
        com.google.android.gms.internal.measurement.z.b(parcelG, c5Var);
        H(parcelG, 2);
    }

    @Override // e1.i0
    public final void B(c5 c5Var) {
        Parcel parcelG = G();
        com.google.android.gms.internal.measurement.z.b(parcelG, c5Var);
        H(parcelG, 18);
    }

    @Override // e1.i0
    public final void C(c5 c5Var) {
        Parcel parcelG = G();
        com.google.android.gms.internal.measurement.z.b(parcelG, c5Var);
        H(parcelG, 27);
    }

    @Override // e1.i0
    public final void D(Bundle bundle, c5 c5Var) {
        Parcel parcelG = G();
        com.google.android.gms.internal.measurement.z.b(parcelG, bundle);
        com.google.android.gms.internal.measurement.z.b(parcelG, c5Var);
        H(parcelG, 19);
    }

    @Override // e1.i0
    public final List E(String str, String str2, boolean z9, c5 c5Var) {
        Parcel parcelG = G();
        parcelG.writeString(str);
        parcelG.writeString(str2);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.z.f2922a;
        parcelG.writeInt(z9 ? 1 : 0);
        com.google.android.gms.internal.measurement.z.b(parcelG, c5Var);
        Parcel parcelD = d(parcelG, 14);
        ArrayList arrayListCreateTypedArrayList = parcelD.createTypedArrayList(x4.CREATOR);
        parcelD.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // e1.i0
    public final i f(c5 c5Var) {
        Parcel parcelG = G();
        com.google.android.gms.internal.measurement.z.b(parcelG, c5Var);
        Parcel parcelD = d(parcelG, 21);
        i iVar = (i) com.google.android.gms.internal.measurement.z.a(parcelD, i.CREATOR);
        parcelD.recycle();
        return iVar;
    }

    @Override // e1.i0
    public final void g(c5 c5Var, n4 n4Var, m0 m0Var) {
        Parcel parcelG = G();
        com.google.android.gms.internal.measurement.z.b(parcelG, c5Var);
        com.google.android.gms.internal.measurement.z.b(parcelG, n4Var);
        com.google.android.gms.internal.measurement.z.c(parcelG, m0Var);
        H(parcelG, 29);
    }

    @Override // e1.i0
    public final List h(String str, String str2, String str3, boolean z9) {
        Parcel parcelG = G();
        parcelG.writeString(null);
        parcelG.writeString(str2);
        parcelG.writeString(str3);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.z.f2922a;
        parcelG.writeInt(z9 ? 1 : 0);
        Parcel parcelD = d(parcelG, 15);
        ArrayList arrayListCreateTypedArrayList = parcelD.createTypedArrayList(x4.CREATOR);
        parcelD.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // e1.i0
    public final void i(c5 c5Var) {
        Parcel parcelG = G();
        com.google.android.gms.internal.measurement.z.b(parcelG, c5Var);
        H(parcelG, 20);
    }

    @Override // e1.i0
    public final void j(long j, String str, String str2, String str3) {
        Parcel parcelG = G();
        parcelG.writeLong(j);
        parcelG.writeString(str);
        parcelG.writeString(str2);
        parcelG.writeString(str3);
        H(parcelG, 10);
    }

    @Override // e1.i0
    public final void l(c5 c5Var, Bundle bundle, k0 k0Var) {
        Parcel parcelG = G();
        com.google.android.gms.internal.measurement.z.b(parcelG, c5Var);
        com.google.android.gms.internal.measurement.z.b(parcelG, bundle);
        com.google.android.gms.internal.measurement.z.c(parcelG, k0Var);
        H(parcelG, 31);
    }

    @Override // e1.i0
    public final void m(c5 c5Var) {
        Parcel parcelG = G();
        com.google.android.gms.internal.measurement.z.b(parcelG, c5Var);
        H(parcelG, 25);
    }

    @Override // e1.i0
    public final byte[] n(u uVar, String str) {
        Parcel parcelG = G();
        com.google.android.gms.internal.measurement.z.b(parcelG, uVar);
        parcelG.writeString(str);
        Parcel parcelD = d(parcelG, 9);
        byte[] bArrCreateByteArray = parcelD.createByteArray();
        parcelD.recycle();
        return bArrCreateByteArray;
    }

    @Override // e1.i0
    public final List o(String str, String str2, String str3) {
        Parcel parcelG = G();
        parcelG.writeString(null);
        parcelG.writeString(str2);
        parcelG.writeString(str3);
        Parcel parcelD = d(parcelG, 17);
        ArrayList arrayListCreateTypedArrayList = parcelD.createTypedArrayList(e.CREATOR);
        parcelD.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // e1.i0
    public final void p(c5 c5Var) {
        Parcel parcelG = G();
        com.google.android.gms.internal.measurement.z.b(parcelG, c5Var);
        H(parcelG, 4);
    }

    @Override // e1.i0
    public final void r(c5 c5Var) {
        Parcel parcelG = G();
        com.google.android.gms.internal.measurement.z.b(parcelG, c5Var);
        H(parcelG, 6);
    }

    @Override // e1.i0
    public final void s(c5 c5Var) {
        Parcel parcelG = G();
        com.google.android.gms.internal.measurement.z.b(parcelG, c5Var);
        H(parcelG, 26);
    }

    @Override // e1.i0
    public final void u(c5 c5Var, d dVar) {
        Parcel parcelG = G();
        com.google.android.gms.internal.measurement.z.b(parcelG, c5Var);
        com.google.android.gms.internal.measurement.z.b(parcelG, dVar);
        H(parcelG, 30);
    }

    @Override // e1.i0
    public final void v(u uVar, c5 c5Var) {
        Parcel parcelG = G();
        com.google.android.gms.internal.measurement.z.b(parcelG, uVar);
        com.google.android.gms.internal.measurement.z.b(parcelG, c5Var);
        H(parcelG, 1);
    }

    @Override // e1.i0
    public final void w(e eVar, c5 c5Var) {
        Parcel parcelG = G();
        com.google.android.gms.internal.measurement.z.b(parcelG, eVar);
        com.google.android.gms.internal.measurement.z.b(parcelG, c5Var);
        H(parcelG, 12);
    }

    @Override // e1.i0
    public final List y(String str, String str2, c5 c5Var) {
        Parcel parcelG = G();
        parcelG.writeString(str);
        parcelG.writeString(str2);
        com.google.android.gms.internal.measurement.z.b(parcelG, c5Var);
        Parcel parcelD = d(parcelG, 16);
        ArrayList arrayListCreateTypedArrayList = parcelD.createTypedArrayList(e.CREATOR);
        parcelD.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // e1.i0
    public final String z(c5 c5Var) {
        Parcel parcelG = G();
        com.google.android.gms.internal.measurement.z.b(parcelG, c5Var);
        Parcel parcelD = d(parcelG, 11);
        String string = parcelD.readString();
        parcelD.recycle();
        return string;
    }
}
