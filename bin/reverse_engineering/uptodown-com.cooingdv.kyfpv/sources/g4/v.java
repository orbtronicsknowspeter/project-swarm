package g4;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import b2.t1;
import com.google.android.gms.internal.measurement.i5;
import com.uptodown.R;
import com.uptodown.core.activities.FileExplorerActivity;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class v implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5276b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f5277l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f5278m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f5279n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f5280o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f5281p;

    public v(String str, Set set, String str2) {
        this.f5275a = 1;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.f5276b = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.f5278m = str;
        this.f5279n = str2;
        this.f5280o = g1.a.f5106a;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.f5277l = DesugarCollections.unmodifiableSet(hashSet);
        } else {
            it.next().getClass();
            com.google.gson.internal.a.o();
            throw null;
        }
    }

    public static v a(View view) {
        int i = R.id.ll_pb_fus;
        if (((LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_pb_fus)) != null) {
            i = R.id.pb_enough_storage;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.pb_enough_storage);
            if (progressBar != null) {
                i = R.id.pb_not_storage;
                ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.pb_not_storage);
                if (progressBar2 != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    i = R.id.tv_no_storage_action;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_no_storage_action);
                    if (textView != null) {
                        i = R.id.tv_not_storage;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_not_storage);
                        if (textView2 != null) {
                            i = R.id.tv_not_storage_text;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_not_storage_text);
                            if (textView3 != null) {
                                return new v(relativeLayout, progressBar, progressBar2, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        com.google.gson.internal.a.i("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static v e(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_pre_register, (ViewGroup) null, false);
        int i = R.id.iv_close_dialog_pre_register;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_close_dialog_pre_register);
        if (imageView != null) {
            i = R.id.tv_cancel_dialog_pre_register;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_cancel_dialog_pre_register);
            if (textView != null) {
                i = R.id.tv_description_dialog_pre_register;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_description_dialog_pre_register);
                if (textView2 != null) {
                    i = R.id.tv_ok_dialog_pre_register;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_ok_dialog_pre_register);
                    if (textView3 != null) {
                        i = R.id.tv_title_dialog_pre_register;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_title_dialog_pre_register);
                        if (textView4 != null) {
                            return new v((RelativeLayout) viewInflate, imageView, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public static v f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.home_card_featured_item, viewGroup, false);
        int i = R.id.iv_home_card_featured_item;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_home_card_featured_item);
        if (imageView != null) {
            i = R.id.iv_logo_home_card_featured_item;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_logo_home_card_featured_item);
            if (imageView2 != null) {
                i = R.id.ll_progress_home_card_featured_item;
                if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.ll_progress_home_card_featured_item)) != null) {
                    i = R.id.pb_progress_home_card_featured_item;
                    if (((ProgressBar) ViewBindings.findChildViewById(viewInflate, R.id.pb_progress_home_card_featured_item)) != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
                        i = R.id.rl_logo_home_card_featured_item;
                        if (((RelativeLayout) ViewBindings.findChildViewById(viewInflate, R.id.rl_logo_home_card_featured_item)) != null) {
                            i = R.id.tv_desc_home_card_featured_item;
                            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_desc_home_card_featured_item);
                            if (textView != null) {
                                i = R.id.tv_desc_home_card_featured_item_holder;
                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_desc_home_card_featured_item_holder)) != null) {
                                    i = R.id.tv_name_home_card_featured_item;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_name_home_card_featured_item);
                                    if (textView2 != null) {
                                        i = R.id.tv_name_home_card_featured_item_holder;
                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_name_home_card_featured_item_holder)) != null) {
                                            i = R.id.tv_progress_home_card_featured_item;
                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_progress_home_card_featured_item)) != null) {
                                                i = R.id.tv_status_home_card_featured_item;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_status_home_card_featured_item);
                                                if (textView3 != null) {
                                                    i = R.id.tv_verified_home_card_featured_item;
                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_verified_home_card_featured_item)) != null) {
                                                        return new v(relativeLayout, imageView, imageView2, textView, textView2, textView3, 4);
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

    public static v g(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_required_features_missed, (ViewGroup) null, false);
        int i = R.id.tv_cancel;
        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_cancel);
        if (textView != null) {
            i = R.id.tv_missed_features;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_missed_features);
            if (textView2 != null) {
                i = R.id.tv_msg;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_msg);
                if (textView3 != null) {
                    i = R.id.tv_ok;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_ok);
                    if (textView4 != null) {
                        i = R.id.tv_title;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_title);
                        if (textView5 != null) {
                            return new v((LinearLayout) viewInflate, textView, textView2, textView3, textView4, textView5);
                        }
                    }
                }
            }
        }
        com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public void b(int i) {
        TextView textView = (TextView) this.f5276b;
        FileExplorerActivity fileExplorerActivity = (FileExplorerActivity) this.f5279n;
        textView.setText(fileExplorerActivity.getString(R.string.core_decompress_dialog_completed, String.valueOf(i)));
        ProgressBar progressBar = (ProgressBar) this.f5281p;
        progressBar.setIndeterminate(false);
        progressBar.setProgress(100);
        ((TextView) this.f5278m).setText(fileExplorerActivity.getString(R.string.close));
    }

    public void c() {
        ProgressBar progressBar = (ProgressBar) this.f5281p;
        TextView textView = (TextView) this.f5276b;
        FileExplorerActivity fileExplorerActivity = (FileExplorerActivity) this.f5279n;
        textView.setText(fileExplorerActivity.getString(R.string.core_decompress_dialog_decompressing));
        ((RadioGroup) ((View) this.f5280o).findViewById(R.id.rg_decompress_path)).setVisibility(8);
        TextView textView2 = fileExplorerActivity.L;
        if (textView2 == null) {
            kotlin.jvm.internal.l.i("tvSelectedPath");
            throw null;
        }
        textView2.setVisibility(8);
        progressBar.setVisibility(0);
        progressBar.setIndeterminate(true);
        ((TextView) this.f5277l).setVisibility(8);
    }

    public j1.p d(j1.p pVar) {
        return pVar.d(new androidx.arch.core.executor.a(2), new s1.o(this, 29));
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        switch (this.f5275a) {
        }
        return (RelativeLayout) this.f5279n;
    }

    public void h() {
        TextView textView = (TextView) this.f5276b;
        FileExplorerActivity fileExplorerActivity = (FileExplorerActivity) this.f5279n;
        textView.setText(fileExplorerActivity.getString(R.string.core_decompress_dialog_error));
        ProgressBar progressBar = (ProgressBar) this.f5281p;
        progressBar.setIndeterminate(false);
        progressBar.setProgress(0);
        ((TextView) this.f5278m).setText(fileExplorerActivity.getString(R.string.close));
    }

    public void i(long j) {
        TextView textView = (TextView) this.f5276b;
        FileExplorerActivity fileExplorerActivity = (FileExplorerActivity) this.f5279n;
        textView.setText(fileExplorerActivity.getString(R.string.core_decompress_dialog_decompressing) + " " + i5.H(fileExplorerActivity, j));
    }

    public void j(String str, String str2, Bundle bundle) {
        int i;
        String strEncodeToString;
        int iA;
        PackageInfo packageInfoE;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        n1.f fVar = (n1.f) this.f5276b;
        fVar.a();
        bundle.putString("gmp_app_id", fVar.f7911c.f7920b);
        s4.s sVar = (s4.s) this.f5277l;
        synchronized (sVar) {
            try {
                if (sVar.f9286b == 0 && (packageInfoE = sVar.e("com.google.android.gms")) != null) {
                    sVar.f9286b = packageInfoE.versionCode;
                }
                i = sVar.f9286b;
            } finally {
            }
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((s4.s) this.f5277l).b());
        bundle.putString("app_ver_name", ((s4.s) this.f5277l).c());
        n1.f fVar2 = (n1.f) this.f5276b;
        fVar2.a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(fVar2.f7910b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String str3 = ((t2.a) t1.j(((t2.c) ((t2.d) this.f5281p)).e())).f9537a;
            if (TextUtils.isEmpty(str3)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str3);
            }
        } catch (InterruptedException e10) {
            e = e10;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        } catch (ExecutionException e11) {
            e = e11;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) t1.j(((t2.c) ((t2.d) this.f5281p)).d()));
        bundle.putString("cliv", "fcm-25.0.1");
        q2.g gVar = (q2.g) ((s2.b) this.f5280o).get();
        a3.c cVar = (a3.c) ((s2.b) this.f5279n).get();
        if (gVar == null || cVar == null || (iA = ((q2.d) gVar).a()) == 1) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(c.j.c(iA)));
        bundle.putString("Firebase-Client", cVar.a());
    }

    public j1.p k(String str, String str2, Bundle bundle) {
        int i;
        try {
            j(str, str2, bundle);
            g0.b bVar = (g0.b) this.f5278m;
            g0.h hVar = g0.h.f5082l;
            g0.o oVar = bVar.f5071c;
            if (oVar.a() < 12000000) {
                return oVar.b() != 0 ? bVar.a(bundle).e(hVar, new android.support.v4.media.g(11, bVar, bundle)) : t1.w(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            g0.n nVarA = g0.n.a(bVar.f5070b);
            synchronized (nVarA) {
                i = nVarA.f5102d;
                nVarA.f5102d = i + 1;
            }
            return nVarA.b(new g0.l(i, 1, bundle, 1)).d(hVar, g0.d.f5075b);
        } catch (InterruptedException | ExecutionException e10) {
            return t1.w(e10);
        }
    }

    public /* synthetic */ v(RelativeLayout relativeLayout, Object obj, View view, TextView textView, TextView textView2, TextView textView3, int i) {
        this.f5275a = i;
        this.f5279n = relativeLayout;
        this.f5280o = obj;
        this.f5281p = view;
        this.f5276b = textView;
        this.f5277l = textView2;
        this.f5278m = textView3;
    }

    public v(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f5275a = 3;
        this.f5279n = linearLayout;
        this.f5276b = textView;
        this.f5277l = textView2;
        this.f5278m = textView3;
        this.f5280o = textView4;
        this.f5281p = textView5;
    }

    public v(RelativeLayout relativeLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f5275a = 2;
        this.f5279n = relativeLayout;
        this.f5280o = imageView;
        this.f5276b = textView;
        this.f5277l = textView2;
        this.f5278m = textView3;
        this.f5281p = textView4;
    }

    public v(RelativeLayout relativeLayout, ProgressBar progressBar, ProgressBar progressBar2, TextView textView, TextView textView2, TextView textView3) {
        this.f5275a = 7;
        this.f5279n = relativeLayout;
        this.f5281p = progressBar;
        this.f5280o = progressBar2;
        this.f5276b = textView;
        this.f5277l = textView2;
        this.f5278m = textView3;
    }

    public v(n1.f fVar, s4.s sVar, s2.b bVar, s2.b bVar2, t2.d dVar) {
        this.f5275a = 8;
        fVar.a();
        g0.b bVar3 = new g0.b(fVar.f7909a);
        this.f5276b = fVar;
        this.f5277l = sVar;
        this.f5278m = bVar3;
        this.f5279n = bVar;
        this.f5280o = bVar2;
        this.f5281p = dVar;
    }

    public v(TextView textView, FileExplorerActivity fileExplorerActivity, View view, ProgressBar progressBar, TextView textView2, TextView textView3) {
        this.f5275a = 0;
        this.f5276b = textView;
        this.f5279n = fileExplorerActivity;
        this.f5280o = view;
        this.f5281p = progressBar;
        this.f5277l = textView2;
        this.f5278m = textView3;
    }
}
