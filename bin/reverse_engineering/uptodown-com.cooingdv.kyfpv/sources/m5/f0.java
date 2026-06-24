package m5;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w4.k f7377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f7378b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f7379l;

    public f0(View view, String str, w4.k kVar) {
        super(view);
        this.f7377a = kVar;
        View viewFindViewById = view.findViewById(R.id.tv_myappsupdates_title);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        this.f7378b = textView;
        this.f7379l = (ImageView) view.findViewById(R.id.iv_myappsupdates_info);
        textView.setTypeface(f4.c.f4883w);
        textView.setText(str);
    }
}
