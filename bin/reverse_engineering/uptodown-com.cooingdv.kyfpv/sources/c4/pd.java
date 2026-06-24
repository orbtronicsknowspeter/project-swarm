package c4;

import android.app.AlertDialog;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.LoginActivity;
import com.uptodown.activities.WishlistActivity;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pd implements d7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WishlistActivity f2001b;

    public /* synthetic */ pd(WishlistActivity wishlistActivity, int i) {
        this.f2000a = i;
        this.f2001b = wishlistActivity;
    }

    @Override // d7.a
    public final Object invoke() {
        int i = this.f2000a;
        p6.x xVar = p6.x.f8464a;
        WishlistActivity wishlistActivity = this.f2001b;
        switch (i) {
            case 0:
                int i6 = WishlistActivity.f3368g0;
                View viewInflate = wishlistActivity.getLayoutInflater().inflate(R.layout.wishlist_activity, (ViewGroup) null, false);
                int i10 = R.id.loading_view_wishlist;
                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.loading_view_wishlist);
                if (viewFindChildViewById != null) {
                    i10 = R.id.rv_wishlist;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.rv_wishlist);
                    if (recyclerView != null) {
                        i10 = R.id.toolbar_wishlist;
                        Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(viewInflate, R.id.toolbar_wishlist);
                        if (toolbar != null) {
                            i10 = R.id.tv_explore_wishlist;
                            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_explore_wishlist);
                            if (textView != null) {
                                i10 = R.id.tv_no_items_wishlist;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_no_items_wishlist);
                                if (textView2 != null) {
                                    i10 = R.id.tv_title_wishlist;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_title_wishlist);
                                    if (textView3 != null) {
                                    }
                                }
                            }
                        }
                    }
                }
                com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
                break;
            case 1:
                int i11 = WishlistActivity.f3368g0;
                Intent intent = new Intent(wishlistActivity, (Class<?>) LoginActivity.class);
                ActivityResultLauncher activityResultLauncher = wishlistActivity.f3373f0;
                float f = UptodownApp.I;
                activityResultLauncher.launch(intent, b4.d.b(wishlistActivity));
                AlertDialog alertDialog = wishlistActivity.F;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                break;
            default:
                int i12 = WishlistActivity.f3368g0;
                wishlistActivity.finish();
                break;
        }
        return xVar;
    }
}
