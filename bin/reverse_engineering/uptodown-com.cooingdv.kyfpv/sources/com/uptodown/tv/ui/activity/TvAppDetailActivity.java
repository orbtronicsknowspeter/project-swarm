package com.uptodown.tv.ui.activity;

import android.os.Bundle;
import c4.e3;
import com.uptodown.R;
import f5.a;
import x4.d0;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class TvAppDetailActivity extends a {
    @Override // f5.a
    public final void h(d0 d0Var) {
        d0Var.getClass();
        runOnUiThread(new e3(this, d0Var.c(), d0Var.a(), 3));
    }

    @Override // f5.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.tv_app_detail_activity);
    }
}
