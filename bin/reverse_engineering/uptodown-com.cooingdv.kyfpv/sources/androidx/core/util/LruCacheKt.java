package androidx.core.util;

import android.util.LruCache;
import d7.l;
import d7.p;
import d7.r;
import kotlin.jvm.internal.m;
import p6.x;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class LruCacheKt {

    /* JADX INFO: renamed from: androidx.core.util.LruCacheKt$lruCache$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    public static final class AnonymousClass1 extends m implements p {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // d7.p
        public final Integer invoke(Object obj, Object obj2) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: androidx.core.util.LruCacheKt$lruCache$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    public static final class AnonymousClass2 extends m implements l {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // d7.l
        public final Object invoke(Object obj) {
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: renamed from: androidx.core.util.LruCacheKt$lruCache$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    public static final class AnonymousClass4<K, V> extends LruCache<K, V> {
        final /* synthetic */ l $create;
        final /* synthetic */ r $onEntryRemoved;
        final /* synthetic */ p $sizeOf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(int i, p pVar, l lVar, r rVar) {
            super(i);
            this.$sizeOf = pVar;
            this.$create = lVar;
            this.$onEntryRemoved = rVar;
        }

        @Override // android.util.LruCache
        public V create(K k5) {
            return (V) this.$create.invoke(k5);
        }

        @Override // android.util.LruCache
        public void entryRemoved(boolean z9, K k5, V v, V v9) {
            this.$onEntryRemoved.invoke(Boolean.valueOf(z9), k5, v, v9);
        }

        @Override // android.util.LruCache
        public int sizeOf(K k5, V v) {
            return ((Number) this.$sizeOf.invoke(k5, v)).intValue();
        }
    }

    public static final <K, V> LruCache<K, V> lruCache(int i, p pVar, l lVar, r rVar) {
        return new AnonymousClass4(i, pVar, lVar, rVar);
    }

    public static /* synthetic */ LruCache lruCache$default(int i, p pVar, l lVar, r rVar, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            pVar = AnonymousClass1.INSTANCE;
        }
        if ((i6 & 4) != 0) {
            lVar = AnonymousClass2.INSTANCE;
        }
        if ((i6 & 8) != 0) {
            rVar = AnonymousClass3.INSTANCE;
        }
        return new AnonymousClass4(i, pVar, lVar, rVar);
    }

    /* JADX INFO: renamed from: androidx.core.util.LruCacheKt$lruCache$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    public static final class AnonymousClass3 extends m implements r {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(4);
        }

        @Override // d7.r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke(((Boolean) obj).booleanValue(), obj2, obj3, obj4);
            return x.f8464a;
        }

        public final void invoke(boolean z9, Object obj, Object obj2, Object obj3) {
        }
    }
}
