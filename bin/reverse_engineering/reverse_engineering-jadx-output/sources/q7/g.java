package q7;

import androidx.leanback.media.MediaPlayerGlue;
import f8.w;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f8753a = new m(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f8754b = t7.a.j(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f8755c = t7.a.j(MediaPlayerGlue.FAST_FORWARD_REWIND_STEP, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w f8756d = new w("BUFFERED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final w f8757e = new w("SHOULD_BUFFER");
    public static final w f = new w("S_RESUMING_BY_RCV");
    public static final w g = new w("RESUMING_BY_EB");
    public static final w h = new w("POISONED");
    public static final w i = new w("DONE_RCV");
    public static final w j = new w("INTERRUPTED_SEND");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final w f8758k = new w("INTERRUPTED_RCV");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final w f8759l = new w("CHANNEL_CLOSED");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final w f8760m = new w("SUSPEND");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final w f8761n = new w("SUSPEND_NO_WAITER");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final w f8762o = new w("FAILED");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final w f8763p = new w("NO_RECEIVE_RESULT");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final w f8764q = new w("CLOSE_HANDLER_CLOSED");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final w f8765r = new w("CLOSE_HANDLER_INVOKED");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final w f8766s = new w("NO_CLOSE_CAUSE");

    public static final boolean a(o7.j jVar, Object obj, d7.q qVar) {
        w wVarI = jVar.i(obj, qVar);
        if (wVarI == null) {
            return false;
        }
        jVar.q(wVarI);
        return true;
    }
}
