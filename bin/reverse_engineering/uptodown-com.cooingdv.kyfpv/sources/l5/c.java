package l5;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.uptodown.R;
import com.uptodown.UptodownApp;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends w3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f7131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f7132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f7133c;

    public c(View view, v3.e eVar) {
        eVar.getClass();
        this.f7131a = view;
        View viewFindViewById = view.findViewById(R.id.v_player_panel_home);
        viewFindViewById.getClass();
        View viewFindViewById2 = view.findViewById(R.id.iv_player_panel_feature);
        viewFindViewById2.getClass();
        ImageView imageView = (ImageView) viewFindViewById2;
        this.f7132b = imageView;
        View viewFindViewById3 = view.findViewById(R.id.iv_player_control);
        viewFindViewById3.getClass();
        this.f7133c = (ImageView) viewFindViewById3;
        ((z3.g) eVar).a(new y3.f());
        imageView.setOnClickListener(new c4.d(eVar, 24));
        viewFindViewById.setOnClickListener(new c4.d(eVar, 24));
    }

    @Override // w3.a
    public final void d(v3.e eVar, v3.d dVar) {
        eVar.getClass();
        ImageView imageView = this.f7133c;
        v3.d dVar2 = v3.d.f10836m;
        ImageView imageView2 = this.f7132b;
        if (dVar == dVar2) {
            imageView2.setVisibility(8);
            imageView.setVisibility(8);
            return;
        }
        imageView2.setVisibility(0);
        float f = UptodownApp.I;
        Context context = this.f7131a.getContext();
        context.getClass();
        if (b4.d.e(context)) {
            return;
        }
        imageView.setVisibility(0);
    }
}
