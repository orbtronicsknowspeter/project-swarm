package l6;

import android.R;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b2.t1;
import c.h;
import c.i;
import c.j;
import h8.e;
import h8.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.l;
import s5.d;
import u5.m;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends p9.a implements c.b {
    public static final /* synthetic */ int I = 0;
    public Button A;
    public RecyclerView B;
    public TextView C;
    public ConstraintLayout D;
    public int E;
    public h F;
    public c G;
    public d H;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Button f7148z;

    public final ColorStateList a() {
        h9.d dVar = this.f8503s;
        if (dVar == null) {
            return null;
        }
        Integer num = dVar.f5506p;
        Integer num2 = dVar.f5505o;
        if (num2 == null || num == null) {
            return null;
        }
        return new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{num2.intValue(), num.intValue()});
    }

    public final void b(LinkedHashSet linkedHashSet) {
        boolean z9;
        Button button = this.A;
        boolean z10 = false;
        if (button != null) {
            if (linkedHashSet.isEmpty()) {
                z9 = false;
                button.setEnabled(z9);
            } else {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    if (((Boolean) it.next()).booleanValue()) {
                        z9 = true;
                        break;
                    }
                }
                z9 = false;
                button.setEnabled(z9);
            }
        }
        Button button2 = this.f7148z;
        if (button2 == null) {
            return;
        }
        if (!linkedHashSet.isEmpty()) {
            Iterator it2 = linkedHashSet.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (!((Boolean) it2.next()).booleanValue()) {
                    z10 = true;
                    break;
                }
            }
        }
        button2.setEnabled(z10);
    }

    public final ColorStateList c() {
        h9.d dVar = this.f8503s;
        if (dVar == null) {
            return null;
        }
        Integer num = dVar.f5504n;
        Integer num2 = dVar.f5503m;
        if (num2 == null || num == null) {
            return null;
        }
        return new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{num2.intValue(), num.intValue()});
    }

    public final void d() {
        h hVar = this.F;
        if (hVar == null) {
            l.i("switchAdapter");
            throw null;
        }
        c cVar = this.G;
        if (cVar == null) {
            l.i("viewModel");
            throw null;
        }
        int i = this.E;
        ArrayList arrayListC = cVar.c(i);
        arrayListC.addAll(cVar.d(i));
        hVar.f1155a = arrayListC;
        hVar.notifyDataSetChanged();
        c cVar2 = this.G;
        if (cVar2 != null) {
            b(cVar2.b(this.E));
        } else {
            l.i("viewModel");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c.b
    public final void e(i iVar) {
        h8.d dVar = iVar.f1160a;
        FragmentActivity activity = getActivity();
        if (activity != null && (dVar instanceof e) && activity.getSupportFragmentManager().findFragmentByTag("k") == null) {
            FragmentTransaction fragmentTransactionBeginTransaction = activity.getSupportFragmentManager().beginTransaction();
            String str = dVar.f5467b;
            e eVar = (e) dVar;
            String strA = eVar.a();
            String strB = eVar.b();
            c cVar = this.G;
            if (cVar == null) {
                l.i("viewModel");
                throw null;
            }
            String str2 = cVar.a().f5603b;
            c cVar2 = this.G;
            if (cVar2 != null) {
                fragmentTransactionBeginTransaction.add(d0.b.f(str, strA, strB, str2, cVar2.a().f5606e, dVar.f5466a, iVar.f1163d, false, 1), "k").commit();
            } else {
                l.i("viewModel");
                throw null;
            }
        }
    }

    @Override // c.b
    public final void f(i iVar) {
        h8.d dVar = iVar.f1160a;
        c cVar = this.G;
        if (cVar == null) {
            l.i("viewModel");
            throw null;
        }
        m mVar = cVar.f7149a;
        int iC = j.c(iVar.f1163d);
        if (iC != 4) {
            if (iC == 7) {
                if (l.a(iVar.f1161b, Boolean.TRUE)) {
                    mVar.f10749q.set(dVar.f5466a);
                } else {
                    mVar.f10749q.unset(dVar.f5466a);
                }
            }
        } else if (l.a(iVar.f1161b, Boolean.TRUE)) {
            mVar.f10750r.set(dVar.f5466a);
        } else {
            mVar.f10750r.unset(dVar.f5466a);
        }
        c cVar2 = this.G;
        if (cVar2 != null) {
            b(cVar2.b(this.E));
        } else {
            l.i("viewModel");
            throw null;
        }
    }

    @Override // p9.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        ViewModelStore viewModelStore = getViewModelStore();
        viewModelStore.getClass();
        this.G = (c) new ViewModelProvider(viewModelStore, new b6.i(2)).get(c.class);
        ViewModelStore viewModelStore2 = activity.getViewModelStore();
        viewModelStore2.getClass();
        this.H = (d) new ViewModelProvider(viewModelStore2, new b6.i(6)).get(d.class);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(com.uptodown.R.layout.dialog_stacks, viewGroup, false);
        viewInflate.getClass();
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        d dVar = this.H;
        if (dVar != null) {
            dVar.f9344o.postValue(Boolean.TRUE);
        } else {
            l.i("optionsViewModel");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() == 16908332) {
            requireActivity().getOnBackPressedDispatcher().onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // p9.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Map map;
        g gVar;
        view.getClass();
        super.onViewCreated(view, bundle);
        this.f7148z = (Button) view.findViewById(com.uptodown.R.id.btn_agree_to_all);
        this.A = (Button) view.findViewById(com.uptodown.R.id.btn_disagree_to_all);
        this.B = (RecyclerView) view.findViewById(com.uptodown.R.id.rv_switch_item_list);
        this.C = (TextView) view.findViewById(com.uptodown.R.id.tv_stack_name);
        this.D = (ConstraintLayout) view.findViewById(com.uptodown.R.id.stacks_container);
        Bundle arguments = getArguments();
        final int i = 0;
        int i6 = arguments == null ? 0 : arguments.getInt("stack_id");
        this.E = i6;
        TextView textView = this.C;
        if (textView != null) {
            c cVar = this.G;
            if (cVar == null) {
                l.i("viewModel");
                throw null;
            }
            h8.c cVar2 = cVar.f7149a.f10738a;
            textView.setText((cVar2 == null || (map = cVar2.i) == null || (gVar = (g) map.get(String.valueOf(i6))) == null) ? null : gVar.f5467b);
        }
        TextView textView2 = this.f8495b;
        if (textView2 != null) {
            c cVar3 = this.G;
            if (cVar3 == null) {
                l.i("viewModel");
                throw null;
            }
            textView2.setText(cVar3.a().f5602a);
        }
        ImageView imageView = this.f8496l;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: l6.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b f7147b;

                {
                    this.f7147b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i10 = i;
                    int i11 = 0;
                    b bVar = this.f7147b;
                    switch (i10) {
                        case 0:
                            bVar.dismiss();
                            return;
                        case 1:
                            c cVar4 = bVar.G;
                            if (cVar4 == null) {
                                l.i("viewModel");
                                throw null;
                            }
                            m mVar = cVar4.f7149a;
                            int i12 = bVar.E;
                            ArrayList arrayListC = cVar4.c(i12);
                            int size = arrayListC.size();
                            int i13 = 0;
                            while (i13 < size) {
                                Object obj = arrayListC.get(i13);
                                i13++;
                                mVar.f10750r.unset(((i) obj).f1160a.f5466a);
                            }
                            ArrayList arrayListD = cVar4.d(i12);
                            int size2 = arrayListD.size();
                            while (i11 < size2) {
                                Object obj2 = arrayListD.get(i11);
                                i11++;
                                mVar.f10749q.unset(((i) obj2).f1160a.f5466a);
                            }
                            bVar.d();
                            return;
                        default:
                            c cVar5 = bVar.G;
                            if (cVar5 == null) {
                                l.i("viewModel");
                                throw null;
                            }
                            m mVar2 = cVar5.f7149a;
                            int i14 = bVar.E;
                            ArrayList arrayListC2 = cVar5.c(i14);
                            int size3 = arrayListC2.size();
                            int i15 = 0;
                            while (i15 < size3) {
                                Object obj3 = arrayListC2.get(i15);
                                i15++;
                                mVar2.f10750r.set(((i) obj3).f1160a.f5466a);
                            }
                            ArrayList arrayListD2 = cVar5.d(i14);
                            int size4 = arrayListD2.size();
                            while (i11 < size4) {
                                Object obj4 = arrayListD2.get(i11);
                                i11++;
                                mVar2.f10749q.set(((i) obj4).f1160a.f5466a);
                            }
                            bVar.d();
                            return;
                    }
                }
            });
            c cVar4 = this.G;
            if (cVar4 == null) {
                l.i("viewModel");
                throw null;
            }
            imageView.setContentDescription(cVar4.a().f);
        }
        h9.d dVar = this.f8503s;
        if (dVar != null) {
            Integer num = dVar.g;
            if (num != null) {
                int iIntValue = num.intValue();
                ConstraintLayout constraintLayout = this.D;
                if (constraintLayout != null) {
                    constraintLayout.setBackgroundColor(iIntValue);
                }
            }
            Integer num2 = dVar.i;
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                TextView textView3 = this.C;
                if (textView3 != null) {
                    textView3.setTextColor(iIntValue2);
                }
            }
            Button button = this.f7148z;
            if (button != null) {
                ColorStateList colorStateListC = c();
                if (colorStateListC != null) {
                    button.setTextColor(colorStateListC);
                }
                ColorStateList colorStateListA = a();
                if (colorStateListA != null) {
                    button.setBackgroundTintList(colorStateListA);
                }
            }
            Button button2 = this.A;
            if (button2 != null) {
                ColorStateList colorStateListC2 = c();
                if (colorStateListC2 != null) {
                    button2.setTextColor(colorStateListC2);
                }
                ColorStateList colorStateListA2 = a();
                if (colorStateListA2 != null) {
                    button2.setBackgroundTintList(colorStateListA2);
                }
            }
        }
        final int i10 = 2;
        final int i11 = 1;
        t1.f(this.f8505u, this.f7148z, this.A);
        t1.f(this.f8504t, this.C);
        c cVar5 = this.G;
        if (cVar5 == null) {
            l.i("viewModel");
            throw null;
        }
        int i12 = this.E;
        ArrayList arrayListC = cVar5.c(i12);
        arrayListC.addAll(cVar5.d(i12));
        h9.d dVar2 = this.f8503s;
        this.F = new h(arrayListC, this, (String) null, dVar2 == null ? null : dVar2.i, dVar2 == null ? null : dVar2.f5500e, dVar2 == null ? null : dVar2.f, dVar2 == null ? null : dVar2.f5496a, this.f8504t, this.v, 12);
        RecyclerView recyclerView = this.B;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            h hVar = this.F;
            if (hVar == null) {
                l.i("switchAdapter");
                throw null;
            }
            recyclerView.setAdapter(hVar);
        }
        Button button3 = this.A;
        if (button3 != null) {
            button3.setText(getString(com.uptodown.R.string.disagree_to_all));
        }
        c cVar6 = this.G;
        if (cVar6 == null) {
            l.i("viewModel");
            throw null;
        }
        b(cVar6.b(this.E));
        Button button4 = this.A;
        if (button4 != null) {
            button4.setOnClickListener(new View.OnClickListener(this) { // from class: l6.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b f7147b;

                {
                    this.f7147b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i102 = i11;
                    int i112 = 0;
                    b bVar = this.f7147b;
                    switch (i102) {
                        case 0:
                            bVar.dismiss();
                            return;
                        case 1:
                            c cVar42 = bVar.G;
                            if (cVar42 == null) {
                                l.i("viewModel");
                                throw null;
                            }
                            m mVar = cVar42.f7149a;
                            int i122 = bVar.E;
                            ArrayList arrayListC2 = cVar42.c(i122);
                            int size = arrayListC2.size();
                            int i13 = 0;
                            while (i13 < size) {
                                Object obj = arrayListC2.get(i13);
                                i13++;
                                mVar.f10750r.unset(((i) obj).f1160a.f5466a);
                            }
                            ArrayList arrayListD = cVar42.d(i122);
                            int size2 = arrayListD.size();
                            while (i112 < size2) {
                                Object obj2 = arrayListD.get(i112);
                                i112++;
                                mVar.f10749q.unset(((i) obj2).f1160a.f5466a);
                            }
                            bVar.d();
                            return;
                        default:
                            c cVar52 = bVar.G;
                            if (cVar52 == null) {
                                l.i("viewModel");
                                throw null;
                            }
                            m mVar2 = cVar52.f7149a;
                            int i14 = bVar.E;
                            ArrayList arrayListC22 = cVar52.c(i14);
                            int size3 = arrayListC22.size();
                            int i15 = 0;
                            while (i15 < size3) {
                                Object obj3 = arrayListC22.get(i15);
                                i15++;
                                mVar2.f10750r.set(((i) obj3).f1160a.f5466a);
                            }
                            ArrayList arrayListD2 = cVar52.d(i14);
                            int size4 = arrayListD2.size();
                            while (i112 < size4) {
                                Object obj4 = arrayListD2.get(i112);
                                i112++;
                                mVar2.f10749q.set(((i) obj4).f1160a.f5466a);
                            }
                            bVar.d();
                            return;
                    }
                }
            });
        }
        Button button5 = this.f7148z;
        if (button5 != null) {
            c cVar7 = this.G;
            if (cVar7 == null) {
                l.i("viewModel");
                throw null;
            }
            button5.setText(cVar7.a().f5604c);
        }
        Button button6 = this.f7148z;
        if (button6 == null) {
            return;
        }
        button6.setOnClickListener(new View.OnClickListener(this) { // from class: l6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f7147b;

            {
                this.f7147b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i102 = i10;
                int i112 = 0;
                b bVar = this.f7147b;
                switch (i102) {
                    case 0:
                        bVar.dismiss();
                        return;
                    case 1:
                        c cVar42 = bVar.G;
                        if (cVar42 == null) {
                            l.i("viewModel");
                            throw null;
                        }
                        m mVar = cVar42.f7149a;
                        int i122 = bVar.E;
                        ArrayList arrayListC2 = cVar42.c(i122);
                        int size = arrayListC2.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayListC2.get(i13);
                            i13++;
                            mVar.f10750r.unset(((i) obj).f1160a.f5466a);
                        }
                        ArrayList arrayListD = cVar42.d(i122);
                        int size2 = arrayListD.size();
                        while (i112 < size2) {
                            Object obj2 = arrayListD.get(i112);
                            i112++;
                            mVar.f10749q.unset(((i) obj2).f1160a.f5466a);
                        }
                        bVar.d();
                        return;
                    default:
                        c cVar52 = bVar.G;
                        if (cVar52 == null) {
                            l.i("viewModel");
                            throw null;
                        }
                        m mVar2 = cVar52.f7149a;
                        int i14 = bVar.E;
                        ArrayList arrayListC22 = cVar52.c(i14);
                        int size3 = arrayListC22.size();
                        int i15 = 0;
                        while (i15 < size3) {
                            Object obj3 = arrayListC22.get(i15);
                            i15++;
                            mVar2.f10750r.set(((i) obj3).f1160a.f5466a);
                        }
                        ArrayList arrayListD2 = cVar52.d(i14);
                        int size4 = arrayListD2.size();
                        while (i112 < size4) {
                            Object obj4 = arrayListD2.get(i112);
                            i112++;
                            mVar2.f10749q.set(((i) obj4).f1160a.f5466a);
                        }
                        bVar.d();
                        return;
                }
            }
        });
    }
}
