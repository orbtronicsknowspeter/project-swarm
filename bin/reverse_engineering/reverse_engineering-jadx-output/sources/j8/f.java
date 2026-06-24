package j8;

import com.inmobi.cmp.core.model.portalconfig.GBCConsentValue;
import d7.p;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.internal.m;
import p6.i;
import p6.x;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6737b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, int i) {
        super(2);
        this.f6736a = i;
        this.f6737b = obj;
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        String lowerCase;
        switch (this.f6736a) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                ((LinkedHashMap) this.f6737b).put(String.valueOf(iIntValue), bool);
                break;
            default:
                int iIntValue2 = ((Number) obj).intValue();
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                ArrayList arrayList = (ArrayList) this.f6737b;
                Integer numValueOf = Integer.valueOf(iIntValue2);
                if (zBooleanValue) {
                    lowerCase = GBCConsentValue.GRANTED.getValue().toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                } else {
                    lowerCase = GBCConsentValue.DENIED.getValue().toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                }
                arrayList.add(new i(numValueOf, lowerCase));
                break;
        }
        return x.f8463a;
    }
}
