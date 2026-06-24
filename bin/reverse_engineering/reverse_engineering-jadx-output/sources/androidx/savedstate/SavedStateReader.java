package androidx.savedstate;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.core.location.LocationRequestCompat;
import androidx.core.os.BundleCompat;
import d0.b;
import j7.c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import r6.f;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class SavedStateReader {
    private final Bundle source;

    private /* synthetic */ SavedStateReader(Bundle bundle) {
        this.source = bundle;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SavedStateReader m96boximpl(Bundle bundle) {
        return new SavedStateReader(bundle);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static Bundle m97constructorimpl(Bundle bundle) {
        bundle.getClass();
        return bundle;
    }

    /* JADX INFO: renamed from: contains-impl, reason: not valid java name */
    public static final boolean m98containsimpl(Bundle bundle, String str) {
        str.getClass();
        return bundle.containsKey(str);
    }

    /* JADX INFO: renamed from: contentDeepEquals-impl, reason: not valid java name */
    public static final boolean m99contentDeepEqualsimpl(Bundle bundle, Bundle bundle2) {
        bundle2.getClass();
        return SavedStateReaderKt__SavedStateReader_androidKt.contentDeepEquals$SavedStateReaderKt__SavedStateReader_androidKt(bundle, bundle2);
    }

    /* JADX INFO: renamed from: contentDeepHashCode-impl, reason: not valid java name */
    public static final int m100contentDeepHashCodeimpl(Bundle bundle) {
        return SavedStateReaderKt__SavedStateReader_androidKt.contentDeepHashCode$SavedStateReaderKt__SavedStateReader_androidKt(bundle);
    }

    /* JADX INFO: renamed from: contentDeepToString-impl, reason: not valid java name */
    public static final String m101contentDeepToStringimpl(Bundle bundle) {
        int size = bundle.size();
        if (size > 429496729) {
            size = 429496729;
        }
        StringBuilder sb = new StringBuilder((size * 5) + 2);
        SavedStateReaderKt__SavedStateReader_androidKt.contentDeepToString$SavedStateReaderKt__SavedStateReader_androidKt(bundle, sb, new ArrayList());
        return sb.toString();
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m102equalsimpl(Bundle bundle, Object obj) {
        return (obj instanceof SavedStateReader) && l.a(bundle, ((SavedStateReader) obj).m180unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m103equalsimpl0(Bundle bundle, Bundle bundle2) {
        return l.a(bundle, bundle2);
    }

    /* JADX INFO: renamed from: getBinder-impl, reason: not valid java name */
    public static final IBinder m104getBinderimpl(Bundle bundle, String str) {
        str.getClass();
        IBinder binder = bundle.getBinder(str);
        if (binder != null) {
            return binder;
        }
        throw androidx.lifecycle.l.r(str);
    }

    /* JADX INFO: renamed from: getBinderOrNull-impl, reason: not valid java name */
    public static final IBinder m105getBinderOrNullimpl(Bundle bundle, String str) {
        str.getClass();
        return bundle.getBinder(str);
    }

    /* JADX INFO: renamed from: getBoolean-impl, reason: not valid java name */
    public static final boolean m106getBooleanimpl(Bundle bundle, String str) {
        str.getClass();
        boolean z9 = bundle.getBoolean(str, false);
        if (z9 || !bundle.getBoolean(str, true)) {
            return z9;
        }
        throw androidx.lifecycle.l.r(str);
    }

    /* JADX INFO: renamed from: getBooleanArray-impl, reason: not valid java name */
    public static final boolean[] m107getBooleanArrayimpl(Bundle bundle, String str) {
        str.getClass();
        boolean[] booleanArray = bundle.getBooleanArray(str);
        if (booleanArray != null) {
            return booleanArray;
        }
        throw androidx.lifecycle.l.r(str);
    }

    /* JADX INFO: renamed from: getBooleanArrayOrNull-impl, reason: not valid java name */
    public static final boolean[] m108getBooleanArrayOrNullimpl(Bundle bundle, String str) {
        str.getClass();
        return bundle.getBooleanArray(str);
    }

    /* JADX INFO: renamed from: getBooleanOrNull-impl, reason: not valid java name */
    public static final Boolean m109getBooleanOrNullimpl(Bundle bundle, String str) {
        str.getClass();
        boolean z9 = bundle.getBoolean(str, false);
        if (z9 || !bundle.getBoolean(str, true)) {
            return Boolean.valueOf(z9);
        }
        return null;
    }

    /* JADX INFO: renamed from: getChar-impl, reason: not valid java name */
    public static final char m110getCharimpl(Bundle bundle, String str) {
        str.getClass();
        char c9 = bundle.getChar(str, (char) 0);
        if (c9 == 0 && bundle.getChar(str, (char) 65535) == 65535) {
            throw androidx.lifecycle.l.r(str);
        }
        return c9;
    }

    /* JADX INFO: renamed from: getCharArray-impl, reason: not valid java name */
    public static final char[] m111getCharArrayimpl(Bundle bundle, String str) {
        str.getClass();
        char[] charArray = bundle.getCharArray(str);
        if (charArray != null) {
            return charArray;
        }
        throw androidx.lifecycle.l.r(str);
    }

    /* JADX INFO: renamed from: getCharArrayOrNull-impl, reason: not valid java name */
    public static final char[] m112getCharArrayOrNullimpl(Bundle bundle, String str) {
        str.getClass();
        return bundle.getCharArray(str);
    }

    /* JADX INFO: renamed from: getCharOrNull-impl, reason: not valid java name */
    public static final Character m113getCharOrNullimpl(Bundle bundle, String str) {
        str.getClass();
        char c9 = bundle.getChar(str, (char) 0);
        if (c9 == 0 && bundle.getChar(str, (char) 65535) == 65535) {
            return null;
        }
        return Character.valueOf(c9);
    }

    /* JADX INFO: renamed from: getCharSequence-impl, reason: not valid java name */
    public static final CharSequence m114getCharSequenceimpl(Bundle bundle, String str) {
        str.getClass();
        CharSequence charSequence = bundle.getCharSequence(str);
        if (charSequence != null) {
            return charSequence;
        }
        throw androidx.lifecycle.l.r(str);
    }

    /* JADX INFO: renamed from: getCharSequenceArray-impl, reason: not valid java name */
    public static final CharSequence[] m115getCharSequenceArrayimpl(Bundle bundle, String str) {
        str.getClass();
        CharSequence[] charSequenceArray = bundle.getCharSequenceArray(str);
        if (charSequenceArray != null) {
            return charSequenceArray;
        }
        throw androidx.lifecycle.l.r(str);
    }

    /* JADX INFO: renamed from: getCharSequenceArrayOrNull-impl, reason: not valid java name */
    public static final CharSequence[] m116getCharSequenceArrayOrNullimpl(Bundle bundle, String str) {
        str.getClass();
        return bundle.getCharSequenceArray(str);
    }

    /* JADX INFO: renamed from: getCharSequenceList-impl, reason: not valid java name */
    public static final List<CharSequence> m117getCharSequenceListimpl(Bundle bundle, String str) {
        str.getClass();
        ArrayList<CharSequence> charSequenceArrayList = bundle.getCharSequenceArrayList(str);
        if (charSequenceArrayList != null) {
            return charSequenceArrayList;
        }
        throw androidx.lifecycle.l.r(str);
    }

    /* JADX INFO: renamed from: getCharSequenceListOrNull-impl, reason: not valid java name */
    public static final List<CharSequence> m118getCharSequenceListOrNullimpl(Bundle bundle, String str) {
        str.getClass();
        return bundle.getCharSequenceArrayList(str);
    }

    /* JADX INFO: renamed from: getCharSequenceOrNull-impl, reason: not valid java name */
    public static final CharSequence m119getCharSequenceOrNullimpl(Bundle bundle, String str) {
        str.getClass();
        return bundle.getCharSequence(str);
    }

    /* JADX INFO: renamed from: getDouble-impl, reason: not valid java name */
    public static final double m120getDoubleimpl(Bundle bundle, String str) {
        str.getClass();
        double d10 = bundle.getDouble(str, Double.MIN_VALUE);
        if (d10 == Double.MIN_VALUE && bundle.getDouble(str, Double.MAX_VALUE) == Double.MAX_VALUE) {
            throw androidx.lifecycle.l.r(str);
        }
        return d10;
    }

    /* JADX INFO: renamed from: getDoubleArray-impl, reason: not valid java name */
    public static final double[] m121getDoubleArrayimpl(Bundle bundle, String str) {
        str.getClass();
        double[] doubleArray = bundle.getDoubleArray(str);
        if (doubleArray != null) {
            return doubleArray;
        }
        throw androidx.lifecycle.l.r(str);
    }

    /* JADX INFO: renamed from: getDoubleArrayOrNull-impl, reason: not valid java name */
    public static final double[] m122getDoubleArrayOrNullimpl(Bundle bundle, String str) {
        str.getClass();
        return bundle.getDoubleArray(str);
    }

    /* JADX INFO: renamed from: getDoubleOrNull-impl, reason: not valid java name */
    public static final Double m123getDoubleOrNullimpl(Bundle bundle, String str) {
        str.getClass();
        double d10 = bundle.getDouble(str, Double.MIN_VALUE);
        if (d10 == Double.MIN_VALUE && bundle.getDouble(str, Double.MAX_VALUE) == Double.MAX_VALUE) {
            return null;
        }
        return Double.valueOf(d10);
    }

    /* JADX INFO: renamed from: getFloat-impl, reason: not valid java name */
    public static final float m124getFloatimpl(Bundle bundle, String str) {
        str.getClass();
        float f = bundle.getFloat(str, Float.MIN_VALUE);
        if (f == Float.MIN_VALUE && bundle.getFloat(str, Float.MAX_VALUE) == Float.MAX_VALUE) {
            throw androidx.lifecycle.l.r(str);
        }
        return f;
    }

    /* JADX INFO: renamed from: getFloatArray-impl, reason: not valid java name */
    public static final float[] m125getFloatArrayimpl(Bundle bundle, String str) {
        str.getClass();
        float[] floatArray = bundle.getFloatArray(str);
        if (floatArray != null) {
            return floatArray;
        }
        throw androidx.lifecycle.l.r(str);
    }

    /* JADX INFO: renamed from: getFloatArrayOrNull-impl, reason: not valid java name */
    public static final float[] m126getFloatArrayOrNullimpl(Bundle bundle, String str) {
        str.getClass();
        return bundle.getFloatArray(str);
    }

    /* JADX INFO: renamed from: getFloatOrNull-impl, reason: not valid java name */
    public static final Float m127getFloatOrNullimpl(Bundle bundle, String str) {
        str.getClass();
        float f = bundle.getFloat(str, Float.MIN_VALUE);
        if (f == Float.MIN_VALUE && bundle.getFloat(str, Float.MAX_VALUE) == Float.MAX_VALUE) {
            return null;
        }
        return Float.valueOf(f);
    }

    /* JADX INFO: renamed from: getInt-impl, reason: not valid java name */
    public static final int m128getIntimpl(Bundle bundle, String str) {
        str.getClass();
        int i = bundle.getInt(str, Integer.MIN_VALUE);
        if (i == Integer.MIN_VALUE && bundle.getInt(str, Integer.MAX_VALUE) == Integer.MAX_VALUE) {
            throw androidx.lifecycle.l.r(str);
        }
        return i;
    }

    /* JADX INFO: renamed from: getIntArray-impl, reason: not valid java name */
    public static final int[] m129getIntArrayimpl(Bundle bundle, String str) {
        str.getClass();
        int[] intArray = bundle.getIntArray(str);
        if (intArray != null) {
            return intArray;
        }
        throw androidx.lifecycle.l.r(str);
    }

    /* JADX INFO: renamed from: getIntArrayOrNull-impl, reason: not valid java name */
    public static final int[] m130getIntArrayOrNullimpl(Bundle bundle, String str) {
        str.getClass();
        return bundle.getIntArray(str);
    }

    /* JADX INFO: renamed from: getIntList-impl, reason: not valid java name */
    public static final List<Integer> m131getIntListimpl(Bundle bundle, String str) {
        str.getClass();
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        throw androidx.lifecycle.l.r(str);
    }

    /* JADX INFO: renamed from: getIntListOrNull-impl, reason: not valid java name */
    public static final List<Integer> m132getIntListOrNullimpl(Bundle bundle, String str) {
        str.getClass();
        return bundle.getIntegerArrayList(str);
    }

    /* JADX INFO: renamed from: getIntOrNull-impl, reason: not valid java name */
    public static final Integer m133getIntOrNullimpl(Bundle bundle, String str) {
        str.getClass();
        int i = bundle.getInt(str, Integer.MIN_VALUE);
        if (i == Integer.MIN_VALUE && bundle.getInt(str, Integer.MAX_VALUE) == Integer.MAX_VALUE) {
            return null;
        }
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: getJavaSerializable-impl, reason: not valid java name */
    public static final <T extends Serializable> T m135getJavaSerializableimpl(Bundle bundle, String str, c cVar) {
        str.getClass();
        cVar.getClass();
        T t9 = (T) BundleCompat.getSerializable(bundle, str, b.F(cVar));
        if (t9 != null) {
            return t9;
        }
        throw androidx.lifecycle.l.r(str);
    }

    /* JADX INFO: renamed from: getJavaSerializableOrNull-impl, reason: not valid java name */
    public static final <T extends Serializable> T m137getJavaSerializableOrNullimpl(Bundle bundle, String str, c cVar) {
        str.getClass();
        cVar.getClass();
        return (T) BundleCompat.getSerializable(bundle, str, b.F(cVar));
    }

    /* JADX INFO: renamed from: getLong-impl, reason: not valid java name */
    public static final long m138getLongimpl(Bundle bundle, String str) {
        str.getClass();
        long j = bundle.getLong(str, Long.MIN_VALUE);
        if (j == Long.MIN_VALUE && bundle.getLong(str, LocationRequestCompat.PASSIVE_INTERVAL) == LocationRequestCompat.PASSIVE_INTERVAL) {
            throw androidx.lifecycle.l.r(str);
        }
        return j;
    }

    /* JADX INFO: renamed from: getLongArray-impl, reason: not valid java name */
    public static final long[] m139getLongArrayimpl(Bundle bundle, String str) {
        str.getClass();
        long[] longArray = bundle.getLongArray(str);
        if (longArray != null) {
            return longArray;
        }
        throw androidx.lifecycle.l.r(str);
    }

    /* JADX INFO: renamed from: getLongArrayOrNull-impl, reason: not valid java name */
    public static final long[] m140getLongArrayOrNullimpl(Bundle bundle, String str) {
        str.getClass();
        return bundle.getLongArray(str);
    }

    /* JADX INFO: renamed from: getLongOrNull-impl, reason: not valid java name */
    public static final Long m141getLongOrNullimpl(Bundle bundle, String str) {
        str.getClass();
        long j = bundle.getLong(str, Long.MIN_VALUE);
        if (j == Long.MIN_VALUE && bundle.getLong(str, LocationRequestCompat.PASSIVE_INTERVAL) == LocationRequestCompat.PASSIVE_INTERVAL) {
            return null;
        }
        return Long.valueOf(j);
    }

    /* JADX INFO: renamed from: getParcelable-impl, reason: not valid java name */
    public static final <T extends Parcelable> T m143getParcelableimpl(Bundle bundle, String str, c cVar) {
        str.getClass();
        cVar.getClass();
        T t9 = (T) BundleCompat.getParcelable(bundle, str, b.F(cVar));
        if (t9 != null) {
            return t9;
        }
        throw androidx.lifecycle.l.r(str);
    }

    /* JADX INFO: renamed from: getParcelableArray-impl, reason: not valid java name */
    public static final <T extends Parcelable> T[] m145getParcelableArrayimpl(Bundle bundle, String str, c cVar) {
        str.getClass();
        cVar.getClass();
        T[] tArr = (T[]) m147getParcelableArrayOrNullimpl(bundle, str, cVar);
        if (tArr != null) {
            return tArr;
        }
        throw androidx.lifecycle.l.r(str);
    }

    /* JADX INFO: renamed from: getParcelableArrayOrNull-impl, reason: not valid java name */
    public static final <T extends Parcelable> T[] m147getParcelableArrayOrNullimpl(Bundle bundle, String str, c cVar) {
        str.getClass();
        cVar.getClass();
        T[] tArr = (T[]) BundleCompat.getParcelableArray(bundle, str, b.F(cVar));
        if (tArr != null) {
            return tArr;
        }
        return null;
    }

    /* JADX INFO: renamed from: getParcelableList-impl, reason: not valid java name */
    public static final <T extends Parcelable> List<T> m149getParcelableListimpl(Bundle bundle, String str, c cVar) {
        str.getClass();
        cVar.getClass();
        ArrayList parcelableArrayList = BundleCompat.getParcelableArrayList(bundle, str, b.F(cVar));
        if (parcelableArrayList != null) {
            return parcelableArrayList;
        }
        throw androidx.lifecycle.l.r(str);
    }

    /* JADX INFO: renamed from: getParcelableListOrNull-impl, reason: not valid java name */
    public static final <T extends Parcelable> List<T> m151getParcelableListOrNullimpl(Bundle bundle, String str, c cVar) {
        str.getClass();
        cVar.getClass();
        return BundleCompat.getParcelableArrayList(bundle, str, b.F(cVar));
    }

    /* JADX INFO: renamed from: getParcelableOrNull-impl, reason: not valid java name */
    public static final <T extends Parcelable> T m153getParcelableOrNullimpl(Bundle bundle, String str, c cVar) {
        str.getClass();
        cVar.getClass();
        return (T) BundleCompat.getParcelable(bundle, str, b.F(cVar));
    }

    /* JADX INFO: renamed from: getSavedState-impl, reason: not valid java name */
    public static final Bundle m154getSavedStateimpl(Bundle bundle, String str) {
        str.getClass();
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        throw androidx.lifecycle.l.r(str);
    }

    /* JADX INFO: renamed from: getSavedStateArray-impl, reason: not valid java name */
    public static final Bundle[] m155getSavedStateArrayimpl(Bundle bundle, String str) {
        str.getClass();
        return (Bundle[]) m145getParcelableArrayimpl(bundle, str, y.a(Bundle.class));
    }

    /* JADX INFO: renamed from: getSavedStateArrayOrNull-impl, reason: not valid java name */
    public static final Bundle[] m156getSavedStateArrayOrNullimpl(Bundle bundle, String str) {
        str.getClass();
        return (Bundle[]) m147getParcelableArrayOrNullimpl(bundle, str, y.a(Bundle.class));
    }

    /* JADX INFO: renamed from: getSavedStateList-impl, reason: not valid java name */
    public static final List<Bundle> m157getSavedStateListimpl(Bundle bundle, String str) {
        str.getClass();
        return m149getParcelableListimpl(bundle, str, y.a(Bundle.class));
    }

    /* JADX INFO: renamed from: getSavedStateListOrNull-impl, reason: not valid java name */
    public static final List<Bundle> m158getSavedStateListOrNullimpl(Bundle bundle, String str) {
        str.getClass();
        return m151getParcelableListOrNullimpl(bundle, str, y.a(Bundle.class));
    }

    /* JADX INFO: renamed from: getSavedStateOrNull-impl, reason: not valid java name */
    public static final Bundle m159getSavedStateOrNullimpl(Bundle bundle, String str) {
        str.getClass();
        return bundle.getBundle(str);
    }

    /* JADX INFO: renamed from: getSize-impl, reason: not valid java name */
    public static final Size m160getSizeimpl(Bundle bundle, String str) {
        str.getClass();
        Size size = bundle.getSize(str);
        if (size != null) {
            return size;
        }
        throw androidx.lifecycle.l.r(str);
    }

    /* JADX INFO: renamed from: getSizeF-impl, reason: not valid java name */
    public static final SizeF m161getSizeFimpl(Bundle bundle, String str) {
        str.getClass();
        SizeF sizeF = bundle.getSizeF(str);
        if (sizeF != null) {
            return sizeF;
        }
        throw androidx.lifecycle.l.r(str);
    }

    /* JADX INFO: renamed from: getSizeFOrNull-impl, reason: not valid java name */
    public static final SizeF m162getSizeFOrNullimpl(Bundle bundle, String str) {
        str.getClass();
        return bundle.getSizeF(str);
    }

    /* JADX INFO: renamed from: getSizeOrNull-impl, reason: not valid java name */
    public static final Size m163getSizeOrNullimpl(Bundle bundle, String str) {
        str.getClass();
        return bundle.getSize(str);
    }

    /* JADX INFO: renamed from: getSparseParcelableArray-impl, reason: not valid java name */
    public static final <T extends Parcelable> SparseArray<T> m165getSparseParcelableArrayimpl(Bundle bundle, String str, c cVar) {
        str.getClass();
        cVar.getClass();
        SparseArray<T> sparseArrayM167getSparseParcelableArrayOrNullimpl = m167getSparseParcelableArrayOrNullimpl(bundle, str, cVar);
        if (sparseArrayM167getSparseParcelableArrayOrNullimpl != null) {
            return sparseArrayM167getSparseParcelableArrayOrNullimpl;
        }
        throw androidx.lifecycle.l.r(str);
    }

    /* JADX INFO: renamed from: getSparseParcelableArrayOrNull-impl, reason: not valid java name */
    public static final <T extends Parcelable> SparseArray<T> m167getSparseParcelableArrayOrNullimpl(Bundle bundle, String str, c cVar) {
        str.getClass();
        cVar.getClass();
        return BundleCompat.getSparseParcelableArray(bundle, str, b.F(cVar));
    }

    /* JADX INFO: renamed from: getString-impl, reason: not valid java name */
    public static final String m168getStringimpl(Bundle bundle, String str) {
        str.getClass();
        String string = bundle.getString(str);
        if (string != null) {
            return string;
        }
        throw androidx.lifecycle.l.r(str);
    }

    /* JADX INFO: renamed from: getStringArray-impl, reason: not valid java name */
    public static final String[] m169getStringArrayimpl(Bundle bundle, String str) {
        str.getClass();
        String[] stringArray = bundle.getStringArray(str);
        if (stringArray != null) {
            return stringArray;
        }
        throw androidx.lifecycle.l.r(str);
    }

    /* JADX INFO: renamed from: getStringArrayOrNull-impl, reason: not valid java name */
    public static final String[] m170getStringArrayOrNullimpl(Bundle bundle, String str) {
        str.getClass();
        return bundle.getStringArray(str);
    }

    /* JADX INFO: renamed from: getStringList-impl, reason: not valid java name */
    public static final List<String> m171getStringListimpl(Bundle bundle, String str) {
        str.getClass();
        ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
        if (stringArrayList != null) {
            return stringArrayList;
        }
        throw androidx.lifecycle.l.r(str);
    }

    /* JADX INFO: renamed from: getStringListOrNull-impl, reason: not valid java name */
    public static final List<String> m172getStringListOrNullimpl(Bundle bundle, String str) {
        str.getClass();
        return bundle.getStringArrayList(str);
    }

    /* JADX INFO: renamed from: getStringOrNull-impl, reason: not valid java name */
    public static final String m173getStringOrNullimpl(Bundle bundle, String str) {
        str.getClass();
        return bundle.getString(str);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m174hashCodeimpl(Bundle bundle) {
        return bundle.hashCode();
    }

    /* JADX INFO: renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m175isEmptyimpl(Bundle bundle) {
        return bundle.isEmpty();
    }

    /* JADX INFO: renamed from: isNull-impl, reason: not valid java name */
    public static final boolean m176isNullimpl(Bundle bundle, String str) {
        str.getClass();
        return m98containsimpl(bundle, str) && bundle.get(str) == null;
    }

    /* JADX INFO: renamed from: size-impl, reason: not valid java name */
    public static final int m177sizeimpl(Bundle bundle) {
        return bundle.size();
    }

    /* JADX INFO: renamed from: toMap-impl, reason: not valid java name */
    public static final Map<String, Object> m178toMapimpl(Bundle bundle) {
        f fVar = new f(bundle.size());
        for (String str : bundle.keySet()) {
            str.getClass();
            fVar.put(str, bundle.get(str));
        }
        return fVar.c();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m179toStringimpl(Bundle bundle) {
        return "SavedStateReader(source=" + bundle + ')';
    }

    public boolean equals(Object obj) {
        return m102equalsimpl(this.source, obj);
    }

    public int hashCode() {
        return m174hashCodeimpl(this.source);
    }

    public String toString() {
        return m179toStringimpl(this.source);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Bundle m180unboximpl() {
        return this.source;
    }

    /* JADX INFO: renamed from: getJavaSerializableOrNull-impl, reason: not valid java name */
    public static final <T extends Serializable> T m136getJavaSerializableOrNullimpl(Bundle bundle, String str) {
        str.getClass();
        l.h();
        throw null;
    }

    /* JADX INFO: renamed from: getParcelableListOrNull-impl, reason: not valid java name */
    public static final <T extends Parcelable> List<T> m150getParcelableListOrNullimpl(Bundle bundle, String str) {
        str.getClass();
        l.h();
        throw null;
    }

    /* JADX INFO: renamed from: getSparseParcelableArrayOrNull-impl, reason: not valid java name */
    public static final <T extends Parcelable> SparseArray<T> m166getSparseParcelableArrayOrNullimpl(Bundle bundle, String str) {
        str.getClass();
        l.h();
        throw null;
    }

    /* JADX INFO: renamed from: getParcelableOrNull-impl, reason: not valid java name */
    public static final <T extends Parcelable> T m152getParcelableOrNullimpl(Bundle bundle, String str) {
        str.getClass();
        l.h();
        throw null;
    }

    /* JADX INFO: renamed from: getParcelableArray-impl, reason: not valid java name */
    public static final <T extends Parcelable> T[] m144getParcelableArrayimpl(Bundle bundle, String str) {
        str.getClass();
        l.h();
        throw null;
    }

    /* JADX INFO: renamed from: getSparseParcelableArray-impl, reason: not valid java name */
    public static final <T extends Parcelable> SparseArray<T> m164getSparseParcelableArrayimpl(Bundle bundle, String str) {
        str.getClass();
        l.h();
        throw null;
    }

    /* JADX INFO: renamed from: getParcelableArrayOrNull-impl, reason: not valid java name */
    public static final <T extends Parcelable> T[] m146getParcelableArrayOrNullimpl(Bundle bundle, String str) {
        str.getClass();
        l.h();
        throw null;
    }

    /* JADX INFO: renamed from: getJavaSerializable-impl, reason: not valid java name */
    public static final <T extends Serializable> T m134getJavaSerializableimpl(Bundle bundle, String str) {
        str.getClass();
        l.h();
        throw null;
    }

    /* JADX INFO: renamed from: getParcelableList-impl, reason: not valid java name */
    public static final <T extends Parcelable> List<T> m148getParcelableListimpl(Bundle bundle, String str) {
        str.getClass();
        l.h();
        throw null;
    }

    /* JADX INFO: renamed from: getParcelable-impl, reason: not valid java name */
    public static final <T extends Parcelable> T m142getParcelableimpl(Bundle bundle, String str) {
        str.getClass();
        l.h();
        throw null;
    }
}
