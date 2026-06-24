package j4;

import a2.t;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.v;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InputStream f6574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public OutputStream f6575b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[] f6576l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public v f6577m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f6578n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f6579o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f6580p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f6581q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f6582r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t f6583s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6584t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(t tVar, v6.c cVar) {
        super(cVar);
        this.f6583s = tVar;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        this.f6582r = obj;
        this.f6584t |= Integer.MIN_VALUE;
        return this.f6583s.d(null, null, this);
    }
}
