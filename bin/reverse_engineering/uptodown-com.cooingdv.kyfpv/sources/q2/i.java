package q2;

import android.content.Context;
import android.os.Build;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import d7.l;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import o7.c0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Preferences.Key f8674b = PreferencesKeys.longKey("fire-global");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Preferences.Key f8675c = PreferencesKeys.longKey("fire-count");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Preferences.Key f8676d = PreferencesKeys.stringKey("last-used-date");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2.f f8677a;

    public i(Context context, String str) {
        this.f8677a = new i2.f(context, "FirebaseHeartBeat".concat(str));
    }

    public final synchronized long a(MutablePreferences mutablePreferences) {
        long j;
        try {
            long jLongValue = ((Long) i2.g.a(mutablePreferences, f8675c, 0L)).longValue();
            String name = "";
            Set hashSet = new HashSet();
            String str = null;
            for (Map.Entry<Preferences.Key<?>, Object> entry : mutablePreferences.asMap().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set<String> set = (Set) entry.getValue();
                    for (String str2 : set) {
                        if (str == null || str.compareTo(str2) > 0) {
                            name = entry.getKey().getName();
                            hashSet = set;
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet2.remove(str);
            mutablePreferences.set(PreferencesKeys.stringSetKey(name), hashSet2);
            j = jLongValue - 1;
            mutablePreferences.set(f8675c, Long.valueOf(j));
        } catch (Throwable th) {
            throw th;
        }
        return j;
    }

    public final synchronized void b() {
        this.f8677a.a(new androidx.room.b(this, 16));
    }

    public final synchronized ArrayList c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            String strD = d(System.currentTimeMillis());
            i2.f fVar = this.f8677a;
            fVar.getClass();
            for (Map.Entry entry : ((Map) c0.w(t6.i.f10315a, new i2.b(fVar, null))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strD);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new a(((Preferences.Key) entry.getKey()).getName(), new ArrayList(hashSet)));
                    }
                }
            }
            l(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String d(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    public final synchronized Preferences.Key e(MutablePreferences mutablePreferences, String str) {
        for (Map.Entry<Preferences.Key<?>, Object> entry : mutablePreferences.asMap().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return PreferencesKeys.stringSetKey(entry.getKey().getName());
                    }
                }
            }
        }
        return null;
    }

    public final synchronized boolean f(long j, long j6) {
        return d(j).equals(d(j6));
    }

    public final synchronized void g() {
        this.f8677a.a(new androidx.work.impl.model.a(10, this, d(System.currentTimeMillis())));
    }

    public final synchronized void h(MutablePreferences mutablePreferences, String str) {
        try {
            Preferences.Key keyE = e(mutablePreferences, str);
            if (keyE == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) i2.g.a(mutablePreferences, keyE, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                mutablePreferences.remove(keyE);
            } else {
                mutablePreferences.set(keyE, hashSet);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean i(long j) {
        return j(f8674b, j);
    }

    public final synchronized boolean j(Preferences.Key key, long j) {
        i2.f fVar = this.f8677a;
        fVar.getClass();
        key.getClass();
        i2.c cVar = new i2.c(fVar, key, null);
        t6.i iVar = t6.i.f10315a;
        if (f(((Long) c0.w(iVar, cVar)).longValue(), j)) {
            return false;
        }
        i2.f fVar2 = this.f8677a;
        Long lValueOf = Long.valueOf(j);
        fVar2.getClass();
        return true;
    }

    public final synchronized void k(long j, final String str) {
        final String strD = d(j);
        final Preferences.Key<Set<String>> keyStringSetKey = PreferencesKeys.stringSetKey(str);
        this.f8677a.a(new l() { // from class: q2.h
            @Override // d7.l
            public final Object invoke(Object obj) {
                i iVar = this.f8670a;
                String str2 = strD;
                String str3 = str;
                Preferences.Key key = keyStringSetKey;
                MutablePreferences mutablePreferences = (MutablePreferences) obj;
                iVar.getClass();
                Preferences.Key key2 = i.f8676d;
                if (((String) i2.g.a(mutablePreferences, key2, "")).equals(str2)) {
                    Preferences.Key keyE = iVar.e(mutablePreferences, str2);
                    if (keyE == null || keyE.getName().equals(str3)) {
                        return null;
                    }
                    synchronized (iVar) {
                        iVar.h(mutablePreferences, str2);
                        HashSet hashSet = new HashSet((Collection) i2.g.a(mutablePreferences, key, new HashSet()));
                        hashSet.add(str2);
                        mutablePreferences.set(key, hashSet);
                    }
                    return null;
                }
                Preferences.Key key3 = i.f8675c;
                long jLongValue = ((Long) i2.g.a(mutablePreferences, key3, 0L)).longValue();
                if (jLongValue + 1 == 30) {
                    jLongValue = iVar.a(mutablePreferences);
                }
                HashSet hashSet2 = new HashSet((Collection) i2.g.a(mutablePreferences, key, new HashSet()));
                hashSet2.add(str2);
                mutablePreferences.set(key, hashSet2);
                mutablePreferences.set(key3, Long.valueOf(jLongValue + 1));
                mutablePreferences.set(key2, str2);
                return null;
            }
        });
    }

    public final synchronized void l(long j) {
        this.f8677a.a(new androidx.room.support.c(3, j));
    }
}
