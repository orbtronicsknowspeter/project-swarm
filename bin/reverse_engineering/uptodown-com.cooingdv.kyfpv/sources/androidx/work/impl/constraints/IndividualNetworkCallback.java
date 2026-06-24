package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.annotation.RequiresApi;
import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.IndividualNetworkCallback;
import d7.l;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.u;
import p6.x;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(28)
final class IndividualNetworkCallback extends ConnectivityManager.NetworkCallback {
    public static final Companion Companion = new Companion(null);
    private final l onConstraintState;

    private IndividualNetworkCallback(l lVar) {
        this.onConstraintState = lVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        this.onConstraintState.invoke(ConstraintsState.ConstraintsMet.INSTANCE);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        network.getClass();
        Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController onLost callback");
        this.onConstraintState.invoke(new ConstraintsState.ConstraintsNotMet(7));
    }

    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final x addCallback$lambda$0(u uVar, ConnectivityManager connectivityManager, IndividualNetworkCallback individualNetworkCallback) {
            if (uVar.f7022a) {
                Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController unregister callback");
                connectivityManager.unregisterNetworkCallback(individualNetworkCallback);
            }
            return x.f8464a;
        }

        public final d7.a addCallback(final ConnectivityManager connectivityManager, NetworkRequest networkRequest, l lVar) {
            connectivityManager.getClass();
            networkRequest.getClass();
            lVar.getClass();
            final IndividualNetworkCallback individualNetworkCallback = new IndividualNetworkCallback(lVar, null);
            final u uVar = new u();
            try {
                Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController register callback");
                connectivityManager.registerNetworkCallback(networkRequest, individualNetworkCallback);
                uVar.f7022a = true;
            } catch (RuntimeException e10) {
                if (!l7.u.k0(e10.getClass().getName(), "TooManyRequestsException", false)) {
                    throw e10;
                }
                Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController couldn't register callback", e10);
                lVar.invoke(new ConstraintsState.ConstraintsNotMet(7));
            }
            return new d7.a() { // from class: androidx.work.impl.constraints.a
                @Override // d7.a
                public final Object invoke() {
                    return IndividualNetworkCallback.Companion.addCallback$lambda$0(uVar, connectivityManager, individualNetworkCallback);
                }
            };
        }

        private Companion() {
        }
    }

    public /* synthetic */ IndividualNetworkCallback(l lVar, g gVar) {
        this(lVar);
    }
}
