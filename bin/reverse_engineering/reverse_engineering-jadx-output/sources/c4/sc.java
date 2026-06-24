package c4;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import android.widget.EditText;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.documentfile.provider.DocumentFile;
import com.uptodown.activities.WishlistActivity;
import com.uptodown.core.activities.FileExplorerActivity;
import com.uptodown.core.activities.InstallerActivity;
import com.uptodown.tv.ui.activity.TvAppDetailActivity;
import com.uptodown.tv.ui.fragment.TvAppDetailFragment;
import com.uptodown.tv.ui.fragment.TvAppsListFragment;
import com.uptodown.tv.ui.fragment.TvMyAppsFragment;
import com.uptodown.tv.ui.fragment.TvMyDownloadsFragment;
import com.uptodown.tv.ui.fragment.TvSearchFragment;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class sc extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2097b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f2098l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc(d4.l lVar, Context context, t6.c cVar) {
        super(2, cVar);
        this.f2096a = 3;
        this.f2098l = lVar;
        this.f2097b = context;
    }

    private final Object a(Object obj) {
        FileOutputStream fileOutputStream = (FileOutputStream) this.f2098l;
        FileInputStream fileInputStream = (FileInputStream) this.f2097b;
        p6.a.e(obj);
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i > 0) {
                    fileOutputStream.write(bArr, 0, i);
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            }
            fileInputStream.close();
            try {
                fileOutputStream.close();
            } catch (Exception unused2) {
            }
            return p6.x.f8463a;
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Exception unused3) {
            }
            try {
                fileOutputStream.close();
                throw th;
            } catch (Exception unused4) {
                throw th;
            }
        }
    }

    private final Object b(Object obj) {
        File file = (File) this.f2098l;
        m8.q qVar = (m8.q) this.f2097b;
        p6.x xVar = p6.x.f8463a;
        p6.a.e(obj);
        try {
            boolean z9 = false;
            try {
                SharedPreferences sharedPreferences = ((Activity) qVar.f7780b).getSharedPreferences("CoreSettings", 0);
                if (sharedPreferences.contains("system_app")) {
                    z9 = sharedPreferences.getBoolean("system_app", false);
                }
            } catch (Exception unused) {
            }
            if (z9) {
                m8.q.a(qVar, file);
            } else {
                g4.h0 h0Var = (g4.h0) qVar.f7781l;
                if (h0Var == null) {
                    return null;
                }
                file.getPath();
                h0Var.f5190a.M("error: not system permissions");
            }
            return xVar;
        } catch (Exception e10) {
            e10.printStackTrace();
            return xVar;
        }
    }

    private final Object c(Object obj) {
        p6.a.e(obj);
        g4.u uVar = (g4.u) this.f2097b;
        String name = ((DocumentFile) this.f2098l).getName();
        name.getClass();
        uVar.a(name);
        return p6.x.f8463a;
    }

    private final Object d(Object obj) {
        String str;
        JSONObject jSONObjectOptJSONObject;
        p6.a.e(obj);
        Context context = (Context) this.f2097b;
        x4.w2 w2VarH = x4.u2.h(context);
        if (w2VarH != null && x4.u2.g(context)) {
            j5.v vVar = new j5.v(context);
            HashMap map = new HashMap();
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (string != null) {
                map.put("deviceIdentifier", string);
            }
            x4.g2 g2VarK = vVar.k("https://www.uptodown.app:443".concat("/eapi/user/getUpdatedData"), map, ShareTarget.METHOD_GET, false);
            if (!g2VarK.b() && (str = g2VarK.f11203a) != null && str.length() != 0) {
                String str2 = g2VarK.f11203a;
                str2.getClass();
                JSONObject jSONObject = new JSONObject(str2);
                if (jSONObject.optInt("success") == 1 && !jSONObject.isNull("data") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) != null) {
                    w2VarH.b(context, jSONObjectOptJSONObject);
                    w2VarH.e(context);
                    w4.p pVar = (w4.p) this.f2098l;
                    if (pVar != null) {
                        pVar.l();
                    }
                }
            }
            if (g2VarK.f11204b == 401) {
                x4.u2.b(context);
            }
        }
        return p6.x.f8463a;
    }

    private final Object e(Object obj) {
        p6.a.e(obj);
        u4.y0 y0Var = (u4.y0) ((y2.s) this.f2097b).f11756l;
        ArrayList arrayList = (ArrayList) ((kotlin.jvm.internal.x) this.f2098l).f7024a;
        y0Var.getClass();
        arrayList.getClass();
        y0Var.f10664a.f10672m = arrayList;
        return p6.x.f8463a;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object f(java.lang.Object r19) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.sc.f(java.lang.Object):java.lang.Object");
    }

    private final Object h(Object obj) throws JSONException {
        Object jVar;
        JSONObject jSONObject;
        p6.a.e(obj);
        AtomicBoolean atomicBoolean = s4.x.f9315b;
        if (atomicBoolean.compareAndSet(false, true)) {
            x4.w2 w2Var = new x4.w2();
            j5.v vVar = new j5.v(((s4.x) this.f2097b).f9316a);
            String str = (String) this.f2098l;
            str.getClass();
            x4.g2 g2VarK = vVar.k("https://www.uptodown.app:443/eapi/profile/" + str + "/data", null, ShareTarget.METHOD_GET, false);
            g2VarK.f11206d = vVar.i(g2VarK, "/eapi/profile/userID/data");
            if (g2VarK.b() || (jSONObject = g2VarK.f11206d) == null || jSONObject.isNull("data")) {
                atomicBoolean.set(false);
                jVar = new p6.j(new Exception());
            } else {
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                jSONObject2.getClass();
                w2Var.c(jSONObject2);
                atomicBoolean.set(false);
                jVar = w2Var;
            }
        } else {
            atomicBoolean.set(false);
            jVar = new p6.j(new Exception());
        }
        return new p6.k(jVar);
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f2096a) {
            case 0:
                return new sc((Context) this.f2097b, (tc) this.f2098l, cVar, 0);
            case 1:
                return new sc((Context) this.f2097b, (zc) this.f2098l, cVar, 1);
            case 2:
                return new sc((WishlistActivity) this.f2097b, (String) this.f2098l, cVar, 2);
            case 3:
                return new sc((d4.l) this.f2098l, (Context) this.f2097b, cVar);
            case 4:
                return new sc((TvAppDetailActivity) this.f2097b, (String) this.f2098l, cVar, 4);
            case 5:
                sc scVar = new sc((f5.a) this.f2098l, cVar, 5);
                scVar.f2097b = obj;
                return scVar;
            case 6:
                return new sc((g4.h) this.f2097b, (String) this.f2098l, cVar, 6);
            case 7:
                return new sc((FileExplorerActivity) this.f2097b, (String) this.f2098l, cVar, 7);
            case 8:
                return new sc((FileExplorerActivity) this.f2097b, (kotlin.jvm.internal.v) this.f2098l, cVar, 8);
            case 9:
                return new sc((FileExplorerActivity) this.f2097b, (EditText) this.f2098l, cVar, 9);
            case 10:
                return new sc((InstallerActivity) this.f2097b, (kotlin.jvm.internal.v) this.f2098l, cVar, 10);
            case 11:
                return new sc((TvAppDetailFragment) this.f2097b, (kotlin.jvm.internal.x) this.f2098l, cVar, 11);
            case 12:
                return new sc((TvAppsListFragment) this.f2097b, (kotlin.jvm.internal.x) this.f2098l, cVar, 12);
            case 13:
                return new sc((TvMyAppsFragment) this.f2097b, (kotlin.jvm.internal.x) this.f2098l, cVar, 13);
            case 14:
                return new sc((TvMyDownloadsFragment) this.f2097b, (ArrayList) this.f2098l, cVar, 14);
            case 15:
                return new sc((TvSearchFragment) this.f2097b, (x4.g) this.f2098l, cVar, 15);
            case 16:
                return new sc((g5.n0) this.f2097b, (kotlin.jvm.internal.x) this.f2098l, cVar, 16);
            case 17:
                sc scVar2 = new sc((d7.l) this.f2098l, cVar, 17);
                scVar2.f2097b = obj;
                return scVar2;
            case 18:
                return new sc((a2.t) this.f2097b, (ArrayList) this.f2098l, cVar, 18);
            case 19:
                return new sc((a2.t) this.f2097b, (String) this.f2098l, cVar, 19);
            case 20:
                return new sc((FileInputStream) this.f2097b, (FileOutputStream) this.f2098l, cVar, 20);
            case 21:
                return new sc((g4.h0) this.f2097b, (String) this.f2098l, cVar, 21);
            case 22:
                return new sc((m8.q) this.f2097b, (File) this.f2098l, cVar, 22);
            case 23:
                return new sc((g4.u) this.f2097b, (File) this.f2098l, cVar, 23);
            case 24:
                return new sc((g4.u) this.f2097b, (DocumentFile) this.f2098l, cVar, 24);
            case 25:
                return new sc((Context) this.f2097b, (w4.p) this.f2098l, cVar, 25);
            case 26:
                return new sc((y2.s) this.f2097b, (kotlin.jvm.internal.x) this.f2098l, cVar, 26);
            case 27:
                return new sc((s4.g) this.f2097b, (kotlin.jvm.internal.v) this.f2098l, cVar, 27);
            case 28:
                return new sc((s4.x) this.f2097b, (String) this.f2098l, cVar, 28);
            default:
                return new sc((r.k) this.f2097b, (x4.x1) this.f2098l, cVar, 29);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2096a) {
            case 0:
                sc scVar = (sc) create((o7.a0) obj, (t6.c) obj2);
                p6.x xVar = p6.x.f8463a;
                scVar.invokeSuspend(xVar);
                break;
            case 1:
                sc scVar2 = (sc) create((o7.a0) obj, (t6.c) obj2);
                p6.x xVar2 = p6.x.f8463a;
                scVar2.invokeSuspend(xVar2);
                break;
            case 2:
                sc scVar3 = (sc) create((o7.a0) obj, (t6.c) obj2);
                p6.x xVar3 = p6.x.f8463a;
                scVar3.invokeSuspend(xVar3);
                break;
            case 3:
                sc scVar4 = (sc) create((o7.a0) obj, (t6.c) obj2);
                p6.x xVar4 = p6.x.f8463a;
                scVar4.invokeSuspend(xVar4);
                break;
            case 4:
                sc scVar5 = (sc) create((o7.a0) obj, (t6.c) obj2);
                p6.x xVar5 = p6.x.f8463a;
                scVar5.invokeSuspend(xVar5);
                break;
            case 5:
                sc scVar6 = (sc) create((x4.d0) obj, (t6.c) obj2);
                p6.x xVar6 = p6.x.f8463a;
                scVar6.invokeSuspend(xVar6);
                break;
            case 6:
                sc scVar7 = (sc) create((o7.a0) obj, (t6.c) obj2);
                p6.x xVar7 = p6.x.f8463a;
                scVar7.invokeSuspend(xVar7);
                break;
            case 7:
                sc scVar8 = (sc) create((o7.a0) obj, (t6.c) obj2);
                p6.x xVar8 = p6.x.f8463a;
                scVar8.invokeSuspend(xVar8);
                break;
            case 8:
                sc scVar9 = (sc) create((o7.a0) obj, (t6.c) obj2);
                p6.x xVar9 = p6.x.f8463a;
                scVar9.invokeSuspend(xVar9);
                break;
            case 9:
                sc scVar10 = (sc) create((o7.a0) obj, (t6.c) obj2);
                p6.x xVar10 = p6.x.f8463a;
                scVar10.invokeSuspend(xVar10);
                break;
            case 10:
                sc scVar11 = (sc) create((o7.a0) obj, (t6.c) obj2);
                p6.x xVar11 = p6.x.f8463a;
                scVar11.invokeSuspend(xVar11);
                break;
            case 11:
                sc scVar12 = (sc) create((o7.a0) obj, (t6.c) obj2);
                p6.x xVar12 = p6.x.f8463a;
                scVar12.invokeSuspend(xVar12);
                break;
            case 12:
                sc scVar13 = (sc) create((o7.a0) obj, (t6.c) obj2);
                p6.x xVar13 = p6.x.f8463a;
                scVar13.invokeSuspend(xVar13);
                break;
            case 13:
                sc scVar14 = (sc) create((o7.a0) obj, (t6.c) obj2);
                p6.x xVar14 = p6.x.f8463a;
                scVar14.invokeSuspend(xVar14);
                break;
            case 14:
                sc scVar15 = (sc) create((o7.a0) obj, (t6.c) obj2);
                p6.x xVar15 = p6.x.f8463a;
                scVar15.invokeSuspend(xVar15);
                break;
            case 15:
                sc scVar16 = (sc) create((o7.a0) obj, (t6.c) obj2);
                p6.x xVar16 = p6.x.f8463a;
                scVar16.invokeSuspend(xVar16);
                break;
            case 16:
                sc scVar17 = (sc) create((o7.a0) obj, (t6.c) obj2);
                p6.x xVar17 = p6.x.f8463a;
                scVar17.invokeSuspend(xVar17);
                break;
            case 17:
                sc scVar18 = (sc) create((MutablePreferences) obj, (t6.c) obj2);
                p6.x xVar18 = p6.x.f8463a;
                scVar18.invokeSuspend(xVar18);
                break;
            case 18:
                sc scVar19 = (sc) create((o7.a0) obj, (t6.c) obj2);
                p6.x xVar19 = p6.x.f8463a;
                scVar19.invokeSuspend(xVar19);
                break;
            case 19:
                sc scVar20 = (sc) create((o7.a0) obj, (t6.c) obj2);
                p6.x xVar20 = p6.x.f8463a;
                scVar20.invokeSuspend(xVar20);
                break;
            case 20:
                sc scVar21 = (sc) create((o7.a0) obj, (t6.c) obj2);
                p6.x xVar21 = p6.x.f8463a;
                scVar21.invokeSuspend(xVar21);
                break;
            case 23:
                sc scVar22 = (sc) create((o7.a0) obj, (t6.c) obj2);
                p6.x xVar22 = p6.x.f8463a;
                scVar22.invokeSuspend(xVar22);
                break;
            case 24:
                sc scVar23 = (sc) create((o7.a0) obj, (t6.c) obj2);
                p6.x xVar23 = p6.x.f8463a;
                scVar23.invokeSuspend(xVar23);
                break;
            case 25:
                sc scVar24 = (sc) create((o7.a0) obj, (t6.c) obj2);
                p6.x xVar24 = p6.x.f8463a;
                scVar24.invokeSuspend(xVar24);
                break;
            case 26:
                sc scVar25 = (sc) create((o7.a0) obj, (t6.c) obj2);
                p6.x xVar25 = p6.x.f8463a;
                scVar25.invokeSuspend(xVar25);
                break;
            case 27:
                sc scVar26 = (sc) create((o7.a0) obj, (t6.c) obj2);
                p6.x xVar26 = p6.x.f8463a;
                scVar26.invokeSuspend(xVar26);
                break;
        }
        return ((sc) create((o7.a0) obj, (t6.c) obj2)).invokeSuspend(p6.x.f8463a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0184  */
    /* JADX WARN: Type inference failed for: r5v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v70 */
    /* JADX WARN: Type inference failed for: r5v71 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // v6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instruction units count: 3154
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.sc.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sc(Object obj, Object obj2, t6.c cVar, int i) {
        super(2, cVar);
        this.f2096a = i;
        this.f2097b = obj;
        this.f2098l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sc(Object obj, t6.c cVar, int i) {
        super(2, cVar);
        this.f2096a = i;
        this.f2098l = obj;
    }
}
