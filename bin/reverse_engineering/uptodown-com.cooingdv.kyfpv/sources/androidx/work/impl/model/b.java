package androidx.work.impl.model;

import androidx.collection.ArrayMap;
import androidx.sqlite.SQLiteConnection;
import d7.l;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RawWorkInfoDao_Impl f602b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SQLiteConnection f603l;

    public /* synthetic */ b(RawWorkInfoDao_Impl rawWorkInfoDao_Impl, SQLiteConnection sQLiteConnection, int i) {
        this.f601a = i;
        this.f602b = rawWorkInfoDao_Impl;
        this.f603l = sQLiteConnection;
    }

    @Override // d7.l
    public final Object invoke(Object obj) {
        switch (this.f601a) {
            case 0:
                return RawWorkInfoDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData$lambda$4(this.f602b, this.f603l, (ArrayMap) obj);
            default:
                return RawWorkInfoDao_Impl.__fetchRelationshipWorkTagAsjavaLangString$lambda$3(this.f602b, this.f603l, (ArrayMap) obj);
        }
    }
}
