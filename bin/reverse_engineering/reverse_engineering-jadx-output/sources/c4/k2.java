package c4;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import com.uptodown.activities.LoginActivity;
import com.uptodown.activities.RepliesActivity;
import com.uptodown.activities.SearchActivity;
import com.uptodown.views.InstantAutoCompleteTextView;
import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k2 implements TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f1781b;

    public /* synthetic */ k2(k0 k0Var, int i) {
        this.f1780a = i;
        this.f1781b = k0Var;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        int i6 = this.f1780a;
        k0 k0Var = this.f1781b;
        switch (i6) {
            case 0:
                LoginActivity loginActivity = (LoginActivity) k0Var;
                int i10 = LoginActivity.W;
                if (i == 6) {
                    loginActivity.J0();
                }
                break;
            case 1:
                RepliesActivity repliesActivity = (RepliesActivity) k0Var;
                int i11 = RepliesActivity.S;
                if (i == 6) {
                    repliesActivity.A0();
                }
                break;
            default:
                SearchActivity searchActivity = (SearchActivity) k0Var;
                int i12 = SearchActivity.Y;
                textView.getClass();
                if (i == 3) {
                    String string = textView.getText().toString();
                    if (string.length() > 0) {
                        searchActivity.B0();
                        searchActivity.C0(0, string);
                        Bundle bundle = new Bundle();
                        bundle.putString("text", string);
                        android.support.v4.media.g gVar = searchActivity.E;
                        if (gVar != null) {
                            gVar.E(bundle, "search");
                        }
                        Pattern patternCompile = Pattern.compile("[^a-zA-Z0-9 ]+");
                        patternCompile.getClass();
                        String strReplaceAll = patternCompile.matcher(string).replaceAll("");
                        strReplaceAll.getClass();
                        String strValueOf = String.valueOf(System.currentTimeMillis());
                        j5.g gVarL = j5.g.D.l(searchActivity);
                        gVarL.b();
                        Iterator it = gVarL.V().iterator();
                        it.getClass();
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                next.getClass();
                                if (l7.u.m0(((x4.z1) next).f11479a, string, true)) {
                                }
                            } else {
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("search", strReplaceAll);
                                contentValues.put("timestamp", strValueOf);
                                SQLiteDatabase sQLiteDatabase = gVarL.f6673a;
                                sQLiteDatabase.getClass();
                                sQLiteDatabase.insert("recent_searches", null, contentValues);
                            }
                        }
                        gVarL.c();
                        ((InstantAutoCompleteTextView) searchActivity.z0().f10137b.f11756l).dismissDropDown();
                    }
                }
                break;
        }
        return false;
    }
}
