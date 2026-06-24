package t5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RenderScript f10308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScriptIntrinsicBlur f10309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Allocation f10310d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f10307a = new Paint(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10311e = -1;
    public int f = -1;

    public g(Context context) {
        RenderScript renderScriptCreate = RenderScript.create(context);
        this.f10308b = renderScriptCreate;
        this.f10309c = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
    }

    @Override // t5.a
    public final void a() {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
    }

    @Override // t5.a
    public final void b(Canvas canvas, Bitmap bitmap) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f10307a);
    }

    @Override // t5.a
    public final Bitmap c(Bitmap bitmap, float f) {
        RenderScript renderScript = this.f10308b;
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScript, bitmap);
        if (bitmap.getHeight() != this.f || bitmap.getWidth() != this.f10311e) {
            Allocation allocation = this.f10310d;
            if (allocation != null) {
                allocation.destroy();
            }
            this.f10310d = Allocation.createTyped(renderScript, allocationCreateFromBitmap.getType());
            this.f10311e = bitmap.getWidth();
            this.f = bitmap.getHeight();
        }
        ScriptIntrinsicBlur scriptIntrinsicBlur = this.f10309c;
        scriptIntrinsicBlur.setRadius(f);
        scriptIntrinsicBlur.setInput(allocationCreateFromBitmap);
        scriptIntrinsicBlur.forEach(this.f10310d);
        this.f10310d.copyTo(bitmap);
        allocationCreateFromBitmap.destroy();
        return bitmap;
    }

    @Override // t5.a
    public final void destroy() {
        this.f10309c.destroy();
        this.f10308b.destroy();
        Allocation allocation = this.f10310d;
        if (allocation != null) {
            allocation.destroy();
        }
    }
}
