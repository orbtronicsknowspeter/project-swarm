package androidx.preference;

import d7.p;
import java.util.Iterator;
import k7.f;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
public final class PreferenceGroupKt {

    /* JADX INFO: renamed from: androidx.preference.PreferenceGroupKt$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
    public static final class AnonymousClass1 implements Iterator<Preference>, e7.a {
        final /* synthetic */ PreferenceGroup $this_iterator;
        private int index;

        public AnonymousClass1(PreferenceGroup preferenceGroup) {
            this.$this_iterator = preferenceGroup;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.$this_iterator.getPreferenceCount();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public Preference next() {
            PreferenceGroup preferenceGroup = this.$this_iterator;
            int i = this.index;
            this.index = i + 1;
            Preference preference = preferenceGroup.getPreference(i);
            preference.getClass();
            return preference;
        }

        @Override // java.util.Iterator
        public void remove() {
            PreferenceGroup preferenceGroup = this.$this_iterator;
            int i = this.index - 1;
            this.index = i;
            preferenceGroup.removePreference(preferenceGroup.getPreference(i));
        }
    }

    public static final boolean contains(PreferenceGroup preferenceGroup, Preference preference) {
        preferenceGroup.getClass();
        preference.getClass();
        int preferenceCount = preferenceGroup.getPreferenceCount();
        int i = 0;
        while (i < preferenceCount) {
            int i6 = i + 1;
            if (l.a(preferenceGroup.getPreference(i), preference)) {
                return true;
            }
            i = i6;
        }
        return false;
    }

    public static final void forEach(PreferenceGroup preferenceGroup, d7.l lVar) {
        preferenceGroup.getClass();
        lVar.getClass();
        int preferenceCount = preferenceGroup.getPreferenceCount();
        for (int i = 0; i < preferenceCount; i++) {
            lVar.invoke(get(preferenceGroup, i));
        }
    }

    public static final void forEachIndexed(PreferenceGroup preferenceGroup, p pVar) {
        preferenceGroup.getClass();
        pVar.getClass();
        int preferenceCount = preferenceGroup.getPreferenceCount();
        for (int i = 0; i < preferenceCount; i++) {
            pVar.invoke(Integer.valueOf(i), get(preferenceGroup, i));
        }
    }

    public static final <T extends Preference> T get(PreferenceGroup preferenceGroup, CharSequence charSequence) {
        preferenceGroup.getClass();
        charSequence.getClass();
        return (T) preferenceGroup.findPreference(charSequence);
    }

    public static final f getChildren(final PreferenceGroup preferenceGroup) {
        preferenceGroup.getClass();
        return new f() { // from class: androidx.preference.PreferenceGroupKt$children$1
            @Override // k7.f
            public Iterator<Preference> iterator() {
                return PreferenceGroupKt.iterator(preferenceGroup);
            }
        };
    }

    public static final int getSize(PreferenceGroup preferenceGroup) {
        preferenceGroup.getClass();
        return preferenceGroup.getPreferenceCount();
    }

    public static final boolean isEmpty(PreferenceGroup preferenceGroup) {
        preferenceGroup.getClass();
        return preferenceGroup.getPreferenceCount() == 0;
    }

    public static final boolean isNotEmpty(PreferenceGroup preferenceGroup) {
        preferenceGroup.getClass();
        return preferenceGroup.getPreferenceCount() != 0;
    }

    public static final Iterator<Preference> iterator(PreferenceGroup preferenceGroup) {
        preferenceGroup.getClass();
        return new AnonymousClass1(preferenceGroup);
    }

    public static final void minusAssign(PreferenceGroup preferenceGroup, Preference preference) {
        preferenceGroup.getClass();
        preference.getClass();
        preferenceGroup.removePreference(preference);
    }

    public static final void plusAssign(PreferenceGroup preferenceGroup, Preference preference) {
        preferenceGroup.getClass();
        preference.getClass();
        preferenceGroup.addPreference(preference);
    }

    public static final Preference get(PreferenceGroup preferenceGroup, int i) {
        preferenceGroup.getClass();
        Preference preference = preferenceGroup.getPreference(i);
        preference.getClass();
        return preference;
    }
}
