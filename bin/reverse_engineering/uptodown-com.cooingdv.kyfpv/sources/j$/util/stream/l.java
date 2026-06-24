package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends i5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6270b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f6272d;

    public /* synthetic */ l(m5 m5Var) {
        super(m5Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i8 i8Var, m5 m5Var) {
        super(m5Var);
        this.f6272d = i8Var;
        this.f6271c = true;
    }

    @Override // j$.util.stream.i5, j$.util.stream.m5
    public final void c(long j) {
        switch (this.f6270b) {
            case 0:
                this.f6271c = false;
                this.f6272d = null;
                this.f6225a.c(-1L);
                break;
            case 1:
                this.f6225a.c(-1L);
                break;
            default:
                this.f6225a.c(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) throws Exception {
        switch (this.f6270b) {
            case 0:
                m5 m5Var = this.f6225a;
                if (obj == null) {
                    if (this.f6271c) {
                        return;
                    }
                    this.f6271c = true;
                    this.f6272d = null;
                    m5Var.n((Object) null);
                    return;
                }
                Object obj2 = this.f6272d;
                if (obj2 == null || !obj.equals(obj2)) {
                    this.f6272d = obj;
                    m5Var.n(obj);
                    return;
                }
                return;
            case 1:
                Stream stream = (Stream) ((j$.util.q) ((r) this.f6272d).f6337m).apply(obj);
                if (stream != null) {
                    try {
                        boolean z9 = this.f6271c;
                        m5 m5Var2 = this.f6225a;
                        if (!z9) {
                            ((Stream) stream.sequential()).forEach(m5Var2);
                        } else {
                            Spliterator spliterator = ((Stream) stream.sequential()).spliterator();
                            while (!m5Var2.e() && spliterator.tryAdvance(m5Var2)) {
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            stream.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    break;
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
            default:
                if (this.f6271c) {
                    boolean zTest = ((i8) this.f6272d).f6232m.test(obj);
                    this.f6271c = zTest;
                    if (zTest) {
                        this.f6225a.n(obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.i5, j$.util.stream.m5
    public boolean e() {
        switch (this.f6270b) {
            case 1:
                this.f6271c = true;
                return this.f6225a.e();
            case 2:
                return !this.f6271c || this.f6225a.e();
            default:
                return super.e();
        }
    }

    @Override // j$.util.stream.i5, j$.util.stream.m5
    public void end() {
        switch (this.f6270b) {
            case 0:
                this.f6271c = false;
                this.f6272d = null;
                this.f6225a.end();
                break;
            default:
                super.end();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r rVar, m5 m5Var) {
        super(m5Var);
        this.f6272d = rVar;
    }
}
