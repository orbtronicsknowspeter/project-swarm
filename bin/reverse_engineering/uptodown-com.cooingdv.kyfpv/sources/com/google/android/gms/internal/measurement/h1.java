package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class h1 extends y implements r0 {
    public final q1.c i;

    public h1(q1.c cVar) {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        this.i = cVar;
    }

    @Override // com.google.android.gms.internal.measurement.y
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int iIdentityHashCode = System.identityHashCode(this.i);
            parcel2.writeNoException();
            parcel2.writeInt(iIdentityHashCode);
            return true;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        Bundle bundle = (Bundle) z.a(parcel, Bundle.CREATOR);
        long j = parcel.readLong();
        z.d(parcel);
        k(j, bundle, string, string2);
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.r0
    public final int b() {
        return System.identityHashCode(this.i);
    }

    @Override // com.google.android.gms.internal.measurement.r0
    public final void k(long j, Bundle bundle, String str, String str2) {
        this.i.a(j, bundle, str, str2);
    }
}
