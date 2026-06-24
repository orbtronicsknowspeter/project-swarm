package h4;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.UriPermission;
import android.net.Uri;
import androidx.documentfile.provider.DocumentFile;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import l7.m;
import n4.d;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5456a;

    public a(Context context) {
        context.getClass();
        this.f5456a = context;
    }

    public final Object a() {
        Uri uri;
        boolean zMatches;
        SharedPreferences sharedPreferences;
        Context context = this.f5456a;
        try {
            sharedPreferences = context.getSharedPreferences("CoreSettings", 0);
        } catch (Exception unused) {
        }
        String string = sharedPreferences.contains("outputdir") ? sharedPreferences.getString("outputdir", null) : null;
        if (string != null) {
            if (c("sdcard_as_backup_storage", false)) {
                context.getClass();
                List<UriPermission> persistedUriPermissions = context.getContentResolver().getPersistedUriPermissions();
                persistedUriPermissions.getClass();
                Iterator<UriPermission> it = persistedUriPermissions.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        uri = null;
                        break;
                    }
                    UriPermission next = it.next();
                    Uri uri2 = next.getUri();
                    uri2.getClass();
                    String path = uri2.getPath();
                    if (path != null) {
                        Pattern patternCompile = Pattern.compile(".*\\b[ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]]-[ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]]:.*");
                        patternCompile.getClass();
                        zMatches = patternCompile.matcher(path).matches();
                    } else {
                        zMatches = false;
                    }
                    if (zMatches) {
                        uri = next.getUri();
                        break;
                    }
                }
                if (uri != null) {
                    DocumentFile documentFileFromTreeUri = DocumentFile.fromTreeUri(context, uri);
                    if (documentFileFromTreeUri != null) {
                        for (String str : m.G0(string, new String[]{"/"})) {
                            DocumentFile documentFileFindFile = documentFileFromTreeUri.findFile(str);
                            if (documentFileFindFile == null) {
                                documentFileFromTreeUri = documentFileFromTreeUri.createDirectory(str);
                                if (documentFileFromTreeUri == null) {
                                    break;
                                }
                            } else {
                                documentFileFromTreeUri = documentFileFindFile;
                            }
                        }
                    }
                    if (documentFileFromTreeUri != null && documentFileFromTreeUri.exists()) {
                        return documentFileFromTreeUri;
                    }
                }
                f();
            }
            File file = new File(string);
            if (file.exists() || file.mkdirs()) {
                return file;
            }
        }
        File fileA = d.a(context);
        if (fileA == null) {
            return null;
        }
        h("outputdir", fileA.getAbsolutePath());
        return fileA;
    }

    public final String b() {
        SharedPreferences sharedPreferences;
        Context context = this.f5456a;
        try {
            sharedPreferences = context.getSharedPreferences("CoreSettings", 0);
        } catch (Exception unused) {
        }
        String string = sharedPreferences.contains("outputdir") ? sharedPreferences.getString("outputdir", null) : null;
        if (string != null) {
            return string;
        }
        File fileA = d.a(context);
        if (fileA == null) {
            return null;
        }
        String absolutePath = fileA.getAbsolutePath();
        h("outputdir", absolutePath);
        return absolutePath;
    }

    public final boolean c(String str, boolean z9) {
        try {
            SharedPreferences sharedPreferences = this.f5456a.getSharedPreferences("CoreSettings", 0);
            if (sharedPreferences.contains(str)) {
                return sharedPreferences.getBoolean(str, z9);
            }
        } catch (Exception unused) {
        }
        return z9;
    }

    public final boolean d() {
        return c("storage_sdcard", false);
    }

    public final void e(String str, boolean z9) {
        try {
            SharedPreferences.Editor editorEdit = this.f5456a.getSharedPreferences("CoreSettings", 0).edit();
            editorEdit.putBoolean(str, z9);
            editorEdit.apply();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void f() {
        e("sdcard_as_backup_storage", false);
    }

    public final void g() {
        e("storage_sdcard", false);
    }

    public final void h(String str, String str2) {
        try {
            SharedPreferences.Editor editorEdit = this.f5456a.getSharedPreferences("CoreSettings", 0).edit();
            editorEdit.putString(str, str2);
            editorEdit.apply();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void i(boolean z9) {
        e("user_asked_for_show_permissions", z9);
    }
}
