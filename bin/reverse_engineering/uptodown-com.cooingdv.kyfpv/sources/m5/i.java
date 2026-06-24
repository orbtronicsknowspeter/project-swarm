package m5;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0.i f7420b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RelativeLayout f7421l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f7422m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f7423n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f7424o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f7425p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ProgressBar f7426q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ImageView f7427r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ImageView f7428s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f7429t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f7430u;
    public final ImageView v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final RelativeLayout f7431w;

    public i(View view, f0.i iVar) {
        super(view);
        this.f7420b = iVar;
        View viewFindViewById = view.findViewById(R.id.rl_download_item);
        viewFindViewById.getClass();
        this.f7421l = (RelativeLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.tv_name_download_item);
        viewFindViewById2.getClass();
        TextView textView = (TextView) viewFindViewById2;
        this.f7422m = textView;
        View viewFindViewById3 = view.findViewById(R.id.tv_version_download_item);
        viewFindViewById3.getClass();
        TextView textView2 = (TextView) viewFindViewById3;
        this.f7423n = textView2;
        View viewFindViewById4 = view.findViewById(R.id.tv_size_download_item);
        viewFindViewById4.getClass();
        TextView textView3 = (TextView) viewFindViewById4;
        this.f7424o = textView3;
        View viewFindViewById5 = view.findViewById(R.id.tv_date_download_item);
        viewFindViewById5.getClass();
        TextView textView4 = (TextView) viewFindViewById5;
        this.f7425p = textView4;
        View viewFindViewById6 = view.findViewById(R.id.pb_progress_download_item);
        viewFindViewById6.getClass();
        this.f7426q = (ProgressBar) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.iv_cancel_download_item);
        viewFindViewById7.getClass();
        ImageView imageView = (ImageView) viewFindViewById7;
        this.f7427r = imageView;
        View viewFindViewById8 = view.findViewById(R.id.iv_icon_download_item);
        viewFindViewById8.getClass();
        this.f7428s = (ImageView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.tv_info_download_item);
        viewFindViewById9.getClass();
        TextView textView5 = (TextView) viewFindViewById9;
        this.f7429t = textView5;
        View viewFindViewById10 = view.findViewById(R.id.tv_deeplink_download_item);
        viewFindViewById10.getClass();
        TextView textView6 = (TextView) viewFindViewById10;
        this.f7430u = textView6;
        View viewFindViewById11 = view.findViewById(R.id.iv_resume_download_item);
        viewFindViewById11.getClass();
        ImageView imageView2 = (ImageView) viewFindViewById11;
        this.v = imageView2;
        View viewFindViewById12 = view.findViewById(R.id.rl_container_options_download_item);
        viewFindViewById12.getClass();
        this.f7431w = (RelativeLayout) viewFindViewById12;
        final int i = 0;
        view.setOnClickListener(new View.OnClickListener(this) { // from class: m5.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f7396b;

            {
                this.f7396b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:115:0x02e0  */
            /* JADX WARN: Removed duplicated region for block: B:138:0x0353  */
            /* JADX WARN: Removed duplicated region for block: B:142:0x0364  */
            /* JADX WARN: Removed duplicated region for block: B:143:0x036f  */
            /* JADX WARN: Removed duplicated region for block: B:147:0x0398  */
            /* JADX WARN: Removed duplicated region for block: B:150:0x03a4  */
            /* JADX WARN: Removed duplicated region for block: B:160:0x03dc  */
            /* JADX WARN: Removed duplicated region for block: B:163:0x0404  */
            /* JADX WARN: Removed duplicated region for block: B:166:0x042f  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.view.View r22) {
                /*
                    Method dump skipped, instruction units count: 1172
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: m5.g.onClick(android.view.View):void");
            }
        });
        view.setOnLongClickListener(new h(this, 0));
        textView.setTypeface(f4.c.f4883w);
        textView2.setTypeface(f4.c.f4884x);
        textView3.setTypeface(f4.c.f4883w);
        textView4.setTypeface(f4.c.f4884x);
        textView5.setTypeface(f4.c.f4883w);
        textView6.setTypeface(f4.c.f4883w);
        final int i6 = 1;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: m5.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f7396b;

            {
                this.f7396b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:115:0x02e0  */
            /* JADX WARN: Removed duplicated region for block: B:138:0x0353  */
            /* JADX WARN: Removed duplicated region for block: B:142:0x0364  */
            /* JADX WARN: Removed duplicated region for block: B:143:0x036f  */
            /* JADX WARN: Removed duplicated region for block: B:147:0x0398  */
            /* JADX WARN: Removed duplicated region for block: B:150:0x03a4  */
            /* JADX WARN: Removed duplicated region for block: B:160:0x03dc  */
            /* JADX WARN: Removed duplicated region for block: B:163:0x0404  */
            /* JADX WARN: Removed duplicated region for block: B:166:0x042f  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.view.View r22) {
                /*
                    Method dump skipped, instruction units count: 1172
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: m5.g.onClick(android.view.View):void");
            }
        });
        final int i10 = 2;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: m5.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f7396b;

            {
                this.f7396b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:115:0x02e0  */
            /* JADX WARN: Removed duplicated region for block: B:138:0x0353  */
            /* JADX WARN: Removed duplicated region for block: B:142:0x0364  */
            /* JADX WARN: Removed duplicated region for block: B:143:0x036f  */
            /* JADX WARN: Removed duplicated region for block: B:147:0x0398  */
            /* JADX WARN: Removed duplicated region for block: B:150:0x03a4  */
            /* JADX WARN: Removed duplicated region for block: B:160:0x03dc  */
            /* JADX WARN: Removed duplicated region for block: B:163:0x0404  */
            /* JADX WARN: Removed duplicated region for block: B:166:0x042f  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.view.View r22) {
                /*
                    Method dump skipped, instruction units count: 1172
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: m5.g.onClick(android.view.View):void");
            }
        });
    }
}
