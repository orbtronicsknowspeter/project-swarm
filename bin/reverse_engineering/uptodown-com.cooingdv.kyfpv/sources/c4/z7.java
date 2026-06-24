package c4;

import android.app.AlertDialog;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.LoginActivity;
import com.uptodown.activities.RecommendedActivity;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z7 implements d7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecommendedActivity f2399b;

    public /* synthetic */ z7(RecommendedActivity recommendedActivity, int i) {
        this.f2398a = i;
        this.f2399b = recommendedActivity;
    }

    @Override // d7.a
    public final Object invoke() {
        int i = this.f2398a;
        p6.x xVar = p6.x.f8464a;
        RecommendedActivity recommendedActivity = this.f2399b;
        switch (i) {
            case 0:
                int i6 = RecommendedActivity.f3339g0;
                recommendedActivity.finish();
                return xVar;
            case 1:
                int i10 = RecommendedActivity.f3339g0;
                View viewInflate = recommendedActivity.getLayoutInflater().inflate(R.layout.recommended_activity, (ViewGroup) null, false);
                int i11 = R.id.loading_view_recommended;
                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.loading_view_recommended);
                if (viewFindChildViewById != null) {
                    i11 = R.id.rv_recommended;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.rv_recommended);
                    if (recyclerView != null) {
                        i11 = R.id.s_list_state_recommended;
                        SwitchCompat switchCompat = (SwitchCompat) ViewBindings.findChildViewById(viewInflate, R.id.s_list_state_recommended);
                        if (switchCompat != null) {
                            i11 = R.id.toolbar_recommended;
                            Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(viewInflate, R.id.toolbar_recommended);
                            if (toolbar != null) {
                                i11 = R.id.tv_explore_recommended;
                                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_explore_recommended);
                                if (textView != null) {
                                    i11 = R.id.tv_list_state_recommended;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_list_state_recommended);
                                    if (textView2 != null) {
                                        i11 = R.id.tv_no_items_recommended;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_no_items_recommended);
                                        if (textView3 != null) {
                                            i11 = R.id.tv_title_recommended;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_title_recommended);
                                            if (textView4 != null) {
                                                return new t4.m0((RelativeLayout) viewInflate, viewFindChildViewById, recyclerView, switchCompat, toolbar, textView, textView2, textView3, textView4);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
                return null;
            default:
                int i12 = RecommendedActivity.f3339g0;
                Intent intent = new Intent(recommendedActivity, (Class<?>) LoginActivity.class);
                ActivityResultLauncher activityResultLauncher = recommendedActivity.f3343e0;
                float f = UptodownApp.I;
                activityResultLauncher.launch(intent, b4.d.b(recommendedActivity));
                AlertDialog alertDialog = recommendedActivity.F;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                return xVar;
        }
    }
}
