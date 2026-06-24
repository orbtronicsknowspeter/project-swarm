package androidx.room;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.widget.TextView;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import b2.t1;
import com.uptodown.UptodownApp;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.MyDownloads;
import com.uptodown.activities.preferences.PreferencesActivity;
import d7.l;
import d8.b1;
import d8.q0;
import e4.v0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p6.x;
import q2.i;
import x4.z2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f476b;

    public /* synthetic */ b(Object obj, int i) {
        this.f475a = i;
        this.f476b = obj;
    }

    @Override // d7.l
    public final Object invoke(Object obj) {
        int i = this.f475a;
        boolean z9 = true;
        x xVar = x.f8464a;
        Object obj2 = this.f476b;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                Context context = (Context) obj2;
                String str = ((z2) obj).f11483b;
                context.getClass();
                break;
            case 10:
                b8.f fVar = (b8.f) obj2;
                int iIntValue = ((Integer) obj).intValue();
                break;
            case 11:
                CorruptionException corruptionException = (CorruptionException) obj;
                corruptionException.getClass();
                Log.w("FirebaseSessions", "CorruptionException in session data DataStore", corruptionException);
                break;
            case 12:
                MainActivity mainActivity = (MainActivity) obj2;
                int i6 = MainActivity.G0;
                Intent intent = new Intent(mainActivity, (Class<?>) MyDownloads.class);
                float f = UptodownApp.I;
                mainActivity.startActivity(intent, b4.d.a(mainActivity));
                break;
            case 13:
                ArrayList arrayList = (ArrayList) obj2;
                x4.e eVar = (x4.e) obj;
                if (arrayList.isEmpty()) {
                    z9 = false;
                } else {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj3 = arrayList.get(i10);
                        i10++;
                        if (kotlin.jvm.internal.l.a(((v0) obj3).f4709a.f11124l, eVar.f11124l)) {
                        }
                    }
                    z9 = false;
                }
                break;
            case 14:
                PreferencesActivity preferencesActivity = (PreferencesActivity) obj2;
                int iIntValue2 = ((Integer) obj).intValue();
                int i11 = PreferencesActivity.T;
                String strValueOf = String.valueOf(iIntValue2);
                strValueOf.getClass();
                SharedPreferences sharedPreferences = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                sharedPreferences.getClass();
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString("notifications_frecuency", strValueOf);
                editorEdit.apply();
                ((TextView) preferencesActivity.z0().K.f1062l).setText(preferencesActivity.A0());
                break;
            case 15:
                q0 q0Var = (q0) obj2;
                int iIntValue3 = ((Integer) obj).intValue();
                break;
            case 16:
                i iVar = (i) obj2;
                MutablePreferences mutablePreferences = (MutablePreferences) obj;
                Preferences.Key key = i.f8675c;
                Iterator<Map.Entry<Preferences.Key<?>, Object>> it = mutablePreferences.asMap().entrySet().iterator();
                long j = 0;
                while (true) {
                    if (!it.hasNext()) {
                        if (j != 0) {
                            mutablePreferences.set(key, Long.valueOf(j));
                        } else {
                            mutablePreferences.remove(key);
                        }
                        break;
                    } else {
                        Map.Entry<Preferences.Key<?>, Object> next = it.next();
                        if (next.getValue() instanceof Set) {
                            Preferences.Key<?> key2 = next.getKey();
                            Set set = (Set) next.getValue();
                            String strD = iVar.d(System.currentTimeMillis());
                            if (set.contains(strD)) {
                                Object[] objArr = {strD};
                                HashSet hashSet = new HashSet(1);
                                Object obj4 = objArr[0];
                                Objects.requireNonNull(obj4);
                                if (!hashSet.add(obj4)) {
                                    c2.a.h(obj4, "duplicate element: ");
                                } else {
                                    mutablePreferences.set(key2, DesugarCollections.unmodifiableSet(hashSet));
                                    j++;
                                }
                            } else {
                                mutablePreferences.remove(key2);
                            }
                            break;
                        }
                    }
                }
                break;
            case 17:
                if (obj != ((q6.a) obj2)) {
                    break;
                }
                break;
            case 18:
                v3.e eVar2 = (v3.e) obj;
                eVar2.getClass();
                ((z3.g) eVar2).a((w3.a) obj2);
                break;
            default:
                b8.a aVar = (b8.a) obj;
                aVar.getClass();
                b8.a.a(aVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, b1.f3623b);
                b8.a.a(aVar, "value", t1.p("kotlinx.serialization.Polymorphic<" + ((kotlin.jvm.internal.f) ((z7.e) obj2).f11987a).c() + '>', b8.g.h, new b8.e[0]));
                break;
        }
        return xVar;
    }
}
