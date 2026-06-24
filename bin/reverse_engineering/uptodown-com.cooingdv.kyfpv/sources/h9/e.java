package h9;

import com.google.android.gms.internal.measurement.i5;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f5511e;
    public final String f;
    public final List g;

    public /* synthetic */ e(String str, String str2, String str3, String str4, String str5, List list, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, "", (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? new ArrayList() : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.l.a(this.f5507a, eVar.f5507a) && kotlin.jvm.internal.l.a(this.f5508b, eVar.f5508b) && kotlin.jvm.internal.l.a(this.f5509c, eVar.f5509c) && kotlin.jvm.internal.l.a(this.f5510d, eVar.f5510d) && kotlin.jvm.internal.l.a(this.f5511e, eVar.f5511e) && kotlin.jvm.internal.l.a(this.f, eVar.f) && kotlin.jvm.internal.l.a(this.g, eVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + i5.b(i5.b(i5.b(i5.b(i5.b(this.f5507a.hashCode() * 31, this.f5508b), this.f5509c), this.f5510d), this.f5511e), this.f);
    }

    public final String toString() {
        return "ConsentOrPayUILabels(initScreenSettingsButton=" + this.f5507a + ", action1Label=" + this.f5508b + ", action2Label=" + this.f5509c + ", privacyBody=" + this.f5510d + ", secondScreenPrivacyBody=" + this.f5511e + ", privacyHeader=" + this.f + ", customFooterLink=" + this.g + ')';
    }

    public e(String str, String str2, String str3, String str4, String str5, String str6, List list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        list.getClass();
        this.f5507a = str;
        this.f5508b = str2;
        this.f5509c = str3;
        this.f5510d = str4;
        this.f5511e = str5;
        this.f = str6;
        this.g = list;
    }
}
