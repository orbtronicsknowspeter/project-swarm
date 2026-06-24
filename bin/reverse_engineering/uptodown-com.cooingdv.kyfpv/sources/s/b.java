package s;

import a4.x;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q2.e f9108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q2.e f9109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9110d;

    public b(Context context, q2.e eVar, q2.e eVar2, String str) {
        if (context == null) {
            com.google.gson.internal.a.i("Null applicationContext");
            throw null;
        }
        this.f9107a = context;
        if (eVar == null) {
            com.google.gson.internal.a.i("Null wallClock");
            throw null;
        }
        this.f9108b = eVar;
        if (eVar2 == null) {
            com.google.gson.internal.a.i("Null monotonicClock");
            throw null;
        }
        this.f9109c = eVar2;
        if (str != null) {
            this.f9110d = str;
        } else {
            com.google.gson.internal.a.i("Null backendName");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            b bVar = (b) ((c) obj);
            if (this.f9107a.equals(bVar.f9107a) && this.f9108b.equals(bVar.f9108b) && this.f9109c.equals(bVar.f9109c) && this.f9110d.equals(bVar.f9110d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f9107a.hashCode() ^ 1000003) * 1000003) ^ this.f9108b.hashCode()) * 1000003) ^ this.f9109c.hashCode()) * 1000003) ^ this.f9110d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f9107a);
        sb.append(", wallClock=");
        sb.append(this.f9108b);
        sb.append(", monotonicClock=");
        sb.append(this.f9109c);
        sb.append(", backendName=");
        return x.n(sb, this.f9110d, "}");
    }
}
