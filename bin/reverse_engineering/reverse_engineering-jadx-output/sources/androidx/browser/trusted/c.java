package androidx.browser.trusted;

import android.R;
import android.app.AlertDialog;
import android.app.job.JobParameters;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.net.Uri;
import android.net.nsd.NsdServiceInfo;
import android.os.Handler;
import android.os.Process;
import android.os.StrictMode;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.ViewTransition;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.Violation;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactionExecutor;
import androidx.window.embedding.ExtensionEmbeddingBackend;
import androidx.window.layout.SidecarWindowBackend;
import androidx.window.layout.WindowLayoutInfo;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.background.greedy.TimeLimiter;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.utils.CancelWorkRunnable;
import c4.e3;
import c4.h3;
import c4.k0;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.uptodown.activities.MainActivity;
import com.uptodown.tv.ui.fragment.TvAppDetailFragment;
import g4.b0;
import g4.q0;
import g4.s0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.l;
import l7.m;
import m5.v;
import o.d;
import o7.c0;
import o7.m0;
import r.j;
import r.r;
import s1.n;
import s1.p;
import t1.h;
import v7.e;
import x4.g;
import z3.f;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f325b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f326l;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.f324a = i;
        this.f325b = obj;
        this.f326l = obj2;
    }

    private final void a() {
        n nVar = (n) this.f325b;
        s2.b bVar = (s2.b) this.f326l;
        synchronized (nVar) {
            try {
                if (nVar.f9144b == null) {
                    nVar.f9143a.add(bVar);
                } else {
                    nVar.f9144b.add(bVar.get());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        SharedPreferences sharedPreferences;
        String str;
        int childAdapterPosition;
        s2.a aVar;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i = 2;
        int i6 = 0;
        int i10 = 1;
        switch (this.f324a) {
            case 0:
                ((TrustedWebActivityServiceConnectionPool) this.f325b).lambda$connect$0((Uri) this.f326l);
                return;
            case 1:
                ((ViewTransition) this.f325b).lambda$applyTransition$0((View[]) this.f326l);
                return;
            case 2:
                ((ResourcesCompat.FontCallback) this.f325b).lambda$callbackSuccessAsync$0((Typeface) this.f326l);
                return;
            case 3:
                TransactionExecutor.execute$lambda$1$lambda$0((Runnable) this.f325b, (TransactionExecutor) this.f326l);
                return;
            case 4:
                ExtensionEmbeddingBackend.SplitListenerWrapper.m230accept$lambda1((ExtensionEmbeddingBackend.SplitListenerWrapper) this.f325b, (ArrayList) this.f326l);
                return;
            case 5:
                SidecarWindowBackend.WindowLayoutChangeCallbackWrapper.m231accept$lambda0((SidecarWindowBackend.WindowLayoutChangeCallbackWrapper) this.f325b, (WindowLayoutInfo) this.f326l);
                return;
            case 6:
                TimeLimiter.track$lambda$0((TimeLimiter) this.f325b, (StartStopToken) this.f326l);
                return;
            case 7:
                ConstraintTracker._set_state_$lambda$4$lambda$3((List) this.f325b, (ConstraintTracker) this.f326l);
                return;
            case 8:
                CancelWorkRunnable.forId$lambda$1$lambda$0((WorkManagerImpl) this.f325b, (UUID) this.f326l);
                return;
            case 9:
                CancelWorkRunnable.forAll$lambda$7$lambda$6((WorkDatabase) this.f325b, (WorkManagerImpl) this.f326l);
                return;
            case 10:
                MainActivity mainActivity = (MainActivity) this.f325b;
                g gVar = (g) this.f326l;
                int i11 = MainActivity.G0;
                try {
                    sharedPreferences = mainActivity.getSharedPreferences("SettingsPreferences", 0);
                } catch (Exception unused) {
                }
                boolean z9 = sharedPreferences.contains("is_device_tracking_registered") ? sharedPreferences.getBoolean("is_device_tracking_registered", false) : false;
                if (z9) {
                    mainActivity.f3309g0 = 0;
                    LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(mainActivity);
                    e eVar = m0.f8288a;
                    c0.s(lifecycleScope, t7.n.f10348a, null, new h3(mainActivity, gVar, objArr2 == true ? 1 : 0, i10), 2);
                    return;
                }
                int i12 = mainActivity.f3309g0;
                if (i12 >= 5) {
                    mainActivity.f3309g0 = 0;
                    LifecycleCoroutineScope lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(mainActivity);
                    e eVar2 = m0.f8288a;
                    c0.s(lifecycleScope2, t7.n.f10348a, null, new h3(mainActivity, gVar, objArr == true ? 1 : 0, i), 2);
                    return;
                }
                mainActivity.f3309g0 = i12 + 1;
                Handler handler = mainActivity.f3308f0;
                c cVar = mainActivity.f3327z0;
                if (cVar != null) {
                    handler.postDelayed(cVar, 2000L);
                    return;
                } else {
                    l.i("checkRegisteredDeepLinkRunnable");
                    throw null;
                }
                break;
            case 11:
                ImageView imageView = (ImageView) this.f325b;
                MainActivity mainActivity2 = (MainActivity) this.f326l;
                int i13 = MainActivity.G0;
                Rect rect = new Rect();
                imageView.getHitRect(rect);
                int i14 = -((int) (12 * mainActivity2.getResources().getDisplayMetrics().density));
                rect.inset(i14, i14);
                ViewParent parent = imageView.getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view != null) {
                    view.setTouchDelegate(new TouchDelegate(rect, imageView));
                    return;
                }
                return;
            case 12:
                f2.c cVar2 = (f2.c) this.f325b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f326l;
                try {
                    r.a().f8852d.a(((j) cVar2.h.f81b).a(d.f8128l), 1);
                    break;
                } catch (Exception unused2) {
                }
                countDownLatch.countDown();
                return;
            case 13:
                TvAppDetailFragment tvAppDetailFragment = (TvAppDetailFragment) this.f325b;
                e3 e3Var = (e3) this.f326l;
                int i15 = e3Var.f1549l;
                x4.r rVar = (x4.r) e3Var.f1548b;
                g gVar2 = tvAppDetailFragment.f3413a;
                if (gVar2 == null || rVar == null || (str = rVar.f11355b) == null || !str.equalsIgnoreCase(gVar2.F)) {
                    return;
                }
                if (i15 == 200) {
                    tvAppDetailFragment.p(rVar);
                    return;
                }
                if (i15 == 201) {
                    tvAppDetailFragment.p(rVar);
                    return;
                }
                if (i15 == 205) {
                    tvAppDetailFragment.p(rVar);
                    return;
                }
                if (i15 == 206) {
                    tvAppDetailFragment.p(rVar);
                    return;
                }
                if (i15 == 202) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(tvAppDetailFragment.getContext());
                    builder.setMessage(tvAppDetailFragment.getString(2131951914));
                    builder.setTitle(rVar.f11366w);
                    builder.setPositiveButton(2131952428, new g5.c(rVar, tvAppDetailFragment));
                    builder.setNegativeButton(R.string.cancel, new f5.b(3));
                    builder.setCancelable(true);
                    AlertDialog alertDialogCreate = builder.create();
                    if (tvAppDetailFragment.getActivity() != null && !tvAppDetailFragment.requireActivity().isFinishing()) {
                        alertDialogCreate.show();
                    }
                }
                tvAppDetailFragment.u();
                return;
            case 14:
                FragmentStrictMode.m45handlePolicyViolation$lambda0((FragmentStrictMode.Policy) this.f325b, (Violation) this.f326l);
                return;
            case 15:
                FragmentStrictMode.m46handlePolicyViolation$lambda1((String) this.f325b, (Violation) this.f326l);
                return;
            case 16:
                s0 s0Var = (s0) this.f325b;
                NsdServiceInfo nsdServiceInfo = (NsdServiceInfo) this.f326l;
                String string = s0Var.getString(2131952268);
                String serviceName = nsdServiceInfo.getServiceName();
                serviceName.getClass();
                s0Var.A(string + serviceName.substring(0, m.y0(serviceName, "_d:_", 0, false, 6)));
                return;
            case 17:
                s0 s0Var2 = (s0) this.f325b;
                l4.c cVar3 = (l4.c) this.f326l;
                s0Var2.E();
                View viewInflate = View.inflate(s0Var2, 2131558499, null);
                View viewFindViewById = viewInflate.findViewById(2131364011);
                viewFindViewById.getClass();
                TextView textView = (TextView) viewFindViewById;
                textView.setTypeface(f4.c.f4883x);
                String string2 = s0Var2.getString(2131952267);
                string2.getClass();
                textView.setText(String.format(string2, Arrays.copyOf(new Object[]{cVar3.f, cVar3.f7104b}, 2)));
                View viewFindViewById2 = viewInflate.findViewById(2131363722);
                viewFindViewById2.getClass();
                TextView textView2 = (TextView) viewFindViewById2;
                textView2.setTypeface(f4.c.f4883x);
                textView2.setOnClickListener(new b0(i, s0Var2, cVar3));
                View viewFindViewById3 = viewInflate.findViewById(2131363688);
                viewFindViewById3.getClass();
                TextView textView3 = (TextView) viewFindViewById3;
                textView3.setTypeface(f4.c.f4882w);
                textView3.setOnClickListener(new q0(s0Var2, i6));
                s0Var2.G(viewInflate);
                return;
            case 18:
                v vVar = (v) this.f325b;
                w4.l lVar = (w4.l) this.f326l;
                l5.b bVar = vVar.f7611o;
                e4.j jVar = vVar.f7609m;
                RecyclerView recyclerView = vVar.f7608l;
                View viewFindSnapView = bVar.findSnapView(recyclerView.getLayoutManager());
                if (viewFindSnapView == null || (childAdapterPosition = recyclerView.getChildAdapterPosition(viewFindSnapView) % jVar.f4569c.size()) == -1) {
                    return;
                }
                Object obj = jVar.f4569c.get(childAdapterPosition);
                obj.getClass();
                g gVar3 = (g) obj;
                if (!gVar3.m() || vVar.f7612p) {
                    return;
                }
                lVar.c(gVar3);
                vVar.f7612p = true;
                return;
            case 19:
                ((n5.d) this.f325b).c((k0) this.f326l);
                return;
            case 20:
                p pVar = (p) this.f325b;
                s2.b bVar2 = (s2.b) this.f326l;
                if (pVar.f9149b != p.f9147d) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("provide() can be called only once.");
                    return;
                }
                synchronized (pVar) {
                    aVar = pVar.f9148a;
                    pVar.f9148a = null;
                    pVar.f9149b = bVar2;
                    break;
                }
                aVar.b(bVar2);
                return;
            case 21:
                a();
                return;
            case 22:
                t1.a aVar2 = (t1.a) this.f325b;
                Runnable runnable = (Runnable) this.f326l;
                Process.setThreadPriority(aVar2.f9504c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.f9505d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 23:
                Callable callable = (Callable) this.f325b;
                h hVar = (h) ((g5.g) this.f326l).f5315b;
                try {
                    hVar.set(callable.call());
                    return;
                } catch (Exception e10) {
                    hVar.setException(e10);
                    return;
                }
            case 24:
                u4.d dVar = (u4.d) this.f325b;
                b5.m mVar = (b5.m) this.f326l;
                int i16 = (int) (((double) dVar.getResources().getDisplayMetrics().heightPixels) * 0.6d);
                ScrollView scrollView = (ScrollView) mVar.f1062l;
                if (scrollView.getHeight() > i16) {
                    scrollView.getLayoutParams().height = i16;
                    scrollView.requestLayout();
                    return;
                }
                return;
            case 25:
                v3.h hVar2 = (v3.h) this.f325b;
                String str2 = (String) this.f326l;
                f fVar = hVar2.f10844a;
                Iterator<T> it = fVar.getListeners().iterator();
                while (it.hasNext()) {
                    ((w3.a) it.next()).f(fVar.getInstance(), str2);
                }
                return;
            case 26:
                v3.h hVar3 = (v3.h) this.f325b;
                v3.c cVar4 = (v3.c) this.f326l;
                f fVar2 = hVar3.f10844a;
                Iterator<T> it2 = fVar2.getListeners().iterator();
                while (it2.hasNext()) {
                    ((w3.a) it2.next()).b(fVar2.getInstance(), cVar4);
                }
                return;
            case 27:
                v3.h hVar4 = (v3.h) this.f325b;
                v3.d dVar2 = (v3.d) this.f326l;
                f fVar3 = hVar4.f10844a;
                Iterator<T> it3 = fVar3.getListeners().iterator();
                while (it3.hasNext()) {
                    ((w3.a) it3.next()).d(fVar3.getInstance(), dVar2);
                }
                return;
            case 28:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f325b;
                JobParameters jobParameters = (JobParameters) this.f326l;
                int i17 = JobInfoSchedulerService.f2426a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            default:
                ((y1.l) this.f325b).c((String) this.f326l, Boolean.FALSE);
                return;
        }
    }
}
