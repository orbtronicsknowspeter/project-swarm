package e4;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import com.uptodown.UptodownApp;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class l1 extends m5.e {
    public final /* synthetic */ m1 A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.j f4606b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w4.a f4607l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Context f4608m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f4609n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImageView f4610o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RelativeLayout f4611p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ProgressBar f4612q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ImageView f4613r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f4614s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f4615t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f4616u;
    public final TextView v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LinearLayout f4617w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final CardView f4618x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final View f4619y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f4620z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(m1 m1Var, View view, w4.j jVar, w4.a aVar, Context context, String str) {
        super(view, context);
        jVar.getClass();
        aVar.getClass();
        context.getClass();
        str.getClass();
        this.A = m1Var;
        this.f4606b = jVar;
        this.f4607l = aVar;
        this.f4608m = context;
        this.f4609n = str;
        View viewFindViewById = view.findViewById(2131362395);
        viewFindViewById.getClass();
        this.f4610o = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(2131363293);
        viewFindViewById2.getClass();
        this.f4611p = (RelativeLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(2131363021);
        viewFindViewById3.getClass();
        this.f4612q = (ProgressBar) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(2131362431);
        viewFindViewById4.getClass();
        this.f4613r = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(2131364064);
        viewFindViewById5.getClass();
        TextView textView = (TextView) viewFindViewById5;
        this.f4614s = textView;
        View viewFindViewById6 = view.findViewById(2131363781);
        viewFindViewById6.getClass();
        TextView textView2 = (TextView) viewFindViewById6;
        this.f4615t = textView2;
        View viewFindViewById7 = view.findViewById(2131364341);
        viewFindViewById7.getClass();
        this.f4616u = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(2131364198);
        viewFindViewById8.getClass();
        TextView textView3 = (TextView) viewFindViewById8;
        this.v = textView3;
        View viewFindViewById9 = view.findViewById(2131364555);
        viewFindViewById9.getClass();
        View viewFindViewById10 = view.findViewById(2131362719);
        viewFindViewById10.getClass();
        this.f4617w = (LinearLayout) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(2131362072);
        viewFindViewById11.getClass();
        this.f4618x = (CardView) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(2131364635);
        viewFindViewById12.getClass();
        this.f4619y = viewFindViewById12;
        this.f4620z = UptodownApp.Y;
        textView.setTypeface(f4.c.f4882w);
        textView2.setTypeface(f4.c.f4883x);
        textView3.setTypeface(f4.c.f4883x);
        ((TextView) viewFindViewById9).setTypeface(f4.c.f4883x);
    }

    public static void h(ImageView imageView, x4.g gVar) {
        n5.g gVar2 = new n5.g((int) imageView.getContext().getResources().getDimension(2131165268));
        String strE = gVar.e();
        if (strE == null || strE.length() == 0) {
            imageView.setImageDrawable(ContextCompat.getDrawable(imageView.getContext(), 2131231216));
            return;
        }
        if (UptodownApp.U <= 0) {
            imageView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            a4.l0 l0VarE = a4.g0.d().e(gVar.d());
            l0VarE.f136c = true;
            l0VarE.h(gVar2);
            l0VarE.e(imageView, null);
            return;
        }
        imageView.setLayoutParams(new RelativeLayout.LayoutParams(-1, UptodownApp.U));
        a4.l0 l0VarE2 = a4.g0.d().e(gVar.d());
        l0VarE2.f135b.e(UptodownApp.V, UptodownApp.U);
        l0VarE2.h(gVar2);
        l0VarE2.e(imageView, null);
    }

    public final void g(x4.g gVar, int i) {
        this.f4618x.setVisibility(8);
        this.f4619y.setVisibility(8);
        ImageView imageView = this.f4610o;
        imageView.setVisibility(0);
        m5.e.f(gVar, this.f4614s, this.f4615t);
        RelativeLayout relativeLayout = this.f4611p;
        w4.j jVar = this.f4606b;
        m5.e.b(relativeLayout, jVar, gVar);
        h(imageView, gVar);
        e(this.f4613r, gVar.i());
        c(gVar, this.f4612q, this.f4613r, this.f4615t, this.v, this.f4616u, this.f4617w);
        relativeLayout.setOnLongClickListener(new k1(this, gVar, i, 1));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.f4620z, -1);
        View view = this.itemView;
        m5.e.a(layoutParams, this.f4608m, i, this.A.f4637o);
        view.setLayoutParams(layoutParams);
        m5.e.b(imageView, jVar, gVar);
    }
}
