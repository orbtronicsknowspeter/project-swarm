package androidx.work.impl.model;

import androidx.sqlite.SQLiteConnection;
import d7.l;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WorkSpecDao_Impl f619b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ WorkSpec f620l;

    public /* synthetic */ g(WorkSpecDao_Impl workSpecDao_Impl, WorkSpec workSpec, int i) {
        this.f618a = i;
        this.f619b = workSpecDao_Impl;
        this.f620l = workSpec;
    }

    @Override // d7.l
    public final Object invoke(Object obj) {
        switch (this.f618a) {
            case 0:
                return WorkSpecDao_Impl.updateWorkSpec$lambda$1(this.f619b, this.f620l, (SQLiteConnection) obj);
            default:
                return WorkSpecDao_Impl.insertWorkSpec$lambda$0(this.f619b, this.f620l, (SQLiteConnection) obj);
        }
    }
}
