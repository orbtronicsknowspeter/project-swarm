package f9;

import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LiveData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.UUID;
import p6.x;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static UUID f5066a = UUID.randomUUID();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f5067b = (h) m9.c.f7876y.getValue();

    static {
        new LinkedHashMap();
        new LinkedHashMap();
    }

    public static LiveData a(int i) {
        String strH;
        Boolean bool;
        if (i == 0) {
            throw null;
        }
        int iC = c.j.c(i);
        if (iC == 4) {
            strH = androidx.lifecycle.l.H(5);
            bool = null;
        } else if (iC == 5) {
            bool = Boolean.TRUE;
            strH = androidx.lifecycle.l.H(6);
        } else if (iC != 6) {
            bool = Boolean.FALSE;
            strH = androidx.lifecycle.l.H(4);
        } else {
            bool = Boolean.FALSE;
            strH = androidx.lifecycle.l.H(7);
        }
        p6.m mVar = m9.c.v;
        String strJ = ((l9.a) mVar.getValue()).j(8);
        String strJ2 = ((l9.a) mVar.getValue()).j(63);
        f5067b.h(strH, "click");
        return CoroutineLiveDataKt.liveData$default((t6.h) null, 0L, new b.m(strJ, strJ2, bool, (t6.c) null), 3, (Object) null);
    }

    public static LiveData b(int i, int i6) {
        int i10;
        if (i == 0 || i6 == 0) {
            throw null;
        }
        int iC = c.j.c(i);
        String strH = iC != 4 ? iC != 5 ? iC != 6 ? androidx.lifecycle.l.H(4) : androidx.lifecycle.l.H(7) : androidx.lifecycle.l.H(6) : androidx.lifecycle.l.H(5);
        int iC2 = c.j.c(i6);
        if (iC2 != 0) {
            i10 = 2;
            if (iC2 != 2) {
                i10 = 3;
            }
        } else {
            i10 = 1;
        }
        f5067b.h(strH, "click");
        return CoroutineLiveDataKt.liveData$default((t6.h) null, 0L, new o(((l9.a) m9.c.v.getValue()).j(69), i6, i10, null), 3, (Object) null);
    }

    public static Object c(d dVar, int i, v6.i iVar) {
        Object objB;
        String strValueOf = String.valueOf(i);
        h hVar = f5067b;
        hVar.h("goToPage", strValueOf);
        ArrayList arrayList = hVar.h;
        if (arrayList.size() < 2) {
            objB = "";
        } else {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            l lVar = new l(arrayList2);
            arrayList.clear();
            objB = hVar.b(2, lVar, dVar, iVar);
        }
        return objB == u6.a.f10763a ? objB : x.f8464a;
    }

    public static LiveData d(int i) {
        String str;
        t6.c cVar = null;
        if (i == 0) {
            throw null;
        }
        switch (i) {
            case 1:
                str = "goToPage";
                break;
            case 2:
                str = "purpose";
                break;
            case 3:
                str = "specialFeature";
                break;
            case 4:
                str = "partial";
                break;
            case 5:
                str = "saveAndExit";
                break;
            case 6:
                str = "acceptAll";
                break;
            case 7:
                str = "rejectAll";
                break;
            case 8:
                str = "acceptAllLegitimate";
                break;
            case 9:
                str = "objectAllLegitimate";
                break;
            case 10:
                str = "startOnPage";
                break;
            case 11:
                str = "expandElement";
                break;
            case 12:
                str = "collapseElement";
                break;
            case 13:
                str = "Action1";
                break;
            case 14:
                str = "Action2";
                break;
            case 15:
                str = "Confirm";
                break;
            default:
                throw null;
        }
        f5067b.h(str, "click");
        return CoroutineLiveDataKt.liveData$default((t6.h) null, 0L, new b.j(2, cVar, 1), 3, (Object) null);
    }
}
