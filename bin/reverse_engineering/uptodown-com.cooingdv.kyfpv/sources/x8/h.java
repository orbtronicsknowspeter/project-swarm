package x8;

import d7.p;
import java.io.IOException;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import p6.x;
import w8.a0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f11565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f11566b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w f11567l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a0 f11568m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ w f11569n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ w f11570o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(u uVar, long j, w wVar, a0 a0Var, w wVar2, w wVar3) {
        super(2);
        this.f11565a = uVar;
        this.f11566b = j;
        this.f11567l = wVar;
        this.f11568m = a0Var;
        this.f11569n = wVar2;
        this.f11570o = wVar3;
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int iIntValue = ((Number) obj).intValue();
        long jLongValue = ((Number) obj2).longValue();
        if (iIntValue == 1) {
            u uVar = this.f11565a;
            if (uVar.f7022a) {
                com.google.gson.internal.a.n("bad zip: zip64 extra repeated");
                return null;
            }
            uVar.f7022a = true;
            if (jLongValue < this.f11566b) {
                com.google.gson.internal.a.n("bad zip: zip64 extra too short");
                return null;
            }
            w wVar = this.f11567l;
            long jH = wVar.f7024a;
            a0 a0Var = this.f11568m;
            if (jH == 4294967295L) {
                jH = a0Var.h();
            }
            wVar.f7024a = jH;
            w wVar2 = this.f11569n;
            wVar2.f7024a = wVar2.f7024a == 4294967295L ? a0Var.h() : 0L;
            w wVar3 = this.f11570o;
            wVar3.f7024a = wVar3.f7024a == 4294967295L ? a0Var.h() : 0L;
        }
        return x.f8464a;
    }
}
