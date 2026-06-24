package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j0 extends y implements k0 {
    public static k0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof k0 ? (k0) iInterfaceQueryLocalInterface : new i0(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService", 0);
    }

    @Override // com.google.android.gms.internal.measurement.y
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        boolean z9;
        m0 l0Var = null;
        o0 n0Var = null;
        m0 l0Var2 = null;
        m0 l0Var3 = null;
        m0 l0Var4 = null;
        m0 l0Var5 = null;
        r0 p0Var = null;
        r0 p0Var2 = null;
        r0 p0Var3 = null;
        m0 l0Var6 = null;
        m0 l0Var7 = null;
        m0 l0Var8 = null;
        m0 l0Var9 = null;
        m0 l0Var10 = null;
        m0 l0Var11 = null;
        t0 s0Var = null;
        m0 l0Var12 = null;
        m0 l0Var13 = null;
        m0 l0Var14 = null;
        m0 l0Var15 = null;
        m0 l0Var16 = null;
        switch (i) {
            case 1:
                s0.a aVarI = s0.b.I(parcel.readStrongBinder());
                u0 u0Var = (u0) z.a(parcel, u0.CREATOR);
                long j = parcel.readLong();
                z.d(parcel);
                initialize(aVarI, u0Var, j);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) z.a(parcel, Bundle.CREATOR);
                boolean z10 = parcel.readInt() != 0;
                boolean z11 = parcel.readInt() != 0;
                long j6 = parcel.readLong();
                z.d(parcel);
                logEvent(string, string2, bundle, z10, z11, j6);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) z.a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    l0Var = iInterfaceQueryLocalInterface instanceof m0 ? (m0) iInterfaceQueryLocalInterface : new l0(strongBinder);
                }
                m0 m0Var = l0Var;
                long j10 = parcel.readLong();
                z.d(parcel);
                logEventAndBundle(string3, string4, bundle2, m0Var, j10);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                s0.a aVarI2 = s0.b.I(parcel.readStrongBinder());
                ClassLoader classLoader = z.f2922a;
                z9 = parcel.readInt() != 0;
                long j11 = parcel.readLong();
                z.d(parcel);
                setUserProperty(string5, string6, aVarI2, z9, j11);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                ClassLoader classLoader2 = z.f2922a;
                z9 = parcel.readInt() != 0;
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    l0Var16 = iInterfaceQueryLocalInterface2 instanceof m0 ? (m0) iInterfaceQueryLocalInterface2 : new l0(strongBinder2);
                }
                z.d(parcel);
                getUserProperties(string7, string8, z9, l0Var16);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    l0Var15 = iInterfaceQueryLocalInterface3 instanceof m0 ? (m0) iInterfaceQueryLocalInterface3 : new l0(strongBinder3);
                }
                z.d(parcel);
                getMaxUserProperties(string9, l0Var15);
                break;
            case 7:
                String string10 = parcel.readString();
                long j12 = parcel.readLong();
                z.d(parcel);
                setUserId(string10, j12);
                break;
            case 8:
                Bundle bundle3 = (Bundle) z.a(parcel, Bundle.CREATOR);
                long j13 = parcel.readLong();
                z.d(parcel);
                setConditionalUserProperty(bundle3, j13);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) z.a(parcel, Bundle.CREATOR);
                z.d(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    l0Var14 = iInterfaceQueryLocalInterface4 instanceof m0 ? (m0) iInterfaceQueryLocalInterface4 : new l0(strongBinder4);
                }
                z.d(parcel);
                getConditionalUserProperties(string13, string14, l0Var14);
                break;
            case 11:
                ClassLoader classLoader3 = z.f2922a;
                z9 = parcel.readInt() != 0;
                long j14 = parcel.readLong();
                z.d(parcel);
                setMeasurementEnabled(z9, j14);
                break;
            case 12:
                long j15 = parcel.readLong();
                z.d(parcel);
                resetAnalyticsData(j15);
                break;
            case 13:
                long j16 = parcel.readLong();
                z.d(parcel);
                setMinimumSessionDuration(j16);
                break;
            case 14:
                long j17 = parcel.readLong();
                z.d(parcel);
                setSessionTimeoutDuration(j17);
                break;
            case 15:
                s0.a aVarI3 = s0.b.I(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j18 = parcel.readLong();
                z.d(parcel);
                setCurrentScreen(aVarI3, string15, string16, j18);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    l0Var13 = iInterfaceQueryLocalInterface5 instanceof m0 ? (m0) iInterfaceQueryLocalInterface5 : new l0(strongBinder5);
                }
                z.d(parcel);
                getCurrentScreenName(l0Var13);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    l0Var12 = iInterfaceQueryLocalInterface6 instanceof m0 ? (m0) iInterfaceQueryLocalInterface6 : new l0(strongBinder6);
                }
                z.d(parcel);
                getCurrentScreenClass(l0Var12);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    s0Var = iInterfaceQueryLocalInterface7 instanceof t0 ? (t0) iInterfaceQueryLocalInterface7 : new s0(strongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider", 0);
                }
                z.d(parcel);
                setInstanceIdProvider(s0Var);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    l0Var11 = iInterfaceQueryLocalInterface8 instanceof m0 ? (m0) iInterfaceQueryLocalInterface8 : new l0(strongBinder8);
                }
                z.d(parcel);
                getCachedAppInstanceId(l0Var11);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    l0Var10 = iInterfaceQueryLocalInterface9 instanceof m0 ? (m0) iInterfaceQueryLocalInterface9 : new l0(strongBinder9);
                }
                z.d(parcel);
                getAppInstanceId(l0Var10);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    l0Var9 = iInterfaceQueryLocalInterface10 instanceof m0 ? (m0) iInterfaceQueryLocalInterface10 : new l0(strongBinder10);
                }
                z.d(parcel);
                getGmpAppId(l0Var9);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    l0Var8 = iInterfaceQueryLocalInterface11 instanceof m0 ? (m0) iInterfaceQueryLocalInterface11 : new l0(strongBinder11);
                }
                z.d(parcel);
                generateEventId(l0Var8);
                break;
            case 23:
                String string17 = parcel.readString();
                long j19 = parcel.readLong();
                z.d(parcel);
                beginAdUnitExposure(string17, j19);
                break;
            case 24:
                String string18 = parcel.readString();
                long j20 = parcel.readLong();
                z.d(parcel);
                endAdUnitExposure(string18, j20);
                break;
            case 25:
                s0.a aVarI4 = s0.b.I(parcel.readStrongBinder());
                long j21 = parcel.readLong();
                z.d(parcel);
                onActivityStarted(aVarI4, j21);
                break;
            case 26:
                s0.a aVarI5 = s0.b.I(parcel.readStrongBinder());
                long j22 = parcel.readLong();
                z.d(parcel);
                onActivityStopped(aVarI5, j22);
                break;
            case 27:
                s0.a aVarI6 = s0.b.I(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) z.a(parcel, Bundle.CREATOR);
                long j23 = parcel.readLong();
                z.d(parcel);
                onActivityCreated(aVarI6, bundle5, j23);
                break;
            case 28:
                s0.a aVarI7 = s0.b.I(parcel.readStrongBinder());
                long j24 = parcel.readLong();
                z.d(parcel);
                onActivityDestroyed(aVarI7, j24);
                break;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                s0.a aVarI8 = s0.b.I(parcel.readStrongBinder());
                long j25 = parcel.readLong();
                z.d(parcel);
                onActivityPaused(aVarI8, j25);
                break;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_BIAS /* 30 */:
                s0.a aVarI9 = s0.b.I(parcel.readStrongBinder());
                long j26 = parcel.readLong();
                z.d(parcel);
                onActivityResumed(aVarI9, j26);
                break;
            case 31:
                s0.a aVarI10 = s0.b.I(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    l0Var7 = iInterfaceQueryLocalInterface12 instanceof m0 ? (m0) iInterfaceQueryLocalInterface12 : new l0(strongBinder12);
                }
                long j27 = parcel.readLong();
                z.d(parcel);
                onActivitySaveInstanceState(aVarI10, l0Var7, j27);
                break;
            case 32:
                Bundle bundle6 = (Bundle) z.a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    l0Var6 = iInterfaceQueryLocalInterface13 instanceof m0 ? (m0) iInterfaceQueryLocalInterface13 : new l0(strongBinder13);
                }
                long j28 = parcel.readLong();
                z.d(parcel);
                performAction(bundle6, l0Var6, j28);
                break;
            case 33:
                int i6 = parcel.readInt();
                String string19 = parcel.readString();
                s0.a aVarI11 = s0.b.I(parcel.readStrongBinder());
                s0.a aVarI12 = s0.b.I(parcel.readStrongBinder());
                s0.a aVarI13 = s0.b.I(parcel.readStrongBinder());
                z.d(parcel);
                logHealthData(i6, string19, aVarI11, aVarI12, aVarI13);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    p0Var3 = iInterfaceQueryLocalInterface14 instanceof r0 ? (r0) iInterfaceQueryLocalInterface14 : new p0(strongBinder14);
                }
                z.d(parcel);
                setEventInterceptor(p0Var3);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    p0Var2 = iInterfaceQueryLocalInterface15 instanceof r0 ? (r0) iInterfaceQueryLocalInterface15 : new p0(strongBinder15);
                }
                z.d(parcel);
                registerOnMeasurementEventListener(p0Var2);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    p0Var = iInterfaceQueryLocalInterface16 instanceof r0 ? (r0) iInterfaceQueryLocalInterface16 : new p0(strongBinder16);
                }
                z.d(parcel);
                unregisterOnMeasurementEventListener(p0Var);
                break;
            case 37:
                HashMap hashMap = parcel.readHashMap(z.f2922a);
                z.d(parcel);
                initForTests(hashMap);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    l0Var5 = iInterfaceQueryLocalInterface17 instanceof m0 ? (m0) iInterfaceQueryLocalInterface17 : new l0(strongBinder17);
                }
                int i10 = parcel.readInt();
                z.d(parcel);
                getTestFlag(l0Var5, i10);
                break;
            case 39:
                ClassLoader classLoader4 = z.f2922a;
                z9 = parcel.readInt() != 0;
                z.d(parcel);
                setDataCollectionEnabled(z9);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    l0Var4 = iInterfaceQueryLocalInterface18 instanceof m0 ? (m0) iInterfaceQueryLocalInterface18 : new l0(strongBinder18);
                }
                z.d(parcel);
                isDataCollectionEnabled(l0Var4);
                break;
            case 41:
            case 47:
            case 49:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) z.a(parcel, Bundle.CREATOR);
                z.d(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j29 = parcel.readLong();
                z.d(parcel);
                clearMeasurementEnabled(j29);
                break;
            case 44:
                Bundle bundle8 = (Bundle) z.a(parcel, Bundle.CREATOR);
                long j30 = parcel.readLong();
                z.d(parcel);
                setConsent(bundle8, j30);
                break;
            case 45:
                Bundle bundle9 = (Bundle) z.a(parcel, Bundle.CREATOR);
                long j31 = parcel.readLong();
                z.d(parcel);
                setConsentThirdParty(bundle9, j31);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    l0Var3 = iInterfaceQueryLocalInterface19 instanceof m0 ? (m0) iInterfaceQueryLocalInterface19 : new l0(strongBinder19);
                }
                z.d(parcel);
                getSessionId(l0Var3);
                break;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                Intent intent = (Intent) z.a(parcel, Intent.CREATOR);
                z.d(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 50:
                w0 w0Var = (w0) z.a(parcel, w0.CREATOR);
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                long j32 = parcel.readLong();
                z.d(parcel);
                setCurrentScreenByScionActivityInfo(w0Var, string20, string21, j32);
                break;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                w0 w0Var2 = (w0) z.a(parcel, w0.CREATOR);
                long j33 = parcel.readLong();
                z.d(parcel);
                onActivityStartedByScionActivityInfo(w0Var2, j33);
                break;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                w0 w0Var3 = (w0) z.a(parcel, w0.CREATOR);
                long j34 = parcel.readLong();
                z.d(parcel);
                onActivityStoppedByScionActivityInfo(w0Var3, j34);
                break;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                w0 w0Var4 = (w0) z.a(parcel, w0.CREATOR);
                Bundle bundle10 = (Bundle) z.a(parcel, Bundle.CREATOR);
                long j35 = parcel.readLong();
                z.d(parcel);
                onActivityCreatedByScionActivityInfo(w0Var4, bundle10, j35);
                break;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                w0 w0Var5 = (w0) z.a(parcel, w0.CREATOR);
                long j36 = parcel.readLong();
                z.d(parcel);
                onActivityDestroyedByScionActivityInfo(w0Var5, j36);
                break;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                w0 w0Var6 = (w0) z.a(parcel, w0.CREATOR);
                long j37 = parcel.readLong();
                z.d(parcel);
                onActivityPausedByScionActivityInfo(w0Var6, j37);
                break;
            case 56:
                w0 w0Var7 = (w0) z.a(parcel, w0.CREATOR);
                long j38 = parcel.readLong();
                z.d(parcel);
                onActivityResumedByScionActivityInfo(w0Var7, j38);
                break;
            case 57:
                w0 w0Var8 = (w0) z.a(parcel, w0.CREATOR);
                IBinder strongBinder20 = parcel.readStrongBinder();
                if (strongBinder20 != null) {
                    IInterface iInterfaceQueryLocalInterface20 = strongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    l0Var2 = iInterfaceQueryLocalInterface20 instanceof m0 ? (m0) iInterfaceQueryLocalInterface20 : new l0(strongBinder20);
                }
                long j39 = parcel.readLong();
                z.d(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(w0Var8, l0Var2, j39);
                break;
            case 58:
                IBinder strongBinder21 = parcel.readStrongBinder();
                if (strongBinder21 != null) {
                    IInterface iInterfaceQueryLocalInterface21 = strongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    n0Var = iInterfaceQueryLocalInterface21 instanceof o0 ? (o0) iInterfaceQueryLocalInterface21 : new n0(strongBinder21, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback", 0);
                }
                z.d(parcel);
                retrieveAndUploadBatches(n0Var);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
