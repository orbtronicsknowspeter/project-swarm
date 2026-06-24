package f6;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d6.f f4898b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Rect f4899l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Paint f4900m;

    public a(d6.f fVar, int i) {
        this.f4897a = i;
        switch (i) {
            case 1:
                this.f4899l = g.f4918a;
                this.f4900m = g.f4920c;
                this.f4898b = fVar;
                break;
            default:
                this.f4899l = g.f4918a;
                this.f4900m = g.f4920c;
                this.f4898b = fVar;
                break;
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i6, int i10, int i11, int i12, CharSequence charSequence, int i13, int i14, boolean z9, Layout layout) {
        int width;
        switch (this.f4897a) {
            case 0:
                d6.f fVar = this.f4898b;
                int i15 = fVar.f3613b;
                if (i15 == 0) {
                    i15 = (int) ((fVar.f3612a * 0.25f) + 0.5f);
                }
                Paint paint2 = this.f4900m;
                paint2.set(paint);
                fVar.getClass();
                int iD = t0.f.d(paint2.getColor(), 25);
                paint2.setStyle(Paint.Style.FILL);
                paint2.setColor(iD);
                int i16 = i6 * i15;
                int i17 = i + i16;
                int i18 = i16 + i17;
                int iMin = Math.min(i17, i18);
                int iMax = Math.max(i17, i18);
                Rect rect = this.f4899l;
                rect.set(iMin, i10, iMax, i12);
                canvas.drawRect(rect, paint2);
                break;
            default:
                int i19 = ((i12 - i10) / 2) + i10;
                Paint paint3 = this.f4900m;
                paint3.set(paint);
                d6.f fVar2 = this.f4898b;
                fVar2.getClass();
                paint3.setColor(t0.f.d(paint3.getColor(), 25));
                paint3.setStyle(Paint.Style.FILL);
                int i20 = fVar2.f;
                if (i20 >= 0) {
                    paint3.setStrokeWidth(i20);
                }
                int strokeWidth = (int) ((((int) (paint3.getStrokeWidth() + 0.5f)) / 2.0f) + 0.5f);
                if (i6 > 0) {
                    width = canvas.getWidth();
                } else {
                    width = i;
                    i -= canvas.getWidth();
                }
                int i21 = i19 - strokeWidth;
                int i22 = i19 + strokeWidth;
                Rect rect2 = this.f4899l;
                rect2.set(i, i21, width, i22);
                canvas.drawRect(rect2, paint3);
                break;
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z9) {
        switch (this.f4897a) {
            case 0:
                return this.f4898b.f3612a;
            default:
                return 0;
        }
    }
}
