package p9;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import g4.b0;
import h9.r;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f8552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s5.c f8553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f8554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f8555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n9.a f8556e;

    public o(ArrayList arrayList, s5.c cVar, Integer num, Integer num2, n9.a aVar) {
        this.f8552a = arrayList;
        this.f8553b = cVar;
        this.f8554c = num;
        this.f8555d = num2;
        this.f8556e = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f8552a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Float f;
        Typeface typeface;
        n nVar = (n) viewHolder;
        nVar.getClass();
        r rVar = (r) this.f8552a.get(i);
        rVar.getClass();
        TextView textView = nVar.f8550q;
        textView.setText(rVar.f5600b);
        TextView textView2 = nVar.f8549p;
        textView2.setText(rVar.f5601c);
        Integer num = nVar.f8544b;
        if (num != null) {
            int iIntValue = num.intValue();
            textView.setTextColor(iIntValue);
            textView2.setTextColor(iIntValue);
            nVar.f8548o.setColorFilter(iIntValue);
        }
        Integer num2 = nVar.f8545l;
        if (num2 != null) {
            nVar.f8551r.setBackgroundColor(num2.intValue());
        }
        n9.a aVar = nVar.f8546m;
        int i6 = 0;
        TextView[] textViewArr = {textView, textView2};
        if (aVar != null && (typeface = aVar.f8120a) != null) {
            int i10 = 0;
            while (i10 < 2) {
                TextView textView3 = textViewArr[i10];
                i10++;
                if (textView3 != null) {
                    textView3.setTypeface(typeface);
                }
            }
        }
        if (aVar != null && (f = aVar.f8121b) != null) {
            float fFloatValue = f.floatValue();
            while (i6 < 2) {
                TextView textView4 = textViewArr[i6];
                i6++;
                if (textView4 != null) {
                    textView4.setTextSize(2, fFloatValue);
                }
            }
        }
        nVar.f8547n.setOnClickListener(new b0(25, nVar, rVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewS = androidx.lifecycle.l.s(viewGroup, R.layout.list_item_stack, viewGroup, false);
        viewS.getClass();
        return new n(viewS, this.f8553b, this.f8554c, this.f8555d, this.f8556e);
    }
}
