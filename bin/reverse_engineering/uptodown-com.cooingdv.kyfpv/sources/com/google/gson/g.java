package com.google.gson;

import com.google.gson.internal.l;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f3118a = new l(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof g) && ((g) obj).f3118a.equals(this.f3118a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f3118a.hashCode();
    }
}
