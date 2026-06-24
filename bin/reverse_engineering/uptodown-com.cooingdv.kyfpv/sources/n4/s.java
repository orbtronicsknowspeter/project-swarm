package n4;

import android.widget.ProgressBar;
import java.util.ArrayList;
import o7.a0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class s extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g4.u f8012b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a2.n f8013l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ArrayList f8014m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f8015n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(g4.u uVar, a2.n nVar, ArrayList arrayList, String str, t6.c cVar, int i) {
        super(2, cVar);
        this.f8011a = i;
        this.f8012b = uVar;
        this.f8013l = nVar;
        this.f8014m = arrayList;
        this.f8015n = str;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f8011a) {
            case 0:
                return new s(this.f8012b, this.f8013l, this.f8014m, this.f8015n, cVar, 0);
            default:
                return new s(this.f8012b, this.f8013l, this.f8014m, this.f8015n, cVar, 1);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f8011a) {
            case 0:
                s sVar = (s) create(a0Var, cVar);
                p6.x xVar = p6.x.f8464a;
                sVar.invokeSuspend(xVar);
                return xVar;
            default:
                s sVar2 = (s) create(a0Var, cVar);
                p6.x xVar2 = p6.x.f8464a;
                sVar2.invokeSuspend(xVar2);
                return xVar2;
        }
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f8011a) {
            case 0:
                p6.a.e(obj);
                int size = (this.f8013l.f38b * 100) / this.f8014m.size();
                g4.u uVar = this.f8012b;
                ((ProgressBar) uVar.f5273q).setProgress(size);
                uVar.f5269m.setText(this.f8015n);
                break;
            default:
                p6.a.e(obj);
                int size2 = (this.f8013l.f38b * 100) / this.f8014m.size();
                g4.u uVar2 = this.f8012b;
                ((ProgressBar) uVar2.f5273q).setProgress(size2);
                uVar2.f5269m.setText(this.f8015n);
                break;
        }
        return p6.x.f8464a;
    }
}
