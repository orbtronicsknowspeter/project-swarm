package m5;

import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.util.views.UsernameTextView;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class q extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4.d0 f7522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0.i f7523b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f7524l;

    /* JADX WARN: Illegal instructions before constructor call */
    public q(a4.d0 d0Var, f0.i iVar) {
        iVar.getClass();
        RelativeLayout relativeLayout = (RelativeLayout) d0Var.f81b;
        super(relativeLayout);
        this.f7522a = d0Var;
        this.f7523b = iVar;
        this.f7524l = relativeLayout.getContext();
        ((UsernameTextView) d0Var.f85o).setTypeface(f4.c.f4882w);
        ((TextView) d0Var.f84n).setTypeface(f4.c.f4882w);
    }
}
