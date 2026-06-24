package com.uptodown.util;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class NativeApiKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final NativeApiKey f3449a = new NativeApiKey();

    static {
        System.loadLibrary("uptodown-native");
    }

    public final native String getAuthApikey();
}
