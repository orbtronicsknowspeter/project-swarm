package com.inmobi.cmp.model;

import androidx.annotation.Keep;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public enum Regulations {
    USP("USP"),
    GDPR("GDPR"),
    MSPA("MSPA"),
    NA("NA");

    private final String value;

    Regulations(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
