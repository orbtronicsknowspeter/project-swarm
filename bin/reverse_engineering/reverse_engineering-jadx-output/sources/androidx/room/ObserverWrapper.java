package androidx.room;

import androidx.room.InvalidationTracker;
import com.google.android.gms.internal.measurement.z3;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import l7.u;
import q6.v;
import r6.i;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class ObserverWrapper {
    private final InvalidationTracker.Observer observer;
    private final Set<String> singleTableSet;
    private final int[] tableIds;
    private final String[] tableNames;

    public ObserverWrapper(InvalidationTracker.Observer observer, int[] iArr, String[] strArr) {
        Set<String> setSingleton;
        observer.getClass();
        iArr.getClass();
        strArr.getClass();
        this.observer = observer;
        this.tableIds = iArr;
        this.tableNames = strArr;
        if (iArr.length != strArr.length) {
            androidx.privacysandbox.ads.adservices.customaudience.a.i("Check failed.");
            throw null;
        }
        if (strArr.length == 0) {
            setSingleton = v.f8726a;
        } else {
            setSingleton = Collections.singleton(strArr[0]);
            setSingleton.getClass();
        }
        this.singleTableSet = setSingleton;
    }

    public final InvalidationTracker.Observer getObserver$room_runtime_release() {
        return this.observer;
    }

    public final int[] getTableIds$room_runtime_release() {
        return this.tableIds;
    }

    public final void notifyByTableIds$room_runtime_release(Set<Integer> set) {
        set.getClass();
        int[] iArr = this.tableIds;
        int length = iArr.length;
        Set<String> setG = v.f8726a;
        if (length != 0) {
            int i = 0;
            if (length != 1) {
                i iVar = new i();
                int[] iArr2 = this.tableIds;
                int length2 = iArr2.length;
                int i6 = 0;
                while (i < length2) {
                    int i10 = i6 + 1;
                    if (set.contains(Integer.valueOf(iArr2[i]))) {
                        iVar.add(this.tableNames[i6]);
                    }
                    i++;
                    i6 = i10;
                }
                setG = z3.g(iVar);
            } else if (set.contains(Integer.valueOf(iArr[0]))) {
                setG = this.singleTableSet;
            }
        }
        if (setG.isEmpty()) {
            return;
        }
        this.observer.onInvalidated(setG);
    }

    public final void notifyByTableNames$room_runtime_release(Set<String> set) {
        set.getClass();
        int length = this.tableNames.length;
        Set<String> setG = v.f8726a;
        if (length != 0) {
            if (length != 1) {
                i iVar = new i();
                for (String str : set) {
                    String[] strArr = this.tableNames;
                    int length2 = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i < length2) {
                            String str2 = strArr[i];
                            if (u.m0(str2, str, true)) {
                                iVar.add(str2);
                                break;
                            }
                            i++;
                        }
                    }
                }
                setG = z3.g(iVar);
            } else if (!set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (u.m0((String) it.next(), this.tableNames[0], true)) {
                            setG = this.singleTableSet;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        if (setG.isEmpty()) {
            return;
        }
        this.observer.onInvalidated(setG);
    }
}
