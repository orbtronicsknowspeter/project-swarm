package androidx.datastore.core;

import d7.p;
import d7.q;
import p6.x;
import t6.c;
import v6.e;
import v6.i;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class StorageConnectionKt {

    /* JADX INFO: renamed from: androidx.datastore.core.StorageConnectionKt$writeData$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @e(c = "androidx.datastore.core.StorageConnectionKt$writeData$2", f = "StorageConnection.kt", l = {77}, m = "invokeSuspend")
    public static final class C00462 extends i implements p {
        final /* synthetic */ T $value;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00462(T t9, c cVar) {
            super(2, cVar);
            this.$value = t9;
        }

        @Override // v6.a
        public final c create(Object obj, c cVar) {
            C00462 c00462 = new C00462(this.$value, cVar);
            c00462.L$0 = obj;
            return c00462;
        }

        @Override // d7.p
        public final Object invoke(WriteScope<T> writeScope, c cVar) {
            return ((C00462) create(writeScope, cVar)).invokeSuspend(x.f8463a);
        }

        @Override // v6.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                p6.a.e(obj);
                WriteScope writeScope = (WriteScope) this.L$0;
                T t9 = this.$value;
                this.label = 1;
                Object objWriteData = writeScope.writeData(t9, this);
                u6.a aVar = u6.a.f10762a;
                if (objWriteData == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p6.a.e(obj);
            }
            return x.f8463a;
        }
    }

    public static final <T> Object readData(StorageConnection<T> storageConnection, c cVar) {
        return storageConnection.readScope(new AnonymousClass2(null), cVar);
    }

    public static final <T> Object writeData(StorageConnection<T> storageConnection, T t9, c cVar) {
        Object objWriteScope = storageConnection.writeScope(new C00462(t9, null), cVar);
        return objWriteScope == u6.a.f10762a ? objWriteScope : x.f8463a;
    }

    /* JADX INFO: renamed from: androidx.datastore.core.StorageConnectionKt$readData$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @e(c = "androidx.datastore.core.StorageConnectionKt$readData$2", f = "StorageConnection.kt", l = {74}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements q {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(c cVar) {
            super(3, cVar);
        }

        @Override // d7.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((ReadScope) obj, ((Boolean) obj2).booleanValue(), (c) obj3);
        }

        @Override // v6.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    p6.a.e(obj);
                    return obj;
                }
                androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p6.a.e(obj);
            ReadScope readScope = (ReadScope) this.L$0;
            this.label = 1;
            Object data = readScope.readData(this);
            u6.a aVar = u6.a.f10762a;
            return data == aVar ? aVar : data;
        }

        public final Object invoke(ReadScope<T> readScope, boolean z9, c cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar);
            anonymousClass2.L$0 = readScope;
            return anonymousClass2.invokeSuspend(x.f8463a);
        }
    }
}
