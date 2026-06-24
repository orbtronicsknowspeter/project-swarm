package b;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Parcelable;
import c3.d1;
import c3.i0;
import c3.w0;
import c4.i7;
import c4.k0;
import c4.q9;
import com.inmobi.cmp.data.model.ChoiceStyle;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AppDetailActivity;
import com.uptodown.activities.AppFilesActivity;
import com.uptodown.activities.AppInstalledDetailsActivity;
import com.uptodown.activities.FollowListActivity;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.MyApps;
import com.uptodown.activities.MyDownloads;
import com.uptodown.activities.NotificationsRegistryActivity;
import com.uptodown.activities.OldVersionsActivity;
import com.uptodown.activities.PublicProfileActivity;
import com.uptodown.activities.RepliesActivity;
import com.uptodown.activities.ReviewsActivity;
import com.uptodown.activities.SearchActivity;
import com.uptodown.activities.SecurityActivity;
import com.uptodown.activities.VirusTotalReport;
import e1.s0;
import e1.v4;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.w;
import o7.a0;
import p6.x;
import r7.o0;
import s4.f0;
import s4.y0;
import x4.e1;
import x4.f2;
import x4.k2;
import x4.r1;
import x4.t1;
import x4.u0;
import x4.w2;
import x4.x1;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class n extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f697b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f698l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f699m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(int i, MainActivity mainActivity, x4.r rVar, t6.c cVar) {
        super(2, cVar);
        this.f696a = 18;
        this.f697b = i;
        this.f698l = mainActivity;
        this.f699m = rVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0222, code lost:
    
        if (r0 == r4) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.n.a(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f699m
            x4.r r0 = (x4.r) r0
            p6.a.e(r10)
            java.lang.Object r10 = r9.f698l
            com.uptodown.activities.MyDownloads r10 = (com.uptodown.activities.MyDownloads) r10
            e4.b r1 = r10.Q
            if (r1 == 0) goto Lac
            int r2 = r9.f697b
            r3 = 202(0xca, float:2.83E-43)
            r4 = 0
            if (r2 == r3) goto La9
            r3 = 203(0xcb, float:2.84E-43)
            if (r2 == r3) goto La9
            r3 = 207(0xcf, float:2.9E-43)
            if (r2 == r3) goto L6a
            if (r0 == 0) goto Lac
            java.lang.String r1 = r0.f11356b
            r2 = -1
            if (r1 == 0) goto L50
            int r3 = r1.length()
            if (r3 != 0) goto L2c
            goto L50
        L2c:
            e4.b r3 = r10.Q
            r3.getClass()
            java.util.ArrayList r3 = r3.f4486b
            int r5 = r3.size()
            r6 = r4
        L38:
            if (r6 >= r5) goto L50
            java.lang.Object r7 = r3.get(r6)
            r7.getClass()
            x4.r r7 = (x4.r) r7
            java.lang.String r7 = r7.f11356b
            r8 = 1
            boolean r7 = l7.u.m0(r7, r1, r8)
            if (r7 == 0) goto L4d
            goto L51
        L4d:
            int r6 = r6 + 1
            goto L38
        L50:
            r6 = r2
        L51:
            if (r6 <= r2) goto L66
            e4.b r1 = r10.Q
            r1.getClass()
            java.util.ArrayList r1 = r1.f4486b
            r1.set(r6, r0)
            e4.b r10 = r10.Q
            r10.getClass()
            r10.notifyItemChanged(r6)
            goto Lac
        L66:
            r10.C0(r4)
            goto Lac
        L6a:
            java.util.ArrayList r1 = r1.f4486b
            boolean r1 = q6.l.o0(r1, r0)
            if (r1 == 0) goto Lac
            e4.b r1 = r10.Q
            r1.getClass()
            e4.b r2 = r10.Q
            r2.getClass()
            java.util.ArrayList r2 = r2.f4486b
            int r2 = q6.l.u0(r2, r0)
            r1.notifyItemRemoved(r2)
            e4.b r1 = r10.Q
            r1.getClass()
            java.util.ArrayList r1 = r1.f4486b
            kotlin.jvm.internal.a0.a(r1)
            r1.remove(r0)
            e4.b r0 = r10.Q
            r0.getClass()
            java.util.ArrayList r0 = r0.f4486b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lac
            t4.y r10 = r10.A0()
            android.widget.TextView r10 = r10.f10245q
            r10.setVisibility(r4)
            goto Lac
        La9:
            r10.C0(r4)
        Lac:
            p6.x r10 = p6.x.f8464a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: b.n.b(java.lang.Object):java.lang.Object");
    }

    private final Object c(Object obj) throws Throwable {
        Object objD;
        t1 t1Var = (t1) this.f699m;
        OldVersionsActivity oldVersionsActivity = (OldVersionsActivity) this.f698l;
        int i = this.f697b;
        Object obj2 = null;
        if (i == 0) {
            p6.a.e(obj);
            b5.m mVar = new b5.m(oldVersionsActivity, t1Var.f11403p, obj2, 22);
            this.f697b = 1;
            objD = mVar.D(this);
            u6.a aVar = u6.a.f10763a;
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p6.a.e(obj);
            objD = ((p6.k) obj).f8445a;
        }
        if (!(objD instanceof p6.j)) {
            Intent intent = new Intent(oldVersionsActivity, (Class<?>) VirusTotalReport.class);
            int i6 = OldVersionsActivity.S;
            intent.putExtra("appInfo", (Parcelable) oldVersionsActivity.A0().f1681d.getValue());
            intent.putExtra("appReportVT", (f2) objD);
            intent.putExtra("old_version_name", t1Var.f11397a);
            float f = UptodownApp.I;
            oldVersionsActivity.startActivity(intent, b4.d.a(oldVersionsActivity));
        }
        if (p6.k.a(objD) != null) {
            int i10 = OldVersionsActivity.S;
            if (oldVersionsActivity.A0().f1681d.getValue() != null) {
                Intent intent2 = new Intent(oldVersionsActivity, (Class<?>) VirusTotalReport.class);
                intent2.putExtra("appInfo", (Parcelable) oldVersionsActivity.A0().f1681d.getValue());
                intent2.putExtra("isVirusTotalReportAvaialable", false);
                float f10 = UptodownApp.I;
                oldVersionsActivity.startActivity(intent2, b4.d.a(oldVersionsActivity));
            }
        }
        return x.f8464a;
    }

    private final Object d(Object obj) {
        Object objE;
        i7 i7Var = (i7) this.f698l;
        o0 o0Var = i7Var.f1720a;
        int i = this.f697b;
        if (i == 0) {
            p6.a.e(obj);
            i7Var.f1724e = true;
            o0Var.getClass();
            o0Var.g(null, j5.p.f6706a);
            v4 v4Var = new v4((Context) this.f699m, 3, false);
            String str = (String) i7Var.f1722c.getValue();
            int i6 = i7Var.f;
            this.f697b = 1;
            objE = v4Var.e(str, 30, i6, this);
            u6.a aVar = u6.a.f10763a;
            if (objE == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p6.a.e(obj);
            objE = ((p6.k) obj).f8445a;
        }
        boolean z9 = objE instanceof p6.j;
        j5.q qVar = j5.q.f6707a;
        if (!z9) {
            ArrayList arrayList = ((f0) objE).f9199a;
            boolean zIsEmpty = arrayList.isEmpty();
            int i10 = i7Var.f;
            if (!zIsEmpty) {
                i7Var.f = arrayList.size() + i10;
                j5.r rVar = new j5.r(arrayList);
                o0Var.getClass();
                o0Var.g(null, rVar);
            } else if (i10 == 0) {
                j5.r rVar2 = new j5.r(new ArrayList());
                o0Var.getClass();
                o0Var.g(null, rVar2);
            } else {
                i7Var.f1723d = true;
                o0Var.getClass();
                o0Var.g(null, qVar);
            }
            i7Var.f1724e = false;
        }
        if (p6.k.a(objE) != null) {
            o0Var.getClass();
            o0Var.g(null, qVar);
            i7Var.f1724e = false;
        }
        return x.f8464a;
    }

    private final Object e(Object obj) {
        Object objA;
        PublicProfileActivity publicProfileActivity = (PublicProfileActivity) this.f698l;
        int i = this.f697b;
        if (i == 0) {
            p6.a.e(obj);
            s4.x xVar = new s4.x(publicProfileActivity);
            String strValueOf = String.valueOf(((w2) this.f699m).f11432a);
            this.f697b = 1;
            objA = xVar.a(strValueOf, this);
            u6.a aVar = u6.a.f10763a;
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p6.a.e(obj);
            objA = ((p6.k) obj).f8445a;
        }
        if (!(objA instanceof p6.j)) {
            int i6 = PublicProfileActivity.R;
            publicProfileActivity.B0((w2) objA);
        }
        return x.f8464a;
    }

    private final Object f(Object obj) {
        Object objA;
        RepliesActivity repliesActivity = (RepliesActivity) this.f698l;
        int i = this.f697b;
        if (i == 0) {
            p6.a.e(obj);
            s4.x xVar = new s4.x(repliesActivity);
            String str = (String) this.f699m;
            this.f697b = 1;
            objA = xVar.a(str, this);
            u6.a aVar = u6.a.f10763a;
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p6.a.e(obj);
            objA = ((p6.k) obj).f8445a;
        }
        if (!(objA instanceof p6.j)) {
            new android.support.v4.media.g(repliesActivity, 20).E(k0.k.e("source", "replies"), "profile-open");
            Intent intent = new Intent(repliesActivity, (Class<?>) PublicProfileActivity.class);
            intent.putExtra("user", (w2) objA);
            float f = UptodownApp.I;
            repliesActivity.startActivity(intent, b4.d.a(repliesActivity));
        }
        if (p6.k.a(objA) != null) {
            String string = repliesActivity.getString(R.string.error_generico);
            string.getClass();
            repliesActivity.A(string);
        }
        return x.f8464a;
    }

    private final Object h(Object obj) {
        Object objA;
        ReviewsActivity reviewsActivity = (ReviewsActivity) this.f698l;
        int i = this.f697b;
        if (i == 0) {
            p6.a.e(obj);
            s4.x xVar = new s4.x(reviewsActivity);
            String str = ((k2) this.f699m).f11260b;
            str.getClass();
            this.f697b = 1;
            objA = xVar.a(str, this);
            u6.a aVar = u6.a.f10763a;
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p6.a.e(obj);
            objA = ((p6.k) obj).f8445a;
        }
        if (!(objA instanceof p6.j)) {
            new android.support.v4.media.g(reviewsActivity, 20).E(k0.k.e("source", "reviews"), "profile-open");
            Intent intent = new Intent(reviewsActivity, (Class<?>) PublicProfileActivity.class);
            intent.putExtra("user", (w2) objA);
            float f = UptodownApp.I;
            reviewsActivity.startActivity(intent, b4.d.a(reviewsActivity));
        }
        if (p6.k.a(objA) != null) {
            String string = reviewsActivity.getString(R.string.error_generico);
            string.getClass();
            reviewsActivity.A(string);
        }
        return x.f8464a;
    }

    private final Object j(Object obj) {
        Object objA;
        SearchActivity searchActivity = (SearchActivity) this.f698l;
        int i = this.f697b;
        if (i == 0) {
            p6.a.e(obj);
            s0 s0Var = new s0(searchActivity, ((x4.g) this.f699m).f11159a);
            this.f697b = 1;
            objA = s0Var.a(this);
            u6.a aVar = u6.a.f10763a;
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p6.a.e(obj);
            objA = ((p6.k) obj).f8445a;
        }
        if (!(objA instanceof p6.j)) {
            x4.g gVar = (x4.g) objA;
            String str = gVar.F;
            if (str != null) {
                a5.e.b(str, "buscador");
            }
            d0.b.j(searchActivity, searchActivity, new q9(searchActivity), gVar, true);
        }
        Throwable thA = p6.k.a(objA);
        if (thA != null) {
            int i6 = y0.f9324l;
            if (d0.b.J(thA)) {
                searchActivity.J();
            } else if (searchActivity.T()) {
                String string = searchActivity.getString(R.string.error_cant_enqueue_download);
                string.getClass();
                searchActivity.A(string);
            }
        }
        return x.f8464a;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f696a) {
            case 0:
                n nVar = new n((ChoiceStyle) this.f699m, cVar, 0);
                nVar.f698l = obj;
                return nVar;
            case 1:
                return new n((Context) this.f698l, (h) this.f699m, cVar, 1);
            case 2:
                return new n((UptodownApp) this.f698l, (String) this.f699m, cVar, 2);
            case 3:
                return new n((UptodownApp) this.f698l, (b4.g) this.f699m, cVar, 3);
            case 4:
                return new n((Bitmap) this.f698l, (b6.f) this.f699m, cVar, 4);
            case 5:
                return new n((c3.o) this.f698l, (w0) this.f699m, cVar, 5);
            case 6:
                return new n((d1) this.f698l, (i0) this.f699m, cVar, 6);
            case 7:
                return new n((x4.r) this.f698l, (AppDetailActivity) this.f699m, this.f697b, cVar, 7);
            case 8:
                return new n((AppFilesActivity) this.f698l, (e1) this.f699m, cVar, 8);
            case 9:
                return new n((AppInstalledDetailsActivity) this.f698l, (u0) this.f699m, cVar, 9);
            case 10:
                return new n((k0) this.f698l, (File) this.f699m, cVar, 10);
            case 11:
                return new n((k0) this.f698l, (x1) this.f699m, cVar, 11);
            case 12:
                return new n((FollowListActivity) this.f698l, (String) this.f699m, cVar, 12);
            case 13:
                return new n((MainActivity) this.f698l, (ArrayList) this.f699m, cVar, 13);
            case 14:
                return new n((MainActivity) this.f698l, (w) this.f699m, cVar, 14);
            case 15:
                return new n((MainActivity) this.f698l, (r1) this.f699m, cVar, 15);
            case 16:
                return new n((MainActivity) this.f698l, (a3.d) this.f699m, cVar, 16);
            case 17:
                return new n((MainActivity) this.f699m, cVar, 17);
            case 18:
                return new n(this.f697b, (MainActivity) this.f698l, (x4.r) this.f699m, cVar);
            case 19:
                return new n((MyApps) this.f698l, (String) this.f699m, this.f697b, cVar, 19);
            case 20:
                return new n((MyDownloads) this.f699m, cVar, 20);
            case 21:
                return new n((MyDownloads) this.f698l, this.f697b, (x4.r) this.f699m, cVar);
            case 22:
                return new n((NotificationsRegistryActivity) this.f698l, (String) this.f699m, cVar, 22);
            case 23:
                return new n((OldVersionsActivity) this.f698l, (t1) this.f699m, cVar, 23);
            case 24:
                return new n((i7) this.f698l, (Context) this.f699m, cVar, 24);
            case 25:
                return new n((PublicProfileActivity) this.f698l, (w2) this.f699m, cVar, 25);
            case 26:
                return new n((RepliesActivity) this.f698l, (String) this.f699m, cVar, 26);
            case 27:
                return new n((ReviewsActivity) this.f698l, (k2) this.f699m, cVar, 27);
            case 28:
                return new n((SearchActivity) this.f698l, (x4.g) this.f699m, cVar, 28);
            default:
                return new n((SecurityActivity) this.f698l, (t4.w0) this.f699m, cVar, 29);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        a0 a0Var = (a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f696a) {
            case 0:
                n nVar = new n((ChoiceStyle) this.f699m, cVar, 0);
                nVar.f698l = a0Var;
                break;
            case 7:
                n nVar2 = (n) create(a0Var, cVar);
                x xVar = x.f8464a;
                nVar2.invokeSuspend(xVar);
                break;
            case 10:
                ((n) create(a0Var, cVar)).invokeSuspend(x.f8464a);
                break;
            case 18:
                n nVar3 = (n) create(a0Var, cVar);
                x xVar2 = x.f8464a;
                nVar3.invokeSuspend(xVar2);
                break;
            case 19:
                n nVar4 = (n) create(a0Var, cVar);
                x xVar3 = x.f8464a;
                nVar4.invokeSuspend(xVar3);
                break;
            case 21:
                n nVar5 = (n) create(a0Var, cVar);
                x xVar4 = x.f8464a;
                nVar5.invokeSuspend(xVar4);
                break;
        }
        return ((n) create(a0Var, cVar)).invokeSuspend(x.f8464a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0997  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x099c  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x09aa  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x09b4  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0b0b  */
    /* JADX WARN: Removed duplicated region for block: B:630:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:631:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v151, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v0, types: [t6.c] */
    /* JADX WARN: Type inference failed for: r2v111 */
    /* JADX WARN: Type inference failed for: r2v128 */
    /* JADX WARN: Type inference failed for: r2v129 */
    /* JADX WARN: Type inference failed for: r3v82, types: [android.content.Context, c4.k0, com.uptodown.activities.MyApps] */
    @Override // v6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(MyDownloads myDownloads, int i, x4.r rVar, t6.c cVar) {
        super(2, cVar);
        this.f696a = 21;
        this.f698l = myDownloads;
        this.f697b = i;
        this.f699m = rVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj, Object obj2, int i, t6.c cVar, int i6) {
        super(2, cVar);
        this.f696a = i6;
        this.f698l = obj;
        this.f699m = obj2;
        this.f697b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj, Object obj2, t6.c cVar, int i) {
        super(2, cVar);
        this.f696a = i;
        this.f698l = obj;
        this.f699m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj, t6.c cVar, int i) {
        super(2, cVar);
        this.f696a = i;
        this.f699m = obj;
    }
}
