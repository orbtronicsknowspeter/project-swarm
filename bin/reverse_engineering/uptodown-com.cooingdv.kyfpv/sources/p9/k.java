package p9;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.recyclerview.widget.RecyclerView;
import b2.t1;
import com.uptodown.R;
import f9.q;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends a {
    public static int L;
    public static int M;
    public TextView A;
    public TextView B;
    public TextView C;
    public TextView D;
    public TextView E;
    public NestedScrollView F;
    public RecyclerView G;
    public s5.d H;
    public boolean I;
    public boolean J;
    public String K;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ConstraintLayout f8536z;

    public final void a() {
        if (this.I) {
            NestedScrollView nestedScrollView = this.F;
            if (nestedScrollView != null) {
                nestedScrollView.setVisibility(0);
            }
            RecyclerView recyclerView = this.G;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            this.I = false;
            return;
        }
        UUID uuid = q.f5066a;
        StringBuilder sb = new StringBuilder();
        int i = M;
        if (i == 0) {
            kotlin.jvm.internal.l.i("localSwitchItemType");
            throw null;
        }
        int iC = c.j.c(i);
        int i6 = 6;
        if (iC != 5) {
            if (iC != 6) {
                i6 = 7;
                if (iC != 7) {
                    i6 = 3;
                }
            } else {
                i6 = 1;
            }
        }
        sb.append(a.a.c(i6));
        sb.append("-id:");
        sb.append(L);
        q.f5067b.h("collapseElement", sb.toString());
        dismiss();
    }

    @Override // p9.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        ViewModelStore viewModelStore = activity.getViewModelStore();
        viewModelStore.getClass();
        this.H = (s5.d) new ViewModelProvider(viewModelStore, new b6.i(6)).get(s5.d.class);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Context context = getContext();
        i iVar = context == null ? null : new i(context, this);
        if (iVar != null) {
            return iVar;
        }
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.getClass();
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.dialog_legal_detail, viewGroup, false);
    }

    @Override // p9.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        view.getClass();
        super.onViewCreated(view, bundle);
        TextView textView = this.f8495b;
        if (textView != null) {
            int i = M;
            if (i == 0) {
                kotlin.jvm.internal.l.i("localSwitchItemType");
                throw null;
            }
            int iC = c.j.c(i);
            if (iC != 4) {
                s5.d dVar = this.H;
                if (iC != 5) {
                    if (iC != 6) {
                        if (dVar == null) {
                            kotlin.jvm.internal.l.i("viewModel");
                            throw null;
                        }
                        str = dVar.f.e().f5563d;
                    } else {
                        if (dVar == null) {
                            kotlin.jvm.internal.l.i("viewModel");
                            throw null;
                        }
                        str = dVar.f.e().f;
                    }
                } else {
                    if (dVar == null) {
                        kotlin.jvm.internal.l.i("viewModel");
                        throw null;
                    }
                    str = dVar.f.e().f;
                }
            } else {
                s5.d dVar2 = this.H;
                if (dVar2 == null) {
                    kotlin.jvm.internal.l.i("viewModel");
                    throw null;
                }
                str = dVar2.f.e().f5563d;
            }
            textView.setText(str);
        }
        ImageView imageView = this.f8496l;
        final int i6 = 0;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: p9.j

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ k f8535b;

                {
                    this.f8535b = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:158:0x031c A[PHI: r8
                  0x031c: PHI (r8v8 java.util.ArrayList) = (r8v2 java.util.ArrayList), (r8v2 java.util.ArrayList), (r8v4 java.util.ArrayList), (r8v2 java.util.ArrayList) binds: [B:177:0x03a4, B:178:0x03a6, B:253:0x031c, B:156:0x0319] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Iterable, java.lang.Object] */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onClick(android.view.View r26) {
                    /*
                        Method dump skipped, instruction units count: 1128
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p9.j.onClick(android.view.View):void");
                }
            });
            s5.d dVar3 = this.H;
            if (dVar3 == null) {
                kotlin.jvm.internal.l.i("viewModel");
                throw null;
            }
            imageView.setContentDescription(dVar3.f.e().f5569o);
        }
        this.f8536z = (ConstraintLayout) view.findViewById(R.id.legal_detail_container);
        this.A = (TextView) view.findViewById(R.id.detail_legal_description_label);
        this.B = (TextView) view.findViewById(R.id.detail_legal_description);
        this.C = (TextView) view.findViewById(R.id.detail_description);
        this.D = (TextView) view.findViewById(R.id.detail_title);
        this.E = (TextView) view.findViewById(R.id.tv_show_partners);
        this.F = (NestedScrollView) view.findViewById(R.id.sc_description_container);
        this.G = (RecyclerView) view.findViewById(R.id.rv_purpose_partners_list);
        s5.d dVar4 = this.H;
        if (dVar4 == null) {
            kotlin.jvm.internal.l.i("viewModel");
            throw null;
        }
        String str2 = dVar4.f.e().f5570p;
        if (str2.length() > 0) {
            SpannableString spannableString = new SpannableString(str2);
            spannableString.setSpan(new UnderlineSpan(), 0, str2.length(), 0);
            TextView textView2 = this.E;
            if (textView2 != null) {
                textView2.setText(spannableString);
            }
        }
        TextView textView3 = this.E;
        final int i10 = 1;
        if (textView3 != null) {
            textView3.setOnClickListener(new View.OnClickListener(this) { // from class: p9.j

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ k f8535b;

                {
                    this.f8535b = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:158:0x031c A[PHI: r8
                  0x031c: PHI (r8v8 java.util.ArrayList) = (r8v2 java.util.ArrayList), (r8v2 java.util.ArrayList), (r8v4 java.util.ArrayList), (r8v2 java.util.ArrayList) binds: [B:177:0x03a4, B:178:0x03a6, B:253:0x031c, B:156:0x0319] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Iterable, java.lang.Object] */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onClick(android.view.View r26) {
                    /*
                        Method dump skipped, instruction units count: 1128
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p9.j.onClick(android.view.View):void");
                }
            });
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            TextView textView4 = this.D;
            if (textView4 != null) {
                textView4.setText(arguments.getString("title", ""));
            }
            TextView textView5 = this.C;
            if (textView5 != null) {
                textView5.setText(arguments.getString("description", ""));
            }
            TextView textView6 = this.B;
            if (textView6 != null) {
                textView6.setText(arguments.getString("legal_description", ""));
            }
            TextView textView7 = this.A;
            if (textView7 != null) {
                textView7.setText(arguments.getString("legal_description_label", ""));
            }
            this.J = arguments.getBoolean("legitimate_interest", false);
            this.K = arguments.getString("vendor_type_selected", "");
        }
        h9.d dVar5 = this.f8503s;
        if (dVar5 != null) {
            Integer num = dVar5.i;
            if (num != null) {
                int iIntValue = num.intValue();
                TextView textView8 = this.D;
                if (textView8 != null) {
                    textView8.setTextColor(iIntValue);
                }
                TextView textView9 = this.C;
                if (textView9 != null) {
                    textView9.setTextColor(iIntValue);
                }
                TextView textView10 = this.B;
                if (textView10 != null) {
                    textView10.setTextColor(iIntValue);
                }
                TextView textView11 = this.A;
                if (textView11 != null) {
                    textView11.setTextColor(iIntValue);
                }
            }
            Integer num2 = dVar5.f5502l;
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                TextView textView12 = this.E;
                if (textView12 != null) {
                    textView12.setTextColor(iIntValue2);
                }
            }
            Integer num3 = dVar5.g;
            if (num3 != null) {
                int iIntValue3 = num3.intValue();
                ConstraintLayout constraintLayout = this.f8536z;
                if (constraintLayout != null) {
                    constraintLayout.setBackgroundColor(iIntValue3);
                }
            }
        }
        t1.f(this.f8504t, this.D);
        t1.f(this.v, this.E, this.C, this.B, this.A);
    }
}
