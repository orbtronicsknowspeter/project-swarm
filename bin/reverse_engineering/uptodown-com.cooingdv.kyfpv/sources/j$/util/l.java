package j$.util;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends h implements Set {
    private static final long serialVersionUID = 487447009682186044L;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f6066b) {
            zEquals = this.f6065a.equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f6066b) {
            iHashCode = this.f6065a.hashCode();
        }
        return iHashCode;
    }
}
