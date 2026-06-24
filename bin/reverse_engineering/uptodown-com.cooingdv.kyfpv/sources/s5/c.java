package s5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import f9.q;
import h8.e;
import h8.f;
import h8.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.l;
import l7.u;
import l8.n;
import p9.o;
import u5.m;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends p9.a implements c.b {
    public RecyclerView A;
    public RecyclerView B;
    public RecyclerView C;
    public ConstraintLayout D;
    public LinearLayout E;
    public LinearLayout F;
    public Button G;
    public Button H;
    public TextView I;
    public TextView J;
    public TextView K;
    public TextView L;
    public TextView M;
    public TextView N;
    public d O;
    public o P;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public RecyclerView f9334z;

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Iterable, java.lang.Object] */
    public final String a() {
        int size;
        LinkedHashMap linkedHashMap;
        d dVar = this.O;
        if (dVar == null) {
            l.i("viewModel");
            throw null;
        }
        n nVar = dVar.f9336b;
        h8.c cVar = dVar.f9335a.f10738a;
        if (cVar == null || (linkedHashMap = cVar.h) == null) {
            size = 0;
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (((i) entry.getValue()).f5477k == null) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            size = linkedHashMap2.size();
        }
        ?? r62 = nVar.f7240n.f7213t.f7229a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : r62) {
            Set setJ0 = q6.l.J0(((l8.l) obj).f);
            ?? r10 = nVar.f7240n.g;
            if (!setJ0.isEmpty()) {
                Iterator it = setJ0.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (r10.contains(Integer.valueOf(((Number) it.next()).intValue()))) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        String strValueOf = String.valueOf(dVar.f9337c.f10711a.size() + arrayList.size() + size + (dVar.f9338d != null ? 1 : 0));
        d dVar2 = this.O;
        if (dVar2 == null) {
            l.i("viewModel");
            throw null;
        }
        String strO0 = u.o0(dVar2.f.e().f5561b, "${partners}", strValueOf, true);
        String string = getString(R.string.consent_storage_method);
        string.getClass();
        return u.o0(u.o0(strO0, "${consentStorageMethod}", string, true), "${consentStorageDuration}", "13", true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c.b
    public final void e(c.i iVar) {
        h8.d dVar = iVar.f1160a;
        FragmentActivity activity = getActivity();
        if (activity != null && (dVar instanceof e) && activity.getSupportFragmentManager().findFragmentByTag("k") == null) {
            FragmentTransaction fragmentTransactionBeginTransaction = activity.getSupportFragmentManager().beginTransaction();
            String str = dVar.f5467b;
            e eVar = (e) dVar;
            String strA = eVar.a();
            String strB = eVar.b();
            d dVar2 = this.O;
            if (dVar2 == null) {
                l.i("viewModel");
                throw null;
            }
            String str2 = dVar2.f.e().i;
            d dVar3 = this.O;
            if (dVar3 != null) {
                fragmentTransactionBeginTransaction.add(d0.b.f(str, strA, strB, str2, dVar3.f.e().f5568n, dVar.f5466a, iVar.f1163d, false, 1), "k").commit();
            } else {
                l.i("viewModel");
                throw null;
            }
        }
    }

    @Override // c.b
    public final void f(c.i iVar) {
        h8.d dVar = iVar.f1160a;
        d dVar2 = this.O;
        if (dVar2 == null) {
            l.i("viewModel");
            throw null;
        }
        m mVar = dVar2.f9335a;
        if (dVar instanceof f) {
            int i = dVar.f5466a;
            Boolean bool = iVar.f1161b;
            Boolean bool2 = Boolean.TRUE;
            if (l.a(bool, bool2)) {
                mVar.f10750r.set(i);
            } else {
                mVar.f10750r.unset(i);
            }
            UUID uuid = q.f5066a;
            String strValueOf = String.valueOf(l.a(iVar.f1161b, bool2));
            strValueOf.getClass();
            q.f5067b.h("Purposes_" + i, strValueOf);
            return;
        }
        if (dVar instanceof h8.b) {
            int i6 = dVar.f5466a;
            Boolean bool3 = iVar.f1161b;
            Boolean bool4 = Boolean.TRUE;
            if (l.a(bool3, bool4)) {
                mVar.f10749q.set(i6);
            } else {
                mVar.f10749q.unset(i6);
            }
            UUID uuid2 = q.f5066a;
            String strValueOf2 = String.valueOf(l.a(iVar.f1161b, bool4));
            strValueOf2.getClass();
            q.f5067b.h("Special Features_" + i6, strValueOf2);
        }
    }

    @Override // p9.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        ViewModelStore viewModelStore = activity.getViewModelStore();
        viewModelStore.getClass();
        d dVar = (d) new ViewModelProvider(viewModelStore, new b6.i(6)).get(d.class);
        this.O = dVar;
        if (dVar != null) {
            dVar.f9344o.observe(this, new b(this, 0));
        } else {
            l.i("viewModel");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.dialog_options, viewGroup, false);
        viewInflate.getClass();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() == 16908332) {
            requireActivity().getOnBackPressedDispatcher().onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0234  */
    @Override // p9.a, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instruction units count: 1428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s5.c.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
