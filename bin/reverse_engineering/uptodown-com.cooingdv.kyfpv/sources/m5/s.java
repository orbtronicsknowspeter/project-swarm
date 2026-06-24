package m5;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class s extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.b f7556b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f7557l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ImageView f7558m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f7559n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f7560o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(View view, w4.b bVar, Context context) {
        super(view);
        context.getClass();
        this.f7556b = bVar;
        this.f7557l = context;
        View viewFindViewById = view.findViewById(R.id.iv_icon_free_up_item);
        viewFindViewById.getClass();
        this.f7558m = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.tv_name_free_up_item);
        viewFindViewById2.getClass();
        TextView textView = (TextView) viewFindViewById2;
        this.f7559n = textView;
        View viewFindViewById3 = view.findViewById(R.id.tv_size_free_up_item);
        viewFindViewById3.getClass();
        TextView textView2 = (TextView) viewFindViewById3;
        this.f7560o = textView2;
        View viewFindViewById4 = view.findViewById(R.id.tv_action_free_up_item);
        viewFindViewById4.getClass();
        TextView textView3 = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.rl_container_free_up_item);
        viewFindViewById5.getClass();
        final int i = 0;
        ((RelativeLayout) viewFindViewById5).setOnClickListener(new View.OnClickListener(this) { // from class: m5.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f7549b;

            {
                this.f7549b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int bindingAdapterPosition;
                switch (i) {
                    case 0:
                        s sVar = this.f7549b;
                        w4.b bVar2 = sVar.f7556b;
                        if (bVar2 != null && (bindingAdapterPosition = sVar.getBindingAdapterPosition()) != -1) {
                            bVar2.b(bindingAdapterPosition);
                            break;
                        }
                        break;
                    default:
                        s sVar2 = this.f7549b;
                        w4.b bVar3 = sVar2.f7556b;
                        if (bVar3 != null) {
                            bVar3.b(sVar2.getBindingAdapterPosition());
                        }
                        break;
                }
            }
        });
        final int i6 = 1;
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: m5.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f7549b;

            {
                this.f7549b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int bindingAdapterPosition;
                switch (i6) {
                    case 0:
                        s sVar = this.f7549b;
                        w4.b bVar2 = sVar.f7556b;
                        if (bVar2 != null && (bindingAdapterPosition = sVar.getBindingAdapterPosition()) != -1) {
                            bVar2.b(bindingAdapterPosition);
                            break;
                        }
                        break;
                    default:
                        s sVar2 = this.f7549b;
                        w4.b bVar3 = sVar2.f7556b;
                        if (bVar3 != null) {
                            bVar3.b(sVar2.getBindingAdapterPosition());
                        }
                        break;
                }
            }
        });
        textView.setTypeface(f4.c.f4883w);
        textView3.setTypeface(f4.c.f4883w);
        textView2.setTypeface(f4.c.f4884x);
    }
}
