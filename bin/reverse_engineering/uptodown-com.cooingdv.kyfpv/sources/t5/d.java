package t5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import e4.h1;
import eightbitlab.com.blurview.BlurView;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f10290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f10291b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Bitmap f10292l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final BlurView f10293m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f10294n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ViewGroup f10295o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int[] f10296p = new int[2];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int[] f10297q = new int[2];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h1 f10298r = new h1(this, 2);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f10299s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Drawable f10300t;

    public d(BlurView blurView, ViewGroup viewGroup, int i, a aVar) {
        this.f10295o = viewGroup;
        this.f10293m = blurView;
        this.f10294n = i;
        this.f10290a = aVar;
        if (aVar instanceof f) {
            ((f) aVar).f = blurView.getContext();
        }
        a(blurView.getMeasuredWidth(), blurView.getMeasuredHeight());
    }

    public final void a(int i, int i6) {
        d(true);
        a aVar = this.f10290a;
        aVar.getClass();
        float f = i6;
        int iCeil = (int) Math.ceil(f / 6.0f);
        BlurView blurView = this.f10293m;
        if (iCeil != 0) {
            double d10 = i / 6.0f;
            if (((int) Math.ceil(d10)) != 0) {
                blurView.setWillNotDraw(false);
                int iCeil2 = (int) Math.ceil(d10);
                int i10 = iCeil2 % 64;
                if (i10 != 0) {
                    iCeil2 = (iCeil2 - i10) + 64;
                }
                int iCeil3 = (int) Math.ceil(f / (r8 / iCeil2));
                aVar.a();
                this.f10292l = Bitmap.createBitmap(iCeil2, iCeil3, Bitmap.Config.ARGB_8888);
                this.f10291b = new c(this.f10292l);
                this.f10299s = true;
                b();
                return;
            }
        }
        blurView.setWillNotDraw(true);
    }

    public final void b() {
        if (this.f10299s) {
            Drawable drawable = this.f10300t;
            if (drawable == null) {
                this.f10292l.eraseColor(0);
            } else {
                drawable.draw(this.f10291b);
            }
            this.f10291b.save();
            ViewGroup viewGroup = this.f10295o;
            int[] iArr = this.f10296p;
            viewGroup.getLocationOnScreen(iArr);
            BlurView blurView = this.f10293m;
            int[] iArr2 = this.f10297q;
            blurView.getLocationOnScreen(iArr2);
            int i = iArr2[0] - iArr[0];
            int i6 = iArr2[1] - iArr[1];
            float height = blurView.getHeight() / this.f10292l.getHeight();
            float width = blurView.getWidth() / this.f10292l.getWidth();
            this.f10291b.translate((-i) / width, (-i6) / height);
            this.f10291b.scale(1.0f / width, 1.0f / height);
            viewGroup.draw(this.f10291b);
            this.f10291b.restore();
            this.f10292l = this.f10290a.c(this.f10292l, 16.0f);
        }
    }

    @Override // t5.b
    public final b d(boolean z9) {
        ViewGroup viewGroup = this.f10295o;
        ViewTreeObserver viewTreeObserver = viewGroup.getViewTreeObserver();
        h1 h1Var = this.f10298r;
        viewTreeObserver.removeOnPreDrawListener(h1Var);
        if (z9) {
            viewGroup.getViewTreeObserver().addOnPreDrawListener(h1Var);
        }
        return this;
    }

    @Override // t5.b
    public final void destroy() {
        d(false);
        this.f10290a.destroy();
        this.f10299s = false;
    }

    @Override // t5.b
    public final boolean draw(Canvas canvas) {
        if (this.f10299s) {
            if (canvas instanceof c) {
                return false;
            }
            BlurView blurView = this.f10293m;
            float height = blurView.getHeight() / this.f10292l.getHeight();
            canvas.save();
            canvas.scale(blurView.getWidth() / this.f10292l.getWidth(), height);
            this.f10290a.b(canvas, this.f10292l);
            canvas.restore();
            int i = this.f10294n;
            if (i != 0) {
                canvas.drawColor(i);
            }
        }
        return true;
    }

    @Override // t5.b
    public final void e() {
        BlurView blurView = this.f10293m;
        a(blurView.getMeasuredWidth(), blurView.getMeasuredHeight());
    }
}
