package e5;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.leanback.widget.Presenter;
import com.google.android.gms.internal.measurement.i5;
import com.uptodown.R;
import java.io.File;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import l7.u;
import x4.r;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends Presenter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4752a;

    @Override // androidx.leanback.widget.Presenter
    public final void onBindViewHolder(Presenter.ViewHolder viewHolder, Object obj) {
        viewHolder.getClass();
        if (obj instanceof r) {
            r rVar = (r) obj;
            i5.f fVar = (i5.f) viewHolder;
            Context context = viewHolder.view.getContext();
            TextView textView = fVar.f5684a;
            TextView textView2 = fVar.f5685b;
            ProgressBar progressBar = fVar.f5687m;
            TextView textView3 = fVar.f5686l;
            if (context != null) {
                textView.setText(rVar.f11367w + " " + rVar.f11360o);
                textView.setTypeface(f4.c.f4884x);
                textView2.setTypeface(f4.c.f4884x);
                textView3.setTypeface(f4.c.f4884x);
                if (rVar.i() > 0 && rVar.i() < 100) {
                    textView2.setText(String.format(Locale.getDefault(), "%d%%", Arrays.copyOf(new Object[]{Integer.valueOf(rVar.i())}, 1)));
                    textView3.setVisibility(8);
                    progressBar.setProgress(rVar.i());
                    progressBar.setVisibility(0);
                    return;
                }
                l4.a aVarC = f4.a.f4870a.c();
                if (aVarC != null && u.m0(aVarC.f7096a, rVar.f11356b, true)) {
                    long j = rVar.f11359n;
                    if (j > 0 && aVarC.f7097b == j) {
                        progressBar.setIndeterminate(true);
                        progressBar.setVisibility(0);
                        textView3.setText(R.string.installing);
                        textView2.setText(i5.H(context, rVar.j()));
                        return;
                    }
                }
                File fileG = rVar.g();
                if (fileG != null) {
                    long jLastModified = fileG.lastModified();
                    DateFormat dateTimeInstance = DateFormat.getDateTimeInstance();
                    textView3.setVisibility(0);
                    textView3.setText(dateTimeInstance.format(new Date(jLastModified)));
                    textView2.setText(i5.H(context, rVar.k()));
                    progressBar.setVisibility(4);
                }
            }
        }
    }

    @Override // androidx.leanback.widget.Presenter
    public final Presenter.ViewHolder onCreateViewHolder(ViewGroup viewGroup) {
        View viewS = androidx.lifecycle.l.s(viewGroup, R.layout.tv_download_item, viewGroup, false);
        this.f4752a = ContextCompat.getColor(viewGroup.getContext(), R.color.background_color);
        ContextCompat.getColor(viewGroup.getContext(), R.color.blue_primary_pressed);
        viewS.setFocusable(true);
        viewS.setFocusableInTouchMode(true);
        viewS.setBackgroundColor(this.f4752a);
        return new i5.f(viewS);
    }

    @Override // androidx.leanback.widget.Presenter
    public final void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        viewHolder.getClass();
    }
}
