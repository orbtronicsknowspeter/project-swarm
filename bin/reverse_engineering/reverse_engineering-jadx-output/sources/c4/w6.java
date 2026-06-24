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
        View viewInflate = virusTotalReport.getLayoutInflater().inflate(2131558881, (ViewGroup) null, false);
        int i6 = 2131362241;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, 2131362241);
        if (viewFindChildViewById != null) {
            int i10 = 2131362413;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewFindChildViewById, 2131362413);
            if (imageView != null) {
                i10 = 2131363631;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, 2131363631);
                if (textView != null) {
                    i10 = 2131363637;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, 2131363637);
                    if (textView2 != null) {
                        i10 = 2131363656;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, 2131363656);
                        if (textView3 != null) {
                            a4.d0 d0Var = new a4.d0((RelativeLayout) viewFindChildViewById, imageView, textView, textView2, textView3, 9);
                            i6 = 2131362295;
                            if (((ImageView) ViewBindings.findChildViewById(viewInflate, 2131362295)) != null) {
                                i6 = 2131362296;
                                if (((ImageView) ViewBindings.findChildViewById(viewInflate, 2131362296)) != null) {
                                    i6 = 2131362522;
                                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, 2131362522)) != null) {
                                        i6 = 2131362536;
                                        if (((ImageView) ViewBindings.findChildViewById(viewInflate, 2131362536)) != null) {
                                            i6 = 2131362724;
                                            if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, 2131362724)) != null) {
                                                i6 = 2131362737;
                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, 2131362737);
                                                if (linearLayout != null) {
                                                    i6 = 2131362740;
                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(viewInflate, 2131362740);
                                                    if (linearLayout2 != null) {
                                                        i6 = 2131362824;
                                                        View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, 2131362824);
                                                        if (viewFindChildViewById2 != null) {
                                                            i6 = 2131363273;
                                                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(viewInflate, 2131363273);
                                                            if (relativeLayout != null) {
                                                                i6 = 2131363283;
                                                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(viewInflate, 2131363283);
                                                                if (relativeLayout2 != null) {
                                                                    i6 = 2131363296;
                                                                    RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(viewInflate, 2131363296);
                                                                    if (relativeLayout3 != null) {
                                                                        i6 = 2131363483;
                                                                        if (((ScrollView) ViewBindings.findChildViewById(viewInflate, 2131363483)) != null) {
                                                                            i6 = 2131363576;
                                                                            Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(viewInflate, 2131363576);
                                                                            if (toolbar != null) {
                                                                                i6 = 2131363887;
                                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131363887);
                                                                                if (textView4 != null) {
                                                                                    i6 = 2131363928;
                                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131363928);
                                                                                    if (textView5 != null) {
                                                                                        i6 = 2131364278;
                                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364278);
                                                                                        if (textView6 != null) {
                                                                                            i6 = 2131364280;
                                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364280);
                                                                                            if (textView7 != null) {
                                                                                                i6 = 2131364294;
                                                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364294);
                                                                                                if (textView8 != null) {
                                                                                                    i6 = 2131364296;
                                                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364296);
                                                                                                    if (textView9 != null) {
                                                                                                        i6 = 2131364457;
                                                                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364457);
                                                                                                        if (textView10 != null) {
                                                                                                            i6 = 2131364473;
                                                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364473);
                                                                                                            if (textView11 != null) {
                                                                                                                i6 = 2131364474;
                                                                                                                TextView textView12 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364474);
                                                                                                                if (textView12 != null) {
                                                                                                                    i6 = 2131364514;
                                                                                                                    TextView textView13 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364514);
                                                                                                                    if (textView13 != null) {
                                                                                                                        i6 = 2131364515;
                                                                                                                        TextView textView14 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364515);
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
        View viewInflate = youTubeActivity.getLayoutInflater().inflate(2131558880, (ViewGroup) null, false);
        int i6 = 2131364677;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, 2131364677);
        if (frameLayout != null) {
            i6 = 2131364678;
            YouTubePlayerView youTubePlayerView = (YouTubePlayerView) ViewBindings.findChildViewById(viewInflate, 2131364678);
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
        View viewInflate = advancedPreferencesActivity.getLayoutInflater().inflate(2131558429, (ViewGroup) null, false);
        int i6 = 2131362617;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, 2131362617);
        if (linearLayout != null) {
            LinearLayout linearLayout2 = (LinearLayout) viewInflate;
            int i10 = 2131363530;
            Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(viewInflate, 2131363530);
            if (toolbar != null) {
                i10 = 2131364442;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364442);
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
        View viewInflate = mobileDataUsageActivity.getLayoutInflater().inflate(2131558703, (ViewGroup) null, false);
        int i6 = 2131362115;
        DonutChartView donutChartView = (DonutChartView) ViewBindings.findChildViewById(viewInflate, 2131362115);
        if (donutChartView != null) {
            i6 = 2131362651;
            if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, 2131362651)) != null) {
                i6 = 2131362665;
                if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, 2131362665)) != null) {
                    i6 = 2131362684;
                    if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, 2131362684)) != null) {
                        i6 = 2131362759;
                        if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, 2131362759)) != null) {
                            i6 = 2131362799;
                            if (ViewBindings.findChildViewById(viewInflate, 2131362799) != null) {
                                i6 = 2131363125;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(viewInflate, 2131363125);
                                if (relativeLayout != null) {
                                    i6 = 2131363281;
                                    if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, 2131363281)) != null) {
                                        i6 = 2131363373;
                                        SwitchCompat switchCompat = (SwitchCompat) ViewBindings.findChildViewById(viewInflate, 2131363373);
                                        if (switchCompat != null) {
                                            i6 = 2131363548;
                                            Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(viewInflate, 2131363548);
                                            if (toolbar != null) {
                                                i6 = 2131363668;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, 2131363668);
                                                if (textView != null) {
                                                    i6 = 2131363678;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131363678);
                                                    if (textView2 != null) {
                                                        i6 = 2131363679;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131363679);
                                                        if (textView3 != null) {
                                                            i6 = 2131363844;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131363844);
                                                            if (textView4 != null) {
                                                                i6 = 2131363901;
                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131363901);
                                                                if (textView5 != null) {
                                                                    i6 = 2131363902;
                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131363902);
                                                                    if (textView6 != null) {
                                                                        i6 = 2131363903;
                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131363903);
                                                                        if (textView7 != null) {
                                                                            i6 = 2131363982;
                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131363982);
                                                                            if (textView8 != null) {
                                                                                i6 = 2131363993;
                                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131363993);
                                                                                if (textView9 != null) {
                                                                                    i6 = 2131363998;
                                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131363998);
                                                                                    if (textView10 != null) {
                                                                                        i6 = 2131364001;
                                                                                        TextView textView11 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364001);
                                                                                        if (textView11 != null) {
                                                                                            i6 = 2131364206;
                                                                                            TextView textView12 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364206);
                                                                                            if (textView12 != null) {
                                                                                                i6 = 2131364271;
                                                                                                TextView textView13 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364271);
                                                                                                if (textView13 != null) {
                                                                                                    i6 = 2131364349;
                                                                                                    TextView textView14 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364349);
                                                                                                    if (textView14 != null) {
                                                                                                        i6 = 2131364350;
                                                                                                        TextView textView15 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364350);
                                                                                                        if (textView15 != null) {
                                                                                                            i6 = 2131364351;
                                                                                                            TextView textView16 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364351);
                                                                                                            if (textView16 != null) {
                                                                                                                i6 = 2131364352;
                                                                                                                TextView textView17 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364352);
                                                                                                                if (textView17 != null) {
                                                                                                                    i6 = 2131364375;
                                                                                                                    TextView textView18 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364375);
                                                                                                                    if (textView18 != null) {
                                                                                                                        i6 = 2131364435;
                                                                                                                        TextView textView19 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364435);
                                                                                                                        if (textView19 != null) {
                                                                                                                            i6 = 2131364500;
                                                                                                                            TextView textView20 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364500);
                                                                                                                            if (textView20 != null) {
                                                                                                                                i6 = 2131364504;
                                                                                                                                TextView textView21 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364504);
                                                                                                                                if (textView21 != null) {
                                                                                                                                    i6 = 2131364506;
                                                                                                                                    TextView textView22 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364506);
                                                                                                                                    if (textView22 != null) {
                                                                                                                                        i6 = 2131364507;
                                                                                                                                        TextView textView23 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364507);
                                                                                                                                        if (textView23 != null) {
                                                                                                                                            i6 = 2131364508;
                                                                                                                                            TextView textView24 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364508);
                                                                                                                                            if (textView24 != null) {
                                                                                                                                                i6 = 2131364607;
                                                                                                                                                TextView textView25 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364607);
                                                                                                                                                if (textView25 != null) {
                                                                                                                                                    i6 = 2131364613;
                                                                                                                                                    TextView textView26 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364613);
                                                                                                                                                    if (textView26 != null) {
                                                                                                                                                        i6 = 2131364640;
                                                                                                                                                        if (ViewBindings.findChildViewById(viewInflate, 2131364640) != null) {
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
        View viewInflate = ((u4.w0) this.f2264b).getLayoutInflater().inflate(2131558444, (ViewGroup) null, false);
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        int i = 2131362787;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, 2131362787);
        if (viewFindChildViewById != null) {
            i = 2131363082;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, 2131363082);
            if (recyclerView != null) {
                i = 2131364073;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364073);
                if (textView != null) {
                    i = 2131364217;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364217);
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
        View viewInflate = ((u4.f1) this.f2264b).getLayoutInflater().inflate(2131558547, (ViewGroup) null, false);
        int i = 2131362306;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, 2131362306);
        if (imageView != null) {
            i = 2131362312;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, 2131362312);
            if (imageView2 != null) {
                i = 2131362350;
                if (((ImageView) ViewBindings.findChildViewById(viewInflate, 2131362350)) != null) {
                    i = 2131362365;
                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, 2131362365)) != null) {
                        i = 2131362681;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, 2131362681);
                        if (linearLayout != null) {
                            i = 2131362691;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(viewInflate, 2131362691);
                            if (linearLayout2 != null) {
                                i = 2131362790;
                                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, 2131362790);
                                if (viewFindChildViewById != null) {
                                    i = 2131363123;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(viewInflate, 2131363123);
                                    if (relativeLayout != null) {
                                        i = 2131363212;
                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(viewInflate, 2131363212);
                                        if (relativeLayout2 != null) {
                                            i = 2131363213;
                                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(viewInflate, 2131363213);
                                            if (relativeLayout3 != null) {
                                                i = 2131363321;
                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, 2131363321);
                                                if (recyclerView != null) {
                                                    i = 2131363453;
                                                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.findChildViewById(viewInflate, 2131363453);
                                                    if (swipeRefreshLayout != null) {
                                                        i = 2131363975;
                                                        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, 2131363975);
                                                        if (textView != null) {
                                                            i = 2131363978;
                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131363978);
                                                            if (textView2 != null) {
                                                                i = 2131363980;
                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131363980);
                                                                if (textView3 != null) {
                                                                    i = 2131364074;
                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364074);
                                                                    if (textView4 != null) {
                                                                        i = 2131364218;
                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364218);
                                                                        if (textView5 != null) {
                                                                            i = 2131364397;
                                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364397);
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
        View viewInflate = ((u4.g1) this.f2264b).getLayoutInflater().inflate(2131558563, (ViewGroup) null, false);
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        int i = 2131362793;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, 2131362793);
        if (viewFindChildViewById != null) {
            i = 2131363082;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, 2131363082);
            if (recyclerView != null) {
                i = 2131364076;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364076);
                if (textView != null) {
                    i = 2131364219;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364219);
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
        View viewInflate = ((u4.m1) this.f2264b).getLayoutInflater().inflate(2131558570, (ViewGroup) null, false);
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        int i = 2131362692;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, 2131362692);
        if (linearLayout != null) {
            i = 2131362794;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, 2131362794);
            if (viewFindChildViewById != null) {
                i = 2131363083;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, 2131363083);
                if (recyclerView != null) {
                    i = 2131364077;
                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364077);
                    if (textView != null) {
                        i = 2131364220;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364220);
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
