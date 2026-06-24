package o9;

import androidx.lifecycle.ViewModel;
import com.inmobi.cmp.ChoiceCmpCallback;
import f9.h;
import l8.n;
import l8.r;
import q6.l;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l9.a f8381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChoiceCmpCallback f8382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h9.b f8383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f8384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f8385e;
    public final k6.c f;

    public e(l9.a aVar, ChoiceCmpCallback choiceCmpCallback, h9.b bVar, n nVar, h hVar, k6.c cVar) {
        aVar.getClass();
        hVar.getClass();
        this.f8381a = aVar;
        this.f8382b = choiceCmpCallback;
        this.f8383c = bVar;
        this.f8384d = nVar;
        this.f8385e = hVar;
        this.f = cVar;
    }

    public final String a() {
        r rVar;
        n nVar = this.f8384d;
        return (nVar == null || (rVar = nVar.f7244r) == null) ? "" : rVar.f7261d;
    }

    public final String b() {
        h9.b bVar = this.f8383c;
        return !bVar.f5490b.isEmpty() ? (String) l.q0(bVar.f5490b) : "";
    }

    public final String c() {
        r rVar;
        n nVar = this.f8384d;
        return (nVar == null || (rVar = nVar.f7244r) == null) ? "" : rVar.f7260c;
    }

    public final String d() {
        r rVar;
        n nVar = this.f8384d;
        return (nVar == null || (rVar = nVar.f7244r) == null) ? "" : rVar.f7259b;
    }
}
