package c4;

import androidx.documentfile.provider.DocumentFile;
import java.io.File;
import java.util.Comparator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class n5 implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ n5 f1901b = new n5(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1902a;

    public /* synthetic */ n5(int i) {
        this.f1902a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String upperCase;
        String upperCase2;
        switch (this.f1902a) {
            case 0:
                x4.r rVar = (x4.r) obj2;
                if (!rVar.F.isEmpty() && ((x4.j0) rVar.F.get(0)).f11240q != null) {
                    String str = ((x4.j0) rVar.F.get(0)).f11240q;
                    str.getClass();
                    File file = new File(str);
                    if (file.exists()) {
                        file.lastModified();
                    }
                }
                x4.r rVar2 = (x4.r) obj;
                if (!rVar2.F.isEmpty() && ((x4.j0) rVar2.F.get(0)).f11240q != null) {
                    String str2 = ((x4.j0) rVar2.F.get(0)).f11240q;
                    str2.getClass();
                    File file2 = new File(str2);
                    if (file2.exists()) {
                        file2.lastModified();
                    }
                }
                return t0.f.l(0L, 0L);
            case 1:
                return t0.f.l(((x4.r) obj).f11366w, ((x4.r) obj2).f11366w);
            case 2:
                return t0.f.l(Long.valueOf(((x4.r) obj).k()), Long.valueOf(((x4.r) obj2).k()));
            case 3:
                return t0.f.l(((x4.x1) obj).f11449b, ((x4.x1) obj2).f11449b);
            case 4:
                return t0.f.l(((x4.e) obj).f11122b, ((x4.e) obj2).f11122b);
            case 5:
                return t0.f.l(Long.valueOf(((x4.y2) obj).f11474c), Long.valueOf(((x4.y2) obj2).f11474c));
            case 6:
                return t0.f.l(Long.valueOf(((x4.y2) obj).f11474c), Long.valueOf(((x4.y2) obj2).f11474c));
            case 7:
                return t0.f.l(Long.valueOf(((x4.y2) obj2).f11474c), Long.valueOf(((x4.y2) obj).f11474c));
            case 8:
                return t0.f.l(Long.valueOf(((x4.y2) obj2).f11474c), Long.valueOf(((x4.y2) obj).f11474c));
            case 9:
                return t0.f.l(Long.valueOf(((x4.y2) obj).f11474c), Long.valueOf(((x4.y2) obj2).f11474c));
            case 10:
                return t0.f.l(Long.valueOf(((x4.y2) obj2).f11474c), Long.valueOf(((x4.y2) obj).f11474c));
            case 11:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 12:
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
            case 13:
                return t0.f.l(Long.valueOf(((DocumentFile) obj).lastModified()), Long.valueOf(((DocumentFile) obj2).lastModified()));
            case 14:
                return t0.f.l(Boolean.valueOf(((DocumentFile) obj).isFile()), Boolean.valueOf(((DocumentFile) obj2).isFile()));
            case 15:
                return t0.f.l(Long.valueOf(((File) obj).lastModified()), Long.valueOf(((File) obj2).lastModified()));
            case 16:
                return t0.f.l(Boolean.valueOf(((File) obj).isFile()), Boolean.valueOf(((File) obj2).isFile()));
            case 17:
                return t0.f.l(Long.valueOf(((DocumentFile) obj2).lastModified()), Long.valueOf(((DocumentFile) obj).lastModified()));
            case 18:
                return t0.f.l(Boolean.valueOf(((DocumentFile) obj2).isDirectory()), Boolean.valueOf(((DocumentFile) obj).isDirectory()));
            case 19:
                return t0.f.l(Long.valueOf(((File) obj2).lastModified()), Long.valueOf(((File) obj).lastModified()));
            case 20:
                return t0.f.l(Boolean.valueOf(((File) obj2).isDirectory()), Boolean.valueOf(((File) obj).isDirectory()));
            case 21:
                String name = ((DocumentFile) obj).getName();
                String upperCase3 = null;
                if (name != null) {
                    upperCase = name.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                } else {
                    upperCase = null;
                }
                String name2 = ((DocumentFile) obj2).getName();
                if (name2 != null) {
                    upperCase3 = name2.toUpperCase(Locale.ROOT);
                    upperCase3.getClass();
                }
                return t0.f.l(upperCase, upperCase3);
            case 22:
                return t0.f.l(Boolean.valueOf(((DocumentFile) obj).isFile()), Boolean.valueOf(((DocumentFile) obj2).isFile()));
            case 23:
                String name3 = ((File) obj).getName();
                name3.getClass();
                Locale locale = Locale.ROOT;
                String upperCase4 = name3.toUpperCase(locale);
                upperCase4.getClass();
                String name4 = ((File) obj2).getName();
                name4.getClass();
                String upperCase5 = name4.toUpperCase(locale);
                upperCase5.getClass();
                return t0.f.l(upperCase4, upperCase5);
            case 24:
                return t0.f.l(Boolean.valueOf(((File) obj).isFile()), Boolean.valueOf(((File) obj2).isFile()));
            case 25:
                String name5 = ((DocumentFile) obj2).getName();
                String upperCase6 = null;
                if (name5 != null) {
                    upperCase2 = name5.toUpperCase(Locale.ROOT);
                    upperCase2.getClass();
                } else {
                    upperCase2 = null;
                }
                String name6 = ((DocumentFile) obj).getName();
                if (name6 != null) {
                    upperCase6 = name6.toUpperCase(Locale.ROOT);
                    upperCase6.getClass();
                }
                return t0.f.l(upperCase2, upperCase6);
            case 26:
                return t0.f.l(Boolean.valueOf(((DocumentFile) obj2).isDirectory()), Boolean.valueOf(((DocumentFile) obj).isDirectory()));
            case 27:
                String name7 = ((File) obj2).getName();
                name7.getClass();
                Locale locale2 = Locale.ROOT;
                String upperCase7 = name7.toUpperCase(locale2);
                upperCase7.getClass();
                String name8 = ((File) obj).getName();
                name8.getClass();
                String upperCase8 = name8.toUpperCase(locale2);
                upperCase8.getClass();
                return t0.f.l(upperCase7, upperCase8);
            case 28:
                return t0.f.l(Boolean.valueOf(((File) obj2).isDirectory()), Boolean.valueOf(((File) obj).isDirectory()));
            default:
                return t0.f.l(Long.valueOf(((DocumentFile) obj).length()), Long.valueOf(((DocumentFile) obj2).length()));
        }
    }
}
