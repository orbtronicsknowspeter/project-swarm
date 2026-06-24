package e4;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c4.ra;
import com.google.android.gms.internal.measurement.i5;
import com.uptodown.UptodownApp;
import e1.v4;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import m5.c2;
import m5.d2;
import m5.p1;
import x4.q2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class x0 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w4.n f4715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w4.b f4716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ra f4717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w4.k f4718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f4719e;
    public final w0 f;
    public int g;
    public boolean h;
    public int i;

    public x0(w4.n nVar, w4.b bVar, ra raVar, w4.k kVar) {
        nVar.getClass();
        bVar.getClass();
        raVar.getClass();
        kVar.getClass();
        this.f4715a = nVar;
        this.f4716b = bVar;
        this.f4717c = raVar;
        this.f4718d = kVar;
        this.f = new w0();
        this.g = -1;
    }

    public final ArrayList a() {
        ArrayList arrayList = this.f4719e;
        if (arrayList != null) {
            return arrayList;
        }
        kotlin.jvm.internal.l.i("data");
        throw null;
    }

    public final void b(Context context, File file) {
        x4.e eVar;
        String str;
        file.getClass();
        j5.g gVarL = j5.g.D.l(context);
        gVarL.b();
        int i = -1;
        int i6 = 0;
        for (Object obj : a()) {
            int i10 = i6 + 1;
            if ((obj instanceof x4.e) && (str = (eVar = (x4.e) obj).f11123l) != null && str.length() != 0) {
                String str2 = eVar.f11123l;
                str2.getClass();
                q2 q2VarY = gVarL.Y(str2);
                x4.r rVarA = q2VarY != null ? q2VarY.a(context) : null;
                if (rVarA != null && rVarA.F.size() > 0) {
                    Iterator it = rVarA.F.iterator();
                    it.getClass();
                    while (it.hasNext()) {
                        Object next = it.next();
                        next.getClass();
                        if (l7.u.m0(((x4.j0) next).f11240q, file.getAbsolutePath(), true)) {
                            i = i6;
                            break;
                            break;
                        }
                    }
                }
            } else if (obj instanceof v0) {
                q2 q2Var = ((v0) obj).f4709b;
                x4.r rVar = q2Var.f11352s;
                if ((rVar != null ? rVar.F : null) != null) {
                    rVar.getClass();
                    if (rVar.F.size() > 0) {
                        x4.r rVar2 = q2Var.f11352s;
                        rVar2.getClass();
                        Iterator it2 = rVar2.F.iterator();
                        it2.getClass();
                        while (it2.hasNext()) {
                            Object next2 = it2.next();
                            next2.getClass();
                            if (l7.u.m0(((x4.j0) next2).f11240q, file.getAbsolutePath(), true)) {
                                i = i6;
                                break;
                            }
                        }
                    }
                }
            }
            i6 = i10;
        }
        gVarL.c();
        if (i >= 0) {
            notifyItemChanged(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return a().size();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        Object obj = a().get(i);
        obj.getClass();
        if (obj instanceof x4.e) {
            return ((x4.e) obj).v == 1 ? 9 : 1;
        }
        if (obj instanceof v0) {
            v0 v0Var = (v0) obj;
            if (v0Var.f4708a.v == 1) {
                return 9;
            }
            return v0Var.f4709b.c() ? 10 : 0;
        }
        if (!(obj instanceof String)) {
            if (obj instanceof w0) {
                return 8;
            }
            s1.o.n();
            return 0;
        }
        String str = (String) obj;
        switch (str.hashCode()) {
            case -1764562172:
                if (str.equals("tracking_disabled")) {
                    return 4;
                }
                break;
            case -864119891:
                if (str.equals("title_recent_updates")) {
                    return 5;
                }
                break;
            case 446114743:
                if (str.equals("warning_not_space")) {
                    return 2;
                }
                break;
            case 903589355:
                if (str.equals("title_ignored")) {
                    return 6;
                }
                break;
            case 1477891299:
                if (str.equals("title_disable_app")) {
                    return 7;
                }
                break;
        }
        s1.o.n();
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        SharedPreferences sharedPreferences;
        long j;
        viewHolder.getClass();
        if (viewHolder instanceof m5.d) {
            Object obj = a().get(i);
            obj.getClass();
            ((m5.d) viewHolder).a((x4.e) obj);
            return;
        }
        if (viewHolder instanceof p1) {
            p1 p1Var = (p1) viewHolder;
            Object obj2 = a().get(i);
            obj2.getClass();
            p1Var.a((v0) obj2, this.g == i, this.h);
            return;
        }
        if (viewHolder instanceof m5.f0) {
            m5.f0 f0Var = (m5.f0) viewHolder;
            ImageView imageView = f0Var.f7378l;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, (int) f0Var.itemView.getContext().getResources().getDimension(2131166250), 0, 0);
            f0Var.itemView.setLayoutParams(layoutParams);
            f0Var.f7377b.setVisibility(0);
            if (f0Var.f7376a == null) {
                if (imageView != null) {
                    imageView.setVisibility(8);
                    return;
                }
                return;
            } else {
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                if (imageView != null) {
                    imageView.setOnClickListener(new m5.e0(f0Var, 0));
                    return;
                }
                return;
            }
        }
        if (viewHolder instanceof c2) {
            ((c2) viewHolder).f7336a.setVisibility(0);
            return;
        }
        if (viewHolder instanceof m5.l1) {
            m5.l1 l1Var = (m5.l1) viewHolder;
            int i6 = this.f.f4711a;
            LinearLayout linearLayout = l1Var.f7466l;
            TextView textView = l1Var.f7465b;
            TextView textView2 = l1Var.f7468n;
            if (i6 != 0) {
                textView.setText(l1Var.itemView.getContext().getString(2131952365));
                linearLayout.setVisibility(8);
                return;
            }
            float f = UptodownApp.I;
            Context context = l1Var.itemView.getContext();
            context.getClass();
            if (b4.d.o(context, "TrackingWorkerSingle")) {
                textView2.setOnClickListener(null);
                Context context2 = l1Var.itemView.getContext();
                context2.getClass();
                new v4(context2, 1).g(textView2, 0.3f);
            } else {
                textView2.setOnClickListener(new m5.u0(l1Var, 2));
                Context context3 = l1Var.itemView.getContext();
                context3.getClass();
                new v4(context3, 1).g(textView2, 1.0f);
            }
            textView.setText(l1Var.itemView.getContext().getString(2131952826));
            TextView textView3 = l1Var.f7467m;
            Resources resources = l1Var.itemView.getResources();
            Context context4 = l1Var.itemView.getContext();
            context4.getClass();
            SharedPreferences sharedPreferences2 = context4.getSharedPreferences("SettingsPreferences", 0);
            try {
                try {
                    j = sharedPreferences2.getLong("last_tracking_timestamp", 0L);
                } catch (ClassCastException unused) {
                    j = 0;
                }
            } catch (ClassCastException unused2) {
                long j6 = sharedPreferences2.getInt("last_tracking_timestamp", -1);
                SharedPreferences sharedPreferences3 = context4.getSharedPreferences("SettingsPreferences", 0);
                sharedPreferences3.getClass();
                SharedPreferences.Editor editorEdit = sharedPreferences3.edit();
                editorEdit.putLong("last_tracking_timestamp", j6);
                editorEdit.apply();
                j = j6;
            }
            textView3.setText(resources.getString(2131952113, String.valueOf(j > 0 ? new SimpleDateFormat("dd MMM yyyy HH:mm", Locale.getDefault()).format(new Date(j)) : null)));
            linearLayout.setVisibility(0);
            return;
        }
        if (viewHolder instanceof d2) {
            d2 d2Var = (d2) viewHolder;
            Context context5 = viewHolder.itemView.getContext();
            context5.getClass();
            try {
                sharedPreferences = context5.getSharedPreferences("SettingsPreferences", 0);
            } catch (Exception unused3) {
            }
            boolean z9 = sharedPreferences.contains("gdpr_tracking_allowed") ? sharedPreferences.getBoolean("gdpr_tracking_allowed", false) : false;
            LinearLayout linearLayout2 = d2Var.f7368a;
            if (z9) {
                linearLayout2.setVisibility(8);
                return;
            } else {
                linearLayout2.setVisibility(0);
                return;
            }
        }
        if (viewHolder instanceof m5.a) {
            Object obj3 = a().get(i);
            obj3.getClass();
            if (obj3 instanceof x4.e) {
                Object obj4 = a().get(i);
                obj4.getClass();
                ((m5.a) viewHolder).a((x4.e) obj4);
                return;
            } else {
                if (obj3 instanceof v0) {
                    Object obj5 = a().get(i);
                    obj5.getClass();
                    ((m5.a) viewHolder).a(((v0) obj5).f4708a);
                    return;
                }
                return;
            }
        }
        if (!(viewHolder instanceof m5.k1)) {
            com.google.gson.internal.a.p("ViewHolder unknown!!");
            return;
        }
        m5.k1 k1Var = (m5.k1) viewHolder;
        Object obj6 = a().get(i);
        obj6.getClass();
        v0 v0Var = (v0) obj6;
        TextView textView4 = k1Var.f7450p;
        TextView textView5 = k1Var.f7448n;
        x4.e eVar = v0Var.f4708a;
        boolean z10 = eVar.K;
        View view = k1Var.itemView;
        if (z10) {
            view.setAlpha(0.3f);
        } else {
            view.setAlpha(1.0f);
        }
        ConcurrentHashMap concurrentHashMap = j5.t.f6708a;
        Context context6 = k1Var.itemView.getContext();
        context6.getClass();
        k1Var.f7445b.setImageDrawable(j5.t.b(context6, eVar.f11123l));
        k1Var.f7446l.setText(eVar.f11122b);
        k1Var.f7447m.setText(eVar.f11125n);
        long j10 = eVar.f11133w;
        Context context7 = k1Var.itemView.getContext();
        context7.getClass();
        textView5.setText(i5.H(context7, j10));
        TextView textView6 = k1Var.f7449o;
        long j11 = eVar.f11134x;
        textView6.setText(j11 > 0 ? new SimpleDateFormat("dd MMM yyyy", Locale.getDefault()).format(new Date(j11)) : null);
        float f10 = UptodownApp.I;
        if (v0Var.f4709b.f11348o == 1) {
            textView4.setText(k1Var.itemView.getContext().getString(2131952609));
            textView4.setVisibility(0);
        } else {
            textView4.setVisibility(8);
            textView5.setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        ra raVar = this.f4717c;
        w4.b bVar = this.f4716b;
        switch (i) {
            case 0:
                return new p1(androidx.lifecycle.l.E(viewGroup, 2131558855, viewGroup, false), this.f4715a);
            case 1:
                return new m5.d(androidx.lifecycle.l.E(viewGroup, 2131558582, viewGroup, false), bVar);
            case 2:
                return new c2(androidx.lifecycle.l.E(viewGroup, 2131558885, viewGroup, false));
            case 3:
            default:
                com.google.gson.internal.a.p("viewType unknown");
                return null;
            case 4:
                return new d2(androidx.lifecycle.l.E(viewGroup, 2131558830, viewGroup, false), raVar);
            case 5:
                View viewE = androidx.lifecycle.l.E(viewGroup, 2131558848, viewGroup, false);
                String string = viewGroup.getContext().getString(2131952512);
                string.getClass();
                return new m5.f0(viewE, string, null);
            case 6:
                View viewE2 = androidx.lifecycle.l.E(viewGroup, 2131558848, viewGroup, false);
                String string2 = viewGroup.getContext().getString(2131952706);
                string2.getClass();
                return new m5.f0(viewE2, string2, null);
            case 7:
                View viewE3 = androidx.lifecycle.l.E(viewGroup, 2131558848, viewGroup, false);
                String string3 = viewGroup.getContext().getString(2131951952);
                string3.getClass();
                return new m5.f0(viewE3, string3, this.f4718d);
            case 8:
                return new m5.l1(androidx.lifecycle.l.E(viewGroup, 2131558857, viewGroup, false), raVar);
            case 9:
                return new m5.a(androidx.lifecycle.l.E(viewGroup, 2131558582, viewGroup, false), bVar);
            case 10:
                return new m5.k1(androidx.lifecycle.l.E(viewGroup, 2131558582, viewGroup, false), bVar);
        }
    }
}
