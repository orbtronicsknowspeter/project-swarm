package e1;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l1.i f4047a;

    static {
        l1.b bVar = l1.d.f7053b;
        Object[] objArr = new Object[24];
        objArr[0] = "Version";
        objArr[1] = "GoogleConsent";
        objArr[2] = "VendorConsent";
        objArr[3] = "VendorLegitimateInterest";
        objArr[4] = "gdprApplies";
        objArr[5] = "EnableAdvertiserConsentMode";
        objArr[6] = "PolicyVersion";
        objArr[7] = "PurposeConsents";
        objArr[8] = "PurposeOneTreatment";
        objArr[9] = "Purpose1";
        objArr[10] = "Purpose3";
        objArr[11] = "Purpose4";
        System.arraycopy(new String[]{"Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics"}, 0, objArr, 12, 12);
        d0.b.u(24, objArr);
        f4047a = l1.d.g(24, objArr);
    }

    public static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static final boolean b(com.google.android.gms.internal.measurement.q4 q4Var, l1.n nVar, l1.n nVar2, l1.p pVar, char[] cArr, int i, int i6, int i10, String str, String str2, String str3, boolean z9, boolean z10) {
        h4 h4Var;
        char c9;
        int iC = c(q4Var);
        if (iC > 0 && (i6 != 1 || i != 1)) {
            cArr[iC] = '2';
        }
        if (g(q4Var, nVar2) == com.google.android.gms.internal.measurement.r4.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c9 = '3';
        } else {
            if (q4Var == com.google.android.gms.internal.measurement.q4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i10 == 1 && pVar.f7087m.equals(str)) {
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = '1';
                }
                return true;
            }
            if (nVar.containsKey(q4Var) && (h4Var = (h4) nVar.get(q4Var)) != null) {
                int iOrdinal = h4Var.ordinal();
                com.google.android.gms.internal.measurement.r4 r4Var = com.google.android.gms.internal.measurement.r4.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                if (iOrdinal != 0) {
                    com.google.android.gms.internal.measurement.r4 r4Var2 = com.google.android.gms.internal.measurement.r4.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return g(q4Var, nVar2) == r4Var ? f(q4Var, cArr, str3, z10) : e(q4Var, cArr, str2, z9);
                        }
                        if (iOrdinal == 3) {
                            return g(q4Var, nVar2) == r4Var2 ? e(q4Var, cArr, str2, z9) : f(q4Var, cArr, str3, z10);
                        }
                        c9 = '0';
                    } else if (g(q4Var, nVar2) != r4Var2) {
                        return f(q4Var, cArr, str3, z10);
                    }
                } else if (g(q4Var, nVar2) != r4Var) {
                    return e(q4Var, cArr, str2, z9);
                }
                c9 = '8';
            } else {
                c9 = '0';
            }
        }
        if (iC <= 0 || cArr[iC] == '2') {
            return false;
        }
        cArr[iC] = c9;
        return false;
    }

    public static final int c(com.google.android.gms.internal.measurement.q4 q4Var) {
        if (q4Var == com.google.android.gms.internal.measurement.q4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (q4Var == com.google.android.gms.internal.measurement.q4.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (q4Var == com.google.android.gms.internal.measurement.q4.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return q4Var == com.google.android.gms.internal.measurement.q4.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    public static final String d(com.google.android.gms.internal.measurement.q4 q4Var, String str, String str2) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(str) || str.length() < q4Var.a()) ? "0" : String.valueOf(str.charAt(q4Var.a() - 1));
        if (!TextUtils.isEmpty(str2) && str2.length() >= q4Var.a()) {
            strValueOf = String.valueOf(str2.charAt(q4Var.a() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    public static final boolean e(com.google.android.gms.internal.measurement.q4 q4Var, char[] cArr, String str, boolean z9) {
        char c9;
        int iC = c(q4Var);
        if (!z9) {
            c9 = '4';
        } else {
            if (str.length() >= q4Var.a()) {
                char cCharAt = str.charAt(q4Var.a() - 1);
                boolean z10 = cCharAt == '1';
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = cCharAt != '1' ? '6' : '1';
                }
                return z10;
            }
            c9 = '0';
        }
        if (iC > 0 && cArr[iC] != '2') {
            cArr[iC] = c9;
        }
        return false;
    }

    public static final boolean f(com.google.android.gms.internal.measurement.q4 q4Var, char[] cArr, String str, boolean z9) {
        char c9;
        int iC = c(q4Var);
        if (!z9) {
            c9 = '5';
        } else {
            if (str.length() >= q4Var.a()) {
                char cCharAt = str.charAt(q4Var.a() - 1);
                boolean z10 = cCharAt == '1';
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = cCharAt != '1' ? '7' : '1';
                }
                return z10;
            }
            c9 = '0';
        }
        if (iC > 0 && cArr[iC] != '2') {
            cArr[iC] = c9;
        }
        return false;
    }

    public static final com.google.android.gms.internal.measurement.r4 g(com.google.android.gms.internal.measurement.q4 q4Var, l1.n nVar) {
        Object obj = nVar.get(q4Var);
        if (obj == null) {
            obj = com.google.android.gms.internal.measurement.r4.PURPOSE_RESTRICTION_UNDEFINED;
        }
        return (com.google.android.gms.internal.measurement.r4) obj;
    }
}
