package o6;

import android.app.Application;
import d7.p;
import l8.f;
import p6.x;
import v6.i;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8217b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Application f8218l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l8.e f8219m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Application application, l8.e eVar, t6.c cVar, int i) {
        super(2, cVar);
        this.f8216a = i;
        this.f8218l = application;
        this.f8219m = eVar;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f8216a) {
            case 0:
                return new b(this.f8218l, this.f8219m, cVar, 0);
            case 1:
                return new b(this.f8218l, this.f8219m, cVar, 1);
            case 2:
                return new b(this.f8218l, this.f8219m, cVar, 2);
            default:
                return new b(this.f8218l, this.f8219m, cVar, 3);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        t6.c cVar = (t6.c) obj2;
        switch (this.f8216a) {
            case 0:
                return new b(this.f8218l, this.f8219m, cVar, 0).invokeSuspend(x.f8464a);
            case 1:
                return new b(this.f8218l, this.f8219m, cVar, 1).invokeSuspend(x.f8464a);
            case 2:
                return new b(this.f8218l, this.f8219m, cVar, 2).invokeSuspend(x.f8464a);
            default:
                return new b(this.f8218l, this.f8219m, cVar, 3).invokeSuspend(x.f8464a);
        }
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f8216a) {
            case 0:
                int i = this.f8217b;
                if (i != 0) {
                    if (i == 1) {
                        p6.a.e(obj);
                        return obj;
                    }
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p6.a.e(obj);
                f fVar = this.f8219m.f7188a;
                String str = fVar == null ? null : fVar.f7193b;
                String str2 = fVar != null ? fVar.f7192a : null;
                this.f8217b = 1;
                Object objB = e.b(this.f8218l, str, str2, this);
                u6.a aVar = u6.a.f10763a;
                return objB == aVar ? aVar : objB;
            case 1:
                int i6 = this.f8217b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        p6.a.e(obj);
                        return obj;
                    }
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p6.a.e(obj);
                f fVar2 = this.f8219m.f7189b;
                String str3 = fVar2 == null ? null : fVar2.f7193b;
                String str4 = fVar2 != null ? fVar2.f7192a : null;
                this.f8217b = 1;
                Object objB2 = e.b(this.f8218l, str3, str4, this);
                u6.a aVar2 = u6.a.f10763a;
                return objB2 == aVar2 ? aVar2 : objB2;
            case 2:
                int i10 = this.f8217b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        p6.a.e(obj);
                        return obj;
                    }
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p6.a.e(obj);
                f fVar3 = this.f8219m.f7190c;
                String str5 = fVar3 == null ? null : fVar3.f7193b;
                String str6 = fVar3 != null ? fVar3.f7192a : null;
                this.f8217b = 1;
                Object objB3 = e.b(this.f8218l, str5, str6, this);
                u6.a aVar3 = u6.a.f10763a;
                return objB3 == aVar3 ? aVar3 : objB3;
            default:
                int i11 = this.f8217b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        p6.a.e(obj);
                        return obj;
                    }
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p6.a.e(obj);
                f fVar4 = this.f8219m.f7191d;
                String str7 = fVar4 == null ? null : fVar4.f7193b;
                String str8 = fVar4 != null ? fVar4.f7192a : null;
                this.f8217b = 1;
                Object objB4 = e.b(this.f8218l, str7, str8, this);
                u6.a aVar4 = u6.a.f10763a;
                return objB4 == aVar4 ? aVar4 : objB4;
        }
    }
}
