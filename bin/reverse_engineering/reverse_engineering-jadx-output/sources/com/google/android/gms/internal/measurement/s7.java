package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class s7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n4 f2801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n4 f2802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n4 f2803c;

    static {
        a2.i iVar = new a2.i(m4.a(), true, true);
        iVar.l("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f2801a = iVar.l("measurement.audience.refresh_event_count_filters_timestamp", false);
        f2802b = iVar.l("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f2803c = iVar.l("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }
}
