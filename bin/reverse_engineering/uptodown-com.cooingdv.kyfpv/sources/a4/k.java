package a4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.google.android.gms.internal.measurement.i5;
import java.io.FileNotFoundException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public class k extends n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f125b;

    public /* synthetic */ k(Context context, int i) {
        this.f124a = i;
        this.f125b = context;
    }

    @Override // a4.n0
    public boolean b(k0 k0Var) {
        switch (this.f124a) {
            case 0:
                return "content".equals(((Uri) k0Var.f127b).getScheme());
            default:
                if (k0Var.f128c != 0) {
                    return true;
                }
                return "android.resource".equals(((Uri) k0Var.f127b).getScheme());
        }
    }

    @Override // a4.n0
    public m0 e(k0 k0Var, int i) throws FileNotFoundException {
        Resources resources;
        int i6 = this.f124a;
        Context context = this.f125b;
        switch (i6) {
            case 0:
                return new m0(i5.M(context.getContentResolver().openInputStream((Uri) k0Var.f127b)), 2);
            default:
                StringBuilder sb = t0.f177a;
                int i10 = k0Var.f128c;
                Uri uri = (Uri) k0Var.f127b;
                if (i10 == 0 && uri != null) {
                    String authority = uri.getAuthority();
                    if (authority == null) {
                        s1.o.p(uri, "No package provided: ");
                        return null;
                    }
                    try {
                        resources = context.getPackageManager().getResourcesForApplication(authority);
                    } catch (PackageManager.NameNotFoundException unused) {
                        s1.o.p(uri, "Unable to obtain resources for package: ");
                        return null;
                    }
                    break;
                } else {
                    resources = context.getResources();
                }
                int identifier = k0Var.f128c;
                if (identifier == 0 && uri != null) {
                    String authority2 = uri.getAuthority();
                    if (authority2 == null) {
                        s1.o.p(uri, "No package provided: ");
                        return null;
                    }
                    List<String> pathSegments = uri.getPathSegments();
                    if (pathSegments == null || pathSegments.isEmpty()) {
                        s1.o.p(uri, "No path segments: ");
                        return null;
                    }
                    if (pathSegments.size() == 1) {
                        try {
                            identifier = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused2) {
                            s1.o.p(uri, "Last path segment is not a resource ID: ");
                            return null;
                        }
                    } else {
                        if (pathSegments.size() != 2) {
                            s1.o.p(uri, "More than two path segments: ");
                            return null;
                        }
                        identifier = resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
                    }
                    break;
                }
                BitmapFactory.Options optionsC = n0.c(k0Var);
                if (optionsC != null && optionsC.inJustDecodeBounds) {
                    BitmapFactory.decodeResource(resources, identifier, optionsC);
                    n0.a(k0Var.f129d, k0Var.f130e, optionsC.outWidth, optionsC.outHeight, optionsC, k0Var);
                }
                Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resources, identifier, optionsC);
                if (bitmapDecodeResource != null) {
                    return new m0(bitmapDecodeResource, null, 2, 0);
                }
                com.google.gson.internal.a.i("bitmap == null");
                return null;
        }
    }
}
