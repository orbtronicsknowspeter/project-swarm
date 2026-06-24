package y;

import androidx.leanback.media.MediaPlayerGlue;
import androidx.lifecycle.l;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final a f = new a(10485760, 200, MediaPlayerGlue.FAST_FORWARD_REWIND_STEP, 604800000, 81920);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11579e;

    public a(long j, int i, int i6, long j6, int i10) {
        this.f11575a = j;
        this.f11576b = i;
        this.f11577c = i6;
        this.f11578d = j6;
        this.f11579e = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f11575a == aVar.f11575a && this.f11576b == aVar.f11576b && this.f11577c == aVar.f11577c && this.f11578d == aVar.f11578d && this.f11579e == aVar.f11579e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f11575a;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f11576b) * 1000003) ^ this.f11577c) * 1000003;
        long j6 = this.f11578d;
        return ((i ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ this.f11579e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f11575a);
        sb.append(", loadBatchSize=");
        sb.append(this.f11576b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.f11577c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.f11578d);
        sb.append(", maxBlobByteSizePerRow=");
        return l.x(sb, "}", this.f11579e);
    }
}
