package e1;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g1 extends e2 {
    public static final Pair I = new Pair("", 0L);
    public boolean A;
    public final d1 B;
    public final d1 C;
    public final e1 D;
    public final a2.t E;
    public final a2.t F;
    public final e1 G;
    public final y2.s H;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SharedPreferences f3982l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SharedPreferences f3983m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f1 f3984n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e1 f3985o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a2.t f3986p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f3987q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f3988r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f3989s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e1 f3990t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final d1 f3991u;
    public final a2.t v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y2.s f3992w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final d1 f3993x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e1 f3994y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final e1 f3995z;

    public g1(t1 t1Var) {
        super(t1Var);
        this.f3990t = new e1(this, "session_timeout", 1800000L);
        this.f3991u = new d1(this, "start_new_session", true);
        this.f3994y = new e1(this, "last_pause_time", 0L);
        this.f3995z = new e1(this, "session_id", 0L);
        this.v = new a2.t(this, "non_personalized_ads");
        this.f3992w = new y2.s(this, "last_received_uri_timestamps_by_source");
        this.f3993x = new d1(this, "allow_remote_dynamite", false);
        this.f3985o = new e1(this, "first_open_time", 0L);
        k0.y.d("app_install_time");
        this.f3986p = new a2.t(this, "app_instance_id");
        this.B = new d1(this, "app_backgrounded", false);
        this.C = new d1(this, "deep_link_retrieval_complete", false);
        this.D = new e1(this, "deep_link_retrieval_attempts", 0L);
        this.E = new a2.t(this, "firebase_feature_rollouts");
        this.F = new a2.t(this, "deferred_attribution_cache");
        this.G = new e1(this, "deferred_attribution_cache_timestamp", 0L);
        this.H = new y2.s(this, "default_event_parameters");
    }

    @Override // e1.e2
    public final boolean h() {
        return true;
    }

    public final SharedPreferences k() {
        g();
        i();
        k0.y.g(this.f3982l);
        return this.f3982l;
    }

    public final SharedPreferences l() {
        g();
        i();
        if (this.f3983m == null) {
            t1 t1Var = this.f3876a;
            String strValueOf = String.valueOf(t1Var.f4260a.getPackageName());
            w0 w0Var = t1Var.f4265o;
            t1.m(w0Var);
            u0 u0Var = w0Var.f4347w;
            String strConcat = strValueOf.concat("_preferences");
            u0Var.c(strConcat, "Default prefs file");
            this.f3983m = t1Var.f4260a.getSharedPreferences(strConcat, 0);
        }
        return this.f3983m;
    }

    public final SparseArray m() {
        Bundle bundleG = this.f3992w.G();
        int[] intArray = bundleG.getIntArray("uriSources");
        long[] longArray = bundleG.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            w0 w0Var = this.f3876a.f4265o;
            t1.m(w0Var);
            w0Var.f4340o.b("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    public final j2 n() {
        g();
        return j2.c(k().getInt("consent_source", 100), k().getString("consent_settings", "G1"));
    }

    public final boolean o(g4 g4Var) {
        g();
        String string = k().getString("stored_tcf_param", "");
        String strA = g4Var.a();
        if (strA.equals(string)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = k().edit();
        editorEdit.putString("stored_tcf_param", strA);
        editorEdit.apply();
        return true;
    }

    public final void p(boolean z9) {
        g();
        w0 w0Var = this.f3876a.f4265o;
        t1.m(w0Var);
        w0Var.f4347w.c(Boolean.valueOf(z9), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = k().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z9);
        editorEdit.apply();
    }

    public final boolean q(long j) {
        return j - this.f3990t.a() > this.f3994y.a();
    }
}
