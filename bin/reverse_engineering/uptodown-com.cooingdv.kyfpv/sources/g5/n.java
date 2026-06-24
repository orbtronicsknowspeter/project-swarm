package g5;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.leanback.app.RowsSupportFragment;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.HeaderItem;
import androidx.leanback.widget.ListRow;
import androidx.leanback.widget.ListRowPresenter;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import java.util.ArrayList;
import java.util.Iterator;
import x4.p2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends RowsSupportFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayObjectAdapter f5339b;

    public n() {
        ListRowPresenter listRowPresenter = new ListRowPresenter(0);
        listRowPresenter.setShadowEnabled(false);
        listRowPresenter.setSelectEffectEnabled(false);
        ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(listRowPresenter);
        this.f5339b = arrayObjectAdapter;
        setAdapter(arrayObjectAdapter);
    }

    public final void a(ArrayList arrayList, int i) {
        Iterator it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            p2 p2Var = (p2) next;
            if (p2Var.f11330a.f11225a == i) {
                if (getContext() != null) {
                    HeaderItem headerItem = new HeaderItem(p2Var.f11330a.f11226b);
                    Context contextRequireContext = requireContext();
                    contextRequireContext.getClass();
                    e5.j jVar = new e5.j();
                    jVar.f4743a = contextRequireContext;
                    ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(jVar);
                    arrayObjectAdapter.addAll(0, p2Var.f11331b);
                    c5.c cVar = new c5.c();
                    cVar.f2417a = p2Var.f11330a;
                    arrayObjectAdapter.add(cVar);
                    this.f5339b.add(new ListRow(headerItem, arrayObjectAdapter));
                } else {
                    this.f5338a = false;
                }
                arrayList.remove(p2Var);
                return;
            }
        }
    }

    public final void b(ArrayList arrayList, int i) {
        Iterator it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            p2 p2Var = (p2) next;
            if (p2Var.f11330a.f11225a == i) {
                if (getContext() != null) {
                    HeaderItem headerItem = new HeaderItem(p2Var.f11330a.f11226b);
                    Context contextRequireContext = requireContext();
                    contextRequireContext.getClass();
                    e5.i iVar = new e5.i();
                    iVar.f4742a = contextRequireContext;
                    ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(iVar);
                    arrayObjectAdapter.addAll(0, p2Var.f11331b);
                    c5.c cVar = new c5.c();
                    cVar.f2417a = p2Var.f11330a;
                    arrayObjectAdapter.add(cVar);
                    this.f5339b.add(new ListRow(headerItem, arrayObjectAdapter));
                } else {
                    this.f5338a = false;
                }
                arrayList.remove(p2Var);
                return;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f5338a) {
            return;
        }
        this.f5339b.clear();
        l lVar = new l(this);
        if (getContext() != null) {
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            b5.m mVar = new b5.m(contextRequireContext, lVar);
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            lifecycleScope.getClass();
            o7.c0.s(lifecycleScope, null, null, new b.s(mVar, (t6.c) null, 1), 3);
        }
    }

    @Override // androidx.leanback.app.RowsSupportFragment, androidx.leanback.app.BaseRowSupportFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        setOnItemViewClickedListener(new androidx.core.view.inputmethod.a(this, 21));
    }
}
