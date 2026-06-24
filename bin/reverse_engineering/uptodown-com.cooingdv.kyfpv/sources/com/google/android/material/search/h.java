package com.google.android.material.search;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f3031b;

    public /* synthetic */ h(SearchView searchView, int i) {
        this.f3030a = i;
        this.f3031b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3030a) {
            case 0:
                this.f3031b.lambda$requestFocusAndShowKeyboard$8();
                break;
            case 1:
                this.f3031b.show();
                break;
            case 2:
                this.f3031b.lambda$clearFocusAndHideKeyboard$9();
                break;
            default:
                this.f3031b.requestFocusAndShowKeyboardIfNeeded();
                break;
        }
    }
}
