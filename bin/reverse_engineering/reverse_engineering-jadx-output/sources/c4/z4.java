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
        p6.x xVar = p6.x.f8463a;
        MyDownloads myDownloads = this.f2392b;
        switch (i) {
            case 0:
                int i10 = MyDownloads.V;
                View viewInflate = myDownloads.getLayoutInflater().inflate(2131558738, (ViewGroup) null, false);
                int i11 = 2131362802;
                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, 2131362802);
                if (viewFindChildViewById != null) {
                    i11 = 2131362919;
                    View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, 2131362919);
                    if (viewFindChildViewById2 != null) {
                        int i12 = 2131362702;
                        View viewFindChildViewById3 = ViewBindings.findChildViewById(viewFindChildViewById2, 2131362702);
                        if (viewFindChildViewById3 != null) {
                            b5.m mVarW = b5.m.w(viewFindChildViewById3);
                            i12 = 2131363233;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(viewFindChildViewById2, 2131363233);
                            if (relativeLayout != null) {
                                i12 = 2131363758;
                                TextView textView = (TextView) ViewBindings.findChildViewById(viewFindChildViewById2, 2131363758);
                                if (textView != null) {
                                    i12 = 2131363762;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById2, 2131363762);
                                    if (textView2 != null) {
                                        i12 = 2131363933;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById2, 2131363933);
                                        if (textView3 != null) {
                                            g4.v vVar = new g4.v((RelativeLayout) viewFindChildViewById2, mVarW, relativeLayout, textView, textView2, textView3, 5);
                                            i11 = 2131362945;
                                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(viewInflate, 2131362945);
                                            if (nestedScrollView != null) {
                                                i11 = 2131363084;
                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, 2131363084);
                                                if (recyclerView != null) {
                                                    i11 = 2131363402;
                                                    SearchView searchView = (SearchView) ViewBindings.findChildViewById(viewInflate, 2131363402);
                                                    if (searchView != null) {
                                                        i11 = 2131363537;
                                                        Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(viewInflate, 2131363537);
                                                        if (toolbar != null) {
                                                            i11 = 2131364083;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364083);
                                                            if (textView4 != null) {
                                                                i11 = 2131364446;
                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, 2131364446)) != null) {
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
                        String string = myDownloads.getString(2131951928);
                        string.getClass();
                        str = String.format(string, Arrays.copyOf(new Object[0], 0));
                    } else {
                        String string2 = myDownloads.getString(2131951927);
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
