package l;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.recyclerview.widget.RecyclerView;
import c.h;
import c.i;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.core.model.Vector;
import com.inmobi.cmp.core.model.gbc.GoogleBasicConsents;
import com.inmobi.cmp.core.model.portalconfig.GBCConsentValue;
import com.uptodown.R;
import java.util.ArrayList;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class d extends Fragment implements c.b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f7034p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f7035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f7036b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f7037l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h9.d f7038m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public n9.a f7039n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public n9.a f7040o;

    public final void a() {
        c cVar = this.f7037l;
        if (cVar == null) {
            l.i("viewModel");
            throw null;
        }
        RecyclerView recyclerView = this.f7036b;
        RecyclerView.Adapter adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter == null) {
            com.google.gson.internal.a.i("null cannot be cast to non-null type com.inmobi.cmp.presentation.components.switchlist.SwitchAdapter");
            return;
        }
        ArrayList arrayList = ((h) adapter).f1155a;
        arrayList.getClass();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            i iVar = (i) obj;
            Boolean bool = iVar.f1161b;
            h8.d dVar = iVar.f1160a;
            if (l.a(bool, Boolean.TRUE)) {
                boolean z9 = g.f7045a;
                int i6 = dVar.f5466a;
                GBCConsentValue.GRANTED.getClass();
                g.f7046b.set(i6);
            } else {
                boolean z10 = g.f7045a;
                int i10 = dVar.f5466a;
                GBCConsentValue gBCConsentValue = GBCConsentValue.DENIED;
                gBCConsentValue.getClass();
                if (gBCConsentValue == GBCConsentValue.GRANTED) {
                    g.f7046b.set(i10);
                } else {
                    g.f7046b.unset(i10);
                }
            }
        }
        l9.a aVar = cVar.f7030a;
        boolean z11 = g.f7045a;
        Vector vectorK = aVar.k(40);
        Vector vector = g.f7046b;
        vector.getClass();
        if (vectorK != null) {
            vectorK.forEach(new e(0, vector));
        }
        aVar.e(40, vector);
        ChoiceCmpCallback choiceCmpCallback = cVar.f7031b;
        if (choiceCmpCallback == null) {
            return;
        }
        choiceCmpCallback.onGoogleBasicConsentChange(new GoogleBasicConsents(c.a("adStorage", arrayList), c.a("adUserData", arrayList), c.a("adPersonalization", arrayList), c.a("analyticsStorage", arrayList)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() == null) {
            return;
        }
        ViewModelStore viewModelStore = getViewModelStore();
        viewModelStore.getClass();
        this.f7037l = (c) new ViewModelProvider(viewModelStore, new b6.i(1)).get(c.class);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.gbc_purpose_container, viewGroup, false);
        viewInflate.getClass();
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00de  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Iterable, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r25, android.os.Bundle r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.d.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // c.b
    public final void e(i iVar) {
    }

    @Override // c.b
    public final void f(i iVar) {
    }
}
