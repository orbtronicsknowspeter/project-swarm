package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import android.text.Html;
import android.text.SpannableString;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile k1.b f2668a;

    public static SpannableString a(String str) {
        return Build.VERSION.SDK_INT >= 24 ? new SpannableString(Html.fromHtml(str, 0)) : new SpannableString(Html.fromHtml(str));
    }

    public static n4.a b(Context context, Locale locale) {
        Context contextCreateConfigurationContext;
        context.getClass();
        Configuration configuration = context.getResources().getConfiguration();
        if (Build.VERSION.SDK_INT >= 24) {
            configuration.setLocale(locale);
            LocaleList localeList = new LocaleList(locale);
            LocaleList.setDefault(localeList);
            configuration.setLocales(localeList);
            contextCreateConfigurationContext = context.createConfigurationContext(configuration);
            contextCreateConfigurationContext.getClass();
        } else {
            configuration.setLocale(locale);
            contextCreateConfigurationContext = context.createConfigurationContext(configuration);
            contextCreateConfigurationContext.getClass();
        }
        return new n4.a(contextCreateConfigurationContext);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036 A[Catch: all -> 0x0022, TryCatch #2 {all -> 0x0022, all -> 0x0072, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0019, B:20:0x0036, B:76:0x017a, B:15:0x0025, B:17:0x002d, B:21:0x003a, B:23:0x0040, B:25:0x0046, B:27:0x004e, B:75:0x0176, B:77:0x017d, B:78:0x0180, B:79:0x0181, B:28:0x0052, B:30:0x0056, B:31:0x0063, B:33:0x0069, B:39:0x007f, B:41:0x0085, B:42:0x0091, B:62:0x015a, B:63:0x015d, B:71:0x016d, B:70:0x016a, B:72:0x016e, B:73:0x0173, B:74:0x0174, B:34:0x006f, B:38:0x0076), top: B:87:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static k1.b c(android.content.Context r16) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.j4.c(android.content.Context):k1.b");
    }
}
