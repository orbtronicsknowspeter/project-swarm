package h9;

import com.google.android.gms.internal.measurement.i5;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f5488e;
    public final List f;

    public /* synthetic */ a(String str, String str2, String str3, String str4, List list, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, "", (i & 32) != 0 ? new ArrayList() : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.l.a(this.f5484a, aVar.f5484a) && kotlin.jvm.internal.l.a(this.f5485b, aVar.f5485b) && kotlin.jvm.internal.l.a(this.f5486c, aVar.f5486c) && kotlin.jvm.internal.l.a(this.f5487d, aVar.f5487d) && kotlin.jvm.internal.l.a(this.f5488e, aVar.f5488e) && kotlin.jvm.internal.l.a(this.f, aVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + i5.b(i5.b(i5.b(i5.b(this.f5484a.hashCode() * 31, this.f5485b), this.f5486c), this.f5487d), this.f5488e);
    }

    public final String toString() {
        return "AdvancedUILabels(initScreenSettingsButton=" + this.f5484a + ", initScreenRejectButton=" + this.f5485b + ", privacyBody=" + this.f5486c + ", privacyHeader=" + this.f5487d + ", secondScreenPrivacyBody=" + this.f5488e + ", customFooterLink=" + this.f + ')';
    }

    public a(String str, String str2, String str3, String str4, String str5, List list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        list.getClass();
        this.f5484a = str;
        this.f5485b = str2;
        this.f5486c = str3;
        this.f5487d = str4;
        this.f5488e = str5;
        this.f = list;
    }
}
