package p8;

import a2.q;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import m8.f0;
import m8.m;
import m8.z;
import s8.a0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m8.a f8487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q f8488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f0 f8489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f8490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m8.b f8491e;
    public final Object f;
    public final c g;
    public int h;
    public a i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8492k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public q8.a f8493l;

    public e(m mVar, m8.a aVar, z zVar, m8.b bVar, Object obj) {
        this.f8490d = mVar;
        this.f8487a = aVar;
        this.f8491e = bVar;
        m8.b.f7683e.getClass();
        this.g = new c(aVar, mVar.f7762e, zVar, bVar);
        this.f = obj;
    }

    public final synchronized a a() {
        return this.i;
    }

    public final Socket b(boolean z9, boolean z10, boolean z11) {
        Socket socket;
        if (z11) {
            this.f8493l = null;
        }
        if (z10) {
            this.f8492k = true;
        }
        a aVar = this.i;
        if (aVar != null) {
            if (z9) {
                aVar.f8474k = true;
            }
            if (this.f8493l == null && (this.f8492k || aVar.f8474k)) {
                ArrayList arrayList = aVar.f8477n;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (((Reference) arrayList.get(i)).get() == this) {
                        arrayList.remove(i);
                        if (this.i.f8477n.isEmpty()) {
                            this.i.f8478o = System.nanoTime();
                            m8.b bVar = m8.b.f7683e;
                            a aVar2 = this.i;
                            bVar.getClass();
                            m mVar = this.f8490d;
                            mVar.getClass();
                            if (aVar2.f8474k || mVar.f7758a == 0) {
                                mVar.f7761d.remove(aVar2);
                                socket = this.i.f8473e;
                            } else {
                                mVar.notifyAll();
                                socket = null;
                            }
                        } else {
                            socket = null;
                        }
                        this.i = null;
                        return socket;
                    }
                }
                throw new IllegalStateException();
            }
        }
        return null;
    }

    public final a c(int i, int i6, int i10, boolean z9) throws Throwable {
        a aVar;
        boolean z10;
        Socket socketA;
        Socket socketB;
        a aVar2;
        boolean z11;
        f0 f0Var;
        boolean z12;
        q qVar;
        synchronized (this.f8490d) {
            try {
                if (this.f8492k) {
                    throw new IllegalStateException("released");
                }
                if (this.f8493l != null) {
                    throw new IllegalStateException("codec != null");
                }
                aVar = this.i;
                z10 = true;
                socketA = null;
                socketB = (aVar == null || !aVar.f8474k) ? null : b(false, false, true);
                aVar2 = this.i;
                if (aVar2 != null) {
                    aVar = null;
                } else {
                    aVar2 = null;
                }
                if (!this.j) {
                    aVar = null;
                }
                if (aVar2 == null) {
                    m8.b bVar = m8.b.f7683e;
                    m mVar = this.f8490d;
                    m8.a aVar3 = this.f8487a;
                    bVar.getClass();
                    m8.b.b(mVar, aVar3, this, null);
                    a aVar4 = this.i;
                    if (aVar4 != null) {
                        z11 = true;
                        aVar2 = aVar4;
                    } else {
                        f0Var = this.f8489c;
                        z11 = false;
                    }
                } else {
                    z11 = false;
                }
                f0Var = null;
            } finally {
            }
        }
        n8.c.d(socketB);
        if (aVar != null) {
            this.f8491e.getClass();
        }
        if (z11) {
            this.f8491e.getClass();
        }
        if (aVar2 != null) {
            return aVar2;
        }
        if (f0Var != null || ((qVar = this.f8488b) != null && qVar.f44b < qVar.f43a.size())) {
            z12 = false;
        } else {
            this.f8488b = this.g.b();
            z12 = true;
        }
        synchronized (this.f8490d) {
            if (z12) {
                try {
                    q qVar2 = this.f8488b;
                    qVar2.getClass();
                    ArrayList arrayList = new ArrayList(qVar2.f43a);
                    int size = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size) {
                            break;
                        }
                        f0 f0Var2 = (f0) arrayList.get(i11);
                        m8.b bVar2 = m8.b.f7683e;
                        m mVar2 = this.f8490d;
                        m8.a aVar5 = this.f8487a;
                        bVar2.getClass();
                        m8.b.b(mVar2, aVar5, this, f0Var2);
                        a aVar6 = this.i;
                        if (aVar6 != null) {
                            this.f8489c = f0Var2;
                            z11 = true;
                            aVar2 = aVar6;
                            break;
                        }
                        i11++;
                    }
                } finally {
                }
            }
            if (!z11) {
                if (f0Var == null) {
                    q qVar3 = this.f8488b;
                    if (!(qVar3.f44b < qVar3.f43a.size())) {
                        throw new NoSuchElementException();
                    }
                    ArrayList arrayList2 = qVar3.f43a;
                    int i12 = qVar3.f44b;
                    qVar3.f44b = i12 + 1;
                    f0Var = (f0) arrayList2.get(i12);
                }
                this.f8489c = f0Var;
                this.h = 0;
                aVar2 = new a(this.f8490d, f0Var);
                if (this.i != null) {
                    throw new IllegalStateException();
                }
                this.i = aVar2;
                this.j = false;
                aVar2.f8477n.add(new d(this, this.f));
            }
        }
        if (z11) {
            this.f8491e.getClass();
            return aVar2;
        }
        aVar2.c(i, i6, i10, z9, this.f8491e);
        m8.b bVar3 = m8.b.f7683e;
        m mVar3 = this.f8490d;
        bVar3.getClass();
        mVar3.f7762e.w(aVar2.f8471c);
        synchronized (this.f8490d) {
            try {
                this.j = true;
                m8.b bVar4 = m8.b.f7683e;
                m mVar4 = this.f8490d;
                bVar4.getClass();
                if (!mVar4.f) {
                    mVar4.f = true;
                    m.g.execute(mVar4.f7760c);
                }
                mVar4.f7761d.add(aVar2);
                if (aVar2.h == null) {
                    z10 = false;
                }
                if (z10) {
                    m8.b bVar5 = m8.b.f7683e;
                    m mVar5 = this.f8490d;
                    m8.a aVar7 = this.f8487a;
                    bVar5.getClass();
                    socketA = m8.b.a(mVar5, aVar7, this);
                    aVar2 = this.i;
                }
            } finally {
            }
        }
        n8.c.d(socketA);
        this.f8491e.getClass();
        return aVar2;
    }

    public final a d(int i, int i6, int i10, boolean z9, boolean z10) throws Throwable {
        while (true) {
            a aVarC = c(i, i6, i10, z9);
            synchronized (this.f8490d) {
                try {
                    if (aVarC.f8475l == 0) {
                        return aVarC;
                    }
                    if (aVarC.h(z10)) {
                        return aVarC;
                    }
                    e();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void e() {
        a aVar;
        Socket socketB;
        synchronized (this.f8490d) {
            aVar = this.i;
            socketB = b(true, false, false);
            if (this.i != null) {
                aVar = null;
            }
        }
        n8.c.d(socketB);
        if (aVar != null) {
            this.f8491e.getClass();
        }
    }

    public final void f() {
        a aVar;
        Socket socketB;
        synchronized (this.f8490d) {
            aVar = this.i;
            socketB = b(false, true, false);
            if (this.i != null) {
                aVar = null;
            }
        }
        n8.c.d(socketB);
        if (aVar != null) {
            this.f8491e.getClass();
        }
    }

    public final void g(IOException iOException) {
        a aVar;
        boolean z9;
        Socket socketB;
        synchronized (this.f8490d) {
            try {
                aVar = null;
                if (iOException instanceof a0) {
                    int i = ((a0) iOException).f9381a;
                    if (i == 5) {
                        this.h++;
                    }
                    if (i != 5 || this.h > 1) {
                        this.f8489c = null;
                        z9 = true;
                    }
                    z9 = false;
                } else {
                    a aVar2 = this.i;
                    if (aVar2 != null) {
                        if (!(aVar2.h != null) || (iOException instanceof s8.a)) {
                            if (aVar2.f8475l == 0) {
                                f0 f0Var = this.f8489c;
                                if (f0Var != null && iOException != null) {
                                    this.g.a(f0Var, iOException);
                                }
                                this.f8489c = null;
                            }
                            z9 = true;
                        }
                    }
                    z9 = false;
                }
                a aVar3 = this.i;
                socketB = b(z9, false, true);
                if (this.i == null && this.j) {
                    aVar = aVar3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        n8.c.d(socketB);
        if (aVar != null) {
            this.f8491e.getClass();
        }
    }

    public final void h(boolean z9, q8.a aVar, IOException iOException) {
        a aVar2;
        Socket socketB;
        boolean z10;
        this.f8491e.getClass();
        synchronized (this.f8490d) {
            try {
                if (aVar != this.f8493l) {
                    throw new IllegalStateException("expected " + this.f8493l + " but was " + aVar);
                }
                if (!z9) {
                    this.i.f8475l++;
                }
                aVar2 = this.i;
                socketB = b(z9, false, true);
                if (this.i != null) {
                    aVar2 = null;
                }
                z10 = this.f8492k;
            } catch (Throwable th) {
                throw th;
            }
        }
        n8.c.d(socketB);
        if (aVar2 != null) {
            this.f8491e.getClass();
        }
        if (iOException != null) {
            this.f8491e.getClass();
        } else if (z10) {
            this.f8491e.getClass();
        }
    }

    public final String toString() {
        a aVarA = a();
        return aVarA != null ? aVarA.toString() : this.f8487a.toString();
    }
}
