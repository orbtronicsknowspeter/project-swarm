package com.google.android.material.textfield;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EndIconDelegate f3055b;

    public /* synthetic */ b(EndIconDelegate endIconDelegate, int i) {
        this.f3054a = i;
        this.f3055b = endIconDelegate;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z9) {
        switch (this.f3054a) {
            case 0:
                ((ClearTextEndIconDelegate) this.f3055b).lambda$new$1(view, z9);
                break;
            default:
                ((DropdownMenuEndIconDelegate) this.f3055b).lambda$new$1(view, z9);
                break;
        }
    }
}
