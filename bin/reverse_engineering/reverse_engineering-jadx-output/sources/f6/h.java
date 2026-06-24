package f6;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d6.f f4920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4921b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Paint f4922l = g.f4919c;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4923m;

    public h(d6.f fVar, String str) {
        this.f4920a = fVar;
        this.f4921b = str;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i6, int i10, int i11, int i12, CharSequence charSequence, int i13, int i14, boolean z9, Layout layout) {
        int i15;
        if (z9 && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i13) {
            Paint paint2 = this.f4922l;
            paint2.set(paint);
            d6.f fVar = this.f4920a;
            fVar.getClass();
            paint2.setColor(paint2.getColor());
            int i16 = fVar.f3613c;
            if (i16 != 0) {
                paint2.setStrokeWidth(i16);
            }
            String str = this.f4921b;
            int iMeasureText = (int) (paint2.measureText(str) + 0.5f);
            int i17 = fVar.f3611a;
            if (iMeasureText > i17) {
                this.f4923m = iMeasureText;
                i17 = iMeasureText;
            } else {
                this.f4923m = 0;
            }
            if (i6 > 0) {
                i15 = ((i17 * i6) + i) - iMeasureText;
            } else {
                i15 = (i17 - iMeasureText) + (i6 * i17) + i;
            }
            canvas.drawText(str, i15, i11, paint2);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z9) {
        return Math.max(this.f4923m, this.f4920a.f3611a);
    }
}
