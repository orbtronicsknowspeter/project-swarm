package x4;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.uptodown.R;
import com.uptodown.UptodownApp;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f11283b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u4.p1 f11284l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Context f11285m;

    public /* synthetic */ m(o oVar, u4.p1 p1Var, Context context, int i) {
        this.f11282a = i;
        this.f11283b = oVar;
        this.f11284l = p1Var;
        this.f11285m = context;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Long l10;
        Long l11;
        Long l12;
        String str;
        int i = this.f11282a;
        u4.p1 p1Var = this.f11284l;
        o oVar = this.f11283b;
        view.getClass();
        switch (i) {
            case 0:
                float f = UptodownApp.I;
                if (b4.d.t() && (l10 = oVar.f11303c) != null) {
                    long jLongValue = l10.longValue();
                    u4.z1 z1Var = p1Var.f10572a;
                    if (z1Var.getActivity() instanceof c4.k0) {
                        FragmentActivity activity = z1Var.getActivity();
                        activity.getClass();
                        ((c4.k0) activity).i0(jLongValue);
                    }
                    break;
                }
                break;
            case 1:
                float f10 = UptodownApp.I;
                if (b4.d.t() && (l11 = oVar.f11303c) != null) {
                    j jVar = new j((int) l11.longValue(), oVar.f11304d, 4);
                    jVar.f11228m = true;
                    p1Var.a(jVar);
                    break;
                }
                break;
            case 2:
                float f11 = UptodownApp.I;
                if (b4.d.t() && (l12 = oVar.f11303c) != null) {
                    p1Var.a(new j((int) l12.longValue(), oVar.f11304d, 4));
                    break;
                }
                break;
            default:
                float f12 = UptodownApp.I;
                if (b4.d.t() && (str = oVar.f) != null && str.length() != 0) {
                    String str2 = oVar.f;
                    str2.getClass();
                    p1Var.getClass();
                    u4.z1 z1Var2 = p1Var.f10572a;
                    if (z1Var2.getActivity() instanceof c4.k0) {
                        FragmentActivity fragmentActivityRequireActivity = z1Var2.requireActivity();
                        fragmentActivityRequireActivity.getClass();
                        j5.c.e(fragmentActivityRequireActivity, str2, null);
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i = this.f11282a;
        Context context = this.f11285m;
        textPaint.getClass();
        switch (i) {
            case 0:
                super.updateDrawState(textPaint);
                textPaint.setColor(ContextCompat.getColor(context, R.color.main_blue));
                textPaint.setTypeface(f4.c.f4883w);
                break;
            case 1:
                super.updateDrawState(textPaint);
                textPaint.setColor(ContextCompat.getColor(context, R.color.main_blue));
                textPaint.setTypeface(f4.c.f4883w);
                break;
            case 2:
                super.updateDrawState(textPaint);
                textPaint.setColor(ContextCompat.getColor(context, R.color.main_blue));
                textPaint.setTypeface(f4.c.f4883w);
                break;
            default:
                super.updateDrawState(textPaint);
                textPaint.setColor(ContextCompat.getColor(context, R.color.main_blue));
                textPaint.setTypeface(f4.c.f4883w);
                break;
        }
    }
}
