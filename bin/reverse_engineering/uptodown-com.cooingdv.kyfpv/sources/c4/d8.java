package c4;

import com.uptodown.R;
import com.uptodown.activities.RecommendedActivity;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d8 implements r7.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecommendedActivity f1517b;

    public /* synthetic */ d8(RecommendedActivity recommendedActivity, int i) {
        this.f1516a = i;
        this.f1517b = recommendedActivity;
    }

    @Override // r7.i
    public final Object emit(Object obj, t6.c cVar) {
        int i = this.f1516a;
        p6.x xVar = p6.x.f8464a;
        RecommendedActivity recommendedActivity = this.f1517b;
        switch (i) {
            case 0:
                j5.s sVar = (j5.s) obj;
                if (sVar instanceof j5.p) {
                    if (recommendedActivity.f3341c0 != null) {
                        return xVar;
                    }
                    recommendedActivity.N0().f10001b.setVisibility(0);
                    return xVar;
                }
                if (!(sVar instanceof j5.r)) {
                    if (!(sVar instanceof j5.q)) {
                        com.google.gson.internal.a.b();
                        return null;
                    }
                    e4.e1 e1Var = recommendedActivity.f3341c0;
                    if (e1Var == null) {
                        return xVar;
                    }
                    e1Var.d(false);
                    return xVar;
                }
                ArrayList arrayList = (ArrayList) ((j5.r) sVar).f6708a;
                if (arrayList.isEmpty() && recommendedActivity.f3341c0 == null) {
                    recommendedActivity.N0().f10007q.setVisibility(0);
                    recommendedActivity.N0().f10005o.setVisibility(0);
                } else {
                    int i6 = RecommendedActivity.f3339g0;
                    recommendedActivity.N0().f10003m.setVisibility(0);
                    recommendedActivity.N0().f10006p.setVisibility(0);
                    e4.e1 e1Var2 = recommendedActivity.f3341c0;
                    if (e1Var2 == null) {
                        recommendedActivity.f3341c0 = new e4.e1(arrayList, recommendedActivity, recommendedActivity.f3342d0);
                        recommendedActivity.N0().f10002l.setAdapter(recommendedActivity.f3341c0);
                    } else {
                        e1Var2.f4520a.addAll(arrayList);
                        e1Var2.notifyDataSetChanged();
                        e4.e1 e1Var3 = recommendedActivity.f3341c0;
                        if (e1Var3 != null) {
                            e1Var3.d(false);
                        }
                    }
                }
                int i10 = RecommendedActivity.f3339g0;
                recommendedActivity.N0().f10001b.setVisibility(8);
                return xVar;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i11 = RecommendedActivity.f3339g0;
                recommendedActivity.N0().f10003m.setChecked(!zBooleanValue);
                if (zBooleanValue) {
                    recommendedActivity.N0().f10006p.setText(recommendedActivity.getString(R.string.private_list));
                } else {
                    recommendedActivity.N0().f10006p.setText(recommendedActivity.getString(R.string.public_list));
                }
                return xVar;
        }
    }
}
