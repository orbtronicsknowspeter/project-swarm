package t4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class q implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f10061b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f10062l;

    public /* synthetic */ q(LinearLayout linearLayout, TextView textView, int i) {
        this.f10060a = i;
        this.f10061b = linearLayout;
        this.f10062l = textView;
    }

    public static q a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.permission_item, (ViewGroup) null, false);
        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_name_permission_item);
        if (textView != null) {
            return new q((LinearLayout) viewInflate, textView, 1);
        }
        com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.tv_name_permission_item)));
        return null;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f10060a) {
        }
        return this.f10061b;
    }
}
