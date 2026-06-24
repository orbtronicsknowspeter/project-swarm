package m5;

import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.util.views.UsernameTextView;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2.e f7481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.h f7482b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f7483l;

    /* JADX WARN: Illegal instructions before constructor call */
    public n(g2.e eVar, w4.h hVar) {
        hVar.getClass();
        RelativeLayout relativeLayout = (RelativeLayout) eVar.f5119b;
        super(relativeLayout);
        this.f7481a = eVar;
        this.f7482b = hVar;
        this.f7483l = relativeLayout.getContext();
        ((UsernameTextView) eVar.f5127s).setTypeface(f4.c.f4883w);
        ((TextView) eVar.f5124p).setTypeface(f4.c.f4884x);
        ((TextView) eVar.f5126r).setTypeface(f4.c.f4884x);
        ((TextView) eVar.f5125q).setTypeface(f4.c.f4883w);
    }
}
