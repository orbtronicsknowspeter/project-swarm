package l;

import com.inmobi.cmp.core.model.Vector;
import d7.p;
import kotlin.jvm.internal.m;
import p6.x;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class e extends m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Vector f7042b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, Vector vector) {
        super(2);
        this.f7041a = i;
        this.f7042b = vector;
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7041a) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                Vector vector = this.f7042b;
                if (!vector.contains(iIntValue)) {
                    if (zBooleanValue) {
                        vector.set(iIntValue);
                    } else {
                        vector.unset(iIntValue);
                    }
                }
                break;
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                Vector vector2 = this.f7042b;
                if (zBooleanValue2) {
                    vector2.set(iIntValue2);
                } else {
                    vector2.unset(iIntValue2);
                }
                break;
            default:
                int iIntValue3 = ((Number) obj).intValue();
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                Vector vector3 = this.f7042b;
                if (vector3.getMap().containsKey(Integer.valueOf(iIntValue3))) {
                    if (zBooleanValue3) {
                        vector3.set(iIntValue3);
                    } else {
                        vector3.unset(iIntValue3);
                    }
                }
                break;
        }
        return x.f8464a;
    }
}
