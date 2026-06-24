package l1;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7063b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f7064l;

    public h(Object obj) {
        super(0);
        this.f7064l = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f7063b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f7063b) {
            com.google.gson.internal.a.l();
            return null;
        }
        this.f7063b = true;
        return this.f7064l;
    }
}
