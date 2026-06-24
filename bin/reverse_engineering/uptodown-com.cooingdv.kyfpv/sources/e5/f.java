package e5;

import a4.g0;
import a4.l0;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.leanback.R;
import androidx.leanback.widget.ImageCardView;
import androidx.leanback.widget.Presenter;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends Presenter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4737a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4738b = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4739l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4740m = -1;

    public final void a(e eVar, boolean z9) {
        int i = z9 ? this.f4737a : this.f4738b;
        int i6 = z9 ? this.f4740m : this.f4739l;
        eVar.setBackgroundColor(i);
        View viewFindViewById = eVar.findViewById(R.id.info_field);
        if (viewFindViewById != null) {
            viewFindViewById.setBackgroundColor(i);
        }
        TextView textView = (TextView) eVar.findViewById(R.id.title_text);
        if (textView != null) {
            textView.setTextColor(i6);
        }
        TextView textView2 = (TextView) eVar.findViewById(R.id.content_text);
        if (textView2 != null) {
            textView2.setTextColor(i6);
        }
    }

    @Override // androidx.leanback.widget.Presenter
    public final void onBindViewHolder(Presenter.ViewHolder viewHolder, Object obj) {
        viewHolder.getClass();
        View view = viewHolder.view;
        view.getClass();
        ImageCardView imageCardView = (ImageCardView) view;
        if (!(obj instanceof x4.g)) {
            if (obj instanceof c5.c) {
                Resources resources = imageCardView.getResources();
                imageCardView.setMainImageDimensions(resources.getDimensionPixelSize(com.uptodown.R.dimen.tv_card_height) / 2, resources.getDimensionPixelSize(com.uptodown.R.dimen.tv_card_height) / 2);
                int dimensionPixelSize = resources.getDimensionPixelSize(com.uptodown.R.dimen.margin_m) * 5;
                imageCardView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                imageCardView.setMainImage(ContextCompat.getDrawable(imageCardView.getContext(), com.uptodown.R.drawable.vector_plus));
                TextView textView = (TextView) imageCardView.findViewById(R.id.title_text);
                if (textView != null) {
                    textView.setVisibility(8);
                    textView.setText("");
                }
                TextView textView2 = (TextView) imageCardView.findViewById(R.id.content_text);
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    textView2.setText("");
                    return;
                }
                return;
            }
            return;
        }
        x4.g gVar = (x4.g) obj;
        imageCardView.setTitleText(gVar.f11160b);
        imageCardView.setContentText(gVar.f11176o);
        TextView textView3 = (TextView) imageCardView.findViewById(R.id.title_text);
        if (textView3 != null) {
            textView3.setVisibility(0);
            textView3.setTextColor(this.f4739l);
            textView3.setTypeface(f4.c.f4883w);
        }
        TextView textView4 = (TextView) imageCardView.findViewById(R.id.content_text);
        if (textView4 != null) {
            textView4.setVisibility(0);
            textView4.setTextColor(this.f4739l);
            textView4.setTypeface(f4.c.f4884x);
            textView4.setMaxLines(2);
            textView4.setLines(2);
        }
        Resources resources2 = imageCardView.getResources();
        int dimensionPixelSize2 = resources2.getDimensionPixelSize(com.uptodown.R.dimen.tv_card_height);
        imageCardView.setMainImageDimensions(dimensionPixelSize2, resources2.getDimensionPixelSize(com.uptodown.R.dimen.tv_card_height));
        l0 l0VarE = g0.d().e(gVar.g(dimensionPixelSize2));
        l0VarE.f(com.uptodown.R.drawable.shape_bg_placeholder);
        l0VarE.e(imageCardView.getMainImageView(), null);
        int dimensionPixelSize3 = resources2.getDimensionPixelSize(com.uptodown.R.dimen.margin_m);
        imageCardView.setPadding(dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3);
    }

    @Override // androidx.leanback.widget.Presenter
    public final Presenter.ViewHolder onCreateViewHolder(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.f4738b = ContextCompat.getColor(viewGroup.getContext(), com.uptodown.R.color.background_color);
        this.f4737a = ContextCompat.getColor(viewGroup.getContext(), com.uptodown.R.color.background_color);
        this.f4739l = ContextCompat.getColor(viewGroup.getContext(), com.uptodown.R.color.text_secundary);
        this.f4740m = ContextCompat.getColor(viewGroup.getContext(), com.uptodown.R.color.text_primary);
        e eVar = new e(this, viewGroup.getContext());
        eVar.setFocusable(true);
        eVar.setFocusableInTouchMode(true);
        a(eVar, false);
        return new Presenter.ViewHolder(eVar);
    }

    @Override // androidx.leanback.widget.Presenter
    public final void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        viewHolder.getClass();
        View view = viewHolder.view;
        view.getClass();
        ImageCardView imageCardView = (ImageCardView) view;
        imageCardView.setBadgeImage(null);
        imageCardView.setMainImage(null);
    }
}
