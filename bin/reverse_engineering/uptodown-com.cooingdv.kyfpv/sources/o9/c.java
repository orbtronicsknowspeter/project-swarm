package o9;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import b2.t1;
import b6.i;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.core.cmpapi.status.DisplayStatus;
import com.inmobi.cmp.model.DisplayInfo;
import com.inmobi.cmp.model.Regulations;
import com.uptodown.R;
import g4.b0;
import kotlin.jvm.internal.l;
import l.g;
import l8.n;
import l8.r;
import o7.c0;
import o7.m0;
import o7.z0;
import t0.f;

/* JADX INFO: compiled from: r8-map-id-035a71e92ccd2a2b8039d43fa6fa76ac249b2a7f96061be914156707964ce49d */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends p9.a {
    public static final /* synthetic */ int J = 0;
    public TextView A;
    public TextView B;
    public CheckBox C;
    public Button D;
    public CardView E;
    public TextView F;
    public TextView G;
    public NestedScrollView H;
    public e I;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public LinearLayout f8377z;

    public final void a(TextView textView, String str, String str2, boolean z9) {
        if (textView == null) {
            return;
        }
        textView.setText(str2);
        textView.setVisibility(z9 ? 0 : 8);
        textView.setOnClickListener(new b0(23, this, str));
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onCancel(dialogInterface);
        e eVar = this.I;
        if (eVar == null) {
            l.i("viewModel");
            throw null;
        }
        DisplayInfo displayInfo = new DisplayInfo(DisplayStatus.DISMISSED, "User dismissed US regulations screen", Regulations.USP, g.f7045a);
        ChoiceCmpCallback choiceCmpCallback = eVar.f8382b;
        if (choiceCmpCallback != null) {
            choiceCmpCallback.onCMPUIStatusChanged(displayInfo);
        }
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    @Override // p9.a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() == null) {
            return;
        }
        ViewModelStore viewModelStore = getViewModelStore();
        viewModelStore.getClass();
        this.I = (e) new ViewModelProvider(viewModelStore, new i(4)).get(e.class);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.dialog_ccpa_privacy, viewGroup, false);
        viewInflate.getClass();
        return viewInflate;
    }

    @Override // p9.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l8.b bVar;
        n nVar;
        r rVar;
        r rVar2;
        n nVar2;
        r rVar3;
        r rVar4;
        n nVar3;
        r rVar5;
        r rVar6;
        r rVar7;
        TextView textView;
        view.getClass();
        super.onViewCreated(view, bundle);
        final boolean z9 = g.f7045a;
        this.f8377z = (LinearLayout) view.findViewById(R.id.container_ccpa_links);
        this.A = (TextView) view.findViewById(R.id.tv_privacy_policy_link);
        this.B = (TextView) view.findViewById(R.id.tv_delete_data_link);
        this.C = (CheckBox) view.findViewById(R.id.chx_ccpa_consent);
        this.D = (Button) view.findViewById(R.id.btn_ccpa_consent);
        this.E = (CardView) view.findViewById(R.id.bottom_container);
        this.F = (TextView) view.findViewById(R.id.tv_ccpa_content);
        this.G = (TextView) view.findViewById(R.id.tv_access_data_link);
        this.H = (NestedScrollView) view.findViewById(R.id.sv_container);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.gbc_fragment_container);
        final int i = 1;
        if (g.f7045a) {
            getChildFragmentManager().beginTransaction().add(R.id.gbc_fragment_container, new l.d(), "d").addToBackStack(null).commit();
            e eVar = this.I;
            if (eVar == null) {
                l.i("viewModel");
                throw null;
            }
            l9.a aVar = eVar.f8381a;
            aVar.getClass();
            aVar.g(92, true);
        } else if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        TextView textView2 = this.f8495b;
        if (textView2 != null) {
            e eVar2 = this.I;
            if (eVar2 == null) {
                l.i("viewModel");
                throw null;
            }
            String string = eVar2.f8383c.f5489a;
            if (string.length() == 0) {
                string = getString(R.string.ccpa_privacy_title);
                string.getClass();
            }
            textView2.setText(string);
        }
        e eVar3 = this.I;
        if (eVar3 == null) {
            l.i("viewModel");
            throw null;
        }
        int length = eVar3.b().length();
        TextView textView3 = this.F;
        if (length > 0) {
            if (textView3 != null) {
                e eVar4 = this.I;
                if (eVar4 == null) {
                    l.i("viewModel");
                    throw null;
                }
                textView3.setText(a.a.a(eVar4.b()));
            }
        } else if (textView3 != null) {
            textView3.setText(R.string.ccpa_content_message);
        }
        TextView textView4 = this.F;
        String str = "";
        if (textView4 != null) {
            e eVar5 = this.I;
            if (eVar5 == null) {
                l.i("viewModel");
                throw null;
            }
            textView4.append(g.f7045a ? eVar5.f.f6984b.f6979c : "");
        }
        TextView textView5 = this.F;
        if (textView5 != null) {
            textView5.setMovementMethod(LinkMovementMethod.getInstance());
        }
        Context context = getContext();
        if (context != null && (textView = this.F) != null) {
            textView.setLinkTextColor(ContextCompat.getColor(context, R.color.colorBlueAccent));
        }
        LinearLayout linearLayout = this.f8377z;
        final int i6 = 0;
        if (linearLayout != null) {
            e eVar6 = this.I;
            if (eVar6 == null) {
                l.i("viewModel");
                throw null;
            }
            n nVar4 = eVar6.f8384d;
            linearLayout.setVisibility((nVar4 == null || (rVar7 = nVar4.f7244r) == null || !rVar7.f7258a) ? 0 : 8);
        }
        TextView textView6 = this.B;
        e eVar7 = this.I;
        if (eVar7 == null) {
            l.i("viewModel");
            throw null;
        }
        n nVar5 = eVar7.f8384d;
        String str2 = (nVar5 == null || (rVar6 = nVar5.f7244r) == null) ? "" : rVar6.g;
        String strC = eVar7.c();
        e eVar8 = this.I;
        if (eVar8 == null) {
            l.i("viewModel");
            throw null;
        }
        a(textView6, str2, strC, eVar8.c().length() > 0 && (nVar3 = eVar8.f8384d) != null && (rVar5 = nVar3.f7244r) != null && rVar5.g.length() > 0);
        TextView textView7 = this.G;
        e eVar9 = this.I;
        if (eVar9 == null) {
            l.i("viewModel");
            throw null;
        }
        n nVar6 = eVar9.f8384d;
        String str3 = (nVar6 == null || (rVar4 = nVar6.f7244r) == null) ? "" : rVar4.h;
        String strA = eVar9.a();
        e eVar10 = this.I;
        if (eVar10 == null) {
            l.i("viewModel");
            throw null;
        }
        a(textView7, str3, strA, eVar10.a().length() > 0 && (nVar2 = eVar10.f8384d) != null && (rVar3 = nVar2.f7244r) != null && rVar3.h.length() > 0);
        TextView textView8 = this.A;
        e eVar11 = this.I;
        if (eVar11 == null) {
            l.i("viewModel");
            throw null;
        }
        n nVar7 = eVar11.f8384d;
        if (nVar7 != null && (rVar2 = nVar7.f7244r) != null) {
            str = rVar2.i;
        }
        String strD = eVar11.d();
        e eVar12 = this.I;
        if (eVar12 == null) {
            l.i("viewModel");
            throw null;
        }
        a(textView8, str, strD, eVar12.d().length() > 0 && (nVar = eVar12.f8384d) != null && (rVar = nVar.f7244r) != null && rVar.i.length() > 0);
        ImageView imageView = this.f8496l;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: o9.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c f8375b;

                {
                    this.f8375b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    l8.b bVar2;
                    int i10 = i6;
                    boolean z10 = z9;
                    c cVar = this.f8375b;
                    switch (i10) {
                        case 0:
                            e eVar13 = cVar.I;
                            if (eVar13 == null) {
                                l.i("viewModel");
                                throw null;
                            }
                            DisplayInfo displayInfo = new DisplayInfo(DisplayStatus.DISMISSED, "User dismissed US regulations screen", Regulations.USP, z10);
                            ChoiceCmpCallback choiceCmpCallback = eVar13.f8382b;
                            if (choiceCmpCallback != null) {
                                choiceCmpCallback.onCMPUIStatusChanged(displayInfo);
                            }
                            cVar.dismiss();
                            FragmentActivity activity = cVar.getActivity();
                            if (activity == null) {
                                return;
                            }
                            activity.finish();
                            return;
                        default:
                            e eVar14 = cVar.I;
                            if (eVar14 == null) {
                                l.i("viewModel");
                                throw null;
                            }
                            l9.a aVar2 = eVar14.f8381a;
                            CheckBox checkBox = cVar.C;
                            boolean zIsChecked = checkBox == null ? false : checkBox.isChecked();
                            int i11 = zIsChecked ? 2 : 1;
                            n nVar8 = eVar14.f8384d;
                            l9.a.i(aVar2, 2, i11, l.a((nVar8 != null && (bVar2 = nVar8.f7242p) != null) ? bVar2.f7181a : null, "Y") ? 2 : 1);
                            n nVarE = m9.c.e();
                            String str4 = nVarE.h;
                            if (str4 != null) {
                                aVar2.f(89, str4);
                            }
                            aVar2.f(90, nVarE.f);
                            aVar2.g(91, g.f7045a);
                            ChoiceCmpCallback choiceCmpCallback2 = eVar14.f8382b;
                            if (choiceCmpCallback2 != null) {
                                choiceCmpCallback2.onCCPAConsentGiven(aVar2.j(37));
                            }
                            v7.e eVar15 = m0.f8289a;
                            c0.s(z0.f8336a, v7.d.f10885a, null, new d(eVar14, zIsChecked, null), 2);
                            if (z10) {
                                Fragment fragmentFindFragmentByTag = cVar.getChildFragmentManager().findFragmentByTag("d");
                                l.d dVar = fragmentFindFragmentByTag instanceof l.d ? (l.d) fragmentFindFragmentByTag : null;
                                if (dVar != null) {
                                    dVar.a();
                                }
                            }
                            FragmentActivity activity2 = cVar.getActivity();
                            if (activity2 == null) {
                                return;
                            }
                            f.b(activity2, new a(cVar, 0));
                            return;
                    }
                }
            });
            e eVar13 = this.I;
            if (eVar13 == null) {
                l.i("viewModel");
                throw null;
            }
            imageView.setContentDescription(eVar13.f8383c.f);
        }
        CheckBox checkBox = this.C;
        if (checkBox != null) {
            e eVar14 = this.I;
            if (eVar14 == null) {
                l.i("viewModel");
                throw null;
            }
            checkBox.setChecked(eVar14.f8381a.a(2, 3).equals("Y"));
        }
        Button button = this.D;
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener(this) { // from class: o9.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c f8375b;

                {
                    this.f8375b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    l8.b bVar2;
                    int i10 = i;
                    boolean z10 = z9;
                    c cVar = this.f8375b;
                    switch (i10) {
                        case 0:
                            e eVar132 = cVar.I;
                            if (eVar132 == null) {
                                l.i("viewModel");
                                throw null;
                            }
                            DisplayInfo displayInfo = new DisplayInfo(DisplayStatus.DISMISSED, "User dismissed US regulations screen", Regulations.USP, z10);
                            ChoiceCmpCallback choiceCmpCallback = eVar132.f8382b;
                            if (choiceCmpCallback != null) {
                                choiceCmpCallback.onCMPUIStatusChanged(displayInfo);
                            }
                            cVar.dismiss();
                            FragmentActivity activity = cVar.getActivity();
                            if (activity == null) {
                                return;
                            }
                            activity.finish();
                            return;
                        default:
                            e eVar142 = cVar.I;
                            if (eVar142 == null) {
                                l.i("viewModel");
                                throw null;
                            }
                            l9.a aVar2 = eVar142.f8381a;
                            CheckBox checkBox2 = cVar.C;
                            boolean zIsChecked = checkBox2 == null ? false : checkBox2.isChecked();
                            int i11 = zIsChecked ? 2 : 1;
                            n nVar8 = eVar142.f8384d;
                            l9.a.i(aVar2, 2, i11, l.a((nVar8 != null && (bVar2 = nVar8.f7242p) != null) ? bVar2.f7181a : null, "Y") ? 2 : 1);
                            n nVarE = m9.c.e();
                            String str4 = nVarE.h;
                            if (str4 != null) {
                                aVar2.f(89, str4);
                            }
                            aVar2.f(90, nVarE.f);
                            aVar2.g(91, g.f7045a);
                            ChoiceCmpCallback choiceCmpCallback2 = eVar142.f8382b;
                            if (choiceCmpCallback2 != null) {
                                choiceCmpCallback2.onCCPAConsentGiven(aVar2.j(37));
                            }
                            v7.e eVar15 = m0.f8289a;
                            c0.s(z0.f8336a, v7.d.f10885a, null, new d(eVar142, zIsChecked, null), 2);
                            if (z10) {
                                Fragment fragmentFindFragmentByTag = cVar.getChildFragmentManager().findFragmentByTag("d");
                                l.d dVar = fragmentFindFragmentByTag instanceof l.d ? (l.d) fragmentFindFragmentByTag : null;
                                if (dVar != null) {
                                    dVar.a();
                                }
                            }
                            FragmentActivity activity2 = cVar.getActivity();
                            if (activity2 == null) {
                                return;
                            }
                            f.b(activity2, new a(cVar, 0));
                            return;
                    }
                }
            });
        }
        h9.d dVar = this.f8503s;
        if (dVar != null) {
            Integer num = dVar.g;
            if (num != null) {
                int iIntValue = num.intValue();
                view.setBackgroundColor(iIntValue);
                CardView cardView = this.E;
                if (cardView != null) {
                    cardView.setCardBackgroundColor(iIntValue);
                }
            }
            Integer num2 = dVar.f5496a;
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                NestedScrollView nestedScrollView = this.H;
                if (nestedScrollView != null) {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setCornerRadius(2.0f);
                    gradientDrawable.setStroke(4, iIntValue2);
                    nestedScrollView.setBackground(gradientDrawable);
                }
            }
            Integer num3 = dVar.i;
            if (num3 != null) {
                int iIntValue3 = num3.intValue();
                TextView textView9 = this.F;
                if (textView9 != null) {
                    textView9.setTextColor(iIntValue3);
                }
                CheckBox checkBox2 = this.C;
                if (checkBox2 != null) {
                    checkBox2.setTextColor(iIntValue3);
                }
                CheckBox checkBox3 = this.C;
                if (checkBox3 != null) {
                    checkBox3.setButtonTintList(ColorStateList.valueOf(iIntValue3));
                }
            }
            Integer num4 = dVar.f5502l;
            if (num4 != null) {
                int iIntValue4 = num4.intValue();
                TextView textView10 = this.F;
                if (textView10 != null) {
                    textView10.setLinkTextColor(iIntValue4);
                }
                TextView textView11 = this.G;
                if (textView11 != null) {
                    textView11.setTextColor(iIntValue4);
                }
                TextView textView12 = this.B;
                if (textView12 != null) {
                    textView12.setTextColor(iIntValue4);
                }
                TextView textView13 = this.A;
                if (textView13 != null) {
                    textView13.setTextColor(iIntValue4);
                }
            }
            Integer num5 = dVar.f5505o;
            if (num5 != null) {
                int iIntValue5 = num5.intValue();
                Button button2 = this.D;
                if (button2 != null) {
                    button2.setBackgroundColor(iIntValue5);
                }
            }
            Integer num6 = dVar.f5503m;
            if (num6 != null) {
                int iIntValue6 = num6.intValue();
                Button button3 = this.D;
                if (button3 != null) {
                    button3.setTextColor(iIntValue6);
                }
            }
        }
        t1.f(this.f8505u, this.D);
        t1.f(this.v, this.G, this.B, this.A, this.C, this.F);
        e eVar15 = this.I;
        if (eVar15 == null) {
            l.i("viewModel");
            throw null;
        }
        l9.a aVar2 = eVar15.f8381a;
        int i10 = aVar2.a(2, 3).equals("Y") ? 2 : 1;
        n nVar8 = eVar15.f8384d;
        l9.a.i(aVar2, 2, i10, l.a((nVar8 != null && (bVar = nVar8.f7242p) != null) ? bVar.f7181a : null, "Y") ? 2 : 1);
        e eVar16 = this.I;
        if (eVar16 != null) {
            eVar16.f8381a.g(77, true);
        } else {
            l.i("viewModel");
            throw null;
        }
    }
}
