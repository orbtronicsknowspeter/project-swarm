package p9;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import g4.b0;
import h9.q;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f8540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f8541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n9.a f8542d;

    public m(List list, Context context, Integer num, n9.a aVar) {
        list.getClass();
        this.f8539a = list;
        this.f8540b = context;
        this.f8541c = num;
        this.f8542d = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f8539a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Float f;
        Typeface typeface;
        l lVar = (l) viewHolder;
        lVar.getClass();
        q qVar = (q) this.f8539a.get(i);
        n9.a aVar = lVar.f8537a;
        Context context = this.f8540b;
        context.getClass();
        qVar.getClass();
        SpannableString spannableString = new SpannableString(qVar.f5597a);
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        TextView textView = lVar.f8538b;
        textView.setText(spannableString);
        Integer num = this.f8541c;
        if (num != null) {
            textView.setTextColor(num.intValue());
        }
        if (aVar != null && (typeface = aVar.f8120a) != null) {
            textView.setTypeface(typeface);
        }
        if (aVar != null && (f = aVar.f8121b) != null) {
            textView.setTextSize(f.floatValue());
        }
        if (qVar.f5598b.length() > 0) {
            lVar.itemView.setOnClickListener(new b0(24, context, qVar));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewS = androidx.lifecycle.l.s(viewGroup, R.layout.list_publisher_link, viewGroup, false);
        viewS.getClass();
        return new l(viewS, this.f8542d);
    }
}
