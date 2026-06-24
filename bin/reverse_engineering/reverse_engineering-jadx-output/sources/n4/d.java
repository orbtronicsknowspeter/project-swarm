package n4;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import android.system.StructStatVfs;
import androidx.documentfile.provider.DocumentFile;
import androidx.fragment.app.FragmentActivity;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    public static File a(Context context) {
        File externalStorageDirectory;
        context.getClass();
        h4.a aVar = new h4.a(context);
        if (aVar.d()) {
            File[] externalFilesDirs = context.getExternalFilesDirs(null);
            if (externalFilesDirs.length > 1) {
                externalStorageDirectory = externalFilesDirs[1];
            } else {
                File externalStorageDirectory2 = Environment.getExternalStorageDirectory();
                aVar.g();
                aVar.f();
                externalStorageDirectory = externalStorageDirectory2;
            }
        } else {
            externalStorageDirectory = Environment.getExternalStorageDirectory();
        }
        if (externalStorageDirectory == null) {
            return context.getExternalFilesDir(null);
        }
        File file = new File(externalStorageDirectory.getAbsolutePath() + "/" + context.getResources().getString(2131951718) + "/Backups");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static String b(Uri uri, FragmentActivity fragmentActivity) throws Throwable {
        Uri uri2;
        Throwable th;
        String string = null;
        try {
            try {
                uri2 = uri;
                try {
                    Cursor cursorQuery = fragmentActivity.getContentResolver().query(uri2, null, null, null, null);
                    if (cursorQuery != null) {
                        int columnIndex = cursorQuery.getColumnIndex("_display_name");
                        cursorQuery.moveToFirst();
                        string = cursorQuery.getString(columnIndex);
                        cursorQuery.close();
                    }
                    if (string == null && uri2.getPath() != null) {
                        String path = uri2.getPath();
                        path.getClass();
                        if (e(path)) {
                            return uri2.getLastPathSegment();
                        }
                    }
                    return string;
                } catch (Exception e10) {
                    e = e10;
                    e.printStackTrace();
                    if (string != null || uri2.getPath() == null) {
                        return string;
                    }
                    String path2 = uri2.getPath();
                    path2.getClass();
                    return e(path2) ? uri2.getLastPathSegment() : string;
                }
            } catch (Throwable th2) {
                th = th2;
                th = th;
                if (0 == 0 || uri.getPath() == null) {
                    throw th;
                }
                String path3 = uri.getPath();
                path3.getClass();
                if (!e(path3)) {
                    throw th;
                }
                uri.getLastPathSegment();
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            uri2 = uri;
        } catch (Throwable th3) {
            th = th3;
            th = th;
            if (0 == 0) {
                throw th;
            }
            throw th;
        }
    }

    public static long c(Context context, DocumentFile documentFile) {
        context.getClass();
        documentFile.getClass();
        Uri uri = documentFile.getUri();
        uri.getClass();
        long j = 0;
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                return 0L;
            }
            StructStatVfs structStatVfsFstatvfs = Os.fstatvfs(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            j = structStatVfsFstatvfs.f_bsize * structStatVfsFstatvfs.f_bavail;
            parcelFileDescriptorOpenFileDescriptor.close();
            return j;
        } catch (Exception e10) {
            e10.printStackTrace();
            return j;
        }
    }

    public static long d(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
    }

    public static boolean e(String str) {
        return l7.u.k0(str, ".apk", true) || l7.u.k0(str, ".xapk", true) || l7.u.k0(str, ".apks", true) || l7.u.k0(str, ".apkm", true) || l7.u.k0(str, ".zip", true);
    }
}
