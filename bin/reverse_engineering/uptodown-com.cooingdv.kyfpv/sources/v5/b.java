package v5;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.l;
import p9.g;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Parcelable {
    public static final a CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10853a;

    public b(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 33) {
            parcel.readList(arrayList, g.class.getClassLoader(), g.class);
        } else {
            parcel.readList(arrayList, g.class.getClassLoader());
        }
        this.f10853a = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && l.a(this.f10853a, ((b) obj).f10853a);
    }

    public final int hashCode() {
        return this.f10853a.hashCode();
    }

    public final String toString() {
        return "PartnersDisclosureArgs(disclosures=" + this.f10853a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeList(new ArrayList());
    }

    public b(ArrayList arrayList) {
        arrayList.getClass();
        this.f10853a = arrayList;
    }
}
