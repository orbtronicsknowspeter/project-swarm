package androidx.sqlite;

import androidx.annotation.IntRange;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public interface SQLiteStatement extends AutoCloseable {
    /* JADX INFO: renamed from: bindBlob */
    void mo88bindBlob(@IntRange(from = 1) int i, byte[] bArr);

    void bindBoolean(@IntRange(from = 1) int i, boolean z9);

    /* JADX INFO: renamed from: bindDouble */
    void mo89bindDouble(@IntRange(from = 1) int i, double d10);

    void bindFloat(@IntRange(from = 1) int i, float f);

    void bindInt(@IntRange(from = 1) int i, int i6);

    /* JADX INFO: renamed from: bindLong */
    void mo90bindLong(@IntRange(from = 1) int i, long j);

    /* JADX INFO: renamed from: bindNull */
    void mo91bindNull(@IntRange(from = 1) int i);

    /* JADX INFO: renamed from: bindText */
    void mo92bindText(@IntRange(from = 1) int i, String str);

    /* JADX INFO: renamed from: clearBindings */
    void mo93clearBindings();

    @Override // java.lang.AutoCloseable
    void close();

    byte[] getBlob(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int i);

    boolean getBoolean(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int i);

    int getColumnCount();

    String getColumnName(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int i);

    List<String> getColumnNames();

    int getColumnType(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int i);

    double getDouble(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int i);

    float getFloat(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int i);

    int getInt(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int i);

    long getLong(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int i);

    String getText(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int i);

    boolean isNull(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int i);

    void reset();

    boolean step();
}
