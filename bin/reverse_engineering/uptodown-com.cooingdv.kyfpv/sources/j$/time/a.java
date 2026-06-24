package j$.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends j$.com.android.tools.r8.a implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f5757b;
    private static final long serialVersionUID = 6740630888130243051L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ZoneId f5758a;

    public a(ZoneId zoneId) {
        this.f5758a = zoneId;
    }

    static {
        System.currentTimeMillis();
        f5757b = new a(ZoneOffset.UTC);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f5758a.equals(((a) obj).f5758a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5758a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.f5758a + "]";
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
    }
}
