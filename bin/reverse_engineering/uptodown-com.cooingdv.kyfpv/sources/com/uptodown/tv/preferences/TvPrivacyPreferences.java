package com.uptodown.tv.preferences;

import android.app.ActionBar;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import com.google.android.gms.internal.measurement.z3;
import com.uptodown.R;
import com.uptodown.tv.preferences.TvPrivacyPreferences;
import d4.e;
import j5.c;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class TvPrivacyPreferences extends e {

    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    public static final class a extends PreferenceFragmentCompat {
        @Override // androidx.preference.PreferenceFragmentCompat
        public final void onCreatePreferences(Bundle bundle, String str) {
            getPreferenceManager().setSharedPreferencesName("SettingsPreferences");
            addPreferencesFromResource(R.xml.tv_privacy_preferences);
            Preference preferenceFindPreference = findPreference("right_to_be_forgotten");
            preferenceFindPreference.getClass();
            final int i = 0;
            preferenceFindPreference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener(this) { // from class: d5.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TvPrivacyPreferences.a f3600b;

                {
                    this.f3600b = this;
                }

                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public final boolean onPreferenceClick(Preference preference) {
                    int i6 = i;
                    TvPrivacyPreferences.a aVar = this.f3600b;
                    switch (i6) {
                        case 0:
                            preference.getClass();
                            FragmentActivity fragmentActivityRequireActivity = aVar.requireActivity();
                            fragmentActivityRequireActivity.getClass();
                            String string = aVar.getString(R.string.url_contact);
                            string.getClass();
                            c.e(fragmentActivityRequireActivity, string, null);
                            break;
                        case 1:
                            preference.getClass();
                            Context contextRequireContext = aVar.requireContext();
                            contextRequireContext.getClass();
                            z3.M(contextRequireContext, "gdpr_requested", true);
                            Context contextRequireContext2 = aVar.requireContext();
                            contextRequireContext2.getClass();
                            z3.M(contextRequireContext2, "gdpr_analytics_allowed", true);
                            Context contextRequireContext3 = aVar.requireContext();
                            contextRequireContext3.getClass();
                            z3.M(contextRequireContext3, "gdpr_crashlytics_allowed", true);
                            Context contextRequireContext4 = aVar.requireContext();
                            contextRequireContext4.getClass();
                            z3.M(contextRequireContext4, "gdpr_tracking_allowed", true);
                            aVar.requireActivity().finish();
                            break;
                        default:
                            preference.getClass();
                            Context contextRequireContext5 = aVar.requireContext();
                            contextRequireContext5.getClass();
                            z3.M(contextRequireContext5, "gdpr_requested", false);
                            Context contextRequireContext6 = aVar.requireContext();
                            contextRequireContext6.getClass();
                            z3.M(contextRequireContext6, "gdpr_analytics_allowed", false);
                            Context contextRequireContext7 = aVar.requireContext();
                            contextRequireContext7.getClass();
                            z3.M(contextRequireContext7, "gdpr_crashlytics_allowed", false);
                            Context contextRequireContext8 = aVar.requireContext();
                            contextRequireContext8.getClass();
                            z3.M(contextRequireContext8, "gdpr_tracking_allowed", false);
                            aVar.requireActivity().finish();
                            break;
                    }
                    return true;
                }
            });
            Preference preferenceFindPreference2 = findPreference("privacy_accept_all");
            preferenceFindPreference2.getClass();
            final int i6 = 1;
            preferenceFindPreference2.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener(this) { // from class: d5.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TvPrivacyPreferences.a f3600b;

                {
                    this.f3600b = this;
                }

                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public final boolean onPreferenceClick(Preference preference) {
                    int i62 = i6;
                    TvPrivacyPreferences.a aVar = this.f3600b;
                    switch (i62) {
                        case 0:
                            preference.getClass();
                            FragmentActivity fragmentActivityRequireActivity = aVar.requireActivity();
                            fragmentActivityRequireActivity.getClass();
                            String string = aVar.getString(R.string.url_contact);
                            string.getClass();
                            c.e(fragmentActivityRequireActivity, string, null);
                            break;
                        case 1:
                            preference.getClass();
                            Context contextRequireContext = aVar.requireContext();
                            contextRequireContext.getClass();
                            z3.M(contextRequireContext, "gdpr_requested", true);
                            Context contextRequireContext2 = aVar.requireContext();
                            contextRequireContext2.getClass();
                            z3.M(contextRequireContext2, "gdpr_analytics_allowed", true);
                            Context contextRequireContext3 = aVar.requireContext();
                            contextRequireContext3.getClass();
                            z3.M(contextRequireContext3, "gdpr_crashlytics_allowed", true);
                            Context contextRequireContext4 = aVar.requireContext();
                            contextRequireContext4.getClass();
                            z3.M(contextRequireContext4, "gdpr_tracking_allowed", true);
                            aVar.requireActivity().finish();
                            break;
                        default:
                            preference.getClass();
                            Context contextRequireContext5 = aVar.requireContext();
                            contextRequireContext5.getClass();
                            z3.M(contextRequireContext5, "gdpr_requested", false);
                            Context contextRequireContext6 = aVar.requireContext();
                            contextRequireContext6.getClass();
                            z3.M(contextRequireContext6, "gdpr_analytics_allowed", false);
                            Context contextRequireContext7 = aVar.requireContext();
                            contextRequireContext7.getClass();
                            z3.M(contextRequireContext7, "gdpr_crashlytics_allowed", false);
                            Context contextRequireContext8 = aVar.requireContext();
                            contextRequireContext8.getClass();
                            z3.M(contextRequireContext8, "gdpr_tracking_allowed", false);
                            aVar.requireActivity().finish();
                            break;
                    }
                    return true;
                }
            });
            Preference preferenceFindPreference3 = findPreference("privacy_decline_all");
            preferenceFindPreference3.getClass();
            final int i10 = 2;
            preferenceFindPreference3.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener(this) { // from class: d5.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TvPrivacyPreferences.a f3600b;

                {
                    this.f3600b = this;
                }

                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public final boolean onPreferenceClick(Preference preference) {
                    int i62 = i10;
                    TvPrivacyPreferences.a aVar = this.f3600b;
                    switch (i62) {
                        case 0:
                            preference.getClass();
                            FragmentActivity fragmentActivityRequireActivity = aVar.requireActivity();
                            fragmentActivityRequireActivity.getClass();
                            String string = aVar.getString(R.string.url_contact);
                            string.getClass();
                            c.e(fragmentActivityRequireActivity, string, null);
                            break;
                        case 1:
                            preference.getClass();
                            Context contextRequireContext = aVar.requireContext();
                            contextRequireContext.getClass();
                            z3.M(contextRequireContext, "gdpr_requested", true);
                            Context contextRequireContext2 = aVar.requireContext();
                            contextRequireContext2.getClass();
                            z3.M(contextRequireContext2, "gdpr_analytics_allowed", true);
                            Context contextRequireContext3 = aVar.requireContext();
                            contextRequireContext3.getClass();
                            z3.M(contextRequireContext3, "gdpr_crashlytics_allowed", true);
                            Context contextRequireContext4 = aVar.requireContext();
                            contextRequireContext4.getClass();
                            z3.M(contextRequireContext4, "gdpr_tracking_allowed", true);
                            aVar.requireActivity().finish();
                            break;
                        default:
                            preference.getClass();
                            Context contextRequireContext5 = aVar.requireContext();
                            contextRequireContext5.getClass();
                            z3.M(contextRequireContext5, "gdpr_requested", false);
                            Context contextRequireContext6 = aVar.requireContext();
                            contextRequireContext6.getClass();
                            z3.M(contextRequireContext6, "gdpr_analytics_allowed", false);
                            Context contextRequireContext7 = aVar.requireContext();
                            contextRequireContext7.getClass();
                            z3.M(contextRequireContext7, "gdpr_crashlytics_allowed", false);
                            Context contextRequireContext8 = aVar.requireContext();
                            contextRequireContext8.getClass();
                            z3.M(contextRequireContext8, "gdpr_tracking_allowed", false);
                            aVar.requireActivity().finish();
                            break;
                    }
                    return true;
                }
            });
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        getSupportFragmentManager().beginTransaction().replace(android.R.id.content, new a()).commit();
    }
}
