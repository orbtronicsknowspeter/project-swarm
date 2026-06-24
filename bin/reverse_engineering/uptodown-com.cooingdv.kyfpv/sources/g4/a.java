package g4;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelKt;
import b2.t1;
import c4.b1;
import c4.bc;
import c4.z0;
import com.google.android.gms.internal.measurement.z3;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.FollowListActivity;
import com.uptodown.activities.UserCommentsActivity;
import com.uptodown.core.activities.ConfirmDeleteActivity;
import e1.v4;
import java.io.File;
import m5.f1;
import m5.s1;
import m5.y0;
import x4.k2;
import x4.u2;
import x4.w2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5134b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f5135l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f5136m;

    public /* synthetic */ a(s1 s1Var, int i, k2 k2Var) {
        this.f5133a = 4;
        this.f5135l = s1Var;
        this.f5134b = i;
        this.f5136m = k2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        e4.d dVar;
        int i = this.f5133a;
        int i6 = this.f5134b;
        Object obj = this.f5136m;
        Object obj2 = this.f5135l;
        switch (i) {
            case 0:
                String str = (String) obj2;
                ConfirmDeleteActivity confirmDeleteActivity = (ConfirmDeleteActivity) obj;
                int i10 = ConfirmDeleteActivity.f3374a;
                if (str != null) {
                    new File(str).delete();
                }
                Object systemService = confirmDeleteActivity.getSystemService("notification");
                systemService.getClass();
                ((NotificationManager) systemService).cancel(i6);
                confirmDeleteActivity.finish();
                break;
            case 1:
                f0.i iVar = ((m5.q) obj2).f7524b;
                ((w2) obj).f11432a.getClass();
                FollowListActivity followListActivity = (FollowListActivity) iVar.f4812b;
                float f = UptodownApp.I;
                if (b4.d.t() && (dVar = followListActivity.Q) != null) {
                    Object obj3 = dVar.f4506a.get(i6);
                    obj3.getClass();
                    w2 w2Var = (w2) obj3;
                    if (w2Var.f11440r == 1) {
                        b1 b1VarZ0 = followListActivity.z0();
                        String str2 = w2Var.f11432a;
                        str2.getClass();
                        b1VarZ0.getClass();
                        b1VarZ0.f1409e = true;
                        o7.a0 viewModelScope = ViewModelKt.getViewModelScope(b1VarZ0);
                        v7.e eVar = o7.m0.f8289a;
                        o7.c0.s(viewModelScope, v7.d.f10885a, null, new z0(b1VarZ0, followListActivity, str2, null, 1), 2);
                        e4.d dVar2 = followListActivity.Q;
                        dVar2.getClass();
                        ((w2) dVar2.f4506a.get(i6)).f11440r = 0;
                    } else {
                        b1 b1VarZ02 = followListActivity.z0();
                        String str3 = w2Var.f11432a;
                        str3.getClass();
                        b1VarZ02.getClass();
                        b1VarZ02.f1409e = true;
                        o7.a0 viewModelScope2 = ViewModelKt.getViewModelScope(b1VarZ02);
                        v7.e eVar2 = o7.m0.f8289a;
                        o7.c0.s(viewModelScope2, v7.d.f10885a, null, new z0(b1VarZ02, followListActivity, str3, null, 0), 2);
                        e4.d dVar3 = followListActivity.Q;
                        dVar3.getClass();
                        ((w2) dVar3.f4506a.get(i6)).f11440r = 1;
                    }
                    e4.d dVar4 = followListActivity.Q;
                    if (dVar4 != null) {
                        dVar4.notifyItemChanged(i6);
                    }
                    break;
                }
                break;
            case 2:
                ((y0) obj2).f7642m.d((x4.g) obj, i6);
                break;
            case 3:
                ((f1) obj2).f7381l.d((x4.g) obj, i6);
                break;
            case 4:
                s1 s1Var = (s1) obj2;
                k2 k2Var = (k2) obj;
                a3.d dVar5 = s1Var.f7563a;
                Context context = s1Var.f7564b;
                UserCommentsActivity userCommentsActivity = (UserCommentsActivity) dVar5.f63b;
                float f10 = UptodownApp.I;
                if (b4.d.t() && userCommentsActivity.T()) {
                    if (u2.h(userCommentsActivity) != null) {
                        e4.b1 b1Var = userCommentsActivity.Q;
                        b1Var.getClass();
                        if (!j5.t.f6710b.contains(Long.valueOf(((k2) b1Var.f4494a.get(i6)).f11259a))) {
                            bc bcVarZ0 = userCommentsActivity.z0();
                            e4.b1 b1Var2 = userCommentsActivity.Q;
                            b1Var2.getClass();
                            Object obj4 = b1Var2.f4494a.get(i6);
                            obj4.getClass();
                            k2 k2Var2 = (k2) obj4;
                            bcVarZ0.getClass();
                            o7.a0 viewModelScope3 = ViewModelKt.getViewModelScope(bcVarZ0);
                            v7.e eVar3 = o7.m0.f8289a;
                            o7.c0.s(viewModelScope3, v7.d.f10885a, null, new b6.g(k2Var2, userCommentsActivity, bcVarZ0, (t6.c) null, 12), 2);
                        }
                    } else {
                        String string = userCommentsActivity.getString(R.string.login_required_like_title);
                        string.getClass();
                        String string2 = userCommentsActivity.getString(R.string.login_required_like_msg);
                        string2.getClass();
                        t1.v(userCommentsActivity, string, string2);
                    }
                }
                if (z3.f2928c && u2.h(context) != null) {
                    new v4(context, 1).h(s1Var.f7574u);
                    if (!j5.t.f6710b.contains(Long.valueOf(k2Var.f11259a))) {
                        s1Var.f7570q.setText(String.valueOf(k2Var.f11268s + 1));
                    }
                    break;
                }
                break;
            case 5:
                ((n5.n) obj).f8101b.invoke(Integer.valueOf(i6), (String) obj2);
                break;
            default:
                u4.f0 f0Var = (u4.f0) obj2;
                u uVar = (u) obj;
                if (f0Var.getActivity() != null && !f0Var.requireActivity().isFinishing()) {
                    EditText editText = uVar.f5268l;
                    Integer numH0 = l7.t.h0(editText.getText().toString());
                    Editable text = editText.getText();
                    text.getClass();
                    if (text.length() > 0 && numH0 != null) {
                        String string3 = editText.getText().toString();
                        int iIntValue = numH0.intValue();
                        string3.getClass();
                        if (iIntValue < i6 && string3.length() == 4 && iIntValue > 1900) {
                            Object systemService2 = f0Var.requireContext().getSystemService("input_method");
                            systemService2.getClass();
                            ((InputMethodManager) systemService2).hideSoftInputFromWindow(editText.getWindowToken(), 0);
                            FragmentActivity activity = f0Var.getActivity();
                            activity.getClass();
                            ((c4.k0) activity).Q();
                            Context contextRequireContext = f0Var.requireContext();
                            contextRequireContext.getClass();
                            int iIntValue2 = numH0.intValue();
                            SharedPreferences sharedPreferences = contextRequireContext.getSharedPreferences("SettingsPreferences", 0);
                            sharedPreferences.getClass();
                            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                            editorEdit.putInt("ageVerificationYear", iIntValue2);
                            editorEdit.apply();
                            if (i6 - numH0.intValue() < 18) {
                                f0Var.s();
                            } else {
                                t4.b bVar = f0Var.f10474b;
                                bVar.getClass();
                                bVar.f9612l.setVisibility(8);
                            }
                        } else {
                            FragmentActivity activity2 = f0Var.getActivity();
                            activity2.getClass();
                            String string4 = f0Var.getString(R.string.age_verification_input_failed);
                            string4.getClass();
                            ((c4.k0) activity2).A(string4);
                        }
                    } else {
                        FragmentActivity activity3 = f0Var.getActivity();
                        activity3.getClass();
                        String string5 = f0Var.getString(R.string.age_verification_input_failed);
                        string5.getClass();
                        ((c4.k0) activity3).A(string5);
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ a(int i, Object obj, int i6, Object obj2) {
        this.f5133a = i6;
        this.f5135l = obj;
        this.f5136m = obj2;
        this.f5134b = i;
    }

    public /* synthetic */ a(n5.n nVar, int i, String str) {
        this.f5133a = 5;
        this.f5136m = nVar;
        this.f5134b = i;
        this.f5135l = str;
    }
}
