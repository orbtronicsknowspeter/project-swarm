package com.google.gson.internal.sql;

import com.google.gson.e;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
final class SqlDateTypeAdapter extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f3255b = new j() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // com.google.gson.j
        public final i a(com.google.gson.b bVar, TypeToken typeToken) {
            if (typeToken.f3266a == Date.class) {
                return new SqlDateTypeAdapter(0);
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f3256a;

    private SqlDateTypeAdapter() {
        this.f3256a = new SimpleDateFormat("MMM d, yyyy");
    }

    @Override // com.google.gson.i
    public final Object b(k3.a aVar) throws IOException {
        Date date;
        if (aVar.H() == 9) {
            aVar.D();
            return null;
        }
        String strF = aVar.F();
        synchronized (this) {
            TimeZone timeZone = this.f3256a.getTimeZone();
            try {
                try {
                    date = new Date(this.f3256a.parse(strF).getTime());
                } catch (ParseException e10) {
                    throw new e("Failed parsing '" + strF + "' as SQL Date; at path " + aVar.j(true), e10);
                }
            } finally {
                this.f3256a.setTimeZone(timeZone);
            }
        }
        return date;
    }

    @Override // com.google.gson.i
    public final void c(k3.b bVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            bVar.n();
            return;
        }
        synchronized (this) {
            str = this.f3256a.format((java.util.Date) date);
        }
        bVar.C(str);
    }

    public /* synthetic */ SqlDateTypeAdapter(int i) {
        this();
    }
}
