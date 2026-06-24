package com.google.android.material.timepicker;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3066b;

    public /* synthetic */ b(Object obj, int i) {
        this.f3065a = i;
        this.f3066b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3065a) {
            case 0:
                ((RadialViewGroup) this.f3066b).updateLayoutParams();
                break;
            default:
                ((MaterialTimePicker) this.f3066b).lambda$onViewCreated$0();
                break;
        }
    }
}
