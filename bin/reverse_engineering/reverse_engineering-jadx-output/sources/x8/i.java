package x8;

import d7.p;
import java.io.IOException;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.x;
import w8.a0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f11570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f11571b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x f11572l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x f11573m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(a0 a0Var, x xVar, x xVar2, x xVar3) {
        super(2);
        this.f11570a = a0Var;
        this.f11571b = xVar;
        this.f11572l = xVar2;
        this.f11573m = xVar3;
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int iIntValue = ((Number) obj).intValue();
        long jLongValue = ((Number) obj2).longValue();
        if (iIntValue == 21589) {
            if (jLongValue < 1) {
                com.google.gson.internal.a.n("bad zip: extended timestamp extra too short");
                return null;
            }
            a0 a0Var = this.f11570a;
            byte b7 = a0Var.readByte();
            boolean z9 = (b7 & 1) == 1;
            boolean z10 = (b7 & 2) == 2;
            boolean z11 = (b7 & 4) == 4;
            long j = z9 ? 5L : 1L;
            if (z10) {
                j += 4;
            }
            if (z11) {
                j += 4;
            }
            if (jLongValue < j) {
                com.google.gson.internal.a.n("bad zip: extended timestamp extra too short");
                return null;
            }
            if (z9) {
                this.f11571b.f7024a = Long.valueOf(((long) a0Var.f()) * 1000);
            }
            if (z10) {
                this.f11572l.f7024a = Long.valueOf(((long) a0Var.f()) * 1000);
            }
            if (z11) {
                this.f11573m.f7024a = Long.valueOf(((long) a0Var.f()) * 1000);
            }
        }
        return p6.x.f8463a;
    }
}
