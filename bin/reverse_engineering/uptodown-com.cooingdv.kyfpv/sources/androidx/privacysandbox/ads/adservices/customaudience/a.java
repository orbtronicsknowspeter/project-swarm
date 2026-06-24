package androidx.privacysandbox.ads.adservices.customaudience;

import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import android.util.Base64;
import android.util.JsonReader;
import androidx.arch.core.util.Function;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.work.ListenableWorker;
import androidx.work.impl.model.WorkSpec;
import c2.b;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import k0.k;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements CallbackToFutureAdapter.Resolver, Function, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f461a;

    public /* synthetic */ a(int i) {
        this.f461a = i;
    }

    public static /* bridge */ /* synthetic */ Topic e(Object obj) {
        return (Topic) obj;
    }

    public static /* bridge */ /* synthetic */ TopicsManager f(Object obj) {
        return (TopicsManager) obj;
    }

    public static /* synthetic */ void g(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    public static /* synthetic */ void h(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    public static /* synthetic */ void i(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void j(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void k(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void l(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void m(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static /* bridge */ /* synthetic */ Class q() {
        return TopicsManager.class;
    }

    public static /* synthetic */ void r(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void s(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void t(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    @Override // c2.b
    public Object a(JsonReader jsonReader) throws IOException {
        switch (this.f461a) {
            case 28:
                jsonReader.beginObject();
                String strNextString = null;
                String strNextString2 = null;
                String strNextString3 = null;
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    strNextName.getClass();
                    switch (strNextName) {
                        case "libraryName":
                            strNextString2 = jsonReader.nextString();
                            if (strNextString2 != null) {
                                break;
                            } else {
                                com.google.gson.internal.a.i("Null libraryName");
                                break;
                            }
                            break;
                        case "arch":
                            strNextString = jsonReader.nextString();
                            if (strNextString != null) {
                                break;
                            } else {
                                com.google.gson.internal.a.i("Null arch");
                                break;
                            }
                            break;
                        case "buildId":
                            strNextString3 = jsonReader.nextString();
                            if (strNextString3 != null) {
                                break;
                            } else {
                                com.google.gson.internal.a.i("Null buildId");
                                break;
                            }
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (strNextString == null || strNextString2 == null || strNextString3 == null) {
                    StringBuilder sb = new StringBuilder();
                    if (strNextString == null) {
                        sb.append(" arch");
                    }
                    if (strNextString2 == null) {
                        sb.append(" libraryName");
                    }
                    if (strNextString3 == null) {
                        sb.append(" buildId");
                    }
                    i(k.h("Missing required properties:", sb));
                }
                break;
            default:
                jsonReader.beginObject();
                String strNextString4 = null;
                byte[] bArrDecode = null;
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    strNextName2.getClass();
                    if (strNextName2.equals("filename")) {
                        strNextString4 = jsonReader.nextString();
                        if (strNextString4 == null) {
                            com.google.gson.internal.a.i("Null filename");
                            break;
                        }
                    } else if (strNextName2.equals("contents")) {
                        bArrDecode = Base64.decode(jsonReader.nextString(), 2);
                        if (bArrDecode == null) {
                            com.google.gson.internal.a.i("Null contents");
                            break;
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                if (strNextString4 == null || bArrDecode == null) {
                    StringBuilder sb2 = new StringBuilder();
                    if (strNextString4 == null) {
                        sb2.append(" filename");
                    }
                    if (bArrDecode == null) {
                        sb2.append(" contents");
                    }
                    i(k.h("Missing required properties:", sb2));
                }
                break;
        }
        return null;
    }

    @Override // androidx.arch.core.util.Function
    public Object apply(Object obj) {
        return WorkSpec.WORK_INFO_MAPPER$lambda$1((List) obj);
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return ListenableWorker.lambda$getForegroundInfoAsync$0(completer);
    }
}
