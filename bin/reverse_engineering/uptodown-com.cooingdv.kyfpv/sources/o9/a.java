package o9;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import l7.u;
import p6.i;
import p6.x;
import q5.g;
import u4.c0;
import u4.f1;
import u4.y1;
import w8.a0;
import w8.j0;
import w8.o;
import w8.v;
import w8.y;
import x8.f;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends m implements d7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8373b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, int i) {
        super(0);
        this.f8372a = i;
        this.f8373b = obj;
    }

    /* JADX WARN: Finally extract failed */
    @Override // d7.a
    public final Object invoke() throws IOException {
        int iA0;
        long size;
        long j;
        int i;
        ArrayList arrayList;
        int i6;
        i iVar;
        i iVar2;
        int i10 = this.f8372a;
        x xVar = x.f8464a;
        Object obj = this.f8373b;
        switch (i10) {
            case 0:
                c cVar = (c) obj;
                cVar.dismiss();
                FragmentActivity activity = cVar.getActivity();
                if (activity != null) {
                    activity.finish();
                }
                return xVar;
            case 1:
                g gVar = (g) obj;
                gVar.dismiss();
                FragmentActivity activity2 = gVar.getActivity();
                if (activity2 != null) {
                    activity2.finish();
                }
                return xVar;
            case 2:
                ViewModelStore viewModelStore = ((ViewModelStoreOwner) ((c0) obj).invoke()).getViewModelStore();
                viewModelStore.getClass();
                return viewModelStore;
            case 3:
                ViewModelStore viewModelStore2 = ((ViewModelStoreOwner) ((c0) obj).invoke()).getViewModelStore();
                viewModelStore2.getClass();
                return viewModelStore2;
            case 4:
                return (f1) obj;
            case 5:
                ViewModelStore viewModelStore3 = ((ViewModelStoreOwner) ((a) obj).invoke()).getViewModelStore();
                viewModelStore3.getClass();
                return viewModelStore3;
            case 6:
                ViewModelStore viewModelStore4 = ((ViewModelStoreOwner) ((y1) obj).invoke()).getViewModelStore();
                viewModelStore4.getClass();
                return viewModelStore4;
            case 7:
                ViewModelStore viewModelStore5 = ((ViewModelStoreOwner) ((y1) obj).invoke()).getViewModelStore();
                viewModelStore5.getClass();
                return viewModelStore5;
            default:
                y yVar = f.f11558c;
                ClassLoader classLoader = (ClassLoader) obj;
                Enumeration<URL> resources = classLoader.getResources("");
                resources.getClass();
                ArrayList list = Collections.list(resources);
                list.getClass();
                ArrayList arrayList2 = new ArrayList();
                int size2 = list.size();
                boolean z9 = false;
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = list.get(i11);
                    i11++;
                    URL url = (URL) obj2;
                    y yVar2 = f.f11558c;
                    url.getClass();
                    if (l.a(url.getProtocol(), "file")) {
                        v vVar = o.f10986a;
                        String str = y.f11005b;
                        String string = new File(url.toURI()).toString();
                        string.getClass();
                        iVar2 = new i(vVar, q1.a.j(string, false));
                    } else {
                        iVar2 = null;
                    }
                    if (iVar2 != null) {
                        arrayList2.add(iVar2);
                    }
                }
                Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                resources2.getClass();
                ArrayList list2 = Collections.list(resources2);
                list2.getClass();
                ArrayList arrayList3 = new ArrayList();
                int size3 = list2.size();
                int i12 = 0;
                while (i12 < size3) {
                    Object obj3 = list2.get(i12);
                    int i13 = i12 + 1;
                    URL url2 = (URL) obj3;
                    y yVar3 = f.f11558c;
                    url2.getClass();
                    String string2 = url2.toString();
                    string2.getClass();
                    if (u.p0(string2, "jar:file:", z9) && (iA0 = l7.m.A0("!", string2, 6)) != -1) {
                        String str2 = y.f11005b;
                        String string3 = new File(URI.create(string2.substring(4, iA0))).toString();
                        string3.getClass();
                        y yVarJ = q1.a.j(string3, z9);
                        v vVar2 = o.f10986a;
                        vVar2.getClass();
                        w8.u uVarF = vVar2.f(yVarJ);
                        try {
                            size = uVarF.size() - ((long) 22);
                            j = 0;
                        } finally {
                        }
                        if (size < 0) {
                            throw new IOException("not a zip: size=" + uVarF.size());
                        }
                        i = i13;
                        long jMax = Math.max(size - 65536, 0L);
                        while (true) {
                            a0 a0Var = new a0(uVarF.c(size));
                            try {
                                long j6 = j;
                                if (a0Var.f() == 101010256) {
                                    int i14 = a0Var.i() & 65535;
                                    int i15 = a0Var.i() & 65535;
                                    long jI = a0Var.i() & 65535;
                                    arrayList = list2;
                                    if (jI != (a0Var.i() & 65535) || i14 != 0 || i15 != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    a0Var.skip(4L);
                                    long jF = ((long) a0Var.f()) & 4294967295L;
                                    int i16 = a0Var.i() & 65535;
                                    x8.d dVar = new x8.d(jI, jF, i16);
                                    a0Var.j(i16);
                                    a0Var.close();
                                    long j10 = size - ((long) 20);
                                    if (j10 > j6) {
                                        a0Var = new a0(uVarF.c(j10));
                                        try {
                                            if (a0Var.f() == 117853008) {
                                                int iF = a0Var.f();
                                                long jH = a0Var.h();
                                                if (a0Var.f() != 1 || iF != 0) {
                                                    throw new IOException("unsupported zip: spanned");
                                                }
                                                a0Var = new a0(uVarF.c(jH));
                                                try {
                                                    int iF2 = a0Var.f();
                                                    if (iF2 != 101075792) {
                                                        throw new IOException("bad zip: expected " + x8.b.c(101075792) + " but was " + x8.b.c(iF2));
                                                    }
                                                    a0Var.skip(12L);
                                                    int iF3 = a0Var.f();
                                                    int iF4 = a0Var.f();
                                                    long jH2 = a0Var.h();
                                                    if (jH2 != a0Var.h() || iF3 != 0 || iF4 != 0) {
                                                        throw new IOException("unsupported zip: spanned");
                                                    }
                                                    a0Var.skip(8L);
                                                    dVar = new x8.d(jH2, a0Var.h(), i16);
                                                } finally {
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                    x8.d dVar2 = dVar;
                                    long j11 = dVar2.f11554b;
                                    ArrayList arrayList4 = new ArrayList();
                                    a0Var = new a0(uVarF.c(j11));
                                    try {
                                        long j12 = dVar2.f11553a;
                                        long j13 = j6;
                                        while (j13 < j12) {
                                            x8.g gVarD = x8.b.d(a0Var);
                                            int i17 = size3;
                                            long j14 = j11;
                                            if (gVarD.g >= j14) {
                                                throw new IOException("bad zip: local file header offset >= central directory offset");
                                            }
                                            y yVar4 = f.f11558c;
                                            if (q1.a.f(gVarD.f11560a)) {
                                                arrayList4.add(gVarD);
                                            }
                                            j13++;
                                            size3 = i17;
                                            j11 = j14;
                                        }
                                        i6 = size3;
                                        a0Var.close();
                                        j0 j0Var = new j0(yVarJ, vVar2, x8.b.b(arrayList4));
                                        uVarF.close();
                                        iVar = new i(j0Var, f.f11558c);
                                    } catch (Throwable th) {
                                        try {
                                            throw th;
                                        } finally {
                                        }
                                    }
                                } else {
                                    ArrayList arrayList5 = list2;
                                    int i18 = size3;
                                    a0Var.close();
                                    size--;
                                    if (size < jMax) {
                                        throw new IOException("not a zip: end of central directory signature not found");
                                    }
                                    list2 = arrayList5;
                                    j = j6;
                                    size3 = i18;
                                }
                            } finally {
                                a0Var.close();
                            }
                        }
                    } else {
                        arrayList = list2;
                        i6 = size3;
                        i = i13;
                        iVar = null;
                    }
                    if (iVar != null) {
                        arrayList3.add(iVar);
                    }
                    list2 = arrayList;
                    i12 = i;
                    size3 = i6;
                    z9 = false;
                }
                return q6.l.A0(arrayList3, arrayList2);
        }
    }
}
