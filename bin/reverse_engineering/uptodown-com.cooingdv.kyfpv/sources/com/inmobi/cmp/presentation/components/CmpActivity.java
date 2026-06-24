package com.inmobi.cmp.presentation.components;

import androidx.appcompat.app.AppCompatActivity;
import com.inmobi.cmp.ChoiceCmp;
import d0.b;
import f9.c;
import f9.p;
import f9.q;
import java.util.UUID;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.x;
import l.g;
import l9.a;
import o7.c0;
import o7.m0;
import o7.z0;
import p9.d;
import v7.e;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class CmpActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f3282b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f3283a;

    public final void h(f9.d dVar, boolean z9) {
        String strD;
        c cVar;
        c cVar2;
        if (z9) {
            strD = null;
        } else {
            d dVar2 = this.f3283a;
            if (dVar2 == null) {
                l.i("viewModel");
                throw null;
            }
            strD = b.d(dVar, dVar2.f8513a);
        }
        UUID uuid = q.f5066a;
        x xVar = new x();
        xVar.f7025a = dVar;
        x xVar2 = new x();
        c cVar3 = c.TCF_CHANGE_OF_CONSENT;
        xVar2.f7025a = cVar3;
        int iOrdinal = dVar.ordinal();
        if (iOrdinal == 0) {
            xVar2.f7025a = c.USP;
        } else if (iOrdinal == 1) {
            if (z9) {
                cVar3 = c.TCF_MANDATORY;
            }
            xVar2.f7025a = cVar3;
        } else if (iOrdinal == 2) {
            if (z9) {
                cVar = c.MSPA_MANDATORY;
            } else {
                a aVar = (a) m9.c.v.getValue();
                aVar.getClass();
                cVar = aVar.f7263a.getBoolean("MSPAShown", false) ? c.MSPA_CHANGE_OF_CONSENT : c.MSPA_OPT_OUT;
            }
            xVar2.f7025a = cVar;
        } else if (iOrdinal == 3) {
            if (g.f7045a) {
                a aVar2 = (a) m9.c.v.getValue();
                aVar2.getClass();
                cVar2 = aVar2.f7263a.getBoolean("GBCShown", false) ? c.GBC_CHANGE_OF_CONSENT : c.GBC;
            } else {
                cVar2 = c.NR;
            }
            xVar2.f7025a = cVar2;
        }
        q.f5067b.h("startOnPage", xVar.f7025a + "_1");
        q.f5066a = UUID.randomUUID();
        if (dVar == f9.d.GDPR) {
            ChoiceCmp.INSTANCE.setCurrentSessionId(q.f5066a);
        }
        e eVar = m0.f8289a;
        c0.s(z0.f8336a, v7.d.f10885a, null, new p(xVar, xVar2, strD, z9, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00da  */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.cmp.presentation.components.CmpActivity.onCreate(android.os.Bundle):void");
    }
}
