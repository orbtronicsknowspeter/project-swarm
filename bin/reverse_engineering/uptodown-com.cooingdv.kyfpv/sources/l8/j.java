package l8;

import com.google.android.gms.internal.measurement.i5;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f7218c;

    public /* synthetic */ j() {
        this("", new ArrayList(), true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f7216a == jVar.f7216a && kotlin.jvm.internal.l.a(this.f7217b, jVar.f7217b) && kotlin.jvm.internal.l.a(this.f7218c, jVar.f7218c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z9 = this.f7216a;
        ?? r02 = z9;
        if (z9) {
            r02 = 1;
        }
        return this.f7218c.hashCode() + i5.b(r02 * 31, this.f7217b);
    }

    public final String toString() {
        return "GDPRUiLabels(initScreenRejectButtonShowing=" + this.f7216a + ", initScreenRejectButton=" + this.f7217b + ", initScreenCustomLinks=" + this.f7218c + ')';
    }

    public j(String str, ArrayList arrayList, boolean z9) {
        this.f7216a = z9;
        this.f7217b = str;
        this.f7218c = arrayList;
    }
}
