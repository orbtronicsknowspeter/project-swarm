package m5;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class p1 extends RecyclerView.ViewHolder {
    public String A;
    public o1 B;
    public ValueAnimator C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w4.n f7506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f7507b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f7508l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ProgressBar f7509m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f7510n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f7511o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f7512p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f7513q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f7514r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RelativeLayout f7515s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f7516t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ImageView f7517u;
    public final RelativeLayout v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f7518w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final RelativeLayout f7519x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final TextView f7520y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ImageView f7521z;

    public p1(View view, w4.n nVar) {
        super(view);
        this.f7506a = nVar;
        View viewFindViewById = view.findViewById(2131362390);
        viewFindViewById.getClass();
        this.f7507b = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(2131364059);
        viewFindViewById2.getClass();
        TextView textView = (TextView) viewFindViewById2;
        this.f7508l = textView;
        View viewFindViewById3 = view.findViewById(2131363019);
        viewFindViewById3.getClass();
        this.f7509m = (ProgressBar) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(2131364579);
        viewFindViewById4.getClass();
        TextView textView2 = (TextView) viewFindViewById4;
        this.f7510n = textView2;
        View viewFindViewById5 = view.findViewById(2131364314);
        viewFindViewById5.getClass();
        TextView textView3 = (TextView) viewFindViewById5;
        this.f7511o = textView3;
        View viewFindViewById6 = view.findViewById(2131363947);
        viewFindViewById6.getClass();
        TextView textView4 = (TextView) viewFindViewById6;
        this.f7512p = textView4;
        View viewFindViewById7 = view.findViewById(2131364548);
        viewFindViewById7.getClass();
        TextView textView5 = (TextView) viewFindViewById7;
        this.f7513q = textView5;
        View viewFindViewById8 = view.findViewById(2131363625);
        viewFindViewById8.getClass();
        TextView textView6 = (TextView) viewFindViewById8;
        this.f7514r = textView6;
        View viewFindViewById9 = view.findViewById(2131363105);
        viewFindViewById9.getClass();
        this.f7515s = (RelativeLayout) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(2131363860);
        viewFindViewById10.getClass();
        TextView textView7 = (TextView) viewFindViewById10;
        this.f7516t = textView7;
        View viewFindViewById11 = view.findViewById(2131362545);
        viewFindViewById11.getClass();
        this.f7517u = (ImageView) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(2131363290);
        viewFindViewById12.getClass();
        this.v = (RelativeLayout) viewFindViewById12;
        View viewFindViewById13 = view.findViewById(2131364564);
        viewFindViewById13.getClass();
        TextView textView8 = (TextView) viewFindViewById13;
        this.f7518w = textView8;
        View viewFindViewById14 = view.findViewById(2131363151);
        viewFindViewById14.getClass();
        View viewFindViewById15 = view.findViewById(2131363134);
        viewFindViewById15.getClass();
        this.f7519x = (RelativeLayout) viewFindViewById15;
        View viewFindViewById16 = view.findViewById(2131364155);
        viewFindViewById16.getClass();
        TextView textView9 = (TextView) viewFindViewById16;
        this.f7520y = textView9;
        View viewFindViewById17 = view.findViewById(2131362318);
        viewFindViewById17.getClass();
        ImageView imageView = (ImageView) viewFindViewById17;
        this.f7521z = imageView;
        this.B = o1.f7494a;
        final int i = 0;
        ((RelativeLayout) viewFindViewById14).setOnClickListener(new View.OnClickListener(this) { // from class: m5.m1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p1 f7479b;

            {
                this.f7479b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int bindingAdapterPosition;
                switch (i) {
                    case 0:
                        p1 p1Var = this.f7479b;
                        w4.n nVar2 = p1Var.f7506a;
                        if (nVar2 != null && (bindingAdapterPosition = p1Var.getBindingAdapterPosition()) != -1) {
                            nVar2.b(bindingAdapterPosition);
                            break;
                        }
                        break;
                    case 1:
                        p1 p1Var2 = this.f7479b;
                        w4.n nVar3 = p1Var2.f7506a;
                        if (nVar3 != null) {
                            nVar3.c(p1Var2.getBindingAdapterPosition());
                        }
                        break;
                    default:
                        p1 p1Var3 = this.f7479b;
                        w4.n nVar4 = p1Var3.f7506a;
                        if (nVar4 != null) {
                            nVar4.d(p1Var3.getBindingAdapterPosition());
                        }
                        break;
                }
            }
        });
        final int i6 = 1;
        textView6.setOnClickListener(new View.OnClickListener(this) { // from class: m5.m1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p1 f7479b;

            {
                this.f7479b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int bindingAdapterPosition;
                switch (i6) {
                    case 0:
                        p1 p1Var = this.f7479b;
                        w4.n nVar2 = p1Var.f7506a;
                        if (nVar2 != null && (bindingAdapterPosition = p1Var.getBindingAdapterPosition()) != -1) {
                            nVar2.b(bindingAdapterPosition);
                            break;
                        }
                        break;
                    case 1:
                        p1 p1Var2 = this.f7479b;
                        w4.n nVar3 = p1Var2.f7506a;
                        if (nVar3 != null) {
                            nVar3.c(p1Var2.getBindingAdapterPosition());
                        }
                        break;
                    default:
                        p1 p1Var3 = this.f7479b;
                        w4.n nVar4 = p1Var3.f7506a;
                        if (nVar4 != null) {
                            nVar4.d(p1Var3.getBindingAdapterPosition());
                        }
                        break;
                }
            }
        });
        final int i10 = 2;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: m5.m1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p1 f7479b;

            {
                this.f7479b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int bindingAdapterPosition;
                switch (i10) {
                    case 0:
                        p1 p1Var = this.f7479b;
                        w4.n nVar2 = p1Var.f7506a;
                        if (nVar2 != null && (bindingAdapterPosition = p1Var.getBindingAdapterPosition()) != -1) {
                            nVar2.b(bindingAdapterPosition);
                            break;
                        }
                        break;
                    case 1:
                        p1 p1Var2 = this.f7479b;
                        w4.n nVar3 = p1Var2.f7506a;
                        if (nVar3 != null) {
                            nVar3.c(p1Var2.getBindingAdapterPosition());
                        }
                        break;
                    default:
                        p1 p1Var3 = this.f7479b;
                        w4.n nVar4 = p1Var3.f7506a;
                        if (nVar4 != null) {
                            nVar4.d(p1Var3.getBindingAdapterPosition());
                        }
                        break;
                }
            }
        });
        textView.setTypeface(f4.c.f4882w);
        textView2.setTypeface(f4.c.f4882w);
        textView3.setTypeface(f4.c.f4883x);
        textView5.setTypeface(f4.c.f4883x);
        textView9.setTypeface(f4.c.f4882w);
        textView8.setTypeface(f4.c.f4883x);
        textView7.setTypeface(f4.c.f4882w);
        textView6.setTypeface(f4.c.f4882w);
        textView4.setTypeface(f4.c.f4883x);
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x0331  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(e4.v0 r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 1001
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.p1.a(e4.v0, boolean, boolean):void");
    }

    public final void b(e4.v0 v0Var) {
        o1 o1Var;
        if (!kotlin.jvm.internal.l.a(this.A, v0Var.f4708a.f11123l)) {
            this.f7509m.setVisibility(8);
            return;
        }
        o1 o1Var2 = this.B;
        if (o1Var2 == o1.f7494a || o1Var2 == (o1Var = o1.f7497m)) {
            return;
        }
        this.B = o1Var;
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(10, 0);
        valueAnimatorOfInt.setStartDelay(200L);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new n1(this, 1));
        valueAnimatorOfInt.addListener(new k0(this, 1));
        valueAnimatorOfInt.start();
        this.C = valueAnimatorOfInt;
        this.f7507b.animate().scaleX(1.0f).scaleY(1.0f).setStartDelay(200L).setDuration(300L).setInterpolator(new AccelerateDecelerateInterpolator()).start();
    }

    public final void c(e4.v0 v0Var) {
        o1 o1Var;
        if (kotlin.jvm.internal.l.a(this.A, v0Var.f4708a.f11123l)) {
            o1 o1Var2 = this.B;
            ProgressBar progressBar = this.f7509m;
            o1 o1Var3 = o1.f7496l;
            if (o1Var2 == o1Var3) {
                progressBar.setVisibility(0);
                return;
            }
            if (o1Var2 == o1Var3 || o1Var2 == (o1Var = o1.f7495b)) {
                return;
            }
            this.B = o1Var;
            progressBar.setVisibility(0);
            ValueAnimator valueAnimator = this.C;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 10);
            valueAnimatorOfInt.setDuration(300L);
            valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimatorOfInt.addUpdateListener(new n1(this, 0));
            valueAnimatorOfInt.start();
            this.C = valueAnimatorOfInt;
            this.f7507b.animate().scaleX(0.6f).scaleY(0.6f).setDuration(300L).setInterpolator(new AccelerateDecelerateInterpolator()).withEndAction(new a2.s(this, 15)).start();
        }
    }
}
