package com.google.gson.internal;

import com.google.android.gms.internal.measurement.o6;
import com.google.android.gms.internal.measurement.q6;
import j$.util.Objects;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f3227b;

    public /* synthetic */ j(AbstractMap abstractMap, int i) {
        this.f3226a = i;
        this.f3227b = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        switch (this.f3226a) {
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((o6) this.f3227b).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f3226a) {
            case 0:
                ((l) this.f3227b).clear();
                break;
            case 1:
                ((l) this.f3227b).clear();
                break;
            default:
                ((o6) this.f3227b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        k kVarA;
        switch (this.f3226a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                l lVar = (l) this.f3227b;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                k kVar = null;
                if (key != null) {
                    try {
                        kVarA = lVar.a(key, false);
                    } catch (ClassCastException unused) {
                        kVarA = null;
                    }
                    break;
                } else {
                    kVarA = null;
                }
                if (kVarA != null && Objects.equals(kVarA.f3235q, entry.getValue())) {
                    kVar = kVarA;
                }
                return kVar != null;
            case 1:
                return ((l) this.f3227b).containsKey(obj);
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj2 = ((o6) this.f3227b).get(entry2.getKey());
                Object value = entry2.getValue();
                if (obj2 != value) {
                    return obj2 != null && obj2.equals(value);
                }
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f3226a) {
            case 0:
                return new i((l) this.f3227b, 0);
            case 1:
                return new i((l) this.f3227b, 1);
            default:
                return new q6((o6) this.f3227b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        k kVarA;
        switch (this.f3226a) {
            case 0:
                l lVar = (l) this.f3227b;
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    k kVar = null;
                    if (key != null) {
                        try {
                            kVarA = lVar.a(key, false);
                        } catch (ClassCastException unused) {
                            kVarA = null;
                        }
                    } else {
                        kVarA = null;
                    }
                    if (kVarA != null && Objects.equals(kVarA.f3235q, entry.getValue())) {
                        kVar = kVarA;
                    }
                    if (kVar != null) {
                        lVar.d(kVar, true);
                        break;
                    }
                    break;
                }
                break;
            case 1:
                l lVar2 = (l) this.f3227b;
                k kVarA2 = null;
                if (obj != null) {
                    try {
                        kVarA2 = lVar2.a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (kVarA2 != null) {
                    lVar2.d(kVarA2, true);
                }
                if (kVarA2 != null) {
                }
                break;
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    ((o6) this.f3227b).remove(entry2.getKey());
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f3226a) {
            case 0:
                return ((l) this.f3227b).f3241m;
            case 1:
                return ((l) this.f3227b).f3241m;
            default:
                return ((o6) this.f3227b).size();
        }
    }
}
