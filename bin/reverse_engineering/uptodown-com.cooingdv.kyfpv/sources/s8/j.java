package s8;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends n8.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9412b = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f9413l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q f9414m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(q qVar, Object[] objArr, int i, ArrayList arrayList) {
        super("OkHttp %s Push Request[%s]", objArr);
        this.f9414m = qVar;
        this.f9413l = i;
    }

    private final void b() {
        this.f9414m.f9437s.getClass();
        try {
            this.f9414m.A.i(this.f9413l, 6);
            synchronized (this.f9414m) {
                this.f9414m.C.remove(Integer.valueOf(this.f9413l));
            }
        } catch (IOException unused) {
        }
    }

    private final void c() {
        this.f9414m.f9437s.getClass();
        try {
            this.f9414m.A.i(this.f9413l, 6);
            synchronized (this.f9414m) {
                this.f9414m.C.remove(Integer.valueOf(this.f9413l));
            }
        } catch (IOException unused) {
        }
    }

    @Override // n8.a
    public final void a() {
        switch (this.f9412b) {
            case 0:
                b();
                return;
            case 1:
                c();
                return;
            default:
                this.f9414m.f9437s.getClass();
                synchronized (this.f9414m) {
                    this.f9414m.C.remove(Integer.valueOf(this.f9413l));
                    break;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(q qVar, Object[] objArr, int i, ArrayList arrayList, boolean z9) {
        super("OkHttp %s Push Headers[%s]", objArr);
        this.f9414m = qVar;
        this.f9413l = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(q qVar, Object[] objArr, int i, int i6) {
        super("OkHttp %s Push Reset[%s]", objArr);
        this.f9414m = qVar;
        this.f9413l = i;
    }
}
