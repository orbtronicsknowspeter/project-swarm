package androidx.room.util;

import androidx.annotation.RestrictTo;
import androidx.privacysandbox.ads.adservices.customaudience.a;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class KClassUtil {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <T, C> T findAndInstantiateDatabaseImpl(Class<C> cls, String str) {
        String name;
        String str2;
        cls.getClass();
        str.getClass();
        Package r02 = cls.getPackage();
        if (r02 == null || (name = r02.getName()) == null) {
            name = "";
        }
        String canonicalName = cls.getCanonicalName();
        canonicalName.getClass();
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        StringBuilder sb = new StringBuilder();
        String strReplace = canonicalName.replace('.', '_');
        strReplace.getClass();
        sb.append(strReplace);
        sb.append(str);
        String string = sb.toString();
        try {
            if (name.length() == 0) {
                str2 = string;
            } else {
                str2 = name + '.' + string;
            }
            Class<?> cls2 = Class.forName(str2, true, cls.getClassLoader());
            cls2.getClass();
            return (T) cls2.getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + string + " does not exist. Is Room annotation processor correctly configured?", e10);
        } catch (IllegalAccessException e11) {
            a.l("Cannot access the constructor ", cls.getCanonicalName(), e11);
            return null;
        } catch (InstantiationException e12) {
            a.l("Failed to create an instance of ", cls.getCanonicalName(), e12);
            return null;
        }
    }

    public static /* synthetic */ Object findAndInstantiateDatabaseImpl$default(Class cls, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "_Impl";
        }
        return findAndInstantiateDatabaseImpl(cls, str);
    }
}
