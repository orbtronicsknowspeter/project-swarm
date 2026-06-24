package androidx.privacysandbox.ads.adservices.adid;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
@RequiresExtension(extension = 1000000, version = 4)
@SuppressLint({"NewApi", "ClassVerificationFailure"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class AdIdManagerApi33Ext4Impl extends AdIdManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    public AdIdManagerApi33Ext4Impl(Context context) {
        context.getClass();
        Object systemService = context.getSystemService((Class<Object>) android.adservices.adid.AdIdManager.class);
        systemService.getClass();
        super((android.adservices.adid.AdIdManager) systemService);
    }
}
