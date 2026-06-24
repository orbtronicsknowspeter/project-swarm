package e4;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import c4.c6;
import com.uptodown.R;
import java.util.ArrayList;
import m5.z1;
import x4.b3;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class f1 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t4.n0 f4532b;

    public f1(ArrayList arrayList, t4.n0 n0Var) {
        arrayList.getClass();
        this.f4531a = arrayList;
        this.f4532b = n0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f4531a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        z1 z1Var = (z1) viewHolder;
        z1Var.getClass();
        Object obj = this.f4531a.get(i);
        obj.getClass();
        b3 b3Var = (b3) obj;
        int i6 = b3Var.f11068l;
        y2.s sVar = z1Var.f7654a;
        if (i6 == 1) {
            ((TextView) sVar.f11758m).setText(((RelativeLayout) sVar.f11756b).getContext().getString(R.string.current_device_tag));
        } else {
            ((TextView) sVar.f11758m).setText(b3Var.f11067b);
        }
        if (b3Var.f11069m == 1) {
            RelativeLayout relativeLayout = (RelativeLayout) sVar.f11756b;
            CheckBox checkBox = (CheckBox) sVar.f11757l;
            TextView textView = (TextView) sVar.f11759n;
            relativeLayout.setAlpha(1.0f);
            checkBox.setVisibility(8);
            textView.setVisibility(0);
            textView.setText(relativeLayout.getContext().getString(R.string.app_installed));
            textView.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(relativeLayout.getContext(), R.drawable.vector_installed_check), (Drawable) null, (Drawable) null, (Drawable) null);
            relativeLayout.setOnClickListener(null);
            checkBox.setOnCheckedChangeListener(null);
            return;
        }
        if (b3Var.f11070n != 1) {
            RelativeLayout relativeLayout2 = (RelativeLayout) sVar.f11756b;
            CheckBox checkBox2 = (CheckBox) sVar.f11757l;
            TextView textView2 = (TextView) sVar.f11759n;
            relativeLayout2.setAlpha(0.3f);
            checkBox2.setVisibility(8);
            textView2.setVisibility(0);
            textView2.setText(relativeLayout2.getContext().getString(R.string.device_not_compatible));
            textView2.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(relativeLayout2.getContext(), R.drawable.vector_incompatible), (Drawable) null, (Drawable) null, (Drawable) null);
            relativeLayout2.setOnClickListener(null);
            checkBox2.setOnCheckedChangeListener(null);
            return;
        }
        CheckBox checkBox3 = (CheckBox) sVar.f11757l;
        TextView textView3 = (TextView) sVar.f11759n;
        RelativeLayout relativeLayout3 = (RelativeLayout) sVar.f11756b;
        checkBox3.setVisibility(0);
        if (b3Var.f11071o != 1) {
            relativeLayout3.setAlpha(1.0f);
            checkBox3.setClickable(true);
            checkBox3.setChecked(false);
            textView3.setVisibility(8);
            textView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            relativeLayout3.setOnClickListener(new m5.u0(z1Var, 5));
            checkBox3.setOnCheckedChangeListener(new c6(z1Var, 4));
            return;
        }
        relativeLayout3.setAlpha(0.3f);
        checkBox3.setClickable(false);
        checkBox3.setChecked(true);
        textView3.setVisibility(0);
        textView3.setText(relativeLayout3.getContext().getString(R.string.install_pending));
        textView3.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(relativeLayout3.getContext(), R.drawable.vector_pending), (Drawable) null, (Drawable) null, (Drawable) null);
        relativeLayout3.setOnClickListener(null);
        checkBox3.setOnCheckedChangeListener(null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewS = androidx.lifecycle.l.s(viewGroup, R.layout.user_remote_install_device_item, viewGroup, false);
        int i6 = R.id.cb_remote_install_device_item;
        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(viewS, R.id.cb_remote_install_device_item);
        if (checkBox != null) {
            i6 = R.id.iv_remote_install_device_item;
            if (((ImageView) ViewBindings.findChildViewById(viewS, R.id.iv_remote_install_device_item)) != null) {
                i6 = R.id.ll_remote_install_device_item;
                if (((LinearLayout) ViewBindings.findChildViewById(viewS, R.id.ll_remote_install_device_item)) != null) {
                    i6 = R.id.tv_remote_install_device_name_item;
                    TextView textView = (TextView) ViewBindings.findChildViewById(viewS, R.id.tv_remote_install_device_name_item);
                    if (textView != null) {
                        i6 = R.id.tv_remote_install_status_item;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewS, R.id.tv_remote_install_status_item);
                        if (textView2 != null) {
                            return new z1(new y2.s((RelativeLayout) viewS, checkBox, textView, textView2, 17), this.f4532b);
                        }
                    }
                }
            }
        }
        com.google.gson.internal.a.i("Missing required view with ID: ".concat(viewS.getResources().getResourceName(i6)));
        return null;
    }
}
