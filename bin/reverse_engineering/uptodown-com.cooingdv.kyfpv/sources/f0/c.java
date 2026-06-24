package f0;

import android.util.Log;
import androidx.browser.trusted.sharing.ShareTarget;
import com.google.android.gms.common.api.Status;
import f8.o;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import k0.y;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final o f4802l = new o("RevokeAccessOperation", new String[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0.i f4804b;

    public c(String str) {
        y.d(str);
        this.f4803a = str;
        this.f4804b = new j0.i(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        o oVar = f4802l;
        Status status = Status.f2471p;
        try {
            String str = this.f4803a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
            sb.append("https://accounts.google.com/o/oauth2/revoke?token=");
            sb.append(str);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(sb.toString()).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", ShareTarget.ENCODING_TYPE_URL_ENCODED);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f2469n;
            } else {
                Log.e((String) oVar.f4961b, ((String) oVar.f4963d).concat("Unable to revoke access!"));
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(responseCode).length() + 15);
            sb2.append("Response Code: ");
            sb2.append(responseCode);
            oVar.b(sb2.toString(), new Object[0]);
        } catch (IOException e10) {
            Log.e((String) oVar.f4961b, ((String) oVar.f4963d).concat("IOException when revoking access: ".concat(String.valueOf(e10.toString()))));
        } catch (Exception e11) {
            Log.e((String) oVar.f4961b, ((String) oVar.f4963d).concat("Exception when revoking access: ".concat(String.valueOf(e11.toString()))));
        }
        this.f4804b.e(status);
    }
}
