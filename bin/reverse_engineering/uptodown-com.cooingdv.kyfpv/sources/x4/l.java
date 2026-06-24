package x4;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements d7.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11273a;

    @Override // d7.l
    public final Object invoke(Object obj) {
        int i = this.f11273a;
        l7.i iVar = (l7.i) obj;
        iVar.getClass();
        switch (i) {
            case 0:
                int i6 = iVar.b().f5696a;
                String str = (String) ((l7.h) iVar.a()).get(0);
                String str2 = (String) ((l7.h) iVar.a()).get(1);
                String strGroup = iVar.f7173a.group();
                strGroup.getClass();
                return new o(str, str2, strGroup, i6);
            case 1:
                return (CharSequence) ((l7.h) iVar.a()).get(1);
            case 2:
                return (CharSequence) ((l7.h) iVar.a()).get(3);
            default:
                return (CharSequence) ((l7.h) iVar.a()).get(2);
        }
    }
}
