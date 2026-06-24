package m5;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.measurement.i5;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import x4.q2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w4.b f7338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f7339b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f7340l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f7341m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f7342n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f7343o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f7344p;

    public d(View view, w4.b bVar) {
        super(view);
        this.f7338a = bVar;
        View viewFindViewById = view.findViewById(R.id.iv_icon_installed_app_item);
        viewFindViewById.getClass();
        this.f7339b = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.tv_name_installed_app_item);
        viewFindViewById2.getClass();
        TextView textView = (TextView) viewFindViewById2;
        this.f7340l = textView;
        View viewFindViewById3 = view.findViewById(R.id.tv_version_installed_app_item);
        viewFindViewById3.getClass();
        TextView textView2 = (TextView) viewFindViewById3;
        this.f7341m = textView2;
        View viewFindViewById4 = view.findViewById(R.id.tv_size_installed_app_item);
        viewFindViewById4.getClass();
        TextView textView3 = (TextView) viewFindViewById4;
        this.f7342n = textView3;
        View viewFindViewById5 = view.findViewById(R.id.tv_last_update_installed_app_item);
        viewFindViewById5.getClass();
        TextView textView4 = (TextView) viewFindViewById5;
        this.f7343o = textView4;
        View viewFindViewById6 = view.findViewById(R.id.tv_excluded_installed_app_item);
        viewFindViewById6.getClass();
        TextView textView5 = (TextView) viewFindViewById6;
        this.f7344p = textView5;
        View viewFindViewById7 = view.findViewById(R.id.rl_installed_app_item);
        viewFindViewById7.getClass();
        textView.setTypeface(f4.c.f4883w);
        textView2.setTypeface(f4.c.f4883w);
        textView3.setTypeface(f4.c.f4884x);
        textView4.setTypeface(f4.c.f4884x);
        textView5.setTypeface(f4.c.f4883w);
        ((RelativeLayout) viewFindViewById7).setOnClickListener(new c4.d(this, 26));
    }

    public final void a(x4.e eVar) {
        boolean z9 = eVar.K;
        View view = this.itemView;
        if (z9) {
            view.setAlpha(0.3f);
        } else {
            view.setAlpha(1.0f);
        }
        e1.c0 c0Var = j5.g.D;
        Context context = this.itemView.getContext();
        context.getClass();
        j5.g gVarL = c0Var.l(context);
        gVarL.b();
        String str = eVar.f11124l;
        str.getClass();
        q2 q2VarY = gVarL.Y(str);
        gVarL.c();
        ConcurrentHashMap concurrentHashMap = j5.t.f6709a;
        Context context2 = this.itemView.getContext();
        context2.getClass();
        this.f7339b.setImageDrawable(j5.t.b(context2, eVar.f11124l));
        this.f7340l.setText(eVar.f11123b);
        String str2 = eVar.f11126n;
        TextView textView = this.f7341m;
        textView.setText(str2);
        long j = eVar.f11134w;
        Context context3 = this.itemView.getContext();
        context3.getClass();
        this.f7342n.setText(i5.H(context3, j));
        long j6 = eVar.f11135x;
        this.f7343o.setText(j6 <= 0 ? null : new SimpleDateFormat("dd MMM yyyy", Locale.getDefault()).format(new Date(j6)));
        float f = UptodownApp.I;
        l4.a aVarC = f4.a.f4870a.c();
        if (l7.u.m0(aVarC != null ? aVarC.f7096a : null, eVar.f11124l, true)) {
            textView.setText(R.string.installing);
        }
        int i = eVar.v;
        TextView textView2 = this.f7344p;
        if (i == 1) {
            textView2.setText(this.itemView.getContext().getString(R.string.disabled_updates));
            textView2.setVisibility(0);
        } else if (q2VarY == null || q2VarY.f11349o != 1) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(this.itemView.getContext().getString(R.string.skipped_update));
            textView2.setVisibility(0);
        }
    }
}
