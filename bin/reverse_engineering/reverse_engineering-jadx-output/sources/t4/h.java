package t4;

import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f9833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EditText f9834b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final EditText f9835l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final View f9836m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Toolbar f9837n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f9838o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f9839p;

    public h(RelativeLayout relativeLayout, EditText editText, EditText editText2, View view, Toolbar toolbar, TextView textView, TextView textView2) {
        this.f9833a = relativeLayout;
        this.f9834b = editText;
        this.f9835l = editText2;
        this.f9836m = view;
        this.f9837n = toolbar;
        this.f9838o = textView;
        this.f9839p = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f9833a;
    }
}
