package j4;

import java.util.Iterator;
import kotlin.jvm.internal.x;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x f6637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f6638b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f6639l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o f6640m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f6641n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, v6.c cVar) {
        super(cVar);
        this.f6640m = oVar;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        this.f6639l = obj;
        this.f6641n |= Integer.MIN_VALUE;
        return this.f6640m.d(null, null, this);
    }
}
