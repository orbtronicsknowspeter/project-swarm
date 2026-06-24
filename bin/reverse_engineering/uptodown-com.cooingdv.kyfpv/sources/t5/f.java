package t5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import androidx.core.view.o;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10304c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f10306e;
    public Context f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RenderNode f10302a = o.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f10305d = 1.0f;

    @Override // t5.a
    public final void a() {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
    }

    @Override // t5.a
    public final void b(Canvas canvas, Bitmap bitmap) {
        if (canvas.isHardwareAccelerated()) {
            canvas.drawRenderNode(this.f10302a);
            return;
        }
        if (this.f10306e == null) {
            this.f10306e = new g(this.f);
        }
        this.f10306e.c(bitmap, this.f10305d);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f10306e.f10307a);
    }

    @Override // t5.a
    public final Bitmap c(Bitmap bitmap, float f) {
        this.f10305d = f;
        if (bitmap.getHeight() != this.f10303b || bitmap.getWidth() != this.f10304c) {
            this.f10303b = bitmap.getHeight();
            int width = bitmap.getWidth();
            this.f10304c = width;
            this.f10302a.setPosition(0, 0, width, this.f10303b);
        }
        this.f10302a.beginRecording().drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        this.f10302a.endRecording();
        this.f10302a.setRenderEffect(RenderEffect.createBlurEffect(f, f, Shader.TileMode.MIRROR));
        return bitmap;
    }

    @Override // t5.a
    public final void destroy() {
        this.f10302a.discardDisplayList();
        g gVar = this.f10306e;
        if (gVar != null) {
            gVar.destroy();
        }
    }
}
