package g4;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uptodown.R;
import com.uptodown.core.activities.FileExplorerActivity;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class u implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5266a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RelativeLayout f5267b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final EditText f5268l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f5269m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f5270n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f5271o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f5272p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final View f5273q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final KeyEvent.Callback f5274r;

    public u(RelativeLayout relativeLayout, EditText editText, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.f5267b = relativeLayout;
        this.f5268l = editText;
        this.f5269m = textView;
        this.f5270n = textView2;
        this.f5271o = textView3;
        this.f5272p = textView4;
        this.f5273q = textView5;
        this.f5274r = textView6;
    }

    public static u c(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_age_verification, (ViewGroup) null, false);
        int i = R.id.et_age_verification;
        EditText editText = (EditText) ViewBindings.findChildViewById(viewInflate, R.id.et_age_verification);
        if (editText != null) {
            i = R.id.tv_continue_age_verification;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_continue_age_verification);
            if (textView != null) {
                i = R.id.tv_go_back_age_verification;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_go_back_age_verification);
                if (textView2 != null) {
                    i = R.id.tv_input_title_age_verification;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_input_title_age_verification);
                    if (textView3 != null) {
                        i = R.id.tv_msg_dialog_age_verification;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_msg_dialog_age_verification);
                        if (textView4 != null) {
                            i = R.id.tv_privacy_note_age_verification;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_privacy_note_age_verification);
                            if (textView5 != null) {
                                i = R.id.tv_title_dialog_age_verification;
                                TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_title_dialog_age_verification);
                                if (textView6 != null) {
                                    return new u((RelativeLayout) viewInflate, editText, textView, textView2, textView3, textView4, textView5, textView6);
                                }
                            }
                        }
                    }
                }
            }
        }
        com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    public void a(String str) {
        this.f5271o.setText(str);
        this.f5267b.setVisibility(8);
        this.f5270n.setVisibility(8);
        this.f5272p.setText(((FileExplorerActivity) this.f5274r).getString(R.string.close));
    }

    public void b(String str) {
        str.getClass();
        EditText editText = this.f5268l;
        editText.setFocusable(false);
        editText.setFocusableInTouchMode(false);
        editText.clearFocus();
        ((ProgressBar) this.f5273q).setVisibility(0);
        TextView textView = this.f5269m;
        textView.setVisibility(0);
        textView.setText(((FileExplorerActivity) this.f5274r).getString(R.string.core_start_counting_value, str));
        this.f5270n.setVisibility(8);
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        switch (this.f5266a) {
            case 1:
                return this.f5267b;
            default:
                return (LinearLayout) this.f5273q;
        }
    }

    public u(LinearLayout linearLayout, EditText editText, EditText editText2, RelativeLayout relativeLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f5273q = linearLayout;
        this.f5268l = editText;
        this.f5274r = editText2;
        this.f5267b = relativeLayout;
        this.f5269m = textView;
        this.f5270n = textView2;
        this.f5271o = textView3;
        this.f5272p = textView4;
    }

    public u(ProgressBar progressBar, TextView textView, EditText editText, FileExplorerActivity fileExplorerActivity, TextView textView2, TextView textView3, RelativeLayout relativeLayout, TextView textView4) {
        this.f5273q = progressBar;
        this.f5269m = textView;
        this.f5268l = editText;
        this.f5274r = fileExplorerActivity;
        this.f5270n = textView2;
        this.f5271o = textView3;
        this.f5267b = relativeLayout;
        this.f5272p = textView4;
    }
}
