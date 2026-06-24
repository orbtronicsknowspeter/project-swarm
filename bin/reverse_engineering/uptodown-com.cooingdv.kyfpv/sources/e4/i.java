package e4;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w4.j f4556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.a f4557b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f4558l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f4559m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f4560n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(View view, w4.j jVar, w4.a aVar) {
        super(view);
        aVar.getClass();
        this.f4556a = jVar;
        this.f4557b = aVar;
        this.f4558l = (ImageView) view.findViewById(R.id.iv_feature_home);
        TextView textView = (TextView) view.findViewById(R.id.tv_tag_feature_home);
        this.f4559m = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.tv_name_feature_home);
        this.f4560n = textView2;
        textView.setTypeface(f4.c.f4883w);
        textView2.setTypeface(f4.c.f4883w);
    }
}
