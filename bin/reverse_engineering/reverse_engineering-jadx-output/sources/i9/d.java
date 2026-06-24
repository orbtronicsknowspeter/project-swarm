package i9;

import android.graphics.BitmapFactory;
import d7.p;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import p6.x;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends v6.i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5713b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(String str, t6.c cVar, int i) {
        super(2, cVar);
        this.f5712a = i;
        this.f5713b = str;
    }

    @Override // v6.a
    public final t6.c create(Object obj, t6.c cVar) {
        switch (this.f5712a) {
            case 0:
                return new d(this.f5713b, cVar, 0);
            case 1:
                return new d(this.f5713b, cVar, 1);
            default:
                return new d(this.f5713b, cVar, 2);
        }
    }

    @Override // d7.p
    public final Object invoke(Object obj, Object obj2) {
        t6.c cVar = (t6.c) obj2;
        switch (this.f5712a) {
            case 0:
                return new d(this.f5713b, cVar, 0).invokeSuspend(x.f8463a);
            case 1:
                return new d(this.f5713b, cVar, 1).invokeSuspend(x.f8463a);
            default:
                return new d(this.f5713b, cVar, 2).invokeSuspend(x.f8463a);
        }
    }

    @Override // v6.a
    public final Object invokeSuspend(Object obj) throws IOException {
        BufferedReader bufferedReader;
        int i = this.f5712a;
        String strO = null;
        String str = this.f5713b;
        switch (i) {
            case 0:
                p6.a.e(obj);
                URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
                if (uRLConnectionOpenConnection != null) {
                    bufferedReader = new BufferedReader(new InputStreamReader(((HttpURLConnection) uRLConnectionOpenConnection).getInputStream()));
                    try {
                        strO = d0.b.O(bufferedReader);
                        bufferedReader.close();
                    } finally {
                    }
                } else {
                    com.google.gson.internal.a.i("null cannot be cast to non-null type java.net.HttpURLConnection");
                }
                return strO;
            case 1:
                p6.a.e(obj);
                URLConnection uRLConnectionOpenConnection2 = new URL(str).openConnection();
                if (uRLConnectionOpenConnection2 == null) {
                    com.google.gson.internal.a.i("null cannot be cast to non-null type java.net.HttpURLConnection");
                    return null;
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection2;
                httpURLConnection.connect();
                String headerField = httpURLConnection.getHeaderField("X-Current-Timestamp");
                long j = headerField == null ? 0L : Long.parseLong(headerField);
                bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                try {
                    String strO2 = d0.b.O(bufferedReader);
                    bufferedReader.close();
                    return new a(j, strO2);
                } finally {
                }
            default:
                p6.a.e(obj);
                return BitmapFactory.decodeStream(new URL(str).openConnection().getInputStream());
        }
    }
}
