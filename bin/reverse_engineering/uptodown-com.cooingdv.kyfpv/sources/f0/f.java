package f0;

import android.os.IInterface;
import android.os.Parcel;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.location.LocationRequestCompat;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends w0.b implements IInterface {
    public final /* synthetic */ int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g f4807k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, int i) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 0);
        this.j = i;
        this.f4807k = gVar;
    }

    @Override // w0.b
    public final boolean G(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case TypedValues.TYPE_TARGET /* 101 */:
                w0.c.b(parcel);
                com.google.gson.internal.a.q();
                return false;
            case LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY /* 102 */:
                Status status = (Status) w0.c.a(parcel, Status.CREATOR);
                w0.c.b(parcel);
                switch (this.j) {
                    case 0:
                        this.f4807k.e(status);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
                break;
            case 103:
                Status status2 = (Status) w0.c.a(parcel, Status.CREATOR);
                w0.c.b(parcel);
                switch (this.j) {
                    case 1:
                        this.f4807k.e(status2);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
