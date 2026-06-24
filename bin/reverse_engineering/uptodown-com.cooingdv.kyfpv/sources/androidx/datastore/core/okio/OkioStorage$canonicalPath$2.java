package androidx.datastore.core.okio;

import d7.a;
import kotlin.jvm.internal.m;
import w8.y;
import x8.c;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class OkioStorage$canonicalPath$2 extends m implements a {
    final /* synthetic */ OkioStorage<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioStorage$canonicalPath$2(OkioStorage<T> okioStorage) {
        super(0);
        this.this$0 = okioStorage;
    }

    @Override // d7.a
    public final y invoke() {
        y yVar = (y) ((OkioStorage) this.this$0).producePath.invoke();
        yVar.getClass();
        boolean z9 = c.a(yVar) != -1;
        OkioStorage<T> okioStorage = this.this$0;
        if (z9) {
            return q1.a.j(yVar.f11006a.t(), true);
        }
        throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + ((OkioStorage) okioStorage).producePath + ", instead got " + yVar).toString());
    }
}
