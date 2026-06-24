package k9;

import h9.g;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static g a(String str) {
        str.getClass();
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("coreUiLabels");
            String strOptString = jSONObject.optString("initScreenTitle");
            strOptString.getClass();
            String strOptString2 = jSONObject.optString("agreeButton");
            strOptString2.getClass();
            String strOptString3 = jSONObject.optString("agreeAllButton");
            strOptString3.getClass();
            String strOptString4 = jSONObject.optString("initScreenRejectButton");
            strOptString4.getClass();
            String strOptString5 = jSONObject.optString("initScreenSettingsButton");
            strOptString5.getClass();
            ArrayList arrayListQ = d0.b.q(jSONObject, "summaryScreenBodyNoRejectService");
            ArrayList arrayListQ2 = d0.b.q(jSONObject, "summaryScreenBodyNoRejectGlobal");
            ArrayList arrayListQ3 = d0.b.q(jSONObject, "summaryScreenBodyNoRejectGroup");
            ArrayList arrayListQ4 = d0.b.q(jSONObject, "summaryScreenBodyRejectService");
            ArrayList arrayListQ5 = d0.b.q(jSONObject, "summaryScreenBodyRejectGlobal");
            ArrayList arrayListQ6 = d0.b.q(jSONObject, "summaryScreenBodyRejectGroup");
            String strOptString6 = jSONObject.optString("initScreenBodyGlobal");
            strOptString6.getClass();
            String strOptString7 = jSONObject.optString("initScreenBodyService");
            strOptString7.getClass();
            String strOptString8 = jSONObject.optString("initScreenBodyGroup");
            strOptString8.getClass();
            String strOptString9 = jSONObject.optString("specialPurposesAndFeatures");
            strOptString9.getClass();
            String strOptString10 = jSONObject.optString("saveAndExitButton");
            strOptString10.getClass();
            String strOptString11 = jSONObject.optString("purposeScreenVendorLink");
            strOptString11.getClass();
            String strOptString12 = jSONObject.optString("legitimateInterestLink");
            strOptString12.getClass();
            String strOptString13 = jSONObject.optString("specialPurposesLabel");
            strOptString13.getClass();
            String strOptString14 = jSONObject.optString("specialFeaturesLabel");
            strOptString14.getClass();
            String strOptString15 = jSONObject.optString("featuresLabel");
            strOptString15.getClass();
            String strOptString16 = jSONObject.optString("dataDeclarationLabel");
            strOptString16.getClass();
            String strOptString17 = jSONObject.optString("back");
            strOptString17.getClass();
            String strOptString18 = jSONObject.optString("onLabel");
            strOptString18.getClass();
            String strOptString19 = jSONObject.optString("offLabel");
            strOptString19.getClass();
            String strOptString20 = jSONObject.optString("multiLabel");
            strOptString20.getClass();
            String strOptString21 = jSONObject.optString("legalDescription");
            strOptString21.getClass();
            String strOptString22 = jSONObject.optString("showPartners");
            strOptString22.getClass();
            String strOptString23 = jSONObject.optString("hidePartners");
            strOptString23.getClass();
            String strOptString24 = jSONObject.optString("vendorScreenBody");
            strOptString24.getClass();
            String strOptString25 = jSONObject.optString("privacyPolicyLabel");
            strOptString25.getClass();
            String strOptString26 = jSONObject.optString("descriptionLabel");
            strOptString26.getClass();
            String strOptString27 = jSONObject.optString("legitimateScreenBody");
            strOptString27.getClass();
            String strOptString28 = jSONObject.optString("legitimateInterestPurposesLabel");
            strOptString28.getClass();
            String strOptString29 = jSONObject.optString("legitimateInterestVendorLabel");
            strOptString29.getClass();
            String strOptString30 = jSONObject.optString("legitimateScreenObject");
            strOptString30.getClass();
            String strOptString31 = jSONObject.optString("legitimateScreenObjected");
            strOptString31.getClass();
            String strOptString32 = jSONObject.optString("legitimateScreenAccept");
            strOptString32.getClass();
            String strOptString33 = jSONObject.optString("objectAllButton");
            strOptString33.getClass();
            String strOptString34 = jSONObject.optString("persistentConsentLinkLabel");
            strOptString34.getClass();
            String strOptString35 = jSONObject.optString("nonIabVendorsNotice");
            strOptString35.getClass();
            String strOptString36 = jSONObject.optString("googlePartners");
            strOptString36.getClass();
            String strOptString37 = jSONObject.optString("purposesLabel");
            strOptString37.getClass();
            String strOptString38 = jSONObject.optString("cookieMaxAgeLabel");
            strOptString38.getClass();
            String strOptString39 = jSONObject.optString("daysLabel");
            strOptString39.getClass();
            String strOptString40 = jSONObject.optString("secondsLabel");
            strOptString40.getClass();
            String strOptString41 = jSONObject.optString("cookieAccessLabel");
            strOptString41.getClass();
            String strOptString42 = jSONObject.optString("yesLabel");
            strOptString42.getClass();
            String strOptString43 = jSONObject.optString("noLabel");
            strOptString43.getClass();
            String strOptString44 = jSONObject.optString("storageDisclosureLabel");
            strOptString44.getClass();
            String strOptString45 = jSONObject.optString("dataRetentionDays");
            strOptString45.getClass();
            String strOptString46 = jSONObject.optString("legitimateInterestPrivacyLink");
            strOptString46.getClass();
            return new g(strOptString, strOptString2, strOptString3, strOptString4, strOptString5, arrayListQ, arrayListQ2, arrayListQ3, arrayListQ4, arrayListQ5, arrayListQ6, strOptString6, strOptString7, strOptString8, strOptString9, strOptString10, strOptString11, strOptString12, strOptString13, strOptString14, strOptString15, strOptString16, strOptString17, strOptString18, strOptString19, strOptString20, strOptString21, strOptString22, strOptString23, strOptString24, strOptString25, strOptString26, strOptString27, strOptString28, strOptString29, strOptString30, strOptString31, strOptString32, strOptString33, strOptString34, strOptString35, strOptString36, strOptString37, strOptString38, strOptString39, strOptString40, strOptString41, strOptString42, strOptString43, strOptString44, strOptString45, strOptString46);
        } catch (JSONException unused) {
            return new g();
        }
    }
}
