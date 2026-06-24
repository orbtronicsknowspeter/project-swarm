package g4;

import android.net.nsd.NsdServiceInfo;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.uptodown.R;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0 f5243b;

    public /* synthetic */ p0(s0 s0Var, int i) {
        this.f5242a = i;
        this.f5243b = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextView textView;
        NsdServiceInfo nsdServiceInfo;
        int i = this.f5242a;
        String serviceName = null;
        s0 s0Var = this.f5243b;
        switch (i) {
            case 0:
                s0Var.C();
                TextView textView2 = s0Var.B;
                if (textView2 != null) {
                    textView2.setText(s0Var.getString(R.string.sending_app_to));
                }
                m4.g gVar = f4.c.f4885y;
                if (gVar != null && (nsdServiceInfo = gVar.f) != null) {
                    serviceName = nsdServiceInfo.getServiceName();
                }
                if (serviceName != null && (textView = s0Var.C) != null) {
                    textView.setText(serviceName.substring(0, l7.m.y0(serviceName, "_d:_", 0, false, 6)));
                }
                ProgressBar progressBar = s0Var.f5259z;
                if (progressBar != null) {
                    progressBar.setIndeterminate(false);
                }
                break;
            default:
                s0Var.E();
                s0Var.E();
                View viewInflate = View.inflate(s0Var, R.layout.dialog_receiving_finished, null);
                View viewFindViewById = viewInflate.findViewById(R.id.tv_receiving_finished);
                viewFindViewById.getClass();
                TextView textView3 = (TextView) viewFindViewById;
                textView3.setTypeface(f4.c.f4883w);
                textView3.setText(s0Var.getString(R.string.nsd_app_sent_successfully));
                View viewFindViewById2 = viewInflate.findViewById(R.id.tv_install);
                viewFindViewById2.getClass();
                ((TextView) viewFindViewById2).setVisibility(8);
                View viewFindViewById3 = viewInflate.findViewById(R.id.tv_cancel);
                viewFindViewById3.getClass();
                TextView textView4 = (TextView) viewFindViewById3;
                textView4.setTypeface(f4.c.f4883w);
                textView4.setText(s0Var.getString(android.R.string.ok));
                textView4.setOnClickListener(new q0(s0Var, 4));
                s0Var.G(viewInflate);
                break;
        }
    }
}
