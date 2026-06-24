package androidx.savedstate.serialization;

import android.os.Bundle;
import androidx.savedstate.SavedStateReader;
import b8.e;
import b8.i;
import c8.a;
import c8.c;
import g8.f;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class SavedStateDecoder extends a {
    private final SavedStateConfiguration configuration;
    private int index;
    private String key;
    private final Bundle savedState;

    public SavedStateDecoder(Bundle bundle, SavedStateConfiguration savedStateConfiguration) {
        bundle.getClass();
        savedStateConfiguration.getClass();
        this.savedState = bundle;
        this.configuration = savedStateConfiguration;
        this.key = "";
    }

    @Override // c8.a, c8.e
    public c beginStructure(e eVar) {
        eVar.getClass();
        return l.a(this.key, "") ? this : new SavedStateDecoder(SavedStateReader.m154getSavedStateimpl(SavedStateReader.m97constructorimpl(this.savedState), this.key), this.configuration);
    }

    @Override // c8.a, c8.e
    public boolean decodeBoolean() {
        return SavedStateReader.m106getBooleanimpl(SavedStateReader.m97constructorimpl(this.savedState), this.key);
    }

    @Override // c8.a, c8.e
    public byte decodeByte() {
        return (byte) SavedStateReader.m128getIntimpl(SavedStateReader.m97constructorimpl(this.savedState), this.key);
    }

    @Override // c8.a, c8.e
    public char decodeChar() {
        return SavedStateReader.m110getCharimpl(SavedStateReader.m97constructorimpl(this.savedState), this.key);
    }

    @Override // c8.a, c8.e
    public double decodeDouble() {
        return SavedStateReader.m120getDoubleimpl(SavedStateReader.m97constructorimpl(this.savedState), this.key);
    }

    @Override // c8.c
    public int decodeElementIndex(e eVar) {
        String strF;
        eVar.getClass();
        int iM177sizeimpl = (l.a(eVar.getKind(), i.i) || l.a(eVar.getKind(), i.j)) ? SavedStateReader.m177sizeimpl(SavedStateReader.m97constructorimpl(this.savedState)) : eVar.e();
        while (true) {
            int i = this.index;
            if (i >= iM177sizeimpl) {
                return -1;
            }
            strF = eVar.f(i);
            if (!eVar.i(this.index) || SavedStateReader.m98containsimpl(SavedStateReader.m97constructorimpl(this.savedState), strF)) {
                break;
            }
            this.index++;
        }
        this.key = strF;
        int i6 = this.index;
        this.index = i6 + 1;
        return i6;
    }

    @Override // c8.a
    public int decodeEnum(e eVar) {
        eVar.getClass();
        return SavedStateReader.m128getIntimpl(SavedStateReader.m97constructorimpl(this.savedState), this.key);
    }

    @Override // c8.a, c8.e
    public float decodeFloat() {
        return SavedStateReader.m124getFloatimpl(SavedStateReader.m97constructorimpl(this.savedState), this.key);
    }

    @Override // c8.a, c8.e
    public int decodeInt() {
        return SavedStateReader.m128getIntimpl(SavedStateReader.m97constructorimpl(this.savedState), this.key);
    }

    @Override // c8.a, c8.e
    public long decodeLong() {
        return SavedStateReader.m138getLongimpl(SavedStateReader.m97constructorimpl(this.savedState), this.key);
    }

    @Override // c8.a, c8.e
    public boolean decodeNotNullMark() {
        return !SavedStateReader.m176isNullimpl(SavedStateReader.m97constructorimpl(this.savedState), this.key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c8.a, c8.e
    public <T> T decodeSerializableValue(z7.a aVar) {
        aVar.getClass();
        T t9 = (T) SavedStateDecoder_androidKt.decodeFormatSpecificTypesOnPlatform(this, aVar);
        if (t9 != null) {
            return t9;
        }
        e descriptor = aVar.getDescriptor();
        return l.a(descriptor, SavedStateCodecUtilsKt.getIntListDescriptor()) ? (T) SavedStateReader.m131getIntListimpl(SavedStateReader.m97constructorimpl(this.savedState), this.key) : l.a(descriptor, SavedStateCodecUtilsKt.getStringListDescriptor()) ? (T) SavedStateReader.m171getStringListimpl(SavedStateReader.m97constructorimpl(this.savedState), this.key) : l.a(descriptor, SavedStateCodecUtilsKt.getBooleanArrayDescriptor()) ? (T) SavedStateReader.m107getBooleanArrayimpl(SavedStateReader.m97constructorimpl(this.savedState), this.key) : l.a(descriptor, SavedStateCodecUtilsKt.getCharArrayDescriptor()) ? (T) SavedStateReader.m111getCharArrayimpl(SavedStateReader.m97constructorimpl(this.savedState), this.key) : l.a(descriptor, SavedStateCodecUtilsKt.getDoubleArrayDescriptor()) ? (T) SavedStateReader.m121getDoubleArrayimpl(SavedStateReader.m97constructorimpl(this.savedState), this.key) : l.a(descriptor, SavedStateCodecUtilsKt.getFloatArrayDescriptor()) ? (T) SavedStateReader.m125getFloatArrayimpl(SavedStateReader.m97constructorimpl(this.savedState), this.key) : l.a(descriptor, SavedStateCodecUtilsKt.getIntArrayDescriptor()) ? (T) SavedStateReader.m129getIntArrayimpl(SavedStateReader.m97constructorimpl(this.savedState), this.key) : l.a(descriptor, SavedStateCodecUtilsKt.getLongArrayDescriptor()) ? (T) SavedStateReader.m139getLongArrayimpl(SavedStateReader.m97constructorimpl(this.savedState), this.key) : l.a(descriptor, SavedStateCodecUtilsKt.getStringArrayDescriptor()) ? (T) SavedStateReader.m169getStringArrayimpl(SavedStateReader.m97constructorimpl(this.savedState), this.key) : (T) super.decodeSerializableValue(aVar);
    }

    @Override // c8.a, c8.e
    public short decodeShort() {
        return (short) SavedStateReader.m128getIntimpl(SavedStateReader.m97constructorimpl(this.savedState), this.key);
    }

    @Override // c8.a, c8.e
    public String decodeString() {
        return SavedStateReader.m168getStringimpl(SavedStateReader.m97constructorimpl(this.savedState), this.key);
    }

    public final String getKey$savedstate() {
        return this.key;
    }

    public final Bundle getSavedState$savedstate() {
        return this.savedState;
    }

    @Override // c8.c
    public f getSerializersModule() {
        return this.configuration.getSerializersModule();
    }
}
