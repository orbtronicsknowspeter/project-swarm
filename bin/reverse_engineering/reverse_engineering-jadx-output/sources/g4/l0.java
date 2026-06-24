package g4;

import android.net.Uri;
import com.uptodown.core.activities.InstallerActivity;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends v6.i implements d7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5210a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5211b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f5212l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InstallerActivity f5213m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Uri f5214n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(InstallerActivity installerActivity, Uri uri, String str, t6.c cVar) {
        super(2, cVar);
        this.f5213m = installerActivity;
        this.f5214n = uri;
        this.f5212l = str;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f5210a) {
            case 0:
                return new l0(this.f5213m, this.f5214n, this.f5212l, cVar);
            default:
                return new l0(this.f5212l, this.f5213m, this.f5214n, cVar);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        o7.a0 a0Var = (o7.a0) obj;
        t6.c cVar = (t6.c) obj2;
        switch (this.f5210a) {
        }
        return ((l0) create(a0Var, cVar)).invokeSuspend(p6.x.f8463a);
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) throws IOException {
        InputStream inputStreamOpenInputStream;
        int i = this.f5210a;
        p6.x xVar = p6.x.f8463a;
        Uri uri = this.f5214n;
        u6.a aVar = u6.a.f10762a;
        InstallerActivity installerActivity = this.f5213m;
        String str = this.f5212l;
        switch (i) {
            case 0:
                int i6 = this.f5211b;
                if (i6 == 0) {
                    p6.a.e(obj);
                    this.f5211b = 1;
                    if (InstallerActivity.C(installerActivity, uri, str, this) == aVar) {
                    }
                } else if (i6 != 1) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                } else {
                    p6.a.e(obj);
                }
                break;
            default:
                int i10 = this.f5211b;
                if (i10 == 0) {
                    p6.a.e(obj);
                    kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
                    str.getClass();
                    if (l7.u.k0(str, ".apk", true) || l7.u.k0(str, ".xapk", true) || l7.u.k0(str, ".apks", true) || l7.u.k0(str, ".apkm", true) || l7.u.k0(str, ".zip", true)) {
                        try {
                            inputStreamOpenInputStream = installerActivity.getContentResolver().openInputStream(uri);
                        } catch (FileNotFoundException e10) {
                            e10.printStackTrace();
                            xVar2.f7024a = installerActivity.getString(2131952085);
                            inputStreamOpenInputStream = null;
                        } catch (SecurityException e11) {
                            e11.printStackTrace();
                            xVar2.f7024a = installerActivity.getString(2131952386);
                            inputStreamOpenInputStream = null;
                        }
                        if (inputStreamOpenInputStream != null) {
                            byte[] bArr = new byte[8192];
                            File file = new File(installerActivity.getExternalFilesDir(null), "tmp");
                            if (!file.exists()) {
                                file.mkdirs();
                            }
                            if (file.getUsableSpace() > ((double) inputStreamOpenInputStream.available()) * 1.25d) {
                                File file2 = new File(file, str);
                                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                while (true) {
                                    int i11 = inputStreamOpenInputStream.read(bArr, 0, 8192);
                                    if (i11 <= 0) {
                                        try {
                                            fileOutputStream.close();
                                        } catch (IOException e12) {
                                            if (xVar2.f7024a == null) {
                                                xVar2.f7024a = e12.getLocalizedMessage();
                                            }
                                        }
                                        installerActivity.S = file2.getAbsolutePath();
                                        break;
                                    } else {
                                        try {
                                            fileOutputStream.write(bArr, 0, i11);
                                        } catch (IOException e13) {
                                            xVar2.f7024a = e13.getLocalizedMessage();
                                        }
                                    }
                                }
                            } else {
                                xVar2.f7024a = installerActivity.getString(2131952002);
                            }
                            inputStreamOpenInputStream.close();
                        }
                    }
                    v7.e eVar = o7.m0.f8288a;
                    p7.c cVar = t7.n.f10348a;
                    n0 n0Var = new n0(installerActivity, xVar2, null, 0);
                    this.f5211b = 1;
                    if (o7.c0.C(n0Var, cVar, this) == aVar) {
                    }
                } else if (i10 != 1) {
                    androidx.privacysandbox.ads.adservices.customaudience.a.i("call to 'resume' before 'invoke' with coroutine");
                } else {
                    p6.a.e(obj);
                }
                break;
        }
        return aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(String str, InstallerActivity installerActivity, Uri uri, t6.c cVar) {
        super(2, cVar);
        this.f5212l = str;
        this.f5213m = installerActivity;
        this.f5214n = uri;
    }
}
