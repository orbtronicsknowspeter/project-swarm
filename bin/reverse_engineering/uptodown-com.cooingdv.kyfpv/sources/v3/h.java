package v3;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z3.f f10845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f10846b = new Handler(Looper.getMainLooper());

    public h(z3.f fVar) {
        this.f10845a = fVar;
    }

    @JavascriptInterface
    public final boolean sendApiChange() {
        return this.f10846b.post(new g(this, 4));
    }

    @JavascriptInterface
    public final void sendError(String str) {
        c cVar;
        str.getClass();
        if (str.equalsIgnoreCase(ExifInterface.GPS_MEASUREMENT_2D)) {
            cVar = c.f10827b;
        } else if (str.equalsIgnoreCase("5")) {
            cVar = c.f10828l;
        } else if (str.equalsIgnoreCase("100")) {
            cVar = c.f10829m;
        } else {
            cVar = (str.equalsIgnoreCase("101") || str.equalsIgnoreCase("150")) ? c.f10830n : str.equalsIgnoreCase("153") ? c.f10831o : c.f10826a;
        }
        this.f10846b.post(new androidx.browser.trusted.c(26, this, cVar));
    }

    @JavascriptInterface
    public final void sendPlaybackQualityChange(String str) {
        str.getClass();
        this.f10846b.post(new g(this, str.equalsIgnoreCase("small") ? a.f10808b : str.equalsIgnoreCase("medium") ? a.f10809l : str.equalsIgnoreCase("large") ? a.f10810m : str.equalsIgnoreCase("hd720") ? a.f10811n : str.equalsIgnoreCase("hd1080") ? a.f10812o : str.equalsIgnoreCase("highres") ? a.f10813p : str.equalsIgnoreCase("default") ? a.f10814q : a.f10807a, 1));
    }

    @JavascriptInterface
    public final void sendPlaybackRateChange(String str) {
        str.getClass();
        this.f10846b.post(new g(this, str.equalsIgnoreCase("0.25") ? b.f10817b : str.equalsIgnoreCase("0.5") ? b.f10818l : str.equalsIgnoreCase("0.75") ? b.f10819m : str.equalsIgnoreCase("1") ? b.f10820n : str.equalsIgnoreCase("1.25") ? b.f10821o : str.equalsIgnoreCase("1.5") ? b.f10822p : str.equalsIgnoreCase("1.75") ? b.f10823q : str.equalsIgnoreCase(ExifInterface.GPS_MEASUREMENT_2D) ? b.f10824r : b.f10816a, 3));
    }

    @JavascriptInterface
    public final boolean sendReady() {
        return this.f10846b.post(new g(this, 5));
    }

    @JavascriptInterface
    public final void sendStateChange(String str) {
        str.getClass();
        this.f10846b.post(new androidx.browser.trusted.c(27, this, str.equalsIgnoreCase("UNSTARTED") ? d.f10834b : str.equalsIgnoreCase("ENDED") ? d.f10835l : str.equalsIgnoreCase("PLAYING") ? d.f10836m : str.equalsIgnoreCase("PAUSED") ? d.f10837n : str.equalsIgnoreCase("BUFFERING") ? d.f10838o : str.equalsIgnoreCase("CUED") ? d.f10839p : d.f10833a));
    }

    @JavascriptInterface
    public final void sendVideoCurrentTime(String str) {
        str.getClass();
        try {
            final float f = Float.parseFloat(str);
            this.f10846b.post(new Runnable() { // from class: v3.f
                @Override // java.lang.Runnable
                public final void run() {
                    z3.f fVar = this.f10841a.f10845a;
                    Iterator<T> it = fVar.getListeners().iterator();
                    while (it.hasNext()) {
                        ((w3.a) it.next()).a(fVar.getInstance(), f);
                    }
                }
            });
        } catch (NumberFormatException e10) {
            e10.printStackTrace();
        }
    }

    @JavascriptInterface
    public final void sendVideoDuration(String str) {
        str.getClass();
        try {
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            this.f10846b.post(new g(this, Float.parseFloat(str), 2));
        } catch (NumberFormatException e10) {
            e10.printStackTrace();
        }
    }

    @JavascriptInterface
    public final boolean sendVideoId(String str) {
        str.getClass();
        return this.f10846b.post(new androidx.browser.trusted.c(25, this, str));
    }

    @JavascriptInterface
    public final void sendVideoLoadedFraction(String str) {
        str.getClass();
        try {
            this.f10846b.post(new g(this, Float.parseFloat(str), 6));
        } catch (NumberFormatException e10) {
            e10.printStackTrace();
        }
    }

    @JavascriptInterface
    public final boolean sendYouTubeIFrameAPIReady() {
        return this.f10846b.post(new g(this, 0));
    }
}
