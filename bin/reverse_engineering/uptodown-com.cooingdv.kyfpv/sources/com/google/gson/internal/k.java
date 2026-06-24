package com.google.gson.internal;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f3228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f3229b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public k f3230l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public k f3231m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public k f3232n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f3233o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f3234p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f3235q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3236r;

    public k(boolean z9, k kVar, Object obj, k kVar2, k kVar3) {
        this.f3228a = kVar;
        this.f3233o = obj;
        this.f3234p = z9;
        this.f3236r = 1;
        this.f3231m = kVar2;
        this.f3232n = kVar3;
        kVar3.f3231m = this;
        kVar2.f3232n = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f3233o;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f3235q;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f3233o;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f3235q;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f3233o;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f3235q;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f3234p) {
            a.i("value == null");
            return null;
        }
        Object obj2 = this.f3235q;
        this.f3235q = obj;
        return obj2;
    }

    public final String toString() {
        return this.f3233o + "=" + this.f3235q;
    }

    public k(boolean z9) {
        this.f3233o = null;
        this.f3234p = z9;
        this.f3232n = this;
        this.f3231m = this;
    }
}
