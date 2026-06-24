package j$.sun.misc;

import j$.util.concurrent.l;
import j$.util.concurrent.q;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f5727b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f5728a;

    static {
        Field fieldG = g();
        fieldG.setAccessible(true);
        try {
            f5727b = new a((Unsafe) fieldG.get(null));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("Couldn't get the Unsafe", e10);
        }
    }

    public a(Unsafe unsafe) {
        this.f5728a = unsafe;
    }

    public static Field g() {
        try {
            return Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e10) {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                    return field;
                }
            }
            throw new AssertionError("Couldn't find the Unsafe", e10);
        }
    }

    public final int e(q qVar, long j) {
        while (true) {
            int intVolatile = this.f5728a.getIntVolatile(qVar, j);
            q qVar2 = qVar;
            long j6 = j;
            if (this.f5728a.compareAndSwapInt(qVar2, j6, intVolatile, intVolatile - 4)) {
                return intVolatile;
            }
            qVar = qVar2;
            j = j6;
        }
    }

    public final long i(Field field) {
        return this.f5728a.objectFieldOffset(field);
    }

    public final long h(Class cls, String str) {
        try {
            return i(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e10) {
            throw new AssertionError("Cannot find field:", e10);
        }
    }

    public final int a(Class cls) {
        return this.f5728a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f5728a.arrayIndexScale(cls);
    }

    public final Object f(Object obj, long j) {
        return this.f5728a.getObjectVolatile(obj, j);
    }

    public final void j(Object obj, long j, l lVar) {
        this.f5728a.putObjectVolatile(obj, j, lVar);
    }

    public final boolean c(Object obj, long j, int i, int i6) {
        return this.f5728a.compareAndSwapInt(obj, j, i, i6);
    }

    public final boolean d(Object obj, long j, long j6, long j10) {
        return this.f5728a.compareAndSwapLong(obj, j, j6, j10);
    }
}
