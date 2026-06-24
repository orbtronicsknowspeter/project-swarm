package androidx.work;

import androidx.work.Data;
import kotlin.jvm.internal.l;
import p6.i;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class DataKt {
    public static final <T> boolean hasKeyWithValueOfType(Data data, String str) {
        data.getClass();
        str.getClass();
        l.h();
        throw null;
    }

    public static final Data workDataOf(i... iVarArr) {
        iVarArr.getClass();
        Data.Builder builder = new Data.Builder();
        for (i iVar : iVarArr) {
            builder.put((String) iVar.f8442a, iVar.f8443b);
        }
        return builder.build();
    }
}
