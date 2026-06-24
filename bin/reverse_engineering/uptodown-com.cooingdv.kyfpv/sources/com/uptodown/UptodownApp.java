package com.uptodown;

import a.a;
import a4.p;
import android.net.ConnectivityManager;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.core.model.ACData;
import com.inmobi.cmp.core.model.GDPRData;
import com.inmobi.cmp.core.model.gbc.GoogleBasicConsents;
import com.inmobi.cmp.core.model.mspa.USRegulationData;
import com.inmobi.cmp.model.ActionButton;
import com.inmobi.cmp.model.ChoiceError;
import com.inmobi.cmp.model.DisplayInfo;
import com.inmobi.cmp.model.NonIABData;
import com.inmobi.cmp.model.PingReturn;
import f4.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import n5.g;
import o7.c0;
import o7.m0;
import v3.e;
import x4.k;
import z4.b;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class UptodownApp extends c implements ChoiceCmpCallback {
    public static float I = 1.0f;
    public static String J;
    public static String K;
    public static String L;
    public static String M;
    public static String N;
    public static String O;
    public static String P;
    public static String Q;
    public static String R;
    public static int S;
    public static int T;
    public static int U;
    public static int V;
    public static g W;
    public static g X;
    public static int Y;
    public static e Z;
    public static e a0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static boolean f3291d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static boolean f3292e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static boolean f3293f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static k f3294g0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static ArrayList f3296i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static long f3297j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static ArrayList f3298k0;
    public p F;
    public b G;
    public final t7.c H;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final HashMap f3289b0 = new HashMap();

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final z4.e f3290c0 = new z4.e(null);

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final Object f3295h0 = new Object();

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final Object f3299l0 = new Object();

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final Object f3300m0 = new Object();
    public static final ArrayList n0 = new ArrayList();

    public UptodownApp() {
        this.f4887a = new AtomicBoolean(false);
        this.f4888b = new AtomicBoolean(false);
        this.f4889l = new AtomicBoolean(false);
        this.f4890m = new b4.g(this);
        this.f4891n = new f4.b(this);
        this.H = c0.b(a.L(c0.d(), m0.f8289a));
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public final void onActionButtonClicked(ActionButton actionButton) {
        actionButton.getClass();
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public final void onCCPAConsentGiven(String str) {
        str.getClass();
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public final void onCMPUIStatusChanged(DisplayInfo displayInfo) {
        displayInfo.getClass();
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public final void onCmpError(ChoiceError choiceError) {
        choiceError.getClass();
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public final void onCmpLoaded(PingReturn pingReturn) {
        pingReturn.getClass();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:54:0x029d  */
    @Override // f4.c, android.app.Application
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate() {
        /*
            Method dump skipped, instruction units count: 1364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.UptodownApp.onCreate():void");
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public final void onGoogleBasicConsentChange(GoogleBasicConsents googleBasicConsents) {
        googleBasicConsents.getClass();
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public final void onGoogleVendorConsentGiven(ACData aCData) {
        aCData.getClass();
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public final void onIABVendorConsentGiven(GDPRData gDPRData) {
        gDPRData.getClass();
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public final void onNonIABVendorConsentGiven(NonIABData nonIABData) {
        nonIABData.getClass();
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public final void onReceiveUSRegulationsConsent(USRegulationData uSRegulationData) {
        uSRegulationData.getClass();
    }

    @Override // android.app.Application
    public final void onTerminate() {
        super.onTerminate();
        c0.h(this.H);
        new android.support.v4.media.g(this);
        Object systemService = getSystemService("connectivity");
        systemService.getClass();
        ((ConnectivityManager) systemService).unregisterNetworkCallback(new ConnectivityManager.NetworkCallback());
        try {
            p pVar = this.F;
            if (pVar != null) {
                unregisterReceiver(pVar);
                this.F = null;
            }
            b bVar = this.G;
            if (bVar != null) {
                unregisterReceiver(bVar);
                this.G = null;
            }
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public final void onUserMovedToOtherState() {
    }
}
