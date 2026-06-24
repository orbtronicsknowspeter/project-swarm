package c3;

import android.content.Context;
import androidx.datastore.DataStoreFile;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements d7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f1299b;

    public /* synthetic */ p(Context context, int i) {
        this.f1298a = i;
        this.f1299b = context;
    }

    @Override // d7.a
    public final Object invoke() throws IOException {
        switch (this.f1298a) {
            case 0:
                File fileDataStoreFile = DataStoreFile.dataStoreFile(this.f1299b, "firebaseSessions/sessionConfigsDataStore.data");
                q.a(fileDataStoreFile);
                return fileDataStoreFile;
            default:
                File fileDataStoreFile2 = DataStoreFile.dataStoreFile(this.f1299b, "firebaseSessions/sessionDataStore.data");
                q.a(fileDataStoreFile2);
                return fileDataStoreFile2;
        }
    }
}
