package m5;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c4.ra;
import com.uptodown.R;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d2 extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f7369a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(View view, ra raVar) {
        super(view);
        raVar.getClass();
        View viewFindViewById = view.findViewById(R.id.ll_no_tracking_container_updates);
        viewFindViewById.getClass();
        this.f7369a = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.tv_no_tracking_msg_updates);
        viewFindViewById2.getClass();
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.tv_gdpr_set_up_updates);
        viewFindViewById3.getClass();
        TextView textView2 = (TextView) viewFindViewById3;
        textView.setTypeface(f4.c.f4884x);
        ConcurrentHashMap concurrentHashMap = j5.t.f6709a;
        textView.setText(j5.t.a(view.getContext().getString(R.string.gdpr_no_tracking_enabled)));
        textView2.setTypeface(f4.c.f4883w);
        textView2.setOnClickListener(new u0(raVar, 6));
    }
}
