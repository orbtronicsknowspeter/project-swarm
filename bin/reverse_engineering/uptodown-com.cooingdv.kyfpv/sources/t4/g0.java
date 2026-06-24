package t4;

import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f9817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EditText f9818b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final EditText f9819l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final View f9820m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f9821n;

    public g0(RelativeLayout relativeLayout, EditText editText, EditText editText2, View view, TextView textView) {
        this.f9817a = relativeLayout;
        this.f9818b = editText;
        this.f9819l = editText2;
        this.f9820m = view;
        this.f9821n = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f9817a;
    }
}
