package e1;

import android.os.Parcel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class j0 extends com.google.android.gms.internal.measurement.x implements k0 {
    @Override // e1.k0
    public final void x(List list) {
        Parcel parcelG = G();
        parcelG.writeTypedList(list);
        I(parcelG);
    }
}
