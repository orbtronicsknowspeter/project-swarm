package g4;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.MimeTypeMap;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.appcompat.widget.Toolbar;
import androidx.documentfile.provider.DocumentFile;
import com.uptodown.R;
import com.uptodown.core.activities.FileExplorerActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements ActivityResultCallback, Toolbar.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FileExplorerActivity f5196a;

    public /* synthetic */ j(FileExplorerActivity fileExplorerActivity) {
        this.f5196a = fileExplorerActivity;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void onActivityResult(Object obj) {
        Bundle extras;
        ActivityResult activityResult = (ActivityResult) obj;
        int i = FileExplorerActivity.f3380q0;
        if (activityResult.getResultCode() == 145) {
            Intent data = activityResult.getData();
            String string = (data == null || (extras = data.getExtras()) == null) ? null : extras.getString("path_selected");
            FileExplorerActivity fileExplorerActivity = this.f5196a;
            fileExplorerActivity.f3390k0 = string;
            if (string != null) {
                fileExplorerActivity.f3389j0 = null;
                TextView textView = fileExplorerActivity.L;
                if (textView != null) {
                    textView.setText(string);
                    return;
                } else {
                    kotlin.jvm.internal.l.i("tvSelectedPath");
                    throw null;
                }
            }
            Intent data2 = activityResult.getData();
            Uri data3 = data2 != null ? data2.getData() : null;
            if (data3 != null) {
                fileExplorerActivity.f3389j0 = data3;
                fileExplorerActivity.f3390k0 = null;
                String lastPathSegment = data3.getLastPathSegment();
                lastPathSegment.getClass();
                String strSubstring = lastPathSegment.substring(l7.m.A0(":", lastPathSegment, 6) + 1);
                TextView textView2 = fileExplorerActivity.L;
                if (textView2 == null) {
                    kotlin.jvm.internal.l.i("tvSelectedPath");
                    throw null;
                }
                textView2.setText(fileExplorerActivity.getString(R.string.sd_card) + "/" + strSubstring);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem menuItem) {
        EditText editText;
        TextView textView;
        boolean z9;
        AlertDialog alertDialog;
        EditText editText2;
        TextView textView2;
        int i;
        AlertDialog alertDialog2;
        int i6 = FileExplorerActivity.f3380q0;
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        final FileExplorerActivity fileExplorerActivity = this.f5196a;
        Integer numValueOf = null;
        if (itemId != R.id.action_create) {
            if (itemId == R.id.action_delete) {
                AlertDialog alertDialog3 = fileExplorerActivity.S;
                if (alertDialog3 != null) {
                    alertDialog3.dismiss();
                }
                View viewInflate = fileExplorerActivity.getLayoutInflater().inflate(R.layout.dialog_accept_cancel, (ViewGroup) null, false);
                TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_dialog_msg);
                textView3.setTypeface(f4.c.f4884x);
                Context context = textView3.getContext();
                i4.b bVar = fileExplorerActivity.V;
                if (bVar != null) {
                    boolean[] zArr = bVar.f5659d;
                    if (zArr != null) {
                        i = 0;
                        for (boolean z10 : zArr) {
                            if (z10) {
                                i++;
                            }
                        }
                    } else {
                        i = 0;
                    }
                    numValueOf = Integer.valueOf(i);
                }
                textView3.setText(context.getString(R.string.core_delete_x_files, String.valueOf(numValueOf)));
                TextView textView4 = (TextView) viewInflate.findViewById(R.id.tv_accept_option);
                textView4.setText(fileExplorerActivity.getString(R.string.option_button_delete));
                textView4.setTypeface(f4.c.f4883w);
                textView4.setOnClickListener(new g(fileExplorerActivity, 11));
                TextView textView5 = (TextView) viewInflate.findViewById(R.id.tv_cancel_option);
                textView5.setText(fileExplorerActivity.getString(R.string.option_button_cancel));
                textView5.setTypeface(f4.c.f4883w);
                textView5.setOnClickListener(new g(fileExplorerActivity, 12));
                AlertDialog.Builder builder = new AlertDialog.Builder(fileExplorerActivity);
                builder.setView(viewInflate);
                AlertDialog alertDialogCreate = builder.create();
                fileExplorerActivity.S = alertDialogCreate;
                alertDialogCreate.getClass();
                Window window = alertDialogCreate.getWindow();
                if (window != null) {
                    a4.x.y(window, 0);
                }
                AlertDialog alertDialog4 = fileExplorerActivity.S;
                alertDialog4.getClass();
                alertDialog4.show();
                return true;
            }
            if (itemId != R.id.action_compress) {
                if (itemId == R.id.action_copy) {
                    v7.e eVar = o7.m0.f8289a;
                    o7.c0.s(o7.c0.b(v7.d.f10885a), null, null, new o(fileExplorerActivity, (t6.c) null, 0), 3);
                    return true;
                }
                if (itemId == R.id.action_cut) {
                    fileExplorerActivity.f3386g0 = true;
                    v7.e eVar2 = o7.m0.f8289a;
                    o7.c0.s(o7.c0.b(v7.d.f10885a), null, null, new o(fileExplorerActivity, (t6.c) null, 1), 3);
                    return true;
                }
                if (itemId != R.id.action_paste) {
                    return true;
                }
                if (fileExplorerActivity.f3382c0 != null) {
                    ArrayList arrayList = fileExplorerActivity.f3385f0;
                    arrayList.getClass();
                    File file = fileExplorerActivity.f3382c0;
                    file.getClass();
                    new j4.o(arrayList, file, fileExplorerActivity.f3392m0, fileExplorerActivity.f3386g0, fileExplorerActivity);
                    return true;
                }
                if (fileExplorerActivity.Y == null) {
                    return true;
                }
                ArrayList arrayList2 = fileExplorerActivity.f3385f0;
                arrayList2.getClass();
                DocumentFile documentFile = fileExplorerActivity.Y;
                documentFile.getClass();
                new j4.o(arrayList2, documentFile, fileExplorerActivity.f3392m0, fileExplorerActivity.f3386g0, fileExplorerActivity);
                return true;
            }
            if (!fileExplorerActivity.isFinishing()) {
                AlertDialog.Builder builder2 = new AlertDialog.Builder(fileExplorerActivity);
                LayoutInflater layoutInflater = fileExplorerActivity.getLayoutInflater();
                layoutInflater.getClass();
                View viewInflate2 = layoutInflater.inflate(R.layout.dialog_compress_files, (ViewGroup) null, false);
                ((TextView) viewInflate2.findViewById(R.id.tv_dialog_title_compress)).setTypeface(f4.c.f4883w);
                TextView textView6 = (TextView) viewInflate2.findViewById(R.id.tv_dialog_file_name_compress);
                textView6.setTypeface(f4.c.f4884x);
                RelativeLayout relativeLayout = (RelativeLayout) viewInflate2.findViewById(R.id.rl_dialog_file_name_compress);
                EditText editText3 = (EditText) viewInflate2.findViewById(R.id.et_dialog_file_name_compress);
                editText3.setTypeface(f4.c.f4884x);
                TextView textView7 = (TextView) viewInflate2.findViewById(R.id.tv_dialog_file_name_extension);
                textView7.setTypeface(f4.c.f4884x);
                textView7.setText(".zip");
                ((TextView) viewInflate2.findViewById(R.id.tv_dialog_selected_files_title)).setTypeface(f4.c.f4884x);
                TextView textView8 = (TextView) viewInflate2.findViewById(R.id.tv_dialog_selected_files);
                textView8.setTypeface(f4.c.f4884x);
                TextView textView9 = (TextView) viewInflate2.findViewById(R.id.tv_progress_count_files);
                textView9.setTypeface(f4.c.f4883w);
                TextView textView10 = (TextView) viewInflate2.findViewById(R.id.tv_accept_option_compress);
                textView10.setTypeface(f4.c.f4883w);
                TextView textView11 = (TextView) viewInflate2.findViewById(R.id.tv_cancel_option_compress);
                textView11.setTypeface(f4.c.f4883w);
                ProgressBar progressBar = (ProgressBar) viewInflate2.findViewById(R.id.pb_dialog_compress);
                i4.b bVar2 = fileExplorerActivity.V;
                bVar2.getClass();
                final ArrayList arrayListA = bVar2.a();
                final ArrayList arrayList3 = new ArrayList();
                if (arrayListA.isEmpty()) {
                    editText = editText3;
                    textView = textView9;
                    z9 = true;
                } else {
                    Iterator it = arrayListA.iterator();
                    it.getClass();
                    z9 = true;
                    String strK = "";
                    while (it.hasNext()) {
                        Object next = it.next();
                        next.getClass();
                        if (next instanceof File) {
                            editText2 = editText3;
                            textView2 = textView9;
                            strK = strK + ((File) next).getName() + "\n";
                            arrayList3.add(next);
                        } else {
                            editText2 = editText3;
                            textView2 = textView9;
                            if (next instanceof DocumentFile) {
                                strK = a4.x.k(strK, ((DocumentFile) next).getName(), "\n");
                            }
                        }
                        textView9 = textView2;
                        editText3 = editText2;
                    }
                    editText = editText3;
                    textView = textView9;
                    textView8.setText(strK);
                }
                final kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                final u uVar = new u(progressBar, textView, editText, fileExplorerActivity, textView10, textView6, relativeLayout, textView11);
                final EditText editText4 = editText;
                textView10.setOnClickListener(new View.OnClickListener() { // from class: g4.k
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        String mimeTypeFromExtension;
                        int i10 = FileExplorerActivity.f3380q0;
                        EditText editText5 = editText4;
                        int length = editText5.getText().toString().length();
                        FileExplorerActivity fileExplorerActivity2 = fileExplorerActivity;
                        if (length <= 0) {
                            String string = fileExplorerActivity2.getString(R.string.core_compress_dialog_file_name_empty);
                            string.getClass();
                            fileExplorerActivity2.A(string);
                            return;
                        }
                        ArrayList arrayList4 = arrayListA;
                        if (arrayList4.isEmpty()) {
                            return;
                        }
                        File file2 = fileExplorerActivity2.f3382c0;
                        kotlin.jvm.internal.x xVar2 = xVar;
                        u uVar2 = uVar;
                        if (file2 != null) {
                            long usableSpace = file2.getUsableSpace();
                            ArrayList arrayList5 = arrayList3;
                            int size = arrayList5.size();
                            int i11 = 0;
                            long length2 = 0;
                            while (i11 < size) {
                                Object obj = arrayList5.get(i11);
                                i11++;
                                length2 = ((File) obj).length() + length2;
                            }
                            if (usableSpace <= length2 * ((long) 2)) {
                                String string2 = fileExplorerActivity2.getString(R.string.error_not_enough_space);
                                string2.getClass();
                                fileExplorerActivity2.A(string2);
                                return;
                            }
                            File file3 = fileExplorerActivity2.f3382c0;
                            File file4 = new File((file3 != null ? file3.getAbsolutePath() : null) + "/" + ((Object) editText5.getText()) + ".zip");
                            if (file4.exists()) {
                                String string3 = fileExplorerActivity2.getString(R.string.core_compress_dialog_file_name_already_exists, editText5.getText());
                                string3.getClass();
                                fileExplorerActivity2.A(string3);
                                return;
                            } else {
                                Activity activity = f4.c.f4876o;
                                t0.f.h(fileExplorerActivity2, editText5);
                                v7.e eVar3 = o7.m0.f8289a;
                                xVar2.f7025a = o7.c0.s(o7.c0.b(v7.d.f10885a), null, null, new b.m(arrayList5, file4, uVar2, fileExplorerActivity2, (t6.c) null, 7), 3);
                                return;
                            }
                        }
                        if (fileExplorerActivity2.Y != null) {
                            ArrayList arrayList6 = new ArrayList();
                            Iterator it2 = arrayList4.iterator();
                            it2.getClass();
                            while (it2.hasNext()) {
                                Object next2 = it2.next();
                                next2.getClass();
                                if (next2 instanceof DocumentFile) {
                                    arrayList6.add(next2);
                                }
                            }
                            Context applicationContext = fileExplorerActivity2.getApplicationContext();
                            applicationContext.getClass();
                            DocumentFile documentFile2 = fileExplorerActivity2.Y;
                            documentFile2.getClass();
                            long jC = n4.d.c(applicationContext, documentFile2);
                            int size2 = arrayList6.size();
                            int i12 = 0;
                            long length3 = 0;
                            while (i12 < size2) {
                                Object obj2 = arrayList6.get(i12);
                                i12++;
                                length3 = ((DocumentFile) obj2).length() + length3;
                            }
                            if (jC > length3 * ((long) 2)) {
                                String str = ((Object) editText5.getText()) + ".zip";
                                DocumentFile documentFile3 = fileExplorerActivity2.Y;
                                documentFile3.getClass();
                                DocumentFile[] documentFileArrListFiles = documentFile3.listFiles();
                                documentFileArrListFiles.getClass();
                                boolean z11 = false;
                                for (DocumentFile documentFile4 : documentFileArrListFiles) {
                                    if (kotlin.jvm.internal.l.a(documentFile4.getName(), str)) {
                                        String string4 = fileExplorerActivity2.getString(R.string.core_compress_dialog_file_name_already_exists, editText5.getText());
                                        string4.getClass();
                                        fileExplorerActivity2.A(string4);
                                        z11 = true;
                                    }
                                }
                                if (z11) {
                                    return;
                                }
                                Activity activity2 = f4.c.f4876o;
                                t0.f.h(fileExplorerActivity2, editText5);
                                DocumentFile documentFile5 = fileExplorerActivity2.Y;
                                documentFile5.getClass();
                                String strSubstring = l7.m.y0(str, ".", 0, false, 6) > 0 ? str.substring(l7.m.A0(".", str, 6) + 1) : "";
                                if (strSubstring.equalsIgnoreCase("xapk")) {
                                    mimeTypeFromExtension = "application/xapk-package-archive";
                                } else {
                                    MimeTypeMap singleton = MimeTypeMap.getSingleton();
                                    Locale locale = Locale.getDefault();
                                    locale.getClass();
                                    String lowerCase = strSubstring.toLowerCase(locale);
                                    lowerCase.getClass();
                                    mimeTypeFromExtension = singleton.getMimeTypeFromExtension(lowerCase);
                                    if (mimeTypeFromExtension == null) {
                                        mimeTypeFromExtension = "application/octet-stream";
                                    }
                                }
                                DocumentFile documentFileCreateFile = documentFile5.createFile(mimeTypeFromExtension, str);
                                documentFileCreateFile.getClass();
                                v7.e eVar4 = o7.m0.f8289a;
                                xVar2.f7025a = o7.c0.s(o7.c0.b(v7.d.f10885a), null, null, new b.m(arrayList6, documentFileCreateFile, uVar2, fileExplorerActivity2, (t6.c) null, 6), 3);
                            }
                        }
                    }
                });
                textView11.setOnClickListener(new l(xVar, fileExplorerActivity, 0));
                builder2.setView(viewInflate2);
                fileExplorerActivity.S = builder2.create();
                if (fileExplorerActivity.isFinishing() || (alertDialog = fileExplorerActivity.S) == null) {
                    return z9;
                }
                Window window2 = alertDialog.getWindow();
                if (window2 != null) {
                    a4.x.y(window2, 0);
                }
                AlertDialog alertDialog5 = fileExplorerActivity.S;
                alertDialog5.getClass();
                alertDialog5.show();
                return z9;
            }
        } else if (!fileExplorerActivity.isFinishing()) {
            AlertDialog.Builder builder3 = new AlertDialog.Builder(fileExplorerActivity);
            LayoutInflater layoutInflater2 = fileExplorerActivity.getLayoutInflater();
            layoutInflater2.getClass();
            View viewInflate3 = layoutInflater2.inflate(R.layout.dialog_create, (ViewGroup) null, false);
            ((TextView) viewInflate3.findViewById(R.id.tv_dialog_title_create)).setTypeface(f4.c.f4883w);
            ((TextView) viewInflate3.findViewById(R.id.tv_dialog_file_name_create)).setTypeface(f4.c.f4884x);
            EditText editText5 = (EditText) viewInflate3.findViewById(R.id.et_dialog_file_name_create);
            editText5.setTypeface(f4.c.f4884x);
            TextView textView12 = (TextView) viewInflate3.findViewById(R.id.tv_accept_option_create);
            textView12.setTypeface(f4.c.f4883w);
            TextView textView13 = (TextView) viewInflate3.findViewById(R.id.tv_cancel_option_create);
            textView13.setTypeface(f4.c.f4883w);
            textView12.setOnClickListener(new c.e(28, editText5, fileExplorerActivity));
            textView13.setOnClickListener(new g(fileExplorerActivity, 6));
            builder3.setView(viewInflate3);
            fileExplorerActivity.S = builder3.create();
            if (!fileExplorerActivity.isFinishing() && (alertDialog2 = fileExplorerActivity.S) != null) {
                Window window3 = alertDialog2.getWindow();
                if (window3 != null) {
                    a4.x.y(window3, 0);
                }
                AlertDialog alertDialog6 = fileExplorerActivity.S;
                alertDialog6.getClass();
                alertDialog6.show();
                return true;
            }
        }
        return true;
    }
}
