package b6;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import java.util.List;
import l7.k;
import q6.l;
import q6.m;
import q6.t;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends m.a {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f1075z = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ConstraintLayout f1076n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f1077o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Button f1078p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Button f1079q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Button f1080r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f1081s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f1082t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f1083u;
    public Group v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f1084w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ImageView f1085x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public h f1086y;

    @Override // m.a
    public final void b(ViewStub viewStub) {
        viewStub.setLayoutResource(2131558566);
        View viewInflate = viewStub.inflate();
        viewInflate.getClass();
        this.f1076n = (ConstraintLayout) viewInflate.findViewById(2131363045);
        this.f1077o = (ImageView) viewInflate.findViewById(2131362331);
        this.f1078p = (Button) viewInflate.findViewById(2131361985);
        this.f1079q = (Button) viewInflate.findViewById(2131361983);
        this.f1080r = (Button) viewInflate.findViewById(2131361979);
        this.f1081s = (TextView) viewInflate.findViewById(2131363972);
        this.f1082t = (TextView) viewInflate.findViewById(2131363991);
        this.f1083u = (TextView) viewInflate.findViewById(2131364363);
        this.v = (Group) viewInflate.findViewById(2131362211);
        this.f1085x = (ImageView) viewInflate.findViewById(2131362372);
        this.f1084w = (TextView) viewInflate.findViewById(2131364170);
    }

    public final void c(String str, SpannableString spannableString, String str2, ClickableSpan clickableSpan, boolean z9) {
        Object next;
        List listD0;
        str2.getClass();
        k7.d dVarA = k.a(new k(str2, 0), str);
        if (((d7.a) dVarA.f6992b).invoke() == null) {
            dVarA = null;
        }
        if (dVarA == null) {
            listD0 = null;
        } else {
            if (z9) {
                k7.e eVar = new k7.e(dVarA);
                if (!eVar.hasNext()) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.s("Sequence is empty.");
                    return;
                } else {
                    next = eVar.next();
                    while (eVar.hasNext()) {
                        next = eVar.next();
                    }
                }
            } else {
                k7.e eVar2 = new k7.e(dVarA);
                if (!eVar2.hasNext()) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.s("Sequence is empty.");
                    return;
                }
                next = eVar2.next();
            }
            i7.d dVarB = ((l7.i) next).b();
            listD0 = m.d0(Integer.valueOf(dVarB.f5695a), Integer.valueOf(str2.length() + dVarB.f5695a));
        }
        if (listD0 == null) {
            listD0 = t.f8724a;
        }
        if (listD0.isEmpty()) {
            return;
        }
        spannableString.setSpan(clickableSpan, ((Number) l.q0(listD0)).intValue(), ((Number) l.y0(listD0)).intValue(), 33);
        Context context = getContext();
        if (context == null) {
            return;
        }
        h9.d dVar = this.f7263a;
        Integer num = dVar != null ? dVar.f5501l : null;
        spannableString.setSpan(new ForegroundColorSpan(num == null ? ContextCompat.getColor(context, 2131099738) : num.intValue()), ((Number) l.q0(listD0)).intValue(), ((Number) l.y0(listD0)).intValue(), 33);
    }

    @Override // m.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        ViewModelStore viewModelStore = activity.getViewModelStore();
        viewModelStore.getClass();
        this.f1086y = (h) new ViewModelProvider(viewModelStore, new i(0)).get(h.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008f  */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.util.List] */
    @Override // m.a, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instruction units count: 1018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.f.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
