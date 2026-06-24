package y8;

import b9.v;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements e9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f11887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11888b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedList f11889c = new LinkedList();

    public s(char c9) {
        this.f11887a = c9;
    }

    @Override // e9.a
    public final void a(v vVar, v vVar2, int i) {
        e9.a aVar;
        LinkedList linkedList = this.f11889c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = (e9.a) linkedList.getFirst();
                break;
            } else {
                aVar = (e9.a) it.next();
                if (aVar.c() <= i) {
                    break;
                }
            }
        }
        aVar.a(vVar, vVar2, i);
    }

    @Override // e9.a
    public final char b() {
        return this.f11887a;
    }

    @Override // e9.a
    public final int c() {
        return this.f11888b;
    }

    @Override // e9.a
    public final char d() {
        return this.f11887a;
    }

    @Override // e9.a
    public final int e(f fVar, f fVar2) {
        e9.a aVar;
        int i = fVar.g;
        LinkedList linkedList = this.f11889c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = (e9.a) linkedList.getFirst();
                break;
            }
            aVar = (e9.a) it.next();
            if (aVar.c() <= i) {
                break;
            }
        }
        return aVar.e(fVar, fVar2);
    }

    public final void f(e9.a aVar) {
        int iC = aVar.c();
        LinkedList linkedList = this.f11889c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int iC2 = ((e9.a) listIterator.next()).c();
            if (iC > iC2) {
                listIterator.previous();
                listIterator.add(aVar);
                return;
            } else if (iC == iC2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f11887a + "' and minimum length " + iC);
            }
        }
        linkedList.add(aVar);
        this.f11888b = iC;
    }
}
