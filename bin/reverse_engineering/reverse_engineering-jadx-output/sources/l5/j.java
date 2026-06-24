package l5;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7141a;

    public j(int i) {
        this.f7141a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.getClass();
        view.getClass();
        recyclerView.getClass();
        state.getClass();
        Context context = view.getContext();
        context.getClass();
        String string = null;
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
            if (sharedPreferences.contains("Language")) {
                string = sharedPreferences.getString("Language", null);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        boolean zA = kotlin.jvm.internal.l.a(string, "ar");
        int i = this.f7141a;
        if (zA) {
            rect.right = i;
            rect.left = 0;
            if (recyclerView.getChildLayoutPosition(view) == state.getItemCount() - 1) {
                rect.left = i;
                return;
            }
            return;
        }
        rect.left = i;
        rect.right = 0;
        if (recyclerView.getChildLayoutPosition(view) == state.getItemCount() - 1) {
            rect.right = i;
        }
    }
}
