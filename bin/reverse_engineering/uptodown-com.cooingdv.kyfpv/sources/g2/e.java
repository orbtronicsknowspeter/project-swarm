package g2;

import a4.x;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import c.j;
import com.uptodown.R;
import e1.c0;
import f0.i;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import y1.t;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5119b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f5120l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f5121m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f5122n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f5123o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f5124p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f5125q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f5126r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f5127s;

    public e(Context context, f fVar, q1.a aVar, i iVar, i iVar2, a aVar2, t tVar) {
        this.f5118a = 0;
        AtomicReference atomicReference = new AtomicReference();
        this.f5126r = atomicReference;
        this.f5127s = new AtomicReference(new j1.i());
        this.f5119b = context;
        this.f5120l = fVar;
        this.f5122n = aVar;
        this.f5121m = iVar;
        this.f5123o = iVar2;
        this.f5124p = aVar2;
        this.f5125q = tVar;
        atomicReference.set(c0.j(aVar));
    }

    public static e c(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.feed_item_comment_view, (ViewGroup) null, false);
        int i = R.id.iv_icon_feed_item;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_icon_feed_item);
        if (imageView != null) {
            i = R.id.iv_star1_review_feed_item;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_star1_review_feed_item);
            if (imageView2 != null) {
                i = R.id.iv_star2_review_feed_item;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_star2_review_feed_item);
                if (imageView3 != null) {
                    i = R.id.iv_star3_review_feed_item;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_star3_review_feed_item);
                    if (imageView4 != null) {
                        i = R.id.iv_star4_review_feed_item;
                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_star4_review_feed_item);
                        if (imageView5 != null) {
                            i = R.id.iv_star5_review_feed_item;
                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_star5_review_feed_item);
                            if (imageView6 != null) {
                                i = R.id.ll_stars_review_feed_item;
                                if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.ll_stars_review_feed_item)) != null) {
                                    i = R.id.tv_app_name_feed_item;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_app_name_feed_item);
                                    if (textView != null) {
                                        i = R.id.tv_body_feed_item;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_body_feed_item);
                                        if (textView2 != null) {
                                            return new e((RelativeLayout) viewInflate, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, textView, textView2, 3);
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

    public static void d(JSONObject jSONObject, String str) {
        StringBuilder sbT = x.t(str);
        sbT.append(jSONObject.toString());
        String string = sbT.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", string, null);
        }
    }

    public d a(int i) {
        d dVar = null;
        try {
            if (!j.a(2, i)) {
                JSONObject jSONObjectM = ((i) this.f5123o).m();
                if (jSONObjectM != null) {
                    d dVarK = ((i) this.f5121m).k(jSONObjectM);
                    d(jSONObjectM, "Loaded cached settings: ");
                    ((q1.a) this.f5122n).getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (j.a(3, i) || dVarK.f5115c >= jCurrentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return dVarK;
                        } catch (Exception e10) {
                            e = e10;
                            dVar = dVarK;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return dVar;
                        }
                    }
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                        return null;
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
            return null;
        } catch (Exception e11) {
            e = e11;
        }
    }

    public d b() {
        return (d) ((AtomicReference) this.f5126r).get();
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        switch (this.f5118a) {
        }
        return (RelativeLayout) this.f5119b;
    }

    public /* synthetic */ e(RelativeLayout relativeLayout, View view, ImageView imageView, ImageView imageView2, View view2, View view3, View view4, TextView textView, TextView textView2, int i) {
        this.f5118a = i;
        this.f5119b = relativeLayout;
        this.f5120l = view;
        this.f5121m = imageView;
        this.f5122n = imageView2;
        this.f5123o = view2;
        this.f5124p = view3;
        this.f5125q = view4;
        this.f5126r = textView;
        this.f5127s = textView2;
    }
}
