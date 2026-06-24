package e5;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.leanback.widget.Presenter;
import com.uptodown.R;
import e1.c0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends Presenter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w4.f f4734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i5.b f4735b;

    public b(w4.f fVar) {
        this.f4734a = fVar;
    }

    @Override // androidx.leanback.widget.Presenter
    public final void onBindViewHolder(Presenter.ViewHolder viewHolder, Object obj) {
        viewHolder.getClass();
        if (obj != null) {
            x4.g gVar = (x4.g) obj;
            i5.b bVar = (i5.b) viewHolder;
            this.f4735b = bVar;
            Context context = viewHolder.view.getContext();
            context.getClass();
            TextView textView = bVar.f5663b;
            bVar.f5662a.setText(gVar.f11160b);
            String str = gVar.f11176o;
            w4.f fVar = this.f4734a;
            if (str == null || str.length() == 0 || fVar == null) {
                textView.setText(gVar.f11176o);
            } else {
                String str2 = gVar.f11176o;
                str2.getClass();
                textView.setText(a.a.M(str2, context, fVar));
            }
            String str3 = gVar.f11193x;
            if (str3 != null) {
                TextView textView2 = bVar.f5664l;
                if (fVar != null) {
                    textView2.setText(a.a.M(str3, context, fVar));
                } else {
                    textView2.setText(a.a.M(str3, context, new c0(17)));
                }
            }
            bVar.a(0);
            bVar.f5666n.setText(gVar.f11171l);
            bVar.f5667o.setText(gVar.f11191w);
            int i = gVar.f11195y;
            RelativeLayout relativeLayout = bVar.f5670r;
            if (i == 0) {
                relativeLayout.setVisibility(8);
                return;
            }
            TextView textView3 = (TextView) relativeLayout.findViewById(R.id.tv_valoration_value_tv_app_detail);
            textView3.setTypeface(f4.c.f4884x);
            textView3.setText(String.valueOf(((double) gVar.f11195y) / 10.0d));
            TextView textView4 = (TextView) relativeLayout.findViewById(R.id.tv_num_ratings);
            textView4.setTypeface(f4.c.f4884x);
            textView4.setText(String.valueOf(gVar.f11197z));
            View viewFindViewById = relativeLayout.findViewById(R.id.iv_star1);
            viewFindViewById.getClass();
            ImageView imageView = (ImageView) viewFindViewById;
            View viewFindViewById2 = relativeLayout.findViewById(R.id.iv_star2);
            viewFindViewById2.getClass();
            ImageView imageView2 = (ImageView) viewFindViewById2;
            View viewFindViewById3 = relativeLayout.findViewById(R.id.iv_star3);
            viewFindViewById3.getClass();
            ImageView imageView3 = (ImageView) viewFindViewById3;
            View viewFindViewById4 = relativeLayout.findViewById(R.id.iv_star4);
            viewFindViewById4.getClass();
            ImageView imageView4 = (ImageView) viewFindViewById4;
            View viewFindViewById5 = relativeLayout.findViewById(R.id.iv_star5);
            viewFindViewById5.getClass();
            ImageView imageView5 = (ImageView) viewFindViewById5;
            imageView.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_off));
            imageView2.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_off));
            imageView3.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_off));
            imageView4.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_off));
            imageView5.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_off));
            if (gVar.f11195y > 5) {
                imageView.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on));
            }
            if (gVar.f11195y > 15) {
                imageView2.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on));
            }
            if (gVar.f11195y > 25) {
                imageView3.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on));
            }
            if (gVar.f11195y > 35) {
                imageView4.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on));
            }
            if (gVar.f11195y > 45) {
                imageView5.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_star_on));
            }
        }
    }

    @Override // androidx.leanback.widget.Presenter
    public final Presenter.ViewHolder onCreateViewHolder(ViewGroup viewGroup) {
        View viewS = androidx.lifecycle.l.s(viewGroup, R.layout.tv_app_detail, viewGroup, false);
        viewS.getClass();
        return new i5.b(viewS);
    }

    @Override // androidx.leanback.widget.Presenter
    public final void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        viewHolder.getClass();
    }
}
