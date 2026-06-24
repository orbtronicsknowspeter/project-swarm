package androidx.constraintlayout.core;

import a4.x;
import androidx.constraintlayout.core.ArrayRow;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public class SolverVariableValues implements ArrayRow.ArrayRowVariables {
    private static final boolean DEBUG = false;
    private static final boolean HASH = true;
    private static float sEpsilon = 0.001f;
    protected final Cache mCache;
    private final ArrayRow mRow;
    private final int mNone = -1;
    private int mSize = 16;
    private int mHashSize = 16;
    int[] mKeys = new int[16];
    int[] mNextKeys = new int[16];
    int[] mVariables = new int[16];
    float[] mValues = new float[16];
    int[] mPrevious = new int[16];
    int[] mNext = new int[16];
    int mCount = 0;
    int mHead = -1;

    public SolverVariableValues(ArrayRow arrayRow, Cache cache) {
        this.mRow = arrayRow;
        this.mCache = cache;
        clear();
    }

    private void addToHashMap(SolverVariable solverVariable, int i) {
        int[] iArr;
        int i6 = solverVariable.id % this.mHashSize;
        int[] iArr2 = this.mKeys;
        int i10 = iArr2[i6];
        if (i10 == -1) {
            iArr2[i6] = i;
        } else {
            while (true) {
                iArr = this.mNextKeys;
                int i11 = iArr[i10];
                if (i11 == -1) {
                    break;
                } else {
                    i10 = i11;
                }
            }
            iArr[i10] = i;
        }
        this.mNextKeys[i] = -1;
    }

    private void addVariable(int i, SolverVariable solverVariable, float f) {
        this.mVariables[i] = solverVariable.id;
        this.mValues[i] = f;
        this.mPrevious[i] = -1;
        this.mNext[i] = -1;
        solverVariable.addToRow(this.mRow);
        solverVariable.usageInRowCount++;
        this.mCount++;
    }

    private void displayHash() {
        for (int i = 0; i < this.mHashSize; i++) {
            if (this.mKeys[i] != -1) {
                String string = hashCode() + " hash [" + i + "] => ";
                int i6 = this.mKeys[i];
                boolean z9 = false;
                while (!z9) {
                    StringBuilder sbU = x.u(string, " ");
                    sbU.append(this.mVariables[i6]);
                    string = sbU.toString();
                    int i10 = this.mNextKeys[i6];
                    if (i10 != -1) {
                        i6 = i10;
                    } else {
                        z9 = true;
                    }
                }
                System.out.println(string);
            }
        }
    }

    private int findEmptySlot() {
        for (int i = 0; i < this.mSize; i++) {
            if (this.mVariables[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    private void increaseSize() {
        int i = this.mSize * 2;
        this.mVariables = Arrays.copyOf(this.mVariables, i);
        this.mValues = Arrays.copyOf(this.mValues, i);
        this.mPrevious = Arrays.copyOf(this.mPrevious, i);
        this.mNext = Arrays.copyOf(this.mNext, i);
        this.mNextKeys = Arrays.copyOf(this.mNextKeys, i);
        for (int i6 = this.mSize; i6 < i; i6++) {
            this.mVariables[i6] = -1;
            this.mNextKeys[i6] = -1;
        }
        this.mSize = i;
    }

    private void insertVariable(int i, SolverVariable solverVariable, float f) {
        int iFindEmptySlot = findEmptySlot();
        addVariable(iFindEmptySlot, solverVariable, f);
        int[] iArr = this.mPrevious;
        if (i != -1) {
            iArr[iFindEmptySlot] = i;
            int[] iArr2 = this.mNext;
            iArr2[iFindEmptySlot] = iArr2[i];
            iArr2[i] = iFindEmptySlot;
        } else {
            iArr[iFindEmptySlot] = -1;
            int i6 = this.mCount;
            int[] iArr3 = this.mNext;
            if (i6 > 0) {
                iArr3[iFindEmptySlot] = this.mHead;
                this.mHead = iFindEmptySlot;
            } else {
                iArr3[iFindEmptySlot] = -1;
            }
        }
        int i10 = this.mNext[iFindEmptySlot];
        if (i10 != -1) {
            this.mPrevious[i10] = iFindEmptySlot;
        }
        addToHashMap(solverVariable, iFindEmptySlot);
    }

    private void removeFromHashMap(SolverVariable solverVariable) {
        int[] iArr;
        int i;
        int i6 = solverVariable.id;
        int i10 = i6 % this.mHashSize;
        int[] iArr2 = this.mKeys;
        int i11 = iArr2[i10];
        if (i11 == -1) {
            return;
        }
        if (this.mVariables[i11] == i6) {
            int[] iArr3 = this.mNextKeys;
            iArr2[i10] = iArr3[i11];
            iArr3[i11] = -1;
            return;
        }
        while (true) {
            iArr = this.mNextKeys;
            i = iArr[i11];
            if (i == -1 || this.mVariables[i] == i6) {
                break;
            } else {
                i11 = i;
            }
        }
        if (i == -1 || this.mVariables[i] != i6) {
            return;
        }
        iArr[i11] = iArr[i];
        iArr[i] = -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void add(SolverVariable solverVariable, float f, boolean z9) {
        float f10 = sEpsilon;
        if (f <= (-f10) || f >= f10) {
            int iIndexOf = indexOf(solverVariable);
            if (iIndexOf == -1) {
                put(solverVariable, f);
                return;
            }
            float[] fArr = this.mValues;
            float f11 = fArr[iIndexOf] + f;
            fArr[iIndexOf] = f11;
            float f12 = sEpsilon;
            if (f11 <= (-f12) || f11 >= f12) {
                return;
            }
            fArr[iIndexOf] = 0.0f;
            remove(solverVariable, z9);
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void clear() {
        int i = this.mCount;
        for (int i6 = 0; i6 < i; i6++) {
            SolverVariable variable = getVariable(i6);
            if (variable != null) {
                variable.removeFromRow(this.mRow);
            }
        }
        for (int i10 = 0; i10 < this.mSize; i10++) {
            this.mVariables[i10] = -1;
            this.mNextKeys[i10] = -1;
        }
        for (int i11 = 0; i11 < this.mHashSize; i11++) {
            this.mKeys[i11] = -1;
        }
        this.mCount = 0;
        this.mHead = -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public boolean contains(SolverVariable solverVariable) {
        return indexOf(solverVariable) != -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void display() {
        int i = this.mCount;
        System.out.print("{ ");
        for (int i6 = 0; i6 < i; i6++) {
            SolverVariable variable = getVariable(i6);
            if (variable != null) {
                System.out.print(variable + " = " + getVariableValue(i6) + " ");
            }
        }
        System.out.println(" }");
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void divideByAmount(float f) {
        int i = this.mCount;
        int i6 = this.mHead;
        for (int i10 = 0; i10 < i; i10++) {
            float[] fArr = this.mValues;
            fArr[i6] = fArr[i6] / f;
            i6 = this.mNext[i6];
            if (i6 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float get(SolverVariable solverVariable) {
        int iIndexOf = indexOf(solverVariable);
        if (iIndexOf != -1) {
            return this.mValues[iIndexOf];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int getCurrentSize() {
        return this.mCount;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public SolverVariable getVariable(int i) {
        int i6 = this.mCount;
        if (i6 == 0) {
            return null;
        }
        int i10 = this.mHead;
        for (int i11 = 0; i11 < i6; i11++) {
            if (i11 == i && i10 != -1) {
                return this.mCache.mIndexedVariables[this.mVariables[i10]];
            }
            i10 = this.mNext[i10];
            if (i10 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float getVariableValue(int i) {
        int i6 = this.mCount;
        int i10 = this.mHead;
        for (int i11 = 0; i11 < i6; i11++) {
            if (i11 == i) {
                return this.mValues[i10];
            }
            i10 = this.mNext[i10];
            if (i10 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int indexOf(SolverVariable solverVariable) {
        if (this.mCount != 0 && solverVariable != null) {
            int i = solverVariable.id;
            int i6 = this.mKeys[i % this.mHashSize];
            if (i6 == -1) {
                return -1;
            }
            if (this.mVariables[i6] == i) {
                return i6;
            }
            do {
                i6 = this.mNextKeys[i6];
                if (i6 == -1) {
                    break;
                }
            } while (this.mVariables[i6] != i);
            if (i6 != -1 && this.mVariables[i6] == i) {
                return i6;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void invert() {
        int i = this.mCount;
        int i6 = this.mHead;
        for (int i10 = 0; i10 < i; i10++) {
            float[] fArr = this.mValues;
            fArr[i6] = fArr[i6] * (-1.0f);
            i6 = this.mNext[i6];
            if (i6 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void put(SolverVariable solverVariable, float f) {
        float f10 = sEpsilon;
        if (f > (-f10) && f < f10) {
            remove(solverVariable, true);
            return;
        }
        if (this.mCount == 0) {
            addVariable(0, solverVariable, f);
            addToHashMap(solverVariable, 0);
            this.mHead = 0;
            return;
        }
        int iIndexOf = indexOf(solverVariable);
        if (iIndexOf != -1) {
            this.mValues[iIndexOf] = f;
            return;
        }
        if (this.mCount + 1 >= this.mSize) {
            increaseSize();
        }
        int i = this.mCount;
        int i6 = this.mHead;
        int i10 = -1;
        for (int i11 = 0; i11 < i; i11++) {
            int i12 = this.mVariables[i6];
            int i13 = solverVariable.id;
            if (i12 == i13) {
                this.mValues[i6] = f;
                return;
            }
            if (i12 < i13) {
                i10 = i6;
            }
            i6 = this.mNext[i6];
            if (i6 == -1) {
                break;
            }
        }
        insertVariable(i10, solverVariable, f);
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float remove(SolverVariable solverVariable, boolean z9) {
        int iIndexOf = indexOf(solverVariable);
        if (iIndexOf == -1) {
            return 0.0f;
        }
        removeFromHashMap(solverVariable);
        float f = this.mValues[iIndexOf];
        if (this.mHead == iIndexOf) {
            this.mHead = this.mNext[iIndexOf];
        }
        this.mVariables[iIndexOf] = -1;
        int[] iArr = this.mPrevious;
        int i = iArr[iIndexOf];
        if (i != -1) {
            int[] iArr2 = this.mNext;
            iArr2[i] = iArr2[iIndexOf];
        }
        int i6 = this.mNext[iIndexOf];
        if (i6 != -1) {
            iArr[i6] = iArr[iIndexOf];
        }
        this.mCount--;
        solverVariable.usageInRowCount--;
        if (z9) {
            solverVariable.removeFromRow(this.mRow);
        }
        return f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int sizeInBytes() {
        return 0;
    }

    public String toString() {
        String strConcat;
        String strConcat2;
        String strConcat3 = hashCode() + " { ";
        int i = this.mCount;
        for (int i6 = 0; i6 < i; i6++) {
            SolverVariable variable = getVariable(i6);
            if (variable != null) {
                String str = strConcat3 + variable + " = " + getVariableValue(i6) + " ";
                int iIndexOf = indexOf(variable);
                String strConcat4 = str.concat("[p: ");
                if (this.mPrevious[iIndexOf] != -1) {
                    StringBuilder sbT = x.t(strConcat4);
                    sbT.append(this.mCache.mIndexedVariables[this.mVariables[this.mPrevious[iIndexOf]]]);
                    strConcat = sbT.toString();
                } else {
                    strConcat = strConcat4.concat("none");
                }
                String strConcat5 = strConcat.concat(", n: ");
                if (this.mNext[iIndexOf] != -1) {
                    StringBuilder sbT2 = x.t(strConcat5);
                    sbT2.append(this.mCache.mIndexedVariables[this.mVariables[this.mNext[iIndexOf]]]);
                    strConcat2 = sbT2.toString();
                } else {
                    strConcat2 = strConcat5.concat("none");
                }
                strConcat3 = strConcat2.concat("]");
            }
        }
        return x.C(strConcat3, " }");
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float use(ArrayRow arrayRow, boolean z9) {
        float f = get(arrayRow.mVariable);
        remove(arrayRow.mVariable, z9);
        SolverVariableValues solverVariableValues = (SolverVariableValues) arrayRow.variables;
        int currentSize = solverVariableValues.getCurrentSize();
        int i = 0;
        int i6 = 0;
        while (i < currentSize) {
            int i10 = solverVariableValues.mVariables[i6];
            if (i10 != -1) {
                add(this.mCache.mIndexedVariables[i10], solverVariableValues.mValues[i6] * f, z9);
                i++;
            }
            i6++;
        }
        return f;
    }
}
