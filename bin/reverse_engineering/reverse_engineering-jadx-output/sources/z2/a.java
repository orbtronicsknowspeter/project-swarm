package z2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public enum a implements o2.c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    /* JADX INFO: Fake field, exist only in values array */
    MESSAGE_OPEN(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11913a;

    a(int i) {
        this.f11913a = i;
    }

    @Override // o2.c
    public final int getNumber() {
        return this.f11913a;
    }
}
