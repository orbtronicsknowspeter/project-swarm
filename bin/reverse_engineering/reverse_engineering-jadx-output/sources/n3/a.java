package n3;

import a1.b;
import a4.x;
import androidx.lifecycle.l;
import java.util.List;
import o3.g;
import s1.o;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f7936a = new a();

    public static void a(String str, List list, r3.a aVar) {
        int length = 0;
        for (int i = 0; i < list.size(); i++) {
            String str2 = (String) list.get(i);
            if (!aVar.f8858a.containsKey(str2)) {
                throw new q3.a(l.w("Field not found: '", str2, "'"));
            }
            o3.a aVar2 = (o3.a) aVar.f8858a.get(str2);
            try {
                String strC = aVar2.c(length, str);
                aVar2.a(strC);
                length += strC.length();
            } catch (g e10) {
                if (aVar2.f8148a) {
                    o.m(x.j("Unable to decode ", str2), e10);
                    return;
                }
                return;
            } catch (Exception e11) {
                o.m(x.j("Unable to decode ", str2), e11);
                return;
            }
        }
    }

    public static String b(r3.a aVar, List list) {
        String strConcat = "";
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            if (!aVar.f8858a.containsKey(str)) {
                throw new b(l.w("Field not found: '", str, "'"));
            }
            strConcat = strConcat.concat(((o3.a) aVar.f8858a.get(str)).b());
        }
        return strConcat;
    }
}
