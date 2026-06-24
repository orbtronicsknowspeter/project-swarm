package x4;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f11449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f11452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11453e;

    public final void a(Cursor cursor) {
        this.f11449a = cursor.getLong(0);
        this.f11453e = cursor.getInt(1);
    }

    public final void b(Context context) {
        context.getClass();
        j5.g gVarL = j5.g.D.l(context);
        gVarL.b();
        String[] strArr = {String.valueOf(this.f11449a)};
        SQLiteDatabase sQLiteDatabase = gVarL.f6674a;
        sQLiteDatabase.getClass();
        sQLiteDatabase.delete("preregistrations", "appId=?", strArr);
        gVarL.c();
    }

    public final String toString() {
        long j = this.f11449a;
        String str = this.f11450b;
        String str2 = this.f11451c;
        String str3 = this.f11452d;
        int i = this.f11453e;
        StringBuilder sb = new StringBuilder("PreRegister(appID=");
        sb.append(j);
        sb.append(", name=");
        sb.append(str);
        a4.x.B(sb, ", icon=", str2, ", authorName=", str3);
        sb.append(", automaticDownload=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
