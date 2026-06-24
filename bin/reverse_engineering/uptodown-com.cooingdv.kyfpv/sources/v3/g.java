package v3;

import java.util.Iterator;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f10844b;

    public /* synthetic */ g(h hVar, float f, int i) {
        this.f10843a = i;
        this.f10844b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10843a) {
            case 0:
                z3.f fVar = this.f10844b.f10845a;
                androidx.room.b bVar = fVar.f11944m;
                if (bVar != null) {
                    bVar.invoke(fVar.f11943l);
                    return;
                } else {
                    l.i("youTubePlayerInitListener");
                    throw null;
                }
            case 1:
                z3.f fVar2 = this.f10844b.f10845a;
                for (w3.a aVar : fVar2.getListeners()) {
                    e fVar3 = fVar2.getInstance();
                    aVar.getClass();
                    fVar3.getClass();
                }
                return;
            case 2:
                z3.f fVar4 = this.f10844b.f10845a;
                Iterator<T> it = fVar4.getListeners().iterator();
                while (it.hasNext()) {
                    ((w3.a) it.next()).e(fVar4.getInstance());
                }
                return;
            case 3:
                z3.f fVar5 = this.f10844b.f10845a;
                for (w3.a aVar2 : fVar5.getListeners()) {
                    e fVar6 = fVar5.getInstance();
                    aVar2.getClass();
                    fVar6.getClass();
                }
                return;
            case 4:
                z3.f fVar7 = this.f10844b.f10845a;
                for (w3.a aVar3 : fVar7.getListeners()) {
                    e fVar8 = fVar7.getInstance();
                    aVar3.getClass();
                    fVar8.getClass();
                }
                return;
            case 5:
                z3.f fVar9 = this.f10844b.f10845a;
                Iterator<T> it2 = fVar9.getListeners().iterator();
                while (it2.hasNext()) {
                    ((w3.a) it2.next()).c(fVar9.getInstance());
                }
                return;
            default:
                z3.f fVar10 = this.f10844b.f10845a;
                for (w3.a aVar4 : fVar10.getListeners()) {
                    e fVar11 = fVar10.getInstance();
                    aVar4.getClass();
                    fVar11.getClass();
                }
                return;
        }
    }

    public /* synthetic */ g(h hVar, int i) {
        this.f10843a = i;
        this.f10844b = hVar;
    }

    public /* synthetic */ g(h hVar, Enum r22, int i) {
        this.f10843a = i;
        this.f10844b = hVar;
    }
}
