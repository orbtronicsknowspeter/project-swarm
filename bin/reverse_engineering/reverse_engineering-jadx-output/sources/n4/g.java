package n4;

import android.content.pm.PackageInstaller;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import o7.a0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f7952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.v f7953b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PackageInstaller f7954l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public kotlin.jvm.internal.x f7955m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Long f7956n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f7957o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public File f7958p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Iterator f7959q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f7960r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7961s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f7962t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f7963u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f7964w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ArrayList f7965x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, ArrayList arrayList, t6.c cVar) {
        super(2, cVar);
        this.f7964w = hVar;
        this.f7965x = arrayList;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        return new g(this.f7964w, this.f7965x, cVar);
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((a0) obj, (t6.c) obj2)).invokeSuspend(p6.x.f8463a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x045e, code lost:
    
        if (r0 == r9) goto L185;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02b9 A[Catch: all -> 0x02e1, Exception -> 0x02e5, TRY_LEAVE, TryCatch #0 {all -> 0x02e1, blocks: (B:170:0x0419, B:172:0x0421, B:173:0x042a, B:176:0x042f, B:183:0x043f, B:100:0x02b3, B:102:0x02b9), top: B:224:0x02b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0305 A[Catch: all -> 0x0330, Exception -> 0x0333, TryCatch #24 {Exception -> 0x0333, all -> 0x0330, blocks: (B:111:0x02f4, B:113:0x0305, B:115:0x0309, B:117:0x030d, B:119:0x031a, B:121:0x0320, B:126:0x032c, B:131:0x0336, B:133:0x033a, B:134:0x033e, B:136:0x0344, B:138:0x034a, B:139:0x034d, B:140:0x035e, B:142:0x0364, B:148:0x038e, B:160:0x039f, B:161:0x03a2, B:162:0x03a3, B:166:0x03bb), top: B:249:0x02f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x030d A[Catch: all -> 0x0330, Exception -> 0x0333, TryCatch #24 {Exception -> 0x0333, all -> 0x0330, blocks: (B:111:0x02f4, B:113:0x0305, B:115:0x0309, B:117:0x030d, B:119:0x031a, B:121:0x0320, B:126:0x032c, B:131:0x0336, B:133:0x033a, B:134:0x033e, B:136:0x0344, B:138:0x034a, B:139:0x034d, B:140:0x035e, B:142:0x0364, B:148:0x038e, B:160:0x039f, B:161:0x03a2, B:162:0x03a3, B:166:0x03bb), top: B:249:0x02f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x033a A[Catch: all -> 0x0330, Exception -> 0x0333, TryCatch #24 {Exception -> 0x0333, all -> 0x0330, blocks: (B:111:0x02f4, B:113:0x0305, B:115:0x0309, B:117:0x030d, B:119:0x031a, B:121:0x0320, B:126:0x032c, B:131:0x0336, B:133:0x033a, B:134:0x033e, B:136:0x0344, B:138:0x034a, B:139:0x034d, B:140:0x035e, B:142:0x0364, B:148:0x038e, B:160:0x039f, B:161:0x03a2, B:162:0x03a3, B:166:0x03bb), top: B:249:0x02f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0344 A[Catch: all -> 0x0330, Exception -> 0x0333, TryCatch #24 {Exception -> 0x0333, all -> 0x0330, blocks: (B:111:0x02f4, B:113:0x0305, B:115:0x0309, B:117:0x030d, B:119:0x031a, B:121:0x0320, B:126:0x032c, B:131:0x0336, B:133:0x033a, B:134:0x033e, B:136:0x0344, B:138:0x034a, B:139:0x034d, B:140:0x035e, B:142:0x0364, B:148:0x038e, B:160:0x039f, B:161:0x03a2, B:162:0x03a3, B:166:0x03bb), top: B:249:0x02f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x034a A[Catch: all -> 0x0330, Exception -> 0x0333, TryCatch #24 {Exception -> 0x0333, all -> 0x0330, blocks: (B:111:0x02f4, B:113:0x0305, B:115:0x0309, B:117:0x030d, B:119:0x031a, B:121:0x0320, B:126:0x032c, B:131:0x0336, B:133:0x033a, B:134:0x033e, B:136:0x0344, B:138:0x034a, B:139:0x034d, B:140:0x035e, B:142:0x0364, B:148:0x038e, B:160:0x039f, B:161:0x03a2, B:162:0x03a3, B:166:0x03bb), top: B:249:0x02f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0364 A[Catch: all -> 0x0330, Exception -> 0x0333, TRY_LEAVE, TryCatch #24 {Exception -> 0x0333, all -> 0x0330, blocks: (B:111:0x02f4, B:113:0x0305, B:115:0x0309, B:117:0x030d, B:119:0x031a, B:121:0x0320, B:126:0x032c, B:131:0x0336, B:133:0x033a, B:134:0x033e, B:136:0x0344, B:138:0x034a, B:139:0x034d, B:140:0x035e, B:142:0x0364, B:148:0x038e, B:160:0x039f, B:161:0x03a2, B:162:0x03a3, B:166:0x03bb), top: B:249:0x02f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0421 A[Catch: all -> 0x02e1, Exception -> 0x02e5, TRY_LEAVE, TryCatch #0 {all -> 0x02e1, blocks: (B:170:0x0419, B:172:0x0421, B:173:0x042a, B:176:0x042f, B:183:0x043f, B:100:0x02b3, B:102:0x02b9), top: B:224:0x02b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04ae A[PHI: r0
      0x04ae: PHI (r0v74 android.content.pm.PackageInstaller$Session) = (r0v73 android.content.pm.PackageInstaller$Session), (r0v82 android.content.pm.PackageInstaller$Session) binds: [B:205:0x04ac, B:216:0x04df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ee  */
    /* JADX WARN: Type inference failed for: r0v100 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v56, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.internal.x] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [kotlin.jvm.internal.x] */
    /* JADX WARN: Type inference failed for: r3v14, types: [kotlin.jvm.internal.x] */
    /* JADX WARN: Type inference failed for: r3v15, types: [kotlin.jvm.internal.x] */
    /* JADX WARN: Type inference failed for: r3v16, types: [kotlin.jvm.internal.x] */
    /* JADX WARN: Type inference failed for: r3v17, types: [kotlin.jvm.internal.x] */
    /* JADX WARN: Type inference failed for: r3v18, types: [kotlin.jvm.internal.x] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26, types: [kotlin.jvm.internal.x] */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v23, types: [int] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v20, types: [int] */
    /* JADX WARN: Type inference failed for: r6v26 */
    @Override // v6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 1263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
