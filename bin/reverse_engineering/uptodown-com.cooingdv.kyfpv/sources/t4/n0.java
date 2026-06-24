package t4;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.documentfile.provider.DocumentFile;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBinding;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.uptodown.util.views.MaxHeightRecyclerView;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.zip.Adler32;
import javax.net.ssl.SSLSocket;
import x4.b3;
import x4.q2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class n0 implements ViewBinding, k4.a, w4.o, t.b, w1.b, w1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10015b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f10016l;

    public n0(g5.f fVar) {
        this.f10015b = new Object();
        this.f10014a = fVar;
    }

    @Override // w4.o
    public void a(int i) {
        ArrayList arrayList = (ArrayList) this.f10015b;
        ArrayList arrayList2 = (ArrayList) this.f10014a;
        if (((b3) arrayList2.get(i)).f11068l != 0) {
            ((kotlin.jvm.internal.u) this.f10016l).f7022a = !r4.f7022a;
        } else if (arrayList.contains(arrayList2.get(i))) {
            arrayList.remove(arrayList2.get(i));
        } else {
            arrayList.add(arrayList2.get(i));
        }
    }

    public Method b(Class cls) {
        Method method;
        Class cls2;
        try {
            method = cls.getMethod((String) this.f10015b, (Class[]) this.f10016l);
        } catch (NoSuchMethodException unused) {
        }
        try {
            if ((method.getModifiers() & 1) == 0) {
                method = null;
            }
        } catch (NoSuchMethodException unused2) {
        }
        if (method == null || (cls2 = (Class) this.f10014a) == null || cls2.isAssignableFrom(method.getReturnType())) {
            return method;
        }
        return null;
    }

    public Object c(SSLSocket sSLSocket, Object... objArr) {
        Method methodB = b(sSLSocket.getClass());
        if (methodB == null) {
            throw new AssertionError("Method " + ((String) this.f10015b) + " not supported for object " + sSLSocket);
        }
        try {
            return methodB.invoke(sSLSocket, objArr);
        } catch (IllegalAccessException e10) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + methodB);
            assertionError.initCause(e10);
            throw assertionError;
        }
    }

    public void d(SSLSocket sSLSocket, Object... objArr) {
        try {
            Method methodB = b(sSLSocket.getClass());
            if (methodB == null) {
                return;
            }
            try {
                methodB.invoke(sSLSocket, objArr);
            } catch (IllegalAccessException unused) {
            }
        } catch (InvocationTargetException e10) {
            Throwable targetException = e10.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public void e(r.p pVar, int i, boolean z9) {
        char c9;
        x.a aVar = (x.a) this.f10016l;
        Context context = (Context) this.f10014a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        r.j jVar = (r.j) pVar;
        adler32.update(jVar.f8832a.getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(b0.a.a(jVar.f8834c)).array());
        byte[] bArr = jVar.f8833b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z9) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i6 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i6 >= i) {
                        a.a.u("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", pVar);
                        return;
                    }
                }
            }
        }
        SQLiteDatabase sQLiteDatabaseB = ((y.h) ((y.d) this.f10015b)).b();
        String str = jVar.f8832a;
        o.d dVar = jVar.f8834c;
        Cursor cursorRawQuery = sQLiteDatabaseB.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(b0.a.a(dVar))});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(aVar.a(dVar, jLongValue, i));
            Set set = ((x.b) aVar.f11011b.get(dVar)).f11014c;
            if (set.contains(x.c.f11015a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(x.c.f11017l)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(x.c.f11016b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", b0.a.a(dVar));
            byte[] bArr2 = jVar.f8833b;
            if (bArr2 != null) {
                c9 = 0;
                persistableBundle.putString("extras", Base64.encodeToString(bArr2, 0));
            } else {
                c9 = 0;
            }
            builder.setExtras(persistableBundle);
            Integer numValueOf = Integer.valueOf(value);
            Long lValueOf2 = Long.valueOf(aVar.a(dVar, jLongValue, i));
            Integer numValueOf2 = Integer.valueOf(i);
            Object[] objArr = new Object[5];
            objArr[c9] = pVar;
            objArr[1] = numValueOf;
            objArr[2] = lValueOf2;
            objArr[3] = lValueOf;
            objArr[4] = numValueOf2;
            String strD = a.a.D("JobInfoScheduler");
            if (Log.isLoggable(strD, 3)) {
                Log.d(strD, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // w1.b
    public void g(Bundle bundle, String str) {
        CountDownLatch countDownLatch = (CountDownLatch) this.f10016l;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    @Override // m6.a
    public Object get() {
        return new n0((Context) ((m6.a) this.f10014a).get(), (y.d) ((m6.a) this.f10015b).get(), (x.a) ((q1.a) this.f10016l).get());
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return (RelativeLayout) this.f10014a;
    }

    @Override // w1.a
    public void i(Bundle bundle) {
        synchronized (this.f10015b) {
            try {
                v1.c cVar = v1.c.f10792a;
                cVar.c("Logging event _ae to Firebase Analytics with params " + bundle);
                this.f10016l = new CountDownLatch(1);
                ((g5.f) this.f10014a).i(bundle);
                cVar.c("Awaiting app exception callback from Analytics...");
                try {
                    if (((CountDownLatch) this.f10016l).await(500, TimeUnit.MILLISECONDS)) {
                        cVar.c("App exception callback received from Analytics listener.");
                    } else {
                        cVar.d("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                    }
                } catch (InterruptedException unused) {
                    Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
                }
                this.f10016l = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // k4.a
    public void k(Object obj, int i, int i6, long j) {
        obj.getClass();
    }

    @Override // k4.a
    public void m(File file) {
        file.getClass();
    }

    @Override // k4.a
    public void o(int i, String str, long j, long j6) {
        str.getClass();
    }

    @Override // k4.a
    public void r(File file) {
        file.getClass();
    }

    @Override // k4.a
    public void x(Object obj) {
        obj.getClass();
    }

    @Override // k4.a
    public void y() {
        u4.f0 f0Var = (u4.f0) this.f10014a;
        if (f0Var.getActivity() == null || !(f0Var.getActivity() instanceof c4.k0)) {
            return;
        }
        FragmentActivity activity = f0Var.getActivity();
        activity.getClass();
        File file = (File) this.f10015b;
        file.getClass();
        ((c4.k0) activity).W(file, ((q2) this.f10016l).f11351q);
    }

    public /* synthetic */ n0(Object obj, Object obj2, Object obj3) {
        this.f10014a = obj;
        this.f10015b = obj2;
        this.f10016l = obj3;
    }

    public n0(RelativeLayout relativeLayout, ImageView imageView, RelativeLayout relativeLayout2, MaxHeightRecyclerView maxHeightRecyclerView, TextView textView, TextView textView2, View view) {
        this.f10014a = relativeLayout;
        this.f10015b = relativeLayout2;
        this.f10016l = view;
    }

    @Override // k4.a
    public void f(DocumentFile documentFile) {
    }

    @Override // k4.a
    public void n(DocumentFile documentFile) {
    }
}
