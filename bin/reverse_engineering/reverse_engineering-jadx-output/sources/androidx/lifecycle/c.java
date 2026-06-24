package androidx.lifecycle;

import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.Transformations;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements d7.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediatorLiveData f441b;

    public /* synthetic */ c(MediatorLiveData mediatorLiveData, int i) {
        this.f440a = i;
        this.f441b = mediatorLiveData;
    }

    @Override // d7.l
    public final Object invoke(Object obj) {
        switch (this.f440a) {
            case 0:
                return CoroutineLiveDataKt.AnonymousClass2.invokeSuspend$lambda$0(this.f441b, obj);
            case 1:
                return Transformations.switchMap$lambda$0$0(this.f441b, obj);
            default:
                return Transformations.AnonymousClass2.onChanged$lambda$0(this.f441b, obj);
        }
    }
}
