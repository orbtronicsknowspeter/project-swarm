package d8;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.internal.measurement.i5;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements z7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f3702a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u0 f3703b = new u0("kotlin.time.Duration", b8.d.f1111p);

    @Override // z7.a
    public final Object deserialize(c8.e eVar) {
        eVar.getClass();
        int i = m7.a.f7657m;
        String strDecodeString = eVar.decodeString();
        strDecodeString.getClass();
        try {
            return new m7.a(i5.f(strDecodeString));
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(androidx.lifecycle.l.w("Invalid ISO duration string format: '", strDecodeString, "'."), e10);
        }
    }

    @Override // z7.h, z7.a
    public final b8.e getDescriptor() {
        return f3703b;
    }

    @Override // z7.h
    public final void serialize(c8.f fVar, Object obj) {
        long j;
        long j6;
        int iG;
        long j10 = ((m7.a) obj).f7658a;
        int i = m7.a.f7657m;
        StringBuilder sb = new StringBuilder();
        if (j10 < 0) {
            sb.append('-');
        }
        sb.append("PT");
        boolean z9 = true;
        if (j10 < 0) {
            j = ((-(j10 >> 1)) << 1) + ((long) (((int) j10) & 1));
            int i6 = m7.b.f7659a;
        } else {
            j = j10;
        }
        long jG = m7.a.g(j, m7.c.HOURS);
        if (m7.a.e(j)) {
            j6 = 0;
            iG = 0;
        } else {
            j6 = 0;
            iG = (int) (m7.a.g(j, m7.c.MINUTES) % ((long) 60));
        }
        int iG2 = m7.a.e(j) ? 0 : (int) (m7.a.g(j, m7.c.SECONDS) % ((long) 60));
        int iD = m7.a.d(j);
        if (m7.a.e(j10)) {
            jG = 9999999999999L;
        }
        boolean z10 = jG != j6;
        boolean z11 = (iG2 == 0 && iD == 0) ? false : true;
        if (iG == 0 && (!z11 || !z10)) {
            z9 = false;
        }
        if (z10) {
            sb.append(jG);
            sb.append('H');
        }
        if (z9) {
            sb.append(iG);
            sb.append('M');
        }
        if (z11 || (!z10 && !z9)) {
            m7.a.b(sb, iG2, iD, 9, ExifInterface.LATITUDE_SOUTH, true);
        }
        fVar.encodeString(sb.toString());
    }
}
