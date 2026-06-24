package e4;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import c4.xd;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import java.util.HashMap;
import x4.d3;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class m1 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w4.j f4629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.a f4630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f4631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f4633e;
    public boolean f;
    public final YouTubePlayerView g;
    public v3.e h;
    public String i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4634k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4635l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4636m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public l5.c f4637n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f4638o;

    public m1(w4.j jVar, w4.a aVar, Context context, String str) {
        SharedPreferences sharedPreferences;
        jVar.getClass();
        aVar.getClass();
        str.getClass();
        this.f4629a = jVar;
        this.f4630b = aVar;
        this.f4631c = context;
        this.f4632d = str;
        this.f4633e = new ArrayList();
        this.i = "";
        this.f4636m = true;
        this.f4638o = 8;
        try {
            sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
        } catch (Exception unused) {
        }
        boolean z9 = sharedPreferences.contains("app_detail_inflate_view_failed") ? sharedPreferences.getBoolean("app_detail_inflate_view_failed", false) : false;
        if (!z9) {
            try {
                YouTubePlayerView youTubePlayerView = new YouTubePlayerView(context);
                youTubePlayerView.setEnableAutomaticInitialization(false);
                this.g = youTubePlayerView;
                a();
            } catch (Exception e10) {
                Context context2 = this.f4631c;
                context2.getClass();
                SharedPreferences sharedPreferences2 = context2.getSharedPreferences("SettingsPreferences", 0);
                sharedPreferences2.getClass();
                SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
                editorEdit.putBoolean("app_detail_inflate_view_failed", true);
                editorEdit.apply();
                this.g = null;
                e10.printStackTrace();
            } catch (UnsatisfiedLinkError e11) {
                Context context3 = this.f4631c;
                context3.getClass();
                SharedPreferences sharedPreferences3 = context3.getSharedPreferences("SettingsPreferences", 0);
                sharedPreferences3.getClass();
                SharedPreferences.Editor editorEdit2 = sharedPreferences3.edit();
                editorEdit2.putBoolean("app_detail_inflate_view_failed", true);
                editorEdit2.apply();
                this.g = null;
                e11.printStackTrace();
            }
        }
        if (kotlin.jvm.internal.l.a(this.f4632d, kotlin.jvm.internal.y.a(u4.m1.class).c())) {
            this.f4638o = 8;
        } else {
            this.f4638o = 20;
        }
        float f = UptodownApp.I;
        this.f4636m = b4.d.e(this.f4631c);
    }

    public final void a() {
        YouTubePlayerView youTubePlayerView = this.g;
        if (youTubePlayerView != null) {
            z3.c cVar = youTubePlayerView.f3285b;
            cVar.removeViews(1, cVar.getChildCount() - 1);
            View viewInflate = View.inflate(cVar.getContext(), R.layout.home_youtube_player_layout, cVar);
            viewInflate.getClass();
            k9.c cVar2 = new k9.c(this.f4631c);
            cVar2.d(0, "controls");
            cVar2.d(0, "rel");
            cVar2.d(3, "iv_load_policy");
            cVar2.d(1, "cc_load_policy");
            youTubePlayerView.a(new xd(1, this, viewInflate), new k9.b(cVar2.f7010b));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f4633e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ArrayList arrayList;
        ImageView imageView;
        SharedPreferences sharedPreferences;
        l1 l1Var = (l1) viewHolder;
        l1Var.getClass();
        RelativeLayout relativeLayout = l1Var.f4612p;
        ImageView imageView2 = l1Var.f4611o;
        int i6 = i + 1;
        Context context = this.f4631c;
        context.getClass();
        try {
            sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
        } catch (Exception unused) {
        }
        boolean z9 = sharedPreferences.contains("app_detail_inflate_view_failed") ? sharedPreferences.getBoolean("app_detail_inflate_view_failed", false) : false;
        ArrayList arrayList2 = this.f4633e;
        if (z9 || i != this.f4634k) {
            Object obj = arrayList2.get(i);
            obj.getClass();
            l1Var.g((x4.g) obj, i6);
            return;
        }
        Object obj2 = arrayList2.get(i);
        obj2.getClass();
        x4.g gVar = (x4.g) obj2;
        String str = l1Var.f4610n;
        Context context2 = l1Var.f4609m;
        View view = l1Var.f4620y;
        CardView cardView = l1Var.f4619x;
        Float fValueOf = Float.valueOf(0.0f);
        m1 m1Var = l1Var.A;
        YouTubePlayerView youTubePlayerView = m1Var.g;
        if (youTubePlayerView != null) {
            if (youTubePlayerView.getParent() != null) {
                ViewParent parent = youTubePlayerView.getParent();
                parent.getClass();
                ((ViewGroup) parent).removeView(youTubePlayerView);
            }
            cardView.addView(youTubePlayerView);
            cardView.setVisibility(0);
            view.setVisibility(0);
            imageView2.setVisibility(8);
            l5.c cVar = m1Var.f4637n;
            if (cVar != null && (imageView = cVar.f7132b) != null) {
                imageView.setImageDrawable(null);
            }
            m5.e.f(gVar, l1Var.f4615s, l1Var.f4616t);
            m5.e.b(relativeLayout, l1Var.f4607b, gVar);
            l1.h(imageView2, gVar);
            l1Var.e(l1Var.f4614r, gVar.i());
            l1Var.c(gVar, l1Var.f4613q, l1Var.f4614r, l1Var.f4616t, l1Var.v, l1Var.f4617u, l1Var.f4618w);
            view.setOnClickListener(new c4.d(m1Var, 17));
            relativeLayout.setOnLongClickListener(new k1(l1Var, gVar, i6, 0));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(l1Var.f4621z, -1);
            View view2 = l1Var.itemView;
            m5.e.a(layoutParams, context2, i6, m1Var.f4638o);
            view2.setLayoutParams(layoutParams);
            if (m1Var.f4635l && m1Var.h != null && (arrayList = gVar.Y) != null && !arrayList.isEmpty()) {
                ArrayList arrayList3 = gVar.Y;
                arrayList3.getClass();
                if (((d3) arrayList3.get(0)).f11120a != null) {
                    ArrayList arrayList4 = gVar.Y;
                    arrayList4.getClass();
                    if (!kotlin.jvm.internal.l.a(((d3) arrayList4.get(0)).f11120a, m1Var.j)) {
                        ArrayList arrayList5 = gVar.Y;
                        arrayList5.getClass();
                        m1Var.j = ((d3) arrayList5.get(0)).f11120a;
                        String str2 = gVar.f11160b;
                        str2.getClass();
                        m1Var.i = str2 + str;
                        if (kotlin.jvm.internal.l.a(str, kotlin.jvm.internal.y.a(u4.m1.class).c())) {
                            float f = UptodownApp.I;
                            UptodownApp.Z = m1Var.h;
                        } else {
                            float f10 = UptodownApp.I;
                            UptodownApp.a0 = m1Var.h;
                        }
                        float f11 = UptodownApp.I;
                        if (b4.d.e(context2)) {
                            HashMap map = UptodownApp.f3289b0;
                            boolean zContainsKey = map.containsKey(m1Var.i);
                            v3.e eVar = m1Var.h;
                            if (zContainsKey) {
                                eVar.getClass();
                                ArrayList arrayList6 = gVar.Y;
                                arrayList6.getClass();
                                String str3 = ((d3) arrayList6.get(0)).f11120a;
                                str3.getClass();
                                Object obj3 = map.get(m1Var.i);
                                obj3.getClass();
                                ((z3.g) eVar).d(str3, ((Number) obj3).floatValue());
                            } else {
                                eVar.getClass();
                                ArrayList arrayList7 = gVar.Y;
                                arrayList7.getClass();
                                String str4 = ((d3) arrayList7.get(0)).f11120a;
                                str4.getClass();
                                ((z3.g) eVar).d(str4, 0.0f);
                                map.put(m1Var.i, fValueOf);
                            }
                            boolean z10 = m1Var.f;
                            v3.e eVar2 = m1Var.h;
                            if (z10) {
                                eVar2.getClass();
                                ((z3.g) eVar2).f();
                                return;
                            } else {
                                eVar2.getClass();
                                ((z3.g) eVar2).e();
                                return;
                            }
                        }
                        HashMap map2 = UptodownApp.f3289b0;
                        boolean zContainsKey2 = map2.containsKey(m1Var.i);
                        v3.e eVar3 = m1Var.h;
                        if (zContainsKey2) {
                            eVar3.getClass();
                            ArrayList arrayList8 = gVar.Y;
                            arrayList8.getClass();
                            String str5 = ((d3) arrayList8.get(0)).f11120a;
                            str5.getClass();
                            Object obj4 = map2.get(m1Var.i);
                            obj4.getClass();
                            ((z3.g) eVar3).b(str5, ((Number) obj4).floatValue());
                        } else {
                            eVar3.getClass();
                            ArrayList arrayList9 = gVar.Y;
                            arrayList9.getClass();
                            String str6 = ((d3) arrayList9.get(0)).f11120a;
                            str6.getClass();
                            ((z3.g) eVar3).b(str6, 0.0f);
                            map2.put(m1Var.i, fValueOf);
                        }
                        String strE = gVar.e();
                        if (strE == null || strE.length() == 0) {
                            return;
                        }
                        l5.c cVar2 = m1Var.f4637n;
                        cVar2.getClass();
                        cVar2.f7132b.setVisibility(0);
                        l5.c cVar3 = m1Var.f4637n;
                        cVar3.getClass();
                        l1.h(cVar3.f7132b, gVar);
                        return;
                    }
                }
            }
            ArrayList arrayList10 = gVar.Y;
            if (arrayList10 == null || arrayList10.isEmpty()) {
                l1Var.g(gVar, i6);
            }
            if (m1Var.h == null) {
                m1Var.a();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewS = androidx.lifecycle.l.s(viewGroup, R.layout.home_video_featured_item, viewGroup, false);
        viewS.getClass();
        return new l1(this, viewS, this.f4629a, this.f4630b, this.f4631c, this.f4632d);
    }
}
