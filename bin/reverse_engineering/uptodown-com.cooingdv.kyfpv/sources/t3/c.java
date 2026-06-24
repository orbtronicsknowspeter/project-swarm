package t3;

import java.util.function.IntSupplier;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements IntSupplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o3.d f9564b;

    public /* synthetic */ c(o3.d dVar, int i) {
        this.f9563a = i;
        this.f9564b = dVar;
    }

    @Override // java.util.function.IntSupplier
    public final int getAsInt() {
        switch (this.f9563a) {
        }
        return ((Integer) this.f9564b.f8151c).intValue();
    }
}
