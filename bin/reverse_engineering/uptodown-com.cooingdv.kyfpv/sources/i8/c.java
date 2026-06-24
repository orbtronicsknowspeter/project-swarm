package i8;

import android.text.Editable;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5706b;

    @Override // i8.b
    public final void a(Editable editable) {
        if (editable.length() > 0 && editable.charAt(editable.length() - 1) != '\n') {
            editable.append("\n");
        }
        editable.setSpan(this, editable.length(), editable.length(), 17);
        int i = this.f5706b;
        this.f5706b = i + 1;
        editable.append((CharSequence) String.valueOf(i)).append(". ");
    }

    @Override // i8.b
    public final Object[] b(int i) {
        int i6 = (i - 1) * 20;
        if (i > 2) {
            i6 -= (i - 2) * 20;
        }
        return new Object[]{new LeadingMarginSpan.Standard(i6)};
    }
}
