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
    public final d6.f f4921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4922b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Paint f4923l = g.f4920c;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4924m;

    public h(d6.f fVar, String str) {
        this.f4921a = fVar;
        this.f4922b = str;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i6, int i10, int i11, int i12, CharSequence charSequence, int i13, int i14, boolean z9, Layout layout) {
        int i15;
        if (z9 && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i13) {
            Paint paint2 = this.f4923l;
            paint2.set(paint);
            d6.f fVar = this.f4921a;
            fVar.getClass();
            paint2.setColor(paint2.getColor());
            int i16 = fVar.f3614c;
            if (i16 != 0) {
                paint2.setStrokeWidth(i16);
            }
            String str = this.f4922b;
            int iMeasureText = (int) (paint2.measureText(str) + 0.5f);
            int i17 = fVar.f3612a;
            if (iMeasureText > i17) {
                this.f4924m = iMeasureText;
                i17 = iMeasureText;
            } else {
                this.f4924m = 0;
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
        return Math.max(this.f4924m, this.f4921a.f3612a);
    }
}
