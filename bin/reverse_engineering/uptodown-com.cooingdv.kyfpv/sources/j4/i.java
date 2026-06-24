package j4;

import androidx.documentfile.provider.DocumentFile;
import o7.a0;
import p6.x;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DocumentFile f6616b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o f6617l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(DocumentFile documentFile, o oVar, t6.c cVar, int i) {
        super(2, cVar);
        this.f6615a = i;
        this.f6616b = documentFile;
        this.f6617l = oVar;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f6615a) {
            case 0:
                return new i(this.f6616b, this.f6617l, cVar, 0);
            case 1:
                return new i(this.f6616b, this.f6617l, cVar, 1);
            case 2:
                return new i(this.f6617l, this.f6616b, cVar, 2);
            default:
                return new i(this.f6617l, this.f6616b, cVar, 3);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f6615a) {
            case 0:
                i iVar = (i) create(a0Var, cVar);
                x xVar = x.f8464a;
                iVar.invokeSuspend(xVar);
                break;
            case 1:
                i iVar2 = (i) create(a0Var, cVar);
                x xVar2 = x.f8464a;
                iVar2.invokeSuspend(xVar2);
                break;
        }
        return ((i) create(a0Var, cVar)).invokeSuspend(x.f8464a);
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        k4.a aVar;
        k4.a aVar2;
        switch (this.f6615a) {
            case 0:
                p6.a.e(obj);
                DocumentFile documentFile = this.f6616b;
                if (documentFile != null && (aVar = this.f6617l.f6653c) != null) {
                    aVar.x(documentFile);
                }
                break;
            case 1:
                p6.a.e(obj);
                DocumentFile documentFile2 = this.f6616b;
                if (documentFile2 != null && (aVar2 = this.f6617l.f6653c) != null) {
                    aVar2.x(documentFile2);
                }
                break;
            case 2:
                p6.a.e(obj);
                k4.a aVar3 = this.f6617l.f6653c;
                if (aVar3 != null) {
                    aVar3.n(this.f6616b);
                }
                break;
            default:
                p6.a.e(obj);
                k4.a aVar4 = this.f6617l.f6653c;
                if (aVar4 != null) {
                    aVar4.f(this.f6616b);
                }
                break;
        }
        return x.f8464a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(o oVar, DocumentFile documentFile, t6.c cVar, int i) {
        super(2, cVar);
        this.f6615a = i;
        this.f6617l = oVar;
        this.f6616b = documentFile;
    }
}
