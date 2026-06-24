package j4;

import androidx.documentfile.provider.DocumentFile;
import java.io.File;
import java.util.Iterator;
import o7.a0;
import p6.x;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f6603b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(o oVar, t6.c cVar, int i) {
        super(2, cVar);
        this.f6602a = i;
        this.f6603b = oVar;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f6602a) {
            case 0:
                return new f(this.f6603b, cVar, 0);
            case 1:
                return new f(this.f6603b, cVar, 1);
            case 2:
                return new f(this.f6603b, cVar, 2);
            default:
                return new f(this.f6603b, cVar, 3);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f6602a) {
        }
        return ((f) create(a0Var, cVar)).invokeSuspend(x.f8464a);
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f6602a) {
            case 0:
                p6.a.e(obj);
                Iterator it = this.f6603b.f6651a.iterator();
                it.getClass();
                long jH = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    jH += next instanceof File ? o.h((File) next) : next instanceof DocumentFile ? o.g((DocumentFile) next) : 0L;
                }
                return new Long(jH);
            case 1:
                p6.a.e(obj);
                k4.a aVar = this.f6603b.f6653c;
                if (aVar == null) {
                    return null;
                }
                aVar.y();
                return x.f8464a;
            case 2:
                p6.a.e(obj);
                if (this.f6603b.f6653c != null) {
                    return x.f8464a;
                }
                return null;
            default:
                p6.a.e(obj);
                if (this.f6603b.f6653c != null) {
                    return x.f8464a;
                }
                return null;
        }
    }
}
