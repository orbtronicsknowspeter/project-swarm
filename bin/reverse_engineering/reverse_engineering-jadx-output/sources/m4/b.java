package m4;

import android.content.Context;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import e1.q2;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b4.g f7280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e2.d f7281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.support.v4.media.g f7282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Socket f7283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Socket f7284e;
    public l4.c f;

    public b(Context context, b4.g gVar) {
        gVar.getClass();
        context.getClass();
        this.f7280a = gVar;
        this.f7281b = new e2.d(context, gVar, this);
        this.f7282c = new android.support.v4.media.g(gVar, this);
    }

    public final void a() {
        g gVar = f4.c.f4884y;
        NsdServiceInfo nsdServiceInfo = gVar != null ? gVar.f : null;
        if (nsdServiceInfo != null) {
            b4.g gVar2 = this.f7280a;
            try {
                InetAddress host = nsdServiceInfo.getHost();
                if (Build.VERSION.SDK_INT >= 34) {
                    Iterator<InetAddress> it = nsdServiceInfo.getHostAddresses().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        InetAddress next = it.next();
                        if (next != null) {
                            host = next;
                            break;
                        }
                    }
                }
                b(new Socket(host, nsdServiceInfo.getPort()));
                gVar2.getClass();
                b4.g.h(nsdServiceInfo);
            } catch (ConnectException unused) {
                gVar2.f1004a.b();
            } catch (IOException unused2) {
                gVar2.f1004a.b();
            }
        }
    }

    public final synchronized void b(Socket socket) {
        try {
            Socket socket2 = this.f7283d;
            if (socket2 == null || !socket2.isConnected()) {
                this.f7283d = socket;
            } else {
                c(socket);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001a A[Catch: all -> 0x0014, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000c, B:10:0x0010, B:15:0x0017, B:16:0x001a), top: B:21:0x0001, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void c(java.net.Socket r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.net.Socket r0 = r2.f7284e     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L1a
            boolean r0 = r0.isConnected()     // Catch: java.lang.Throwable -> L14
            r1 = 1
            if (r0 != r1) goto L1a
            java.net.Socket r0 = r2.f7284e     // Catch: java.lang.Throwable -> L14 java.io.IOException -> L16
            if (r0 == 0) goto L1a
            r0.close()     // Catch: java.lang.Throwable -> L14 java.io.IOException -> L16
            goto L1a
        L14:
            r3 = move-exception
            goto L1e
        L16:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L14
        L1a:
            r2.f7284e = r3     // Catch: java.lang.Throwable -> L14
            monitor-exit(r2)
            return
        L1e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.b.c(java.net.Socket):void");
    }

    public final void d(boolean z9) {
        Socket socket = this.f7283d;
        if (socket == null || socket.isClosed()) {
            this.f7280a.f1004a.b();
            return;
        }
        android.support.v4.media.g gVar = this.f7282c;
        gVar.getClass();
        new Thread(new q2(gVar, z9)).start();
    }

    public final void e() {
        e2.d dVar = this.f7281b;
        Thread thread = (Thread) dVar.f4470o;
        if (thread != null) {
            thread.interrupt();
        }
        try {
            ServerSocket serverSocket = (ServerSocket) dVar.f4469n;
            if (serverSocket != null) {
                serverSocket.close();
            }
            dVar.f4469n = null;
        } catch (IOException unused) {
        }
        try {
            Socket socket = this.f7284e;
            if (socket != null) {
                socket.close();
            }
            this.f7284e = null;
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        try {
            Socket socket2 = this.f7283d;
            if (socket2 != null) {
                socket2.close();
            }
            this.f7283d = null;
        } catch (IOException e11) {
            e11.printStackTrace();
        }
    }
}
