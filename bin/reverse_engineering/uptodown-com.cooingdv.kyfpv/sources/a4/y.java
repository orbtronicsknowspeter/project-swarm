package a4;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class y extends k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f189d = {"orientation"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f190c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Context context, int i) {
        super(context, 0);
        this.f190c = i;
    }

    @Override // a4.k, a4.n0
    public final boolean b(k0 k0Var) {
        switch (this.f190c) {
            case 0:
                Uri uri = (Uri) k0Var.f127b;
                return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
            default:
                return "file".equals(((Uri) k0Var.f127b).getScheme());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0133  */
    @Override // a4.k, a4.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a4.m0 e(a4.k0 r21, int r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.y.e(a4.k0, int):a4.m0");
    }
}
