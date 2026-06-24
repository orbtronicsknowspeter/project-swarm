package k0;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import androidx.core.os.EnvironmentCompat;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k0 f6900a;

    public /* synthetic */ j0(k0 k0Var) {
        this.f6900a = k0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            k0 k0Var = this.f6900a;
            synchronized (k0Var.f6901a) {
                try {
                    h0 h0Var = (h0) message.obj;
                    i0 i0Var = (i0) k0Var.f6901a.get(h0Var);
                    if (i0Var != null && i0Var.f6884a.isEmpty()) {
                        if (i0Var.f6886l) {
                            h0 h0Var2 = i0Var.f6888n;
                            k0 k0Var2 = i0Var.f6890p;
                            k0Var2.f6903c.removeMessages(1, h0Var2);
                            k0Var2.f6904d.c(k0Var2.f6902b, i0Var);
                            i0Var.f6886l = false;
                            i0Var.f6885b = 2;
                        }
                        k0Var.f6901a.remove(h0Var);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        k0 k0Var3 = this.f6900a;
        synchronized (k0Var3.f6901a) {
            try {
                h0 h0Var3 = (h0) message.obj;
                i0 i0Var2 = (i0) k0Var3.f6901a.get(h0Var3);
                if (i0Var2 != null && i0Var2.f6885b == 3) {
                    String strValueOf = String.valueOf(h0Var3);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(strValueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentName = i0Var2.f6889o;
                    if (componentName == null) {
                        h0Var3.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = h0Var3.f6882b;
                        y.g(str);
                        componentName = new ComponentName(str, EnvironmentCompat.MEDIA_UNKNOWN);
                    }
                    i0Var2.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
