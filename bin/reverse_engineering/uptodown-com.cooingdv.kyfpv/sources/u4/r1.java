package u4;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.uptodown.R;
import com.uptodown.activities.ListsActivity;
import java.util.ArrayList;
import java.util.Iterator;
import x4.o2;
import x4.p2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class r1 implements r7.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1 f10593b;

    public /* synthetic */ r1(z1 z1Var, int i) {
        this.f10592a = i;
        this.f10593b = z1Var;
    }

    @Override // r7.i
    public final Object emit(Object obj, t6.c cVar) {
        boolean z9;
        int i = this.f10592a;
        p6.x xVar = p6.x.f8464a;
        z1 z1Var = this.f10593b;
        switch (i) {
            case 0:
                x4.i0 i0Var = (x4.i0) obj;
                if (i0Var instanceof x4.f0) {
                    z1Var.g(((x4.f0) i0Var).f11151a.f11356b);
                } else if (i0Var instanceof x4.h0) {
                    z1Var.g(((x4.h0) i0Var).f11210a.f11356b);
                } else if (!kotlin.jvm.internal.l.a(i0Var, x4.g0.f11199a) && !kotlin.jvm.internal.l.a(i0Var, x4.e0.f11138a)) {
                    com.google.gson.internal.a.b();
                    return null;
                }
                return xVar;
            case 1:
                z1Var.g(((x4.d0) obj).b());
                return xVar;
            case 2:
                x4.a1 a1Var = (x4.a1) obj;
                if (a1Var instanceof x4.w0) {
                    x4.r rVar = ((x4.w0) a1Var).f11428a;
                    z1Var.g(rVar != null ? rVar.f11356b : null);
                } else if (!kotlin.jvm.internal.l.a(a1Var, x4.x0.f11448a) && !kotlin.jvm.internal.l.a(a1Var, x4.z0.f11479a) && !kotlin.jvm.internal.l.a(a1Var, x4.v0.f11421a) && !(a1Var instanceof x4.y0)) {
                    com.google.gson.internal.a.b();
                    return null;
                }
                return xVar;
            case 3:
                z1Var.g(((x4.u0) obj).b());
                return xVar;
            case 4:
                j5.s sVar = (j5.s) obj;
                if (!(sVar instanceof j5.p)) {
                    if (sVar instanceof j5.r) {
                        if (((Boolean) ((j5.r) sVar).f6708a).booleanValue()) {
                            z1Var.a().f10230b.setImageDrawable(ContextCompat.getDrawable(z1Var.requireContext(), R.drawable.vector_favorite_remove));
                            if ((z1Var.getActivity() instanceof c4.k0) && z1Var.d().g) {
                                FragmentActivity activity = z1Var.getActivity();
                                activity.getClass();
                                String string = z1Var.getString(R.string.category_added_to_favorites, z1Var.f10684m.f11226b);
                                string.getClass();
                                ((c4.k0) activity).A(string);
                            }
                        } else {
                            z1Var.a().f10230b.setImageDrawable(ContextCompat.getDrawable(z1Var.requireContext(), R.drawable.vector_favorite_add));
                            if ((z1Var.getActivity() instanceof c4.k0) && z1Var.d().g) {
                                FragmentActivity activity2 = z1Var.getActivity();
                                activity2.getClass();
                                String string2 = z1Var.getString(R.string.category_removed_from_favorites, z1Var.f10684m.f11226b);
                                string2.getClass();
                                ((c4.k0) activity2).A(string2);
                            }
                        }
                        if (z1Var.d().g) {
                            z9 = true;
                        } else {
                            z9 = true;
                            z1Var.d().g = true;
                        }
                        if (z1Var.getActivity() instanceof ListsActivity) {
                            FragmentActivity activity3 = z1Var.getActivity();
                            activity3.getClass();
                            ((ListsActivity) activity3).Q = z9;
                        }
                    } else if (!(sVar instanceof j5.q)) {
                        com.google.gson.internal.a.b();
                        return null;
                    }
                }
                return xVar;
            default:
                j5.s sVar2 = (j5.s) obj;
                if (sVar2 instanceof j5.p) {
                    z1Var.a().f10232m.setVisibility(0);
                } else if (sVar2 instanceof j5.r) {
                    a2 a2Var = (a2) ((j5.r) sVar2).f6708a;
                    boolean z10 = a2Var.f10425b;
                    p2 p2Var = a2Var.f10424a;
                    if (!z10) {
                        e4.q0 q0Var = z1Var.f10686o;
                        if (q0Var != null) {
                            ArrayList arrayList = p2Var.f11331b;
                            int i6 = z1Var.f10684m.f11225a;
                            boolean z11 = (i6 == -3 || i6 == -2) ? false : true;
                            arrayList.getClass();
                            int size = q0Var.f4667l.size();
                            Iterator it = arrayList.iterator();
                            it.getClass();
                            while (it.hasNext()) {
                                Object next = it.next();
                                next.getClass();
                                e4.o0 o0Var = new e4.o0();
                                o0Var.f4649a = (x4.g) next;
                                o0Var.f4650b = 0;
                                if (z11) {
                                    int i10 = q0Var.f4668m + 1;
                                    q0Var.f4668m = i10;
                                    o0Var.f4651c = i10;
                                } else {
                                    o0Var.f4651c = 0;
                                }
                                q0Var.f4667l.add(o0Var);
                            }
                            q0Var.notifyItemRangeInserted(size, q0Var.f4667l.size());
                        }
                    } else if (p2Var.f11331b.isEmpty()) {
                        z1Var.a().f10233n.setVisibility(8);
                        z1Var.a().f10235p.setVisibility(0);
                        z1Var.a().f10236q.setVisibility(0);
                    } else {
                        if (z1Var.getActivity() != null && !z1Var.requireActivity().isFinishing()) {
                            String str = p2Var.f11330a.f11226b;
                            if (str == null || str.length() == 0) {
                                z1Var.f10685n = z1Var.getResources().getString(R.string.top_downloads_title);
                            } else {
                                z1Var.f10685n = p2Var.f11330a.f11226b;
                            }
                            z1Var.a().f10237r.setText(z1Var.f10685n);
                            p1 p1Var = z1Var.f10687p;
                            o1 o1Var = z1Var.f10689r;
                            o1 o1Var2 = z1Var.f10690s;
                            p1 p1Var2 = z1Var.f10688q;
                            x4.j jVar = p2Var.f11330a;
                            z1Var.f10686o = new e4.q0(p1Var, o1Var, o1Var2, p1Var2, jVar.f11227l, p2Var.f11333d, p2Var.f11334e, jVar.f11226b, false, new o1(z1Var), new p1(z1Var));
                            boolean z12 = p2Var.f11333d != null;
                            z1Var.a().f10233n.addItemDecoration(new l5.k());
                            e4.q0 q0Var2 = z1Var.f10686o;
                            if (q0Var2 != null) {
                                q0Var2.a(p2Var);
                            }
                            z1Var.a().f10233n.setAdapter(z1Var.f10686o);
                            if (z12) {
                                o2 o2Var = p2Var.f11333d;
                                o2Var.getClass();
                                if (o2Var.g != null) {
                                    z1Var.a().f10231l.setVisibility(0);
                                    z1Var.a().f10231l.setOnClickListener(new f(11, p2Var, z1Var));
                                }
                            }
                        }
                        z1Var.a().f10233n.setVisibility(0);
                        z1Var.a().f10235p.setVisibility(8);
                        z1Var.a().f10236q.setVisibility(8);
                    }
                    z1Var.d().f10463e = false;
                    z1Var.a().f10232m.setVisibility(8);
                } else if (!(sVar2 instanceof j5.q)) {
                    com.google.gson.internal.a.b();
                    return null;
                }
                return xVar;
        }
    }
}
