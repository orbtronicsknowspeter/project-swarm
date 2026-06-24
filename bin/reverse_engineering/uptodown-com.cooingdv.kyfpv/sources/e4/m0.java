package e4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class m0 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f4626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.e f4627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4628c;

    public m0(ArrayList arrayList, w4.e eVar) {
        eVar.getClass();
        this.f4626a = arrayList;
        this.f4627b = eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f4626a.size() + (this.f4628c ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return i == this.f4626a.size() ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        viewHolder.getClass();
        if (viewHolder instanceof m5.a1) {
            Object obj = this.f4626a.get(i);
            obj.getClass();
            final x4.j jVar = (x4.j) obj;
            final m5.a1 a1Var = (m5.a1) viewHolder;
            y2.s sVar = a1Var.f7306b;
            ArrayList arrayList = jVar.f11233r;
            final int i6 = 0;
            if (arrayList != null && !arrayList.isEmpty()) {
                ArrayList<x4.j> arrayList2 = jVar.f11233r;
                arrayList2.getClass();
                LinearLayout linearLayout = (LinearLayout) sVar.f11757l;
                RelativeLayout relativeLayout = (RelativeLayout) sVar.f11756b;
                linearLayout.removeAllViews();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMarginStart((int) relativeLayout.getResources().getDimension(R.dimen.margin_s));
                int i10 = 0;
                for (final x4.j jVar2 : arrayList2) {
                    int i11 = i10 + 1;
                    View viewInflate = LayoutInflater.from(relativeLayout.getContext()).inflate(R.layout.user_list_item_floating_tag, (ViewGroup) null);
                    viewInflate.getClass();
                    TextView textView = (TextView) viewInflate;
                    textView.setText(jVar2.f11226b);
                    textView.setTypeface(f4.c.f4884x);
                    final int i12 = 1;
                    textView.setAllCaps(true);
                    LinearLayout linearLayout2 = (LinearLayout) sVar.f11757l;
                    if (i10 > 0) {
                        linearLayout2.addView(viewInflate, layoutParams);
                    } else {
                        linearLayout2.addView(viewInflate);
                    }
                    textView.setOnClickListener(new View.OnClickListener() { // from class: m5.z0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i12) {
                                case 0:
                                    a1Var.f7307l.a(jVar2);
                                    break;
                                default:
                                    a1Var.f7307l.a(jVar2);
                                    break;
                            }
                        }
                    });
                    i10 = i11;
                }
            }
            ((TextView) sVar.f11759n).setText(jVar.f11226b);
            ((TextView) sVar.f11758m).setText(jVar.f11227l);
            ((RelativeLayout) sVar.f11756b).setOnClickListener(new View.OnClickListener() { // from class: m5.z0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i6) {
                        case 0:
                            a1Var.f7307l.a(jVar);
                            break;
                        default:
                            a1Var.f7307l.a(jVar);
                            break;
                    }
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        if (i != 0) {
            if (i != 1) {
                com.google.gson.internal.a.p("viewType unknown");
                return null;
            }
            View viewB = c.j.b(viewGroup, R.layout.pb_loading_more_content, viewGroup, false);
            viewB.getClass();
            return new m5.c0(viewB);
        }
        View viewB2 = c.j.b(viewGroup, R.layout.search_category_item, null, false);
        int i6 = R.id.LL_search_category_item;
        if (((LinearLayout) ViewBindings.findChildViewById(viewB2, R.id.LL_search_category_item)) != null) {
            i6 = R.id.hsv_related_categories_search_category_item;
            if (((HorizontalScrollView) ViewBindings.findChildViewById(viewB2, R.id.hsv_related_categories_search_category_item)) != null) {
                i6 = R.id.iv_icon_search_category_item;
                if (((ImageView) ViewBindings.findChildViewById(viewB2, R.id.iv_icon_search_category_item)) != null) {
                    i6 = R.id.ll_related_categories_search_category_item;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewB2, R.id.ll_related_categories_search_category_item);
                    if (linearLayout != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) viewB2;
                        i6 = R.id.tv_desc_search_category_item;
                        TextView textView = (TextView) ViewBindings.findChildViewById(viewB2, R.id.tv_desc_search_category_item);
                        if (textView != null) {
                            i6 = R.id.tv_name_search_category_item;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewB2, R.id.tv_name_search_category_item);
                            if (textView2 != null) {
                                return new m5.a1(new y2.s(relativeLayout, linearLayout, textView, textView2, 15), this.f4627b);
                            }
                        }
                    }
                }
            }
        }
        com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewB2.getResources().getResourceName(i6)));
        return null;
    }
}
