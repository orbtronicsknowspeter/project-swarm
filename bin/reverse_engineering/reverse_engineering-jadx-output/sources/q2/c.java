package q2;

import android.util.Base64OutputStream;
import androidx.exifinterface.media.ExifInterface;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f8647b;

    public /* synthetic */ c(d dVar, int i) {
        this.f8646a = i;
        this.f8647b = dVar;
    }

    private final Object a() {
        String string;
        d dVar = this.f8647b;
        synchronized (dVar) {
            try {
                i iVar = (i) dVar.f8648a.get();
                ArrayList arrayListC = iVar.c();
                iVar.b();
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < arrayListC.size(); i++) {
                    a aVar = (a) arrayListC.get(i);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", aVar.f8642a);
                    jSONObject.put("dates", new JSONArray((Collection) aVar.f8643b));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", ExifInterface.GPS_MEASUREMENT_2D);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f8646a) {
            case 0:
                return a();
            default:
                d dVar = this.f8647b;
                synchronized (dVar) {
                    ((i) dVar.f8648a.get()).k(System.currentTimeMillis(), ((a3.c) dVar.f8650c.get()).a());
                    break;
                }
                return null;
        }
    }
}
