package w8;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f10948a = new b0(new byte[0], 0, 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f10949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f10950c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f10949b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f10950c = atomicReferenceArr;
    }

    public static final void a(b0 b0Var) {
        b0Var.getClass();
        if (b0Var.f != null || b0Var.g != null) {
            com.google.gson.internal.a.p("Failed requirement.");
            return;
        }
        if (b0Var.f10943d) {
            return;
        }
        AtomicReference atomicReference = f10950c[(int) (Thread.currentThread().getId() & (((long) f10949b) - 1))];
        b0 b0Var2 = f10948a;
        b0 b0Var3 = (b0) atomicReference.getAndSet(b0Var2);
        if (b0Var3 == b0Var2) {
            return;
        }
        int i = b0Var3 != null ? b0Var3.f10942c : 0;
        if (i >= 65536) {
            atomicReference.set(b0Var3);
            return;
        }
        b0Var.f = b0Var3;
        b0Var.f10941b = 0;
        b0Var.f10942c = i + 8192;
        atomicReference.set(b0Var);
    }

    public static final b0 b() {
        AtomicReference atomicReference = f10950c[(int) (Thread.currentThread().getId() & (((long) f10949b) - 1))];
        b0 b0Var = f10948a;
        b0 b0Var2 = (b0) atomicReference.getAndSet(b0Var);
        if (b0Var2 == b0Var) {
            return new b0();
        }
        if (b0Var2 == null) {
            atomicReference.set(null);
            return new b0();
        }
        atomicReference.set(b0Var2.f);
        b0Var2.f = null;
        b0Var2.f10942c = 0;
        return b0Var2;
    }
}
