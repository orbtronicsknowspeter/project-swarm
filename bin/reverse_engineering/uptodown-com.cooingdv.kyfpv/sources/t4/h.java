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
    public final RelativeLayout f9834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EditText f9835b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final EditText f9836l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final View f9837m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Toolbar f9838n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f9839o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f9840p;

    public h(RelativeLayout relativeLayout, EditText editText, EditText editText2, View view, Toolbar toolbar, TextView textView, TextView textView2) {
        this.f9834a = relativeLayout;
        this.f9835b = editText;
        this.f9836l = editText2;
        this.f9837m = view;
        this.f9838n = toolbar;
        this.f9839o = textView;
        this.f9840p = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f9834a;
    }
}
