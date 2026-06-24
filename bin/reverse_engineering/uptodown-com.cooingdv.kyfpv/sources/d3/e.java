package d3;

import a4.x;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3557a;

    public e(String str) {
        str.getClass();
        this.f3557a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && l.a(this.f3557a, ((e) obj).f3557a);
    }

    public final int hashCode() {
        return this.f3557a.hashCode();
    }

    public final String toString() {
        return x.m(new StringBuilder("SessionDetails(sessionId="), this.f3557a, ')');
    }
}
