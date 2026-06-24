package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements d7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f439b;

    public /* synthetic */ b(Object obj, int i) {
        this.f438a = i;
        this.f439b = obj;
    }

    @Override // d7.a
    public final Object invoke() {
        switch (this.f438a) {
            case 0:
                return CoroutineLiveData._init_$lambda$0((CoroutineLiveData) this.f439b);
            default:
                return SavedStateHandleSupport.getSavedStateHandlesVM((ViewModelStoreOwner) this.f439b);
        }
    }
}
