package com.uptodown.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.google.android.gms.internal.measurement.i5;
import com.uptodown.R;
import f4.c;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g;
import n5.e;
import q6.t;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class DonutChartView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f3463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f3464b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f3465l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Paint f3466m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Paint f3467n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DonutChartView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.f3463a = t.f8725a;
        this.f3464b = "";
        this.f3465l = 50.0f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        this.f3466m = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTypeface(c.f4883w);
        paint2.setColor(ContextCompat.getColor(context, R.color.blue_primary));
        paint2.setTextSize(context.getResources().getDimension(R.dimen.font_size_26));
        this.f3467n = paint2;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        canvas.getClass();
        super.onDraw(canvas);
        if (this.f3463a.isEmpty()) {
            return;
        }
        float fMin = Math.min(getWidth(), getHeight());
        float f = this.f3465l;
        float f10 = (fMin - f) / 2.0f;
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        Paint paint = this.f3466m;
        paint.setStrokeWidth(f);
        Iterator it = this.f3463a.iterator();
        double d10 = 0.0d;
        while (it.hasNext()) {
            d10 += (double) ((e) it.next()).f8082a;
        }
        float f11 = (float) d10;
        RectF rectF = new RectF(width - f10, height - f10, width + f10, f10 + height);
        if (f11 <= 0.0f) {
            paint.setColor(ContextCompat.getColor(getContext(), R.color.light_grey));
            canvas2 = canvas;
            canvas2.drawArc(rectF, 0.0f, 360.0f, false, paint);
        } else {
            canvas2 = canvas;
            float f12 = -90.0f;
            for (e eVar : this.f3463a) {
                float f13 = (eVar.f8082a / f11) * 360.0f;
                paint.setColor(eVar.f8083b);
                canvas2.drawArc(rectF, f12, f13, false, paint);
                f12 += f13;
            }
        }
        int length = this.f3464b.length();
        Paint paint2 = this.f3467n;
        if (length > 0) {
            canvas2.drawText(this.f3464b, width, height - ((paint2.ascent() + paint2.descent()) / 2.0f), paint2);
        } else {
            float fAscent = height - ((paint2.ascent() + paint2.descent()) / 2.0f);
            Context context = getContext();
            context.getClass();
            canvas2.drawText(i5.H(context, 0L), width, fAscent, paint2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i6) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i6);
        int size2 = View.MeasureSpec.getSize(i6);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(240, size);
        } else if (mode != 1073741824) {
            size = 240;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(240, size2);
        } else if (mode2 != 1073741824) {
            size2 = 240;
        }
        setMeasuredDimension(size, size2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DonutChartView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ DonutChartView(Context context, AttributeSet attributeSet, int i, int i6, g gVar) {
        this(context, (i6 & 2) != 0 ? null : attributeSet, (i6 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DonutChartView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
