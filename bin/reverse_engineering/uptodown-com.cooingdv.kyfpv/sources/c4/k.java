package c4;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.uptodown.activities.AppInstalledDetailsActivity;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppInstalledDetailsActivity f1777b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(AppInstalledDetailsActivity appInstalledDetailsActivity, t6.c cVar, int i) {
        super(2, cVar);
        this.f1776a = i;
        this.f1777b = appInstalledDetailsActivity;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f1776a) {
            case 0:
                return new k(this.f1777b, cVar, 0);
            case 1:
                return new k(this.f1777b, cVar, 1);
            default:
                return new k(this.f1777b, cVar, 2);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f1776a) {
            case 0:
                k kVar = (k) create(a0Var, cVar);
                p6.x xVar = p6.x.f8464a;
                kVar.invokeSuspend(xVar);
                return xVar;
            case 1:
                k kVar2 = (k) create(a0Var, cVar);
                p6.x xVar2 = p6.x.f8464a;
                kVar2.invokeSuspend(xVar2);
                return xVar2;
            default:
                k kVar3 = (k) create(a0Var, cVar);
                p6.x xVar3 = p6.x.f8464a;
                kVar3.invokeSuspend(xVar3);
                return xVar3;
        }
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        PackageInfo packageInfoE;
        PermissionInfo[] permissionInfoArr;
        switch (this.f1776a) {
            case 0:
                p6.a.e(obj);
                AppInstalledDetailsActivity.O0(this.f1777b);
                break;
            case 1:
                AppInstalledDetailsActivity appInstalledDetailsActivity = this.f1777b;
                p6.a.e(obj);
                try {
                    PackageManager packageManager = appInstalledDetailsActivity.getPackageManager();
                    packageManager.getClass();
                    x4.e eVar = appInstalledDetailsActivity.f3302b0;
                    eVar.getClass();
                    String str = eVar.f11124l;
                    str.getClass();
                    packageInfoE = n4.i.e(packageManager, str, 4096);
                } catch (PackageManager.NameNotFoundException unused) {
                    packageInfoE = null;
                }
                if (packageInfoE != null && (permissionInfoArr = packageInfoE.permissions) != null) {
                    appInstalledDetailsActivity.f3304d0 = new ArrayList();
                    int i = 0;
                    while (i < permissionInfoArr.length) {
                        int i6 = i + 1;
                        try {
                            PermissionInfo permissionInfo = permissionInfoArr[i];
                            x4.v1 v1Var = new x4.v1();
                            String.valueOf(permissionInfo.loadDescription(appInstalledDetailsActivity.getPackageManager()));
                            v1Var.f11422a = permissionInfo.name;
                            ArrayList arrayList = appInstalledDetailsActivity.f3304d0;
                            arrayList.getClass();
                            arrayList.add(v1Var);
                            i = i6;
                        } catch (ArrayIndexOutOfBoundsException e10) {
                            androidx.privacysandbox.ads.adservices.customaudience.a.s(e10.getMessage());
                            return null;
                        }
                    }
                }
                break;
            default:
                p6.a.e(obj);
                AppInstalledDetailsActivity appInstalledDetailsActivity2 = this.f1777b;
                ArrayList arrayList2 = appInstalledDetailsActivity2.f3304d0;
                int size = 0;
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    appInstalledDetailsActivity2.R0().f9748x.setVisibility(8);
                } else {
                    ArrayList arrayList3 = appInstalledDetailsActivity2.f3304d0;
                    arrayList3.getClass();
                    LinearLayout linearLayout = appInstalledDetailsActivity2.R0().f9740q;
                    int size2 = arrayList3.size();
                    while (size < size2) {
                        t4.q qVarA = t4.q.a(LayoutInflater.from(appInstalledDetailsActivity2.getApplicationContext()));
                        TextView textView = qVarA.f10062l;
                        textView.setTypeface(f4.c.f4884x);
                        textView.setText(((x4.v1) arrayList3.get(size)).f11422a);
                        linearLayout.addView(qVarA.f10061b);
                        size++;
                    }
                    ArrayList arrayList4 = appInstalledDetailsActivity2.f3304d0;
                    arrayList4.getClass();
                    size = arrayList4.size();
                }
                appInstalledDetailsActivity2.R0().T.setText(String.valueOf(size));
                break;
        }
        return p6.x.f8464a;
    }
}
