package b5;

import android.content.Context;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import d7.p;
import j5.v;
import java.util.ArrayList;
import o7.a0;
import p6.x;
import x4.g2;
import x4.p2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends v6.i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1052a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f1053b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f1054l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, v vVar, t6.c cVar) {
        super(2, cVar);
        this.f1053b = mVar;
        this.f1054l = vVar;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f1052a) {
            case 0:
                return new k(this.f1054l, this.f1053b, cVar);
            default:
                return new k(this.f1053b, this.f1054l, cVar);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f1052a) {
        }
        return ((k) create(a0Var, cVar)).invokeSuspend(x.f8464a);
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String string;
        String string2;
        int i = this.f1052a;
        p2 p2Var = null;
        boolean z9 = true;
        m mVar = this.f1053b;
        v vVar = this.f1054l;
        switch (i) {
            case 0:
                p6.a.e(obj);
                x4.j jVar = (x4.j) mVar.f1063m;
                g2 g2VarP = vVar.p(jVar.f11225a, 10, 0);
                if (!g2VarP.b() && (str = g2VarP.f11204a) != null && str.length() != 0) {
                    ArrayList arrayListE = v.E(g2VarP);
                    try {
                        string = ((Context) mVar.f1061b).getString(R.string.the_latest_title);
                        string.getClass();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        string = "The latest";
                    }
                    x4.j jVar2 = new x4.j(-2, string, 4);
                    jVar2.f11230o = jVar.f11225a;
                    p2Var = new p2(jVar2, arrayListE, 4);
                    p2Var.f11332c = 1;
                    break;
                } else {
                    z9 = false;
                }
                return new d(p2Var, z9);
            default:
                p6.a.e(obj);
                x4.j jVar3 = (x4.j) mVar.f1063m;
                int i6 = jVar3.f11225a;
                g2 g2VarT = vVar.t(i6, i6 == 523 ? 8 : 10, 0);
                if (!g2VarT.b() && g2VarT.f11207d != null) {
                    ArrayList arrayListE2 = v.E(g2VarT);
                    try {
                        string2 = ((Context) mVar.f1061b).getString(R.string.top_downloads_title);
                        string2.getClass();
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        string2 = "Top Downloads";
                    }
                    x4.j jVar4 = new x4.j(-1, string2, 4);
                    jVar4.f11230o = jVar3.f11225a;
                    p2Var = new p2(jVar4, arrayListE2, 4);
                    if (jVar3.f11225a == 523) {
                        float f = UptodownApp.I;
                        p2Var.f11332c = 4;
                    } else {
                        p2Var.f11332c = 5;
                    }
                    break;
                } else {
                    z9 = false;
                }
                return new d(p2Var, z9);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(v vVar, m mVar, t6.c cVar) {
        super(2, cVar);
        this.f1054l = vVar;
        this.f1053b = mVar;
    }
}
