package com.uptodown.activities;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.room.g;
import c4.k0;
import com.uptodown.R;
import com.uptodown.activities.InformationActivity;
import f4.c;
import java.util.List;
import k7.d;
import k7.i;
import l7.k;
import p6.m;
import t4.r;
import x4.l;
import x4.o;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class InformationActivity extends k0 {
    public static final /* synthetic */ int P = 0;
    public final m O = new m(new g(this, 18));

    @Override // c4.k0, g4.h, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = y0().f10079a;
        relativeLayout.getClass();
        setContentView(relativeLayout);
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.core_vector_back);
        if (drawable != null) {
            y0().f10080b.setNavigationIcon(drawable);
            y0().f10080b.setNavigationContentDescription(getString(R.string.back));
        }
        final int i = 0;
        y0().f10080b.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: c4.u1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InformationActivity f2149b;

            {
                this.f2149b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = i;
                InformationActivity informationActivity = this.f2149b;
                switch (i6) {
                    case 0:
                        int i10 = InformationActivity.P;
                        informationActivity.finish();
                        break;
                    default:
                        int i11 = InformationActivity.P;
                        String string = informationActivity.getString(R.string.url_dev_on_board);
                        string.getClass();
                        String string2 = informationActivity.getString(R.string.support_title);
                        string2.getClass();
                        j5.c.e(informationActivity, string, string2);
                        break;
                }
            }
        });
        y0().f10087r.setTypeface(c.f4883w);
        y0().f10081l.setTypeface(c.f4884x);
        y0().f10082m.setTypeface(c.f4884x);
        y0().f10083n.setTypeface(c.f4884x);
        y0().f10085p.setTypeface(c.f4884x);
        y0().f10086q.setTypeface(c.f4884x);
        y0().f10084o.setTypeface(c.f4884x);
        TextView textView = y0().f10084o;
        String string = getString(R.string.information_activity_dev_on_board_more_info);
        string.getClass();
        List<o> listI0 = i.i0(new d(k.a(new k("\\[a](.*?)\\[/a]"), string), new l(0)));
        final int i6 = 1;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(new k("\\[a](.*?)\\[/a]").b(string, new l(1)));
        for (o oVar : listI0) {
            int iY0 = l7.m.y0(spannableStringBuilder, oVar.f11304d, 0, false, 6);
            int length = oVar.f11304d.length() + iY0;
            if (iY0 >= 0) {
                spannableStringBuilder.setSpan(new b6.c(this, 2), iY0, length, 33);
            }
        }
        textView.setText(spannableStringBuilder);
        y0().f10084o.setOnClickListener(new View.OnClickListener(this) { // from class: c4.u1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InformationActivity f2149b;

            {
                this.f2149b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i62 = i6;
                InformationActivity informationActivity = this.f2149b;
                switch (i62) {
                    case 0:
                        int i10 = InformationActivity.P;
                        informationActivity.finish();
                        break;
                    default:
                        int i11 = InformationActivity.P;
                        String string2 = informationActivity.getString(R.string.url_dev_on_board);
                        string2.getClass();
                        String string22 = informationActivity.getString(R.string.support_title);
                        string22.getClass();
                        j5.c.e(informationActivity, string2, string22);
                        break;
                }
            }
        });
    }

    public final r y0() {
        return (r) this.O.getValue();
    }
}
