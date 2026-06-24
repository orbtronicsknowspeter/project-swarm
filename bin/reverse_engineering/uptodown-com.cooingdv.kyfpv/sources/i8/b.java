package i8;

import android.text.Editable;
import android.text.style.BulletSpan;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BulletSpan f5705a = new BulletSpan(10);

    public void a(Editable editable) {
        if (editable.length() > 0 && editable.charAt(editable.length() - 1) != '\n') {
            editable.append("\n");
        }
        editable.setSpan(this, editable.length(), editable.length(), 17);
    }

    public abstract Object[] b(int i);
}
