package androidx.work.impl.model;

import androidx.sqlite.SQLiteConnection;
import d7.l;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f615b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f616l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ WorkSpecDao_Impl f617m;

    public /* synthetic */ f(String str, List list, WorkSpecDao_Impl workSpecDao_Impl, int i) {
        this.f614a = i;
        this.f615b = str;
        this.f616l = list;
        this.f617m = workSpecDao_Impl;
    }

    @Override // d7.l
    public final Object invoke(Object obj) {
        switch (this.f614a) {
            case 0:
                return WorkSpecDao_Impl.getWorkStatusPojoFlowDataForIds$lambda$11(this.f615b, this.f616l, this.f617m, (SQLiteConnection) obj);
            case 1:
                return WorkSpecDao_Impl.getWorkStatusPojoLiveDataForIds$lambda$10(this.f615b, this.f616l, this.f617m, (SQLiteConnection) obj);
            default:
                return WorkSpecDao_Impl.getWorkStatusPojoForIds$lambda$9(this.f615b, this.f616l, this.f617m, (SQLiteConnection) obj);
        }
    }
}
