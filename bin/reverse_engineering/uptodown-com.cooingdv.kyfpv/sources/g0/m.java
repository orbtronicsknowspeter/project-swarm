package g0;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public class m extends Exception {
    public m(Status status) {
        int i = status.f2474a;
        String str = status.f2475b;
        str = str == null ? "" : str;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2 + str.length());
        sb.append(i);
        sb.append(": ");
        sb.append(str);
        super(sb.toString());
    }
}
