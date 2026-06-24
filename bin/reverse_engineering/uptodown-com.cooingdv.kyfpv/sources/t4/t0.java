package t4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class t0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10125a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RelativeLayout f10126b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f10127l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f10128m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f10129n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final View f10130o;

    public t0(RelativeLayout relativeLayout, View view, TextView textView, TextView textView2, TextView textView3) {
        this.f10126b = relativeLayout;
        this.f10130o = view;
        this.f10127l = textView;
        this.f10128m = textView2;
        this.f10129n = textView3;
    }

    public static t0 a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.scan_positive, (ViewGroup) null, false);
        int i = R.id.box_positive;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.box_positive);
        if (viewFindChildViewById != null) {
            i = R.id.tv_antivirus_name;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_antivirus_name);
            if (textView != null) {
                i = R.id.tv_virus_name;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_virus_name);
                if (textView2 != null) {
                    i = R.id.tv_virus_type_badge;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_virus_type_badge);
                    if (textView3 != null) {
                        return new t0((RelativeLayout) viewInflate, viewFindChildViewById, textView, textView2, textView3);
                    }
                }
            }
        }
        com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f10125a) {
        }
        return this.f10126b;
    }

    public t0(RelativeLayout relativeLayout, TextView textView, TextView textView2, TextView textView3, View view) {
        this.f10126b = relativeLayout;
        this.f10127l = textView;
        this.f10128m = textView2;
        this.f10129n = textView3;
        this.f10130o = view;
    }
}
