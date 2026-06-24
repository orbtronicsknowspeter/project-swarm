package e4;

import android.content.SharedPreferences;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.activities.UserAvatarActivity;
import x4.w2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4518b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.ViewHolder f4519l;

    public /* synthetic */ e0(RecyclerView.ViewHolder viewHolder, int i, int i6) {
        this.f4517a = i6;
        this.f4519l = viewHolder;
        this.f4518b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SharedPreferences sharedPreferences;
        int i;
        int i6 = this.f4517a;
        int i10 = this.f4518b;
        RecyclerView.ViewHolder viewHolder = this.f4519l;
        switch (i6) {
            case 0:
                ((f0) viewHolder).f4529l.b(i10);
                break;
            case 1:
                f0.i iVar = ((y0) viewHolder).f4725b;
                iVar.getClass();
                UserAvatarActivity userAvatarActivity = (UserAvatarActivity) iVar.f4812b;
                int i11 = UserAvatarActivity.V;
                if (userAvatarActivity.z0().f2184e.getValue() != null) {
                    SharedPreferences sharedPreferences2 = userAvatarActivity.getSharedPreferences("SharedPreferencesUser", 0);
                    try {
                        sharedPreferences = userAvatarActivity.getSharedPreferences("SettingsPreferences", 0);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    String string = sharedPreferences.contains("UTOKEN") ? sharedPreferences.getString("UTOKEN", null) : null;
                    if (string != null || sharedPreferences2.getString("is_turbo", null) != null) {
                        Object value = userAvatarActivity.z0().f2184e.getValue();
                        value.getClass();
                        if (((w2) value).d()) {
                            a1 a1Var = userAvatarActivity.Q;
                            if (a1Var == null || a1Var.f != -1) {
                                a1Var.getClass();
                                a1Var.f = -1;
                                a1 a1Var2 = userAvatarActivity.Q;
                                a1Var2.getClass();
                                a1Var2.notifyDataSetChanged();
                            }
                            a1 a1Var3 = userAvatarActivity.R;
                            if (a1Var3 != null) {
                                a1Var3.notifyItemChanged(a1Var3.f);
                            }
                            a1 a1Var4 = userAvatarActivity.R;
                            if (a1Var4 != null) {
                                a1Var4.f = i10;
                            }
                            if (a1Var4 != null) {
                                a1Var4.notifyItemChanged(i10);
                            }
                        }
                    }
                }
                j5.c.e(userAvatarActivity, d0.b.H(userAvatarActivity), null);
                break;
            case 2:
                f0.i iVar2 = ((z0) viewHolder).f4732b;
                iVar2.getClass();
                UserAvatarActivity userAvatarActivity2 = (UserAvatarActivity) iVar2.f4812b;
                a1 a1Var5 = userAvatarActivity2.R;
                if (a1Var5 != null && (i = a1Var5.f) != -1) {
                    a1Var5.notifyItemChanged(i);
                    a1 a1Var6 = userAvatarActivity2.R;
                    a1Var6.getClass();
                    a1Var6.f = -1;
                    a1 a1Var7 = userAvatarActivity2.R;
                    a1Var7.getClass();
                    a1Var7.notifyItemChanged(i10);
                }
                a1 a1Var8 = userAvatarActivity2.Q;
                a1Var8.getClass();
                a1Var8.f = i10;
                a1 a1Var9 = userAvatarActivity2.Q;
                a1Var9.getClass();
                a1Var9.notifyDataSetChanged();
                break;
            default:
                ((m5.q0) viewHolder).f7527b.D(i10);
                break;
        }
    }

    public /* synthetic */ e0(RecyclerView.ViewHolder viewHolder, x4.i iVar, int i, int i6) {
        this.f4517a = i6;
        this.f4519l = viewHolder;
        this.f4518b = i;
    }
}
