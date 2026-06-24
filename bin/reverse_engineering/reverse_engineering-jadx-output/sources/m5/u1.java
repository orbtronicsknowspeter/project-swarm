package m5;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class u1 extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t4.c1 f7604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.b f7605b;

    /* JADX WARN: Illegal instructions before constructor call */
    public u1(t4.c1 c1Var, w4.b bVar) {
        bVar.getClass();
        RelativeLayout relativeLayout = c1Var.f9672b;
        super(relativeLayout);
        this.f7604a = c1Var;
        this.f7605b = bVar;
        final int i = 0;
        relativeLayout.setOnClickListener(new View.OnClickListener(this) { // from class: m5.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u1 f7599b;

            {
                this.f7599b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        u1 u1Var = this.f7599b;
                        int bindingAdapterPosition = u1Var.getBindingAdapterPosition();
                        if (bindingAdapterPosition != -1) {
                            u1Var.f7605b.b(bindingAdapterPosition);
                        }
                        break;
                    default:
                        u1 u1Var2 = this.f7599b;
                        int bindingAdapterPosition2 = u1Var2.getBindingAdapterPosition();
                        if (bindingAdapterPosition2 != -1) {
                            u1Var2.f7605b.b(bindingAdapterPosition2);
                        }
                        break;
                }
            }
        });
        final int i6 = 1;
        c1Var.f9673l.setOnClickListener(new View.OnClickListener(this) { // from class: m5.t1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u1 f7599b;

            {
                this.f7599b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i6) {
                    case 0:
                        u1 u1Var = this.f7599b;
                        int bindingAdapterPosition = u1Var.getBindingAdapterPosition();
                        if (bindingAdapterPosition != -1) {
                            u1Var.f7605b.b(bindingAdapterPosition);
                        }
                        break;
                    default:
                        u1 u1Var2 = this.f7599b;
                        int bindingAdapterPosition2 = u1Var2.getBindingAdapterPosition();
                        if (bindingAdapterPosition2 != -1) {
                            u1Var2.f7605b.b(bindingAdapterPosition2);
                        }
                        break;
                }
            }
        });
        c1Var.f9676o.setTypeface(f4.c.f4882w);
        c1Var.f9675n.setTypeface(f4.c.f4883x);
    }
}
