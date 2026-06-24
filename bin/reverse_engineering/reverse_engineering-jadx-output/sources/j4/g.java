package j4;

import androidx.documentfile.provider.DocumentFile;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DocumentFile f6603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DocumentFile f6604b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public DocumentFile[] f6605l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f6606m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f6607n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f6608o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ o f6609p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6610q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o oVar, v6.c cVar) {
        super(cVar);
        this.f6609p = oVar;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        this.f6608o = obj;
        this.f6610q |= Integer.MIN_VALUE;
        return this.f6609p.a(null, null, this);
    }
}
