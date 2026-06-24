package h8;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f5475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f5476e;
    public final Set f;
    public final Set g;
    public final Set h;
    public final Set i;
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f5477k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f5478l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Boolean f5479m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Set f5480n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g2.c f5481o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Set f5482p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f5483q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i, String str, String str2, Set set, Set set2, Set set3, Set set4, Set set5, Set set6, String str3, String str4, int i6, Boolean bool, Set set7, g2.c cVar, Set set8, String str5, int i10) {
        super(i, str);
        String str6 = (i10 & 4) != 0 ? null : str2;
        Set linkedHashSet = (i10 & 8) != 0 ? new LinkedHashSet() : set;
        Set linkedHashSet2 = (i10 & 16) != 0 ? new LinkedHashSet() : set2;
        Set linkedHashSet3 = (i10 & 32) != 0 ? new LinkedHashSet() : set3;
        Set linkedHashSet4 = (i10 & 64) != 0 ? new LinkedHashSet() : set4;
        Set linkedHashSet5 = (i10 & 128) != 0 ? new LinkedHashSet() : set5;
        Set linkedHashSet6 = (i10 & 256) != 0 ? new LinkedHashSet() : set6;
        String str7 = (i10 & 512) != 0 ? "" : str3;
        String str8 = (i10 & 1024) != 0 ? null : str4;
        int i11 = (i10 & 4096) != 0 ? -1 : i6;
        Boolean bool2 = (32768 & i10) == 0 ? bool : null;
        Set linkedHashSet7 = (65536 & i10) != 0 ? new LinkedHashSet() : set7;
        Set linkedHashSet8 = (262144 & i10) != 0 ? new LinkedHashSet() : set8;
        String str9 = (i10 & 524288) == 0 ? str5 : "";
        str.getClass();
        this.f5474c = str6;
        this.f5475d = linkedHashSet;
        this.f5476e = linkedHashSet2;
        this.f = linkedHashSet3;
        this.g = linkedHashSet4;
        this.h = linkedHashSet5;
        this.i = linkedHashSet6;
        this.j = str7;
        this.f5477k = str8;
        this.f5478l = i11;
        this.f5479m = bool2;
        this.f5480n = linkedHashSet7;
        this.f5481o = cVar;
        this.f5482p = linkedHashSet8;
        this.f5483q = str9;
    }
}
