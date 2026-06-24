package m5;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c4.ra;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class l1 extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra f7465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f7466b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinearLayout f7467l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f7468m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f7469n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(View view, ra raVar) {
        super(view);
        raVar.getClass();
        this.f7465a = raVar;
        View viewFindViewById = view.findViewById(R.id.tv_updates_available_updates_header);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        this.f7466b = textView;
        View viewFindViewById2 = view.findViewById(R.id.ll_no_pending_updates_header);
        viewFindViewById2.getClass();
        this.f7467l = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.tv_last_check_updates_header);
        viewFindViewById3.getClass();
        TextView textView2 = (TextView) viewFindViewById3;
        this.f7468m = textView2;
        View viewFindViewById4 = view.findViewById(R.id.tv_check_updates_header);
        viewFindViewById4.getClass();
        TextView textView3 = (TextView) viewFindViewById4;
        this.f7469n = textView3;
        textView.setTypeface(f4.c.f4883w);
        textView2.setTypeface(f4.c.f4884x);
        textView3.setTypeface(f4.c.f4883w);
    }
}
