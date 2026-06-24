package com.inmobi.cmp.core.cmpapi.status;

import androidx.annotation.Keep;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public enum EventStatus {
    TC_LOADED("tcloaded"),
    CMP_UI_SHOWN("cmpuishown"),
    USER_ACTION_COMPLETE("useractioncomplete");

    private final String value;

    EventStatus(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
