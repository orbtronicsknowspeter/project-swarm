package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class g7 extends h7 implements Consumer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f6208b;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public g7(int i) {
        this.f6208b = new Object[i];
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f6218a;
        this.f6218a = i + 1;
        this.f6208b[i] = obj;
    }
}
