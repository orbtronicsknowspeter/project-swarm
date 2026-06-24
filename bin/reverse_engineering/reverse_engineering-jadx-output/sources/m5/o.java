package m5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w4.j f7487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f7488b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinearLayout f7489l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(View view, w4.j jVar) {
        super(view);
        jVar.getClass();
        this.f7487a = jVar;
        View viewFindViewById = view.findViewById(2131363879);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        this.f7488b = textView;
        View viewFindViewById2 = view.findViewById(2131362654);
        viewFindViewById2.getClass();
        this.f7489l = (LinearLayout) viewFindViewById2;
        textView.setTypeface(f4.c.f4882w);
    }

    public final void a(ArrayList arrayList) {
        arrayList.getClass();
        this.f7488b.setText(this.itemView.getContext().getString(2131952102));
        ViewGroup viewGroup = this.f7489l;
        if (viewGroup.getChildCount() == 0) {
            Iterator it = arrayList.iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                x4.j jVar = (x4.j) next;
                View viewInflate = LayoutInflater.from(this.itemView.getContext()).inflate(2131558457, viewGroup, false);
                viewInflate.getClass();
                TextView textView = (TextView) viewInflate;
                textView.setTypeface(f4.c.f4882w);
                textView.setText(jVar.f11225b);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                int dimension = (int) this.itemView.getContext().getResources().getDimension(2131166251);
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
