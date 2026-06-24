package r;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class h implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f8816b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f8817l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f8818m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f8819n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f8820o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f8821p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f8822q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f8823r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f8824s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f8825t;

    public /* synthetic */ h(LinearLayout linearLayout, View view, View view2, View view3, View view4, View view5, View view6, View view7, TextView textView, TextView textView2, int i) {
        this.f8815a = i;
        this.f8816b = linearLayout;
        this.f8817l = view;
        this.f8818m = view2;
        this.f8819n = view3;
        this.f8820o = view4;
        this.f8821p = view5;
        this.f8822q = view6;
        this.f8823r = view7;
        this.f8824s = textView;
        this.f8825t = textView2;
    }

    public void a(String str, String str2) {
        HashMap map = (HashMap) this.f8823r;
        if (map != null) {
            map.put(str, str2);
        } else {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("Property \"autoMetadata\" has not been set");
        }
    }

    public i b() {
        String strConcat = ((String) this.f8816b) == null ? " transportName" : "";
        if (((m) this.f8820o) == null) {
            strConcat = strConcat.concat(" encodedPayload");
        }
        if (((Long) this.f8821p) == null) {
            strConcat = strConcat.concat(" eventMillis");
        }
        if (((Long) this.f8822q) == null) {
            strConcat = strConcat.concat(" uptimeMillis");
        }
        if (((HashMap) this.f8823r) == null) {
            strConcat = strConcat.concat(" autoMetadata");
        }
        if (strConcat.isEmpty()) {
            return new i((String) this.f8816b, (Integer) this.f8818m, (m) this.f8820o, ((Long) this.f8821p).longValue(), ((Long) this.f8822q).longValue(), (HashMap) this.f8823r, (Integer) this.f8819n, (String) this.f8817l, (byte[]) this.f8824s, (byte[]) this.f8825t);
        }
        androidx.privacysandbox.ads.adservices.customaudience.a.i("Missing required properties:".concat(strConcat));
        return null;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        switch (this.f8815a) {
        }
        return (LinearLayout) this.f8816b;
    }

    public /* synthetic */ h() {
        this.f8815a = 0;
    }
}
