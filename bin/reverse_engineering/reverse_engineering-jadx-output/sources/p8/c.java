package p8;

import a2.q;
import g5.f;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import m8.f0;
import m8.u;
import m8.z;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m8.a f8480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f8481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m8.b f8482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f8483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8484e;
    public List f;
    public final ArrayList g;

    public c(m8.a aVar, f fVar, z zVar, m8.b bVar) {
        List list = Collections.EMPTY_LIST;
        this.f8483d = list;
        this.f = list;
        this.g = new ArrayList();
        this.f8480a = aVar;
        this.f8481b = fVar;
        this.f8482c = bVar;
        List<Proxy> listSelect = aVar.g.select(aVar.f7668a.l());
        this.f8483d = (listSelect == null || listSelect.isEmpty()) ? n8.c.l(Proxy.NO_PROXY) : n8.c.k(listSelect);
        this.f8484e = 0;
    }

    public final void a(f0 f0Var, IOException iOException) {
        m8.a aVar;
        ProxySelector proxySelector;
        if (f0Var.f7719b.type() != Proxy.Type.DIRECT && (proxySelector = (aVar = this.f8480a).g) != null) {
            proxySelector.connectFailed(aVar.f7668a.l(), f0Var.f7719b.address(), iOException);
        }
        f fVar = this.f8481b;
        synchronized (fVar) {
            ((LinkedHashSet) fVar.f5309b).add(f0Var);
        }
    }

    public final q b() throws SocketException, UnknownHostException {
        String hostName;
        int port;
        boolean zContains;
        if (this.f8484e >= this.f8483d.size() && this.g.isEmpty()) {
            com.google.gson.internal.a.l();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (this.f8484e < this.f8483d.size()) {
            m8.a aVar = this.f8480a;
            if (this.f8484e >= this.f8483d.size()) {
                throw new SocketException("No route to " + aVar.f7668a.f7795d + "; exhausted proxy configurations: " + this.f8483d);
            }
            List list = this.f8483d;
            int i = this.f8484e;
            this.f8484e = i + 1;
            Proxy proxy = (Proxy) list.get(i);
            m8.b bVar = this.f8482c;
            this.f = new ArrayList();
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                u uVar = aVar.f7668a;
                hostName = uVar.f7795d;
                port = uVar.f7796e;
            } else {
                SocketAddress socketAddressAddress = proxy.address();
                if (!(socketAddressAddress instanceof InetSocketAddress)) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.r(socketAddressAddress.getClass(), "Proxy.address() is not an InetSocketAddress: ");
                    return null;
                }
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                InetAddress address = inetSocketAddress.getAddress();
                hostName = address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
                port = inetSocketAddress.getPort();
            }
            if (port < 1 || port > 65535) {
                throw new SocketException("No route to " + hostName + ":" + port + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                this.f.add(InetSocketAddress.createUnresolved(hostName, port));
            } else {
                bVar.getClass();
                aVar.f7669b.getClass();
                if (hostName == null) {
                    throw new UnknownHostException("hostname == null");
                }
                try {
                    List listAsList = Arrays.asList(InetAddress.getAllByName(hostName));
                    if (listAsList.isEmpty()) {
                        throw new UnknownHostException(aVar.f7669b + " returned no addresses for " + hostName);
                    }
                    int size = listAsList.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        this.f.add(new InetSocketAddress((InetAddress) listAsList.get(i6), port));
                    }
                } catch (NullPointerException e10) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostName));
                    unknownHostException.initCause(e10);
                    throw unknownHostException;
                }
            }
            int size2 = this.f.size();
            for (int i10 = 0; i10 < size2; i10++) {
                f0 f0Var = new f0(this.f8480a, proxy, (InetSocketAddress) this.f.get(i10));
                f fVar = this.f8481b;
                synchronized (fVar) {
                    zContains = ((LinkedHashSet) fVar.f5309b).contains(f0Var);
                }
                if (zContains) {
                    this.g.add(f0Var);
                } else {
                    arrayList.add(f0Var);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(this.g);
            this.g.clear();
        }
        return new q(arrayList);
    }
}
