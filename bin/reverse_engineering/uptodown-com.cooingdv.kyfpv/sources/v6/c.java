package v6;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends a {
    private final t6.h _context;
    private transient t6.c intercepted;

    public c(t6.c cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }

    @Override // t6.c
    public t6.h getContext() {
        t6.h hVar = this._context;
        hVar.getClass();
        return hVar;
    }

    public final t6.c intercepted() {
        t6.c cVarInterceptContinuation = this.intercepted;
        if (cVarInterceptContinuation == null) {
            t6.e eVar = (t6.e) getContext().get(t6.d.f10314a);
            if (eVar == null || (cVarInterceptContinuation = eVar.interceptContinuation(this)) == null) {
                cVarInterceptContinuation = this;
            }
            this.intercepted = cVarInterceptContinuation;
        }
        return cVarInterceptContinuation;
    }

    @Override // v6.a
    public void releaseIntercepted() {
        t6.c cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            t6.f fVar = getContext().get(t6.d.f10314a);
            fVar.getClass();
            ((t6.e) fVar).releaseInterceptedContinuation(cVar);
        }
        this.intercepted = b.f10856a;
    }

    public c(t6.c cVar, t6.h hVar) {
        super(cVar);
        this._context = hVar;
    }
}
