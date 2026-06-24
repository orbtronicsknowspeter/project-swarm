package m5;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class m0 extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w4.b f7473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f7474b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f7475l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f7476m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f7477n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f7478o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(View view, w4.b bVar, Context context) {
        super(view);
        context.getClass();
        this.f7473a = bVar;
        this.f7474b = context;
        View viewFindViewById = view.findViewById(R.id.iv_icon_positive);
        viewFindViewById.getClass();
        this.f7475l = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.tv_name_app_positive);
        viewFindViewById2.getClass();
        TextView textView = (TextView) viewFindViewById2;
        this.f7476m = textView;
        View viewFindViewById3 = view.findViewById(R.id.tv_version_app_positive);
        viewFindViewById3.getClass();
        TextView textView2 = (TextView) viewFindViewById3;
        this.f7477n = textView2;
        View viewFindViewById4 = view.findViewById(R.id.tv_count_positives);
        viewFindViewById4.getClass();
        TextView textView3 = (TextView) viewFindViewById4;
        this.f7478o = textView3;
        view.setOnClickListener(new c4.d(this, 28));
        textView.setTypeface(f4.c.f4883w);
        textView2.setTypeface(f4.c.f4884x);
        textView3.setTypeface(f4.c.f4884x);
    }
}
