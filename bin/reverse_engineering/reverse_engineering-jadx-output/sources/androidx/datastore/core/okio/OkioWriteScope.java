package androidx.datastore.core.okio;

import androidx.datastore.core.WriteScope;
import v6.c;
import v6.e;
import w8.o;
import w8.y;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class OkioWriteScope<T> extends OkioReadScope<T> implements WriteScope<T> {

    /* JADX INFO: renamed from: androidx.datastore.core.okio.OkioWriteScope$writeData$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    @e(c = "androidx.datastore.core.okio.OkioWriteScope", f = "OkioStorage.kt", l = {216}, m = "writeData")
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ OkioWriteScope<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OkioWriteScope<T> okioWriteScope, t6.c cVar) {
            super(cVar);
            this.this$0 = okioWriteScope;
        }

        @Override // v6.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.writeData(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioWriteScope(o oVar, y yVar, OkioSerializer<T> okioSerializer) {
        super(oVar, yVar, okioSerializer);
        oVar.getClass();
        yVar.getClass();
        okioSerializer.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009a A[Catch: all -> 0x00a6, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x00a6, blocks: (B:46:0x009a, B:54:0x00a8, B:19:0x0055), top: B:73:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a8 A[Catch: all -> 0x00a6, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x00a6, blocks: (B:46:0x009a, B:54:0x00a8, B:19:0x0055), top: B:73:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, w8.u] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v6, types: [w8.u] */
    @Override // androidx.datastore.core.WriteScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object writeData(T r8, t6.c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.datastore.core.okio.OkioWriteScope.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.datastore.core.okio.OkioWriteScope$writeData$1 r0 = (androidx.datastore.core.okio.OkioWriteScope.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.okio.OkioWriteScope$writeData$1 r0 = new androidx.datastore.core.okio.OkioWriteScope$writeData$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            p6.x r2 = p6.x.f8463a
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L3d
            if (r1 != r3) goto L36
            java.lang.Object r8 = r0.L$2
            java.io.Closeable r8 = (java.io.Closeable) r8
            java.lang.Object r1 = r0.L$1
            w8.u r1 = (w8.u) r1
            java.lang.Object r0 = r0.L$0
            java.io.Closeable r0 = (java.io.Closeable) r0
            p6.a.e(r9)     // Catch: java.lang.Throwable -> L34
            goto L75
        L34:
            r9 = move-exception
            goto L87
        L36:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r8)
            r8 = 0
            return r8
        L3d:
            p6.a.e(r9)
            r7.checkClose()
            w8.o r9 = r7.getFileSystem()
            w8.y r1 = r7.getPath()
            r9.getClass()
            r1.getClass()
            w8.u r1 = r9.g(r1)
            w8.l r9 = w8.u.b(r1)     // Catch: java.lang.Throwable -> La6
            w8.z r5 = new w8.z     // Catch: java.lang.Throwable -> La6
            r5.<init>(r9)     // Catch: java.lang.Throwable -> La6
            androidx.datastore.core.okio.OkioSerializer r9 = r7.getSerializer()     // Catch: java.lang.Throwable -> L84
            r0.L$0 = r1     // Catch: java.lang.Throwable -> L84
            r0.L$1 = r1     // Catch: java.lang.Throwable -> L84
            r0.L$2 = r5     // Catch: java.lang.Throwable -> L84
            r0.label = r3     // Catch: java.lang.Throwable -> L84
            java.lang.Object r8 = r9.writeTo(r8, r5, r0)     // Catch: java.lang.Throwable -> L84
            u6.a r9 = u6.a.f10762a
            if (r8 != r9) goto L73
            return r9
        L73:
            r0 = r1
            r8 = r5
        L75:
            r1.flush()     // Catch: java.lang.Throwable -> L34
            if (r8 == 0) goto L80
            r8.close()     // Catch: java.lang.Throwable -> L7e
            goto L80
        L7e:
            r8 = move-exception
            goto L81
        L80:
            r8 = r4
        L81:
            r9 = r2
        L82:
            r1 = r0
            goto L98
        L84:
            r9 = move-exception
            r0 = r1
            r8 = r5
        L87:
            if (r8 == 0) goto L95
            r8.close()     // Catch: java.lang.Throwable -> L8d
            goto L95
        L8d:
            r8 = move-exception
            p6.a.a(r9, r8)     // Catch: java.lang.Throwable -> L92
            goto L95
        L92:
            r8 = move-exception
            r1 = r0
            goto La9
        L95:
            r8 = r9
            r9 = r4
            goto L82
        L98:
            if (r8 != 0) goto La8
            r9.getClass()     // Catch: java.lang.Throwable -> La6
            if (r1 == 0) goto La4
            r1.close()     // Catch: java.lang.Throwable -> La3
            goto La4
        La3:
            r4 = move-exception
        La4:
            r8 = r2
            goto Lb6
        La6:
            r8 = move-exception
            goto La9
        La8:
            throw r8     // Catch: java.lang.Throwable -> La6
        La9:
            if (r1 == 0) goto Lb3
            r1.close()     // Catch: java.lang.Throwable -> Laf
            goto Lb3
        Laf:
            r9 = move-exception
            p6.a.a(r8, r9)
        Lb3:
            r6 = r4
            r4 = r8
            r8 = r6
        Lb6:
            if (r4 != 0) goto Lbc
            r8.getClass()
            return r2
        Lbc:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.okio.OkioWriteScope.writeData(java.lang.Object, t6.c):java.lang.Object");
    }
}
