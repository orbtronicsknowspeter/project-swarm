package androidx.savedstate.serialization;

import b8.e;
import d8.b0;
import d8.b1;
import d8.c;
import d8.c0;
import d8.f;
import d8.h0;
import d8.m;
import d8.q;
import d8.u0;
import d8.v;
import kotlin.jvm.internal.y;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class SavedStateCodecUtilsKt {
    private static final e booleanArrayDescriptor;
    private static final e charArrayDescriptor;
    private static final e doubleArrayDescriptor;
    private static final e floatArrayDescriptor;
    private static final e intArrayDescriptor;
    private static final e intListDescriptor;
    private static final e longArrayDescriptor;
    private static final e stringArrayDescriptor;
    private static final e stringListDescriptor;

    static {
        c0 c0Var = c0.f3625a;
        u0 u0Var = c0.f3626b;
        u0Var.getClass();
        intListDescriptor = new c(u0Var, 1);
        b1 b1Var = b1.f3622a;
        u0 u0Var2 = b1.f3623b;
        u0Var2.getClass();
        stringListDescriptor = new c(u0Var2, 1);
        booleanArrayDescriptor = f.f3641c.f3711b;
        charArrayDescriptor = m.f3674c.f3711b;
        doubleArrayDescriptor = q.f3694c.f3711b;
        floatArrayDescriptor = v.f3716c.f3711b;
        intArrayDescriptor = b0.f3621c.f3711b;
        longArrayDescriptor = h0.f3652c.f3711b;
        y.a(String.class);
        e descriptor = b1Var.getDescriptor();
        descriptor.getClass();
        stringArrayDescriptor = new c(descriptor, 0);
    }

    public static final e getBooleanArrayDescriptor() {
        return booleanArrayDescriptor;
    }

    public static final e getCharArrayDescriptor() {
        return charArrayDescriptor;
    }

    public static final e getDoubleArrayDescriptor() {
        return doubleArrayDescriptor;
    }

    public static final e getFloatArrayDescriptor() {
        return floatArrayDescriptor;
    }

    public static final e getIntArrayDescriptor() {
        return intArrayDescriptor;
    }

    public static final e getIntListDescriptor() {
        return intListDescriptor;
    }

    public static final e getLongArrayDescriptor() {
        return longArrayDescriptor;
    }

    public static final e getStringArrayDescriptor() {
        return stringArrayDescriptor;
    }

    public static final e getStringListDescriptor() {
        return stringListDescriptor;
    }

    public static /* synthetic */ void getStringArrayDescriptor$annotations() {
    }
}
