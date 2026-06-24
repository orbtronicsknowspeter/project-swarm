package com.google.android.gms.internal.measurement;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class j6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j6 f2671c = new j6();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f2673b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z5 f2672a = new z5(0);

    public final m6 a(Class cls) {
        m6 m6VarU;
        Charset charset = r5.f2778a;
        if (cls == null) {
            com.google.gson.internal.a.i("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.f2673b;
        m6 m6Var = (m6) concurrentHashMap.get(cls);
        if (m6Var != null) {
            return m6Var;
        }
        z5 z5Var = this.f2672a;
        z5Var.getClass();
        j5 j5Var = n6.f2726a;
        l5.class.isAssignableFrom(cls);
        l6 l6VarB = ((z5) z5Var.f2934a).b(cls);
        if ((l6VarB.f2700d & 2) == 2) {
            j5 j5Var2 = n6.f2726a;
            j5 j5Var3 = e5.f2559a;
            m6VarU = new g6(j5Var2, l6VarB.f2697a);
        } else {
            int i = h6.f2652a;
            int i6 = w5.f2885a;
            j5 j5Var4 = n6.f2726a;
            j5 j5Var5 = l6VarB.a() + (-1) != 1 ? e5.f2559a : null;
            int i10 = c6.f2529a;
            m6VarU = f6.u(l6VarB, j5Var4, j5Var5);
        }
        m6 m6Var2 = (m6) concurrentHashMap.putIfAbsent(cls, m6VarU);
        return m6Var2 != null ? m6Var2 : m6VarU;
    }
}
