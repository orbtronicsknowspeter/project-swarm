package c4;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.MyDownloads;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z4 implements d7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MyDownloads f2392b;

    public /* synthetic */ z4(MyDownloads myDownloads, int i) {
        this.f2391a = i;
        this.f2392b = myDownloads;
    }

    @Override // d7.a
    public final Object invoke() {
        String str;
        int i = this.f2391a;
        int i6 = 3;
        t6.c cVar = null;
        p6.x xVar = p6.x.f8464a;
        MyDownloads myDownloads = this.f2392b;
        switch (i) {
            case 0:
                int i10 = MyDownloads.V;
                View viewInflate = myDownloads.getLayoutInflater().inflate(R.layout.my_downloads, (ViewGroup) null, false);
                int i11 = R.id.loading_view_my_downloads;
                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.loading_view_my_downloads);
                if (viewFindChildViewById != null) {
                    i11 = R.id.my_downloads_filters;
                    View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.my_downloads_filters);
                    if (viewFindChildViewById2 != null) {
                        int i12 = R.id.ll_order_my_downloads;
                        View viewFindChildViewById3 = ViewBindings.findChildViewById(viewFindChildViewById2, R.id.ll_order_my_downloads);
                        if (viewFindChildViewById3 != null) {
                            b5.m mVarW = b5.m.w(viewFindChildViewById3);
                            i12 = R.id.rl_my_downloads_selector;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(viewFindChildViewById2, R.id.rl_my_downloads_selector);
                            if (relativeLayout != null) {
                                i12 = R.id.tv_delete_all_downloads;
                                TextView textView = (TextView) ViewBindings.findChildViewById(viewFindChildViewById2, R.id.tv_delete_all_downloads);
                                if (textView != null) {
                                    i12 = R.id.tv_delete_selected_downloads;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById2, R.id.tv_delete_selected_downloads);
                                    if (textView2 != null) {
                                        i12 = R.id.tv_label_selected_items;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById2, R.id.tv_label_selected_items);
                                        if (textView3 != null) {
                                            g4.v vVar = new g4.v((RelativeLayout) viewFindChildViewById2, mVarW, relativeLayout, textView, textView2, textView3, 5);
                                            i11 = R.id.nsv_my_downloads;
                                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.nsv_my_downloads);
                                            if (nestedScrollView != null) {
                                                i11 = R.id.recyclerview;
                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recyclerview);
                                                if (recyclerView != null) {
                                                    i11 = R.id.search_view_my_downloads;
                                                    SearchView searchView = (SearchView) ViewBindings.findChildViewById(viewInflate, R.id.search_view_my_downloads);
                                                    if (searchView != null) {
                                                        i11 = R.id.toolbar_downloads;
                                                        Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(viewInflate, R.id.toolbar_downloads);
                                                        if (toolbar != null) {
                                                            i11 = R.id.tv_no_items;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_no_items);
                                                            if (textView4 != null) {
                                                                i11 = R.id.tv_toolbar_title_downloads;
                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_toolbar_title_downloads)) != null) {
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
                        com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewFindChildViewById2.getResources().getResourceName(i12)));
                    }
                }
                com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
                break;
            case 1:
                int i13 = MyDownloads.V;
                o7.c0.s(LifecycleOwnerKt.getLifecycleScope(myDownloads), null, null, new b.n(myDownloads, cVar, 20), 3);
                break;
            case 2:
                int i14 = MyDownloads.V;
                myDownloads.y0(true);
                break;
            case 3:
                int i15 = MyDownloads.V;
                myDownloads.y0(false);
                a5.b.h();
                break;
            default:
                int i16 = MyDownloads.V;
                float f = UptodownApp.I;
                if (!b4.d.p(myDownloads, "downloadApkWorker")) {
                    myDownloads.y0(false);
                } else {
                    a5.b.g();
                    ArrayList arrayList = new ArrayList();
                    j5.g gVarL = j5.g.D.l(myDownloads);
                    gVarL.b();
                    Iterator it = gVarL.P().iterator();
                    it.getClass();
                    while (it.hasNext()) {
                        Object next = it.next();
                        next.getClass();
                        x4.r rVar = (x4.r) next;
                        if (rVar.m()) {
                            arrayList.add(rVar);
                        }
                    }
                    gVarL.c();
                    if (arrayList.size() > 1) {
                        String string = myDownloads.getString(R.string.dialog_cancel_downloads_msg);
                        string.getClass();
                        str = String.format(string, Arrays.copyOf(new Object[0], 0));
                    } else {
                        String string2 = myDownloads.getString(R.string.dialog_cancel_download_msg);
                        string2.getClass();
                        str = String.format(string2, Arrays.copyOf(new Object[0], 0));
                    }
                    myDownloads.I(str, new z4(myDownloads, 2), new z4(myDownloads, i6));
                }
                break;
        }
        return xVar;
    }
}
