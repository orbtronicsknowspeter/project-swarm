package androidx.leanback.widget;

import androidx.leanback.widget.Grid;
import androidx.leanback.widget.StaggeredGrid;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
final class StaggeredGridDefault extends StaggeredGrid {
    private int findRowEdgeLimitSearchIndex(boolean z9) {
        boolean z10 = false;
        if (z9) {
            for (int i = this.mLastVisibleIndex; i >= this.mFirstVisibleIndex; i--) {
                int i6 = getLocation(i).mRow;
                if (i6 == 0) {
                    z10 = true;
                } else if (z10 && i6 == this.mNumRows - 1) {
                    return i;
                }
            }
            return -1;
        }
        for (int i10 = this.mFirstVisibleIndex; i10 <= this.mLastVisibleIndex; i10++) {
            int i11 = getLocation(i10).mRow;
            if (i11 == this.mNumRows - 1) {
                z10 = true;
            } else if (z10 && i11 == 0) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x012a, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c5 A[PHI: r9 r11
      0x00c5: PHI (r9v19 int) = (r9v11 int), (r9v4 int) binds: [B:78:0x00e3, B:66:0x00c3] A[DONT_GENERATE, DONT_INLINE]
      0x00c5: PHI (r11v9 int) = (r11v2 int), (r11v11 int) binds: [B:78:0x00e3, B:66:0x00c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fd A[LOOP:2: B:85:0x00fd->B:101:0x011f, LOOP_START, PHI: r6 r9 r10
      0x00fd: PHI (r6v12 int) = (r6v6 int), (r6v16 int) binds: [B:84:0x00fb, B:101:0x011f] A[DONT_GENERATE, DONT_INLINE]
      0x00fd: PHI (r9v15 int) = (r9v13 int), (r9v16 int) binds: [B:84:0x00fb, B:101:0x011f] A[DONT_GENERATE, DONT_INLINE]
      0x00fd: PHI (r10v5 int) = (r10v3 int), (r10v7 int) binds: [B:84:0x00fb, B:101:0x011f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.leanback.widget.StaggeredGrid
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean appendVisibleItemsWithoutCache(int r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.StaggeredGridDefault.appendVisibleItemsWithoutCache(int, boolean):boolean");
    }

    @Override // androidx.leanback.widget.Grid
    public int findRowMax(boolean z9, int i, int[] iArr) {
        int i6;
        int edge = this.mProvider.getEdge(i);
        StaggeredGrid.Location location = getLocation(i);
        int i10 = location.mRow;
        if (this.mReversedFlow) {
            i6 = i10;
            int i11 = i6;
            int i12 = 1;
            int i13 = edge;
            for (int i14 = i + 1; i12 < this.mNumRows && i14 <= this.mLastVisibleIndex; i14++) {
                StaggeredGrid.Location location2 = getLocation(i14);
                i13 += location2.mOffset;
                int i15 = location2.mRow;
                if (i15 != i11) {
                    i12++;
                    if (!z9 ? i13 >= edge : i13 <= edge) {
                        i11 = i15;
                    } else {
                        edge = i13;
                        i = i14;
                        i6 = i15;
                        i11 = i6;
                    }
                }
            }
        } else {
            int i16 = 1;
            int i17 = i10;
            StaggeredGrid.Location location3 = location;
            int i18 = edge;
            edge = this.mProvider.getSize(i) + edge;
            i6 = i17;
            for (int i19 = i - 1; i16 < this.mNumRows && i19 >= this.mFirstVisibleIndex; i19--) {
                i18 -= location3.mOffset;
                location3 = getLocation(i19);
                int i20 = location3.mRow;
                if (i20 != i17) {
                    i16++;
                    int size = this.mProvider.getSize(i19) + i18;
                    if (!z9 ? size >= edge : size <= edge) {
                        i17 = i20;
                    } else {
                        edge = size;
                        i = i19;
                        i6 = i20;
                        i17 = i6;
                    }
                }
            }
        }
        if (iArr != null) {
            iArr[0] = i6;
            iArr[1] = i;
        }
        return edge;
    }

    @Override // androidx.leanback.widget.Grid
    public int findRowMin(boolean z9, int i, int[] iArr) {
        int size;
        int edge = this.mProvider.getEdge(i);
        StaggeredGrid.Location location = getLocation(i);
        int i6 = location.mRow;
        if (this.mReversedFlow) {
            int i10 = 1;
            size = edge - this.mProvider.getSize(i);
            int i11 = i6;
            for (int i12 = i - 1; i10 < this.mNumRows && i12 >= this.mFirstVisibleIndex; i12--) {
                edge -= location.mOffset;
                location = getLocation(i12);
                int i13 = location.mRow;
                if (i13 != i11) {
                    i10++;
                    int size2 = edge - this.mProvider.getSize(i12);
                    if (!z9 ? size2 >= size : size2 <= size) {
                        i11 = i13;
                    } else {
                        size = size2;
                        i = i12;
                        i6 = i13;
                        i11 = i6;
                    }
                }
            }
        } else {
            int i14 = i6;
            int i15 = i14;
            int i16 = 1;
            int i17 = edge;
            for (int i18 = i + 1; i16 < this.mNumRows && i18 <= this.mLastVisibleIndex; i18++) {
                StaggeredGrid.Location location2 = getLocation(i18);
                i17 += location2.mOffset;
                int i19 = location2.mRow;
                if (i19 != i15) {
                    i16++;
                    if (!z9 ? i17 >= edge : i17 <= edge) {
                        i15 = i19;
                    } else {
                        edge = i17;
                        i = i18;
                        i14 = i19;
                        i15 = i14;
                    }
                }
            }
            size = edge;
            i6 = i14;
        }
        if (iArr != null) {
            iArr[0] = i6;
            iArr[1] = i;
        }
        return size;
    }

    public int getRowMax(int i) {
        int i6;
        StaggeredGrid.Location location;
        int i10 = this.mFirstVisibleIndex;
        if (i10 < 0) {
            return Integer.MIN_VALUE;
        }
        boolean z9 = this.mReversedFlow;
        Grid.Provider provider = this.mProvider;
        if (z9) {
            int edge = provider.getEdge(i10);
            if (getLocation(this.mFirstVisibleIndex).mRow == i) {
                return edge;
            }
            int i11 = this.mFirstVisibleIndex;
            do {
                i11++;
                if (i11 <= getLastIndex()) {
                    location = getLocation(i11);
                    edge += location.mOffset;
                }
            } while (location.mRow != i);
            return edge;
        }
        int edge2 = provider.getEdge(this.mLastVisibleIndex);
        StaggeredGrid.Location location2 = getLocation(this.mLastVisibleIndex);
        if (location2.mRow == i) {
            i6 = location2.mSize;
        } else {
            int i12 = this.mLastVisibleIndex;
            do {
                i12--;
                if (i12 >= getFirstIndex()) {
                    edge2 -= location2.mOffset;
                    location2 = getLocation(i12);
                }
            } while (location2.mRow != i);
            i6 = location2.mSize;
        }
        return edge2 + i6;
        return Integer.MIN_VALUE;
    }

    public int getRowMin(int i) {
        StaggeredGrid.Location location;
        int i6;
        int i10 = this.mFirstVisibleIndex;
        if (i10 < 0) {
            return Integer.MAX_VALUE;
        }
        boolean z9 = this.mReversedFlow;
        Grid.Provider provider = this.mProvider;
        if (!z9) {
            int edge = provider.getEdge(i10);
            if (getLocation(this.mFirstVisibleIndex).mRow == i) {
                return edge;
            }
            int i11 = this.mFirstVisibleIndex;
            do {
                i11++;
                if (i11 <= getLastIndex()) {
                    location = getLocation(i11);
                    edge += location.mOffset;
                }
            } while (location.mRow != i);
            return edge;
        }
        int edge2 = provider.getEdge(this.mLastVisibleIndex);
        StaggeredGrid.Location location2 = getLocation(this.mLastVisibleIndex);
        if (location2.mRow == i) {
            i6 = location2.mSize;
        } else {
            int i12 = this.mLastVisibleIndex;
            do {
                i12--;
                if (i12 >= getFirstIndex()) {
                    edge2 -= location2.mOffset;
                    location2 = getLocation(i12);
                }
            } while (location2.mRow != i);
            i6 = location2.mSize;
        }
        return edge2 - i6;
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0125, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c3 A[PHI: r8 r10
      0x00c3: PHI (r8v19 int) = (r8v11 int), (r8v4 int) binds: [B:75:0x00e0, B:63:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00c3: PHI (r10v8 int) = (r10v1 int), (r10v10 int) binds: [B:75:0x00e0, B:63:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f8 A[LOOP:2: B:83:0x00f8->B:99:0x011a, LOOP_START, PHI: r5 r8 r9
      0x00f8: PHI (r5v12 int) = (r5v6 int), (r5v17 int) binds: [B:82:0x00f6, B:99:0x011a] A[DONT_GENERATE, DONT_INLINE]
      0x00f8: PHI (r8v15 int) = (r8v13 int), (r8v16 int) binds: [B:82:0x00f6, B:99:0x011a] A[DONT_GENERATE, DONT_INLINE]
      0x00f8: PHI (r9v4 int) = (r9v2 int), (r9v6 int) binds: [B:82:0x00f6, B:99:0x011a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.leanback.widget.StaggeredGrid
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean prependVisibleItemsWithoutCache(int r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.StaggeredGridDefault.prependVisibleItemsWithoutCache(int, boolean):boolean");
    }
}
