package com.uptodown.util.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.g;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class UsernameTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f3452s = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ValueAnimator f3453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f3454b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f3455l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Integer f3456m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f3457n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f3458o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f3459p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f3460q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Handler f3461r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsernameTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.f3461r = new Handler(Looper.getMainLooper());
        this.f3456m = Integer.valueOf(getCurrentTextColor());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r2 = this;
            android.text.TextPaint r0 = r2.getPaint()
            r1 = 0
            r0.setShader(r1)
            java.lang.String r0 = r2.f3460q
            if (r0 == 0) goto L52
            int r1 = r0.hashCode()
            switch(r1) {
                case 110843959: goto L3e;
                case 110843960: goto L29;
                case 110843961: goto L14;
                default: goto L13;
            }
        L13:
            goto L52
        L14:
            java.lang.String r1 = "type3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1d
            goto L52
        L1d:
            android.content.Context r0 = r2.getContext()
            r1 = 2131100810(0x7f06048a, float:1.7814012E38)
            int r0 = androidx.core.content.ContextCompat.getColor(r0, r1)
            goto L5d
        L29:
            java.lang.String r1 = "type2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L32
            goto L52
        L32:
            android.content.Context r0 = r2.getContext()
            r1 = 2131100808(0x7f060488, float:1.7814008E38)
            int r0 = androidx.core.content.ContextCompat.getColor(r0, r1)
            goto L5d
        L3e:
            java.lang.String r1 = "type1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L52
            android.content.Context r0 = r2.getContext()
            r1 = 2131100806(0x7f060486, float:1.7814004E38)
            int r0 = androidx.core.content.ContextCompat.getColor(r0, r1)
            goto L5d
        L52:
            android.content.Context r0 = r2.getContext()
            r1 = 2131100790(0x7f060476, float:1.7813971E38)
            int r0 = androidx.core.content.ContextCompat.getColor(r0, r1)
        L5d:
            r2.setTextColor(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.util.views.UsernameTextView.a():void");
    }

    public final Handler getAnimationHandler() {
        return this.f3461r;
    }

    public final String getUsernameFormat() {
        return this.f3460q;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        if (this.f3455l != null) {
            ValueAnimator valueAnimator = this.f3453a;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                a();
            } else {
                float width = getWidth();
                int[] iArr = this.f3455l;
                iArr.getClass();
                float f = this.f3454b;
                getPaint().setShader(new LinearGradient(0.0f, 0.0f, width, 0.0f, iArr, new float[]{0.0f, f, f, f, 1.0f}, Shader.TileMode.CLAMP));
            }
        } else {
            Integer num = this.f3456m;
            if (num != null) {
                num.getClass();
                setTextColor(num.intValue());
            }
        }
        super.onDraw(canvas);
    }

    public final void setAnimationHandler(Handler handler) {
        this.f3461r = handler;
    }

    public final void setTurbo(boolean z9) {
        this.f3459p = z9;
    }

    public final void setUsernameFormat(String str) {
        this.f3460q = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UsernameTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ UsernameTextView(Context context, AttributeSet attributeSet, int i, int i6, g gVar) {
        this(context, (i6 & 2) != 0 ? null : attributeSet, (i6 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UsernameTextView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
