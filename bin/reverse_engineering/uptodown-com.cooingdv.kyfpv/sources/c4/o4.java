package c4;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AppInstalledDetailsActivity;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o4 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w4 f1944b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x4.e f1945l;

    public /* synthetic */ o4(w4 w4Var, x4.e eVar, int i) {
        this.f1943a = i;
        this.f1944b = w4Var;
        this.f1945l = eVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i = this.f1943a;
        int i6 = 2;
        t6.c cVar = null;
        int i10 = 1;
        w4 w4Var = this.f1944b;
        x4.e eVar = this.f1945l;
        int i11 = 0;
        switch (i) {
            case 0:
                float f = UptodownApp.I;
                if (b4.d.t()) {
                    w4Var.i0(eVar.F);
                    AlertDialog alertDialog = w4Var.F;
                    alertDialog.getClass();
                    alertDialog.dismiss();
                    w4Var.U = false;
                }
                break;
            case 1:
                float f10 = UptodownApp.I;
                if (b4.d.t()) {
                    w4 w4Var2 = this.f1944b;
                    AlertDialog alertDialog2 = w4Var2.F;
                    alertDialog2.getClass();
                    alertDialog2.dismiss();
                    w4Var2.U = false;
                    w4Var2.X = true;
                    w4Var2.T = new ArrayList();
                    String str = eVar.f11124l;
                    str.getClass();
                    String str2 = eVar.f11123b;
                    str2.getClass();
                    w4Var2.T.add(new l4.b(str, str2));
                    ArrayList arrayList3 = eVar.I;
                    boolean z9 = ((arrayList3 == null || arrayList3.isEmpty()) && ((arrayList = eVar.J) == null || arrayList.isEmpty())) ? false : true;
                    String str3 = eVar.f11123b;
                    str3.getClass();
                    String str4 = eVar.f11124l;
                    str4.getClass();
                    w4Var2.h(str3, str4, eVar.f11125m, eVar.f11126n, z9);
                }
                break;
            case 2:
                LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(w4Var);
                v7.e eVar2 = o7.m0.f8289a;
                o7.c0.s(lifecycleScope, t7.n.f10349a, null, new t4(w4Var, eVar, cVar, i10), 2);
                AlertDialog alertDialog3 = w4Var.F;
                alertDialog3.getClass();
                alertDialog3.dismiss();
                w4Var.U = false;
                break;
            case 3:
                float f11 = UptodownApp.I;
                if (b4.d.t()) {
                    AlertDialog alertDialog4 = w4Var.F;
                    alertDialog4.getClass();
                    alertDialog4.dismiss();
                    w4Var.U = false;
                    if (!w4Var.isFinishing()) {
                        o7.c0.s(LifecycleOwnerKt.getLifecycleScope(w4Var), null, null, new t4(w4Var, eVar, cVar, i6), 3);
                    }
                }
                break;
            case 4:
                float f12 = UptodownApp.I;
                if (b4.d.t()) {
                    o7.c0.s(LifecycleOwnerKt.getLifecycleScope(w4Var), null, null, new t4(w4Var, eVar, cVar, i11), 3);
                    AlertDialog alertDialog5 = w4Var.F;
                    alertDialog5.getClass();
                    alertDialog5.dismiss();
                    w4Var.U = false;
                }
                break;
            case 5:
                float f13 = UptodownApp.I;
                if (b4.d.t()) {
                    String str5 = eVar.f11124l;
                    if (str5 != null && str5.length() != 0) {
                        PackageManager packageManager = w4Var.getPackageManager();
                        String str6 = eVar.f11124l;
                        str6.getClass();
                        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str6);
                        if (launchIntentForPackage != null) {
                            w4Var.startActivity(launchIntentForPackage);
                        } else {
                            String string = w4Var.getString(R.string.error_open_app, eVar.f11123b);
                            string.getClass();
                            w4Var.N(string);
                        }
                    }
                    AlertDialog alertDialog6 = w4Var.F;
                    alertDialog6.getClass();
                    alertDialog6.dismiss();
                    w4Var.U = false;
                }
                break;
            case 6:
                float f14 = UptodownApp.I;
                if (b4.d.t()) {
                    String str7 = eVar.f11124l;
                    if (str7 != null && str7.length() != 0) {
                        String str8 = eVar.f11124l;
                        str8.getClass();
                        Intent intent = new Intent("android.intent.action.DELETE", Uri.parse("package:".concat(str8)));
                        intent.addFlags(268435456);
                        w4Var.startActivity(intent);
                    }
                    AlertDialog alertDialog7 = w4Var.F;
                    alertDialog7.getClass();
                    alertDialog7.dismiss();
                    w4Var.U = false;
                }
                break;
            case 7:
                float f15 = UptodownApp.I;
                if (b4.d.t()) {
                    w4 w4Var3 = this.f1944b;
                    AlertDialog alertDialog8 = w4Var3.F;
                    alertDialog8.getClass();
                    alertDialog8.dismiss();
                    w4Var3.U = false;
                    w4Var3.T = new ArrayList();
                    String str9 = eVar.f11124l;
                    str9.getClass();
                    String str10 = eVar.f11123b;
                    str10.getClass();
                    w4Var3.T.add(new l4.b(str9, str10));
                    ArrayList arrayList4 = eVar.I;
                    boolean z10 = ((arrayList4 == null || arrayList4.isEmpty()) && ((arrayList2 = eVar.J) == null || arrayList2.isEmpty())) ? false : true;
                    String str11 = eVar.f11123b;
                    str11.getClass();
                    String str12 = eVar.f11124l;
                    str12.getClass();
                    w4Var3.h(str11, str12, eVar.f11125m, eVar.f11126n, z10);
                }
                break;
            case 8:
                float f16 = UptodownApp.I;
                if (b4.d.t()) {
                    AlertDialog alertDialog9 = w4Var.F;
                    alertDialog9.getClass();
                    alertDialog9.dismiss();
                    w4Var.U = false;
                    Intent intent2 = new Intent(w4Var, (Class<?>) AppInstalledDetailsActivity.class);
                    intent2.putExtra("appInstalled", eVar);
                    w4Var.startActivity(intent2, b4.d.a(w4Var));
                }
                break;
            default:
                float f17 = UptodownApp.I;
                if (b4.d.t()) {
                    w4Var.I0(eVar);
                    AlertDialog alertDialog10 = w4Var.F;
                    alertDialog10.getClass();
                    alertDialog10.dismiss();
                    w4Var.U = false;
                }
                break;
        }
    }

    public /* synthetic */ o4(x4.e eVar, w4 w4Var, int i) {
        this.f1943a = i;
        this.f1945l = eVar;
        this.f1944b = w4Var;
    }
}
