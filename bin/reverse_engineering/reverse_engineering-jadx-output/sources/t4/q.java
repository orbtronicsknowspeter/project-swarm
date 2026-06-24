package t4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class q implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f10060b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f10061l;

    public /* synthetic */ q(LinearLayout linearLayout, TextView textView, int i) {
        this.f10059a = i;
        this.f10060b = linearLayout;
        this.f10061l = textView;
    }

    public static q a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(2131558769, (ViewGroup) null, false);
        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, 2131364053);
        if (textView != null) {
            return new q((LinearLayout) viewInflate, textView, 1);
        }
        com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(2131364053)));
        return null;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f10059a) {
        }
        return this.f10060b;
    }
}
