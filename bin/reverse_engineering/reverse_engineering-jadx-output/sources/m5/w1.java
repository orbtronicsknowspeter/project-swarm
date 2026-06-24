package m5;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class w1 extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t4.c1 f7627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.o f7628b;

    /* JADX WARN: Illegal instructions before constructor call */
    public w1(t4.c1 c1Var, android.support.v4.media.g gVar) {
        RelativeLayout relativeLayout = c1Var.f9672b;
        super(relativeLayout);
        this.f7627a = c1Var;
        this.f7628b = gVar;
        final int i = 0;
        relativeLayout.setOnClickListener(new View.OnClickListener(this) { // from class: m5.v1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w1 f7620b;

            {
                this.f7620b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int bindingAdapterPosition;
                int bindingAdapterPosition2;
                switch (i) {
                    case 0:
                        w1 w1Var = this.f7620b;
                        w4.o oVar = w1Var.f7628b;
                        if (oVar != null && (bindingAdapterPosition = w1Var.getBindingAdapterPosition()) != -1) {
                            oVar.a(bindingAdapterPosition);
                            break;
                        }
                        break;
                    default:
                        w1 w1Var2 = this.f7620b;
                        w4.o oVar2 = w1Var2.f7628b;
                        if (oVar2 != null && (bindingAdapterPosition2 = w1Var2.getBindingAdapterPosition()) != -1) {
                            oVar2.a(bindingAdapterPosition2);
                            break;
                        }
                        break;
                }
            }
        });
        final int i6 = 1;
        c1Var.f9674m.setOnClickListener(new View.OnClickListener(this) { // from class: m5.v1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w1 f7620b;

            {
                this.f7620b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int bindingAdapterPosition;
                int bindingAdapterPosition2;
                switch (i6) {
                    case 0:
                        w1 w1Var = this.f7620b;
                        w4.o oVar = w1Var.f7628b;
                        if (oVar != null && (bindingAdapterPosition = w1Var.getBindingAdapterPosition()) != -1) {
                            oVar.a(bindingAdapterPosition);
                            break;
                        }
                        break;
                    default:
                        w1 w1Var2 = this.f7620b;
                        w4.o oVar2 = w1Var2.f7628b;
                        if (oVar2 != null && (bindingAdapterPosition2 = w1Var2.getBindingAdapterPosition()) != -1) {
                            oVar2.a(bindingAdapterPosition2);
                            break;
                        }
                        break;
                }
            }
        });
        c1Var.f9676o.setTypeface(f4.c.f4882w);
        c1Var.f9675n.setTypeface(f4.c.f4883x);
    }
}
