package m5;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.RecyclerView;
import c4.a6;
import c4.b6;
import com.uptodown.R;
import com.uptodown.activities.NotificationsRegistryActivity;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3.d f7413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f7414b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f7415l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f7416m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f7417n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f7418o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Context f7419p;

    public h0(View view, a3.d dVar) {
        super(view);
        this.f7413a = dVar;
        View viewFindViewById = view.findViewById(R.id.tv_title);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        this.f7414b = textView;
        View viewFindViewById2 = view.findViewById(R.id.tv_msg);
        viewFindViewById2.getClass();
        TextView textView2 = (TextView) viewFindViewById2;
        this.f7415l = textView2;
        View viewFindViewById3 = view.findViewById(R.id.tv_action_01);
        viewFindViewById3.getClass();
        TextView textView3 = (TextView) viewFindViewById3;
        this.f7416m = textView3;
        View viewFindViewById4 = view.findViewById(R.id.tv_action_02);
        viewFindViewById4.getClass();
        TextView textView4 = (TextView) viewFindViewById4;
        this.f7417n = textView4;
        View viewFindViewById5 = view.findViewById(R.id.tv_date);
        viewFindViewById5.getClass();
        TextView textView5 = (TextView) viewFindViewById5;
        this.f7418o = textView5;
        View viewFindViewById6 = view.findViewById(R.id.iv_delete_notification);
        viewFindViewById6.getClass();
        Context context = view.getContext();
        context.getClass();
        this.f7419p = context;
        final int i = 0;
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: m5.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f7398b;

            {
                this.f7398b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int bindingAdapterPosition;
                int bindingAdapterPosition2;
                int bindingAdapterPosition3;
                NotificationsRegistryActivity notificationsRegistryActivity;
                e4.q qVar;
                int i6 = i;
                h0 h0Var = this.f7398b;
                switch (i6) {
                    case 0:
                        a3.d dVar2 = h0Var.f7413a;
                        if (dVar2 != null && (bindingAdapterPosition = h0Var.getBindingAdapterPosition()) != -1) {
                            NotificationsRegistryActivity.y0((NotificationsRegistryActivity) dVar2.f63b, bindingAdapterPosition, 0);
                            break;
                        }
                        break;
                    case 1:
                        a3.d dVar3 = h0Var.f7413a;
                        if (dVar3 != null && (bindingAdapterPosition2 = h0Var.getBindingAdapterPosition()) != -1) {
                            NotificationsRegistryActivity.y0((NotificationsRegistryActivity) dVar3.f63b, bindingAdapterPosition2, 1);
                            break;
                        }
                        break;
                    default:
                        a3.d dVar4 = h0Var.f7413a;
                        if (dVar4 != null && (bindingAdapterPosition3 = h0Var.getBindingAdapterPosition()) != -1 && (qVar = (notificationsRegistryActivity = (NotificationsRegistryActivity) dVar4.f63b).R) != null && qVar.f4658a.size() > bindingAdapterPosition3) {
                            b6 b6VarB0 = notificationsRegistryActivity.B0();
                            e4.q qVar2 = notificationsRegistryActivity.R;
                            qVar2.getClass();
                            int i10 = ((x4.s1) qVar2.f4658a.get(bindingAdapterPosition3)).f11385a;
                            b6VarB0.getClass();
                            o7.a0 viewModelScope = ViewModelKt.getViewModelScope(b6VarB0);
                            v7.e eVar = o7.m0.f8289a;
                            o7.c0.s(viewModelScope, v7.d.f10885a, null, new a6(notificationsRegistryActivity, i10, (t6.c) null), 2);
                            e4.q qVar3 = notificationsRegistryActivity.R;
                            qVar3.getClass();
                            qVar3.f4658a.remove(bindingAdapterPosition3);
                            e4.q qVar4 = notificationsRegistryActivity.R;
                            qVar4.getClass();
                            qVar4.notifyItemRemoved(bindingAdapterPosition3);
                            break;
                        }
                        break;
                }
            }
        });
        final int i6 = 1;
        textView4.setOnClickListener(new View.OnClickListener(this) { // from class: m5.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f7398b;

            {
                this.f7398b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int bindingAdapterPosition;
                int bindingAdapterPosition2;
                int bindingAdapterPosition3;
                NotificationsRegistryActivity notificationsRegistryActivity;
                e4.q qVar;
                int i62 = i6;
                h0 h0Var = this.f7398b;
                switch (i62) {
                    case 0:
                        a3.d dVar2 = h0Var.f7413a;
                        if (dVar2 != null && (bindingAdapterPosition = h0Var.getBindingAdapterPosition()) != -1) {
                            NotificationsRegistryActivity.y0((NotificationsRegistryActivity) dVar2.f63b, bindingAdapterPosition, 0);
                            break;
                        }
                        break;
                    case 1:
                        a3.d dVar3 = h0Var.f7413a;
                        if (dVar3 != null && (bindingAdapterPosition2 = h0Var.getBindingAdapterPosition()) != -1) {
                            NotificationsRegistryActivity.y0((NotificationsRegistryActivity) dVar3.f63b, bindingAdapterPosition2, 1);
                            break;
                        }
                        break;
                    default:
                        a3.d dVar4 = h0Var.f7413a;
                        if (dVar4 != null && (bindingAdapterPosition3 = h0Var.getBindingAdapterPosition()) != -1 && (qVar = (notificationsRegistryActivity = (NotificationsRegistryActivity) dVar4.f63b).R) != null && qVar.f4658a.size() > bindingAdapterPosition3) {
                            b6 b6VarB0 = notificationsRegistryActivity.B0();
                            e4.q qVar2 = notificationsRegistryActivity.R;
                            qVar2.getClass();
                            int i10 = ((x4.s1) qVar2.f4658a.get(bindingAdapterPosition3)).f11385a;
                            b6VarB0.getClass();
                            o7.a0 viewModelScope = ViewModelKt.getViewModelScope(b6VarB0);
                            v7.e eVar = o7.m0.f8289a;
                            o7.c0.s(viewModelScope, v7.d.f10885a, null, new a6(notificationsRegistryActivity, i10, (t6.c) null), 2);
                            e4.q qVar3 = notificationsRegistryActivity.R;
                            qVar3.getClass();
                            qVar3.f4658a.remove(bindingAdapterPosition3);
                            e4.q qVar4 = notificationsRegistryActivity.R;
                            qVar4.getClass();
                            qVar4.notifyItemRemoved(bindingAdapterPosition3);
                            break;
                        }
                        break;
                }
            }
        });
        final int i10 = 2;
        ((ImageView) viewFindViewById6).setOnClickListener(new View.OnClickListener(this) { // from class: m5.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f7398b;

            {
                this.f7398b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int bindingAdapterPosition;
                int bindingAdapterPosition2;
                int bindingAdapterPosition3;
                NotificationsRegistryActivity notificationsRegistryActivity;
                e4.q qVar;
                int i62 = i10;
                h0 h0Var = this.f7398b;
                switch (i62) {
                    case 0:
                        a3.d dVar2 = h0Var.f7413a;
                        if (dVar2 != null && (bindingAdapterPosition = h0Var.getBindingAdapterPosition()) != -1) {
                            NotificationsRegistryActivity.y0((NotificationsRegistryActivity) dVar2.f63b, bindingAdapterPosition, 0);
                            break;
                        }
                        break;
                    case 1:
                        a3.d dVar3 = h0Var.f7413a;
                        if (dVar3 != null && (bindingAdapterPosition2 = h0Var.getBindingAdapterPosition()) != -1) {
                            NotificationsRegistryActivity.y0((NotificationsRegistryActivity) dVar3.f63b, bindingAdapterPosition2, 1);
                            break;
                        }
                        break;
                    default:
                        a3.d dVar4 = h0Var.f7413a;
                        if (dVar4 != null && (bindingAdapterPosition3 = h0Var.getBindingAdapterPosition()) != -1 && (qVar = (notificationsRegistryActivity = (NotificationsRegistryActivity) dVar4.f63b).R) != null && qVar.f4658a.size() > bindingAdapterPosition3) {
                            b6 b6VarB0 = notificationsRegistryActivity.B0();
                            e4.q qVar2 = notificationsRegistryActivity.R;
                            qVar2.getClass();
                            int i102 = ((x4.s1) qVar2.f4658a.get(bindingAdapterPosition3)).f11385a;
                            b6VarB0.getClass();
                            o7.a0 viewModelScope = ViewModelKt.getViewModelScope(b6VarB0);
                            v7.e eVar = o7.m0.f8289a;
                            o7.c0.s(viewModelScope, v7.d.f10885a, null, new a6(notificationsRegistryActivity, i102, (t6.c) null), 2);
                            e4.q qVar3 = notificationsRegistryActivity.R;
                            qVar3.getClass();
                            qVar3.f4658a.remove(bindingAdapterPosition3);
                            e4.q qVar4 = notificationsRegistryActivity.R;
                            qVar4.getClass();
                            qVar4.notifyItemRemoved(bindingAdapterPosition3);
                            break;
                        }
                        break;
                }
            }
        });
        textView.setTypeface(f4.c.f4884x);
        textView2.setTypeface(f4.c.f4884x);
        textView5.setTypeface(f4.c.f4884x);
        textView3.setTypeface(f4.c.f4883w);
        textView4.setTypeface(f4.c.f4883w);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String a(String str) {
        int iHashCode = str.hashCode();
        Context context = this.f7419p;
        switch (iHashCode) {
            case -1569440520:
                if (!str.equals("positive_apps")) {
                    return "";
                }
                String string = context.getString(R.string.title_positive_apps);
                string.getClass();
                return string;
            case -1335458389:
                if (!str.equals("delete")) {
                    return "";
                }
                String string2 = context.getString(R.string.option_button_delete);
                string2.getClass();
                return string2;
            case -504325460:
                if (!str.equals("open_app")) {
                    return "";
                }
                String string3 = context.getString(R.string.open);
                string3.getClass();
                return string3;
            case -234430262:
                if (!str.equals("updates")) {
                    return "";
                }
                String string4 = context.getString(R.string.updates);
                string4.getClass();
                return string4;
            case 212443764:
                str.equals("no_action");
                return "";
            case 1085191854:
                if (!str.equals("update_uptodown")) {
                    return "";
                }
                String string5 = context.getString(R.string.action_update);
                string5.getClass();
                return string5;
            case 1117687366:
                if (!str.equals("preregister")) {
                    return "";
                }
                String string6 = context.getString(R.string.action_app_details_settings);
                string6.getClass();
                return string6;
            case 1312704747:
                if (!str.equals("downloads")) {
                    return "";
                }
                String string7 = context.getString(R.string.downloads_title);
                string7.getClass();
                return string7;
            case 1957569947:
                if (!str.equals("install")) {
                    return "";
                }
                String string8 = context.getString(R.string.option_button_install);
                string8.getClass();
                return string8;
            default:
                return "";
        }
    }
}
