package c4;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k1 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1779b;

    public /* synthetic */ k1(Object obj, int i) {
        this.f1778a = i;
        this.f1779b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1778a) {
        }
        return ((Number) ((j1) this.f1779b).invoke(obj, obj2)).intValue();
    }
}
