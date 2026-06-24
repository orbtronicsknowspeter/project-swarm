package m5;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class t extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f7580b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f7581l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f7582m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(View view, Context context) {
        super(view);
        context.getClass();
        this.f7579a = context;
        View viewFindViewById = view.findViewById(R.id.iv_logo_app);
        viewFindViewById.getClass();
        this.f7580b = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.tv_app_name);
        viewFindViewById2.getClass();
        TextView textView = (TextView) viewFindViewById2;
        this.f7581l = textView;
        View viewFindViewById3 = view.findViewById(R.id.tv_app_version);
        viewFindViewById3.getClass();
        TextView textView2 = (TextView) viewFindViewById3;
        this.f7582m = textView2;
        textView.setTypeface(f4.c.f4883w);
        textView2.setTypeface(f4.c.f4884x);
    }
}
