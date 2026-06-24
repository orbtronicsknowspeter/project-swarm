package x4;

import android.database.Cursor;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11045c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11043a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f11044b = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11046d = -1;

    public final void a(Cursor cursor) {
        this.f11043a = cursor.getInt(0);
        this.f11044b = cursor.getLong(1);
        this.f11045c = cursor.getString(2);
        this.f11046d = cursor.getInt(3);
    }

    public final String toString() {
        return "{id=" + this.f11043a + ", appId=" + this.f11044b + ", deviceName=" + this.f11045c + ", downloadId=" + this.f11046d + "}";
    }
}
