package g4;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.documentfile.provider.DocumentFile;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import c4.q4;
import c4.sc;
import c4.w4;
import com.uptodown.R;
import java.io.File;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h extends AppCompatActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AlertDialog f5177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f5178b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public RadioButton f5179l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public RadioButton f5180m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RadioButton f5181n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CheckBox f5182o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CheckBox f5183p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f5184q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f5185r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Boolean f5186s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f5187t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ActivityResultLauncher f5188u;
    public final ActivityResultLauncher v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ActivityResultLauncher f5189w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ActivityResultLauncher f5190x;

    public h() {
        final int i = 0;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: g4.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f5143b;

            {
                this.f5143b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                Bundle extras;
                Bundle extras2;
                Bundle extras3;
                int i6 = i;
                boolean zMatches = false;
                h hVar = this.f5143b;
                ActivityResult activityResult = (ActivityResult) obj;
                switch (i6) {
                    case 0:
                        if (hVar.l()) {
                            hVar.u();
                            return;
                        } else {
                            hVar.s();
                            return;
                        }
                    case 1:
                        if (activityResult.getResultCode() == -1) {
                            Intent data = activityResult.getData();
                            Uri data2 = data != null ? data.getData() : null;
                            if (data2 == null) {
                                hVar.p();
                                return;
                            }
                            Intent data3 = activityResult.getData();
                            Integer numValueOf = data3 != null ? Integer.valueOf(data3.getFlags()) : null;
                            if (numValueOf != null) {
                                numValueOf = Integer.valueOf(numValueOf.intValue() & 3);
                            }
                            ContentResolver contentResolver = hVar.getContentResolver();
                            numValueOf.getClass();
                            contentResolver.takePersistableUriPermission(data2, numValueOf.intValue());
                            String path = data2.getPath();
                            if (path != null) {
                                Pattern patternCompile = Pattern.compile(".*\\b[ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]]-[ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]]:.*");
                                patternCompile.getClass();
                                zMatches = patternCompile.matcher(path).matches();
                            }
                            if (zMatches) {
                                hVar.q();
                                return;
                            } else {
                                hVar.r();
                                return;
                            }
                        }
                        return;
                    case 2:
                        hVar.w();
                        return;
                    default:
                        activityResult.getClass();
                        if (activityResult.getResultCode() == 145) {
                            Intent data4 = activityResult.getData();
                            hVar.f5187t = (data4 == null || (extras3 = data4.getExtras()) == null) ? null : extras3.getString("path_selected");
                            Intent data5 = activityResult.getData();
                            hVar.f5186s = (data5 == null || (extras2 = data5.getExtras()) == null) ? null : Boolean.valueOf(extras2.getBoolean("sdcard_selected"));
                            Intent data6 = activityResult.getData();
                            Uri data7 = data6 != null ? data6.getData() : null;
                            if (hVar.f5187t != null) {
                                String str = hVar.f5187t;
                                str.getClass();
                                File file = new File(str);
                                TextView textView = hVar.f5184q;
                                if (textView == null) {
                                    kotlin.jvm.internal.l.i("tvPath");
                                    throw null;
                                }
                                textView.setText(hVar.f5187t);
                                if (file.exists() && file.isDirectory() && file.canWrite()) {
                                    TextView textView2 = hVar.f5185r;
                                    if (textView2 != null) {
                                        textView2.setVisibility(8);
                                        return;
                                    } else {
                                        kotlin.jvm.internal.l.i("tvErrorPath");
                                        throw null;
                                    }
                                }
                                TextView textView3 = hVar.f5185r;
                                if (textView3 != null) {
                                    textView3.setVisibility(0);
                                    return;
                                } else {
                                    kotlin.jvm.internal.l.i("tvErrorPath");
                                    throw null;
                                }
                            }
                            if (data7 == null) {
                                TextView textView4 = hVar.f5185r;
                                if (textView4 != null) {
                                    textView4.setVisibility(0);
                                    return;
                                } else {
                                    kotlin.jvm.internal.l.i("tvErrorPath");
                                    throw null;
                                }
                            }
                            String lastPathSegment = data7.getLastPathSegment();
                            Intent data8 = activityResult.getData();
                            hVar.f5186s = (data8 == null || (extras = data8.getExtras()) == null) ? null : Boolean.valueOf(extras.getBoolean("sdcard_selected"));
                            hVar.f5187t = lastPathSegment != null ? lastPathSegment.substring(l7.m.A0(":", lastPathSegment, 6) + 1) : null;
                            boolean zA = kotlin.jvm.internal.l.a(hVar.f5186s, Boolean.TRUE);
                            TextView textView5 = hVar.f5184q;
                            if (zA) {
                                if (textView5 == null) {
                                    kotlin.jvm.internal.l.i("tvPath");
                                    throw null;
                                }
                                textView5.setText(hVar.getString(R.string.sd_card) + "/" + hVar.f5187t);
                            } else {
                                if (textView5 == null) {
                                    kotlin.jvm.internal.l.i("tvPath");
                                    throw null;
                                }
                                textView5.setText(hVar.getString(R.string.internal_storage) + "/" + hVar.f5187t);
                            }
                            DocumentFile documentFileFromSingleUri = DocumentFile.fromSingleUri(hVar, data7);
                            if (documentFileFromSingleUri != null && documentFileFromSingleUri.exists() && documentFileFromSingleUri.isDirectory() && documentFileFromSingleUri.canWrite()) {
                                TextView textView6 = hVar.f5185r;
                                if (textView6 != null) {
                                    textView6.setVisibility(8);
                                    return;
                                } else {
                                    kotlin.jvm.internal.l.i("tvErrorPath");
                                    throw null;
                                }
                            }
                            TextView textView7 = hVar.f5185r;
                            if (textView7 != null) {
                                textView7.setVisibility(0);
                                return;
                            } else {
                                kotlin.jvm.internal.l.i("tvErrorPath");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        activityResultLauncherRegisterForActivityResult.getClass();
        this.f5188u = activityResultLauncherRegisterForActivityResult;
        final int i6 = 1;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: g4.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f5143b;

            {
                this.f5143b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                Bundle extras;
                Bundle extras2;
                Bundle extras3;
                int i62 = i6;
                boolean zMatches = false;
                h hVar = this.f5143b;
                ActivityResult activityResult = (ActivityResult) obj;
                switch (i62) {
                    case 0:
                        if (hVar.l()) {
                            hVar.u();
                            return;
                        } else {
                            hVar.s();
                            return;
                        }
                    case 1:
                        if (activityResult.getResultCode() == -1) {
                            Intent data = activityResult.getData();
                            Uri data2 = data != null ? data.getData() : null;
                            if (data2 == null) {
                                hVar.p();
                                return;
                            }
                            Intent data3 = activityResult.getData();
                            Integer numValueOf = data3 != null ? Integer.valueOf(data3.getFlags()) : null;
                            if (numValueOf != null) {
                                numValueOf = Integer.valueOf(numValueOf.intValue() & 3);
                            }
                            ContentResolver contentResolver = hVar.getContentResolver();
                            numValueOf.getClass();
                            contentResolver.takePersistableUriPermission(data2, numValueOf.intValue());
                            String path = data2.getPath();
                            if (path != null) {
                                Pattern patternCompile = Pattern.compile(".*\\b[ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]]-[ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]]:.*");
                                patternCompile.getClass();
                                zMatches = patternCompile.matcher(path).matches();
                            }
                            if (zMatches) {
                                hVar.q();
                                return;
                            } else {
                                hVar.r();
                                return;
                            }
                        }
                        return;
                    case 2:
                        hVar.w();
                        return;
                    default:
                        activityResult.getClass();
                        if (activityResult.getResultCode() == 145) {
                            Intent data4 = activityResult.getData();
                            hVar.f5187t = (data4 == null || (extras3 = data4.getExtras()) == null) ? null : extras3.getString("path_selected");
                            Intent data5 = activityResult.getData();
                            hVar.f5186s = (data5 == null || (extras2 = data5.getExtras()) == null) ? null : Boolean.valueOf(extras2.getBoolean("sdcard_selected"));
                            Intent data6 = activityResult.getData();
                            Uri data7 = data6 != null ? data6.getData() : null;
                            if (hVar.f5187t != null) {
                                String str = hVar.f5187t;
                                str.getClass();
                                File file = new File(str);
                                TextView textView = hVar.f5184q;
                                if (textView == null) {
                                    kotlin.jvm.internal.l.i("tvPath");
                                    throw null;
                                }
                                textView.setText(hVar.f5187t);
                                if (file.exists() && file.isDirectory() && file.canWrite()) {
                                    TextView textView2 = hVar.f5185r;
                                    if (textView2 != null) {
                                        textView2.setVisibility(8);
                                        return;
                                    } else {
                                        kotlin.jvm.internal.l.i("tvErrorPath");
                                        throw null;
                                    }
                                }
                                TextView textView3 = hVar.f5185r;
                                if (textView3 != null) {
                                    textView3.setVisibility(0);
                                    return;
                                } else {
                                    kotlin.jvm.internal.l.i("tvErrorPath");
                                    throw null;
                                }
                            }
                            if (data7 == null) {
                                TextView textView4 = hVar.f5185r;
                                if (textView4 != null) {
                                    textView4.setVisibility(0);
                                    return;
                                } else {
                                    kotlin.jvm.internal.l.i("tvErrorPath");
                                    throw null;
                                }
                            }
                            String lastPathSegment = data7.getLastPathSegment();
                            Intent data8 = activityResult.getData();
                            hVar.f5186s = (data8 == null || (extras = data8.getExtras()) == null) ? null : Boolean.valueOf(extras.getBoolean("sdcard_selected"));
                            hVar.f5187t = lastPathSegment != null ? lastPathSegment.substring(l7.m.A0(":", lastPathSegment, 6) + 1) : null;
                            boolean zA = kotlin.jvm.internal.l.a(hVar.f5186s, Boolean.TRUE);
                            TextView textView5 = hVar.f5184q;
                            if (zA) {
                                if (textView5 == null) {
                                    kotlin.jvm.internal.l.i("tvPath");
                                    throw null;
                                }
                                textView5.setText(hVar.getString(R.string.sd_card) + "/" + hVar.f5187t);
                            } else {
                                if (textView5 == null) {
                                    kotlin.jvm.internal.l.i("tvPath");
                                    throw null;
                                }
                                textView5.setText(hVar.getString(R.string.internal_storage) + "/" + hVar.f5187t);
                            }
                            DocumentFile documentFileFromSingleUri = DocumentFile.fromSingleUri(hVar, data7);
                            if (documentFileFromSingleUri != null && documentFileFromSingleUri.exists() && documentFileFromSingleUri.isDirectory() && documentFileFromSingleUri.canWrite()) {
                                TextView textView6 = hVar.f5185r;
                                if (textView6 != null) {
                                    textView6.setVisibility(8);
                                    return;
                                } else {
                                    kotlin.jvm.internal.l.i("tvErrorPath");
                                    throw null;
                                }
                            }
                            TextView textView7 = hVar.f5185r;
                            if (textView7 != null) {
                                textView7.setVisibility(0);
                                return;
                            } else {
                                kotlin.jvm.internal.l.i("tvErrorPath");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        activityResultLauncherRegisterForActivityResult2.getClass();
        this.v = activityResultLauncherRegisterForActivityResult2;
        final int i10 = 2;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult3 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: g4.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f5143b;

            {
                this.f5143b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                Bundle extras;
                Bundle extras2;
                Bundle extras3;
                int i62 = i10;
                boolean zMatches = false;
                h hVar = this.f5143b;
                ActivityResult activityResult = (ActivityResult) obj;
                switch (i62) {
                    case 0:
                        if (hVar.l()) {
                            hVar.u();
                            return;
                        } else {
                            hVar.s();
                            return;
                        }
                    case 1:
                        if (activityResult.getResultCode() == -1) {
                            Intent data = activityResult.getData();
                            Uri data2 = data != null ? data.getData() : null;
                            if (data2 == null) {
                                hVar.p();
                                return;
                            }
                            Intent data3 = activityResult.getData();
                            Integer numValueOf = data3 != null ? Integer.valueOf(data3.getFlags()) : null;
                            if (numValueOf != null) {
                                numValueOf = Integer.valueOf(numValueOf.intValue() & 3);
                            }
                            ContentResolver contentResolver = hVar.getContentResolver();
                            numValueOf.getClass();
                            contentResolver.takePersistableUriPermission(data2, numValueOf.intValue());
                            String path = data2.getPath();
                            if (path != null) {
                                Pattern patternCompile = Pattern.compile(".*\\b[ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]]-[ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]]:.*");
                                patternCompile.getClass();
                                zMatches = patternCompile.matcher(path).matches();
                            }
                            if (zMatches) {
                                hVar.q();
                                return;
                            } else {
                                hVar.r();
                                return;
                            }
                        }
                        return;
                    case 2:
                        hVar.w();
                        return;
                    default:
                        activityResult.getClass();
                        if (activityResult.getResultCode() == 145) {
                            Intent data4 = activityResult.getData();
                            hVar.f5187t = (data4 == null || (extras3 = data4.getExtras()) == null) ? null : extras3.getString("path_selected");
                            Intent data5 = activityResult.getData();
                            hVar.f5186s = (data5 == null || (extras2 = data5.getExtras()) == null) ? null : Boolean.valueOf(extras2.getBoolean("sdcard_selected"));
                            Intent data6 = activityResult.getData();
                            Uri data7 = data6 != null ? data6.getData() : null;
                            if (hVar.f5187t != null) {
                                String str = hVar.f5187t;
                                str.getClass();
                                File file = new File(str);
                                TextView textView = hVar.f5184q;
                                if (textView == null) {
                                    kotlin.jvm.internal.l.i("tvPath");
                                    throw null;
                                }
                                textView.setText(hVar.f5187t);
                                if (file.exists() && file.isDirectory() && file.canWrite()) {
                                    TextView textView2 = hVar.f5185r;
                                    if (textView2 != null) {
                                        textView2.setVisibility(8);
                                        return;
                                    } else {
                                        kotlin.jvm.internal.l.i("tvErrorPath");
                                        throw null;
                                    }
                                }
                                TextView textView3 = hVar.f5185r;
                                if (textView3 != null) {
                                    textView3.setVisibility(0);
                                    return;
                                } else {
                                    kotlin.jvm.internal.l.i("tvErrorPath");
                                    throw null;
                                }
                            }
                            if (data7 == null) {
                                TextView textView4 = hVar.f5185r;
                                if (textView4 != null) {
                                    textView4.setVisibility(0);
                                    return;
                                } else {
                                    kotlin.jvm.internal.l.i("tvErrorPath");
                                    throw null;
                                }
                            }
                            String lastPathSegment = data7.getLastPathSegment();
                            Intent data8 = activityResult.getData();
                            hVar.f5186s = (data8 == null || (extras = data8.getExtras()) == null) ? null : Boolean.valueOf(extras.getBoolean("sdcard_selected"));
                            hVar.f5187t = lastPathSegment != null ? lastPathSegment.substring(l7.m.A0(":", lastPathSegment, 6) + 1) : null;
                            boolean zA = kotlin.jvm.internal.l.a(hVar.f5186s, Boolean.TRUE);
                            TextView textView5 = hVar.f5184q;
                            if (zA) {
                                if (textView5 == null) {
                                    kotlin.jvm.internal.l.i("tvPath");
                                    throw null;
                                }
                                textView5.setText(hVar.getString(R.string.sd_card) + "/" + hVar.f5187t);
                            } else {
                                if (textView5 == null) {
                                    kotlin.jvm.internal.l.i("tvPath");
                                    throw null;
                                }
                                textView5.setText(hVar.getString(R.string.internal_storage) + "/" + hVar.f5187t);
                            }
                            DocumentFile documentFileFromSingleUri = DocumentFile.fromSingleUri(hVar, data7);
                            if (documentFileFromSingleUri != null && documentFileFromSingleUri.exists() && documentFileFromSingleUri.isDirectory() && documentFileFromSingleUri.canWrite()) {
                                TextView textView6 = hVar.f5185r;
                                if (textView6 != null) {
                                    textView6.setVisibility(8);
                                    return;
                                } else {
                                    kotlin.jvm.internal.l.i("tvErrorPath");
                                    throw null;
                                }
                            }
                            TextView textView7 = hVar.f5185r;
                            if (textView7 != null) {
                                textView7.setVisibility(0);
                                return;
                            } else {
                                kotlin.jvm.internal.l.i("tvErrorPath");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        activityResultLauncherRegisterForActivityResult3.getClass();
        this.f5189w = activityResultLauncherRegisterForActivityResult3;
        final int i11 = 3;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult4 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback(this) { // from class: g4.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f5143b;

            {
                this.f5143b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                Bundle extras;
                Bundle extras2;
                Bundle extras3;
                int i62 = i11;
                boolean zMatches = false;
                h hVar = this.f5143b;
                ActivityResult activityResult = (ActivityResult) obj;
                switch (i62) {
                    case 0:
                        if (hVar.l()) {
                            hVar.u();
                            return;
                        } else {
                            hVar.s();
                            return;
                        }
                    case 1:
                        if (activityResult.getResultCode() == -1) {
                            Intent data = activityResult.getData();
                            Uri data2 = data != null ? data.getData() : null;
                            if (data2 == null) {
                                hVar.p();
                                return;
                            }
                            Intent data3 = activityResult.getData();
                            Integer numValueOf = data3 != null ? Integer.valueOf(data3.getFlags()) : null;
                            if (numValueOf != null) {
                                numValueOf = Integer.valueOf(numValueOf.intValue() & 3);
                            }
                            ContentResolver contentResolver = hVar.getContentResolver();
                            numValueOf.getClass();
                            contentResolver.takePersistableUriPermission(data2, numValueOf.intValue());
                            String path = data2.getPath();
                            if (path != null) {
                                Pattern patternCompile = Pattern.compile(".*\\b[ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]]-[ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]]:.*");
                                patternCompile.getClass();
                                zMatches = patternCompile.matcher(path).matches();
                            }
                            if (zMatches) {
                                hVar.q();
                                return;
                            } else {
                                hVar.r();
                                return;
                            }
                        }
                        return;
                    case 2:
                        hVar.w();
                        return;
                    default:
                        activityResult.getClass();
                        if (activityResult.getResultCode() == 145) {
                            Intent data4 = activityResult.getData();
                            hVar.f5187t = (data4 == null || (extras3 = data4.getExtras()) == null) ? null : extras3.getString("path_selected");
                            Intent data5 = activityResult.getData();
                            hVar.f5186s = (data5 == null || (extras2 = data5.getExtras()) == null) ? null : Boolean.valueOf(extras2.getBoolean("sdcard_selected"));
                            Intent data6 = activityResult.getData();
                            Uri data7 = data6 != null ? data6.getData() : null;
                            if (hVar.f5187t != null) {
                                String str = hVar.f5187t;
                                str.getClass();
                                File file = new File(str);
                                TextView textView = hVar.f5184q;
                                if (textView == null) {
                                    kotlin.jvm.internal.l.i("tvPath");
                                    throw null;
                                }
                                textView.setText(hVar.f5187t);
                                if (file.exists() && file.isDirectory() && file.canWrite()) {
                                    TextView textView2 = hVar.f5185r;
                                    if (textView2 != null) {
                                        textView2.setVisibility(8);
                                        return;
                                    } else {
                                        kotlin.jvm.internal.l.i("tvErrorPath");
                                        throw null;
                                    }
                                }
                                TextView textView3 = hVar.f5185r;
                                if (textView3 != null) {
                                    textView3.setVisibility(0);
                                    return;
                                } else {
                                    kotlin.jvm.internal.l.i("tvErrorPath");
                                    throw null;
                                }
                            }
                            if (data7 == null) {
                                TextView textView4 = hVar.f5185r;
                                if (textView4 != null) {
                                    textView4.setVisibility(0);
                                    return;
                                } else {
                                    kotlin.jvm.internal.l.i("tvErrorPath");
                                    throw null;
                                }
                            }
                            String lastPathSegment = data7.getLastPathSegment();
                            Intent data8 = activityResult.getData();
                            hVar.f5186s = (data8 == null || (extras = data8.getExtras()) == null) ? null : Boolean.valueOf(extras.getBoolean("sdcard_selected"));
                            hVar.f5187t = lastPathSegment != null ? lastPathSegment.substring(l7.m.A0(":", lastPathSegment, 6) + 1) : null;
                            boolean zA = kotlin.jvm.internal.l.a(hVar.f5186s, Boolean.TRUE);
                            TextView textView5 = hVar.f5184q;
                            if (zA) {
                                if (textView5 == null) {
                                    kotlin.jvm.internal.l.i("tvPath");
                                    throw null;
                                }
                                textView5.setText(hVar.getString(R.string.sd_card) + "/" + hVar.f5187t);
                            } else {
                                if (textView5 == null) {
                                    kotlin.jvm.internal.l.i("tvPath");
                                    throw null;
                                }
                                textView5.setText(hVar.getString(R.string.internal_storage) + "/" + hVar.f5187t);
                            }
                            DocumentFile documentFileFromSingleUri = DocumentFile.fromSingleUri(hVar, data7);
                            if (documentFileFromSingleUri != null && documentFileFromSingleUri.exists() && documentFileFromSingleUri.isDirectory() && documentFileFromSingleUri.canWrite()) {
                                TextView textView6 = hVar.f5185r;
                                if (textView6 != null) {
                                    textView6.setVisibility(8);
                                    return;
                                } else {
                                    kotlin.jvm.internal.l.i("tvErrorPath");
                                    throw null;
                                }
                            }
                            TextView textView7 = hVar.f5185r;
                            if (textView7 != null) {
                                textView7.setVisibility(0);
                                return;
                            } else {
                                kotlin.jvm.internal.l.i("tvErrorPath");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        activityResultLauncherRegisterForActivityResult4.getClass();
        this.f5190x = activityResultLauncherRegisterForActivityResult4;
    }

    public final void A(String str) {
        str.getClass();
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        v7.e eVar = o7.m0.f8289a;
        o7.c0.s(lifecycleScope, t7.n.f10349a, null, new sc(this, str, null, 6), 2);
    }

    public final void B(String str, String str2, long j, String str3, boolean z9) {
        String strConcat;
        String str4;
        long jD;
        RadioButton radioButton = this.f5179l;
        if (radioButton == null) {
            kotlin.jvm.internal.l.i("rbAppName");
            throw null;
        }
        if (radioButton.isChecked()) {
            if (str == null) {
                str = getString(R.string.app_name);
                str.getClass();
            }
        } else if (str2 != null) {
            str = str2;
        } else {
            str = getPackageName();
            str.getClass();
        }
        CheckBox checkBox = this.f5182o;
        if (checkBox == null) {
            kotlin.jvm.internal.l.i("cbVersioncode");
            throw null;
        }
        if (checkBox.isChecked()) {
            if (j > -1) {
                str = str + "_" + j;
            } else {
                try {
                    PackageManager packageManager = getPackageManager();
                    packageManager.getClass();
                    String packageName = getPackageName();
                    packageName.getClass();
                    jD = n4.d.d(n4.i.e(packageManager, packageName, 0));
                } catch (PackageManager.NameNotFoundException e10) {
                    e10.printStackTrace();
                    jD = 0;
                }
                str = str + "_" + jD;
            }
        }
        CheckBox checkBox2 = this.f5183p;
        if (checkBox2 == null) {
            kotlin.jvm.internal.l.i("cbVersionname");
            throw null;
        }
        if (checkBox2.isChecked()) {
            if (str3 != null) {
                str = a4.x.k(str, "_", str3);
            } else {
                try {
                    PackageManager packageManager2 = getPackageManager();
                    packageManager2.getClass();
                    String packageName2 = getPackageName();
                    packageName2.getClass();
                    str4 = n4.i.e(packageManager2, packageName2, 0).versionName;
                } catch (PackageManager.NameNotFoundException e11) {
                    e11.printStackTrace();
                    str4 = null;
                }
                str = a4.x.k(str, "_", str4);
            }
        }
        if (z9) {
            RadioButton radioButton2 = this.f5181n;
            if (radioButton2 == null) {
                kotlin.jvm.internal.l.i("rbXapkExtension");
                throw null;
            }
            strConcat = radioButton2.isChecked() ? str.concat(".xapk") : str.concat(".apks");
        } else {
            strConcat = str.concat(".apk");
        }
        TextView textView = this.f5178b;
        if (textView != null) {
            textView.setText(strConcat);
        } else {
            kotlin.jvm.internal.l.i("tvResult");
            throw null;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (context != null) {
            Activity activity = f4.c.f4876o;
            context = t0.f.e(context);
        }
        super.attachBaseContext(context);
    }

    public final void h(final String str, final String str2, final long j, final String str3, final boolean z9) {
        Window window;
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        AlertDialog alertDialog = this.f5177a;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        View viewInflate = getLayoutInflater().inflate(R.layout.dialog_path, (ViewGroup) null, false);
        ((TextView) viewInflate.findViewById(R.id.tv_title_dialog_path)).setTypeface(f4.c.f4883w);
        View viewFindViewById = viewInflate.findViewById(R.id.tv_path_dialog_path);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        this.f5184q = textView;
        textView.setTypeface(f4.c.f4884x);
        try {
            sharedPreferences2 = getSharedPreferences("CoreSettings", 0);
        } catch (Exception unused) {
        }
        boolean z10 = sharedPreferences2.contains("sdcard_as_backup_storage") ? sharedPreferences2.getBoolean("sdcard_as_backup_storage", false) : false;
        TextView textView2 = this.f5184q;
        if (z10) {
            if (textView2 == null) {
                kotlin.jvm.internal.l.i("tvPath");
                throw null;
            }
            textView2.setText(getString(R.string.sd_card) + "/" + new h4.a(this).b());
        } else {
            if (textView2 == null) {
                kotlin.jvm.internal.l.i("tvPath");
                throw null;
            }
            textView2.setText(new h4.a(this).b());
        }
        View viewFindViewById2 = viewInflate.findViewById(R.id.tv_error_path);
        viewFindViewById2.getClass();
        TextView textView3 = (TextView) viewFindViewById2;
        this.f5185r = textView3;
        textView3.setTypeface(f4.c.f4884x);
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.rl_path_dialog);
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new q4((w4) this, 10));
        }
        ((TextView) viewInflate.findViewById(R.id.tv_name_format_dialog_path)).setTypeface(f4.c.f4883w);
        RadioGroup radioGroup = (RadioGroup) viewInflate.findViewById(R.id.rg_name_format);
        View viewFindViewById3 = viewInflate.findViewById(R.id.rb_option_appname);
        viewFindViewById3.getClass();
        RadioButton radioButton = (RadioButton) viewFindViewById3;
        this.f5179l = radioButton;
        radioButton.setTypeface(f4.c.f4884x);
        View viewFindViewById4 = viewInflate.findViewById(R.id.rb_option_packagename);
        viewFindViewById4.getClass();
        RadioButton radioButton2 = (RadioButton) viewFindViewById4;
        this.f5180m = radioButton2;
        radioButton2.setTypeface(f4.c.f4884x);
        View viewFindViewById5 = viewInflate.findViewById(R.id.cb_versioncode);
        viewFindViewById5.getClass();
        CheckBox checkBox = (CheckBox) viewFindViewById5;
        this.f5182o = checkBox;
        checkBox.setTypeface(f4.c.f4884x);
        View viewFindViewById6 = viewInflate.findViewById(R.id.cb_versionname);
        viewFindViewById6.getClass();
        CheckBox checkBox2 = (CheckBox) viewFindViewById6;
        this.f5183p = checkBox2;
        checkBox2.setTypeface(f4.c.f4884x);
        h4.a aVar = new h4.a(this);
        RadioButton radioButton3 = this.f5179l;
        if (radioButton3 == null) {
            kotlin.jvm.internal.l.i("rbAppName");
            throw null;
        }
        radioButton3.setChecked(aVar.c("app_name_included", true));
        RadioButton radioButton4 = this.f5180m;
        if (radioButton4 == null) {
            kotlin.jvm.internal.l.i("rbPackagename");
            throw null;
        }
        radioButton4.setChecked(aVar.c("packagename_included", false));
        CheckBox checkBox3 = this.f5182o;
        if (checkBox3 == null) {
            kotlin.jvm.internal.l.i("cbVersioncode");
            throw null;
        }
        checkBox3.setChecked(aVar.c("versioncode_included", true));
        CheckBox checkBox4 = this.f5183p;
        if (checkBox4 == null) {
            kotlin.jvm.internal.l.i("cbVersionname");
            throw null;
        }
        checkBox4.setChecked(aVar.c("versionname_included", false));
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.tv_extension_dialog_path);
        RadioGroup radioGroup2 = (RadioGroup) viewInflate.findViewById(R.id.rg_extension);
        View viewFindViewById7 = viewInflate.findViewById(R.id.rb_xapk_extension);
        viewFindViewById7.getClass();
        this.f5181n = (RadioButton) viewFindViewById7;
        int i = 8;
        if (z9) {
            textView4.setTypeface(f4.c.f4883w);
            RadioButton radioButton5 = this.f5181n;
            if (radioButton5 == null) {
                kotlin.jvm.internal.l.i("rbXapkExtension");
                throw null;
            }
            radioButton5.setTypeface(f4.c.f4884x);
            RadioButton radioButton6 = this.f5181n;
            if (radioButton6 == null) {
                kotlin.jvm.internal.l.i("rbXapkExtension");
                throw null;
            }
            radioButton6.setText(".xapk");
            View viewFindViewById8 = viewInflate.findViewById(R.id.rb_apks_extension);
            viewFindViewById8.getClass();
            RadioButton radioButton7 = (RadioButton) viewFindViewById8;
            radioButton7.setTypeface(f4.c.f4884x);
            radioButton7.setText(".apks");
            try {
                sharedPreferences = getSharedPreferences("CoreSettings", 0);
            } catch (Exception unused2) {
            }
            String string = sharedPreferences.contains("xapk_extension") ? sharedPreferences.getString("xapk_extension", ".xapk") : ".xapk";
            if (string != null && !l7.u.p0(string, ".", false)) {
                string = ".".concat(string);
            }
            RadioButton radioButton8 = this.f5181n;
            if (radioButton8 == null) {
                kotlin.jvm.internal.l.i("rbXapkExtension");
                throw null;
            }
            radioButton8.setChecked(l7.u.m0(string, ".xapk", true));
            if (this.f5181n == null) {
                kotlin.jvm.internal.l.i("rbXapkExtension");
                throw null;
            }
            radioButton7.setChecked(!r1.isChecked());
        } else {
            textView4.setVisibility(8);
            radioGroup2.setVisibility(8);
        }
        ((TextView) viewInflate.findViewById(R.id.tv_result_title_dialog_path)).setTypeface(f4.c.f4884x);
        View viewFindViewById9 = viewInflate.findViewById(R.id.tv_result_dialog_path);
        viewFindViewById9.getClass();
        TextView textView5 = (TextView) viewFindViewById9;
        this.f5178b = textView5;
        textView5.setTypeface(f4.c.f4883w);
        B(str, str2, j, str3, z9);
        CheckBox checkBox5 = this.f5182o;
        if (checkBox5 == null) {
            kotlin.jvm.internal.l.i("cbVersioncode");
            throw null;
        }
        final w4 w4Var = (w4) this;
        final int i6 = 1;
        checkBox5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: g4.d
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                switch (i6) {
                    case 0:
                        w4Var.B(str, str2, j, str3, z9);
                        break;
                    default:
                        w4Var.B(str, str2, j, str3, z9);
                        break;
                }
            }
        });
        CheckBox checkBox6 = this.f5183p;
        if (checkBox6 == null) {
            kotlin.jvm.internal.l.i("cbVersionname");
            throw null;
        }
        final int i10 = 0;
        checkBox6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: g4.d
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                switch (i10) {
                    case 0:
                        w4Var.B(str, str2, j, str3, z9);
                        break;
                    default:
                        w4Var.B(str, str2, j, str3, z9);
                        break;
                }
            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: g4.e
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup3, int i11) {
                switch (i10) {
                    case 0:
                        w4Var.B(str, str2, j, str3, z9);
                        break;
                    default:
                        w4Var.B(str, str2, j, str3, z9);
                        break;
                }
            }
        });
        final int i11 = 1;
        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: g4.e
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup3, int i112) {
                switch (i11) {
                    case 0:
                        w4Var.B(str, str2, j, str3, z9);
                        break;
                    default:
                        w4Var.B(str, str2, j, str3, z9);
                        break;
                }
            }
        });
        View viewFindViewById10 = viewInflate.findViewById(R.id.tv_ok_dialog_path);
        viewFindViewById10.getClass();
        TextView textView6 = (TextView) viewFindViewById10;
        textView6.setTypeface(f4.c.f4883w);
        textView6.setOnClickListener(new q4(w4Var, i));
        View viewFindViewById11 = viewInflate.findViewById(R.id.tv_cancel_dialog_path);
        viewFindViewById11.getClass();
        TextView textView7 = (TextView) viewFindViewById11;
        textView7.setTypeface(f4.c.f4883w);
        textView7.setOnClickListener(new q4(w4Var, 9));
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(viewInflate);
        AlertDialog alertDialogCreate = builder.create();
        this.f5177a = alertDialogCreate;
        if (alertDialogCreate != null && (window = alertDialogCreate.getWindow()) != null) {
            a4.x.y(window, 0);
        }
        AlertDialog alertDialog2 = this.f5177a;
        if (alertDialog2 != null) {
            alertDialog2.show();
        }
    }

    public final void i(String str) {
        AlertDialog alertDialog = this.f5177a;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        View viewInflate = getLayoutInflater().inflate(R.layout.dialog_accept, (ViewGroup) null, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_dialog_accept_msg);
        textView.setTypeface(f4.c.f4884x);
        if (str == null) {
            textView.setText(getString(R.string.error_unknown));
        } else {
            textView.setText(str);
        }
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_accept_option);
        textView2.setTypeface(f4.c.f4883w);
        textView2.setOnClickListener(new f(this, 2));
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(viewInflate);
        builder.setCancelable(false);
        this.f5177a = builder.create();
        if (isFinishing()) {
            return;
        }
        AlertDialog alertDialog2 = this.f5177a;
        alertDialog2.getClass();
        Window window = alertDialog2.getWindow();
        if (window != null) {
            a4.x.y(window, 0);
        }
        AlertDialog alertDialog3 = this.f5177a;
        alertDialog3.getClass();
        alertDialog3.show();
    }

    public final void j() {
        try {
            if (m()) {
                return;
            }
            AlertDialog alertDialog = this.f5177a;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
            View viewInflate = getLayoutInflater().inflate(R.layout.dialog_title_accept_cancel, (ViewGroup) null, false);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_dialog_title);
            textView.setTypeface(f4.c.f4883w);
            textView.setText(getString(R.string.title_unknown_source_dialog, getString(R.string.app_name)));
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_dialog_msg);
            textView2.setTypeface(f4.c.f4884x);
            textView2.setText(getString(R.string.msg_install_from_unknown_source, getString(R.string.app_name)));
            TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_accept_option);
            textView3.setTypeface(f4.c.f4883w);
            textView3.setOnClickListener(new f(this, 0));
            TextView textView4 = (TextView) viewInflate.findViewById(R.id.tv_cancel_option);
            textView4.setTypeface(f4.c.f4883w);
            textView4.setOnClickListener(new f(this, 1));
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setView(viewInflate);
            AlertDialog alertDialogCreate = builder.create();
            this.f5177a = alertDialogCreate;
            alertDialogCreate.getClass();
            Window window = alertDialogCreate.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            if (isFinishing()) {
                return;
            }
            AlertDialog alertDialog2 = this.f5177a;
            alertDialog2.getClass();
            alertDialog2.show();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final boolean k() {
        return Build.VERSION.SDK_INT >= 33 || ContextCompat.checkSelfPermission(this, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public final boolean l() {
        return Build.VERSION.SDK_INT >= 30 ? Environment.isExternalStorageManager() : k();
    }

    public final boolean m() {
        return Build.VERSION.SDK_INT < 26 ? Settings.Secure.getInt(getContentResolver(), "install_non_market_apps", 0) == 1 : getPackageManager().canRequestPackageInstalls();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!f4.c.f4879r) {
            f4.c.f4879r = true;
            Configuration configuration = getResources().getConfiguration();
            f4.c.f4878q = (configuration.screenLayout & 15) >= 3 && configuration.smallestScreenWidthDp >= 600;
        }
        if (f4.c.f4878q) {
            setRequestedOrientation(-1);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 645) {
            if (iArr.length != 0 && iArr[0] == 0) {
                v();
                return;
            } else {
                t();
                return;
            }
        }
        if (i != 646) {
            return;
        }
        if (iArr.length != 0 && iArr[0] == 0) {
            o();
        } else {
            n();
        }
    }

    public abstract void p();

    public abstract void q();

    public abstract void r();

    public abstract void s();

    public abstract void u();

    public final void x() {
        ActivityCompat.requestPermissions(this, new String[]{"android.permission.POST_NOTIFICATIONS"}, 646);
        try {
            SharedPreferences.Editor editorEdit = getSharedPreferences("CoreSettings", 0).edit();
            editorEdit.putBoolean("notification_permission_request", true);
            editorEdit.apply();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void y() {
        try {
            int i = Build.VERSION.SDK_INT;
            ActivityResultLauncher activityResultLauncher = this.f5189w;
            if (i < 26) {
                activityResultLauncher.launch(new Intent("android.settings.SECURITY_SETTINGS"));
                return;
            }
            activityResultLauncher.launch(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + getPackageName())));
        } catch (ActivityNotFoundException e10) {
            e10.printStackTrace();
        }
    }

    public final void z() {
        if (Build.VERSION.SDK_INT < 30) {
            if (k()) {
                return;
            }
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 645);
        } else {
            if (Environment.isExternalStorageManager()) {
                if (k()) {
                    return;
                }
                ActivityCompat.requestPermissions(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 645);
                return;
            }
            try {
                this.f5188u.launch(new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", Uri.parse("package:" + getPackageName())));
            } catch (ActivityNotFoundException e10) {
                e10.printStackTrace();
                ActivityCompat.requestPermissions(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 645);
            }
        }
    }

    public void n() {
    }

    public void o() {
    }

    public void t() {
    }

    public void v() {
    }

    public void w() {
    }
}
