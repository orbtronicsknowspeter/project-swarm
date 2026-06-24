package j$.util;

import j$.util.List;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes2.dex */
public class i extends h implements java.util.List, List {
    private static final long serialVersionUID = -7754090372962971524L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.List f6071c;

    public i(java.util.List list) {
        super(list);
        this.f6071c = list;
    }

    public i(java.util.List list, Object obj) {
        super(list, obj);
        this.f6071c = list;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f6066b) {
            zEquals = this.f6071c.equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f6066b) {
            iHashCode = this.f6071c.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object obj;
        synchronized (this.f6066b) {
            obj = this.f6071c.get(i);
        }
        return obj;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        Object obj2;
        synchronized (this.f6066b) {
            obj2 = this.f6071c.set(i, obj);
        }
        return obj2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        synchronized (this.f6066b) {
            this.f6071c.add(i, obj);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        Object objRemove;
        synchronized (this.f6066b) {
            objRemove = this.f6071c.remove(i);
        }
        return objRemove;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int iIndexOf;
        synchronized (this.f6066b) {
            iIndexOf = this.f6071c.indexOf(obj);
        }
        return iIndexOf;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int iLastIndexOf;
        synchronized (this.f6066b) {
            iLastIndexOf = this.f6071c.lastIndexOf(obj);
        }
        return iLastIndexOf;
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        boolean zAddAll;
        synchronized (this.f6066b) {
            zAddAll = this.f6071c.addAll(i, collection);
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.f6071c.listIterator();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return this.f6071c.listIterator(i);
    }

    @Override // java.util.List
    public java.util.List subList(int i, int i6) {
        i iVar;
        synchronized (this.f6066b) {
            iVar = new i(this.f6071c.subList(i, i6), this.f6066b);
        }
        return iVar;
    }

    @Override // java.util.List, j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        synchronized (this.f6066b) {
            java.util.List list = this.f6071c;
            if (list instanceof List) {
                ((List) list).replaceAll(unaryOperator);
            } else {
                List.CC.$default$replaceAll(list, unaryOperator);
            }
        }
    }

    @Override // java.util.List, j$.util.List
    public final void sort(Comparator comparator) {
        synchronized (this.f6066b) {
            c.u(this.f6071c, comparator);
        }
    }

    private Object readResolve() {
        java.util.List list = this.f6071c;
        return list instanceof RandomAccess ? new k(list) : this;
    }
}
