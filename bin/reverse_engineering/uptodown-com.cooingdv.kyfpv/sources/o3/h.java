package o3;

import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Predicate f8160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f8161c;

    public h(Predicate predicate) {
        this.f8159a = 0;
        this.f8161c = null;
        this.f8160b = predicate;
        setValue('-');
    }

    @Override // o3.b
    public final Object getValue() {
        switch (this.f8159a) {
            case 0:
                return (Character) this.f8161c;
            default:
                return (Integer) this.f8161c;
        }
    }

    @Override // o3.b
    public final void setValue(Object obj) {
        switch (this.f8159a) {
            case 0:
                Character chValueOf = Character.valueOf(obj.toString().charAt(0));
                if (this.f8160b.test(chValueOf)) {
                    this.f8161c = chValueOf;
                    return;
                }
                throw new q3.c("Invalid value '" + chValueOf + "'");
            default:
                ((i) this.f8160b).getClass();
                this.f8161c = (Integer) obj;
                return;
        }
    }
}
