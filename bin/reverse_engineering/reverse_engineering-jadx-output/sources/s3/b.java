package s3;

import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f9157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f9158b;

    static {
        HashMap map = new HashMap();
        f9158b = map;
        map.put(2, "tcfeuv2");
        map.put(5, "tcfcav1");
        map.put(6, "uspv1");
        map.put(7, "usnat");
        map.put(8, "usca");
        map.put(9, "usva");
        map.put(10, "usco");
        map.put(11, "usut");
        map.put(12, "usct");
        map.put(13, "usfl");
        map.put(14, "usmt");
        map.put(15, "usor");
        map.put(16, "ustx");
        map.put(17, "usde");
        map.put(18, "usia");
        map.put(19, "usne");
        map.put(20, "usnh");
        map.put(21, "usnj");
        map.put(22, "ustn");
        map.put(23, "usmn");
        f9157a = (List) Collection.EL.stream(new ArrayList(map.keySet())).sorted().map(new m3.a(2)).collect(Collectors.toList());
    }
}
