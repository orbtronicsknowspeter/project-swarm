package c4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.uptodown.R;
import com.uptodown.activities.SearchActivity;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class p9 extends ArrayAdapter implements Filterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LayoutInflater f1991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchActivity f1992b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(SearchActivity searchActivity, SearchActivity searchActivity2) {
        super(searchActivity2, -1);
        this.f1992b = searchActivity;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(searchActivity2);
        layoutInflaterFrom.getClass();
        this.f1991a = layoutInflaterFrom;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public final Filter getFilter() {
        return new o9(this.f1992b, this);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        LinearLayout linearLayout;
        viewGroup.getClass();
        x4.z1 z1Var = (x4.z1) getItem(i);
        LayoutInflater layoutInflater = this.f1991a;
        if (z1Var == null) {
            View viewInflate = layoutInflater.inflate(R.layout.recent_search_item, viewGroup, false);
            viewInflate.getClass();
            return (LinearLayout) viewInflate;
        }
        if (view != null) {
            linearLayout = (LinearLayout) view;
        } else {
            View viewInflate2 = layoutInflater.inflate(R.layout.recent_search_item, viewGroup, false);
            viewInflate2.getClass();
            linearLayout = (LinearLayout) viewInflate2;
        }
        TextView textView = (TextView) linearLayout.findViewById(R.id.tv_query_recent_search_item);
        ImageView imageView = (ImageView) linearLayout.findViewById(R.id.iv_delete_recent_search_item);
        imageView.setTag(z1Var.f11480a);
        imageView.setOnClickListener(new m9(this.f1992b, 5));
        textView.setTypeface(f4.c.f4884x);
        textView.setText(z1Var.f11480a);
        return linearLayout;
    }
}
