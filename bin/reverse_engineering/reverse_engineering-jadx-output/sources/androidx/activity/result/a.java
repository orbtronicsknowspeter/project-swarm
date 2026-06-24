package androidx.activity.result;

import d7.l;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ActivityResultCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f298b;

    public /* synthetic */ a(int i, l lVar) {
        this.f297a = i;
        this.f298b = lVar;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(Object obj) {
        switch (this.f297a) {
            case 0:
                this.f298b.invoke(obj);
                break;
            default:
                this.f298b.invoke(obj);
                break;
        }
    }
}
