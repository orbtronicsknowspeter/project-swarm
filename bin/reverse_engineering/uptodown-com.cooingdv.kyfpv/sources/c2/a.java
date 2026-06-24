package c2;

import a4.d0;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import c3.l;
import c3.o0;
import c3.p0;
import com.google.android.gms.internal.measurement.t5;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import com.google.gson.internal.m;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentSkipListMap;
import o.e;
import s1.d;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements b, e, d, OnApplyWindowInsetsListener, ShapeAppearanceModel.CornerSizeUnaryOperator, TextInputLayout.LengthCounter, m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1183a;

    public /* synthetic */ a(l lVar) {
        this.f1183a = 4;
    }

    public static /* synthetic */ void e(int i, int i6) {
        StringBuilder sb = new StringBuilder(i);
        sb.append((Object) "serialized size must be non-negative, was ");
        sb.append(i6);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void f(int i, int i6, Object obj, String str) {
        throw new IllegalArgumentException(str + i + obj + i6);
    }

    public static /* synthetic */ void g(int i, Object obj, int i6, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(i);
        sb.append((Object) " parameters found ");
        sb.append(i6);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void h(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void i(String str) throws t5 {
        throw new t5(str);
    }

    public static /* synthetic */ void j(Object obj, String str) {
        throw new com.google.gson.e(str + ((Object) obj.toString()));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:103:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    @Override // c2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(android.util.JsonReader r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.a.a(android.util.JsonReader):java.lang.Object");
    }

    @Override // o.e
    public Object apply(Object obj) {
        String strZ = p0.f1301b.z((o0) obj);
        strZ.getClass();
        Log.d("FirebaseSessions", "Session Event Type: SESSION_START");
        byte[] bytes = strZ.getBytes(l7.a.f7152a);
        bytes.getClass();
        return bytes;
    }

    @Override // s1.d
    public Object c(d0 d0Var) {
        switch (this.f1183a) {
            case 6:
                return FirebaseSessionsRegistrar.getComponents$lambda$0(d0Var);
            default:
                return FirebaseSessionsRegistrar.getComponents$lambda$1(d0Var);
        }
    }

    @Override // com.google.android.material.textfield.TextInputLayout.LengthCounter
    public int countLength(Editable editable) {
        return TextInputLayout.lambda$new$0(editable);
    }

    @Override // com.google.gson.internal.m
    public Object d() {
        switch (this.f1183a) {
            case 24:
                return new com.google.gson.internal.l(true);
            case 25:
                return new LinkedHashMap();
            case 26:
                return new TreeMap();
            case 27:
                return new ConcurrentHashMap();
            case 28:
                return new ConcurrentSkipListMap();
            default:
                return new ArrayList();
        }
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        view.getClass();
        windowInsetsCompat.getClass();
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        insets.getClass();
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return windowInsetsCompat;
    }

    public /* synthetic */ a(int i) {
        this.f1183a = i;
    }

    @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
    public CornerSize apply(CornerSize cornerSize) {
        return MaskableFrameLayout.lambda$setShapeAppearanceModel$0(cornerSize);
    }
}
