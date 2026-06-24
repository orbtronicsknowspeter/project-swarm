package f6;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements LeadingMarginSpan {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final boolean f4901o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d6.f f4902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f4903b = g.f4920c;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RectF f4904l = g.f4919b;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Rect f4905m = g.f4918a;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f4906n;

    static {
        int i = Build.VERSION.SDK_INT;
        f4901o = 24 == i || 25 == i;
    }

    public b(d6.f fVar, int i) {
        this.f4902a = fVar;
        this.f4906n = i;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i6, int i10, int i11, int i12, CharSequence charSequence, int i13, int i14, boolean z9, Layout layout) {
        int iMin;
        int iMax;
        RectF rectF = this.f4904l;
        Rect rect = this.f4905m;
        if (z9 && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i13) {
            Paint paint2 = this.f4903b;
            paint2.set(paint);
            d6.f fVar = this.f4902a;
            fVar.getClass();
            int i15 = fVar.f3612a;
            paint2.setColor(paint2.getColor());
            int i16 = fVar.f3614c;
            if (i16 != 0) {
                paint2.setStrokeWidth(i16);
            }
            int iSave = canvas.save();
            try {
                int iMin2 = Math.min(i15, (int) ((paint2.descent() - paint2.ascent()) + 0.5f)) / 2;
                int i17 = (i15 - iMin2) / 2;
                boolean z10 = f4901o;
                int i18 = this.f4906n;
                if (z10) {
                    int width = i6 < 0 ? i - (layout.getWidth() - (i15 * i18)) : (i15 * i18) - i;
                    int i19 = (i17 * i6) + i;
                    int i20 = (i6 * iMin2) + i19;
                    int i21 = i6 * width;
                    iMin = Math.min(i19, i20) + i21;
                    iMax = Math.max(i19, i20) + i21;
                } else {
                    if (i6 <= 0) {
                        i -= i15;
                    }
                    iMin = i + i17;
                    iMax = iMin + iMin2;
                }
                int iDescent = (i11 + ((int) (((paint2.descent() + paint2.ascent()) / 2.0f) + 0.5f))) - (iMin2 / 2);
                int i22 = iMin2 + iDescent;
                if (i18 == 0 || i18 == 1) {
                    rectF.set(iMin, iDescent, iMax, i22);
                    paint2.setStyle(i18 == 0 ? Paint.Style.FILL : Paint.Style.STROKE);
                    canvas.drawOval(rectF, paint2);
                } else {
                    rect.set(iMin, iDescent, iMax, i22);
                    paint2.setStyle(Paint.Style.FILL);
                    canvas.drawRect(rect, paint2);
                }
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave);
                throw th;
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z9) {
        return this.f4902a.f3612a;
    }
}
