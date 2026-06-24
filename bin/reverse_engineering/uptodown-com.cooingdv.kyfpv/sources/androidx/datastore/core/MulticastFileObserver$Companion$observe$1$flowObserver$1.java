package androidx.datastore.core;

import c4.ya;
import d7.l;
import java.io.File;
import kotlin.jvm.internal.m;
import o7.c0;
import p6.x;
import q7.k;
import q7.r;
import q7.s;
import t6.i;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class MulticastFileObserver$Companion$observe$1$flowObserver$1 extends m implements l {
    final /* synthetic */ s $$this$channelFlow;
    final /* synthetic */ File $file;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MulticastFileObserver$Companion$observe$1$flowObserver$1(File file, s sVar) {
        super(1);
        this.$file = file;
        this.$$this$channelFlow = sVar;
    }

    public final void invoke(String str) {
        if (kotlin.jvm.internal.l.a(str, this.$file.getName())) {
            s sVar = this.$$this$channelFlow;
            Object objP = ((r) sVar).f8780m.p(x.f8464a);
            if (!(objP instanceof k)) {
                return;
            }
            Object obj = ((q7.l) c0.w(i.f10315a, new ya(sVar, null, 24))).f8773a;
        }
    }

    @Override // d7.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return x.f8464a;
    }
}
