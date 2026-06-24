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
    public final /* synthetic */ int f8816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f8817b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f8818l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f8819m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f8820n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f8821o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f8822p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f8823q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f8824r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f8825s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f8826t;

    public /* synthetic */ h(LinearLayout linearLayout, View view, View view2, View view3, View view4, View view5, View view6, View view7, TextView textView, TextView textView2, int i) {
        this.f8816a = i;
        this.f8817b = linearLayout;
        this.f8818l = view;
        this.f8819m = view2;
        this.f8820n = view3;
        this.f8821o = view4;
        this.f8822p = view5;
        this.f8823q = view6;
        this.f8824r = view7;
        this.f8825s = textView;
        this.f8826t = textView2;
    }

    public void a(String str, String str2) {
        HashMap map = (HashMap) this.f8824r;
        if (map != null) {
            map.put(str, str2);
        } else {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("Property \"autoMetadata\" has not been set");
        }
    }

    public i b() {
        String strConcat = ((String) this.f8817b) == null ? " transportName" : "";
        if (((m) this.f8821o) == null) {
            strConcat = strConcat.concat(" encodedPayload");
        }
        if (((Long) this.f8822p) == null) {
            strConcat = strConcat.concat(" eventMillis");
        }
        if (((Long) this.f8823q) == null) {
            strConcat = strConcat.concat(" uptimeMillis");
        }
        if (((HashMap) this.f8824r) == null) {
            strConcat = strConcat.concat(" autoMetadata");
        }
        if (strConcat.isEmpty()) {
            return new i((String) this.f8817b, (Integer) this.f8819m, (m) this.f8821o, ((Long) this.f8822p).longValue(), ((Long) this.f8823q).longValue(), (HashMap) this.f8824r, (Integer) this.f8820n, (String) this.f8818l, (byte[]) this.f8825s, (byte[]) this.f8826t);
        }
        androidx.privacysandbox.ads.adservices.customaudience.a.i("Missing required properties:".concat(strConcat));
        return null;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        switch (this.f8816a) {
        }
        return (LinearLayout) this.f8817b;
    }

    public /* synthetic */ h() {
        this.f8816a = 0;
    }
}
