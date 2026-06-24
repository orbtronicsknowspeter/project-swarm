package y2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.ArrayMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class r extends l0.a {
    public static final Parcelable.Creator<r> CREATOR = new i0.l(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f11751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayMap f11752b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public j f11753l;

    public r(Bundle bundle) {
        this.f11751a = bundle;
    }

    public final Map c() {
        if (this.f11752b == null) {
            ArrayMap arrayMap = new ArrayMap();
            Bundle bundle = this.f11751a;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals(TypedValues.TransitionType.S_FROM) && !str.equals("message_type") && !str.equals("collapse_key")) {
                        arrayMap.put(str, str2);
                    }
                }
            }
            this.f11752b = arrayMap;
        }
        return this.f11752b;
    }

    public final j d() {
        if (this.f11753l == null) {
            Bundle bundle = this.f11751a;
            if (g5.f.O(bundle)) {
                this.f11753l = new j(new g5.f(bundle));
            }
        }
        return this.f11753l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iY = a.a.Y(parcel, 20293);
        a.a.Q(2, this.f11751a, parcel);
        a.a.a0(parcel, iY);
    }
}
