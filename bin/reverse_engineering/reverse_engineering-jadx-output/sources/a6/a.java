package a6;

import java.util.Collections;
import java.util.Map;
import p6.i;
import q6.a0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f207b;

    static {
        Map mapSingletonMap = Collections.singletonMap("core", new String[]{"version", "created", "lastUpdated", "cmpId", "cmpVersion", "consentScreen", "consentLanguage", "vendorListVersion", "purposeConsents", "vendorConsents"});
        mapSingletonMap.getClass();
        f206a = mapSingletonMap;
        f207b = a0.i0(new i("core", new String[]{"version", "created", "lastUpdated", "cmpId", "cmpVersion", "consentScreen", "consentLanguage", "vendorListVersion", "policyVersion", "isServiceSpecific", "useNonStandardStacks", "specialFeatureOptions", "purposeConsents", "purposeLegitimateInterests", "purposeOneTreatment", "publisherCountryCode", "vendorConsents", "vendorLegitimateInterests", "publisherRestrictions"}), new i("publisherTC", new String[]{"publisherConsents", "publisherLegitimateInterests", "numCustomPurposes", "publisherCustomConsents", "publisherCustomLegitimateInterests"}), new i("vendorsAllowed", new String[]{"vendorsAllowed"}), new i("vendorsDisclosed", new String[]{"vendorsDisclosed"}));
    }
}
