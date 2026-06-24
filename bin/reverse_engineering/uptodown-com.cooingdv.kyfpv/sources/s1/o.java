package s1;

import a4.d0;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;
import k0.y;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements s2.a, d, j1.e, y.f, j1.a, p2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9146a;

    public /* synthetic */ o(int i) {
        this.f9146a = i;
    }

    public static /* synthetic */ void d() throws EOFException {
        throw new EOFException();
    }

    public static /* synthetic */ void e(int i, int i6, Object obj, String str) {
        throw new IllegalArgumentException((str + i + obj + i6).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void f(int i, int i6, String str) {
        throw new IllegalArgumentException((str + i + ((char) i6)).toString());
    }

    public static /* synthetic */ void h(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void j(Object obj) {
        throw new AssertionError(obj);
    }

    public static /* synthetic */ void k(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void l(Object obj, String str, Object obj2) {
        throw new a1.b(str + obj + obj2);
    }

    public static /* synthetic */ void m(String str, Throwable th) {
        throw new q3.a(str, th);
    }

    public static /* synthetic */ void n() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void o(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void p(Object obj, String str) throws FileNotFoundException {
        throw new FileNotFoundException(str + obj);
    }

    @Override // y.f
    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            String string = cursor.getString(1);
            if (string == null) {
                com.google.gson.internal.a.i("Null backendName");
                return null;
            }
            o.d dVarB = b0.a.b(cursor.getInt(2));
            String string2 = cursor.getString(3);
            arrayList.add(new r.j(string, string2 == null ? null : Base64.decode(string2, 0), dVarB));
        }
        return arrayList;
    }

    @Override // s2.a
    public void b(s2.b bVar) {
        switch (this.f9146a) {
            case 0:
                return;
            default:
                bVar.get().getClass();
                throw new ClassCastException();
        }
    }

    @Override // s1.d
    public Object c(d0 d0Var) {
        switch (this.f9146a) {
            case 2:
                return (ScheduledExecutorService) ExecutorsRegistrar.f3073a.get();
            case 3:
                return (ScheduledExecutorService) ExecutorsRegistrar.f3075c.get();
            case 4:
                return (ScheduledExecutorService) ExecutorsRegistrar.f3074b.get();
            case 5:
                m mVar = ExecutorsRegistrar.f3073a;
                return t1.j.f9534a;
            default:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(d0Var);
        }
    }

    @Override // j1.a
    public Object g(j1.p pVar) throws IOException {
        boolean z9;
        int i;
        Object obj;
        switch (this.f9146a) {
            case 24:
                if (pVar.i()) {
                    y1.b bVar = (y1.b) pVar.g();
                    v1.c cVar = v1.c.f10792a;
                    cVar.b("Crashlytics report successfully enqueued to DataTransport: " + bVar.f11606b);
                    File file = bVar.f11607c;
                    z9 = true;
                    if (file.delete()) {
                        cVar.b("Deleted report file: " + file.getPath());
                    } else {
                        cVar.d("Crashlytics could not delete report file: " + file.getPath(), null);
                    }
                } else {
                    Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", pVar.f());
                    z9 = false;
                }
                return Boolean.valueOf(z9);
            case 25:
            default:
                synchronized (pVar.f6561a) {
                    y.i(pVar.f6563c, "Task is not yet complete");
                    if (pVar.f6564d) {
                        throw new CancellationException("Task is already canceled.");
                    }
                    boolean zIsInstance = IOException.class.isInstance(pVar.f);
                    Exception exc = pVar.f;
                    if (zIsInstance) {
                        throw ((Throwable) IOException.class.cast(exc));
                    }
                    if (exc != null) {
                        throw new j1.g(exc);
                    }
                    obj = pVar.f6565e;
                }
                Bundle bundle = (Bundle) obj;
                if (bundle != null) {
                    String string = bundle.getString("registration_id");
                    if (string != null) {
                        return string;
                    }
                    String string2 = bundle.getString("unregistered");
                    if (string2 != null) {
                        return string2;
                    }
                    String string3 = bundle.getString("error");
                    if ("RST".equals(string3)) {
                        com.google.gson.internal.a.n("INSTANCE_ID_RESET");
                    } else if (string3 != null) {
                        com.google.gson.internal.a.n(string3);
                    } else {
                        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                        com.google.gson.internal.a.n("SERVICE_NOT_AVAILABLE");
                    }
                } else {
                    com.google.gson.internal.a.n("SERVICE_NOT_AVAILABLE");
                }
                return null;
            case 26:
                i = TypedValues.CycleType.TYPE_ALPHA;
                break;
            case 27:
                i = -1;
                break;
        }
        return Integer.valueOf(i);
    }

    @Override // j1.e
    public void i(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }

    public /* synthetic */ o(Object obj, int i) {
        this.f9146a = i;
    }

    private final void a(s2.b bVar) {
    }
}
