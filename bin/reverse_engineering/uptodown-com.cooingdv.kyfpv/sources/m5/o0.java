package m5;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import c4.a7;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.PreregistrationActivity;
import x4.u2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class o0 extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g4.v f7491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f7492b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f0.i f7493l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f7494m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(g4.v vVar, Context context, f0.i iVar) {
        super((RelativeLayout) vVar.f5279n);
        context.getClass();
        this.f7491a = vVar;
        this.f7492b = context;
        this.f7493l = iVar;
        this.f7494m = true;
        final int i = 0;
        ((RelativeLayout) vVar.f5281p).setOnClickListener(new View.OnClickListener(this) { // from class: m5.n0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o0 f7485b;

            {
                this.f7485b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int bindingAdapterPosition;
                e4.d0 d0Var;
                int bindingAdapterPosition2;
                int i6 = i;
                o0 o0Var = this.f7485b;
                switch (i6) {
                    case 0:
                        f0.i iVar2 = o0Var.f7493l;
                        if (iVar2 != null && (bindingAdapterPosition = o0Var.getBindingAdapterPosition()) != -1) {
                            PreregistrationActivity preregistrationActivity = (PreregistrationActivity) iVar2.f4812b;
                            float f = UptodownApp.I;
                            if (b4.d.t() && (d0Var = preregistrationActivity.Q) != null && !d0Var.f4511c.isEmpty()) {
                                e4.d0 d0Var2 = preregistrationActivity.Q;
                                d0Var2.getClass();
                                Object obj = d0Var2.f4511c.get(bindingAdapterPosition);
                                obj.getClass();
                                preregistrationActivity.i0(((x4.x1) obj).f11449a);
                                break;
                            }
                        }
                        break;
                    default:
                        f0.i iVar3 = o0Var.f7493l;
                        if (iVar3 != null && (bindingAdapterPosition2 = o0Var.getBindingAdapterPosition()) != -1) {
                            PreregistrationActivity preregistrationActivity2 = (PreregistrationActivity) iVar3.f4812b;
                            float f10 = UptodownApp.I;
                            if (b4.d.t() && preregistrationActivity2.T()) {
                                if (u2.h(preregistrationActivity2) != null) {
                                    e4.d0 d0Var3 = preregistrationActivity2.Q;
                                    d0Var3.getClass();
                                    Object obj2 = d0Var3.f4511c.get(bindingAdapterPosition2);
                                    obj2.getClass();
                                    x4.x1 x1Var = (x4.x1) obj2;
                                    if (!preregistrationActivity2.isFinishing()) {
                                        AlertDialog alertDialog = preregistrationActivity2.F;
                                        if (alertDialog != null) {
                                            alertDialog.dismiss();
                                        }
                                        g4.v vVarE = g4.v.e(preregistrationActivity2.getLayoutInflater());
                                        TextView textView = (TextView) vVarE.f5277l;
                                        TextView textView2 = (TextView) vVarE.f5281p;
                                        TextView textView3 = (TextView) vVarE.f5278m;
                                        TextView textView4 = (TextView) vVarE.f5276b;
                                        textView2.setTypeface(f4.c.f4883w);
                                        textView2.setText(preregistrationActivity2.getString(R.string.cancel_registration));
                                        textView.setTypeface(f4.c.f4884x);
                                        String string = preregistrationActivity2.getString(R.string.confirm_cancel_preregister, x1Var.f11450b);
                                        string.getClass();
                                        String str = x1Var.f11450b;
                                        str.getClass();
                                        SpannableString spannableString = new SpannableString(string);
                                        int iY0 = l7.m.y0(string, str, 0, false, 6);
                                        int length = str.length() + iY0;
                                        if (iY0 != -1) {
                                            float dimension = preregistrationActivity2.getResources().getDimension(R.dimen.text_size_m);
                                            Typeface typeface = f4.c.f4883w;
                                            typeface.getClass();
                                            spannableString.setSpan(new j5.e(dimension, typeface, ContextCompat.getColor(preregistrationActivity2, R.color.text_primary)), iY0, length, 33);
                                        }
                                        textView.setText(spannableString);
                                        textView4.setTypeface(f4.c.f4883w);
                                        textView3.setTypeface(f4.c.f4883w);
                                        textView3.setText(preregistrationActivity2.getString(R.string.dialog_confirmation_verify_afirmative));
                                        textView4.setVisibility(0);
                                        textView4.setOnClickListener(new a7(preregistrationActivity2, 4));
                                        textView3.setOnClickListener(new c.e(15, preregistrationActivity2, x1Var));
                                        ((ImageView) vVarE.f5280o).setOnClickListener(new a7(preregistrationActivity2, 5));
                                        AlertDialog.Builder builder = new AlertDialog.Builder(preregistrationActivity2);
                                        builder.setView((RelativeLayout) vVarE.f5279n);
                                        builder.setCancelable(true);
                                        AlertDialog alertDialogCreate = builder.create();
                                        preregistrationActivity2.F = alertDialogCreate;
                                        if (alertDialogCreate != null) {
                                            Window window = alertDialogCreate.getWindow();
                                            if (window != null) {
                                                a4.x.y(window, 0);
                                            }
                                            AlertDialog alertDialog2 = preregistrationActivity2.F;
                                            alertDialog2.getClass();
                                            alertDialog2.show();
                                        }
                                    }
                                } else if (!preregistrationActivity2.isFinishing()) {
                                    AlertDialog alertDialog3 = preregistrationActivity2.F;
                                    if (alertDialog3 != null) {
                                        alertDialog3.dismiss();
                                    }
                                    g4.v vVarE2 = g4.v.e(preregistrationActivity2.getLayoutInflater());
                                    TextView textView5 = (TextView) vVarE2.f5278m;
                                    ((TextView) vVarE2.f5281p).setTypeface(f4.c.f4883w);
                                    ((TextView) vVarE2.f5277l).setTypeface(f4.c.f4884x);
                                    textView5.setTypeface(f4.c.f4883w);
                                    textView5.setOnClickListener(new a7(preregistrationActivity2, 2));
                                    ((ImageView) vVarE2.f5280o).setOnClickListener(new a7(preregistrationActivity2, 3));
                                    AlertDialog.Builder builder2 = new AlertDialog.Builder(preregistrationActivity2);
                                    builder2.setView((RelativeLayout) vVarE2.f5279n);
                                    builder2.setCancelable(true);
                                    AlertDialog alertDialogCreate2 = builder2.create();
                                    preregistrationActivity2.F = alertDialogCreate2;
                                    if (alertDialogCreate2 != null) {
                                        Window window2 = alertDialogCreate2.getWindow();
                                        if (window2 != null) {
                                            a4.x.y(window2, 0);
                                        }
                                        AlertDialog alertDialog4 = preregistrationActivity2.F;
                                        alertDialog4.getClass();
                                        alertDialog4.show();
                                    }
                                }
                                break;
                            }
                        }
                        break;
                }
            }
        });
        TextView textView = (TextView) vVar.f5276b;
        final int i6 = 1;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: m5.n0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o0 f7485b;

            {
                this.f7485b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int bindingAdapterPosition;
                e4.d0 d0Var;
                int bindingAdapterPosition2;
                int i62 = i6;
                o0 o0Var = this.f7485b;
                switch (i62) {
                    case 0:
                        f0.i iVar2 = o0Var.f7493l;
                        if (iVar2 != null && (bindingAdapterPosition = o0Var.getBindingAdapterPosition()) != -1) {
                            PreregistrationActivity preregistrationActivity = (PreregistrationActivity) iVar2.f4812b;
                            float f = UptodownApp.I;
                            if (b4.d.t() && (d0Var = preregistrationActivity.Q) != null && !d0Var.f4511c.isEmpty()) {
                                e4.d0 d0Var2 = preregistrationActivity.Q;
                                d0Var2.getClass();
                                Object obj = d0Var2.f4511c.get(bindingAdapterPosition);
                                obj.getClass();
                                preregistrationActivity.i0(((x4.x1) obj).f11449a);
                                break;
                            }
                        }
                        break;
                    default:
                        f0.i iVar3 = o0Var.f7493l;
                        if (iVar3 != null && (bindingAdapterPosition2 = o0Var.getBindingAdapterPosition()) != -1) {
                            PreregistrationActivity preregistrationActivity2 = (PreregistrationActivity) iVar3.f4812b;
                            float f10 = UptodownApp.I;
                            if (b4.d.t() && preregistrationActivity2.T()) {
                                if (u2.h(preregistrationActivity2) != null) {
                                    e4.d0 d0Var3 = preregistrationActivity2.Q;
                                    d0Var3.getClass();
                                    Object obj2 = d0Var3.f4511c.get(bindingAdapterPosition2);
                                    obj2.getClass();
                                    x4.x1 x1Var = (x4.x1) obj2;
                                    if (!preregistrationActivity2.isFinishing()) {
                                        AlertDialog alertDialog = preregistrationActivity2.F;
                                        if (alertDialog != null) {
                                            alertDialog.dismiss();
                                        }
                                        g4.v vVarE = g4.v.e(preregistrationActivity2.getLayoutInflater());
                                        TextView textView2 = (TextView) vVarE.f5277l;
                                        TextView textView22 = (TextView) vVarE.f5281p;
                                        TextView textView3 = (TextView) vVarE.f5278m;
                                        TextView textView4 = (TextView) vVarE.f5276b;
                                        textView22.setTypeface(f4.c.f4883w);
                                        textView22.setText(preregistrationActivity2.getString(R.string.cancel_registration));
                                        textView2.setTypeface(f4.c.f4884x);
                                        String string = preregistrationActivity2.getString(R.string.confirm_cancel_preregister, x1Var.f11450b);
                                        string.getClass();
                                        String str = x1Var.f11450b;
                                        str.getClass();
                                        SpannableString spannableString = new SpannableString(string);
                                        int iY0 = l7.m.y0(string, str, 0, false, 6);
                                        int length = str.length() + iY0;
                                        if (iY0 != -1) {
                                            float dimension = preregistrationActivity2.getResources().getDimension(R.dimen.text_size_m);
                                            Typeface typeface = f4.c.f4883w;
                                            typeface.getClass();
                                            spannableString.setSpan(new j5.e(dimension, typeface, ContextCompat.getColor(preregistrationActivity2, R.color.text_primary)), iY0, length, 33);
                                        }
                                        textView2.setText(spannableString);
                                        textView4.setTypeface(f4.c.f4883w);
                                        textView3.setTypeface(f4.c.f4883w);
                                        textView3.setText(preregistrationActivity2.getString(R.string.dialog_confirmation_verify_afirmative));
                                        textView4.setVisibility(0);
                                        textView4.setOnClickListener(new a7(preregistrationActivity2, 4));
                                        textView3.setOnClickListener(new c.e(15, preregistrationActivity2, x1Var));
                                        ((ImageView) vVarE.f5280o).setOnClickListener(new a7(preregistrationActivity2, 5));
                                        AlertDialog.Builder builder = new AlertDialog.Builder(preregistrationActivity2);
                                        builder.setView((RelativeLayout) vVarE.f5279n);
                                        builder.setCancelable(true);
                                        AlertDialog alertDialogCreate = builder.create();
                                        preregistrationActivity2.F = alertDialogCreate;
                                        if (alertDialogCreate != null) {
                                            Window window = alertDialogCreate.getWindow();
                                            if (window != null) {
                                                a4.x.y(window, 0);
                                            }
                                            AlertDialog alertDialog2 = preregistrationActivity2.F;
                                            alertDialog2.getClass();
                                            alertDialog2.show();
                                        }
                                    }
                                } else if (!preregistrationActivity2.isFinishing()) {
                                    AlertDialog alertDialog3 = preregistrationActivity2.F;
                                    if (alertDialog3 != null) {
                                        alertDialog3.dismiss();
                                    }
                                    g4.v vVarE2 = g4.v.e(preregistrationActivity2.getLayoutInflater());
                                    TextView textView5 = (TextView) vVarE2.f5278m;
                                    ((TextView) vVarE2.f5281p).setTypeface(f4.c.f4883w);
                                    ((TextView) vVarE2.f5277l).setTypeface(f4.c.f4884x);
                                    textView5.setTypeface(f4.c.f4883w);
                                    textView5.setOnClickListener(new a7(preregistrationActivity2, 2));
                                    ((ImageView) vVarE2.f5280o).setOnClickListener(new a7(preregistrationActivity2, 3));
                                    AlertDialog.Builder builder2 = new AlertDialog.Builder(preregistrationActivity2);
                                    builder2.setView((RelativeLayout) vVarE2.f5279n);
                                    builder2.setCancelable(true);
                                    AlertDialog alertDialogCreate2 = builder2.create();
                                    preregistrationActivity2.F = alertDialogCreate2;
                                    if (alertDialogCreate2 != null) {
                                        Window window2 = alertDialogCreate2.getWindow();
                                        if (window2 != null) {
                                            a4.x.y(window2, 0);
                                        }
                                        AlertDialog alertDialog4 = preregistrationActivity2.F;
                                        alertDialog4.getClass();
                                        alertDialog4.show();
                                    }
                                }
                                break;
                            }
                        }
                        break;
                }
            }
        });
        ((TextView) vVar.f5278m).setTypeface(f4.c.f4883w);
        textView.setTypeface(f4.c.f4883w);
        ((TextView) vVar.f5277l).setTypeface(f4.c.f4884x);
    }
}
