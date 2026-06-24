package x4;

import android.database.Cursor;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11385a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f11388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f11389e;
    public String f;

    public final void a(Cursor cursor) {
        this.f11385a = cursor.getInt(0);
        this.f11386b = cursor.getString(1);
        this.f11387c = cursor.getString(2);
        this.f11388d = cursor.getString(3);
        this.f11389e = cursor.getString(4);
        this.f = cursor.getString(5);
    }

    public final String toString() {
        int i = this.f11385a;
        String str = this.f11386b;
        String str2 = this.f11387c;
        String str3 = this.f11388d;
        String str4 = this.f11389e;
        String str5 = this.f;
        StringBuilder sb = new StringBuilder("{id=");
        sb.append(i);
        sb.append(", timestamp=");
        sb.append(str);
        sb.append(", title='");
        a4.x.B(sb, str2, "', msg='", str3, "', actions='");
        sb.append(str4);
        sb.append("', extraInfo='");
        sb.append(str5);
        sb.append("'}");
        return sb.toString();
    }
}
