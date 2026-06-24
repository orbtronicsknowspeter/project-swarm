package g0;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f5085b;

    public /* synthetic */ i(k kVar, int i) {
        this.f5084a = i;
        this.f5085b = kVar;
    }

    private final void a() {
        k kVar = this.f5085b;
        synchronized (kVar) {
            if (kVar.f5087a == 1) {
                kVar.a("Timed out while binding");
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5084a) {
            case 0:
                break;
            case 1:
                a();
                return;
            default:
                this.f5085b.a("Service disconnected");
                return;
        }
        while (true) {
            k kVar = this.f5085b;
            synchronized (kVar) {
                try {
                    if (kVar.f5087a != 2) {
                        return;
                    }
                    if (kVar.f5090m.isEmpty()) {
                        kVar.c();
                        return;
                    }
                    l lVar = (l) kVar.f5090m.poll();
                    kVar.f5091n.put(lVar.f5093a, lVar);
                    kVar.f5092o.f5100b.schedule(new m1.a(19, kVar, lVar), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(lVar)));
                    }
                    n nVar = kVar.f5092o;
                    Messenger messenger = kVar.f5088b;
                    int i = lVar.f5095c;
                    Context context = nVar.f5099a;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i;
                    messageObtain.arg1 = lVar.f5093a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", lVar.a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", lVar.f5096d);
                    messageObtain.setData(bundle);
                    try {
                        android.support.v4.media.g gVar = kVar.f5089l;
                        Messenger messenger2 = (Messenger) gVar.f247b;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            g gVar2 = (g) gVar.f248l;
                            if (gVar2 == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = gVar2.f5080a;
                            messenger3.getClass();
                            messenger3.send(messageObtain);
                        }
                    } catch (RemoteException e10) {
                        kVar.a(e10.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
