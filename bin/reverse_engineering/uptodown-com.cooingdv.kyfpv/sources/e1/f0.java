package e1;

import androidx.leanback.media.MediaPlayerGlue;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkRequest;
import androidx.work.multiprocess.RemoteWorkManager;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f0 {
    public static final e0 A;
    public static final e0 A0;
    public static final e0 B;
    public static final e0 B0;
    public static final e0 C;
    public static final e0 C0;
    public static final e0 D;
    public static final e0 D0;
    public static final e0 E;
    public static final e0 E0;
    public static final e0 F;
    public static final e0 F0;
    public static final e0 G;
    public static final e0 G0;
    public static final e0 H;
    public static final e0 H0;
    public static final e0 I;
    public static final e0 I0;
    public static final e0 J;
    public static final e0 J0;
    public static final e0 K;
    public static final e0 K0;
    public static final e0 L;
    public static final e0 L0;
    public static final e0 M;
    public static final e0 M0;
    public static final e0 N;
    public static final e0 N0;
    public static final e0 O;
    public static final e0 O0;
    public static final e0 P;
    public static final e0 P0;
    public static final e0 Q;
    public static final e0 Q0;
    public static final e0 R;
    public static final e0 R0;
    public static final e0 S;
    public static final e0 S0;
    public static final e0 T;
    public static final e0 T0;
    public static final e0 U;
    public static final e0 U0;
    public static final e0 V;
    public static final e0 V0;
    public static final e0 W;
    public static final e0 W0;
    public static final e0 X;
    public static final e0 X0;
    public static final e0 Y;
    public static final e0 Y0;
    public static final e0 Z;
    public static final e0 Z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f3914a = DesugarCollections.synchronizedList(new ArrayList());
    public static final e0 a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final e0 f3915a1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e0 f3916b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final e0 f3917b0;
    public static final e0 b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e0 f3918c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final e0 f3919c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final e0 f3920c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e0 f3921d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final e0 f3922d0;
    public static final e0 d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e0 f3923e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final e0 f3924e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final e0 f3925e1;
    public static final e0 f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final e0 f3926f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final e0 f3927f1;
    public static final e0 g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final e0 f3928g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final e0 f3929g1;
    public static final e0 h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final e0 f3930h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final e0 f3931h1;
    public static final e0 i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final e0 f3932i0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final e0 f3933i1;
    public static final e0 j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final e0 f3934j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final e0 f3935j1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e0 f3936k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final e0 f3937k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final e0 f3938k1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final e0 f3939l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final e0 f3940l0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final e0 f3941l1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final e0 f3942m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final e0 f3943m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final e0 f3944n;
    public static final e0 n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final e0 f3945o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final e0 f3946o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final e0 f3947p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final e0 f3948p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final e0 f3949q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final e0 f3950q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final e0 f3951r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final e0 f3952r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final e0 f3953s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final e0 f3954s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final e0 f3955t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final e0 f3956t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final e0 f3957u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final e0 f3958u0;
    public static final e0 v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final e0 f3959v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final e0 f3960w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final e0 f3961w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final e0 f3962x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final e0 f3963x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final e0 f3964y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final e0 f3965y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final e0 f3966z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final e0 f3967z0;

    static {
        DesugarCollections.synchronizedSet(new HashSet());
        Long lValueOf = Long.valueOf(WorkRequest.MIN_BACKOFF_MILLIS);
        f3916b = a("measurement.ad_id_cache_time", lValueOf, c0.f3836m, false);
        f3918c = a("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L, q2.e.f8660q, false);
        f3921d = a("measurement.monitoring.sample_period_millis", 86400000L, x.f4375n, false);
        f3923e = a("measurement.config.cache_time", 86400000L, x.f4385y, false);
        f = a("measurement.config.url_scheme", "https", x.J, false);
        g = a("measurement.config.url_authority", "app-measurement.com", z.f4437q, false);
        h = a("measurement.upload.max_bundles", 100, z.B, false);
        i = a("measurement.upload.max_batch_size", 65536, z.M, false);
        j = a("measurement.upload.max_bundle_size", 65536, a0.f3753t, false);
        f3936k = a("measurement.upload.max_events_per_bundle", 1000, a0.E, false);
        f3939l = a("measurement.upload.max_events_per_day", 100000, c0.f3835l, false);
        f3942m = a("measurement.upload.max_error_events_per_day", 1000, q2.e.f8666x, false);
        f3944n = a("measurement.upload.max_public_events_per_day", 50000, q2.e.f8667y, false);
        f3945o = a("measurement.upload.max_conversions_per_day", Integer.valueOf(MediaPlayerGlue.FAST_FORWARD_REWIND_STEP), q2.e.f8668z, false);
        f3947p = a("measurement.upload.max_realtime_events_per_day", 10, q2.e.A, false);
        f3949q = a("measurement.store.max_stored_events_per_app", 100000, q2.e.B, false);
        f3951r = a("measurement.upload.url", "https://app-measurement.com/a", q2.e.C, false);
        f3953s = a("measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d", q2.e.D, false);
        f3955t = a("measurement.sgtm.service_upload_apps_list", "", x.f4372b, false);
        f3957u = a("measurement.sgtm.upload.backoff_http_codes", "404,429,503,504", x.f4373l, false);
        Long lValueOf2 = Long.valueOf(RemoteWorkManager.DEFAULT_SESSION_TIMEOUT_MILLIS);
        v = a("measurement.sgtm.upload.retry_interval", lValueOf2, x.f4374m, false);
        f3960w = a("measurement.sgtm.upload.retry_max_wait", 21600000L, x.f4376o, false);
        f3962x = a("measurement.sgtm.batch.retry_interval", 1800000L, x.f4377p, false);
        f3964y = a("measurement.sgtm.batch.retry_max_wait", 21600000L, x.f4378q, false);
        f3966z = a("measurement.sgtm.batch.retry_max_count", 10, x.f4379r, false);
        A = a("measurement.sgtm.upload.max_queued_batches", 5000, x.f4380s, false);
        B = a("measurement.sgtm.upload.batches_retrieval_limit", 5, x.f4381t, false);
        Long lValueOf3 = Long.valueOf(CoroutineLiveDataKt.DEFAULT_TIMEOUT);
        C = a("measurement.sgtm.upload.min_delay_after_startup", lValueOf3, x.f4382u, false);
        D = a("measurement.sgtm.upload.min_delay_after_broadcast", 1000L, x.v, false);
        E = a("measurement.sgtm.upload.min_delay_after_background", lValueOf2, x.f4383w, false);
        F = a("measurement.sgtm.batch.long_queuing_threshold", 14400000L, x.f4384x, false);
        G = a("measurement.upload.backoff_period", 43200000L, x.f4386z, false);
        H = a("measurement.upload.window_interval", 3600000L, x.A, false);
        I = a("measurement.upload.interval", 3600000L, x.B, false);
        J = a("measurement.upload.realtime_upload_interval", lValueOf, x.C, false);
        K = a("measurement.upload.debug_upload_interval", 1000L, x.D, false);
        L = a("measurement.upload.minimum_delay", 500L, x.E, false);
        M = a("measurement.alarm_manager.minimum_interval", 60000L, x.F, false);
        N = a("measurement.upload.stale_data_deletion_interval", 86400000L, x.G, false);
        O = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, x.H, false);
        P = a("measurement.upload.initial_upload_delay_time", 15000L, x.I, false);
        Q = a("measurement.upload.retry_time", 1800000L, x.K, false);
        R = a("measurement.upload.retry_count", 6, x.L, false);
        S = a("measurement.upload.max_queue_time", 518400000L, x.M, false);
        T = a("measurement.upload.google_signal_max_queue_time", Long.valueOf(PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS), x.N, false);
        U = a("measurement.lifetimevalue.max_currency_tracked", 4, z.f4431b, false);
        V = a("measurement.audience.filter_result_max_count", 200, z.f4432l, false);
        W = a("measurement.upload.max_public_user_properties", 100, null, false);
        X = a("measurement.upload.max_event_name_cardinality", 2000, null, false);
        Y = a("measurement.upload.max_public_event_params", 100, null, false);
        Z = a("measurement.service_client.idle_disconnect_millis", lValueOf3, z.f4433m, false);
        a0 = a("measurement.service_client.reconnect_millis", 1000L, z.f4434n, false);
        Boolean bool = Boolean.FALSE;
        f3917b0 = a("measurement.test.boolean_flag", bool, z.f4435o, false);
        f3919c0 = a("measurement.test.string_flag", "---", z.f4436p, false);
        f3922d0 = a("measurement.test.long_flag", -1L, z.f4438r, false);
        a("measurement.test.cached_long_flag", -1L, z.f4439s, true);
        f3924e0 = a("measurement.test.int_flag", -2, z.f4440t, false);
        f3926f0 = a("measurement.test.double_flag", Double.valueOf(-3.0d), z.f4441u, false);
        f3928g0 = a("measurement.experiment.max_ids", 50, z.v, false);
        f3930h0 = a("measurement.upload.max_item_scoped_custom_parameters", 27, z.f4442w, false);
        f3932i0 = a("measurement.upload.max_event_parameter_value_length", 500, z.f4443x, true);
        f3934j0 = a("measurement.max_bundles_per_iteration", 100, z.f4444y, false);
        f3937k0 = a("measurement.sdk.attribution.cache.ttl", 604800000L, z.f4445z, false);
        f3940l0 = a("measurement.redaction.app_instance_id.ttl", 7200000L, z.A, false);
        f3943m0 = a("measurement.rb.attribution.client.min_ad_services_version", 7, z.C, false);
        n0 = a("measurement.dma_consent.max_daily_dcu_realtime_events", 1, z.D, false);
        f3946o0 = a("measurement.rb.attribution.uri_scheme", "https", z.E, false);
        f3948p0 = a("measurement.rb.attribution.uri_authority", "google-analytics.com", z.F, false);
        f3950q0 = a("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion", z.G, false);
        f3952r0 = a("measurement.session.engagement_interval", 3600000L, z.H, false);
        f3954s0 = a("measurement.rb.attribution.app_allowlist", "", z.I, false);
        f3956t0 = a("measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot", z.J, false);
        f3958u0 = a("measurement.rb.attribution.event_params", "value|currency", z.K, false);
        f3959v0 = a("measurement.rb.attribution.query_parameters_to_remove", "", z.L, false);
        f3961w0 = a("measurement.rb.attribution.max_queue_time", 864000000L, z.N, false);
        f3963x0 = a("measurement.rb.attribution.max_retry_delay_seconds", 16, a0.f3744b, false);
        f3965y0 = a("measurement.rb.attribution.client.min_time_after_boot_seconds", 90, a0.f3745l, false);
        a("measurement.rb.attribution.max_trigger_uris_queried_at_once", 0, a0.f3746m, false);
        f3967z0 = a("measurement.rb.max_trigger_registrations_per_day", 1000, a0.f3747n, false);
        Boolean bool2 = Boolean.TRUE;
        A0 = a("measurement.config.bundle_for_all_apps_on_backgrounded", bool2, a0.f3748o, false);
        B0 = a("measurement.config.notify_trigger_uris_on_backgrounded", bool2, a0.f3749p, false);
        C0 = a("measurement.rb.attribution.notify_app_delay_millis", 3000, a0.f3750q, false);
        D0 = a("measurement.quality.checksum", bool, null, false);
        E0 = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, a0.f3751r, false);
        F0 = a("measurement.audience.refresh_event_count_filters_timestamp", bool, a0.f3752s, false);
        G0 = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, a0.f3754u, true);
        H0 = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, a0.v, false);
        I0 = a("measurement.integration.disable_firebase_instance_id", bool, a0.f3755w, false);
        J0 = a("measurement.collection.service.update_with_analytics_fix", bool, a0.f3756x, false);
        K0 = a("measurement.service.storage_consent_support_version", 203600, a0.f3757y, false);
        L0 = a("measurement.service.store_null_safelist", bool2, a0.f3758z, false);
        M0 = a("measurement.service.store_safelist", bool2, a0.A, false);
        N0 = a("measurement.session_stitching_token_enabled", bool, a0.B, false);
        O0 = a("measurement.sgtm.client.upload_on_backgrounded.dev", bool, a0.C, true);
        P0 = a("measurement.gmscore_client_telemetry", bool, c0.f3838o, false);
        Q0 = a("measurement.rb.attribution.service", bool2, a0.D, true);
        R0 = a("measurement.rb.attribution.client2", bool2, a0.F, true);
        S0 = a("measurement.rb.attribution.uuid_generation", bool2, a0.G, false);
        T0 = a("measurement.rb.attribution.enable_trigger_redaction", bool2, a0.H, false);
        a("measurement.rb.attribution.followup1.service", bool, a0.I, false);
        U0 = a("measurement.rb.attribution.retry_disposition", bool, a0.J, false);
        V0 = a("measurement.client.sessions.enable_fix_background_engagement", bool, c0.f3840q, false);
        W0 = a("measurement.set_default_event_parameters_propagate_clear.service.dev", bool2, a0.K, false);
        X0 = a("measurement.set_default_event_parameters_propagate_clear.client.dev", bool2, a0.L, false);
        Y0 = a("measurement.service.ad_impression.convert_value_to_double", bool2, a0.M, false);
        a("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", bool2, a0.N, false);
        a("measurement.remove_conflicting_first_party_apis.dev", bool, c0.f3834b, false);
        Z0 = a("measurement.rb.attribution.service.trigger_uris_high_priority", bool2, q2.e.f8661r, false);
        f3915a1 = a("measurement.tcf.consent_fix", bool2, q2.e.f8662s, false);
        b1 = a("measurement.experiment.enable_phenotype_experiment_reporting", bool2, q2.e.f8663t, false);
        f3920c1 = a("measurement.set_default_event_parameters.fix_service_request_ordering", bool, q2.e.f8656m, false);
        d1 = a("measurement.set_default_event_parameters.fix_app_update_logging", bool2, q2.e.f8655l, false);
        f3925e1 = a("measurement.service.fix_stop_bundling_bug", bool2, q2.e.f8659p, false);
        f3927f1 = a("measurement.fix_params_logcat_spam", bool2, q2.e.f8658o, false);
        f3929g1 = a("measurement.gbraid_campaign.stop_lgclid", bool, c0.f3837n, false);
        f3931h1 = a("measurement.gbraid_compaign.compaign_params_triggering_info_update", "gclid,gbraid,gad_campaignid", q2.e.f8664u, false);
        f3933i1 = a("measurement.edpb.service", bool, q2.e.f8657n, false);
        f3935j1 = a("measurement.edpb.events_cached_in_no_data_mode", "_f,_v,_cmp", q2.e.v, false);
        f3938k1 = a("measurement.add_first_launch_logging_timestamp.service", bool, c0.f3839p, false);
        f3941l1 = a("measurement.overlapping_bundles_fix", bool, q2.e.f8665w, false);
    }

    public static e0 a(String str, Object obj, v vVar, boolean z9) {
        e0 e0Var = new e0(str, obj, vVar);
        if (z9) {
            f3914a.add(e0Var);
        }
        return e0Var;
    }
}
