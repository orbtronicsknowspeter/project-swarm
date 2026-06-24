package s;

import android.content.Context;
import b5.m;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import m8.q;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f9110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f9111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f9112c;

    public d(Context context, m mVar) {
        q qVar = new q(context, 5);
        this.f9112c = new HashMap();
        this.f9110a = qVar;
        this.f9111b = mVar;
    }

    public final synchronized e a(String str) {
        if (this.f9112c.containsKey(str)) {
            return (e) this.f9112c.get(str);
        }
        CctBackendFactory cctBackendFactoryI = this.f9110a.i(str);
        if (cctBackendFactoryI == null) {
            return null;
        }
        m mVar = this.f9111b;
        e eVarCreate = cctBackendFactoryI.create(new b((Context) mVar.f1061b, (q2.e) mVar.f1062l, (q2.e) mVar.f1063m, str));
        this.f9112c.put(str, eVarCreate);
        return eVarCreate;
    }
}
