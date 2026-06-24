package n2;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements l2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7924a;

    @Override // l2.a
    public final void a(Object obj, Object obj2) {
        switch (this.f7924a) {
            case 0:
                throw new l2.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                l2.e eVar = (l2.e) obj2;
                eVar.a(o2.f.g, entry.getKey());
                eVar.a(o2.f.h, entry.getValue());
                return;
            default:
                throw new l2.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
