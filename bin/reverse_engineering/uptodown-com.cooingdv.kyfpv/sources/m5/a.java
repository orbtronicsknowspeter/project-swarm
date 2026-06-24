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

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w4.b f7296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f7297b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f7298l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f7299m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f7300n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f7301o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f7302p;

    public a(View view, w4.b bVar) {
        super(view);
        this.f7296a = bVar;
        View viewFindViewById = view.findViewById(R.id.iv_icon_installed_app_item);
        viewFindViewById.getClass();
        this.f7297b = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.tv_name_installed_app_item);
        viewFindViewById2.getClass();
        TextView textView = (TextView) viewFindViewById2;
        this.f7298l = textView;
        View viewFindViewById3 = view.findViewById(R.id.tv_version_installed_app_item);
        viewFindViewById3.getClass();
        TextView textView2 = (TextView) viewFindViewById3;
        this.f7299m = textView2;
        View viewFindViewById4 = view.findViewById(R.id.tv_size_installed_app_item);
        viewFindViewById4.getClass();
        TextView textView3 = (TextView) viewFindViewById4;
        this.f7300n = textView3;
        View viewFindViewById5 = view.findViewById(R.id.tv_last_update_installed_app_item);
        viewFindViewById5.getClass();
        TextView textView4 = (TextView) viewFindViewById5;
        this.f7301o = textView4;
        View viewFindViewById6 = view.findViewById(R.id.tv_excluded_installed_app_item);
        viewFindViewById6.getClass();
        TextView textView5 = (TextView) viewFindViewById6;
        this.f7302p = textView5;
        View viewFindViewById7 = view.findViewById(R.id.rl_installed_app_item);
        viewFindViewById7.getClass();
        textView.setTypeface(f4.c.f4883w);
        textView2.setTypeface(f4.c.f4883w);
        textView3.setTypeface(f4.c.f4884x);
        textView4.setTypeface(f4.c.f4884x);
        textView5.setTypeface(f4.c.f4883w);
        ((RelativeLayout) viewFindViewById7).setOnClickListener(new c4.d(this, 25));
    }

    public final void a(x4.e eVar) {
        boolean z9 = eVar.K;
        View view = this.itemView;
        if (z9) {
            view.setAlpha(0.3f);
        } else {
            view.setAlpha(1.0f);
        }
        ConcurrentHashMap concurrentHashMap = j5.t.f6709a;
        Context context = this.itemView.getContext();
        context.getClass();
        this.f7297b.setImageDrawable(j5.t.b(context, eVar.f11124l));
        this.f7298l.setText(eVar.f11123b);
        this.f7299m.setText(eVar.f11126n);
        long j = eVar.f11134w;
        Context context2 = this.itemView.getContext();
        context2.getClass();
        this.f7300n.setText(i5.H(context2, j));
        long j6 = eVar.f11135x;
        this.f7301o.setText(j6 <= 0 ? null : new SimpleDateFormat("dd MMM yyyy", Locale.getDefault()).format(new Date(j6)));
        float f = UptodownApp.I;
        String string = this.itemView.getContext().getString(R.string.disabled_updates);
        TextView textView = this.f7302p;
        textView.setText(string);
        textView.setVisibility(0);
    }
}
