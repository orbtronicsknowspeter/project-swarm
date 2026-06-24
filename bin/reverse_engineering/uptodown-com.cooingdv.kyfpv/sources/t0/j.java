package t0;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.x;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends x {
    public final s0.a J(s0.b bVar, String str, int i, s0.b bVar2) {
        Parcel parcelG = G();
        z0.g.b(parcelG, bVar);
        parcelG.writeString(str);
        parcelG.writeInt(i);
        z0.g.b(parcelG, bVar2);
        Parcel parcelC = c(parcelG, 2);
        s0.a aVarI = s0.b.I(parcelC.readStrongBinder());
        parcelC.recycle();
        return aVarI;
    }

    public final s0.a K(s0.b bVar, String str, int i, s0.b bVar2) {
        Parcel parcelG = G();
        z0.g.b(parcelG, bVar);
        parcelG.writeString(str);
        parcelG.writeInt(i);
        z0.g.b(parcelG, bVar2);
        Parcel parcelC = c(parcelG, 3);
        s0.a aVarI = s0.b.I(parcelC.readStrongBinder());
        parcelC.recycle();
        return aVarI;
    }
}
