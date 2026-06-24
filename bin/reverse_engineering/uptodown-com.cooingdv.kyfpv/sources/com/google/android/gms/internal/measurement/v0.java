package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class v0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2836a;

    public /* synthetic */ v0(int i) {
        this.f2836a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f2836a) {
            case 0:
                int iL = t0.f.L(parcel);
                Bundle bundleN = null;
                String strP = null;
                boolean zC = false;
                long jF = 0;
                long jF2 = 0;
                while (parcel.dataPosition() < iL) {
                    int i = parcel.readInt();
                    char c9 = (char) i;
                    if (c9 == 1) {
                        jF = t0.f.F(parcel, i);
                    } else if (c9 == 2) {
                        jF2 = t0.f.F(parcel, i);
                    } else if (c9 == 3) {
                        zC = t0.f.C(parcel, i);
                    } else if (c9 == 7) {
                        bundleN = t0.f.n(parcel, i);
                    } else if (c9 != '\b') {
                        t0.f.H(parcel, i);
                    } else {
                        strP = t0.f.p(parcel, i);
                    }
                }
                t0.f.t(parcel, iL);
                return new u0(jF, jF2, zC, bundleN, strP);
            default:
                int iL2 = t0.f.L(parcel);
                String strP2 = null;
                int iE = 0;
                Intent intent = null;
                while (parcel.dataPosition() < iL2) {
                    int i6 = parcel.readInt();
                    char c10 = (char) i6;
                    if (c10 == 1) {
                        iE = t0.f.E(parcel, i6);
                    } else if (c10 == 2) {
                        strP2 = t0.f.p(parcel, i6);
                    } else if (c10 != 3) {
                        t0.f.H(parcel, i6);
                    } else {
                        intent = (Intent) t0.f.o(parcel, i6, Intent.CREATOR);
                    }
                }
                t0.f.t(parcel, iL2);
                return new w0(iE, strP2, intent);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f2836a) {
            case 0:
                return new u0[i];
            default:
                return new w0[i];
        }
    }
}
