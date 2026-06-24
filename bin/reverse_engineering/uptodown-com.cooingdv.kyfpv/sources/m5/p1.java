package m5;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class p1 extends RecyclerView.ViewHolder {
    public String A;
    public o1 B;
    public ValueAnimator C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w4.n f7507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f7508b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f7509l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ProgressBar f7510m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f7511n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f7512o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f7513p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f7514q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f7515r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RelativeLayout f7516s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f7517t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ImageView f7518u;
    public final RelativeLayout v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f7519w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final RelativeLayout f7520x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final TextView f7521y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ImageView f7522z;

    public p1(View view, w4.n nVar) {
        super(view);
        this.f7507a = nVar;
        View viewFindViewById = view.findViewById(R.id.iv_icon_update_item);
        viewFindViewById.getClass();
        this.f7508b = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.tv_name_update_item);
        viewFindViewById2.getClass();
        TextView textView = (TextView) viewFindViewById2;
        this.f7509l = textView;
        View viewFindViewById3 = view.findViewById(R.id.pb_progress_update_item);
        viewFindViewById3.getClass();
        this.f7510m = (ProgressBar) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.tv_version_update_item);
        viewFindViewById4.getClass();
        TextView textView2 = (TextView) viewFindViewById4;
        this.f7511n = textView2;
        View viewFindViewById5 = view.findViewById(R.id.tv_size_update_item);
        viewFindViewById5.getClass();
        TextView textView3 = (TextView) viewFindViewById5;
        this.f7512o = textView3;
        View viewFindViewById6 = view.findViewById(R.id.tv_last_update_item);
        viewFindViewById6.getClass();
        TextView textView4 = (TextView) viewFindViewById6;
        this.f7513p = textView4;
        View viewFindViewById7 = view.findViewById(R.id.tv_verified_by_uptodown_update_item);
        viewFindViewById7.getClass();
        TextView textView5 = (TextView) viewFindViewById7;
        this.f7514q = textView5;
        View viewFindViewById8 = view.findViewById(R.id.tv_action_update_item);
        viewFindViewById8.getClass();
        TextView textView6 = (TextView) viewFindViewById8;
        this.f7515r = textView6;
        View viewFindViewById9 = view.findViewById(R.id.rl_actions_update_item);
        viewFindViewById9.getClass();
        this.f7516s = (RelativeLayout) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.tv_excluded_update_item);
        viewFindViewById10.getClass();
        TextView textView7 = (TextView) viewFindViewById10;
        this.f7517t = textView7;
        View viewFindViewById11 = view.findViewById(R.id.iv_version_details_update_item);
        viewFindViewById11.getClass();
        this.f7518u = (ImageView) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.rl_version_details_update_item);
        viewFindViewById12.getClass();
        this.v = (RelativeLayout) viewFindViewById12;
        View viewFindViewById13 = view.findViewById(R.id.tv_version_details_update_item);
        viewFindViewById13.getClass();
        TextView textView8 = (TextView) viewFindViewById13;
        this.f7519w = textView8;
        View viewFindViewById14 = view.findViewById(R.id.rl_container_update_item);
        viewFindViewById14.getClass();
        View viewFindViewById15 = view.findViewById(R.id.rl_cancel_update_item);
        viewFindViewById15.getClass();
        this.f7520x = (RelativeLayout) viewFindViewById15;
        View viewFindViewById16 = view.findViewById(R.id.tv_pending_update_item);
        viewFindViewById16.getClass();
        TextView textView9 = (TextView) viewFindViewById16;
        this.f7521y = textView9;
        View viewFindViewById17 = view.findViewById(R.id.iv_cancel_update_item);
        viewFindViewById17.getClass();
        ImageView imageView = (ImageView) viewFindViewById17;
        this.f7522z = imageView;
        this.B = o1.f7495a;
        final int i = 0;
        ((RelativeLayout) viewFindViewById14).setOnClickListener(new View.OnClickListener(this) { // from class: m5.m1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p1 f7480b;

            {
                this.f7480b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int bindingAdapterPosition;
                switch (i) {
                    case 0:
                        p1 p1Var = this.f7480b;
                        w4.n nVar2 = p1Var.f7507a;
                        if (nVar2 != null && (bindingAdapterPosition = p1Var.getBindingAdapterPosition()) != -1) {
                            nVar2.b(bindingAdapterPosition);
                            break;
                        }
                        break;
                    case 1:
                        p1 p1Var2 = this.f7480b;
                        w4.n nVar3 = p1Var2.f7507a;
                        if (nVar3 != null) {
                            nVar3.c(p1Var2.getBindingAdapterPosition());
                        }
                        break;
                    default:
                        p1 p1Var3 = this.f7480b;
                        w4.n nVar4 = p1Var3.f7507a;
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
            public final /* synthetic */ p1 f7480b;

            {
                this.f7480b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int bindingAdapterPosition;
                switch (i6) {
                    case 0:
                        p1 p1Var = this.f7480b;
                        w4.n nVar2 = p1Var.f7507a;
                        if (nVar2 != null && (bindingAdapterPosition = p1Var.getBindingAdapterPosition()) != -1) {
                            nVar2.b(bindingAdapterPosition);
                            break;
                        }
                        break;
                    case 1:
                        p1 p1Var2 = this.f7480b;
                        w4.n nVar3 = p1Var2.f7507a;
                        if (nVar3 != null) {
                            nVar3.c(p1Var2.getBindingAdapterPosition());
                        }
                        break;
                    default:
                        p1 p1Var3 = this.f7480b;
                        w4.n nVar4 = p1Var3.f7507a;
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
            public final /* synthetic */ p1 f7480b;

            {
                this.f7480b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int bindingAdapterPosition;
                switch (i10) {
                    case 0:
                        p1 p1Var = this.f7480b;
                        w4.n nVar2 = p1Var.f7507a;
                        if (nVar2 != null && (bindingAdapterPosition = p1Var.getBindingAdapterPosition()) != -1) {
                            nVar2.b(bindingAdapterPosition);
                            break;
                        }
                        break;
                    case 1:
                        p1 p1Var2 = this.f7480b;
                        w4.n nVar3 = p1Var2.f7507a;
                        if (nVar3 != null) {
                            nVar3.c(p1Var2.getBindingAdapterPosition());
                        }
                        break;
                    default:
                        p1 p1Var3 = this.f7480b;
                        w4.n nVar4 = p1Var3.f7507a;
                        if (nVar4 != null) {
                            nVar4.d(p1Var3.getBindingAdapterPosition());
                        }
                        break;
                }
            }
        });
        textView.setTypeface(f4.c.f4883w);
        textView2.setTypeface(f4.c.f4883w);
        textView3.setTypeface(f4.c.f4884x);
        textView5.setTypeface(f4.c.f4884x);
        textView9.setTypeface(f4.c.f4883w);
        textView8.setTypeface(f4.c.f4884x);
        textView7.setTypeface(f4.c.f4883w);
        textView6.setTypeface(f4.c.f4883w);
        textView4.setTypeface(f4.c.f4884x);
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
        if (!kotlin.jvm.internal.l.a(this.A, v0Var.f4709a.f11124l)) {
            this.f7510m.setVisibility(8);
            return;
        }
        o1 o1Var2 = this.B;
        if (o1Var2 == o1.f7495a || o1Var2 == (o1Var = o1.f7498m)) {
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
        this.f7508b.animate().scaleX(1.0f).scaleY(1.0f).setStartDelay(200L).setDuration(300L).setInterpolator(new AccelerateDecelerateInterpolator()).start();
    }

    public final void c(e4.v0 v0Var) {
        o1 o1Var;
        if (kotlin.jvm.internal.l.a(this.A, v0Var.f4709a.f11124l)) {
            o1 o1Var2 = this.B;
            ProgressBar progressBar = this.f7510m;
            o1 o1Var3 = o1.f7497l;
            if (o1Var2 == o1Var3) {
                progressBar.setVisibility(0);
                return;
            }
            if (o1Var2 == o1Var3 || o1Var2 == (o1Var = o1.f7496b)) {
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
            this.f7508b.animate().scaleX(0.6f).scaleY(0.6f).setDuration(300L).setInterpolator(new AccelerateDecelerateInterpolator()).withEndAction(new a2.s(this, 15)).start();
        }
    }
}
