package g4;

import android.app.AlertDialog;
import android.app.Application;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c4.w4;
import com.uptodown.R;
import java.net.Socket;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class s0 extends h {
    public AlertDialog A;
    public TextView B;
    public TextView C;
    public TextView D;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TextView f5258y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ProgressBar f5259z;

    public final void C() {
        View viewInflate = View.inflate(this, R.layout.dialog_sending_file, null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_percentage_dialog_sending);
        this.f5258y = textView;
        if (textView != null) {
            textView.setTypeface(f4.c.f4883w);
        }
        ProgressBar progressBar = (ProgressBar) viewInflate.findViewById(R.id.progressbar_dialog_sending);
        this.f5259z = progressBar;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_cancel_dialog_sending);
        this.D = textView2;
        textView2.getClass();
        textView2.setTypeface(f4.c.f4883w);
        TextView textView3 = this.D;
        if (textView3 != null) {
            textView3.setOnClickListener(new q0(this, 1));
        }
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.tv_sending_app);
        this.B = textView4;
        if (textView4 != null) {
            textView4.setTypeface(f4.c.f4884x);
        }
        TextView textView5 = (TextView) viewInflate.findViewById(R.id.tv_device_to_sending);
        this.C = textView5;
        if (textView5 != null) {
            textView5.setTypeface(f4.c.f4883w);
        }
        G(viewInflate);
    }

    public final void D() {
        ArrayList arrayList;
        m4.g gVar = f4.c.f4885y;
        Integer numValueOf = (gVar == null || (arrayList = gVar.g) == null) ? null : Integer.valueOf(arrayList.size());
        numValueOf.getClass();
        if (numValueOf.intValue() <= 0) {
            i(getString(R.string.nsd_no_devices_available));
            return;
        }
        w4 w4Var = (w4) this;
        f0.i iVar = new f0.i(w4Var, 29);
        View viewInflate = View.inflate(this, R.layout.devices_available_nsd, null);
        m4.g gVar2 = f4.c.f4885y;
        gVar2.getClass();
        ArrayList arrayList2 = gVar2.g;
        i4.a aVar = new i4.a();
        aVar.f5654a = arrayList2;
        aVar.f5655b = iVar;
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.rv_devices);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), 1, false));
        }
        recyclerView.setAdapter(aVar);
        View viewFindViewById = viewInflate.findViewById(R.id.tv_cancel);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        textView.setTypeface(f4.c.f4883w);
        textView.setOnClickListener(new q0(w4Var, 3));
        G(viewInflate);
    }

    public final void E() {
        AlertDialog alertDialog = this.A;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this.A = null;
    }

    public final void G(View view) {
        AlertDialog alertDialog;
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(view);
        builder.setCancelable(false);
        AlertDialog alertDialogCreate = builder.create();
        this.A = alertDialogCreate;
        Window window = alertDialogCreate != null ? alertDialogCreate.getWindow() : null;
        window.getClass();
        window.setBackgroundDrawable(new ColorDrawable(0));
        if (isFinishing() || (alertDialog = this.A) == null) {
            return;
        }
        alertDialog.show();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Socket socket;
        m4.g gVar;
        super.onResume();
        m4.b bVar = f4.c.f4886z;
        if (bVar != null && ((socket = bVar.f7284d) == null || socket.isClosed())) {
            Application application = getApplication();
            application.getClass();
            if (!((f4.c) application).f4888b.get() && (gVar = f4.c.f4885y) != null) {
                gVar.b();
            }
        }
        AlertDialog alertDialog = this.A;
        if (alertDialog == null || !alertDialog.isShowing()) {
            return;
        }
        if (f4.c.A) {
            f4.c.A = false;
            runOnUiThread(new p0(this, 1));
            t0.f.f(this, null);
            return;
        }
        String str = f4.c.B;
        if (str != null) {
            runOnUiThread(new androidx.work.impl.c(this, str, f4.c.C, 3));
            f4.c.B = null;
            f4.c.C = null;
            return;
        }
        String str2 = f4.c.D;
        if (str2 != null) {
            runOnUiThread(new r0(this, str2, 1));
            f4.c.D = null;
            return;
        }
        String str3 = f4.c.E;
        if (str3 != null) {
            runOnUiThread(new r0(this, str3, 0));
            f4.c.E = null;
        }
    }

    public void F() {
    }
}
