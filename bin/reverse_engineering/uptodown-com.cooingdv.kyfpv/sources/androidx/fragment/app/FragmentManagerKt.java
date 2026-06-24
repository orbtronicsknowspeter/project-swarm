package androidx.fragment.app;

import d7.l;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class FragmentManagerKt {
    public static final void commit(FragmentManager fragmentManager, boolean z9, l lVar) {
        fragmentManager.getClass();
        lVar.getClass();
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        fragmentTransactionBeginTransaction.getClass();
        lVar.invoke(fragmentTransactionBeginTransaction);
        if (z9) {
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commit();
        }
    }

    public static /* synthetic */ void commit$default(FragmentManager fragmentManager, boolean z9, l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z9 = false;
        }
        fragmentManager.getClass();
        lVar.getClass();
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        fragmentTransactionBeginTransaction.getClass();
        lVar.invoke(fragmentTransactionBeginTransaction);
        if (z9) {
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commit();
        }
    }

    public static final void commitNow(FragmentManager fragmentManager, boolean z9, l lVar) {
        fragmentManager.getClass();
        lVar.getClass();
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        fragmentTransactionBeginTransaction.getClass();
        lVar.invoke(fragmentTransactionBeginTransaction);
        if (z9) {
            fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commitNow();
        }
    }

    public static /* synthetic */ void commitNow$default(FragmentManager fragmentManager, boolean z9, l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z9 = false;
        }
        fragmentManager.getClass();
        lVar.getClass();
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        fragmentTransactionBeginTransaction.getClass();
        lVar.invoke(fragmentTransactionBeginTransaction);
        if (z9) {
            fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commitNow();
        }
    }

    public static final void transaction(FragmentManager fragmentManager, boolean z9, boolean z10, l lVar) {
        fragmentManager.getClass();
        lVar.getClass();
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        fragmentTransactionBeginTransaction.getClass();
        lVar.invoke(fragmentTransactionBeginTransaction);
        if (z9) {
            if (z10) {
                fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
                return;
            } else {
                fragmentTransactionBeginTransaction.commitNow();
                return;
            }
        }
        if (z10) {
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commit();
        }
    }

    public static /* synthetic */ void transaction$default(FragmentManager fragmentManager, boolean z9, boolean z10, l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z9 = false;
        }
        if ((i & 2) != 0) {
            z10 = false;
        }
        fragmentManager.getClass();
        lVar.getClass();
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        fragmentTransactionBeginTransaction.getClass();
        lVar.invoke(fragmentTransactionBeginTransaction);
        if (z9) {
            if (z10) {
                fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
                return;
            } else {
                fragmentTransactionBeginTransaction.commitNow();
                return;
            }
        }
        if (z10) {
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commit();
        }
    }
}
