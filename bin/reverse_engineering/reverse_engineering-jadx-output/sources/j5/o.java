package j5;

import a4.x;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import androidx.core.app.NotificationCompat;
import androidx.core.app.TaskStackBuilder;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.google.android.gms.internal.measurement.i5;
import com.google.android.material.card.MaterialCardViewHelper;
import com.uptodown.activities.AppDetailActivity;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.MyDownloads;
import com.uptodown.core.activities.ConfirmDeleteActivity;
import com.uptodown.receivers.DownloadNotificationReceiver;
import e1.c0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.a0;
import r7.o0;
import x4.x1;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class o {
    public static boolean a(Context context) {
        SharedPreferences sharedPreferences;
        context.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            if (ContextCompat.checkSelfPermission(context, "android.permission.POST_NOTIFICATIONS") == 0) {
                try {
                    sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
                } catch (Exception unused) {
                }
                boolean z9 = sharedPreferences.contains("recibir_notificaciones") ? sharedPreferences.getBoolean("recibir_notificaciones", true) : true;
                if (z9) {
                }
            }
            return false;
        }
        try {
            SharedPreferences sharedPreferences2 = context.getSharedPreferences("SettingsPreferences", 0);
            if (sharedPreferences2.contains("recibir_notificaciones")) {
                return sharedPreferences2.getBoolean("recibir_notificaciones", true);
            }
        } catch (Exception unused2) {
        }
        return true;
    }

    public static void b(Context context, int i) {
        String groupKey;
        if (Build.VERSION.SDK_INT < 24 || i <= 0) {
            return;
        }
        Object systemService = context.getSystemService("notification");
        systemService.getClass();
        NotificationManager notificationManager = (NotificationManager) systemService;
        StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
        kotlin.jvm.internal.b bVarD = a0.d(activeNotifications);
        while (true) {
            if (!bVarD.hasNext()) {
                groupKey = null;
                break;
            }
            StatusBarNotification statusBarNotification = (StatusBarNotification) bVarD.next();
            if (i == statusBarNotification.getId()) {
                groupKey = statusBarNotification.getGroupKey();
                break;
            }
        }
        if (groupKey == null) {
            return;
        }
        int i6 = 0;
        while (true) {
            if (!(i6 < activeNotifications.length)) {
                notificationManager.cancel(i);
                return;
            }
            int i10 = i6 + 1;
            try {
                StatusBarNotification statusBarNotification2 = activeNotifications[i6];
                if (i != statusBarNotification2.getId() && kotlin.jvm.internal.l.a(statusBarNotification2.getGroupKey(), groupKey)) {
                    return;
                } else {
                    i6 = i10;
                }
            } catch (ArrayIndexOutOfBoundsException e10) {
                androidx.privacysandbox.ads.adservices.customaudience.a.s(e10.getMessage());
                return;
            }
        }
    }

    public static void c(Context context) {
        Intent intent;
        String string;
        int i;
        context.getClass();
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "CHANNEL_ID_UPTODOWN");
        x4.r rVarB = a5.b.b();
        if (rVarB != null) {
            g gVarL = g.D.l(context);
            gVarL.b();
            ArrayList arrayListP = gVarL.P();
            gVarL.c();
            Iterator it = arrayListP.iterator();
            it.getClass();
            int i6 = 0;
            int i10 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                x4.r rVar = (x4.r) next;
                if (rVar.p()) {
                    if (rVar.i() == 0) {
                        i10++;
                    } else {
                        o0 o0Var = a5.b.f193a;
                        if (a5.b.c(rVar.f11361q)) {
                            i6++;
                        }
                    }
                }
            }
            int i11 = i6 + i10;
            String str = rVarB.f11366w;
            String str2 = (str == null || str.length() == 0) ? rVarB.f11355b : rVarB.f11366w;
            String string2 = context.getResources().getString(2131952402);
            int i12 = rVarB.i();
            String string3 = context.getResources().getString(2131952466);
            StringBuilder sb = new StringBuilder();
            sb.append(string2);
            sb.append(" ");
            sb.append(str2);
            sb.append(" (");
            sb.append(i12);
            String strN = x.n(sb, string3, ")");
            String strK = x.k(i5.H(context, rVarB.j()), "/", i5.H(context, rVarB.k()));
            int i13 = rVarB.i();
            builder.setOnlyAlertOnce(true);
            builder.setSmallIcon(2131231477);
            builder.setAutoCancel(false);
            builder.setOngoing(true);
            builder.setProgress(100, i13, false);
            NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();
            inboxStyle.addLine(strK);
            if (i10 > 0) {
                String string4 = context.getString(2131952508);
                string4.getClass();
                inboxStyle.addLine(String.format(string4, Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, 1)));
                Intent intent2 = new Intent(context, (Class<?>) DownloadNotificationReceiver.class);
                intent2.setAction("CANCEL_ALL");
                intent2.putExtra("download", rVarB);
                intent2.putExtra("notificationID", 261);
                builder.addAction(2131230928, context.getString(2131951942), PendingIntent.getBroadcast(context, 0, intent2, h()));
            }
            builder.setStyle(inboxStyle);
            builder.setContentTitle(strN);
            Intent intent3 = new Intent(context, (Class<?>) MyDownloads.class);
            TaskStackBuilder taskStackBuilderCreate = TaskStackBuilder.create(context);
            taskStackBuilderCreate.getClass();
            taskStackBuilderCreate.addParentStack(MyDownloads.class);
            taskStackBuilderCreate.addNextIntent(intent3);
            builder.setContentIntent(taskStackBuilderCreate.getPendingIntent(0, h()));
            if (a5.b.d()) {
                intent = new Intent(context, (Class<?>) DownloadNotificationReceiver.class);
                intent.setAction("RESUME");
                string = context.getString(2131952713);
                string.getClass();
                i = 2131231411;
            } else {
                intent = new Intent(context, (Class<?>) DownloadNotificationReceiver.class);
                intent.setAction("PAUSE");
                string = context.getString(2131951655);
                string.getClass();
                i = 2131231405;
            }
            builder.addAction(i, string, PendingIntent.getBroadcast(context, 0, intent, h()));
            Intent intent4 = new Intent(context, (Class<?>) DownloadNotificationReceiver.class);
            intent4.setAction("CANCEL");
            intent4.putExtra("download", rVarB);
            intent4.putExtra("notificationID", 261);
            builder.addAction(2131230928, context.getString(2131952425), PendingIntent.getBroadcast(context, 0, intent4, h()));
        } else {
            builder.setOnlyAlertOnce(true);
            builder.setSmallIcon(2131231477);
            builder.setAutoCancel(false);
            builder.setOngoing(true);
            String string5 = context.getString(2131952494);
            string5.getClass();
            builder.setContentTitle(string5);
        }
        Object systemService = context.getSystemService("notification");
        systemService.getClass();
        ((NotificationManager) systemService).notify(261, builder.build());
    }

    public static void d(Context context, File file, boolean z9, int i) {
        Uri uriFromFile;
        ApplicationInfo applicationInfo;
        boolean z10;
        String str;
        Drawable drawableLoadIcon;
        SharedPreferences sharedPreferences;
        context.getClass();
        if (a(context)) {
            try {
                sharedPreferences = context.getSharedPreferences("CoreSettings", 0);
            } catch (Exception unused) {
            }
            boolean z11 = sharedPreferences.contains("search_apk_worker_active") ? sharedPreferences.getBoolean("search_apk_worker_active", true) : true;
            if (z11) {
                int i6 = i + 260;
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setPackage(context.getPackageName());
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 24) {
                    uriFromFile = FileProvider.getUriForFile(context, context.getPackageName() + ".provider", file);
                    uriFromFile.getClass();
                } else {
                    uriFromFile = Uri.fromFile(file);
                    uriFromFile.getClass();
                }
                intent.setDataAndType(uriFromFile, "application/vnd.android.package-archive");
                intent.putExtra("notificationId", i6);
                PendingIntent activity = PendingIntent.getActivity(context, 0, intent, i10 >= 31 ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 0);
                NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "CHANNEL_ID_UPTODOWN");
                builder.setSmallIcon(2131231477);
                String name = file.getName();
                name.getClass();
                int i11 = 128;
                if (l7.u.k0(name, ".apk", false)) {
                    try {
                        PackageManager packageManager = context.getPackageManager();
                        packageManager.getClass();
                        String absolutePath = file.getAbsolutePath();
                        absolutePath.getClass();
                        PackageInfo packageInfoD = n4.i.d(packageManager, absolutePath, 128);
                        if (packageInfoD != null && (applicationInfo = packageInfoD.applicationInfo) != null) {
                            Drawable drawableLoadIcon2 = applicationInfo.loadIcon(context.getPackageManager());
                            drawableLoadIcon2.getClass();
                            builder.setLargeIcon(f(drawableLoadIcon2));
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                } else {
                    String name2 = file.getName();
                    name2.getClass();
                    if (l7.u.k0(name2, ".xapk", true) || l7.u.k0(name2, ".apks", true) || l7.u.k0(name2, ".apkm", true) || l7.u.k0(name2, ".zip", true)) {
                        Drawable drawable = (Drawable) n4.m.f7985a.get(file.getName());
                        if (drawable == null) {
                            File file2 = new File(context.getExternalFilesDir(null), "tmp");
                            if (!file2.exists()) {
                                file2.mkdirs();
                            }
                            String name3 = file.getName();
                            name3.getClass();
                            String name4 = file.getName();
                            name4.getClass();
                            File file3 = new File(file2, name3.substring(0, l7.m.A0(".", name4, 6)));
                            if (!file3.exists()) {
                                file3.mkdirs();
                            }
                            if (c0.u(file, file3)) {
                                File[] fileArrListFiles = file3.listFiles();
                                if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                                    int i12 = 0;
                                    while (i12 < fileArrListFiles.length) {
                                        int i13 = i12 + 1;
                                        try {
                                            File file4 = fileArrListFiles[i12];
                                            String absolutePath2 = file4.getAbsolutePath();
                                            absolutePath2.getClass();
                                            PackageManager packageManager2 = context.getPackageManager();
                                            packageManager2.getClass();
                                            PackageInfo packageInfoD2 = n4.i.d(packageManager2, absolutePath2, i11);
                                            if ((packageInfoD2 != null ? packageInfoD2.applicationInfo : null) != null) {
                                                ApplicationInfo applicationInfo2 = packageInfoD2.applicationInfo;
                                                applicationInfo2.getClass();
                                                applicationInfo2.sourceDir = absolutePath2;
                                                ApplicationInfo applicationInfo3 = packageInfoD2.applicationInfo;
                                                applicationInfo3.getClass();
                                                applicationInfo3.publicSourceDir = absolutePath2;
                                                ApplicationInfo applicationInfo4 = packageInfoD2.applicationInfo;
                                                applicationInfo4.getClass();
                                                drawableLoadIcon = applicationInfo4.loadIcon(context.getPackageManager());
                                            } else {
                                                drawableLoadIcon = null;
                                            }
                                            n4.m.f7985a.put(file.getName(), drawableLoadIcon);
                                            try {
                                                file4.delete();
                                            } catch (Exception e11) {
                                                e11.printStackTrace();
                                            }
                                            drawable = drawableLoadIcon;
                                            i12 = i13;
                                            i11 = 128;
                                        } catch (ArrayIndexOutOfBoundsException e12) {
                                            androidx.privacysandbox.ads.adservices.customaudience.a.s(e12.getMessage());
                                            return;
                                        }
                                    }
                                }
                                if (file3.exists()) {
                                    i5.l(file3);
                                }
                            }
                        }
                        if (drawable != null) {
                            builder.setLargeIcon(f(drawable));
                        }
                    }
                }
                String name5 = file.getName();
                builder.setContentTitle(name5);
                if (z9) {
                    String string = context.getString(2131952400);
                    string.getClass();
                    String absolutePath3 = file.getAbsolutePath();
                    absolutePath3.getClass();
                    String absolutePath4 = file.getAbsolutePath();
                    absolutePath4.getClass();
                    str = String.format(string, Arrays.copyOf(new Object[]{absolutePath3.substring(0, l7.m.A0("/", absolutePath4, 6))}, 1));
                    z10 = true;
                } else {
                    String string2 = context.getString(2131952401);
                    string2.getClass();
                    String absolutePath5 = file.getAbsolutePath();
                    absolutePath5.getClass();
                    String absolutePath6 = file.getAbsolutePath();
                    absolutePath6.getClass();
                    String strSubstring = absolutePath5.substring(0, l7.m.A0("/", absolutePath6, 6));
                    z10 = true;
                    str = String.format(string2, Arrays.copyOf(new Object[]{strSubstring}, 1));
                }
                builder.setStyle(new NotificationCompat.BigTextStyle().bigText(str));
                builder.setContentText(str);
                builder.setAutoCancel(z10);
                builder.setGroup("com.uptodown.INSTALLABLE_FOUND");
                Intent intent2 = new Intent(context, (Class<?>) ConfirmDeleteActivity.class);
                intent2.putExtra("realPath", file.getAbsolutePath());
                intent2.putExtra("notificationId", i6);
                PendingIntent activity2 = PendingIntent.getActivity(context, i6, intent2, h());
                StringBuilder sb = new StringBuilder();
                if (z9) {
                    builder.addAction(2131231486, context.getString(2131952428), activity);
                    builder.setContentIntent(activity);
                    sb.append("install;");
                }
                builder.addAction(2131230928, context.getString(2131952426), activity2);
                sb.append("delete");
                Object systemService = context.getSystemService("notification");
                systemService.getClass();
                NotificationManager notificationManager = (NotificationManager) systemService;
                if (Build.VERSION.SDK_INT >= 24) {
                    NotificationCompat.Builder groupSummary = new NotificationCompat.Builder(context, "CHANNEL_ID_UPTODOWN").setContentTitle(str).setSmallIcon(2131231477).setGroup("com.uptodown.INSTALLABLE_FOUND").setAutoCancel(true).setGroupSummary(true);
                    groupSummary.getClass();
                    notificationManager.notify(5, groupSummary.build());
                }
                notificationManager.notify(i6, builder.build());
                k(name5, String.valueOf(System.currentTimeMillis()), str, sb.toString(), file.getAbsolutePath(), context);
            }
        }
    }

    public static void e(Context context, x4.g gVar, int i, Bitmap bitmap, x1 x1Var) {
        Cursor cursorQuery;
        x1 x1Var2;
        context.getClass();
        x1Var.getClass();
        if (a(context)) {
            int i6 = i + 500;
            Intent intent = new Intent(context, (Class<?>) AppDetailActivity.class);
            intent.putExtra("appInfo", gVar);
            PendingIntent activity = PendingIntent.getActivity(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 0);
            NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "CHANNEL_ID_UPTODOWN");
            builder.setSmallIcon(2131231477);
            builder.setContentIntent(activity);
            String string = context.getString(2131952408);
            string.getClass();
            String str = String.format(string, Arrays.copyOf(new Object[]{gVar.f11159b, context.getString(2131951718)}, 2));
            if (bitmap != null) {
                builder.setLargeIcon(bitmap);
            }
            builder.setContentIntent(activity);
            builder.setStyle(new NotificationCompat.BigTextStyle().bigText(str));
            builder.setContentText(str);
            builder.setAutoCancel(true);
            builder.setGroup("com.uptodown.PREREGISTER");
            Object systemService = context.getSystemService("notification");
            systemService.getClass();
            ((NotificationManager) systemService).notify(i6, builder.build());
            k(null, String.valueOf(System.currentTimeMillis()), str, "preregister", String.valueOf(gVar.f11158a), context);
            new android.support.v4.media.g(context, 20).E(k0.k.e(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "notification_shown"), "preregister");
        } else {
            g gVarL = g.D.l(context);
            gVarL.b();
            try {
                String[] strArr = {String.valueOf(x1Var.f11448a)};
                SQLiteDatabase sQLiteDatabase = gVarL.f6673a;
                sQLiteDatabase.getClass();
                cursorQuery = sQLiteDatabase.query("preregistrations_to_notify", gVarL.f6684u, "appId=?", strArr, null, null, null);
            } catch (Exception e10) {
                e = e10;
                cursorQuery = null;
            }
            try {
                if (cursorQuery.moveToFirst()) {
                    x1Var2 = new x1();
                    x1Var2.f11448a = cursorQuery.getLong(0);
                    x1Var2.f11452e = cursorQuery.getInt(1);
                } else {
                    x1Var2 = null;
                }
                cursorQuery.close();
            } catch (Exception e11) {
                e = e11;
                e.printStackTrace();
                if (cursorQuery != null && !cursorQuery.isClosed()) {
                    cursorQuery.close();
                }
                x1Var2 = null;
            }
            if (x1Var2 == null) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("appId", Long.valueOf(x1Var.f11448a));
                SQLiteDatabase sQLiteDatabase2 = gVarL.f6673a;
                sQLiteDatabase2.getClass();
                sQLiteDatabase2.insert("preregistrations_to_notify", null, contentValues);
            }
            gVarL.c();
        }
        x1Var.b(context);
    }

    public static Bitmap f(Drawable drawable) {
        Bitmap bitmapCreateBitmap;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                Bitmap bitmap = bitmapDrawable.getBitmap();
                bitmap.getClass();
                return bitmap;
            }
        }
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.getClass();
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.getClass();
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static int g(Context context) {
        int i;
        g gVarL = g.D.l(context);
        gVarL.b();
        int i6 = 0;
        Cursor cursorQuery = null;
        try {
            SQLiteDatabase sQLiteDatabase = gVarL.f6673a;
            sQLiteDatabase.getClass();
            cursorQuery = sQLiteDatabase.query("active_notifications", new String[]{"notificationId"}, null, null, null, null, null);
            if (cursorQuery.moveToFirst()) {
                int i10 = cursorQuery.getInt(0);
                loop0: while (true) {
                    i = i10;
                    while (cursorQuery.moveToNext()) {
                        try {
                            i10 = cursorQuery.getInt(0);
                            if (i10 > i) {
                                break;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            i6 = i;
                            e.printStackTrace();
                            if (cursorQuery != null && !cursorQuery.isClosed()) {
                                cursorQuery.close();
                            }
                        }
                    }
                }
                i6 = i;
            }
            cursorQuery.close();
        } catch (Exception e11) {
            e = e11;
        }
        gVarL.c();
        return i6 == 0 ? MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION : i6 + 1;
    }

    public static int h() {
        return Build.VERSION.SDK_INT >= 31 ? 201326592 : 134217728;
    }

    public static void i(Context context, x4.r rVar, String str) {
        String strC;
        SharedPreferences sharedPreferences;
        context.getClass();
        if (a(context)) {
            try {
                sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
            } catch (Exception unused) {
            }
            boolean z9 = sharedPreferences.contains("download_notification") ? sharedPreferences.getBoolean("download_notification", true) : true;
            if (z9) {
                String str2 = null;
                String str3 = rVar != null ? rVar.f11366w : null;
                if (str3 == null || str3.length() == 0) {
                    String str4 = rVar != null ? rVar.f11355b : null;
                    if (str4 != null && str4.length() != 0) {
                        rVar.getClass();
                        str2 = rVar.f11355b;
                        str2.getClass();
                    }
                } else {
                    rVar.getClass();
                    str2 = rVar.f11366w;
                    str2.getClass();
                }
                String str5 = str2;
                if (str.length() == 0) {
                    strC = context.getString(2131951915);
                    strC.getClass();
                } else {
                    strC = x.C(context.getString(2131951915), str);
                }
                Object systemService = context.getSystemService("notification");
                systemService.getClass();
                NotificationManager notificationManager = (NotificationManager) systemService;
                NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "CHANNEL_ID_UPTODOWN");
                builder.setSmallIcon(2131231477);
                if (str5 != null && str5.length() != 0) {
                    builder.setContentTitle(str5);
                }
                builder.setStyle(new NotificationCompat.BigTextStyle().bigText(strC));
                builder.setContentText(strC);
                builder.setAutoCancel(true);
                Intent intent = new Intent(context, (Class<?>) MainActivity.class);
                TaskStackBuilder taskStackBuilderCreate = TaskStackBuilder.create(context);
                taskStackBuilderCreate.getClass();
                taskStackBuilderCreate.addParentStack(MainActivity.class);
                taskStackBuilderCreate.addNextIntent(intent);
                builder.setContentIntent(taskStackBuilderCreate.getPendingIntent(0, h()));
                Intent intent2 = new Intent(context, (Class<?>) MyDownloads.class);
                TaskStackBuilder taskStackBuilderCreate2 = TaskStackBuilder.create(context);
                taskStackBuilderCreate2.getClass();
                taskStackBuilderCreate2.addParentStack(MyDownloads.class);
                taskStackBuilderCreate2.addNextIntent(intent2);
                builder.setContentIntent(taskStackBuilderCreate2.getPendingIntent(0, h()));
                notificationManager.notify(257, builder.build());
                k(str5, String.valueOf(System.currentTimeMillis()), str, null, null, context);
            }
        }
    }

    public static void j(Context context, Uri uri) {
        context.getClass();
        String string = context.getString(2131951718);
        string.getClass();
        String string2 = context.getString(2131952403);
        string2.getClass();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage(context.getPackageName());
        intent.setDataAndType(uri, "application/vnd.android.package-archive");
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, h());
        Object systemService = context.getSystemService("notification");
        systemService.getClass();
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "CHANNEL_ID_UPTODOWN");
        builder.setSmallIcon(2131231477);
        builder.setContentTitle(string);
        builder.setStyle(new NotificationCompat.BigTextStyle().bigText(string2));
        builder.setContentText(string2);
        builder.setAutoCancel(true);
        builder.setContentIntent(activity);
        ((NotificationManager) systemService).notify(259, builder.build());
        k(string, String.valueOf(System.currentTimeMillis()), string2, "update_uptodown", uri.getPath(), context);
    }

    public static void k(String str, String str2, String str3, String str4, String str5, Context context) {
        int i;
        Cursor cursorRawQuery;
        int i6;
        context.getClass();
        g gVarL = g.D.l(context);
        gVarL.b();
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", str2);
        contentValues.put("title", str);
        contentValues.put(NotificationCompat.CATEGORY_MESSAGE, str3);
        contentValues.put("actions", str4);
        contentValues.put("extra_info", str5);
        SQLiteDatabase sQLiteDatabase = gVarL.f6673a;
        sQLiteDatabase.getClass();
        Cursor cursorRawQuery2 = null;
        sQLiteDatabase.insert("notifications", null, contentValues);
        try {
            SQLiteDatabase sQLiteDatabase2 = gVarL.f6673a;
            sQLiteDatabase2.getClass();
            cursorRawQuery = sQLiteDatabase2.rawQuery("SELECT COUNT(id) AS count FROM notifications", null);
            try {
                i6 = cursorRawQuery.moveToFirst() ? cursorRawQuery.getInt(0) : 0;
            } catch (Exception e10) {
                e = e10;
                i = 0;
            }
        } catch (Exception e11) {
            e = e11;
            i = 0;
            cursorRawQuery = null;
        }
        try {
            cursorRawQuery.close();
        } catch (Exception e12) {
            i = i6;
            e = e12;
            e.printStackTrace();
            if (cursorRawQuery != null && !cursorRawQuery.isClosed()) {
                cursorRawQuery.close();
            }
            i6 = i;
        }
        if (i6 > 100) {
            try {
                SQLiteDatabase sQLiteDatabase3 = gVarL.f6673a;
                sQLiteDatabase3.getClass();
                cursorRawQuery2 = sQLiteDatabase3.rawQuery("SELECT id FROM notifications ORDER BY id DESC LIMIT 100,1", null);
                i = cursorRawQuery2.moveToFirst() ? cursorRawQuery2.getInt(0) : 0;
                cursorRawQuery2.close();
            } catch (Exception e13) {
                e13.printStackTrace();
                if (cursorRawQuery2 != null && !cursorRawQuery2.isClosed()) {
                    cursorRawQuery2.close();
                }
            }
            if (i > 0) {
                String[] strArr = {String.valueOf(i)};
                SQLiteDatabase sQLiteDatabase4 = gVarL.f6673a;
                sQLiteDatabase4.getClass();
                sQLiteDatabase4.delete("notifications", "id<=?", strArr);
            }
        }
        gVarL.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0067 A[PHI: r3
      0x0067: PHI (r3v1 long) = (r3v0 long), (r3v19 long) binds: [B:27:0x0056, B:32:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void l(android.content.Context r22) {
        /*
            Method dump skipped, instruction units count: 765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.o.l(android.content.Context):void");
    }
}
