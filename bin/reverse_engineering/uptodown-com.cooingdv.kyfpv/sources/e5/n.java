package e5;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.leanback.R;
import androidx.leanback.widget.ImageCardView;
import androidx.leanback.widget.Presenter;
import com.google.android.gms.internal.measurement.i5;
import j$.util.concurrent.ConcurrentHashMap;
import j5.t;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends Presenter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4748b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4749l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4750m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Drawable f4751n;

    public final void a(m mVar, boolean z9) {
        int i = z9 ? this.f4747a : this.f4748b;
        int i6 = z9 ? this.f4750m : this.f4749l;
        mVar.setBackgroundColor(i);
        mVar.findViewById(R.id.info_field).setBackgroundColor(i);
        View viewFindViewById = mVar.findViewById(R.id.title_text);
        viewFindViewById.getClass();
        ((TextView) viewFindViewById).setTextColor(i6);
        View viewFindViewById2 = mVar.findViewById(R.id.content_text);
        viewFindViewById2.getClass();
        ((TextView) viewFindViewById2).setTextColor(i6);
    }

    @Override // androidx.leanback.widget.Presenter
    public final void onBindViewHolder(Presenter.ViewHolder viewHolder, Object obj) {
        viewHolder.getClass();
        View view = viewHolder.view;
        view.getClass();
        ImageCardView imageCardView = (ImageCardView) view;
        if (obj instanceof x4.e) {
            x4.e eVar = (x4.e) obj;
            imageCardView.setTitleText(eVar.f11123b);
            Context context = imageCardView.getContext();
            context.getClass();
            imageCardView.setContentText(i5.H(context, eVar.f11134w));
            ConcurrentHashMap concurrentHashMap = t.f6709a;
            Context context2 = viewHolder.view.getContext();
            context2.getClass();
            String str = eVar.f11124l;
            str.getClass();
            Drawable drawableB = t.b(context2, str);
            Resources resources = imageCardView.getResources();
            imageCardView.setMainImageDimensions(resources.getDimensionPixelSize(com.uptodown.R.dimen.tv_card_height), resources.getDimensionPixelSize(com.uptodown.R.dimen.tv_card_height));
            if (drawableB != null) {
                imageCardView.setMainImage(drawableB);
            } else {
                imageCardView.setMainImage(this.f4751n);
            }
            imageCardView.setPadding(18, 18, 18, 18);
        }
    }

    @Override // androidx.leanback.widget.Presenter
    public final Presenter.ViewHolder onCreateViewHolder(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.f4748b = ContextCompat.getColor(viewGroup.getContext(), com.uptodown.R.color.background_color);
        this.f4747a = ContextCompat.getColor(viewGroup.getContext(), com.uptodown.R.color.background_color);
        this.f4749l = ContextCompat.getColor(viewGroup.getContext(), com.uptodown.R.color.text_primary);
        this.f4750m = ContextCompat.getColor(viewGroup.getContext(), com.uptodown.R.color.text_secundary);
        this.f4751n = ContextCompat.getDrawable(viewGroup.getContext(), com.uptodown.R.drawable.vector_uptodown_logo_disabled);
        m mVar = new m(this, viewGroup.getContext());
        mVar.setFocusable(true);
        mVar.setFocusableInTouchMode(true);
        a(mVar, false);
        return new Presenter.ViewHolder(mVar);
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
