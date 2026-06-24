package u4;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import org.json.JSONObject;
import x4.g2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class m0 extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f10532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f10533b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f10534l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f10535m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f10536n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f10537o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(v0 v0Var, long j, String str, String str2, boolean z9, Context context, t6.c cVar) {
        super(2, cVar);
        this.f10532a = v0Var;
        this.f10533b = j;
        this.f10534l = str;
        this.f10535m = str2;
        this.f10536n = z9;
        this.f10537o = context;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        return new m0(this.f10532a, this.f10533b, this.f10534l, this.f10535m, this.f10536n, this.f10537o, cVar);
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        m0 m0Var = (m0) create((o7.a0) obj, (t6.c) obj2);
        p6.x xVar = p6.x.f8464a;
        m0Var.invokeSuspend(xVar);
        return xVar;
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) {
        JSONObject jSONObject;
        p6.a.e(obj);
        r7.o0 o0Var = this.f10532a.f10631m;
        o0Var.getClass();
        o0Var.g(null, j5.p.f6706a);
        Context context = this.f10537o;
        j5.v vVar = new j5.v(context);
        long j = this.f10533b;
        g2 g2VarA = vVar.a(j);
        if (!g2VarA.b() && (jSONObject = g2VarA.f11207d) != null && jSONObject.optInt("success") == 1) {
            new android.support.v4.media.g(context, 20).E(k0.k.e(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "added"), "preregister");
            j5.g gVarL = j5.g.D.l(context);
            gVarL.b();
            if (gVarL.U(j) == null) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("appId", Long.valueOf(j));
                contentValues.put("automaticDownload", Integer.valueOf(this.f10536n ? 1 : 0));
                SQLiteDatabase sQLiteDatabase = gVarL.f6674a;
                sQLiteDatabase.getClass();
                sQLiteDatabase.insert("preregistrations", null, contentValues);
            }
            gVarL.c();
            j5.r rVar = new j5.r(new j0(true));
            o0Var.getClass();
            o0Var.g(null, rVar);
        }
        return p6.x.f8464a;
    }
}
