package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.work.Logger;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.utils.NetworkApi24;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(24)
public final class NetworkStateTracker24 extends ConstraintTracker<NetworkState> {
    private final ConnectivityManager connectivityManager;
    private volatile boolean isBlocked;
    private final Object lock;
    private final NetworkStateTracker24$networkCallback$1 networkCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.work.impl.constraints.trackers.NetworkStateTracker24$networkCallback$1] */
    public NetworkStateTracker24(Context context, TaskExecutor taskExecutor) {
        super(context, taskExecutor);
        context.getClass();
        taskExecutor.getClass();
        Object systemService = getAppContext().getSystemService("connectivity");
        systemService.getClass();
        this.connectivityManager = (ConnectivityManager) systemService;
        this.lock = new Object();
        this.networkCallback = new ConnectivityManager.NetworkCallback() { // from class: androidx.work.impl.constraints.trackers.NetworkStateTracker24$networkCallback$1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onBlockedStatusChanged(Network network, boolean z9) {
                network.getClass();
                if (network.equals(this.this$0.connectivityManager.getActiveNetwork())) {
                    Logger.get().debug(NetworkStateTrackerKt.TAG, "Network blocked status changed: " + z9);
                    NetworkState state = this.this$0.getState();
                    Object obj = this.this$0.lock;
                    NetworkStateTracker24 networkStateTracker24 = this.this$0;
                    synchronized (obj) {
                        if (networkStateTracker24.isBlocked == z9) {
                            return;
                        }
                        networkStateTracker24.isBlocked = z9;
                        this.this$0.setState(NetworkState.copy$default(state, false, false, false, false, z9, 15, null));
                    }
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                network.getClass();
                networkCapabilities.getClass();
                Logger.get().debug(NetworkStateTrackerKt.TAG, "Network capabilities changed: " + networkCapabilities);
                NetworkStateTracker24 networkStateTracker24 = this.this$0;
                networkStateTracker24.setState(Build.VERSION.SDK_INT >= 28 ? NetworkStateTrackerKt.getActiveNetworkState(networkCapabilities, networkStateTracker24.isBlocked) : NetworkStateTrackerKt.getActiveNetworkState(networkStateTracker24.connectivityManager, this.this$0.isBlocked));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                network.getClass();
                Logger.get().debug(NetworkStateTrackerKt.TAG, "Network connection lost");
                this.this$0.setState(new NetworkState(false, false, false, false, false));
            }
        };
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public NetworkState readSystemState() {
        if (Build.VERSION.SDK_INT >= 28) {
            ConnectivityManager connectivityManager = this.connectivityManager;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null) {
                return NetworkStateTrackerKt.getActiveNetworkState(networkCapabilities, this.isBlocked);
            }
        }
        return NetworkStateTrackerKt.getActiveNetworkState(this.connectivityManager, this.isBlocked);
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void startTracking() {
        try {
            Logger.get().debug(NetworkStateTrackerKt.TAG, "Registering network callback");
            NetworkApi24.registerDefaultNetworkCallbackCompat(this.connectivityManager, this.networkCallback);
        } catch (IllegalArgumentException e10) {
            Logger.get().error(NetworkStateTrackerKt.TAG, "Received exception while registering network callback", e10);
        } catch (SecurityException e11) {
            Logger.get().error(NetworkStateTrackerKt.TAG, "Received exception while registering network callback", e11);
        }
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void stopTracking() {
        try {
            Logger.get().debug(NetworkStateTrackerKt.TAG, "Unregistering network callback");
            this.connectivityManager.unregisterNetworkCallback(this.networkCallback);
        } catch (IllegalArgumentException e10) {
            Logger.get().error(NetworkStateTrackerKt.TAG, "Received exception while unregistering network callback", e10);
        } catch (SecurityException e11) {
            Logger.get().error(NetworkStateTrackerKt.TAG, "Received exception while unregistering network callback", e11);
        }
    }
}
