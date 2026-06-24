package o3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8154e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(List list, int i) {
        super(true);
        this.f8153d = i;
        switch (i) {
            case 2:
                super(true);
                this.f8154e = list.size();
                setValue(list);
                break;
            default:
                this.f8154e = list.size();
                setValue(list);
                break;
        }
    }

    @Override // o3.a
    public final void a(String str) {
        switch (this.f8153d) {
            case 0:
                try {
                    this.f8151c = p3.d.a(str);
                    return;
                } catch (Exception e10) {
                    throw new q3.a(e10);
                }
            case 1:
                try {
                    this.f8151c = Integer.valueOf(p3.e.a(str));
                    return;
                } catch (Exception e11) {
                    throw new q3.a(e11);
                }
            default:
                try {
                    this.f8151c = p3.f.a(this.f8154e, str);
                    return;
                } catch (Exception e12) {
                    throw new q3.a(e12);
                }
        }
    }

    @Override // o3.a
    public final String b() {
        switch (this.f8153d) {
            case 0:
                try {
                    return p3.d.b(this.f8154e, (List) this.f8151c);
                } catch (Exception e10) {
                    throw new a1.b(e10);
                }
            case 1:
                try {
                    return p3.e.b(((Integer) this.f8151c).intValue(), this.f8154e);
                } catch (Exception e11) {
                    throw new a1.b(e11);
                }
            default:
                try {
                    return p3.f.b(this.f8154e, (List) this.f8151c);
                } catch (Exception e12) {
                    throw new a1.b(e12);
                }
        }
    }

    @Override // o3.a
    public final String c(int i, String str) throws g {
        switch (this.f8153d) {
            case 0:
                try {
                    return str.substring(i, this.f8154e + i);
                } catch (Exception e10) {
                    throw new g(e10);
                }
            case 1:
                try {
                    return str.substring(i, this.f8154e + i);
                } catch (Exception e11) {
                    throw new g(e11);
                }
            default:
                try {
                    return str.substring(i, (2 * this.f8154e) + i);
                } catch (Exception e12) {
                    throw new g(e12);
                }
        }
    }

    @Override // o3.a, o3.b
    public Object getValue() {
        switch (this.f8153d) {
            case 0:
                return new ArrayList((Collection) this.f8151c);
            case 1:
            default:
                return super.getValue();
            case 2:
                return new ArrayList((Collection) this.f8151c);
        }
    }

    @Override // o3.a, o3.b
    public void setValue(Object obj) {
        switch (this.f8153d) {
            case 0:
                ArrayList arrayList = new ArrayList((List) obj);
                int size = arrayList.size();
                while (true) {
                    int i = this.f8154e;
                    if (size >= i) {
                        int size2 = arrayList.size();
                        Object objSubList = arrayList;
                        if (size2 > i) {
                            objSubList = arrayList.subList(0, i);
                        }
                        super.setValue(objSubList);
                    } else {
                        arrayList.add(Boolean.FALSE);
                        size++;
                    }
                    break;
                }
                break;
            case 1:
            default:
                super.setValue(obj);
                break;
            case 2:
                ArrayList arrayList2 = new ArrayList((List) obj);
                int size3 = arrayList2.size();
                while (true) {
                    int i6 = this.f8154e;
                    if (size3 >= i6) {
                        int size4 = arrayList2.size();
                        Object objSubList2 = arrayList2;
                        if (size4 > i6) {
                            objSubList2 = arrayList2.subList(0, i6);
                        }
                        super.setValue(objSubList2);
                    } else {
                        arrayList2.add(0);
                        size3++;
                    }
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i, Integer num) {
        super(true);
        this.f8153d = 1;
        this.f8154e = i;
        setValue(num);
    }
}
