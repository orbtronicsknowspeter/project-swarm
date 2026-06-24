package i0;

import android.accounts.Account;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import k0.g0;
import k0.m;
import k0.n;
import k0.r;
import k0.s;
import x4.b3;
import x4.d1;
import x4.d2;
import x4.d3;
import x4.j0;
import x4.k0;
import x4.k2;
import x4.l2;
import x4.q2;
import x4.t1;
import x4.w2;
import x4.x2;
import x4.y1;
import x4.z2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5623a;

    public /* synthetic */ l(int i) {
        this.f5623a = i;
    }

    public static void a(k0.g gVar, Parcel parcel, int i) {
        int iY = a.a.Y(parcel, 20293);
        int i6 = gVar.f6864a;
        a.a.X(parcel, 1, 4);
        parcel.writeInt(i6);
        int i10 = gVar.f6865b;
        a.a.X(parcel, 2, 4);
        parcel.writeInt(i10);
        int i11 = gVar.f6866l;
        a.a.X(parcel, 3, 4);
        parcel.writeInt(i11);
        a.a.T(parcel, 4, gVar.f6867m);
        a.a.R(parcel, 5, gVar.f6868n);
        a.a.U(parcel, 6, gVar.f6869o, i);
        a.a.Q(7, gVar.f6870p, parcel);
        a.a.S(parcel, 8, gVar.f6871q, i);
        a.a.U(parcel, 10, gVar.f6872r, i);
        a.a.U(parcel, 11, gVar.f6873s, i);
        boolean z9 = gVar.f6874t;
        a.a.X(parcel, 12, 4);
        parcel.writeInt(z9 ? 1 : 0);
        int i12 = gVar.f6875u;
        a.a.X(parcel, 13, 4);
        parcel.writeInt(i12);
        boolean z10 = gVar.v;
        a.a.X(parcel, 14, 4);
        parcel.writeInt(z10 ? 1 : 0);
        a.a.T(parcel, 15, gVar.f6876w);
        a.a.a0(parcel, iY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f5623a) {
            case 0:
                int iL = t0.f.L(parcel);
                String strP = null;
                h0.b bVar = null;
                int iE = 0;
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < iL) {
                    int i = parcel.readInt();
                    char c9 = (char) i;
                    if (c9 == 1) {
                        iE = t0.f.E(parcel, i);
                    } else if (c9 == 2) {
                        strP = t0.f.p(parcel, i);
                    } else if (c9 == 3) {
                        pendingIntent = (PendingIntent) t0.f.o(parcel, i, PendingIntent.CREATOR);
                    } else if (c9 != 4) {
                        t0.f.H(parcel, i);
                    } else {
                        bVar = (h0.b) t0.f.o(parcel, i, h0.b.CREATOR);
                    }
                }
                t0.f.t(parcel, iL);
                return new Status(iE, strP, pendingIntent, bVar);
            case 1:
                int iL2 = t0.f.L(parcel);
                ArrayList arrayListR = null;
                int iE2 = 0;
                while (parcel.dataPosition() < iL2) {
                    int i6 = parcel.readInt();
                    char c10 = (char) i6;
                    if (c10 == 1) {
                        iE2 = t0.f.E(parcel, i6);
                    } else if (c10 != 2) {
                        t0.f.H(parcel, i6);
                    } else {
                        arrayListR = t0.f.r(parcel, i6, k0.j.CREATOR);
                    }
                }
                t0.f.t(parcel, iL2);
                return new n(iE2, arrayListR);
            case 2:
                int iL3 = t0.f.L(parcel);
                int iE3 = -1;
                int iE4 = 0;
                int iE5 = 0;
                int iE6 = 0;
                int iE7 = 0;
                String strP2 = null;
                String strP3 = null;
                long jF = 0;
                long jF2 = 0;
                while (parcel.dataPosition() < iL3) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            iE4 = t0.f.E(parcel, i10);
                            break;
                        case 2:
                            iE5 = t0.f.E(parcel, i10);
                            break;
                        case 3:
                            iE6 = t0.f.E(parcel, i10);
                            break;
                        case 4:
                            jF = t0.f.F(parcel, i10);
                            break;
                        case 5:
                            jF2 = t0.f.F(parcel, i10);
                            break;
                        case 6:
                            strP2 = t0.f.p(parcel, i10);
                            break;
                        case 7:
                            strP3 = t0.f.p(parcel, i10);
                            break;
                        case '\b':
                            iE7 = t0.f.E(parcel, i10);
                            break;
                        case '\t':
                            iE3 = t0.f.E(parcel, i10);
                            break;
                        default:
                            t0.f.H(parcel, i10);
                            break;
                    }
                }
                t0.f.t(parcel, iL3);
                return new k0.j(iE4, iE5, iE6, jF, jF2, strP2, strP3, iE7, iE3);
            case 3:
                int iL4 = t0.f.L(parcel);
                Account account = null;
                int iE8 = 0;
                int iE9 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iL4) {
                    int i11 = parcel.readInt();
                    char c11 = (char) i11;
                    if (c11 == 1) {
                        iE8 = t0.f.E(parcel, i11);
                    } else if (c11 == 2) {
                        account = (Account) t0.f.o(parcel, i11, Account.CREATOR);
                    } else if (c11 == 3) {
                        iE9 = t0.f.E(parcel, i11);
                    } else if (c11 != 4) {
                        t0.f.H(parcel, i11);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) t0.f.o(parcel, i11, GoogleSignInAccount.CREATOR);
                    }
                }
                t0.f.t(parcel, iL4);
                return new r(iE8, account, iE9, googleSignInAccount);
            case 4:
                int iL5 = t0.f.L(parcel);
                int iE10 = 0;
                boolean zC = false;
                boolean zC2 = false;
                IBinder iBinderD = null;
                h0.b bVar2 = null;
                while (parcel.dataPosition() < iL5) {
                    int i12 = parcel.readInt();
                    char c12 = (char) i12;
                    if (c12 == 1) {
                        iE10 = t0.f.E(parcel, i12);
                    } else if (c12 == 2) {
                        iBinderD = t0.f.D(parcel, i12);
                    } else if (c12 == 3) {
                        bVar2 = (h0.b) t0.f.o(parcel, i12, h0.b.CREATOR);
                    } else if (c12 == 4) {
                        zC = t0.f.C(parcel, i12);
                    } else if (c12 != 5) {
                        t0.f.H(parcel, i12);
                    } else {
                        zC2 = t0.f.C(parcel, i12);
                    }
                }
                t0.f.t(parcel, iL5);
                return new s(iE10, iBinderD, bVar2, zC, zC2);
            case 5:
                int iL6 = t0.f.L(parcel);
                int iE11 = 0;
                int iE12 = 0;
                int iE13 = 0;
                boolean zC3 = false;
                boolean zC4 = false;
                while (parcel.dataPosition() < iL6) {
                    int i13 = parcel.readInt();
                    char c13 = (char) i13;
                    if (c13 == 1) {
                        iE11 = t0.f.E(parcel, i13);
                    } else if (c13 == 2) {
                        zC3 = t0.f.C(parcel, i13);
                    } else if (c13 == 3) {
                        zC4 = t0.f.C(parcel, i13);
                    } else if (c13 == 4) {
                        iE12 = t0.f.E(parcel, i13);
                    } else if (c13 != 5) {
                        t0.f.H(parcel, i13);
                    } else {
                        iE13 = t0.f.E(parcel, i13);
                    }
                }
                t0.f.t(parcel, iL6);
                return new m(iE11, iE12, iE13, zC3, zC4);
            case 6:
                int iL7 = t0.f.L(parcel);
                Bundle bundleN = null;
                k0.f fVar = null;
                int iE14 = 0;
                h0.d[] dVarArr = null;
                while (parcel.dataPosition() < iL7) {
                    int i14 = parcel.readInt();
                    char c14 = (char) i14;
                    if (c14 == 1) {
                        bundleN = t0.f.n(parcel, i14);
                    } else if (c14 == 2) {
                        dVarArr = (h0.d[]) t0.f.q(parcel, i14, h0.d.CREATOR);
                    } else if (c14 == 3) {
                        iE14 = t0.f.E(parcel, i14);
                    } else if (c14 != 4) {
                        t0.f.H(parcel, i14);
                    } else {
                        fVar = (k0.f) t0.f.o(parcel, i14, k0.f.CREATOR);
                    }
                }
                t0.f.t(parcel, iL7);
                g0 g0Var = new g0();
                g0Var.f6877a = bundleN;
                g0Var.f6878b = dVarArr;
                g0Var.f6879l = iE14;
                g0Var.f6880m = fVar;
                return g0Var;
            case 7:
                int iL8 = t0.f.L(parcel);
                m mVar = null;
                int[] iArrCreateIntArray = null;
                int[] iArrCreateIntArray2 = null;
                boolean zC5 = false;
                boolean zC6 = false;
                int iE15 = 0;
                while (parcel.dataPosition() < iL8) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 1:
                            mVar = (m) t0.f.o(parcel, i15, m.CREATOR);
                            break;
                        case 2:
                            zC5 = t0.f.C(parcel, i15);
                            break;
                        case 3:
                            zC6 = t0.f.C(parcel, i15);
                            break;
                        case 4:
                            int iG = t0.f.G(parcel, i15);
                            int iDataPosition = parcel.dataPosition();
                            if (iG != 0) {
                                iArrCreateIntArray = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition + iG);
                            } else {
                                iArrCreateIntArray = null;
                            }
                            break;
                        case 5:
                            iE15 = t0.f.E(parcel, i15);
                            break;
                        case 6:
                            int iG2 = t0.f.G(parcel, i15);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iG2 != 0) {
                                iArrCreateIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition2 + iG2);
                            } else {
                                iArrCreateIntArray2 = null;
                            }
                            break;
                        default:
                            t0.f.H(parcel, i15);
                            break;
                    }
                }
                t0.f.t(parcel, iL8);
                return new k0.f(mVar, zC5, zC6, iArrCreateIntArray, iE15, iArrCreateIntArray2);
            case 8:
                int iL9 = t0.f.L(parcel);
                Bundle bundle = new Bundle();
                Scope[] scopeArr = k0.g.f6862x;
                String strP4 = null;
                IBinder iBinderD2 = null;
                Account account2 = null;
                String strP5 = null;
                int iE16 = 0;
                int iE17 = 0;
                int iE18 = 0;
                boolean zC7 = false;
                int iE19 = 0;
                boolean zC8 = false;
                h0.d[] dVarArr2 = k0.g.f6863y;
                h0.d[] dVarArr3 = dVarArr2;
                while (parcel.dataPosition() < iL9) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            iE16 = t0.f.E(parcel, i16);
                            break;
                        case 2:
                            iE17 = t0.f.E(parcel, i16);
                            break;
                        case 3:
                            iE18 = t0.f.E(parcel, i16);
                            break;
                        case 4:
                            strP4 = t0.f.p(parcel, i16);
                            break;
                        case 5:
                            iBinderD2 = t0.f.D(parcel, i16);
                            break;
                        case 6:
                            scopeArr = (Scope[]) t0.f.q(parcel, i16, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = t0.f.n(parcel, i16);
                            break;
                        case '\b':
                            account2 = (Account) t0.f.o(parcel, i16, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            t0.f.H(parcel, i16);
                            break;
                        case '\n':
                            dVarArr2 = (h0.d[]) t0.f.q(parcel, i16, h0.d.CREATOR);
                            break;
                        case 11:
                            dVarArr3 = (h0.d[]) t0.f.q(parcel, i16, h0.d.CREATOR);
                            break;
                        case '\f':
                            zC7 = t0.f.C(parcel, i16);
                            break;
                        case '\r':
                            iE19 = t0.f.E(parcel, i16);
                            break;
                        case 14:
                            zC8 = t0.f.C(parcel, i16);
                            break;
                        case 15:
                            strP5 = t0.f.p(parcel, i16);
                            break;
                    }
                }
                t0.f.t(parcel, iL9);
                return new k0.g(iE16, iE17, iE18, strP4, iBinderD2, scopeArr, bundle, account2, dVarArr2, dVarArr3, zC7, iE19, zC8, strP5);
            case 9:
                parcel.getClass();
                x4.e eVar = new x4.e();
                eVar.f11122a = -1L;
                eVar.f11125m = -1L;
                x4.d dVar = x4.d.f11089b;
                eVar.f11128p = dVar;
                eVar.H = -1;
                eVar.f11122a = parcel.readLong();
                eVar.f11123b = parcel.readString();
                eVar.f11124l = parcel.readString();
                eVar.f11125m = parcel.readLong();
                eVar.f11126n = parcel.readString();
                eVar.f11127o = parcel.readString();
                int i17 = parcel.readInt();
                if (i17 == 0) {
                    eVar.f11128p = x4.d.f11088a;
                } else if (i17 != 1) {
                    eVar.f11128p = x4.d.f11090l;
                } else {
                    eVar.f11128p = dVar;
                }
                eVar.f11129q = parcel.readInt();
                eVar.f11130r = parcel.readInt();
                eVar.f11131s = parcel.readInt();
                eVar.f11132t = parcel.readInt();
                eVar.f11133u = parcel.readString();
                eVar.v = parcel.readInt();
                eVar.f11134w = parcel.readLong();
                eVar.f11135x = parcel.readLong();
                eVar.f11136y = parcel.readInt();
                eVar.f11137z = parcel.readString();
                eVar.A = parcel.readLong();
                eVar.B = parcel.readString();
                eVar.C = parcel.readInt();
                eVar.F = parcel.readLong();
                eVar.G = parcel.readInt();
                eVar.K = parcel.readInt() == 1;
                return eVar;
            case 10:
                parcel.getClass();
                return new x4.g(parcel);
            case 11:
                parcel.getClass();
                x4.j jVar = new x4.j((int) (0 == true ? 1 : 0), (String) null, 7);
                jVar.f11225a = parcel.readInt();
                jVar.f11226b = parcel.readString();
                jVar.f11227l = parcel.readString();
                jVar.f11228m = parcel.readInt() == 1;
                jVar.f11229n = parcel.readInt() == 1;
                jVar.f11230o = parcel.readInt();
                jVar.f11231p = parcel.readInt();
                jVar.f11232q = parcel.createTypedArrayList(x4.j.CREATOR);
                return jVar;
            case 12:
                parcel.getClass();
                x4.r rVar = new x4.r();
                rVar.f11355a = -1;
                rVar.f11358m = 1;
                rVar.f11359n = -1L;
                rVar.f11362q = -1L;
                rVar.f11370z = -1L;
                rVar.C = -1L;
                rVar.D = -1L;
                rVar.F = new ArrayList();
                rVar.f11355a = parcel.readInt();
                rVar.f11356b = parcel.readString();
                rVar.f11357l = parcel.readInt();
                rVar.f11358m = parcel.readInt();
                rVar.f11359n = parcel.readLong();
                rVar.f11360o = parcel.readString();
                rVar.f11361p = parcel.readInt();
                rVar.f11362q = parcel.readLong();
                rVar.f11363r = parcel.readInt();
                rVar.f11364s = parcel.readString();
                rVar.f11365t = parcel.readString();
                rVar.f11366u = parcel.readInt();
                rVar.v = parcel.readString();
                rVar.f11367w = parcel.readString();
                rVar.f11368x = parcel.readLong();
                rVar.f11369y = parcel.createStringArrayList();
                parcel.readTypedList(rVar.F, j0.CREATOR);
                rVar.f11370z = parcel.readLong();
                rVar.A = parcel.readInt();
                rVar.B = parcel.readInt();
                return rVar;
            case 13:
                parcel.getClass();
                j0 j0Var = new j0();
                j0Var.f11234a = -1L;
                j0Var.f11235b = -1L;
                j0Var.f11236l = -1L;
                j0Var.f11238n = -1L;
                j0Var.f11234a = parcel.readLong();
                j0Var.f11235b = parcel.readLong();
                j0Var.f11236l = parcel.readLong();
                j0Var.f11237m = parcel.readString();
                j0Var.f11238n = parcel.readLong();
                j0Var.f11239o = parcel.readLong();
                j0Var.f11240p = parcel.readString();
                j0Var.f11241q = parcel.readString();
                j0Var.f11242r = parcel.readInt();
                j0Var.f11243s = parcel.readLong();
                return j0Var;
            case 14:
                parcel.getClass();
                k0 k0Var = new k0();
                k0Var.f11253a = -1;
                k0Var.f11256m = 1;
                k0Var.f11253a = parcel.readInt();
                k0Var.f11254b = parcel.readLong();
                k0Var.f11255l = parcel.readString();
                k0Var.f11256m = parcel.readInt();
                return k0Var;
            case 15:
                parcel.getClass();
                d1 d1Var = new d1();
                d1Var.f11092a = parcel.readLong();
                d1Var.f11093b = parcel.readString();
                d1Var.f11094l = parcel.readLong();
                d1Var.f11095m = parcel.readString();
                d1Var.f11096n = parcel.readInt();
                d1Var.f11097o = parcel.readString();
                d1Var.f11098p = parcel.readInt();
                d1Var.f11099q = parcel.readString();
                d1Var.f11100r = parcel.readString();
                d1Var.f11101s = parcel.readString();
                d1Var.f11102t = parcel.readLong();
                d1Var.f11103u = parcel.readString();
                d1Var.v = parcel.readInt();
                d1Var.f11104w = parcel.readString();
                d1Var.f11105x = parcel.readLong();
                d1Var.f11106y = parcel.readString();
                d1Var.f11107z = parcel.readString();
                d1Var.A = parcel.readLong();
                d1Var.B = parcel.readLong();
                d1Var.C = parcel.readString();
                d1Var.D = parcel.readString();
                d1Var.E = parcel.readString();
                d1Var.F = parcel.readString();
                d1Var.G = parcel.readInt();
                return d1Var;
            case 16:
                parcel.getClass();
                t1 t1Var = new t1();
                t1Var.f11398b = -1L;
                t1Var.f11400m = -1L;
                t1Var.f11405r = new ArrayList();
                t1Var.f11397a = parcel.readString();
                t1Var.f11399l = parcel.readString();
                t1Var.f11400m = parcel.readLong();
                t1Var.f11401n = parcel.readString();
                t1Var.f11402o = parcel.readString();
                t1Var.f11403p = parcel.readString();
                t1Var.f11398b = parcel.readLong();
                return t1Var;
            case 17:
                parcel.getClass();
                y1 y1Var = new y1();
                y1Var.f11468a = parcel.readString();
                y1Var.f11469b = parcel.readInt();
                y1Var.f11470l = parcel.readInt();
                y1Var.f11471m = parcel.readString();
                y1Var.f11472n = parcel.readInt();
                return y1Var;
            case 18:
                parcel.getClass();
                d2 d2Var = new d2();
                d2Var.f11108a = parcel.readLong();
                d2Var.f11112n = parcel.readLong();
                d2Var.f11109b = parcel.readString();
                d2Var.f11110l = parcel.readString();
                d2Var.f11111m = parcel.readString();
                d2Var.f11113o = parcel.readString();
                d2Var.f11114p = parcel.readString();
                d2Var.f11115q = parcel.readInt();
                d2Var.f11116r = parcel.readInt();
                d2Var.f11117s = parcel.readInt();
                d2Var.f11118t = parcel.readString();
                d2Var.f11119u = parcel.readInt();
                return d2Var;
            case 19:
                parcel.getClass();
                k2 k2Var = new k2();
                k2Var.f11259a = parcel.readLong();
                k2Var.f11263n = parcel.readLong();
                k2Var.f11261l = parcel.readString();
                k2Var.f11260b = parcel.readString();
                k2Var.f11262m = parcel.readString();
                k2Var.f11264o = parcel.readString();
                k2Var.f11265p = parcel.readInt();
                k2Var.f11266q = parcel.readInt();
                k2Var.f11267r = parcel.readString();
                k2Var.f11268s = parcel.readInt();
                k2Var.f11269t = parcel.readInt();
                k2Var.f11270u = parcel.readString();
                k2Var.v = parcel.readInt();
                k2Var.f11271w = parcel.readString();
                k2Var.f11272x = parcel.readInt();
                return k2Var;
            case 20:
                parcel.getClass();
                l2 l2Var = new l2();
                l2Var.f11278a = parcel.readString();
                l2Var.f11279b = parcel.readInt();
                l2Var.f11280l = parcel.readInt();
                l2Var.f11281m = parcel.readInt();
                return l2Var;
            case 21:
                parcel.getClass();
                return new q2(parcel);
            case 22:
                parcel.getClass();
                w2 w2Var = new w2();
                w2Var.f11436n = -1L;
                w2Var.f11437o = "type0";
                w2Var.f11440r = -1;
                w2Var.f11432a = parcel.readString();
                w2Var.f11433b = parcel.readString();
                w2Var.f11434l = parcel.readString();
                w2Var.f11435m = parcel.readString();
                w2Var.v = parcel.readString();
                w2Var.f11437o = parcel.readString();
                w2Var.f11436n = parcel.readLong();
                w2Var.f11438p = parcel.readString();
                w2Var.f11444w = parcel.readInt() == 1;
                w2Var.f11439q = parcel.readInt();
                w2Var.f11443u = parcel.readString();
                w2Var.f11440r = parcel.readInt();
                w2Var.f11441s = parcel.readInt();
                w2Var.f11442t = parcel.readInt();
                w2Var.f11445x = parcel.readInt() == 1;
                w2Var.f11446y = parcel.readInt() == 1;
                return w2Var;
            case 23:
                parcel.getClass();
                x2 x2Var = new x2();
                x2Var.f11454a = parcel.readString();
                x2Var.f11455b = parcel.readInt();
                x2Var.f11456l = parcel.readInt();
                x2Var.f11457m = parcel.readInt();
                x2Var.f11458n = parcel.readInt();
                x2Var.f11459o = parcel.readInt();
                x2Var.f11460p = parcel.readInt();
                x2Var.f11461q = parcel.readInt();
                return x2Var;
            case 24:
                parcel.getClass();
                return new z2(parcel);
            case 25:
                parcel.getClass();
                b3 b3Var = new b3();
                b3Var.f11066a = parcel.readLong();
                b3Var.f11067b = parcel.readString();
                b3Var.f11069m = parcel.readInt();
                b3Var.f11070n = parcel.readInt();
                b3Var.f11068l = parcel.readInt();
                b3Var.f11071o = parcel.readInt();
                return b3Var;
            case 26:
                parcel.getClass();
                d3 d3Var = new d3();
                d3Var.f11120a = parcel.readString();
                d3Var.f11121b = parcel.readString();
                return d3Var;
            default:
                int iL10 = t0.f.L(parcel);
                Bundle bundleN2 = null;
                while (parcel.dataPosition() < iL10) {
                    int i18 = parcel.readInt();
                    if (((char) i18) != 2) {
                        t0.f.H(parcel, i18);
                    } else {
                        bundleN2 = t0.f.n(parcel, i18);
                    }
                }
                t0.f.t(parcel, iL10);
                return new y2.r(bundleN2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f5623a) {
            case 0:
                return new Status[i];
            case 1:
                return new n[i];
            case 2:
                return new k0.j[i];
            case 3:
                return new r[i];
            case 4:
                return new s[i];
            case 5:
                return new m[i];
            case 6:
                return new g0[i];
            case 7:
                return new k0.f[i];
            case 8:
                return new k0.g[i];
            case 9:
                return new x4.e[i];
            case 10:
                return new x4.g[i];
            case 11:
                return new x4.j[i];
            case 12:
                return new x4.r[i];
            case 13:
                return new j0[i];
            case 14:
                return new k0[i];
            case 15:
                return new d1[i];
            case 16:
                return new t1[i];
            case 17:
                return new y1[i];
            case 18:
                return new d2[i];
            case 19:
                return new k2[i];
            case 20:
                return new l2[i];
            case 21:
                return new q2[i];
            case 22:
                return new w2[i];
            case 23:
                return new x2[i];
            case 24:
                return new z2[i];
            case 25:
                return new b3[i];
            case 26:
                return new d3[i];
            default:
                return new y2.r[i];
        }
    }
}
