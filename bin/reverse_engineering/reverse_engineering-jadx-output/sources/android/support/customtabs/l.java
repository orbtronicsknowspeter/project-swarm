package android.support.customtabs;

import android.os.Bundle;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public interface l extends IInterface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f222d = "android$support$customtabs$IPostMessageService".replace('$', '.');

    void onMessageChannelReady(c cVar, Bundle bundle);

    void onPostMessage(c cVar, String str, Bundle bundle);
}
