package z7;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBindings;
import b2.t1;
import com.uptodown.R;
import com.uptodown.activities.PasswordEditActivity;
import t4.f0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements d7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11986b;

    public /* synthetic */ d(Object obj, int i) {
        this.f11985a = i;
        this.f11986b = obj;
    }

    @Override // d7.a
    public final Object invoke() {
        int i = this.f11985a;
        Object obj = this.f11986b;
        switch (i) {
            case 0:
                e eVar = (e) obj;
                b8.f fVarO = t1.o("kotlinx.serialization.Polymorphic", b8.c.h, new b8.e[0], new androidx.room.b(eVar, 19));
                j7.c cVar = eVar.f11987a;
                cVar.getClass();
                return new b8.b(fVarO, cVar);
            default:
                int i6 = PasswordEditActivity.Q;
                View viewInflate = ((PasswordEditActivity) obj).getLayoutInflater().inflate(R.layout.password_edit, (ViewGroup) null, false);
                int i10 = R.id.et_confirm_password_edit;
                EditText editText = (EditText) ViewBindings.findChildViewById(viewInflate, R.id.et_confirm_password_edit);
                if (editText != null) {
                    i10 = R.id.et_password_edit;
                    EditText editText2 = (EditText) ViewBindings.findChildViewById(viewInflate, R.id.et_password_edit);
                    if (editText2 != null) {
                        i10 = R.id.iv_confirm_password_edit;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_confirm_password_edit);
                        if (imageView != null) {
                            i10 = R.id.iv_password_edit;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.iv_password_edit);
                            if (imageView2 != null) {
                                i10 = R.id.loading_view_password_edit;
                                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.loading_view_password_edit);
                                if (viewFindChildViewById != null) {
                                    i10 = R.id.toolbar_password_edit;
                                    Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(viewInflate, R.id.toolbar_password_edit);
                                    if (toolbar != null) {
                                        i10 = R.id.tv_equals_password_edit;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_equals_password_edit);
                                        if (textView != null) {
                                            i10 = R.id.tv_max_chars_password_edit;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_max_chars_password_edit);
                                            if (textView2 != null) {
                                                i10 = R.id.tv_min_chars_password_edit;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_min_chars_password_edit);
                                                if (textView3 != null) {
                                                    i10 = R.id.tv_password_edit_change;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_password_edit_change);
                                                    if (textView4 != null) {
                                                        i10 = R.id.tv_title_toolbar_password_edit;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.tv_title_toolbar_password_edit);
                                                        if (textView5 != null) {
                                                            return new f0((RelativeLayout) viewInflate, editText, editText2, imageView, imageView2, viewFindChildViewById, toolbar, textView, textView2, textView3, textView4, textView5);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
                return null;
        }
    }
}
