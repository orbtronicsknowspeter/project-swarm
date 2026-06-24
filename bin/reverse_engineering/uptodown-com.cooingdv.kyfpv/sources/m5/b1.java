package m5;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b1 extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f7318a;

    public b1(View view, String str) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.tv_system_apps_title);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        this.f7318a = textView;
        textView.setTypeface(f4.c.f4883w);
        textView.setText(str);
    }

    public final void a() {
        this.f7318a.setVisibility(0);
    }
}
