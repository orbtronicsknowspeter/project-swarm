package com.uptodown.workers;

import android.app.Activity;
import android.content.Context;
import android.support.v4.media.g;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import f4.c;
import l7.u;
import t0.f;
import x4.g2;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class TrackingWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3495e;
    public final g f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f3491a = context;
        this.f3492b = workerParameters.getInputData().getBoolean("isCompressed", true);
        this.f = new g(context, 20);
        Activity activity = c.f4876o;
        this.f3491a = f.e(context);
        for (String str : getTags()) {
            if (str.equals("TrackingWorkerPeriodic") || str.equals("TrackingWorkerSingle")) {
                this.f3495e = str;
            }
        }
    }

    public static String c(String str) {
        return u.m0(str, "TrackingWorkerPeriodic", true) ? "periodic" : "oneTime";
    }

    public final void b(g2 g2Var) {
        int i = g2Var.f11205b;
        if (i == 401) {
            this.f3493c = true;
        } else if (i == 0) {
            this.f3493c = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x02cb, code lost:
    
        if (new org.json.JSONObject(r3).optInt("success") == 0) goto L186;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0290 A[Catch: Exception -> 0x005e, TryCatch #0 {Exception -> 0x005e, blocks: (B:20:0x0059, B:27:0x006b, B:157:0x03b5, B:30:0x007c, B:152:0x0383, B:154:0x039b, B:33:0x0086, B:145:0x031d, B:147:0x0363, B:149:0x036b, B:163:0x03de, B:164:0x03e3, B:36:0x0093, B:84:0x01e4, B:85:0x01f4, B:87:0x01fa, B:89:0x0207, B:91:0x020b, B:92:0x020f, B:94:0x0218, B:96:0x0247, B:98:0x0254, B:100:0x0258, B:103:0x025f, B:105:0x0270, B:107:0x0278, B:109:0x0280, B:115:0x0290, B:118:0x0298, B:136:0x02e8, B:120:0x029e, B:122:0x02b9, B:124:0x02bd, B:165:0x03e4, B:167:0x03ea, B:169:0x03f6, B:111:0x0287, B:171:0x03fa, B:173:0x03fe, B:174:0x0403, B:175:0x0404, B:177:0x041c, B:179:0x0425, B:180:0x0429, B:39:0x00a9, B:41:0x00b8, B:59:0x0159, B:61:0x0177, B:63:0x0183, B:65:0x0193, B:67:0x0197, B:70:0x019e, B:72:0x01af, B:74:0x01b9, B:80:0x01ce, B:75:0x01c3, B:62:0x017c, B:79:0x01cb, B:44:0x00ff, B:46:0x0121, B:48:0x0127, B:50:0x012e, B:51:0x0138, B:52:0x0146, B:54:0x014c, B:56:0x0153, B:181:0x042a, B:183:0x042e, B:184:0x0433), top: B:188:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x031d A[Catch: Exception -> 0x005e, TryCatch #0 {Exception -> 0x005e, blocks: (B:20:0x0059, B:27:0x006b, B:157:0x03b5, B:30:0x007c, B:152:0x0383, B:154:0x039b, B:33:0x0086, B:145:0x031d, B:147:0x0363, B:149:0x036b, B:163:0x03de, B:164:0x03e3, B:36:0x0093, B:84:0x01e4, B:85:0x01f4, B:87:0x01fa, B:89:0x0207, B:91:0x020b, B:92:0x020f, B:94:0x0218, B:96:0x0247, B:98:0x0254, B:100:0x0258, B:103:0x025f, B:105:0x0270, B:107:0x0278, B:109:0x0280, B:115:0x0290, B:118:0x0298, B:136:0x02e8, B:120:0x029e, B:122:0x02b9, B:124:0x02bd, B:165:0x03e4, B:167:0x03ea, B:169:0x03f6, B:111:0x0287, B:171:0x03fa, B:173:0x03fe, B:174:0x0403, B:175:0x0404, B:177:0x041c, B:179:0x0425, B:180:0x0429, B:39:0x00a9, B:41:0x00b8, B:59:0x0159, B:61:0x0177, B:63:0x0183, B:65:0x0193, B:67:0x0197, B:70:0x019e, B:72:0x01af, B:74:0x01b9, B:80:0x01ce, B:75:0x01c3, B:62:0x017c, B:79:0x01cb, B:44:0x00ff, B:46:0x0121, B:48:0x0127, B:50:0x012e, B:51:0x0138, B:52:0x0146, B:54:0x014c, B:56:0x0153, B:181:0x042a, B:183:0x042e, B:184:0x0433), top: B:188:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x039b A[Catch: Exception -> 0x005e, TryCatch #0 {Exception -> 0x005e, blocks: (B:20:0x0059, B:27:0x006b, B:157:0x03b5, B:30:0x007c, B:152:0x0383, B:154:0x039b, B:33:0x0086, B:145:0x031d, B:147:0x0363, B:149:0x036b, B:163:0x03de, B:164:0x03e3, B:36:0x0093, B:84:0x01e4, B:85:0x01f4, B:87:0x01fa, B:89:0x0207, B:91:0x020b, B:92:0x020f, B:94:0x0218, B:96:0x0247, B:98:0x0254, B:100:0x0258, B:103:0x025f, B:105:0x0270, B:107:0x0278, B:109:0x0280, B:115:0x0290, B:118:0x0298, B:136:0x02e8, B:120:0x029e, B:122:0x02b9, B:124:0x02bd, B:165:0x03e4, B:167:0x03ea, B:169:0x03f6, B:111:0x0287, B:171:0x03fa, B:173:0x03fe, B:174:0x0403, B:175:0x0404, B:177:0x041c, B:179:0x0425, B:180:0x0429, B:39:0x00a9, B:41:0x00b8, B:59:0x0159, B:61:0x0177, B:63:0x0183, B:65:0x0193, B:67:0x0197, B:70:0x019e, B:72:0x01af, B:74:0x01b9, B:80:0x01ce, B:75:0x01c3, B:62:0x017c, B:79:0x01cb, B:44:0x00ff, B:46:0x0121, B:48:0x0127, B:50:0x012e, B:51:0x0138, B:52:0x0146, B:54:0x014c, B:56:0x0153, B:181:0x042a, B:183:0x042e, B:184:0x0433), top: B:188:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03dd A[PHI: r4
      0x03dd: PHI (r4v28 u6.a) = (r4v10 u6.a), (r4v21 u6.a), (r4v25 u6.a), (r4v27 u6.a), (r4v29 u6.a) binds: [B:82:0x01e1, B:141:0x0315, B:151:0x0382, B:156:0x03b4, B:161:0x03db] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03de A[Catch: Exception -> 0x005e, TryCatch #0 {Exception -> 0x005e, blocks: (B:20:0x0059, B:27:0x006b, B:157:0x03b5, B:30:0x007c, B:152:0x0383, B:154:0x039b, B:33:0x0086, B:145:0x031d, B:147:0x0363, B:149:0x036b, B:163:0x03de, B:164:0x03e3, B:36:0x0093, B:84:0x01e4, B:85:0x01f4, B:87:0x01fa, B:89:0x0207, B:91:0x020b, B:92:0x020f, B:94:0x0218, B:96:0x0247, B:98:0x0254, B:100:0x0258, B:103:0x025f, B:105:0x0270, B:107:0x0278, B:109:0x0280, B:115:0x0290, B:118:0x0298, B:136:0x02e8, B:120:0x029e, B:122:0x02b9, B:124:0x02bd, B:165:0x03e4, B:167:0x03ea, B:169:0x03f6, B:111:0x0287, B:171:0x03fa, B:173:0x03fe, B:174:0x0403, B:175:0x0404, B:177:0x041c, B:179:0x0425, B:180:0x0429, B:39:0x00a9, B:41:0x00b8, B:59:0x0159, B:61:0x0177, B:63:0x0183, B:65:0x0193, B:67:0x0197, B:70:0x019e, B:72:0x01af, B:74:0x01b9, B:80:0x01ce, B:75:0x01c3, B:62:0x017c, B:79:0x01cb, B:44:0x00ff, B:46:0x0121, B:48:0x0127, B:50:0x012e, B:51:0x0138, B:52:0x0146, B:54:0x014c, B:56:0x0153, B:181:0x042a, B:183:0x042e, B:184:0x0433), top: B:188:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03ea A[Catch: Exception -> 0x005e, TryCatch #0 {Exception -> 0x005e, blocks: (B:20:0x0059, B:27:0x006b, B:157:0x03b5, B:30:0x007c, B:152:0x0383, B:154:0x039b, B:33:0x0086, B:145:0x031d, B:147:0x0363, B:149:0x036b, B:163:0x03de, B:164:0x03e3, B:36:0x0093, B:84:0x01e4, B:85:0x01f4, B:87:0x01fa, B:89:0x0207, B:91:0x020b, B:92:0x020f, B:94:0x0218, B:96:0x0247, B:98:0x0254, B:100:0x0258, B:103:0x025f, B:105:0x0270, B:107:0x0278, B:109:0x0280, B:115:0x0290, B:118:0x0298, B:136:0x02e8, B:120:0x029e, B:122:0x02b9, B:124:0x02bd, B:165:0x03e4, B:167:0x03ea, B:169:0x03f6, B:111:0x0287, B:171:0x03fa, B:173:0x03fe, B:174:0x0403, B:175:0x0404, B:177:0x041c, B:179:0x0425, B:180:0x0429, B:39:0x00a9, B:41:0x00b8, B:59:0x0159, B:61:0x0177, B:63:0x0183, B:65:0x0193, B:67:0x0197, B:70:0x019e, B:72:0x01af, B:74:0x01b9, B:80:0x01ce, B:75:0x01c3, B:62:0x017c, B:79:0x01cb, B:44:0x00ff, B:46:0x0121, B:48:0x0127, B:50:0x012e, B:51:0x0138, B:52:0x0146, B:54:0x014c, B:56:0x0153, B:181:0x042a, B:183:0x042e, B:184:0x0433), top: B:188:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03f6 A[Catch: Exception -> 0x005e, TryCatch #0 {Exception -> 0x005e, blocks: (B:20:0x0059, B:27:0x006b, B:157:0x03b5, B:30:0x007c, B:152:0x0383, B:154:0x039b, B:33:0x0086, B:145:0x031d, B:147:0x0363, B:149:0x036b, B:163:0x03de, B:164:0x03e3, B:36:0x0093, B:84:0x01e4, B:85:0x01f4, B:87:0x01fa, B:89:0x0207, B:91:0x020b, B:92:0x020f, B:94:0x0218, B:96:0x0247, B:98:0x0254, B:100:0x0258, B:103:0x025f, B:105:0x0270, B:107:0x0278, B:109:0x0280, B:115:0x0290, B:118:0x0298, B:136:0x02e8, B:120:0x029e, B:122:0x02b9, B:124:0x02bd, B:165:0x03e4, B:167:0x03ea, B:169:0x03f6, B:111:0x0287, B:171:0x03fa, B:173:0x03fe, B:174:0x0403, B:175:0x0404, B:177:0x041c, B:179:0x0425, B:180:0x0429, B:39:0x00a9, B:41:0x00b8, B:59:0x0159, B:61:0x0177, B:63:0x0183, B:65:0x0193, B:67:0x0197, B:70:0x019e, B:72:0x01af, B:74:0x01b9, B:80:0x01ce, B:75:0x01c3, B:62:0x017c, B:79:0x01cb, B:44:0x00ff, B:46:0x0121, B:48:0x0127, B:50:0x012e, B:51:0x0138, B:52:0x0146, B:54:0x014c, B:56:0x0153, B:181:0x042a, B:183:0x042e, B:184:0x0433), top: B:188:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0404 A[Catch: Exception -> 0x005e, TryCatch #0 {Exception -> 0x005e, blocks: (B:20:0x0059, B:27:0x006b, B:157:0x03b5, B:30:0x007c, B:152:0x0383, B:154:0x039b, B:33:0x0086, B:145:0x031d, B:147:0x0363, B:149:0x036b, B:163:0x03de, B:164:0x03e3, B:36:0x0093, B:84:0x01e4, B:85:0x01f4, B:87:0x01fa, B:89:0x0207, B:91:0x020b, B:92:0x020f, B:94:0x0218, B:96:0x0247, B:98:0x0254, B:100:0x0258, B:103:0x025f, B:105:0x0270, B:107:0x0278, B:109:0x0280, B:115:0x0290, B:118:0x0298, B:136:0x02e8, B:120:0x029e, B:122:0x02b9, B:124:0x02bd, B:165:0x03e4, B:167:0x03ea, B:169:0x03f6, B:111:0x0287, B:171:0x03fa, B:173:0x03fe, B:174:0x0403, B:175:0x0404, B:177:0x041c, B:179:0x0425, B:180:0x0429, B:39:0x00a9, B:41:0x00b8, B:59:0x0159, B:61:0x0177, B:63:0x0183, B:65:0x0193, B:67:0x0197, B:70:0x019e, B:72:0x01af, B:74:0x01b9, B:80:0x01ce, B:75:0x01c3, B:62:0x017c, B:79:0x01cb, B:44:0x00ff, B:46:0x0121, B:48:0x0127, B:50:0x012e, B:51:0x0138, B:52:0x0146, B:54:0x014c, B:56:0x0153, B:181:0x042a, B:183:0x042e, B:184:0x0433), top: B:188:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0443 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fa A[Catch: Exception -> 0x005e, TryCatch #0 {Exception -> 0x005e, blocks: (B:20:0x0059, B:27:0x006b, B:157:0x03b5, B:30:0x007c, B:152:0x0383, B:154:0x039b, B:33:0x0086, B:145:0x031d, B:147:0x0363, B:149:0x036b, B:163:0x03de, B:164:0x03e3, B:36:0x0093, B:84:0x01e4, B:85:0x01f4, B:87:0x01fa, B:89:0x0207, B:91:0x020b, B:92:0x020f, B:94:0x0218, B:96:0x0247, B:98:0x0254, B:100:0x0258, B:103:0x025f, B:105:0x0270, B:107:0x0278, B:109:0x0280, B:115:0x0290, B:118:0x0298, B:136:0x02e8, B:120:0x029e, B:122:0x02b9, B:124:0x02bd, B:165:0x03e4, B:167:0x03ea, B:169:0x03f6, B:111:0x0287, B:171:0x03fa, B:173:0x03fe, B:174:0x0403, B:175:0x0404, B:177:0x041c, B:179:0x0425, B:180:0x0429, B:39:0x00a9, B:41:0x00b8, B:59:0x0159, B:61:0x0177, B:63:0x0183, B:65:0x0193, B:67:0x0197, B:70:0x019e, B:72:0x01af, B:74:0x01b9, B:80:0x01ce, B:75:0x01c3, B:62:0x017c, B:79:0x01cb, B:44:0x00ff, B:46:0x0121, B:48:0x0127, B:50:0x012e, B:51:0x0138, B:52:0x0146, B:54:0x014c, B:56:0x0153, B:181:0x042a, B:183:0x042e, B:184:0x0433), top: B:188:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0218 A[Catch: Exception -> 0x005e, TryCatch #0 {Exception -> 0x005e, blocks: (B:20:0x0059, B:27:0x006b, B:157:0x03b5, B:30:0x007c, B:152:0x0383, B:154:0x039b, B:33:0x0086, B:145:0x031d, B:147:0x0363, B:149:0x036b, B:163:0x03de, B:164:0x03e3, B:36:0x0093, B:84:0x01e4, B:85:0x01f4, B:87:0x01fa, B:89:0x0207, B:91:0x020b, B:92:0x020f, B:94:0x0218, B:96:0x0247, B:98:0x0254, B:100:0x0258, B:103:0x025f, B:105:0x0270, B:107:0x0278, B:109:0x0280, B:115:0x0290, B:118:0x0298, B:136:0x02e8, B:120:0x029e, B:122:0x02b9, B:124:0x02bd, B:165:0x03e4, B:167:0x03ea, B:169:0x03f6, B:111:0x0287, B:171:0x03fa, B:173:0x03fe, B:174:0x0403, B:175:0x0404, B:177:0x041c, B:179:0x0425, B:180:0x0429, B:39:0x00a9, B:41:0x00b8, B:59:0x0159, B:61:0x0177, B:63:0x0183, B:65:0x0193, B:67:0x0197, B:70:0x019e, B:72:0x01af, B:74:0x01b9, B:80:0x01ce, B:75:0x01c3, B:62:0x017c, B:79:0x01cb, B:44:0x00ff, B:46:0x0121, B:48:0x0127, B:50:0x012e, B:51:0x0138, B:52:0x0146, B:54:0x014c, B:56:0x0153, B:181:0x042a, B:183:0x042e, B:184:0x0433), top: B:188:0x0046 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(v6.c r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1092
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.workers.TrackingWorker.d(v6.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0156  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(t6.c r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.workers.TrackingWorker.doWork(t6.c):java.lang.Object");
    }
}
