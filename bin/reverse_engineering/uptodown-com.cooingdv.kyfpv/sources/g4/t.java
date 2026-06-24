package g4;

import com.uptodown.core.activities.FileExplorerActivity;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class t extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5260a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5261b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5262l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f5263m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f5264n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f5265o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(r7.h[] hVarArr, int i, AtomicInteger atomicInteger, q7.e eVar, t6.c cVar) {
        super(2, cVar);
        this.f5263m = hVarArr;
        this.f5262l = i;
        this.f5264n = atomicInteger;
        this.f5265o = eVar;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f5260a) {
            case 0:
                return new t((FileExplorerActivity) this.f5264n, (kotlin.jvm.internal.v) this.f5265o, cVar);
            default:
                return new t((r7.h[]) this.f5263m, this.f5262l, (AtomicInteger) this.f5264n, (q7.e) this.f5265o, cVar);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f5260a) {
        }
        return ((t) create(a0Var, cVar)).invokeSuspend(p6.x.f8464a);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00a8 -> B:45:0x00c1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00bd -> B:45:0x00c1). Please report as a decompilation issue!!! */
    @Override // v6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(FileExplorerActivity fileExplorerActivity, kotlin.jvm.internal.v vVar, t6.c cVar) {
        super(2, cVar);
        this.f5264n = fileExplorerActivity;
        this.f5265o = vVar;
    }
}
