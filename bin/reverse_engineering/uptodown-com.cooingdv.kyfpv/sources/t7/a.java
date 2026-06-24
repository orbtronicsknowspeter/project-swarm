package t7;

import c4.j1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f8.w f10316a = new f8.w("CLOSED");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f8.w f10317b = new f8.w("UNDEFINED");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f8.w f10318c = new f8.w("REUSABLE_CLAIMED");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f8.w f10319d = new f8.w("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j1 f10320e = new j1(15);
    public static final j1 f = new j1(16);
    public static final j1 g = new j1(17);

    public static final void a(int i) {
        if (i >= 1) {
            return;
        }
        s1.o.o(androidx.lifecycle.l.u(i, "Expected positive parallelism level, but got "));
    }

    public static final Object b(s sVar, long j, d7.p pVar) {
        while (true) {
            if (sVar.f10356c >= j && !sVar.d()) {
                return sVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f10321a;
            Object obj = atomicReferenceFieldUpdater.get(sVar);
            f8.w wVar = f10316a;
            if (obj == wVar) {
                return wVar;
            }
            s sVar2 = (s) ((b) obj);
            if (sVar2 == null) {
                sVar2 = (s) pVar.invoke(Long.valueOf(sVar.f10356c + 1), sVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(sVar, null, sVar2)) {
                    if (atomicReferenceFieldUpdater.get(sVar) != null) {
                        break;
                    }
                }
                if (sVar.d()) {
                    sVar.e();
                }
            }
            sVar = sVar2;
        }
    }

    public static final s c(Object obj) {
        if (obj != f10316a) {
            return (s) obj;
        }
        androidx.privacysandbox.ads.adservices.customaudience.a.i("Does not contain segment");
        return null;
    }

    public static final void d(Throwable th, t6.h hVar) {
        Throwable runtimeException;
        Iterator it = d.f10324a.iterator();
        while (it.hasNext()) {
            try {
                ((o7.y) it.next()).n(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    p6.a.a(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            p6.a.a(th, new e(hVar));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static final boolean e(Object obj) {
        return obj == f10316a;
    }

    public static final Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void g(t6.h hVar, Object obj) {
        if (obj == f10319d) {
            return;
        }
        if (!(obj instanceof y)) {
            Object objFold = hVar.fold(null, f);
            objFold.getClass();
            ((v) objFold).f10360b.set(obj);
            return;
        }
        y yVar = (y) obj;
        v[] vVarArr = yVar.f10367c;
        int length = vVarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            v vVar = vVarArr[length];
            vVar.getClass();
            vVar.f10360b.set(yVar.f10366b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[Catch: all -> 0x0069, DONT_GENERATE, TryCatch #2 {all -> 0x0069, blocks: (B:16:0x0049, B:18:0x0057, B:20:0x005d, B:33:0x008d, B:23:0x006b, B:25:0x0079, B:30:0x0084, B:32:0x008a, B:38:0x009a, B:41:0x00a3, B:40:0x00a0, B:28:0x007f), top: B:54:0x0049, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(java.lang.Object r9, t6.c r10) {
        /*
            boolean r0 = r10 instanceof t7.f
            if (r0 == 0) goto Lae
            t7.f r10 = (t7.f) r10
            o7.w r0 = r10.f10327m
            t6.c r1 = r10.f10328n
            java.lang.Throwable r2 = p6.k.a(r9)
            if (r2 != 0) goto L12
            r3 = r9
            goto L18
        L12:
            o7.u r3 = new o7.u
            r4 = 0
            r3.<init>(r4, r2)
        L18:
            t6.h r2 = r1.getContext()
            boolean r2 = r0.isDispatchNeeded(r2)
            r4 = 1
            if (r2 == 0) goto L2f
            r10.f10329o = r3
            r10.f8273l = r4
            t6.h r9 = r1.getContext()
            r0.dispatch(r9, r10)
            return
        L2f:
            o7.r0 r0 = o7.v1.a()
            long r5 = r0.f8303a
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L46
            r10.f10329o = r3
            r10.f8273l = r4
            r0.z(r10)
            goto La8
        L46:
            r0.A(r4)
            t6.h r2 = r1.getContext()     // Catch: java.lang.Throwable -> L69
            o7.x r3 = o7.x.f8328b     // Catch: java.lang.Throwable -> L69
            t6.f r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L69
            o7.e1 r2 = (o7.e1) r2     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto L6b
            boolean r3 = r2.b()     // Catch: java.lang.Throwable -> L69
            if (r3 != 0) goto L6b
            java.util.concurrent.CancellationException r9 = r2.j()     // Catch: java.lang.Throwable -> L69
            p6.j r9 = p6.a.b(r9)     // Catch: java.lang.Throwable -> L69
            r10.resumeWith(r9)     // Catch: java.lang.Throwable -> L69
            goto L8d
        L69:
            r9 = move-exception
            goto La4
        L6b:
            java.lang.Object r2 = r10.f10330p     // Catch: java.lang.Throwable -> L69
            t6.h r3 = r1.getContext()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r2 = l(r3, r2)     // Catch: java.lang.Throwable -> L69
            f8.w r5 = t7.a.f10319d     // Catch: java.lang.Throwable -> L69
            if (r2 == r5) goto L7e
            o7.a2 r5 = o7.c0.B(r1, r3, r2)     // Catch: java.lang.Throwable -> L69
            goto L7f
        L7e:
            r5 = 0
        L7f:
            r1.resumeWith(r9)     // Catch: java.lang.Throwable -> L97
            if (r5 == 0) goto L8a
            boolean r9 = r5.g0()     // Catch: java.lang.Throwable -> L69
            if (r9 == 0) goto L8d
        L8a:
            g(r3, r2)     // Catch: java.lang.Throwable -> L69
        L8d:
            boolean r9 = r0.C()     // Catch: java.lang.Throwable -> L69
            if (r9 != 0) goto L8d
        L93:
            r0.y(r4)
            goto La8
        L97:
            r9 = move-exception
            if (r5 == 0) goto La0
            boolean r1 = r5.g0()     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto La3
        La0:
            g(r3, r2)     // Catch: java.lang.Throwable -> L69
        La3:
            throw r9     // Catch: java.lang.Throwable -> L69
        La4:
            r10.f(r9)     // Catch: java.lang.Throwable -> La9
            goto L93
        La8:
            return
        La9:
            r9 = move-exception
            r0.y(r4)
            throw r9
        Lae:
            r10.resumeWith(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.a.h(java.lang.Object, t6.c):void");
    }

    public static final long i(long j, long j6, long j10, String str) {
        String property;
        int i = u.f10358a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lI0 = l7.t.i0(property);
        if (lI0 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lI0.longValue();
        if (j6 <= jLongValue && jLongValue <= j10) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j6 + ".." + j10 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int j(int i, int i6, String str) {
        return (int) i(i, 1, (i6 & 8) != 0 ? Integer.MAX_VALUE : 2097150, str);
    }

    public static final Object k(t6.h hVar) {
        Object objFold = hVar.fold(0, f10320e);
        objFold.getClass();
        return objFold;
    }

    public static final Object l(t6.h hVar, Object obj) {
        if (obj == null) {
            obj = k(hVar);
        }
        if (obj == 0) {
            return f10319d;
        }
        if (obj instanceof Integer) {
            return hVar.fold(new y(((Number) obj).intValue(), hVar), g);
        }
        v vVar = (v) obj;
        ThreadLocal threadLocal = vVar.f10360b;
        Object obj2 = threadLocal.get();
        threadLocal.set(vVar.f10359a);
        return obj2;
    }
}
