package e1;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.uptodown.UptodownApp;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class v4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f4332b;

    public v4(Context context, int i) {
        this.f4331a = i;
        switch (i) {
            case 1:
                context.getClass();
                this.f4332b = context;
                break;
            default:
                k0.y.g(context);
                Context applicationContext = context.getApplicationContext();
                k0.y.g(applicationContext);
                this.f4332b = applicationContext;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(long r11, v6.c r13) {
        /*
            r10 = this;
            int r2 = r10.f4331a
            r3 = 0
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            u6.a r6 = u6.a.f10762a
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 1
            switch(r2) {
                case 3: goto L54;
                default: goto Ld;
            }
        Ld:
            boolean r2 = r13 instanceof s4.t0
            if (r2 == 0) goto L1f
            r2 = r13
            s4.t0 r2 = (s4.t0) r2
            int r8 = r2.f9296l
            r9 = r8 & r5
            if (r9 == 0) goto L1f
            int r8 = r8 - r5
            r2.f9296l = r8
        L1d:
            r8 = r2
            goto L25
        L1f:
            s4.t0 r2 = new s4.t0
            r2.<init>(r10, r13)
            goto L1d
        L25:
            java.lang.Object r0 = r8.f9294a
            int r2 = r8.f9296l
            if (r2 == 0) goto L35
            if (r2 != r7) goto L31
            p6.a.e(r0)
            goto L4f
        L31:
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r4)
            goto L53
        L35:
            p6.a.e(r0)
            v7.e r0 = o7.m0.f8288a
            v7.d r9 = v7.d.f10884a
            s4.u0 r0 = new s4.u0
            r4 = 0
            r5 = 0
            r1 = r10
            r2 = r11
            r0.<init>(r1, r2, r4, r5)
            r8.f9296l = r7
            java.lang.Object r0 = o7.c0.C(r0, r9, r8)
            if (r0 != r6) goto L4f
            r3 = r6
            goto L53
        L4f:
            p6.k r0 = (p6.k) r0
            java.lang.Object r3 = r0.f8444a
        L53:
            return r3
        L54:
            boolean r2 = r13 instanceof s4.g0
            if (r2 == 0) goto L66
            r2 = r13
            s4.g0 r2 = (s4.g0) r2
            int r8 = r2.f9205l
            r9 = r8 & r5
            if (r9 == 0) goto L66
            int r8 = r8 - r5
            r2.f9205l = r8
        L64:
            r8 = r2
            goto L6c
        L66:
            s4.g0 r2 = new s4.g0
            r2.<init>(r10, r13)
            goto L64
        L6c:
            java.lang.Object r0 = r8.f9203a
            int r2 = r8.f9205l
            if (r2 == 0) goto L7c
            if (r2 != r7) goto L78
            p6.a.e(r0)
            goto L96
        L78:
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r4)
            goto L9a
        L7c:
            p6.a.e(r0)
            v7.e r0 = o7.m0.f8288a
            v7.d r9 = v7.d.f10884a
            s4.h0 r0 = new s4.h0
            r4 = 0
            r5 = 0
            r1 = r10
            r2 = r11
            r0.<init>(r1, r2, r4, r5)
            r8.f9205l = r7
            java.lang.Object r0 = o7.c0.C(r0, r9, r8)
            if (r0 != r6) goto L96
            r3 = r6
            goto L9a
        L96:
            p6.k r0 = (p6.k) r0
            java.lang.Object r3 = r0.f8444a
        L9a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.v4.a(long, v6.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(long r11, v6.c r13) {
        /*
            r10 = this;
            int r2 = r10.f4331a
            r3 = 0
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            u6.a r6 = u6.a.f10762a
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 1
            switch(r2) {
                case 3: goto L54;
                default: goto Ld;
            }
        Ld:
            boolean r2 = r13 instanceof s4.v0
            if (r2 == 0) goto L1f
            r2 = r13
            s4.v0 r2 = (s4.v0) r2
            int r8 = r2.f9308l
            r9 = r8 & r5
            if (r9 == 0) goto L1f
            int r8 = r8 - r5
            r2.f9308l = r8
        L1d:
            r8 = r2
            goto L25
        L1f:
            s4.v0 r2 = new s4.v0
            r2.<init>(r10, r13)
            goto L1d
        L25:
            java.lang.Object r0 = r8.f9306a
            int r2 = r8.f9308l
            if (r2 == 0) goto L35
            if (r2 != r7) goto L31
            p6.a.e(r0)
            goto L4f
        L31:
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r4)
            goto L53
        L35:
            p6.a.e(r0)
            v7.e r0 = o7.m0.f8288a
            v7.d r9 = v7.d.f10884a
            s4.u0 r0 = new s4.u0
            r4 = 0
            r5 = 1
            r1 = r10
            r2 = r11
            r0.<init>(r1, r2, r4, r5)
            r8.f9308l = r7
            java.lang.Object r0 = o7.c0.C(r0, r9, r8)
            if (r0 != r6) goto L4f
            r3 = r6
            goto L53
        L4f:
            p6.k r0 = (p6.k) r0
            java.lang.Object r3 = r0.f8444a
        L53:
            return r3
        L54:
            boolean r2 = r13 instanceof s4.i0
            if (r2 == 0) goto L66
            r2 = r13
            s4.i0 r2 = (s4.i0) r2
            int r8 = r2.f9217l
            r9 = r8 & r5
            if (r9 == 0) goto L66
            int r8 = r8 - r5
            r2.f9217l = r8
        L64:
            r8 = r2
            goto L6c
        L66:
            s4.i0 r2 = new s4.i0
            r2.<init>(r10, r13)
            goto L64
        L6c:
            java.lang.Object r0 = r8.f9215a
            int r2 = r8.f9217l
            if (r2 == 0) goto L7c
            if (r2 != r7) goto L78
            p6.a.e(r0)
            goto L96
        L78:
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r4)
            goto L9a
        L7c:
            p6.a.e(r0)
            v7.e r0 = o7.m0.f8288a
            v7.d r9 = v7.d.f10884a
            s4.h0 r0 = new s4.h0
            r4 = 0
            r5 = 1
            r1 = r10
            r2 = r11
            r0.<init>(r1, r2, r4, r5)
            r8.f9217l = r7
            java.lang.Object r0 = o7.c0.C(r0, r9, r8)
            if (r0 != r6) goto L96
            r3 = r6
            goto L9a
        L96:
            p6.k r0 = (p6.k) r0
            java.lang.Object r3 = r0.f8444a
        L9a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.v4.b(long, v6.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(int r10, int r11, v6.c r12) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r12 instanceof s4.j0
            if (r0 == 0) goto L13
            r0 = r12
            s4.j0 r0 = (s4.j0) r0
            int r1 = r0.f9223l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9223l = r1
            goto L18
        L13:
            s4.j0 r0 = new s4.j0
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f9221a
            int r1 = r0.f9223l
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            p6.a.e(r12)
            goto L48
        L25:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r10)
            r10 = 0
            return r10
        L2c:
            p6.a.e(r12)
            v7.e r12 = o7.m0.f8288a
            v7.d r12 = v7.d.f10884a
            b.e r3 = new b.e
            r7 = 0
            r8 = 6
            r4 = r9
            r5 = r10
            r6 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r0.f9223l = r2
            java.lang.Object r12 = o7.c0.C(r3, r12, r0)
            u6.a r10 = u6.a.f10762a
            if (r12 != r10) goto L48
            return r10
        L48:
            p6.k r12 = (p6.k) r12
            java.lang.Object r10 = r12.f8444a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.v4.c(int, int, v6.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(v6.c r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof s4.w0
            if (r0 == 0) goto L13
            r0 = r6
            s4.w0 r0 = (s4.w0) r0
            int r1 = r0.f9314l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9314l = r1
            goto L18
        L13:
            s4.w0 r0 = new s4.w0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f9312a
            int r1 = r0.f9314l
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            p6.a.e(r6)
            goto L45
        L26:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r6)
            return r2
        L2c:
            p6.a.e(r6)
            v7.e r6 = o7.m0.f8288a
            v7.d r6 = v7.d.f10884a
            c4.g r1 = new c4.g
            r4 = 25
            r1.<init>(r5, r2, r4)
            r0.f9314l = r3
            java.lang.Object r6 = o7.c0.C(r1, r6, r0)
            u6.a r0 = u6.a.f10762a
            if (r6 != r0) goto L45
            return r0
        L45:
            p6.k r6 = (p6.k) r6
            java.lang.Object r6 = r6.f8444a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.v4.d(v6.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(java.lang.String r11, int r12, int r13, v6.c r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof s4.k0
            if (r0 == 0) goto L13
            r0 = r14
            s4.k0 r0 = (s4.k0) r0
            int r1 = r0.f9229l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9229l = r1
            goto L18
        L13:
            s4.k0 r0 = new s4.k0
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.f9227a
            int r1 = r0.f9229l
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            p6.a.e(r14)
            goto L4a
        L25:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r11)
            r11 = 0
            return r11
        L2c:
            p6.a.e(r14)
            v7.e r14 = o7.m0.f8288a
            v7.d r14 = v7.d.f10884a
            c4.m r3 = new c4.m
            r8 = 0
            r9 = 8
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0.f9229l = r2
            java.lang.Object r14 = o7.c0.C(r3, r14, r0)
            u6.a r11 = u6.a.f10762a
            if (r14 != r11) goto L4a
            return r11
        L4a:
            p6.k r14 = (p6.k) r14
            java.lang.Object r11 = r14.f8444a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.v4.e(java.lang.String, int, int, v6.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(int r10, int r11, v6.c r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof s4.x0
            if (r0 == 0) goto L13
            r0 = r12
            s4.x0 r0 = (s4.x0) r0
            int r1 = r0.f9319l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9319l = r1
            goto L18
        L13:
            s4.x0 r0 = new s4.x0
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f9317a
            int r1 = r0.f9319l
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            p6.a.e(r12)
            goto L48
        L25:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r10)
            r10 = 0
            return r10
        L2c:
            p6.a.e(r12)
            v7.e r12 = o7.m0.f8288a
            v7.d r12 = v7.d.f10884a
            b.e r3 = new b.e
            r7 = 0
            r8 = 7
            r4 = r9
            r5 = r10
            r6 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r0.f9319l = r2
            java.lang.Object r12 = o7.c0.C(r3, r12, r0)
            u6.a r10 = u6.a.f10762a
            if (r12 != r10) goto L48
            return r10
        L48:
            p6.k r12 = (p6.k) r12
            java.lang.Object r10 = r12.f8444a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.v4.f(int, int, v6.c):java.lang.Object");
    }

    public void g(View view, float f) {
        SharedPreferences sharedPreferences;
        view.getClass();
        if (f == 1.0f) {
            view.setClickable(true);
        } else if (f == 0.3f) {
            view.setClickable(false);
        }
        Context context = this.f4332b;
        context.getClass();
        float f10 = UptodownApp.I;
        try {
            sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
        } catch (Exception unused) {
        }
        boolean z9 = sharedPreferences.contains("animations") ? sharedPreferences.getBoolean("animations", true) : true;
        if (!z9) {
            view.setAlpha(f);
            return;
        }
        float f11 = UptodownApp.I;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(view.getAlpha(), f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new com.google.android.material.motion.c(view, 4));
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.start();
    }

    public void h(ImageView imageView) {
        imageView.getClass();
        Context context = this.f4332b;
        context.getClass();
        float f = UptodownApp.I;
        boolean z9 = true;
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
            if (sharedPreferences.contains("animations")) {
                z9 = sharedPreferences.getBoolean("animations", true);
            }
        } catch (Exception unused) {
        }
        if (z9) {
            float f10 = UptodownApp.I;
            imageView.setImageDrawable(ContextCompat.getDrawable(context, 2131231344));
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, 2130772005);
            Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, 2130772006);
            l5.d dVar = new l5.d();
            animationLoadAnimation.setInterpolator(dVar);
            animationLoadAnimation2.setInterpolator(dVar);
            animationLoadAnimation.setAnimationListener(new n5.j(imageView, animationLoadAnimation2));
            imageView.startAnimation(animationLoadAnimation);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(v6.c r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof s4.l0
            if (r0 == 0) goto L13
            r0 = r6
            s4.l0 r0 = (s4.l0) r0
            int r1 = r0.f9237l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9237l = r1
            goto L18
        L13:
            s4.l0 r0 = new s4.l0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f9235a
            int r1 = r0.f9237l
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            p6.a.e(r6)
            goto L44
        L26:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r6)
            return r2
        L2c:
            p6.a.e(r6)
            v7.e r6 = o7.m0.f8288a
            v7.d r6 = v7.d.f10884a
            s4.m0 r1 = new s4.m0
            r4 = 0
            r1.<init>(r5, r2, r4)
            r0.f9237l = r3
            java.lang.Object r6 = o7.c0.C(r1, r6, r0)
            u6.a r0 = u6.a.f10762a
            if (r6 != r0) goto L44
            return r0
        L44:
            p6.k r6 = (p6.k) r6
            java.lang.Object r6 = r6.f8444a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.v4.i(v6.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(v6.c r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof s4.n0
            if (r0 == 0) goto L13
            r0 = r5
            s4.n0 r0 = (s4.n0) r0
            int r1 = r0.f9249l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9249l = r1
            goto L18
        L13:
            s4.n0 r0 = new s4.n0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f9247a
            int r1 = r0.f9249l
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            p6.a.e(r5)
            goto L43
        L26:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            androidx.privacysandbox.ads.adservices.customaudience.a.i(r5)
            return r2
        L2c:
            p6.a.e(r5)
            v7.e r5 = o7.m0.f8288a
            v7.d r5 = v7.d.f10884a
            s4.m0 r1 = new s4.m0
            r1.<init>(r4, r2, r3)
            r0.f9249l = r3
            java.lang.Object r5 = o7.c0.C(r1, r5, r0)
            u6.a r0 = u6.a.f10762a
            if (r5 != r0) goto L43
            return r0
        L43:
            p6.k r5 = (p6.k) r5
            java.lang.Object r5 = r5.f8444a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.v4.j(v6.c):java.lang.Object");
    }

    public /* synthetic */ v4(Context context, int i, boolean z9) {
        this.f4331a = i;
        this.f4332b = context;
    }
}
