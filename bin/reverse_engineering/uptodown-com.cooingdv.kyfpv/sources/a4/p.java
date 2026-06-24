package a4;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import com.google.android.gms.internal.measurement.f8;
import e1.q1;
import e1.t1;
import e1.w0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class p extends BroadcastReceiver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static long f156d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f158b;

    public /* synthetic */ p(Object obj, int i) {
        this.f157a = i;
        this.f158b = obj;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data;
        String schemeSpecificPart;
        int i = 10;
        int i6 = 9;
        switch (this.f157a) {
            case 0:
                q qVar = (q) this.f158b;
                if (intent != null) {
                    String action = intent.getAction();
                    if (!"android.intent.action.AIRPLANE_MODE".equals(action)) {
                        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                            StringBuilder sb = t0.f177a;
                            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                            n nVar = qVar.h;
                            nVar.sendMessage(nVar.obtainMessage(9, activeNetworkInfo));
                        }
                        break;
                    } else if (intent.hasExtra("state")) {
                        boolean booleanExtra = intent.getBooleanExtra("state", false);
                        n nVar2 = qVar.h;
                        nVar2.sendMessage(nVar2.obtainMessage(10, booleanExtra ? 1 : 0, 0));
                        break;
                    }
                }
                break;
            case 1:
                t1 t1Var = (t1) this.f158b;
                if (intent != null) {
                    String action2 = intent.getAction();
                    if (action2 != null) {
                        int iHashCode = action2.hashCode();
                        if (iHashCode != -1928239649) {
                            if (iHashCode == 1279883384 && action2.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                                w0 w0Var = t1Var.f4265o;
                                t1.m(w0Var);
                                w0Var.f4347w.b("[sgtm] App Receiver notified batches are available");
                                q1 q1Var = t1Var.f4266p;
                                t1.m(q1Var);
                                q1Var.p(new f(this, i6));
                            }
                            break;
                        } else if (action2.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                            f8.a();
                            if (t1Var.f4263m.q(null, e1.f0.R0)) {
                                w0 w0Var2 = t1Var.f4265o;
                                t1.m(w0Var2);
                                w0Var2.f4347w.b("App receiver notified triggers are available");
                                q1 q1Var2 = t1Var.f4266p;
                                t1.m(q1Var2);
                                q1Var2.p(new f(t1Var, i));
                                break;
                            }
                        }
                        w0 w0Var3 = t1Var.f4265o;
                        t1.m(w0Var3);
                        w0Var3.f4343r.b("App receiver called with unknown action");
                    } else {
                        w0 w0Var4 = t1Var.f4265o;
                        t1.m(w0Var4);
                        w0Var4.f4343r.b("App receiver called with null action");
                    }
                } else {
                    w0 w0Var5 = t1Var.f4265o;
                    t1.m(w0Var5);
                    w0Var5.f4343r.b("App receiver called with null intent");
                }
                break;
            default:
                context.getClass();
                intent.getClass();
                Activity activity = f4.c.f4876o;
                this.f158b = t0.f.e(context);
                String action3 = intent.getAction();
                if (action3 != null && action3.equalsIgnoreCase("android.intent.action.PACKAGE_REMOVED") && !intent.getBooleanExtra("android.intent.extra.REPLACING", false) && (data = intent.getData()) != null && (schemeSpecificPart = data.getSchemeSpecificPart()) != null) {
                    String strConcat = action3.concat(schemeSpecificPart);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    boolean z9 = !strConcat.equalsIgnoreCase(f155c) || jCurrentTimeMillis - f156d > 2000;
                    f156d = jCurrentTimeMillis;
                    f155c = strConcat;
                    if (z9) {
                        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
                        v7.e eVar = o7.m0.f8289a;
                        o7.c0.s(o7.c0.b(v7.d.f10885a), null, null, new z4.a(this, schemeSpecificPart, pendingResultGoAsync, (t6.c) null), 3);
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ p() {
        this.f157a = 2;
    }
}
