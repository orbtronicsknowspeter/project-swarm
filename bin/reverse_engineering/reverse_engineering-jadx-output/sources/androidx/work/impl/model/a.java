package androidx.work.impl.model;

import android.content.SharedPreferences;
import android.widget.TextView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.sqlite.SQLiteConnection;
import androidx.work.Data;
import androidx.work.WorkInfo;
import b5.m;
import com.uptodown.activities.preferences.PreferencesActivity;
import d7.l;
import p6.x;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f599b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f600l;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.f598a = i;
        this.f599b = obj;
        this.f600l = obj2;
    }

    @Override // d7.l
    public final Object invoke(Object obj) {
        int i = this.f598a;
        x xVar = x.f8463a;
        Object obj2 = this.f600l;
        Object obj3 = this.f599b;
        switch (i) {
            case 0:
                return DependencyDao_Impl.insertDependency$lambda$0((DependencyDao_Impl) obj3, (Dependency) obj2, (SQLiteConnection) obj);
            case 1:
                return PreferenceDao_Impl.insertPreference$lambda$0((PreferenceDao_Impl) obj3, (Preference) obj2, (SQLiteConnection) obj);
            case 2:
                return SystemIdInfoDao_Impl.insertSystemIdInfo$lambda$0((SystemIdInfoDao_Impl) obj3, (SystemIdInfo) obj2, (SQLiteConnection) obj);
            case 3:
                return WorkNameDao_Impl.insert$lambda$0((WorkNameDao_Impl) obj3, (WorkName) obj2, (SQLiteConnection) obj);
            case 4:
                return WorkProgressDao_Impl.insert$lambda$0((WorkProgressDao_Impl) obj3, (WorkProgress) obj2, (SQLiteConnection) obj);
            case 5:
                return WorkSpecDao_Impl.setOutput$lambda$41("UPDATE workspec SET output=? WHERE id=?", (Data) obj3, (String) obj2, (SQLiteConnection) obj);
            case 6:
                return Integer.valueOf(WorkSpecDao_Impl.setState$lambda$38("UPDATE workspec SET state=? WHERE id=?", (WorkInfo.State) obj3, (String) obj2, (SQLiteConnection) obj));
            case 7:
                return WorkTagDao_Impl.insert$lambda$0((WorkTagDao_Impl) obj3, (WorkTag) obj2, (SQLiteConnection) obj);
            case 8:
                PreferencesActivity preferencesActivity = (PreferencesActivity) obj3;
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj).intValue();
                int i6 = PreferencesActivity.T;
                boolean z9 = iIntValue != 0;
                SharedPreferences sharedPreferences = preferencesActivity.getSharedPreferences("SettingsPreferences", 0);
                sharedPreferences.getClass();
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putBoolean("storage_sdcard", z9);
                editorEdit.apply();
                TextView textView = (TextView) mVar.f1062l;
                if (iIntValue == 0) {
                    textView.setText(preferencesActivity.getString(2131952099));
                } else {
                    textView.setText(preferencesActivity.getString(2131952558));
                }
                return xVar;
            case 9:
                ((p7.c) obj3).f8466a.removeCallbacks((m4.a) obj2);
                return xVar;
            case 10:
                String str = (String) obj2;
                MutablePreferences mutablePreferences = (MutablePreferences) obj;
                mutablePreferences.set(q2.i.f8675d, str);
                ((q2.i) obj3).h(mutablePreferences, str);
                return null;
            default:
                ((x7.g) obj3).unlock(((x7.c) obj2).f11520b);
                return xVar;
        }
    }
}
