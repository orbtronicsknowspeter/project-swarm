package t1;

import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f9522b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Runnable f9523l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g5.g f9524m;

    public /* synthetic */ e(f fVar, Runnable runnable, g5.g gVar, int i) {
        this.f9521a = i;
        this.f9522b = fVar;
        this.f9523l = runnable;
        this.f9524m = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9521a) {
            case 0:
                ExecutorService executorService = this.f9522b.f9525a;
                final int i = 0;
                final Runnable runnable = this.f9523l;
                final g5.g gVar = this.f9524m;
                executorService.execute(new Runnable() { // from class: t1.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) gVar.f5316b).setException(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e11) {
                                    ((h) gVar.f5316b).setException(e11);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                h hVar = (h) gVar.f5316b;
                                try {
                                    runnable2.run();
                                    hVar.set(null);
                                    return;
                                } catch (Exception e12) {
                                    hVar.setException(e12);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ExecutorService executorService2 = this.f9522b.f9525a;
                final int i6 = 2;
                final Runnable runnable2 = this.f9523l;
                final g5.g gVar2 = this.f9524m;
                executorService2.execute(new Runnable() { // from class: t1.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i6) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) gVar2.f5316b).setException(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e11) {
                                    ((h) gVar2.f5316b).setException(e11);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                h hVar = (h) gVar2.f5316b;
                                try {
                                    runnable22.run();
                                    hVar.set(null);
                                    return;
                                } catch (Exception e12) {
                                    hVar.setException(e12);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ExecutorService executorService3 = this.f9522b.f9525a;
                final int i10 = 1;
                final Runnable runnable3 = this.f9523l;
                final g5.g gVar3 = this.f9524m;
                executorService3.execute(new Runnable() { // from class: t1.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i10) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) gVar3.f5316b).setException(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e11) {
                                    ((h) gVar3.f5316b).setException(e11);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                h hVar = (h) gVar3.f5316b;
                                try {
                                    runnable22.run();
                                    hVar.set(null);
                                    return;
                                } catch (Exception e12) {
                                    hVar.setException(e12);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
