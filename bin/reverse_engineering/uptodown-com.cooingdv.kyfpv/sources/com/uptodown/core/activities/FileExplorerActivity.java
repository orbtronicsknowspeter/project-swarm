package com.uptodown.core.activities;

import a3.d;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.UriPermission;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupKt;
import androidx.documentfile.provider.DocumentFile;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c.e;
import c4.ib;
import c4.y2;
import com.google.android.gms.internal.measurement.i5;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.internal.a;
import com.uptodown.R;
import f0.i;
import f4.c;
import g4.g;
import g4.j;
import g4.o;
import g4.s0;
import g4.v;
import g4.w;
import g4.x;
import i4.b;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.l;
import l7.m;
import o7.c0;
import o7.m0;
import y2.s;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class FileExplorerActivity extends s0 {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final /* synthetic */ int f3380q0 = 0;
    public TextView E;
    public RecyclerView F;
    public RelativeLayout G;
    public LinearLayout H;
    public LinearLayout I;
    public HorizontalScrollView J;
    public TextView K;
    public TextView L;
    public TextView M;
    public SearchView N;
    public RelativeLayout O;
    public RadioButton P;
    public RadioButton Q;
    public RadioButton R;
    public AlertDialog S;
    public Toolbar T;
    public TextView U;
    public b V;
    public ArrayList W;
    public ArrayList X;
    public DocumentFile Y;
    public ArrayList Z;
    public ArrayList a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ArrayList f3381b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public File f3382c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f3383d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f3384e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public ArrayList f3385f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f3386g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public TabLayout f3387h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public TextView f3388i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public Uri f3389j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public String f3390k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final i f3391l0 = new i(this, 27);

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final d f3392m0 = new d(this, 29);
    public final x n0 = new x(this);

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final c4.b f3393o0 = new c4.b(this, 8);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ActivityResultLauncher f3394p0;

    public FileExplorerActivity() {
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new j(this));
        activityResultLauncherRegisterForActivityResult.getClass();
        this.f3394p0 = activityResultLauncherRegisterForActivityResult;
    }

    public static final void H(FileExplorerActivity fileExplorerActivity) {
        AlertDialog alertDialog = fileExplorerActivity.S;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        View viewInflate = fileExplorerActivity.getLayoutInflater().inflate(R.layout.dialog_accept_cancel, (ViewGroup) null, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_dialog_msg);
        textView.setTypeface(c.f4884x);
        textView.setText(textView.getContext().getString(R.string.dialog_close_file_manager));
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_accept_option);
        textView2.setText(fileExplorerActivity.getString(R.string.ok));
        textView2.setTypeface(c.f4883w);
        textView2.setOnClickListener(new g(fileExplorerActivity, 8));
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_cancel_option);
        textView3.setText(fileExplorerActivity.getString(R.string.option_button_cancel));
        textView3.setTypeface(c.f4883w);
        textView3.setOnClickListener(new g(fileExplorerActivity, 9));
        AlertDialog.Builder builder = new AlertDialog.Builder(fileExplorerActivity);
        builder.setView(viewInflate);
        AlertDialog alertDialogCreate = builder.create();
        fileExplorerActivity.S = alertDialogCreate;
        alertDialogCreate.getClass();
        Window window = alertDialogCreate.getWindow();
        if (window != null) {
            a4.x.y(window, 0);
        }
        AlertDialog alertDialog2 = fileExplorerActivity.S;
        alertDialog2.getClass();
        alertDialog2.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (o7.c0.C(r1, r7, r0) == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I(com.uptodown.core.activities.FileExplorerActivity r6, v6.c r7) {
        /*
            boolean r0 = r7 instanceof g4.p
            if (r0 == 0) goto L13
            r0 = r7
            g4.p r0 = (g4.p) r0
            int r1 = r0.f5241l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5241l = r1
            goto L18
        L13:
            g4.p r0 = new g4.p
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f5239a
            int r1 = r0.f5241l
            r2 = 0
            r3 = 2
            r4 = 1
            u6.a r5 = u6.a.f10763a
            if (r1 == 0) goto L35
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            p6.a.e(r7)
            goto L5d
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r6)
            return r2
        L31:
            p6.a.e(r7)
            goto L4a
        L35:
            p6.a.e(r7)
            v7.e r7 = o7.m0.f8289a
            v7.d r7 = v7.d.f10885a
            g4.n r1 = new g4.n
            r1.<init>(r6, r2, r3)
            r0.f5241l = r4
            java.lang.Object r7 = o7.c0.C(r1, r7, r0)
            if (r7 != r5) goto L4a
            goto L5c
        L4a:
            v7.e r7 = o7.m0.f8289a
            p7.c r7 = t7.n.f10349a
            g4.n r1 = new g4.n
            r4 = 3
            r1.<init>(r6, r2, r4)
            r0.f5241l = r3
            java.lang.Object r6 = o7.c0.C(r1, r7, r0)
            if (r6 != r5) goto L5d
        L5c:
            return r5
        L5d:
            p6.x r6 = p6.x.f8464a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.activities.FileExplorerActivity.I(com.uptodown.core.activities.FileExplorerActivity, v6.c):java.lang.Object");
    }

    public static final void J(FileExplorerActivity fileExplorerActivity, String str, int i, int i6, long j) {
        AlertDialog alertDialog = fileExplorerActivity.f5177a;
        if (alertDialog != null) {
            TextView textView = (TextView) alertDialog.findViewById(R.id.tv_title_dialog_copying);
            if (textView != null) {
                textView.setText(fileExplorerActivity.getString(R.string.copying, fileExplorerActivity.getString(R.string.size_of_total_size, String.valueOf(i), String.valueOf(i6))));
            }
            AlertDialog alertDialog2 = fileExplorerActivity.f5177a;
            alertDialog2.getClass();
            TextView textView2 = (TextView) alertDialog2.findViewById(R.id.tv_files_dialog_copying);
            if (textView2 != null) {
                textView2.setTypeface(c.f4884x);
                textView2.setText(str);
                return;
            }
            return;
        }
        View viewInflate = fileExplorerActivity.getLayoutInflater().inflate(R.layout.dialog_copy_files, (ViewGroup) null, false);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_title_dialog_copying);
        textView3.setTypeface(c.f4883w);
        textView3.setText(fileExplorerActivity.getString(R.string.copying, fileExplorerActivity.getString(R.string.size_of_total_size, String.valueOf(i), String.valueOf(i6))));
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.tv_size_dialog_copying);
        textView4.setTypeface(c.f4884x);
        textView4.setText(fileExplorerActivity.getString(R.string.size_of_total_size, fileExplorerActivity.getString(R.string.mb_placeholder, fileExplorerActivity.getString(R.string.zero)), i5.G(j)));
        ((ProgressBar) viewInflate.findViewById(R.id.pb_dialog_copying)).setProgress(0);
        TextView textView5 = (TextView) viewInflate.findViewById(R.id.tv_files_dialog_copying);
        textView5.setTypeface(c.f4884x);
        textView5.setText(str);
        TextView textView6 = (TextView) viewInflate.findViewById(R.id.tv_percentage_dialog_copying);
        textView6.setTypeface(c.f4884x);
        textView6.setText(fileExplorerActivity.getString(R.string.zero) + fileExplorerActivity.getString(R.string.percentage));
        AlertDialog.Builder builder = new AlertDialog.Builder(fileExplorerActivity);
        builder.setView(viewInflate);
        builder.setCancelable(false);
        if (fileExplorerActivity.isFinishing()) {
            return;
        }
        AlertDialog alertDialogCreate = builder.create();
        fileExplorerActivity.f5177a = alertDialogCreate;
        alertDialogCreate.getClass();
        Window window = alertDialogCreate.getWindow();
        if (window != null) {
            a4.x.y(window, 0);
        }
        AlertDialog alertDialog3 = fileExplorerActivity.f5177a;
        alertDialog3.getClass();
        alertDialog3.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (o7.c0.C(r1, r8, r0) == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K(com.uptodown.core.activities.FileExplorerActivity r7, v6.c r8) {
        /*
            boolean r0 = r8 instanceof g4.r
            if (r0 == 0) goto L13
            r0 = r8
            g4.r r0 = (g4.r) r0
            int r1 = r0.f5250l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5250l = r1
            goto L18
        L13:
            g4.r r0 = new g4.r
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f5248a
            int r1 = r0.f5250l
            r2 = 0
            r3 = 2
            r4 = 1
            u6.a r5 = u6.a.f10763a
            if (r1 == 0) goto L35
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            p6.a.e(r8)
            goto L5e
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r7)
            return r2
        L31:
            p6.a.e(r8)
            goto L4b
        L35:
            p6.a.e(r8)
            v7.e r8 = o7.m0.f8289a
            v7.d r8 = v7.d.f10885a
            g4.n r1 = new g4.n
            r6 = 5
            r1.<init>(r7, r2, r6)
            r0.f5250l = r4
            java.lang.Object r8 = o7.c0.C(r1, r8, r0)
            if (r8 != r5) goto L4b
            goto L5d
        L4b:
            v7.e r8 = o7.m0.f8289a
            p7.c r8 = t7.n.f10349a
            g4.n r1 = new g4.n
            r4 = 6
            r1.<init>(r7, r2, r4)
            r0.f5250l = r3
            java.lang.Object r7 = o7.c0.C(r1, r8, r0)
            if (r7 != r5) goto L5e
        L5d:
            return r5
        L5e:
            p6.x r7 = p6.x.f8464a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.activities.FileExplorerActivity.K(com.uptodown.core.activities.FileExplorerActivity, v6.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
    
        if (o7.c0.C(r3, r10, r0) != r6) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object L(com.uptodown.core.activities.FileExplorerActivity r9, v6.c r10) {
        /*
            boolean r0 = r10 instanceof g4.s
            if (r0 == 0) goto L13
            r0 = r10
            g4.s r0 = (g4.s) r0
            int r1 = r0.f5257m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5257m = r1
            goto L18
        L13:
            g4.s r0 = new g4.s
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f5255b
            int r1 = r0.f5257m
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            u6.a r6 = u6.a.f10763a
            if (r1 == 0) goto L40
            if (r1 == r4) goto L3a
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2e
            p6.a.e(r10)
            goto L89
        L2e:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r9)
            return r5
        L34:
            kotlin.jvm.internal.v r1 = r0.f5254a
            p6.a.e(r10)
            goto L73
        L3a:
            kotlin.jvm.internal.v r1 = r0.f5254a
            p6.a.e(r10)
            goto L5f
        L40:
            p6.a.e(r10)
            kotlin.jvm.internal.v r10 = new kotlin.jvm.internal.v
            r10.<init>()
            v7.e r1 = o7.m0.f8289a
            p7.c r1 = t7.n.f10349a
            g4.n r7 = new g4.n
            r8 = 11
            r7.<init>(r9, r5, r8)
            r0.f5254a = r10
            r0.f5257m = r4
            java.lang.Object r1 = o7.c0.C(r7, r1, r0)
            if (r1 != r6) goto L5e
            goto L88
        L5e:
            r1 = r10
        L5f:
            v7.e r10 = o7.m0.f8289a
            v7.d r10 = v7.d.f10885a
            g4.t r4 = new g4.t
            r4.<init>(r9, r1, r5)
            r0.f5254a = r1
            r0.f5257m = r3
            java.lang.Object r10 = o7.c0.C(r4, r10, r0)
            if (r10 != r6) goto L73
            goto L88
        L73:
            v7.e r10 = o7.m0.f8289a
            p7.c r10 = t7.n.f10349a
            c4.sc r3 = new c4.sc
            r4 = 8
            r3.<init>(r9, r1, r5, r4)
            r0.f5254a = r5
            r0.f5257m = r2
            java.lang.Object r9 = o7.c0.C(r3, r10, r0)
            if (r9 != r6) goto L89
        L88:
            return r6
        L89:
            p6.x r9 = p6.x.f8464a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.activities.FileExplorerActivity.L(com.uptodown.core.activities.FileExplorerActivity, v6.c):java.lang.Object");
    }

    public static final void M(FileExplorerActivity fileExplorerActivity, Object obj) {
        String strSubstring;
        AlertDialog alertDialog;
        if (fileExplorerActivity.isFinishing()) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(fileExplorerActivity);
        LayoutInflater layoutInflater = fileExplorerActivity.getLayoutInflater();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.dialog_decompress_file, (ViewGroup) null, false);
        ((TextView) viewInflate.findViewById(R.id.tv_dialog_title_decompress)).setTypeface(c.f4883w);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_dialog_file_name_decompress);
        textView.setTypeface(c.f4884x);
        RadioButton radioButton = (RadioButton) viewInflate.findViewById(R.id.rb_dialog_decompress_current_path);
        radioButton.setTypeface(c.f4884x);
        RadioButton radioButton2 = (RadioButton) viewInflate.findViewById(R.id.rb_dialog_decompress_select_path);
        radioButton2.setTypeface(c.f4884x);
        View viewFindViewById = viewInflate.findViewById(R.id.tv_dialog_decompress_selected_path);
        viewFindViewById.getClass();
        TextView textView2 = (TextView) viewFindViewById;
        fileExplorerActivity.L = textView2;
        textView2.setTypeface(c.f4884x);
        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
        if (obj instanceof File) {
            xVar.f7025a = ((File) obj).getParent();
        } else if (obj instanceof DocumentFile) {
            DocumentFile documentFile = fileExplorerActivity.Y;
            documentFile.getClass();
            String lastPathSegment = documentFile.getUri().getLastPathSegment();
            if (lastPathSegment != null) {
                DocumentFile documentFile2 = fileExplorerActivity.Y;
                documentFile2.getClass();
                String lastPathSegment2 = documentFile2.getUri().getLastPathSegment();
                lastPathSegment2.getClass();
                strSubstring = lastPathSegment.substring(m.A0(":", lastPathSegment2, 6) + 1);
            } else {
                strSubstring = null;
            }
            xVar.f7025a = a4.x.k(fileExplorerActivity.getString(R.string.sd_card), "/", strSubstring);
        }
        TextView textView3 = fileExplorerActivity.L;
        if (textView3 == null) {
            l.i("tvSelectedPath");
            throw null;
        }
        textView3.setText((CharSequence) xVar.f7025a);
        fileExplorerActivity.f3390k0 = (String) xVar.f7025a;
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.tv_accept_option_compress);
        textView4.setTypeface(c.f4883w);
        TextView textView5 = (TextView) viewInflate.findViewById(R.id.tv_cancel_option_decompress);
        textView5.setTypeface(c.f4883w);
        ProgressBar progressBar = (ProgressBar) viewInflate.findViewById(R.id.pb_dialog_decompress);
        TextView textView6 = fileExplorerActivity.L;
        if (textView6 == null) {
            l.i("tvSelectedPath");
            throw null;
        }
        textView6.setOnClickListener(new g(fileExplorerActivity, 13));
        radioButton.setOnCheckedChangeListener(new ib(fileExplorerActivity, xVar));
        radioButton2.setOnCheckedChangeListener(new g4.i(fileExplorerActivity, 3));
        kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
        textView4.setOnClickListener(new y2(obj, fileExplorerActivity, xVar2, new v(textView, fileExplorerActivity, viewInflate, progressBar, textView4, textView5), 3));
        textView5.setOnClickListener(new g4.l(xVar2, fileExplorerActivity, 1));
        builder.setView(viewInflate);
        fileExplorerActivity.S = builder.create();
        if (fileExplorerActivity.isFinishing() || (alertDialog = fileExplorerActivity.S) == null) {
            return;
        }
        Window window = alertDialog.getWindow();
        if (window != null) {
            a4.x.y(window, 0);
        }
        AlertDialog alertDialog2 = fileExplorerActivity.S;
        alertDialog2.getClass();
        alertDialog2.show();
    }

    public static final void N(FileExplorerActivity fileExplorerActivity, Object obj, String str) {
        AlertDialog alertDialog = fileExplorerActivity.S;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        View viewInflate = fileExplorerActivity.getLayoutInflater().inflate(R.layout.dialog_accept_cancel, (ViewGroup) null, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_dialog_msg);
        textView.setTypeface(c.f4884x);
        textView.setText(textView.getContext().getString(R.string.install_dialog_confirmation_msg, str));
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_accept_option);
        textView2.setText(fileExplorerActivity.getString(R.string.option_button_install));
        textView2.setTypeface(c.f4883w);
        textView2.setOnClickListener(new e(29, obj, fileExplorerActivity));
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_cancel_option);
        textView3.setText(fileExplorerActivity.getString(R.string.option_button_cancel));
        textView3.setTypeface(c.f4883w);
        textView3.setOnClickListener(new g(fileExplorerActivity, 14));
        AlertDialog.Builder builder = new AlertDialog.Builder(fileExplorerActivity);
        builder.setView(viewInflate);
        AlertDialog alertDialogCreate = builder.create();
        fileExplorerActivity.S = alertDialogCreate;
        alertDialogCreate.getClass();
        Window window = alertDialogCreate.getWindow();
        if (window != null) {
            a4.x.y(window, 0);
        }
        AlertDialog alertDialog2 = fileExplorerActivity.S;
        alertDialog2.getClass();
        alertDialog2.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (o7.c0.C(r1, r8, r0) == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O(com.uptodown.core.activities.FileExplorerActivity r7, v6.c r8) {
        /*
            boolean r0 = r8 instanceof g4.y
            if (r0 == 0) goto L13
            r0 = r8
            g4.y r0 = (g4.y) r0
            int r1 = r0.f5286l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5286l = r1
            goto L18
        L13:
            g4.y r0 = new g4.y
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f5284a
            int r1 = r0.f5286l
            r2 = 0
            r3 = 2
            r4 = 1
            u6.a r5 = u6.a.f10763a
            if (r1 == 0) goto L35
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            p6.a.e(r8)
            goto L5f
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r7)
            return r2
        L31:
            p6.a.e(r8)
            goto L4b
        L35:
            p6.a.e(r8)
            v7.e r8 = o7.m0.f8289a
            v7.d r8 = v7.d.f10885a
            c4.ya r1 = new c4.ya
            r6 = 5
            r1.<init>(r7, r2, r6)
            r0.f5286l = r4
            java.lang.Object r8 = o7.c0.C(r1, r8, r0)
            if (r8 != r5) goto L4b
            goto L5e
        L4b:
            v7.e r8 = o7.m0.f8289a
            p7.c r8 = t7.n.f10349a
            g4.n r1 = new g4.n
            r4 = 15
            r1.<init>(r7, r2, r4)
            r0.f5286l = r3
            java.lang.Object r7 = o7.c0.C(r1, r8, r0)
            if (r7 != r5) goto L5f
        L5e:
            return r5
        L5f:
            p6.x r7 = p6.x.f8464a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.activities.FileExplorerActivity.O(com.uptodown.core.activities.FileExplorerActivity, v6.c):java.lang.Object");
    }

    public static final void P(FileExplorerActivity fileExplorerActivity) {
        LinearLayout linearLayout = fileExplorerActivity.I;
        if (linearLayout == null) {
            l.i("llBreadcrumb");
            throw null;
        }
        if (linearLayout.getChildCount() > 1) {
            LinearLayout linearLayout2 = fileExplorerActivity.I;
            if (linearLayout2 != null) {
                linearLayout2.removeViewAt(linearLayout2.getChildCount() - 1);
            } else {
                l.i("llBreadcrumb");
                throw null;
            }
        }
    }

    public static final void Q(FileExplorerActivity fileExplorerActivity) {
        int i;
        Menu menu;
        MenuItem menuItemFindItem;
        Menu menu2;
        MenuItem menuItemFindItem2;
        Menu menu3;
        MenuItem menuItemFindItem3;
        Menu menu4;
        MenuItem menuItemFindItem4;
        Toolbar toolbar;
        Menu menu5;
        MenuItem menuItemFindItem5;
        Menu menu6;
        MenuItem menuItemFindItem6;
        Menu menu7;
        MenuItem menuItemFindItem7;
        Menu menu8;
        MenuItem menuItemFindItem8;
        Menu menu9;
        MenuItem menuItemFindItem9;
        boolean[] zArr;
        Menu menu10;
        MenuItem menuItemFindItem10;
        Menu menu11;
        MenuItem menuItemFindItem11;
        Menu menu12;
        MenuItem menuItemFindItem12;
        Menu menu13;
        MenuItem menuItemFindItem13;
        Menu menu14;
        MenuItem menuItemFindItem14;
        Toolbar toolbar2 = fileExplorerActivity.T;
        if (toolbar2 != null && (menu14 = toolbar2.getMenu()) != null && (menuItemFindItem14 = menu14.findItem(R.id.action_delete)) != null) {
            menuItemFindItem14.setVisible(true);
        }
        Toolbar toolbar3 = fileExplorerActivity.T;
        if (toolbar3 != null && (menu13 = toolbar3.getMenu()) != null && (menuItemFindItem13 = menu13.findItem(R.id.action_create)) != null) {
            menuItemFindItem13.setVisible(true);
        }
        Toolbar toolbar4 = fileExplorerActivity.T;
        if (toolbar4 != null && (menu12 = toolbar4.getMenu()) != null && (menuItemFindItem12 = menu12.findItem(R.id.action_copy)) != null) {
            menuItemFindItem12.setVisible(true);
        }
        Toolbar toolbar5 = fileExplorerActivity.T;
        if (toolbar5 != null && (menu11 = toolbar5.getMenu()) != null && (menuItemFindItem11 = menu11.findItem(R.id.action_compress)) != null) {
            menuItemFindItem11.setVisible(true);
        }
        Toolbar toolbar6 = fileExplorerActivity.T;
        if (toolbar6 != null && (menu10 = toolbar6.getMenu()) != null && (menuItemFindItem10 = menu10.findItem(R.id.action_cut)) != null) {
            menuItemFindItem10.setVisible(true);
        }
        b bVar = fileExplorerActivity.V;
        if (bVar == null || (zArr = bVar.f5659d) == null) {
            i = 0;
        } else {
            i = 0;
            for (boolean z9 : zArr) {
                if (z9) {
                    i++;
                }
            }
        }
        Toolbar toolbar7 = fileExplorerActivity.T;
        if (i > 0) {
            if (toolbar7 != null && (menu9 = toolbar7.getMenu()) != null && (menuItemFindItem9 = menu9.findItem(R.id.action_delete)) != null) {
                menuItemFindItem9.setEnabled(true);
            }
            Toolbar toolbar8 = fileExplorerActivity.T;
            if (toolbar8 != null && (menu8 = toolbar8.getMenu()) != null && (menuItemFindItem8 = menu8.findItem(R.id.action_copy)) != null) {
                menuItemFindItem8.setEnabled(true);
            }
            Toolbar toolbar9 = fileExplorerActivity.T;
            if (toolbar9 != null && (menu7 = toolbar9.getMenu()) != null && (menuItemFindItem7 = menu7.findItem(R.id.action_cut)) != null) {
                menuItemFindItem7.setEnabled(true);
            }
            Toolbar toolbar10 = fileExplorerActivity.T;
            if (toolbar10 != null && (menu6 = toolbar10.getMenu()) != null && (menuItemFindItem6 = menu6.findItem(R.id.action_compress)) != null) {
                menuItemFindItem6.setEnabled(true);
            }
        } else {
            if (toolbar7 != null && (menu4 = toolbar7.getMenu()) != null && (menuItemFindItem4 = menu4.findItem(R.id.action_delete)) != null) {
                menuItemFindItem4.setEnabled(false);
            }
            Toolbar toolbar11 = fileExplorerActivity.T;
            if (toolbar11 != null && (menu3 = toolbar11.getMenu()) != null && (menuItemFindItem3 = menu3.findItem(R.id.action_copy)) != null) {
                menuItemFindItem3.setEnabled(false);
            }
            Toolbar toolbar12 = fileExplorerActivity.T;
            if (toolbar12 != null && (menu2 = toolbar12.getMenu()) != null && (menuItemFindItem2 = menu2.findItem(R.id.action_cut)) != null) {
                menuItemFindItem2.setEnabled(false);
            }
            Toolbar toolbar13 = fileExplorerActivity.T;
            if (toolbar13 != null && (menu = toolbar13.getMenu()) != null && (menuItemFindItem = menu.findItem(R.id.action_compress)) != null) {
                menuItemFindItem.setEnabled(false);
            }
        }
        TextView textView = fileExplorerActivity.U;
        if (textView != null) {
            textView.setText(fileExplorerActivity.getString(R.string.core_x_items_selected, String.valueOf(i)));
        }
        ArrayList arrayList = fileExplorerActivity.f3385f0;
        if (arrayList == null || arrayList.isEmpty() || (toolbar = fileExplorerActivity.T) == null || (menu5 = toolbar.getMenu()) == null || (menuItemFindItem5 = menu5.findItem(R.id.action_paste)) == null) {
            return;
        }
        menuItemFindItem5.setVisible(true);
    }

    public static final void R(FileExplorerActivity fileExplorerActivity) {
        b bVar = fileExplorerActivity.V;
        bVar.getClass();
        bVar.c(false);
        fileExplorerActivity.U();
        fileExplorerActivity.V(null);
    }

    @Override // g4.s0
    public final void F() {
        c.f4885y.getClass();
    }

    public final void S(String str, String str2) {
        if (isFinishing()) {
            return;
        }
        RelativeLayout relativeLayout = this.G;
        t6.c cVar = null;
        if (relativeLayout == null) {
            l.i("rlLoading");
            throw null;
        }
        relativeLayout.setVisibility(0);
        v7.e eVar = m0.f8289a;
        c0.s(c0.b(v7.d.f10885a), null, null, new g4.m(this, str, str2, cVar, 1), 3);
    }

    public final void T(SearchView searchView) {
        searchView.setOnQueryTextListener(null);
        searchView.setQuery("", false);
        searchView.setOnQueryTextListener(this.n0);
        Object systemService = getSystemService("input_method");
        systemService.getClass();
        ((InputMethodManager) systemService).hideSoftInputFromWindow(searchView.getWindowToken(), 0);
    }

    public final void U() {
        Menu menu;
        MenuItem menuItemFindItem;
        Menu menu2;
        MenuItem menuItemFindItem2;
        Menu menu3;
        MenuItem menuItemFindItem3;
        Menu menu4;
        MenuItem menuItemFindItem4;
        Menu menu5;
        MenuItem menuItemFindItem5;
        Menu menu6;
        MenuItem menuItemFindItem6;
        TextView textView = this.U;
        if (textView != null) {
            textView.setText(getString(R.string.action_name_file_explorer));
        }
        Toolbar toolbar = this.T;
        if (toolbar != null && (menu6 = toolbar.getMenu()) != null && (menuItemFindItem6 = menu6.findItem(R.id.action_create)) != null) {
            menuItemFindItem6.setVisible(true);
        }
        Toolbar toolbar2 = this.T;
        if (toolbar2 != null && (menu5 = toolbar2.getMenu()) != null && (menuItemFindItem5 = menu5.findItem(R.id.action_delete)) != null) {
            menuItemFindItem5.setVisible(false);
        }
        Toolbar toolbar3 = this.T;
        if (toolbar3 != null && (menu4 = toolbar3.getMenu()) != null && (menuItemFindItem4 = menu4.findItem(R.id.action_copy)) != null) {
            menuItemFindItem4.setVisible(false);
        }
        Toolbar toolbar4 = this.T;
        if (toolbar4 != null && (menu3 = toolbar4.getMenu()) != null && (menuItemFindItem3 = menu3.findItem(R.id.action_compress)) != null) {
            menuItemFindItem3.setVisible(false);
        }
        Toolbar toolbar5 = this.T;
        if (toolbar5 != null && (menu2 = toolbar5.getMenu()) != null && (menuItemFindItem2 = menu2.findItem(R.id.action_cut)) != null) {
            menuItemFindItem2.setVisible(false);
        }
        Toolbar toolbar6 = this.T;
        if (toolbar6 == null || (menu = toolbar6.getMenu()) == null || (menuItemFindItem = menu.findItem(R.id.action_paste)) == null) {
            return;
        }
        menuItemFindItem.setVisible(false);
    }

    public final void V(String str) {
        File externalStorageDirectory;
        RelativeLayout relativeLayout = this.G;
        if (relativeLayout == null) {
            l.i("rlLoading");
            throw null;
        }
        relativeLayout.setVisibility(0);
        if (this.Y == null && this.f3382c0 == null && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.f3382c0 = externalStorageDirectory;
            this.Y = null;
        }
        new s(this.Y, this.f3382c0, this, new android.support.v4.media.g(13, this, str));
    }

    public final void W(boolean z9) {
        SearchView searchView;
        if (z9 && (searchView = this.N) != null) {
            T(searchView);
        }
        V(null);
    }

    public final void X() {
        v7.e eVar = m0.f8289a;
        c0.s(c0.b(v7.d.f10885a), null, null, new o(this, (t6.c) null, 4), 3);
    }

    public final void Y() {
        LinearLayout linearLayout = this.I;
        if (linearLayout == null) {
            l.i("llBreadcrumb");
            throw null;
        }
        linearLayout.removeAllViews();
        LayoutInflater layoutInflater = getLayoutInflater();
        LinearLayout linearLayout2 = this.I;
        if (linearLayout2 == null) {
            l.i("llBreadcrumb");
            throw null;
        }
        View viewInflate = layoutInflater.inflate(R.layout.breadcrumb_main, (ViewGroup) linearLayout2, false);
        viewInflate.getClass();
        LinearLayout linearLayout3 = (LinearLayout) viewInflate;
        TextView textView = (TextView) linearLayout3.findViewById(R.id.tv_main_path);
        if (this.f3384e0) {
            textView.setText(getString(R.string.sd_card));
        } else {
            textView.setText(getString(R.string.internal_storage));
        }
        textView.setTypeface(c.f4884x);
        LinearLayout linearLayout4 = this.I;
        if (linearLayout4 != null) {
            linearLayout4.addView(linearLayout3);
        } else {
            l.i("llBreadcrumb");
            throw null;
        }
    }

    public final void Z() {
        boolean z9 = this.f3383d0;
        RadioButton radioButton = this.P;
        if (z9) {
            radioButton.getClass();
            radioButton.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_az_desc_on));
            RadioButton radioButton2 = this.Q;
            radioButton2.getClass();
            radioButton2.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_size_desc_off));
            RadioButton radioButton3 = this.R;
            radioButton3.getClass();
            radioButton3.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_date_desc_off));
            return;
        }
        radioButton.getClass();
        radioButton.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_az_asc_on));
        RadioButton radioButton4 = this.Q;
        radioButton4.getClass();
        radioButton4.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_size_asc_off));
        RadioButton radioButton5 = this.R;
        radioButton5.getClass();
        radioButton5.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_date_asc_off));
    }

    public final void a0(boolean z9) {
        TextView textView = this.K;
        if (z9) {
            if (textView == null) {
                l.i("tvEmptyDirectory");
                throw null;
            }
            textView.setText(getString(R.string.empty_directory));
        } else {
            if (textView == null) {
                l.i("tvEmptyDirectory");
                throw null;
            }
            textView.setText(getString(R.string.no_permissions_directory));
        }
        TextView textView2 = this.K;
        if (textView2 != null) {
            textView2.setVisibility(0);
        } else {
            l.i("tvEmptyDirectory");
            throw null;
        }
    }

    public final void b0(Uri uri) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setDataAndType(uri, getContentResolver().getType(uri));
        intent.addFlags(1);
        startActivity(Intent.createChooser(intent, null));
    }

    @Override // g4.h, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        AlertDialog alertDialog;
        SharedPreferences sharedPreferences;
        String string;
        Uri uri;
        boolean zMatches;
        super.onCreate(bundle);
        setContentView(R.layout.file_explorer);
        ViewCompat.setOnApplyWindowInsetsListener((RelativeLayout) findViewById(R.id.rl_file_explorer), new a(7));
        Bundle extras = getIntent().getExtras();
        int i = 1;
        int i6 = 0;
        if (extras != null) {
            if (extras.containsKey("subdir") && (string = extras.getString("subdir")) != null) {
                boolean z9 = extras.getBoolean("subdir_sd");
                this.f3384e0 = z9;
                if (z9) {
                    List<UriPermission> persistedUriPermissions = getContentResolver().getPersistedUriPermissions();
                    persistedUriPermissions.getClass();
                    Iterator<UriPermission> it = persistedUriPermissions.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            uri = null;
                            break;
                        }
                        UriPermission next = it.next();
                        Uri uri2 = next.getUri();
                        uri2.getClass();
                        String path = uri2.getPath();
                        if (path != null) {
                            Pattern patternCompile = Pattern.compile(".*\\b[ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]]-[ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]]:.*");
                            patternCompile.getClass();
                            zMatches = patternCompile.matcher(path).matches();
                        } else {
                            zMatches = false;
                        }
                        if (zMatches) {
                            uri = next.getUri();
                            break;
                        }
                    }
                    if (uri != null) {
                        DocumentFile documentFileFromTreeUri = DocumentFile.fromTreeUri(this, uri);
                        if (documentFileFromTreeUri != null && string.length() > 0) {
                            Iterator it2 = m.G0(string, new String[]{"/"}).iterator();
                            while (it2.hasNext() && (documentFileFromTreeUri = documentFileFromTreeUri.findFile((String) it2.next())) != null) {
                            }
                        }
                        this.Y = documentFileFromTreeUri;
                        this.f3382c0 = null;
                    }
                } else {
                    this.f3382c0 = new File(string);
                    this.Y = null;
                }
            }
            if (extras.containsKey("select_path") && extras.getInt("select_path") == 1) {
                View viewFindViewById = findViewById(R.id.ll_options);
                viewFindViewById.getClass();
                View viewFindViewById2 = findViewById(R.id.view_options_shadow);
                viewFindViewById2.getClass();
                ((LinearLayout) viewFindViewById).setVisibility(0);
                viewFindViewById2.setVisibility(0);
                TextView textView = (TextView) findViewById(R.id.tv_select_current_dir);
                this.M = textView;
                if (textView != null) {
                    textView.setTypeface(c.f4883w);
                }
                TextView textView2 = this.M;
                if (textView2 != null) {
                    textView2.setOnClickListener(new g(this, 15));
                }
                TextView textView3 = (TextView) findViewById(R.id.tv_cancel);
                textView3.setTypeface(c.f4883w);
                textView3.setOnClickListener(new g(this, 16));
            }
        }
        this.T = (Toolbar) findViewById(R.id.toolbar);
        TextView textView4 = (TextView) findViewById(R.id.tv_toolbar_title);
        this.U = textView4;
        if (textView4 != null) {
            textView4.setText(getString(R.string.action_name_file_explorer));
        }
        TextView textView5 = this.U;
        if (textView5 != null) {
            textView5.setTypeface(c.f4883w);
        }
        Toolbar toolbar = this.T;
        if (toolbar != null) {
            toolbar.setOverflowIcon(ContextCompat.getDrawable(this, R.drawable.core_vector_menu_dots_blue));
        }
        Toolbar toolbar2 = this.T;
        if (toolbar2 != null) {
            toolbar2.setNavigationIcon(ContextCompat.getDrawable(this, R.drawable.core_vector_back));
        }
        Toolbar toolbar3 = this.T;
        if (toolbar3 != null) {
            toolbar3.setNavigationOnClickListener(new g(this, 17));
        }
        Toolbar toolbar4 = this.T;
        if (toolbar4 != null) {
            toolbar4.inflateMenu(R.menu.core_menu_file_explorer);
        }
        Toolbar toolbar5 = this.T;
        if (toolbar5 != null) {
            toolbar5.setOnMenuItemClickListener(new j(this));
        }
        U();
        View viewFindViewById3 = findViewById(R.id.layout_breadcrumb_main);
        viewFindViewById3.getClass();
        this.I = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.sv_breadcumb);
        viewFindViewById4.getClass();
        this.J = (HorizontalScrollView) viewFindViewById4;
        LinearLayout linearLayout = this.I;
        if (linearLayout == null) {
            l.i("llBreadcrumb");
            throw null;
        }
        View viewFindViewById5 = linearLayout.findViewById(R.id.tv_main_path);
        viewFindViewById5.getClass();
        this.E = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.iv_home_path);
        viewFindViewById6.getClass();
        ((ImageView) viewFindViewById6).setOnClickListener(new g(this, 18));
        TextView textView6 = this.E;
        if (textView6 == null) {
            l.i("tvBreadCrumb");
            throw null;
        }
        textView6.setTypeface(c.f4884x);
        View viewFindViewById7 = findViewById(R.id.tv_empty_dir);
        viewFindViewById7.getClass();
        TextView textView7 = (TextView) viewFindViewById7;
        this.K = textView7;
        textView7.setTypeface(c.f4884x);
        SearchView searchView = (SearchView) findViewById(R.id.search_view);
        this.N = searchView;
        if (searchView != null) {
            searchView.setOnQueryTextListener(this.n0);
        }
        SearchView searchView2 = this.N;
        if (searchView2 != null) {
            searchView2.setOnClickListener(new g(this, i));
        }
        SearchView searchView3 = this.N;
        searchView3.getClass();
        ((ImageView) searchView3.findViewById(androidx.appcompat.R.id.search_close_btn)).setBackgroundResource(R.drawable.core_shape_transparent);
        SearchView searchView4 = this.N;
        searchView4.getClass();
        EditText editText = (EditText) searchView4.findViewById(androidx.appcompat.R.id.search_src_text);
        editText.setTypeface(c.f4884x);
        editText.setTextColor(ContextCompat.getColor(this, R.color.text_primary));
        editText.setHintTextColor(ContextCompat.getColor(this, R.color.core_search_view_color));
        ImageView imageView = (ImageView) findViewById(R.id.iv_search_options);
        imageView.getClass();
        int i10 = 2;
        imageView.setOnClickListener(new g(this, i10));
        this.O = (RelativeLayout) findViewById(R.id.rl_sort_options);
        RadioButton radioButton = (RadioButton) findViewById(R.id.rb_name_sort);
        this.P = radioButton;
        radioButton.getClass();
        radioButton.setTypeface(c.f4884x);
        RadioButton radioButton2 = this.P;
        radioButton2.getClass();
        radioButton2.setOnClickListener(new g(this, 3));
        RadioButton radioButton3 = this.P;
        radioButton3.getClass();
        radioButton3.setOnCheckedChangeListener(new g4.i(this, i6));
        RadioButton radioButton4 = (RadioButton) findViewById(R.id.rb_size_sort);
        this.Q = radioButton4;
        radioButton4.getClass();
        radioButton4.setOnCheckedChangeListener(new g4.i(this, i));
        RadioButton radioButton5 = (RadioButton) findViewById(R.id.rb_date_sort);
        this.R = radioButton5;
        radioButton5.getClass();
        radioButton5.setOnCheckedChangeListener(new g4.i(this, i10));
        CheckBox checkBox = (CheckBox) findViewById(R.id.cb_show_hidden_files);
        checkBox.setTypeface(c.f4884x);
        try {
            sharedPreferences = getSharedPreferences("CoreSettings", 0);
        } catch (Exception unused) {
        }
        boolean z10 = sharedPreferences.contains("show_hidden_files") ? sharedPreferences.getBoolean("show_hidden_files", false) : false;
        checkBox.setChecked(z10);
        checkBox.setOnCheckedChangeListener(new g4.i(this, 4));
        Z();
        View viewFindViewById8 = findViewById(R.id.rv_files);
        viewFindViewById8.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById8;
        this.F = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        RecyclerView recyclerView2 = this.F;
        if (recyclerView2 == null) {
            l.i("rvFiles");
            throw null;
        }
        recyclerView2.addItemDecoration(new n4.l((int) getResources().getDimension(R.dimen.margin_generic_item_recyclerview)));
        RecyclerView recyclerView3 = this.F;
        if (recyclerView3 == null) {
            l.i("rvFiles");
            throw null;
        }
        recyclerView3.setItemAnimator(new DefaultItemAnimator());
        View viewFindViewById9 = findViewById(R.id.rl_loading_file_explorer);
        viewFindViewById9.getClass();
        RelativeLayout relativeLayout = (RelativeLayout) viewFindViewById9;
        this.G = relativeLayout;
        relativeLayout.setOnClickListener(new c4.e(27));
        View viewFindViewById10 = findViewById(R.id.ll_sd_permissions_explanation);
        viewFindViewById10.getClass();
        this.H = (LinearLayout) viewFindViewById10;
        TextView textView8 = (TextView) findViewById(R.id.tv_storage_devices);
        this.f3388i0 = textView8;
        if (textView8 != null) {
            textView8.setTypeface(c.f4883w);
        }
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tl_storage);
        this.f3387h0 = tabLayout;
        tabLayout.getClass();
        TabLayout.Tab text = tabLayout.newTab().setText(getString(R.string.internal_storage));
        text.getClass();
        text.setId(0);
        TabLayout tabLayout2 = this.f3387h0;
        tabLayout2.getClass();
        tabLayout2.addTab(text);
        TabLayout tabLayout3 = this.f3387h0;
        tabLayout3.getClass();
        TabLayout.Tab text2 = tabLayout3.newTab().setText(getString(R.string.sd_card));
        text2.getClass();
        text2.setId(1);
        TabLayout tabLayout4 = this.f3387h0;
        tabLayout4.getClass();
        tabLayout4.addTab(text2);
        TabLayout tabLayout5 = this.f3387h0;
        tabLayout5.getClass();
        ViewGroupKt.get(tabLayout5, 0).setSelected(true);
        TabLayout tabLayout6 = this.f3387h0;
        tabLayout6.getClass();
        tabLayout6.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new w(this));
        if (l()) {
            W(true);
            ArrayList arrayListI = a.a.I(this);
            this.Z = arrayListI;
            boolean zIsEmpty = arrayListI.isEmpty();
            TabLayout tabLayout7 = this.f3387h0;
            if (zIsEmpty) {
                if (tabLayout7 != null) {
                    tabLayout7.setVisibility(8);
                }
                TextView textView9 = this.f3388i0;
                if (textView9 != null) {
                    textView9.setVisibility(8);
                }
            } else {
                if (tabLayout7 != null) {
                    tabLayout7.setVisibility(0);
                }
                TextView textView10 = this.f3388i0;
                if (textView10 != null) {
                    textView10.setVisibility(0);
                }
            }
        } else {
            AlertDialog alertDialog2 = this.f5177a;
            if (alertDialog2 != null) {
                alertDialog2.dismiss();
            }
            View viewInflate = getLayoutInflater().inflate(R.layout.dialog_accept, (ViewGroup) null, false);
            TextView textView11 = (TextView) viewInflate.findViewById(R.id.tv_dialog_accept_msg);
            textView11.setTypeface(c.f4884x);
            textView11.setText(getString(R.string.msg_request_permissions_write_external_storage));
            TextView textView12 = (TextView) viewInflate.findViewById(R.id.tv_accept_option);
            textView12.setTypeface(c.f4883w);
            textView12.setOnClickListener(new g(this, i6));
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setView(viewInflate);
            builder.setCancelable(false);
            this.f5177a = builder.create();
            if (!isFinishing() && (alertDialog = this.f5177a) != null) {
                alertDialog.show();
            }
        }
        getOnBackPressedDispatcher().addCallback(this, this.f3393o0);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (i != 82) {
            return super.onKeyDown(i, keyEvent);
        }
        Toolbar toolbar = this.T;
        toolbar.getClass();
        toolbar.showOverflowMenu();
        return true;
    }

    @Override // g4.h
    public final void p() {
        i(getString(R.string.msg_permission_storage_denied));
    }

    @Override // g4.h
    public final void q() {
        Uri uri;
        boolean zMatches;
        List<UriPermission> persistedUriPermissions = getContentResolver().getPersistedUriPermissions();
        persistedUriPermissions.getClass();
        Iterator<UriPermission> it = persistedUriPermissions.iterator();
        while (true) {
            if (!it.hasNext()) {
                uri = null;
                break;
            }
            UriPermission next = it.next();
            Uri uri2 = next.getUri();
            uri2.getClass();
            String path = uri2.getPath();
            if (path != null) {
                Pattern patternCompile = Pattern.compile(".*\\b[ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]]-[ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]]:.*");
                patternCompile.getClass();
                zMatches = patternCompile.matcher(path).matches();
            } else {
                zMatches = false;
            }
            if (zMatches) {
                uri = next.getUri();
                break;
            }
        }
        if (uri != null) {
            LinearLayout linearLayout = this.H;
            if (linearLayout == null) {
                l.i("llPermissionExplanation");
                throw null;
            }
            linearLayout.setVisibility(8);
            RecyclerView recyclerView = this.F;
            if (recyclerView == null) {
                l.i("rvFiles");
                throw null;
            }
            recyclerView.setVisibility(0);
            this.Y = DocumentFile.fromTreeUri(this, uri);
            this.f3382c0 = null;
            W(true);
        }
    }

    @Override // g4.h
    public final void r() {
        i(getString(R.string.core_error_wrong_sdcard_path));
    }

    @Override // g4.h
    public final void s() {
        i(getString(R.string.msg_permission_storage_denied));
    }

    @Override // g4.h
    public final void u() {
        W(true);
        if (k()) {
            return;
        }
        ActivityCompat.requestPermissions(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 645);
    }
}
