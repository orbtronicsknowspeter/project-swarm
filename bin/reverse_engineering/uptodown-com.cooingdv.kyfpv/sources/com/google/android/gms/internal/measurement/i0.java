package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends x implements k0 {
    @Override // com.google.android.gms.internal.measurement.k0
    public final void beginAdUnitExposure(String str, long j) {
        Parcel parcelG = G();
        parcelG.writeString(str);
        parcelG.writeLong(j);
        H(parcelG, 23);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelG = G();
        parcelG.writeString(str);
        parcelG.writeString(str2);
        z.b(parcelG, bundle);
        H(parcelG, 9);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void endAdUnitExposure(String str, long j) {
        Parcel parcelG = G();
        parcelG.writeString(str);
        parcelG.writeLong(j);
        H(parcelG, 24);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void generateEventId(m0 m0Var) {
        Parcel parcelG = G();
        z.c(parcelG, m0Var);
        H(parcelG, 22);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void getCachedAppInstanceId(m0 m0Var) {
        Parcel parcelG = G();
        z.c(parcelG, m0Var);
        H(parcelG, 19);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void getConditionalUserProperties(String str, String str2, m0 m0Var) {
        Parcel parcelG = G();
        parcelG.writeString(str);
        parcelG.writeString(str2);
        z.c(parcelG, m0Var);
        H(parcelG, 10);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void getCurrentScreenClass(m0 m0Var) {
        Parcel parcelG = G();
        z.c(parcelG, m0Var);
        H(parcelG, 17);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void getCurrentScreenName(m0 m0Var) {
        Parcel parcelG = G();
        z.c(parcelG, m0Var);
        H(parcelG, 16);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void getGmpAppId(m0 m0Var) {
        Parcel parcelG = G();
        z.c(parcelG, m0Var);
        H(parcelG, 21);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void getMaxUserProperties(String str, m0 m0Var) {
        Parcel parcelG = G();
        parcelG.writeString(str);
        z.c(parcelG, m0Var);
        H(parcelG, 6);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void getUserProperties(String str, String str2, boolean z9, m0 m0Var) {
        Parcel parcelG = G();
        parcelG.writeString(str);
        parcelG.writeString(str2);
        ClassLoader classLoader = z.f2922a;
        parcelG.writeInt(z9 ? 1 : 0);
        z.c(parcelG, m0Var);
        H(parcelG, 5);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void initialize(s0.a aVar, u0 u0Var, long j) {
        Parcel parcelG = G();
        z.c(parcelG, aVar);
        z.b(parcelG, u0Var);
        parcelG.writeLong(j);
        H(parcelG, 1);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void logEvent(String str, String str2, Bundle bundle, boolean z9, boolean z10, long j) {
        Parcel parcelG = G();
        parcelG.writeString(str);
        parcelG.writeString(str2);
        z.b(parcelG, bundle);
        parcelG.writeInt(z9 ? 1 : 0);
        parcelG.writeInt(1);
        parcelG.writeLong(j);
        H(parcelG, 2);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void logHealthData(int i, String str, s0.a aVar, s0.a aVar2, s0.a aVar3) {
        Parcel parcelG = G();
        parcelG.writeInt(5);
        parcelG.writeString("Error with data collection. Data lost.");
        z.c(parcelG, aVar);
        z.c(parcelG, aVar2);
        z.c(parcelG, aVar3);
        H(parcelG, 33);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void onActivityCreatedByScionActivityInfo(w0 w0Var, Bundle bundle, long j) {
        Parcel parcelG = G();
        z.b(parcelG, w0Var);
        z.b(parcelG, bundle);
        parcelG.writeLong(j);
        H(parcelG, 53);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void onActivityDestroyedByScionActivityInfo(w0 w0Var, long j) {
        Parcel parcelG = G();
        z.b(parcelG, w0Var);
        parcelG.writeLong(j);
        H(parcelG, 54);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void onActivityPausedByScionActivityInfo(w0 w0Var, long j) {
        Parcel parcelG = G();
        z.b(parcelG, w0Var);
        parcelG.writeLong(j);
        H(parcelG, 55);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void onActivityResumedByScionActivityInfo(w0 w0Var, long j) {
        Parcel parcelG = G();
        z.b(parcelG, w0Var);
        parcelG.writeLong(j);
        H(parcelG, 56);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void onActivitySaveInstanceStateByScionActivityInfo(w0 w0Var, m0 m0Var, long j) {
        Parcel parcelG = G();
        z.b(parcelG, w0Var);
        z.c(parcelG, m0Var);
        parcelG.writeLong(j);
        H(parcelG, 57);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void onActivityStartedByScionActivityInfo(w0 w0Var, long j) {
        Parcel parcelG = G();
        z.b(parcelG, w0Var);
        parcelG.writeLong(j);
        H(parcelG, 51);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void onActivityStoppedByScionActivityInfo(w0 w0Var, long j) {
        Parcel parcelG = G();
        z.b(parcelG, w0Var);
        parcelG.writeLong(j);
        H(parcelG, 52);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void registerOnMeasurementEventListener(r0 r0Var) {
        Parcel parcelG = G();
        z.c(parcelG, r0Var);
        H(parcelG, 35);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void retrieveAndUploadBatches(o0 o0Var) {
        Parcel parcelG = G();
        z.c(parcelG, o0Var);
        H(parcelG, 58);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel parcelG = G();
        z.b(parcelG, bundle);
        parcelG.writeLong(j);
        H(parcelG, 8);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void setCurrentScreenByScionActivityInfo(w0 w0Var, String str, String str2, long j) {
        Parcel parcelG = G();
        z.b(parcelG, w0Var);
        parcelG.writeString(str);
        parcelG.writeString(str2);
        parcelG.writeLong(j);
        H(parcelG, 50);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void setDataCollectionEnabled(boolean z9) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void setMeasurementEnabled(boolean z9, long j) {
        Parcel parcelG = G();
        ClassLoader classLoader = z.f2922a;
        parcelG.writeInt(z9 ? 1 : 0);
        parcelG.writeLong(j);
        H(parcelG, 11);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public final void setUserProperty(String str, String str2, s0.a aVar, boolean z9, long j) {
        Parcel parcelG = G();
        parcelG.writeString("fcm");
        parcelG.writeString("_ln");
        z.c(parcelG, aVar);
        parcelG.writeInt(1);
        parcelG.writeLong(j);
        H(parcelG, 4);
    }
}
