package e4;

import android.content.Context;
import android.widget.RelativeLayout;
import com.uptodown.util.views.UsernameTextView;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class i1 extends m5.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t4.g f4565b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w4.m f4566l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j1 f4567m;

    /* JADX WARN: Illegal instructions before constructor call */
    public i1(j1 j1Var, t4.g gVar, b5.m mVar) {
        mVar.getClass();
        this.f4567m = j1Var;
        RelativeLayout relativeLayout = gVar.f9802b;
        relativeLayout.getClass();
        Context context = relativeLayout.getContext();
        context.getClass();
        super(relativeLayout, context);
        this.f4565b = gVar;
        this.f4566l = mVar;
        ((UsernameTextView) gVar.f9815y).setTypeface(f4.c.f4883w);
        gVar.f9810s.setTypeface(f4.c.f4884x);
        gVar.f9809r.setTypeface(f4.c.f4884x);
        gVar.f9812u.setTypeface(f4.c.f4884x);
        gVar.f9811t.setTypeface(f4.c.f4884x);
    }
}
