package com.google.android.material.animation;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public interface TransformationCallback<T extends View> {
    void onScaleChanged(T t9);

    void onTranslationChanged(T t9);
}
