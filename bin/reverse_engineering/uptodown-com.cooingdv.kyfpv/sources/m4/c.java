package m4;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.measurement.z3;
import g4.s0;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import l7.u;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e2.d f7287b;

    public /* synthetic */ c(e2.d dVar, int i) {
        this.f7286a = i;
        this.f7287b = dVar;
    }

    /* JADX INFO: Infinite loop detected, blocks: 37, insns: 0 */
    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArr;
        int i;
        File file;
        InputStream inputStream;
        switch (this.f7286a) {
            case 0:
                e2.d dVar = this.f7287b;
                b bVar = (b) dVar.f4469m;
                b4.g gVar = (b4.g) dVar.f4468l;
                try {
                    Socket socket = bVar.f7284d;
                    if (socket == null) {
                        gVar.f1004a.b();
                        break;
                    } else if (socket.isClosed()) {
                        gVar.f1004a.b();
                        break;
                    } else {
                        while (true) {
                            Socket socket2 = bVar.f7284d;
                            socket2.getClass();
                            String utf = new DataInputStream(socket2.getInputStream()).readUTF();
                            if (utf == null) {
                                gVar.f1004a.b();
                            } else if (utf.equalsIgnoreCase("OK")) {
                                l4.c cVar = bVar.f;
                                if (cVar != null) {
                                    gVar.getClass();
                                    b4.g.d(cVar);
                                }
                            } else if (utf.equalsIgnoreCase("KO")) {
                                gVar.getClass();
                            } else if (utf.equalsIgnoreCase("FileReceived")) {
                                gVar.getClass();
                            } else if (u.p0(utf, "resolveService:", false)) {
                                gVar.i(utf.substring(15));
                            } else {
                                l4.c cVar2 = new l4.c();
                                dVar.f4473q = cVar2;
                                cVar2.a(utf);
                                l4.c cVar3 = (l4.c) dVar.f4473q;
                                cVar3.getClass();
                                gVar.getClass();
                                b4.g.c(cVar3);
                            }
                        }
                    }
                } catch (EOFException unused) {
                    gVar.f1004a.b();
                    return;
                } catch (IOException unused2) {
                    gVar.f1004a.b();
                    return;
                } catch (Exception unused3) {
                    gVar.f1004a.b();
                    return;
                }
                break;
            case 1:
                e2.d dVar2 = this.f7287b;
                b4.g gVar2 = (b4.g) dVar2.f4468l;
                try {
                    Context context = (Context) dVar2.f4467b;
                    context.getClass();
                    File file2 = new File(context.getExternalFilesDir(null), "received");
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    l4.c cVar4 = (l4.c) dVar2.f4473q;
                    cVar4.getClass();
                    if (cVar4.f7105b != null) {
                        l4.c cVar5 = (l4.c) dVar2.f4473q;
                        cVar5.getClass();
                        String str = cVar5.f7105b;
                        str.getClass();
                        File file3 = new File(file2, str);
                        Socket socket3 = ((b) dVar2.f4469m).f7285e;
                        socket3.getClass();
                        InputStream inputStream2 = socket3.getInputStream();
                        if (inputStream2 == null) {
                            gVar2.f("ERROR: cant create output file");
                        } else {
                            FileOutputStream fileOutputStream = new FileOutputStream(file3);
                            l4.c cVar6 = (l4.c) dVar2.f4473q;
                            cVar6.getClass();
                            long j = cVar6.f7108e;
                            int i6 = 0;
                            long j6 = 0;
                            byte[] bArr2 = new byte[8192];
                            int i10 = 0;
                            int i11 = 0;
                            while (i10 < j && (i = inputStream2.read((bArr = bArr2), i6, 8192)) > 0) {
                                fileOutputStream.write(bArr, i6, i);
                                i10 += i;
                                long j10 = j6;
                                FileOutputStream fileOutputStream2 = fileOutputStream;
                                int i12 = (int) ((((double) i10) * 100.0d) / j);
                                if (i12 <= i11 + 5) {
                                    file = file3;
                                    inputStream = inputStream2;
                                    if (System.currentTimeMillis() <= j10 + ((long) 1000) || i12 <= i11) {
                                        fileOutputStream = fileOutputStream2;
                                        j6 = j10;
                                        file3 = file;
                                        inputStream2 = inputStream;
                                        i6 = 0;
                                        bArr2 = bArr;
                                    }
                                } else {
                                    file = file3;
                                    inputStream = inputStream2;
                                }
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                gVar2.getClass();
                                Activity activity = f4.c.f4876o;
                                if (activity != null && (activity instanceof s0)) {
                                    s0 s0Var = (s0) activity;
                                    s0Var.runOnUiThread(new androidx.core.content.res.a(s0Var, i12, 3));
                                }
                                bArr2 = bArr;
                                i11 = i12;
                                fileOutputStream = fileOutputStream2;
                                i6 = 0;
                                j6 = jCurrentTimeMillis;
                                file3 = file;
                                inputStream2 = inputStream;
                            }
                            File file4 = file3;
                            FileOutputStream fileOutputStream3 = fileOutputStream;
                            gVar2.getClass();
                            Activity activity2 = f4.c.f4876o;
                            if (activity2 != null && (activity2 instanceof s0)) {
                                s0 s0Var2 = (s0) activity2;
                                s0Var2.runOnUiThread(new androidx.core.content.res.a(s0Var2, 100, 3));
                            }
                            fileOutputStream3.close();
                            String strX = z3.x(file4.getAbsolutePath());
                            if (strX != null) {
                                l4.c cVar7 = (l4.c) dVar2.f4473q;
                                cVar7.getClass();
                                if (strX.equalsIgnoreCase(cVar7.f7106c)) {
                                    l4.c cVar8 = (l4.c) dVar2.f4473q;
                                    cVar8.getClass();
                                    String str2 = cVar8.f7105b;
                                    str2.getClass();
                                    b4.g.b(str2);
                                }
                            }
                            gVar2.f("ERROR: File hashes do not macth!");
                        }
                    }
                } catch (Exception e10) {
                    if (e10.getMessage() == null) {
                        gVar2.f("Exception");
                        return;
                    }
                    String message = e10.getMessage();
                    message.getClass();
                    gVar2.f(message);
                    return;
                }
                break;
            default:
                e2.d dVar3 = this.f7287b;
                b4.g gVar3 = (b4.g) dVar3.f4468l;
                try {
                    ServerSocket serverSocket = new ServerSocket(0);
                    dVar3.f4470n = serverSocket;
                    gVar3.e(serverSocket.getLocalPort());
                    while (true) {
                        Thread thread = (Thread) dVar3.f4471o;
                        thread.getClass();
                        if (!thread.isInterrupted()) {
                            ServerSocket serverSocket2 = (ServerSocket) dVar3.f4470n;
                            serverSocket2.getClass();
                            Socket socketAccept = serverSocket2.accept();
                            b bVar2 = (b) dVar3.f4469m;
                            socketAccept.getClass();
                            bVar2.b(socketAccept);
                            b4.g.a(socketAccept.getRemoteSocketAddress().toString());
                        }
                    }
                } catch (IOException e11) {
                    e11.printStackTrace();
                } catch (Exception e12) {
                    e12.printStackTrace();
                    return;
                }
                break;
        }
    }
}
