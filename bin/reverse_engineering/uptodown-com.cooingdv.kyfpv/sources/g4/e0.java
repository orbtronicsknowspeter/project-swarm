package g4;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.i5;
import com.uptodown.R;
import com.uptodown.core.activities.InstallerActivity;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InstallerActivity f5161b;

    public /* synthetic */ e0(InstallerActivity installerActivity, int i) {
        this.f5160a = i;
        this.f5161b = installerActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        long length;
        int i = this.f5160a;
        Drawable drawableLoadIcon = null;
        Object[] objArr = 0;
        InstallerActivity installerActivity = this.f5161b;
        int i6 = 1;
        int i10 = 0;
        switch (i) {
            case 0:
                String str = installerActivity.S;
                if (str != null && l7.u.k0(str, ".apk", false)) {
                    PackageManager packageManager = installerActivity.getPackageManager();
                    packageManager.getClass();
                    String str2 = installerActivity.S;
                    str2.getClass();
                    PackageInfo packageInfoD = n4.i.d(packageManager, str2, 128);
                    if ((packageInfoD != null ? packageInfoD.applicationInfo : null) != null) {
                        LinearLayout linearLayout = installerActivity.F;
                        if (linearLayout != null) {
                            linearLayout.setVisibility(0);
                        }
                        ApplicationInfo applicationInfo = packageInfoD.applicationInfo;
                        applicationInfo.getClass();
                        String str3 = installerActivity.S;
                        str3.getClass();
                        applicationInfo.sourceDir = str3;
                        applicationInfo.publicSourceDir = str3;
                        String string = packageManager.getApplicationLabel(applicationInfo).toString();
                        long jD = n4.d.d(packageInfoD);
                        String str4 = installerActivity.S;
                        str4.getClass();
                        try {
                            length = new File(str4).length();
                        } catch (Exception unused) {
                            length = -1;
                        }
                        f4.a aVar = f4.a.f4870a;
                        String str5 = packageInfoD.packageName;
                        str5.getClass();
                        aVar.d(jD, length, str5, string);
                        if (!installerActivity.f3399e0) {
                            String str6 = installerActivity.S;
                            str6.getClass();
                            File file = new File(str6);
                            ImageView imageView = installerActivity.O;
                            if (imageView != null) {
                                String str7 = installerActivity.S;
                                str7.getClass();
                                PackageManager packageManager2 = installerActivity.getPackageManager();
                                packageManager2.getClass();
                                PackageInfo packageInfoD2 = n4.i.d(packageManager2, str7, 128);
                                if ((packageInfoD2 != null ? packageInfoD2.applicationInfo : null) != null) {
                                    ApplicationInfo applicationInfo2 = packageInfoD2.applicationInfo;
                                    applicationInfo2.getClass();
                                    applicationInfo2.sourceDir = str7;
                                    ApplicationInfo applicationInfo3 = packageInfoD2.applicationInfo;
                                    applicationInfo3.getClass();
                                    applicationInfo3.publicSourceDir = str7;
                                    ApplicationInfo applicationInfo4 = packageInfoD2.applicationInfo;
                                    applicationInfo4.getClass();
                                    drawableLoadIcon = applicationInfo4.loadIcon(installerActivity.getPackageManager());
                                }
                                imageView.setImageDrawable(drawableLoadIcon);
                            }
                            TextView textView = installerActivity.E;
                            if (textView != null) {
                                textView.setText(string);
                            }
                            TextView textView2 = installerActivity.E;
                            if (textView2 != null) {
                                textView2.setVisibility(0);
                            }
                            TextView textView3 = installerActivity.G;
                            if (textView3 != null) {
                                textView3.setText(file.getName());
                            }
                            TextView textView4 = installerActivity.G;
                            if (textView4 != null) {
                                textView4.setVisibility(0);
                            }
                            TextView textView5 = installerActivity.H;
                            if (textView5 != null) {
                                textView5.setText(i5.G(length));
                            }
                            TextView textView6 = installerActivity.H;
                            if (textView6 != null) {
                                textView6.setVisibility(0);
                            }
                            TextView textView7 = installerActivity.I;
                            if (textView7 != null) {
                                textView7.setText(packageInfoD.versionName);
                            }
                            TextView textView8 = installerActivity.I;
                            if (textView8 != null) {
                                textView8.setVisibility(0);
                            }
                        }
                    }
                }
                if (!installerActivity.f3399e0) {
                    installerActivity.runOnUiThread(new e0(installerActivity, i6));
                } else {
                    installerActivity.finish();
                }
                break;
            default:
                int i11 = InstallerActivity.f3395j0;
                if (installerActivity.X == null) {
                    v7.e eVar = o7.m0.f8289a;
                    installerActivity.X = o7.c0.s(o7.c0.b(v7.d.f10885a), null, null, new k0(installerActivity, objArr == true ? 1 : 0, i10), 3);
                }
                LinearLayout linearLayout2 = installerActivity.a0;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(0);
                }
                TextView textView9 = installerActivity.L;
                if (textView9 != null) {
                    textView9.setText(R.string.installing);
                }
                ProgressBar progressBar = installerActivity.f3404y;
                if (progressBar != null) {
                    progressBar.setIndeterminate(true);
                }
                installerActivity.getWindow().addFlags(128);
                ImageView imageView2 = installerActivity.P;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
                TextView textView10 = installerActivity.N;
                if (textView10 != null) {
                    textView10.setVisibility(8);
                }
                break;
        }
    }
}
