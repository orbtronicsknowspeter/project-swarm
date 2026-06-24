package a2;

import android.util.Log;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.work.Configuration;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkGenerationalId;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f46b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f47l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f48m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f49n;

    public /* synthetic */ r(List list, WorkGenerationalId workGenerationalId, Configuration configuration, WorkDatabase workDatabase) {
        this.f45a = 1;
        this.f46b = list;
        this.f47l = workGenerationalId;
        this.f48m = configuration;
        this.f49n = workDatabase;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        String strE;
        BufferedWriter bufferedWriter;
        BufferedWriter bufferedWriter2;
        switch (this.f45a) {
            case 0:
                e2.d dVar = (e2.d) this.f47l;
                String str = (String) this.f48m;
                Map map = (Map) this.f49n;
                List list = (List) this.f46b;
                h hVar = (h) dVar.f4467l;
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) dVar.f4472q;
                BufferedWriter bufferedWriter3 = null;
                if (((String) atomicMarkableReference.getReference()) != null) {
                    String str2 = (String) atomicMarkableReference.getReference();
                    File fileH = hVar.f21a.h(str, "user-data");
                    try {
                        g gVar = new g();
                        gVar.put("userId", str2);
                        String string = gVar.toString();
                        bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileH), h.f20b));
                        try {
                            try {
                                bufferedWriter2.write(string);
                                bufferedWriter2.flush();
                            } catch (Exception e10) {
                                e = e10;
                                Log.w("FirebaseCrashlytics", "Error serializing user metadata.", e);
                            }
                        } catch (Throwable th) {
                            th = th;
                            bufferedWriter3 = bufferedWriter2;
                            y1.g.b(bufferedWriter3, "Failed to close user metadata file.");
                            throw th;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        bufferedWriter2 = null;
                    } catch (Throwable th2) {
                        th = th2;
                        y1.g.b(bufferedWriter3, "Failed to close user metadata file.");
                        throw th;
                    }
                    y1.g.b(bufferedWriter2, "Failed to close user metadata file.");
                }
                if (!map.isEmpty()) {
                    hVar.h(str, map, false);
                }
                if (list.isEmpty()) {
                    return;
                }
                File fileH2 = hVar.f21a.h(str, "rollouts-state");
                if (list.isEmpty()) {
                    h.g(fileH2, "Rollout state is empty for session: " + str);
                    return;
                }
                try {
                    try {
                        strE = h.e(list);
                        bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileH2), h.f20b));
                    } catch (Exception e12) {
                        e = e12;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                try {
                    bufferedWriter.write(strE);
                    bufferedWriter.flush();
                    y1.g.b(bufferedWriter, "Failed to close rollouts state file.");
                    return;
                } catch (Exception e13) {
                    e = e13;
                    bufferedWriter3 = bufferedWriter;
                    Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e);
                    h.f(fileH2);
                    y1.g.b(bufferedWriter3, "Failed to close rollouts state file.");
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    bufferedWriter3 = bufferedWriter;
                    y1.g.b(bufferedWriter3, "Failed to close rollouts state file.");
                    throw th;
                }
                break;
            case 1:
                Schedulers.lambda$registerRescheduling$0((List) this.f46b, (WorkGenerationalId) this.f47l, (Configuration) this.f48m, (WorkDatabase) this.f49n);
                return;
            case 2:
                ImageView imageView = (ImageView) this.f47l;
                Animation animation = (Animation) this.f48m;
                ImageView imageView2 = (ImageView) this.f49n;
                Animation animation2 = (Animation) this.f46b;
                imageView.startAnimation(animation);
                imageView2.startAnimation(animation2);
                return;
            default:
                w.a aVar = (w.a) this.f47l;
                r.j jVar = (r.j) this.f48m;
                String str3 = jVar.f8831a;
                o.g gVar2 = (o.g) this.f49n;
                r.i iVar = (r.i) this.f46b;
                aVar.getClass();
                Logger logger = w.a.f;
                try {
                    s.e eVarA = aVar.f10907c.a(str3);
                    if (eVarA == null) {
                        String str4 = "Transport backend '" + str3 + "' is not registered";
                        logger.warning(str4);
                        gVar2.a(new IllegalArgumentException(str4));
                    } else {
                        ((y.h) aVar.f10909e).h(new androidx.transition.a(aVar, jVar, ((p.c) eVarA).a(iVar), 3));
                        gVar2.a(null);
                    }
                    return;
                } catch (Exception e14) {
                    logger.warning("Error scheduling event " + e14.getMessage());
                    gVar2.a(e14);
                    return;
                }
        }
    }

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f45a = i;
        this.f47l = obj;
        this.f48m = obj2;
        this.f49n = obj3;
        this.f46b = obj4;
    }
}
