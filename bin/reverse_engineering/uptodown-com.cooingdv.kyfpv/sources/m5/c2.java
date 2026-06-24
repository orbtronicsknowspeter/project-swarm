package m5;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c2 extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f7337a;

    public c2(View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.rl_container_warning_not_storage_available);
        viewFindViewById.getClass();
        this.f7337a = (RelativeLayout) viewFindViewById;
    }
}
