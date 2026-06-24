package r7;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class o0 extends s7.b implements c0, h, s7.i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9035n = AtomicReferenceFieldUpdater.newUpdater(o0.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f9036m;

    public o0(Object obj) {
        this._state$volatile = obj;
    }

    @Override // s7.i
    public final h a(t6.h hVar, int i, q7.a aVar) {
        return (((i < 0 || i >= 2) && i != -2) || aVar != q7.a.f8731b) ? k0.m(this, hVar, i, aVar) : this;
    }

    @Override // s7.b
    public final s7.d c() {
        return new p0();
    }

    /* JADX WARN: Path cross not found for [B:58:0x00f5, B:59:0x00f6], limit reached: 66 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007c, B:30:0x0084, B:33:0x008b, B:34:0x008f, B:36:0x0092, B:46:0x00b3, B:49:0x00c3, B:50:0x00df, B:56:0x00ef, B:53:0x00e6, B:55:0x00ec, B:38:0x0098, B:42:0x009f, B:21:0x0052, B:24:0x005c, B:27:0x006d), top: B:63:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007c, B:30:0x0084, B:33:0x008b, B:34:0x008f, B:36:0x0092, B:46:0x00b3, B:49:0x00c3, B:50:0x00df, B:56:0x00ef, B:53:0x00e6, B:55:0x00ec, B:38:0x0098, B:42:0x009f, B:21:0x0052, B:24:0x005c, B:27:0x006d), top: B:63:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c3 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007c, B:30:0x0084, B:33:0x008b, B:34:0x008f, B:36:0x0092, B:46:0x00b3, B:49:0x00c3, B:50:0x00df, B:56:0x00ef, B:53:0x00e6, B:55:0x00ec, B:38:0x0098, B:42:0x009f, B:21:0x0052, B:24:0x005c, B:27:0x006d), top: B:63:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00c2 -> B:28:0x007c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // r7.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(r7.i r18, t6.c r19) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.o0.collect(r7.i, t6.c):java.lang.Object");
    }

    @Override // s7.b
    public final s7.d[] d() {
        return new p0[2];
    }

    @Override // r7.b0, r7.i
    public final Object emit(Object obj, t6.c cVar) {
        f(obj);
        return p6.x.f8464a;
    }

    public final void f(Object obj) {
        if (obj == null) {
            obj = s7.c.f9350b;
        }
        g(null, obj);
    }

    public final boolean g(Object obj, Object obj2) {
        int i;
        s7.d[] dVarArr;
        f8.w wVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9035n;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !kotlin.jvm.internal.l.a(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.l.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i6 = this.f9036m;
            if ((i6 & 1) != 0) {
                this.f9036m = i6 + 2;
                return true;
            }
            int i10 = i6 + 1;
            this.f9036m = i10;
            s7.d[] dVarArr2 = this.f9346a;
            while (true) {
                p0[] p0VarArr = (p0[]) dVarArr2;
                if (p0VarArr != null) {
                    for (p0 p0Var : p0VarArr) {
                        if (p0Var != null) {
                            AtomicReference atomicReference = p0Var.f9042a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (wVar = k0.f9008c)) {
                                    f8.w wVar2 = k0.f9007b;
                                    if (obj4 != wVar2) {
                                        while (!atomicReference.compareAndSet(obj4, wVar2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((o7.l) obj4).resumeWith(p6.x.f8464a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, wVar)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.f9036m;
                    if (i == i10) {
                        this.f9036m = i10 + 1;
                        return true;
                    }
                    dVarArr = this.f9346a;
                }
                dVarArr2 = dVarArr;
                i10 = i;
            }
        }
    }

    @Override // r7.m0
    public final Object getValue() {
        f8.w wVar = s7.c.f9350b;
        Object obj = f9035n.get(this);
        if (obj == wVar) {
            return null;
        }
        return obj;
    }
}
