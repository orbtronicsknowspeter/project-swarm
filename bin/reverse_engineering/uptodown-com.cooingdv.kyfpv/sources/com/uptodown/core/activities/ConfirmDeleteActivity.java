package com.uptodown.core.activities;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import c4.d;
import com.uptodown.R;
import g4.a;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class ConfirmDeleteActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3374a = 0;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.confirm_delete_dialog);
        String stringExtra = getIntent().getStringExtra("realPath");
        int intExtra = getIntent().getIntExtra("notificationId", -1);
        ((TextView) findViewById(R.id.tv_confirm_delete_msg)).setText(getString(R.string.dialog_delete_download_msg, stringExtra));
        ((TextView) findViewById(R.id.tv_cancel_confirm_delete)).setOnClickListener(new d(this, 18));
        ((TextView) findViewById(R.id.tv_delete_confirm_delete)).setOnClickListener(new a(intExtra, stringExtra, 0, this));
    }
}
