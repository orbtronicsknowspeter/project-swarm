package z5;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b2.t1;
import c.h;
import c.i;
import com.uptodown.R;
import f9.q;
import j9.f;
import java.util.ArrayList;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.l;
import m5.u0;
import o7.a0;
import o7.c0;
import o7.m0;
import u5.m;
import v7.e;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends p9.a implements c.b {
    public RecyclerView A;
    public d B;
    public h C;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ConstraintLayout f11975z;

    public final void a() {
        CharSequence query;
        SearchView searchView = this.f8498n;
        if (searchView == null || (query = searchView.getQuery()) == null) {
            return;
        }
        h hVar = this.C;
        if (hVar == null) {
            l.i("switchAdapter");
            throw null;
        }
        d dVar = this.B;
        if (dVar == null) {
            l.i("viewModel");
            throw null;
        }
        ArrayList arrayListC = dVar.c(query.toString());
        boolean z9 = query.length() > 0;
        hVar.f1155a = arrayListC;
        if (!z9) {
            hVar.a();
        }
        hVar.notifyDataSetChanged();
    }

    @Override // c.b
    public final void e(i iVar) {
        String string;
        String string2;
        String str;
        h8.d dVar = iVar.f1160a;
        FragmentActivity activity = getActivity();
        if (activity != null && (dVar instanceof h8.i) && activity.getSupportFragmentManager().findFragmentByTag("d") == null) {
            String str2 = dVar.f5467b;
            h8.i iVar2 = (h8.i) dVar;
            Set set = iVar2.f5482p;
            String str3 = iVar2.j;
            String str4 = iVar2.f5474c;
            d dVar2 = this.B;
            if (dVar2 == null) {
                l.i("viewModel");
                throw null;
            }
            String strA = dVar2.a(iVar2.f5475d, 1);
            d dVar3 = this.B;
            if (dVar3 == null) {
                l.i("viewModel");
                throw null;
            }
            String strA2 = dVar3.a(iVar2.g, 2);
            d dVar4 = this.B;
            if (dVar4 == null) {
                l.i("viewModel");
                throw null;
            }
            String strA3 = dVar4.a(iVar2.h, 3);
            d dVar5 = this.B;
            if (dVar5 == null) {
                l.i("viewModel");
                throw null;
            }
            String strA4 = dVar5.a(iVar2.i, 4);
            d dVar6 = this.B;
            if (dVar6 == null) {
                l.i("viewModel");
                throw null;
            }
            String strA5 = dVar6.a(iVar2.f5480n, 5);
            if (str3.length() == 0) {
                h8.h hVar = (h8.h) q6.l.s0(set);
                str3 = hVar == null ? "" : hVar.f5472a;
            }
            d dVar7 = this.B;
            if (dVar7 == null) {
                l.i("viewModel");
                throw null;
            }
            f fVar = dVar7.f11976a;
            int i = iVar2.f5478l;
            if (i < 0) {
                string = "";
            } else {
                float f = i / 86400.0f;
                if (f >= 1.0f) {
                    StringBuilder sb = new StringBuilder();
                    if (Float.isNaN(f)) {
                        com.google.gson.internal.a.p("Cannot round NaN value.");
                        return;
                    }
                    sb.append(Math.round(f));
                    sb.append(' ');
                    sb.append(fVar.g().i);
                    string = sb.toString();
                } else {
                    string = i + ' ' + fVar.g().j;
                }
            }
            d dVar8 = this.B;
            if (dVar8 == null) {
                l.i("viewModel");
                throw null;
            }
            f fVar2 = dVar8.f11976a;
            String str5 = string;
            Boolean bool = iVar2.f5479m;
            String str6 = l.a(bool, Boolean.TRUE) ? fVar2.g().f5580m : l.a(bool, Boolean.FALSE) ? fVar2.g().f5581n : "";
            d dVar9 = this.B;
            if (dVar9 == null) {
                l.i("viewModel");
                throw null;
            }
            g2.c cVar = iVar2.f5481o;
            if (cVar == null || (string2 = Integer.valueOf(cVar.f5112a).toString()) == null) {
                string2 = "";
            }
            if (string2.length() == 0) {
                str = str6;
            } else {
                str = str6;
                string2 = string2 + ' ' + dVar9.f11976a.g().i;
            }
            int i6 = dVar.f5466a;
            int i10 = iVar.f1163d;
            String str7 = iVar2.f5483q;
            String string3 = getString(R.string.vendor_disclosure_load_error);
            string3.getClass();
            h8.h hVar2 = (h8.h) q6.l.s0(set);
            x5.b bVar = new x5.b(str2, str4, strA, null, strA2, strA3, strA4, strA5, str3, str5, str, string2, i6, i10, str7, string3, hVar2 != null ? hVar2.f5473b : "", 8);
            x5.d dVar10 = new x5.d();
            Bundle bundle = new Bundle();
            bundle.putParcelable("partner_detail_args", bVar);
            dVar10.setArguments(bundle);
            activity.getSupportFragmentManager().beginTransaction().add(dVar10, "d").commit();
        }
    }

    @Override // c.b
    public final void f(i iVar) {
        int i = iVar.f1163d;
        h8.d dVar = iVar.f1160a;
        d dVar2 = this.B;
        if (dVar2 == null) {
            l.i("viewModel");
            throw null;
        }
        m mVar = dVar2.f11977b;
        if (i == 2) {
            Boolean bool = iVar.f1161b;
            Boolean bool2 = Boolean.TRUE;
            if (l.a(bool, bool2)) {
                mVar.A.set(dVar.f5466a);
                UUID uuid = q.f5066a;
                String str = "Non IAB_" + dVar.f5466a;
                String strValueOf = String.valueOf(l.a(iVar.f1161b, bool2));
                strValueOf.getClass();
                q.f5067b.h(str, strValueOf);
                return;
            }
        }
        if (i == 2 && l.a(iVar.f1161b, Boolean.FALSE)) {
            mVar.A.unset(dVar.f5466a);
            UUID uuid2 = q.f5066a;
            String str2 = "Non IAB_" + dVar.f5466a;
            String strValueOf2 = String.valueOf(l.a(iVar.f1161b, Boolean.TRUE));
            strValueOf2.getClass();
            q.f5067b.h(str2, strValueOf2);
            return;
        }
        if (i == 1) {
            Boolean bool3 = iVar.f1161b;
            Boolean bool4 = Boolean.TRUE;
            if (l.a(bool3, bool4)) {
                mVar.f10757z.set(dVar.f5466a);
                UUID uuid3 = q.f5066a;
                String str3 = "Vendors_" + dVar.f5466a;
                String strValueOf3 = String.valueOf(l.a(iVar.f1161b, bool4));
                strValueOf3.getClass();
                q.f5067b.h(str3, strValueOf3);
                return;
            }
        }
        if (i == 1 && l.a(iVar.f1161b, Boolean.FALSE)) {
            mVar.f10757z.unset(dVar.f5466a);
            UUID uuid4 = q.f5066a;
            String str4 = "Vendors_" + dVar.f5466a;
            String strValueOf4 = String.valueOf(l.a(iVar.f1161b, Boolean.TRUE));
            strValueOf4.getClass();
            q.f5067b.h(str4, strValueOf4);
            return;
        }
        if (i == 3) {
            Boolean bool5 = iVar.f1161b;
            Boolean bool6 = Boolean.TRUE;
            if (l.a(bool5, bool6)) {
                mVar.B.set(dVar.f5466a);
                UUID uuid5 = q.f5066a;
                String str5 = "Google_" + dVar.f5466a;
                String strValueOf5 = String.valueOf(l.a(iVar.f1161b, bool6));
                strValueOf5.getClass();
                q.f5067b.h(str5, strValueOf5);
                return;
            }
        }
        if (i == 3 && l.a(iVar.f1161b, Boolean.FALSE)) {
            mVar.B.unset(dVar.f5466a);
            UUID uuid6 = q.f5066a;
            String str6 = "Google_" + dVar.f5466a;
            String strValueOf6 = String.valueOf(l.a(iVar.f1161b, Boolean.TRUE));
            strValueOf6.getClass();
            q.f5067b.h(str6, strValueOf6);
            return;
        }
        if (i == 4) {
            Boolean bool7 = iVar.f1161b;
            Boolean bool8 = Boolean.TRUE;
            if (l.a(bool7, bool8)) {
                mVar.f10752t.set(dVar.f5466a);
                mVar.v.setItems(q6.l.J0(((h8.i) dVar).f5475d));
                UUID uuid7 = q.f5066a;
                String str7 = "Vendors_" + dVar.f5466a;
                String strValueOf7 = String.valueOf(l.a(iVar.f1161b, bool8));
                strValueOf7.getClass();
                q.f5067b.h(str7, strValueOf7);
                return;
            }
        }
        if (i == 4 && l.a(iVar.f1161b, Boolean.FALSE)) {
            mVar.f10752t.unset(dVar.f5466a);
            mVar.v.unset(q6.l.J0(((h8.i) dVar).f5475d));
            UUID uuid8 = q.f5066a;
            String str8 = "Vendors_" + dVar.f5466a;
            String strValueOf8 = String.valueOf(l.a(iVar.f1161b, Boolean.TRUE));
            strValueOf8.getClass();
            q.f5067b.h(str8, strValueOf8);
        }
    }

    @Override // p9.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() == null) {
            return;
        }
        ViewModelStore viewModelStore = getViewModelStore();
        viewModelStore.getClass();
        this.B = (d) new ViewModelProvider(viewModelStore, new b6.i(9)).get(d.class);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.dialog_partners, viewGroup, false);
        viewInflate.getClass();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        d dVar = this.B;
        if (dVar == null) {
            l.i("viewModel");
            throw null;
        }
        SearchView searchView = this.f8498n;
        dVar.f11981k = searchView == null ? false : searchView.hasFocus();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p9.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws Throwable {
        Throwable th;
        Float f;
        Typeface typeface;
        SearchView searchView;
        Integer num;
        view.getClass();
        super.onViewCreated(view, bundle);
        this.f11975z = (ConstraintLayout) view.findViewById(R.id.partners_container);
        this.A = (RecyclerView) view.findViewById(R.id.rv_partners_list);
        d dVar = this.B;
        if (dVar == null) {
            l.i("viewModel");
            throw null;
        }
        a0 viewModelScope = ViewModelKt.getViewModelScope(dVar);
        e eVar = m0.f8289a;
        v7.d dVar2 = v7.d.f10885a;
        p9.c cVar = new p9.c(dVar, (t6.c) null, 13);
        final int i = 2;
        c0.s(viewModelScope, dVar2, null, cVar, 2);
        TextView textView = this.f8495b;
        if (textView != null) {
            d dVar3 = this.B;
            if (dVar3 == null) {
                l.i("viewModel");
                throw null;
            }
            textView.setText(t1.d(dVar3.f11976a.f().f5585a));
        }
        ImageView imageView = this.f8496l;
        if (imageView != null) {
            imageView.setOnClickListener(new u0(this, 11));
            d dVar4 = this.B;
            if (dVar4 == null) {
                l.i("viewModel");
                throw null;
            }
            imageView.setContentDescription(dVar4.f11976a.f().g);
        }
        d dVar5 = this.B;
        if (dVar5 == null) {
            l.i("viewModel");
            throw null;
        }
        int i6 = 0;
        if (dVar5.e().isEmpty() && dVar5.b().isEmpty()) {
            th = null;
        } else {
            Toolbar toolbar = this.f8494a;
            final ImageView imageView2 = toolbar == null ? null : (ImageView) toolbar.findViewById(R.id.toolbar_menu);
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.list_partner_menu, (ViewGroup) null);
            final CardView cardView = (CardView) viewInflate.findViewById(R.id.cv_menu_item);
            final TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_menu_all);
            final TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_menu_iab);
            final TextView textView4 = (TextView) viewInflate.findViewById(R.id.tv_menu_non_iab);
            final TextView textView5 = (TextView) viewInflate.findViewById(R.id.tv_menu_google);
            textView2.getClass();
            textView3.getClass();
            textView4.getClass();
            textView5.getClass();
            n9.a aVar = this.v;
            th = null;
            TextView[] textViewArr = {textView2, textView3, textView4, textView5};
            if (aVar != null && (typeface = aVar.f8120a) != null) {
                while (i6 < 4) {
                    TextView textView6 = textViewArr[i6];
                    i6++;
                    if (textView6 != null) {
                        textView6.setTypeface(typeface);
                    }
                }
            }
            if (aVar != null && (f = aVar.f8121b) != null) {
                float fFloatValue = f.floatValue();
                int i10 = 0;
                while (i10 < 4) {
                    TextView textView7 = textViewArr[i10];
                    i10++;
                    if (textView7 != null) {
                        textView7.setTextSize(2, fFloatValue);
                    }
                }
            }
            d dVar6 = this.B;
            if (dVar6 == null) {
                l.i("viewModel");
                throw null;
            }
            if (dVar6.e().isEmpty()) {
                textView4.setVisibility(8);
            }
            d dVar7 = this.B;
            if (dVar7 == null) {
                l.i("viewModel");
                throw null;
            }
            if (dVar7.b().isEmpty()) {
                textView5.setVisibility(8);
            }
            final int i11 = 1;
            final PopupWindow popupWindow = new PopupWindow(viewInflate, 600, -2, true);
            popupWindow.setElevation(10.0f);
            final int i12 = 0;
            textView2.setOnClickListener(new View.OnClickListener() { // from class: z5.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i13 = i12;
                    c cVar2 = this;
                    PopupWindow popupWindow2 = popupWindow;
                    switch (i13) {
                        case 0:
                            popupWindow2.dismiss();
                            TextView textView8 = cVar2.f8495b;
                            if (textView8 != null) {
                                textView8.setText(cVar2.getString(R.string.all_partners_toolbar_title));
                            }
                            d dVar8 = cVar2.B;
                            if (dVar8 == null) {
                                l.i("viewModel");
                                throw null;
                            }
                            dVar8.j = 1;
                            cVar2.a();
                            return;
                        case 1:
                            popupWindow2.dismiss();
                            TextView textView9 = cVar2.f8495b;
                            if (textView9 != null) {
                                textView9.setText(cVar2.getString(R.string.iab_partners_toolbar_title));
                            }
                            d dVar9 = cVar2.B;
                            if (dVar9 == null) {
                                l.i("viewModel");
                                throw null;
                            }
                            dVar9.j = 2;
                            cVar2.a();
                            return;
                        case 2:
                            popupWindow2.dismiss();
                            TextView textView10 = cVar2.f8495b;
                            if (textView10 != null) {
                                textView10.setText(cVar2.getString(R.string.non_iab_partners_toolbar_title));
                            }
                            d dVar10 = cVar2.B;
                            if (dVar10 == null) {
                                l.i("viewModel");
                                throw null;
                            }
                            dVar10.j = 3;
                            cVar2.a();
                            return;
                        default:
                            popupWindow2.dismiss();
                            TextView textView11 = cVar2.f8495b;
                            if (textView11 != null) {
                                textView11.setText(cVar2.getString(R.string.google_partners_toolbar_title));
                            }
                            d dVar11 = cVar2.B;
                            if (dVar11 == null) {
                                l.i("viewModel");
                                throw null;
                            }
                            dVar11.j = 4;
                            cVar2.a();
                            return;
                    }
                }
            });
            textView3.setOnClickListener(new View.OnClickListener() { // from class: z5.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i13 = i11;
                    c cVar2 = this;
                    PopupWindow popupWindow2 = popupWindow;
                    switch (i13) {
                        case 0:
                            popupWindow2.dismiss();
                            TextView textView8 = cVar2.f8495b;
                            if (textView8 != null) {
                                textView8.setText(cVar2.getString(R.string.all_partners_toolbar_title));
                            }
                            d dVar8 = cVar2.B;
                            if (dVar8 == null) {
                                l.i("viewModel");
                                throw null;
                            }
                            dVar8.j = 1;
                            cVar2.a();
                            return;
                        case 1:
                            popupWindow2.dismiss();
                            TextView textView9 = cVar2.f8495b;
                            if (textView9 != null) {
                                textView9.setText(cVar2.getString(R.string.iab_partners_toolbar_title));
                            }
                            d dVar9 = cVar2.B;
                            if (dVar9 == null) {
                                l.i("viewModel");
                                throw null;
                            }
                            dVar9.j = 2;
                            cVar2.a();
                            return;
                        case 2:
                            popupWindow2.dismiss();
                            TextView textView10 = cVar2.f8495b;
                            if (textView10 != null) {
                                textView10.setText(cVar2.getString(R.string.non_iab_partners_toolbar_title));
                            }
                            d dVar10 = cVar2.B;
                            if (dVar10 == null) {
                                l.i("viewModel");
                                throw null;
                            }
                            dVar10.j = 3;
                            cVar2.a();
                            return;
                        default:
                            popupWindow2.dismiss();
                            TextView textView11 = cVar2.f8495b;
                            if (textView11 != null) {
                                textView11.setText(cVar2.getString(R.string.google_partners_toolbar_title));
                            }
                            d dVar11 = cVar2.B;
                            if (dVar11 == null) {
                                l.i("viewModel");
                                throw null;
                            }
                            dVar11.j = 4;
                            cVar2.a();
                            return;
                    }
                }
            });
            textView4.setOnClickListener(new View.OnClickListener() { // from class: z5.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i13 = i;
                    c cVar2 = this;
                    PopupWindow popupWindow2 = popupWindow;
                    switch (i13) {
                        case 0:
                            popupWindow2.dismiss();
                            TextView textView8 = cVar2.f8495b;
                            if (textView8 != null) {
                                textView8.setText(cVar2.getString(R.string.all_partners_toolbar_title));
                            }
                            d dVar8 = cVar2.B;
                            if (dVar8 == null) {
                                l.i("viewModel");
                                throw null;
                            }
                            dVar8.j = 1;
                            cVar2.a();
                            return;
                        case 1:
                            popupWindow2.dismiss();
                            TextView textView9 = cVar2.f8495b;
                            if (textView9 != null) {
                                textView9.setText(cVar2.getString(R.string.iab_partners_toolbar_title));
                            }
                            d dVar9 = cVar2.B;
                            if (dVar9 == null) {
                                l.i("viewModel");
                                throw null;
                            }
                            dVar9.j = 2;
                            cVar2.a();
                            return;
                        case 2:
                            popupWindow2.dismiss();
                            TextView textView10 = cVar2.f8495b;
                            if (textView10 != null) {
                                textView10.setText(cVar2.getString(R.string.non_iab_partners_toolbar_title));
                            }
                            d dVar10 = cVar2.B;
                            if (dVar10 == null) {
                                l.i("viewModel");
                                throw null;
                            }
                            dVar10.j = 3;
                            cVar2.a();
                            return;
                        default:
                            popupWindow2.dismiss();
                            TextView textView11 = cVar2.f8495b;
                            if (textView11 != null) {
                                textView11.setText(cVar2.getString(R.string.google_partners_toolbar_title));
                            }
                            d dVar11 = cVar2.B;
                            if (dVar11 == null) {
                                l.i("viewModel");
                                throw null;
                            }
                            dVar11.j = 4;
                            cVar2.a();
                            return;
                    }
                }
            });
            final int i13 = 3;
            textView5.setOnClickListener(new View.OnClickListener() { // from class: z5.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i132 = i13;
                    c cVar2 = this;
                    PopupWindow popupWindow2 = popupWindow;
                    switch (i132) {
                        case 0:
                            popupWindow2.dismiss();
                            TextView textView8 = cVar2.f8495b;
                            if (textView8 != null) {
                                textView8.setText(cVar2.getString(R.string.all_partners_toolbar_title));
                            }
                            d dVar8 = cVar2.B;
                            if (dVar8 == null) {
                                l.i("viewModel");
                                throw null;
                            }
                            dVar8.j = 1;
                            cVar2.a();
                            return;
                        case 1:
                            popupWindow2.dismiss();
                            TextView textView9 = cVar2.f8495b;
                            if (textView9 != null) {
                                textView9.setText(cVar2.getString(R.string.iab_partners_toolbar_title));
                            }
                            d dVar9 = cVar2.B;
                            if (dVar9 == null) {
                                l.i("viewModel");
                                throw null;
                            }
                            dVar9.j = 2;
                            cVar2.a();
                            return;
                        case 2:
                            popupWindow2.dismiss();
                            TextView textView10 = cVar2.f8495b;
                            if (textView10 != null) {
                                textView10.setText(cVar2.getString(R.string.non_iab_partners_toolbar_title));
                            }
                            d dVar10 = cVar2.B;
                            if (dVar10 == null) {
                                l.i("viewModel");
                                throw null;
                            }
                            dVar10.j = 3;
                            cVar2.a();
                            return;
                        default:
                            popupWindow2.dismiss();
                            TextView textView11 = cVar2.f8495b;
                            if (textView11 != null) {
                                textView11.setText(cVar2.getString(R.string.google_partners_toolbar_title));
                            }
                            d dVar11 = cVar2.B;
                            if (dVar11 == null) {
                                l.i("viewModel");
                                throw null;
                            }
                            dVar11.j = 4;
                            cVar2.a();
                            return;
                    }
                }
            });
            if (imageView2 != null) {
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: z5.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Integer num2;
                        Integer num3;
                        c cVar2 = this.f11967a;
                        h9.d dVar8 = cVar2.f8503s;
                        if (dVar8 != null && (num3 = dVar8.g) != null) {
                            cardView.setBackgroundTintList(ColorStateList.valueOf(num3.intValue()));
                        }
                        h9.d dVar9 = cVar2.f8503s;
                        if (dVar9 != null && (num2 = dVar9.f5501k) != null) {
                            int iIntValue = num2.intValue();
                            textView2.setTextColor(ColorStateList.valueOf(iIntValue));
                            textView3.setTextColor(ColorStateList.valueOf(iIntValue));
                            textView4.setTextColor(ColorStateList.valueOf(iIntValue));
                            textView5.setTextColor(ColorStateList.valueOf(iIntValue));
                        }
                        popupWindow.showAsDropDown(imageView2);
                    }
                });
            }
        }
        SearchView searchView2 = this.f8498n;
        if (searchView2 != null) {
            searchView2.setVisibility(0);
        }
        SearchView searchView3 = this.f8498n;
        if (searchView3 != null) {
            d dVar8 = this.B;
            if (dVar8 == null) {
                l.i("viewModel");
                throw th;
            }
            searchView3.setQueryHint(dVar8.f11976a.f().f5587c);
        }
        SearchView searchView4 = this.f8498n;
        if (searchView4 != null) {
            searchView4.setOnQueryTextListener(new g5.f(this, 20));
        }
        d dVar9 = this.B;
        if (dVar9 == null) {
            l.i("viewModel");
            throw th;
        }
        ArrayList arrayListC = dVar9.c("");
        d dVar10 = this.B;
        if (dVar10 == null) {
            l.i("viewModel");
            throw th;
        }
        String str = dVar10.f11976a.f().f5586b;
        h9.d dVar11 = this.f8503s;
        this.C = new h(arrayListC, (c.b) this, str, (Integer) (dVar11 == null ? th : dVar11.i), (Integer) (dVar11 == null ? th : dVar11.f5500e), (Integer) (dVar11 == null ? th : dVar11.f), (Integer) (dVar11 == null ? th : dVar11.f5496a), this.f8504t, this.v, 8);
        RecyclerView recyclerView = this.A;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            h hVar = this.C;
            if (hVar == null) {
                l.i("switchAdapter");
                throw th;
            }
            recyclerView.setAdapter(hVar);
        }
        h9.d dVar12 = this.f8503s;
        if (dVar12 != null && (num = dVar12.g) != null) {
            int iIntValue = num.intValue();
            ConstraintLayout constraintLayout = this.f11975z;
            if (constraintLayout != null) {
                constraintLayout.setBackgroundColor(iIntValue);
            }
        }
        d dVar13 = this.B;
        if (dVar13 == null) {
            l.i("viewModel");
            throw th;
        }
        if (!dVar13.f11981k || (searchView = this.f8498n) == null) {
            return;
        }
        searchView.requestFocus();
    }
}
