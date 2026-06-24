package androidx.lifecycle;

import android.annotation.SuppressLint;
import d7.p;
import o7.a0;
import o7.c0;
import o7.m0;
import p6.x;
import t7.n;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class LiveDataScopeImpl<T> implements LiveDataScope<T> {
    private final t6.h coroutineContext;
    private CoroutineLiveData<T> target;

    /* JADX INFO: renamed from: androidx.lifecycle.LiveDataScopeImpl$emit$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @v6.e(c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", f = "CoroutineLiveData.kt", l = {100}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass2 extends v6.i implements p {
        final /* synthetic */ T $value;
        int label;
        final /* synthetic */ LiveDataScopeImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(LiveDataScopeImpl<T> liveDataScopeImpl, T t9, t6.c cVar) {
            super(2, cVar);
            this.this$0 = liveDataScopeImpl;
            this.$value = t9;
        }

        @Override // v6.a
        public final t6.c create(Object obj, t6.c cVar) {
            return new AnonymousClass2(this.this$0, this.$value, cVar);
        }

        @Override // d7.p
        public final Object invoke(a0 a0Var, t6.c cVar) {
            return ((AnonymousClass2) create(a0Var, cVar)).invokeSuspend(x.f8464a);
        }

        @Override // v6.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                p6.a.e(obj);
                CoroutineLiveData<T> target$lifecycle_livedata = this.this$0.getTarget$lifecycle_livedata();
                this.label = 1;
                Object objClearSource$lifecycle_livedata = target$lifecycle_livedata.clearSource$lifecycle_livedata(this);
                u6.a aVar = u6.a.f10763a;
                if (objClearSource$lifecycle_livedata == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p6.a.e(obj);
            }
            this.this$0.getTarget$lifecycle_livedata().setValue(this.$value);
            return x.f8464a;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LiveDataScopeImpl$emitSource$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @v6.e(c = "androidx.lifecycle.LiveDataScopeImpl$emitSource$2", f = "CoroutineLiveData.kt", l = {94}, m = "invokeSuspend", v = 1)
    public static final class C00562 extends v6.i implements p {
        final /* synthetic */ LiveData<T> $source;
        int label;
        final /* synthetic */ LiveDataScopeImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00562(LiveDataScopeImpl<T> liveDataScopeImpl, LiveData<T> liveData, t6.c cVar) {
            super(2, cVar);
            this.this$0 = liveDataScopeImpl;
            this.$source = liveData;
        }

        @Override // v6.a
        public final t6.c create(Object obj, t6.c cVar) {
            return new C00562(this.this$0, this.$source, cVar);
        }

        @Override // d7.p
        public final Object invoke(a0 a0Var, t6.c cVar) {
            return ((C00562) create(a0Var, cVar)).invokeSuspend(x.f8464a);
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
            CoroutineLiveData<T> target$lifecycle_livedata = this.this$0.getTarget$lifecycle_livedata();
            LiveData<T> liveData = this.$source;
            this.label = 1;
            Object objEmitSource$lifecycle_livedata = target$lifecycle_livedata.emitSource$lifecycle_livedata(liveData, this);
            u6.a aVar = u6.a.f10763a;
            return objEmitSource$lifecycle_livedata == aVar ? aVar : objEmitSource$lifecycle_livedata;
        }
    }

    public LiveDataScopeImpl(CoroutineLiveData<T> coroutineLiveData, t6.h hVar) {
        coroutineLiveData.getClass();
        hVar.getClass();
        this.target = coroutineLiveData;
        v7.e eVar = m0.f8289a;
        this.coroutineContext = hVar.plus(n.f10349a.f8469l);
    }

    @Override // androidx.lifecycle.LiveDataScope
    @SuppressLint({"NullSafeMutableLiveData"})
    public Object emit(T t9, t6.c cVar) throws Throwable {
        Object objC = c0.C(new AnonymousClass2(this, t9, null), this.coroutineContext, cVar);
        return objC == u6.a.f10763a ? objC : x.f8464a;
    }

    @Override // androidx.lifecycle.LiveDataScope
    public Object emitSource(LiveData<T> liveData, t6.c cVar) {
        return c0.C(new C00562(this, liveData, null), this.coroutineContext, cVar);
    }

    @Override // androidx.lifecycle.LiveDataScope
    public T getLatestValue() {
        return this.target.getValue();
    }

    public final CoroutineLiveData<T> getTarget$lifecycle_livedata() {
        return this.target;
    }

    public final void setTarget$lifecycle_livedata(CoroutineLiveData<T> coroutineLiveData) {
        coroutineLiveData.getClass();
        this.target = coroutineLiveData;
    }
}
