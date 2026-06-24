package p9;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n9.a f8537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f8538b;

    public l(View view, n9.a aVar) {
        super(view);
        this.f8537a = aVar;
        View viewFindViewById = view.findViewById(R.id.tv_publisher_link_name);
        viewFindViewById.getClass();
        this.f8538b = (TextView) viewFindViewById;
    }
}
