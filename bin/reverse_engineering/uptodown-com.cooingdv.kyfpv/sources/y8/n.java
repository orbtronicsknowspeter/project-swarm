package y8;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public StringBuilder f11875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f11876e;
    public String f;
    public char g;
    public StringBuilder h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11872a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f11873b = new StringBuilder();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f11874c = new ArrayList();
    public boolean i = false;

    public final void a() {
        if (this.i) {
            String strA = a9.a.a(this.f);
            StringBuilder sb = this.h;
            String strA2 = sb != null ? a9.a.a(sb.toString()) : null;
            String str = this.f11876e;
            b9.n nVar = new b9.n();
            nVar.f = str;
            nVar.g = strA;
            nVar.h = strA2;
            this.f11874c.add(nVar);
            this.f11875d = null;
            this.i = false;
            this.f11876e = null;
            this.f = null;
            this.h = null;
        }
    }
}
