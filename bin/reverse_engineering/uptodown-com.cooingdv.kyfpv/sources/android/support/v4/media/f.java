package android.support.v4.media;

import android.app.PendingIntent;
import android.content.Intent;
import android.media.MediaDescription;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.api.Scope;
import e1.c5;
import e1.j4;
import e1.m4;
import e1.n4;
import e1.o4;
import e1.t;
import e1.u;
import e1.x4;
import h0.q;
import java.util.ArrayList;
import k0.s;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f245a;

    public /* synthetic */ f(int i) {
        this.f245a = i;
    }

    public static void a(u uVar, Parcel parcel, int i) {
        String str = uVar.f4290a;
        int iY = a.a.Y(parcel, 20293);
        a.a.T(parcel, 2, str);
        a.a.S(parcel, 3, uVar.f4291b, i);
        a.a.T(parcel, 4, uVar.f4292l);
        long j = uVar.f4293m;
        a.a.X(parcel, 5, 8);
        parcel.writeLong(j);
        a.a.a0(parcel, iY);
    }

    public static void b(x4 x4Var, Parcel parcel) {
        int i = x4Var.f4402a;
        int iY = a.a.Y(parcel, 20293);
        a.a.X(parcel, 1, 4);
        parcel.writeInt(i);
        a.a.T(parcel, 2, x4Var.f4403b);
        long j = x4Var.f4404l;
        a.a.X(parcel, 3, 8);
        parcel.writeLong(j);
        Long l10 = x4Var.f4405m;
        if (l10 != null) {
            a.a.X(parcel, 4, 8);
            parcel.writeLong(l10.longValue());
        }
        a.a.T(parcel, 6, x4Var.f4406n);
        a.a.T(parcel, 7, x4Var.f4407o);
        Double d10 = x4Var.f4408p;
        if (d10 != null) {
            a.a.X(parcel, 8, 8);
            parcel.writeDouble(d10.doubleValue());
        }
        a.a.a0(parcel, iY);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        long jF = 0;
        int iE = 0;
        e.b bVar = null;
        String strP = null;
        h0.b bVar2 = null;
        Intent intent = null;
        String strP2 = null;
        Bundle bundleN = null;
        ArrayList arrayListR = null;
        String strP3 = null;
        Bundle bundleN2 = null;
        Bundle bundleN3 = null;
        switch (this.f245a) {
            case 0:
                return new MediaBrowserCompat$MediaItem(parcel);
            case 1:
                return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
            case 2:
                return new MediaMetadataCompat(parcel);
            case 3:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 4:
                return new MediaSessionCompat$QueueItem(parcel);
            case 5:
                MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper = new MediaSessionCompat$ResultReceiverWrapper();
                mediaSessionCompat$ResultReceiverWrapper.f256a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return mediaSessionCompat$ResultReceiverWrapper;
            case 6:
                return new MediaSessionCompat$Token(parcel.readParcelable(null), null);
            case 7:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.f259a = parcel.readInt();
                parcelableVolumeInfo.f261l = parcel.readInt();
                parcelableVolumeInfo.f262m = parcel.readInt();
                parcelableVolumeInfo.f263n = parcel.readInt();
                parcelableVolumeInfo.f260b = parcel.readInt();
                return parcelableVolumeInfo;
            case 8:
                return new PlaybackStateCompat(parcel);
            case 9:
                e.d dVar = new e.d();
                IBinder strongBinder = parcel.readStrongBinder();
                int i = e.c.j;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(e.b.h);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof e.b)) {
                        e.a aVar = new e.a();
                        aVar.i = strongBinder;
                        bVar = aVar;
                    } else {
                        bVar = (e.b) iInterfaceQueryLocalInterface;
                    }
                }
                dVar.f3728a = bVar;
                return dVar;
            case 10:
                int iL = t0.f.L(parcel);
                long jF2 = 0;
                long jF3 = 0;
                int iE2 = 0;
                while (parcel.dataPosition() < iL) {
                    int i6 = parcel.readInt();
                    char c9 = (char) i6;
                    if (c9 == 1) {
                        jF2 = t0.f.F(parcel, i6);
                    } else if (c9 == 2) {
                        iE2 = t0.f.E(parcel, i6);
                    } else if (c9 != 3) {
                        t0.f.H(parcel, i6);
                    } else {
                        jF3 = t0.f.F(parcel, i6);
                    }
                }
                t0.f.t(parcel, iL);
                return new e1.d(iE2, jF2, jF3);
            case 11:
                int iL2 = t0.f.L(parcel);
                long jF4 = 0;
                long jF5 = 0;
                long jF6 = 0;
                boolean zC = false;
                String strP4 = null;
                String strP5 = null;
                x4 x4Var = null;
                String strP6 = null;
                u uVar = null;
                u uVar2 = null;
                u uVar3 = null;
                while (parcel.dataPosition() < iL2) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 2:
                            strP4 = t0.f.p(parcel, i10);
                            break;
                        case 3:
                            strP5 = t0.f.p(parcel, i10);
                            break;
                        case 4:
                            x4Var = (x4) t0.f.o(parcel, i10, x4.CREATOR);
                            break;
                        case 5:
                            jF4 = t0.f.F(parcel, i10);
                            break;
                        case 6:
                            zC = t0.f.C(parcel, i10);
                            break;
                        case 7:
                            strP6 = t0.f.p(parcel, i10);
                            break;
                        case '\b':
                            uVar = (u) t0.f.o(parcel, i10, u.CREATOR);
                            break;
                        case '\t':
                            jF5 = t0.f.F(parcel, i10);
                            break;
                        case '\n':
                            uVar2 = (u) t0.f.o(parcel, i10, u.CREATOR);
                            break;
                        case 11:
                            jF6 = t0.f.F(parcel, i10);
                            break;
                        case '\f':
                            uVar3 = (u) t0.f.o(parcel, i10, u.CREATOR);
                            break;
                        default:
                            t0.f.H(parcel, i10);
                            break;
                    }
                }
                t0.f.t(parcel, iL2);
                return new e1.e(strP4, strP5, x4Var, jF4, zC, strP6, uVar, jF5, uVar2, jF6, uVar3);
            case 12:
                int iL3 = t0.f.L(parcel);
                while (parcel.dataPosition() < iL3) {
                    int i11 = parcel.readInt();
                    if (((char) i11) != 1) {
                        t0.f.H(parcel, i11);
                    } else {
                        bundleN3 = t0.f.n(parcel, i11);
                    }
                }
                t0.f.t(parcel, iL3);
                return new e1.i(bundleN3);
            case 13:
                int iL4 = t0.f.L(parcel);
                while (parcel.dataPosition() < iL4) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 2) {
                        t0.f.H(parcel, i12);
                    } else {
                        bundleN2 = t0.f.n(parcel, i12);
                    }
                }
                t0.f.t(parcel, iL4);
                return new t(bundleN2);
            case 14:
                int iL5 = t0.f.L(parcel);
                long jF7 = 0;
                String strP7 = null;
                t tVar = null;
                String strP8 = null;
                while (parcel.dataPosition() < iL5) {
                    int i13 = parcel.readInt();
                    char c10 = (char) i13;
                    if (c10 == 2) {
                        strP7 = t0.f.p(parcel, i13);
                    } else if (c10 == 3) {
                        tVar = (t) t0.f.o(parcel, i13, t.CREATOR);
                    } else if (c10 == 4) {
                        strP8 = t0.f.p(parcel, i13);
                    } else if (c10 != 5) {
                        t0.f.H(parcel, i13);
                    } else {
                        jF7 = t0.f.F(parcel, i13);
                    }
                }
                t0.f.t(parcel, iL5);
                return new u(strP7, tVar, strP8, jF7);
            case 15:
                int iL6 = t0.f.L(parcel);
                while (parcel.dataPosition() < iL6) {
                    int i14 = parcel.readInt();
                    char c11 = (char) i14;
                    if (c11 == 1) {
                        strP3 = t0.f.p(parcel, i14);
                    } else if (c11 == 2) {
                        jF = t0.f.F(parcel, i14);
                    } else if (c11 != 3) {
                        t0.f.H(parcel, i14);
                    } else {
                        iE = t0.f.E(parcel, i14);
                    }
                }
                t0.f.t(parcel, iL6);
                return new j4(strP3, iE, jF);
            case 16:
                int iL7 = t0.f.L(parcel);
                long jF8 = 0;
                long jF9 = 0;
                int iE3 = 0;
                byte[] bArr = null;
                String strP9 = null;
                Bundle bundleN4 = null;
                String strP10 = null;
                while (parcel.dataPosition() < iL7) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 1:
                            jF8 = t0.f.F(parcel, i15);
                            break;
                        case 2:
                            int iG = t0.f.G(parcel, i15);
                            int iDataPosition = parcel.dataPosition();
                            if (iG == 0) {
                                bArr = null;
                            } else {
                                byte[] bArrCreateByteArray = parcel.createByteArray();
                                parcel.setDataPosition(iDataPosition + iG);
                                bArr = bArrCreateByteArray;
                            }
                            break;
                        case 3:
                            strP9 = t0.f.p(parcel, i15);
                            break;
                        case 4:
                            bundleN4 = t0.f.n(parcel, i15);
                            break;
                        case 5:
                            iE3 = t0.f.E(parcel, i15);
                            break;
                        case 6:
                            jF9 = t0.f.F(parcel, i15);
                            break;
                        case 7:
                            strP10 = t0.f.p(parcel, i15);
                            break;
                        default:
                            t0.f.H(parcel, i15);
                            break;
                    }
                }
                t0.f.t(parcel, iL7);
                return new m4(jF8, bArr, strP9, bundleN4, iE3, jF9, strP10);
            case 17:
                int iL8 = t0.f.L(parcel);
                while (true) {
                    ArrayList arrayList = null;
                    while (parcel.dataPosition() < iL8) {
                        int i16 = parcel.readInt();
                        if (((char) i16) != 1) {
                            t0.f.H(parcel, i16);
                        } else {
                            int iG2 = t0.f.G(parcel, i16);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iG2 == 0) {
                            }
                            ArrayList arrayList2 = new ArrayList();
                            int i17 = parcel.readInt();
                            for (int i18 = 0; i18 < i17; i18++) {
                                arrayList2.add(Integer.valueOf(parcel.readInt()));
                            }
                            parcel.setDataPosition(iDataPosition2 + iG2);
                            arrayList = arrayList2;
                        }
                        break;
                    }
                    t0.f.t(parcel, iL8);
                    return new n4(arrayList);
                }
                break;
            case 18:
                int iL9 = t0.f.L(parcel);
                while (parcel.dataPosition() < iL9) {
                    int i19 = parcel.readInt();
                    if (((char) i19) != 1) {
                        t0.f.H(parcel, i19);
                    } else {
                        arrayListR = t0.f.r(parcel, i19, m4.CREATOR);
                    }
                }
                t0.f.t(parcel, iL9);
                return new o4(arrayListR);
            case 19:
                int iL10 = t0.f.L(parcel);
                long jF10 = 0;
                int iE4 = 0;
                String strP11 = null;
                Long lValueOf = null;
                Float fValueOf = null;
                String strP12 = null;
                String strP13 = null;
                Double dValueOf = null;
                while (parcel.dataPosition() < iL10) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 1:
                            iE4 = t0.f.E(parcel, i20);
                            break;
                        case 2:
                            strP11 = t0.f.p(parcel, i20);
                            break;
                        case 3:
                            jF10 = t0.f.F(parcel, i20);
                            break;
                        case 4:
                            int iG3 = t0.f.G(parcel, i20);
                            if (iG3 == 0) {
                                lValueOf = null;
                            } else {
                                t0.f.R(parcel, iG3, 8);
                                lValueOf = Long.valueOf(parcel.readLong());
                            }
                            break;
                        case 5:
                            int iG4 = t0.f.G(parcel, i20);
                            if (iG4 == 0) {
                                fValueOf = null;
                            } else {
                                t0.f.R(parcel, iG4, 4);
                                fValueOf = Float.valueOf(parcel.readFloat());
                            }
                            break;
                        case 6:
                            strP12 = t0.f.p(parcel, i20);
                            break;
                        case 7:
                            strP13 = t0.f.p(parcel, i20);
                            break;
                        case '\b':
                            int iG5 = t0.f.G(parcel, i20);
                            if (iG5 == 0) {
                                dValueOf = null;
                            } else {
                                t0.f.R(parcel, iG5, 8);
                                dValueOf = Double.valueOf(parcel.readDouble());
                            }
                            break;
                        default:
                            t0.f.H(parcel, i20);
                            break;
                    }
                }
                t0.f.t(parcel, iL10);
                return new x4(iE4, strP11, jF10, lValueOf, fValueOf, strP12, strP13, dValueOf);
            case 20:
                int iL11 = t0.f.L(parcel);
                String strP14 = "";
                String strP15 = strP14;
                String strP16 = strP15;
                String strP17 = strP16;
                int iE5 = 100;
                long jF11 = 0;
                long jF12 = 0;
                long jF13 = 0;
                long jF14 = 0;
                long jF15 = 0;
                long jF16 = 0;
                long jF17 = 0;
                long jF18 = -2147483648L;
                boolean zC2 = true;
                boolean zC3 = true;
                boolean zC4 = false;
                int iE6 = 0;
                boolean zC5 = false;
                boolean zC6 = false;
                int iE7 = 0;
                int iE8 = 0;
                String strP18 = null;
                String strP19 = null;
                String strP20 = null;
                String strP21 = null;
                String strP22 = null;
                String strP23 = null;
                Boolean boolValueOf = null;
                ArrayList<String> arrayList3 = null;
                String strP24 = null;
                String strP25 = null;
                while (parcel.dataPosition() < iL11) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 2:
                            strP18 = t0.f.p(parcel, i21);
                            break;
                        case 3:
                            strP19 = t0.f.p(parcel, i21);
                            break;
                        case 4:
                            strP20 = t0.f.p(parcel, i21);
                            break;
                        case 5:
                            strP21 = t0.f.p(parcel, i21);
                            break;
                        case 6:
                            jF11 = t0.f.F(parcel, i21);
                            break;
                        case 7:
                            jF12 = t0.f.F(parcel, i21);
                            break;
                        case '\b':
                            strP22 = t0.f.p(parcel, i21);
                            break;
                        case '\t':
                            zC2 = t0.f.C(parcel, i21);
                            break;
                        case '\n':
                            zC4 = t0.f.C(parcel, i21);
                            break;
                        case 11:
                            jF18 = t0.f.F(parcel, i21);
                            break;
                        case '\f':
                            strP23 = t0.f.p(parcel, i21);
                            break;
                        case '\r':
                        case 17:
                        case 19:
                        case 20:
                        case 24:
                        case '!':
                        default:
                            t0.f.H(parcel, i21);
                            break;
                        case 14:
                            jF13 = t0.f.F(parcel, i21);
                            break;
                        case 15:
                            iE6 = t0.f.E(parcel, i21);
                            break;
                        case 16:
                            zC3 = t0.f.C(parcel, i21);
                            break;
                        case 18:
                            zC5 = t0.f.C(parcel, i21);
                            break;
                        case 21:
                            int iG6 = t0.f.G(parcel, i21);
                            if (iG6 == 0) {
                                boolValueOf = null;
                            } else {
                                t0.f.R(parcel, iG6, 4);
                                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                            }
                            break;
                        case 22:
                            jF14 = t0.f.F(parcel, i21);
                            break;
                        case 23:
                            int iG7 = t0.f.G(parcel, i21);
                            int iDataPosition3 = parcel.dataPosition();
                            if (iG7 == 0) {
                                arrayList3 = null;
                            } else {
                                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                                parcel.setDataPosition(iDataPosition3 + iG7);
                                arrayList3 = arrayListCreateStringArrayList;
                            }
                            break;
                        case 25:
                            strP14 = t0.f.p(parcel, i21);
                            break;
                        case 26:
                            strP15 = t0.f.p(parcel, i21);
                            break;
                        case 27:
                            strP24 = t0.f.p(parcel, i21);
                            break;
                        case 28:
                            zC6 = t0.f.C(parcel, i21);
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                            jF15 = t0.f.F(parcel, i21);
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_BIAS /* 30 */:
                            iE5 = t0.f.E(parcel, i21);
                            break;
                        case 31:
                            strP16 = t0.f.p(parcel, i21);
                            break;
                        case ' ':
                            iE7 = t0.f.E(parcel, i21);
                            break;
                        case '\"':
                            jF16 = t0.f.F(parcel, i21);
                            break;
                        case '#':
                            strP25 = t0.f.p(parcel, i21);
                            break;
                        case '$':
                            strP17 = t0.f.p(parcel, i21);
                            break;
                        case '%':
                            jF17 = t0.f.F(parcel, i21);
                            break;
                        case '&':
                            iE8 = t0.f.E(parcel, i21);
                            break;
                    }
                }
                t0.f.t(parcel, iL11);
                return new c5(strP18, strP19, strP20, strP21, jF11, jF12, strP22, zC2, zC4, jF18, strP23, jF13, iE6, zC3, zC5, boolValueOf, jF14, arrayList3, strP14, strP15, strP24, zC6, jF15, iE5, strP16, iE7, jF16, strP25, strP17, jF17, iE8);
            case 21:
                int iL12 = t0.f.L(parcel);
                int iE9 = 0;
                while (parcel.dataPosition() < iL12) {
                    int i22 = parcel.readInt();
                    char c12 = (char) i22;
                    if (c12 == 1) {
                        iE = t0.f.E(parcel, i22);
                    } else if (c12 == 2) {
                        iE9 = t0.f.E(parcel, i22);
                    } else if (c12 != 3) {
                        t0.f.H(parcel, i22);
                    } else {
                        bundleN = t0.f.n(parcel, i22);
                    }
                }
                t0.f.t(parcel, iL12);
                return new f0.a(iE, iE9, bundleN);
            case 22:
                int iL13 = t0.f.L(parcel);
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < iL13) {
                    int i23 = parcel.readInt();
                    char c13 = (char) i23;
                    if (c13 == 2) {
                        strP2 = t0.f.p(parcel, i23);
                    } else if (c13 != 5) {
                        t0.f.H(parcel, i23);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) t0.f.o(parcel, i23, GoogleSignInOptions.CREATOR);
                    }
                }
                t0.f.t(parcel, iL13);
                return new SignInConfiguration(strP2, googleSignInOptions);
            case 23:
                int iL14 = t0.f.L(parcel);
                int iE10 = 0;
                int iE11 = 0;
                PendingIntent pendingIntent = null;
                String strP26 = null;
                Integer numValueOf = null;
                while (parcel.dataPosition() < iL14) {
                    int i24 = parcel.readInt();
                    char c14 = (char) i24;
                    if (c14 == 1) {
                        iE10 = t0.f.E(parcel, i24);
                    } else if (c14 == 2) {
                        iE11 = t0.f.E(parcel, i24);
                    } else if (c14 == 3) {
                        pendingIntent = (PendingIntent) t0.f.o(parcel, i24, PendingIntent.CREATOR);
                    } else if (c14 == 4) {
                        strP26 = t0.f.p(parcel, i24);
                    } else if (c14 != 5) {
                        t0.f.H(parcel, i24);
                    } else {
                        int iG8 = t0.f.G(parcel, i24);
                        if (iG8 == 0) {
                            numValueOf = null;
                        } else {
                            t0.f.R(parcel, iG8, 4);
                            numValueOf = Integer.valueOf(parcel.readInt());
                        }
                    }
                }
                t0.f.t(parcel, iL14);
                return new h0.b(iE10, iE11, pendingIntent, strP26, numValueOf);
            case 24:
                int iL15 = t0.f.L(parcel);
                long jF19 = -1;
                int iE12 = 0;
                boolean zC7 = false;
                String strP27 = null;
                while (parcel.dataPosition() < iL15) {
                    int i25 = parcel.readInt();
                    char c15 = (char) i25;
                    if (c15 == 1) {
                        strP27 = t0.f.p(parcel, i25);
                    } else if (c15 == 2) {
                        iE12 = t0.f.E(parcel, i25);
                    } else if (c15 == 3) {
                        jF19 = t0.f.F(parcel, i25);
                    } else if (c15 != 4) {
                        t0.f.H(parcel, i25);
                    } else {
                        zC7 = t0.f.C(parcel, i25);
                    }
                }
                t0.f.t(parcel, iL15);
                return new h0.d(strP27, iE12, jF19, zC7);
            case 25:
                int iL16 = t0.f.L(parcel);
                long jF20 = -1;
                boolean zC8 = false;
                int iE13 = 0;
                int iE14 = 0;
                String strP28 = null;
                while (parcel.dataPosition() < iL16) {
                    int i26 = parcel.readInt();
                    char c16 = (char) i26;
                    if (c16 == 1) {
                        zC8 = t0.f.C(parcel, i26);
                    } else if (c16 == 2) {
                        strP28 = t0.f.p(parcel, i26);
                    } else if (c16 == 3) {
                        iE13 = t0.f.E(parcel, i26);
                    } else if (c16 == 4) {
                        iE14 = t0.f.E(parcel, i26);
                    } else if (c16 != 5) {
                        t0.f.H(parcel, i26);
                    } else {
                        jF20 = t0.f.F(parcel, i26);
                    }
                }
                t0.f.t(parcel, iL16);
                return new q(zC8, strP28, iE13, iE14, jF20);
            case 26:
                int iL17 = t0.f.L(parcel);
                int iE15 = 0;
                while (parcel.dataPosition() < iL17) {
                    int i27 = parcel.readInt();
                    char c17 = (char) i27;
                    if (c17 == 1) {
                        iE = t0.f.E(parcel, i27);
                    } else if (c17 == 2) {
                        iE15 = t0.f.E(parcel, i27);
                    } else if (c17 != 3) {
                        t0.f.H(parcel, i27);
                    } else {
                        intent = (Intent) t0.f.o(parcel, i27, Intent.CREATOR);
                    }
                }
                t0.f.t(parcel, iL17);
                return new h1.b(iE, iE15, intent);
            case 27:
                int iL18 = t0.f.L(parcel);
                ArrayList<String> arrayList4 = null;
                String strP29 = null;
                while (parcel.dataPosition() < iL18) {
                    int i28 = parcel.readInt();
                    char c18 = (char) i28;
                    if (c18 == 1) {
                        int iG9 = t0.f.G(parcel, i28);
                        int iDataPosition4 = parcel.dataPosition();
                        if (iG9 == 0) {
                            arrayList4 = null;
                        } else {
                            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                            parcel.setDataPosition(iDataPosition4 + iG9);
                            arrayList4 = arrayListCreateStringArrayList2;
                        }
                    } else if (c18 != 2) {
                        t0.f.H(parcel, i28);
                    } else {
                        strP29 = t0.f.p(parcel, i28);
                    }
                }
                t0.f.t(parcel, iL18);
                return new h1.d(strP29, arrayList4);
            case 28:
                int iL19 = t0.f.L(parcel);
                s sVar = null;
                while (parcel.dataPosition() < iL19) {
                    int i29 = parcel.readInt();
                    char c19 = (char) i29;
                    if (c19 == 1) {
                        iE = t0.f.E(parcel, i29);
                    } else if (c19 == 2) {
                        bVar2 = (h0.b) t0.f.o(parcel, i29, h0.b.CREATOR);
                    } else if (c19 != 3) {
                        t0.f.H(parcel, i29);
                    } else {
                        sVar = (s) t0.f.o(parcel, i29, s.CREATOR);
                    }
                }
                t0.f.t(parcel, iL19);
                return new h1.e(iE, bVar2, sVar);
            default:
                int iL20 = t0.f.L(parcel);
                while (parcel.dataPosition() < iL20) {
                    int i30 = parcel.readInt();
                    char c20 = (char) i30;
                    if (c20 == 1) {
                        iE = t0.f.E(parcel, i30);
                    } else if (c20 != 2) {
                        t0.f.H(parcel, i30);
                    } else {
                        strP = t0.f.p(parcel, i30);
                    }
                }
                t0.f.t(parcel, iL20);
                return new Scope(iE, strP);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f245a) {
            case 0:
                return new MediaBrowserCompat$MediaItem[i];
            case 1:
                return new MediaDescriptionCompat[i];
            case 2:
                return new MediaMetadataCompat[i];
            case 3:
                return new RatingCompat[i];
            case 4:
                return new MediaSessionCompat$QueueItem[i];
            case 5:
                return new MediaSessionCompat$ResultReceiverWrapper[i];
            case 6:
                return new MediaSessionCompat$Token[i];
            case 7:
                return new ParcelableVolumeInfo[i];
            case 8:
                return new PlaybackStateCompat[i];
            case 9:
                return new e.d[i];
            case 10:
                return new e1.d[i];
            case 11:
                return new e1.e[i];
            case 12:
                return new e1.i[i];
            case 13:
                return new t[i];
            case 14:
                return new u[i];
            case 15:
                return new j4[i];
            case 16:
                return new m4[i];
            case 17:
                return new n4[i];
            case 18:
                return new o4[i];
            case 19:
                return new x4[i];
            case 20:
                return new c5[i];
            case 21:
                return new f0.a[i];
            case 22:
                return new SignInConfiguration[i];
            case 23:
                return new h0.b[i];
            case 24:
                return new h0.d[i];
            case 25:
                return new q[i];
            case 26:
                return new h1.b[i];
            case 27:
                return new h1.d[i];
            case 28:
                return new h1.e[i];
            default:
                return new Scope[i];
        }
    }
}
