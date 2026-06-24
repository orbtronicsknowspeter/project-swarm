package androidx.work.impl.model;

import androidx.room.RoomRawQuery;
import androidx.sqlite.SQLiteConnection;
import d7.l;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f605b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ RoomRawQuery f606l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ RawWorkInfoDao_Impl f607m;

    public /* synthetic */ c(String str, RoomRawQuery roomRawQuery, RawWorkInfoDao_Impl rawWorkInfoDao_Impl, int i) {
        this.f604a = i;
        this.f605b = str;
        this.f606l = roomRawQuery;
        this.f607m = rawWorkInfoDao_Impl;
    }

    @Override // d7.l
    public final Object invoke(Object obj) {
        switch (this.f604a) {
            case 0:
                return RawWorkInfoDao_Impl.getWorkInfoPojos$lambda$0(this.f605b, this.f606l, this.f607m, (SQLiteConnection) obj);
            case 1:
                return RawWorkInfoDao_Impl.getWorkInfoPojosFlow$lambda$2(this.f605b, this.f606l, this.f607m, (SQLiteConnection) obj);
            default:
                return RawWorkInfoDao_Impl.getWorkInfoPojosLiveData$lambda$1(this.f605b, this.f606l, this.f607m, (SQLiteConnection) obj);
        }
    }
}
