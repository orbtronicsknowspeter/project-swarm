package androidx.collection;

import com.google.android.gms.internal.measurement.i5;
import d7.p;
import e7.a;
import java.util.Iterator;
import java.util.Map;
import p6.x;
import t6.c;
import v6.e;
import v6.h;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class MutableScatterMap$MutableMapWrapper$entries$1$iterator$1<K, V> implements Iterator<Map.Entry<K, V>>, a {
    private int current = -1;
    private Iterator<? extends Map.Entry<K, V>> iterator;
    final /* synthetic */ MutableScatterMap<K, V> this$0;

    /* JADX INFO: renamed from: androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @e(c = "androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1", f = "ScatterMap.kt", l = {1328}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends h implements p {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ MutableScatterMap<K, V> this$0;
        final /* synthetic */ MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 this$1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableScatterMap mutableScatterMap, MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 mutableScatterMap$MutableMapWrapper$entries$1$iterator$1, c cVar) {
            super(2, cVar);
            this.this$0 = mutableScatterMap;
            this.this$1 = mutableScatterMap$MutableMapWrapper$entries$1$iterator$1;
        }

        @Override // v6.a
        public final c create(Object obj, c cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.this$1, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // d7.p
        public final Object invoke(k7.h hVar, c cVar) {
            return ((AnonymousClass1) create(hVar, cVar)).invokeSuspend(x.f8463a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0053 -> B:22:0x00ad). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0055 -> B:14:0x0069). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0072 -> B:19:0x00a1). Please report as a decompilation issue!!! */
        @Override // v6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r0 = r20
                int r1 = r0.label
                r2 = 0
                r3 = 8
                r4 = 1
                if (r1 == 0) goto L32
                if (r1 != r4) goto L2b
                int r1 = r0.I$3
                int r5 = r0.I$2
                long r6 = r0.J$0
                int r8 = r0.I$1
                int r9 = r0.I$0
                java.lang.Object r10 = r0.L$3
                long[] r10 = (long[]) r10
                java.lang.Object r11 = r0.L$2
                androidx.collection.MutableScatterMap r11 = (androidx.collection.MutableScatterMap) r11
                java.lang.Object r12 = r0.L$1
                androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 r12 = (androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1) r12
                java.lang.Object r13 = r0.L$0
                k7.h r13 = (k7.h) r13
                p6.a.e(r21)
                goto La1
            L2b:
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                androidx.privacysandbox.ads.adservices.customaudience.a.i(r1)
                r1 = 0
                return r1
            L32:
                p6.a.e(r21)
                java.lang.Object r1 = r0.L$0
                k7.h r1 = (k7.h) r1
                androidx.collection.MutableScatterMap<K, V> r5 = r0.this$0
                androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 r6 = r0.this$1
                long[] r7 = r5.metadata
                int r8 = r7.length
                int r8 = r8 + (-2)
                if (r8 < 0) goto Lb2
                r9 = r2
            L45:
                r10 = r7[r9]
                long r12 = ~r10
                r14 = 7
                long r12 = r12 << r14
                long r12 = r12 & r10
                r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r12 = r12 & r14
                int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r12 == 0) goto Lad
                int r12 = r9 - r8
                int r12 = ~r12
                int r12 = r12 >>> 31
                int r12 = 8 - r12
                r13 = r9
                r9 = r8
                r8 = r13
                r13 = r1
                r1 = r2
                r18 = r10
                r11 = r5
                r10 = r7
                r5 = r12
                r12 = r6
                r6 = r18
            L69:
                if (r1 >= r5) goto La4
                r14 = 255(0xff, double:1.26E-321)
                long r14 = r14 & r6
                r16 = 128(0x80, double:6.3E-322)
                int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r14 >= 0) goto La1
                int r2 = r8 << 3
                int r2 = r2 + r1
                r12.setCurrent(r2)
                androidx.collection.MutableMapEntry r2 = new androidx.collection.MutableMapEntry
                java.lang.Object[] r3 = r11.keys
                java.lang.Object[] r14 = r11.values
                int r15 = r12.getCurrent()
                r2.<init>(r3, r14, r15)
                r0.L$0 = r13
                r0.L$1 = r12
                r0.L$2 = r11
                r0.L$3 = r10
                r0.I$0 = r9
                r0.I$1 = r8
                r0.J$0 = r6
                r0.I$2 = r5
                r0.I$3 = r1
                r0.label = r4
                r13.a(r2, r0)
                u6.a r1 = u6.a.f10762a
                return r1
            La1:
                long r6 = r6 >> r3
                int r1 = r1 + r4
                goto L69
            La4:
                if (r5 != r3) goto Lb2
                r1 = r9
                r9 = r8
                r8 = r1
                r7 = r10
                r5 = r11
                r6 = r12
                r1 = r13
            Lad:
                if (r9 == r8) goto Lb2
                int r9 = r9 + 1
                goto L45
            Lb2:
                p6.x r1 = p6.x.f8463a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public MutableScatterMap$MutableMapWrapper$entries$1$iterator$1(MutableScatterMap<K, V> mutableScatterMap) {
        this.this$0 = mutableScatterMap;
        this.iterator = i5.z(new AnonymousClass1(mutableScatterMap, this, null));
    }

    public final int getCurrent() {
        return this.current;
    }

    public final Iterator<Map.Entry<K, V>> getIterator() {
        return this.iterator;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public Map.Entry<K, V> next() {
        return this.iterator.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        int i = this.current;
        if (i != -1) {
            this.this$0.removeValueAt(i);
            this.current = -1;
        }
    }

    public final void setCurrent(int i) {
        this.current = i;
    }

    public final void setIterator(Iterator<? extends Map.Entry<K, V>> it) {
        it.getClass();
        this.iterator = it;
    }
}
