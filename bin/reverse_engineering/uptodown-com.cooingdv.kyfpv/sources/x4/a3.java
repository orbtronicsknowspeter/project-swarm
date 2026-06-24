package x4;

import com.uptodown.UptodownApp;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f11047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f11050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f11051e;
    public long f;
    public String g;
    public ArrayList h;
    public String i;

    public final String a() {
        String str = this.f11049c;
        if (str == null) {
            return null;
        }
        float f = UptodownApp.I;
        return a4.x.k(str, UptodownApp.J, ":webp");
    }

    public final String toString() {
        long j = this.f11047a;
        String str = this.f11048b;
        String str2 = this.f11049c;
        String str3 = this.f11050d;
        StringBuilder sb = new StringBuilder("UserListItem(programId=");
        sb.append(j);
        sb.append(", name=");
        sb.append(str);
        a4.x.B(sb, ", icon=", str2, ", packagename=", str3);
        sb.append(")");
        return sb.toString();
    }
}
