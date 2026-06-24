package c4;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBindings;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.uptodown.R;
import com.uptodown.activities.VirusTotalReport;
import com.uptodown.activities.YouTubeActivity;
import com.uptodown.activities.preferences.AdvancedPreferencesActivity;
import com.uptodown.activities.preferences.MobileDataUsageActivity;
import com.uptodown.views.DonutChartView;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w6 implements d7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2264b;

    public /* synthetic */ w6(Object obj, int i) {
        this.f2263a = i;
        this.f2264b = obj;
    }

    private final Object a() {
        VirusTotalReport virusTotalReport = (VirusTotalReport) this.f2264b;
        int i = VirusTotalReport.Q;
        View viewInflate = virusTotalReport.getLayoutInflater().inflate(R.layout.virus_total_report, (ViewGroup) null, false);
        int i6 = R.id.header_installed_app;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.header_installed_app);
        if (viewFindChildViewById != null) {
            int i10 = R.id.iv_logo_app;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.iv_logo_app);
            if (imageView != null) {
                i10 = R.id.tv_app_author;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.tv_app_author);
                if (textView != null) {
                    i10 = R.id.tv_app_name;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.tv_app_name);
                    if (textView2 != null) {
                        i10 = R.id.tv_app_version;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.tv_app_version);
                        if (textView3 != null) {
                            a4.d0 d0Var = new a4.d0((RelativeLayout) viewFindChildViewById, imageView, textView, textView2, textView3, 9);
                            i6 = R.id.iv_arrow_transparency_center_vt;
                            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_arrow_transparency_center_vt)) != null) {
                                i6 = R.id.iv_arrow_uptodown_safe_vt;
                                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_arrow_uptodown_safe_vt)) != null) {
                                    i6 = R.id.iv_transparency_center_vt;
                                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_transparency_center_vt)) != null) {
                                        i6 = R.id.iv_uptodown_safe_vt;
                                        if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_uptodown_safe_vt)) != null) {
                                            i6 = R.id.ll_report_vtr;
                                            if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.ll_report_vtr)) != null) {
                                                i6 = R.id.ll_sha;
                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.ll_sha);
                                                if (linearLayout != null) {
                                                    i6 = R.id.ll_signature;
                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.ll_signature);
                                                    if (linearLayout2 != null) {
                                                        i6 = R.id.loading_view_virus_total_report;
                                                        View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.loading_view_virus_total_report);
                                                        if (viewFindChildViewById2 != null) {
                                                            i6 = R.id.rl_transparency_center;
                                                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(viewInflate, R.id.rl_transparency_center);
                                                            if (relativeLayout != null) {
                                                                i6 = R.id.rl_uptodown_safe;
                                                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(viewInflate, R.id.rl_uptodown_safe);
                                                                if (relativeLayout2 != null) {
                                                                    i6 = R.id.rl_virus_total_result_container;
                                                                    RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(viewInflate, R.id.rl_virus_total_result_container);
                                                                    if (relativeLayout3 != null) {
                                                                        i6 = R.id.sv_report_vtr;
                                                                        if (((ScrollView) ViewBindings.findChildViewById(viewInflate, R.id.sv_report_vtr)) != null) {
                                                                            i6 = R.id.toolbar_vtr;
                                                                            Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(viewInflate, R.id.toolbar_vtr);
                                                                            if (toolbar != null) {
                                                                                i6 = R.id.tv_full_report_vtr;
                                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_full_report_vtr);
                                                                                if (textView4 != null) {
                                                                                    i6 = R.id.tv_label_full_report_vtr;
                                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_label_full_report_vtr);
                                                                                    if (textView5 != null) {
                                                                                        i6 = R.id.tv_sha256_label_vtr;
                                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_sha256_label_vtr);
                                                                                        if (textView6 != null) {
                                                                                            i6 = R.id.tv_sha256_value_vtr;
                                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_sha256_value_vtr);
                                                                                            if (textView7 != null) {
                                                                                                i6 = R.id.tv_signature_label_vtr;
                                                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_signature_label_vtr);
                                                                                                if (textView8 != null) {
                                                                                                    i6 = R.id.tv_signature_value_vtr;
                                                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_signature_value_vtr);
                                                                                                    if (textView9 != null) {
                                                                                                        i6 = R.id.tv_toolbar_vtr;
                                                                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_toolbar_vtr);
                                                                                                        if (textView10 != null) {
                                                                                                            i6 = R.id.tv_transparency_center_subtitle;
                                                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_transparency_center_subtitle);
                                                                                                            if (textView11 != null) {
                                                                                                                i6 = R.id.tv_transparency_center_title;
                                                                                                                TextView textView12 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_transparency_center_title);
                                                                                                                if (textView12 != null) {
                                                                                                                    i6 = R.id.tv_uptodown_safe_subtitle;
                                                                                                                    TextView textView13 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_uptodown_safe_subtitle);
                                                                                                                    if (textView13 != null) {
                                                                                                                        i6 = R.id.tv_uptodown_safe_title;
                                                                                                                        TextView textView14 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_uptodown_safe_title);
                                                                                                                        if (textView14 != null) {
                                                                                                                            return new t4.j1((RelativeLayout) viewInflate, d0Var, linearLayout, linearLayout2, viewFindChildViewById2, relativeLayout, relativeLayout2, relativeLayout3, toolbar, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewFindChildViewById.getResources().getResourceName(i10)));
            return null;
        }
        com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i6)));
        return null;
    }

    private final Object b() {
        YouTubeActivity youTubeActivity = (YouTubeActivity) this.f2264b;
        int i = YouTubeActivity.Q;
        View viewInflate = youTubeActivity.getLayoutInflater().inflate(R.layout.video_youtube, (ViewGroup) null, false);
        int i6 = R.id.youtube_full_screen;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.youtube_full_screen);
        if (frameLayout != null) {
            i6 = R.id.youtube_view;
            YouTubePlayerView youTubePlayerView = (YouTubePlayerView) ViewBindings.findChildViewById(viewInflate, R.id.youtube_view);
            if (youTubePlayerView != null) {
                return new t4.i1((RelativeLayout) viewInflate, frameLayout, youTubePlayerView);
            }
        }
        com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i6)));
        return null;
    }

    private final Object c() {
        AdvancedPreferencesActivity advancedPreferencesActivity = (AdvancedPreferencesActivity) this.f2264b;
        int i = AdvancedPreferencesActivity.Q;
        View viewInflate = advancedPreferencesActivity.getLayoutInflater().inflate(R.layout.advanced_preferences_activity, (ViewGroup) null, false);
        int i6 = R.id.ll_advanced_preferences_list;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.ll_advanced_preferences_list);
        if (linearLayout != null) {
            LinearLayout linearLayout2 = (LinearLayout) viewInflate;
            int i10 = R.id.toolbar_advanced_preferences;
            Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(viewInflate, R.id.toolbar_advanced_preferences);
            if (toolbar != null) {
                i10 = R.id.tv_toolbar_title_advanced_preferences;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_toolbar_title_advanced_preferences);
                if (textView != null) {
                    return new t4.a(linearLayout2, linearLayout, toolbar, textView);
                }
            }
            i6 = i10;
        }
        com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i6)));
        return null;
    }

    private final Object d() {
        MobileDataUsageActivity mobileDataUsageActivity = (MobileDataUsageActivity) this.f2264b;
        int i = MobileDataUsageActivity.Q;
        View viewInflate = mobileDataUsageActivity.getLayoutInflater().inflate(R.layout.mobile_data_usage_activity, (ViewGroup) null, false);
        int i6 = R.id.donut_chart;
        DonutChartView donutChartView = (DonutChartView) ViewBindings.findChildViewById(viewInflate, R.id.donut_chart);
        if (donutChartView != null) {
            i6 = R.id.ll_downloads_mobile_data_usage;
            if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.ll_downloads_mobile_data_usage)) != null) {
                i6 = R.id.ll_images_mobile_data_usage;
                if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.ll_images_mobile_data_usage)) != null) {
                    i6 = R.id.ll_metadata_mobile_data_usage;
                    if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.ll_metadata_mobile_data_usage)) != null) {
                        i6 = R.id.ll_updates_mobile_data_usage;
                        if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.ll_updates_mobile_data_usage)) != null) {
                            i6 = R.id.loading_view_mobile_data_usage;
                            if (ViewBindings.findChildViewById(viewInflate, R.id.loading_view_mobile_data_usage) != null) {
                                i6 = R.id.rl_billing_cycle_mobile_data_usage;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(viewInflate, R.id.rl_billing_cycle_mobile_data_usage);
                                if (relativeLayout != null) {
                                    i6 = R.id.rl_updates_setting_mobile_data_usage;
                                    if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.rl_updates_setting_mobile_data_usage)) != null) {
                                        i6 = R.id.sc_autoplay_mobile_data_usage;
                                        SwitchCompat switchCompat = (SwitchCompat) ViewBindings.findChildViewById(viewInflate, R.id.sc_autoplay_mobile_data_usage);
                                        if (switchCompat != null) {
                                            i6 = R.id.toolbar_mobile_data_usage;
                                            Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(viewInflate, R.id.toolbar_mobile_data_usage);
                                            if (toolbar != null) {
                                                i6 = R.id.tv_autoplay_setting_mobile_data_usage;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_autoplay_setting_mobile_data_usage);
                                                if (textView != null) {
                                                    i6 = R.id.tv_billing_cycle_desc_mobile_data_usage;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_billing_cycle_desc_mobile_data_usage);
                                                    if (textView2 != null) {
                                                        i6 = R.id.tv_billing_cycle_mobile_data_usage;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_billing_cycle_mobile_data_usage);
                                                        if (textView3 != null) {
                                                            i6 = R.id.tv_downloads_mobile_data_usage;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_downloads_mobile_data_usage);
                                                            if (textView4 != null) {
                                                                i6 = R.id.tv_image_description_setting_mobile_data_usage;
                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_image_description_setting_mobile_data_usage);
                                                                if (textView5 != null) {
                                                                    i6 = R.id.tv_image_setting_mobile_data_usage;
                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_image_setting_mobile_data_usage);
                                                                    if (textView6 != null) {
                                                                        i6 = R.id.tv_images_mobile_data_usage;
                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_images_mobile_data_usage);
                                                                        if (textView7 != null) {
                                                                            i6 = R.id.tv_low_quality_mobile_data_usage;
                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_low_quality_mobile_data_usage);
                                                                            if (textView8 != null) {
                                                                                i6 = R.id.tv_metadata_mobile_data_usage;
                                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_metadata_mobile_data_usage);
                                                                                if (textView9 != null) {
                                                                                    i6 = R.id.tv_mobile_data_usage;
                                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_mobile_data_usage);
                                                                                    if (textView10 != null) {
                                                                                        i6 = R.id.tv_month_mobile_data_usage;
                                                                                        TextView textView11 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_month_mobile_data_usage);
                                                                                        if (textView11 != null) {
                                                                                            i6 = R.id.tv_quality_auto_mobile_data_usage;
                                                                                            TextView textView12 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_quality_auto_mobile_data_usage);
                                                                                            if (textView12 != null) {
                                                                                                i6 = R.id.tv_set_day_mobile_data_usage;
                                                                                                TextView textView13 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_set_day_mobile_data_usage);
                                                                                                if (textView13 != null) {
                                                                                                    i6 = R.id.tv_sync_auto_mobile_data_usage;
                                                                                                    TextView textView14 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_sync_auto_mobile_data_usage);
                                                                                                    if (textView14 != null) {
                                                                                                        i6 = R.id.tv_sync_description_setting_mobile_data_usage;
                                                                                                        TextView textView15 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_sync_description_setting_mobile_data_usage);
                                                                                                        if (textView15 != null) {
                                                                                                            i6 = R.id.tv_sync_reduced_mobile_data_usage;
                                                                                                            TextView textView16 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_sync_reduced_mobile_data_usage);
                                                                                                            if (textView16 != null) {
                                                                                                                i6 = R.id.tv_sync_setting_mobile_data_usage;
                                                                                                                TextView textView17 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_sync_setting_mobile_data_usage);
                                                                                                                if (textView17 != null) {
                                                                                                                    i6 = R.id.tv_title_data_usage;
                                                                                                                    TextView textView18 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_title_data_usage);
                                                                                                                    if (textView18 != null) {
                                                                                                                        i6 = R.id.tv_today_mobile_data_usage;
                                                                                                                        TextView textView19 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_today_mobile_data_usage);
                                                                                                                        if (textView19 != null) {
                                                                                                                            i6 = R.id.tv_updates_auto_update_mobile_data_usage;
                                                                                                                            TextView textView20 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_updates_auto_update_mobile_data_usage);
                                                                                                                            if (textView20 != null) {
                                                                                                                                i6 = R.id.tv_updates_description_mobile_data_usage;
                                                                                                                                TextView textView21 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_updates_description_mobile_data_usage);
                                                                                                                                if (textView21 != null) {
                                                                                                                                    i6 = R.id.tv_updates_mobile_data_usage;
                                                                                                                                    TextView textView22 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_updates_mobile_data_usage);
                                                                                                                                    if (textView22 != null) {
                                                                                                                                        i6 = R.id.tv_updates_notify_only_mobile_data_usage;
                                                                                                                                        TextView textView23 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_updates_notify_only_mobile_data_usage);
                                                                                                                                        if (textView23 != null) {
                                                                                                                                            i6 = R.id.tv_updates_setting_mobile_data_usage;
                                                                                                                                            TextView textView24 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_updates_setting_mobile_data_usage);
                                                                                                                                            if (textView24 != null) {
                                                                                                                                                i6 = R.id.tv_week_mobile_data_usage;
                                                                                                                                                TextView textView25 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_week_mobile_data_usage);
                                                                                                                                                if (textView25 != null) {
                                                                                                                                                    i6 = R.id.tv_wifi_data_usage;
                                                                                                                                                    TextView textView26 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_wifi_data_usage);
                                                                                                                                                    if (textView26 != null) {
                                                                                                                                                        i6 = R.id.v_separator_billing_cycle_mobile_data_usage;
                                                                                                                                                        if (ViewBindings.findChildViewById(viewInflate, R.id.v_separator_billing_cycle_mobile_data_usage) != null) {
                                                                                                                                                            return new t4.v((RelativeLayout) viewInflate, donutChartView, relativeLayout, switchCompat, toolbar, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, textView23, textView24, textView25, textView26);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i6)));
        return null;
    }

    private final Object e() {
        return t4.x0.a(((u4.d) this.f2264b).getLayoutInflater());
    }

    private final Object f() {
        View viewInflate = ((u4.w0) this.f2264b).getLayoutInflater().inflate(R.layout.apps_category_fragment, (ViewGroup) null, false);
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        int i = R.id.loading_view_apps_category_fragment;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.loading_view_apps_category_fragment);
        if (viewFindChildViewById != null) {
            i = R.id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view);
            if (recyclerView != null) {
                i = R.id.tv_no_data_apps_category_fragment;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_no_data_apps_category_fragment);
                if (textView != null) {
                    i = R.id.tv_reload_apps_category_fragment;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_reload_apps_category_fragment);
                    if (textView2 != null) {
                        return new t4.f(frameLayout, viewFindChildViewById, recyclerView, textView, textView2);
                    }
                }
            }
        }
        com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    private final Object g() {
        View viewInflate = ((u4.f1) this.f2264b).getLayoutInflater().inflate(R.layout.feed_fragment, (ViewGroup) null, false);
        int i = R.id.iv_avatar_user_ff;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_avatar_user_ff);
        if (imageView != null) {
            i = R.id.iv_badge_user_ff;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_badge_user_ff);
            if (imageView2 != null) {
                i = R.id.iv_email_ff;
                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_email_ff)) != null) {
                    i = R.id.iv_google_ff;
                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_google_ff)) != null) {
                        i = R.id.ll_login_ff;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.ll_login_ff);
                        if (linearLayout != null) {
                            i = R.id.ll_no_data_feed;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.ll_no_data_feed);
                            if (linearLayout2 != null) {
                                i = R.id.loading_view_feed;
                                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.loading_view_feed);
                                if (viewFindChildViewById != null) {
                                    i = R.id.rl_avatar_user_ff;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(viewInflate, R.id.rl_avatar_user_ff);
                                    if (relativeLayout != null) {
                                        i = R.id.rl_login_email_ff;
                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(viewInflate, R.id.rl_login_email_ff);
                                        if (relativeLayout2 != null) {
                                            i = R.id.rl_login_google_ff;
                                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(viewInflate, R.id.rl_login_google_ff);
                                            if (relativeLayout3 != null) {
                                                i = R.id.rv_feed;
                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.rv_feed);
                                                if (recyclerView != null) {
                                                    i = R.id.srl_feed;
                                                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.findChildViewById(viewInflate, R.id.srl_feed);
                                                    if (swipeRefreshLayout != null) {
                                                        i = R.id.tv_login_email_ff;
                                                        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_login_email_ff);
                                                        if (textView != null) {
                                                            i = R.id.tv_login_google_ff;
                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_login_google_ff);
                                                            if (textView2 != null) {
                                                                i = R.id.tv_login_msg_ff;
                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_login_msg_ff);
                                                                if (textView3 != null) {
                                                                    i = R.id.tv_no_data_feed;
                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_no_data_feed);
                                                                    if (textView4 != null) {
                                                                        i = R.id.tv_reload_feed;
                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_reload_feed);
                                                                        if (textView5 != null) {
                                                                            i = R.id.tv_title_ff;
                                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_title_ff);
                                                                            if (textView6 != null) {
                                                                                return new t4.k((RelativeLayout) viewInflate, imageView, imageView2, linearLayout, linearLayout2, viewFindChildViewById, relativeLayout, relativeLayout2, relativeLayout3, recyclerView, swipeRefreshLayout, textView, textView2, textView3, textView4, textView5, textView6);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    private final Object h() {
        View viewInflate = ((u4.g1) this.f2264b).getLayoutInflater().inflate(R.layout.games_category_fragment, (ViewGroup) null, false);
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        int i = R.id.loading_view_games_category_fragment;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.loading_view_games_category_fragment);
        if (viewFindChildViewById != null) {
            i = R.id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view);
            if (recyclerView != null) {
                i = R.id.tv_no_data_games_category_fragment;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_no_data_games_category_fragment);
                if (textView != null) {
                    i = R.id.tv_reload_games_category_fragment;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_reload_games_category_fragment);
                    if (textView2 != null) {
                        return new t4.o(frameLayout, viewFindChildViewById, recyclerView, textView, textView2);
                    }
                }
            }
        }
        com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    private final Object i() {
        View viewInflate = ((u4.m1) this.f2264b).getLayoutInflater().inflate(R.layout.home_fragment, (ViewGroup) null, false);
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        int i = R.id.ll_no_data_home_fragment;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.ll_no_data_home_fragment);
        if (linearLayout != null) {
            i = R.id.loading_view_home_fragment;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.loading_view_home_fragment);
            if (viewFindChildViewById != null) {
                i = R.id.recycler_view_home;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_home);
                if (recyclerView != null) {
                    i = R.id.tv_no_data_home_fragment;
                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_no_data_home_fragment);
                    if (textView != null) {
                        i = R.id.tv_reload_home_fragment;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_reload_home_fragment);
                        if (textView2 != null) {
                            return new t4.p(frameLayout, linearLayout, viewFindChildViewById, recyclerView, textView, textView2);
                        }
                    }
                }
            }
        }
        com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    private final Object j() {
        return t4.x0.a(((u4.z1) this.f2264b).getLayoutInflater());
    }

    /* JADX WARN: Removed duplicated region for block: B:431:0x0aed A[PHI: r3
      0x0aed: PHI (r3v65 int) = 
      (r3v64 int)
      (r3v66 int)
      (r3v67 int)
      (r3v68 int)
      (r3v69 int)
      (r3v70 int)
      (r3v71 int)
      (r3v72 int)
      (r3v73 int)
      (r3v74 int)
      (r3v75 int)
      (r3v76 int)
      (r3v77 int)
     binds: [B:381:0x09bd, B:383:0x09c8, B:385:0x09d4, B:387:0x09e0, B:389:0x09ec, B:391:0x09f8, B:393:0x0a04, B:395:0x0a11, B:397:0x0a1e, B:399:0x0a2b, B:401:0x0a36, B:403:0x0a3f, B:405:0x0a4c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0c03 A[PHI: r3
      0x0c03: PHI (r3v41 int) = 
      (r3v40 int)
      (r3v42 int)
      (r3v43 int)
      (r3v44 int)
      (r3v45 int)
      (r3v46 int)
      (r3v47 int)
      (r3v48 int)
      (r3v49 int)
      (r3v50 int)
     binds: [B:435:0x0b17, B:437:0x0b23, B:439:0x0b2f, B:441:0x0b3b, B:443:0x0b47, B:445:0x0b50, B:447:0x0b59, B:449:0x0b66, B:451:0x0b6f, B:453:0x0b7c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // d7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke() {
        /*
            Method dump skipped, instruction units count: 3726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.w6.invoke():java.lang.Object");
    }
}
