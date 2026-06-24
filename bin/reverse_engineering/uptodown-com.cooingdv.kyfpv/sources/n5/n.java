package n5;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.HashMap;
import java.util.Locale;
import m8.q;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f8100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f8101b;

    public n(HashMap map, k kVar) {
        this.f8100a = map;
        this.f8101b = kVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f8100a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String string;
        m mVar = (m) viewHolder;
        mVar.getClass();
        q qVar = mVar.f8099a;
        String str = (String) this.f8100a.get(Integer.valueOf(i));
        if (str == null || str.length() == 0) {
            return;
        }
        TextView textView = (TextView) qVar.f7782l;
        if (str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            String strValueOf = String.valueOf(str.charAt(0));
            strValueOf.getClass();
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            sb.append((Object) upperCase);
            sb.append(str.substring(1));
            string = sb.toString();
        } else {
            string = str;
        }
        textView.setText(string);
        ((TextView) qVar.f7782l).setTypeface(f4.c.f4884x);
        mVar.itemView.setOnClickListener(new g4.a(this, i, str));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewS = androidx.lifecycle.l.s(viewGroup, R.layout.dropdown_option_item, viewGroup, false);
        if (viewS != null) {
            TextView textView = (TextView) viewS;
            return new m(new q(12, textView, textView));
        }
        com.google.gson.internal.a.i("rootView");
        return null;
    }
}
