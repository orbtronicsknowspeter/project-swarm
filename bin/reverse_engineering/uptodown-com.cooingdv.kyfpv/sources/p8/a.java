package p8;

import androidx.core.location.LocationRequestCompat;
import androidx.lifecycle.l;
import e1.u0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import m8.b0;
import m8.c0;
import m8.f0;
import m8.j;
import m8.r;
import m8.u;
import m8.y;
import r8.g;
import s8.m;
import s8.q;
import s8.w;
import u8.h;
import w8.a0;
import w8.i;
import w8.x;
import w8.z;
import y2.s;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m8.m f8470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f0 f8471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Socket f8472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Socket f8473e;
    public r f;
    public y g;
    public q h;
    public a0 i;
    public z j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8474k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8475l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8476m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f8477n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f8478o = LocationRequestCompat.PASSIVE_INTERVAL;

    public a(m8.m mVar, f0 f0Var) {
        this.f8470b = mVar;
        this.f8471c = f0Var;
    }

    @Override // s8.m
    public final void a(q qVar) {
        synchronized (this.f8470b) {
            this.f8476m = qVar.e();
        }
    }

    @Override // s8.m
    public final void b(w wVar) {
        wVar.c(5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
    
        r10 = r9.f8471c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0084, code lost:
    
        if (r10.f7719a.h == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008e, code lost:
    
        if (r10.f7720b.type() != java.net.Proxy.Type.HTTP) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0092, code lost:
    
        if (r9.f8472d == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a1, code lost:
    
        throw new p8.b(new java.net.ProtocolException("Too many tunnel connections attempted: 21"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a4, code lost:
    
        if (r9.h == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a6, code lost:
    
        r10 = r9.f8470b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a8, code lost:
    
        monitor-enter(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a9, code lost:
    
        r9.f8476m = r9.h.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b1, code lost:
    
        monitor-exit(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r10, int r11, int r12, boolean r13, m8.b r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p8.a.c(int, int, int, boolean, m8.b):void");
    }

    public final void d(int i, int i6, m8.b bVar) throws IOException {
        f0 f0Var = this.f8471c;
        Proxy proxy = f0Var.f7720b;
        InetSocketAddress inetSocketAddress = f0Var.f7721c;
        this.f8472d = (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) ? f0Var.f7719a.f7671c.createSocket() : new Socket(proxy);
        bVar.getClass();
        this.f8472d.setSoTimeout(i6);
        try {
            h.f10784a.f(this.f8472d, inetSocketAddress, i);
            try {
                Socket socket = this.f8472d;
                Logger logger = x.f11004a;
                socket.getClass();
                w8.f0 f0Var2 = new w8.f0(socket);
                InputStream inputStream = socket.getInputStream();
                inputStream.getClass();
                this.i = new a0(new w8.c(f0Var2, new w8.c(inputStream, f0Var2)));
                Socket socket2 = this.f8472d;
                socket2.getClass();
                w8.f0 f0Var3 = new w8.f0(socket2);
                OutputStream outputStream = socket2.getOutputStream();
                outputStream.getClass();
                this.j = new z(new w8.b(0, f0Var3, new w8.b(1, outputStream, f0Var3)));
            } catch (NullPointerException e10) {
                if ("throw with null exception".equals(e10.getMessage())) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + inetSocketAddress);
            connectException.initCause(e11);
            throw connectException;
        }
    }

    public final void e(int i, int i6, int i10, m8.b bVar) throws IOException {
        s sVar = new s(9);
        f0 f0Var = this.f8471c;
        u uVar = f0Var.f7719a.f7669a;
        if (uVar == null) {
            com.google.gson.internal.a.i("url == null");
            return;
        }
        sVar.f11757l = uVar;
        sVar.w("Host", n8.c.j(uVar, true));
        sVar.w("Proxy-Connection", "Keep-Alive");
        sVar.w("User-Agent", "okhttp/3.10.0");
        m8.a0 a0VarN = sVar.n();
        u uVar2 = a0VarN.f7674a;
        d(i, i6, bVar);
        String str = "CONNECT " + n8.c.j(uVar2, true) + " HTTP/1.1";
        a0 a0Var = this.i;
        g gVar = new g(null, null, a0Var, this.j);
        a0Var.f10934a.a().g(i6);
        this.j.f11007a.a().g(i10);
        gVar.h(a0VarN.f7676c, str);
        gVar.b();
        b0 b0VarC = gVar.c(false);
        b0VarC.f7684a = a0VarN;
        c0 c0VarA = b0VarC.a();
        int i11 = c0VarA.f7695l;
        long jA = q8.c.a(c0VarA);
        if (jA == -1) {
            jA = 0;
        }
        r8.e eVarG = gVar.g(jA);
        n8.c.p(eVarG, Integer.MAX_VALUE);
        eVarG.close();
        if (i11 == 200) {
            if (this.i.f10935b.c() && this.j.f11008b.c()) {
                return;
            }
            com.google.gson.internal.a.n("TLS tunnel buffered too many bytes!");
            return;
        }
        if (i11 != 407) {
            com.google.gson.internal.a.n(l.u(i11, "Unexpected response code for CONNECT: "));
        } else {
            f0Var.f7719a.f7672d.getClass();
            com.google.gson.internal.a.n("Failed to authenticate with proxy");
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void f(u0 u0Var, m8.b bVar) throws Throwable {
        int i;
        SSLSocket sSLSocket;
        if (this.f8471c.f7719a.h == null) {
            this.g = y.HTTP_1_1;
            this.f8473e = this.f8472d;
            return;
        }
        bVar.getClass();
        m8.a aVar = this.f8471c.f7719a;
        SSLSocketFactory sSLSocketFactory = aVar.h;
        u uVar = aVar.f7669a;
        SSLSocket sSLSocket2 = null;
        try {
            try {
                i = 1;
                sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(this.f8472d, uVar.f7796d, uVar.f7797e, true);
            } catch (Throwable th) {
                th = th;
            }
        } catch (AssertionError e10) {
            e = e10;
        }
        try {
            boolean z9 = u0Var.a(sSLSocket).f7769b;
            if (z9) {
                h.f10784a.e(sSLSocket, uVar.f7796d, aVar.f7673e);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            if ("NONE".equals(session.getProtocol()) || "SSL_NULL_WITH_NULL_NULL".equals(session.getCipherSuite())) {
                throw new IOException("a valid ssl session was not established");
            }
            r rVarA = r.a(session);
            List list = rVarA.f7785c;
            int i6 = 0;
            if (!aVar.i.verify(uVar.f7796d, session)) {
                X509Certificate x509Certificate = (X509Certificate) list.get(0);
                throw new SSLPeerUnverifiedException("Hostname " + uVar.f7796d + " not verified:\n    certificate: " + j.b(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + v8.c.a(x509Certificate));
            }
            aVar.j.a(uVar.f7796d, list);
            String strH = z9 ? h.f10784a.h(sSLSocket) : null;
            this.f8473e = sSLSocket;
            Logger logger = x.f11004a;
            w8.f0 f0Var = new w8.f0(sSLSocket);
            InputStream inputStream = sSLSocket.getInputStream();
            inputStream.getClass();
            this.i = new a0(new w8.c(f0Var, new w8.c(inputStream, f0Var)));
            Socket socket = this.f8473e;
            socket.getClass();
            w8.f0 f0Var2 = new w8.f0(socket);
            OutputStream outputStream = socket.getOutputStream();
            outputStream.getClass();
            this.j = new z(new w8.b(i6, f0Var2, new w8.b(i, outputStream, f0Var2)));
            this.f = rVarA;
            this.g = strH != null ? y.a(strH) : y.HTTP_1_1;
            h.f10784a.a(sSLSocket);
            if (this.g == y.HTTP_2) {
                this.f8473e.setSoTimeout(0);
                g8.g gVar = new g8.g();
                gVar.f5387o = m.f9419a;
                gVar.f5382a = true;
                Socket socket2 = this.f8473e;
                String str = this.f8471c.f7719a.f7669a.f7796d;
                a0 a0Var = this.i;
                z zVar = this.j;
                gVar.f5383b = socket2;
                gVar.f5384l = str;
                gVar.f5385m = a0Var;
                gVar.f5386n = zVar;
                gVar.f5387o = this;
                q qVar = new q(gVar);
                this.h = qVar;
                s8.x xVar = qVar.A;
                synchronized (xVar) {
                    try {
                        if (xVar.f9477n) {
                            throw new IOException("closed");
                        }
                        if (xVar.f9474b) {
                            Logger logger2 = s8.x.f9472p;
                            if (logger2.isLoggable(Level.FINE)) {
                                String strG = s8.e.f9394a.g();
                                byte[] bArr = n8.c.f8115a;
                                Locale locale = Locale.US;
                                logger2.fine(">> CONNECTION " + strG);
                            }
                            i iVar = xVar.f9473a;
                            byte[] bArr2 = s8.e.f9394a.f10972a;
                            iVar.write(Arrays.copyOf(bArr2, bArr2.length));
                            xVar.f9473a.flush();
                        }
                    } finally {
                    }
                }
                qVar.A.j(qVar.f9440w);
                if (qVar.f9440w.c() != 65535) {
                    qVar.A.r(0, r11 - 65535);
                }
                new Thread(qVar.B).start();
            }
        } catch (AssertionError e11) {
            e = e11;
            if (!n8.c.n(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                h.f10784a.a(sSLSocket2);
            }
            n8.c.d(sSLSocket2);
            throw th;
        }
    }

    public final boolean g(m8.a aVar, f0 f0Var) {
        if (this.f8477n.size() >= this.f8476m || this.f8474k) {
            return false;
        }
        m8.b bVar = m8.b.f7683e;
        f0 f0Var2 = this.f8471c;
        m8.a aVar2 = f0Var2.f7719a;
        bVar.getClass();
        boolean zA = aVar2.a(aVar);
        u uVar = aVar.f7669a;
        if (!zA) {
            return false;
        }
        if (uVar.f7796d.equals(f0Var2.f7719a.f7669a.f7796d)) {
            return true;
        }
        if (this.h == null || f0Var == null) {
            return false;
        }
        Proxy.Type type = f0Var.f7720b.type();
        Proxy.Type type2 = Proxy.Type.DIRECT;
        if (type != type2 || f0Var2.f7720b.type() != type2 || !f0Var2.f7721c.equals(f0Var.f7721c) || f0Var.f7719a.i != v8.c.f10905a || !j(uVar)) {
            return false;
        }
        try {
            aVar.j.a(uVar.f7796d, this.f.f7785c);
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final boolean h(boolean z9) {
        boolean z10;
        if (!this.f8473e.isClosed() && !this.f8473e.isInputShutdown() && !this.f8473e.isOutputShutdown()) {
            q qVar = this.h;
            if (qVar != null) {
                synchronized (qVar) {
                    z10 = qVar.f9434p;
                }
                return !z10;
            }
            if (z9) {
                try {
                    int soTimeout = this.f8473e.getSoTimeout();
                    try {
                        this.f8473e.setSoTimeout(1);
                        boolean zB = this.i.b();
                        Socket socket = this.f8473e;
                        if (zB) {
                            socket.setSoTimeout(soTimeout);
                            return false;
                        }
                        socket.setSoTimeout(soTimeout);
                        return true;
                    } catch (Throwable th) {
                        this.f8473e.setSoTimeout(soTimeout);
                        throw th;
                    }
                } catch (SocketTimeoutException unused) {
                } catch (IOException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final q8.a i(m8.x xVar, q8.d dVar, e eVar) throws SocketException {
        int i = dVar.j;
        if (this.h != null) {
            return new s8.g(dVar, eVar, this.h);
        }
        this.f8473e.setSoTimeout(i);
        this.i.f10934a.a().g(i);
        this.j.f11007a.a().g(dVar.f8792k);
        return new g(xVar, eVar, this.i, this.j);
    }

    public final boolean j(u uVar) {
        int i = uVar.f7797e;
        String str = uVar.f7796d;
        u uVar2 = this.f8471c.f7719a.f7669a;
        if (i == uVar2.f7797e) {
            if (str.equals(uVar2.f7796d)) {
                return true;
            }
            r rVar = this.f;
            if (rVar != null && v8.c.c(str, (X509Certificate) rVar.f7785c.get(0))) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        f0 f0Var = this.f8471c;
        sb.append(f0Var.f7719a.f7669a.f7796d);
        sb.append(":");
        sb.append(f0Var.f7719a.f7669a.f7797e);
        sb.append(", proxy=");
        sb.append(f0Var.f7720b);
        sb.append(" hostAddress=");
        sb.append(f0Var.f7721c);
        sb.append(" cipherSuite=");
        r rVar = this.f;
        sb.append(rVar != null ? rVar.f7784b : "none");
        sb.append(" protocol=");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }
}
