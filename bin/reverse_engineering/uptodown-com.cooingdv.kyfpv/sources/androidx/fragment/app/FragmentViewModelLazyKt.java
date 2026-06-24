package androidx.fragment.app;

import androidx.annotation.MainThread;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import p6.f;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class FragmentViewModelLazyKt {

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    public static final class AnonymousClass1 extends m implements d7.a {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        @Override // d7.a
        public final ViewModelStore invoke() {
            FragmentActivity fragmentActivityRequireActivity = this.$this_activityViewModels.requireActivity();
            fragmentActivityRequireActivity.getClass();
            ViewModelStore viewModelStore = fragmentActivityRequireActivity.getViewModelStore();
            viewModelStore.getClass();
            return viewModelStore;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    public static final class AnonymousClass2 extends m implements d7.a {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        @Override // d7.a
        public final ViewModelProvider.Factory invoke() {
            FragmentActivity fragmentActivityRequireActivity = this.$this_activityViewModels.requireActivity();
            fragmentActivityRequireActivity.getClass();
            return fragmentActivityRequireActivity.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    public static final class C00512 extends m implements d7.a {
        final /* synthetic */ d7.a $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00512(d7.a aVar) {
            super(0);
            this.$ownerProducer = aVar;
        }

        @Override // d7.a
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = ((ViewModelStoreOwner) this.$ownerProducer.invoke()).getViewModelStore();
            viewModelStore.getClass();
            return viewModelStore;
        }
    }

    @MainThread
    public static final <VM extends ViewModel> f activityViewModels(Fragment fragment, d7.a aVar) {
        fragment.getClass();
        l.h();
        throw null;
    }

    public static f activityViewModels$default(Fragment fragment, d7.a aVar, int i, Object obj) {
        fragment.getClass();
        l.h();
        throw null;
    }

    @MainThread
    public static final <VM extends ViewModel> f createViewModelLazy(Fragment fragment, j7.c cVar, d7.a aVar, d7.a aVar2) {
        fragment.getClass();
        cVar.getClass();
        aVar.getClass();
        if (aVar2 == null) {
            aVar2 = new FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1(fragment);
        }
        return new ViewModelLazy(cVar, aVar, aVar2);
    }

    public static /* synthetic */ f createViewModelLazy$default(Fragment fragment, j7.c cVar, d7.a aVar, d7.a aVar2, int i, Object obj) {
        if ((i & 4) != 0) {
            aVar2 = null;
        }
        return createViewModelLazy(fragment, cVar, aVar, aVar2);
    }

    @MainThread
    public static final <VM extends ViewModel> f viewModels(Fragment fragment, d7.a aVar, d7.a aVar2) {
        fragment.getClass();
        aVar.getClass();
        l.h();
        throw null;
    }

    public static f viewModels$default(Fragment fragment, d7.a aVar, d7.a aVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = new C00501(fragment);
        }
        fragment.getClass();
        aVar.getClass();
        l.h();
        throw null;
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    public static final class C00501 extends m implements d7.a {
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00501(Fragment fragment) {
            super(0);
            this.$this_viewModels = fragment;
        }

        @Override // d7.a
        public final Fragment invoke() {
            return this.$this_viewModels;
        }
    }
}
