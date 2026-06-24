package e4;

import android.text.Layout;
import android.text.SpannableString;
import android.text.style.AlignmentSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import x4.q1;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0.i f4647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4648c;

    public o(ArrayList arrayList, f0.i iVar, String str) {
        iVar.getClass();
        this.f4646a = arrayList;
        this.f4647b = iVar;
        this.f4648c = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = this.f4646a;
        if (arrayList == null) {
            return 0;
        }
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        m5.a0 a0Var = (m5.a0) viewHolder;
        a0Var.getClass();
        ArrayList arrayList = this.f4646a;
        q1 q1Var = arrayList != null ? (q1) arrayList.get(i) : null;
        q1Var.getClass();
        String str = this.f4648c;
        str.getClass();
        TextView textView = a0Var.f7304b;
        textView.setText(q1Var.f11341a);
        a0Var.f7305l.setText(q1Var.f11342b);
        a0Var.itemView.setOnClickListener(new g4.b0(11, a0Var, q1Var));
        if (l7.u.m0(q1Var.f11343c, "ar", false)) {
            if (str.equals("ar")) {
                return;
            }
            SpannableString spannableString = new SpannableString(q1Var.f11341a);
            spannableString.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_OPPOSITE), 0, spannableString.length(), 33);
            textView.setText(spannableString);
            return;
        }
        if (str.equals("ar")) {
            SpannableString spannableString2 = new SpannableString(q1Var.f11341a);
            spannableString2.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_OPPOSITE), 0, spannableString2.length(), 33);
            textView.setText(spannableString2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewS = androidx.lifecycle.l.s(viewGroup, R.layout.language_item, viewGroup, false);
        viewS.getClass();
        f0.i iVar = this.f4647b;
        iVar.getClass();
        m5.a0 a0Var = new m5.a0(viewS);
        a0Var.f7303a = iVar;
        View viewFindViewById = viewS.findViewById(R.id.tv_language_name_original);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        a0Var.f7304b = textView;
        View viewFindViewById2 = viewS.findViewById(R.id.tv_language_name_localized);
        viewFindViewById2.getClass();
        TextView textView2 = (TextView) viewFindViewById2;
        a0Var.f7305l = textView2;
        textView.setTypeface(f4.c.f4884x);
        textView2.setTypeface(f4.c.f4884x);
        return a0Var;
    }
}
