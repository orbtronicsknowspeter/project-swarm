package c4;

import android.app.AlertDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDelegate;
import com.uptodown.UptodownApp;
import com.uptodown.activities.UserActivity;
import com.uptodown.core.activities.FileExplorerActivity;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ib implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1733a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f1734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f1735c;

    public /* synthetic */ ib(FileExplorerActivity fileExplorerActivity, kotlin.jvm.internal.x xVar) {
        this.f1735c = fileExplorerActivity;
        this.f1734b = xVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
        int i = this.f1733a;
        kotlin.jvm.internal.x xVar = this.f1734b;
        Context context = this.f1735c;
        switch (i) {
            case 0:
                int i6 = UserActivity.W;
                if (z9) {
                    Object obj = xVar.f7025a;
                    obj.getClass();
                    ((AlertDialog) obj).dismiss();
                    SharedPreferences sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
                    sharedPreferences.getClass();
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putString("dark_mode", "system");
                    editorEdit.apply();
                    AppCompatDelegate.setDefaultNightMode(-1);
                    UptodownApp.f3293f0 = true;
                    return;
                }
                return;
            default:
                FileExplorerActivity fileExplorerActivity = (FileExplorerActivity) context;
                if (!z9) {
                    int i10 = FileExplorerActivity.f3380q0;
                    return;
                }
                TextView textView = fileExplorerActivity.L;
                if (textView == null) {
                    kotlin.jvm.internal.l.i("tvSelectedPath");
                    throw null;
                }
                textView.setVisibility(8);
                TextView textView2 = fileExplorerActivity.L;
                if (textView2 != null) {
                    textView2.setText((CharSequence) xVar.f7025a);
                    return;
                } else {
                    kotlin.jvm.internal.l.i("tvSelectedPath");
                    throw null;
                }
        }
    }

    public /* synthetic */ ib(kotlin.jvm.internal.x xVar, Context context) {
        this.f1734b = xVar;
        this.f1735c = context;
    }
}
