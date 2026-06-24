package m5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w4.j f7488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f7489b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinearLayout f7490l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(View view, w4.j jVar) {
        super(view);
        jVar.getClass();
        this.f7488a = jVar;
        View viewFindViewById = view.findViewById(R.id.tv_floating_categories);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        this.f7489b = textView;
        View viewFindViewById2 = view.findViewById(R.id.ll_floating_categories);
        viewFindViewById2.getClass();
        this.f7490l = (LinearLayout) viewFindViewById2;
        textView.setTypeface(f4.c.f4883w);
    }

    public final void a(ArrayList arrayList) {
        arrayList.getClass();
        this.f7489b.setText(this.itemView.getContext().getString(R.string.it_may_interest_you));
        ViewGroup viewGroup = this.f7490l;
        if (viewGroup.getChildCount() == 0) {
            Iterator it = arrayList.iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                x4.j jVar = (x4.j) next;
                View viewInflate = LayoutInflater.from(this.itemView.getContext()).inflate(R.layout.chip_floating_category, viewGroup, false);
                viewInflate.getClass();
                TextView textView = (TextView) viewInflate;
                textView.setTypeface(f4.c.f4883w);
                textView.setText(jVar.f11226b);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                int dimension = (int) this.itemView.getContext().getResources().getDimension(R.dimen.margin_m);
                if (jVar.equals(q6.l.y0(arrayList))) {
                    layoutParams.setMargins(dimension, 0, dimension, 0);
                } else {
                    layoutParams.setMargins(dimension, 0, 0, 0);
                }
                textView.setLayoutParams(layoutParams);
                textView.setOnClickListener(new g4.b0(5, this, jVar));
                viewGroup.addView(textView);
            }
        }
    }
}
