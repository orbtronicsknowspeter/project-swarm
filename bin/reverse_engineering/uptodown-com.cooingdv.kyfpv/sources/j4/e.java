package j4;

import a2.t;
import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.zip.ZipOutputStream;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends v6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f6588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f6589b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ZipOutputStream f6590l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f6591m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public BufferedInputStream f6592n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f6593o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f6594p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6595q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f6596r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6597s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6598t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f6599u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t f6600w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f6601x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(t tVar, v6.c cVar) {
        super(cVar);
        this.f6600w = tVar;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.f6601x |= Integer.MIN_VALUE;
        return this.f6600w.m(null, null, null, 0L, this);
    }
}
