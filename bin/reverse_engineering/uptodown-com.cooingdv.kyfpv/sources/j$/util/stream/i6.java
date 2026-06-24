package j$.util.stream;

import j$.util.Collection;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class i6 extends a6 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f6226d;

    @Override // j$.util.stream.i5, j$.util.stream.m5
    public final void c(long j) {
        if (j >= 2147483639) {
            j$.time.g.c("Stream size exceeds max array size");
        } else {
            this.f6226d = j >= 0 ? new ArrayList((int) j) : new ArrayList();
        }
    }

    @Override // j$.util.stream.i5, j$.util.stream.m5
    public final void end() {
        j$.util.c.u(this.f6226d, this.f6136b);
        long size = this.f6226d.size();
        m5 m5Var = this.f6225a;
        m5Var.c(size);
        boolean z9 = this.f6137c;
        ArrayList arrayList = this.f6226d;
        if (!z9) {
            Objects.requireNonNull(m5Var);
            Collection.EL.a(arrayList, new j$.util.q(8, m5Var));
        } else {
            int size2 = arrayList.size();
            int i = 0;
            while (i < size2) {
                Object obj = arrayList.get(i);
                i++;
                if (m5Var.e()) {
                    break;
                } else {
                    m5Var.n(obj);
                }
            }
        }
        m5Var.end();
        this.f6226d = null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        this.f6226d.add(obj);
    }
}
