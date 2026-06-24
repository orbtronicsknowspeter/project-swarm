package b6;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.inmobi.cmp.ChoiceCmp;
import com.inmobi.cmp.ChoiceCmpCallback;
import h9.o;
import h9.t;
import j9.j;
import j9.x;
import java.util.ArrayList;
import kotlin.jvm.internal.l;
import l8.n;
import u5.m;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements ViewModelProvider.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1097a;

    public /* synthetic */ i(int i) {
        this.f1097a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.util.List] */
    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel create(Class cls) {
        int i = this.f1097a;
        cls.getClass();
        switch (i) {
            case 0:
                m mVarF = m9.c.f();
                n nVarE = m9.c.e();
                u5.d googleVendorList$app_release = ChoiceCmp.INSTANCE.getGoogleVendorList$app_release();
                h8.i iVarA = m9.c.e().a();
                x xVar = (x) m9.c.f7868q.getValue();
                j9.h hVar = (j9.h) m9.c.f7865n.getValue();
                boolean z9 = m9.c.e().f7239n.f7211s.f7215a;
                h9.i iVarC = ((j9.f) m9.c.f7869r.getValue()).c();
                k6.c cVar = m9.c.g;
                if (cVar == null) {
                    cVar = new k6.c();
                }
                return new h(mVarF, nVarE, googleVendorList$app_release, iVarA, xVar, hVar, z9, iVarC, cVar, (j) m9.c.f7867p.getValue());
            case 1:
                l9.a aVar = (l9.a) m9.c.v.getValue();
                ChoiceCmpCallback callback = ChoiceCmp.INSTANCE.getCallback();
                k6.c cVar2 = m9.c.g;
                if (cVar2 == null) {
                    cVar2 = new k6.c();
                }
                return new l.c(aVar, callback, cVar2, m9.c.e());
            case 2:
                return new l6.c(m9.c.f(), m9.c.e(), (j9.f) m9.c.f7869r.getValue());
            case 3:
                return new n.e(m9.c.f(), m9.c.e(), m9.c.e().f7239n.f7212t, (j9.f) m9.c.f7869r.getValue(), m9.c.e().a(), m9.c.e().f7239n.i, m9.c.e().f7239n.f7203k, m9.c.e().f7239n.h, m9.c.e().f7239n.j);
            case 4:
                l9.a aVar2 = (l9.a) m9.c.v.getValue();
                ChoiceCmpCallback callback2 = ChoiceCmp.INSTANCE.getCallback();
                j9.f fVar = (j9.f) m9.c.f7869r.getValue();
                fVar.i();
                String str = fVar.g.f7261e;
                if (str.length() == 0) {
                    t tVar = fVar.f;
                    if (tVar == null) {
                        l.i("translationsText");
                        throw null;
                    }
                    str = tVar.f5607b.f5593c;
                }
                String str2 = str;
                ?? r22 = fVar.g.f;
                boolean zIsEmpty = r22.isEmpty();
                ?? r23 = r22;
                if (zIsEmpty) {
                    t tVar2 = fVar.f;
                    if (tVar2 == null) {
                        l.i("translationsText");
                        throw null;
                    }
                    r23 = tVar2.f5607b.f5594d;
                }
                ?? r15 = r23;
                String str3 = fVar.g.f7259c;
                if (str3.length() == 0) {
                    t tVar3 = fVar.f;
                    if (tVar3 == null) {
                        l.i("translationsText");
                        throw null;
                    }
                    str3 = tVar3.f5607b.g;
                }
                String str4 = str3;
                String str5 = fVar.g.f7260d;
                if (str5.length() == 0) {
                    t tVar4 = fVar.f;
                    if (tVar4 == null) {
                        l.i("translationsText");
                        throw null;
                    }
                    str5 = tVar4.f5607b.h;
                }
                String str6 = str5;
                String str7 = fVar.g.f7258b;
                if (str7.length() == 0) {
                    t tVar5 = fVar.f;
                    if (tVar5 == null) {
                        l.i("translationsText");
                        throw null;
                    }
                    str7 = tVar5.f5607b.f;
                }
                h9.b bVar = new h9.b(str2, str4, str6, str7, fVar.b(), r15);
                n nVarE2 = m9.c.e();
                f9.h hVar2 = (f9.h) m9.c.f7875y.getValue();
                k6.c cVar3 = m9.c.g;
                if (cVar3 == null) {
                    cVar3 = new k6.c();
                }
                return new o9.e(aVar2, callback2, bVar, nVarE2, hVar2, cVar3);
            case 5:
                return new q5.i(m9.c.d(), (j) m9.c.f7867p.getValue(), ChoiceCmp.INSTANCE.getCallback());
            case 6:
                m mVarF2 = m9.c.f();
                n nVarE3 = m9.c.e();
                u5.d googleVendorList$app_release2 = ChoiceCmp.INSTANCE.getGoogleVendorList$app_release();
                h8.i iVarA2 = m9.c.e().a();
                j9.h hVar3 = (j9.h) m9.c.f7865n.getValue();
                j9.f fVar2 = (j9.f) m9.c.f7869r.getValue();
                ArrayList arrayList = m9.c.e().f7239n.f7211s.f7217c;
                ?? r10 = m9.c.e().f7239n.f7203k;
                ?? r11 = m9.c.e().f7239n.h;
                ?? r12 = m9.c.e().f7239n.f7202e;
                k6.c cVar4 = m9.c.g;
                if (cVar4 == null) {
                    cVar4 = new k6.c();
                }
                return new s5.d(mVarF2, nVarE3, googleVendorList$app_release2, iVarA2, hVar3, fVar2, arrayList, r10, r11, r12, cVar4);
            case 7:
                j9.f fVar3 = (j9.f) m9.c.f7869r.getValue();
                fVar3.i();
                t tVar6 = fVar3.f;
                if (tVar6 != null) {
                    return new v5.c(new o(tVar6.f5606a.X, fVar3.b()));
                }
                l.i("translationsText");
                throw null;
            case 8:
                return new x5.e(m9.c.f(), (j9.i) m9.c.f7872u.getValue(), (j9.f) m9.c.f7869r.getValue());
            default:
                return new z5.d((j9.f) m9.c.f7869r.getValue(), m9.c.f(), m9.c.e(), ChoiceCmp.INSTANCE.getGoogleVendorList$app_release(), m9.c.e().a(), m9.c.e().f7239n.g, m9.c.e().f7239n.f7203k, m9.c.e().f7239n.h, m9.c.e().f7239n.j);
        }
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
        int i = this.f1097a;
        return androidx.lifecycle.l.b(this, cls, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(j7.c cVar, CreationExtras creationExtras) {
        int i = this.f1097a;
        return androidx.lifecycle.l.a(this, cVar, creationExtras);
    }
}
