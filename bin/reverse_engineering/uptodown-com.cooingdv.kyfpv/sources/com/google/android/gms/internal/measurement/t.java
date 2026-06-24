package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2806b;

    public t(int i) {
        switch (i) {
            case 3:
                this.f2805a = new TreeMap();
                this.f2806b = new TreeMap();
                break;
            default:
                this.f2805a = new HashMap();
                this.f2806b = new s(6);
                s sVar = new s(0);
                w wVar = w.BITWISE_AND;
                ArrayList arrayList = sVar.f2789a;
                arrayList.add(wVar);
                arrayList.add(w.BITWISE_LEFT_SHIFT);
                arrayList.add(w.BITWISE_NOT);
                arrayList.add(w.BITWISE_OR);
                arrayList.add(w.BITWISE_RIGHT_SHIFT);
                arrayList.add(w.BITWISE_UNSIGNED_RIGHT_SHIFT);
                arrayList.add(w.BITWISE_XOR);
                b(sVar);
                s sVar2 = new s(1);
                w wVar2 = w.EQUALS;
                ArrayList arrayList2 = sVar2.f2789a;
                arrayList2.add(wVar2);
                arrayList2.add(w.GREATER_THAN);
                arrayList2.add(w.GREATER_THAN_EQUALS);
                arrayList2.add(w.IDENTITY_EQUALS);
                arrayList2.add(w.IDENTITY_NOT_EQUALS);
                arrayList2.add(w.LESS_THAN);
                arrayList2.add(w.LESS_THAN_EQUALS);
                arrayList2.add(w.NOT_EQUALS);
                b(sVar2);
                s sVar3 = new s(2);
                w wVar3 = w.APPLY;
                ArrayList arrayList3 = sVar3.f2789a;
                arrayList3.add(wVar3);
                arrayList3.add(w.BLOCK);
                arrayList3.add(w.BREAK);
                arrayList3.add(w.CASE);
                arrayList3.add(w.DEFAULT);
                arrayList3.add(w.CONTINUE);
                arrayList3.add(w.DEFINE_FUNCTION);
                arrayList3.add(w.FN);
                arrayList3.add(w.IF);
                arrayList3.add(w.QUOTE);
                arrayList3.add(w.RETURN);
                arrayList3.add(w.SWITCH);
                arrayList3.add(w.TERNARY);
                b(sVar3);
                s sVar4 = new s(3);
                w wVar4 = w.AND;
                ArrayList arrayList4 = sVar4.f2789a;
                arrayList4.add(wVar4);
                arrayList4.add(w.NOT);
                arrayList4.add(w.OR);
                b(sVar4);
                s sVar5 = new s(4);
                w wVar5 = w.FOR_IN;
                ArrayList arrayList5 = sVar5.f2789a;
                arrayList5.add(wVar5);
                arrayList5.add(w.FOR_IN_CONST);
                arrayList5.add(w.FOR_IN_LET);
                arrayList5.add(w.FOR_LET);
                arrayList5.add(w.FOR_OF);
                arrayList5.add(w.FOR_OF_CONST);
                arrayList5.add(w.FOR_OF_LET);
                arrayList5.add(w.WHILE);
                b(sVar5);
                s sVar6 = new s(5);
                w wVar6 = w.ADD;
                ArrayList arrayList6 = sVar6.f2789a;
                arrayList6.add(wVar6);
                arrayList6.add(w.DIVIDE);
                arrayList6.add(w.MODULUS);
                arrayList6.add(w.MULTIPLY);
                arrayList6.add(w.NEGATE);
                arrayList6.add(w.POST_DECREMENT);
                arrayList6.add(w.POST_INCREMENT);
                arrayList6.add(w.PRE_DECREMENT);
                arrayList6.add(w.PRE_INCREMENT);
                arrayList6.add(w.SUBTRACT);
                b(sVar6);
                s sVar7 = new s(7);
                w wVar7 = w.ASSIGN;
                ArrayList arrayList7 = sVar7.f2789a;
                arrayList7.add(wVar7);
                arrayList7.add(w.CONST);
                arrayList7.add(w.CREATE_ARRAY);
                arrayList7.add(w.CREATE_OBJECT);
                arrayList7.add(w.EXPRESSION_LIST);
                arrayList7.add(w.GET);
                arrayList7.add(w.GET_INDEX);
                arrayList7.add(w.GET_PROPERTY);
                arrayList7.add(w.NULL);
                arrayList7.add(w.SET_PROPERTY);
                arrayList7.add(w.TYPEOF);
                arrayList7.add(w.UNDEFINED);
                arrayList7.add(w.VAR);
                b(sVar7);
                break;
        }
    }

    public Object a() {
        Uri uri;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        String string;
        i4 i4Var = (i4) this.f2805a;
        String str = (String) this.f2806b;
        Context context = (Context) i4Var.f2663b;
        context.getClass();
        ContentResolver contentResolver = context.getContentResolver();
        e2.d dVar = x3.f2897a;
        if (contentResolver == null) {
            dVar.getClass();
            androidx.privacysandbox.ads.adservices.customaudience.a.i("ContentResolver needed with GservicesDelegateSupplier.init()");
            return null;
        }
        synchronized (dVar) {
            try {
                HashMap map = (HashMap) dVar.f4468l;
                AtomicBoolean atomicBoolean = (AtomicBoolean) dVar.f4467b;
                if (map == null) {
                    atomicBoolean.set(false);
                    dVar.f4468l = new HashMap(16, 1.0f);
                    dVar.f4473q = new Object();
                    contentResolver.registerContentObserver(y3.f2909a, true, new a4(dVar));
                } else if (atomicBoolean.getAndSet(false)) {
                    ((HashMap) dVar.f4468l).clear();
                    ((HashMap) dVar.f4469m).clear();
                    ((HashMap) dVar.f4470n).clear();
                    ((HashMap) dVar.f4471o).clear();
                    ((HashMap) dVar.f4472p).clear();
                    dVar.f4473q = new Object();
                }
                Object obj = dVar.f4473q;
                String str2 = null;
                if (((HashMap) dVar.f4468l).containsKey(str)) {
                    String str3 = (String) ((HashMap) dVar.f4468l).get(str);
                    if (str3 != null) {
                        str2 = str3;
                    }
                    return str2;
                }
                try {
                    uri = y3.f2909a;
                    contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                    try {
                    } finally {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                    }
                } catch (b4 unused) {
                }
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    throw new b4("Unable to acquire ContentProviderClient");
                }
                try {
                    Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                    try {
                        if (cursorQuery == null) {
                            throw new b4("ContentProvider query returned null cursor");
                        }
                        if (cursorQuery.moveToFirst()) {
                            string = cursorQuery.getString(1);
                            cursorQuery.close();
                        } else {
                            cursorQuery.close();
                            string = null;
                        }
                        if (string != null && string.equals(null)) {
                            string = null;
                        }
                        synchronized (dVar) {
                            try {
                                if (obj == dVar.f4473q) {
                                    ((HashMap) dVar.f4468l).put(str, string);
                                }
                            } finally {
                            }
                        }
                        if (string != null) {
                            return string;
                        }
                        return null;
                    } finally {
                    }
                } catch (RemoteException e10) {
                    throw new b4("ContentProvider query failed", e10);
                }
            } finally {
            }
        }
    }

    public void b(s sVar) {
        ArrayList arrayList = sVar.f2789a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((HashMap) this.f2805a).put(Integer.valueOf(((w) obj).f2881a).toString(), sVar);
        }
    }

    public n c(y2.s sVar, n nVar) {
        b2.t1.f0(sVar);
        if (!(nVar instanceof o)) {
            return nVar;
        }
        o oVar = (o) nVar;
        ArrayList arrayList = oVar.f2732b;
        String str = oVar.f2731a;
        HashMap map = (HashMap) this.f2805a;
        return (map.containsKey(str) ? (s) map.get(str) : (s) this.f2806b).a(str, sVar, arrayList);
    }

    public void d(y2.s sVar, b5.m mVar) {
        x4 x4Var = new x4(mVar);
        TreeMap treeMap = (TreeMap) this.f2805a;
        for (Integer num : treeMap.keySet()) {
            b bVarClone = ((b) mVar.f1062l).clone();
            n nVarA = ((m) treeMap.get(num)).a(sVar, Collections.singletonList(x4Var));
            int iB0 = nVarA instanceof g ? b2.t1.b0(((g) nVarA).f2589a.doubleValue()) : -1;
            if (iB0 == 2 || iB0 == -1) {
                mVar.f1062l = bVarClone;
            }
        }
        TreeMap treeMap2 = (TreeMap) this.f2806b;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            n nVarA2 = ((m) treeMap2.get((Integer) it.next())).a(sVar, Collections.singletonList(x4Var));
            if (nVarA2 instanceof g) {
                b2.t1.b0(((g) nVarA2).f2589a.doubleValue());
            }
        }
    }

    public /* synthetic */ t(Object obj, Object obj2) {
        this.f2805a = obj;
        this.f2806b = obj2;
    }
}
