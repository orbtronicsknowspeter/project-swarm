package i8;

import android.text.Editable;
import android.text.Html;
import java.util.ArrayList;
import org.xml.sax.XMLReader;
import q6.l;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Html.TagHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5704a = new ArrayList();

    @Override // android.text.Html.TagHandler
    public final void handleTag(boolean z9, String str, Editable editable, XMLReader xMLReader) {
        editable.getClass();
        boolean zEquals = "customUl".equals(str);
        int i = 0;
        ArrayList arrayList = this.f5704a;
        if (zEquals && z9) {
            arrayList.add(0, new d());
            return;
        }
        if ("customOl".equals(str) && z9) {
            c cVar = new c();
            cVar.f5706b = 1;
            arrayList.add(0, cVar);
            return;
        }
        if (("customUl".equals(str) || "customOl".equals(str)) && !z9) {
            arrayList.remove(0);
            return;
        }
        if ("customLi".equals(str) && z9) {
            ((b) l.q0(arrayList)).a(editable);
            return;
        }
        if (!"customLi".equals(str) || z9) {
            return;
        }
        b bVar = (b) l.q0(arrayList);
        int size = arrayList.size();
        bVar.getClass();
        if (editable.length() > 0 && editable.charAt(editable.length() - 1) != '\n') {
            editable.append("\n");
        }
        b[] bVarArr = (b[]) editable.getSpans(0, editable.length(), b.class);
        bVarArr.getClass();
        b bVar2 = bVarArr.length == 0 ? null : bVarArr[bVarArr.length - 1];
        int spanStart = editable.getSpanStart(bVar2);
        editable.removeSpan(bVar2);
        if (spanStart != editable.length()) {
            Object[] objArrB = bVar.b(size);
            int length = objArrB.length;
            while (i < length) {
                Object obj = objArrB[i];
                i++;
                editable.setSpan(obj, spanStart, editable.length(), 33);
            }
        }
    }
}
