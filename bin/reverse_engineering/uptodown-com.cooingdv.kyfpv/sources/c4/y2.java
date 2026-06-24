package c4;

import android.app.AlertDialog;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import android.system.StructStatVfs;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.documentfile.provider.DocumentFile;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.MyDownloads;
import com.uptodown.activities.preferences.PreferencesActivity;
import com.uptodown.core.activities.FileExplorerActivity;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y2 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2333b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f2334l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f2335m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f2336n;

    public /* synthetic */ y2(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f2332a = i;
        this.f2333b = obj;
        this.f2334l = obj2;
        this.f2335m = obj3;
        this.f2336n = obj4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f2332a;
        Object obj = this.f2336n;
        Object obj2 = this.f2335m;
        Object obj3 = this.f2334l;
        Object obj4 = this.f2333b;
        switch (i) {
            case 0:
                MainActivity mainActivity = (MainActivity) obj4;
                int i6 = MainActivity.G0;
                mainActivity.K(((x4.g) obj3).O, new androidx.room.c((TextView) obj2, mainActivity, (RelativeLayout) obj, 4), new androidx.room.g(mainActivity, 22));
                break;
            case 1:
                kotlin.jvm.internal.x xVar = (kotlin.jvm.internal.x) obj4;
                MyDownloads myDownloads = (MyDownloads) obj3;
                kotlin.jvm.internal.x xVar2 = (kotlin.jvm.internal.x) obj2;
                kotlin.jvm.internal.x xVar3 = (kotlin.jvm.internal.x) obj;
                int i10 = MyDownloads.V;
                float f = UptodownApp.I;
                if (b4.d.t()) {
                    Object obj5 = xVar.f7025a;
                    obj5.getClass();
                    String str = ((x4.j0) obj5).f11241q;
                    str.getClass();
                    File file = new File(str);
                    String str2 = (String) xVar2.f7025a;
                    str2.getClass();
                    LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(myDownloads);
                    v7.e eVar = o7.m0.f8289a;
                    o7.c0.s(lifecycleScope, t7.n.f10349a, null, new b5.j(myDownloads, str2, file, null, 2), 2);
                }
                AlertDialog alertDialog = (AlertDialog) xVar3.f7025a;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                break;
            case 2:
                PreferencesActivity preferencesActivity = (PreferencesActivity) obj4;
                int i11 = PreferencesActivity.T;
                String string = preferencesActivity.getString(R.string.select_downloads_path);
                string.getClass();
                preferencesActivity.y0(string, (HashMap) obj3, ((kotlin.jvm.internal.v) obj2).f7023a, new androidx.work.impl.model.a(8, preferencesActivity, (b5.m) obj));
                break;
            default:
                FileExplorerActivity fileExplorerActivity = (FileExplorerActivity) obj3;
                kotlin.jvm.internal.x xVar4 = (kotlin.jvm.internal.x) obj2;
                g4.v vVar = (g4.v) obj;
                long usableSpace = 0;
                if (!(obj4 instanceof File)) {
                    if (!(obj4 instanceof DocumentFile)) {
                        int i12 = FileExplorerActivity.f3380q0;
                    } else if (fileExplorerActivity.f3390k0 != null) {
                        File file2 = fileExplorerActivity.f3382c0;
                        if (file2 == null) {
                            File externalStorageDirectory = Environment.getExternalStorageDirectory();
                            if (externalStorageDirectory != null) {
                                usableSpace = externalStorageDirectory.getUsableSpace();
                            }
                        } else {
                            usableSpace = file2.getUsableSpace();
                        }
                        DocumentFile documentFile = (DocumentFile) obj4;
                        if (usableSpace > documentFile.length() * ((long) 2)) {
                            String str3 = fileExplorerActivity.f3390k0;
                            str3.getClass();
                            v7.e eVar2 = o7.m0.f8289a;
                            xVar4.f7025a = o7.c0.s(o7.c0.b(v7.d.f10885a), null, null, new b.m(documentFile, str3, vVar, fileExplorerActivity, (t6.c) null, 11), 3);
                        }
                    } else if (fileExplorerActivity.f3389j0 == null) {
                        DocumentFile documentFile2 = fileExplorerActivity.Y;
                        if (documentFile2 == null) {
                            File file3 = fileExplorerActivity.f3382c0;
                            if (file3 != null) {
                                String absolutePath = file3.getAbsolutePath();
                                absolutePath.getClass();
                                v7.e eVar3 = o7.m0.f8289a;
                                xVar4.f7025a = o7.c0.s(o7.c0.b(v7.d.f10885a), null, null, new b.m((DocumentFile) obj4, absolutePath, vVar, fileExplorerActivity, (t6.c) null, 11), 3);
                            }
                        } else {
                            Uri uri = documentFile2.getUri();
                            uri.getClass();
                            v7.e eVar4 = o7.m0.f8289a;
                            xVar4.f7025a = o7.c0.s(o7.c0.b(v7.d.f10885a), null, null, new b.m((DocumentFile) obj4, uri, vVar, fileExplorerActivity, (t6.c) null, 12), 3);
                        }
                    } else {
                        Context applicationContext = fileExplorerActivity.getApplicationContext();
                        applicationContext.getClass();
                        Uri uri2 = fileExplorerActivity.f3389j0;
                        uri2.getClass();
                        try {
                            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = applicationContext.getContentResolver().openFileDescriptor(uri2, "r");
                            if (parcelFileDescriptorOpenFileDescriptor != null) {
                                StructStatVfs structStatVfsFstatvfs = Os.fstatvfs(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                                usableSpace = structStatVfsFstatvfs.f_bsize * structStatVfsFstatvfs.f_bavail;
                                parcelFileDescriptorOpenFileDescriptor.close();
                            }
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                        DocumentFile documentFile3 = (DocumentFile) obj4;
                        if (usableSpace > documentFile3.length() * ((long) 2)) {
                            Uri uri3 = fileExplorerActivity.f3389j0;
                            uri3.getClass();
                            v7.e eVar5 = o7.m0.f8289a;
                            xVar4.f7025a = o7.c0.s(o7.c0.b(v7.d.f10885a), null, null, new b.m(documentFile3, uri3, vVar, fileExplorerActivity, (t6.c) null, 12), 3);
                        }
                    }
                } else if (fileExplorerActivity.f3390k0 != null) {
                    File file4 = fileExplorerActivity.f3382c0;
                    Long lValueOf = file4 != null ? Long.valueOf(file4.getUsableSpace()) : null;
                    lValueOf.getClass();
                    File file5 = (File) obj4;
                    if (lValueOf.longValue() > file5.length() * ((long) 2)) {
                        String str4 = fileExplorerActivity.f3390k0;
                        str4.getClass();
                        v7.e eVar6 = o7.m0.f8289a;
                        xVar4.f7025a = o7.c0.s(o7.c0.b(v7.d.f10885a), null, null, new b.m(file5, str4, vVar, fileExplorerActivity, (t6.c) null, 9), 3);
                    }
                } else if (fileExplorerActivity.f3389j0 != null) {
                    Context applicationContext2 = fileExplorerActivity.getApplicationContext();
                    applicationContext2.getClass();
                    Uri uri4 = fileExplorerActivity.f3389j0;
                    uri4.getClass();
                    try {
                        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor2 = applicationContext2.getContentResolver().openFileDescriptor(uri4, "r");
                        if (parcelFileDescriptorOpenFileDescriptor2 != null) {
                            StructStatVfs structStatVfsFstatvfs2 = Os.fstatvfs(parcelFileDescriptorOpenFileDescriptor2.getFileDescriptor());
                            usableSpace = structStatVfsFstatvfs2.f_bsize * structStatVfsFstatvfs2.f_bavail;
                            parcelFileDescriptorOpenFileDescriptor2.close();
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                    File file6 = (File) obj4;
                    if (usableSpace > file6.length() * ((long) 2)) {
                        Uri uri5 = fileExplorerActivity.f3389j0;
                        uri5.getClass();
                        v7.e eVar7 = o7.m0.f8289a;
                        xVar4.f7025a = o7.c0.s(o7.c0.b(v7.d.f10885a), null, null, new b.m(file6, uri5, vVar, fileExplorerActivity, (t6.c) null, 10), 3);
                    }
                }
                break;
        }
    }
}
