package androidx.core.view;

import android.view.View;
import androidx.core.view.SoftwareKeyboardControllerCompat;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f392b;

    public /* synthetic */ h(Object obj, int i) {
        this.f391a = i;
        this.f392b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f391a) {
            case 0:
                SoftwareKeyboardControllerCompat.Impl20.lambda$show$0((View) this.f392b);
                break;
            default:
                ((d7.a) this.f392b).invoke();
                break;
        }
    }
}
