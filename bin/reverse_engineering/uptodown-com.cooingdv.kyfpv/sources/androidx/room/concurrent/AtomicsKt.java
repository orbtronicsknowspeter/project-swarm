package androidx.room.concurrent;

import androidx.annotation.RestrictTo;
import d7.l;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class AtomicsKt {
    public static final Void loop(AtomicInteger atomicInteger, l lVar) {
        atomicInteger.getClass();
        lVar.getClass();
        while (true) {
            lVar.invoke(Integer.valueOf(atomicInteger.get()));
        }
    }
}
