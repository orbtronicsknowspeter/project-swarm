package x4;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f11055e;

    public b(String str, long j) {
        str.getClass();
        this.f11051a = str;
        this.f11052b = j;
        this.f11053c = -1;
        this.f11054d = -1;
        this.f11055e = a.f11038a;
    }

    public final b a(Context context) {
        b bVarZ;
        context.getClass();
        j5.g gVarL = j5.g.D.l(context);
        gVarL.b();
        int i = this.f11054d;
        if (i != -1) {
            bVarZ = gVarL.y(i);
        } else {
            int i6 = this.f11053c;
            if (i6 != -1) {
                bVarZ = gVarL.A(i6);
            } else {
                bVarZ = gVarL.z(this.f11052b, this.f11051a);
            }
        }
        gVarL.c();
        return bVarZ;
    }

    public final void b(Context context) {
        b bVarA;
        context.getClass();
        j5.g gVarL = j5.g.D.l(context);
        gVarL.b();
        int i = this.f11054d;
        long j = this.f11052b;
        String str = this.f11051a;
        if (i != -1) {
            bVarA = gVarL.y(i);
        } else {
            int i6 = this.f11053c;
            bVarA = i6 != -1 ? gVarL.A(i6) : gVarL.z(j, str);
        }
        if (bVarA != null) {
            String[] strArr = {String.valueOf(this.f11053c)};
            ContentValues contentValues = new ContentValues();
            contentValues.put("notificationId", Integer.valueOf(this.f11054d));
            contentValues.put("packagename", str);
            contentValues.put("versioncode", Long.valueOf(j));
            contentValues.put(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, Integer.valueOf(this.f11055e.ordinal()));
            SQLiteDatabase sQLiteDatabase = gVarL.f6673a;
            sQLiteDatabase.getClass();
            sQLiteDatabase.update("active_notifications", contentValues, "id=?", strArr);
        } else {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("notificationId", Integer.valueOf(this.f11054d));
            contentValues2.put("packagename", str);
            contentValues2.put("versioncode", Long.valueOf(j));
            contentValues2.put(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, Integer.valueOf(this.f11055e.ordinal()));
            SQLiteDatabase sQLiteDatabase2 = gVarL.f6673a;
            sQLiteDatabase2.getClass();
            sQLiteDatabase2.insert("active_notifications", null, contentValues2);
        }
        gVarL.c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.l.a(this.f11051a, bVar.f11051a) && this.f11052b == bVar.f11052b;
    }

    public final int hashCode() {
        int iHashCode = this.f11051a.hashCode() * 31;
        long j = this.f11052b;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "ActiveNotification(packageName=" + this.f11051a + ", versionCode=" + this.f11052b + ")";
    }
}
