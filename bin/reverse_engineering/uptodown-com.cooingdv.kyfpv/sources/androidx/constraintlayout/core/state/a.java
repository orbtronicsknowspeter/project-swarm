package androidx.constraintlayout.core.state;

import com.google.gson.e;
import com.google.gson.internal.m;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Interpolator, m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f328b;

    public /* synthetic */ a(String str, int i) {
        this.f327a = i;
        this.f328b = str;
    }

    @Override // com.google.gson.internal.m
    public Object d() {
        switch (this.f327a) {
            case 1:
                throw new e(this.f328b);
            case 2:
                throw new e(this.f328b);
            default:
                throw new e(this.f328b);
        }
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public float getInterpolation(float f) {
        return Transition.lambda$getInterpolator$0(this.f328b, f);
    }
}
