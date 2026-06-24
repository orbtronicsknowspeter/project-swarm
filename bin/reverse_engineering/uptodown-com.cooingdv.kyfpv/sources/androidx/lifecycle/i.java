package androidx.lifecycle;

import androidx.room.support.AutoClosingRoomOpenHelper;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.io.Serializable;
import kotlin.jvm.internal.x;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements d7.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f452b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Serializable f453l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f454m;

    public /* synthetic */ i(Object obj, Serializable serializable, Object obj2, int i) {
        this.f451a = i;
        this.f452b = obj;
        this.f453l = serializable;
        this.f454m = obj2;
    }

    @Override // d7.l
    public final Object invoke(Object obj) {
        switch (this.f451a) {
            case 0:
                return Transformations.switchMap$lambda$0((d7.l) this.f452b, (x) this.f453l, (MediatorLiveData) this.f454m, obj);
            default:
                return Integer.valueOf(AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.delete$lambda$5((String) this.f452b, (String) this.f453l, (Object[]) this.f454m, (SupportSQLiteDatabase) obj));
        }
    }
}
